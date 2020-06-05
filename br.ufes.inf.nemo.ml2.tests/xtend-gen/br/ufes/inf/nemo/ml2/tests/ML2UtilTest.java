package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.model.Model;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.util.ML2Util;
import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)/* 
@InjectWith(ML2InjectorProvider.class) */
public class ML2UtilTest {
  @Inject
  @Extension
  private /* ParseHelper<Model> */Object _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private ML2Util _mL2Util;
  
  @Test
  public void testClassHierarchyGetter() {
    throw new Error("Unresolved compilation problems:"
      + "\nSet cannot be resolved to a type."
      + "\nThe method classHierarchy(Class) from the type ML2Util refers to the missing type Object"
      + "\nparse cannot be resolved"
      + "\nassertNoErrors cannot be resolved"
      + "\nelements cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nassertTrue cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  @Test
  public void testClassHierarchyCycle() {
    throw new Error("Unresolved compilation problems:"
      + "\nparse cannot be resolved"
      + "\nassertError cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\nclass_ cannot be resolved"
      + "\nCYCLIC_SPECIALIZATION cannot be resolved");
  }
  
  @Test
  public void testAllInstantiatedClasses() {
    throw new Error("Unresolved compilation problems:"
      + "\nparse cannot be resolved");
  }
}
