package br.ufes.inf.nemo.ml2.util

import com.google.inject.Inject
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.resource.IContainer
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass

class ML2Index {
	
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm
	
	def getVisibleContainers(EObject o){
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.URI)
		cm.getVisibleContainers(rd, index)
	}

	def getVisibleEObjectDescriptions(EObject o){
		o.visibleContainers.map[ exportedObjects ].flatten
	}
	
	def getVisibleEObjectDescriptions(EObject o, EClass type){
		o.visibleContainers.map[ getExportedObjectsByType(type)].flatten
	}
	
	def getModelElementFromIndex(EObject context, String qualifiedName, EClass modelElementClass){
		val desc = context.getVisibleEObjectDescriptions(modelElementClass).findFirst [
			it.qualifiedName.toString == qualifiedName
		]
		if (desc == null)	return null

		var o = desc.EObjectOrProxy
		if (o.eIsProxy)
			o = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
		return o
	}
	
}