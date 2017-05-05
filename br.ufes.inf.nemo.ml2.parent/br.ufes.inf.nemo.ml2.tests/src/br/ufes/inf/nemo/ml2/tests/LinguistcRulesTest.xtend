package br.ufes.inf.nemo.ml2.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import br.ufes.inf.nemo.ml2.lib.ML2Lib
import br.ufes.inf.nemo.ml2.meta.ML2Model
import br.ufes.inf.nemo.ml2.meta.MetaPackage
import br.ufes.inf.nemo.ml2.validation.LinguisticRules

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ML2InjectorProvider))
class LinguistcRulesTest {
	
	@Inject extension ParseHelper<ML2Model>
	@Inject extension ValidationTestHelper
	@Inject extension ML2Lib
	
	@Inject Provider<ResourceSet> resourceSetProvider

	@Test def testIsNameValid(){
		val correctModel = ''' module t { class Abc; }'''.parse
		correctModel.assertNoErrors
		
		val incorrectModel = ''' module t { class abc; }'''.parse
		incorrectModel.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_ENTITY_DECLARATION_NAME)
	}
	
	@Test def testIsValidSpecialization(){
		val incorrectModelA = ''' module t{ class A specializes A; }'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelB = ''' module t{ order 2 class A; class B specializes A; }'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelC = ''' module t{ order 2 class A; orderless class B specializes A; }'''.parse
		incorrectModelC.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelD = ''' module t{ order 2 class A; order 3 class B specializes A; }'''.parse
		incorrectModelD.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val correctModel = '''module t {
				orderless class WA; order 2 class HA; class FA;
				orderless class WB specializes WA;
				order 2 class HB specializes WA, HA;
				class FB specializes WA, FA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasCyclicSpecialization(){
		val incorrectModelA = ''' module t{ class A specializes A; }'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.CYCLIC_SPECIALIZATION)
		
		val incorrectModelB = ''' module t{
				class A specializes B;
				class B specializes A;
			}'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.CYCLIC_SPECIALIZATION)
	}

	@Test def testHasValidBasetype(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { order 2 class A categorizes B; orderless class B; }'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_CATEGORIZED_CLASS)
		
		val incorrectModelB = '''module t { order 2 class A categorizes B; order 2 class B ; }'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_CATEGORIZED_CLASS)
		
		val incorrectModelC = '''module t { order 3 class A categorizes B; order 3 class B; }'''.parse
		incorrectModelC.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_CATEGORIZED_CLASS)
		
		val correctModel = '''module t {
				order 2 class A categorizes B; class B;
				order 3 class C categorizes D; order 2 class D;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidPowertypeRelation(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { order 2 class A isPowertypeOf B; orderless class B; }'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val incorrectModelB = '''module t { order 2 class A isPowertypeOf B; order 2 class B; }'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val incorrectModelC = '''module t { order 3 class A isPowertypeOf B; order 3 class B; }'''.parse
		incorrectModelC.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val correctModel = '''module t {
				order 2 class A isPowertypeOf B; class B;
				order 3 class C isPowertypeOf D; order 2 class D;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidSubordinators(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { order 2 class A subordinatedTo A; }'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_SUBORDINATOR)
		
		val incorrectModelB = '''module t { order 2 class A subordinatedTo B; class B; }'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_SUBORDINATOR)
		
		val incorrectModelC = '''module t { order 2 class A subordinatedTo B; order 3 class B; }'''.parse
		incorrectModelC.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.INVALID_SUBORDINATOR)
		
		val correctModel = '''module t { order 2 class A subordinatedTo B; order 2 class B; }'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testDuplicatedNames(){
		val incorrectModel = '''module t{ class A; class A; }'''.parse
		incorrectModel.assertError(MetaPackage.eINSTANCE.entityDeclaration,LinguisticRules.DUPLICATED_ENTITY_NAME)
		
		val correctModel = '''module t{ class A; class B; }'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidMembers() {
		val incorrectModelA = '''module t {
				class A;
				class B specializes A;
				class C;
				genset gs general A specifics B,C;
			}'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val incorrectModelB = '''module t {
				class A;
				class B specializes A;
				class C specializes A;
				order 2 class X categorizes B;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val incorrectModelC = '''module t {
				class A;
				class B specializes A;
				class C specializes A;
				order 2 class X categorizes A;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		incorrectModelC.assertError(MetaPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val correctModel = '''module t {
				class A;
				class B:X specializes A;
				class C:X specializes A;
				order 2 class X categorizes A;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testObeysSubordination(){
		val incorrectModel = '''module t{
				order 2 class XA; 
				order 2 class XB subordinatedTo XA;
				class YA:XA; class YB:XB;
			}'''.parse
		incorrectModel.assertError(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION)
		
		val correctModel = '''module t{
				order 2 class XA; order 2 class XB subordinatedTo XA;
				class YA:XA; class YB:XB specializes YA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasSimpleSubordinationCycle(){
		val incorrectModelA = '''module t{ orderless class A subordinatedTo A; }'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val incorrectModelB = '''module t{
				orderless class A subordinatedTo B;
				orderless class B subordinatedTo A;
			}'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val incorrectModelC = '''module t{
				orderless class A subordinatedTo B;
				orderless class B specializes A;
			}'''.parse
		incorrectModelC.assertError(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val correctModel = '''module t{
				orderless class A;
				orderless class B specializes A subordinatedTo A;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testIsSpecializingDisjointClasses(){
		val incorrectModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				disjoint genset x general A specifics B,C;
				orderless class D specializes B,C;
			}'''.parse
		incorrectModel.assertWarning(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES)
		
		val correctModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				disjoint genset x general A specifics B,C;
				orderless class D specializes C;
				orderless class E specializes B;
			}'''.parse
		correctModel.assertNoWarnings(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES)
	}
	
	@Test def testIsInstanceOfDisjointClasses(){
		// TODO Investigate for errors
		val incorrectModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				disjoint genset a general A specifics B,C;
				individual X:B,C;
			}'''.parse
		incorrectModel.assertWarning(MetaPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES)
		
		val correctModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				genset a general A specifics B,C;
				individual X:B,C;
			}'''.parse
		correctModel.assertNoWarnings(MetaPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES)
	}
	
	@Test def testMissingInstantiationByCompleteness(){
		val incorrectModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				complete genset a general A specifics B,C;
				individual X:A;
			}'''.parse
		incorrectModel.assertWarning(MetaPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET)
		
		val correctModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				complete genset a general A specifics B,C;
				individual X:A,B;
			}'''.parse
		correctModel.assertNoWarnings(MetaPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET)
	}
	
	@Test def testSubsettedMultiplicity() {
		val incorrectModelA = '''module t {
				class A {
					ref refToA : [2..3] A
					att nickname : [2..3] A
				};
				
				class B specializes A {
					ref refToB : [1..3] B subsets refToA
					att nickname2 : [1..3] B subsets nickname
				};
			}'''.parse
		incorrectModelA.assertError(MetaPackage.eINSTANCE.reference,
			LinguisticRules.INVALID_MULTIPLICITY)
		incorrectModelA.assertError(MetaPackage.eINSTANCE.attribute,
			LinguisticRules.INVALID_MULTIPLICITY)
		
		val incorrectModelB = '''module t {
				class A {
					ref refToA : [2..3] A
					att nickname : [2..3] A
				};
				
				class B specializes A {
					ref refToB : [2..4] B subsets refToA
					att nickname2 : [2..5] B subsets nickname
				};
			}'''.parse
		incorrectModelB.assertError(MetaPackage.eINSTANCE.reference,
			LinguisticRules.INVALID_MULTIPLICITY)
		incorrectModelB.assertError(MetaPackage.eINSTANCE.attribute,
			LinguisticRules.INVALID_MULTIPLICITY)
		
		val correctModel = '''module t {
				class A {
					ref refToA : [2..3] A
					att nickname : [2..3] A
				};
				
				class B specializes A {
					ref refToB : [2..2] B subsets refToA
					att nickname2 : [3..3] B subsets nickname
				};
			}'''.parse
		correctModel.assertNoError(LinguisticRules.INVALID_MULTIPLICITY)
		correctModel.assertNoError(LinguisticRules.INVALID_MULTIPLICITY)
	}
	
	@Test def testMultiplicityAndAssignment(){
		val incorrectModelA = '''module t {
				class A { 
					ref refToA : [2..3] A
					att nicknames : [2..3] A	// This is going to fire other issues not related to multiplicity
				};
				individual X : A { 
					ref refToA = X
					att nicknames = "John"
				};
			}'''.parse
		incorrectModelA.assertWarning(MetaPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		incorrectModelA.assertWarning(MetaPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		
		val incorrectModelB = '''module t {
				class A { 
					ref refToA : [2..3] A
					att nicknames : [2..3] A	// This is going to fire other issues not related to multiplicity
				};
				individual X : A { 
					ref refToA = {X,X,X,X}
					att nicknames = {"John","Bob","Gary","Nick"}
				};
			}'''.parse
		incorrectModelB.assertWarning(MetaPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		incorrectModelB.assertWarning(MetaPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		
		val correctModel = '''module t {
				class A { 
					ref refToA : [2..3] A
					att nicknames : [2..3] A	// This is going to fire other issues not related to multiplicity
				};
				individual X : A { 
					ref refToA = {X,X}
					att nicknames = {"John","Bob","Gary"}
				};
			}'''.parse
		correctModel.assertNoWarnings(MetaPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		correctModel.assertNoWarnings(MetaPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
	}
	
//	@Test def testCheckPropertyAssignmentType(){
//		val rs = resourceSetProvider.get
////		rs.loadDatatypeLib
//		val correctModelB = '''module t {
//				include «ML2Lib.DATATYPES_LIB»;
//				import «ML2Lib.DATATYPES_LIB».*;
//				class Color specializes «ML2Lib.DATATYPES_DATATYPE» {
//					att red : «ML2Lib.DATATYPES_NUMBER»
//					att blue : «ML2Lib.DATATYPES_NUMBER»
//					att green : «ML2Lib.DATATYPES_NUMBER»
//				};
//				individual Black : Color { att red=0 att green=0 att blue=0 };
//				class ColoredObject { att color : [1..2] Color };
//				individual SomeCube : ColoredObject { att color = {[ red=255, green=255, blue=255 ]} };
//				individual OtherCube : ColoredObject { att color = Black };
//			}'''.parse(rs)
//		correctModelB.assertNoErrors(MetaPackage.eINSTANCE.attributeAssignment,
//			LinguisticRules.NON_CONFORMANT_ASSIGNMENT)
//		correctModelB.assertNoErrors
//	}
	
	@Test def testCheckInstantiatedRegularities(){
		val incorretModel = '''module t {
				class A; individual Aminus :A;
				
				order 2 class B categorizes C { 
					regularity ref actualToA : A determinesValue toA };
				class C { ref toA : A };
				class BC :B specializes C {};
			}'''.parse
		incorretModel.assertWarning(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY)
		
		val corretModel = '''module t {
				class A; individual Aminus :A;
				
				order 2 class B categorizes C { 
					regularity ref actualToA : A determinesValue toA
				};
				class C { ref toA : A };
				class BC :B specializes C {
					ref actualToA = Aminus };
			}'''.parse
		corretModel.assertNoWarnings(MetaPackage.eINSTANCE.ML2Class,
			LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY)
	}
	
}
