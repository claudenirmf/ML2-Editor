package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.model.ML2Model;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class ML2ScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testRefreneceAssigmentScopeForRefrenece() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A { ref a : A };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A { ref a : A };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("individual Y : B { ref A.a = Y };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("individual Z : A { ref a = Z };");
      _builder.newLine();
      _builder.append("}");
      final ML2Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRefreneceScopeForSubesetOf() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A { ref a1:A\tref a2:A };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A { ref a1:C };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C specializes B {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref b1:B subsets B.a1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref b2:B subsets a2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("}");
      final ML2Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRefreneceScopeForOppositeTo() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A { ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref a1:A isOppositeTo a2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref a2:A isOppositeTo a1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref c:C isOppositeTo a");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B { ref c:C };");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C { ref a:A isOppositeTo c };");
      _builder.newLine();
      _builder.append("}");
      final ML2Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRefreneceScopeForRegularityFeature() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("orderless class CA categorizes A {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("regularity ref ra : A determinesAllowedValues a");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("orderless class A {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ref a : A");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("}");
      final ML2Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
