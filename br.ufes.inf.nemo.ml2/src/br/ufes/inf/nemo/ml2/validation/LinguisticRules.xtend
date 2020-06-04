package br.ufes.inf.nemo.ml2.validation

import com.google.common.collect.Sets
import com.google.inject.Inject
import java.util.Collections
import java.util.LinkedHashSet
import java.util.Set
import java.util.HashSet
import org.eclipse.xtext.resource.IEObjectDescription
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.util.ML2Index
import br.ufes.inf.nemo.ml2.model.Class
import br.ufes.inf.nemo.ml2.model.EntityDeclaration
import br.ufes.inf.nemo.ml2.model.AttributeAssignment
import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment
import br.ufes.inf.nemo.ml2.model.Reference
import br.ufes.inf.nemo.ml2.model.FeatureAssignment
import br.ufes.inf.nemo.ml2.model.Individual
import br.ufes.inf.nemo.ml2.model.HigherOrderClass
import br.ufes.inf.nemo.ml2.model.FirstOrderClass
import br.ufes.inf.nemo.ml2.model.HighOrderClass
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType
import br.ufes.inf.nemo.ml2.model.Attribute
import br.ufes.inf.nemo.ml2.model.PrimitiveType
import br.ufes.inf.nemo.ml2.model.Feature
import br.ufes.inf.nemo.ml2.model.OrderlessClass
import br.ufes.inf.nemo.ml2.model.DataType
import br.ufes.inf.nemo.ml2.model.OrderedClass
import br.ufes.inf.nemo.ml2.model.CategorizationType
import br.ufes.inf.nemo.ml2.model.Model
import br.ufes.inf.nemo.ml2.model.GeneralizationSet
import br.ufes.inf.nemo.ml2.model.RegularityFeature
import br.ufes.inf.nemo.ml2.model.RegularityAttribute
import org.eclipse.emf.ecore.EObject
import br.ufes.inf.nemo.ml2.model.RegularityReference

class LinguisticRules {
	
	@Inject extension ML2Util
	@Inject extension ML2Index
	
	public static val INVALID_ENTITY_DECLARATION_NAME =	"br.ufes.inf.nemo.meta.InvalidEntityDeclarationName"
	public static val INVALID_FEATURE_NAME =	"br.ufes.inf.nemo.meta.InvalidFeatureName"
	public static val INVALID_CLASS_SPECIALIZATION = "br.ufes.inf.nemo.meta.InvalidClassSpecialization"
	public static val CYCLIC_SPECIALIZATION = "br.ufes.inf.nemo.meta.CycliSpecialization"
	public static val INVALID_CATEGORIZED_CLASS = "br.ufes.inf.nemo.meta.InvalidCategorizedClass"
	public static val INVALID_POWERTYPE_RELATION = "br.ufes.inf.nemo.meta.InvalidPowertypeRelation"
	public static val INVALID_SUBORDINATOR = "br.ufes.inf.nemo.meta.InvalidSubordinator"
	public static val DUPLICATED_ENTITY_NAME = "br.ufes.inf.nemo.meta.DuplicatedEntityName"
	public static val DUPLICATED_FEATURE_NAME = "br.ufes.inf.nemo.meta.DuplicatedFeatureName"
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
	public static val INVALID_INSTANTIATION = "br.ufes.inf.nemo.meta.InvalidInstantiation"
	public static val INVALID_GENERALIZATION_SET_CATEGORIZATION_COMBINATION = "br.ufes.inf.nemo.meta.InvalidGeneralizationSetCategorizationCombination"
	
	def isNameValid(EntityDeclaration e){
		if(!e.name.equals(e.name.toFirstLower) || e.eContainer instanceof AttributeAssignment)
			return null
		else 
			return new ValidationError('''Entity name must start with a capital letter.''',
				ModelPackage.eINSTANCE.entityDeclaration_Name,-1,
				LinguisticRules.INVALID_ENTITY_DECLARATION_NAME,null,e)
	}
	
