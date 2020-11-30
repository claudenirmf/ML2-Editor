package br.ufes.inf.nemo.ml2.util;

import br.ufes.inf.nemo.ml2.model.AdditionExpression;
import br.ufes.inf.nemo.ml2.model.AdditionOperation;
import br.ufes.inf.nemo.ml2.model.AdditionOperator;
import br.ufes.inf.nemo.ml2.model.AndExpression;
import br.ufes.inf.nemo.ml2.model.ArrowOperation;
import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperation;
import br.ufes.inf.nemo.ml2.model.BinarySetOperation;
import br.ufes.inf.nemo.ml2.model.BinarySetOperator;
import br.ufes.inf.nemo.ml2.model.BooleanLiteralExpression;
import br.ufes.inf.nemo.ml2.model.CallExpression;
import br.ufes.inf.nemo.ml2.model.CallOperation;
import br.ufes.inf.nemo.ml2.model.ComparisonExpression;
import br.ufes.inf.nemo.ml2.model.Constraint;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.DerivationConstraint;
import br.ufes.inf.nemo.ml2.model.DotOperation;
import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.IfExpression;
import br.ufes.inf.nemo.ml2.model.ImpliesExpression;
import br.ufes.inf.nemo.ml2.model.LetExpression;
import br.ufes.inf.nemo.ml2.model.MultiaryIteration;
import br.ufes.inf.nemo.ml2.model.MultiplicationExpression;
import br.ufes.inf.nemo.ml2.model.NavigationSource;
import br.ufes.inf.nemo.ml2.model.NullLiteralExpression;
import br.ufes.inf.nemo.ml2.model.NumberLiteralExpression;
import br.ufes.inf.nemo.ml2.model.OrExpression;
import br.ufes.inf.nemo.ml2.model.PrimitiveLiteralExpression;
import br.ufes.inf.nemo.ml2.model.PrimitiveType;
import br.ufes.inf.nemo.ml2.model.PrimitiveTypeLiteral;
import br.ufes.inf.nemo.ml2.model.Reference;
import br.ufes.inf.nemo.ml2.model.RelationalExpression;
import br.ufes.inf.nemo.ml2.model.SetLiteralExpression;
import br.ufes.inf.nemo.ml2.model.SetTypeLiteral;
import br.ufes.inf.nemo.ml2.model.StringLiteralExpression;
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
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class OCLUtil {
  @Inject
  @Extension
  private ML2Util _mL2Util;
  
  /**
   * Returns all declared variables in the scope of the given OCL Expression.
   * 
   * @param expression the current OCL expression.
   */
  public BasicEList<VariableDeclaration> getDeclaredVariables(final EObject expression) {
    EObject container = expression.eContainer();
    BasicEList<VariableDeclaration> declaredVariables = new BasicEList<VariableDeclaration>();
    while ((!(container instanceof Constraint))) {
      {
        if ((container instanceof LetExpression)) {
          EList<VariableDeclaration> _variables = ((LetExpression)container).getVariables();
          for (final VariableDeclaration v : _variables) {
            declaredVariables.add(v);
          }
        }
        container = container.eContainer();
      }
    }
    return declaredVariables;
  }
  
  /**
   * Returns the class context in the scope of the given OCL Expression.
   * 
   * @param expression the current OCL expression.
   */
  public br.ufes.inf.nemo.ml2.model.Class getClassContext(final EObject expression) {
    EObject container = expression.eContainer();
    while ((!(container instanceof Constraint))) {
      container = container.eContainer();
    }
    if ((container instanceof Constraint)) {
      return ((Constraint)container).getClassContext();
    }
    return null;
  }
  
  /**
   * Returns the context type in the scope of the given OCL Expression.
   * 
   * @param expression the current OCL expression.
   */
  public String getContextType(final EObject expression) {
    EObject container = expression;
    while ((!(container instanceof Constraint))) {
      container = container.eContainer();
    }
    if ((container instanceof DerivationConstraint)) {
      TypeLiteralExpression contextType = ((DerivationConstraint)container).getContextType();
      if ((contextType instanceof PrimitiveTypeLiteral)) {
        return ((PrimitiveTypeLiteral)contextType).getTypeName();
      } else {
        if ((contextType instanceof SetTypeLiteral)) {
          TypeLiteralExpression setType = ((SetTypeLiteral)contextType).getSetType();
          if ((setType instanceof PrimitiveTypeLiteral)) {
            String _typeName = ((PrimitiveTypeLiteral)setType).getTypeName();
            String _plus = ("Set(" + _typeName);
            return (_plus + ")");
          } else {
            if ((setType instanceof UserDefinedTypeLiteral)) {
              String _name = ((UserDefinedTypeLiteral)setType).getTypeName().getName();
              String _plus_1 = ("Set(" + _name);
              return (_plus_1 + ")");
            }
          }
        } else {
          if ((contextType instanceof UserDefinedTypeLiteral)) {
            return ((UserDefinedTypeLiteral)contextType).getTypeName().getName();
          }
        }
      }
    } else {
      return "Boolean";
    }
    return null;
  }
  
  /**
   * Updates the context of a given OCL Variable Expression.
   * 
   * @param expression the given OCL Variable Expression.
   * @param context the current context of the variable.
   */
  public br.ufes.inf.nemo.ml2.model.Class updateClassContext(final VariableExpression expression, final br.ufes.inf.nemo.ml2.model.Class context) {
    EList<Feature> _features = context.getFeatures();
    for (final Feature feature : _features) {
      if ((feature instanceof Attribute)) {
        boolean _equals = ((Attribute)feature).getName().equals(expression.getReferringVariable());
        if (_equals) {
          DataType __type = ((Attribute)feature).get_type();
          boolean _tripleNotEquals = (__type != null);
          if (_tripleNotEquals) {
            return ((Attribute)feature).get_type();
          } else {
            return context;
          }
        }
      } else {
        if ((feature instanceof Reference)) {
          boolean _equals_1 = ((Reference)feature).getName().equals(expression.getReferringVariable());
          if (_equals_1) {
            return ((Reference)feature).get_type();
          }
        }
      }
    }
    Set<Feature> inheritedFeatures = this._mL2Util.getAllInheritedFeatures(context);
    for (final Feature feature_1 : inheritedFeatures) {
      if ((feature_1 instanceof Attribute)) {
        boolean _equals_2 = ((Attribute)feature_1).getName().equals(expression.getReferringVariable());
        if (_equals_2) {
          DataType __type_1 = ((Attribute)feature_1).get_type();
          boolean _tripleNotEquals_1 = (__type_1 != null);
          if (_tripleNotEquals_1) {
            return ((Attribute)feature_1).get_type();
          } else {
            return context;
          }
        }
      } else {
        if ((feature_1 instanceof Reference)) {
          boolean _equals_3 = ((Reference)feature_1).getName().equals(expression.getReferringVariable());
          if (_equals_3) {
            return ((Reference)feature_1).get_type();
          }
        }
      }
    }
    return null;
  }
  
  /**
   * Returns the type returned by a given OCL expression.
   * 
   * @param expression the given OCL expression.
   */
  public String getReturnType(final Object expression) {
    if ((expression instanceof LetExpression)) {
      return this.getReturnType(((LetExpression)expression).getInExpression());
    } else {
      if ((expression instanceof IfExpression)) {
        return this.getReturnType(((IfExpression)expression).getThenExpression());
      } else {
        if ((expression instanceof ImpliesExpression)) {
          int _size = ((ImpliesExpression)expression).getRight().size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            return "Boolean";
          } else {
            return this.getReturnType(((ImpliesExpression)expression).getLeft());
          }
        } else {
          if ((expression instanceof XorExpression)) {
            int _size_1 = ((XorExpression)expression).getRight().size();
            boolean _greaterThan_1 = (_size_1 > 0);
            if (_greaterThan_1) {
              return "Boolean";
            } else {
              return this.getReturnType(((XorExpression)expression).getLeft());
            }
          } else {
            if ((expression instanceof OrExpression)) {
              int _size_2 = ((OrExpression)expression).getRight().size();
              boolean _greaterThan_2 = (_size_2 > 0);
              if (_greaterThan_2) {
                return "Boolean";
              } else {
                return this.getReturnType(((OrExpression)expression).getLeft());
              }
            } else {
              if ((expression instanceof AndExpression)) {
                int _size_3 = ((AndExpression)expression).getRight().size();
                boolean _greaterThan_3 = (_size_3 > 0);
                if (_greaterThan_3) {
                  return "Boolean";
                } else {
                  return this.getReturnType(((AndExpression)expression).getLeft());
                }
              } else {
                if ((expression instanceof ComparisonExpression)) {
                  int _size_4 = ((ComparisonExpression)expression).getRight().size();
                  boolean _greaterThan_4 = (_size_4 > 0);
                  if (_greaterThan_4) {
                    return "Boolean";
                  } else {
                    return this.getReturnType(((ComparisonExpression)expression).getLeft());
                  }
                } else {
                  if ((expression instanceof RelationalExpression)) {
                    int _size_5 = ((RelationalExpression)expression).getRight().size();
                    boolean _greaterThan_5 = (_size_5 > 0);
                    if (_greaterThan_5) {
                      return "Boolean";
                    } else {
                      return this.getReturnType(((RelationalExpression)expression).getLeft());
                    }
                  } else {
                    if ((expression instanceof AdditionExpression)) {
                      int _size_6 = ((AdditionExpression)expression).getRight().size();
                      boolean _greaterThan_6 = (_size_6 > 0);
                      if (_greaterThan_6) {
                        AdditionOperator _operator = IterableExtensions.<AdditionOperation>head(((AdditionExpression)expression).getRight()).getOperator();
                        boolean _equals = Objects.equal(_operator, AdditionOperator.PLUS);
                        if (_equals) {
                          return "Number";
                        } else {
                          return this.getReturnType(((AdditionExpression)expression).getLeft());
                        }
                      } else {
                        return this.getReturnType(((AdditionExpression)expression).getLeft());
                      }
                    } else {
                      if ((expression instanceof MultiplicationExpression)) {
                        int _size_7 = ((MultiplicationExpression)expression).getRight().size();
                        boolean _greaterThan_7 = (_size_7 > 0);
                        if (_greaterThan_7) {
                          return "Number";
                        } else {
                          return this.getReturnType(((MultiplicationExpression)expression).getLeft());
                        }
                      } else {
                        if ((expression instanceof UnaryExpression)) {
                          UnaryOperator _operator_1 = ((UnaryExpression)expression).getOperator();
                          boolean _equals_1 = Objects.equal(_operator_1, UnaryOperator.NOT);
                          if (_equals_1) {
                            return "Boolean";
                          } else {
                            UnaryOperator _operator_2 = ((UnaryExpression)expression).getOperator();
                            boolean _equals_2 = Objects.equal(_operator_2, UnaryOperator.MINUS);
                            if (_equals_2) {
                              return "Number";
                            } else {
                              return this.getReturnType(((UnaryExpression)expression).getRight());
                            }
                          }
                        } else {
                          if ((expression instanceof CallExpression)) {
                            return this.getCallExpressionReturnType(((CallExpression)expression));
                          } else {
                            if ((expression instanceof NavigationSource)) {
                              return this.getReturnType(((NavigationSource)expression).getSource());
                            } else {
                              if ((expression instanceof BooleanLiteralExpression)) {
                                return "Boolean";
                              } else {
                                if ((expression instanceof NumberLiteralExpression)) {
                                  return "Number";
                                } else {
                                  if ((expression instanceof StringLiteralExpression)) {
                                    return "String";
                                  } else {
                                    if ((expression instanceof NullLiteralExpression)) {
                                      return "OclVoid";
                                    } else {
                                      if ((expression instanceof SetLiteralExpression)) {
                                        int _size_8 = ((SetLiteralExpression)expression).getParts().size();
                                        boolean _greaterThan_8 = (_size_8 > 0);
                                        if (_greaterThan_8) {
                                          String _returnType = this.getReturnType(IterableExtensions.<PrimitiveLiteralExpression>head(((SetLiteralExpression)expression).getParts()));
                                          String _plus = ("Set(" + _returnType);
                                          return (_plus + ")");
                                        } else {
                                          return "Set(OclVoid)";
                                        }
                                      } else {
                                        if ((expression instanceof TypeLiteralExpression)) {
                                          if ((expression instanceof PrimitiveTypeLiteral)) {
                                            String _typeName = ((PrimitiveTypeLiteral)expression).getTypeName();
                                            return (_typeName + "TypeName");
                                          } else {
                                            if ((expression instanceof SetTypeLiteral)) {
                                              TypeLiteralExpression setType = ((SetTypeLiteral)expression).getSetType();
                                              if ((setType instanceof PrimitiveTypeLiteral)) {
                                                String _typeName_1 = ((PrimitiveTypeLiteral)setType).getTypeName();
                                                String _plus_1 = ("SetTypeName(" + _typeName_1);
                                                return (_plus_1 + ")");
                                              } else {
                                                if ((setType instanceof UserDefinedTypeLiteral)) {
                                                  String _name = ((UserDefinedTypeLiteral)setType).getTypeName().getName();
                                                  String _plus_2 = ("SetTypeName(" + _name);
                                                  return (_plus_2 + ")");
                                                }
                                              }
                                            } else {
                                              if ((expression instanceof UserDefinedTypeLiteral)) {
                                                String _name_1 = ((UserDefinedTypeLiteral)expression).getTypeName().getName();
                                                return (_name_1 + "TypeName");
                                              }
                                            }
                                          }
                                        } else {
                                          if ((expression instanceof VariableExpression)) {
                                            boolean _equals_3 = ((VariableExpression)expression).getReferringVariable().equals("self");
                                            if (_equals_3) {
                                              String _contextType = this.getContextType(((EObject)expression));
                                              return ("" + _contextType);
                                            } else {
                                              return this.getVariableType(((VariableExpression)expression), this.getClassContext(((EObject)expression)));
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
      }
    }
    return null;
  }
  
  /**
   * Returns the type returned by a given OCL Call Expression.
   * 
   * @param expression the given OCL Call Expression.
   */
  public String getCallExpressionReturnType(final CallExpression expression) {
    int _size = expression.getRight().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return this.getReturnType(expression.getLeft());
    } else {
      br.ufes.inf.nemo.ml2.model.Class currentClassContext = this.getClassContext(expression);
      String currentReturnType = this.getReturnType(expression.getLeft());
      EObject source = expression.getLeft().getSource();
      if ((source instanceof VariableExpression)) {
        boolean _equals_1 = ((VariableExpression)source).getReferringVariable().equals("self");
        boolean _not = (!_equals_1);
        if (_not) {
          currentClassContext = this.updateClassContext(((VariableExpression)source), currentClassContext);
        }
      } else {
        if ((source instanceof TypeLiteralExpression)) {
          if ((source instanceof PrimitiveTypeLiteral)) {
            String _typeName = ((PrimitiveTypeLiteral)source).getTypeName();
            String _plus = ("Set(" + _typeName);
            String _plus_1 = (_plus + ")");
            currentReturnType = _plus_1;
          } else {
            if ((source instanceof SetTypeLiteral)) {
              TypeLiteralExpression setType = ((SetTypeLiteral)source).getSetType();
              if ((setType instanceof PrimitiveTypeLiteral)) {
                String _typeName_1 = ((PrimitiveTypeLiteral)setType).getTypeName();
                String _plus_2 = ("Set(" + _typeName_1);
                String _plus_3 = (_plus_2 + ")");
                currentReturnType = _plus_3;
              } else {
                if ((setType instanceof UserDefinedTypeLiteral)) {
                  String _name = ((UserDefinedTypeLiteral)setType).getTypeName().getName();
                  String _plus_4 = ("Set(" + _name);
                  String _plus_5 = (_plus_4 + ")");
                  currentReturnType = _plus_5;
                }
              }
            } else {
              if ((source instanceof UserDefinedTypeLiteral)) {
                String _name_1 = ((UserDefinedTypeLiteral)source).getTypeName().getName();
                String _plus_6 = ("Set(" + _name_1);
                String _plus_7 = (_plus_6 + ")");
                currentReturnType = _plus_7;
              }
            }
          }
        }
      }
      EList<CallOperation> _right = expression.getRight();
      for (final CallOperation operation : _right) {
        if ((operation instanceof DotOperation)) {
          if ((operation instanceof UnaryNumberOperation)) {
            UnaryNumberOperator _operator = ((UnaryNumberOperation)operation).getOperator();
            if (_operator != null) {
              switch (_operator) {
                case ABS:
                  currentReturnType = "Number";
                  break;
                case FLOOR:
                  currentReturnType = "Number";
                  break;
                case ROUND:
                  currentReturnType = "Number";
                  break;
                case OCL_IS_UNDEFINED:
                  currentReturnType = "Boolean";
                  break;
                default:
                  break;
              }
            }
          } else {
            if ((operation instanceof BinaryNumberOperation)) {
              currentReturnType = "Number";
            } else {
              if ((operation instanceof TypeOperation)) {
                TypeOperator _operator_1 = ((TypeOperation)operation).getOperator();
                if (_operator_1 != null) {
                  switch (_operator_1) {
                    case OCL_AS_TYPE:
                      boolean _equals_2 = ((TypeOperation)operation).getReferredType().equals("self");
                      if (_equals_2) {
                        currentReturnType = this.getClassContext(operation).getName();
                      } else {
                        TypeLiteralExpression _referredType = ((TypeOperation)operation).getReferredType();
                        String _plus_8 = ("" + _referredType);
                        currentReturnType = _plus_8;
                      }
                      break;
                    case OCL_IS_KIND_OF:
                      currentReturnType = "Boolean";
                      break;
                    case OCL_IS_TYPE_OF:
                      currentReturnType = "Boolean";
                      break;
                    default:
                      break;
                  }
                }
              } else {
                if ((operation instanceof VariableExpression)) {
                  currentReturnType = this.getVariableType(((VariableExpression)operation), currentClassContext);
                  currentClassContext = this.updateClassContext(((VariableExpression)operation), currentClassContext);
                }
              }
            }
          }
        } else {
          if ((operation instanceof ArrowOperation)) {
            if ((operation instanceof UnarySetOperation)) {
              UnarySetOperator _operator_2 = ((UnarySetOperation)operation).getOperator();
              if (_operator_2 != null) {
                switch (_operator_2) {
                  case SIZE:
                    currentReturnType = "Number";
                    break;
                  case IS_EMPTY:
                    currentReturnType = "Boolean";
                    break;
                  case NOT_EMPTY:
                    currentReturnType = "Boolean";
                    break;
                  case SUM:
                    currentReturnType = "Number";
                    break;
                  case MIN:
                    currentReturnType = "Number";
                    break;
                  case MAX:
                    currentReturnType = "Number";
                    break;
                  default:
                    break;
                }
              } else {
              }
            } else {
              if ((operation instanceof BinarySetOperation)) {
                BinarySetOperator _operator_3 = ((BinarySetOperation)operation).getOperator();
                if (_operator_3 != null) {
                  switch (_operator_3) {
                    case INCLUDES:
                      currentReturnType = "Boolean";
                      break;
                    case INCLUDES_ALL:
                      currentReturnType = "Boolean";
                      break;
                    case EXCLUDES:
                      currentReturnType = "Boolean";
                      break;
                    case EXCLUDES_ALL:
                      currentReturnType = "Boolean";
                      break;
                    case INCLUDING:
                      currentReturnType = this.getReturnType(((BinarySetOperation)operation).getArgument());
                      break;
                    case EXCLUDING:
                      currentReturnType = this.getReturnType(((BinarySetOperation)operation).getArgument());
                      break;
                    case COUNT:
                      currentReturnType = "Number";
                      break;
                    case UNION:
                      currentReturnType = this.getReturnType(((BinarySetOperation)operation).getArgument());
                      break;
                    case INTERSECTION:
                      currentReturnType = this.getReturnType(((BinarySetOperation)operation).getArgument());
                      break;
                    case SYMMETRIC_DIFFERENCE:
                      currentReturnType = this.getReturnType(((BinarySetOperation)operation).getArgument());
                      break;
                    default:
                      break;
                  }
                }
              } else {
                if ((operation instanceof UnaryIteration)) {
                  UnaryIterator _iterator = ((UnaryIteration)operation).getIterator();
                  if (_iterator != null) {
                    switch (_iterator) {
                      case ANY:
                        int _length = currentReturnType.length();
                        int _minus = (_length - 1);
                        currentReturnType = currentReturnType.substring(4, _minus);
                        break;
                      case ONE:
                        currentReturnType = "Boolean";
                        break;
                      case IS_UNIQUE:
                        currentReturnType = "Boolean";
                        break;
                      default:
                        break;
                    }
                  } else {
                  }
                } else {
                  if ((operation instanceof MultiaryIteration)) {
                    currentReturnType = "Boolean";
                  } else {
                    if ((operation instanceof TypeOperation)) {
                      TypeOperator _operator_4 = ((TypeOperation)operation).getOperator();
                      if (_operator_4 != null) {
                        switch (_operator_4) {
                          case OCL_AS_TYPE:
                            boolean _equals_3 = ((TypeOperation)operation).getReferredType().equals("self");
                            if (_equals_3) {
                              currentReturnType = this.getClassContext(operation).getName();
                            } else {
                              TypeLiteralExpression _referredType_1 = ((TypeOperation)operation).getReferredType();
                              String _plus_9 = ("" + _referredType_1);
                              currentReturnType = _plus_9;
                            }
                            break;
                          case OCL_IS_KIND_OF:
                            currentReturnType = "Boolean";
                            break;
                          case OCL_IS_TYPE_OF:
                            currentReturnType = "Boolean";
                            break;
                          default:
                            break;
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
      return currentReturnType;
    }
  }
  
  /**
   * Returns the type of a given OCL Variable Expression.
   * 
   * @param expression the given OCL Variable Expression.
   * @param context the current context of the variable.
   */
  public String getVariableType(final VariableExpression expression, final br.ufes.inf.nemo.ml2.model.Class context) {
    EList<Feature> _features = context.getFeatures();
    for (final Feature feature : _features) {
      if ((feature instanceof Attribute)) {
        boolean _equals = ((Attribute)feature).getName().equals(expression.getReferringVariable());
        if (_equals) {
          DataType __type = ((Attribute)feature).get_type();
          boolean _tripleNotEquals = (__type != null);
          if (_tripleNotEquals) {
            return ((Attribute)feature).get_type().getName();
          } else {
            PrimitiveType _primitiveType = ((Attribute)feature).getPrimitiveType();
            if (_primitiveType != null) {
              switch (_primitiveType) {
                case BOOLEAN:
                  return "Boolean";
                case NUMBER:
                  return "Number";
                case STRING:
                  return "String";
                default:
                  break;
              }
            }
          }
        }
      } else {
        if ((feature instanceof Reference)) {
          boolean _equals_1 = ((Reference)feature).getName().equals(expression.getReferringVariable());
          if (_equals_1) {
            int _upperBound = ((Reference)feature).getUpperBound();
            boolean _equals_2 = (_upperBound == 1);
            if (_equals_2) {
              return ((Reference)feature).get_type().getName();
            } else {
              String _name = ((Reference)feature).get_type().getName();
              String _plus = ("Set(" + _name);
              return (_plus + ")");
            }
          }
        }
      }
    }
    Set<Feature> inheritedFeatures = this._mL2Util.getAllInheritedFeatures(context);
    for (final Feature feature_1 : inheritedFeatures) {
      if ((feature_1 instanceof Attribute)) {
        boolean _equals_3 = ((Attribute)feature_1).getName().equals(expression.getReferringVariable());
        if (_equals_3) {
          DataType __type_1 = ((Attribute)feature_1).get_type();
          boolean _tripleNotEquals_1 = (__type_1 != null);
          if (_tripleNotEquals_1) {
            return ((Attribute)feature_1).get_type().getName();
          } else {
            PrimitiveType _primitiveType_1 = ((Attribute)feature_1).getPrimitiveType();
            if (_primitiveType_1 != null) {
              switch (_primitiveType_1) {
                case BOOLEAN:
                  return "Boolean";
                case NUMBER:
                  return "Number";
                case STRING:
                  return "String";
                default:
                  break;
              }
            }
          }
        }
      } else {
        if ((feature_1 instanceof Reference)) {
          boolean _equals_4 = ((Reference)feature_1).getName().equals(expression.getReferringVariable());
          if (_equals_4) {
            int _upperBound_1 = ((Reference)feature_1).getUpperBound();
            boolean _equals_5 = (_upperBound_1 == 1);
            if (_equals_5) {
              return ((Reference)feature_1).get_type().getName();
            } else {
              String _name_1 = ((Reference)feature_1).get_type().getName();
              String _plus_1 = ("Set(" + _name_1);
              return (_plus_1 + ")");
            }
          }
        }
      }
    }
    BasicEList<VariableDeclaration> _declaredVariables = this.getDeclaredVariables(expression);
    for (final VariableDeclaration v : _declaredVariables) {
      boolean _equals_6 = v.getVariableName().equals(expression.getReferringVariable());
      if (_equals_6) {
        TypeLiteralExpression vType = v.getVariableType();
        if ((vType instanceof PrimitiveTypeLiteral)) {
          return ((PrimitiveTypeLiteral)vType).getTypeName();
        } else {
          if ((vType instanceof SetTypeLiteral)) {
            TypeLiteralExpression vSetType = ((SetTypeLiteral)vType).getSetType();
            if ((vSetType instanceof PrimitiveTypeLiteral)) {
              String _typeName = ((PrimitiveTypeLiteral)vSetType).getTypeName();
              String _plus_2 = ("Set(" + _typeName);
              return (_plus_2 + ")");
            } else {
              if ((vSetType instanceof UserDefinedTypeLiteral)) {
                String _name_2 = ((UserDefinedTypeLiteral)vSetType).getTypeName().getName();
                String _plus_3 = ("Set(" + _name_2);
                return (_plus_3 + ")");
              }
            }
          } else {
            if ((vType instanceof UserDefinedTypeLiteral)) {
              return ((UserDefinedTypeLiteral)vType).getTypeName().getName();
            }
          }
        }
      }
    }
    return "OCLAny";
  }
  
  /**
   * Returns the feature matching a given class context and a feature context.
   * 
   * @param context the given class context.
   * @param featureContext the given feature context.
   */
  public Feature getMatchingFeature(final br.ufes.inf.nemo.ml2.model.Class context, final EList<String> featureContext) {
    BasicEList<String> featurePath = new BasicEList<String>(featureContext);
    EList<Feature> _features = context.getFeatures();
    for (final Feature feature : _features) {
      if ((feature instanceof Attribute)) {
        boolean _equals = ((Attribute)feature).getName().equals(IterableExtensions.<String>head(featurePath));
        if (_equals) {
          int _size = featurePath.size();
          boolean _equals_1 = (_size == 1);
          if (_equals_1) {
            return feature;
          } else {
            DataType __type = ((Attribute)feature).get_type();
            boolean _tripleNotEquals = (__type != null);
            if (_tripleNotEquals) {
              featurePath.remove(0);
              return this.getMatchingFeature(((Attribute)feature).get_type(), featurePath);
            } else {
              return null;
            }
          }
        }
      } else {
        if ((feature instanceof Reference)) {
          boolean _equals_2 = ((Reference)feature).getName().equals(IterableExtensions.<String>head(featurePath));
          if (_equals_2) {
            int _size_1 = featurePath.size();
            boolean _equals_3 = (_size_1 == 1);
            if (_equals_3) {
              return feature;
            } else {
              featurePath.remove(0);
              return this.getMatchingFeature(((Reference)feature).get_type(), featurePath);
            }
          }
        }
      }
    }
    Set<Feature> inheritedFeatures = this._mL2Util.getAllInheritedFeatures(context);
    for (final Feature feature_1 : inheritedFeatures) {
      if ((feature_1 instanceof Attribute)) {
        boolean _equals_4 = ((Attribute)feature_1).getName().equals(IterableExtensions.<String>head(featurePath));
        if (_equals_4) {
          int _size_2 = featurePath.size();
          boolean _equals_5 = (_size_2 == 1);
          if (_equals_5) {
            return feature_1;
          } else {
            DataType __type_1 = ((Attribute)feature_1).get_type();
            boolean _tripleNotEquals_1 = (__type_1 != null);
            if (_tripleNotEquals_1) {
              featurePath.remove(0);
              return this.getMatchingFeature(((Attribute)feature_1).get_type(), featurePath);
            } else {
              return null;
            }
          }
        }
      } else {
        if ((feature_1 instanceof Reference)) {
          boolean _equals_6 = ((Reference)feature_1).getName().equals(IterableExtensions.<String>head(featurePath));
          if (_equals_6) {
            int _size_3 = featurePath.size();
            boolean _equals_7 = (_size_3 == 1);
            if (_equals_7) {
              return feature_1;
            } else {
              featurePath.remove(0);
              return this.getMatchingFeature(((Reference)feature_1).get_type(), featurePath);
            }
          }
        }
      }
    }
    return null;
  }
  
  /**
   * Verifies if the given OCL expression is part of the main tree of expressions (not an iterator body, for example).
   * 
   * @param expression the given OCL Expression.
   */
  public boolean belongsToMainTree(final EObject expression) {
    EObject container = expression;
    while ((!(container instanceof Constraint))) {
      {
        if (((container instanceof BinarySetOperation) || (container instanceof MultiaryIteration))) {
          return false;
        }
        container = container.eContainer();
      }
    }
    return true;
  }
}
