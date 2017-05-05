package br.ufes.inf.nemo.ml2.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.generator.IGenerator2
import org.junit.Test
import br.ufes.inf.nemo.ml2.meta.ML2Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ML2InjectorProvider))
class OntoLGeneratorTest {
	
	@Inject extension ParseHelper<ML2Model>
	@Inject extension LibraryTest
	@Inject extension IGenerator2
	@Inject IGenerator2 gen
	
	@Test def void emptyTest() {}
	
//	@Test def void testGenerator(){
//		val model = loadModelText(LibraryTest.UFO_X).parse
//		val fsa =  new InMemoryFileSystemAccess
//		doGenerate(model.eResource,fsa,new IGeneratorContext{
//				override getCancelIndicator() {
//					return CancelIndicator.NullImpl
//				}
//			})
////		val ResourceSet rs = new ResourceSetImpl
////		val Resource r = rs.getResource(URI.createURI("asd"), true);
////		r.load(System.out, Collections.EMPTY_MAP)
////		val Model m = r.contents as Model
//	}
//	
//	@Test def void testGenerator2(){
//		val model = loadModelText(LibraryTest.UFO_X).parse
//		val xmiResource = model.eResource.resourceSet.createResource(URI.createURI("asd.xmi"))
//		
//		(gen as OntoLGenerator).doGenerate(model.eResource,xmiResource)
//		
//		val file = new FileOutputStream("file.xmi")
//		xmiResource.save(file, null)
//		file.close
//
////		val out = new PipedOutputStream()
////		val in = new PipedInputStream()
////		out.connect(in)
////		val sb = new StringBuilder()
////		var int i
////		while((i=in.read)!=-1){
////			sb.append(in.read as char)
////		}
////		println(sb.toString)
//	}
	
}