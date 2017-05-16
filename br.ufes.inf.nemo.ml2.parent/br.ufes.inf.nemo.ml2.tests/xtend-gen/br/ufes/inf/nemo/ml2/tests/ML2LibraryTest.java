package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.lib.ML2Lib;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.validation.ML2Validator;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
  
  public ResourceSet loadResourceSet() {
    ResourceSet _xblockexpression = null;
    {
      final ResourceSet rs = this.resourceSetProvider.get();
      _xblockexpression = this._mL2Lib.loadUFOLib(rs);
    }
    return _xblockexpression;
  }
  
  public static CharSequence includeStatements() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("include ");
    _builder.append(ML2Lib.UFO_BASE_LIB);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("include ");
    _builder.append(ML2Lib.UFO_ENDURANT_LIB);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("include ");
    _builder.append(ML2Lib.UFO_META_LIB);
    _builder.append(";");
    return _builder;
  }
  
  @Test
  public void testDefaultLibs() {
    final ResourceSet rs = this.resourceSetProvider.get();
    this._mL2Lib.loadUFOLib(rs);
    final Consumer<Resource> _function = (Resource it) -> {
      this._validationTestHelper.assertNoErrors(it);
    };
    rs.getResources().forEach(_function);
  }
  
  @Test
  public void testMustInstantiate() {
    try {
      final ResourceSet rs = this.loadResourceSet();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _includeStatements = ML2LibraryTest.includeStatements();
      _builder.append(_includeStatements, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class X specializes ");
      _builder.append(ML2Lib.UFO_ENDURANT, "\t\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder, rs);
      this._validationTestHelper.assertError(incorrectModel, MetaPackage.eINSTANCE.getML2Class(), ML2Validator.UFO_A_MISSING_MUST_INSTANTIATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      CharSequence _includeStatements_1 = ML2LibraryTest.includeStatements();
      _builder_1.append(_includeStatements_1, "\t\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class X : ");
      _builder_1.append(ML2Lib.UFO_KIND, "\t\t\t\t");
      _builder_1.append(" specializes ");
      _builder_1.append(ML2Lib.UFO_ENDURANT, "\t\t\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1, rs);
      this._validationTestHelper.assertNoError(correctModel, ML2Validator.UFO_A_MISSING_MUST_INSTANTIATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckSpecializationAndSortality() {
    try {
      final ResourceSet rs = this.loadResourceSet();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _includeStatements = ML2LibraryTest.includeStatements();
      _builder.append(_includeStatements, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class X : ");
      _builder.append(ML2Lib.UFO_SORTAL_CLASS, "\t\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class Y : ");
      _builder.append(ML2Lib.UFO_MIXIN_CLASS, "\t\t\t\t");
      _builder.append(" specializes X;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder, rs);
      this._validationTestHelper.assertError(incorrectModel, MetaPackage.eINSTANCE.getML2Class(), ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      CharSequence _includeStatements_1 = ML2LibraryTest.includeStatements();
      _builder_1.append(_includeStatements_1, "\t\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class Y : ");
      _builder_1.append(ML2Lib.UFO_MIXIN_CLASS, "\t\t\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class X : ");
      _builder_1.append(ML2Lib.UFO_SORTAL_CLASS, "\t\t\t\t");
      _builder_1.append(" specializes Y;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1, rs);
      this._validationTestHelper.assertNoError(correctModel, ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckSpecializationAndRigidity() {
    try {
      final ResourceSet rs = this.loadResourceSet();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      CharSequence _includeStatements = ML2LibraryTest.includeStatements();
      _builder.append(_includeStatements, "\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class Y : ");
      _builder.append(ML2Lib.UFO_ANTI_RIGID_CLASS, "\t\t\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("class X : ");
      _builder.append(ML2Lib.UFO_RIGID_CLASS, "\t\t\t\t");
      _builder.append(" specializes Y;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel1 = this._parseHelper.parse(_builder, rs);
      this._validationTestHelper.assertError(incorrectModel1, MetaPackage.eINSTANCE.getML2Class(), ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      CharSequence _includeStatements_1 = ML2LibraryTest.includeStatements();
      _builder_1.append(_includeStatements_1, "\t\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class Y : ");
      _builder_1.append(ML2Lib.UFO_ANTI_RIGID_CLASS, "\t\t\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class X : ");
      _builder_1.append(ML2Lib.UFO_SEMI_RIGID_CLASS, "\t\t\t\t");
      _builder_1.append(" specializes Y;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModel2 = this._parseHelper.parse(_builder_1, rs);
      this._validationTestHelper.assertError(incorrectModel2, MetaPackage.eINSTANCE.getML2Class(), ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      CharSequence _includeStatements_2 = ML2LibraryTest.includeStatements();
      _builder_2.append(_includeStatements_2, "\t\t\t\t");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class Y : ");
      _builder_2.append(ML2Lib.UFO_RIGID_CLASS, "\t\t\t\t");
      _builder_2.append(";");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class X : ");
      _builder_2.append(ML2Lib.UFO_ANTI_RIGID_CLASS, "\t\t\t\t");
      _builder_2.append(" specializes Y;");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_2, rs);
      this._validationTestHelper.assertNoError(correctModel, ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
