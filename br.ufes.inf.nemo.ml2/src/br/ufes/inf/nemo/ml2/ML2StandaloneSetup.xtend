/*
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ML2StandaloneSetup extends ML2StandaloneSetupGenerated {

	def static void doSetup() {
		new ML2StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}