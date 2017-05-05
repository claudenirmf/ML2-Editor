package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.lib.ML2Lib;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.validation.LinguisticRules;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
public class LinguistcRulesTest {
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
  public void testIsNameValid() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t { class Abc; }");
      final ML2Model correctModel = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(correctModel);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t { class abc; }");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder_1);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModel, _mL2Class, LinguisticRules.INVALID_ENTITY_DECLARATION_NAME);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsValidSpecialization() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{ class A specializes A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{ order 2 class A; class B specializes A; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("module t{ order 2 class A; orderless class B specializes A; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(" ");
      _builder_3.append("module t{ order 2 class A; order 3 class B specializes A; }");
      final ML2Model incorrectModelD = this._parseHelper.parse(_builder_3);
      EClass _mL2Class_3 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelD, _mL2Class_3, LinguisticRules.INVALID_CLASS_SPECIALIZATION);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("module t {");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("orderless class WA; order 2 class HA; class FA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("orderless class WB specializes WA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("order 2 class HB specializes WA, HA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t\t");
      _builder_4.append("class FB specializes WA, FA;");
      _builder_4.newLine();
      _builder_4.append("\t\t\t");
      _builder_4.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_4);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasCyclicSpecialization() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("module t{ class A specializes A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.CYCLIC_SPECIALIZATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A specializes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.CYCLIC_SPECIALIZATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidBasetype() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A categorizes B; orderless class B; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_CATEGORIZED_CLASS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A categorizes B; order 2 class B ; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_CATEGORIZED_CLASS);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 3 class A categorizes B; order 3 class B; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_CATEGORIZED_CLASS);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class A categorizes B; class B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 3 class C categorizes D; order 2 class D;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidPowertypeRelation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A isPowertypeOf B; orderless class B; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A isPowertypeOf B; order 2 class B; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 3 class A isPowertypeOf B; order 3 class B; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_POWERTYPE_RELATION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class A isPowertypeOf B; class B;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 3 class C isPowertypeOf D; order 2 class D;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidSubordinators() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t { order 2 class A subordinatedTo A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t { order 2 class A subordinatedTo B; class B; }");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t { order 2 class A subordinatedTo B; order 3 class B; }");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, LinguisticRules.INVALID_SUBORDINATOR);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t { order 2 class A subordinatedTo B; order 2 class B; }");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicatedNames() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{ class A; class A; }");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertError(incorrectModel, _entityDeclaration, LinguisticRules.DUPLICATED_ENTITY_NAME);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{ class A; class B; }");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasValidMembers() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("genset gs general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _generalizationSet = MetaPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelA, _generalizationSet, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class X categorizes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("genset gs general A categorizer X specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _generalizationSet_1 = MetaPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelB, _generalizationSet_1, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class B specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class C specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("order 2 class X categorizes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("genset gs general A categorizer X specifics B,C;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _generalizationSet_2 = MetaPackage.eINSTANCE.getGeneralizationSet();
      this._validationTestHelper.assertError(incorrectModelC, _generalizationSet_2, 
        LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t {");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class B:X specializes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("class C:X specializes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("order 2 class X categorizes A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("genset gs general A categorizer X specifics B,C;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testObeysSubordination() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class XA; ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class XB subordinatedTo XA;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class YA:XA; class YB:XB;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModel, _mL2Class, 
        LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class XA; order 2 class XB subordinatedTo XA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class YA:XA; class YB:XB specializes YA;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testHasSimpleSubordinationCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{ orderless class A subordinatedTo A; }");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelA, _mL2Class, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A subordinatedTo B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B subordinatedTo A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelB, _mL2Class_1, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t{");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("orderless class A subordinatedTo B;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("orderless class B specializes A;");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model incorrectModelC = this._parseHelper.parse(_builder_2);
      EClass _mL2Class_2 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertError(incorrectModelC, _mL2Class_2, 
        LinguisticRules.SIMPLE_SUBORDINATION_CYCLE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module t{");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("orderless class A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t\t");
      _builder_3.append("orderless class B specializes A subordinatedTo A;");
      _builder_3.newLine();
      _builder_3.append("\t\t\t");
      _builder_3.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_3);
      this._validationTestHelper.assertNoErrors(correctModel);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsSpecializingDisjointClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("disjoint genset x general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class D specializes B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertWarning(incorrectModel, _mL2Class, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("disjoint genset x general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class D specializes C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class E specializes B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertNoWarnings(correctModel, _mL2Class_1, 
        LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsInstanceOfDisjointClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("disjoint genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:B,C;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertWarning(incorrectModel, _entityDeclaration, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("genset a general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X:B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _entityDeclaration_1 = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertNoWarnings(correctModel, _entityDeclaration_1, 
        LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMissingInstantiationByCompleteness() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class B specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("orderless class C specializes A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("complete genset a general A specifics B,C;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X:A;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModel = this._parseHelper.parse(_builder);
      EClass _entityDeclaration = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertWarning(incorrectModel, _entityDeclaration, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t{");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class B specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("orderless class C specializes A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("complete genset a general A specifics B,C;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X:A,B;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_1);
      EClass _entityDeclaration_1 = MetaPackage.eINSTANCE.getEntityDeclaration();
      this._validationTestHelper.assertNoWarnings(correctModel, _entityDeclaration_1, 
        LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSubsettedMultiplicity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nickname : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B specializes A {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToB : [1..3] B subsets refToA");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nickname2 : [1..3] B subsets nickname");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _reference = MetaPackage.eINSTANCE.getReference();
      this._validationTestHelper.assertError(incorrectModelA, _reference, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attribute = MetaPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertError(incorrectModelA, _attribute, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nickname : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class B specializes A {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToB : [2..4] B subsets refToA");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nickname2 : [2..5] B subsets nickname");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _reference_1 = MetaPackage.eINSTANCE.getReference();
      this._validationTestHelper.assertError(incorrectModelB, _reference_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attribute_1 = MetaPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertError(incorrectModelB, _attribute_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nickname : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class B specializes A {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToB : [2..2] B subsets refToA");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nickname2 : [3..3] B subsets nickname");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_2);
      this._validationTestHelper.assertNoError(correctModel, LinguisticRules.INVALID_MULTIPLICITY);
      this._validationTestHelper.assertNoError(correctModel, LinguisticRules.INVALID_MULTIPLICITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultiplicityAndAssignment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA : [2..3] A");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("individual X : A { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ref refToA = X");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("att nicknames = \"John\"");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorrectModelA = this._parseHelper.parse(_builder);
      EClass _referenceAssignment = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorrectModelA, _referenceAssignment, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorrectModelA, _attributeAssignment, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA : [2..3] A");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("individual X : A { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref refToA = {X,X,X,X}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("att nicknames = {\"John\",\"Bob\",\"Gary\",\"Nick\"}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model incorrectModelB = this._parseHelper.parse(_builder_1);
      EClass _referenceAssignment_1 = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertWarning(incorrectModelB, _referenceAssignment_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment_1 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertWarning(incorrectModelB, _attributeAssignment_1, 
        LinguisticRules.INVALID_MULTIPLICITY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module t {");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("class A { ");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA : [2..3] A");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nicknames : [2..3] A\t// This is going to fire other issues not related to multiplicity");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("individual X : A { ");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("ref refToA = {X,X}");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t\t");
      _builder_2.append("att nicknames = {\"John\",\"Bob\",\"Gary\"}");
      _builder_2.newLine();
      _builder_2.append("\t\t\t\t");
      _builder_2.append("};");
      _builder_2.newLine();
      _builder_2.append("\t\t\t");
      _builder_2.append("}");
      final ML2Model correctModel = this._parseHelper.parse(_builder_2);
      EClass _referenceAssignment_2 = MetaPackage.eINSTANCE.getReferenceAssignment();
      this._validationTestHelper.assertNoWarnings(correctModel, _referenceAssignment_2, 
        LinguisticRules.INVALID_MULTIPLICITY);
      EClass _attributeAssignment_2 = MetaPackage.eINSTANCE.getAttributeAssignment();
      this._validationTestHelper.assertNoWarnings(correctModel, _attributeAssignment_2, 
        LinguisticRules.INVALID_MULTIPLICITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCheckInstantiatedRegularities() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A; individual Aminus :A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("order 2 class B categorizes C { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("regularity ref actualToA : A determinesValue toA };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C { ref toA : A };");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class BC :B specializes C {};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      final ML2Model incorretModel = this._parseHelper.parse(_builder);
      EClass _mL2Class = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertWarning(incorretModel, _mL2Class, 
        LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module t {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A; individual Aminus :A;");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("order 2 class B categorizes C { ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("regularity ref actualToA : A determinesValue toA");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("};");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class C { ref toA : A };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class BC :B specializes C {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref actualToA = Aminus };");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      final ML2Model corretModel = this._parseHelper.parse(_builder_1);
      EClass _mL2Class_1 = MetaPackage.eINSTANCE.getML2Class();
      this._validationTestHelper.assertNoWarnings(corretModel, _mL2Class_1, 
        LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
