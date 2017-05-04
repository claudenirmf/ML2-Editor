package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.util.ML2Util;
import com.google.inject.Inject;
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
public class ML2UtilTest {
  @Inject
  @Extension
  private /* ParseHelper<ML2Model> */Object _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private ML2Util _mL2Util;
  
  @Test
  public void testClassHierarchyGetter() {
    throw new Error("Unresolved compilation problems:"
      + "\nML2Class cannot be resolved to a type."
      + "\nML2Class cannot be resolved to a type."
      + "\nML2Class cannot be resolved to a type."
      + "\nThe field ML2UtilTest._parseHelper refers to the missing type ML2Model"
      + "\nassertNoErrors cannot be resolved"
      + "\nelements cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nclassHierarchy cannot be resolved");
  }
  
  @Test
  public void testClassHierarchyCycle() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ML2UtilTest._parseHelper refers to the missing type ML2Model");
  }
  
  @Test
  public void testAllInstantiatedClasses() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ML2UtilTest._parseHelper refers to the missing type ML2Model");
  }
}
