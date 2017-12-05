package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.meta.Attribute;
import br.ufes.inf.nemo.ml2.meta.AttributeAssignment;
import br.ufes.inf.nemo.ml2.meta.CategorizationType;
import br.ufes.inf.nemo.ml2.meta.DataType;
import br.ufes.inf.nemo.ml2.meta.EntityDeclaration;
import br.ufes.inf.nemo.ml2.meta.FOClass;
import br.ufes.inf.nemo.ml2.meta.Feature;
import br.ufes.inf.nemo.ml2.meta.FeatureAssignment;
import br.ufes.inf.nemo.ml2.meta.GeneralizationSet;
import br.ufes.inf.nemo.ml2.meta.HOClass;
import br.ufes.inf.nemo.ml2.meta.Individual;
import br.ufes.inf.nemo.ml2.meta.Literal;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.meta.ModelElement;
import br.ufes.inf.nemo.ml2.meta.OrderedClass;
import br.ufes.inf.nemo.ml2.meta.OrderlessClass;
import br.ufes.inf.nemo.ml2.meta.PrimitiveType;
import br.ufes.inf.nemo.ml2.meta.Reference;
import br.ufes.inf.nemo.ml2.meta.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.meta.RegularityFeatureType;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
  
  public final static String INVALID_ENTITY_DECLARATION_NAME = "br.ufes.inf.nemo.meta.InvalidEntityDeclarationName";
  
  public final static String INVALID_FEATURE_NAME = "br.ufes.inf.nemo.meta.InvalidFeatureName";
  
  public final static String INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.meta.InvalidClassSpecialization";
  
  public final static String CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.meta.CycliSpecialization";
  
  public final static String INVALID_CATEGORIZED_CLASS = "br.ufes.inf.nemo.meta.InvalidCategorizedClass";
  
  public final static String INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.meta.InvalidPowertypeRelation";
  
  public final static String INVALID_SUBORDINATOR = "br.ufes.inf.nemo.meta.InvalidSubordinator";
  
  public final static String DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.meta.DuplicatedEntityName";
  
  public final static String DUPLICATED_FEATURE_NAME = "br.ufes.inf.nemo.meta.DuplicatedFeatureName";
  
  public final static String INVALID_GENERALIZATION_SET_MEMBERS = "br.ufes.inf.nemo.meta.InvalidGeneralizationSetMembers";
  
  public final static String MISSING_SPECIALIZATION_THROUGH_SUBODINATION = "br.ufes.inf.nemo.meta.MissingSpecializationThroughSubordination";
  
  public final static String SIMPLE_SUBORDINATION_CYCLE = "br.ufes.inf.nemo.meta.SimpleSubordinationCycle";
  
  public final static String SPECILIZATION_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.meta.SpecializationOfDisjointClasses";
  
  public final static String INSTANCE_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.meta.InstanceOfDisjointClasses";
  
  public final static String MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET = "br.ufes.inf.nemo.meta.MissingInstantiationOfCompleteGeneralizationSet";
  
  public final static String INVALID_MULTIPLICITY = "br.ufes.inf.nemo.meta.InvalidMultiplicity";
  
  public final static String NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.meta.NonConformantAssigment";
  
  public final static String FIRST_ORDER_REGULARITY = "br.ufes.inf.nemo.meta.FirstOrderRegularity";
  
  public final static String MISSING_ASSIGNMENT_BY_REGULARITY = "br.ufes.inf.nemo.meta.MissingAssignmentByRegularity";
  
  public final static String UNWANTED_REFERENCES_ON_DATATYPES = "br.ufes.inf.nemo.meta.UnwantedReferencesOnDataTypes";
  
  public final static String RESTRICTED_REGULARITY_TYPE = "br.ufes.inf.nemo.meta.RestrictedRegularityType";
  
  public final static String NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT = "br.ufes.inf.nemo.meta.NonConformantRegulatedFeatureAssignment";
  
  public final static String INVALID_INSTANTIATION = "br.ufes.inf.nemo.meta.InvalidInstantiation";
  
  public final static String INVALID_GENERALIZATION_SET_CATEGORIZATION_COMBINATION = "br.ufes.inf.nemo.meta.InvalidGeneralizationSetCategorizationCombination";
  
  public ValidationError isNameValid(final EntityDeclaration e) {
    if (((!e.getName().equals(StringExtensions.toFirstLower(e.getName()))) || (e.eContainer() instanceof AttributeAssignment))) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Entity name must start with a capital letter.");
      EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
      return new ValidationError(_builder.toString(), _entityDeclaration_Name, (-1), 
        LinguisticRules.INVALID_ENTITY_DECLARATION_NAME, null, e);
    }
  }
  
  public ValidationIssue isValidInstantiation(final EntityDeclaration e) {
    ML2Class invalid = null;
    if ((e instanceof Individual)) {
      EList<ML2Class> _instantiatedClasses = ((Individual)e).getInstantiatedClasses();
      final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
        return Boolean.valueOf((it instanceof HOClass));
      };
      ML2Class _findFirst = IterableExtensions.<ML2Class>findFirst(_instantiatedClasses, _function);
      invalid = _findFirst;
    } else {
      if ((e instanceof FOClass)) {
        EList<ML2Class> _instantiatedClasses_1 = ((FOClass)e).getInstantiatedClasses();
        final Function1<ML2Class, Boolean> _function_1 = (ML2Class it) -> {
          if ((it instanceof FOClass)) {
            return Boolean.valueOf(true);
          } else {
            if ((it instanceof HOClass)) {
              Integer _order = ((HOClass)it).getOrder();
              boolean _notEquals = ((_order).intValue() != MLTRules.MIN_ORDER);
              if (_notEquals) {
                return Boolean.valueOf(true);
              }
            }
          }
          return Boolean.valueOf(false);
        };
        ML2Class _findFirst_1 = IterableExtensions.<ML2Class>findFirst(_instantiatedClasses_1, _function_1);
        invalid = _findFirst_1;
      } else {
        if ((e instanceof HOClass)) {
          EList<ML2Class> _instantiatedClasses_2 = ((HOClass)e).getInstantiatedClasses();
          final Function1<ML2Class, Boolean> _function_2 = (ML2Class it) -> {
            if ((it instanceof FOClass)) {
              return Boolean.valueOf(true);
            } else {
              if ((it instanceof HOClass)) {
                Integer _order = ((HOClass)it).getOrder();
                Integer _order_1 = ((HOClass)e).getOrder();
                int _plus = ((_order_1).intValue() + 1);
                boolean _notEquals = ((_order).intValue() != _plus);
                if (_notEquals) {
                  return Boolean.valueOf(true);
                }
              }
            }
            return Boolean.valueOf(false);
          };
          ML2Class _findFirst_2 = IterableExtensions.<ML2Class>findFirst(_instantiatedClasses_2, _function_2);
          invalid = _findFirst_2;
        } else {
          if ((e instanceof OrderlessClass)) {
            EList<ML2Class> _instantiatedClasses_3 = ((OrderlessClass)e).getInstantiatedClasses();
            final Function1<ML2Class, Boolean> _function_3 = (ML2Class it) -> {
              return Boolean.valueOf((!(it instanceof OrderlessClass)));
            };
            ML2Class _findFirst_3 = IterableExtensions.<ML2Class>findFirst(_instantiatedClasses_3, _function_3);
            invalid = _findFirst_3;
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
      _builder.append(_name, "");
      EReference _entityDeclaration_InstantiatedClasses = MetaPackage.eINSTANCE.getEntityDeclaration_InstantiatedClasses();
      EList<ML2Class> _instantiatedClasses_4 = e.getInstantiatedClasses();
      int _indexOf = _instantiatedClasses_4.indexOf(invalid);
      return new ValidationError(_builder.toString(), _entityDeclaration_InstantiatedClasses, _indexOf, 
        LinguisticRules.INVALID_INSTANTIATION, 
        null, e);
    }
  }
  
  public ValidationError isValidSpecialization(final ML2Class c) {
    ML2Class invalid = null;
    EList<ML2Class> _superClasses = c.getSuperClasses();
    boolean _contains = _superClasses.contains(c);
    if (_contains) {
      invalid = c;
    } else {
      if ((c instanceof OrderlessClass)) {
        EList<ML2Class> _superClasses_1 = ((OrderlessClass)c).getSuperClasses();
        final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
          return Boolean.valueOf((it instanceof OrderedClass));
        };
        ML2Class _findFirst = IterableExtensions.<ML2Class>findFirst(_superClasses_1, _function);
        invalid = _findFirst;
      } else {
        if ((c instanceof FOClass)) {
          EList<ML2Class> _superClasses_2 = ((FOClass)c).getSuperClasses();
          final Function1<ML2Class, Boolean> _function_1 = (ML2Class it) -> {
            return Boolean.valueOf((it instanceof HOClass));
          };
          ML2Class _findFirst_1 = IterableExtensions.<ML2Class>findFirst(_superClasses_2, _function_1);
          invalid = _findFirst_1;
        } else {
          if ((c instanceof HOClass)) {
            EList<ML2Class> _superClasses_3 = ((HOClass)c).getSuperClasses();
            final Function1<ML2Class, Boolean> _function_2 = (ML2Class it) -> {
              boolean _xifexpression = false;
              if ((it instanceof FOClass)) {
                _xifexpression = true;
              } else {
                boolean _xifexpression_1 = false;
                if ((it instanceof HOClass)) {
                  Integer _order = ((HOClass)c).getOrder();
                  Integer _order_1 = ((HOClass)it).getOrder();
                  _xifexpression_1 = (!Objects.equal(_order, _order_1));
                } else {
                  _xifexpression_1 = false;
                }
                _xifexpression = _xifexpression_1;
              }
              return Boolean.valueOf(_xifexpression);
            };
            ML2Class _findFirst_2 = IterableExtensions.<ML2Class>findFirst(_superClasses_3, _function_2);
            invalid = _findFirst_2;
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
      _builder.append(_name, "");
      _builder.append(".");
      EReference _mL2Class_SuperClasses = MetaPackage.eINSTANCE.getML2Class_SuperClasses();
      EList<ML2Class> _superClasses_4 = c.getSuperClasses();
      int _indexOf = _superClasses_4.indexOf(invalid);
      return new ValidationError(_builder.toString(), _mL2Class_SuperClasses, _indexOf, 
        LinguisticRules.INVALID_CLASS_SPECIALIZATION, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationError hasCyclicSpecialization(final ML2Class c, final Set<ML2Class> ch) {
    ValidationError _xifexpression = null;
    boolean _contains = ch.contains(c);
    if (_contains) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid cyclic specialization.");
      EReference _mL2Class_SuperClasses = MetaPackage.eINSTANCE.getML2Class_SuperClasses();
      _xifexpression = new ValidationError(_builder.toString(), _mL2Class_SuperClasses, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.CYCLIC_SPECIALIZATION, 
        ValidationIssue.NO_ISSUE_CODE, c);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public ValidationError hasValidCategorizedClass(final ML2Class c) {
    final ML2Class cat = c.getCategorizedClass();
    String msg = "";
    if ((cat == null)) {
      return null;
    } else {
      if (((c instanceof OrderlessClass) && (cat instanceof OrderedClass))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid categorization of an ordered class.");
        msg = _builder.toString();
      } else {
        if ((c instanceof HOClass)) {
          if (((cat instanceof OrderlessClass) && (((HOClass)c).getCategorizationType() == CategorizationType.COMPLETE_CATEGORIZER))) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Invalid complete categorization of an orderless class.");
            msg = _builder_1.toString();
          } else {
            if (((cat instanceof OrderlessClass) && (((HOClass)c).getCategorizationType() == CategorizationType.PARTITIONER))) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("Invalidation partitioning of an orderless class.");
              msg = _builder_2.toString();
            } else {
              if ((cat instanceof HOClass)) {
                if ((((((HOClass)c).getOrder()).intValue() == MLTRules.MIN_ORDER) || ((((HOClass)c).getOrder()).intValue() != ((((HOClass)cat).getOrder()).intValue() + 1)))) {
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("Invalid categorization of a class of order different than ");
                  Integer _order = ((HOClass)c).getOrder();
                  int _minus = ((_order).intValue() - 1);
                  _builder_3.append(_minus, "");
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
      EReference _mL2Class_CategorizedClass = MetaPackage.eINSTANCE.getML2Class_CategorizedClass();
      return new ValidationError(msg, _mL2Class_CategorizedClass, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.INVALID_CATEGORIZED_CLASS, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationError hasValidPowertypeRelation(final ML2Class c) {
    final ML2Class base = c.getPowertypeOf();
    String msg = "";
    if ((base == null)) {
      return null;
    } else {
      if (((c instanceof OrderlessClass) && (base instanceof OrderedClass))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Invalid powertype relation towards an ordered basetype.");
        msg = _builder.toString();
      } else {
        if ((c instanceof HOClass)) {
          if ((base instanceof OrderlessClass)) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Invalid powertype relation towards an orderless basetype.");
            msg = _builder_1.toString();
          } else {
            if (((base instanceof FOClass) && ((((HOClass)c).getOrder()).intValue() != MLTRules.MIN_ORDER))) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("Invalid powertype relation. The basetype must be of order ");
              Integer _order = ((HOClass)c).getOrder();
              int _minus = ((_order).intValue() - 1);
              _builder_2.append(_minus, "");
              _builder_2.append(".");
              msg = _builder_2.toString();
            } else {
              if ((base instanceof HOClass)) {
                if ((((((HOClass)c).getOrder()).intValue() == MLTRules.MIN_ORDER) || ((((HOClass)c).getOrder()).intValue() != ((((HOClass)base).getOrder()).intValue() + 1)))) {
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("Invalid powertype relation. The basetype must be of order ");
                  Integer _order_1 = ((HOClass)c).getOrder();
                  int _minus_1 = ((_order_1).intValue() - 1);
                  _builder_3.append(_minus_1, "");
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
      EReference _mL2Class_PowertypeOf = MetaPackage.eINSTANCE.getML2Class_PowertypeOf();
      return new ValidationError(msg, _mL2Class_PowertypeOf, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.INVALID_POWERTYPE_RELATION, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationError hasValidSubordinators(final ML2Class c) {
    ML2Class invalid = null;
    String msg = "";
    final ValidationError issue = new ValidationError();
    EList<ML2Class> _subordinators = c.getSubordinators();
    boolean _contains = _subordinators.contains(c);
    if (_contains) {
      invalid = c;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid subordination to itself.");
      msg = _builder.toString();
    } else {
      EList<ML2Class> _subordinators_1 = c.getSubordinators();
      final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
        boolean _xifexpression = false;
        if ((it instanceof FOClass)) {
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
            if ((((c instanceof HOClass) && (it instanceof HOClass)) && (((HOClass) it).getOrder() != ((HOClass) c).getOrder()))) {
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
      ML2Class _findFirst = IterableExtensions.<ML2Class>findFirst(_subordinators_1, _function);
      invalid = _findFirst;
    }
    if ((invalid == null)) {
      return null;
    } else {
      EReference _mL2Class_Subordinators = MetaPackage.eINSTANCE.getML2Class_Subordinators();
      issue.setFeature(_mL2Class_Subordinators);
      EList<ML2Class> _subordinators_2 = c.getSubordinators();
      int _indexOf = _subordinators_2.indexOf(invalid);
      issue.setIndex(_indexOf);
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
    EList<ModelElement> _elements = ((ML2Model) _eContainer_1).getElements();
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      return Boolean.valueOf(((it instanceof EntityDeclaration) && Objects.equal(((EntityDeclaration) it).getName(), e.getName())));
    };
    final Iterable<ModelElement> rep = IterableExtensions.<ModelElement>filter(_elements, _function);
    int _size = IterableExtensions.size(rep);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Entity name must be unique.");
      EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
      return new ValidationError(_builder.toString(), _entityDeclaration_Name, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.DUPLICATED_ENTITY_NAME, 
        ValidationIssue.NO_ISSUE_CODE, e);
    } else {
      return null;
    }
  }
  
  public ValidationError hasValidMembers(final GeneralizationSet gs) {
    ML2Class invalid = null;
    EList<ML2Class> _specifics = gs.getSpecifics();
    final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
      EList<ML2Class> _superClasses = it.getSuperClasses();
      ML2Class _general = gs.getGeneral();
      boolean _contains = _superClasses.contains(_general);
      return Boolean.valueOf((!_contains));
    };
    ML2Class _findFirst = IterableExtensions.<ML2Class>findFirst(_specifics, _function);
    invalid = _findFirst;
    if ((invalid != null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid member is not a direct specialization of the general class.");
      EReference _generalizationSet_Specifics = MetaPackage.eINSTANCE.getGeneralizationSet_Specifics();
      EList<ML2Class> _specifics_1 = gs.getSpecifics();
      int _indexOf = _specifics_1.indexOf(invalid);
      return new ValidationError(_builder.toString(), _generalizationSet_Specifics, _indexOf, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS, 
        ValidationIssue.NO_ISSUE_CODE, gs);
    }
    ML2Class _categorizer = gs.getCategorizer();
    boolean _tripleNotEquals = (_categorizer != null);
    if (_tripleNotEquals) {
      final ML2Class cat = gs.getCategorizer();
      ML2Class _categorizedClass = cat.getCategorizedClass();
      ML2Class _general = gs.getGeneral();
      boolean _notEquals = (!Objects.equal(_categorizedClass, _general));
      if (_notEquals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("The categorizer class must have a categorization relation towards the general class.");
        EReference _generalizationSet_Categorizer = MetaPackage.eINSTANCE.getGeneralizationSet_Categorizer();
        return new ValidationError(_builder_1.toString(), _generalizationSet_Categorizer, 
          ValidationIssue.NO_INDEX, 
          LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS, 
          ValidationIssue.NO_ISSUE_CODE, gs);
      }
      EList<ML2Class> _specifics_2 = gs.getSpecifics();
      final Function1<ML2Class, Boolean> _function_1 = (ML2Class it) -> {
        EList<ML2Class> _instantiatedClasses = it.getInstantiatedClasses();
        boolean _contains = _instantiatedClasses.contains(cat);
        return Boolean.valueOf((!_contains));
      };
      ML2Class _findFirst_1 = IterableExtensions.<ML2Class>findFirst(_specifics_2, _function_1);
      invalid = _findFirst_1;
      if ((invalid != null)) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("The specific class must be direct instances of the categorizer class.");
        EReference _generalizationSet_Specifics_1 = MetaPackage.eINSTANCE.getGeneralizationSet_Specifics();
        EList<ML2Class> _specifics_3 = gs.getSpecifics();
        int _indexOf_1 = _specifics_3.indexOf(invalid);
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
        EReference _generalizationSet_Categorizer_1 = MetaPackage.eINSTANCE.getGeneralizationSet_Categorizer();
        return new ValidationError(msg, _generalizationSet_Categorizer_1, 
          ValidationIssue.NO_INDEX, 
          LinguisticRules.INVALID_GENERALIZATION_SET_CATEGORIZATION_COMBINATION, 
          ValidationIssue.NO_ISSUE_CODE, gs);
      }
    }
    return null;
  }
  
  public ValidationError obeysSubordination(final ML2Class c, final Set<ML2Class> ch, final Set<ML2Class> iof) {
    final LinkedHashSet<ML2Class> subordinated = new LinkedHashSet<ML2Class>();
    final Consumer<ML2Class> _function = (ML2Class it) -> {
      EList<ML2Class> _subordinators = it.getSubordinators();
      boolean _tripleNotEquals = (_subordinators != null);
      if (_tripleNotEquals) {
        EList<ML2Class> _subordinators_1 = it.getSubordinators();
        subordinated.addAll(_subordinators_1);
      }
    };
    iof.forEach(_function);
    int _size = subordinated.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return null;
    }
    final LinkedHashSet<ML2Class> superClassesIof = new LinkedHashSet<ML2Class>();
    final Consumer<ML2Class> _function_1 = (ML2Class it) -> {
      LinkedHashSet<ML2Class> _allInstantiatedClasses = this._mL2Util.getAllInstantiatedClasses(it);
      superClassesIof.addAll(_allInstantiatedClasses);
    };
    ch.forEach(_function_1);
    final Function1<ML2Class, Boolean> _function_2 = (ML2Class it) -> {
      boolean _contains = superClassesIof.contains(it);
      return Boolean.valueOf((!_contains));
    };
    final ML2Class invalid = IterableExtensions.<ML2Class>findFirst(subordinated, _function_2);
    if ((invalid == null)) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Missing specialization due to subordination to some instance of ");
      String _name = invalid.getName();
      _builder.append(_name, "");
      _builder.append(".");
      EReference _mL2Class_SuperClasses = MetaPackage.eINSTANCE.getML2Class_SuperClasses();
      return new ValidationError(_builder.toString(), _mL2Class_SuperClasses, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  /**
   * Checked scenarios:
   * <br> - C is subordinated to itself
   * <br> - C is subordinated to X, and X is subordinated to C
   * <br> - C is subordinated to X, but C is a super class to X
   */
  public ValidationError hasSimpleSubordinationCycle(final ML2Class c) {
    EList<ML2Class> _subordinators = c.getSubordinators();
    boolean _tripleEquals = (_subordinators == null);
    if (_tripleEquals) {
      return null;
    }
    EList<ML2Class> _subordinators_1 = c.getSubordinators();
    final Function1<ML2Class, Boolean> _function = (ML2Class sc) -> {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _equals = Objects.equal(sc, c);
      if (_equals) {
        _or_1 = true;
      } else {
        EList<ML2Class> _subordinators_2 = null;
        if (sc!=null) {
          _subordinators_2=sc.getSubordinators();
        }
        boolean _contains = _subordinators_2.contains(c);
        _or_1 = _contains;
      }
      if (_or_1) {
        _or = true;
      } else {
        Set<ML2Class> _classHierarchy = this._mL2Util.classHierarchy(sc);
        boolean _contains_1 = _classHierarchy.contains(c);
        _or = _contains_1;
      }
      return Boolean.valueOf(_or);
    };
    final ML2Class invalid = IterableExtensions.<ML2Class>findFirst(_subordinators_1, _function);
    if ((invalid == null)) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      String _name = c.getName();
      _builder.append(_name, "");
      _builder.append(" is in a invalid subordination cycle with ");
      String _name_1 = invalid.getName();
      _builder.append(_name_1, "");
      _builder.append(".");
      EReference _mL2Class_Subordinators = MetaPackage.eINSTANCE.getML2Class_Subordinators();
      EList<ML2Class> _subordinators_2 = c.getSubordinators();
      int _indexOf = _subordinators_2.indexOf(invalid);
      return new ValidationError(_builder.toString(), _mL2Class_Subordinators, _indexOf, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
  
  public ValidationIssue isSpecializingDisjointClasses(final ML2Class c, final Set<ML2Class> ch) {
    EClass _generalizationSet = MetaPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(c, _generalizationSet);
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          Resource _eResource = c.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          URI _eObjectURI = obj.getEObjectURI();
          EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
          gs = ((GeneralizationSet) _eObject);
        }
        if ((gs.isIsDisjoint() && (Sets.<ML2Class>intersection(ch, IterableExtensions.<ML2Class>toSet(gs.getSpecifics())).size() > 1))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = c.getName();
          _builder.append(_name, "");
          _builder.append(" is specializing disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            EList<ML2Class> _specifics = gs.getSpecifics();
            Set<ML2Class> _set = IterableExtensions.<ML2Class>toSet(_specifics);
            Sets.SetView<ML2Class> _intersection = Sets.<ML2Class>intersection(ch, _set);
            for(final ML2Class disjoint : _intersection) {
              _builder.append(" ");
              EObject _eContainer = disjoint.eContainer();
              String _name_1 = ((ML2Model) _eContainer).getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append(".");
              String _name_2 = disjoint.getName();
              _builder.append(_name_2, "\t\t\t\t\t");
              _builder.append("; ");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
          issue.setFeature(_entityDeclaration_Name);
          issue.setSource(c);
          issue.setCode(LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue isInstanceOfDisjointClasses(final EntityDeclaration e, final LinkedHashSet<ML2Class> iof) {
    EClass _generalizationSet = MetaPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(e, _generalizationSet);
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          Resource _eResource = e.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          URI _eObjectURI = obj.getEObjectURI();
          EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
          gs = ((GeneralizationSet) _eObject);
        }
        if ((gs.isIsDisjoint() && (Sets.<ML2Class>intersection(iof, IterableExtensions.<ML2Class>toSet(gs.getSpecifics())).size() > 1))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = e.getName();
          _builder.append(_name, "");
          _builder.append(" is instance disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            EList<ML2Class> _specifics = gs.getSpecifics();
            Set<ML2Class> _set = IterableExtensions.<ML2Class>toSet(_specifics);
            Sets.SetView<ML2Class> _intersection = Sets.<ML2Class>intersection(iof, _set);
            for(final ML2Class disjoint : _intersection) {
              _builder.append(" ");
              EObject _eContainer = disjoint.eContainer();
              String _name_1 = ((ML2Model) _eContainer).getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append(".");
              String _name_2 = disjoint.getName();
              _builder.append(_name_2, "\t\t\t\t\t");
              _builder.append("; ");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
          issue.setFeature(_entityDeclaration_Name);
          issue.setSource(e);
          issue.setCode(LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue missingInstantiationByCompleteness(final EntityDeclaration e, final LinkedHashSet<ML2Class> iof) {
    EClass _generalizationSet = MetaPackage.eINSTANCE.getGeneralizationSet();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(e, _generalizationSet);
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          Resource _eResource = e.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          URI _eObjectURI = obj.getEObjectURI();
          EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
          gs = ((GeneralizationSet) _eObject);
        }
        if (((gs.isIsComplete() && iof.contains(gs.getGeneral())) && Collections.disjoint(IterableExtensions.<ML2Class>toSet(gs.getSpecifics()), iof))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Missing instantions due to completeness of generalization sets.");
          _builder.newLine();
          {
            EList<ML2Class> _specifics = gs.getSpecifics();
            for(final ML2Class mustiof : _specifics) {
              _builder.append("\t\t\t\t\t");
              EObject _eContainer = mustiof.eContainer();
              String _name = ((ML2Model) _eContainer).getName();
              _builder.append(_name, "\t\t\t\t\t");
              _builder.append(".");
              String _name_1 = mustiof.getName();
              _builder.append(_name_1, "\t\t\t\t\t");
              _builder.append("; ");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t\t\t");
            }
          }
          _builder.append(").");
          issue.setMessage(_builder.toString());
          EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
          issue.setFeature(_entityDeclaration_Name);
          issue.setSource(e);
          issue.setCode(LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationError checkFeatureName(final Feature f) {
    String _name = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _name_1 = f.getName();
    boolean _equals = Objects.equal(_firstUpper, _name_1);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Invalid name starting with capitalized letter.");
      EAttribute _feature_Name = MetaPackage.eINSTANCE.getFeature_Name();
      return new ValidationError(_builder.toString(), _feature_Name, 
        ValidationIssue.NO_INDEX, 
        LinguisticRules.INVALID_FEATURE_NAME, 
        ValidationIssue.NO_ISSUE_CODE, f);
    }
    final EObject c = f.eContainer();
    if ((c instanceof ML2Class)) {
      EList<Feature> _features = ((ML2Class)c).getFeatures();
      final Function1<Feature, Boolean> _function = (Feature it) -> {
        return Boolean.valueOf(((f != it) && Objects.equal(f.getName(), it.getName())));
      };
      boolean _exists = IterableExtensions.<Feature>exists(_features, _function);
      if (_exists) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Invalid duplicated name.");
        EAttribute _feature_Name_1 = MetaPackage.eINSTANCE.getFeature_Name();
        return new ValidationError(_builder_1.toString(), _feature_Name_1, 
          ValidationIssue.NO_INDEX, 
          LinguisticRules.DUPLICATED_FEATURE_NAME, 
          ValidationIssue.NO_ISSUE_CODE, f);
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Reference ref) {
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
        _builder.append(_name, "");
        _builder.append(").");
        issue.setMessage(_builder.toString());
        EAttribute _feature_UpperBound = MetaPackage.eINSTANCE.getFeature_UpperBound();
        issue.setFeature(_feature_UpperBound);
        return issue;
      } else {
        if (((ref.getUpperBound() == (-1)) && (ref.getUpperBound() != superRef.getUpperBound()))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superRef.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          EAttribute _feature_UpperBound_1 = MetaPackage.eINSTANCE.getFeature_UpperBound();
          issue.setFeature(_feature_UpperBound_1);
          return issue;
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Attribute att) {
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
        _builder.append(_name, "");
        _builder.append(").");
        issue.setMessage(_builder.toString());
        EAttribute _feature_UpperBound = MetaPackage.eINSTANCE.getFeature_UpperBound();
        issue.setFeature(_feature_UpperBound);
        return issue;
      } else {
        if (((att.getUpperBound() == (-1)) && (att.getUpperBound() != superAtt.getUpperBound()))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superAtt.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          EAttribute _feature_UpperBound_1 = MetaPackage.eINSTANCE.getFeature_UpperBound();
          issue.setFeature(_feature_UpperBound_1);
          return issue;
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkMultiplicityAndAssignment(final ReferenceAssignment ra) {
    EList<EntityDeclaration> _assignments = ra.getAssignments();
    int _size = 0;
    if (_assignments!=null) {
      _size=_assignments.size();
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
      _builder.append(_lowerBound_1, "");
      _builder.append(".");
      issue.setMessage(_builder.toString());
      issue.setSource(ra);
      EReference _referenceAssignment_Assignments = MetaPackage.eINSTANCE.getReferenceAssignment_Assignments();
      issue.setFeature(_referenceAssignment_Assignments);
      issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
      return issue;
    } else {
      if (((nAssgns > ref.getUpperBound()) && (ref.getUpperBound() > 0))) {
        final ValidationWarning issue_1 = new ValidationWarning();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Number of assignments must equal or less than ");
        int _upperBound = ref.getUpperBound();
        _builder_1.append(_upperBound, "");
        _builder_1.append(".");
        issue_1.setMessage(_builder_1.toString());
        issue_1.setSource(ra);
        EReference _referenceAssignment_Assignments_1 = MetaPackage.eINSTANCE.getReferenceAssignment_Assignments();
        issue_1.setFeature(_referenceAssignment_Assignments_1);
        issue_1.setCode(LinguisticRules.INVALID_MULTIPLICITY);
        return issue_1;
      } else {
        return null;
      }
    }
  }
  
  protected ValidationIssue _checkMultiplicityAndAssignment(final AttributeAssignment aa) {
    EList<Individual> _individualAssignments = aa.getIndividualAssignments();
    int _size = 0;
    if (_individualAssignments!=null) {
      _size=_individualAssignments.size();
    }
    EList<Individual> _unnamedIndividualAssignments = aa.getUnnamedIndividualAssignments();
    int _size_1 = 0;
    if (_unnamedIndividualAssignments!=null) {
      _size_1=_unnamedIndividualAssignments.size();
    }
    int _plus = (_size + _size_1);
    EList<Literal> _literalAssignments = aa.getLiteralAssignments();
    int _size_2 = 0;
    if (_literalAssignments!=null) {
      _size_2=_literalAssignments.size();
    }
    final int nAssgns = (_plus + _size_2);
    final Attribute att = aa.getAttribute();
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(aa);
    EReference _attributeAssignment_Attribute = MetaPackage.eINSTANCE.getAttributeAssignment_Attribute();
    issue.setFeature(_attributeAssignment_Attribute);
    issue.setCode(LinguisticRules.INVALID_MULTIPLICITY);
    int _lowerBound = att.getLowerBound();
    boolean _lessThan = (nAssgns < _lowerBound);
    if (_lessThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Number of assignments must equal or greater than ");
      int _lowerBound_1 = att.getLowerBound();
      _builder.append(_lowerBound_1, "");
      _builder.append(".");
      issue.setMessage(_builder.toString());
      return issue;
    } else {
      if (((nAssgns > att.getUpperBound()) && (att.getUpperBound() > 0))) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Number of assignments must equal or less than ");
        int _upperBound = att.getUpperBound();
        _builder_1.append(_upperBound, "");
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
    final ML2Class assigType = ref.get_type();
    final ValidationError issue = new ValidationError();
    issue.setSource(ra);
    EReference _referenceAssignment_Assignments = MetaPackage.eINSTANCE.getReferenceAssignment_Assignments();
    issue.setFeature(_referenceAssignment_Assignments);
    EList<EntityDeclaration> _assignments = ra.getAssignments();
    for (final EntityDeclaration assig : _assignments) {
      boolean _isConformantTo = this._mL2Util.isConformantTo(assig, assigType);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = assigType.getName();
        _builder.append(_name, "");
        _builder.append(".");
        issue.setMessage(_builder.toString());
        EList<EntityDeclaration> _assignments_1 = ra.getAssignments();
        int _indexOf = _assignments_1.indexOf(assig);
        issue.setIndex(_indexOf);
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkFeatureAssignmentType(final AttributeAssignment aa) {
    final Attribute att = aa.getAttribute();
    final HashSet<EntityDeclaration> entityAssigs = new HashSet<EntityDeclaration>();
    EList<Individual> _individualAssignments = aa.getIndividualAssignments();
    entityAssigs.addAll(_individualAssignments);
    EList<Individual> _unnamedIndividualAssignments = aa.getUnnamedIndividualAssignments();
    entityAssigs.addAll(_unnamedIndividualAssignments);
    final ValidationError issue = new ValidationError();
    issue.setSource(aa);
    EReference _attributeAssignment_Attribute = MetaPackage.eINSTANCE.getAttributeAssignment_Attribute();
    issue.setFeature(_attributeAssignment_Attribute);
    for (final EntityDeclaration ent : entityAssigs) {
      DataType __type = att.get_type();
      boolean _isConformantTo = this._mL2Util.isConformantTo(ent, __type);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        DataType __type_1 = att.get_type();
        String _name = __type_1.getName();
        _builder.append(_name, "");
        _builder.append(".");
        issue.setMessage(_builder.toString());
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    EList<Literal> _literalAssignments = aa.getLiteralAssignments();
    for (final Literal lit : _literalAssignments) {
      PrimitiveType _primitiveType = att.getPrimitiveType();
      boolean _isConformantTo_1 = this._mL2Util.isConformantTo(lit, _primitiveType);
      boolean _not_1 = (!_isConformantTo_1);
      if (_not_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("All assignments must be instances of ");
        PrimitiveType _primitiveType_1 = att.getPrimitiveType();
        _builder_1.append(_primitiveType_1, "");
        _builder_1.append(".");
        issue.setMessage(_builder_1.toString());
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  public ValidationIssue checkRegularityAndContainer(final Feature f) {
    Feature _regulatedFeature = f.getRegulatedFeature();
    boolean _tripleEquals = (_regulatedFeature == null);
    if (_tripleEquals) {
      return null;
    } else {
      EObject _eContainer = f.eContainer();
      if ((_eContainer instanceof FOClass)) {
        final ValidationError issue = new ValidationError();
        issue.setSource(f);
        EReference _feature_RegulatedFeature = MetaPackage.eINSTANCE.getFeature_RegulatedFeature();
        issue.setFeature(_feature_RegulatedFeature);
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
            EAttribute _feature_RegularityType = MetaPackage.eINSTANCE.getFeature_RegularityType();
            issue_1.setFeature(_feature_RegularityType);
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("This type of regularity feature only applies to numbers.");
            issue_1.setMessage(_builder_1.toString());
            issue_1.setCode(LinguisticRules.RESTRICTED_REGULARITY_TYPE);
            return issue_1;
          }
        } else {
          if ((Objects.equal(f.getRegularityType(), RegularityFeatureType.DETERMINES_ALLOWED_TYPES) || Objects.equal(f.getRegularityType(), RegularityFeatureType.DETERMINES_TYPE))) {
            if (((f instanceof Attribute) && (!((Attribute) f).eIsSet(MetaPackage.eINSTANCE.getAttribute__type())))) {
              final ValidationError issue_2 = new ValidationError();
              issue_2.setSource(f);
              EAttribute _feature_RegularityType_1 = MetaPackage.eINSTANCE.getFeature_RegularityType();
              issue_2.setFeature(_feature_RegularityType_1);
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
  
  public ValidationIssue checkInstantiatedRegularities(final ML2Class c) {
    Set<Feature> _allFeatures = this._mL2Util.getAllFeatures(c);
    final Function1<Feature, Boolean> _function = (Feature it) -> {
      Feature _regulatedFeature = it.getRegulatedFeature();
      return Boolean.valueOf((_regulatedFeature != null));
    };
    Iterable<Feature> _filter = IterableExtensions.<Feature>filter(_allFeatures, _function);
    final Set<Feature> rFeatures = IterableExtensions.<Feature>toSet(_filter);
    EList<FeatureAssignment> _assignments = c.getAssignments();
    final Consumer<FeatureAssignment> _function_1 = (FeatureAssignment f) -> {
      if ((f instanceof AttributeAssignment)) {
        Attribute _attribute = ((AttributeAssignment)f).getAttribute();
        rFeatures.remove(_attribute);
      } else {
        if ((f instanceof ReferenceAssignment)) {
          Reference _reference = ((ReferenceAssignment)f).getReference();
          rFeatures.remove(_reference);
        }
      }
    };
    _assignments.forEach(_function_1);
    boolean _isEmpty = rFeatures.isEmpty();
    if (_isEmpty) {
      return null;
    }
    Set<ML2Class> _classHierarchy = this._mL2Util.classHierarchy(c);
    final Consumer<ML2Class> _function_2 = (ML2Class sc) -> {
      EList<FeatureAssignment> _assignments_1 = sc.getAssignments();
      final Consumer<FeatureAssignment> _function_3 = (FeatureAssignment f) -> {
        if ((f instanceof AttributeAssignment)) {
          Attribute _attribute = ((AttributeAssignment)f).getAttribute();
          rFeatures.remove(_attribute);
        } else {
          if ((f instanceof ReferenceAssignment)) {
            Reference _reference = ((ReferenceAssignment)f).getReference();
            rFeatures.remove(_reference);
          }
        }
      };
      _assignments_1.forEach(_function_3);
    };
    _classHierarchy.forEach(_function_2);
    boolean _isEmpty_1 = rFeatures.isEmpty();
    if (_isEmpty_1) {
      return null;
    }
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(c);
    EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
    issue.setFeature(_entityDeclaration_Name);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The regularity feature ");
    Feature _head = IterableExtensions.<Feature>head(rFeatures);
    String _name = _head.getName();
    _builder.append(_name, "");
    _builder.append(" should have an assigned value.");
    issue.setMessage(_builder.toString());
    issue.setCode(LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
    return issue;
  }
  
  public ValidationIssue containsReferences(final DataType d) {
    EList<Reference> _references = d.getReferences();
    boolean _isEmpty = _references.isEmpty();
    if (_isEmpty) {
      return null;
    } else {
      final ValidationWarning i = new ValidationWarning();
      i.setSource(d);
      EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
      i.setFeature(_entityDeclaration_Name);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The use of references on datatypes might be unwanted.");
      i.setMessage(_builder.toString());
      i.setCode(LinguisticRules.UNWANTED_REFERENCES_ON_DATATYPES);
      return i;
    }
  }
  
  protected ValidationIssue _checkRegularityFeatureConformance(final AttributeAssignment atta) {
    final Attribute att = atta.getAttribute();
    final LinkedHashSet<Attribute> regAttSet = new LinkedHashSet<Attribute>();
    EObject _eContainer = atta.eContainer();
    final Set<ML2Class> knowClasses = this._mL2Util.getRechableClasses(((EntityDeclaration) _eContainer));
    final Consumer<ML2Class> _function = (ML2Class c) -> {
      EList<Attribute> _attributes = c.getAttributes();
      final Consumer<Attribute> _function_1 = (Attribute it) -> {
        Feature _regulatedFeature = it.getRegulatedFeature();
        boolean _equals = Objects.equal(_regulatedFeature, att);
        if (_equals) {
          regAttSet.add(it);
        }
      };
      _attributes.forEach(_function_1);
    };
    knowClasses.forEach(_function);
    boolean _isEmpty = regAttSet.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final LinkedHashSet<AttributeAssignment> regAttAssigSet = new LinkedHashSet<AttributeAssignment>();
    EObject _eContainer_1 = atta.eContainer();
    EList<ML2Class> _instantiatedClasses = ((EntityDeclaration) _eContainer_1).getInstantiatedClasses();
    for (final ML2Class c : _instantiatedClasses) {
      EList<FeatureAssignment> _assignments = c.getAssignments();
      for (final FeatureAssignment it : _assignments) {
        if ((it instanceof AttributeAssignment)) {
          Attribute _attribute = ((AttributeAssignment)it).getAttribute();
          boolean _contains = regAttSet.contains(_attribute);
          if (_contains) {
            regAttAssigSet.add(((AttributeAssignment)it));
          }
        }
      }
    }
    boolean _isEmpty_1 = regAttAssigSet.isEmpty();
    if (_isEmpty_1) {
      return null;
    }
    for (final AttributeAssignment regAttAssig : regAttAssigSet) {
      for (final Attribute regAtt : regAttSet) {
        Attribute _attribute_1 = regAttAssig.getAttribute();
        boolean _notEquals = (!Objects.equal(_attribute_1, regAtt));
        if (_notEquals) {
        } else {
          RegularityFeatureType _regularityType = regAtt.getRegularityType();
          boolean _isConformanTo = this._mL2Util.isConformanTo(atta, _regularityType, regAttAssig);
          boolean _not = (!_isConformanTo);
          if (_not) {
            final ValidationWarning i = new ValidationWarning();
            i.setSource(atta);
            EReference _attributeAssignment_Attribute = MetaPackage.eINSTANCE.getAttributeAssignment_Attribute();
            i.setFeature(_attributeAssignment_Attribute);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Assignment is non-conformant to the regularity feature ");
            String _name = regAtt.getName();
            _builder.append(_name, "");
            _builder.append(" of ");
            EObject _eContainer_2 = regAtt.eContainer();
            String _name_1 = ((ML2Class) _eContainer_2).getName();
            _builder.append(_name_1, "");
            _builder.append(".");
            i.setMessage(_builder.toString());
            i.setCode(LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT);
            return i;
          }
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkRegularityFeatureConformance(final ReferenceAssignment refa) {
    final Reference ref = refa.getReference();
    final LinkedHashSet<Reference> regRefSet = new LinkedHashSet<Reference>();
    EObject _eContainer = refa.eContainer();
    final Set<ML2Class> knowClasses = this._mL2Util.getRechableClasses(((EntityDeclaration) _eContainer));
    final Consumer<ML2Class> _function = (ML2Class c) -> {
      EList<Reference> _references = c.getReferences();
      final Consumer<Reference> _function_1 = (Reference it) -> {
        Feature _regulatedFeature = it.getRegulatedFeature();
        boolean _equals = Objects.equal(_regulatedFeature, ref);
        if (_equals) {
          regRefSet.add(it);
        }
      };
      _references.forEach(_function_1);
    };
    knowClasses.forEach(_function);
    boolean _isEmpty = regRefSet.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final LinkedHashSet<ReferenceAssignment> regRefAssigSet = new LinkedHashSet<ReferenceAssignment>();
    EObject _eContainer_1 = refa.eContainer();
    EList<ML2Class> _instantiatedClasses = ((EntityDeclaration) _eContainer_1).getInstantiatedClasses();
    for (final ML2Class c : _instantiatedClasses) {
      EList<FeatureAssignment> _assignments = c.getAssignments();
      for (final FeatureAssignment it : _assignments) {
        if ((it instanceof ReferenceAssignment)) {
          Reference _reference = ((ReferenceAssignment)it).getReference();
          boolean _contains = regRefSet.contains(_reference);
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
      for (final Reference regRef : regRefSet) {
        RegularityFeatureType _regularityType = regRef.getRegularityType();
        boolean _isConformanTo = this._mL2Util.isConformanTo(refa, _regularityType, regRefAssig);
        boolean _not = (!_isConformanTo);
        if (_not) {
          final ValidationWarning i = new ValidationWarning();
          i.setSource(refa);
          EReference _referenceAssignment_Reference = MetaPackage.eINSTANCE.getReferenceAssignment_Reference();
          i.setFeature(_referenceAssignment_Reference);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Assignment is non-conformant to the regularity feature ");
          String _name = regRef.getName();
          _builder.append(_name, "");
          _builder.append(" of ");
          EObject _eContainer_2 = regRef.eContainer();
          String _name_1 = ((ML2Class) _eContainer_2).getName();
          _builder.append(_name_1, "");
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
  
  public ValidationIssue checkRegularityFeatureConformance(final FeatureAssignment atta) {
    if (atta instanceof AttributeAssignment) {
      return _checkRegularityFeatureConformance((AttributeAssignment)atta);
    } else if (atta instanceof ReferenceAssignment) {
      return _checkRegularityFeatureConformance((ReferenceAssignment)atta);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(atta).toString());
    }
  }
}
