package br.ufes.inf.nemo.ml2.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
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
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      final IResourceDescription rd = index.getResourceDescription(_uRI);
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o) {
    List<IContainer> _visibleContainers = this.getVisibleContainers(o);
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer it) -> {
      return it.getExportedObjects();
    };
    List<Iterable<IEObjectDescription>> _map = ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(_visibleContainers, _function);
    return Iterables.<IEObjectDescription>concat(_map);
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    List<IContainer> _visibleContainers = this.getVisibleContainers(o);
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer it) -> {
      return it.getExportedObjectsByType(type);
    };
    List<Iterable<IEObjectDescription>> _map = ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(_visibleContainers, _function);
    return Iterables.<IEObjectDescription>concat(_map);
  }
  
  public EObject getModelElementFromIndex(final EObject context, final String qualifiedName, final EClass modelElementClass) {
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this.getVisibleEObjectDescriptions(context, modelElementClass);
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      QualifiedName _qualifiedName = it.getQualifiedName();
      String _string = _qualifiedName.toString();
      return Boolean.valueOf(Objects.equal(_string, qualifiedName));
    };
    final IEObjectDescription desc = IterableExtensions.<IEObjectDescription>findFirst(_visibleEObjectDescriptions, _function);
    boolean _equals = Objects.equal(desc, null);
    if (_equals) {
      return null;
    }
    EObject o = desc.getEObjectOrProxy();
    boolean _eIsProxy = o.eIsProxy();
    if (_eIsProxy) {
      Resource _eResource = context.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      URI _eObjectURI = desc.getEObjectURI();
      EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
      o = _eObject;
    }
    return o;
  }
}
