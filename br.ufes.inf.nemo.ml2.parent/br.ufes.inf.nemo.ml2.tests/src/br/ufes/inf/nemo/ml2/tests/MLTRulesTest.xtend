package br.ufes.inf.nemo.ml2.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.google.inject.Inject
import org.junit.Test
import br.ufes.inf.nemo.ml2.meta.ML2Model
import br.ufes.inf.nemo.ml2.meta.MetaPackage
import br.ufes.inf.nemo.ml2.validation.MLTRules

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ML2InjectorProvider))
class MLTRulesTest {
	
	@Inject extension ParseHelper<ML2Model>
	@Inject extension ValidationTestHelper
	
	@Test def testIsMissingSpecializationThroughPowertype(){
		val incorrectModel = ''' module t{
				order 2 class HA isPowertypeOf FA;
				class FA;	class FB : HA;
			}'''.parse
		incorrectModel.assertError(MetaPackage.eINSTANCE.ML2Class,MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE)
		
		val correctModel = ''' module t{
				order 2 class HA isPowertypeOf FA;
				class FA;		class FB : HA specializes FA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
}