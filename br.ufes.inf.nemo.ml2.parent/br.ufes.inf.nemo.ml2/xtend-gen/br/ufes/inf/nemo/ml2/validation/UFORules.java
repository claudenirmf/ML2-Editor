package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.lib.ML2Lib;
import br.ufes.inf.nemo.ml2.meta.FOClass;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.validation.ML2Validator;
import br.ufes.inf.nemo.ml2.validation.ValidationError;
import br.ufes.inf.nemo.ml2.validation.ValidationIssue;
import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class UFORules {
  @Inject
  @Extension
  private ML2Lib _mL2Lib;
  
  public ValidationIssue mustInstantiateUFOMetaproperties(final FOClass c, final Set<ML2Class> ch, final Set<ML2Class> iof, final ML2Class endurant, final Set<ML2Class> mustInstantiate) {
    if ((ch.contains(endurant) && Sets.<ML2Class>intersection(iof, mustInstantiate).isEmpty())) {
      final ValidationError issue = new ValidationError();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Every specilization of Endurant must instantiate one of the following classes:");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("-");
      {
        for(final ML2Class m : mustInstantiate) {
          String _name = m.getName();
          _builder.append(_name, "\t\t\t\t");
          _builder.append(" ");
        }
      }
      issue.setMessage(_builder.toString());
      issue.setSource(c);
      EReference _entityDeclaration_InstantiatedClasses = MetaPackage.eINSTANCE.getEntityDeclaration_InstantiatedClasses();
      issue.setFeature(_entityDeclaration_InstantiatedClasses);
      issue.setCode(ML2Validator.UFO_A_MISSING_MUST_INSTANTIATION);
      return issue;
    }
    return null;
  }
  
  public ValidationIssue checkSpecializationAndSortality(final FOClass c, final Set<ML2Class> ch, final Set<ML2Class> iof, final ML2Class mixinclass) {
    boolean _contains = iof.contains(mixinclass);
    if (_contains) {
      final ML2Class sortalclass = this._mL2Lib.getLibClass(c, ML2Lib.UFO_SORTAL_CLASS);
      final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
        EList<ML2Class> _instantiatedClasses = it.getInstantiatedClasses();
        return Boolean.valueOf(_instantiatedClasses.contains(sortalclass));
      };
      final ML2Class dude = IterableExtensions.<ML2Class>findFirst(ch, _function);
      boolean _equals = Objects.equal(dude, null);
      if (_equals) {
        return null;
      }
      final ValidationError issue = new ValidationError();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Instances of non-soral classes may not specialize the sortal class ");
      String _name = dude.getName();
      _builder.append(_name, "");
      issue.setMessage(_builder.toString());
      issue.setSource(c);
      EReference _mL2Class_SuperClasses = MetaPackage.eINSTANCE.getML2Class_SuperClasses();
      issue.setFeature(_mL2Class_SuperClasses);
      issue.setCode(ML2Validator.UFO_A_ILLEGAL_SORTAL_SPECIALIZATION);
      return issue;
    }
    return null;
  }
  
  public ValidationIssue checkSpecializationAndRigidity(final FOClass c, final Set<ML2Class> ch, final Set<ML2Class> iof, final ML2Class rigidclass, final ML2Class semirigidclass) {
    boolean _contains = iof.contains(rigidclass);
    if (_contains) {
      final ML2Class antirigidclass = this._mL2Lib.getLibClass(c, ML2Lib.UFO_ANTI_RIGID_CLASS);
      final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
        EList<ML2Class> _instantiatedClasses = it.getInstantiatedClasses();
        return Boolean.valueOf(_instantiatedClasses.contains(antirigidclass));
      };
      final ML2Class dude = IterableExtensions.<ML2Class>findFirst(ch, _function);
      boolean _equals = Objects.equal(dude, null);
      if (_equals) {
        return null;
      }
      final ValidationError issue = new ValidationError();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Instances of rigid classes may not specialize the anti-rigid class ");
      String _name = dude.getName();
      _builder.append(_name, "");
      issue.setMessage(_builder.toString());
      issue.setSource(c);
      EReference _mL2Class_SuperClasses = MetaPackage.eINSTANCE.getML2Class_SuperClasses();
      issue.setFeature(_mL2Class_SuperClasses);
      issue.setCode(ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION);
      return issue;
    } else {
      boolean _contains_1 = iof.contains(semirigidclass);
      if (_contains_1) {
        final ML2Class antirigidclass_1 = this._mL2Lib.getLibClass(c, ML2Lib.UFO_ANTI_RIGID_CLASS);
        final Function1<ML2Class, Boolean> _function_1 = (ML2Class it) -> {
          EList<ML2Class> _instantiatedClasses = it.getInstantiatedClasses();
          return Boolean.valueOf(_instantiatedClasses.contains(antirigidclass_1));
        };
        final ML2Class dude_1 = IterableExtensions.<ML2Class>findFirst(ch, _function_1);
        boolean _equals_1 = Objects.equal(dude_1, null);
        if (_equals_1) {
          return null;
        }
        final ValidationError issue_1 = new ValidationError();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Instances of semi-rigid classes may not specialize the anti-rigid class ");
        String _name_1 = dude_1.getName();
        _builder_1.append(_name_1, "");
        issue_1.setMessage(_builder_1.toString());
        issue_1.setSource(c);
        EReference _mL2Class_SuperClasses_1 = MetaPackage.eINSTANCE.getML2Class_SuperClasses();
        issue_1.setFeature(_mL2Class_SuperClasses_1);
        issue_1.setCode(ML2Validator.UFO_A_ILLEGAL_RIGID_SPECIALIZATION);
        return issue_1;
      }
    }
    return null;
  }
}
