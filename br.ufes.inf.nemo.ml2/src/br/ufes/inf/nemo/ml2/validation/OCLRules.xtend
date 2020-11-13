package br.ufes.inf.nemo.ml2.validation

import com.google.inject.Inject
import br.ufes.inf.nemo.ml2.util.OCLUtil

import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.model.Attribute
import br.ufes.inf.nemo.ml2.model.Reference

import br.ufes.inf.nemo.ml2.model.PrimitiveType
import br.ufes.inf.nemo.ml2.model.DerivationConstraint
import br.ufes.inf.nemo.ml2.model.InvariantConstraint
import br.ufes.inf.nemo.ml2.model.IfExpression
import br.ufes.inf.nemo.ml2.model.ImpliesExpression
import br.ufes.inf.nemo.ml2.model.XorExpression
import br.ufes.inf.nemo.ml2.model.OrExpression
import br.ufes.inf.nemo.ml2.model.AndExpression
import br.ufes.inf.nemo.ml2.model.RelationalExpression
import br.ufes.inf.nemo.ml2.model.AdditionExpression
import br.ufes.inf.nemo.ml2.model.AdditionOperator
import br.ufes.inf.nemo.ml2.model.MultiplicationExpression
import br.ufes.inf.nemo.ml2.model.UnaryExpression
import br.ufes.inf.nemo.ml2.model.UnaryOperator

class OCLRules {
	
	@Inject extension OCLUtil
	
	public static val INVALID_FEATURE_CONTEXT = "br.ufes.inf.nemo.meta.InvalidFeatureContext"
	public static val INVALID_CONTEXT_TYPE = "br.ufes.inf.nemo.meta.InvalidContextType"
	public static val INVALID_RETURN_TYPE = "br.ufes.inf.nemo.meta.InvalidReturnType"
	public static val INVALID_IF_CONDITION = "br.ufes.inf.nemo.meta.InvalidIfCondition"
	public static val INVALID_IMPLIES_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidImpliesExpression"
	public static val INVALID_XOR_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidXorExpression"
	public static val INVALID_OR_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidOrExpression"
	public static val INVALID_AND_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidAndExpression"
	public static val INVALID_RELATIONAL_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidRelationalExpression"
	public static val INVALID_ADDITION_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidAdditionExpression"
	public static val INVALID_MULTIPLICATION_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidMultiplicationExpression"
	public static val INVALID_UNARY_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidUnaryExpression"
	
	/**
	 * Checks if the given feature context is a feature from the class context in an OCL Derivation Constraint.
	 * 
	 * @param constraint the OCL Derivation Constraint to be considered.
	 */
	def hasValidFeatureContext(DerivationConstraint constraint) {
		var feature = getMatchingFeature(constraint.classContext, constraint.featureContext)
		
		if(feature === null) {
			return new ValidationError('''«constraint.classContext.name»::«FOR f : constraint.featureContext SEPARATOR '::'»«f»«ENDFOR» cannot be resolved to a feature.''',
					ModelPackage.eINSTANCE.derivationConstraint_FeatureContext,-1,
					OCLRules.INVALID_FEATURE_CONTEXT,null,constraint)
		} else {
			return null
		}
	}
	
	/**
	 * Checks if the given context type is the same as the class feature's type in an OCL Derivation Constraint.
	 * 
	 * @param constraint the OCL Derivation Constraint to be considered.
	 */
	def hasValidContextType(DerivationConstraint constraint) {
		var feature = getMatchingFeature(constraint.classContext, constraint.featureContext)
		var featureName = ""
		var expectedType = ""
		
		if(feature !== null) {		
			if(feature instanceof Attribute) {
				featureName = feature.name
				
				if(feature._type !== null) {
					expectedType = feature._type.name
				} else {
					switch(feature.primitiveType) {
						case PrimitiveType.BOOLEAN:
							expectedType = "Boolean"
						case PrimitiveType.NUMBER:
							expectedType = "Number"
						case PrimitiveType.STRING:
							expectedType = "String"
					}
				}
			} else if(feature instanceof Reference) {
				featureName = feature.name
				
				if(feature.upperBound == 1) {
					expectedType = feature._type.name
				} else {
					expectedType = "Set(" + feature._type.name + ")"
				}
			}		
	
			if(expectedType.equals(getContextType(constraint))) {
				return null
			} else {
				return new ValidationError('''Type mismatch: feature "«featureName»" is of type «expectedType».''',
						ModelPackage.eINSTANCE.derivationConstraint_ContextType,-1,
						OCLRules.INVALID_CONTEXT_TYPE,null,constraint)
			}
		}
	}
	
	/**
	 * Checks if the given OCL Expression is of the same type as Boolean in an OCL Invariant Constraint.
	 * 
	 * @param constraint the OCL Invariant Constraint to be considered.
	 */
	def dispatch hasValidReturnType(InvariantConstraint constraint) {
		var returnType = getReturnType(constraint.expression)
		
		if(returnType.equals("Boolean")) {
			return null
		} else {
			return new ValidationError('''Type mismatch: return type of expression is «returnType». Type expected: Boolean.''',
					ModelPackage.eINSTANCE.constraint_Expression,-1,
					OCLRules.INVALID_RETURN_TYPE,null,constraint)
		}
	}
	
