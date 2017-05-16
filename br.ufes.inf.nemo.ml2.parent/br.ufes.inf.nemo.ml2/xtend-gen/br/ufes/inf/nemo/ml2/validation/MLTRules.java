package br.ufes.inf.nemo.ml2.validation;

import br.ufes.inf.nemo.ml2.meta.HOClass;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.util.ML2Util;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Set;
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
  
  public boolean minOrder(final HOClass ho) {
    boolean _xifexpression = false;
    Integer _order = ho.getOrder();
    boolean _lessThan = ((_order).intValue() < MLTRules.MIN_ORDER);
    if (_lessThan) {
      _xifexpression = false;
    } else {
      _xifexpression = true;
    }
    return _xifexpression;
  }
  
  public boolean isMissingSpecializationThroughPowertype(final ML2Class c, final Set<ML2Class> cHierarchy) {
    final Function1<ML2Class, Boolean> _function = (ML2Class ho) -> {
      ML2Class _powertypeOf = ho.getPowertypeOf();
      boolean _notEquals = (!Objects.equal(_powertypeOf, null));
      if (_notEquals) {
        if (((!cHierarchy.contains(ho.getPowertypeOf())) && (!Objects.equal(ho.getPowertypeOf(), c)))) {
          return Boolean.valueOf(true);
        }
      }
      return Boolean.valueOf(false);
    };
    return IterableExtensions.<ML2Class>exists(this._mL2Util.getAllInstantiatedClasses(c), _function);
  }
}
