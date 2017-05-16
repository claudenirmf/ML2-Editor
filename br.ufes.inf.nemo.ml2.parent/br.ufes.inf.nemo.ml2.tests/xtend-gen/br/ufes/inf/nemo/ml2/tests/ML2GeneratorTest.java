package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.tests.ML2LibraryTest;
import com.google.inject.Inject;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class ML2GeneratorTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private ML2LibraryTest _mL2LibraryTest;
  
  @Inject
  @Extension
  private IGenerator2 _iGenerator2;
  
  @Inject
  private IGenerator2 gen;
  
  @Test
  public void emptyTest() {
  }
}