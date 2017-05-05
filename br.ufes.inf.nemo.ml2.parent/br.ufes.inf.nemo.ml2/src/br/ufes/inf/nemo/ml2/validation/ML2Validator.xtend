/*
 * generated by Xtext 2.10.0
 */
package br.ufes.inf.nemo.ml2.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.CheckType
import org.eclipse.xtext.validation.Check
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.meta.MetaPackage
import br.ufes.inf.nemo.ml2.meta.ML2Class
import br.ufes.inf.nemo.ml2.meta.HOClass
import br.ufes.inf.nemo.ml2.meta.GeneralizationSet
import br.ufes.inf.nemo.ml2.meta.Feature
import br.ufes.inf.nemo.ml2.meta.FeatureAssignment
import br.ufes.inf.nemo.ml2.meta.EntityDeclaration
import br.ufes.inf.nemo.ml2.meta.FOClass
import br.ufes.inf.nemo.ml2.lib.ML2Lib

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ML2Validator extends AbstractML2Validator {
	
	@Inject extension ML2Util
	@Inject extension ML2Lib
	
	@Inject extension LinguisticRules
	@Inject extension MLTRules
	@Inject extension UFORules
	
	public static val INSTANTIATION_OF_DISJOINT_TYPES = "br.ufes.inf.nemo.ontol.InstantiationOfDisjointTypes"
	public static val MISSING_COMPLETE_INSTANTIATION = "br.ufes.inf.nemo.ontol.MissingCompleteInstantiation"
	public static val POWERTYPE_COMPLETE_SPECIALIZATION = "br.ufes.inf.nemo.ontol.PowertypeCompleteSpecialization"
	public static val COMPLETE_CHARACTERIZATION_AND_COMPLETENESS = "br.ufes.inf.nemo.ontol.CompleteCharacterizationAndCompleteness"
	public static val DISJOINT_CHARACTERIZATION_AND_DISJOINTNESS = "br.ufes.inf.nemo.ontol.DisjointCharacterizationAndDisjointness"
	public static val MANDATORY_SPECIALIZATION_OF_ENDURANT = "br.ufes.inf.nemo.ontol.MandaorySpecializationOfEndurant"
	public static val NONSORTAL_SPECIALIZING_SORTAL = "br.ufes.inf.nemo.ontol.NonSortalSpecializingSortal"
	public static val RIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.RigidSpecializingAntiRigid"
	public static val SEMIRIGID_SPECIALIZING_ANTIRIGID = "br.ufes.inf.nemo.ontol.SemiRigidSpecializingAntiRigid"
	public static val MULTIPLE_IDENTITIES = "br.ufes.inf.nemo.ontol.MultipleIdentities"
	public static val MISSING_IDENTITY = "br.ufes.inf.nemo.ontol.MissingIdentity"
	public static val NECESSARY_INSTANTIATION = "br.ufes.inf.nemo.ontol.NecessaryInstantiation"
	public static val MISSING_SPECIALIZATION_TO_BASETYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationToBasetype"
	
	// TODO Update checks table
	public static val UFO_A_MISSING_MUST_INSTANTIATION = "br.ufes.inf.nemo.ontol.ufo.a.MissingMustInstantiation"
	public static val UFO_A_ILLEGAL_SORTAL_SPECIALIZATION = "br.ufes.inf.nemo.ontol.ufo.a.IllegalSortalSpecialization"
	public static val UFO_A_ILLEGAL_RIGID_SPECIALIZATION = "br.ufes.inf.nemo.ontol.ufo.a.IllegalRigidSpecialization"
	public static val NON_CONFORMANT_ASSIGNMENT = "br.ufes.inf.nemo.ontol.NonConformantAssigment"
	
	@Check(CheckType.FAST)
	def void fastChecksOnEntityDeclaration(EntityDeclaration e){
		if(!e.isNameValid)
			error('''Entity name must start with a capital letter.''',
				MetaPackage.eINSTANCE.entityDeclaration_Name,
				LinguisticRules.INVALID_ENTITY_DECLARATION_NAME)
		if(e.duplicatedEntityName)
			error('''Entity name must be unique.''',
				MetaPackage.eINSTANCE.entityDeclaration_Name,
				LinguisticRules.DUPLICATED_ENTITY_NAME)
	}
	
	@Check(CheckType.FAST)
	def void fastCheckOnClass(ML2Class c){
		val ch = c.classHierarchy
//		val iof = c.allInstantiatedClasses
		if(!c.isValidSpecialization)
			error('''Invalid specialization.''', 
				MetaPackage.eINSTANCE.ML2Class_SuperClasses,
				LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		if(c.hasCyclicSpecialization(ch))
			error('''Invalid cyclic specialization.''',
				MetaPackage.eINSTANCE.ML2Class_SuperClasses,
				LinguisticRules.CYCLIC_SPECIALIZATION)
		if(!c.hasValidBasetype)
			error('''Invalid basetype.''',
				MetaPackage.eINSTANCE.ML2Class_CategorizedClass,
				LinguisticRules.INVALID_CATEGORIZED_CLASS)
		if(!c.hasValidPowertypeRelation)
			error('''Invalid powertype relation.''',
				MetaPackage.eINSTANCE.ML2Class_PowertypeOf,
				LinguisticRules.INVALID_POWERTYPE_RELATION)
		if(!c.hasValidSubordinators)
			error('''Invalid subordinator.''',
				MetaPackage.eINSTANCE.ML2Class_Subordinators,
				LinguisticRules.INVALID_SUBORDINATOR)
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnHOClass(HOClass ho){
		if(!ho.minOrder)
			error('''Order must be of «MLTRules.MIN_ORDER» or greater.''',
				MetaPackage.eINSTANCE.HOClass_Order,
				MLTRules.INVALID_HO_CLASS_ORDER)
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnGeneralizationSet(GeneralizationSet gs){
		if(!gs.hasValidMembers)
			error('''This generalization set has invalid members.''',
				MetaPackage.eINSTANCE.generalizationSet_Name,
				LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnProperty(Feature f){
		f.checkSubsettedMultiplicity?.runIssue
		f.checkRegularityAndContainer?.runIssue
	}
	
	@Check(CheckType.FAST)
	def void fastChecksOnPropertyAssignment(FeatureAssignment fa){
		fa.checkMultiplicityAndAssignment?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnPropertyAssignment(FeatureAssignment fa){
		fa.checkPropertyAssignmentType?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnEntity(EntityDeclaration e){
		val iof = e.allInstantiatedClasses
		e.isInstanceOfDisjointClasses(iof)?.runIssue
		e.missingInstantiationByCompleteness(iof)?.runIssue
	}
	
	@Check(CheckType.NORMAL)
	def void normalChecksOnClass(ML2Class c) {
		val ch = c.classHierarchy
		val iof = c.allInstantiatedClasses
		if (c.isMissingSpecializationThroughPowertype(ch))
			error('''Missing specialization through powertype relation.''',
				MetaPackage.eINSTANCE.ML2Class_SuperClasses, MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE)
		if (!c.obeysSubordination(ch, iof))
			error('''Missing specialization through subordination.''', MetaPackage.eINSTANCE.ML2Class_SuperClasses,
				LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION)
		if (c.hasSimpleSubordinationCycle)
			error('''«c.name» is in a subordination cycle.''', MetaPackage.eINSTANCE.ML2Class_Subordinators,
				LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		c.isSpecializingDisjointClasses(ch)?.runIssue
		c.checkInstantiatedRegularities?.runIssue
	}
	
	@Check(CheckType.EXPENSIVE)
	def void expensiveChecksOnFOClass(FOClass c) {
		// TODO Insert a check for UFO models
		
		val ch = (c as ML2Class).classHierarchy
		val iof = (c as ML2Class).allInstantiatedClasses
		val endurant = c.UFOEndurant
		
		val mustInstantiate = c.UFOMustInstantiateClasses
		val mixinclass = c.getLibClass(ML2Lib.UFO_MIXIN_CLASS)
		val rigidclass = c.getLibClass(ML2Lib.UFO_RIGID_CLASS)
		val semirigidclass = c.getLibClass(ML2Lib.UFO_SEMI_RIGID_CLASS)

		c.mustInstantiateUFOMetaproperties(ch,iof,endurant,mustInstantiate)?.runIssue
		c.checkSpecializationAndSortality(ch,iof,mixinclass)?.runIssue
		c.checkSpecializationAndRigidity(ch,iof,rigidclass,semirigidclass)?.runIssue
	}
	
	def private dispatch runIssue(ValidationError issue){
		val it = issue
		if(source!=null && feature!=null && index!=-1 && code!=null)// && issueData!=null)
			error(message,source,feature,index,code,issueData)
		else if(source!=null && feature!=null && code!=null)// && issueData!=null)
			error(message,source,feature,code,issueData)
		else if(feature!=null && index!=-1 && code!=null)// && issueData!=null)
			error(message,feature,index,code,issueData)
		else if(source!=null && feature!=null && index!=-1)
			error(message,source,feature,index)
		else if(source!=null && feature!=null)
			error(message,source,feature)
		else if(feature!=null && code!=null)// && issueData!=null)
			error(message,feature,code,issueData)
		else if(feature!=null && index!=-1)
			error(message,feature,index)
		else if(source!=null && feature!=null)
			error(message,feature)
	}
	
	def private dispatch runIssue(ValidationWarning issue){
		val it = issue
		if(source!=null && feature!=null && index!=-1 && code!=null)// && issueData!=null)
			warning(message,source,feature,index,code,issueData)
		else if(source!=null && feature!=null && code!=null)// && issueData!=null)
			warning(message,source,feature,code,issueData)
		else if(source!=null && feature!=null && index!=-1)
			warning(message,source,feature,index)
		else if(source!=null && feature!=null)
			warning(message,source,feature)
		else if(feature!=null && index!=-1 && code!=null)// && issueData!=null)
			warning(message,feature,index,code,issueData)
		else if(feature!=null && code!=null)// && issueData!=null)
			warning(message,feature,code,issueData)
		else if(feature!=null && index!=-1)
			warning(message,feature,index)
		else if(source!=null && feature!=null)
			warning(message,feature)
	}
	
}
