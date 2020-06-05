package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.model.Model;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)/* 
@InjectWith(ML2InjectorProvider.class) */
public class ML2MLTRulesTest {
  @Inject
  @Extension
  private /* ParseHelper<Model> */Object _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public Object testIsMissingSpecializationThroughPowertype() {
    throw new Error("Unresolved compilation problems:"
      + "\nparse cannot be resolved"
      + "\nassertError cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\nclass_ cannot be resolved"
      + "\nMISSING_SPECIALIZATION_THROUGH_POWERTYPE cannot be resolved"
      + "\nparse cannot be resolved"
      + "\nassertNoErrors cannot be resolved");
  }
}
