package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
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
public class ML2ScopeProviderTest {
  @Inject
  @Extension
  private /* ParseHelper<ML2Model> */Object _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testRefreneceAssigmentScopeForRefrenece() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ML2ScopeProviderTest._parseHelper refers to the missing type ML2Model"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testRefreneceScopeForSubesetOf() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ML2ScopeProviderTest._parseHelper refers to the missing type ML2Model"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testRefreneceScopeForOppositeTo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ML2ScopeProviderTest._parseHelper refers to the missing type ML2Model"
      + "\nassertNoErrors cannot be resolved");
  }
}
