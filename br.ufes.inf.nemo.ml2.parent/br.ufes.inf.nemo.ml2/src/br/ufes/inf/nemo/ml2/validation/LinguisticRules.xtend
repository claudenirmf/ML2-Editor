package br.ufes.inf.nemo.ml2.validation

import com.google.common.collect.Sets
import com.google.inject.Inject
import java.util.Collections
import java.util.LinkedHashSet
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.util.ML2Index
import br.ufes.inf.nemo.ml2.meta.AttributeAssignment
import br.ufes.inf.nemo.ml2.meta.EntityDeclaration
import br.ufes.inf.nemo.ml2.meta.ML2Class
import br.ufes.inf.nemo.ml2.meta.OrderlessClass
import br.ufes.inf.nemo.ml2.meta.FOClass
import br.ufes.inf.nemo.ml2.meta.HOClass
import br.ufes.inf.nemo.ml2.meta.OrderedClass
import br.ufes.inf.nemo.ml2.meta.GeneralizationSet
import br.ufes.inf.nemo.ml2.meta.MetaPackage
import br.ufes.inf.nemo.ml2.meta.Reference
import br.ufes.inf.nemo.ml2.meta.Attribute
import br.ufes.inf.nemo.ml2.meta.ReferenceAssignment
import br.ufes.inf.nemo.ml2.meta.Feature
import br.ufes.inf.nemo.ml2.meta.ML2Model
import br.ufes.inf.nemo.ml2.meta.CategorizationType
import br.ufes.inf.nemo.ml2.meta.DataType
import br.ufes.inf.nemo.ml2.meta.RegularityFeatureType
import br.ufes.inf.nemo.ml2.meta.PrimitiveType
import java.util.HashSet
import br.ufes.inf.nemo.ml2.meta.Literal
import br.ufes.inf.nemo.ml2.meta.FeatureAssignment

class LinguisticRules {
	
	@Inject extension ML2Util
	@Inject extension ML2Index
	
	public static val INVALID_ENTITY_DECLARATION_NAME =	"br.ufes.inf.nemo.meta.InvalidEntityDeclarationName"
	public static val INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.meta.InvalidClassSpecialization"
	public static val CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.meta.CycliSpecialization"
	public static val INVALID_CATEGORIZED_CLASS = "br.ufes.inf.nemo.meta.InvalidCategorizedClass"
	public static val INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.meta.InvalidPowertypeRelation"
	public static val INVALID_SUBORDINATOR = "br.ufes.inf.nemo.meta.InvalidSubordinator"
	public static val DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.meta.DuplicatedEntityName"
	public static val INVALID_GENERALIZATION_SET_MEMBERS = "br.ufes.inf.nemo.meta.InvalidGeneralizationSetMembers"
	public static val MISSING_SPECIALIZATION_THROUGH_SUBODINATION = "br.ufes.inf.nemo.meta.MissingSpecializationThroughSubordination"
	public static val SIMPLE_SUBORDINATION_CYCLE = "br.ufes.inf.nemo.meta.SimpleSubordinationCycle"
	public static val SPECILIZATION_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.meta.SpecializationOfDisjointClasses"
	public static val INSTANCE_OF_DISJOINT_CLASSES = "br.ufes.inf.nemo.meta.InstanceOfDisjointClasses"
	public static val MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET = "br.ufes.inf.nemo.meta.MissingInstantiationOfCompleteGeneralizationSet"
	public static val INVALID_MULTIPLICITY = "br.ufes.inf.nemo.meta.InvalidMultiplicity"
	
	// TODO Update checks table
	public static val NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.meta.NonConformantAssigment"
	public static val FIRST_ORDER_REGULARITY = "br.ufes.inf.nemo.meta.FirstOrderRegularity"
	public static val MISSING_ASSIGNMENT_BY_REGULARITY = "br.ufes.inf.nemo.meta.MissingAssignmentByRegularity"
	public static val UNWANTED_REFERENCES_ON_DATATYPES = "br.ufes.inf.nemo.meta.UnwantedReferencesOnDataTypes"
	public static val RESTRICTED_REGULARITY_TYPE = "br.ufes.inf.nemo.meta.RestrictedRegularityType"
	public static val NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT = "br.ufes.inf.nemo.meta.NonConformantRegulatedFeatureAssignment"
	
	def isNameValid(EntityDeclaration e){
		if(!e.name.equals(e.name.toFirstLower) || e.eContainer instanceof AttributeAssignment)
			return true
		else 
			return false
	}
	
