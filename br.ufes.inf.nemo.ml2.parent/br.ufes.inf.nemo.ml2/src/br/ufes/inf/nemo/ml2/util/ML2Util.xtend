/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ml2.util

import br.ufes.inf.nemo.ml2.meta.Attribute
import br.ufes.inf.nemo.ml2.meta.AttributeAssignment
import br.ufes.inf.nemo.ml2.meta.EntityDeclaration
import br.ufes.inf.nemo.ml2.meta.Feature
import br.ufes.inf.nemo.ml2.meta.ML2Class
import br.ufes.inf.nemo.ml2.meta.ML2Model
import br.ufes.inf.nemo.ml2.meta.ModelElement
import br.ufes.inf.nemo.ml2.meta.Reference
import java.util.LinkedHashSet
import java.util.Set

class ML2Util {
	
//	@Inject extension OntoLLib

	def private Set<ML2Model> getRechableModels(ModelElement elem){
		val set = new LinkedHashSet<ML2Model>
		set.add(elem.eContainer as ML2Model)
		set.addAll((elem.eContainer as ML2Model).includes)
		return set
	}

	/** 
	 * Returns a set of all super types of the given <b>type</b>. The set does not
	 * include the <b>type</b> unless it is in a specialization cycle.
	 * 
	 * @author Claudenir Fonseca
	 */
	def Set<ML2Class> classHierarchy(ML2Class c) {
		val visited = new LinkedHashSet<ML2Class>()
		c.classHierarchy(visited)
	}

	def private Set<ML2Class> classHierarchy(ML2Class c, LinkedHashSet<ML2Class> visited) {
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
			val basicInstantiatedClasses = new LinkedHashSet<ML2Class>()
			basicInstantiatedClasses.add(propClass)
			return basicInstantiatedClasses
		}
		
		val basicInstantiatedClasses = new LinkedHashSet<ML2Class>()
		basicInstantiatedClasses.addAll(e.instantiatedClasses)
		
		if(e instanceof ML2Class) {
			val ch = e.classHierarchy
			e.rechableModels.map[elements].flatten.forEach[ 
				if(it instanceof ML2Class){
					val aux = powertypeOf
					if(aux!=null && (aux==e || ch.contains(aux)))
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
		val visited = new LinkedHashSet<ML2Class>()
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
	def Set<Feature> getAllInheritedFeatures(ML2Class c) {
		c.classHierarchy.map[features].flatten.toSet
	}
	
	def Set<Attribute> getAllInheritedAttributes(ML2Class c) {
		c.classHierarchy.map[attributes].flatten.toSet
	}
	
	def Set<Reference> getAllInheritedReferences(ML2Class c) {
		c.classHierarchy.map[references].flatten.toSet
	}
	
	/**
	 * Checks if an <b>assignment</b> conforms to a given <b>type</b>.
	 * 
	 * @author Claudenir Fonseca
	 */
//	def boolean isConformantTo(EObject assignment, ML2Class assigType) {
//		if(assignment instanceof ML2String){
//			return true
//		} else if(assignment instanceof ML2Number){
//			return true
//		} else if(assignment instanceof ML2Boolean){
//			return true
//		} else if(assignment instanceof EntityDeclaration){
//			if(assignment.allInstantiatedClasses.contains(assigType))
//				 return true
//		} else if(assignment instanceof ComplexDataValue){
//			val actualValue = if(assignment.value!=null) assignment.value	else assignment.unnamedValue
//			if(actualValue.allInstantiatedClasses.contains(assigType))
//				return true
//			val datatype = assigType.getLibClass(OntoLLib.DATATYPES_DATATYPE)
//			if(!assigType.classHierarchy.contains(datatype))
//				return false
//			else
//				return true
//		}
//		return false
//	}

}
