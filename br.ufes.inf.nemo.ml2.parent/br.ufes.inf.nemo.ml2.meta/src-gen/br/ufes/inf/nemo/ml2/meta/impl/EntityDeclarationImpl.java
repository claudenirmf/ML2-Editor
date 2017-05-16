/**
 */
package br.ufes.inf.nemo.ml2.meta.impl;

import br.ufes.inf.nemo.ml2.meta.EntityDeclaration;
import br.ufes.inf.nemo.ml2.meta.FeatureAssignment;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.EntityDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.EntityDeclarationImpl#getInstantiatedClasses <em>Instantiated Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.EntityDeclarationImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityDeclarationImpl extends ModelElementImpl implements EntityDeclaration {
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
	 * The cached value of the '{@link #getInstantiatedClasses() <em>Instantiated Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ML2Class> instantiatedClasses;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureAssignment> assignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.ENTITY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.ENTITY_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ML2Class> getInstantiatedClasses() {
		if (instantiatedClasses == null) {
			instantiatedClasses = new EObjectResolvingEList<ML2Class>(ML2Class.class, this, MetaPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES);
		}
		return instantiatedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureAssignment> getAssignments() {
		if (assignments == null) {
			assignments = new EObjectContainmentEList<FeatureAssignment>(FeatureAssignment.class, this, MetaPackage.ENTITY_DECLARATION__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnnamed() {
		return ((this.getName() == null) || Objects.equal(this.getName(), ""));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.ENTITY_DECLARATION__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.ENTITY_DECLARATION__NAME:
				return getName();
			case MetaPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				return getInstantiatedClasses();
			case MetaPackage.ENTITY_DECLARATION__ASSIGNMENTS:
				return getAssignments();
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
			case MetaPackage.ENTITY_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case MetaPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				getInstantiatedClasses().clear();
				getInstantiatedClasses().addAll((Collection<? extends ML2Class>)newValue);
				return;
			case MetaPackage.ENTITY_DECLARATION__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends FeatureAssignment>)newValue);
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
			case MetaPackage.ENTITY_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetaPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				getInstantiatedClasses().clear();
				return;
			case MetaPackage.ENTITY_DECLARATION__ASSIGNMENTS:
				getAssignments().clear();
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
			case MetaPackage.ENTITY_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetaPackage.ENTITY_DECLARATION__INSTANTIATED_CLASSES:
				return instantiatedClasses != null && !instantiatedClasses.isEmpty();
			case MetaPackage.ENTITY_DECLARATION__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
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
			case MetaPackage.ENTITY_DECLARATION___IS_UNNAMED:
				return isUnnamed();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntityDeclarationImpl
