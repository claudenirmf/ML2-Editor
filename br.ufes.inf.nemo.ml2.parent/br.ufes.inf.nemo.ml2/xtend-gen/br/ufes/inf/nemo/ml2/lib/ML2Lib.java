package br.ufes.inf.nemo.ml2.lib;

import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.util.ML2Index;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.InputStream;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ML2Lib {
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private ML2Index _mL2Index;
  
  public final static String MODEL_UFO_BASE = "br/ufes/inf/nemo/ml2/lib/ufo_base.ml2";
  
  public final static String MODEL_UFO_ENDURANT = "br/ufes/inf/nemo/ml2/lib/ufo_endurant.ml2";
  
  public final static String MODEL_UFO_META = "br/ufes/inf/nemo/ml2/lib/ufo_meta.ml2";
  
  public final static String UFO_BASE_LIB = "ml2.core.base";
  
  public final static String UFO_ENDURANT_LIB = "ml2.core.endurant";
  
  public final static String UFO_META_LIB = "ml2.core.meta";
  
  public final static String UFO_ENDURANT = (ML2Lib.UFO_ENDURANT_LIB + ".Endurant");
  
  public final static String UFO_SUBSTANTIAL = (ML2Lib.UFO_ENDURANT_LIB + ".Substantial");
  
  public final static String UFO_MOMENT = (ML2Lib.UFO_ENDURANT_LIB + ".Moment");
  
  public final static String UFO_FUNCTIONAL_COMPLEX = (ML2Lib.UFO_ENDURANT_LIB + ".FunctionalComplex");
  
  public final static String UFO_COLLECTIVE = (ML2Lib.UFO_ENDURANT_LIB + ".Collective");
  
  public final static String UFO_QUANTITY = (ML2Lib.UFO_ENDURANT_LIB + ".Quantity");
  
  public final static String UFO_RELATOR = (ML2Lib.UFO_ENDURANT_LIB + ".Relator");
  
  public final static String UFO_CONCRETE_RELATOR_TYPE = (ML2Lib.UFO_ENDURANT_LIB + ".ConcreteRelatorType");
  
  public final static String UFO_INTRINSIC_MOMENT = (ML2Lib.UFO_ENDURANT_LIB + ".IntrinsicMoment");
  
  public final static String UFO_QUALITY = (ML2Lib.UFO_ENDURANT_LIB + ".Quality");
  
  public final static String UFO_MODE = (ML2Lib.UFO_ENDURANT_LIB + ".Mode");
  
  public final static String UFO_EXTERNALLY_DEPENDENT_MODE = (ML2Lib.UFO_ENDURANT_LIB + ".ExternallyDependentMode");
  
  public final static String UFO_QUA_INDIVIDUAL = (ML2Lib.UFO_ENDURANT_LIB + ".QuaIndividual");
  
  public final static String UFO_SORTAL_CLASS = (ML2Lib.UFO_META_LIB + ".SortalClass");
  
  public final static String UFO_MIXIN_CLASS = (ML2Lib.UFO_META_LIB + ".MixinClass");
  
  public final static String UFO_RIGID_CLASS = (ML2Lib.UFO_META_LIB + ".RigidClass");
  
  public final static String UFO_SEMI_RIGID_CLASS = (ML2Lib.UFO_META_LIB + ".SemiRigidClass");
  
  public final static String UFO_ANTI_RIGID_CLASS = (ML2Lib.UFO_META_LIB + ".AntiRigidClass");
  
  public final static String UFO_KIND = (ML2Lib.UFO_META_LIB + ".Kind");
  
  public final static String UFO_SUBKIND = (ML2Lib.UFO_META_LIB + ".Subkind");
  
  public final static String UFO_SORTAL = (ML2Lib.UFO_META_LIB + ".Sortal");
  
  public final static String UFO_ROLE = (ML2Lib.UFO_META_LIB + ".Role");
  
  public final static String UFO_PHASE = (ML2Lib.UFO_META_LIB + ".Phase");
  
  public final static String UFO_PHASE_PARTITION = (ML2Lib.UFO_META_LIB + ".PhasePartition");
  
  public final static String UFO_CATEGORY = (ML2Lib.UFO_META_LIB + ".Category");
  
  public final static String UFO_MIXIN = (ML2Lib.UFO_META_LIB + ".Mixin");
  
  public final static String UFO_ROLE_MIXIN = (ML2Lib.UFO_META_LIB + ".RoleMixin");
  
  public final static String UFO_PHASE_MIXIN = (ML2Lib.UFO_META_LIB + ".PhaseMixin");
  
  public final static String UFO_PHASE_MIXIN_PARTITION = (ML2Lib.UFO_META_LIB + ".PhaseMixinPartition");
  
  public ResourceSet loadLib(final String libname) {
    ResourceSet _xblockexpression = null;
    {
      final InputStream stream = this.getClass().getClassLoader().getResourceAsStream(libname);
      ResourceSet _get = this.resourceSetProvider.get();
      final Procedure1<ResourceSet> _function = (ResourceSet resourceSet) -> {
        try {
          final Resource resource = resourceSet.createResource(URI.createURI(libname));
          resource.load(stream, resourceSet.getLoadOptions());
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(_get, _function);
    }
    return _xblockexpression;
  }
  
  public ResourceSet loadLib(final String libname, final ResourceSet rs) {
    ResourceSet _xblockexpression = null;
    {
      final InputStream stream = this.getClass().getClassLoader().getResourceAsStream(libname);
      final Procedure1<ResourceSet> _function = (ResourceSet resourceSet) -> {
        try {
          final Resource resource = resourceSet.createResource(URI.createURI(libname));
          resource.load(stream, resourceSet.getLoadOptions());
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(rs, _function);
    }
    return _xblockexpression;
  }
  
  public ResourceSet loadUFOLib() {
    return this.loadLib(ML2Lib.MODEL_UFO_BASE, this.loadLib(ML2Lib.MODEL_UFO_ENDURANT, this.loadLib(ML2Lib.MODEL_UFO_META)));
  }
  
  public ResourceSet loadUFOLib(final ResourceSet rs) {
    ResourceSet _xblockexpression = null;
    {
      this.loadLib(ML2Lib.MODEL_UFO_BASE, rs);
      this.loadLib(ML2Lib.MODEL_UFO_ENDURANT, rs);
      _xblockexpression = this.loadLib(ML2Lib.MODEL_UFO_META, rs);
    }
    return _xblockexpression;
  }
  
  public ML2Class getLibClass(final EObject context, final String name) {
    EObject _modelElementFromIndex = this._mL2Index.getModelElementFromIndex(context, name, MetaPackage.eINSTANCE.getML2Class());
    return ((ML2Class) _modelElementFromIndex);
  }
  
  public ML2Class getUFOEndurant(final EObject context) {
    EObject _modelElementFromIndex = this._mL2Index.getModelElementFromIndex(context, ML2Lib.UFO_ENDURANT, MetaPackage.eINSTANCE.getML2Class());
    return ((ML2Class) _modelElementFromIndex);
  }
  
  public Set<ML2Class> getUFOMustInstantiateClasses(final EObject context) {
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      final String fqn = it.getQualifiedName().toString();
      return Boolean.valueOf((((((((fqn.equals(ML2Lib.UFO_KIND) || fqn.equals(ML2Lib.UFO_SUBKIND)) || fqn.equals(ML2Lib.UFO_PHASE)) || 
        fqn.equals(ML2Lib.UFO_ROLE)) || fqn.equals(ML2Lib.UFO_CATEGORY)) || fqn.equals(ML2Lib.UFO_MIXIN)) || 
        fqn.equals(ML2Lib.UFO_PHASE_MIXIN)) || fqn.equals(ML2Lib.UFO_ROLE_MIXIN)));
    };
    final Iterable<IEObjectDescription> descs = IterableExtensions.<IEObjectDescription>filter(this._mL2Index.getVisibleEObjectDescriptions(context), _function);
    final Function1<IEObjectDescription, ML2Class> _function_1 = (IEObjectDescription it) -> {
      EObject o = it.getEObjectOrProxy();
      boolean _eIsProxy = o.eIsProxy();
      if (_eIsProxy) {
        o = context.eResource().getResourceSet().getEObject(it.getEObjectURI(), true);
      }
      return ((ML2Class) o);
    };
    final Iterable<ML2Class> objs = IterableExtensions.<IEObjectDescription, ML2Class>map(descs, _function_1);
    return IterableExtensions.<ML2Class>toSet(objs);
  }
}
