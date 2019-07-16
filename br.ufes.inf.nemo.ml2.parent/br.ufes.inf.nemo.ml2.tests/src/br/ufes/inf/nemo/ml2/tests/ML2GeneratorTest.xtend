package br.ufes.inf.nemo.ml2.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import br.ufes.inf.nemo.ml2.model.ML2Model
import org.eclipse.xtext.generator.IGenerator2
import org.junit.jupiter.api.Test
import org.junit.Rule
import org.eclipse.xtext.xbase.testing.TemporaryFolder
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IGeneratorContext
import edu.mit.csail.sdg.alloy4viz.VizGUI
import edu.mit.csail.sdg.alloy4.A4Reporter
import edu.mit.csail.sdg.alloy4.ErrorWarning
import edu.mit.csail.sdg.alloy4compiler.ast.Module
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options
import edu.mit.csail.sdg.alloy4compiler.ast.Command
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod
import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IFileSystemAccess
import java.io.BufferedWriter
import java.io.FileWriter
import java.util.HashSet

//@RunWith(typeof(XtextRunner))
@ExtendWith(InjectionExtension)
@InjectWith(typeof(ML2InjectorProvider))
class ML2GeneratorTest {
	
	@Inject extension ParseHelper<ML2Model>
	@Inject extension ML2LibraryTest
	@Inject extension IGenerator2 gen
//	@Inject IGenerator2 gen

	@Rule @Inject public TemporaryFolder tempFolder
	@Inject extension CompilationTestHelper
	
	@Test def void emptyTest() {}
	
	@Test def void testGenerateRegularity() {
		val m1 = 
			'''
			module something {
				order 2 class PhoneModel categorizes Phone {
					regularity instancesScreenSize : Number determinesValue screenSize
					regularity instancesMinScreenSize : Number determinesMinValue screenSize
					regularity instancesMaxScreenSize : Number determinesMaxValue screenSize
				};
				class Phone {
					screenSize : Number
				};
				class IPhone5 : PhoneModel specializes Phone {
					instancesScreenSize = 5
					instancesMinScreenSize = 4
					instancesMaxScreenSize = 6
				};
			}
			'''.parse
        val fsa = new InMemoryFileSystemAccess()
//    	fsa.outputPath = tempFolder.root.absolutePath + File.separator
        gen.doGenerate(m1.eResource,fsa,null)
        //println(fsa.textFiles.values.get(1))
        
        val files = new HashSet<String>
//        files.add("res"+File.separator+"MLTStar.als")
//        files.add("res"+File.separator+"utils.als")
        
        var als_file = fsa.textFiles.values.get(1)
    	var file = tempFolder.newFile("main.als")
    	var writer = new BufferedWriter(new FileWriter(file));
        writer.write(als_file.toString);
        files.add(file.absolutePath);
        
        var VizGUI viz = null
        var A4Reporter rep = new A4Reporter() {
            override public void warning(ErrorWarning msg) {
                System.out.print("Relevance Warning:\n"+(msg.toString().trim())+"\n\n");
                System.out.flush();
            }
        };
        for(String filename:files) {
        	println("=========== Outputting Generated Code "+filename+" =============");
        	println("\n\n"+als_file+"\n\n")
            println("=========== Parsing+Typechecking "+filename+" =============");
            try {
            	var Module world = CompUtil.parseEverything_fromFile(rep, null, filename);
            } catch (ErrorWarning e) {
            	e.printStackTrace
            }
        }
        
	}
	
	
}
