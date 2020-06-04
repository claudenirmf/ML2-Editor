/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ml2.util

import br.ufes.inf.nemo.ml2.model.Class
import com.google.common.collect.Sets
import java.util.Collections
import java.util.LinkedHashSet
import java.util.Set
import org.eclipse.emf.ecore.EObject
import br.ufes.inf.nemo.ml2.model.EntityDeclaration
import br.ufes.inf.nemo.ml2.model.Model
import br.ufes.inf.nemo.ml2.model.AttributeAssignment
import br.ufes.inf.nemo.ml2.model.HigherOrderClass
import br.ufes.inf.nemo.ml2.model.Feature
import br.ufes.inf.nemo.ml2.model.Attribute
import br.ufes.inf.nemo.ml2.model.Reference
import java.util.ArrayList
import br.ufes.inf.nemo.ml2.model.PrimitiveType
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType
import br.ufes.inf.nemo.ml2.model.Individual
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment
import br.ufes.inf.nemo.ml2.model.RegularityFeature
import br.ufes.inf.nemo.ml2.model.RegularityAttribute
import br.ufes.inf.nemo.ml2.model.RegularityReference

class ML2Util {
	
//	@Inject extension OntoLLib

	def boolean isUnnamed(EntityDeclaration e) { 
		return e.name===null || e.name==""
	}
	
	def ArrayList<Attribute> getAttributes(Class c) {
		val l = new ArrayList<Attribute>()
		c.features.forEach[if(it instanceof Attribute) l.add(it)]
		return l
	}
	
	def ArrayList<Reference> getReferences(Class c) {
		val l = new ArrayList<Reference>()
		c.features.forEach[if(it instanceof Reference) l.add(it)]
		return l
	}
	
	/**
	 * Returns the name of a feature as an Attribute or a Reference.
	 * Returns null if cast is not possible.
	 */
	def String getName(Feature f) {
		if(f instanceof Attribute || f instanceof Reference) {
			return f.name
		}
		return null;
	}
	
	/**
	 * Sets the name of a feature as an Attribute or a Reference.
	 */
	def void setName(Feature f, String name) {
		if(f instanceof Attribute || f instanceof Reference) {
			f.name = name
		}
	}
	
	/**
	 * Returns the lower bound of a feature as an Attribute or a Reference.
	 * Returns `0` if cast is not possible.
	 */
	def int getLowerBound(Feature f) {
		if(f instanceof Attribute || f instanceof Reference) {
			return f.lowerBound
		}
		return 0;
	}
	
	/**
	 * Sets the lower bound of a feature as an Attribute or a Reference.
	 */
	def void setLowerBound(Feature f, int lowerBound) {
		if(f instanceof Attribute || f instanceof Reference) {
			f.lowerBound = lowerBound
		}
	}
	
	/**
	 * Returns the upper bound of a feature as an Attribute or a Reference.
	 * Returns `0` if cast is not possible.
	 */
	def int getUpperBound(Feature f) {
		if(f instanceof Attribute || f instanceof Reference) {
			return f.upperBound
		}
		return 0;
	}
	
	/**
	 * Sets the upper bound of a feature as an Attribute or a Reference.
	 */
	def void setUpperBound(Feature f, int upperBound) {
		if(f instanceof Attribute || f instanceof Reference) {
			f.upperBound = upperBound
		}
	}
	
	/**
	 * Returns the upper bound of a feature as an Attribute or a Reference.
	 * Returns `0` if cast is not possible.
	 */
	def Feature getRegulates(RegularityFeature f) {
		if(f instanceof RegularityAttribute) {
			return f.regulates
		}
		else if(f instanceof RegularityReference) {
			return f.regulates
		}
		return null;
	}
	
	/**
	 * Sets the upper bound of a feature as an Attribute or a Reference.
	 */
	def void setRegulates(RegularityFeature f, Feature regulatedFeature) {
		if(f instanceof RegularityAttribute) {
			f.regulates = regulatedFeature
		}
		else if(f instanceof RegularityReference) {
			f.regulates = regulatedFeature
		}
	}
	
	def boolean hasDatatypeValues(AttributeAssignment assignment) {
		return !assignment.datatypeValues.isEmpty || !assignment.unnamedValues.isEmpty
	}
	
	def boolean hasLiteralValues(AttributeAssignment assignment) {
		return !assignment.literalValues.isEmpty
	}
	