	def ValidationIssue isValidInstantiation(EntityDeclaration e) {
		var Class invalid
		if(e instanceof Individual) {
			invalid = e.classifiers.findFirst[ it instanceof HigherOrderClass ]
		} 
		else if (e instanceof FirstOrderClass) {
			invalid = e.classifiers.findFirst[ 
					if(it instanceof FirstOrderClass)	return true
					else if(it instanceof HighOrderClass)
						if(it.order!=MLTRules.MIN_ORDER)	return true
					return false
				]
		} 
		else if (e instanceof HighOrderClass) {
			invalid = e.classifiers.findFirst[
					if(it instanceof FirstOrderClass)	return true
					else if(it instanceof HighOrderClass)
						if(it.order!=e.order+1)	return true
					return false
				]
		} 
		else if (e instanceof OrderlessClass) {
			invalid = e.classifiers.findFirst[ !(it instanceof OrderlessClass) ]
		}
		
		if(invalid==null)	return null
		else
			return new ValidationError('''Invalid instantiation of «invalid.name»''',
					ModelPackage.eINSTANCE.entityDeclaration_Classifiers,
					e.classifiers.indexOf(invalid),
					INVALID_INSTANTIATION,
					null,
					e)
	}
	
	def isValidSpecialization(Class c){
		var Class invalid = null

		if(c.superClasses.contains(c))	
			invalid = c
		else if(c instanceof OrderlessClass) 
			invalid = c.superClasses.findFirst[ it instanceof OrderedClass ]
		else if(c instanceof FirstOrderClass) 
			invalid = c.superClasses.findFirst[ it instanceof HighOrderClass ]
		else if(c instanceof HighOrderClass) 
			invalid = c.superClasses.findFirst[ 
						if(it instanceof FirstOrderClass)	true
						else if(it instanceof HighOrderClass)	c.order != it.order
						else false
					]
		
		if(invalid==null)	return null
		else	return new ValidationError('''Invalid specialization of «invalid.name».''',
				ModelPackage.eINSTANCE.class_SuperClasses,
				c.superClasses.indexOf(invalid),
				LinguisticRules.INVALID_CLASS_SPECIALIZATION,
				ValidationIssue.NO_ISSUE_CODE,
				c)
	}
	
	def hasCyclicSpecialization(Class c, Set<Class> ch){
		if(ch.contains(c)) 
			new ValidationError('''Invalid cyclic specialization.''',
					ModelPackage.eINSTANCE.class_SuperClasses,
					ValidationIssue.NO_INDEX,
					LinguisticRules.CYCLIC_SPECIALIZATION,
					ValidationIssue.NO_ISSUE_CODE,
					c)
		else
			null
	}
	
	def hasValidCategorizedClass(HigherOrderClass c){
		val cat = c.categorizedClass
		var msg = ""
		
		if(cat === null)
			return null
		
		else if(c instanceof OrderlessClass && cat instanceof OrderedClass)
			msg = '''Invalid categorization of an ordered class.'''
		
		else if(c instanceof HighOrderClass){
			if(cat instanceof OrderlessClass && c.categorizationType === CategorizationType.COMPLETE_CATEGORIZER)
				msg = '''Invalid complete categorization of an orderless class.'''
			
			else if(cat instanceof OrderlessClass && c.categorizationType === CategorizationType.PARTITIONER)
				msg = '''Invalidation partitioning of an orderless class.'''
			
			else if(cat instanceof HighOrderClass)
				if(c.order === MLTRules.MIN_ORDER || c.order !== cat.order+1)
					msg = '''Invalid categorization of a class of order different than «c.order-1».'''
		}
		
		if(msg=="")	return null
		else		return new ValidationError(msg,
							ModelPackage.eINSTANCE.higherOrderClass_CategorizedClass,
							ValidationIssue.NO_INDEX,
							INVALID_CATEGORIZED_CLASS,
							ValidationIssue.NO_ISSUE_CODE,
							c)
	}
	
