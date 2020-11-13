/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ml2.util;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.AttributeAssignment;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.EntityDeclaration;
import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.HigherOrderClass;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.Model;
import br.ufes.inf.nemo.ml2.model.ModelElement;
import br.ufes.inf.nemo.ml2.model.PrimitiveType;
import br.ufes.inf.nemo.ml2.model.Reference;
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.model.RegularityAttribute;
import br.ufes.inf.nemo.ml2.model.RegularityFeature;
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType;
import br.ufes.inf.nemo.ml2.model.RegularityReference;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ML2Util {
  public boolean isUnnamed(final EntityDeclaration e) {
    return ((e.getName() == null) || Objects.equal(e.getName(), ""));
  }
  
  public ArrayList<Attribute> getAttributes(final br.ufes.inf.nemo.ml2.model.Class c) {
    final ArrayList<Attribute> l = new ArrayList<Attribute>();
    final Consumer<Feature> _function = (Feature it) -> {
      if ((it instanceof Attribute)) {
        l.add(((Attribute)it));
      }
    };
    c.getFeatures().forEach(_function);
    return l;
  }
  
  public ArrayList<Reference> getReferences(final br.ufes.inf.nemo.ml2.model.Class c) {
    final ArrayList<Reference> l = new ArrayList<Reference>();
    final Consumer<Feature> _function = (Feature it) -> {
      if ((it instanceof Reference)) {
        l.add(((Reference)it));
      }
    };
    c.getFeatures().forEach(_function);
    return l;
  }
  
  /**
   * Returns the name of a feature as an Attribute or a Reference.
   * Returns null if cast is not possible.
   */
  public String getName(final Feature f) {
    if ((f instanceof Attribute)) {
      return ((Attribute)f).getName();
    } else {
      if ((f instanceof Reference)) {
        return ((Reference)f).getName();
      }
    }
    return null;
  }
  
  /**
   * Sets the name of a feature as an Attribute or a Reference.
   */
  public void setName(final Feature f, final String name) {
    if (((f instanceof Attribute) || (f instanceof Reference))) {
      this.setName(f, name);
    }
  }
  
  /**
   * Returns the lower bound of a feature as an Attribute or a Reference.
   * Returns `0` if cast is not possible.
   */
  public int getLowerBound(final Feature f) {
    if (((f instanceof Attribute) || (f instanceof Reference))) {
      return this.getLowerBound(f);
    }
    return 0;
  }
  
  /**
   * Sets the lower bound of a feature as an Attribute or a Reference.
   */
  public void setLowerBound(final Feature f, final int lowerBound) {
    if (((f instanceof Attribute) || (f instanceof Reference))) {
      this.setLowerBound(f, lowerBound);
    }
  }
  
  /**
   * Returns the upper bound of a feature as an Attribute or a Reference.
   * Returns `0` if cast is not possible.
   */
  public int getUpperBound(final Feature f) {
    if (((f instanceof Attribute) || (f instanceof Reference))) {
      return this.getUpperBound(f);
    }
    return 0;
  }
  
  /**
   * Sets the upper bound of a feature as an Attribute or a Reference.
   */
  public void setUpperBound(final Feature f, final int upperBound) {
    if (((f instanceof Attribute) || (f instanceof Reference))) {
      this.setUpperBound(f, upperBound);
    }
  }
  
  /**
   * Returns the upper bound of a feature as an Attribute or a Reference.
   * Returns `0` if cast is not possible.
   */
  public Feature getRegulates(final RegularityFeature f) {
    if ((f instanceof RegularityAttribute)) {
      return ((RegularityAttribute)f).getRegulates();
    } else {
      if ((f instanceof RegularityReference)) {
        return ((RegularityReference)f).getRegulates();
      }
    }
    return null;
  }
  
  /**
   * Sets the upper bound of a feature as an Attribute or a Reference.
   */
  public void setRegulates(final RegularityFeature f, final Feature regulatedFeature) {
    if ((f instanceof RegularityAttribute)) {
      this.setRegulates(f, regulatedFeature);
    } else {
      if ((f instanceof RegularityReference)) {
        this.setRegulates(f, regulatedFeature);
      }
    }
  }
  
  public List<Object> getLiteralValues(final AttributeAssignment assignment) {
    final ArrayList<Object> literalValues = new ArrayList<Object>();
    literalValues.addAll(assignment.getStringValues());
    literalValues.addAll(assignment.getBooleanValues());
    literalValues.addAll(assignment.getNumberValues());
    return literalValues;
  }
  
  public boolean hasDatatypeValues(final AttributeAssignment assignment) {
    return ((!assignment.getDatatypeValues().isEmpty()) || (!assignment.getUnnamedValues().isEmpty()));
  }
  
  public boolean hasLiteralValues(final AttributeAssignment assignment) {
    boolean _isEmpty = this.getLiteralValues(assignment).isEmpty();
    return (!_isEmpty);
  }
  
  public List<Individual> getAllValues(final AttributeAssignment assignment) {
    final ArrayList<Individual> l = new ArrayList<Individual>();
    l.addAll(assignment.getDatatypeValues());
    l.addAll(assignment.getUnnamedValues());
    return l;
  }
  
  public List<Object> getAllAssignments(final AttributeAssignment assignment) {
    final ArrayList<Object> l = new ArrayList<Object>();
    l.addAll(assignment.getDatatypeValues());
    l.addAll(assignment.getUnnamedValues());
    l.addAll(this.getLiteralValues(assignment));
    return l;
  }
  
  public Set<Model> getRechableModels(final EntityDeclaration elem) {
    final LinkedHashSet<Model> set = new LinkedHashSet<Model>();
    boolean _isUnnamed = this.isUnnamed(elem);
    if (_isUnnamed) {
      EObject obj = elem.eContainer();
      while ((!(obj instanceof Model))) {
        obj = obj.eContainer();
      }
      set.add(((Model) obj));
      set.addAll(((Model) obj).getIncludes());
    } else {
      EObject _eContainer = elem.eContainer();
      set.add(((Model) _eContainer));
      EObject _eContainer_1 = elem.eContainer();
      set.addAll(((Model) _eContainer_1).getIncludes());
    }
    return set;
  }
  
  public Set<br.ufes.inf.nemo.ml2.model.Class> getRechableClasses(final EntityDeclaration elem) {
    final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> set = new LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class>();
    final Consumer<Model> _function = (Model it) -> {
      EList<ModelElement> _elements = it.getElements();
      if (_elements!=null) {
        final Consumer<ModelElement> _function_1 = (ModelElement it_1) -> {
          if ((it_1 instanceof br.ufes.inf.nemo.ml2.model.Class)) {
            set.add(((br.ufes.inf.nemo.ml2.model.Class)it_1));
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
  public Set<br.ufes.inf.nemo.ml2.model.Class> classHierarchy(final br.ufes.inf.nemo.ml2.model.Class c) {
    Set<br.ufes.inf.nemo.ml2.model.Class> _xblockexpression = null;
    {
      final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> visited = new LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class>();
      _xblockexpression = this.classHierarchy(c, visited);
    }
    return _xblockexpression;
  }
  
  private Set<br.ufes.inf.nemo.ml2.model.Class> classHierarchy(final br.ufes.inf.nemo.ml2.model.Class c, final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> visited) {
    LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> _xblockexpression = null;
    {
      EList<br.ufes.inf.nemo.ml2.model.Class> _superClasses = c.getSuperClasses();
      for (final br.ufes.inf.nemo.ml2.model.Class current : _superClasses) {
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
  public LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> getBasicInstantiatedClasses(final EntityDeclaration e) {
    EObject _eContainer = e.eContainer();
    if ((_eContainer instanceof AttributeAssignment)) {
      EObject _eContainer_1 = e.eContainer();
      final AttributeAssignment attAssign = ((AttributeAssignment) _eContainer_1);
      final DataType propClass = attAssign.getAttribute().get_type();
      final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> basicInstantiatedClasses = new LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class>();
      basicInstantiatedClasses.add(propClass);
      return basicInstantiatedClasses;
    }
    final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> basicInstantiatedClasses_1 = new LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class>();
    basicInstantiatedClasses_1.addAll(e.getClassifiers());
    if ((e instanceof br.ufes.inf.nemo.ml2.model.Class)) {
      final Set<br.ufes.inf.nemo.ml2.model.Class> ch = this.classHierarchy(((br.ufes.inf.nemo.ml2.model.Class)e));
      final Function1<Model, EList<ModelElement>> _function = (Model it) -> {
        return it.getElements();
      };
      final Consumer<ModelElement> _function_1 = (ModelElement it) -> {
        if ((it instanceof HigherOrderClass)) {
          final br.ufes.inf.nemo.ml2.model.Class aux = ((HigherOrderClass)it).getPowertypeOf();
          if (((aux != null) && (Objects.equal(aux, e) || ch.contains(aux)))) {
            basicInstantiatedClasses_1.add(((br.ufes.inf.nemo.ml2.model.Class)it));
          }
        }
      };
      Iterables.<ModelElement>concat(IterableExtensions.<Model, EList<ModelElement>>map(this.getRechableModels(e), _function)).forEach(_function_1);
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
  public LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> getAllInstantiatedClasses(final EntityDeclaration e) {
    LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> _xblockexpression = null;
    {
      final LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class> visited = new LinkedHashSet<br.ufes.inf.nemo.ml2.model.Class>();
      final Consumer<br.ufes.inf.nemo.ml2.model.Class> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
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
    final Consumer<br.ufes.inf.nemo.ml2.model.Class> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
      features.addAll(it.getFeatures());
    };
    this.getAllInstantiatedClasses(e).forEach(_function);
    return features;
  }
  
  public Set<Attribute> getAllAttributes(final EntityDeclaration e) {
    final LinkedHashSet<Attribute> attributes = new LinkedHashSet<Attribute>();
    final Consumer<br.ufes.inf.nemo.ml2.model.Class> _function = (br.ufes.inf.nemo.ml2.model.Class c) -> {
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
    final Consumer<br.ufes.inf.nemo.ml2.model.Class> _function = (br.ufes.inf.nemo.ml2.model.Class c) -> {
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
  public Set<Feature> getAllInheritedFeatures(final br.ufes.inf.nemo.ml2.model.Class c) {
    final Function1<br.ufes.inf.nemo.ml2.model.Class, EList<Feature>> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
      return it.getFeatures();
    };
    return IterableExtensions.<Feature>toSet(Iterables.<Feature>concat(IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class, EList<Feature>>map(this.classHierarchy(c), _function)));
  }
  
  public Set<Attribute> getAllInheritedAttributes(final br.ufes.inf.nemo.ml2.model.Class c) {
    final Function1<br.ufes.inf.nemo.ml2.model.Class, ArrayList<Attribute>> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
      return this.getAttributes(it);
    };
    return IterableExtensions.<Attribute>toSet(Iterables.<Attribute>concat(IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class, ArrayList<Attribute>>map(this.classHierarchy(c), _function)));
  }
  
  public Set<Reference> getAllInheritedReferences(final br.ufes.inf.nemo.ml2.model.Class c) {
    final Function1<br.ufes.inf.nemo.ml2.model.Class, ArrayList<Reference>> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
      return this.getReferences(it);
    };
    return IterableExtensions.<Reference>toSet(Iterables.<Reference>concat(IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class, ArrayList<Reference>>map(this.classHierarchy(c), _function)));
  }
  
  /**
   * Checks if an <b>assignment</b> conforms to a given <b>type</b>.
   * 
   * @author Claudenir Fonseca
   */
  public boolean isConformantTo(final EntityDeclaration assignment, final br.ufes.inf.nemo.ml2.model.Class assigType) {
    return this.getAllInstantiatedClasses(assignment).contains(assigType);
  }
  
  public boolean isConformantTo(final Object assignment, final PrimitiveType assigType) {
    if ((assignment instanceof String)) {
      return Objects.equal(assigType, PrimitiveType.STRING);
    } else {
      if ((assignment instanceof Double)) {
        return Objects.equal(assigType, PrimitiveType.NUMBER);
      } else {
        if ((assignment instanceof Boolean)) {
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
          boolean _hasDatatypeValues = this.hasDatatypeValues(regulatedAssig);
          if (_hasDatatypeValues) {
            return false;
          }
          final Function1<Double, Boolean> _function = (Double it) -> {
            boolean _xtrycatchfinallyexpression = false;
            try {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _not = (!(it instanceof Double));
              if (_not) {
                _or_1 = true;
              } else {
                EList<Double> _numberValues = regulatingAssig.getNumberValues();
                int _size = 0;
                if (_numberValues!=null) {
                  _size=_numberValues.size();
                }
                boolean _notEquals = (_size != 1);
                _or_1 = _notEquals;
              }
              if (_or_1) {
                _or = true;
              } else {
                Double _head = IterableExtensions.<Double>head(regulatingAssig.getNumberValues());
                boolean _greaterThan = (it.compareTo(_head) > 0);
                _or = _greaterThan;
              }
              _xtrycatchfinallyexpression = _or;
            } catch (final Throwable _t) {
              if (_t instanceof ClassCastException) {
                return Boolean.valueOf(false);
              } else if (_t instanceof NullPointerException) {
                return Boolean.valueOf(false);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            return Boolean.valueOf(_xtrycatchfinallyexpression);
          };
          boolean _exists = IterableExtensions.<Double>exists(regulatedAssig.getNumberValues(), _function);
          final boolean ret = (!_exists);
          return ret;
        case DETERMINES_MIN_VALUE:
          boolean _hasDatatypeValues_1 = this.hasDatatypeValues(regulatedAssig);
          if (_hasDatatypeValues_1) {
            return false;
          }
          final Function1<Double, Boolean> _function_1 = (Double it) -> {
            boolean _xtrycatchfinallyexpression = false;
            try {
              boolean _or = false;
              boolean _or_1 = false;
              boolean _not = (!(it instanceof Double));
              if (_not) {
                _or_1 = true;
              } else {
                EList<Double> _numberValues = regulatingAssig.getNumberValues();
                int _size = 0;
                if (_numberValues!=null) {
                  _size=_numberValues.size();
                }
                boolean _notEquals = (_size != 1);
                _or_1 = _notEquals;
              }
              if (_or_1) {
                _or = true;
              } else {
                Double _head = IterableExtensions.<Double>head(regulatingAssig.getNumberValues());
                boolean _lessThan = (it.compareTo(_head) < 0);
                _or = _lessThan;
              }
              _xtrycatchfinallyexpression = _or;
            } catch (final Throwable _t) {
              if (_t instanceof ClassCastException) {
                return Boolean.valueOf(false);
              } else if (_t instanceof NullPointerException) {
                return Boolean.valueOf(false);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            return Boolean.valueOf(_xtrycatchfinallyexpression);
          };
          boolean _exists_1 = IterableExtensions.<Double>exists(regulatedAssig.getNumberValues(), _function_1);
          final boolean ret_1 = (!_exists_1);
          return ret_1;
        case DETERMINES_VALUE:
          List<Object> _allAssignments = this.getAllAssignments(regulatedAssig);
          for (final Object obj : _allAssignments) {
            boolean _contains = this.getAllAssignments(regulatingAssig).contains(obj);
            boolean _not = (!_contains);
            if (_not) {
              return false;
            }
          }
          List<Object> _allAssignments_1 = this.getAllAssignments(regulatingAssig);
          for (final Object obj_1 : _allAssignments_1) {
            boolean _contains_1 = this.getAllAssignments(regulatedAssig).contains(obj_1);
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              return false;
            }
          }
          return true;
        case DETERMINES_ALLOWED_VALUES:
          return this.getAllAssignments(regulatingAssig).containsAll(this.getAllAssignments(regulatedAssig));
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
          final Sets.SetView<EntityDeclaration> diff = Sets.<EntityDeclaration>difference(IterableExtensions.<EntityDeclaration>toSet(regulatedAssig.getValues()), IterableExtensions.<EntityDeclaration>toSet(regulatingAssig.getValues()));
          boolean _isEmpty = diff.isEmpty();
          if (_isEmpty) {
            return true;
          }
          break;
        case DETERMINES_ALLOWED_VALUES:
          boolean _containsAll = regulatingAssig.getValues().containsAll(regulatedAssig.getValues());
          if (_containsAll) {
            return true;
          }
          break;
        case DETERMINES_TYPE:
          EList<EntityDeclaration> _values = regulatedAssig.getValues();
          for (final EntityDeclaration value : _values) {
            boolean _containsAll_1 = this.getAllInstantiatedClasses(value).containsAll(regulatingAssig.getValues());
            boolean _not = (!_containsAll_1);
            if (_not) {
              return false;
            }
          }
          return true;
        case DETERMINES_ALLOWED_TYPES:
          EList<EntityDeclaration> _values_1 = regulatedAssig.getValues();
          for (final EntityDeclaration value_1 : _values_1) {
            boolean _disjoint = Collections.disjoint(this.getAllInstantiatedClasses(value_1), regulatingAssig.getValues());
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
  
  /**
   * Returns a set of all subtypes of the given <b>type</b>. The set does not
   * include the <b>type</b>.
   * 
   * @author Fernando Amaral Musso
   */
  public BasicEList<br.ufes.inf.nemo.ml2.model.Class> classSubtypes(final br.ufes.inf.nemo.ml2.model.Class c) {
    EObject container = c;
    BasicEList<br.ufes.inf.nemo.ml2.model.Class> subtypes = new BasicEList<br.ufes.inf.nemo.ml2.model.Class>();
    while ((!(container instanceof Model))) {
      container = container.eContainer();
    }
    if ((container instanceof Model)) {
      EList<ModelElement> _elements = ((Model)container).getElements();
      for (final ModelElement e : _elements) {
        if ((e instanceof br.ufes.inf.nemo.ml2.model.Class)) {
          boolean _notEquals = (!Objects.equal(e, c));
          if (_notEquals) {
            boolean _contains = this.classHierarchy(((br.ufes.inf.nemo.ml2.model.Class)e)).contains(c);
            if (_contains) {
              subtypes.add(((br.ufes.inf.nemo.ml2.model.Class)e));
            }
          }
        }
      }
    }
    return subtypes;
  }
  
  /**
   * Returns the <b>type</b> given its <b>name</b>.
   * 
   * @author Fernando Amaral Musso
   */
  public br.ufes.inf.nemo.ml2.model.Class getClass(final String name, final Model model) {
    EList<ModelElement> _elements = model.getElements();
    for (final ModelElement e : _elements) {
      if ((e instanceof br.ufes.inf.nemo.ml2.model.Class)) {
        boolean _equals = ((br.ufes.inf.nemo.ml2.model.Class)e).getName().equals(name);
        if (_equals) {
          return ((br.ufes.inf.nemo.ml2.model.Class)e);
        }
      }
    }
    return null;
  }
}
