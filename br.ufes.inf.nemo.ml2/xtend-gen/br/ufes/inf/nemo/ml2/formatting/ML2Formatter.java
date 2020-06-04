package br.ufes.inf.nemo.ml2.formatting;

import br.ufes.inf.nemo.ml2.model.FeatureAssignment;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.Model;
import br.ufes.inf.nemo.ml2.model.ModelElement;
import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ML2Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ML2GrammarAccess _mL2GrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<ModelElement> _elements = model.getElements();
    for (final ModelElement modelElement : _elements) {
      document.<ModelElement>format(modelElement);
    }
  }
  
  protected void _format(final Individual individual, @Extension final IFormattableDocument document) {
    EList<FeatureAssignment> _assignments = individual.getAssignments();
    for (final FeatureAssignment featureAssignment : _assignments) {
      document.<FeatureAssignment>format(featureAssignment);
    }
  }
  
  public void format(final Object individual, final IFormattableDocument document) {
    if (individual instanceof Individual) {
      _format((Individual)individual, document);
      return;
    } else if (individual instanceof XtextResource) {
      _format((XtextResource)individual, document);
      return;
    } else if (individual instanceof Model) {
      _format((Model)individual, document);
      return;
    } else if (individual instanceof EObject) {
      _format((EObject)individual, document);
      return;
    } else if (individual == null) {
      _format((Void)null, document);
      return;
    } else if (individual != null) {
      _format(individual, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(individual, document).toString());
    }
  }
}
