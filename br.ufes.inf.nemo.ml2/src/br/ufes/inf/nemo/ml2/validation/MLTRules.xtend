package br.ufes.inf.nemo.ml2.validation

import com.google.inject.Inject
import java.util.Set
import br.ufes.inf.nemo.ml2.model.Class
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.model.HighOrderClass
import br.ufes.inf.nemo.ml2.model.HigherOrderClass

class MLTRules {
	
	@Inject extension ML2Util
	
	public static val MIN_ORDER = 2
	
	public static val INVALID_HO_CLASS_ORDER = "br.ufes.inf.nemo.ontol.InvalidHOClassOrder"
	public static val MISSING_SPECIALIZATION_THROUGH_POWERTYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughPowertype"
	
	def minOrder(HighOrderClass ho){
		if(ho.order < MIN_ORDER) 
			new ValidationError('''Order must be of «MLTRules.MIN_ORDER» or greater.''',
					ModelPackage.eINSTANCE.highOrderClass_Order,
					ValidationIssue.NO_INDEX,
					MLTRules.INVALID_HO_CLASS_ORDER,
					ValidationIssue.NO_ISSUE_CODE,
					ho)
		else
			null
		
	}
	
	def isMissingSpecializationThroughPowertype(Class c, Set<Class> cHierarchy, Set<Class> allIof){
		val invalid = allIof.findFirst[
					if(!(it instanceof HigherOrderClass))	return false;
					val base = (it as HigherOrderClass).powertypeOf
					base!==null && base!=c && !cHierarchy.contains(base)
				]
		
		if(invalid===null)	return null
		else				return new ValidationError('''Missing specialization of «(invalid as HigherOrderClass).powertypeOf.name», base type of «invalid.name».''',
					ModelPackage.eINSTANCE.class_SuperClasses,
					ValidationIssue.NO_INDEX,
					MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE,
					ValidationIssue.NO_ISSUE_CODE,
					c)
	}
	
}
