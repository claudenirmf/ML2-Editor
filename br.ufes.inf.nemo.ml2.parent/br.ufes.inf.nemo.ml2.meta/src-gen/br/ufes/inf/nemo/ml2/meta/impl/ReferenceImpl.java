/**
 */
package br.ufes.inf.nemo.ml2.meta.impl;

import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.meta.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.ReferenceImpl#get_type <em>type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.ReferenceImpl#getSubsetOf <em>Subset Of</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.ReferenceImpl#getOppositeTo <em>Opposite To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends FeatureImpl implements Reference {
	/**
	 * The cached value of the '{@link #get_type() <em>type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_type()
	 * @generated
	 * @ordered
	 */
	protected ML2Class _type;

	/**
	 * The cached value of the '{@link #getSubsetOf() <em>Subset Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subsetOf;

	/**
	 * The cached value of the '{@link #getOppositeTo() <em>Opposite To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeTo()
	 * @generated
	 * @ordered
	 */
	protected Reference oppositeTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2Class get_type() {
		if (_type != null && _type.eIsProxy()) {
			InternalEObject old_type = (InternalEObject)_type;
			_type = (ML2Class)eResolveProxy(old_type);
			if (_type != old_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaPackage.REFERENCE__TYPE, old_type, _type));
			}
		}
		return _type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2Class basicGet_type() {
		return _type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_type(ML2Class new_type) {
		ML2Class old_type = _type;
		_type = new_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.REFERENCE__TYPE, old_type, _type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubsetOf() {
		if (subsetOf == null) {
			subsetOf = new EObjectResolvingEList<Reference>(Reference.class, this, MetaPackage.REFERENCE__SUBSET_OF);
		}
		return subsetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOppositeTo() {
		if (oppositeTo != null && oppositeTo.eIsProxy()) {
			InternalEObject oldOppositeTo = (InternalEObject)oppositeTo;
			oppositeTo = (Reference)eResolveProxy(oldOppositeTo);
			if (oppositeTo != oldOppositeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaPackage.REFERENCE__OPPOSITE_TO, oldOppositeTo, oppositeTo));
			}
		}
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetOppositeTo() {
		return oppositeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeTo(Reference newOppositeTo) {
		Reference oldOppositeTo = oppositeTo;
		oppositeTo = newOppositeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.REFERENCE__OPPOSITE_TO, oldOppositeTo, oppositeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.REFERENCE__TYPE:
				if (resolve) return get_type();
				return basicGet_type();
			case MetaPackage.REFERENCE__SUBSET_OF:
				return getSubsetOf();
			case MetaPackage.REFERENCE__OPPOSITE_TO:
				if (resolve) return getOppositeTo();
				return basicGetOppositeTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaPackage.REFERENCE__TYPE:
				set_type((ML2Class)newValue);
				return;
			case MetaPackage.REFERENCE__SUBSET_OF:
				getSubsetOf().clear();
				getSubsetOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case MetaPackage.REFERENCE__OPPOSITE_TO:
				setOppositeTo((Reference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetaPackage.REFERENCE__TYPE:
				set_type((ML2Class)null);
				return;
			case MetaPackage.REFERENCE__SUBSET_OF:
				getSubsetOf().clear();
				return;
			case MetaPackage.REFERENCE__OPPOSITE_TO:
				setOppositeTo((Reference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetaPackage.REFERENCE__TYPE:
				return _type != null;
			case MetaPackage.REFERENCE__SUBSET_OF:
				return subsetOf != null && !subsetOf.isEmpty();
			case MetaPackage.REFERENCE__OPPOSITE_TO:
				return oppositeTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
