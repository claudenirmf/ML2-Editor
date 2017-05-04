/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ml2.util;

import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings("all")
public class ML2Util {
  private /* Set<ML2Model> */Object getRechableModels(final /* ModelElement */Object elem) {
    throw new Error("Unresolved compilation problems:"
      + "\nML2Model cannot be resolved to a type."
      + "\nML2Model cannot be resolved to a type."
      + "\nML2Model cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nincludes cannot be resolved");
  }
  
  /**
   * Returns a set of all super types of the given <b>type</b>. The set does not
   * include the <b>type</b> unless it is in a specialization cycle.
   * 
   * @author Claudenir Fonseca
   */
  public /* Set<ML2Class> */Object classHierarchy(final /* ML2Class */Object c) {
    throw new Error("Unresolved compilation problems:"
      + "\nML2Class cannot be resolved to a type."
      + "\nclassHierarchy cannot be resolved");
  }
  
  private /* Set<ML2Class> */Object classHierarchy(final /* ML2Class */Object c, final /* LinkedHashSet<ML2Class> */Object visited) {
    throw new Error("Unresolved compilation problems:"
      + "\nsuperClasses cannot be resolved"
      + "\nclassHierarchy cannot be resolved");
  }
  
  /**
   * Returns a set containing the basic instantiated types of a given <b>entity</b>. It includes
   * direct declared fixed instantiations and indirectly instantiated powertypes.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public /* LinkedHashSet<ML2Class> */Object getBasicInstantiatedClasses(final /* EntityDeclaration */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nAttributeAssignment cannot be resolved to a type."
      + "\nAttributeAssignment cannot be resolved to a type."
      + "\nML2Class cannot be resolved to a type."
      + "\nML2Class cannot be resolved to a type."
      + "\nML2Class cannot be resolved to a type."
      + "\nML2Class cannot be resolved to a type."
      + "\nThe method or field elements is undefined"
      + "\nThe method or field powertypeOf is undefined"
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nattribute cannot be resolved"
      + "\n_type cannot be resolved"
      + "\ninstantiatedClasses cannot be resolved"
      + "\nclassHierarchy cannot be resolved"
      + "\nrechableModels cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ncontains cannot be resolved");
  }
  
  /**
   * Returns a set containing all types instantiated by a given <b>entity</b>.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public /* LinkedHashSet<ML2Class> */Object getAllInstantiatedClasses(final /* EntityDeclaration */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nML2Class cannot be resolved to a type."
      + "\nThe method classHierarchy(ML2Class) from the type ML2Util refers to the missing type ML2Class"
      + "\nbasicInstantiatedClasses cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Returns a set containing all properties of a given <b>entity</b>.
   * <br><br>
   * ALERT: This method is SLOW, because it searches powertypes through the index.
   * 
   * @author Claudenir Fonseca
   */
  public /* Set<Feature> */Object getAllFeatures(final /* EntityDeclaration */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nFeature cannot be resolved to a type."
      + "\nThe method or field features is undefined for the type Object"
      + "\nallInstantiatedClasses cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  public /* Set<Attribute> */Object getAllAttributes(final /* EntityDeclaration */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nAttribute cannot be resolved to a type."
      + "\nAttribute cannot be resolved to a type."
      + "\nThe method or field features is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nallInstantiatedClasses cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  public /* Set<Reference> */Object getAllReferences(final /* EntityDeclaration */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nReference cannot be resolved to a type."
      + "\nReference cannot be resolved to a type."
      + "\nThe method or field features is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nallInstantiatedClasses cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Returns a set containing all inherited properties of a given <b>type<b>.
   * 
   * @author Claudenir Fonseca
   */
  public /* Set<Feature> */Object getAllInheritedFeatures(final /* ML2Class */Object c) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field features is undefined"
      + "\nclassHierarchy cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved"
      + "\ntoSet cannot be resolved");
  }
  
  public /* Set<Attribute> */Object getAllInheritedAttributes(final /* ML2Class */Object c) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field attributes is undefined"
      + "\nclassHierarchy cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved"
      + "\ntoSet cannot be resolved");
  }
  
  public /* Set<Reference> */Object getAllInheritedReferences(final /* ML2Class */Object c) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field references is undefined"
      + "\nclassHierarchy cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved"
      + "\ntoSet cannot be resolved");
  }
}
