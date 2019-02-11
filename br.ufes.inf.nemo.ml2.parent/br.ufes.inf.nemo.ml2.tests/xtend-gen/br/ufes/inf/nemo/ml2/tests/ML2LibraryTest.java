package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.lib.ML2Lib;
import br.ufes.inf.nemo.ml2.model.ML2Model;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
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
