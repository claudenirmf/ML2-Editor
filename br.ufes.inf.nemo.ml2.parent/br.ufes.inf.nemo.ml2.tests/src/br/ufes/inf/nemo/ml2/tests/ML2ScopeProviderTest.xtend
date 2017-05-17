package br.ufes.inf.nemo.ml2.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import br.ufes.inf.nemo.ml2.meta.ML2Model
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ML2InjectorProvider))
class ML2ScopeProviderTest {
	
	@Inject extension ParseHelper<ML2Model>
	@Inject extension ValidationTestHelper
	
	@Test def void testRefreneceAssigmentScopeForRefrenece(){
		val model = '''
			module t {
				class A { ref a : A };
				class B specializes A { ref a : A };
				individual Y : B { ref A.a = Y };
				individual Z : A { ref a = Z };
			}'''.parse
		model.assertNoErrors
	}
	
	@Test def void testRefreneceScopeForSubesetOf(){
		val model = '''
			module t {
				class A { ref a1:A	ref a2:A };
				class B specializes A { ref a1:C };
				class C specializes B {
					ref b1:B subsets B.a1
					ref b2:B subsets a2
				};
			}'''.parse
		model.assertNoErrors
	}
	
	@Test def void testRefreneceScopeForOppositeTo(){
		val model = '''
			module t {
				class A { 
					ref a1:A isOppositeTo a2
					ref a2:A isOppositeTo a1
					ref c:C isOppositeTo a
				};
				class B { ref c:C };
				class C { ref a:A isOppositeTo c };
			}'''.parse
		model.assertNoErrors
	}
	
	@Test def void testRefreneceScopeForRegularityFeature(){
		val model = '''
			module t {
				orderless class CA categorizes A {
					regularity ref ra : A determinesAllowedValues a
				};
				orderless class A {
					ref a : A
				};
			}'''.parse
		model.assertNoErrors
	}
		
}