	def isValidSpecialization(ML2Class c){
		if(c.superClasses.exists[ it==c ]){
			return false
		} else if(c instanceof OrderlessClass && c.superClasses.exists[ it instanceof OrderedClass ]){
			return false
		} else if(c instanceof FOClass && c.superClasses.exists[ it instanceof HOClass ]){
			return false
		} else if(c instanceof HOClass && c.superClasses.exists[ it instanceof FOClass ]){
			return false
		} else if(c instanceof HOClass){
			return !c.superClasses.exists[
				if(it instanceof HOClass && (it as HOClass).order!=c.order)	true
				else	false ]
		} else {
			return true
		}
	}
	
	def hasCyclicSpecialization(ML2Class c, Set<ML2Class> ch){
		if(ch.contains(c)) true		else false
	}
	
	def hasValidCategorizedClass(ML2Class c){
		val cat = c.categorizedClass
		if(cat === null)	return true
		else if(c instanceof OrderlessClass) {
			return cat instanceof OrderlessClass
		}
		else if(c instanceof HOClass){
			if(cat instanceof OrderlessClass) {
				if(c.categorizationType==CategorizationType.COMPLETE_CATEGORIZER
					|| c.categorizationType==CategorizationType.PARTITIONER)
					return false
			}
			else if(c.order == MLTRules.MIN_ORDER){
				return !(cat instanceof HOClass)
			}
			else if(c.order != MLTRules.MIN_ORDER && cat instanceof HOClass){
				return c.order == (cat as HOClass).order+1
			}
		} else {
			return true
		}
	}
	
	def hasValidPowertypeRelation(ML2Class c){
		val base = c.powertypeOf
		if(base === null)	
			return true
		else if(c instanceof OrderlessClass)	
			return base instanceof OrderlessClass
		else if(c instanceof HOClass){
			if(base instanceof OrderlessClass)
				return false
			else if(c.order == MLTRules.MIN_ORDER){
				return !(base instanceof HOClass)
			}
			else if(c.order!=MLTRules.MIN_ORDER && base instanceof HOClass)
				return c.order == (base as HOClass).order+1
		} else {
			return true
		}
	}
	
	def hasValidSubordinators(ML2Class c){
		if(c instanceof OrderlessClass)	
			return !c.subordinators.exists[ it instanceof OrderedClass ]
		else if(c instanceof HOClass)
			return !c.subordinators.exists[
				if(it==c)	return true
				else if(it instanceof FOClass)	return true
				else if(it instanceof HOClass)	return it.order != c.order
				else return false			
			]
		else
			return true
	}
	
	def duplicatedEntityName(EntityDeclaration e){
		if(e.eContainer instanceof AttributeAssignment)	return false
		
		val ML2Class = e.eContainer as ML2Model
		return ML2Class.elements.exists[ 
			if(it instanceof EntityDeclaration) it.name.equals(e.name) && it!=e
			else false
		]
	}
	
	def hasValidMembers(GeneralizationSet gs){
		if(gs.specifics.exists[!superClasses.contains(gs.general)])
			return false
		else if(gs.categorizer.categorizedClass!==null && gs.categorizer.categorizedClass!=gs.general)
			return false
		else if(gs.categorizer.categorizedClass!==null && gs.specifics.exists[!instantiatedClasses.contains(gs.categorizer)])
			return false
		else
			return true
	}
	
	def obeysSubordination(ML2Class c, Set<ML2Class> ch, Set<ML2Class> iof){
		val subordinated = new LinkedHashSet<ML2Class>()
		iof.forEach[if(subordinators!==null) subordinated.addAll(subordinators)]
		if(subordinated.size==0)	return true
		
		val superClassesIof = new LinkedHashSet<ML2Class>()
		ch.forEach[superClassesIof.addAll(allInstantiatedClasses)]
		return superClassesIof.containsAll(subordinated)
	}
	
	/**
	 * Checked scenarios:
	 * <br> - C is subordinated to itself
	 * <br> - C is subordinated to X, and X is subordinated to C
	 * <br> - C is subordinated to X, but C is a super class to X
	 */
	def hasSimpleSubordinationCycle(ML2Class c){
		if(c.subordinators===null)	return false
		else return c.subordinators.exists[ sc |
			sc == c || sc?.subordinators.contains(c) || sc.classHierarchy.contains(c)
		]
	}
	
