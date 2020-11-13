/**
 * ML2Generator.xtend
 */
package br.ufes.inf.nemo.ml2.generator;

import br.ufes.inf.nemo.ml2.generator.ML2ToAlloy;
import br.ufes.inf.nemo.ml2.model.Model;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ML2Generator extends AbstractGenerator {
  @Inject
  @Extension
  private ML2ToAlloy _mL2ToAlloy;
  
  @Override
  public void doGenerate(final Resource xtextResource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EcoreUtil.resolveAll(xtextResource);
    EcoreUtil2.resolveAll(xtextResource.getResourceSet());
    boolean _isEmpty = xtextResource.getContents().isEmpty();
    if (_isEmpty) {
      return;
    }
    EObject _get = xtextResource.getContents().get(0);
    final Model model = ((Model) _get);
    String _name = model.getName();
    String _plus = (_name + ".als");
    fsa.generateFile(_plus, this._mL2ToAlloy.generateAlloyModel(model));
    fsa.generateFile("MLTStar.als", this._mL2ToAlloy.generateMLTStarAlloyModel(model));
    fsa.generateFile("utils.als", this._mL2ToAlloy.generateUtilsAlloyModel());
  }
}
