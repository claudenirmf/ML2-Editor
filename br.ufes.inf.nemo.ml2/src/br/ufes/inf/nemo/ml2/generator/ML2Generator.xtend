/**
 * ML2Generator.xtend
 */
package br.ufes.inf.nemo.ml2.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import br.ufes.inf.nemo.ml2.model.Model

class ML2Generator extends AbstractGenerator {
	
	@Inject extension ML2ToAlloy

	override void doGenerate(Resource xtextResource, IFileSystemAccess2 fsa, IGeneratorContext context) {		
		EcoreUtil.resolveAll(xtextResource)
		EcoreUtil2.resolveAll(xtextResource.resourceSet)

		if(xtextResource.contents.empty)
			return;
		
		val model = xtextResource.contents.get(0) as Model
		
		fsa.generateFile(model.name+'.als', generateAlloyModel(model))
		fsa.generateFile('MLTStar.als', generateMLTStarAlloyModel(model))
		fsa.generateFile('utils.als', generateUtilsAlloyModel())
	}
}
