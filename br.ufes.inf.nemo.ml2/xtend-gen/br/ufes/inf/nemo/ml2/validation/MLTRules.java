package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.model.HighOrderClass;
import br.ufes.inf.nemo.ml2.model.HigherOrderClass;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.util.ML2Util;
import br.ufes.inf.nemo.ml2.validation.ValidationError;
import br.ufes.inf.nemo.ml2.validation.ValidationIssue;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MLTRules {
  @Inject
  @Extension
  private ML2Util _mL2Util;
  
  public static final int MIN_ORDER = 2;
  
  public static final String INVALID_HO_CLASS_ORDER = "br.ufes.inf.nemo.ontol.InvalidHOClassOrder";
  
  public static final String MISSING_SPECIALIZATION_THROUGH_POWERTYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughPowertype";
  
  public ValidationError minOrder(final HighOrderClass ho) {
    ValidationError _xifexpression = null;
    int _order = ho.getOrder();
    boolean _lessThan = (_order < MLTRules.MIN_ORDER);
    if (_lessThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Order must be of ");
      _builder.append(MLTRules.MIN_ORDER);
      _builder.append(" or greater.");
      EAttribute _highOrderClass_Order = ModelPackage.eINSTANCE.getHighOrderClass_Order();
      _xifexpression = new ValidationError(_builder.toString(), _highOrderClass_Order, 
        ValidationIssue.NO_INDEX, 
        MLTRules.INVALID_HO_CLASS_ORDER, 
        ValidationIssue.NO_ISSUE_CODE, ho);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public ValidationError isMissingSpecializationThroughPowertype(final br.ufes.inf.nemo.ml2.model.Class c, final Set<br.ufes.inf.nemo.ml2.model.Class> cHierarchy, final Set<br.ufes.inf.nemo.ml2.model.Class> allIof) {
    final Function1<br.ufes.inf.nemo.ml2.model.Class, Boolean> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
      boolean _xblockexpression = false;
      {
        if ((!(it instanceof HigherOrderClass))) {
          return Boolean.valueOf(false);
        }
        final br.ufes.inf.nemo.ml2.model.Class base = ((HigherOrderClass) it).getPowertypeOf();
        _xblockexpression = (((base != null) && (!Objects.equal(base, c))) && (!cHierarchy.contains(base)));
      }
      return Boolean.valueOf(_xblockexpression);
    };
    final br.ufes.inf.nemo.ml2.model.Class invalid = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>findFirst(allIof, _function);
    if ((invalid == null)) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Missing specialization of ");
      String _name = ((HigherOrderClass) invalid).getPowertypeOf().getName();
      _builder.append(_name);
      _builder.append(", base type of ");
      String _name_1 = invalid.getName();
      _builder.append(_name_1);
      _builder.append(".");
      EReference _class_SuperClasses = ModelPackage.eINSTANCE.getClass_SuperClasses();
      return new ValidationError(_builder.toString(), _class_SuperClasses, 
        ValidationIssue.NO_INDEX, 
        MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
}
