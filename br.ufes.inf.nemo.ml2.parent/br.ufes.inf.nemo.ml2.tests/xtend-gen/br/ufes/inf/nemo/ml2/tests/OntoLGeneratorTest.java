package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.tests.LibraryTest;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class OntoLGeneratorTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private LibraryTest _libraryTest;
  
  @Inject
  @Extension
  private IGenerator2 _iGenerator2;
  
  @Inject
  private IGenerator2 gen;
  
  @Test
  public void emptyTest() {
  }
}
