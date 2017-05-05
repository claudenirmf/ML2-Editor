package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.meta.Attribute;
import br.ufes.inf.nemo.ml2.meta.AttributeAssignment;
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
import br.ufes.inf.nemo.ml2.meta.Reference;
import br.ufes.inf.nemo.ml2.meta.ReferenceAssignment;
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
  
  public final static String INVALID_ENTITY_DECLARATION_NAME = "br.ufes.inf.nemo.ontol.InvalidEntityDeclarationName";
  
  public final static String INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.ontol.InvalidClassSpecialization";
  
  public final static String CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.ontol.CycliSpecialization";
  
  public final static String INVALID_CATEGORIZED_CLASS = "br.ufes.inf.nemo.ontol.InvalidCategorizedClass";
  
  public final static String INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.ontol.InvalidPowertypeRelation";
  
  public final static String INVALID_SUBORDINATOR = "br.ufes.inf.nemo.ontol.InvalidSubordinator";
  
  public final static String DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.ontol.DuplicatedEntityName";
  
  public final static String INVALID_GENERALIZATION_SET_MEMBERS = "br.ufes.inf.nemo.ontol.InvalidGeneralizationSetMembers";
  
  public final static String MISSING_SPECIALIZATION_THROUGH_SUBODINATION = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughSubordination";
  
  public final static String SIMPLE_SUBORDINATION_CYCLE = "br.ufes.inf.nemo.ontol.SimpleSubordinationCycle";
  
  public final static String SPECILIZATION_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.ontol.SpecializationOfDisjointClasses";
  
  public final static String INSTANCE_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.ontol.InstanceOfDisjointClasses";
  
  public final static String MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET = "br.ufes.inf.nemo.ontol.MissingInstantiationOfCompleteGeneralizationSet";
  
  public final static String INVALID_MULTIPLICITY = "br.ufes.inf.nemo.ontol.InvalidMultiplicity";
  
  public final static String NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.ontol.NonConformantAssigment";
  
  public final static String FIRST_ORDER_REGULARITY = "br.ufes.inf.nemo.ontol.FirstOrderRegularity";
  
  public final static String MISSING_ASSIGNMENT_BY_REGULARITY = "br.ufes.inf.nemo.ontol.MissingAssignmentByRegularity";
  
  public boolean isNameValid(final EntityDeclaration e) {
    if (((!e.getName().equals(StringExtensions.toFirstLower(e.getName()))) || (e.eContainer() instanceof AttributeAssignment))) {
      return true;
    } else {
      return false;
    }
  }
  
  public boolean isValidSpecialization(final ML2Class c) {
    EList<ML2Class> _superClasses = c.getSuperClasses();
    final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
      return Boolean.valueOf(Objects.equal(it, c));
    };
    boolean _exists = IterableExtensions.<ML2Class>exists(_superClasses, _function);
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
              EList<ML2Class> _superClasses_1 = ((HOClass)c).getSuperClasses();
              final Function1<ML2Class, Boolean> _function_1 = (ML2Class it) -> {
                boolean _xifexpression = false;
                if (((it instanceof HOClass) && (!Objects.equal(((HOClass) it).getOrder(), ((HOClass)c).getOrder())))) {
                  _xifexpression = true;
                } else {
                  _xifexpression = false;
                }
                return Boolean.valueOf(_xifexpression);
              };
              boolean _exists_1 = IterableExtensions.<ML2Class>exists(_superClasses_1, _function_1);
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
  
  public boolean hasValidBasetype(final ML2Class c) {
    final ML2Class b = c.getCategorizedClass();
    boolean _equals = Objects.equal(b, null);
    if (_equals) {
      return true;
    } else {
      if ((c instanceof HOClass)) {
        if ((b instanceof OrderlessClass)) {
          return false;
        } else {
          Integer _order = ((HOClass)c).getOrder();
          boolean _equals_1 = ((_order).intValue() == MLTRules.MIN_ORDER);
          if (_equals_1) {
            if ((b instanceof FOClass)) {
              return true;
            } else {
              return false;
            }
          } else {
            if ((((((HOClass)c).getOrder()).intValue() != MLTRules.MIN_ORDER) && (b instanceof HOClass))) {
              Integer _order_1 = ((HOClass)c).getOrder();
              Integer _order_2 = ((HOClass) b).getOrder();
              int _plus = ((_order_2).intValue() + 1);
              return ((_order_1).intValue() == _plus);
            }
          }
        }
      } else {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasValidPowertypeRelation(final ML2Class c) {
    final ML2Class b = c.getPowertypeOf();
    boolean _equals = Objects.equal(b, null);
    if (_equals) {
      return true;
    } else {
      if ((c instanceof HOClass)) {
        if ((b instanceof OrderlessClass)) {
          return false;
        } else {
          Integer _order = ((HOClass)c).getOrder();
          boolean _equals_1 = ((_order).intValue() == MLTRules.MIN_ORDER);
          if (_equals_1) {
            if ((b instanceof FOClass)) {
              return true;
            } else {
              return false;
            }
          } else {
            if ((((((HOClass)c).getOrder()).intValue() != MLTRules.MIN_ORDER) && (b instanceof HOClass))) {
              Integer _order_1 = ((HOClass)c).getOrder();
              Integer _order_2 = ((HOClass) b).getOrder();
              int _plus = ((_order_2).intValue() + 1);
              return ((_order_1).intValue() == _plus);
            }
          }
        }
      } else {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasValidSubordinators(final ML2Class c) {
    if ((c instanceof HOClass)) {
      EList<ML2Class> _subordinators = ((HOClass)c).getSubordinators();
      final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
        boolean _equals = Objects.equal(it, c);
        if (_equals) {
          return Boolean.valueOf(true);
        } else {
          if ((it instanceof FOClass)) {
            return Boolean.valueOf(true);
          } else {
            if (((it instanceof HOClass) && (!Objects.equal(((HOClass) it).getOrder(), ((HOClass)c).getOrder())))) {
              return Boolean.valueOf(true);
            } else {
              return Boolean.valueOf(false);
            }
          }
        }
      };
      boolean _exists = IterableExtensions.<ML2Class>exists(_subordinators, _function);
      return (!_exists);
    } else {
      return true;
    }
  }
  
  public boolean duplicatedEntityName(final EntityDeclaration e) {
    EObject _eContainer = e.eContainer();
    if ((_eContainer instanceof AttributeAssignment)) {
      return false;
    }
    EObject _eContainer_1 = e.eContainer();
    final ML2Model ML2Class = ((ML2Model) _eContainer_1);
    EList<ModelElement> _elements = ML2Class.getElements();
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      boolean _xifexpression = false;
      if ((it instanceof EntityDeclaration)) {
        _xifexpression = (((EntityDeclaration)it).getName().equals(e.getName()) && (!Objects.equal(it, e)));
      } else {
        _xifexpression = false;
      }
      return Boolean.valueOf(_xifexpression);
    };
    return IterableExtensions.<ModelElement>exists(_elements, _function);
  }
  
  public boolean hasValidMembers(final GeneralizationSet gs) {
    EList<ML2Class> _specifics = gs.getSpecifics();
    final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
      EList<ML2Class> _superClasses = it.getSuperClasses();
      ML2Class _general = gs.getGeneral();
      boolean _contains = _superClasses.contains(_general);
      return Boolean.valueOf((!_contains));
    };
    boolean _exists = IterableExtensions.<ML2Class>exists(_specifics, _function);
    if (_exists) {
      return false;
    } else {
      if (((!Objects.equal(gs.getCategorizer().getCategorizedClass(), null)) && (!Objects.equal(gs.getCategorizer().getCategorizedClass(), gs.getGeneral())))) {
        return false;
      } else {
        if (((!Objects.equal(gs.getCategorizer().getCategorizedClass(), null)) && IterableExtensions.<ML2Class>exists(gs.getSpecifics(), ((Function1<ML2Class, Boolean>) (ML2Class it) -> {
          EList<ML2Class> _instantiatedClasses = it.getInstantiatedClasses();
          ML2Class _categorizer = gs.getCategorizer();
          boolean _contains = _instantiatedClasses.contains(_categorizer);
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
      boolean _notEquals = (!Objects.equal(_subordinators, null));
      if (_notEquals) {
        EList<ML2Class> _subordinators_1 = it.getSubordinators();
        subordinated.addAll(_subordinators_1);
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
      LinkedHashSet<ML2Class> _allInstantiatedClasses = this._mL2Util.getAllInstantiatedClasses(it);
      superClassesIof.addAll(_allInstantiatedClasses);
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
    boolean _equals = Objects.equal(_subordinators, null);
    if (_equals) {
      return false;
    } else {
      EList<ML2Class> _subordinators_1 = c.getSubordinators();
      final Function1<ML2Class, Boolean> _function = (ML2Class sc) -> {
        boolean _or = false;
        boolean _or_1 = false;
        boolean _equals_1 = Objects.equal(sc, c);
        if (_equals_1) {
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
      return IterableExtensions.<ML2Class>exists(_subordinators_1, _function);
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
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Reference ref) {
    EList<Reference> _subsetOf = ref.getSubsetOf();
    boolean _equals = Objects.equal(_subsetOf, null);
    if (_equals) {
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
        EAttribute _feature_LowerBound = MetaPackage.eINSTANCE.getFeature_LowerBound();
        issue.setFeature(_feature_LowerBound);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superRef.getName();
        _builder.append(_name, "");
        _builder.append(").");
        issue.setMessage(_builder.toString());
        return issue;
      } else {
        if (((ref.getUpperBound() > superRef.getUpperBound()) && (superRef.getUpperBound() > 0))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superRef.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          EAttribute _feature_UpperBound = MetaPackage.eINSTANCE.getFeature_UpperBound();
          issue.setFeature(_feature_UpperBound);
          return issue;
        } else {
          if (((ref.getUpperBound() == (-1)) && (ref.getUpperBound() != superRef.getUpperBound()))) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("The cardinality must be as restrictive as the the subsetted one (");
            String _name_2 = superRef.getName();
            _builder_2.append(_name_2, "");
            _builder_2.append(").");
            issue.setMessage(_builder_2.toString());
            EAttribute _feature_UpperBound_1 = MetaPackage.eINSTANCE.getFeature_UpperBound();
            issue.setFeature(_feature_UpperBound_1);
            return issue;
          }
        }
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkSubsettedMultiplicity(final Attribute att) {
    EList<Attribute> _subsetOf = att.getSubsetOf();
    boolean _equals = Objects.equal(_subsetOf, null);
    if (_equals) {
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
        EAttribute _feature_LowerBound = MetaPackage.eINSTANCE.getFeature_LowerBound();
        issue.setFeature(_feature_LowerBound);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The cardinality must be as restrictive as the the subsetted one (");
        String _name = superAtt.getName();
        _builder.append(_name, "");
        _builder.append(").");
        issue.setMessage(_builder.toString());
        return issue;
      } else {
        if (((att.getUpperBound() > superAtt.getUpperBound()) && (superAtt.getUpperBound() > 0))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The cardinality must be as restrictive as the the subsetted one (");
          String _name_1 = superAtt.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append(").");
          issue.setMessage(_builder_1.toString());
          EAttribute _feature_UpperBound = MetaPackage.eINSTANCE.getFeature_UpperBound();
          issue.setFeature(_feature_UpperBound);
          return issue;
        } else {
          if (((att.getUpperBound() == (-1)) && (att.getUpperBound() != superAtt.getUpperBound()))) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("The cardinality must be as restrictive as the the subsetted one (");
            String _name_2 = superAtt.getName();
            _builder_2.append(_name_2, "");
            _builder_2.append(").");
            issue.setMessage(_builder_2.toString());
            EAttribute _feature_UpperBound_1 = MetaPackage.eINSTANCE.getFeature_UpperBound();
            issue.setFeature(_feature_UpperBound_1);
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
  
  protected ValidationIssue _checkPropertyAssignmentType(final ReferenceAssignment ra) {
    final Reference ref = ra.getReference();
    final ML2Class assigType = ref.get_type();
    final ValidationError issue = new ValidationError();
    issue.setSource(ra);
    EReference _referenceAssignment_Assignments = MetaPackage.eINSTANCE.getReferenceAssignment_Assignments();
    issue.setFeature(_referenceAssignment_Assignments);
    EList<EntityDeclaration> _assignments = ra.getAssignments();
    for (final EObject obj : _assignments) {
      boolean _isConformantTo = this._mL2Util.isConformantTo(obj, assigType);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = assigType.getName();
        _builder.append(_name, "");
        _builder.append(".");
        issue.setMessage(_builder.toString());
        EList<EntityDeclaration> _assignments_1 = ra.getAssignments();
        int _indexOf = _assignments_1.indexOf(obj);
        issue.setIndex(_indexOf);
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  protected ValidationIssue _checkPropertyAssignmentType(final AttributeAssignment aa) {
    final Attribute att = aa.getAttribute();
    final DataType assigType = att.get_type();
    final ValidationError issue = new ValidationError();
    issue.setSource(aa);
    EReference _attributeAssignment_Attribute = MetaPackage.eINSTANCE.getAttributeAssignment_Attribute();
    issue.setFeature(_attributeAssignment_Attribute);
    EList<Individual> _individualAssignments = aa.getIndividualAssignments();
    for (final EObject obj : _individualAssignments) {
      boolean _isConformantTo = this._mL2Util.isConformantTo(obj, assigType);
      boolean _not = (!_isConformantTo);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("All assignments must be instances of ");
        String _name = assigType.getName();
        _builder.append(_name, "");
        _builder.append(".");
        issue.setMessage(_builder.toString());
        EList<Individual> _individualAssignments_1 = aa.getIndividualAssignments();
        int _indexOf = _individualAssignments_1.indexOf(obj);
        issue.setIndex(_indexOf);
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    EList<Individual> _unnamedIndividualAssignments = aa.getUnnamedIndividualAssignments();
    for (final EObject obj_1 : _unnamedIndividualAssignments) {
      boolean _isConformantTo_1 = this._mL2Util.isConformantTo(obj_1, assigType);
      boolean _not_1 = (!_isConformantTo_1);
      if (_not_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("All assignments must be instances of ");
        String _name_1 = assigType.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(".");
        issue.setMessage(_builder_1.toString());
        EList<Individual> _unnamedIndividualAssignments_1 = aa.getUnnamedIndividualAssignments();
        int _indexOf_1 = _unnamedIndividualAssignments_1.indexOf(obj_1);
        issue.setIndex(_indexOf_1);
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    EList<Literal> _literalAssignments = aa.getLiteralAssignments();
    for (final EObject obj_2 : _literalAssignments) {
      boolean _isConformantTo_2 = this._mL2Util.isConformantTo(obj_2, assigType);
      boolean _not_2 = (!_isConformantTo_2);
      if (_not_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("All assignments must be instances of ");
        String _name_2 = assigType.getName();
        _builder_2.append(_name_2, "");
        _builder_2.append(".");
        issue.setMessage(_builder_2.toString());
        EList<Literal> _literalAssignments_1 = aa.getLiteralAssignments();
        int _indexOf_2 = _literalAssignments_1.indexOf(obj_2);
        issue.setIndex(_indexOf_2);
        issue.setCode(LinguisticRules.NON_CONFORMANT_ASSIGNMENT);
        return issue;
      }
    }
    return null;
  }
  
  public ValidationIssue checkRegularityAndContainer(final Feature f) {
    if (((!Objects.equal(f.getRegulatedFeature(), null)) && (f.eContainer() instanceof FOClass))) {
      final ValidationError issue = new ValidationError();
      issue.setSource(f);
      EReference _feature_RegulatedFeature = MetaPackage.eINSTANCE.getFeature_RegulatedFeature();
      issue.setFeature(_feature_RegulatedFeature);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Regularity attributes do not apply to first-order classes.");
      issue.setMessage(_builder.toString());
      issue.setCode(LinguisticRules.FIRST_ORDER_REGULARITY);
      return issue;
    }
    return null;
  }
  
  public ValidationIssue checkInstantiatedRegularities(final ML2Class c) {
    Set<Feature> _allFeatures = this._mL2Util.getAllFeatures(c);
    final Function1<Feature, Boolean> _function = (Feature it) -> {
      Feature _regulatedFeature = it.getRegulatedFeature();
      return Boolean.valueOf((!Objects.equal(_regulatedFeature, null)));
    };
    Iterable<Feature> _filter = IterableExtensions.<Feature>filter(_allFeatures, _function);
    final Set<Feature> features = IterableExtensions.<Feature>toSet(_filter);
    EList<FeatureAssignment> _assignments = c.getAssignments();
    final Consumer<FeatureAssignment> _function_1 = (FeatureAssignment f) -> {
      if ((f instanceof AttributeAssignment)) {
        Attribute _attribute = ((AttributeAssignment)f).getAttribute();
        features.remove(_attribute);
      } else {
        if ((f instanceof ReferenceAssignment)) {
          Reference _reference = ((ReferenceAssignment)f).getReference();
          features.remove(_reference);
        }
      }
    };
    _assignments.forEach(_function_1);
    boolean _isEmpty = features.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final ValidationWarning issue = new ValidationWarning();
    issue.setSource(c);
    EAttribute _entityDeclaration_Name = MetaPackage.eINSTANCE.getEntityDeclaration_Name();
    issue.setFeature(_entityDeclaration_Name);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The regularity property ");
    Feature _head = IterableExtensions.<Feature>head(features);
    String _name = _head.getName();
    _builder.append(_name, "");
    _builder.append(" should hava an assigned value.");
    issue.setMessage(_builder.toString());
    issue.setCode(LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
    return issue;
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
  
  public ValidationIssue checkPropertyAssignmentType(final FeatureAssignment aa) {
    if (aa instanceof AttributeAssignment) {
      return _checkPropertyAssignmentType((AttributeAssignment)aa);
    } else if (aa instanceof ReferenceAssignment) {
      return _checkPropertyAssignmentType((ReferenceAssignment)aa);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aa).toString());
    }
  }
}
