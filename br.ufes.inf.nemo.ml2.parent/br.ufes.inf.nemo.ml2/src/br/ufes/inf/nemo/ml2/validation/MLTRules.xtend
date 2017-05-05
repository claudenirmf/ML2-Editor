package br.ufes.inf.nemo.ml2.validation

import java.util.LinkedHashSet
import com.google.inject.Inject
import java.util.Set
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.meta.HOClass
import br.ufes.inf.nemo.ml2.meta.ML2Class

class MLTRules {
	
	@Inject extension ML2Util
	
	public static val MIN_ORDER = 2
	
	public static val INVALID_HO_CLASS_ORDER = "br.ufes.inf.nemo.ontol.InvalidHOClassOrder"
	public static val MISSING_SPECIALIZATION_THROUGH_POWERTYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughPowertype"
	
	def minOrder(HOClass ho){
		if(ho.order < MIN_ORDER) false		else true
	}
	
	def isMissingSpecializationThroughPowertype(ML2Class c, Set<ML2Class> cHierarchy){
		return c.allInstantiatedClasses.exists[ ho |
				if(ho.powertypeOf != null)
					if(!cHierarchy.contains(ho.powertypeOf) && ho.powertypeOf!=c)
						return true
				return false
			]
		// TODO Update to return missing specializations.
	}
	
}