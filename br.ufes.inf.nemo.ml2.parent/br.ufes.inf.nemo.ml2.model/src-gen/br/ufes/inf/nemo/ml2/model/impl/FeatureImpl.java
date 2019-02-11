/**
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.FeatureImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.FeatureImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.FeatureImpl#getRegularityType <em>Regularity Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.FeatureImpl#getRegulatedFeature <em>Regulated Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends ModelElementImpl implements Feature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegularityType() <em>Regularity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularityType()
	 * @generated
	 * @ordered
	 */
	protected static final RegularityFeatureType REGULARITY_TYPE_EDEFAULT = RegularityFeatureType.DETERMINES_MAX_VALUE;

	/**
	 * The cached value of the '{@link #getRegularityType() <em>Regularity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularityType()
	 * @generated
	 * @ordered
	 */
	protected RegularityFeatureType regularityType = REGULARITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegulatedFeature() <em>Regulated Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature regulatedFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularityFeatureType getRegularityType() {
		return regularityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegularityType(RegularityFeatureType newRegularityType) {
		RegularityFeatureType oldRegularityType = regularityType;
		regularityType = newRegularityType == null ? REGULARITY_TYPE_EDEFAULT : newRegularityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__REGULARITY_TYPE, oldRegularityType, regularityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getRegulatedFeature() {
		if (regulatedFeature != null && regulatedFeature.eIsProxy()) {
			InternalEObject oldRegulatedFeature = (InternalEObject)regulatedFeature;
			regulatedFeature = (Feature)eResolveProxy(oldRegulatedFeature);
			if (regulatedFeature != oldRegulatedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FEATURE__REGULATED_FEATURE, oldRegulatedFeature, regulatedFeature));
			}
		}
		return regulatedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRegulatedFeature() {
		return regulatedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulatedFeature(Feature newRegulatedFeature) {
		Feature oldRegulatedFeature = regulatedFeature;
		regulatedFeature = newRegulatedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__REGULATED_FEATURE, oldRegulatedFeature, regulatedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FEATURE__NAME:
				return getName();
			case ModelPackage.FEATURE__LOWER_BOUND:
				return getLowerBound();
			case ModelPackage.FEATURE__UPPER_BOUND:
				return getUpperBound();
			case ModelPackage.FEATURE__REGULARITY_TYPE:
				return getRegularityType();
			case ModelPackage.FEATURE__REGULATED_FEATURE:
				if (resolve) return getRegulatedFeature();
				return basicGetRegulatedFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.FEATURE__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case ModelPackage.FEATURE__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case ModelPackage.FEATURE__REGULARITY_TYPE:
				setRegularityType((RegularityFeatureType)newValue);
				return;
			case ModelPackage.FEATURE__REGULATED_FEATURE:
				setRegulatedFeature((Feature)newValue);
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
			case ModelPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.FEATURE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case ModelPackage.FEATURE__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case ModelPackage.FEATURE__REGULARITY_TYPE:
				setRegularityType(REGULARITY_TYPE_EDEFAULT);
				return;
			case ModelPackage.FEATURE__REGULATED_FEATURE:
				setRegulatedFeature((Feature)null);
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
			case ModelPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.FEATURE__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case ModelPackage.FEATURE__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case ModelPackage.FEATURE__REGULARITY_TYPE:
				return regularityType != REGULARITY_TYPE_EDEFAULT;
			case ModelPackage.FEATURE__REGULATED_FEATURE:
				return regulatedFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", regularityType: ");
		result.append(regularityType);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
