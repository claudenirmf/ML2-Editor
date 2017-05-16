package br.ufes.inf.nemo.ml2.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ML2Index {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  public List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      final IResourceDescription rd = index.getResourceDescription(o.eResource().getURI());
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer it) -> {
      return it.getExportedObjects();
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer it) -> {
      return it.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }
  
  public EObject getModelElementFromIndex(final EObject context, final String qualifiedName, final EClass modelElementClass) {
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      String _string = it.getQualifiedName().toString();
      return Boolean.valueOf(Objects.equal(_string, qualifiedName));
    };
    final IEObjectDescription desc = IterableExtensions.<IEObjectDescription>findFirst(this.getVisibleEObjectDescriptions(context, modelElementClass), _function);
    boolean _equals = Objects.equal(desc, null);
    if (_equals) {
      return null;
    }
    EObject o = desc.getEObjectOrProxy();
    boolean _eIsProxy = o.eIsProxy();
    if (_eIsProxy) {
      o = context.eResource().getResourceSet().getEObject(desc.getEObjectURI(), true);
    }
    return o;
  }
}
