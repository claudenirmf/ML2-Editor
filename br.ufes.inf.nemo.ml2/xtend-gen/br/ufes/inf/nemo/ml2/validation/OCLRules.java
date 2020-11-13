package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.model.AdditionExpression;
import br.ufes.inf.nemo.ml2.model.AdditionOperation;
import br.ufes.inf.nemo.ml2.model.AdditionOperator;
import br.ufes.inf.nemo.ml2.model.AndExpression;
import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.ComparisonExpression;
import br.ufes.inf.nemo.ml2.model.Constraint;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.DerivationConstraint;
import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.IfExpression;
import br.ufes.inf.nemo.ml2.model.ImpliesExpression;
import br.ufes.inf.nemo.ml2.model.InvariantConstraint;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.MultiplicationExpression;
import br.ufes.inf.nemo.ml2.model.MultiplicationOperation;
import br.ufes.inf.nemo.ml2.model.OrExpression;
import br.ufes.inf.nemo.ml2.model.PrimitiveType;
import br.ufes.inf.nemo.ml2.model.Reference;
import br.ufes.inf.nemo.ml2.model.RelationalExpression;
import br.ufes.inf.nemo.ml2.model.RelationalOperation;
import br.ufes.inf.nemo.ml2.model.TermExpression;
import br.ufes.inf.nemo.ml2.model.UnaryExpression;
import br.ufes.inf.nemo.ml2.model.UnaryOperator;
import br.ufes.inf.nemo.ml2.model.XorExpression;
import br.ufes.inf.nemo.ml2.util.OCLUtil;
import br.ufes.inf.nemo.ml2.validation.ValidationError;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class OCLRules {
  @Inject
  @Extension
  private OCLUtil _oCLUtil;
  
  public static final String INVALID_FEATURE_CONTEXT = "br.ufes.inf.nemo.meta.InvalidFeatureContext";
  
  public static final String INVALID_CONTEXT_TYPE = "br.ufes.inf.nemo.meta.InvalidContextType";
  
  public static final String INVALID_RETURN_TYPE = "br.ufes.inf.nemo.meta.InvalidReturnType";
  
  public static final String INVALID_IF_CONDITION = "br.ufes.inf.nemo.meta.InvalidIfCondition";
  
  public static final String INVALID_IMPLIES_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidImpliesExpression";
  
  public static final String INVALID_XOR_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidXorExpression";
  
  public static final String INVALID_OR_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidOrExpression";
  
  public static final String INVALID_AND_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidAndExpression";
  
  public static final String INVALID_RELATIONAL_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidRelationalExpression";
  
  public static final String INVALID_ADDITION_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidAdditionExpression";
  
  public static final String INVALID_MULTIPLICATION_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidMultiplicationExpression";
  
  public static final String INVALID_UNARY_EXPRESSION = "br.ufes.inf.nemo.meta.InvalidUnaryExpression";
  
  /**
   * Checks if the given feature context is a feature from the class context in an OCL Derivation Constraint.
   * 
   * @param constraint the OCL Derivation Constraint to be considered.
   */
  public ValidationError hasValidFeatureContext(final DerivationConstraint constraint) {
    Feature feature = this._oCLUtil.getMatchingFeature(constraint.getClassContext(), constraint.getFeatureContext());
    if ((feature == null)) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = constraint.getClassContext().getName();
      _builder.append(_name);
      _builder.append("::");
      {
        EList<String> _featureContext = constraint.getFeatureContext();
        boolean _hasElements = false;
        for(final String f : _featureContext) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate("::", "");
          }
          _builder.append(f);
        }
      }
      _builder.append(" cannot be resolved to a feature.");
      EAttribute _derivationConstraint_FeatureContext = ModelPackage.eINSTANCE.getDerivationConstraint_FeatureContext();
      return new ValidationError(_builder.toString(), _derivationConstraint_FeatureContext, (-1), 
        OCLRules.INVALID_FEATURE_CONTEXT, null, constraint);
    } else {
      return null;
    }
  }
  
  /**
   * Checks if the given context type is the same as the class feature's type in an OCL Derivation Constraint.
   * 
   * @param constraint the OCL Derivation Constraint to be considered.
   */
  public ValidationError hasValidContextType(final DerivationConstraint constraint) {
    Feature feature = this._oCLUtil.getMatchingFeature(constraint.getClassContext(), constraint.getFeatureContext());
    String featureName = "";
    String expectedType = "";
    if ((feature != null)) {
      if ((feature instanceof Attribute)) {
        featureName = ((Attribute)feature).getName();
        DataType __type = ((Attribute)feature).get_type();
        boolean _tripleNotEquals = (__type != null);
        if (_tripleNotEquals) {
          expectedType = ((Attribute)feature).get_type().getName();
        } else {
          PrimitiveType _primitiveType = ((Attribute)feature).getPrimitiveType();
          if (_primitiveType != null) {
            switch (_primitiveType) {
              case BOOLEAN:
                expectedType = "Boolean";
                break;
              case NUMBER:
                expectedType = "Number";
                break;
              case STRING:
                expectedType = "String";
                break;
              default:
                break;
            }
          }
        }
      } else {
        if ((feature instanceof Reference)) {
          featureName = ((Reference)feature).getName();
          int _upperBound = ((Reference)feature).getUpperBound();
          boolean _equals = (_upperBound == 1);
          if (_equals) {
            expectedType = ((Reference)feature).get_type().getName();
          } else {
            String _name = ((Reference)feature).get_type().getName();
            String _plus = ("Set(" + _name);
            String _plus_1 = (_plus + ")");
            expectedType = _plus_1;
          }
        }
      }
      boolean _equals_1 = expectedType.equals(this._oCLUtil.getContextType(constraint));
      if (_equals_1) {
        return null;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Type mismatch: feature \"");
        _builder.append(featureName);
        _builder.append("\" is of type ");
        _builder.append(expectedType);
        _builder.append(".");
        EReference _derivationConstraint_ContextType = ModelPackage.eINSTANCE.getDerivationConstraint_ContextType();
        return new ValidationError(_builder.toString(), _derivationConstraint_ContextType, (-1), 
          OCLRules.INVALID_CONTEXT_TYPE, null, constraint);
      }
    }
    return null;
  }
  
  /**
   * Checks if the given OCL Expression is of the same type as Boolean in an OCL Invariant Constraint.
   * 
   * @param constraint the OCL Invariant Constraint to be considered.
   */
  protected ValidationError _hasValidReturnType(final InvariantConstraint constraint) {
    String returnType = this._oCLUtil.getReturnType(constraint.getExpression());
    boolean _equals = returnType.equals("Boolean");
    if (_equals) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Type mismatch: return type of expression is ");
      _builder.append(returnType);
      _builder.append(". Type expected: Boolean.");
      EReference _constraint_Expression = ModelPackage.eINSTANCE.getConstraint_Expression();
      return new ValidationError(_builder.toString(), _constraint_Expression, (-1), 
        OCLRules.INVALID_RETURN_TYPE, null, constraint);
    }
  }
  
  /**
   * Checks if the given OCL Expression is of the same type as the context type in an OCL Derivation Constraint.
   * 
   * @param constraint the OCL Derivation Constraint to be considered.
   */
  protected ValidationError _hasValidReturnType(final DerivationConstraint constraint) {
    String contextType = this._oCLUtil.getContextType(constraint);
    String returnType = this._oCLUtil.getReturnType(constraint.getExpression());
    boolean _equals = returnType.equals(contextType);
    if (_equals) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Type mismatch: return type of expression is ");
      _builder.append(returnType);
      _builder.append(". Type expected: ");
      _builder.append(contextType);
      _builder.append(".");
      EReference _constraint_Expression = ModelPackage.eINSTANCE.getConstraint_Expression();
      return new ValidationError(_builder.toString(), _constraint_Expression, (-1), 
        OCLRules.INVALID_RETURN_TYPE, null, constraint);
    }
  }
  
  /**
   * Checks if the given condition of an OCL If Expression is of type Boolean.
   * 
   * @param expression the OCL If Expression to be considered.
   */
  public ValidationError hasValidIfCondition(final IfExpression expression) {
    String returnType = this._oCLUtil.getReturnType(expression.getCondition());
    boolean _equals = returnType.equals("Boolean");
    boolean _not = (!_equals);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Type mismatch: if condition is of type ");
      _builder.append(returnType);
      _builder.append(". Type expected: Boolean.");
      EReference _ifExpression_Condition = ModelPackage.eINSTANCE.getIfExpression_Condition();
      return new ValidationError(_builder.toString(), _ifExpression_Condition, (-1), 
        OCLRules.INVALID_IF_CONDITION, null, expression);
    } else {
      return null;
    }
  }
  
  /**
   * Checks if the given members of an OCL Implies Expression are of type Boolean.
   * 
   * @param expression the OCL Implies Expression to be considered.
   */
  public ValidationError hasValidImpliesExpression(final ImpliesExpression expression) {
    int _size = expression.getRight().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int index = 0;
      String returnType = this._oCLUtil.getReturnType(expression.getLeft());
      boolean _equals = returnType.equals("Boolean");
      boolean _not = (!_equals);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Type mismatch: expression is of type ");
        _builder.append(returnType);
        _builder.append(". Type expected: Boolean.");
        EReference _impliesExpression_Left = ModelPackage.eINSTANCE.getImpliesExpression_Left();
        return new ValidationError(_builder.toString(), _impliesExpression_Left, (-1), 
          OCLRules.INVALID_IMPLIES_EXPRESSION, null, expression);
      }
      EList<XorExpression> _right = expression.getRight();
      for (final XorExpression operation : _right) {
        {
          returnType = this._oCLUtil.getReturnType(operation);
          boolean _equals_1 = returnType.equals("Boolean");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Type mismatch: expression is of type ");
            _builder_1.append(returnType);
            _builder_1.append(". Type expected: Boolean.");
            EReference _impliesExpression_Right = ModelPackage.eINSTANCE.getImpliesExpression_Right();
            return new ValidationError(_builder_1.toString(), _impliesExpression_Right, index, 
              OCLRules.INVALID_IMPLIES_EXPRESSION, null, expression);
          }
          int _index = index;
          index = (_index + 1);
        }
      }
    }
    return null;
  }
  
  /**
   * Checks if the given members of an OCL Xor Expression are of type Boolean.
   * 
   * @param expression the OCL Xor Expression to be considered.
   */
  public ValidationError hasValidXorExpression(final XorExpression expression) {
    int _size = expression.getRight().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int index = 0;
      String returnType = this._oCLUtil.getReturnType(expression.getLeft());
      boolean _equals = returnType.equals("Boolean");
      boolean _not = (!_equals);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Type mismatch: expression is of type ");
        _builder.append(returnType);
        _builder.append(". Type expected: Boolean.");
        EReference _xorExpression_Left = ModelPackage.eINSTANCE.getXorExpression_Left();
        return new ValidationError(_builder.toString(), _xorExpression_Left, (-1), 
          OCLRules.INVALID_XOR_EXPRESSION, null, expression);
      }
      EList<OrExpression> _right = expression.getRight();
      for (final OrExpression operation : _right) {
        {
          returnType = this._oCLUtil.getReturnType(operation);
          boolean _equals_1 = returnType.equals("Boolean");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Type mismatch: expression is of type ");
            _builder_1.append(returnType);
            _builder_1.append(". Type expected: Boolean.");
            EReference _xorExpression_Right = ModelPackage.eINSTANCE.getXorExpression_Right();
            return new ValidationError(_builder_1.toString(), _xorExpression_Right, index, 
              OCLRules.INVALID_XOR_EXPRESSION, null, expression);
          }
          int _index = index;
          index = (_index + 1);
        }
      }
    }
    return null;
  }
  
  /**
   * Checks if the given members of an OCL Or Expression are of type Boolean.
   * 
   * @param expression the OCL Or Expression to be considered.
   */
  public ValidationError hasValidOrExpression(final OrExpression expression) {
    int _size = expression.getRight().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int index = 0;
      String returnType = this._oCLUtil.getReturnType(expression.getLeft());
      boolean _equals = returnType.equals("Boolean");
      boolean _not = (!_equals);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Type mismatch: expression is of type ");
        _builder.append(returnType);
        _builder.append(". Type expected: Boolean.");
        EReference _orExpression_Left = ModelPackage.eINSTANCE.getOrExpression_Left();
        return new ValidationError(_builder.toString(), _orExpression_Left, (-1), 
          OCLRules.INVALID_OR_EXPRESSION, null, expression);
      }
      EList<AndExpression> _right = expression.getRight();
      for (final AndExpression operation : _right) {
        {
          returnType = this._oCLUtil.getReturnType(operation);
          boolean _equals_1 = returnType.equals("Boolean");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Type mismatch: expression is of type ");
            _builder_1.append(returnType);
            _builder_1.append(". Type expected: Boolean.");
            EReference _orExpression_Right = ModelPackage.eINSTANCE.getOrExpression_Right();
            return new ValidationError(_builder_1.toString(), _orExpression_Right, index, 
              OCLRules.INVALID_OR_EXPRESSION, null, expression);
          }
          int _index = index;
          index = (_index + 1);
        }
      }
    }
    return null;
  }
  
  /**
   * Checks if the given members of an OCL And Expression are of type Boolean.
   * 
   * @param expression the OCL And Expression to be considered.
   */
  public ValidationError hasValidAndExpression(final AndExpression expression) {
    int _size = expression.getRight().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int index = 0;
      String returnType = this._oCLUtil.getReturnType(expression.getLeft());
      boolean _equals = returnType.equals("Boolean");
      boolean _not = (!_equals);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Type mismatch: expression is of type ");
        _builder.append(returnType);
        _builder.append(". Type expected: Boolean.");
        EReference _andExpression_Left = ModelPackage.eINSTANCE.getAndExpression_Left();
        return new ValidationError(_builder.toString(), _andExpression_Left, (-1), 
          OCLRules.INVALID_AND_EXPRESSION, null, expression);
      }
      EList<ComparisonExpression> _right = expression.getRight();
      for (final ComparisonExpression operation : _right) {
        {
          returnType = this._oCLUtil.getReturnType(operation);
          boolean _equals_1 = returnType.equals("Boolean");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Type mismatch: expression is of type ");
            _builder_1.append(returnType);
            _builder_1.append(". Type expected: Boolean.");
            EReference _andExpression_Right = ModelPackage.eINSTANCE.getAndExpression_Right();
            return new ValidationError(_builder_1.toString(), _andExpression_Right, index, 
              OCLRules.INVALID_AND_EXPRESSION, null, expression);
          }
          int _index = index;
          index = (_index + 1);
        }
      }
    }
    return null;
  }
  
  /**
   * Checks if the given members of an OCL Relational Expression are of type Number.
   * 
   * @param expression the OCL Relational Expression to be considered.
   */
  public ValidationError hasValidRelationalExpression(final RelationalExpression expression) {
    int _size = expression.getRight().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int index = 0;
      String returnType = this._oCLUtil.getReturnType(expression.getLeft());
      boolean _equals = returnType.equals("Number");
      boolean _not = (!_equals);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Type mismatch: expression is of type ");
        _builder.append(returnType);
        _builder.append(". Type expected: Number.");
        EReference _relationalExpression_Left = ModelPackage.eINSTANCE.getRelationalExpression_Left();
        return new ValidationError(_builder.toString(), _relationalExpression_Left, (-1), 
          OCLRules.INVALID_RELATIONAL_EXPRESSION, null, expression);
      }
      EList<RelationalOperation> _right = expression.getRight();
      for (final RelationalOperation operation : _right) {
        {
          returnType = this._oCLUtil.getReturnType(operation.getRight());
          boolean _equals_1 = returnType.equals("Number");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Type mismatch: expression is of type ");
            _builder_1.append(returnType);
            _builder_1.append(". Type expected: Number.");
            EReference _relationalOperation_Right = ModelPackage.eINSTANCE.getRelationalOperation_Right();
            return new ValidationError(_builder_1.toString(), _relationalOperation_Right, index, 
              OCLRules.INVALID_RELATIONAL_EXPRESSION, null, operation);
          }
          int _index = index;
          index = (_index + 1);
        }
      }
    }
    return null;
  }
  
  /**
   * Checks if the given members of an OCL Addition Expression are of type Number or Set (in set difference case).
   * 
   * @param expression the OCL Addition Expression to be considered.
   */
  public ValidationError hasValidAdditionExpression(final AdditionExpression expression) {
    int _size = expression.getRight().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int index = 0;
      String returnType = this._oCLUtil.getReturnType(expression.getLeft());
      boolean hasValidType = false;
      boolean setDifferenceCase = false;
      String setName = "";
      boolean _equals = returnType.equals("Number");
      if (_equals) {
        hasValidType = true;
        setDifferenceCase = false;
      } else {
        boolean _equals_1 = returnType.substring(0, 3).equals("Set");
        if (_equals_1) {
          hasValidType = true;
          setDifferenceCase = true;
          setName = returnType;
        } else {
          hasValidType = false;
        }
      }
      EList<AdditionOperation> _right = expression.getRight();
      for (final AdditionOperation operation : _right) {
        {
          AdditionOperator _operator = operation.getOperator();
          boolean _equals_2 = Objects.equal(_operator, AdditionOperator.PLUS);
          if (_equals_2) {
            if ((hasValidType && (!setDifferenceCase))) {
              returnType = this._oCLUtil.getReturnType(operation.getRight());
              boolean _equals_3 = returnType.equals("Number");
              boolean _not = (!_equals_3);
              if (_not) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("Type mismatch: expression is of type ");
                _builder.append(returnType);
                _builder.append(". Type expected: Number.");
                EReference _additionOperation_Right = ModelPackage.eINSTANCE.getAdditionOperation_Right();
                return new ValidationError(_builder.toString(), _additionOperation_Right, index, 
                  OCLRules.INVALID_ADDITION_EXPRESSION, null, operation);
              }
            } else {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("Type mismatch: expression is of type ");
              _builder_1.append(returnType);
              _builder_1.append(". Type expected: Number.");
              EReference _additionExpression_Left = ModelPackage.eINSTANCE.getAdditionExpression_Left();
              return new ValidationError(_builder_1.toString(), _additionExpression_Left, (-1), 
                OCLRules.INVALID_ADDITION_EXPRESSION, null, expression);
            }
          } else {
            AdditionOperator _operator_1 = operation.getOperator();
            boolean _equals_4 = Objects.equal(_operator_1, AdditionOperator.MINUS);
            if (_equals_4) {
              if (hasValidType) {
                returnType = this._oCLUtil.getReturnType(operation.getRight());
                if (setDifferenceCase) {
                  boolean _equals_5 = returnType.equals(setName);
                  boolean _not_1 = (!_equals_5);
                  if (_not_1) {
                    StringConcatenation _builder_2 = new StringConcatenation();
                    _builder_2.append("Type mismatch: expression is of type ");
                    _builder_2.append(returnType);
                    _builder_2.append(". Type expected: ");
                    _builder_2.append(setName);
                    _builder_2.append(".");
                    EReference _additionOperation_Right_1 = ModelPackage.eINSTANCE.getAdditionOperation_Right();
                    return new ValidationError(_builder_2.toString(), _additionOperation_Right_1, index, 
                      OCLRules.INVALID_ADDITION_EXPRESSION, null, operation);
                  }
                } else {
                  boolean _equals_6 = returnType.equals("Number");
                  boolean _not_2 = (!_equals_6);
                  if (_not_2) {
                    StringConcatenation _builder_3 = new StringConcatenation();
                    _builder_3.append("Type mismatch: expression is of type ");
                    _builder_3.append(returnType);
                    _builder_3.append(". Type expected: Number.");
                    EReference _additionOperation_Right_2 = ModelPackage.eINSTANCE.getAdditionOperation_Right();
                    return new ValidationError(_builder_3.toString(), _additionOperation_Right_2, index, 
                      OCLRules.INVALID_ADDITION_EXPRESSION, null, operation);
                  }
                }
              } else {
                StringConcatenation _builder_4 = new StringConcatenation();
                _builder_4.append("Type mismatch: expression is of type ");
                _builder_4.append(returnType);
                _builder_4.append(". Type expected: Number or Set().");
                EReference _additionExpression_Left_1 = ModelPackage.eINSTANCE.getAdditionExpression_Left();
                return new ValidationError(_builder_4.toString(), _additionExpression_Left_1, (-1), 
                  OCLRules.INVALID_ADDITION_EXPRESSION, null, expression);
              }
            }
          }
          int _index = index;
          index = (_index + 1);
        }
      }
    }
    return null;
  }
  
  /**
   * Checks if the given members of an OCL Multiplication Expression are of type Number.
   * 
   * @param expression the OCL Multiplication Expression to be considered.
   */
  public ValidationError hasValidMultiplicationExpression(final MultiplicationExpression expression) {
    int _size = expression.getRight().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int index = 0;
      String returnType = this._oCLUtil.getReturnType(expression.getLeft());
      boolean _equals = returnType.equals("Number");
      boolean _not = (!_equals);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Type mismatch: expression is of type ");
        _builder.append(returnType);
        _builder.append(". Type expected: Number.");
        EReference _multiplicationExpression_Left = ModelPackage.eINSTANCE.getMultiplicationExpression_Left();
        return new ValidationError(_builder.toString(), _multiplicationExpression_Left, (-1), 
          OCLRules.INVALID_MULTIPLICATION_EXPRESSION, null, expression);
      }
      EList<MultiplicationOperation> _right = expression.getRight();
      for (final MultiplicationOperation operation : _right) {
        {
          returnType = this._oCLUtil.getReturnType(operation.getRight());
          boolean _equals_1 = returnType.equals("Number");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Type mismatch: expression is of type ");
            _builder_1.append(returnType);
            _builder_1.append(". Type expected: Number.");
            EReference _multiplicationOperation_Right = ModelPackage.eINSTANCE.getMultiplicationOperation_Right();
            return new ValidationError(_builder_1.toString(), _multiplicationOperation_Right, index, 
              OCLRules.INVALID_MULTIPLICATION_EXPRESSION, null, operation);
          }
          int _index = index;
          index = (_index + 1);
        }
      }
    }
    return null;
  }
  
  /**
   * Checks if the given member of an OCL Unary Expression is of type Boolean or Number.
   * 
   * @param expression the OCL Unary Expression to be considered.
   */
  public ValidationError hasValidUnaryExpression(final UnaryExpression expression) {
    TermExpression _right = expression.getRight();
    boolean _equals = Objects.equal(_right, Integer.valueOf(1));
    if (_equals) {
      String returnType = this._oCLUtil.getReturnType(expression.getRight());
      UnaryOperator _operator = expression.getOperator();
      boolean _equals_1 = Objects.equal(_operator, UnaryOperator.NOT);
      if (_equals_1) {
        boolean _equals_2 = returnType.equals("Boolean");
        boolean _not = (!_equals_2);
        if (_not) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Type mismatch: expression is of type ");
          _builder.append(returnType);
          _builder.append(". Type expected: Boolean.");
          EReference _unaryExpression_Right = ModelPackage.eINSTANCE.getUnaryExpression_Right();
          return new ValidationError(_builder.toString(), _unaryExpression_Right, (-1), 
            OCLRules.INVALID_UNARY_EXPRESSION, null, expression);
        }
      } else {
        UnaryOperator _operator_1 = expression.getOperator();
        boolean _equals_3 = Objects.equal(_operator_1, UnaryOperator.MINUS);
        if (_equals_3) {
          boolean _equals_4 = returnType.equals("Number");
          boolean _not_1 = (!_equals_4);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Type mismatch: expression is of type ");
            _builder_1.append(returnType);
            _builder_1.append(". Type expected: Number.");
            EReference _unaryExpression_Right_1 = ModelPackage.eINSTANCE.getUnaryExpression_Right();
            return new ValidationError(_builder_1.toString(), _unaryExpression_Right_1, (-1), 
              OCLRules.INVALID_UNARY_EXPRESSION, null, expression);
          }
        }
      }
    }
    return null;
  }
  
  public ValidationError hasValidReturnType(final Constraint constraint) {
    if (constraint instanceof DerivationConstraint) {
      return _hasValidReturnType((DerivationConstraint)constraint);
    } else if (constraint instanceof InvariantConstraint) {
      return _hasValidReturnType((InvariantConstraint)constraint);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(constraint).toString());
    }
  }
}
