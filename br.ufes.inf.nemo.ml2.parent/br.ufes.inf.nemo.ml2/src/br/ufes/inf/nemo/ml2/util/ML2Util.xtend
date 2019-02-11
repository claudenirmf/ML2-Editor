/**
 * Auxiliary methods for enable navigation and checking through OntoL Models.
 * 
 * @author Claudenir Fonseca
 */
package br.ufes.inf.nemo.ml2.util

import br.ufes.inf.nemo.ml2.model.Attribute
import br.ufes.inf.nemo.ml2.model.AttributeAssignment
import br.ufes.inf.nemo.ml2.model.EntityDeclaration
import br.ufes.inf.nemo.ml2.model.Feature
import br.ufes.inf.nemo.ml2.model.Literal
import br.ufes.inf.nemo.ml2.model.ML2Boolean
import br.ufes.inf.nemo.ml2.model.ML2Class
import br.ufes.inf.nemo.ml2.model.ML2Model
import br.ufes.inf.nemo.ml2.model.ML2Number
import br.ufes.inf.nemo.ml2.model.ML2String
import br.ufes.inf.nemo.ml2.model.PrimitiveType
import br.ufes.inf.nemo.ml2.model.Reference
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType
import com.google.common.collect.Sets
import java.util.Collections
import java.util.LinkedHashSet
import java.util.Set
import org.eclipse.emf.ecore.EObject

class ML2Util {
	
//	@Inject extension OntoLLib

	def Set<ML2Model> getRechableModels(EntityDeclaration elem){
		val set = new LinkedHashSet<ML2Model>
		if(elem.unnamed) {
			var EObject obj = elem.eContainer
			while(!(obj instanceof ML2Model)) { obj = obj.eContainer }
			set.add(obj as ML2Model)
			set.addAll((obj as ML2Model).includes)
		}
		else {
			set.add(elem.eContainer as ML2Model)
			set.addAll((elem.eContainer as ML2Model).includes)
		}
		return set
	}
	
	def Set<ML2Class> getRechableClasses(EntityDeclaration elem){
		val set = new LinkedHashSet<ML2Class>
		elem.rechableModels.forEach[ elements?.forEach[if(it instanceof ML2Class) set.add(it)] ]
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
	def boolean isConformantTo(EntityDeclaration assignment, ML2Class assigType) {
		return assignment.allInstantiatedClasses.contains(assigType)
	}
	
	def boolean isConformantTo(Literal assignment, PrimitiveType assigType){
		if(assignment instanceof ML2String){
			return assigType==PrimitiveType.STRING
		} else if(assignment instanceof ML2Number){
			return assigType==PrimitiveType.NUMBER
		} else if(assignment instanceof ML2Boolean){
			return assigType==PrimitiveType.BOOLEAN
		}
		return false
	}
	
	def boolean isConformanTo(AttributeAssignment regulatedAssig, RegularityFeatureType regType,
		AttributeAssignment regulatingAssig) {
		switch(regType){
			case DETERMINES_MAX_VALUE: {
				if(regulatedAssig.hasIndividualAssignments)	return false
				val ret = !regulatedAssig.literalAssignments.exists[
					try {
					!(it instanceof ML2Number)
					|| regulatingAssig.literalAssignments?.size != 1
					|| (it as ML2Number).value > (regulatingAssig.literalAssignments.head as ML2Number).value
					}
					catch(ClassCastException e) { return false }
					catch(NullPointerException e) { return false }
				]
				return ret
			}
			case DETERMINES_MIN_VALUE: {
				if(regulatedAssig.hasIndividualAssignments)	return false
				val ret = !regulatedAssig.literalAssignments.exists[
					try {
					!(it instanceof ML2Number)
					|| regulatingAssig.literalAssignments?.size != 1
					|| (it as ML2Number).value < (regulatingAssig.literalAssignments.head as ML2Number).value
					}
					catch(ClassCastException e) { return false }
					catch(NullPointerException e) { return false }
				]
				return ret
			}
			case DETERMINES_VALUE: {
//				val diff = Sets.difference(regulatingAssig.allAssignments.toSet, 
//					regulatedAssig.allAssignments.toSet)
//				if(diff.isEmpty)	return true;
				for(Object obj : regulatedAssig.allAssignments) {
					if(!regulatingAssig.allAssignments.contains(obj))
						return false
				}
				for(Object obj : regulatingAssig.allAssignments) {
					if(!regulatedAssig.allAssignments.contains(obj))
						return false
				}
				return true
			}
			case DETERMINES_ALLOWED_VALUES: {
				return regulatingAssig.allAssignments.containsAll(regulatedAssig.allAssignments)
			}
			default : {}
		}
		
		return false
	}
	
		def boolean isConformanTo(ReferenceAssignment regulatedAssig, RegularityFeatureType regType,
		ReferenceAssignment regulatingAssig) {
		switch(regType){
			case DETERMINES_VALUE: {
				val diff = Sets.difference(regulatedAssig.assignments.toSet, 
					regulatingAssig.assignments.toSet)
				if(diff.isEmpty)	return true;
			}
			case DETERMINES_ALLOWED_VALUES: {
				if(regulatingAssig.assignments.containsAll(regulatedAssig.assignments))
					return true;
			}
			case DETERMINES_TYPE: {
				for(EntityDeclaration value : regulatedAssig.assignments){
					if(!value.allInstantiatedClasses.containsAll(regulatingAssig.assignments))
						return false
				}
				return true
			}
			case DETERMINES_ALLOWED_TYPES: {
				for(EntityDeclaration value : regulatedAssig.assignments){
					if(Collections.disjoint(value.allInstantiatedClasses,regulatingAssig.assignments))
						return false
				}
				return true
			}
			default: {}
		}
		return false
	}

}
