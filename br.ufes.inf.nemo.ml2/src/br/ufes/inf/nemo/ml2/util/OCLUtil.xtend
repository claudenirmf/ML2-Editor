package br.ufes.inf.nemo.ml2.util

import com.google.inject.Inject
import br.ufes.inf.nemo.ml2.util.ML2Util

import br.ufes.inf.nemo.ml2.model.Attribute
import br.ufes.inf.nemo.ml2.model.Class
import br.ufes.inf.nemo.ml2.model.Feature
import br.ufes.inf.nemo.ml2.model.PrimitiveType
import br.ufes.inf.nemo.ml2.model.Reference

import br.ufes.inf.nemo.ml2.model.Constraint
import br.ufes.inf.nemo.ml2.model.DerivationConstraint
import br.ufes.inf.nemo.ml2.model.LetExpression
import br.ufes.inf.nemo.ml2.model.VariableDeclaration
import br.ufes.inf.nemo.ml2.model.IfExpression
import br.ufes.inf.nemo.ml2.model.ImpliesExpression
import br.ufes.inf.nemo.ml2.model.XorExpression
import br.ufes.inf.nemo.ml2.model.OrExpression
import br.ufes.inf.nemo.ml2.model.AndExpression
import br.ufes.inf.nemo.ml2.model.ComparisonExpression
import br.ufes.inf.nemo.ml2.model.RelationalExpression
import br.ufes.inf.nemo.ml2.model.AdditionExpression
import br.ufes.inf.nemo.ml2.model.AdditionOperator
import br.ufes.inf.nemo.ml2.model.MultiplicationExpression
import br.ufes.inf.nemo.ml2.model.UnaryExpression
import br.ufes.inf.nemo.ml2.model.UnaryOperator
import br.ufes.inf.nemo.ml2.model.CallExpression
import br.ufes.inf.nemo.ml2.model.NavigationSource
import br.ufes.inf.nemo.ml2.model.DotOperation
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperation
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperator
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperation
import br.ufes.inf.nemo.ml2.model.ArrowOperation
import br.ufes.inf.nemo.ml2.model.UnarySetOperation
import br.ufes.inf.nemo.ml2.model.UnarySetOperator
import br.ufes.inf.nemo.ml2.model.BinarySetOperation
import br.ufes.inf.nemo.ml2.model.BinarySetOperator
import br.ufes.inf.nemo.ml2.model.UnaryIteration
import br.ufes.inf.nemo.ml2.model.UnaryIterator
import br.ufes.inf.nemo.ml2.model.MultiaryIteration
import br.ufes.inf.nemo.ml2.model.TypeOperation
import br.ufes.inf.nemo.ml2.model.TypeOperator
import br.ufes.inf.nemo.ml2.model.SetLiteralExpression
import br.ufes.inf.nemo.ml2.model.TypeLiteralExpression
import br.ufes.inf.nemo.ml2.model.PrimitiveTypeLiteral
import br.ufes.inf.nemo.ml2.model.SetTypeLiteral
import br.ufes.inf.nemo.ml2.model.UserDefinedTypeLiteral
import br.ufes.inf.nemo.ml2.model.NullLiteralExpression
import br.ufes.inf.nemo.ml2.model.BooleanLiteralExpression
import br.ufes.inf.nemo.ml2.model.NumberLiteralExpression
import br.ufes.inf.nemo.ml2.model.StringLiteralExpression
import br.ufes.inf.nemo.ml2.model.VariableExpression

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EObject

class OCLUtil {
	@Inject extension ML2Util
	
	/**
	 * Returns all declared variables in the scope of the given OCL Expression.
	 * 
	 * @param expression the current OCL expression.
	 */
	def getDeclaredVariables(EObject expression) {
		var container = expression.eContainer
		var declaredVariables = new BasicEList<VariableDeclaration>
		
		while(!(container instanceof Constraint)) {
			if(container instanceof LetExpression) {
				for(v : container.variables) {
					declaredVariables.add(v)
				}
			}
						
			container = container.eContainer
		}
		
		return declaredVariables
	}
	
