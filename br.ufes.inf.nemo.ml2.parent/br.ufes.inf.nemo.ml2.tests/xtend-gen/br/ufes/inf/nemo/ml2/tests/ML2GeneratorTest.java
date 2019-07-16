package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.model.ML2Model;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.tests.ML2LibraryTest;
import com.google.inject.Inject;
import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.ErrorWarning;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4viz.VizGUI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.eclipse.xtext.xbase.testing.TemporaryFolder;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class ML2GeneratorTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private ML2LibraryTest _mL2LibraryTest;
  
  @Inject
  @Extension
  private IGenerator2 gen;
  
  @Rule
  @Inject
  public TemporaryFolder tempFolder;
  
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void emptyTest() {
  }
  
  @Test
  public void testGenerateRegularity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module something {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("order 2 class PhoneModel categorizes Phone {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("regularity instancesScreenSize : Number determinesValue screenSize");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("regularity instancesMinScreenSize : Number determinesMinValue screenSize");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("regularity instancesMaxScreenSize : Number determinesMaxValue screenSize");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class Phone {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("screenSize : Number");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class IPhone5 : PhoneModel specializes Phone {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("instancesScreenSize = 5");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("instancesMinScreenSize = 4");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("instancesMaxScreenSize = 6");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("};");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final ML2Model m1 = this._parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.gen.doGenerate(m1.eResource(), fsa, null);
      final HashSet<String> files = new HashSet<String>();
      CharSequence als_file = ((CharSequence[])Conversions.unwrapArray(fsa.getTextFiles().values(), CharSequence.class))[1];
      File file = this.tempFolder.newFile("main.als");
      FileWriter _fileWriter = new FileWriter(file);
      BufferedWriter writer = new BufferedWriter(_fileWriter);
      writer.write(als_file.toString());
      files.add(file.getAbsolutePath());
      VizGUI viz = null;
      A4Reporter rep = new A4Reporter() {
        @Override
        public void warning(final ErrorWarning msg) {
          String _trim = msg.toString().trim();
          String _plus = ("Relevance Warning:\n" + _trim);
          String _plus_1 = (_plus + "\n\n");
          System.out.print(_plus_1);
          System.out.flush();
        }
      };
      for (final String filename : files) {
        {
          InputOutput.<String>println((("=========== Outputting Generated Code " + filename) + " ============="));
          InputOutput.<String>println((("\n\n" + als_file) + "\n\n"));
          InputOutput.<String>println((("=========== Parsing+Typechecking " + filename) + " ============="));
          try {
            edu.mit.csail.sdg.alloy4compiler.ast.Module world = CompUtil.parseEverything_fromFile(rep, null, filename);
          } catch (final Throwable _t) {
            if (_t instanceof ErrorWarning) {
              final ErrorWarning e = (ErrorWarning)_t;
              e.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
