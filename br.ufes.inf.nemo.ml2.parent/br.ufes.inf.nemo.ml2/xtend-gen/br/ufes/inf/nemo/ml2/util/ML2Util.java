/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ml2.util;

import br.ufes.inf.nemo.ml2.meta.Attribute;
import br.ufes.inf.nemo.ml2.meta.AttributeAssignment;
import br.ufes.inf.nemo.ml2.meta.DataType;
import br.ufes.inf.nemo.ml2.meta.EntityDeclaration;
import br.ufes.inf.nemo.ml2.meta.Feature;
import br.ufes.inf.nemo.ml2.meta.Literal;
import br.ufes.inf.nemo.ml2.meta.ML2Boolean;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.ML2Number;
import br.ufes.inf.nemo.ml2.meta.ML2String;
import br.ufes.inf.nemo.ml2.meta.ModelElement;
import br.ufes.inf.nemo.ml2.meta.PrimitiveType;
import br.ufes.inf.nemo.ml2.meta.Reference;
import br.ufes.inf.nemo.ml2.meta.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.meta.RegularityFeatureType;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ML2Util {
  public Set<ML2Model> getRechableModels(final EntityDeclaration elem) {
    final LinkedHashSet<ML2Model> set = new LinkedHashSet<ML2Model>();
    boolean _isUnnamed = elem.isUnnamed();
    if (_isUnnamed) {
      EObject obj = elem.eContainer();
      while ((!(obj instanceof ML2Model))) {
        EObject _eContainer = obj.eContainer();
        obj = _eContainer;
      }
      set.add(((ML2Model) obj));
      EList<ML2Model> _includes = ((ML2Model) obj).getIncludes();
      set.addAll(_includes);
    } else {
      EObject _eContainer = elem.eContainer();
      set.add(((ML2Model) _eContainer));
      EObject _eContainer_1 = elem.eContainer();
      EList<ML2Model> _includes_1 = ((ML2Model) _eContainer_1).getIncludes();
      set.addAll(_includes_1);
    }
    return set;
  }
  
  public Set<ML2Class> getRechableClasses(final EntityDeclaration elem) {
    final LinkedHashSet<ML2Class> set = new LinkedHashSet<ML2Class>();
    Set<ML2Model> _rechableModels = this.getRechableModels(elem);
    final Consumer<ML2Model> _function = (ML2Model it) -> {
      EList<ModelElement> _elements = it.getElements();
      if (_elements!=null) {
        final Consumer<ModelElement> _function_1 = (ModelElement it_1) -> {
          if ((it_1 instanceof ML2Class)) {
            set.add(((ML2Class)it_1));
          }
        };
        _elements.forEach(_function_1);
      }
    };
    _rechableModels.forEach(_function);
    return set;
  }
  
  /**
   * Returns a set of all super types of the given <b>type</b>. The set does not
   * include the <b>type</b> unless it is in a specialization cycle.
   * 
   * @author Claudenir Fonseca
   */
  public Set<ML2Class> classHierarchy(final ML2Class c) {
    Set<ML2Class> _xblockexpression = null;
    {
      final LinkedHashSet<ML2Class> visited = new LinkedHashSet<ML2Class>();
      _xblockexpression = this.classHierarchy(c, visited);
    }
    return _xblockexpression;
  }
  
  private Set<ML2Class> classHierarchy(final ML2Class c, final LinkedHashSet<ML2Class> visited) {
    LinkedHashSet<ML2Class> _xblockexpression = null;
    {
      EList<ML2Class> _superClasses = c.getSuperClasses();
      for (final ML2Class current : _superClasses) {
        boolean _contains = visited.contains(current);
        boolean _not = (!_contains);
        if (_not) {
          visited.add(current);
          Set<ML2Class> _classHierarchy = this.classHierarchy(current, visited);
          visited.addAll(_classHierarchy);
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns a set containing the basic instantiated types of a given <b>entity</b>. It includes
   * direct declared fixed instantiations and indirectly instantiated powertypes.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public LinkedHashSet<ML2Class> getBasicInstantiatedClasses(final EntityDeclaration e) {
    EObject _eContainer = e.eContainer();
    if ((_eContainer instanceof AttributeAssignment)) {
      EObject _eContainer_1 = e.eContainer();
      final AttributeAssignment attAssign = ((AttributeAssignment) _eContainer_1);
      Attribute _attribute = attAssign.getAttribute();
      final DataType propClass = _attribute.get_type();
      final LinkedHashSet<ML2Class> basicInstantiatedClasses = new LinkedHashSet<ML2Class>();
      basicInstantiatedClasses.add(propClass);
      return basicInstantiatedClasses;
    }
    final LinkedHashSet<ML2Class> basicInstantiatedClasses_1 = new LinkedHashSet<ML2Class>();
    EList<ML2Class> _instantiatedClasses = e.getInstantiatedClasses();
    basicInstantiatedClasses_1.addAll(_instantiatedClasses);
    if ((e instanceof ML2Class)) {
      final Set<ML2Class> ch = this.classHierarchy(((ML2Class)e));
      Set<ML2Model> _rechableModels = this.getRechableModels(e);
      final Function1<ML2Model, EList<ModelElement>> _function = (ML2Model it) -> {
        return it.getElements();
      };
      Iterable<EList<ModelElement>> _map = IterableExtensions.<ML2Model, EList<ModelElement>>map(_rechableModels, _function);
      Iterable<ModelElement> _flatten = Iterables.<ModelElement>concat(_map);
      final Consumer<ModelElement> _function_1 = (ModelElement it) -> {
        if ((it instanceof ML2Class)) {
          final ML2Class aux = ((ML2Class)it).getPowertypeOf();
          if (((aux != null) && (Objects.equal(aux, e) || ch.contains(aux)))) {
            basicInstantiatedClasses_1.add(((ML2Class)it));
          }
        }
      };
      _flatten.forEach(_function_1);
      return basicInstantiatedClasses_1;
    } else {
      return basicInstantiatedClasses_1;
    }
  }
  
  /**
   * Returns a set containing all types instantiated by a given <b>entity</b>.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public LinkedHashSet<ML2Class> getAllInstantiatedClasses(final EntityDeclaration e) {
    LinkedHashSet<ML2Class> _xblockexpression = null;
    {
      final LinkedHashSet<ML2Class> visited = new LinkedHashSet<ML2Class>();
      LinkedHashSet<ML2Class> _basicInstantiatedClasses = this.getBasicInstantiatedClasses(e);
      final Consumer<ML2Class> _function = (ML2Class it) -> {
        visited.add(it);
        Set<ML2Class> _classHierarchy = this.classHierarchy(it);
        visited.addAll(_classHierarchy);
      };
      _basicInstantiatedClasses.forEach(_function);
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns a set containing all properties of a given <b>entity</b>.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public Set<Feature> getAllFeatures(final EntityDeclaration e) {
    final LinkedHashSet<Feature> features = new LinkedHashSet<Feature>();
    LinkedHashSet<ML2Class> _allInstantiatedClasses = this.getAllInstantiatedClasses(e);
    final Consumer<ML2Class> _function = (ML2Class it) -> {
      EList<Feature> _features = it.getFeatures();
      features.addAll(_features);
    };
    _allInstantiatedClasses.forEach(_function);
    return features;
  }
  
  public Set<Attribute> getAllAttributes(final EntityDeclaration e) {
    final LinkedHashSet<Attribute> attributes = new LinkedHashSet<Attribute>();
    LinkedHashSet<ML2Class> _allInstantiatedClasses = this.getAllInstantiatedClasses(e);
    final Consumer<ML2Class> _function = (ML2Class c) -> {
      EList<Feature> _features = c.getFeatures();
      final Consumer<Feature> _function_1 = (Feature it) -> {
        if ((it instanceof Attribute)) {
          attributes.add(((Attribute)it));
        }
      };
      _features.forEach(_function_1);
    };
    _allInstantiatedClasses.forEach(_function);
    return attributes;
  }
  
  public Set<Reference> getAllReferences(final EntityDeclaration e) {
    final LinkedHashSet<Reference> references = new LinkedHashSet<Reference>();
    LinkedHashSet<ML2Class> _allInstantiatedClasses = this.getAllInstantiatedClasses(e);
    final Consumer<ML2Class> _function = (ML2Class c) -> {
      EList<Feature> _features = c.getFeatures();
      final Consumer<Feature> _function_1 = (Feature it) -> {
        if ((it instanceof Reference)) {
          references.add(((Reference)it));
        }
      };
      _features.forEach(_function_1);
    };
    _allInstantiatedClasses.forEach(_function);
    return references;
  }
  
  /**
   * Returns a set containing all inherited properties of a given <b>type<b>.
   * 
   * @author Claudenir Fonseca
   */
  public Set<Feature> getAllInheritedFeatures(final ML2Class c) {
    Set<ML2Class> _classHierarchy = this.classHierarchy(c);
    final Function1<ML2Class, EList<Feature>> _function = (ML2Class it) -> {
      return it.getFeatures();
    };
    Iterable<EList<Feature>> _map = IterableExtensions.<ML2Class, EList<Feature>>map(_classHierarchy, _function);
    Iterable<Feature> _flatten = Iterables.<Feature>concat(_map);
    return IterableExtensions.<Feature>toSet(_flatten);
  }
  
  public Set<Attribute> getAllInheritedAttributes(final ML2Class c) {
    Set<ML2Class> _classHierarchy = this.classHierarchy(c);
    final Function1<ML2Class, EList<Attribute>> _function = (ML2Class it) -> {
      return it.getAttributes();
    };
    Iterable<EList<Attribute>> _map = IterableExtensions.<ML2Class, EList<Attribute>>map(_classHierarchy, _function);
    Iterable<Attribute> _flatten = Iterables.<Attribute>concat(_map);
    return IterableExtensions.<Attribute>toSet(_flatten);
  }
  
  public Set<Reference> getAllInheritedReferences(final ML2Class c) {
    Set<ML2Class> _classHierarchy = this.classHierarchy(c);
    final Function1<ML2Class, EList<Reference>> _function = (ML2Class it) -> {
      return it.getReferences();
    };
    Iterable<EList<Reference>> _map = IterableExtensions.<ML2Class, EList<Reference>>map(_classHierarchy, _function);
    Iterable<Reference> _flatten = Iterables.<Reference>concat(_map);
    return IterableExtensions.<Reference>toSet(_flatten);
  }
  
  /**
   * Checks if an <b>assignment</b> conforms to a given <b>type</b>.
   * 
   * @author Claudenir Fonseca
   */
  public boolean isConformantTo(final EntityDeclaration assignment, final ML2Class assigType) {
    LinkedHashSet<ML2Class> _allInstantiatedClasses = this.getAllInstantiatedClasses(assignment);
    return _allInstantiatedClasses.contains(assigType);
  }
  
  public boolean isConformantTo(final Literal assignment, final PrimitiveType assigType) {
    if ((assignment instanceof ML2String)) {
      return Objects.equal(assigType, PrimitiveType.STRING);
    } else {
      if ((assignment instanceof ML2Number)) {
        return Objects.equal(assigType, PrimitiveType.NUMBER);
      } else {
        if ((assignment instanceof ML2Boolean)) {
          return Objects.equal(assigType, PrimitiveType.BOOLEAN);
        }
      }
    }
    return false;
  }
  
  public boolean isConformanTo(final AttributeAssignment regulatedAssig, final RegularityFeatureType regType, final AttributeAssignment regulatingAssig) {
    if (regType != null) {
      switch (regType) {
        case DETERMINES_MAX_VALUE:
          boolean _hasIndividualAssignments = regulatedAssig.hasIndividualAssignments();
          if (_hasIndividualAssignments) {
            return false;
          }
          EList<Literal> _literalAssignments = regulatedAssig.getLiteralAssignments();
          final Function1<Literal, Boolean> _function = (Literal it) -> {
            boolean _xtrycatchfinallyexpression = false;
            try {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _not = (!(it instanceof ML2Number));
              if (_not) {
                _or_1 = true;
              } else {
                EList<Literal> _literalAssignments_1 = regulatingAssig.getLiteralAssignments();
                int _size = 0;
                if (_literalAssignments_1!=null) {
                  _size=_literalAssignments_1.size();
                }
                boolean _notEquals = (_size != 1);
                _or_1 = _notEquals;
              }
              if (_or_1) {
                _or = true;
              } else {
                double _value = ((ML2Number) it).getValue();
                EList<Literal> _literalAssignments_2 = regulatingAssig.getLiteralAssignments();
                Literal _head = IterableExtensions.<Literal>head(_literalAssignments_2);
                double _value_1 = ((ML2Number) _head).getValue();
                boolean _greaterThan = (_value > _value_1);
                _or = _greaterThan;
              }
              _xtrycatchfinallyexpression = _or;
            } catch (final Throwable _t) {
              if (_t instanceof ClassCastException) {
                final ClassCastException e = (ClassCastException)_t;
                return Boolean.valueOf(false);
              } else if (_t instanceof NullPointerException) {
                final NullPointerException e_1 = (NullPointerException)_t;
                return Boolean.valueOf(false);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            return Boolean.valueOf(_xtrycatchfinallyexpression);
          };
          boolean _exists = IterableExtensions.<Literal>exists(_literalAssignments, _function);
          final boolean ret = (!_exists);
          return ret;
        case DETERMINES_MIN_VALUE:
          boolean _hasIndividualAssignments_1 = regulatedAssig.hasIndividualAssignments();
          if (_hasIndividualAssignments_1) {
            return false;
          }
          EList<Literal> _literalAssignments_1 = regulatedAssig.getLiteralAssignments();
          final Function1<Literal, Boolean> _function_1 = (Literal it) -> {
            boolean _xtrycatchfinallyexpression = false;
            try {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _not = (!(it instanceof ML2Number));
              if (_not) {
                _or_1 = true;
              } else {
                EList<Literal> _literalAssignments_2 = regulatingAssig.getLiteralAssignments();
                int _size = 0;
                if (_literalAssignments_2!=null) {
                  _size=_literalAssignments_2.size();
                }
                boolean _notEquals = (_size != 1);
                _or_1 = _notEquals;
              }
              if (_or_1) {
                _or = true;
              } else {
                double _value = ((ML2Number) it).getValue();
                EList<Literal> _literalAssignments_3 = regulatingAssig.getLiteralAssignments();
                Literal _head = IterableExtensions.<Literal>head(_literalAssignments_3);
                double _value_1 = ((ML2Number) _head).getValue();
                boolean _lessThan = (_value < _value_1);
                _or = _lessThan;
              }
              _xtrycatchfinallyexpression = _or;
            } catch (final Throwable _t) {
              if (_t instanceof ClassCastException) {
                final ClassCastException e = (ClassCastException)_t;
                return Boolean.valueOf(false);
              } else if (_t instanceof NullPointerException) {
                final NullPointerException e_1 = (NullPointerException)_t;
                return Boolean.valueOf(false);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            return Boolean.valueOf(_xtrycatchfinallyexpression);
          };
          boolean _exists_1 = IterableExtensions.<Literal>exists(_literalAssignments_1, _function_1);
          final boolean ret_1 = (!_exists_1);
          return ret_1;
        case DETERMINES_VALUE:
          EList<Object> _allAssignments = regulatedAssig.getAllAssignments();
          for (final Object obj : _allAssignments) {
            EList<Object> _allAssignments_1 = regulatingAssig.getAllAssignments();
            boolean _contains = _allAssignments_1.contains(obj);
            boolean _not = (!_contains);
            if (_not) {
              return false;
            }
          }
          EList<Object> _allAssignments_2 = regulatingAssig.getAllAssignments();
          for (final Object obj_1 : _allAssignments_2) {
            EList<Object> _allAssignments_3 = regulatedAssig.getAllAssignments();
            boolean _contains_1 = _allAssignments_3.contains(obj_1);
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              return false;
            }
          }
          return true;
        case DETERMINES_ALLOWED_VALUES:
          EList<Object> _allAssignments_4 = regulatingAssig.getAllAssignments();
          EList<Object> _allAssignments_5 = regulatedAssig.getAllAssignments();
          return _allAssignments_4.containsAll(_allAssignments_5);
        default:
          break;
      }
    } else {
    }
    return false;
  }
  
  public boolean isConformanTo(final ReferenceAssignment regulatedAssig, final RegularityFeatureType regType, final ReferenceAssignment regulatingAssig) {
    if (regType != null) {
      switch (regType) {
        case DETERMINES_VALUE:
          EList<EntityDeclaration> _assignments = regulatedAssig.getAssignments();
          Set<EntityDeclaration> _set = IterableExtensions.<EntityDeclaration>toSet(_assignments);
          EList<EntityDeclaration> _assignments_1 = regulatingAssig.getAssignments();
          Set<EntityDeclaration> _set_1 = IterableExtensions.<EntityDeclaration>toSet(_assignments_1);
          final Sets.SetView<EntityDeclaration> diff = Sets.<EntityDeclaration>difference(_set, _set_1);
          boolean _isEmpty = diff.isEmpty();
          if (_isEmpty) {
            return true;
          }
          break;
        case DETERMINES_ALLOWED_VALUES:
          EList<EntityDeclaration> _assignments_2 = regulatingAssig.getAssignments();
          EList<EntityDeclaration> _assignments_3 = regulatedAssig.getAssignments();
          boolean _containsAll = _assignments_2.containsAll(_assignments_3);
          if (_containsAll) {
            return true;
          }
          break;
        case DETERMINES_TYPE:
          EList<EntityDeclaration> _assignments_4 = regulatedAssig.getAssignments();
          for (final EntityDeclaration value : _assignments_4) {
            LinkedHashSet<ML2Class> _allInstantiatedClasses = this.getAllInstantiatedClasses(value);
            EList<EntityDeclaration> _assignments_5 = regulatingAssig.getAssignments();
            boolean _containsAll_1 = _allInstantiatedClasses.containsAll(_assignments_5);
            boolean _not = (!_containsAll_1);
            if (_not) {
              return false;
            }
          }
          return true;
        case DETERMINES_ALLOWED_TYPES:
          EList<EntityDeclaration> _assignments_6 = regulatedAssig.getAssignments();
          for (final EntityDeclaration value_1 : _assignments_6) {
            LinkedHashSet<ML2Class> _allInstantiatedClasses_1 = this.getAllInstantiatedClasses(value_1);
            EList<EntityDeclaration> _assignments_7 = regulatingAssig.getAssignments();
            boolean _disjoint = Collections.disjoint(_allInstantiatedClasses_1, _assignments_7);
            if (_disjoint) {
              return false;
            }
          }
          return true;
        default:
          break;
      }
    } else {
    }
    return false;
  }
}
