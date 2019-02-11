/**
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.PrimitiveType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeImpl#get_type <em>type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeImpl#getSubsetOf <em>Subset Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends FeatureImpl implements Attribute {
	/**
	 * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType PRIMITIVE_TYPE_EDEFAULT = PrimitiveType.STRING;

	/**
	 * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType primitiveType = PRIMITIVE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #get_type() <em>type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_type()
	 * @generated
	 * @ordered
	 */
	protected DataType _type;

	/**
	 * The cached value of the '{@link #getSubsetOf() <em>Subset Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> subsetOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType getPrimitiveType() {
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitiveType(PrimitiveType newPrimitiveType) {
		PrimitiveType oldPrimitiveType = primitiveType;
		primitiveType = newPrimitiveType == null ? PRIMITIVE_TYPE_EDEFAULT : newPrimitiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType get_type() {
		if (_type != null && _type.eIsProxy()) {
			InternalEObject old_type = (InternalEObject)_type;
			_type = (DataType)eResolveProxy(old_type);
			if (_type != old_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ATTRIBUTE__TYPE, old_type, _type));
			}
		}
		return _type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGet_type() {
		return _type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set_type(DataType new_type) {
		DataType old_type = _type;
		_type = new_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE__TYPE, old_type, _type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getSubsetOf() {
		if (subsetOf == null) {
			subsetOf = new EObjectResolvingEList<Attribute>(Attribute.class, this, ModelPackage.ATTRIBUTE__SUBSET_OF);
		}
		return subsetOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimitive() {
		boolean _eIsSet = this.eIsSet(ModelPackage.eINSTANCE.getAttribute__type());
		return (!_eIsSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				return getPrimitiveType();
			case ModelPackage.ATTRIBUTE__TYPE:
				if (resolve) return get_type();
				return basicGet_type();
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				return getSubsetOf();
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
			case ModelPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)newValue);
				return;
			case ModelPackage.ATTRIBUTE__TYPE:
				set_type((DataType)newValue);
				return;
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				getSubsetOf().clear();
				getSubsetOf().addAll((Collection<? extends Attribute>)newValue);
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
			case ModelPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
				return;
			case ModelPackage.ATTRIBUTE__TYPE:
				set_type((DataType)null);
				return;
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				getSubsetOf().clear();
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
			case ModelPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				return primitiveType != PRIMITIVE_TYPE_EDEFAULT;
			case ModelPackage.ATTRIBUTE__TYPE:
				return _type != null;
			case ModelPackage.ATTRIBUTE__SUBSET_OF:
				return subsetOf != null && !subsetOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.ATTRIBUTE___IS_PRIMITIVE:
				return isPrimitive();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (primitiveType: ");
		result.append(primitiveType);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
