package br.ufes.inf.nemo.ml2.validation

import br.ufes.inf.nemo.ml2.validation.ValidationIssue
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EObject

class ValidationWarning extends ValidationIssue {
	
	new() {
		super()
	}
	
	new(String message, EStructuralFeature feature, int index, String code, String[] issueData, EObject source) {
		super(message, feature, index, code, issueData, source)
	}
	
}