	def hasValidPowertypeRelation(HigherOrderClass c){
		val base = c.powertypeOf
		var String msg = ""
		
		if(base === null)	return null
		
		else if(c instanceof OrderlessClass && base instanceof OrderedClass)
			msg = '''Invalid powertype relation towards an ordered basetype.'''
		
		else if(c instanceof HighOrderClass){
			if(base instanceof OrderlessClass)
				msg = '''Invalid powertype relation towards an orderless basetype.'''
				
			else if(base instanceof HighOrderClass)
				if(c.order === MLTRules.MIN_ORDER || c.order !== base.order+1)
					msg = '''Invalid powertype relation towards a class of order different than «c.order-1».'''
		} 
		
		if(msg=="")	return null
		else		return new ValidationError(msg,
							ModelPackage.eINSTANCE.higherOrderClass_PowertypeOf,
							ValidationIssue.NO_INDEX,
							INVALID_POWERTYPE_RELATION,
							ValidationIssue.NO_ISSUE_CODE,
							c)
	}
	
	def hasValidSubordinators(HigherOrderClass c){
		var Class invalid = null
		var msg = ""
		val issue = new ValidationError
		
		if(c.subordinators.contains(c)) {
			invalid = c
			msg = '''Invalid subordination to itself.'''
		}
		else {
			invalid = c.subordinators.findFirst[
						if(it instanceof FirstOrderClass){
							issue.message = '''Invalid subordination to a first-order class.'''
							return true
						} else if(c instanceof OrderlessClass && it instanceof OrderedClass) {
							issue.message = '''Invalid subordination to an ordered class.'''
							return true
						} else if(c instanceof HighOrderClass && it instanceof HighOrderClass && (it as HighOrderClass).order!==(c as HighOrderClass).order) {
							issue.message = '''Invalid subordination to an ordered class of different order.'''
							return true
						} else {
							false
						}
					]
		}
		
		if(invalid===null)	return null
		else {
			issue.feature = ModelPackage.eINSTANCE.higherOrderClass_Subordinators
			issue.index = c.subordinators.indexOf(invalid)
			issue.code = INVALID_SUBORDINATOR
			issue.source = c
			return issue
		}
	}
	
	def duplicatedEntityName(EntityDeclaration e){
		if(e.eContainer instanceof AttributeAssignment)	return null
		
		val rep = (e.eContainer as Model).elements.filter[ 
					it instanceof EntityDeclaration && (it as EntityDeclaration).name == e.name
				]
		if(rep.size > 1)
			return new ValidationError('''Entity name must be unique.''',
					ModelPackage.eINSTANCE.entityDeclaration_Name,
					ValidationIssue.NO_INDEX,
					LinguisticRules.DUPLICATED_ENTITY_NAME,
					ValidationIssue.NO_ISSUE_CODE,
					e)
		else
			return null
	}
	
	def hasValidMembers(GeneralizationSet gs){
		var Class invalid = null
		
		invalid = gs.specifics.findFirst[!superClasses.contains(gs.general)]
		if(invalid!==null)
			return new ValidationError('''Invalid member is not a direct specialization of the general class.''',
					ModelPackage.eINSTANCE.generalizationSet_Specifics,
					gs.specifics.indexOf(invalid),
					LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS,
					ValidationIssue.NO_ISSUE_CODE,
					gs)
		
		if(gs.categorizer !== null) {
			val cat = gs.categorizer
			if(cat.categorizedClass != gs.general)
				return new ValidationError('''The categorizer class must have a categorization relation towards the general class.''',
						ModelPackage.eINSTANCE.generalizationSet_Categorizer,
						ValidationIssue.NO_INDEX,
						LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS,
						ValidationIssue.NO_ISSUE_CODE,
						gs)
			
			invalid = gs.specifics.findFirst[!classifiers.contains(cat)]
			if(invalid!==null)
				return new ValidationError('''The specific class must be direct instances of the categorizer class.''',
						ModelPackage.eINSTANCE.generalizationSet_Specifics,
						gs.specifics.indexOf(invalid),
						LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS,
						ValidationIssue.NO_ISSUE_CODE,
						gs)
			
			
			// TODO Test the verification of combinations of generalization set constraints
			var msg = ""
			switch (cat.categorizationType) {
				case CategorizationType.CATEGORIZER: {
					if(gs.isComplete)
						msg = '''Simple categorization and complete generalization set is an invalid combination.'''
				}
				case CategorizationType.DISJOINT_CATEGORIZER: {
					if(!gs.isDisjoint || gs.isComplete)
						msg = '''Disjoint categorization and non disjoint and incomplete generalization set is an invalid combination.'''
				}
				case CategorizationType.PARTITIONER: {
					if(!gs.isDisjoint)
						msg = '''Partitioning categorization and non disjoint generalization set is an invalid combination.'''
				}
			}
			
			if(msg!="")
				return new ValidationError(msg,
						ModelPackage.eINSTANCE.generalizationSet_Categorizer,
						ValidationIssue.NO_INDEX,
						INVALID_GENERALIZATION_SET_CATEGORIZATION_COMBINATION,
						ValidationIssue.NO_ISSUE_CODE,
						gs)
		}
		
		return null
	}
	
