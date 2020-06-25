package br.ufes.inf.nemo.ml2.tests

import br.ufes.inf.nemo.ml2.model.Model
import br.ufes.inf.nemo.ml2.model.ModelPackage
import br.ufes.inf.nemo.ml2.validation.MLTRules
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(typeof(ML2InjectorProvider))
class ML2MLTRulesTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test def testIsMissingSpecializationThroughPowertype(){
		val incorrectModel = ''' module t{
				order 2 class HA isPowertypeOf FA;
				class FA;	class FB : HA;
			}'''.parse
		incorrectModel.assertError(ModelPackage.eINSTANCE.class_,MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE)
		
		val correctModel = ''' module t{
				order 2 class HA isPowertypeOf FA;
				class FA;		class FB : HA specializes FA;
			}'''.parse
		correctModel.assertNoErrors
	}
	
}