	/**
	 * Returns the class context in the scope of the given OCL Expression.
	 * 
	 * @param expression the current OCL expression.
	 */
	def getClassContext(EObject expression) {
		var container = expression.eContainer
		
		while(!(container instanceof Constraint)) {
			container = container.eContainer
		}
			
		if(container instanceof Constraint) {
			return container.classContext
		}
	}
	
	/**
	 * Returns the context type in the scope of the given OCL Expression.
	 * 
	 * @param expression the current OCL expression.
	 */
	def getContextType(EObject expression) {
		var container = expression
		
		while(!(container instanceof Constraint)) {
			container = container.eContainer
		}
		
		if(container instanceof DerivationConstraint) {
			var contextType = container.contextType
			
			if(contextType instanceof PrimitiveTypeLiteral) {
				return contextType.typeName
			} else if(contextType instanceof SetTypeLiteral) {
				var setType = contextType.setType
						
				if(setType instanceof PrimitiveTypeLiteral) {
					return "Set(" + setType.typeName + ")"
				} else if(setType instanceof UserDefinedTypeLiteral) {
					return "Set(" + setType.typeName.name + ")"
				}
			} else if(contextType instanceof UserDefinedTypeLiteral)
				return contextType.typeName.name			
		} else {
			return "Boolean"
		}
	}
	
	/**
	 * Updates the context of a given OCL Variable Expression.
	 * 
	 * @param expression the given OCL Variable Expression.
	 * @param context the current context of the variable.
	 */
	def updateClassContext(VariableExpression expression, Class context) {		
		// Class native features
		for(feature : context.features) {
			if(feature instanceof Attribute) {
				if(feature.name.equals(expression.referringVariable)) {
					if(feature._type !== null) {
						return feature._type
					} else {
						return context
					}
				}
			} else if(feature instanceof Reference) {
				if(feature.name.equals(expression.referringVariable)) {
					return feature._type
				}
			}
		}
		
		// Class inherited features
		var inheritedFeatures = getAllInheritedFeatures(context)
		
		for(feature : inheritedFeatures) {
			if(feature instanceof Attribute) {
				if(feature.name.equals(expression.referringVariable)) {
					if(feature._type !== null) {
						return feature._type
					} else {
						return context
					}
				}
			} else if(feature instanceof Reference) {
				if(feature.name.equals(expression.referringVariable)) {
					return feature._type
				}
			}
		}
	}
	
