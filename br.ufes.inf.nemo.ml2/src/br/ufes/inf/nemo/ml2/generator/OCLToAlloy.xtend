/**
 * More methods to the ML2 to Alloy transformation in order to include OCL elements.
 * 
 * @author Fernando Amaral Musso
 */
package br.ufes.inf.nemo.ml2.generator

import com.google.inject.Inject
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.util.OCLUtil

import br.ufes.inf.nemo.ml2.model.Model
import br.ufes.inf.nemo.ml2.model.Class

import br.ufes.inf.nemo.ml2.model.DerivationConstraint
import br.ufes.inf.nemo.ml2.model.InvariantConstraint
import br.ufes.inf.nemo.ml2.model.OclExpression
import br.ufes.inf.nemo.ml2.model.LetExpression
import br.ufes.inf.nemo.ml2.model.VariableDeclaration
import br.ufes.inf.nemo.ml2.model.IfExpression
import br.ufes.inf.nemo.ml2.model.ImpliesExpression
import br.ufes.inf.nemo.ml2.model.XorExpression
import br.ufes.inf.nemo.ml2.model.OrExpression
import br.ufes.inf.nemo.ml2.model.AndExpression
import br.ufes.inf.nemo.ml2.model.ComparisonExpression
import br.ufes.inf.nemo.ml2.model.ComparisonOperation
import br.ufes.inf.nemo.ml2.model.ComparisonOperator
import br.ufes.inf.nemo.ml2.model.RelationalExpression
import br.ufes.inf.nemo.ml2.model.RelationalOperation
import br.ufes.inf.nemo.ml2.model.RelationalOperator
import br.ufes.inf.nemo.ml2.model.AdditionExpression
import br.ufes.inf.nemo.ml2.model.AdditionOperation
import br.ufes.inf.nemo.ml2.model.AdditionOperator
import br.ufes.inf.nemo.ml2.model.MultiplicationExpression
import br.ufes.inf.nemo.ml2.model.MultiplicationOperation
import br.ufes.inf.nemo.ml2.model.MultiplicationOperator
import br.ufes.inf.nemo.ml2.model.UnaryExpression
import br.ufes.inf.nemo.ml2.model.UnaryOperator
import br.ufes.inf.nemo.ml2.model.CallExpression
import br.ufes.inf.nemo.ml2.model.NavigationSource
import br.ufes.inf.nemo.ml2.model.DotOperation
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperation
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperator
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperation
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperator
import br.ufes.inf.nemo.ml2.model.ArrowOperation
import br.ufes.inf.nemo.ml2.model.UnarySetOperation
import br.ufes.inf.nemo.ml2.model.UnarySetOperator
import br.ufes.inf.nemo.ml2.model.BinarySetOperation
import br.ufes.inf.nemo.ml2.model.BinarySetOperator
import br.ufes.inf.nemo.ml2.model.UnaryIteration
import br.ufes.inf.nemo.ml2.model.UnaryIterator
import br.ufes.inf.nemo.ml2.model.MultiaryIteration
import br.ufes.inf.nemo.ml2.model.MultiaryIterator
import br.ufes.inf.nemo.ml2.model.TypeOperation
import br.ufes.inf.nemo.ml2.model.TypeOperator
import br.ufes.inf.nemo.ml2.model.LiteralExpression
import br.ufes.inf.nemo.ml2.model.PrimitiveLiteralExpression
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
import org.eclipse.emf.ecore.EObject

class OCLToAlloy {
	
	@Inject extension ML2Util
	@Inject extension OCLUtil
	
