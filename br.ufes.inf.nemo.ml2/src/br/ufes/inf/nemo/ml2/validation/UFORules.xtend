package br.ufes.inf.nemo.ml2.validation

import com.google.common.collect.Sets
import java.util.Set
import com.google.inject.Inject
import br.ufes.inf.nemo.ml2.model.Class
import br.ufes.inf.nemo.ml2.model.FirstOrderClass
import br.ufes.inf.nemo.ml2.model.ModelPackage

class UFORules {
	
	// TODO: update UFO libs
//	@Inject extension ML2Lib

//	def ValidationIssue mustInstantiateUFOMetaproperties(FirstOrderClass c, 
//		Set<Class> ch,Set<Class> iof,
//		Class endurant,Set<Class> mustInstantiate
//	){
//		if(ch.contains(endurant) && Sets.intersection(iof,mustInstantiate).empty){
//			val issue = new ValidationError
//			issue.message = '''Every specilization of Endurant must instantiate one of the following classes:
//				-«FOR m:mustInstantiate»«m.name» «ENDFOR»'''
//			issue.source = c
//			issue.feature = Ml2Package.eINSTANCE.entityDeclaration_Classifiers
//			issue.code = ML2Validator.UFO_A_MISSING_MUST_INSTANTIATION
//			return issue
//		}
//		return null
//	}
	
//	def ValidationIssue checkSpecializationAndSortality(FirstOrderClass c, Set<Class> ch, Set<Class> iof,
//		Class mixinclass) {
//		if (iof.contains(mixinclass)) {
//			val sortalclass = c.getLibClass(ML2Lib.UFO_SORTAL_CLASS)
//			val dude = ch.findFirst[classifiers.contains(sortalclass)]
//			if(dude == null) return null
//
//			val issue = new ValidationError
//			issue.message = '''Instances of non-soral classes may not specialize the sortal class «dude.name»'''
//			issue.source = c
//			issue.feature = Ml2Package.eINSTANCE.class_SuperClasses
//			issue.code = ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION
//			return issue
//		}
//		return null;
//	}
	
//	def ValidationIssue checkSpecializationAndRigidity(FirstOrderClass c, Set<Class> ch, Set<Class> iof,
//		Class rigidclass, Class semirigidclass) {
//		if(iof.contains(rigidclass)){
//			val antirigidclass = c.getLibClass(ML2Lib.UFO_ANTI_RIGID_CLASS)
//			val dude = ch.findFirst[classifiers.contains(antirigidclass)]
//			if(dude == null) return null
//			
//			val issue = new ValidationError
//			issue.message = '''Instances of rigid classes may not specialize the anti-rigid class «dude.name»'''
//			issue.source = c
//			issue.feature = Ml2Package.eINSTANCE.class_SuperClasses
//			issue.code = ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION
//			return issue
//		}
//		else if(iof.contains(semirigidclass)){
//			val antirigidclass = c.getLibClass(ML2Lib.UFO_ANTI_RIGID_CLASS)
//			val dude = ch.findFirst[classifiers.contains(antirigidclass)]
//			if(dude == null) return null
//			
//			val issue = new ValidationError
//			issue.message = '''Instances of semi-rigid classes may not specialize the anti-rigid class «dude.name»'''
//			issue.source = c
//			issue.feature = Ml2Package.eINSTANCE.class_SuperClasses
//			issue.code = ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION
//			return issue
//		}
//		return null
//	}
	
}
