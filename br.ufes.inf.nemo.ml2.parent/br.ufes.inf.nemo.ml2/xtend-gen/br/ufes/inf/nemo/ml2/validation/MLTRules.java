package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.meta.HOClass;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
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
  
  public final static int MIN_ORDER = 2;
  
  public final static String INVALID_HO_CLASS_ORDER = "br.ufes.inf.nemo.ontol.InvalidHOClassOrder";
  
  public final static String MISSING_SPECIALIZATION_THROUGH_POWERTYPE = "br.ufes.inf.nemo.ontol.MissingSpecializationThroughPowertype";
  
  public ValidationError minOrder(final HOClass ho) {
    ValidationError _xifexpression = null;
    Integer _order = ho.getOrder();
    boolean _lessThan = ((_order).intValue() < MLTRules.MIN_ORDER);
    if (_lessThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Order must be of ");
      _builder.append(MLTRules.MIN_ORDER, "");
      _builder.append(" or greater.");
      EAttribute _hOClass_Order = MetaPackage.eINSTANCE.getHOClass_Order();
      _xifexpression = new ValidationError(_builder.toString(), _hOClass_Order, 
        ValidationIssue.NO_INDEX, 
        MLTRules.INVALID_HO_CLASS_ORDER, 
        ValidationIssue.NO_ISSUE_CODE, ho);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public ValidationError isMissingSpecializationThroughPowertype(final ML2Class c, final Set<ML2Class> cHierarchy, final Set<ML2Class> allIof) {
    final Function1<ML2Class, Boolean> _function = (ML2Class it) -> {
      boolean _xblockexpression = false;
      {
        final ML2Class base = it.getPowertypeOf();
        _xblockexpression = (((base != null) && (!Objects.equal(base, c))) && (!cHierarchy.contains(base)));
      }
      return Boolean.valueOf(_xblockexpression);
    };
    final ML2Class invalid = IterableExtensions.<ML2Class>findFirst(allIof, _function);
    if ((invalid == null)) {
      return null;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Missing specialization of ");
      ML2Class _powertypeOf = invalid.getPowertypeOf();
      String _name = _powertypeOf.getName();
      _builder.append(_name, "");
      _builder.append(", base type of ");
      String _name_1 = invalid.getName();
      _builder.append(_name_1, "");
      _builder.append(".");
      EReference _mL2Class_SuperClasses = MetaPackage.eINSTANCE.getML2Class_SuperClasses();
      return new ValidationError(_builder.toString(), _mL2Class_SuperClasses, 
        ValidationIssue.NO_INDEX, 
        MLTRules.MISSING_SPECIALIZATION_THROUGH_POWERTYPE, 
        ValidationIssue.NO_ISSUE_CODE, c);
    }
  }
}
