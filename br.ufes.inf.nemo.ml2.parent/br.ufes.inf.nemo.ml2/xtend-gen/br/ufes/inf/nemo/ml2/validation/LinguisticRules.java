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
import org.eclipse.emf.ecore.EObject;
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
  
  public final static String INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.meta.InvalidClassSpecialization";
  
  public final static String CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.meta.CycliSpecialization";
  
  public final static String INVALID_CATEGORIZED_CLASS = "br.ufes.inf.nemo.meta.InvalidCategorizedClass";
  
  public final static String INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.meta.InvalidPowertypeRelation";
  
  public final static String INVALID_SUBORDINATOR = "br.ufes.inf.nemo.meta.InvalidSubordinator";
  
  public final static String DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.meta.DuplicatedEntityName";
  
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
  
  public boolean isNameValid(final EntityDeclaration e) {
    if (((!e.getName().equals(StringExtensions.toFirstLower(e.getName()))) || (e.eContainer() instanceof AttributeAssignment))) {
      return true;
    } else {
      return false;
    }
  }
  
  public boolean isValidSpecialization(final ML2Class c) {
    final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
      return Boolean.valueOf(Objects.equal(it, c));
    };
    boolean _exists = IterableExtensions.<ML2Class>exists(c.getSuperClasses(), _function);
    if (_exists) {
      return false;
    } else {
      if (((c instanceof OrderlessClass) && IterableExtensions.<ML2Class>exists(c.getSuperClasses(), ((Function1<ML2Class, Boolean>) (ML2Class it) -> {
        return Boolean.valueOf((it instanceof OrderedClass));
      })))) {
        return false;
      } else {
        if (((c instanceof FOClass) && IterableExtensions.<ML2Class>exists(c.getSuperClasses(), ((Function1<ML2Class, Boolean>) (ML2Class it) -> {
          return Boolean.valueOf((it instanceof HOClass));
        })))) {
          return false;
        } else {
          if (((c instanceof HOClass) && IterableExtensions.<ML2Class>exists(c.getSuperClasses(), ((Function1<ML2Class, Boolean>) (ML2Class it) -> {
            return Boolean.valueOf((it instanceof FOClass));
          })))) {
            return false;
          } else {
            if ((c instanceof HOClass)) {
              final Function1<ML2Class, Boolean> _function_1 = (ML2Class it) -> {
                boolean _xifexpression = false;
                if (((it instanceof HOClass) && (!Objects.equal(((HOClass) it).getOrder(), ((HOClass)c).getOrder())))) {
                  _xifexpression = true;
                } else {
                  _xifexpression = false;
                }
                return Boolean.valueOf(_xifexpression);
              };
              boolean _exists_1 = IterableExtensions.<ML2Class>exists(((HOClass)c).getSuperClasses(), _function_1);
              return (!_exists_1);
            } else {
              return true;
            }
          }
        }
      }
    }
  }
  
  public boolean hasCyclicSpecialization(final ML2Class c, final Set<ML2Class> ch) {
    boolean _xifexpression = false;
    boolean _contains = ch.contains(c);
    if (_contains) {
      _xifexpression = true;
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
  
  public boolean hasValidCategorizedClass(final ML2Class c) {
    final ML2Class cat = c.getCategorizedClass();
    if ((cat == null)) {
      return true;
    } else {
      if ((c instanceof OrderlessClass)) {
        return (cat instanceof OrderlessClass);
      } else {
        if ((c instanceof HOClass)) {
          if ((cat instanceof OrderlessClass)) {
            if ((Objects.equal(((HOClass)c).getCategorizationType(), CategorizationType.COMPLETE_CATEGORIZER) || Objects.equal(((HOClass)c).getCategorizationType(), CategorizationType.PARTITIONER))) {
              return false;
            }
          } else {
            Integer _order = ((HOClass)c).getOrder();
            boolean _equals = ((_order).intValue() == MLTRules.MIN_ORDER);
            if (_equals) {
              return (!(cat instanceof HOClass));
            } else {
              if ((((((HOClass)c).getOrder()).intValue() != MLTRules.MIN_ORDER) && (cat instanceof HOClass))) {
                Integer _order_1 = ((HOClass)c).getOrder();
                Integer _order_2 = ((HOClass) cat).getOrder();
                int _plus = ((_order_2).intValue() + 1);
                return ((_order_1).intValue() == _plus);
              }
            }
          }
        } else {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean hasValidPowertypeRelation(final ML2Class c) {
    final ML2Class base = c.getPowertypeOf();
    if ((base == null)) {
      return true;
    } else {
      if ((c instanceof OrderlessClass)) {
        return (base instanceof OrderlessClass);
      } else {
        if ((c instanceof HOClass)) {
          if ((base instanceof OrderlessClass)) {
            return false;
          } else {
            Integer _order = ((HOClass)c).getOrder();
            boolean _equals = ((_order).intValue() == MLTRules.MIN_ORDER);
            if (_equals) {
              return (!(base instanceof HOClass));
            } else {
              if ((((((HOClass)c).getOrder()).intValue() != MLTRules.MIN_ORDER) && (base instanceof HOClass))) {
                Integer _order_1 = ((HOClass)c).getOrder();
                Integer _order_2 = ((HOClass) base).getOrder();
                int _plus = ((_order_2).intValue() + 1);
                return ((_order_1).intValue() == _plus);
              }
            }
          }
        } else {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean hasValidSubordinators(final ML2Class c) {
    if ((c instanceof OrderlessClass)) {
      final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
        return Boolean.valueOf((it instanceof OrderedClass));
      };
      boolean _exists = IterableExtensions.<ML2Class>exists(((OrderlessClass)c).getSubordinators(), _function);
      return (!_exists);
    } else {
      if ((c instanceof HOClass)) {
        final Function1<ML2Class, Boolean> _function_1 = (ML2Class it) -> {
          boolean _equals = Objects.equal(it, c);
          if (_equals) {
            return Boolean.valueOf(true);
          } else {
            if ((it instanceof FOClass)) {
              return Boolean.valueOf(true);
            } else {
              if ((it instanceof HOClass)) {
                Integer _order = ((HOClass)it).getOrder();
                Integer _order_1 = ((HOClass)c).getOrder();
                return Boolean.valueOf((!Objects.equal(_order, _order_1)));
              } else {
                return Boolean.valueOf(false);
              }
            }
          }
        };
        boolean _exists_1 = IterableExtensions.<ML2Class>exists(((HOClass)c).getSubordinators(), _function_1);
        return (!_exists_1);
      } else {
        return true;
      }
    }
  }
  
  public boolean duplicatedEntityName(final EntityDeclaration e) {
    EObject _eContainer = e.eContainer();
    if ((_eContainer instanceof AttributeAssignment)) {
      return false;
    }
    EObject _eContainer_1 = e.eContainer();
    final ML2Model ML2Class = ((ML2Model) _eContainer_1);
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      boolean _xifexpression = false;
      if ((it instanceof EntityDeclaration)) {
        _xifexpression = (((EntityDeclaration)it).getName().equals(e.getName()) && (!Objects.equal(it, e)));
      } else {
        _xifexpression = false;
      }
      return Boolean.valueOf(_xifexpression);
    };
    return IterableExtensions.<ModelElement>exists(ML2Class.getElements(), _function);
  }
  
  public boolean hasValidMembers(final GeneralizationSet gs) {
    final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
      boolean _contains = it.getSuperClasses().contains(gs.getGeneral());
      return Boolean.valueOf((!_contains));
    };
    boolean _exists = IterableExtensions.<ML2Class>exists(gs.getSpecifics(), _function);
    if (_exists) {
      return false;
    } else {
      if (((gs.getCategorizer().getCategorizedClass() != null) && (!Objects.equal(gs.getCategorizer().getCategorizedClass(), gs.getGeneral())))) {
        return false;
      } else {
        if (((gs.getCategorizer().getCategorizedClass() != null) && IterableExtensions.<ML2Class>exists(gs.getSpecifics(), ((Function1<ML2Class, Boolean>) (ML2Class it) -> {
          boolean _contains = it.getInstantiatedClasses().contains(gs.getCategorizer());
          return Boolean.valueOf((!_contains));
        })))) {
          return false;
        } else {
          return true;
        }
      }
    }
  }
  
  public boolean obeysSubordination(final ML2Class c, final Set<ML2Class> ch, final Set<ML2Class> iof) {
    final LinkedHashSet<ML2Class> subordinated = new LinkedHashSet<ML2Class>();
    final Consumer<ML2Class> _function = (ML2Class it) -> {
      EList<ML2Class> _subordinators = it.getSubordinators();
      boolean _tripleNotEquals = (_subordinators != null);
      if (_tripleNotEquals) {
        subordinated.addAll(it.getSubordinators());
      }
    };
    iof.forEach(_function);
    int _size = subordinated.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return true;
    }
    final LinkedHashSet<ML2Class> superClassesIof = new LinkedHashSet<ML2Class>();
    final Consumer<ML2Class> _function_1 = (ML2Class it) -> {
      superClassesIof.addAll(this._mL2Util.getAllInstantiatedClasses(it));
    };
    ch.forEach(_function_1);
    return superClassesIof.containsAll(subordinated);
  }
  
  /**
   * Checked scenarios:
   * <br> - C is subordinated to itself
   * <br> - C is subordinated to X, and X is subordinated to C
   * <br> - C is subordinated to X, but C is a super class to X
   */
  public boolean hasSimpleSubordinationCycle(final ML2Class c) {
    EList<ML2Class> _subordinators = c.getSubordinators();
    boolean _tripleEquals = (_subordinators == null);
    if (_tripleEquals) {
      return false;
    } else {
      final Function1<ML2Class, Boolean> _function = (ML2Class sc) -> {
        boolean _or = false;
        boolean _or_1 = false;
        boolean _equals = Objects.equal(sc, c);
        if (_equals) {
          _or_1 = true;
        } else {
          EList<ML2Class> _subordinators_1 = null;
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
      return IterableExtensions.<ML2Class>exists(c.getSubordinators(), _function);
    }
  }
  
  public ValidationIssue isSpecializingDisjointClasses(final ML2Class c, final Set<ML2Class> ch) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(c, MetaPackage.eINSTANCE.getGeneralizationSet());
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          EObject _eObject = c.eResource().getResourceSet().getEObject(obj.getEObjectURI(), true);
          gs = ((GeneralizationSet) _eObject);
        }
        if ((gs.isIsDisjoint() && (Sets.<ML2Class>intersection(ch, IterableExtensions.<ML2Class>toSet(gs.getSpecifics())).size() > 1))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = c.getName();
          _builder.append(_name);
          _builder.append(" is specializing disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            Sets.SetView<ML2Class> _intersection = Sets.<ML2Class>intersection(ch, IterableExtensions.<ML2Class>toSet(gs.getSpecifics()));
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
          issue.setFeature(MetaPackage.eINSTANCE.getEntityDeclaration_Name());
          issue.setSource(c);
          issue.setCode(LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue isInstanceOfDisjointClasses(final EntityDeclaration e, final LinkedHashSet<ML2Class> iof) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(e, MetaPackage.eINSTANCE.getGeneralizationSet());
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          EObject _eObject = e.eResource().getResourceSet().getEObject(obj.getEObjectURI(), true);
          gs = ((GeneralizationSet) _eObject);
        }
        if ((gs.isIsDisjoint() && (Sets.<ML2Class>intersection(iof, IterableExtensions.<ML2Class>toSet(gs.getSpecifics())).size() > 1))) {
          final ValidationWarning issue = new ValidationWarning();
          StringConcatenation _builder = new StringConcatenation();
          String _name = e.getName();
          _builder.append(_name);
          _builder.append(" is instance disjoint classes.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t");
          {
            Sets.SetView<ML2Class> _intersection = Sets.<ML2Class>intersection(iof, IterableExtensions.<ML2Class>toSet(gs.getSpecifics()));
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
          issue.setFeature(MetaPackage.eINSTANCE.getEntityDeclaration_Name());
          issue.setSource(e);
          issue.setCode(LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
          return issue;
        }
      }
    }
    return null;
  }
  
  public ValidationIssue missingInstantiationByCompleteness(final EntityDeclaration e, final LinkedHashSet<ML2Class> iof) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._mL2Index.getVisibleEObjectDescriptions(e, MetaPackage.eINSTANCE.getGeneralizationSet());
    for (final IEObjectDescription obj : _visibleEObjectDescriptions) {
      {
        EObject _eObjectOrProxy = obj.getEObjectOrProxy();
        GeneralizationSet gs = ((GeneralizationSet) _eObjectOrProxy);
        boolean _eIsProxy = gs.eIsProxy();
        if (_eIsProxy) {
          EObject _eObject = e.eResource().getResourceSet().getEObject(obj.getEObjectURI(), true);
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
          issue.setFeature(MetaPackage.eINSTANCE.getEntityDeclaration_Name());
          issue.setSource(e);
          issue.setCode(LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
          return issue;
        }
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
      int _lowerBound = ref.getLowerBound();
      int _lowerBound_1 = superRef.getLowerBound();
      boolean _lessThan = (_lowerBound < _lowerBound_1);
      if (_lessThan) {
        issue.setFeature(MetaPackage.eINSTANCE.getFeature_LowerBound());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superRef.getName();
        _builder.append(_name);
        _builder.append(").");
        issue.setMessage(_builder.toString());
        return issue;
      } else {
        if (((ref.getUpperBound() > superRef.getUpperBound()) && (superRef.getUpperBound() > 0))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superRef.getName();
          _builder_1.append(_name_1);
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          issue.setFeature(MetaPackage.eINSTANCE.getFeature_UpperBound());
          return issue;
        } else {
          if (((ref.getUpperBound() == (-1)) && (ref.getUpperBound() != superRef.getUpperBound()))) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("The cardinality must be as restrictive as the the subsetted one (");
            String _name_2 = superRef.getName();
            _builder_2.append(_name_2);
            _builder_2.append(").");
            issue.setMessage(_builder_2.toString());
            issue.setFeature(MetaPackage.eINSTANCE.getFeature_UpperBound());
            return issue;
          }
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
      int _lowerBound = att.getLowerBound();
      int _lowerBound_1 = superAtt.getLowerBound();
      boolean _lessThan = (_lowerBound < _lowerBound_1);
      if (_lessThan) {
        issue.setFeature(MetaPackage.eINSTANCE.getFeature_LowerBound());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superAtt.getName();
        _builder.append(_name);
        _builder.append(").");
        issue.setMessage(_builder.toString());
        return issue;
      } else {
        if (((att.getUpperBound() > superAtt.getUpperBound()) && (superAtt.getUpperBound() > 0))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superAtt.getName();
          _builder_1.append(_name_1);
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          issue.setFeature(MetaPackage.eINSTANCE.getFeature_UpperBound());
          return issue;
        } else {
          if (((att.getUpperBound() == (-1)) && (att.getUpperBound() != superAtt.getUpperBound()))) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("The cardinality must be as restrictive as the the subsetted one (");
            String _name_2 = superAtt.getName();
            _builder_2.append(_name_2);
            _builder_2.append(").");
            issue.setMessage(_builder_2.toString());
            issue.setFeature(MetaPackage.eINSTANCE.getFeature_UpperBound());
            return issue;
          }
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
      _builder.append(_lowerBound_1);
      _builder.append(".");
      issue.setMessage(_builder.toString());
      issue.setSource(ra);
      issue.setFeature(MetaPackage.eINSTANCE.getReferenceAssignment_Assignments());
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
        issue_1.setFeature(MetaPackage.eINSTANCE.getReferenceAssignment_Assignments());
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
    issue.setFeature(MetaPackage.eINSTANCE.getAttributeAssignment_Attribute());
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
    final ML2Class assigType = ref.get_type();
    final ValidationError issue = new ValidationError();
    issue.setSource(ra);
    issue.setFeature(MetaPackage.eINSTANCE.getReferenceAssignment_Assignments());
    EList<EntityDeclaration> _assignments = ra.getAssignments();
    for (final EntityDeclaration assig : _assignments) {
      boolean _isConformantTo = this._mL2Util.isConformantTo(assig, assigType);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = assigType.getName();
        _builder.append(_name);
        _builder.append(".");
        issue.setMessage(_builder.toString());
        issue.setIndex(ra.getAssignments().indexOf(assig));
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkFeatureAssignmentType(final AttributeAssignment aa) {
    final Attribute att = aa.getAttribute();
    final HashSet<EntityDeclaration> entityAssigs = new HashSet<EntityDeclaration>();
    entityAssigs.addAll(aa.getIndividualAssignments());
    entityAssigs.addAll(aa.getUnnamedIndividualAssignments());
    final ValidationError issue = new ValidationError();
    issue.setSource(aa);
    issue.setFeature(MetaPackage.eINSTANCE.getAttributeAssignment_Attribute());
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
    EList<Literal> _literalAssignments = aa.getLiteralAssignments();
    for (final Literal lit : _literalAssignments) {
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
        issue.setFeature(MetaPackage.eINSTANCE.getFeature_RegulatedFeature());
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
            issue_1.setFeature(MetaPackage.eINSTANCE.getFeature_RegularityType());
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
              issue_2.setFeature(MetaPackage.eINSTANCE.getFeature_RegularityType());
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
    final Function1<Feature, Boolean> _function = (Feature it) -> {
      Feature _regulatedFeature = it.getRegulatedFeature();
      return Boolean.valueOf((_regulatedFeature != null));
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
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(c);
    issue.setFeature(MetaPackage.eINSTANCE.getEntityDeclaration_Name());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The regularity feature ");
    String _name = IterableExtensions.<Feature>head(rFeatures).getName();
    _builder.append(_name);
    _builder.append(" should have an assigned value.");
    issue.setMessage(_builder.toString());
    issue.setCode(LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
    return issue;
  }
  
  public ValidationIssue containsReferences(final DataType d) {
    boolean _isEmpty = d.getReferences().isEmpty();
    if (_isEmpty) {
      return null;
    } else {
      final ValidationWarning i = new ValidationWarning();
      i.setSource(d);
      i.setFeature(MetaPackage.eINSTANCE.getEntityDeclaration_Name());
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
      final Consumer<Attribute> _function_1 = (Attribute it) -> {
        Feature _regulatedFeature = it.getRegulatedFeature();
        boolean _equals = Objects.equal(_regulatedFeature, att);
        if (_equals) {
          regAttSet.add(it);
        }
      };
      c.getAttributes().forEach(_function_1);
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
          boolean _contains = regAttSet.contains(((AttributeAssignment)it).getAttribute());
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
        Attribute _attribute = regAttAssig.getAttribute();
        boolean _notEquals = (!Objects.equal(_attribute, regAtt));
        if (_notEquals) {
        } else {
          boolean _isConformanTo = this._mL2Util.isConformanTo(atta, regAtt.getRegularityType(), regAttAssig);
          boolean _not = (!_isConformanTo);
          if (_not) {
            final ValidationWarning i = new ValidationWarning();
            i.setSource(atta);
            i.setFeature(MetaPackage.eINSTANCE.getAttributeAssignment_Attribute());
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Assignment is non-conformant to the regularity feature ");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t");
            String _name = regAtt.getName();
            _builder.append(_name, "\t\t\t\t\t\t");
            _builder.append(" of ");
            EObject _eContainer_2 = regAtt.eContainer();
            String _name_1 = ((ML2Class) _eContainer_2).getName();
            _builder.append(_name_1, "\t\t\t\t\t\t");
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
      final Consumer<Reference> _function_1 = (Reference it) -> {
        Feature _regulatedFeature = it.getRegulatedFeature();
        boolean _equals = Objects.equal(_regulatedFeature, ref);
        if (_equals) {
          regRefSet.add(it);
        }
      };
      c.getReferences().forEach(_function_1);
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
      for (final Reference regRef : regRefSet) {
        boolean _isConformanTo = this._mL2Util.isConformanTo(refa, regRef.getRegularityType(), regRefAssig);
        boolean _not = (!_isConformanTo);
        if (_not) {
          final ValidationWarning i = new ValidationWarning();
          i.setSource(refa);
          i.setFeature(MetaPackage.eINSTANCE.getReferenceAssignment_Reference());
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Assignment is non-conformant to the regularity feature ");
          _builder.newLine();
          _builder.append("\t\t\t\t\t\t");
          String _name = regRef.getName();
          _builder.append(_name, "\t\t\t\t\t\t");
          _builder.append(" of ");
          EObject _eContainer_2 = regRef.eContainer();
          String _name_1 = ((ML2Class) _eContainer_2).getName();
          _builder.append(_name_1, "\t\t\t\t\t\t");
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
