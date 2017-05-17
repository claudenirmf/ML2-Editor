package br.ufes.inf.nemo.ml2.tests

import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import br.ufes.inf.nemo.ml2.meta.ML2Model
import br.ufes.inf.nemo.ml2.util.ML2Util
import br.ufes.inf.nemo.ml2.meta.ML2Class
import br.ufes.inf.nemo.ml2.meta.MetaPackage
import br.ufes.inf.nemo.ml2.validation.LinguisticRules

@RunWith(typeof(XtextRunner))
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
		model.assertError(MetaPackage.eINSTANCE.ML2Class,LinguisticRules.CYCLIC_SPECIALIZATION)
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