	def ArrayList<Individual> getAllValues(AttributeAssignment assignment) {
		val l = new ArrayList<Individual>()
		l.addAll(assignment.datatypeValues)
		l.addAll(assignment.unnamedValues)
		return l
	}
	
	def ArrayList<Object> getAllAssignments(AttributeAssignment assignment) {
		val l = new ArrayList<Object>()
		l.addAll(assignment.datatypeValues)
		l.addAll(assignment.unnamedValues)
		l.addAll(assignment.literalValues)
		return l
	}

	def Set<Model> getRechableModels(EntityDeclaration elem){
		val set = new LinkedHashSet<Model>
		if(elem.unnamed) {
			var EObject obj = elem.eContainer
			while(!(obj instanceof Model)) { obj = obj.eContainer }
			set.add(obj as Model)
			set.addAll((obj as Model).includes)
		}
		else {
			set.add(elem.eContainer as Model)
			set.addAll((elem.eContainer as Model).includes)
		}
		return set
	}
	
	def Set<Class> getRechableClasses(EntityDeclaration elem){
		val set = new LinkedHashSet<Class>
		elem.rechableModels.forEach[ elements?.forEach[if(it instanceof Class) set.add(it)] ]
		return set
	}

	/** 
	 * Returns a set of all super types of the given <b>type</b>. The set does not
	 * include the <b>type</b> unless it is in a specialization cycle.
	 * 
	 * @author Claudenir Fonseca
	 */
	def Set<Class> classHierarchy(Class c) {
		val visited = new LinkedHashSet<Class>()
		c.classHierarchy(visited)
	}

	def private Set<Class> classHierarchy(Class c, LinkedHashSet<Class> visited) {
		for (current : c.superClasses) {
			if (!visited.contains(current)) {
				visited.add(current)
				visited.addAll(current.classHierarchy(visited))
			}
		}
		visited
	}

	/**
	 * Returns a set containing the basic instantiated types of a given <b>entity</b>. It includes 
	 * direct declared fixed instantiations and indirectly instantiated powertypes.
	 * <br><br>
	 * ALERT: This method is SLOW, because it searches powertypes through the index.
	 * 
	 * @author Claudenir Fonseca
	 */
	def getBasicInstantiatedClasses(EntityDeclaration e) {
		if(e.eContainer instanceof AttributeAssignment){
			val attAssign = (e.eContainer as AttributeAssignment)
			val propClass = attAssign.attribute._type
			val basicInstantiatedClasses = new LinkedHashSet<Class>()
			basicInstantiatedClasses.add(propClass)
			return basicInstantiatedClasses
		}
		
		val basicInstantiatedClasses = new LinkedHashSet<Class>()
		basicInstantiatedClasses.addAll(e.classifiers)
		
		if(e instanceof Class) {
			val ch = e.classHierarchy
			e.rechableModels.map[elements].flatten.forEach[ 
				if(it instanceof HigherOrderClass){
					val aux = powertypeOf
					if(aux!==null && (aux==e || ch.contains(aux)))
							basicInstantiatedClasses.add(it)
				}
			]
			return basicInstantiatedClasses
		} else {
			return basicInstantiatedClasses
		} 
	}

	/**
	 * Returns a set containing all types instantiated by a given <b>entity</b>.
	 * <br><br>
	 * ALERT: This method is SLOW, because it searches powertypes through the index.
	 * 
	 * @author Claudenir Fonseca
	 */
	def getAllInstantiatedClasses(EntityDeclaration e) {
		val visited = new LinkedHashSet<Class>()
		e.basicInstantiatedClasses.forEach [
			visited.add(it)
			visited.addAll(it.classHierarchy)
		]
		visited
	}

	/**
	 * Returns a set containing all properties of a given <b>entity</b>.
	 * <br><br>
	 * ALERT: This method is SLOW, because it searches powertypes through the index.
	 * 
	 * @author Claudenir Fonseca
	 */
	def Set<Feature> getAllFeatures(EntityDeclaration e) {
		val features = new LinkedHashSet<Feature>()
		e.allInstantiatedClasses.forEach [ features.addAll(it.features) ]
		return features
	}
	
	def Set<Attribute> getAllAttributes(EntityDeclaration e) {
		val attributes = new LinkedHashSet<Attribute>()
		e.allInstantiatedClasses.forEach [ c |
			c.features.forEach[if(it instanceof Attribute)	attributes.add(it)]
		]
		return attributes
	}
	
