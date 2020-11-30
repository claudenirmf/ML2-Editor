/** 
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufes.inf.nemo.ml2.generator

import static com.google.common.collect.Sets.*
import java.util.Set
import org.eclipse.emf.common.notify.Adapter
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.Constants
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.OutputConfigurationAdapter
import com.google.inject.Inject
import com.google.inject.name.Named

/** 
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.1
 */
class ML2OutputConfigurationProvider implements IOutputConfigurationProvider, IContextualOutputConfigurationProvider, IContextualOutputConfigurationProvider2 {
	public static final String MODELS_OUTPUT = "br.ufes.inf.nemo.ontol.generator.ModelsOutput"
	@Inject @Named(Constants.LANGUAGE_NAME) String languageName

	/** 
	 * @return a set of {@link OutputConfiguration} available for the generator
	 */
	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT)
		defaultOutput.setDescription("Output Folder")
		defaultOutput.setOutputDirectory("./src-gen")
		defaultOutput.setOverrideExistingResources(true)
		defaultOutput.setCreateOutputDirectory(true)
		defaultOutput.setCleanUpDerivedResources(true)
		defaultOutput.setSetDerivedProperty(true)
		defaultOutput.setKeepLocalHistory(true)
		var OutputConfiguration modelsOutput = new OutputConfiguration(MODELS_OUTPUT)
		modelsOutput.setDescription("Models Output Folder")
		modelsOutput.setOutputDirectory("./models-gen")
		modelsOutput.setOverrideExistingResources(true)
		modelsOutput.setCreateOutputDirectory(true)
		modelsOutput.setCleanUpDerivedResources(true)
		modelsOutput.setSetDerivedProperty(true)
		modelsOutput.setKeepLocalHistory(true)
		return newHashSet(defaultOutput, modelsOutput)
	}

	/** 
	 * @since 2.8
	 */
	override Set<OutputConfiguration> getOutputConfigurations(Resource context) {
		return getOutputConfigurations(context.getResourceSet())
	}

	/** 
	 * @since 2.9
	 */
	override Set<OutputConfiguration> getOutputConfigurations(ResourceSet context) {
		var EList<Adapter> adapters = context.eAdapters()
		var OutputConfigurationAdapter adapter = (EcoreUtil.getAdapter(adapters,
			OutputConfigurationAdapter) as OutputConfigurationAdapter)
		if (adapter === null) {
			return getOutputConfigurations()
		} else {
			var Set<OutputConfiguration> outputConfigurations = adapter.getOutputConfigurationsPerLanguage().get(
				languageName)
			return if(outputConfigurations === null) getOutputConfigurations() else outputConfigurations
		}
	}
}
