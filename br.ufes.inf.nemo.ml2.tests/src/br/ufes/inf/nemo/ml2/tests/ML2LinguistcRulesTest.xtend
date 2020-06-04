package br.ufes.inf.nemo.ml2.tests

import com.google.inject.Inject
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper
import br.ufes.inf.nemo.ml2.model.Model
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.model.Class
import br.ufes.inf.nemo.ml2.validation.LinguisticRules

@ExtendWith(InjectionExtension)
@InjectWith(typeof(ML2InjectorProvider))
class ML2LinguistcRulesTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
//	@Inject extension ML2Lib
//	
//	@Inject Provider<ResourceSet> resourceSetProvider

	@Test def testIsNameValid(){
		val correctModel = ''' module t { class Abc; }'''.parse
		correctModel.assertNoErrors
		
		val incorrectModel = ''' module t { class abc; }'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_ENTITY_DECLARATION_NAME)
	}
	
	@Test def testIsValidInstantiation(){
		val incorrectModelA = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			individual A:HO1;
		}'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val incorrectModelB = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			class A:HO2;
		}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val incorrectModelC = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			class A:FO;
		}'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val incorrectModelD = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			order 2 class A:FO;
		}'''.parse
		incorrectModelD.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val incorrectModelE = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			order 2 class A:HO1;
		}'''.parse
		incorrectModelE.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val incorrectModelF = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			orderless class A:FO;
		}'''.parse
		incorrectModelF.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val incorrectModelG = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			orderless class A:HO1;
		}'''.parse
		incorrectModelG.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val correctModelA = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			individual A:FO,OC;
		}'''.parse
		correctModelA.assertNoErrors(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val correctModelB = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			class A:HO1,OC;
		}'''.parse
		correctModelB.assertNoErrors(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val correctModelC = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			order 2 class A:HO2,OC;
		}'''.parse
		correctModelC.assertNoErrors(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
		
		val correctModelD = '''module t { 
			class FO;	order 2 class HO1;		order 3 class HO2;		orderless class OC;
			orderless class A:OC;
		}'''.parse
		correctModelD.assertNoErrors(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.INVALID_INSTANTIATION)
	}
	
	@Test def testIsValidSpecialization(){
		val incorrectModelA = ''' module t{ class A specializes A; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelB = ''' module t{ order 2 class A; class B specializes A; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelC = ''' module t{ order 2 class A; orderless class B specializes A; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
		val incorrectModelD = ''' module t{ order 2 class A; order 3 class B specializes A; }'''.parse
		incorrectModelD.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CLASS_SPECIALIZATION)
		
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
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.CYCLIC_SPECIALIZATION)
		
		val incorrectModelB = ''' module t{
				class A specializes B;
				class B specializes A;
			}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.CYCLIC_SPECIALIZATION)
	}

	@Test def testHasValidBasetype(){
		// TODO Add tests for WClass scenarios
//		val incorrectModelA = '''module t { order 2 class A categorizes B; orderless class B; }'''.parse
//		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CATEGORIZED_CLASS)
		
		val incorrectModelB = '''module t { order 2 class A categorizes B; order 2 class B ; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CATEGORIZED_CLASS)
		
		val incorrectModelC = '''module t { order 3 class A categorizes B; order 3 class B; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_CATEGORIZED_CLASS)
		
		val correctModel = '''module t {
				order 2 class A categorizes B; class B;
				order 3 class C categorizes D; order 2 class D;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidPowertypeRelation(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { order 2 class A isPowertypeOf B; orderless class B; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val incorrectModelB = '''module t { order 2 class A isPowertypeOf B; order 2 class B; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val incorrectModelC = '''module t { order 3 class A isPowertypeOf B; order 3 class B; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_POWERTYPE_RELATION)
		
		val correctModel = '''module t {
				order 2 class A isPowertypeOf B; class B;
				order 3 class C isPowertypeOf D; order 2 class D;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasValidSubordinators(){
		// TODO Add tests for WClass scenarios
		val incorrectModelA = '''module t { order 2 class A subordinatedTo A; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_SUBORDINATOR)
		
		val incorrectModelB = '''module t { order 2 class A subordinatedTo B; class B; }'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_SUBORDINATOR)
		
		val incorrectModelC = '''module t { order 2 class A subordinatedTo B; order 3 class B; }'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,LinguisticRules.INVALID_SUBORDINATOR)
		
		val correctModel = '''module t { order 2 class A subordinatedTo B; order 2 class B; }'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testDuplicatedNames(){
		val incorrectModel = '''module t{ class A; class A; }'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.entityDeclaration,LinguisticRules.DUPLICATED_ENTITY_NAME)
		
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
		incorrectModelA.assertError(ModelPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val incorrectModelB = '''module t {
				class A;
				class B specializes A;
				class C specializes A;
				order 2 class X categorizes B;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.generalizationSet,
			LinguisticRules.INVALID_GENERALIZATION_SET_MEMBERS)
		
		val incorrectModelC = '''module t {
				class A;
				class B specializes A;
				class C specializes A;
				order 2 class X categorizes A;
				genset gs general A categorizer X specifics B,C;
			}'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.generalizationSet,
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
		incorrectModel.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.MISSING_SPECIALIZATION_THROUGH_SUBODINATION)
		
		val correctModel = '''module t{
				order 2 class XA; order 2 class XB subordinatedTo XA;
				class YA:XA; class YB:XB specializes YA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
	@Test def testHasSimpleSubordinationCycle(){
		val incorrectModelA = '''module t{ orderless class A subordinatedTo A; }'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val incorrectModelB = '''module t{
				orderless class A subordinatedTo B;
				orderless class B subordinatedTo A;
			}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.class_,
			LinguisticRules.SIMPLE_SUBORDINATION_CYCLE)
		
		val incorrectModelC = '''module t{
				orderless class A subordinatedTo B;
				orderless class B specializes A;
			}'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.class_,
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
		incorrectModel.assertWarning(ModelPackage.eINSTANCE.class_,
			LinguisticRules.SPECILIZATION_OF_DISJOINT_CLASSES)
		
		val correctModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				disjoint genset x general A specifics B,C;
				orderless class D specializes C;
				orderless class E specializes B;
			}'''.parse
		correctModel.assertNoWarnings(ModelPackage.eINSTANCE.class_,
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
		incorrectModel.assertWarning(ModelPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.INSTANCE_OF_DISJOINT_CLASSES)
		
		val correctModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				genset a general A specifics B,C;
				individual X:B,C;
			}'''.parse
		correctModel.assertNoWarnings(ModelPackage.eINSTANCE.entityDeclaration,
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
		incorrectModel.assertWarning(ModelPackage.eINSTANCE.entityDeclaration,
			LinguisticRules.MISSING_INSTANTIATION_OF_COMPLETE_GENERALIZATION_SET)
		
		val correctModel = '''module t{
				orderless class A;
				orderless class B specializes A;
				orderless class C specializes A;
				
				complete genset a general A specifics B,C;
				individual X:A,B;
			}'''.parse
		correctModel.assertNoWarnings(ModelPackage.eINSTANCE.entityDeclaration,
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
//		incorrectModelA.assertError(ModelPackage.eINSTANCE.reference,
//			LinguisticRules.INVALID_MULTIPLICITY)
//		incorrectModelA.assertError(ModelPackage.eINSTANCE.attribute,
//			LinguisticRules.INVALID_MULTIPLICITY)
		
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
		incorrectModelB.assertError(ModelPackage.eINSTANCE.reference,
			LinguisticRules.INVALID_MULTIPLICITY)
		incorrectModelB.assertError(ModelPackage.eINSTANCE.attribute,
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
		incorrectModelA.assertWarning(ModelPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		incorrectModelA.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
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
		incorrectModelB.assertWarning(ModelPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		incorrectModelB.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
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
		correctModel.assertNoWarnings(ModelPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		correctModel.assertNoWarnings(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.INVALID_MULTIPLICITY)
		
		
	}
	
	@Test def testCheckFeatureAssignmentType(){
		val correctModelB = '''module t {
				datatype Color {
					red:Number blue:Number green:Number
				};
				individual Black : Color { red=0 green=0 blue=0 };
				class ColoredObject { color : [1..2] Color };
				individual SomeCube : ColoredObject { 
					color = {Black,[ red=255 green=255 blue=255 ]}
				};
				individual OtherCube : ColoredObject { color = Black };
			}'''.parse
		correctModelB.assertNoErrors(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_ASSIGNMENT)
		correctModelB.assertNoErrors
	}
	
	@Test def testCheckRegularityAndContainer() {
		val incorrectModelA = '''module t {
				class HA { regularity h_name : String determinesValue name };
				class A { name : String };
			}'''.parse
		incorrectModelA.assertError(ModelPackage.eINSTANCE.feature,
			LinguisticRules.FIRST_ORDER_REGULARITY)
		val incorrectModelB = '''module t {
				class HA { regularity ref h_a : A determinesValue name };
				class A { ref a : A };
			}'''.parse
		incorrectModelB.assertError(ModelPackage.eINSTANCE.feature,
			LinguisticRules.FIRST_ORDER_REGULARITY)
		
		val incorrectModelC = '''module t {
				order 2 class HA categorizes A { regularity ref h_a : A determinesMaxValue a };
				class A { ref a : A };
			}'''.parse
		incorrectModelC.assertError(ModelPackage.eINSTANCE.feature,
			LinguisticRules.RESTRICTED_REGULARITY_TYPE)
		val incorrectModelD = '''module t {
				order 2 class HA categorizes A { regularity h_name : String determinesType name };
				class A { name : String };
			}'''.parse
		incorrectModelD.assertError(ModelPackage.eINSTANCE.feature,
			LinguisticRules.RESTRICTED_REGULARITY_TYPE)
	}
	
	@Test def testCheckInstantiatedRegularities(){
		val incorretModel = '''module t {
				class A; individual Aminus :A;
				
				order 2 class B categorizes C { 
					regularity ref actualToA : A determinesValue toA };
				class C { ref toA : A };
				class BC :B specializes C {};
			}'''.parse
		incorretModel.assertWarning(ModelPackage.eINSTANCE.class_,
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
		corretModel.assertNoWarnings(ModelPackage.eINSTANCE.class_,
			LinguisticRules.MISSING_ASSIGNMENT_BY_REGULARITY)
	}
	
	@Test def testCheckRegularityFeatureConformance(){
		val incorretModelA = '''module t {
				order 2 class HA categorizes A {
					regularity ref ha_ref : [0..*] A determinesValue a_ref };
				class A { ref a_ref : [0..*] A };
				class B :HA specializes A { ref ha_ref = {A1,A3} };
				individual A1 :A;
				individual A2 :A;
				individual A3 :A;
				individual B1 :B { ref a_ref = {A2} };
			}'''.parse
		incorretModelA.assertWarning(ModelPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
			
		val corretModelA = '''module t {
				order 2 class HA categorizes A {
					regularity ref ha_ref : [0..*] A determinesValue a_ref };
				class A { ref a_ref : [0..*] A };
				class B :HA specializes A { ref ha_ref = {A1,A3} };
				individual A1 :A;
				individual A3 :A;
				individual B1 :B { ref a_ref = {A1,A3} };
			}'''.parse
		corretModelA.assertNoWarnings(ModelPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelB = '''module t {
				order 2 class HA categorizes A {
					regularity ref ha_ref : [0..*] A determinesAllowedValues a_ref };
				class A { ref a_ref : [0..*] A };
				class B :HA specializes A { ref ha_ref = {A1,A3} };
				individual A1 :A;
				individual A2 :A;
				individual A3 :A;
				individual B1 :B { ref a_ref = {A2} };
			}'''.parse
		incorretModelB.assertWarning(ModelPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val corretModelB = '''module t {
				order 2 class HA categorizes A {
					regularity ref ha_ref : [0..*] A determinesAllowedValues a_ref };
				class A { ref a_ref : [0..*] A };
				class B :HA specializes A { ref ha_ref = {A1,A3} };
				individual A1 :A;
				individual A3 :A;
				individual B1 :B { ref a_ref = {} };
				individual B2 :B { ref a_ref = {A3} };
			}'''.parse
		corretModelB.assertNoWarnings(ModelPackage.eINSTANCE.referenceAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelC1 = '''module t {
				order 2 class HA categorizes A {
					regularity limit : Number determinesMaxValue number };
				class A { number : [0..*] Number };
				class B :HA specializes A { limit = 50 };
				individual B1 :B { number = 51 };
			}'''.parse
		incorretModelC1.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelC2 = '''module t {
				order 2 class HA categorizes A {
					regularity limit : Number determinesMinValue number };
				class A { number : [0..*] Number };
				class B :HA specializes A { limit = 50 };
				individual B1 :B { number = 49 };
			}'''.parse
		incorretModelC2.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val corretModelC = '''module t {
				order 2 class HA categorizes A {
					regularity max_limit : Number determinesMaxValue number
					regularity min_limit : Number determinesMinValue number
				 };
				class A { number : [0..*] Number };
				class B :HA specializes A { max_limit = 50	min_limit = 50 };
				individual B1 :B { number = 50 };
			}'''.parse
		corretModelC.assertNoWarnings(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelD1 = '''module t {
				order 2 class HA categorizes A {
					regularity predefine : Boolean determinesValue b };
				class A { b : Boolean };
				class B :HA specializes A { predefine = true };
				individual B1 :B { b = false };
			}'''.parse
		incorretModelD1.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelD2 = '''module t {
				datatype Color { value : Number };
				individual Black :Color { value = 0 };
				order 2 class HA categorizes A {
					regularity predefine : Color determinesValue color };
				class A { color : Color };
				class B :HA specializes A { predefine = Black };
				individual B1 :B { color = [value=0] };
			}'''.parse
		incorretModelD2.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelD = '''module t {
				datatype Color { value : Number };
				individual Black :Color { value = 0 };
				order 2 class HA categorizes A {
					regularity predefine : Color determinesValue color };
				class A { color : Color };
				class B :HA specializes A { predefine = Black };
				individual B1 :B { color = Black };
				
				order 2 class DHA categorizes DA {
					regularity predefine : Boolean determinesValue b };
				class DA { b : Boolean };
				class DB :DHA specializes DA { predefine = false };
				individual DB1 :DB { b = false };
			}'''.parse
		incorretModelD.assertNoWarnings(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelE1 = '''module t {
				order 2 class HA categorizes A {
					regularity predefine : [0..*] String determinesAllowedValues names };
				class A { names : [0..*] String };
				class B :HA specializes A { predefine = {"abc","bac"} };
				individual B1 :B { names = "aaa" };
			}'''.parse
		incorretModelE1.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val incorretModelE2 = '''module t {
				datatype Color { value : Number };
				individual Black :Color { value = 0 };
				individual White :Color { value = 100 };
				order 2 class HA categorizes A {
					regularity predefine : Color determinesAllowedValues color };
				class A { color : Color };
				class B :HA specializes A { predefine = {Black,White} };
				individual B1 :B { color = [value=0] };
			}'''.parse
		incorretModelE2.assertWarning(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
		
		val corretModelE = '''module t {
				datatype Color { value : Number };
				individual Black :Color { value = 0 };
				individual White :Color { value = 100 };
				order 2 class HA categorizes A {
					regularity predefine : [0..*] Color determinesAllowedValues color };
				class A { color : Color };
				class B :HA specializes A { predefine = {Black,White} };
				individual B1 :B { color = White };
				
				order 2 class EHA categorizes EA {
					regularity predefine : [0..*] String determinesAllowedValues names };
				class EA { names : [0..*] String };
				class EB :EHA specializes EA { predefine = {"abc","bac"} };
				individual EB1 :EB { names = {"abc","bac"} };
			}'''.parse
		corretModelE.assertNoWarnings(ModelPackage.eINSTANCE.attributeAssignment,
			LinguisticRules.NON_CONFORMANT_REGULATED_FEATURE_ASSIGNMENT)
	}
	
	
	
}
