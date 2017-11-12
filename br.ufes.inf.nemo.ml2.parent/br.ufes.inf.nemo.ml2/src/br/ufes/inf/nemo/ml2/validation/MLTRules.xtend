package br.ufes.inf.nemo.ml2.validation

import com.google.inject.Inject
import java.util.Set
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.meta.HOClass
import br.ufes.inf.nemo.ml2.meta.ML2Class
import br.ufes.inf.nemo.ml2.meta.MetaPackage

class MLTRules {
	
	@Inject extension ML2Util
	
	public static val MIN_ORDER = 2
	
	public static val INVALID_HO_CLASS_ORDER = "br.ufes.inf.nemo.ontol.InvalidHOClassOrder"
	public static val MISSING_SPECIALIZATION_THROUGH_POWERTYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughPowertype"
	
	def minOrder(HOClass ho){
		if(ho.order < MIN_ORDER) 
			new ValidationError('''Order must be of «MLTRules.MIN_ORDER» or greater.''',
					MetaPackage.eINSTANCE.HOClass_Order,
					ValidationIssue.NO_INDEX,
					MLTRules.INVALID_HO_CLASS_ORDER,
					ValidationIssue.NO_ISSUE_CODE,
					ho)
		else
			null
		
	}
	
	def isMissingSpecializationThroughPowertype(ML2Class c, Set<ML2Class> cHierarchy, Set<ML2Class> allIof){
		val invalid = allIof.findFirst[ 
					val base = it.powertypeOf
					base!==null && base!=c && !cHierarchy.contains(base)
				]
		
		if(invalid===null)	return null
		else				return new ValidationError('''Missing specialization of «invalid.powertypeOf.name», base type of «invalid.name».''',
					MetaPackage.eINSTANCE.ML2Class_SuperClasses,
					ValidationIssue.NO_INDEX,
					MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE,
					ValidationIssue.NO_ISSUE_CODE,
					c)
	}
	
}