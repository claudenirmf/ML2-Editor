package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.lib.ML2Lib;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class ML2LibraryTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private ML2Lib _mL2Lib;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void nada() {
  }
}