	/**
	 * Checks if the given OCL Expression is of the same type as the context type in an OCL Derivation Constraint.
	 * 
	 * @param constraint the OCL Derivation Constraint to be considered.
	 */
	def dispatch hasValidReturnType(DerivationConstraint constraint) {
		var contextType = getContextType(constraint)
		var returnType = getReturnType(constraint.expression)
		
		if(returnType.equals(contextType)) {
			return null
		} else {
			return new ValidationError('''Type mismatch: return type of expression is «returnType». Type expected: «contextType».''',
					ModelPackage.eINSTANCE.constraint_Expression,-1,
					OCLRules.INVALID_RETURN_TYPE,null,constraint)
		}
	}
	
	/**
	 * Checks if the given condition of an OCL If Expression is of type Boolean.
	 * 
	 * @param expression the OCL If Expression to be considered.
	 */
	def hasValidIfCondition(IfExpression expression) {
		var returnType = getReturnType(expression.condition)
		
		if(! returnType.equals("Boolean")) {
			return new ValidationError('''Type mismatch: if condition is of type «returnType». Type expected: Boolean.''',
						ModelPackage.eINSTANCE.ifExpression_Condition,-1,
						OCLRules.INVALID_IF_CONDITION,null,expression)
		} else {
			return null
		}
	}
	
