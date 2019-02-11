package br.ufes.inf.nemo.ml2.tests

import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper
import br.ufes.inf.nemo.ml2.model.ML2Model
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.model.ML2Class
import org.junit.jupiter.api.Test
import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.validation.LinguisticRules
import org.junit.Assert

//@RunWith(typeof(XtextRunner))
@ExtendWith(InjectionExtension)
@InjectWith(typeof(ML2InjectorProvider))
class ML2UtilTest {
	
	@Inject extension ParseHelper<ML2Model>
	@Inject extension ValidationTestHelper
	@Inject extension ML2Util
	
	@Test def void testClassHierarchyGetter(){
		val unparssedModel = '''
			module t{
				class A;
				class B specializes A;
				class C specializes A;
				class D specializes B,C;
			}
		'''
		val model = unparssedModel.parse
		model.assertNoErrors
		
		val classes = new BasicEList<ML2Class>()
		model.elements.forEach[ if(it instanceof ML2Class) classes.add(it) ]
		var Set<ML2Class> list = classes.get(3).classHierarchy
		Assert.assertTrue(
			list.contains(classes.get(0))
			&& list.contains(classes.get(1))
			&& list.contains(classes.get(2))
			&& list.size == 3
		)
	}
	
	@Test def void testClassHierarchyCycle(){
		val model = '''
			module t{
				class A specializes B;
				class B specializes A;
			}
		'''.parse
		model.assertError(ModelPackage.eINSTANCE.ML2Class,LinguisticRules.CYCLIC_SPECIALIZATION)
	}
	
	@Test def void testAllInstantiatedClasses(){
		'''
			module t {
				order 2 class A ispowertypeof X;
				
				class X;
				class Y specializes X;
			}
		'''.parse
	}
	
}
