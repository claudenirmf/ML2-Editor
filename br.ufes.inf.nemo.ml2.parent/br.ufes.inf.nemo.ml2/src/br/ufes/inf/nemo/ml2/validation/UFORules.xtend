package br.ufes.inf.nemo.ml2.validation

import com.google.common.collect.Sets
import java.util.Set
import com.google.inject.Inject
import br.ufes.inf.nemo.ml2.meta.FOClass
import br.ufes.inf.nemo.ml2.meta.ML2Class
import br.ufes.inf.nemo.ml2.meta.MetaPackage
import br.ufes.inf.nemo.ml2.lib.ML2Lib

class UFORules {
	
	@Inject extension ML2Lib

	def ValidationIssue mustInstantiateUFOMetaproperties(FOClass c, 
		Set<ML2Class> ch,Set<ML2Class> iof,
		ML2Class endurant,Set<ML2Class> mustInstantiate
	){
		if(ch.contains(endurant) && Sets.intersection(iof,mustInstantiate).empty){
			val issue = new ValidationError
			issue.message = '''Every specilization of Endurant must instantiate one of the following classes:
				-«FOR m:mustInstantiate»«m.name» «ENDFOR»'''
			issue.source = c
			issue.feature = MetaPackage.eINSTANCE.entityDeclaration_InstantiatedClasses
			issue.code = ML2Validator.UFO_A_MISSING_MUST_INSTANTIATION
			return issue
		}
		return null
	}
	
	def ValidationIssue checkSpecializationAndSortality(FOClass c, Set<ML2Class> ch, Set<ML2Class> iof,
		ML2Class mixinclass) {
		if (iof.contains(mixinclass)) {
			val sortalclass = c.getLibClass(ML2Lib.UFO_SORTAL_CLASS)
			val dude = ch.findFirst[instantiatedClasses.contains(sortalclass)]
			if(dude == null) return null

			val issue = new ValidationError
			issue.message = '''Instances of non-soral classes may not specialize the sortal class «dude.name»'''
			issue.source = c
			issue.feature = MetaPackage.eINSTANCE.ML2Class_SuperClasses
			issue.code = ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION
			return issue
		}
		return null;
	}
	
	def ValidationIssue checkSpecializationAndRigidity(FOClass c, Set<ML2Class> ch, Set<ML2Class> iof,
		ML2Class rigidclass, ML2Class semirigidclass) {
		if(iof.contains(rigidclass)){
			val antirigidclass = c.getLibClass(ML2Lib.UFO_ANTI_RIGID_CLASS)
			val dude = ch.findFirst[instantiatedClasses.contains(antirigidclass)]
			if(dude == null) return null
			
			val issue = new ValidationError
			issue.message = '''Instances of rigid classes may not specialize the anti-rigid class «dude.name»'''
			issue.source = c
			issue.feature = MetaPackage.eINSTANCE.ML2Class_SuperClasses
			issue.code = ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION
			return issue
		}
		else if(iof.contains(semirigidclass)){
			val antirigidclass = c.getLibClass(ML2Lib.UFO_ANTI_RIGID_CLASS)
			val dude = ch.findFirst[instantiatedClasses.contains(antirigidclass)]
			if(dude == null) return null
			
			val issue = new ValidationError
			issue.message = '''Instances of semi-rigid classes may not specialize the anti-rigid class «dude.name»'''
			issue.source = c
			issue.feature = MetaPackage.eINSTANCE.ML2Class_SuperClasses
			issue.code = ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION
			return issue
		}
		return null
	}
	
}