	/**
	 * Checks if the given members of an OCL Implies Expression are of type Boolean.
	 * 
	 * @param expression the OCL Implies Expression to be considered.
	 */
	def hasValidImpliesExpression(ImpliesExpression expression) {
		if(expression.right.size > 0) {
			var index = 0
			var returnType = getReturnType(expression.left)
			
			if(! returnType.equals("Boolean")) {
				return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
							ModelPackage.eINSTANCE.impliesExpression_Left,-1,
							OCLRules.INVALID_IMPLIES_EXPRESSION,null,expression)
			}
			
			for(operation : expression.right) {
				returnType = getReturnType(operation)
				
				if(! returnType.equals("Boolean")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
								ModelPackage.eINSTANCE.impliesExpression_Right,index,
								OCLRules.INVALID_IMPLIES_EXPRESSION,null,expression)
				}
				
				index += 1
			}
		}
		
		return null
	}
	
	/**
	 * Checks if the given members of an OCL Xor Expression are of type Boolean.
	 * 
	 * @param expression the OCL Xor Expression to be considered.
	 */
	def hasValidXorExpression(XorExpression expression) {
		if(expression.right.size > 0) {
			var index = 0
			var returnType = getReturnType(expression.left)
			
			if(! returnType.equals("Boolean")) {
				return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
							ModelPackage.eINSTANCE.xorExpression_Left,-1,
							OCLRules.INVALID_XOR_EXPRESSION,null,expression)
			}
			
			for(operation : expression.right) {
				returnType = getReturnType(operation)
				
				if(! returnType.equals("Boolean")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
								ModelPackage.eINSTANCE.xorExpression_Right,index,
								OCLRules.INVALID_XOR_EXPRESSION,null,expression)
				}
				
				index += 1
			}
		}
		
		return null
	}
	
	/**
	 * Checks if the given members of an OCL Or Expression are of type Boolean.
	 * 
	 * @param expression the OCL Or Expression to be considered.
	 */
	def hasValidOrExpression(OrExpression expression) {
		if(expression.right.size > 0) {
			var index = 0
			var returnType = getReturnType(expression.left)
			
			if(! returnType.equals("Boolean")) {
				return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
							ModelPackage.eINSTANCE.orExpression_Left,-1,
							OCLRules.INVALID_OR_EXPRESSION,null,expression)
			}
			
			for(operation : expression.right) {
				returnType = getReturnType(operation)
				
				if(! returnType.equals("Boolean")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
								ModelPackage.eINSTANCE.orExpression_Right,index,
								OCLRules.INVALID_OR_EXPRESSION,null,expression)
				}
				
				index += 1
			}
		}
		
		return null
	}
	
	/**
	 * Checks if the given members of an OCL And Expression are of type Boolean.
	 * 
	 * @param expression the OCL And Expression to be considered.
	 */
	def hasValidAndExpression(AndExpression expression) {
		if(expression.right.size > 0) {
			var index = 0
			var returnType = getReturnType(expression.left)
			
			if(! returnType.equals("Boolean")) {
				return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
							ModelPackage.eINSTANCE.andExpression_Left,-1,
							OCLRules.INVALID_AND_EXPRESSION,null,expression)
			}
			
			for(operation : expression.right) {
				returnType = getReturnType(operation)
				
				if(! returnType.equals("Boolean")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
								ModelPackage.eINSTANCE.andExpression_Right,index,
								OCLRules.INVALID_AND_EXPRESSION,null,expression)
				}
				
				index += 1
			}
		}
		
		return null
	}

	/**
	 * Checks if the given members of an OCL Relational Expression are of type Number.
	 * 
	 * @param expression the OCL Relational Expression to be considered.
	 */
	def hasValidRelationalExpression(RelationalExpression expression) {
		if(expression.right.size > 0) {
			var index = 0
			var returnType = getReturnType(expression.left)
			
			if(! returnType.equals("Number")) {
				return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
							ModelPackage.eINSTANCE.relationalExpression_Left,-1,
							OCLRules.INVALID_RELATIONAL_EXPRESSION,null,expression)
			}
			
			for(operation : expression.right) {
				returnType = getReturnType(operation.right)
				
				if(! returnType.equals("Number")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
								ModelPackage.eINSTANCE.relationalOperation_Right,index,
								OCLRules.INVALID_RELATIONAL_EXPRESSION,null,operation)
				}
				
				index += 1
			}
		}
		
		return null
	}
	
	/**
	 * Checks if the given members of an OCL Addition Expression are of type Number or Set (in set difference case).
	 * 
	 * @param expression the OCL Addition Expression to be considered.
	 */
	def hasValidAdditionExpression(AdditionExpression expression) {
		if(expression.right.size > 0) {
			var index = 0
			var returnType = getReturnType(expression.left)
			var hasValidType = false
			var setDifferenceCase = false
			var setName = ""
			
			if(returnType.equals("Number")) {
				hasValidType = true
				setDifferenceCase = false
			} else if(returnType.substring(0,3).equals("Set")) {
				hasValidType = true
				setDifferenceCase = true
				setName = returnType
			} else {
				hasValidType = false
			}
			
			for(operation : expression.right) {
				if(operation.operator == AdditionOperator.PLUS) {
					if(hasValidType && (! setDifferenceCase)) {
						returnType = getReturnType(operation.right)
				
						if(! returnType.equals("Number")) {
							return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
										ModelPackage.eINSTANCE.additionOperation_Right,index,
										OCLRules.INVALID_ADDITION_EXPRESSION,null,operation)
						}
					} else {
						return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
							ModelPackage.eINSTANCE.additionExpression_Left,-1,
							OCLRules.INVALID_ADDITION_EXPRESSION,null,expression)
					}
				} else if(operation.operator == AdditionOperator.MINUS) {
					if(hasValidType) {
						returnType = getReturnType(operation.right)
							
						if(setDifferenceCase) {
							if(! returnType.equals(setName)) {
								return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: «setName».''',
											ModelPackage.eINSTANCE.additionOperation_Right,index,
											OCLRules.INVALID_ADDITION_EXPRESSION,null,operation)
							}
						} else {
							if(! returnType.equals("Number")) {
								return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
											ModelPackage.eINSTANCE.additionOperation_Right,index,
											OCLRules.INVALID_ADDITION_EXPRESSION,null,operation)
							}
						}
					} else {
						return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number or Set().''',
							ModelPackage.eINSTANCE.additionExpression_Left,-1,
							OCLRules.INVALID_ADDITION_EXPRESSION,null,expression)
					}
				}
				
				index += 1
			}
		}
		
		return null
	}
	
	
	/**
	 * Checks if the given members of an OCL Multiplication Expression are of type Number.
	 * 
	 * @param expression the OCL Multiplication Expression to be considered.
	 */
	def hasValidMultiplicationExpression(MultiplicationExpression expression) {
		if(expression.right.size > 0) {
			var index = 0
			var returnType = getReturnType(expression.left)
			
			if(! returnType.equals("Number")) {
				return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
							ModelPackage.eINSTANCE.multiplicationExpression_Left,-1,
							OCLRules.INVALID_MULTIPLICATION_EXPRESSION,null,expression)
			}
			
			for(operation : expression.right) {
				returnType = getReturnType(operation.right)
				
				if(! returnType.equals("Number")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
								ModelPackage.eINSTANCE.multiplicationOperation_Right,index,
								OCLRules.INVALID_MULTIPLICATION_EXPRESSION,null,operation)
				}
				
				index += 1
			}
		}
		
		return null
	}
	
	/**
	 * Checks if the given member of an OCL Unary Expression is of type Boolean or Number.
	 * 
	 * @param expression the OCL Unary Expression to be considered.
	 */
	def hasValidUnaryExpression(UnaryExpression expression) {
		if(expression.right == 1) {
			var returnType = getReturnType(expression.right)
			
			if(expression.operator == UnaryOperator.NOT) {
				if(! returnType.equals("Boolean")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Boolean.''',
								ModelPackage.eINSTANCE.unaryExpression_Right,-1,
								OCLRules.INVALID_UNARY_EXPRESSION,null,expression)
				}
			} else if(expression.operator == UnaryOperator.MINUS) {
				if(! returnType.equals("Number")) {
					return new ValidationError('''Type mismatch: expression is of type «returnType». Type expected: Number.''',
								ModelPackage.eINSTANCE.unaryExpression_Right,-1,
								OCLRules.INVALID_UNARY_EXPRESSION,null,expression)
				}
			}
		}
		
		return null
	}
}