	def Set<Reference> getAllReferences(EntityDeclaration e) {
		val references = new LinkedHashSet<Reference>()
		e.allInstantiatedClasses.forEach [ c |
			c.features.forEach[if(it instanceof Reference) references.add(it)]
		]
		return references
	}

	/**
	 * Returns a set containing all inherited properties of a given <b>type<b>.
	 * 
	 * @author Claudenir Fonseca
	 */
	def Set<Feature> getAllInheritedFeatures(Class c) {
		c.classHierarchy.map[features].flatten.toSet
	}
	
	def Set<Attribute> getAllInheritedAttributes(Class c) {
		c.classHierarchy.map[attributes].flatten.toSet
	}
	
	def Set<Reference> getAllInheritedReferences(Class c) {
		c.classHierarchy.map[references].flatten.toSet
	}
	
	/**
	 * Checks if an <b>assignment</b> conforms to a given <b>type</b>.
	 * 
	 * @author Claudenir Fonseca
	 */
	def boolean isConformantTo(EntityDeclaration assignment, Class assigType) {
		return assignment.allInstantiatedClasses.contains(assigType)
	}
	
	def boolean isConformantTo(Object assignment, PrimitiveType assigType){
		if(assignment instanceof String){
			return assigType==PrimitiveType.STRING
		} else if(assignment instanceof Double){
			return assigType==PrimitiveType.NUMBER
		} else if(assignment instanceof Boolean){
			return assigType==PrimitiveType.BOOLEAN
		}
		return false
	}
	
	// TODO: update instanceof Double
//	def boolean isConformanTo(AttributeAssignment regulatedAssig, RegularityFeatureType regType,
//		AttributeAssignment regulatingAssig) {
//		switch(regType){
//			case DETERMINES_MAX_VALUE: {
//				if(regulatedAssig.hasDatatypeValues)	return false
//				val ret = !regulatedAssig.literalValues.exists[
//					try {
//					!(it instanceof Double)
//					|| regulatingAssig.literalValues?.size != 1
//					|| (it as Double).value > (regulatingAssig.literalValues.head as Double).value
//					}
//					catch(ClassCastException e) { return false }
//					catch(NullPointerException e) { return false }
//				]
//				return ret
//			}
//			case DETERMINES_MIN_VALUE: {
//				if(regulatedAssig.hasDatatypeValues)	return false
//				val ret = !regulatedAssig.literalValues.exists[
//					try {
//					!(it instanceof Double)
//					|| regulatingAssig.literalValues?.size != 1
//					|| (it as Double).value < (regulatingAssig.literalValues.head as Double).value
//					}
//					catch(ClassCastException e) { return false }
//					catch(NullPointerException e) { return false }
//				]
//				return ret
//			}
//			case DETERMINES_VALUE: {
////				val diff = Sets.difference(regulatingAssig.allAssignments.toSet, 
////					regulatedAssig.allAssignments.toSet)
////				if(diff.isEmpty)	return true;
//				for(Object obj : regulatedAssig.allAssignments) {
//					if(!regulatingAssig.allAssignments.contains(obj))
//						return false
//				}
//				for(Object obj : regulatingAssig.allAssignments) {
//					if(!regulatedAssig.allAssignments.contains(obj))
//						return false
//				}
//				return true
//			}
//			case DETERMINES_ALLOWED_VALUES: {
//				return regulatingAssig.allAssignments.containsAll(regulatedAssig.allAssignments)
//			}
//			default : {}
//		}
//		
//		return false
//	}
	
	def boolean isConformanTo(ReferenceAssignment regulatedAssig, RegularityFeatureType regType,
		ReferenceAssignment regulatingAssig) {
		switch (regType) {
			case DETERMINES_VALUE: {
				val diff = Sets.difference(regulatedAssig.values.toSet, regulatingAssig.values.toSet)
				if(diff.isEmpty) return true;
			}
			case DETERMINES_ALLOWED_VALUES: {
				if (regulatingAssig.values.containsAll(regulatedAssig.values))
					return true;
			}
			case DETERMINES_TYPE: {
				for (EntityDeclaration value : regulatedAssig.values) {
					if (!value.allInstantiatedClasses.containsAll(regulatingAssig.values))
						return false
				}
				return true
			}
			case DETERMINES_ALLOWED_TYPES: {
				for (EntityDeclaration value : regulatedAssig.values) {
					if (Collections.disjoint(value.allInstantiatedClasses, regulatingAssig.values))
						return false
				}
				return true
			}
			default: {
			}
		}
		return false
	}

}
