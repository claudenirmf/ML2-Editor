/**
 * More methods to the ML2 to Alloy transformation in order to include OCL elements.
 * 
 * @author Fernando Amaral Musso
 */
package br.ufes.inf.nemo.ml2.generator;

import br.ufes.inf.nemo.ml2.model.AdditionExpression;
import br.ufes.inf.nemo.ml2.model.AdditionOperation;
import br.ufes.inf.nemo.ml2.model.AdditionOperator;
import br.ufes.inf.nemo.ml2.model.AndExpression;
import br.ufes.inf.nemo.ml2.model.ArrowOperation;
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperation;
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperator;
import br.ufes.inf.nemo.ml2.model.BinarySetOperation;
import br.ufes.inf.nemo.ml2.model.BinarySetOperator;
import br.ufes.inf.nemo.ml2.model.BooleanLiteralExpression;
import br.ufes.inf.nemo.ml2.model.CallExpression;
import br.ufes.inf.nemo.ml2.model.CallOperation;
import br.ufes.inf.nemo.ml2.model.ComparisonExpression;
import br.ufes.inf.nemo.ml2.model.ComparisonOperation;
import br.ufes.inf.nemo.ml2.model.ComparisonOperator;
import br.ufes.inf.nemo.ml2.model.Constraint;
import br.ufes.inf.nemo.ml2.model.DerivationConstraint;
import br.ufes.inf.nemo.ml2.model.DotOperation;
import br.ufes.inf.nemo.ml2.model.IfExpression;
import br.ufes.inf.nemo.ml2.model.ImpliesExpression;
import br.ufes.inf.nemo.ml2.model.InvariantConstraint;
import br.ufes.inf.nemo.ml2.model.LetExpression;
import br.ufes.inf.nemo.ml2.model.LiteralExpression;
import br.ufes.inf.nemo.ml2.model.Model;
import br.ufes.inf.nemo.ml2.model.MultiaryIteration;
import br.ufes.inf.nemo.ml2.model.MultiaryIterator;
import br.ufes.inf.nemo.ml2.model.MultiplicationExpression;
import br.ufes.inf.nemo.ml2.model.MultiplicationOperation;
import br.ufes.inf.nemo.ml2.model.MultiplicationOperator;
import br.ufes.inf.nemo.ml2.model.NavigationSource;
import br.ufes.inf.nemo.ml2.model.NullLiteralExpression;
import br.ufes.inf.nemo.ml2.model.NumberLiteralExpression;
import br.ufes.inf.nemo.ml2.model.OclExpression;
import br.ufes.inf.nemo.ml2.model.OrExpression;
import br.ufes.inf.nemo.ml2.model.PrimitiveLiteralExpression;
import br.ufes.inf.nemo.ml2.model.PrimitiveTypeLiteral;
import br.ufes.inf.nemo.ml2.model.RelationalExpression;
import br.ufes.inf.nemo.ml2.model.RelationalOperation;
import br.ufes.inf.nemo.ml2.model.RelationalOperator;
import br.ufes.inf.nemo.ml2.model.SetLiteralExpression;
import br.ufes.inf.nemo.ml2.model.SetTypeLiteral;
import br.ufes.inf.nemo.ml2.model.StringLiteralExpression;
import br.ufes.inf.nemo.ml2.model.TermExpression;
import br.ufes.inf.nemo.ml2.model.TypeLiteralExpression;
import br.ufes.inf.nemo.ml2.model.TypeOperation;
import br.ufes.inf.nemo.ml2.model.TypeOperator;
import br.ufes.inf.nemo.ml2.model.UnaryExpression;
import br.ufes.inf.nemo.ml2.model.UnaryIteration;
import br.ufes.inf.nemo.ml2.model.UnaryIterator;
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperation;
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperator;
import br.ufes.inf.nemo.ml2.model.UnaryOperator;
import br.ufes.inf.nemo.ml2.model.UnarySetOperation;
import br.ufes.inf.nemo.ml2.model.UnarySetOperator;
import br.ufes.inf.nemo.ml2.model.UserDefinedTypeLiteral;
import br.ufes.inf.nemo.ml2.model.VariableDeclaration;
import br.ufes.inf.nemo.ml2.model.VariableExpression;
import br.ufes.inf.nemo.ml2.model.XorExpression;
import br.ufes.inf.nemo.ml2.util.ML2Util;
import br.ufes.inf.nemo.ml2.util.OCLUtil;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class OCLToAlloy {
  @Inject
  @Extension
  private ML2Util _mL2Util;
  
  @Inject
  @Extension
  private OCLUtil _oCLUtil;
  
  /**
   * Generates the Alloy counterpart of an OCL Invariant Constraint element.
   * 
   * @param constraint the OCL Invariant Constraint element to be transformed.
   */
  protected CharSequence _generateAlloyConstraint(final InvariantConstraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fact ");
    {
      String _invariantAlias = constraint.getInvariantAlias();
      boolean _tripleNotEquals = (_invariantAlias != null);
      if (_tripleNotEquals) {
        String _invariantAlias_1 = constraint.getInvariantAlias();
        _builder.append(_invariantAlias_1);
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("all self: ");
    String _name = constraint.getClassContext().getName();
    _builder.append(_name, "\t");
    _builder.append(" | ");
    CharSequence _generateOclExpression = this.generateOclExpression(constraint.getExpression());
    _builder.append(_generateOclExpression, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Derivation Constraint element.
   * 
   * @param constraint the OCL Derivation Constraint element to be transformed.
   */
  protected CharSequence _generateAlloyConstraint(final DerivationConstraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all self: ");
    String _name = constraint.getClassContext().getName();
    _builder.append(_name, "\t");
    _builder.append(" | self.");
    {
      EList<String> _featureContext = constraint.getFeatureContext();
      boolean _hasElements = false;
      for(final String context : _featureContext) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(".", "\t");
        }
        _builder.append(context, "\t");
      }
    }
    _builder.append(" = ");
    CharSequence _generateOclExpression = this.generateOclExpression(constraint.getExpression());
    _builder.append(_generateOclExpression, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Let Expression.
   * 
   * @param expression the OCL Let Expression to be transformed.
   */
  protected CharSequence _generateOclExpression(final LetExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("let ");
    {
      EList<VariableDeclaration> _variables = expression.getVariables();
      boolean _hasElements = false;
      for(final VariableDeclaration variable : _variables) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _generateVariableDeclaration = this.generateVariableDeclaration(variable);
        _builder.append(_generateVariableDeclaration);
      }
    }
    _builder.append(" | ");
    CharSequence _generateOclExpression = this.generateOclExpression(expression.getInExpression());
    _builder.append(_generateOclExpression);
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL If Expression.
   * 
   * @param expression the OCL If Expression to be transformed.
   */
  protected CharSequence _generateOclExpression(final IfExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateOclExpression = this.generateOclExpression(expression.getCondition());
    _builder.append(_generateOclExpression);
    _builder.append(" implies ");
    CharSequence _generateOclExpression_1 = this.generateOclExpression(expression.getThenExpression());
    _builder.append(_generateOclExpression_1);
    _builder.append(" else ");
    CharSequence _generateOclExpression_2 = this.generateOclExpression(expression.getElseExpression());
    _builder.append(_generateOclExpression_2);
    _builder.append(")");
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Implies Expression.
   * 
   * @param expression the OCL Implies Expression to be transformed.
   */
  protected CharSequence _generateOclExpression(final ImpliesExpression expression) {
    String result = this.generateXorExpression(expression.getLeft());
    EList<XorExpression> _right = expression.getRight();
    for (final XorExpression operation : _right) {
      String _generateXorExpression = this.generateXorExpression(operation);
      String _plus = ((("(" + result) + " implies ") + _generateXorExpression);
      String _plus_1 = (_plus + ")");
      result = _plus_1;
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Variable Declaration element.
   * 
   * @param expression the OCL Variable Declaration element to be transformed.
   */
  public CharSequence generateVariableDeclaration(final VariableDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _variableName = variable.getVariableName();
    _builder.append(_variableName);
    _builder.append(" = ");
    CharSequence _generateOclExpression = this.generateOclExpression(variable.getInitialValue());
    _builder.append(_generateOclExpression);
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Xor Expression.
   * 
   * @param expression the OCL Xor Expression to be transformed.
   */
  public String generateXorExpression(final XorExpression expression) {
    String result = this.generateOrExpression(expression.getLeft());
    EList<OrExpression> _right = expression.getRight();
    for (final OrExpression operation : _right) {
      String _generateOrExpression = this.generateOrExpression(operation);
      String _plus = ((("((" + result) + " or ") + _generateOrExpression);
      String _plus_1 = (_plus + ") and not (");
      String _plus_2 = (_plus_1 + result);
      String _plus_3 = (_plus_2 + " and ");
      String _generateOrExpression_1 = this.generateOrExpression(operation);
      String _plus_4 = (_plus_3 + _generateOrExpression_1);
      String _plus_5 = (_plus_4 + "))");
      result = _plus_5;
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Or Expression.
   * 
   * @param expression the OCL Or Expression to be transformed.
   */
  public String generateOrExpression(final OrExpression expression) {
    String result = this.generateAndExpression(expression.getLeft());
    EList<AndExpression> _right = expression.getRight();
    for (final AndExpression operation : _right) {
      String _generateAndExpression = this.generateAndExpression(operation);
      String _plus = ((result + " or ") + _generateAndExpression);
      result = _plus;
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL And Expression.
   * 
   * @param expression the OCL And Expression to be transformed.
   */
  public String generateAndExpression(final AndExpression expression) {
    String result = this.generateComparisonExpression(expression.getLeft());
    EList<ComparisonExpression> _right = expression.getRight();
    for (final ComparisonExpression operation : _right) {
      String _generateComparisonExpression = this.generateComparisonExpression(operation);
      String _plus = ((result + " and ") + _generateComparisonExpression);
      result = _plus;
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Comparison Expression.
   * 
   * @param expression the OCL Comparison Expression to be transformed.
   */
  public String generateComparisonExpression(final ComparisonExpression expression) {
    String result = this.generateRelationalExpression(expression.getLeft());
    EList<ComparisonOperation> _right = expression.getRight();
    for (final ComparisonOperation operation : _right) {
      ComparisonOperator _operator = operation.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case EQUAL:
            String _generateRelationalExpression = this.generateRelationalExpression(operation.getRight());
            String _plus = ((("(" + result) + " = ") + _generateRelationalExpression);
            String _plus_1 = (_plus + ")");
            result = _plus_1;
            break;
          case NOT_EQUAL:
            String _generateRelationalExpression_1 = this.generateRelationalExpression(operation.getRight());
            String _plus_2 = ((("(" + result) + " != ") + _generateRelationalExpression_1);
            String _plus_3 = (_plus_2 + ")");
            result = _plus_3;
            break;
          default:
            break;
        }
      }
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Relational Expression.
   * 
   * @param expression the OCL Relational Expression to be transformed.
   */
  public String generateRelationalExpression(final RelationalExpression expression) {
    String result = this.generateAdditionExpression(expression.getLeft());
    EList<RelationalOperation> _right = expression.getRight();
    for (final RelationalOperation operation : _right) {
      RelationalOperator _operator = operation.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case GREATER:
            String _generateAdditionExpression = this.generateAdditionExpression(operation.getRight());
            String _plus = ((("(" + result) + " > ") + _generateAdditionExpression);
            String _plus_1 = (_plus + ")");
            result = _plus_1;
            break;
          case LESS:
            String _generateAdditionExpression_1 = this.generateAdditionExpression(operation.getRight());
            String _plus_2 = ((("(" + result) + " < ") + _generateAdditionExpression_1);
            String _plus_3 = (_plus_2 + ")");
            result = _plus_3;
            break;
          case GREATER_EQUAL:
            String _generateAdditionExpression_2 = this.generateAdditionExpression(operation.getRight());
            String _plus_4 = ((("(" + result) + " >= ") + _generateAdditionExpression_2);
            String _plus_5 = (_plus_4 + ")");
            result = _plus_5;
            break;
          case LESS_EQUAL:
            String _generateAdditionExpression_3 = this.generateAdditionExpression(operation.getRight());
            String _plus_6 = ((("(" + result) + " <= ") + _generateAdditionExpression_3);
            String _plus_7 = (_plus_6 + ")");
            result = _plus_7;
            break;
          default:
            break;
        }
      }
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Addition Expression.
   * 
   * @param expression the OCL Addition Expression to be transformed.
   */
  public String generateAdditionExpression(final AdditionExpression expression) {
    String result = this.generateMultiplicationExpression(expression.getLeft());
    EList<AdditionOperation> _right = expression.getRight();
    for (final AdditionOperation operation : _right) {
      AdditionOperator _operator = operation.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case PLUS:
            String _generateMultiplicationExpression = this.generateMultiplicationExpression(operation.getRight());
            String _plus = ((result + ".plus[") + _generateMultiplicationExpression);
            String _plus_1 = (_plus + "]");
            result = _plus_1;
            break;
          case MINUS:
            boolean _equals = this._oCLUtil.getReturnType(operation.getRight()).equals("Number");
            if (_equals) {
              String _generateMultiplicationExpression_1 = this.generateMultiplicationExpression(operation.getRight());
              String _plus_2 = ((result + ".minus[") + _generateMultiplicationExpression_1);
              String _plus_3 = (_plus_2 + "]");
              result = _plus_3;
            } else {
              String _generateMultiplicationExpression_2 = this.generateMultiplicationExpression(operation.getRight());
              String _plus_4 = ((result + " - ") + _generateMultiplicationExpression_2);
              result = _plus_4;
            }
            break;
          default:
            break;
        }
      }
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Multiplication Expression.
   * 
   * @param expression the OCL Multiplication Expression to be transformed.
   */
  public String generateMultiplicationExpression(final MultiplicationExpression expression) {
    String result = this.generateUnaryExpression(expression.getLeft());
    EList<MultiplicationOperation> _right = expression.getRight();
    for (final MultiplicationOperation operation : _right) {
      MultiplicationOperator _operator = operation.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case TIMES:
            String _generateUnaryExpression = this.generateUnaryExpression(operation.getRight());
            String _plus = ((result + ".mul[") + _generateUnaryExpression);
            String _plus_1 = (_plus + "]");
            result = _plus_1;
            break;
          case OVER:
            String _generateUnaryExpression_1 = this.generateUnaryExpression(operation.getRight());
            String _plus_2 = ((result + ".div[") + _generateUnaryExpression_1);
            String _plus_3 = (_plus_2 + "]");
            result = _plus_3;
            break;
          default:
            break;
        }
      }
    }
    return result;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Unary Expression.
   * 
   * @param expression the OCL Unary Expression to be transformed.
   */
  public String generateUnaryExpression(final UnaryExpression expression) {
    UnaryOperator _operator = expression.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case NONE:
          return this.generateTermExpression(expression.getRight());
        case NOT:
          String _generateTermExpression = this.generateTermExpression(expression.getRight());
          return ("not " + _generateTermExpression);
        case MINUS:
          String _generateTermExpression_1 = this.generateTermExpression(expression.getRight());
          String _plus = ("negate[" + _generateTermExpression_1);
          return (_plus + "]");
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Call Expression.
   * 
   * @param expression the OCL Call Expression to be transformed.
   */
  protected String _generateTermExpression(final CallExpression expression) {
    String result = this.generateNavigationSource(expression.getLeft());
    EList<CallOperation> _right = expression.getRight();
    for (final CallOperation operation : _right) {
      result = this.generateCallExpression(operation, result);
    }
    if ((this._oCLUtil.belongsToMainTree(expression) && this._oCLUtil.getReturnType(expression).equals("Boolean"))) {
      return (("(" + result) + " = true)");
    } else {
      return result;
    }
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Literal Expression.
   * 
   * @param expression the OCL Literal Expression to be transformed.
   */
  protected String _generateTermExpression(final LiteralExpression expression) {
    return this.generateLiteralExpression(expression);
  }
  
  /**
   * Generates the Alloy counterpart of a nested OCL Expression.
   * 
   * @param expression the nested OCL Expression to be transformed.
   */
  protected String _generateTermExpression(final OclExpression expression) {
    CharSequence _generateOclExpression = this.generateOclExpression(expression);
    String _plus = ("(" + _generateOclExpression);
    return (_plus + ")");
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Navigation Source.
   * 
   * @param expression the OCL Navigation Source to be transformed.
   */
  public String generateNavigationSource(final NavigationSource expression) {
    EObject source = expression.getSource();
    if ((source instanceof TypeLiteralExpression)) {
      return this.generateLiteralExpression(((LiteralExpression)source));
    } else {
      if ((source instanceof VariableExpression)) {
        return this.generateVariableExpression(((VariableExpression)source));
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Dot Operation.
   * 
   * @param operation the OCL Dot Operation to be transformed.
   * @param context the expression context.
   */
  protected String _generateCallExpression(final DotOperation operation, final String context) {
    return this.generateDotOperation(operation, context);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Unary Number Operation.
   * 
   * @param operation the OCL Unary Number Operation to be transformed.
   * @param context the expression context.
   */
  protected String _generateDotOperation(final UnaryNumberOperation operation, final String context) {
    UnaryNumberOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case ABS:
          return (("abs[" + context) + "]");
        case FLOOR:
          return context;
        case ROUND:
          return context;
        case OCL_IS_UNDEFINED:
          return (("(# " + context) + " = 0)");
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Binary Number Operation.
   * 
   * @param operation the OCL Binary Number Operation to be transformed.
   * @param context the expression context.
   */
  protected String _generateDotOperation(final BinaryNumberOperation operation, final String context) {
    BinaryNumberOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case MIN:
          CharSequence _generateOclExpression = this.generateOclExpression(operation.getArgument());
          String _plus = ((("min[" + context) + ", ") + _generateOclExpression);
          return (_plus + "]");
        case MAX:
          CharSequence _generateOclExpression_1 = this.generateOclExpression(operation.getArgument());
          String _plus_1 = ((("max[" + context) + ", ") + _generateOclExpression_1);
          return (_plus_1 + "]");
        case DIV:
          CharSequence _generateOclExpression_2 = this.generateOclExpression(operation.getArgument());
          String _plus_2 = ((("(" + context) + ").div[") + _generateOclExpression_2);
          return (_plus_2 + "]");
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Dot Type Operation.
   * 
   * @param operation the OCL Dot Type Operation to be transformed.
   * @param context the expression context.
   */
  protected String _generateDotOperation(final TypeOperation operation, final String context) {
    return this.generateTypeOperation(operation, context);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Dot Variable Expression.
   * 
   * @param operation the OCL Dot Variable Expression to be transformed.
   * @param context the expression context.
   */
  protected String _generateDotOperation(final VariableExpression operation, final String context) {
    String _generateVariableExpression = this.generateVariableExpression(operation);
    return ((context + ".") + _generateVariableExpression);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Arrow Expression.
   * 
   * @param operation the OCL Arrow Expression to be transformed.
   * @param context the expression context.
   */
  protected String _generateCallExpression(final ArrowOperation operation, final String context) {
    return this.generateArrowOperation(operation, context);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Unary Set Operation.
   * 
   * @param operation the OCL Unary Set Operation to be transformed.
   * @param context the expression context.
   */
  protected String _generateArrowOperation(final UnarySetOperation operation, final String context) {
    UnarySetOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case SIZE:
          return (("(# " + context) + ")");
        case IS_EMPTY:
          return (("(no " + context) + ")");
        case NOT_EMPTY:
          return (("(some " + context) + ")");
        case SUM:
          return (("(sum " + context) + ")");
        case MIN:
          return (((("{ i: " + context) + " | all j: ") + context) + " | int[i] <= int[j] }");
        case MAX:
          return (((("{ i: " + context) + " | all j: ") + context) + " | int[i] >= int[j] }");
        case AS_SET:
          return context;
        case FLATTEN:
          return context;
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Binary Set Operation.
   * 
   * @param operation the OCL Binary Set Operation to be transformed.
   * @param context the expression context.
   */
  protected String _generateArrowOperation(final BinarySetOperation operation, final String context) {
    BinarySetOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case INCLUDES:
          CharSequence _generateOclExpression = this.generateOclExpression(operation.getArgument());
          String _plus = ("(" + _generateOclExpression);
          String _plus_1 = (_plus + " in ");
          String _plus_2 = (_plus_1 + context);
          return (_plus_2 + ")");
        case INCLUDES_ALL:
          CharSequence _generateOclExpression_1 = this.generateOclExpression(operation.getArgument());
          String _plus_3 = ("(" + _generateOclExpression_1);
          String _plus_4 = (_plus_3 + " in ");
          String _plus_5 = (_plus_4 + context);
          return (_plus_5 + ")");
        case EXCLUDES:
          CharSequence _generateOclExpression_2 = this.generateOclExpression(operation.getArgument());
          String _plus_6 = ("(" + _generateOclExpression_2);
          String _plus_7 = (_plus_6 + " not in ");
          String _plus_8 = (_plus_7 + context);
          return (_plus_8 + ")");
        case EXCLUDES_ALL:
          CharSequence _generateOclExpression_3 = this.generateOclExpression(operation.getArgument());
          String _plus_9 = ("(no (" + _generateOclExpression_3);
          String _plus_10 = (_plus_9 + " & ");
          String _plus_11 = (_plus_10 + context);
          return (_plus_11 + "))");
        case INCLUDING:
          CharSequence _generateOclExpression_4 = this.generateOclExpression(operation.getArgument());
          String _plus_12 = ((("(" + context) + " + ") + _generateOclExpression_4);
          return (_plus_12 + ")");
        case EXCLUDING:
          CharSequence _generateOclExpression_5 = this.generateOclExpression(operation.getArgument());
          String _plus_13 = ((("(" + context) + " - ") + _generateOclExpression_5);
          return (_plus_13 + ")");
        case COUNT:
          CharSequence _generateOclExpression_6 = this.generateOclExpression(operation.getArgument());
          String _plus_14 = ("(" + _generateOclExpression_6);
          String _plus_15 = (_plus_14 + " in ");
          String _plus_16 = (_plus_15 + context);
          return (_plus_16 + " implies 1 else 0)");
        case UNION:
          CharSequence _generateOclExpression_7 = this.generateOclExpression(operation.getArgument());
          String _plus_17 = ((("(" + context) + " + ") + _generateOclExpression_7);
          return (_plus_17 + ")");
        case INTERSECTION:
          CharSequence _generateOclExpression_8 = this.generateOclExpression(operation.getArgument());
          String _plus_18 = ((("(" + context) + " & ") + _generateOclExpression_8);
          return (_plus_18 + ")");
        case SYMMETRIC_DIFFERENCE:
          CharSequence _generateOclExpression_9 = this.generateOclExpression(operation.getArgument());
          String _plus_19 = ((("((" + context) + " - ") + _generateOclExpression_9);
          String _plus_20 = (_plus_19 + ") + (");
          CharSequence _generateOclExpression_10 = this.generateOclExpression(operation.getArgument());
          String _plus_21 = (_plus_20 + _generateOclExpression_10);
          String _plus_22 = (_plus_21 + " - ");
          String _plus_23 = (_plus_22 + context);
          return (_plus_23 + "))");
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Unary Iteration.
   * 
   * @param operation the OCL Unary Iteration to be transformed.
   * @param context the expression context.
   */
  protected String _generateArrowOperation(final UnaryIteration operation, final String context) {
    String variable = "x";
    String _variable = operation.getVariable();
    boolean _tripleNotEquals = (_variable != null);
    if (_tripleNotEquals) {
      variable = operation.getVariable();
    }
    UnaryIterator _iterator = operation.getIterator();
    if (_iterator != null) {
      switch (_iterator) {
        case SELECT:
          CharSequence _generateOclExpression = this.generateOclExpression(operation.getBody());
          String _plus = ((((("({" + variable) + ": ") + context) + " | ") + _generateOclExpression);
          return (_plus + "})");
        case REJECT:
          CharSequence _generateOclExpression_1 = this.generateOclExpression(operation.getBody());
          String _plus_1 = ((((("({" + variable) + ": ") + context) + " | not ") + _generateOclExpression_1);
          return (_plus_1 + "})");
        case COLLECT:
          String _variable_1 = operation.getVariable();
          boolean _tripleEquals = (_variable_1 == null);
          if (_tripleEquals) {
            CharSequence _generateOclExpression_2 = this.generateOclExpression(operation.getBody());
            String _plus_2 = ((((("(univ.{" + variable) + ": ") + context) + ", res: x.") + _generateOclExpression_2);
            return (_plus_2 + " | TRUE})");
          } else {
            CharSequence _generateOclExpression_3 = this.generateOclExpression(operation.getBody());
            String _plus_3 = ((((("(univ.{" + variable) + ": ") + context) + ", res: ") + _generateOclExpression_3);
            return (_plus_3 + " | TRUE})");
          }
        case ANY:
          CharSequence _generateOclExpression_4 = this.generateOclExpression(operation.getBody());
          String _plus_4 = ((((("({" + variable) + ": ") + context) + " | ") + _generateOclExpression_4);
          return (_plus_4 + "})");
        case ONE:
          CharSequence _generateOclExpression_5 = this.generateOclExpression(operation.getBody());
          String _plus_5 = ((((("(# {" + variable) + ": ") + context) + " | ") + _generateOclExpression_5);
          return (_plus_5 + "} = 1)");
        case IS_UNIQUE:
          CharSequence _generateOclExpression_6 = this.generateOclExpression(operation.getBody());
          String _plus_6 = ((((((("(all disj " + variable) + ", ") + variable) + "\': ") + context) + " | ((") + _generateOclExpression_6);
          String result = (_plus_6 + ") iff (");
          this.substituteVariableName(operation.getBody(), variable, true);
          CharSequence _generateOclExpression_7 = this.generateOclExpression(operation.getBody());
          String _plus_7 = (result + _generateOclExpression_7);
          String _plus_8 = (_plus_7 + ")) implies (");
          String _plus_9 = (_plus_8 + variable);
          String _plus_10 = (_plus_9 + " = ");
          String _plus_11 = (_plus_10 + variable);
          String _plus_12 = (_plus_11 + "\'))");
          result = _plus_12;
          this.substituteVariableName(operation.getBody(), variable, false);
          return result;
        case CLOSURE:
          CharSequence _generateOclExpression_8 = this.generateOclExpression(operation.getBody());
          String _plus_13 = ((((("(" + context) + ".^{") + variable) + ": univ, res: ") + _generateOclExpression_8);
          return (_plus_13 + " | TRUE})");
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Multiary Iteration.
   * 
   * @param operation the OCL Multiary Iteration to be transformed.
   * @param context the expression context.
   */
  protected String _generateArrowOperation(final MultiaryIteration operation, final String context) {
    String variable = "x";
    EList<String> _variables = operation.getVariables();
    for (final String v : _variables) {
      String _head = IterableExtensions.<String>head(operation.getVariables());
      boolean _equals = Objects.equal(v, _head);
      if (_equals) {
        variable = v;
      } else {
        variable = ((variable + ", ") + v);
      }
    }
    MultiaryIterator _iterator = operation.getIterator();
    if (_iterator != null) {
      switch (_iterator) {
        case EXISTS:
          CharSequence _generateOclExpression = this.generateOclExpression(operation.getBody());
          String _plus = ((((("(some " + variable) + ": ") + context) + " | ") + _generateOclExpression);
          return (_plus + ")");
        case FOR_ALL:
          CharSequence _generateOclExpression_1 = this.generateOclExpression(operation.getBody());
          String _plus_1 = ((((("(all " + variable) + ": ") + context) + " | ") + _generateOclExpression_1);
          return (_plus_1 + ")");
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Arrow Type Operation.
   * 
   * @param operation the OCL Arrow Type Operation to be transformed.
   * @param context the expression context.
   */
  protected String _generateArrowOperation(final TypeOperation operation, final String context) {
    return this.generateTypeOperation(operation, context);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Type Operation.
   * 
   * @param operation the OCL Type Operation to be transformed.
   * @param context the expression context.
   */
  public String generateTypeOperation(final TypeOperation operation, final String context) {
    TypeOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case OCL_AS_TYPE:
          return context;
        case OCL_IS_KIND_OF:
          TypeLiteralExpression _referredType = operation.getReferredType();
          boolean _tripleNotEquals = (_referredType != null);
          if (_tripleNotEquals) {
            String _generateLiteralExpression = this.generateLiteralExpression(operation.getReferredType());
            String _plus = ((("(" + context) + " in ") + _generateLiteralExpression);
            return (_plus + ")");
          } else {
            return (("(" + context) + " in self)");
          }
        case OCL_IS_TYPE_OF:
          TypeLiteralExpression _referredType_1 = operation.getReferredType();
          boolean _tripleNotEquals_1 = (_referredType_1 != null);
          if (_tripleNotEquals_1) {
            String referredTypeName = this.generateLiteralExpression(operation.getReferredType());
            br.ufes.inf.nemo.ml2.model.Class referredType = null;
            if ((((referredTypeName.equals("Boolean") || referredTypeName.equals("Number")) || referredTypeName.equals("String")) || referredTypeName.substring(0, 4).equals("Set{"))) {
              return (((("(" + context) + " in ") + referredType) + ")");
            } else {
              EObject container = operation;
              while ((!(container instanceof Model))) {
                container = container.eContainer();
              }
              if ((container instanceof Model)) {
                referredType = this._mL2Util.getClass(referredTypeName, ((Model)container));
              }
            }
            BasicEList<br.ufes.inf.nemo.ml2.model.Class> subtypes = this._mL2Util.classSubtypes(referredType);
            int _size = subtypes.size();
            boolean _equals = (_size == 0);
            if (_equals) {
              return (((("(" + context) + " in ") + referredType) + ")");
            } else {
              String result = (((((("((" + context) + " in ") + referredType) + ") and (# ") + context) + " & (");
              for (final br.ufes.inf.nemo.ml2.model.Class s : subtypes) {
                br.ufes.inf.nemo.ml2.model.Class _last = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>last(subtypes);
                boolean _equals_1 = Objects.equal(s, _last);
                if (_equals_1) {
                  String _name = s.getName();
                  String _plus_1 = (result + _name);
                  result = _plus_1;
                } else {
                  String _name_1 = s.getName();
                  String _plus_2 = (result + _name_1);
                  String _plus_3 = (_plus_2 + " + ");
                  result = _plus_3;
                }
              }
              return (result + ") = 0))");
            }
          } else {
            br.ufes.inf.nemo.ml2.model.Class referredType_1 = this._oCLUtil.getClassContext(operation);
            BasicEList<br.ufes.inf.nemo.ml2.model.Class> subtypes_1 = this._mL2Util.classSubtypes(referredType_1);
            int _size_1 = subtypes_1.size();
            boolean _equals_2 = (_size_1 == 0);
            if (_equals_2) {
              return (("(" + context) + " in self)");
            } else {
              String result_1 = (((("((" + context) + " in self) and (# ") + context) + " & (");
              for (final br.ufes.inf.nemo.ml2.model.Class s_1 : subtypes_1) {
                br.ufes.inf.nemo.ml2.model.Class _last_1 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>last(subtypes_1);
                boolean _equals_3 = Objects.equal(s_1, _last_1);
                if (_equals_3) {
                  String _name_2 = s_1.getName();
                  String _plus_4 = (result_1 + _name_2);
                  result_1 = _plus_4;
                } else {
                  String _name_3 = s_1.getName();
                  String _plus_5 = (result_1 + _name_3);
                  String _plus_6 = (_plus_5 + " + ");
                  result_1 = _plus_6;
                }
              }
              return (result_1 + ") = 0))");
            }
          }
        default:
          break;
      }
    }
    return null;
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Primitive Literal Expression.
   * 
   * @param expression the OCL Primitive Literal Expression to be transformed.
   */
  protected String _generateLiteralExpression(final PrimitiveLiteralExpression expression) {
    return this.generatePrimitiveLiteralExpression(expression);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Set Literal Expression.
   * 
   * @param expression the OCL Set Literal Expression to be transformed.
   */
  protected String _generateLiteralExpression(final SetLiteralExpression expression) {
    int _size = expression.getParts().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return "none";
    } else {
      String result = "(";
      EList<PrimitiveLiteralExpression> _parts = expression.getParts();
      for (final PrimitiveLiteralExpression part : _parts) {
        PrimitiveLiteralExpression _head = IterableExtensions.<PrimitiveLiteralExpression>head(expression.getParts());
        boolean _equals_1 = Objects.equal(part, _head);
        if (_equals_1) {
          String _generatePrimitiveLiteralExpression = this.generatePrimitiveLiteralExpression(part);
          String _plus = (result + _generatePrimitiveLiteralExpression);
          result = _plus;
        } else {
          String _generatePrimitiveLiteralExpression_1 = this.generatePrimitiveLiteralExpression(part);
          String _plus_1 = ((result + " + ") + _generatePrimitiveLiteralExpression_1);
          result = _plus_1;
        }
      }
      return (result + ")");
    }
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Type Literal Expression.
   * 
   * @param expression the OCL Type Literal Expression to be transformed.
   */
  protected String _generateLiteralExpression(final TypeLiteralExpression expression) {
    return this.generateTypeLiteral(expression);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Primitive Type Literal.
   * 
   * @param expression the OCL Primitive Type Literal to be transformed.
   */
  protected String _generateTypeLiteral(final PrimitiveTypeLiteral expression) {
    String _typeName = expression.getTypeName();
    return ("" + _typeName);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Set Type Literal.
   * 
   * @param expression the OCL Set Type Literal to be transformed.
   */
  protected String _generateTypeLiteral(final SetTypeLiteral expression) {
    String _typeName = expression.getTypeName();
    return ("" + _typeName);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL User Defined Type Literal.
   * 
   * @param expression the OCL User Defined Type Literal to be transformed.
   */
  protected String _generateTypeLiteral(final UserDefinedTypeLiteral expression) {
    String _name = expression.getTypeName().getName();
    return ("" + _name);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Boolean Literal Expression.
   * 
   * @param expression the OCL Boolean Literal Expression to be transformed.
   */
  protected String _generatePrimitiveLiteralExpression(final BooleanLiteralExpression expression) {
    boolean _isBooleanSymbol = expression.isBooleanSymbol();
    if (_isBooleanSymbol) {
      return "TRUE";
    } else {
      return "FALSE";
    }
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Number Literal Expression.
   * 
   * @param expression the OCL Number Literal Expression to be transformed.
   */
  protected String _generatePrimitiveLiteralExpression(final NumberLiteralExpression expression) {
    int _intValue = Double.valueOf(expression.getNumberSymbol()).intValue();
    return ("" + Integer.valueOf(_intValue));
  }
  
  /**
   * Generates the Alloy counterpart of an OCL String Literal Expression.
   * 
   * @param expression the OCL String Literal Expression to be transformed.
   */
  protected String _generatePrimitiveLiteralExpression(final StringLiteralExpression expression) {
    String _stringSymbol = expression.getStringSymbol();
    return ("" + _stringSymbol);
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Null Literal Expression.
   * 
   * @param expression the OCL Null Literal Expression to be transformed.
   */
  protected String _generatePrimitiveLiteralExpression(final NullLiteralExpression expression) {
    return "none";
  }
  
  /**
   * Generates the Alloy counterpart of an OCL Variable Expression.
   * 
   * @param expression the OCL Variable Expression to be transformed.
   */
  public String generateVariableExpression(final VariableExpression expression) {
    String _referringVariable = expression.getReferringVariable();
    return ("" + _referringVariable);
  }
  
  /**
   * Substitutes all variable names declared in an OCL iterator used in its body expression,
   * by appending or removing an ' (apostrophe) from them.
   * 
   * @param expression the OCL iterator body expression.
   * @param variable the variable to be substituted.
   * @param b a boolean to indicate appendix (true) or removal (false).
   */
  public void substituteVariableName(final Object expression, final String variable, final boolean b) {
    if ((expression instanceof VariableExpression)) {
      boolean _equals = ((VariableExpression)expression).getReferringVariable().equals(variable);
      if (_equals) {
        if (b) {
          String _referringVariable = ((VariableExpression)expression).getReferringVariable();
          String _plus = (_referringVariable + "\'");
          ((VariableExpression)expression).setReferringVariable(_plus);
        } else {
          String _referringVariable_1 = ((VariableExpression)expression).getReferringVariable();
          int _length = ((VariableExpression)expression).getReferringVariable().length();
          int _minus = (_length - 1);
          ((VariableExpression)expression).setReferringVariable(_referringVariable_1.substring(0, _minus));
        }
      }
    } else {
      if ((expression instanceof LetExpression)) {
        this.substituteVariableName(((LetExpression)expression).getInExpression(), variable, b);
      } else {
        if ((expression instanceof IfExpression)) {
          this.substituteVariableName(((IfExpression)expression).getCondition(), variable, b);
          this.substituteVariableName(((IfExpression)expression).getThenExpression(), variable, b);
          this.substituteVariableName(((IfExpression)expression).getElseExpression(), variable, b);
        } else {
          if ((expression instanceof ImpliesExpression)) {
            this.substituteVariableName(((ImpliesExpression)expression).getLeft(), variable, b);
            EList<XorExpression> _right = ((ImpliesExpression)expression).getRight();
            for (final XorExpression right : _right) {
              this.substituteVariableName(right, variable, b);
            }
          } else {
            if ((expression instanceof XorExpression)) {
              this.substituteVariableName(((XorExpression)expression).getLeft(), variable, b);
              EList<OrExpression> _right_1 = ((XorExpression)expression).getRight();
              for (final OrExpression right_1 : _right_1) {
                this.substituteVariableName(right_1, variable, b);
              }
            } else {
              if ((expression instanceof OrExpression)) {
                this.substituteVariableName(((OrExpression)expression).getLeft(), variable, b);
                EList<AndExpression> _right_2 = ((OrExpression)expression).getRight();
                for (final AndExpression right_2 : _right_2) {
                  this.substituteVariableName(right_2, variable, b);
                }
              } else {
                if ((expression instanceof AndExpression)) {
                  this.substituteVariableName(((AndExpression)expression).getLeft(), variable, b);
                  EList<ComparisonExpression> _right_3 = ((AndExpression)expression).getRight();
                  for (final ComparisonExpression right_3 : _right_3) {
                    this.substituteVariableName(right_3, variable, b);
                  }
                } else {
                  if ((expression instanceof ComparisonExpression)) {
                    this.substituteVariableName(((ComparisonExpression)expression).getLeft(), variable, b);
                    EList<ComparisonOperation> _right_4 = ((ComparisonExpression)expression).getRight();
                    for (final ComparisonOperation right_4 : _right_4) {
                      this.substituteVariableName(right_4, variable, b);
                    }
                  } else {
                    if ((expression instanceof ComparisonOperation)) {
                      this.substituteVariableName(((ComparisonOperation)expression).getRight(), variable, b);
                    } else {
                      if ((expression instanceof RelationalExpression)) {
                        this.substituteVariableName(((RelationalExpression)expression).getLeft(), variable, b);
                        EList<RelationalOperation> _right_5 = ((RelationalExpression)expression).getRight();
                        for (final RelationalOperation right_5 : _right_5) {
                          this.substituteVariableName(right_5, variable, b);
                        }
                      } else {
                        if ((expression instanceof RelationalOperation)) {
                          this.substituteVariableName(((RelationalOperation)expression).getRight(), variable, b);
                        } else {
                          if ((expression instanceof AdditionExpression)) {
                            this.substituteVariableName(((AdditionExpression)expression).getLeft(), variable, b);
                            EList<AdditionOperation> _right_6 = ((AdditionExpression)expression).getRight();
                            for (final AdditionOperation right_6 : _right_6) {
                              this.substituteVariableName(right_6, variable, b);
                            }
                          } else {
                            if ((expression instanceof AdditionOperation)) {
                              this.substituteVariableName(((AdditionOperation)expression).getRight(), variable, b);
                            } else {
                              if ((expression instanceof MultiplicationExpression)) {
                                this.substituteVariableName(((MultiplicationExpression)expression).getLeft(), variable, b);
                                EList<MultiplicationOperation> _right_7 = ((MultiplicationExpression)expression).getRight();
                                for (final MultiplicationOperation right_7 : _right_7) {
                                  this.substituteVariableName(right_7, variable, b);
                                }
                              } else {
                                if ((expression instanceof MultiplicationOperation)) {
                                  this.substituteVariableName(((MultiplicationOperation)expression).getRight(), variable, b);
                                } else {
                                  if ((expression instanceof UnaryExpression)) {
                                    this.substituteVariableName(((UnaryExpression)expression).getRight(), variable, b);
                                  } else {
                                    if ((expression instanceof CallExpression)) {
                                      this.substituteVariableName(((CallExpression)expression).getLeft(), variable, b);
                                      EList<CallOperation> _right_8 = ((CallExpression)expression).getRight();
                                      for (final CallOperation right_8 : _right_8) {
                                        this.substituteVariableName(right_8, variable, b);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public CharSequence generateAlloyConstraint(final Constraint constraint) {
    if (constraint instanceof DerivationConstraint) {
      return _generateAlloyConstraint((DerivationConstraint)constraint);
    } else if (constraint instanceof InvariantConstraint) {
      return _generateAlloyConstraint((InvariantConstraint)constraint);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(constraint).toString());
    }
  }
  
  public CharSequence generateOclExpression(final OclExpression expression) {
    if (expression instanceof IfExpression) {
      return _generateOclExpression((IfExpression)expression);
    } else if (expression instanceof ImpliesExpression) {
      return _generateOclExpression((ImpliesExpression)expression);
    } else if (expression instanceof LetExpression) {
      return _generateOclExpression((LetExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public String generateTermExpression(final TermExpression expression) {
    if (expression instanceof CallExpression) {
      return _generateTermExpression((CallExpression)expression);
    } else if (expression instanceof LiteralExpression) {
      return _generateTermExpression((LiteralExpression)expression);
    } else if (expression instanceof OclExpression) {
      return _generateTermExpression((OclExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public String generateCallExpression(final CallOperation operation, final String context) {
    if (operation instanceof ArrowOperation) {
      return _generateCallExpression((ArrowOperation)operation, context);
    } else if (operation instanceof DotOperation) {
      return _generateCallExpression((DotOperation)operation, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation, context).toString());
    }
  }
  
  public String generateDotOperation(final DotOperation operation, final String context) {
    if (operation instanceof BinaryNumberOperation) {
      return _generateDotOperation((BinaryNumberOperation)operation, context);
    } else if (operation instanceof TypeOperation) {
      return _generateDotOperation((TypeOperation)operation, context);
    } else if (operation instanceof UnaryNumberOperation) {
      return _generateDotOperation((UnaryNumberOperation)operation, context);
    } else if (operation instanceof VariableExpression) {
      return _generateDotOperation((VariableExpression)operation, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation, context).toString());
    }
  }
  
  public String generateArrowOperation(final ArrowOperation operation, final String context) {
    if (operation instanceof BinarySetOperation) {
      return _generateArrowOperation((BinarySetOperation)operation, context);
    } else if (operation instanceof MultiaryIteration) {
      return _generateArrowOperation((MultiaryIteration)operation, context);
    } else if (operation instanceof TypeOperation) {
      return _generateArrowOperation((TypeOperation)operation, context);
    } else if (operation instanceof UnaryIteration) {
      return _generateArrowOperation((UnaryIteration)operation, context);
    } else if (operation instanceof UnarySetOperation) {
      return _generateArrowOperation((UnarySetOperation)operation, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation, context).toString());
    }
  }
  
  public String generateLiteralExpression(final LiteralExpression expression) {
    if (expression instanceof PrimitiveLiteralExpression) {
      return _generateLiteralExpression((PrimitiveLiteralExpression)expression);
    } else if (expression instanceof SetLiteralExpression) {
      return _generateLiteralExpression((SetLiteralExpression)expression);
    } else if (expression instanceof TypeLiteralExpression) {
      return _generateLiteralExpression((TypeLiteralExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public String generateTypeLiteral(final TypeLiteralExpression expression) {
    if (expression instanceof PrimitiveTypeLiteral) {
      return _generateTypeLiteral((PrimitiveTypeLiteral)expression);
    } else if (expression instanceof SetTypeLiteral) {
      return _generateTypeLiteral((SetTypeLiteral)expression);
    } else if (expression instanceof UserDefinedTypeLiteral) {
      return _generateTypeLiteral((UserDefinedTypeLiteral)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public String generatePrimitiveLiteralExpression(final PrimitiveLiteralExpression expression) {
    if (expression instanceof BooleanLiteralExpression) {
      return _generatePrimitiveLiteralExpression((BooleanLiteralExpression)expression);
    } else if (expression instanceof NullLiteralExpression) {
      return _generatePrimitiveLiteralExpression((NullLiteralExpression)expression);
    } else if (expression instanceof NumberLiteralExpression) {
      return _generatePrimitiveLiteralExpression((NumberLiteralExpression)expression);
    } else if (expression instanceof StringLiteralExpression) {
      return _generatePrimitiveLiteralExpression((StringLiteralExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