	// TODO: enable constraint	
//	def obeysSubordination(Class c, Set<Class> ch, Set<Class> iof){
//		val subordinated = new LinkedHashSet<Class>()
//		iof.forEach[if(subordinators!==null) subordinated.addAll(subordinators)]
//		if(subordinated.size==0)	return null
//		
//		val superClassesIof = new LinkedHashSet<Class>()
//		ch.forEach[superClassesIof.addAll(allInstantiatedClasses)]
//		
//		val invalid = subordinated.findFirst[!superClassesIof.contains(it)]
//		if(invalid===null)	return null
//		else				return new ValidationError('''Missing specialization due to subordination to some instance of «invalid.name».''',
//									Ml2Package.eINSTANCE.class_SuperClasses,
//									ValidationIssue.NO_INDEX,
//									MISSING_SPECIALIZATION_THROUGH_SUBODINATION,
//									ValidationIssue.NO_ISSUE_CODE,
//									c)
//	}
	
	/**
	 * Checked scenarios:
	 * <br> - C is subordinated to itself
	 * <br> - C is subordinated to X, and X is subordinated to C
	 * <br> - C is subordinated to X, but C is a super class to X
	 */
	def hasSimpleSubordinationCycle(HigherOrderClass c){
		if(c.subordinators===null)	return null
		
		val invalid = c.subordinators.findFirst[ sc |
				sc == c || sc?.subordinators.contains(c) || sc.classHierarchy.contains(c)
			]
		if(invalid===null)	return null
		else				return new ValidationError('''«c.name» is in a invalid subordination cycle with «invalid.name».''',
									ModelPackage.eINSTANCE.higherOrderClass_Subordinators,
									c.subordinators.indexOf(invalid),
									SIMPLE_SUBORDINATION_CYCLE,
									ValidationIssue.NO_ISSUE_CODE,
									c)
	}
	
	def ValidationIssue isSpecializingDisjointClasses(Class c, Set<Class> ch){
		for(IEObjectDescription obj : c.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = c.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			if (gs.isDisjoint && Sets.intersection(ch, gs.specifics.toSet).size > 1){
				val issue = new ValidationWarning
				issue.message = 
					'''«c.name» is specializing disjoint classes.
					«FOR disjoint : Sets.intersection(ch, gs.specifics.toSet)» «(disjoint.eContainer as Model).name».«disjoint.name»; «ENDFOR»).'''
				issue.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
				issue.source = c
				issue.code = SPECILIZATION_OF_DISJOINT_CLASSES
				return issue
			}
		}
		return null
	}
	
	def ValidationIssue isInstanceOfDisjointClasses(EntityDeclaration e, LinkedHashSet<Class> iof){
		for(IEObjectDescription obj : e.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = e.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			
			if (gs.isDisjoint && Sets.intersection(iof, gs.specifics.toSet).size > 1){
				val issue = new ValidationWarning
				issue.message = 
					'''«e.name» is instance disjoint classes.
					«FOR disjoint : Sets.intersection(iof, gs.specifics.toSet)» «(disjoint.eContainer as Model).name».«disjoint.name»; «ENDFOR»).'''
				issue.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
				issue.source = e
				issue.code = INSTANCE_OF_DISJOINT_CLASSES
				return issue
			}
		}
		return null
	}

