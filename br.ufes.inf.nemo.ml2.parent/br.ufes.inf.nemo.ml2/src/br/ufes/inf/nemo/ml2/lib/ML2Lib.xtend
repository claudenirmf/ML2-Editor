package br.ufes.inf.nemo.ml2.lib

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import br.ufes.inf.nemo.ml2.util.ML2Index
import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.model.ML2Class

class ML2Lib {
	
	@Inject Provider<ResourceSet> resourceSetProvider
	@Inject extension ML2Index
	
//	public val static MODEL_DATATYPES = "br/ufes/inf/nemo/ml2/lib/datatype.ml2"
//	public static val DATATYPES_LIB = "ml2.core.datatype"
//	
//	public static val DATATYPES_DATATYPE = DATATYPES_LIB+".DataType"
//	public static val DATATYPES_STRING = DATATYPES_LIB+".String"
//	public static val DATATYPES_NUMBER = DATATYPES_LIB+".Number"
//	public static val DATATYPES_BOOLEAN = DATATYPES_LIB+".Boolean"
	
	public val static MODEL_UFO_BASE = "br/ufes/inf/nemo/ml2/lib/ufo_base.ml2"
	public val static MODEL_UFO_ENDURANT = "br/ufes/inf/nemo/ml2/lib/ufo_endurant.ml2"
	public val static MODEL_UFO_META = "br/ufes/inf/nemo/ml2/lib/ufo_meta.ml2"
	
	public val static UFO_BASE_LIB = "ml2.core.base"
	public val static UFO_ENDURANT_LIB = "ml2.core.endurant"
	public val static UFO_META_LIB = "ml2.core.meta"

	public val static UFO_ENDURANT = UFO_ENDURANT_LIB+".Endurant"
	public val static UFO_SUBSTANTIAL = UFO_ENDURANT_LIB+".Substantial"
	public val static UFO_MOMENT =  UFO_ENDURANT_LIB+".Moment"
	public val static UFO_FUNCTIONAL_COMPLEX =  UFO_ENDURANT_LIB+".FunctionalComplex"
	public val static UFO_COLLECTIVE =  UFO_ENDURANT_LIB+".Collective"
	public val static UFO_QUANTITY =  UFO_ENDURANT_LIB+".Quantity"
	public val static UFO_RELATOR =  UFO_ENDURANT_LIB+".Relator"
	public val static UFO_CONCRETE_RELATOR_TYPE =  UFO_ENDURANT_LIB+".ConcreteRelatorType"
	public val static UFO_INTRINSIC_MOMENT =  UFO_ENDURANT_LIB+".IntrinsicMoment"
	public val static UFO_QUALITY =  UFO_ENDURANT_LIB+".Quality"
	public val static UFO_MODE =  UFO_ENDURANT_LIB+".Mode"
	public val static UFO_EXTERNALLY_DEPENDENT_MODE =  UFO_ENDURANT_LIB+".ExternallyDependentMode"
	public val static UFO_QUA_INDIVIDUAL = UFO_ENDURANT_LIB+".QuaIndividual"

	public val static UFO_SORTAL_CLASS =  UFO_META_LIB+".SortalClass"
	public val static UFO_MIXIN_CLASS =  UFO_META_LIB+".MixinClass"
	public val static UFO_RIGID_CLASS =  UFO_META_LIB+".RigidClass"
	public val static UFO_SEMI_RIGID_CLASS =  UFO_META_LIB+".SemiRigidClass"
	public val static UFO_ANTI_RIGID_CLASS =  UFO_META_LIB+".AntiRigidClass"
	
//	public val static UFO_RIGID_SORTAL = UFO_LIB_NAME + ".RigidSortal"
//	public val static UFO_ANTI_RIGID_SORTAL = UFO_LIB_NAME + ".AntiRigidSortal"
//	public val static UFO_ANTI_RIGID_MIXIN = UFO_LIB_NAME + ".AntiRigidMixin"
	
	public val static UFO_KIND = UFO_META_LIB + ".Kind"
	public val static UFO_SUBKIND = UFO_META_LIB + ".Subkind"
	public val static UFO_SORTAL = UFO_META_LIB + ".Sortal"
	public val static UFO_ROLE = UFO_META_LIB + ".Role"
	public val static UFO_PHASE = UFO_META_LIB + ".Phase"
	public val static UFO_PHASE_PARTITION = UFO_META_LIB + ".PhasePartition"
	public val static UFO_CATEGORY = UFO_META_LIB + ".Category"
	public val static UFO_MIXIN = UFO_META_LIB + ".Mixin"
	public val static UFO_ROLE_MIXIN = UFO_META_LIB + ".RoleMixin"
	public val static UFO_PHASE_MIXIN = UFO_META_LIB + ".PhaseMixin"
	public val static UFO_PHASE_MIXIN_PARTITION = UFO_META_LIB + ".PhaseMixinPartition"
	
	def loadLib(String libname) {
		val stream = class.classLoader.getResourceAsStream(libname)
		resourceSetProvider.get => [
			resourceSet |
			val resource = resourceSet.createResource(URI.createURI(libname))
			resource.load(stream, resourceSet.loadOptions)
		]
	}
	
	def loadLib(String libname, ResourceSet rs) {
		val stream = class.classLoader.getResourceAsStream(libname)
		rs => [
			resourceSet |
			val resource = resourceSet.createResource(URI.createURI(libname))
			resource.load(stream, resourceSet.loadOptions)
		]
	}
	
	def loadUFOLib() {
		loadLib(MODEL_UFO_BASE, loadLib(MODEL_UFO_ENDURANT, loadLib(MODEL_UFO_META)))
	}
	
	def loadUFOLib(ResourceSet rs) {
		loadLib(MODEL_UFO_BASE,rs)
		loadLib(MODEL_UFO_ENDURANT,rs)
		loadLib(MODEL_UFO_META,rs)
	}
	
//	def loadDatatypeLib() {
//		loadLib(MODEL_DATATYPES)
//	}
//	
//	def loadDatatypeLib(ResourceSet rs) {
//		loadLib(MODEL_DATATYPES,rs)
//	}
	
	def getLibClass(EObject context, String name){
		return context.getModelElementFromIndex(name, ModelPackage.eINSTANCE.ML2Class) as ML2Class
	}

	def getUFOEndurant(EObject context) {
		return context.getModelElementFromIndex(UFO_ENDURANT, ModelPackage.eINSTANCE.ML2Class) as ML2Class
	}
	
	def getUFOMustInstantiateClasses(EObject context){
		val descs = context.visibleEObjectDescriptions.filter [
			val fqn = qualifiedName.toString
			return fqn.equals(UFO_KIND) || fqn.equals(UFO_SUBKIND) || fqn.equals(UFO_PHASE) ||
				fqn.equals(UFO_ROLE) || fqn.equals(UFO_CATEGORY) || fqn.equals(UFO_MIXIN) ||
				fqn.equals(UFO_PHASE_MIXIN) || fqn.equals(UFO_ROLE_MIXIN)
		]
		val objs = descs.map [
			var o = EObjectOrProxy
			if(o.eIsProxy)	o = context.eResource.resourceSet.getEObject(EObjectURI, true)
			return o as ML2Class
		]
		return objs.toSet
	}
	
}
