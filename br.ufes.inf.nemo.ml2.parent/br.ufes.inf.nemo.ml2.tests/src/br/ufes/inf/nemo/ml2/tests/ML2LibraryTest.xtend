package br.ufes.inf.nemo.ml2.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import br.ufes.inf.nemo.ml2.meta.ML2Model
import br.ufes.inf.nemo.ml2.lib.ML2Lib
import br.ufes.inf.nemo.ml2.meta.MetaPackage
import br.ufes.inf.nemo.ml2.validation.ML2Validator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ML2InjectorProvider))
class ML2LibraryTest {
	
	@Inject extension ParseHelper<ML2Model>
	@Inject extension ValidationTestHelper
	@Inject extension ML2Lib
	
	@Inject Provider<ResourceSet> resourceSetProvider
	
	def ResourceSet loadResourceSet(){
		val rs = resourceSetProvider.get
//		rs.loadDatatypeLib
		rs.loadUFOLib
	}
	
	def static includeStatements()'''
		include «ML2Lib.UFO_BASE_LIB»;
		include «ML2Lib.UFO_ENDURANT_LIB»;
		include «ML2Lib.UFO_META_LIB»;'''
//		include «ML2Lib.DATATYPES_LIB»;'''
	
	@Test def void testDefaultLibs(){
		val rs = resourceSetProvider.get
//		rs.loadDatatypeLib
		rs.loadUFOLib
		rs.resources.forEach[ assertNoErrors ]
	}
	
	@Test def void testMustInstantiate(){
		val rs = loadResourceSet()
		val incorrectModel = '''module t {
				«includeStatements»
				class X specializes «ML2Lib.UFO_ENDURANT»;
			}'''.parse(rs)
		incorrectModel.assertError(MetaPackage.eINSTANCE.ML2Class,ML2Validator.UFO_A_MISSING_MUST_INSTANTIATION)
		
		val correctModel = '''module t {
				«includeStatements»
				class X : «ML2Lib.UFO_KIND» specializes «ML2Lib.UFO_ENDURANT»;
			}'''.parse(rs)
		correctModel.assertNoError(ML2Validator.UFO_A_MISSING_MUST_INSTANTIATION)
	}
	
	@Test def void testCheckSpecializationAndSortality(){
		val rs = loadResourceSet()
		val incorrectModel = '''module t {
				«includeStatements»
				class X : «ML2Lib.UFO_SORTAL_CLASS»;
				class Y : «ML2Lib.UFO_MIXIN_CLASS» specializes X;
			}'''.parse(rs)
		incorrectModel.assertError(MetaPackage.eINSTANCE.ML2Class,ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION)
		
		val correctModel = '''module t {
				«includeStatements»
				class Y : «ML2Lib.UFO_MIXIN_CLASS»;
				class X : «ML2Lib.UFO_SORTAL_CLASS» specializes Y;
			}'''.parse(rs)
		correctModel.assertNoError(ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION)
	}
	
	@Test def void testCheckSpecializationAndRigidity(){
		val rs = loadResourceSet()
		val incorrectModel1 = '''module t {
				«includeStatements»
				class Y : «ML2Lib.UFO_ANTI_RIGID_CLASS»;
				class X : «ML2Lib.UFO_RIGID_CLASS» specializes Y;
			}'''.parse(rs)
		incorrectModel1.assertError(MetaPackage.eINSTANCE.ML2Class,ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION)
		
		val incorrectModel2 = '''module t {
				«includeStatements»
				class Y : «ML2Lib.UFO_ANTI_RIGID_CLASS»;
				class X : «ML2Lib.UFO_SEMI_RIGID_CLASS» specializes Y;
			}'''.parse(rs)
		incorrectModel2.assertError(MetaPackage.eINSTANCE.ML2Class,ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION)
		
		val correctModel = '''module t {
				«includeStatements»
				class Y : «ML2Lib.UFO_RIGID_CLASS»;
				class X : «ML2Lib.UFO_ANTI_RIGID_CLASS» specializes Y;
			}'''.parse(rs)
		correctModel.assertNoError(ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION)
	}
	
}