	/**
	 * Generates the Alloy counterpart of an OCL Invariant Constraint element.
	 * 
	 * @param constraint the OCL Invariant Constraint element to be transformed.
	 */
	def dispatch generateAlloyConstraint(InvariantConstraint constraint) {'''
		fact «IF constraint.invariantAlias !== null»«constraint.invariantAlias» «ENDIF»{
			all self: «constraint.classContext.name» | «generateOclExpression(constraint.expression)»
		}

	'''
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Derivation Constraint element.
	 * 
	 * @param constraint the OCL Derivation Constraint element to be transformed.
	 */
	def dispatch generateAlloyConstraint(DerivationConstraint constraint) {'''
		fact {
			all self: «constraint.classContext.name» | self.«FOR context : constraint.featureContext SEPARATOR '.'»«context»«ENDFOR» = «generateOclExpression(constraint.expression)»
		}
		
	'''	
	}	
	
	/**
	 * Generates the Alloy counterpart of an OCL Let Expression.
	 * 
	 * @param expression the OCL Let Expression to be transformed.
	 */
	def dispatch CharSequence generateOclExpression(LetExpression expression) {
		'''let «FOR variable : expression.variables SEPARATOR ', '»«generateVariableDeclaration(variable)»«ENDFOR» | «generateOclExpression(expression.inExpression)»'''
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL If Expression.
	 * 
	 * @param expression the OCL If Expression to be transformed.
	 */
	def dispatch CharSequence generateOclExpression(IfExpression expression) {
		'''(«generateOclExpression(expression.condition)» implies «generateOclExpression(expression.thenExpression)» else «generateOclExpression(expression.elseExpression)»)'''	
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Implies Expression.
	 * 
	 * @param expression the OCL Implies Expression to be transformed.
	 */
	def dispatch CharSequence generateOclExpression(ImpliesExpression expression) {
		var result = generateXorExpression(expression.left)
			
		for(operation : expression.right) {
			result = "(" + result + " implies " + generateXorExpression(operation) + ")"
		}
			
		return result
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Variable Declaration element.
	 * 
	 * @param expression the OCL Variable Declaration element to be transformed.
	 */
	def generateVariableDeclaration(VariableDeclaration variable) {
		'''«variable.variableName» = «generateOclExpression(variable.initialValue)»'''
	}

	/**
	 * Generates the Alloy counterpart of an OCL Xor Expression.
	 * 
	 * @param expression the OCL Xor Expression to be transformed.
	 */
	def generateXorExpression(XorExpression expression) {
		var result = generateOrExpression(expression.left)
			
		for(operation : expression.right) {
			result = "((" + result + " or " + generateOrExpression(operation) + ") and not (" + result + " and " + generateOrExpression(operation) + "))"
		}
			
		return result
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Or Expression.
	 * 
	 * @param expression the OCL Or Expression to be transformed.
	 */
	def generateOrExpression(OrExpression expression) {
		var result = generateAndExpression(expression.left)
			
		for(operation : expression.right) {
			result = result + " or " + generateAndExpression(operation)
		}
			
		return result
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL And Expression.
	 * 
	 * @param expression the OCL And Expression to be transformed.
	 */
	def generateAndExpression(AndExpression expression) {
		var result = generateComparisonExpression(expression.left)
			
		for(operation : expression.right) {
			result = result + " and " + generateComparisonExpression(operation)
		}
			
		return result
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Comparison Expression.
	 * 
	 * @param expression the OCL Comparison Expression to be transformed.
	 */
	def generateComparisonExpression(ComparisonExpression expression) {
		var result = generateRelationalExpression(expression.left)
			
		for(operation : expression.right) {
			switch operation.operator {
				case ComparisonOperator.EQUAL:
					result = "(" + result + " = " + generateRelationalExpression(operation.right) + ")"
				case ComparisonOperator.NOT_EQUAL:
					result = "(" + result + " != " + generateRelationalExpression(operation.right) + ")"
			}
		}
			
		return result
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Relational Expression.
	 * 
	 * @param expression the OCL Relational Expression to be transformed.
	 */
	def generateRelationalExpression(RelationalExpression expression) {
		var result = generateAdditionExpression(expression.left)
			
		for(operation : expression.right) {
			switch operation.operator {
				case RelationalOperator.GREATER:
					result = "(" + result + " > " + generateAdditionExpression(operation.right) + ")"
				case RelationalOperator.LESS:
					result = "(" + result + " < " + generateAdditionExpression(operation.right) + ")"
				case RelationalOperator.GREATER_EQUAL:
					result = "(" + result + " >= " + generateAdditionExpression(operation.right) + ")"
				case RelationalOperator.LESS_EQUAL:	
					result = "(" + result + " <= " + generateAdditionExpression(operation.right) + ")"
			}
		}
			
		return result
	}

	/**
	 * Generates the Alloy counterpart of an OCL Addition Expression.
	 * 
	 * @param expression the OCL Addition Expression to be transformed.
	 */
	def generateAdditionExpression(AdditionExpression expression) {
		var result = generateMultiplicationExpression(expression.left)
			
		for(operation : expression.right) {
			switch operation.operator {
				case AdditionOperator.PLUS:
					result = result + ".plus[" + generateMultiplicationExpression(operation.right) + "]"
				case AdditionOperator.MINUS:{
					if(getReturnType(operation.right).equals("Number")) {
						result = result + ".minus[" + generateMultiplicationExpression(operation.right) + "]"
					} else {
						result = result + " - " + generateMultiplicationExpression(operation.right)
					}
				}
			}
		}
			
		return result
	}

	/**
	 * Generates the Alloy counterpart of an OCL Multiplication Expression.
	 * 
	 * @param expression the OCL Multiplication Expression to be transformed.
	 */
	def generateMultiplicationExpression(MultiplicationExpression expression) {
		var result = generateUnaryExpression(expression.left)
			
		for(operation : expression.right) {
			switch operation.operator {
				case MultiplicationOperator.TIMES:
					result = result + ".mul[" + generateUnaryExpression(operation.right) + "]"
				case MultiplicationOperator.OVER:
					result = result + ".div[" + generateUnaryExpression(operation.right) + "]"
			}
		}
			
		return result
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Unary Expression.
	 * 
	 * @param expression the OCL Unary Expression to be transformed.
	 */
	def generateUnaryExpression(UnaryExpression expression) {
		switch expression.operator {
			case UnaryOperator.NONE:
				return generateTermExpression(expression.right)
			case UnaryOperator.NOT:
				return "not " + generateTermExpression(expression.right)
			case UnaryOperator.MINUS:
				return "negate[" + generateTermExpression(expression.right) + "]"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Call Expression.
	 * 
	 * @param expression the OCL Call Expression to be transformed.
	 */
	def dispatch generateTermExpression(CallExpression expression) {
		var result = generateNavigationSource(expression.left)
		
		for(operation : expression.right) {
			result = generateCallExpression(operation, result)
		}
		
		if(belongsToMainTree(expression) && getReturnType(expression).equals("Boolean")) {
			return "(" + result + " = true)" // Handles boolean cases not supported in Alloy
		} else {
			return result
		} 
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Literal Expression.
	 * 
	 * @param expression the OCL Literal Expression to be transformed.
	 */
	def dispatch generateTermExpression(LiteralExpression expression) {
		return generateLiteralExpression(expression)
	}
	
	/**
	 * Generates the Alloy counterpart of a nested OCL Expression.
	 * 
	 * @param expression the nested OCL Expression to be transformed.
	 */
	def dispatch generateTermExpression(OclExpression expression) {
		return "(" + generateOclExpression(expression) + ")"
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Navigation Source.
	 * 
	 * @param expression the OCL Navigation Source to be transformed.
	 */
	def generateNavigationSource(NavigationSource expression) {
		var source = expression.source
		
		if(source instanceof TypeLiteralExpression) {
			return generateLiteralExpression(source)
		} else if(source instanceof VariableExpression) {
			return generateVariableExpression(source)
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Dot Operation.
	 * 
	 * @param operation the OCL Dot Operation to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateCallExpression(DotOperation operation, String context) {
		return generateDotOperation(operation, context)
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Unary Number Operation.
	 * 
	 * @param operation the OCL Unary Number Operation to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateDotOperation(UnaryNumberOperation operation, String context) {
		switch(operation.operator) {
			case UnaryNumberOperator.ABS:
				return "abs[" + context + "]"
			case UnaryNumberOperator.FLOOR:
				return context
			case UnaryNumberOperator.ROUND:
				return context
			case UnaryNumberOperator.OCL_IS_UNDEFINED:
				return "(# " + context + " = 0)"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Binary Number Operation.
	 * 
	 * @param operation the OCL Binary Number Operation to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateDotOperation(BinaryNumberOperation operation, String context) {
		switch(operation.operator) {
			case BinaryNumberOperator.MIN:
				return "min[" + context + ", " + generateOclExpression(operation.argument) + "]"
			case BinaryNumberOperator.MAX:
				return "max[" + context + ", " + generateOclExpression(operation.argument) + "]"
			case BinaryNumberOperator.DIV:
				return "(" + context + ").div["+ generateOclExpression(operation.argument) + "]"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Dot Type Operation.
	 * 
	 * @param operation the OCL Dot Type Operation to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateDotOperation(TypeOperation operation, String context) {
		return generateTypeOperation(operation, context)
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Dot Variable Expression.
	 * 
	 * @param operation the OCL Dot Variable Expression to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateDotOperation(VariableExpression operation, String context) {
		return context + "." + generateVariableExpression(operation)
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Arrow Expression.
	 * 
	 * @param operation the OCL Arrow Expression to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateCallExpression(ArrowOperation operation, String context) {
		return generateArrowOperation(operation, context)
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Unary Set Operation.
	 * 
	 * @param operation the OCL Unary Set Operation to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateArrowOperation(UnarySetOperation operation, String context) {
		switch(operation.operator) {
			case UnarySetOperator.SIZE:
				return "(# " + context + ")"
			case UnarySetOperator.IS_EMPTY:
				return "(no " + context + ")"
			case UnarySetOperator.NOT_EMPTY:
				return "(some " + context + ")"
			case UnarySetOperator.SUM:
				return "(sum " + context + ")"
			case UnarySetOperator.MIN:
				return "{ i: " + context + " | all j: " + context + " | int[i] <= int[j] }"
			case UnarySetOperator.MAX:
				return "{ i: " + context + " | all j: " + context + " | int[i] >= int[j] }"
			case UnarySetOperator.AS_SET:
				return context
			case UnarySetOperator.FLATTEN:
				return context
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Binary Set Operation.
	 * 
	 * @param operation the OCL Binary Set Operation to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateArrowOperation(BinarySetOperation operation, String context) {
		switch(operation.operator) {
			case BinarySetOperator.INCLUDES:
				return "(" + generateOclExpression(operation.argument) + " in " + context + ")"
			case BinarySetOperator.INCLUDES_ALL:
				return "(" + generateOclExpression(operation.argument) + " in " + context + ")"
			case BinarySetOperator.EXCLUDES:
				return "(" + generateOclExpression(operation.argument) + " not in " + context + ")"
			case BinarySetOperator.EXCLUDES_ALL:
				return "(no (" + generateOclExpression(operation.argument) + " & " + context + "))"
			case BinarySetOperator.INCLUDING:
				return "(" + context + " + " + generateOclExpression(operation.argument) + ")"
			case BinarySetOperator.EXCLUDING:
				return "(" + context + " - " + generateOclExpression(operation.argument) + ")"
			case BinarySetOperator.COUNT:
				return "(" + generateOclExpression(operation.argument) + " in " + context + " implies 1 else 0)"
			case BinarySetOperator.UNION:
				return "(" + context + " + " + generateOclExpression(operation.argument) + ")"
			case BinarySetOperator.INTERSECTION:
				return "(" + context + " & " + generateOclExpression(operation.argument) + ")"
			case BinarySetOperator.SYMMETRIC_DIFFERENCE:
				return "((" + context + " - " + generateOclExpression(operation.argument) + ") + (" + generateOclExpression(operation.argument) + " - " + context + "))"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Unary Iteration.
	 * 
	 * @param operation the OCL Unary Iteration to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateArrowOperation(UnaryIteration operation, String context) {
		var variable = "x"
		
		if(operation.variable !== null) {
			variable = operation.variable
		}
		
		switch(operation.iterator) {
			case UnaryIterator.SELECT:
				return "({" + variable + ": " + context + " | " + generateOclExpression(operation.body) + "})"
			case UnaryIterator.REJECT:
				return "({" + variable + ": " + context + " | not " + generateOclExpression(operation.body) + "})"
			case UnaryIterator.COLLECT:
				if(operation.variable === null) {
					return "(univ.{" + variable + ": " + context + ", res: x." + generateOclExpression(operation.body) + " | TRUE})"
				} else {
					return "(univ.{" + variable + ": " + context + ", res: " + generateOclExpression(operation.body) + " | TRUE})"
				}
			case UnaryIterator.ANY:
				return "({" + variable + ": " + context + " | " + generateOclExpression(operation.body) + "})"
			case UnaryIterator.ONE:
				return "(# {" + variable + ": " + context + " | " + generateOclExpression(operation.body) + "} = 1)"
			case UnaryIterator.IS_UNIQUE:{
				var result = "(all disj " + variable + ", " + variable + "': " + context + " | ((" + generateOclExpression(operation.body) + ") iff ("
				
				substituteVariableName(operation.body, variable, true)
				result = result + generateOclExpression(operation.body) + ")) implies (" + variable + " = " + variable + "'))"
				substituteVariableName(operation.body, variable, false)
				
				return result
			}		
			case UnaryIterator.CLOSURE:
				return "(" + context + ".^{" + variable + ": univ, res: " + generateOclExpression(operation.body) + " | TRUE})"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Multiary Iteration.
	 * 
	 * @param operation the OCL Multiary Iteration to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateArrowOperation(MultiaryIteration operation, String context) {
		var variable = "x"
	
		for(v : operation.variables) {
			if(v == operation.variables.head) {
				variable = v
			} else {
				variable = variable + ", " + v
			}
		}
		
		switch(operation.iterator) {
			case MultiaryIterator.EXISTS:
				return "(some " + variable + ": " + context + " | " + generateOclExpression(operation.body) + ")"
			case MultiaryIterator.FOR_ALL:
				return "(all " + variable + ": " + context + " | " + generateOclExpression(operation.body) + ")"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Arrow Type Operation.
	 * 
	 * @param operation the OCL Arrow Type Operation to be transformed.
	 * @param context the expression context.
	 */
	def dispatch generateArrowOperation(TypeOperation operation, String context) {
		return generateTypeOperation(operation, context)
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Type Operation.
	 * 
	 * @param operation the OCL Type Operation to be transformed.
	 * @param context the expression context.
	 */
	def generateTypeOperation(TypeOperation operation, String context) {
		switch(operation.operator) {
			case TypeOperator.OCL_AS_TYPE:
				return context
			case TypeOperator.OCL_IS_KIND_OF:
				if(operation.referredType !== null) {
					return "(" + context + " in " + generateLiteralExpression(operation.referredType) + ")"
				} else {
					return "(" + context + " in self)"
				}
			case TypeOperator.OCL_IS_TYPE_OF:
				if(operation.referredType !== null) {
					var referredTypeName = generateLiteralExpression(operation.referredType)
					var Class referredType
					
					if(referredTypeName.equals("Boolean") || referredTypeName.equals("Number") || referredTypeName.equals("String") || referredTypeName.substring(0,4).equals("Set{")) {
						return "(" + context + " in " + referredType + ")"
					} else {
						var EObject container = operation
						
						while(! (container instanceof Model)) {
							container = container.eContainer
						}
						
						if(container instanceof Model) {
							referredType = getClass(referredTypeName, container)
						}
					}
					
					var subtypes = classSubtypes(referredType)
					
					if(subtypes.size == 0) {
						return "(" + context + " in " + referredType + ")"
					} else {
						var result = "((" + context + " in " + referredType + ") and (# " + context + " & ("
						
						// Union of all subtypes of referredType
						for(s : subtypes) {
							if(s == subtypes.last) {
								result = result + s.name
							} else {
								result = result + s.name + " + "
							}
						}
						
						return result + ") = 0))"
					}
				} else {
					var referredType = getClassContext(operation)
					var subtypes = classSubtypes(referredType)
					
					if(subtypes.size == 0) {
						return "(" + context + " in self)"
					} else {
						var result = "((" + context + " in self) and (# " + context + " & ("
					
						// Union of all subtypes of referredType
						for(s : subtypes) {
							if(s == subtypes.last) {
								result = result + s.name
							} else {
								result = result + s.name + " + "
							}
						}
					
						return result + ") = 0))"
					}
				}
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Primitive Literal Expression.
	 * 
	 * @param expression the OCL Primitive Literal Expression to be transformed.
	 */
	def dispatch generateLiteralExpression(PrimitiveLiteralExpression expression) {
		return generatePrimitiveLiteralExpression(expression)
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Set Literal Expression.
	 * 
	 * @param expression the OCL Set Literal Expression to be transformed.
	 */
	def dispatch generateLiteralExpression(SetLiteralExpression expression) {
		if(expression.parts.size == 0) {
			return "none"
		} else {
			var result = "("
		
			for(part : expression.parts) {
				if(part == expression.parts.head) {
					result = result + generatePrimitiveLiteralExpression(part)
				} else {
					result = result + " + " + generatePrimitiveLiteralExpression(part)
				}
			}
		
			return result + ")"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Type Literal Expression.
	 * 
	 * @param expression the OCL Type Literal Expression to be transformed.
	 */
	def dispatch generateLiteralExpression(TypeLiteralExpression expression) {
		return generateTypeLiteral(expression)
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Primitive Type Literal.
	 * 
	 * @param expression the OCL Primitive Type Literal to be transformed.
	 */
	def dispatch generateTypeLiteral(PrimitiveTypeLiteral expression) {
		return "" + expression.typeName
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Set Type Literal.
	 * 
	 * @param expression the OCL Set Type Literal to be transformed.
	 */
	def dispatch generateTypeLiteral(SetTypeLiteral expression) {
		return "" + expression.typeName
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL User Defined Type Literal.
	 * 
	 * @param expression the OCL User Defined Type Literal to be transformed.
	 */
	def dispatch generateTypeLiteral(UserDefinedTypeLiteral expression) {
		return "" + expression.typeName.name
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Boolean Literal Expression.
	 * 
	 * @param expression the OCL Boolean Literal Expression to be transformed.
	 */
	def dispatch generatePrimitiveLiteralExpression(BooleanLiteralExpression expression) {
		if(expression.booleanSymbol) {
			return "TRUE"
		} else {
			return "FALSE"
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Number Literal Expression.
	 * 
	 * @param expression the OCL Number Literal Expression to be transformed.
	 */
	def dispatch generatePrimitiveLiteralExpression(NumberLiteralExpression expression) {
		return "" + expression.numberSymbol.intValue
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL String Literal Expression.
	 * 
	 * @param expression the OCL String Literal Expression to be transformed.
	 */
	def dispatch generatePrimitiveLiteralExpression(StringLiteralExpression expression) {
		return "" + expression.stringSymbol
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Null Literal Expression.
	 * 
	 * @param expression the OCL Null Literal Expression to be transformed.
	 */
	def dispatch generatePrimitiveLiteralExpression(NullLiteralExpression expression) {
		return "none"
	}
	
	/**
	 * Generates the Alloy counterpart of an OCL Variable Expression.
	 * 
	 * @param expression the OCL Variable Expression to be transformed.
	 */
	def generateVariableExpression(VariableExpression expression) {
		return "" + expression.referringVariable
	}
	
	/*****************************************************************************************************************************
	 *************************************************  AUXILIARY METHODS ********************************************************
	 *****************************************************************************************************************************/
	
	/**
	 * Substitutes all variable names declared in an OCL iterator used in its body expression,
	 * by appending or removing an ' (apostrophe) from them.
	 * 
	 * @param expression the OCL iterator body expression.
	 * @param variable the variable to be substituted.
	 * @param b a boolean to indicate appendix (true) or removal (false).
	 */
	def void substituteVariableName(Object expression, String variable, boolean b) {
		if(expression instanceof VariableExpression) {
			if(expression.referringVariable.equals(variable)) {
				if(b) {
					expression.referringVariable = expression.referringVariable + "'"
				} else {
					expression.referringVariable = expression.referringVariable.substring(0, expression.referringVariable.length - 1)
				}
			}
		} else if(expression instanceof LetExpression) {
			substituteVariableName(expression.inExpression, variable, b)
		} else if(expression instanceof IfExpression) {
			substituteVariableName(expression.condition, variable, b)
			substituteVariableName(expression.thenExpression, variable, b)
			substituteVariableName(expression.elseExpression, variable, b)
		} else if(expression instanceof ImpliesExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof XorExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof OrExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof AndExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof ComparisonExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof ComparisonOperation) {
			substituteVariableName(expression.right, variable, b)
		} else if(expression instanceof RelationalExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof RelationalOperation) {
			substituteVariableName(expression.right, variable, b)
		} else if(expression instanceof AdditionExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof AdditionOperation) {
			substituteVariableName(expression.right, variable, b)
		} else if(expression instanceof MultiplicationExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		} else if(expression instanceof MultiplicationOperation) {
			substituteVariableName(expression.right, variable, b)
		} else if(expression instanceof UnaryExpression) {
			substituteVariableName(expression.right, variable, b)
		} else if(expression instanceof CallExpression) {
			substituteVariableName(expression.left, variable, b)
			for(right : expression.right) {
				substituteVariableName(right, variable, b)
			}
		}
	}
}	