	/**
	 * Returns the type returned by a given OCL expression.
	 * 
	 * @param expression the given OCL expression.
	 */
	def String getReturnType(Object expression) {
		if(expression instanceof LetExpression) {
			return getReturnType(expression.inExpression)
		} else if(expression instanceof IfExpression) {
			return getReturnType(expression.thenExpression)
		} else if(expression instanceof ImpliesExpression) {
			if(expression.right.size > 0) {
				return "Boolean"
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof XorExpression) {
			if(expression.right.size > 0) {
				return "Boolean"
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof OrExpression) {
			if(expression.right.size > 0) {
				return "Boolean"
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof AndExpression) {
			if(expression.right.size > 0) {
				return "Boolean"
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof ComparisonExpression) {
			if(expression.right.size > 0) {
				return "Boolean"
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof RelationalExpression) {
			if(expression.right.size > 0) {
				return "Boolean"
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof AdditionExpression) {
			if(expression.right.size > 0) {
				if(expression.right.head.operator == AdditionOperator.PLUS) {
					return "Number"
				} else {
					return getReturnType(expression.left) // This checks for set difference case
				}
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof MultiplicationExpression) {
			if(expression.right.size > 0) {
				return "Number"
			} else {
				return getReturnType(expression.left)
			}
		} else if(expression instanceof UnaryExpression) {
			if(expression.operator == UnaryOperator.NOT) {
				return "Boolean"
			} else if(expression.operator == UnaryOperator.MINUS) {
				return "Number"
			} else {
				return getReturnType(expression.right)
			}
		} else if(expression instanceof CallExpression) {
			return getCallExpressionReturnType(expression)
		} else if(expression instanceof NavigationSource) {
			return getReturnType(expression.source)
		} else if(expression instanceof BooleanLiteralExpression) {
			return "Boolean"
		} else if(expression instanceof NumberLiteralExpression) {
			return "Number"
		} else if(expression instanceof StringLiteralExpression) {
			return "String"
		} else if(expression instanceof NullLiteralExpression) {
			return "OclVoid"
		} else if(expression instanceof SetLiteralExpression) {
			if(expression.parts.size > 0) {
				return "Set(" + getReturnType(expression.parts.head) + ")"
			} else {
				return "Set(OclVoid)"
			}
		} else if(expression instanceof TypeLiteralExpression) {
			if(expression instanceof PrimitiveTypeLiteral) {
				return expression.typeName + "TypeName"
			} else if(expression instanceof SetTypeLiteral) {
				var setType = expression.setType
				if(setType instanceof PrimitiveTypeLiteral) {
					return "SetTypeName(" + setType.typeName + ")"
				} else if(setType instanceof UserDefinedTypeLiteral) {
					return "SetTypeName(" + setType.typeName.name + ")"
				}
			} else if(expression instanceof UserDefinedTypeLiteral) {
				return expression.typeName.name + "TypeName"
			}
		} else if(expression instanceof VariableExpression) {
			if(expression.referringVariable.equals("self")) {
				return "" + getContextType(expression)
			} else {
				return getVariableType(expression, getClassContext(expression))
			}
		}
	}
	
	/**
	 * Returns the type returned by a given OCL Call Expression.
	 * 
	 * @param expression the given OCL Call Expression.
	 */
	// TODO: this method has not been tested thoroughly for many possible scenarios
	def getCallExpressionReturnType(CallExpression expression) {
		if(expression.right.size == 0) {
			return getReturnType(expression.left)
		} else {
			var currentClassContext = getClassContext(expression)
			var currentReturnType = getReturnType(expression.left)
			var source = expression.left.source
			
			// Handles the source member of the operation navigation
			if(source instanceof VariableExpression) {
				if(! source.referringVariable.equals("self")) {
					currentClassContext = updateClassContext(source, currentClassContext)
				}
			} else if(source instanceof TypeLiteralExpression) { // Handles case for allInstances()
				if(source instanceof PrimitiveTypeLiteral) {
					currentReturnType = "Set(" + source.typeName + ")"
				} else if(source instanceof SetTypeLiteral) {
					var setType = source.setType
						
					if(setType instanceof PrimitiveTypeLiteral) {
						currentReturnType = "Set(" + setType.typeName + ")"
					} else if(setType instanceof UserDefinedTypeLiteral) {
						currentReturnType = "Set(" + setType.typeName.name + ")"
					}
				} else if(source instanceof UserDefinedTypeLiteral) {
					currentReturnType = "Set(" + source.typeName.name + ")"
				}
			}
			
			// Handles the rest of the operation navigation
			for(operation : expression.right) {
				if(operation instanceof DotOperation) {
					if(operation instanceof UnaryNumberOperation) {
						switch(operation.operator) {
							case UnaryNumberOperator.ABS:
								currentReturnType = "Number"
							case UnaryNumberOperator.FLOOR:
								currentReturnType = "Number"
							case UnaryNumberOperator.ROUND:
								currentReturnType = "Number"
							case UnaryNumberOperator.OCL_IS_UNDEFINED:
								currentReturnType = "Boolean"
						}
					} else if(operation instanceof BinaryNumberOperation) {
						currentReturnType = "Number"
					} else if(operation instanceof TypeOperation) {
						switch(operation.operator) {
							case TypeOperator.OCL_AS_TYPE:{
								if(operation.referredType.equals("self")) {
									currentReturnType = getClassContext(operation).name
								} else {
									currentReturnType = "" + operation.referredType
								}
							}								
							case TypeOperator.OCL_IS_KIND_OF:
								currentReturnType = "Boolean"
							case TypeOperator.OCL_IS_TYPE_OF:
								currentReturnType = "Boolean"
						}
					} else if(operation instanceof VariableExpression) {
						currentReturnType = getVariableType(operation, currentClassContext)
						currentClassContext = updateClassContext(operation, currentClassContext)
					}
				} else if(operation instanceof ArrowOperation) {
					if(operation instanceof UnarySetOperation) {
						switch(operation.operator) {
							case UnarySetOperator.SIZE:
								currentReturnType = "Number"
							case UnarySetOperator.IS_EMPTY:
								currentReturnType = "Boolean"
							case UnarySetOperator.NOT_EMPTY:
								currentReturnType = "Boolean"
							case UnarySetOperator.SUM:
								currentReturnType = "Number"
							case UnarySetOperator.MIN:
								currentReturnType = "Number"
							case UnarySetOperator.MAX:
								currentReturnType = "Number"
							default: {}
						}
					} else if(operation instanceof BinarySetOperation) {
						switch(operation.operator) {
							case BinarySetOperator.INCLUDES:
								currentReturnType = "Boolean"
							case BinarySetOperator.INCLUDES_ALL:
								currentReturnType = "Boolean"
							case BinarySetOperator.EXCLUDES:
								currentReturnType = "Boolean"
							case BinarySetOperator.EXCLUDES_ALL:
								currentReturnType = "Boolean"
							case BinarySetOperator.INCLUDING:
								currentReturnType = getReturnType(operation.argument)
							case BinarySetOperator.EXCLUDING:
								currentReturnType = getReturnType(operation.argument)
							case BinarySetOperator.COUNT:
								currentReturnType = "Number"
							case BinarySetOperator.UNION:
								currentReturnType = getReturnType(operation.argument)
							case BinarySetOperator.INTERSECTION:
								currentReturnType = getReturnType(operation.argument)
							case BinarySetOperator.SYMMETRIC_DIFFERENCE:
								currentReturnType = getReturnType(operation.argument)
						}
					} else if(operation instanceof UnaryIteration) {
						switch(operation.iterator) {
							case UnaryIterator.ANY:
								currentReturnType = currentReturnType.substring(4,currentReturnType.length - 1) // Corresponds to the Set type (drops 'Set{' and '}')
							case UnaryIterator.ONE:
								currentReturnType = "Boolean"
							case UnaryIterator.IS_UNIQUE:
								currentReturnType = "Boolean"
							default: {}
						}
					} else if(operation instanceof MultiaryIteration) {
						currentReturnType = "Boolean"
					} else if(operation instanceof TypeOperation) {
						switch(operation.operator) {
							case TypeOperator.OCL_AS_TYPE:{
								if(operation.referredType.equals("self")) {
									currentReturnType = getClassContext(operation).name
								} else {
									currentReturnType = "" + operation.referredType
								}
							}								
							case TypeOperator.OCL_IS_KIND_OF:
								currentReturnType = "Boolean"
							case TypeOperator.OCL_IS_TYPE_OF:
								currentReturnType = "Boolean"
						}
					}
				}
			}
			
			return currentReturnType
		}
	}
	
	/**
	 * Returns the type of a given OCL Variable Expression.
	 * 
	 * @param expression the given OCL Variable Expression.
	 * @param context the current context of the variable.
	 */
	//TODO: this method does not handle variables declared in an iterator scope
	def getVariableType(VariableExpression expression, Class context) {
		// Tries to match the variable to the class context native features
		for(feature : context.features) {
			if(feature instanceof Attribute) {
				if(feature.name.equals(expression.referringVariable)) {
					if(feature._type !== null) {
						return feature._type.name
					} else {
						switch(feature.primitiveType) {
							case PrimitiveType.BOOLEAN:
								return "Boolean"
							case PrimitiveType.NUMBER:
								return "Number"
							case PrimitiveType.STRING:
								return "String"
						}
					}
				}
			} else if(feature instanceof Reference) {
				if(feature.name.equals(expression.referringVariable)) {
					if(feature.upperBound == 1) {
						return feature._type.name
					} else {
						return "Set(" + feature._type.name + ")"
					}
				}
			}
		}
		
		// Tries to match the variable to the class context inherited features
		var inheritedFeatures = getAllInheritedFeatures(context)
		
		for(feature : inheritedFeatures) {
			if(feature instanceof Attribute) {
				if(feature.name.equals(expression.referringVariable)) {
					if(feature._type !== null) {
						return feature._type.name
					} else {
						switch(feature.primitiveType) {
							case PrimitiveType.BOOLEAN:
								return "Boolean"
							case PrimitiveType.NUMBER:
								return "Number"
							case PrimitiveType.STRING:
								return "String"
						}
					}
				}
			} else if(feature instanceof Reference) {
				if(feature.name.equals(expression.referringVariable)) {
					if(feature.upperBound == 1) {
						return feature._type.name
					} else {
						return "Set(" + feature._type.name + ")"
					}
				}
			}
		}	
		
		// Matches the variable to one of the variables declared by a LetExpression	
		for(v : getDeclaredVariables(expression)) {
			if(v.variableName.equals(expression.referringVariable)) {
				var vType = v.variableType
				
				if(vType instanceof PrimitiveTypeLiteral) {
					return vType.typeName
				} else if(vType instanceof SetTypeLiteral) {
					var vSetType = vType.setType
					
					if(vSetType instanceof PrimitiveTypeLiteral) {
						return "Set(" + vSetType.typeName + ")"
					} else if(vSetType instanceof UserDefinedTypeLiteral) {
						return "Set(" + vSetType.typeName.name + ")"
					}
				} else if(vType instanceof UserDefinedTypeLiteral) {
					return vType.typeName.name
				}
			}
		}
		
		return "OCLAny" // Default case to prevent errors related to variables in iterator scopes not being supported yet
	}
	
	/**
	 * Returns the feature matching a given class context and a feature context.
	 * 
	 * @param context the given class context.
	 * @param featureContext the given feature context.
	 */
	def Feature getMatchingFeature(Class context, EList<String> featureContext) {
		var featurePath = new BasicEList(featureContext) 
		
		// Class native features
		for(feature : context.features) {
			if(feature instanceof Attribute) {
				if(feature.name.equals(featurePath.head)) {
					if(featurePath.size == 1) {
						return feature
					} else {
						if(feature._type !== null) {
							featurePath.remove(0)
							return getMatchingFeature(feature._type, featurePath)
						} else {
							return null
						}
					}
				}
			} else if(feature instanceof Reference) {
				if(feature.name.equals(featurePath.head)) {
					if(featurePath.size == 1) {
						return feature
					} else {
						featurePath.remove(0)
						return getMatchingFeature(feature._type, featurePath)
					}
				}
			}
		}
		
		// Class inherited features
		var inheritedFeatures = getAllInheritedFeatures(context)
		
		for(feature : inheritedFeatures) {
			if(feature instanceof Attribute) {
				if(feature.name.equals(featurePath.head)) {
					if(featurePath.size == 1) {
						return feature
					} else {
						if(feature._type !== null) {
							featurePath.remove(0)
							return getMatchingFeature(feature._type, featurePath)
						} else {
							return null
						}
					}
				}
			} else if(feature instanceof Reference) {
				if(feature.name.equals(featurePath.head)) {
					if(featurePath.size == 1) {
						return feature
					} else {
						featurePath.remove(0)
						return getMatchingFeature(feature._type, featurePath)
					}
				}
			}
		}
		
		return null
	}
	
	/**
	 * Verifies if the given OCL expression is part of the main tree of expressions (not an iterator body, for example).
	 * 
	 * @param expression the given OCL Expression.
	 */
	def belongsToMainTree(EObject expression) {
		var container = expression
		
		while(! (container instanceof Constraint)) {
			if(container instanceof BinarySetOperation || container instanceof MultiaryIteration) {
				return false
			}
			
			container = container.eContainer
		}
		
		return true
	}
}