	def ValidationIssue missingInstantiationByCompleteness(EntityDeclaration e, LinkedHashSet<Class> iof){
		for(IEObjectDescription obj : e.getVisibleEObjectDescriptions(ModelPackage.eINSTANCE.generalizationSet)){
			var gs = obj.EObjectOrProxy as GeneralizationSet
			if(gs.eIsProxy) gs = e.eResource.resourceSet.getEObject(obj.EObjectURI, true) as GeneralizationSet
			
			if (gs.isIsComplete && iof.contains(gs.general) && Collections.disjoint(gs.specifics.toSet,iof)){
				val issue = new ValidationWarning
				issue.message = 
					'''Missing instantions due to completeness of generalization sets.
				«FOR mustiof : gs.specifics» 
					«(mustiof.eContainer as Model).name».«mustiof.name»; 
				«ENDFOR»).'''
				issue.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
				issue.source = e
				issue.code = MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET
				return issue
			}
		}
		return null
	}	
	
	def checkFeatureName(Feature f){
		val eStrFeat = f instanceof Attribute ?
				ModelPackage.eINSTANCE.attribute_Name :
				ModelPackage.eINSTANCE.reference_Name;
		
		if(f.name.toFirstUpper==f.name) {
			return new ValidationError('''Invalid name starting with capitalized letter.''',
					eStrFeat,
					ValidationIssue.NO_INDEX,
					INVALID_FEATURE_NAME,
					ValidationIssue.NO_ISSUE_CODE,
					f)
		}
		
		val c = f.eContainer
		if(c instanceof Class) {
			if(c.features.exists[ f!==it && f.name == it.name]) {
				return new ValidationError('''Invalid duplicated name.''',
						eStrFeat,
						ValidationIssue.NO_INDEX,
						DUPLICATED_FEATURE_NAME,
						ValidationIssue.NO_ISSUE_CODE,
						f)
			}
		}
		
		return null
	}
	
