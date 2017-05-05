package br.ufes.inf.nemo.ml2.tests;

import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.ModelElement;
import br.ufes.inf.nemo.ml2.tests.ML2InjectorProvider;
import br.ufes.inf.nemo.ml2.util.ML2Util;
import com.google.inject.Inject;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ML2InjectorProvider.class)
@SuppressWarnings("all")
public class ML2UtilTest {
  @Inject
  @Extension
  private ParseHelper<ML2Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private ML2Util _mL2Util;
  
  @Test
  public void testClassHierarchyGetter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C specializes A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class D specializes B,C;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String unparssedModel = _builder.toString();
      final ML2Model model = this._parseHelper.parse(unparssedModel);
      this._validationTestHelper.assertNoErrors(model);
      final BasicEList<ML2Class> classes = new BasicEList<ML2Class>();
      EList<ModelElement> _elements = model.getElements();
      final Consumer<ModelElement> _function = (ModelElement it) -> {
        if ((it instanceof ML2Class)) {
          classes.add(((ML2Class)it));
        }
      };
      _elements.forEach(_function);
      ML2Class _get = classes.get(3);
      Set<ML2Class> list = this._mL2Util.classHierarchy(_get);
      Assert.assertTrue(
        (((list.contains(classes.get(0)) && list.contains(classes.get(1))) && list.contains(classes.get(2))) && (list.size() == 3)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testClassHierarchyCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A specializes B;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B specializes A;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final ML2Model model = this._parseHelper.parse(_builder);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAllInstantiatedClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module t {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("order 2 class A ispowertypeof X;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class X;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class Y specializes X;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._parseHelper.parse(_builder);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
