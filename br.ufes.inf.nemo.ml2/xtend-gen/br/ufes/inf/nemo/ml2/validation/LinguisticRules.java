package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.AttributeAssignment;
import br.ufes.inf.nemo.ml2.model.CategorizationType;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.EntityDeclaration;
import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.FeatureAssignment;
import br.ufes.inf.nemo.ml2.model.FirstOrderClass;
import br.ufes.inf.nemo.ml2.model.GeneralizationSet;
import br.ufes.inf.nemo.ml2.model.HighOrderClass;
import br.ufes.inf.nemo.ml2.model.HigherOrderClass;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.Model;
import br.ufes.inf.nemo.ml2.model.ModelElement;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.OrderedClass;
import br.ufes.inf.nemo.ml2.model.OrderlessClass;
import br.ufes.inf.nemo.ml2.model.PrimitiveType;
import br.ufes.inf.nemo.ml2.model.Reference;
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.model.RegularityAttribute;
import br.ufes.inf.nemo.ml2.model.RegularityFeature;
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType;
import br.ufes.inf.nemo.ml2.model.RegularityReference;
import br.ufes.inf.nemo.ml2.util.ML2Index;
import br.ufes.inf.nemo.ml2.util.ML2Util;
import br.ufes.inf.nemo.ml2.validation.MLTRules;
import br.ufes.inf.nemo.ml2.validation.ValidationError;
import br.ufes.inf.nemo.ml2.validation.ValidationIssue;
import br.ufes.inf.nemo.ml2.validation.ValidationWarning;
import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class LinguisticRules {
  @Inject
  @Extension
  private ML2Util _mL2Util;
  
  @Inject
  @Extension
  private ML2Index _mL2Index;
  
  public static final String INVALID_ENTITY_DECLARATION_NAME = "br.ufes.inf.nemo.meta.InvalidEntityDeclarationName";
  
  public static final String INVALID_FEATURE_NAME = "br.ufes.inf.nemo.meta.InvalidFeatureName";
  
  public static final String INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.meta.InvalidClassSpecialization";
  
  public static final String CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.meta.CycliSpecialization";
  
  public static final String INVALID_CATEGORIZED_CLASS = "br.ufes.inf.nemo.meta.InvalidCategorizedClass";
  
  public static final String INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.meta.InvalidPowertypeRelation";
  
  public static final String INVALID_SUBORDINATOR = "br.ufes.inf.nemo.meta.InvalidSubordinator";
  
  public static final String DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.meta.DuplicatedEntityName";
  
  public static final String DUPLICATED_FEATURE_NAME = "br.ufes.inf.nemo.meta.DuplicatedFeatureName";
  
  public static final String INVALID_GENERALIZATION_SET_MEMBERS = "br.ufes.inf.nemo.meta.InvalidGeneralizationSetMembers";
  
  public static final String MISSING_SPECIALIZATION_THROUGH_SUBODINATION = "br.ufes.inf.nemo.meta.MissingSpecializationThroughSubordination";
  
  public static final String SIMPLE_SUBORDINATION_CYCLE = "br.ufes.inf.nemo.meta.SimpleSubordinationCycle";
  
  public static final String SPECILIZATION_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.meta.SpecializationOfDisjointClasses";
  
  public static final String INSTANCE_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.meta.InstanceOfDisjointClasses";
  
  public static final String MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET = "br.ufes.inf.nemo.meta.MissingInstantiationOfCompleteGeneralizationSet";
  
  public static final String INVALID_MULTIPLICITY = "br.ufes.inf.nemo.meta.InvalidMultiplicity";
  
  public static final String NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.meta.NonConformantAssigment";
  
  public static final String FIRST_ORDER_REGULARITY = "br.ufes.inf.nemo.meta.FirstOrderRegularity";
  
  public static final String MISSING_ASSIGNMENT_BY_REGULARITY = "br.ufes.inf.nemo.meta.MissingAssignmentByRegularity";
  
  public static final String UNWANTED_REFERENCES_ON_DATATYPES = "br.ufes.inf.nemo.meta.UnwantedReferencesOnDataTypes";
  
  public static final String RESTRICTED_REGULARITY_TYPE = "br.ufes.inf.nemo.meta.RestrictedRegularityType";
  
  public static final String NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT = "br.ufes.inf.nemo.meta.NonConformantRegulatedFeatureAssignment";
  
  public static final String INVALID_INSTANTIATION = "br.ufes.inf.nemo.meta.InvalidInstantiation";
  
  public static final String INVALID_GENERALIZATION_SET_CATEGORIZATION_COMBINATION = "br.ufes.inf.nemo.meta.InvalidGeneralizationSetCategorizationCombination";
  
  public ValidationError isNameValid(final EntityDeclaration e) {
    if (((!e.getName().equals(StringExtensions.toFirstLower(e.getName()))) || (e.eContainer() instanceof AttributeAssignment))) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Entity name must start with a capital letter.");
      EAttribute _entityDeclaration_Name = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
      return new ValidationError(_builder.toString(), _entityDeclaration_Name, (-1), 
        LinguisticRules.INVALID_ENTITY_DECLARATION_NAME, null, e);
    }
  }
  
  public ValidationIssue isValidInstantiation(final EntityDeclaration e) {
    br.ufes.inf.nemo.ml2.model.Class invalid = null;
    if ((e instanceof Individual)) {
      final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
        return Boolean.valueOf((it instanceof HigherOrderClass));
      };
      invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(((Individual)e).getClassifiers(), _function);
    } else {
      if ((e instanceof FirstOrderClass)) {
        final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function_1 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
          if ((it instanceof FirstOrderClass)) {
            return Boolean.valueOf(true);
          } else {
            if ((it instanceof HighOrderClass)) {
              int _order = ((HighOrderClass)it).getOrder();
              boolean _notEquals = (_order != MLTRules.MIN_ORDER);
              if (_notEquals) {
                return Boolean.valueOf(true);
              }
            }
          }
          return Boolean.valueOf(false);
        };
        invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(((FirstOrderClass)e).getClassifiers(), _function_1);
      } else {
        if ((e instanceof HighOrderClass)) {
          final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function_2 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
            if ((it instanceof FirstOrderClass)) {
              return Boolean.valueOf(true);
            } else {
              if ((it instanceof HighOrderClass)) {
                int _order = ((HighOrderClass)it).getOrder();
                int _order_1 = ((HighOrderClass)e).getOrder();
                int _plus = (_order_1 + 1);
                boolean _notEquals = (_order != _plus);
                if (_notEquals) {
                  return Boolean.valueOf(true);
                }
              }
            }
            return Boolean.valueOf(false);
          };
          invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(((HighOrderClass)e).getClassifiers(), _function_2);
        } else {
          if ((e instanceof OrderlessClass)) {
            final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function_3 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
              return Boolean.valueOf((!(it instanceof OrderlessClass)));
            };
            invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(((OrderlessClass)e).getClassifiers(), _function_3);
          }
        }
      }
    }
    boolean _equals = Objects.equal(invalid, null);
    if (_equals) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid instantiation of ");
      String _name = invalid.getName();
      _builder.append(_name);
      EReference _entityDeclaration_Classifiers = ModelPackage.eINSTANCE.getEntityDeclaration_Classifiers();
      int _indexOf = e.getClassifiers().indexOf(invalid);
      return new ValidationError(_builder.toString(), _entityDeclaration_Classifiers, _indexOf, 
        LinguisticRules.INVALID_INSTANTIATION, 
        null, e);
    }
  }
  
  public ValidationError isValidSpecialization(final br.ufes.inf.nemo.ml2.model.Class c) {
    br.ufes.inf.nemo.ml2.model.Class invalid = null;
    boolean _contains = c.getSuperClasses().contains(c);
    if (_contains) {
      invalid = c;
    } else {
      if ((c instanceof OrderlessClass)) {
        final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
          return Boolean.valueOf((it instanceof OrderedClass));
        };
        invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(((OrderlessClass)c).getSuperClasses(), _function);
      } else {
        if ((c instanceof FirstOrderClass)) {
          final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function_1 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
            return Boolean.valueOf((it instanceof HighOrderClass));
          };
          invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(((FirstOrderClass)c).getSuperClasses(), _function_1);
        } else {
          if ((c instanceof HighOrderClass)) {
            final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function_2 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
              boolean _xifexpression = false;
              if ((it instanceof FirstOrderClass)) {
                _xifexpression = true;
              } else {
                boolean _xifexpression_1 = false;
                if ((it instanceof HighOrderClass)) {
                  int _order = ((HighOrderClass)c).getOrder();
                  int _order_1 = ((HighOrderClass)it).getOrder();
                  _xifexpression_1 = (_order != _order_1);
                } else {
                  _xifexpression_1 = false;
                }
                _xifexpression = _xifexpression_1;
              }
              return Boolean.valueOf(_xifexpression);
            };
            invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(((HighOrderClass)c).getSuperClasses(), _function_2);
          }
        }
      }
    }
    boolean _equals = Objects.equal(invalid, null);
    if (_equals) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid specialization of ");
      String _name = invalid.getName();
      _builder.append(_name);
      _builder.append(".");
      EReference _class_SuperClasses = ModelPackage.eINSTANCE.getClass_SuperClasses();
      int _indexOf = c.getSuperClasses().indexOf(invalid);
      return new ValidationError(_builder.toString(), _class_SuperClasses, _indexOf, 
        LinguisticRules.INVALID_CLASS_SPECIALIZATION, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationError hasCyclicSpecialization(final br.ufes.inf.nemo.ml2.model.Class c, final Set<br.ufes.inf.nemo.ml2.model.Class> ch) {
    ValidationError _xifexpression = null;
    boolean _contains = ch.contains(c);
    if (_contains) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid cyclic specialization.");
      EReference _class_SuperClasses = ModelPackage.eINSTANCE.getClass_SuperClasses();
      _xifexpression = new ValidationError(_builder.toString(), _class_SuperClasses, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.CYCLIC_SPECIALIZATION, 
        ValidationIssue.NO_ISSUE_CODE, c);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public ValidationError hasValidCategorizedClass(final HigherOrderClass c) {
    final br.ufes.inf.nemo.ml2.model.Class cat = c.getCategorizedClass();
    String msg = "";
    if ((cat == null)) {
      return null;
    } else {
      if (((c instanceof OrderlessClass) && (cat instanceof OrderedClass))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid categorization of an ordered class.");
        msg = _builder.toString();
      } else {
        if ((c instanceof HighOrderClass)) {
          if (((cat instanceof OrderlessClass) && (((HighOrderClass)c).getCategorizationType() == CategorizationType.COMPLETE_CATEGORIZER))) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Invalid complete categorization of an orderless class.");
            msg = _builder_1.toString();
          } else {
            if (((cat instanceof OrderlessClass) && (((HighOrderClass)c).getCategorizationType() == CategorizationType.PARTITIONER))) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("Invalidation partitioning of an orderless class.");
              msg = _builder_2.toString();
            } else {
              if ((cat instanceof HighOrderClass)) {
                if (((((HighOrderClass)c).getOrder() == MLTRules.MIN_ORDER) || (((HighOrderClass)c).getOrder() != (((HighOrderClass)cat).getOrder() + 1)))) {
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("Invalid categorization of a class of order different than ");
                  int _order = ((HighOrderClass)c).getOrder();
                  int _minus = (_order - 1);
                  _builder_3.append(_minus);
                  _builder_3.append(".");
                  msg = _builder_3.toString();
                }
              }
            }
          }
        }
      }
    }
    boolean _equals = Objects.equal(msg, "");
    if (_equals) {
      return null;
    } else {
      EReference _higherOrderClass_CategorizedClass = ModelPackage.eINSTANCE.getHigherOrderClass_CategorizedClass();
      return new ValidationError(msg, _higherOrderClass_CategorizedClass, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.INVALID_CATEGORIZED_CLASS, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationError hasValidPowertypeRelation(final HigherOrderClass c) {
    final br.ufes.inf.nemo.ml2.model.Class base = c.getPowertypeOf();
    String msg = "";
    if ((base == null)) {
      return null;
    } else {
      if (((c instanceof OrderlessClass) && (base instanceof OrderedClass))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid powertype relation towards an ordered basetype.");
        msg = _builder.toString();
      } else {
        if ((c instanceof HighOrderClass)) {
          if ((base instanceof OrderlessClass)) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Invalid powertype relation towards an orderless basetype.");
            msg = _builder_1.toString();
          } else {
            if ((base instanceof HighOrderClass)) {
              if (((((HighOrderClass)c).getOrder() == MLTRules.MIN_ORDER) || (((HighOrderClass)c).getOrder() != (((HighOrderClass)base).getOrder() + 1)))) {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("Invalid powertype relation towards a class of order different than ");
                int _order = ((HighOrderClass)c).getOrder();
                int _minus = (_order - 1);
                _builder_2.append(_minus);
                _builder_2.append(".");
                msg = _builder_2.toString();
              }
            }
          }
        }
      }
    }
    boolean _equals = Objects.equal(msg, "");
    if (_equals) {
      return null;
    } else {
      EReference _higherOrderClass_PowertypeOf = ModelPackage.eINSTANCE.getHigherOrderClass_PowertypeOf();
      return new ValidationError(msg, _higherOrderClass_PowertypeOf, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.INVALID_POWERTYPE_RELATION, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationError hasValidSubordinators(final HigherOrderClass c) {
    br.ufes.inf.nemo.ml2.model.Class invalid = null;
    String msg = "";
    final ValidationError issue = new ValidationError();
    boolean _contains = c.getSubordinators().contains(c);
    if (_contains) {
      invalid = c;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid subordination to itself.");
      msg = _builder.toString();
    } else {
      final Function1<HigherOrderClass, Boolean> _function = (HigherOrderClass it) -> {
        boolean _xifexpression = false;
        if ((it instanceof FirstOrderClass)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Invalid subordination to a first-order class.");
          issue.setMessage(_builder_1.toString());
          return Boolean.valueOf(true);
        } else {
          boolean _xifexpression_1 = false;
          if (((c instanceof OrderlessClass) && (it instanceof OrderedClass))) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("Invalid subordination to an ordered class.");
            issue.setMessage(_builder_2.toString());
            return Boolean.valueOf(true);
          } else {
            boolean _xifexpression_2 = false;
            if ((((c instanceof HighOrderClass) && (it instanceof HighOrderClass)) && (((HighOrderClass) it).getOrder() != ((HighOrderClass) c).getOrder()))) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("Invalid subordination to an ordered class of different order.");
              issue.setMessage(_builder_3.toString());
              return Boolean.valueOf(true);
            } else {
              _xifexpression_2 = false;
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        return Boolean.valueOf(_xifexpression);
      };
      invalid = IterableExtensions.<HigherOrderClass>findFirst(c.getSubordinators(), _function);
    }
    if ((invalid == null)) {
      return null;
    } else {
      issue.setFeature(ModelPackage.eINSTANCE.getHigherOrderClass_Subordinators());
      issue.setIndex(c.getSubordinators().indexOf(invalid));
      issue.setCode(LinguisticRules.INVALID_SUBORDINATOR);
      issue.setSource(c);
      return issue;
    }
  }
  
  public ValidationError duplicatedEntityName(final EntityDeclaration e) {
    EObject _eContainer = e.eContainer();
    if ((_eContainer instanceof AttributeAssignment)) {
      return null;
    }
    EObject _eContainer_1 = e.eContainer();
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      return Boolean.valueOf(((it instanceof EntityDeclaration) && Objects.equal(((EntityDeclaration) it).getName(), e.getName())));
    };
    final Iterable<ModelElement> rep = IterableExtensions.<ModelElement>filter(((Model) _eContainer_1).getElements(), _function);
    int _size = IterableExtensions.size(rep);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Entity name must be unique.");
      EAttribute _entityDeclaration_Name = ModelPackage.eINSTANCE.getEntityDeclaration_Name();
      return new ValidationError(_builder.toString(), _entityDeclaration_Name, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.DUPLICATED_ENTITY_NAME, 
        ValidationIssue.NO_ISSUE_CODE, e);
    } else {
      return null;
    }
  }
  
  public ValidationError hasValidMembers(final GeneralizationSet gs) {
    br.ufes.inf.nemo.ml2.model.Class invalid = null;
    final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
      boolean _contains = it.getSuperClasses().contains(gs.getGeneral());
      return Boolean.valueOf((!_contains));
    };
    invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(gs.getSpecifics(), _function);
    if ((invalid != null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid member is not a direct specialization of the general class.");
      EReference _generalizationSet_Specifics = ModelPackage.eINSTANCE.getGeneralizationSet_Specifics();
      int _indexOf = gs.getSpecifics().indexOf(invalid);
      return new ValidationError(_builder.toString(), _generalizationSet_Specifics, _indexOf, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS, 
        ValidationIssue.NO_ISSUE_CODE, gs);
    }
    HigherOrderClass _categorizer = gs.getCategorizer();
    boolean _tripleNotEquals = (_categorizer != null);
    if (_tripleNotEquals) {
      final HigherOrderClass cat = gs.getCategorizer();
      br.ufes.inf.nemo.ml2.model.Class _categorizedClass = cat.getCategorizedClass();
      br.ufes.inf.nemo.ml2.model.Class _general = gs.getGeneral();
      boolean _notEquals = (!Objects.equal(_categorizedClass, _general));
      if (_notEquals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("The categorizer class must have a categorization relation towards the general class.");
        EReference _generalizationSet_Categorizer = ModelPackage.eINSTANCE.getGeneralizationSet_Categorizer();
        return new ValidationError(_builder_1.toString(), _generalizationSet_Categorizer, 
          ValidationIssue.NO_INDEX, 
          LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS, 
          ValidationIssue.NO_ISSUE_CODE, gs);
      }
      final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function_1 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
        boolean _contains = it.getClassifiers().contains(cat);
        return Boolean.valueOf((!_contains));
      };
      invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(gs.getSpecifics(), _function_1);
      if ((invalid != null)) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("The specific class must be direct instances of the categorizer class.");
        EReference _generalizationSet_Specifics_1 = ModelPackage.eINSTANCE.getGeneralizationSet_Specifics();
        int _indexOf_1 = gs.getSpecifics().indexOf(invalid);
        return new ValidationError(_builder_2.toString(), _generalizationSet_Specifics_1, _indexOf_1, 
          LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS, 
          ValidationIssue.NO_ISSUE_CODE, gs);
      }
      String msg = "";
      CategorizationType _categorizationType = cat.getCategorizationType();
      if (_categorizationType != null) {
        switch (_categorizationType) {
          case CATEGORIZER:
            boolean _isIsComplete = gs.isIsComplete();
            if (_isIsComplete) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("Simple categorization and complete generalization set is an invalid combination.");
              msg = _builder_3.toString();
            }
            break;
          case DISJOINT_CATEGORIZER:
            if (((!gs.isIsDisjoint()) || gs.isIsComplete())) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("Disjoint categorization and non disjoint and incomplete generalization set is an invalid combination.");
              msg = _builder_4.toString();
            }
            break;
          case PARTITIONER:
            boolean _isIsDisjoint = gs.isIsDisjoint();
            boolean _not = (!_isIsDisjoint);
            if (_not) {
              StringConcatenation _builder_5 = new StringConcatenation();
              _builder_5.append("Partitioning categorization and non disjoint generalization set is an invalid combination.");
              msg = _builder_5.toString();
            }
            break;
          default:
            break;
        }
      }
      boolean _notEquals_1 = (!Objects.equal(msg, ""));
      if (_notEquals_1) {
        EReference _generalizationSet_Categorizer_1 = ModelPackage.eINSTANCE.getGeneralizationSet_Categorizer();
        return new ValidationError(msg, _generalizationSet_Categorizer_1, 
          ValidationIssue.NO_INDEX, 
          LinguisticRules.INVALID_GENERALIZATION_SET_CATEGORIZATION_COMBINATION, 
          ValidationIssue.NO_ISSUE_CODE, gs);
      }
    }
    return null;
  }
  
  /**
   * Checked scenarios:
   * <br> - C is subordinated to itself
   * <br> - C is subordinated to X, and X is subordinated to C
   * <br> - C is subordinated to X, but C is a super class to X
   */
  public ValidationError hasSimpleSubordinationCycle(final HigherOrderClass c) {
    EList<HigherOrderClass> _subordinators = c.getSubordinators();
    boolean _tripleEquals = (_subordinators == null);
    if (_tripleEquals) {
      return null;
    }
    final Function1<HigherOrderClass, Boolean> _function = (HigherOrderClass sc) -> {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _equals = Objects.equal(sc, c);
      if (_equals) {
        _or_1 = true;
      } else {
        EList<HigherOrderClass> _subordinators_1 = null;
        if (sc!=null) {
          _subordinators_1=sc.getSubordinators();
        }
        boolean _contains = _subordinators_1.contains(c);
        _or_1 = _contains;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _contains_1 = this._mL2Util.classHierarchy(sc).contains(c);
        _or = _contains_1;
      }
      return Boolean.valueOf(_or);
    };
    final HigherOrderClass invalid = IterableExtensions.<HigherOrderClass>findFirst(c.getSubordinators(), _function);
    if ((invalid == null)) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      String _name = c.getName();
      _builder.append(_name);
      _builder.append(" is in a invalid subordination cycle with ");
      String _name_1 = invalid.getName();
      _builder.append(_name_1);
      _builder.append(".");
      EReference _higherOrderClass_Subordinators = ModelPackage.eINSTANCE.getHigherOrderClass_Subordinators();
      int _indexOf = c.getSubordinators().indexOf(invalid);
      return new ValidationError(_builder.toString(), _higherOrderClass_Subordinators, _indexOf, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationIssue isSpecializingDisjointClasses(final br.ufes.inf.nemo.ml2.model.Class c, final Set<br.ufes.inf.nemo.ml2.model.Class> ch) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(c, ModelPackage.eINSTANCE.getGeneralizationSet());
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          EObject _eObject = c.eResource().getResourceSet().getEObject(obj.getEObjectURI(), true);
          gs = ((GeneralizationSet) _eObject);
        }
        if ((gs.isIsDisjoint() && (Sets.<br.ufes.inf.nemo.ml2.model.Class>intersection(ch, IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>toSet(gs.getSpecifics())).size() > 1))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = c.getName();
          _builder.append(_name);
          _builder.append(" is specializing disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            Sets.SetView<br.ufes.inf.nemo.ml2.model.Class> _intersection = Sets.<br.ufes.inf.nemo.ml2.model.Class>intersection(ch, IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>toSet(gs.getSpecifics()));
            for(final br.ufes.inf.nemo.ml2.model.Class disjoint : _intersection) {
              _builder.append(" ");
              EObject _eContainer = disjoint.eContainer();
              String _name_1 = ((Model) _eContainer).getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append(".");
              String _name_2 = disjoint.getName();
              _builder.append(_name_2, "\t\t\t\t\t");
              _builder.append("; ");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          issue.setFeature(ModelPackage.eINSTANCE.getEntityDeclaration_Name());
          issue.setSource(c);
          issue.setCode(LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue isInstanceOfDisjointClasses(final EntityDeclaration e, final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> iof) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(e, ModelPackage.eINSTANCE.getGeneralizationSet());
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          EObject _eObject = e.eResource().getResourceSet().getEObject(obj.getEObjectURI(), true);
          gs = ((GeneralizationSet) _eObject);
        }
        if ((gs.isIsDisjoint() && (Sets.<br.ufes.inf.nemo.ml2.model.Class>intersection(iof, IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>toSet(gs.getSpecifics())).size() > 1))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = e.getName();
          _builder.append(_name);
          _builder.append(" is instance disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            Sets.SetView<br.ufes.inf.nemo.ml2.model.Class> _intersection = Sets.<br.ufes.inf.nemo.ml2.model.Class>intersection(iof, IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>toSet(gs.getSpecifics()));
            for(final br.ufes.inf.nemo.ml2.model.Class disjoint : _intersection) {
              _builder.append(" ");
              EObject _eContainer = disjoint.eContainer();
              String _name_1 = ((Model) _eContainer).getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append(".");
              String _name_2 = disjoint.getName();
              _builder.append(_name_2, "\t\t\t\t\t");
              _builder.append("; ");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          issue.setFeature(ModelPackage.eINSTANCE.getEntityDeclaration_Name());
          issue.setSource(e);
          issue.setCode(LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue missingInstantiationByCompleteness(final EntityDeclaration e, final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> iof) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(e, ModelPackage.eINSTANCE.getGeneralizationSet());
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          EObject _eObject = e.eResource().getResourceSet().getEObject(obj.getEObjectURI(), true);
          gs = ((GeneralizationSet) _eObject);
        }
        if (((gs.isIsComplete() && iof.contains(gs.getGeneral())) && Collections.disjoint(IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>toSet(gs.getSpecifics()), iof))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Missing instantions due to completeness of generalization sets.");
          _builder.newLine();
          {
            EList<br.ufes.inf.nemo.ml2.model.Class> _specifics = gs.getSpecifics();
            for(final br.ufes.inf.nemo.ml2.model.Class mustiof : _specifics) {
              _builder.append("\t\t\t\t");
              EObject _eContainer = mustiof.eContainer();
              String _name = ((Model) _eContainer).getName();
              _builder.append(_name, "\t\t\t\t");
              _builder.append(".");
              String _name_1 = mustiof.getName();
              _builder.append(_name_1, "\t\t\t\t");
              _builder.append("; ");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t\t");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          issue.setFeature(ModelPackage.eINSTANCE.getEntityDeclaration_Name());
          issue.setSource(e);
          issue.setCode(LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationError checkFeatureName(final Feature f) {
    EAttribute _xifexpression = null;
    if ((f instanceof Attribute)) {
      _xifexpression = ModelPackage.eINSTANCE.getAttribute_Name();
    } else {
      _xifexpression = ModelPackage.eINSTANCE.getReference_Name();
    }
    final EAttribute eStrFeat = _xifexpression;
    String _firstUpper = StringExtensions.toFirstUpper(this._mL2Util.getName(f));
    String _name = this._mL2Util.getName(f);
    boolean _equals = Objects.equal(_firstUpper, _name);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid name starting with capitalized letter.");
      return new ValidationError(_builder.toString(), eStrFeat, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.INVALID_FEATURE_NAME, 
        ValidationIssue.NO_ISSUE_CODE, f);
    }
    final EObject c = f.eContainer();
    if ((c instanceof br.ufes.inf.nemo.ml2.model.Class)) {
      final Function1<Feature, Boolean> _function = (Feature it) -> {
        return Boolean.valueOf(((f != it) && Objects.equal(this._mL2Util.getName(f), this._mL2Util.getName(it))));
      };
      boolean _exists = IterableExtensions.<Feature>exists(((br.ufes.inf.nemo.ml2.model.Class)c).getFeatures(), _function);
      if (_exists) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Invalid duplicated name.");
        return new ValidationError(_builder_1.toString(), eStrFeat, 
          ValidationIssue.NO_INDEX, 
          LinguisticRules.DUPLICATED_FEATURE_NAME, 
          ValidationIssue.NO_ISSUE_CODE, f);
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Reference ref) {
    final EAttribute eStrFeat = ModelPackage.eINSTANCE.getReference_UpperBound();
    EList<Reference> _subsetOf = ref.getSubsetOf();
    boolean _tripleEquals = (_subsetOf == null);
    if (_tripleEquals) {
      return null;
    }
    final ValidationError issue = new ValidationError();
    issue.setSource(ref);
    issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
    EList<Reference> _subsetOf_1 = ref.getSubsetOf();
    for (final Reference superRef : _subsetOf_1) {
      if (((ref.getUpperBound() > superRef.getUpperBound()) && (superRef.getUpperBound() > 0))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superRef.getName();
        _builder.append(_name);
        _builder.append(").");
        issue.setMessage(_builder.toString());
        issue.setFeature(eStrFeat);
        return issue;
      } else {
        if (((ref.getUpperBound() == (-1)) && (ref.getUpperBound() != superRef.getUpperBound()))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superRef.getName();
          _builder_1.append(_name_1);
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          issue.setFeature(eStrFeat);
          return issue;
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Attribute att) {
    final EAttribute eStrFeat = ModelPackage.eINSTANCE.getAttribute_UpperBound();
    EList<Attribute> _subsetOf = att.getSubsetOf();
    boolean _tripleEquals = (_subsetOf == null);
    if (_tripleEquals) {
      return null;
    }
    final ValidationError issue = new ValidationError();
    issue.setSource(att);
    issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
    EList<Attribute> _subsetOf_1 = att.getSubsetOf();
    for (final Attribute superAtt : _subsetOf_1) {
      if (((att.getUpperBound() > superAtt.getUpperBound()) && (superAtt.getUpperBound() > 0))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superAtt.getName();
        _builder.append(_name);
        _builder.append(").");
        issue.setMessage(_builder.toString());
        issue.setFeature(eStrFeat);
        return issue;
      } else {
        if (((att.getUpperBound() == (-1)) && (att.getUpperBound() != superAtt.getUpperBound()))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superAtt.getName();
          _builder_1.append(_name_1);
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          issue.setFeature(eStrFeat);
          return issue;
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkMultiplicityAndAssignment(final ReferenceAssignment ra) {
    EList<EntityDeclaration> _values = ra.getValues();
    int _size = 0;
    if (_values!=null) {
      _size=_values.size();
    }
    final int nAssgns = _size;
    final Reference ref = ra.getReference();
    int _lowerBound = ref.getLowerBound();
    boolean _lessThan = (nAssgns < _lowerBound);
    if (_lessThan) {
      final ValidationWarning issue = new ValidationWarning();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Number of assignments must equal or greater than ");
      int _lowerBound_1 = ref.getLowerBound();
      _builder.append(_lowerBound_1);
      _builder.append(".");
      issue.setMessage(_builder.toString());
      issue.setSource(ra);
      issue.setFeature(ModelPackage.eINSTANCE.getReferenceAssignment_Values());
      issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
      return issue;
    } else {
      if (((nAssgns > ref.getUpperBound()) && (ref.getUpperBound() > 0))) {
        final ValidationWarning issue_1 = new ValidationWarning();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Number of assignments must equal or less than ");
        int _upperBound = ref.getUpperBound();
        _builder_1.append(_upperBound);
        _builder_1.append(".");
        issue_1.setMessage(_builder_1.toString());
        issue_1.setSource(ra);
        issue_1.setFeature(ModelPackage.eINSTANCE.getReferenceAssignment_Values());
        issue_1.setCode(LinguisticRules.INVALID_MULTIPLICITY);
        return issue_1;
      } else {
        return null;
      }
    }
  }
  
  protected ValidationIssue _checkMultiplicityAndAssignment(final AttributeAssignment aa) {
    EList<Individual> _datatypeValues = aa.getDatatypeValues();
    int _size = 0;
    if (_datatypeValues!=null) {
      _size=_datatypeValues.size();
    }
    EList<Individual> _unnamedValues = aa.getUnnamedValues();
    int _size_1 = 0;
    if (_unnamedValues!=null) {
      _size_1=_unnamedValues.size();
    }
    int _plus = (_size + _size_1);
    EList<EObject> _literalValues = aa.getLiteralValues();
    int _size_2 = 0;
    if (_literalValues!=null) {
      _size_2=_literalValues.size();
    }
    final int nAssgns = (_plus + _size_2);
    final Attribute att = aa.getAttribute();
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(aa);
    issue.setFeature(ModelPackage.eINSTANCE.getAttributeAssignment_Attribute());
    issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
    int _lowerBound = att.getLowerBound();
    boolean _lessThan = (nAssgns < _lowerBound);
    if (_lessThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Number of assignments must equal or greater than ");
      int _lowerBound_1 = att.getLowerBound();
      _builder.append(_lowerBound_1);
      _builder.append(".");
      issue.setMessage(_builder.toString());
      return issue;
    } else {
      if (((nAssgns > att.getUpperBound()) && (att.getUpperBound() > 0))) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Number of assignments must equal or less than ");
        int _upperBound = att.getUpperBound();
        _builder_1.append(_upperBound);
        _builder_1.append(".");
        issue.setMessage(_builder_1.toString());
        return issue;
      } else {
        return null;
      }
    }
  }
  
  protected ValidationIssue _checkFeatureAssignmentType(final ReferenceAssignment ra) {
    final Reference ref = ra.getReference();
    final br.ufes.inf.nemo.ml2.model.Class assigType = ref.get_type();
    final ValidationError issue = new ValidationError();
    issue.setSource(ra);
    issue.setFeature(ModelPackage.eINSTANCE.getReferenceAssignment_Values());
    EList<EntityDeclaration> _values = ra.getValues();
    for (final EntityDeclaration assig : _values) {
      boolean _isConformantTo = this._mL2Util.isConformantTo(assig, assigType);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = assigType.getName();
        _builder.append(_name);
        _builder.append(".");
        issue.setMessage(_builder.toString());
        issue.setIndex(ra.getValues().indexOf(assig));
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkFeatureAssignmentType(final AttributeAssignment aa) {
    final Attribute att = aa.getAttribute();
    final HashSet<EntityDeclaration> entityAssigs = new HashSet<EntityDeclaration>();
    entityAssigs.addAll(aa.getDatatypeValues());
    entityAssigs.addAll(aa.getUnnamedValues());
    final ValidationError issue = new ValidationError();
    issue.setSource(aa);
    issue.setFeature(ModelPackage.eINSTANCE.getAttributeAssignment_Attribute());
    for (final EntityDeclaration ent : entityAssigs) {
      boolean _isConformantTo = this._mL2Util.isConformantTo(ent, att.get_type());
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = att.get_type().getName();
        _builder.append(_name);
        _builder.append(".");
        issue.setMessage(_builder.toString());
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    EList<EObject> _literalValues = aa.getLiteralValues();
    for (final EObject lit : _literalValues) {
      boolean _isConformantTo_1 = this._mL2Util.isConformantTo(lit, att.getPrimitiveType());
      boolean _not_1 = (!_isConformantTo_1);
      if (_not_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("All assignments must be instances of ");
        PrimitiveType _primitiveType = att.getPrimitiveType();
        _builder_1.append(_primitiveType);
        _builder_1.append(".");
        issue.setMessage(_builder_1.toString());
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  public ValidationIssue checkRegularityAndContainer(final RegularityFeature f) {
    EReference _xifexpression = null;
    if ((f instanceof RegularityAttribute)) {
      _xifexpression = ModelPackage.eINSTANCE.getRegularityAttribute_Regulates();
    } else {
      _xifexpression = ModelPackage.eINSTANCE.getRegularityReference_Regulates();
    }
    final EReference eStrFeat = _xifexpression;
    Feature _regulates = this._mL2Util.getRegulates(f);
    boolean _tripleEquals = (_regulates == null);
    if (_tripleEquals) {
      return null;
    } else {
      EObject _eContainer = f.eContainer();
      if ((_eContainer instanceof FirstOrderClass)) {
        final ValidationError issue = new ValidationError();
        issue.setSource(f);
        issue.setFeature(eStrFeat);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Regularity attributes do not apply to first-order classes.");
        issue.setMessage(_builder.toString());
        issue.setCode(LinguisticRules.FIRST_ORDER_REGULARITY);
        return issue;
      } else {
        if ((Objects.equal(f.getRegularityType(), RegularityFeatureType.DETERMINES_MAX_VALUE) || Objects.equal(f.getRegularityType(), RegularityFeatureType.DETERMINES_MIN_VALUE))) {
          if (((!(f instanceof Attribute)) || (!Objects.equal(((Attribute) f).getPrimitiveType(), PrimitiveType.NUMBER)))) {
            final ValidationError issue_1 = new ValidationError();
            issue_1.setSource(f);
            issue_1.setFeature(eStrFeat);
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("This type of regularity feature only applies to numbers.");
            issue_1.setMessage(_builder_1.toString());
            issue_1.setCode(LinguisticRules.RESTRICTED_REGULARITY_TYPE);
            return issue_1;
          }
        } else {
          if ((Objects.equal(f.getRegularityType(), RegularityFeatureType.DETERMINES_ALLOWED_TYPES) || Objects.equal(f.getRegularityType(), RegularityFeatureType.DETERMINES_TYPE))) {
            if (((f instanceof Attribute) && (!((Attribute) f).eIsSet(ModelPackage.eINSTANCE.getAttribute__type())))) {
              final ValidationError issue_2 = new ValidationError();
              issue_2.setSource(f);
              issue_2.setFeature(eStrFeat);
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("This type of regularity feature do not apply to primitive types.");
              issue_2.setMessage(_builder_2.toString());
              issue_2.setCode(LinguisticRules.RESTRICTED_REGULARITY_TYPE);
              return issue_2;
            }
          }
        }
      }
    }
    return null;
  }
  
  public ValidationIssue checkInstantiatedRegularities(final br.ufes.inf.nemo.ml2.model.Class c) {
    final Function1<Feature, Boolean> _function = (Feature it) -> {
      return Boolean.valueOf(((it instanceof RegularityFeature) && (this._mL2Util.getRegulates(((RegularityFeature) it)) != null)));
    };
    final Set<Feature> rFeatures = IterableExtensions.<Feature>toSet(IterableExtensions.<Feature>filter(this._mL2Util.getAllFeatures(c), _function));
    final Consumer<FeatureAssignment> _function_1 = (FeatureAssignment f) -> {
      if ((f instanceof AttributeAssignment)) {
        rFeatures.remove(((AttributeAssignment)f).getAttribute());
      } else {
        if ((f instanceof ReferenceAssignment)) {
          rFeatures.remove(((ReferenceAssignment)f).getReference());
        }
      }
    };
    c.getAssignments().forEach(_function_1);
    boolean _isEmpty = rFeatures.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final Consumer<br.ufes.inf.nemo.ml2.model.Class> _function_2 = (br.ufes.inf.nemo.ml2.model.Class sc) -> {
      final Consumer<FeatureAssignment> _function_3 = (FeatureAssignment f) -> {
        if ((f instanceof AttributeAssignment)) {
          rFeatures.remove(((AttributeAssignment)f).getAttribute());
        } else {
          if ((f instanceof ReferenceAssignment)) {
            rFeatures.remove(((ReferenceAssignment)f).getReference());
          }
        }
      };
      sc.getAssignments().forEach(_function_3);
    };
    this._mL2Util.classHierarchy(c).forEach(_function_2);
    boolean _isEmpty_1 = rFeatures.isEmpty();
    if (_isEmpty_1) {
      return null;
    }
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(c);
    issue.setFeature(ModelPackage.eINSTANCE.getEntityDeclaration_Name());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The regularity feature ");
    String _name = this._mL2Util.getName(IterableExtensions.<Feature>head(rFeatures));
    _builder.append(_name);
    _builder.append(" should have an assigned value.");
    issue.setMessage(_builder.toString());
    issue.setCode(LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
    return issue;
  }
  
  public ValidationIssue containsReferences(final DataType d) {
    boolean _isEmpty = this._mL2Util.getReferences(d).isEmpty();
    if (_isEmpty) {
      return null;
    } else {
      final ValidationWarning i = new ValidationWarning();
      i.setSource(d);
      i.setFeature(ModelPackage.eINSTANCE.getEntityDeclaration_Name());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The use of references on datatypes might be unwanted.");
      i.setMessage(_builder.toString());
      i.setCode(LinguisticRules.UNWANTED_REFERENCES_ON_DATATYPES);
      return i;
    }
  }
  
  protected ValidationIssue _checkRegularityFeatureConformance(final ReferenceAssignment refa) {
    final Reference ref = refa.getReference();
    final LinkedHashSet<RegularityReference> regRefSet = new LinkedHashSet<RegularityReference>();
    EObject _eContainer = refa.eContainer();
    final Set<br.ufes.inf.nemo.ml2.model.Class> knowClasses = this._mL2Util.getRechableClasses(((EntityDeclaration) _eContainer));
    final Consumer<br.ufes.inf.nemo.ml2.model.Class> _function = (br.ufes.inf.nemo.ml2.model.Class c) -> {
      final Consumer<Reference> _function_1 = (Reference it) -> {
        if (((it instanceof RegularityReference) && Objects.equal(((RegularityReference) it).getRegulates(), ref))) {
          regRefSet.add(((RegularityReference) it));
        }
      };
      this._mL2Util.getReferences(c).forEach(_function_1);
    };
    knowClasses.forEach(_function);
    boolean _isEmpty = regRefSet.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final LinkedHashSet<ReferenceAssignment> regRefAssigSet = new LinkedHashSet<ReferenceAssignment>();
    EObject _eContainer_1 = refa.eContainer();
    EList<br.ufes.inf.nemo.ml2.model.Class> _classifiers = ((EntityDeclaration) _eContainer_1).getClassifiers();
    for (final br.ufes.inf.nemo.ml2.model.Class c : _classifiers) {
      EList<FeatureAssignment> _assignments = c.getAssignments();
      for (final FeatureAssignment it : _assignments) {
        if ((it instanceof ReferenceAssignment)) {
          boolean _contains = regRefSet.contains(((ReferenceAssignment)it).getReference());
          if (_contains) {
            regRefAssigSet.add(((ReferenceAssignment)it));
          }
        }
      }
    }
    boolean _isEmpty_1 = regRefAssigSet.isEmpty();
    if (_isEmpty_1) {
      return null;
    }
    for (final ReferenceAssignment regRefAssig : regRefAssigSet) {
      for (final RegularityReference regRef : regRefSet) {
        boolean _isConformanTo = this._mL2Util.isConformanTo(refa, regRef.getRegularityType(), regRefAssig);
        boolean _not = (!_isConformanTo);
        if (_not) {
          final ValidationWarning i = new ValidationWarning();
          i.setSource(refa);
          i.setFeature(ModelPackage.eINSTANCE.getReferenceAssignment_Reference());
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Assignment is non-conformant to the regularity feature ");
          String _name = regRef.getName();
          _builder.append(_name);
          _builder.append(" of ");
          EObject _eContainer_2 = regRef.eContainer();
          String _name_1 = ((br.ufes.inf.nemo.ml2.model.Class) _eContainer_2).getName();
          _builder.append(_name_1);
          _builder.append(".");
          i.setMessage(_builder.toString());
          i.setCode(LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
          return i;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue checkSubsettedMultiplicity(final Feature att) {
    if (att instanceof Attribute) {
      return _checkSubsettedMultiplicity((Attribute)att);
    } else if (att instanceof Reference) {
      return _checkSubsettedMultiplicity((Reference)att);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(att).toString());
    }
  }
  
  public ValidationIssue checkMultiplicityAndAssignment(final FeatureAssignment aa) {
    if (aa instanceof AttributeAssignment) {
      return _checkMultiplicityAndAssignment((AttributeAssignment)aa);
    } else if (aa instanceof ReferenceAssignment) {
      return _checkMultiplicityAndAssignment((ReferenceAssignment)aa);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aa).toString());
    }
  }
  
  public ValidationIssue checkFeatureAssignmentType(final FeatureAssignment aa) {
    if (aa instanceof AttributeAssignment) {
      return _checkFeatureAssignmentType((AttributeAssignment)aa);
    } else if (aa instanceof ReferenceAssignment) {
      return _checkFeatureAssignmentType((ReferenceAssignment)aa);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aa).toString());
    }
  }
  
  public ValidationIssue checkRegularityFeatureConformance(final ReferenceAssignment refa) {
    return _checkRegularityFeatureConformance(refa);
  }
}
