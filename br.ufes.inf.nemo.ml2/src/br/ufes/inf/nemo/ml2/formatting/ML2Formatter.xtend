package br.ufes.inf.nemo.ml2.formatting

import org.eclipse.xtext.formatting2.AbstractFormatter2
//import br.ufes.inf.nemo.ml2.model.Individual
//import br.ufes.inf.nemo.ml2.model.ML2Model
import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess
import com.google.inject.Inject
import br.ufes.inf.nemo.ml2.model.Model
import org.eclipse.xtext.formatting2.IFormattableDocument
import br.ufes.inf.nemo.ml2.model.Individual

class ML2Formatter extends AbstractFormatter2 {
	
	// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
	//	implement for OrderlessClass, HOClass, FOClass, DataType, AttributeAssignment
	
	@Inject extension ML2GrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		for (modelElement : model.elements) {
			modelElement.format
		}
	}

	def dispatch void format(Individual individual, extension IFormattableDocument document) {
		for (featureAssignment : individual.assignments) {
			featureAssignment.format
		}
	}
	
}