	def ValidationIssue isSpecializingDisjointClasses(ML2Class c, Set<ML2Class> ch){
		for(IEObjectDescription obj : c.getVisibleEObjectDescriptions(MetaPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = c.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			if (gs.isDisjoint && Sets.intersection(ch, gs.specifics.toSet).size > 1){
				val issue = new ValidationWarning
				issue.message = 
					'''«c.name» is specializing disjoint classes.
					«FOR disjoint : Sets.intersection(ch, gs.specifics.toSet)» «(disjoint.eContainer as ML2Model).name».«disjoint.name»; «ENDFOR»).'''
				issue.feature = MetaPackage.eINSTANCE.entityDeclaration_Name
				issue.source = c
				issue.code = SPECILIZATION_OF_DISJOINT_CLASSES
				return issue
			}
		}
		return null
	}
	
	def ValidationIssue isInstanceOfDisjointClasses(EntityDeclaration e, LinkedHashSet<ML2Class> iof){
		for(IEObjectDescription obj : e.getVisibleEObjectDescriptions(MetaPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = e.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			
			if (gs.isDisjoint && Sets.intersection(iof, gs.specifics.toSet).size > 1){
				val issue = new ValidationWarning
				issue.message = 
					'''«e.name» is instance disjoint classes.
					«FOR disjoint : Sets.intersection(iof, gs.specifics.toSet)» «(disjoint.eContainer as ML2Model).name».«disjoint.name»; «ENDFOR»).'''
				issue.feature = MetaPackage.eINSTANCE.entityDeclaration_Name
				issue.source = e
				issue.code = INSTANCE_OF_DISJOINT_CLASSES
				return issue
			}
		}
		return null
	}

	def ValidationIssue missingInstantiationByCompleteness(EntityDeclaration e, LinkedHashSet<ML2Class> iof){
		for(IEObjectDescription obj : e.getVisibleEObjectDescriptions(MetaPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = e.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			
			if (gs.isIsComplete && iof.contains(gs.general) && Collections.disjoint(gs.specifics.toSet,iof)){
				val issue = new ValidationWarning
				issue.message = 
					'''Missing instantions due to completeness of generalization sets.
					«FOR mustiof : gs.specifics» 
						«(mustiof.eContainer as ML2Model).name».«mustiof.name»; 
					«ENDFOR»).'''
				issue.feature = MetaPackage.eINSTANCE.entityDeclaration_Name
				issue.source = e
				issue.code = MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET
				return issue
			}
		}
		return null
	}	
	
	def dispatch ValidationIssue checkSubsettedMultiplicity(Reference ref){
		if(ref.subsetOf === null)	return null
		val issue = new ValidationError
		issue.source = ref
		issue.code = INVALID_MULTIPLICITY
		for(Reference superRef : ref.subsetOf){
			if(ref.lowerBound < superRef.lowerBound){
				issue.feature = MetaPackage.eINSTANCE.feature_LowerBound
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				return issue
			} else if(ref.upperBound > superRef.upperBound && superRef.upperBound > 0){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				issue.feature = MetaPackage.eINSTANCE.feature_UpperBound
				return issue
			} else if(ref.upperBound==-1 && ref.upperBound!=superRef.upperBound){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				issue.feature = MetaPackage.eINSTANCE.feature_UpperBound
				return issue
			}
		}
		return null
	}
	
	def dispatch ValidationIssue checkSubsettedMultiplicity(Attribute att){
		if(att.subsetOf === null)	return null
		val issue = new ValidationError
		issue.source = att
		issue.code = INVALID_MULTIPLICITY
		for(Attribute superAtt : att.subsetOf){
			if(att.lowerBound < superAtt.lowerBound){
				issue.feature = MetaPackage.eINSTANCE.feature_LowerBound
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				return issue
			} else if(att.upperBound > superAtt.upperBound && superAtt.upperBound > 0){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				issue.feature = MetaPackage.eINSTANCE.feature_UpperBound
				return issue
			} else if(att.upperBound==-1 && att.upperBound!=superAtt.upperBound){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				issue.feature = MetaPackage.eINSTANCE.feature_UpperBound
				return issue
			}
		}
		return null
	}
	
	def dispatch ValidationIssue checkMultiplicityAndAssignment(ReferenceAssignment ra){
		val nAssgns = ra.assignments?.size
		val ref = ra.reference
		if(nAssgns < ref.lowerBound){
			val issue = new ValidationWarning()
			issue.message = '''Number of assignments must equal or greater than «ref.lowerBound».'''
			issue.source = ra
			issue.feature = MetaPackage.eINSTANCE.referenceAssignment_Assignments
			issue.code = LinguisticRules.INVALID_MULTIPLICITY
			return issue
		}
		else if(nAssgns > ref.upperBound && ref.upperBound > 0){
			val issue = new ValidationWarning()
			issue.message = '''Number of assignments must equal or less than «ref.upperBound».'''
			issue.source = ra
			issue.feature = MetaPackage.eINSTANCE.referenceAssignment_Assignments
			issue.code = LinguisticRules.INVALID_MULTIPLICITY
			return issue
		}
		else
			return null
	}
	
	def dispatch ValidationIssue checkMultiplicityAndAssignment(AttributeAssignment aa){
		val nAssgns = aa.individualAssignments?.size 
			+ aa.unnamedIndividualAssignments?.size
			+ aa.literalAssignments?.size
		val att = aa.attribute

		val issue = new ValidationWarning()
		issue.source = aa
		issue.feature = MetaPackage.eINSTANCE.attributeAssignment_Attribute
		issue.code = LinguisticRules.INVALID_MULTIPLICITY

		if(nAssgns < att.lowerBound){
			issue.message = '''Number of assignments must equal or greater than «att.lowerBound».'''
			return issue
		}
		else if(nAssgns > att.upperBound && att.upperBound > 0){
			issue.message = '''Number of assignments must equal or less than «att.upperBound».'''
			return issue
		}
		else
			return null
	}
	
	def dispatch ValidationIssue checkFeatureAssignmentType(ReferenceAssignment ra){
		val ref = ra.reference
		val assigType = ref._type
		
		val issue = new ValidationError
		issue.source = ra
		issue.feature = MetaPackage.eINSTANCE.referenceAssignment_Assignments
		
		for(EntityDeclaration assig : ra.assignments){
			if(!assig.isConformantTo(assigType)){
				issue.message = '''All assignments must be instances of «assigType.name».'''
				issue.index = ra.assignments.indexOf(assig)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		return null;
	}
	
	def dispatch ValidationIssue checkFeatureAssignmentType(AttributeAssignment aa){
		val att = aa.attribute
		val entityAssigs = new HashSet<EntityDeclaration>()
		entityAssigs.addAll(aa.individualAssignments)
		entityAssigs.addAll(aa.unnamedIndividualAssignments)
		
		val issue = new ValidationError
		issue.source = aa
		issue.feature = MetaPackage.eINSTANCE.attributeAssignment_Attribute
		
		for(EntityDeclaration ent : entityAssigs){
			if(!ent.isConformantTo(att._type)){
				issue.message = '''All assignments must be instances of «att._type.name».'''
//				issue.index = aa.individualAssignments.indexOf(obj)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		for(Literal lit : aa.literalAssignments){
			if(!lit.isConformantTo(att.primitiveType)){
				issue.message = '''All assignments must be instances of «att.primitiveType».'''
//				issue.index = aa.literalAssignments.indexOf(obj)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		return null;
	}
	
	def ValidationIssue checkRegularityAndContainer(Feature f) {
		if(f.regulatedFeature===null)
			return null
		else if(f.eContainer instanceof FOClass){
			val issue = new ValidationError
			issue.source = f
			issue.feature = MetaPackage.eINSTANCE.feature_RegulatedFeature
			issue.message = '''Regularity attributes do not apply to first-order classes.'''
			issue.code = FIRST_ORDER_REGULARITY
			return issue
		}
		else if(f.regularityType==RegularityFeatureType.DETERMINES_MAX_VALUE
			|| f.regularityType==RegularityFeatureType.DETERMINES_MIN_VALUE) {
			if(!(f instanceof Attribute) || (f as Attribute).primitiveType!=PrimitiveType.NUMBER) {
				val issue = new ValidationError
				issue.source = f
				issue.feature = MetaPackage.eINSTANCE.feature_RegularityType
				issue.message = '''This type of regularity feature only applies to numbers.'''
				issue.code = RESTRICTED_REGULARITY_TYPE
				return issue
			}
		}
		else if(f.regularityType==RegularityFeatureType.DETERMINES_ALLOWED_TYPES
			|| f.regularityType==RegularityFeatureType.DETERMINES_TYPE) {
			if(f instanceof Attribute && !(f as Attribute).eIsSet(MetaPackage.eINSTANCE.attribute__type)) {
				val issue = new ValidationError
				issue.source = f
				issue.feature = MetaPackage.eINSTANCE.feature_RegularityType
				issue.message = '''This type of regularity feature do not apply to primitive types.'''
				issue.code = RESTRICTED_REGULARITY_TYPE
				return issue
			}
		}
		return null
	}
	
	def ValidationIssue checkInstantiatedRegularities(ML2Class c){
		/* Looks for assignments within the class */
		val rFeatures = c.allFeatures.filter[ it.regulatedFeature!==null ].toSet
		c.assignments.forEach[ f |
			if(f instanceof AttributeAssignment)
				rFeatures.remove(f.attribute)
			else if(f instanceof ReferenceAssignment)
				rFeatures.remove(f.reference)]
		
		/* If there are no regularities, returns and avoids the slower
		 * checking bellow */
		if(rFeatures.empty)	return null
		
		/* Looks for assignments within the super classes */
		c.classHierarchy.forEach[ sc |
			sc.assignments.forEach[ f |
				if(f instanceof AttributeAssignment)
					rFeatures.remove(f.attribute)
				else if(f instanceof ReferenceAssignment)
					rFeatures.remove(f.reference)]
		]
		
		/* If there are no regularities, returns */
		if(rFeatures.empty)	return null
		
		val issue = new ValidationWarning
		issue.source = c
		issue.feature = MetaPackage.eINSTANCE.entityDeclaration_Name
		issue.message = '''The regularity feature «rFeatures.head.name» should have an assigned value.'''
		issue.code = MISSING_ASSIGNMENT_BY_REGULARITY
		return issue
	}
	
	def ValidationIssue containsReferences(DataType d){
		if(d.references.isEmpty)	return null
		else {
			val i = new ValidationWarning
			i.source = d
			i.feature = MetaPackage.eINSTANCE.entityDeclaration_Name
			i.message = '''The use of references on datatypes might be unwanted.'''
			i.code = UNWANTED_REFERENCES_ON_DATATYPES
			return i
		}
	}
	
	dispatch def ValidationIssue checkRegularityFeatureConformance(AttributeAssignment atta){
		val att = atta.attribute
		val regAttSet = new LinkedHashSet<Attribute>
		val knowClasses = (atta.eContainer as EntityDeclaration).rechableClasses
		knowClasses.forEach[ c | c.attributes.forEach[
			if(it.regulatedFeature == att)	regAttSet.add(it) ]]
		if(regAttSet.isEmpty)	return null
		
		val regAttAssigSet = new LinkedHashSet<AttributeAssignment>
		for(ML2Class c : (atta.eContainer as EntityDeclaration).instantiatedClasses) {
			for(FeatureAssignment it : c.assignments) {
				if(it instanceof AttributeAssignment)
					if(regAttSet.contains(it.attribute))	regAttAssigSet.add(it)
			}
		}
		if(regAttAssigSet.isEmpty)	return null
		
		for(AttributeAssignment regAttAssig : regAttAssigSet) {
			for(Attribute regAtt : regAttSet) {
				if(regAttAssig.attribute!=regAtt) {}
				else if(!atta.isConformanTo(regAtt.regularityType, regAttAssig)) {
					val i = new ValidationWarning
					i.source = atta
					i.feature = MetaPackage.eINSTANCE.attributeAssignment_Attribute
					i.message = '''Assignment is non-conformant to the regularity feature «regAtt.name» of «(regAtt.eContainer as ML2Class).name».'''
					i.code = NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT
					return i
				}
			}
		}
		return null
	}
	
	dispatch def ValidationIssue checkRegularityFeatureConformance(ReferenceAssignment refa){
		/* From an assignment, takes the reference and looks for regularities over it */
		val ref = refa.reference
		val regRefSet = new LinkedHashSet<Reference>
		val knowClasses = (refa.eContainer as EntityDeclaration).rechableClasses
		knowClasses.forEach[ c | c.references.forEach[
			if(it.regulatedFeature == ref)	regRefSet.add(it) ]]
		
		/* If no regularity is found, returns */
		if(regRefSet.isEmpty)	return null
		
		/* Then, looks for assignments of those regularities in order to know the specified regulations */
		val regRefAssigSet = new LinkedHashSet<ReferenceAssignment>
		for(ML2Class c : (refa.eContainer as EntityDeclaration).instantiatedClasses) {
			for(FeatureAssignment it : c.assignments) {
				if(it instanceof ReferenceAssignment)
					if(regRefSet.contains(it.reference))	regRefAssigSet.add(it)
			}
		}
		/* If no specified regulation is found, returns */
		if(regRefAssigSet.isEmpty)	return null
		
		/* For each pair "regularity feature"/"specified regulation", verifies if the given 
		 * feature conforms to it.
		 */
		for(ReferenceAssignment regRefAssig : regRefAssigSet) {
			for(Reference regRef : regRefSet) {
				if(!refa.isConformanTo(regRef.regularityType, regRefAssig)) {
					val i = new ValidationWarning
					i.source = refa
					i.feature = MetaPackage.eINSTANCE.referenceAssignment_Reference
					i.message = '''Assignment is non-conformant to the regularity feature «regRef.name» of «(regRef.eContainer as ML2Class).name».'''
					i.code = NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT
					return i
				}
			}
		}
		return null
	}
	
}