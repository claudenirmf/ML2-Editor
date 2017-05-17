/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufes.inf.nemo.ml2.generator;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider;
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationAdapter;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.1
 */
@SuppressWarnings("all")
public class ML2OutputConfigurationProvider implements IOutputConfigurationProvider, IContextualOutputConfigurationProvider, IContextualOutputConfigurationProvider2 {
  public final static String MODELS_OUTPUT = "br.ufes.inf.nemo.ontol.generator.ModelsOutput";
  
  @Inject
  @Named(Constants.LANGUAGE_NAME)
  private String languageName;
  
  /**
   * @return a set of {@link OutputConfiguration} available for the generator
   */
  @Override
  public Set<OutputConfiguration> getOutputConfigurations() {
    OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
    defaultOutput.setDescription("Output Folder");
    defaultOutput.setOutputDirectory("./src-gen");
    defaultOutput.setOverrideExistingResources(true);
    defaultOutput.setCreateOutputDirectory(true);
    defaultOutput.setCleanUpDerivedResources(true);
    defaultOutput.setSetDerivedProperty(true);
    defaultOutput.setKeepLocalHistory(Boolean.valueOf(true));
    OutputConfiguration modelsOutput = new OutputConfiguration(ML2OutputConfigurationProvider.MODELS_OUTPUT);
    modelsOutput.setDescription("Models Output Folder");
    modelsOutput.setOutputDirectory("./models-gen");
    modelsOutput.setOverrideExistingResources(true);
    modelsOutput.setCreateOutputDirectory(true);
    modelsOutput.setCleanUpDerivedResources(true);
    modelsOutput.setSetDerivedProperty(true);
    modelsOutput.setKeepLocalHistory(Boolean.valueOf(true));
    return Sets.<OutputConfiguration>newHashSet(defaultOutput, modelsOutput);
  }
  
  /**
   * @since 2.8
   */
  @Override
  public Set<OutputConfiguration> getOutputConfigurations(final Resource context) {
    ResourceSet _resourceSet = context.getResourceSet();
    return this.getOutputConfigurations(_resourceSet);
  }
  
  /**
   * @since 2.9
   */
  @Override
  public Set<OutputConfiguration> getOutputConfigurations(final ResourceSet context) {
    EList<Adapter> adapters = context.eAdapters();
    Adapter _adapter = EcoreUtil.getAdapter(adapters, 
      OutputConfigurationAdapter.class);
    OutputConfigurationAdapter adapter = ((OutputConfigurationAdapter) _adapter);
    if ((adapter == null)) {
      return this.getOutputConfigurations();
    } else {
      Map<String, Set<OutputConfiguration>> _outputConfigurationsPerLanguage = adapter.getOutputConfigurationsPerLanguage();
      Set<OutputConfiguration> outputConfigurations = _outputConfigurationsPerLanguage.get(
        this.languageName);
      Set<OutputConfiguration> _xifexpression = null;
      if ((outputConfigurations == null)) {
        _xifexpression = this.getOutputConfigurations();
      } else {
        _xifexpression = outputConfigurations;
      }
      return _xifexpression;
    }
  }
}
