package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.validation.MLTRules;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class MLTRulesTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testIsMissingSpecializationThroughPowertype() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class HA isPowertypeOf FA;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class FA;\tclass FB : HA;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModel, _mL2Class, MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class HA isPowertypeOf FA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class FA;\t\tclass FB : HA specializes FA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