	def dispatch ValidationIssue checkSubsettedMultiplicity(Reference ref){
		val eStrFeat = ModelPackage.eINSTANCE.reference_UpperBound;

		if(ref.subsetOf === null)	return null
		val issue = new ValidationError
		issue.source = ref
		issue.code = INVALID_MULTIPLICITY
		for(Reference superRef : ref.subsetOf){
//			if(ref.lowerBound < superRef.lowerBound){
//				issue.feature = Ml2Package.eINSTANCE.feature_LowerBound
//				issue.message = 
//					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
//				return issue
//			} else 
			if(ref.upperBound > superRef.upperBound && superRef.upperBound > 0){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				issue.feature = eStrFeat
				return issue
			} else if(ref.upperBound==-1 && ref.upperBound!=superRef.upperBound){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superRef.name»).'''
				issue.feature = eStrFeat
				return issue
			}
		}
		return null
	}
	
	def dispatch ValidationIssue checkSubsettedMultiplicity(Attribute att){
		val eStrFeat = ModelPackage.eINSTANCE.attribute_UpperBound;
		
		if(att.subsetOf === null)	return null
		val issue = new ValidationError
		issue.source = att
		issue.code = INVALID_MULTIPLICITY
		for(Attribute superAtt : att.subsetOf){
//			if(att.lowerBound < superAtt.lowerBound){
//				issue.feature = Ml2Package.eINSTANCE.feature_LowerBound
//				issue.message = 
//					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
//				return issue
//			} else 
			if(att.upperBound > superAtt.upperBound && superAtt.upperBound > 0){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				issue.feature = eStrFeat
				return issue
			} else if(att.upperBound==-1 && att.upperBound!=superAtt.upperBound){
				issue.message = 
					'''The cardinality must be as restrictive as the the subsetted one («superAtt.name»).'''
				issue.feature = eStrFeat
				return issue
			}
		}
		return null
	}
	
	def dispatch ValidationIssue checkMultiplicityAndAssignment(ReferenceAssignment ra){
		val nAssgns = ra.values?.size
		val ref = ra.reference
		if(nAssgns < ref.lowerBound){
			val issue = new ValidationWarning()
			issue.message = '''Number of assignments must equal or greater than «ref.lowerBound».'''
			issue.source = ra
			issue.feature = ModelPackage.eINSTANCE.referenceAssignment_Values
			issue.code = LinguisticRules.INVALID_MULTIPLICITY
			return issue
		}
		else if(nAssgns > ref.upperBound && ref.upperBound > 0){
			val issue = new ValidationWarning()
			issue.message = '''Number of assignments must equal or less than «ref.upperBound».'''
			issue.source = ra
			issue.feature = ModelPackage.eINSTANCE.referenceAssignment_Values
			issue.code = LinguisticRules.INVALID_MULTIPLICITY
			return issue
		}
		else
			return null
	}
	
	def dispatch ValidationIssue checkMultiplicityAndAssignment(AttributeAssignment aa){
		val nAssgns = aa.datatypeValues?.size  + aa.unnamedValues?.size + aa.literalValues?.size
		val att = aa.attribute

		val issue = new ValidationWarning()
		issue.source = aa
		issue.feature = ModelPackage.eINSTANCE.attributeAssignment_Attribute
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
		issue.feature = ModelPackage.eINSTANCE.referenceAssignment_Values
		
		for(EntityDeclaration assig : ra.values){
			if(!assig.isConformantTo(assigType)){
				issue.message = '''All assignments must be instances of «assigType.name».'''
				issue.index = ra.values.indexOf(assig)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		return null;
	}
	
	def dispatch ValidationIssue checkFeatureAssignmentType(AttributeAssignment aa){
		val att = aa.attribute
		val entityAssigs = new HashSet<EntityDeclaration>()
		entityAssigs.addAll(aa.datatypeValues)
		entityAssigs.addAll(aa.unnamedValues)
		
		val issue = new ValidationError
		issue.source = aa
		issue.feature = ModelPackage.eINSTANCE.attributeAssignment_Attribute
		
		for(EntityDeclaration ent : entityAssigs){
			if(!ent.isConformantTo(att._type)){
				issue.message = '''All assignments must be instances of «att._type.name».'''
//				issue.index = aa.datatypeValues.indexOf(obj)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		for(EObject lit : aa.literalValues){
			if(!lit.isConformantTo(att.primitiveType)){
				issue.message = '''All assignments must be instances of «att.primitiveType».'''
//				issue.index = aa.literalAssignments.indexOf(obj)
				issue.code = NON_CONFORMANT_ASSIGNMENT
				return issue
			}
		}
		return null;
	}
	
	def ValidationIssue checkRegularityAndContainer(RegularityFeature f) {
		val eStrFeat = f instanceof RegularityAttribute ?
				ModelPackage.eINSTANCE.regularityAttribute_Regulates :
				ModelPackage.eINSTANCE.regularityReference_Regulates;
		
		if(f.regulates===null)
			return null
		else if(f.eContainer instanceof FirstOrderClass){
			val issue = new ValidationError
			issue.source = f
			issue.feature = eStrFeat
			issue.message = '''Regularity attributes do not apply to first-order classes.'''
			issue.code = FIRST_ORDER_REGULARITY
			return issue
		}
		else if(f.regularityType==RegularityFeatureType.DETERMINES_MAX_VALUE
			|| f.regularityType==RegularityFeatureType.DETERMINES_MIN_VALUE) {
			if(!(f instanceof Attribute) || (f as Attribute).primitiveType!=PrimitiveType.NUMBER) {
				val issue = new ValidationError
				issue.source = f
				issue.feature = eStrFeat
				issue.message = '''This type of regularity feature only applies to numbers.'''
				issue.code = RESTRICTED_REGULARITY_TYPE
				return issue
			}
		}
		else if(f.regularityType==RegularityFeatureType.DETERMINES_ALLOWED_TYPES
			|| f.regularityType==RegularityFeatureType.DETERMINES_TYPE) {
			if(f instanceof Attribute && !(f as Attribute).eIsSet(ModelPackage.eINSTANCE.attribute__type)) {
				val issue = new ValidationError
				issue.source = f
				issue.feature = eStrFeat
				issue.message = '''This type of regularity feature do not apply to primitive types.'''
				issue.code = RESTRICTED_REGULARITY_TYPE
				return issue
			}
		}
		return null
	}
	
	def ValidationIssue checkInstantiatedRegularities(Class c){
		/* Looks for assignments within the class */
		val rFeatures = c.allFeatures.filter[ 
			it instanceof RegularityFeature 
			&& (it as RegularityFeature).regulates!==null
		].toSet
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
		issue.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
		issue.message = '''The regularity feature «rFeatures.head.name» should have an assigned value.'''
		issue.code = MISSING_ASSIGNMENT_BY_REGULARITY
		return issue
	}
	
	def ValidationIssue containsReferences(DataType d){
		if(d.references.isEmpty)	return null
		else {
			val i = new ValidationWarning
			i.source = d
			i.feature = ModelPackage.eINSTANCE.entityDeclaration_Name
			i.message = '''The use of references on datatypes might be unwanted.'''
			i.code = UNWANTED_REFERENCES_ON_DATATYPES
			return i
		}
	}
	
	// TODO: enable constraint
//	dispatch def ValidationIssue checkRegularityFeatureConformance(AttributeAssignment atta){
//		val att = atta.attribute
//		val regAttSet = new LinkedHashSet<RegularityAttribute>
//		val knowClasses = (atta.eContainer as EntityDeclaration).rechableClasses
//		
//		knowClasses.forEach[ c | c.attributes.forEach[
//			if(it instanceof RegularityAttribute && (it as RegularityAttribute).regulates == att)	{
//				regAttSet.add(it as RegularityAttribute)
//			} 
//		]]
//		
//		if(regAttSet.isEmpty)	return null
//		
//		val regAttAssigSet = new LinkedHashSet<AttributeAssignment>
//		
//		for(Class c : (atta.eContainer as EntityDeclaration).classifiers) {
//			for(FeatureAssignment it : c.assignments) {
//				if(it instanceof AttributeAssignment)
//					if(regAttSet.contains(it.attribute))	regAttAssigSet.add(it)
//			}
//		}
//		
//		if(regAttAssigSet.isEmpty)	return null
//		
//		for(AttributeAssignment regAttAssig : regAttAssigSet) {
//			for(RegularityAttribute regAtt : regAttSet) {
//				if(regAttAssig.attribute!=regAtt) {}
//				else if(!atta.isConformanTo(regAtt.regularityType, regAttAssig)) {
//					val i = new ValidationWarning
//					i.source = atta
//					i.feature = Ml2Package.eINSTANCE.attributeAssignment_Attribute
//					i.message = '''Assignment is non-conformant to the regularity feature «regAtt.name» of «(regAtt.eContainer as Class).name».'''
//					i.code = NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT
//					return i
//				}
//			}
//		}
//		return null
//	}
	
	dispatch def ValidationIssue checkRegularityFeatureConformance(ReferenceAssignment refa){
		/* From an assignment, takes the reference and looks for regularities over it */
		val ref = refa.reference
		val regRefSet = new LinkedHashSet<RegularityReference>
		val knowClasses = (refa.eContainer as EntityDeclaration).rechableClasses
		
		knowClasses.forEach[ c | c.references.forEach [
			if(it instanceof RegularityReference && (it as RegularityReference).regulates == ref) {
				regRefSet.add(it as RegularityReference)
			} 
		]]
		
		/* If no regularity is found, returns */
		if(regRefSet.isEmpty)	return null
		
		/* Then, looks for assignments of those regularities in order to know the specified regulations */
		val regRefAssigSet = new LinkedHashSet<ReferenceAssignment>
		for(Class c : (refa.eContainer as EntityDeclaration).classifiers) {
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
			for(RegularityReference regRef : regRefSet) {
				if(!refa.isConformanTo(regRef.regularityType, regRefAssig)) {
					val i = new ValidationWarning
					i.source = refa
					i.feature = ModelPackage.eINSTANCE.referenceAssignment_Reference
					i.message = '''Assignment is non-conformant to the regularity feature «regRef.name» of «(regRef.eContainer as Class).name».'''
					i.code = NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT
					return i
				}
			}
		}
		return null
	}
	
}
