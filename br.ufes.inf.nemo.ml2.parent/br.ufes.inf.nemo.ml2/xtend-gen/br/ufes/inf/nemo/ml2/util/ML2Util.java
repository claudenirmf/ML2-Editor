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
import br.ufes.inf.nemo.ml2.meta.ML2Boolean;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.ML2Number;
import br.ufes.inf.nemo.ml2.meta.ML2String;
import br.ufes.inf.nemo.ml2.meta.ModelElement;
import br.ufes.inf.nemo.ml2.meta.Reference;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ML2Util {
  private Set<ML2Model> getRechableModels(final ModelElement elem) {
    final LinkedHashSet<ML2Model> set = new LinkedHashSet<ML2Model>();
    EObject _eContainer = elem.eContainer();
    set.add(((ML2Model) _eContainer));
    EObject _eContainer_1 = elem.eContainer();
    EList<ML2Model> _includes = ((ML2Model) _eContainer_1).getIncludes();
    set.addAll(_includes);
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
          if (((!Objects.equal(aux, null)) && (Objects.equal(aux, e) || ch.contains(aux)))) {
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
  public boolean isConformantTo(final EObject assignment, final ML2Class assigType) {
    if ((assignment instanceof ML2String)) {
      return true;
    } else {
      if ((assignment instanceof ML2Number)) {
        return true;
      } else {
        if ((assignment instanceof ML2Boolean)) {
          return true;
        } else {
          if ((assignment instanceof EntityDeclaration)) {
            LinkedHashSet<ML2Class> _allInstantiatedClasses = this.getAllInstantiatedClasses(((EntityDeclaration)assignment));
            boolean _contains = _allInstantiatedClasses.contains(assigType);
            if (_contains) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
}
