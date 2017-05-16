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
        obj = obj.eContainer();
      }
      set.add(((ML2Model) obj));
      set.addAll(((ML2Model) obj).getIncludes());
    } else {
      EObject _eContainer = elem.eContainer();
      set.add(((ML2Model) _eContainer));
      EObject _eContainer_1 = elem.eContainer();
      set.addAll(((ML2Model) _eContainer_1).getIncludes());
    }
    return set;
  }
  
  public Set<ML2Class> getRechableClasses(final EntityDeclaration elem) {
    final LinkedHashSet<ML2Class> set = new LinkedHashSet<ML2Class>();
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
    this.getRechableModels(elem).forEach(_function);
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
          visited.addAll(this.classHierarchy(current, visited));
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
      final DataType propClass = attAssign.getAttribute().get_type();
      final LinkedHashSet<ML2Class> basicInstantiatedClasses = new LinkedHashSet<ML2Class>();
      basicInstantiatedClasses.add(propClass);
      return basicInstantiatedClasses;
    }
    final LinkedHashSet<ML2Class> basicInstantiatedClasses_1 = new LinkedHashSet<ML2Class>();
    basicInstantiatedClasses_1.addAll(e.getInstantiatedClasses());
    if ((e instanceof ML2Class)) {
      final Set<ML2Class> ch = this.classHierarchy(((ML2Class)e));
      final Function1<ML2Model, EList<ModelElement>> _function = (ML2Model it) -> {
        return it.getElements();
      };
      final Consumer<ModelElement> _function_1 = (ModelElement it) -> {
        if ((it instanceof ML2Class)) {
          final ML2Class aux = ((ML2Class)it).getPowertypeOf();
          if (((aux != null) && (Objects.equal(aux, e) || ch.contains(aux)))) {
            basicInstantiatedClasses_1.add(((ML2Class)it));
          }
        }
      };
      Iterables.<ModelElement>concat(IterableExtensions.<ML2Model, EList<ModelElement>>map(this.getRechableModels(e), _function)).forEach(_function_1);
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
      final Consumer<ML2Class> _function = (ML2Class it) -> {
        visited.add(it);
        visited.addAll(this.classHierarchy(it));
      };
      this.getBasicInstantiatedClasses(e).forEach(_function);
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
    final Consumer<ML2Class> _function = (ML2Class it) -> {
      features.addAll(it.getFeatures());
    };
    this.getAllInstantiatedClasses(e).forEach(_function);
    return features;
  }
  
  public Set<Attribute> getAllAttributes(final EntityDeclaration e) {
    final LinkedHashSet<Attribute> attributes = new LinkedHashSet<Attribute>();
    final Consumer<ML2Class> _function = (ML2Class c) -> {
      final Consumer<Feature> _function_1 = (Feature it) -> {
        if ((it instanceof Attribute)) {
          attributes.add(((Attribute)it));
        }
      };
      c.getFeatures().forEach(_function_1);
    };
    this.getAllInstantiatedClasses(e).forEach(_function);
    return attributes;
  }
  
  public Set<Reference> getAllReferences(final EntityDeclaration e) {
    final LinkedHashSet<Reference> references = new LinkedHashSet<Reference>();
    final Consumer<ML2Class> _function = (ML2Class c) -> {
      final Consumer<Feature> _function_1 = (Feature it) -> {
        if ((it instanceof Reference)) {
          references.add(((Reference)it));
        }
      };
      c.getFeatures().forEach(_function_1);
    };
    this.getAllInstantiatedClasses(e).forEach(_function);
    return references;
  }
  
  /**
   * Returns a set containing all inherited properties of a given <b>type<b>.
   * 
   * @author Claudenir Fonseca
   */
  public Set<Feature> getAllInheritedFeatures(final ML2Class c) {
    final Function1<ML2Class, EList<Feature>> _function = (ML2Class it) -> {
      return it.getFeatures();
    };
    return IterableExtensions.<Feature>toSet(Iterables.<Feature>concat(IterableExtensions.<ML2Class, EList<Feature>>map(this.classHierarchy(c), _function)));
  }
  
  public Set<Attribute> getAllInheritedAttributes(final ML2Class c) {
    final Function1<ML2Class, EList<Attribute>> _function = (ML2Class it) -> {
      return it.getAttributes();
    };
    return IterableExtensions.<Attribute>toSet(Iterables.<Attribute>concat(IterableExtensions.<ML2Class, EList<Attribute>>map(this.classHierarchy(c), _function)));
  }
  
  public Set<Reference> getAllInheritedReferences(final ML2Class c) {
    final Function1<ML2Class, EList<Reference>> _function = (ML2Class it) -> {
      return it.getReferences();
    };
    return IterableExtensions.<Reference>toSet(Iterables.<Reference>concat(IterableExtensions.<ML2Class, EList<Reference>>map(this.classHierarchy(c), _function)));
  }
  
  /**
   * Checks if an <b>assignment</b> conforms to a given <b>type</b>.
   * 
   * @author Claudenir Fonseca
   */
  public boolean isConformantTo(final EntityDeclaration assignment, final ML2Class assigType) {
    return this.getAllInstantiatedClasses(assignment).contains(assigType);
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
          final Function1<Literal, Boolean> _function = (Literal it) -> {
            boolean _xtrycatchfinallyexpression = false;
            try {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _not = (!(it instanceof ML2Number));
              if (_not) {
                _or_1 = true;
              } else {
                EList<Literal> _literalAssignments = regulatingAssig.getLiteralAssignments();
                int _size = 0;
                if (_literalAssignments!=null) {
                  _size=_literalAssignments.size();
                }
                boolean _notEquals = (_size != 1);
                _or_1 = _notEquals;
              }
              if (_or_1) {
                _or = true;
              } else {
                double _value = ((ML2Number) it).getValue();
                Literal _head = IterableExtensions.<Literal>head(regulatingAssig.getLiteralAssignments());
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
          boolean _exists = IterableExtensions.<Literal>exists(regulatedAssig.getLiteralAssignments(), _function);
          final boolean ret = (!_exists);
          return ret;
        case DETERMINES_MIN_VALUE:
          boolean _hasIndividualAssignments_1 = regulatedAssig.hasIndividualAssignments();
          if (_hasIndividualAssignments_1) {
            return false;
          }
          final Function1<Literal, Boolean> _function_1 = (Literal it) -> {
            boolean _xtrycatchfinallyexpression = false;
            try {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _not = (!(it instanceof ML2Number));
              if (_not) {
                _or_1 = true;
              } else {
                EList<Literal> _literalAssignments = regulatingAssig.getLiteralAssignments();
                int _size = 0;
                if (_literalAssignments!=null) {
                  _size=_literalAssignments.size();
                }
                boolean _notEquals = (_size != 1);
                _or_1 = _notEquals;
              }
              if (_or_1) {
                _or = true;
              } else {
                double _value = ((ML2Number) it).getValue();
                Literal _head = IterableExtensions.<Literal>head(regulatingAssig.getLiteralAssignments());
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
          boolean _exists_1 = IterableExtensions.<Literal>exists(regulatedAssig.getLiteralAssignments(), _function_1);
          final boolean ret_1 = (!_exists_1);
          return ret_1;
        case DETERMINES_VALUE:
          EList<Object> _allAssignments = regulatedAssig.getAllAssignments();
          for (final Object obj : _allAssignments) {
            boolean _contains = regulatingAssig.getAllAssignments().contains(obj);
            boolean _not = (!_contains);
            if (_not) {
              return false;
            }
          }
          EList<Object> _allAssignments_1 = regulatingAssig.getAllAssignments();
          for (final Object obj_1 : _allAssignments_1) {
            boolean _contains_1 = regulatedAssig.getAllAssignments().contains(obj_1);
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              return false;
            }
          }
          return true;
        case DETERMINES_ALLOWED_VALUES:
          return regulatingAssig.getAllAssignments().containsAll(regulatedAssig.getAllAssignments());
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
          final Sets.SetView<EntityDeclaration> diff = Sets.<EntityDeclaration>difference(IterableExtensions.<EntityDeclaration>toSet(regulatedAssig.getAssignments()), 
            IterableExtensions.<EntityDeclaration>toSet(regulatingAssig.getAssignments()));
          boolean _isEmpty = diff.isEmpty();
          if (_isEmpty) {
            return true;
          }
          break;
        case DETERMINES_ALLOWED_VALUES:
          boolean _containsAll = regulatingAssig.getAssignments().containsAll(regulatedAssig.getAssignments());
          if (_containsAll) {
            return true;
          }
          break;
        case DETERMINES_TYPE:
          EList<EntityDeclaration> _assignments = regulatedAssig.getAssignments();
          for (final EntityDeclaration value : _assignments) {
            boolean _containsAll_1 = this.getAllInstantiatedClasses(value).containsAll(regulatingAssig.getAssignments());
            boolean _not = (!_containsAll_1);
            if (_not) {
              return false;
            }
          }
          return true;
        case DETERMINES_ALLOWED_TYPES:
          EList<EntityDeclaration> _assignments_1 = regulatedAssig.getAssignments();
          for (final EntityDeclaration value_1 : _assignments_1) {
            boolean _disjoint = Collections.disjoint(this.getAllInstantiatedClasses(value_1), regulatingAssig.getAssignments());
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
