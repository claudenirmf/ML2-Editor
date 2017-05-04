/**
 */
package br.ufes.inf.nemo.ml2.meta.impl;

import br.ufes.inf.nemo.ml2.meta.Attribute;
import br.ufes.inf.nemo.ml2.meta.AttributeAssignment;
import br.ufes.inf.nemo.ml2.meta.Individual;
import br.ufes.inf.nemo.ml2.meta.Literal;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;

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
 * An implementation of the model object '<em><b>Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.AttributeAssignmentImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.AttributeAssignmentImpl#getEntityAssignments <em>Entity Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.AttributeAssignmentImpl#getUnnamedIndividualAssignments <em>Unnamed Individual Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.impl.AttributeAssignmentImpl#getLiteralAssignments <em>Literal Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeAssignmentImpl extends FeatureAssignmentImpl implements AttributeAssignment {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The cached value of the '{@link #getEntityAssignments() <em>Entity Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> entityAssignments;

	/**
	 * The cached value of the '{@link #getUnnamedIndividualAssignments() <em>Unnamed Individual Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnnamedIndividualAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> unnamedIndividualAssignments;

	/**
	 * The cached value of the '{@link #getLiteralAssignments() <em>Literal Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> literalAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.ATTRIBUTE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getEntityAssignments() {
		if (entityAssignments == null) {
			entityAssignments = new EObjectResolvingEList<Individual>(Individual.class, this, MetaPackage.ATTRIBUTE_ASSIGNMENT__ENTITY_ASSIGNMENTS);
		}
		return entityAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getUnnamedIndividualAssignments() {
		if (unnamedIndividualAssignments == null) {
			unnamedIndividualAssignments = new EObjectContainmentEList<Individual>(Individual.class, this, MetaPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS);
		}
		return unnamedIndividualAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getLiteralAssignments() {
		if (literalAssignments == null) {
			literalAssignments = new EObjectContainmentEList<Literal>(Literal.class, this, MetaPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS);
		}
		return literalAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				return ((InternalEList<?>)getUnnamedIndividualAssignments()).basicRemove(otherEnd, msgs);
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
				return ((InternalEList<?>)getLiteralAssignments()).basicRemove(otherEnd, msgs);
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
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ENTITY_ASSIGNMENTS:
				return getEntityAssignments();
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				return getUnnamedIndividualAssignments();
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
				return getLiteralAssignments();
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
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ENTITY_ASSIGNMENTS:
				getEntityAssignments().clear();
				getEntityAssignments().addAll((Collection<? extends Individual>)newValue);
				return;
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				getUnnamedIndividualAssignments().clear();
				getUnnamedIndividualAssignments().addAll((Collection<? extends Individual>)newValue);
				return;
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
				getLiteralAssignments().clear();
				getLiteralAssignments().addAll((Collection<? extends Literal>)newValue);
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
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ENTITY_ASSIGNMENTS:
				getEntityAssignments().clear();
				return;
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				getUnnamedIndividualAssignments().clear();
				return;
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
				getLiteralAssignments().clear();
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
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				return attribute != null;
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__ENTITY_ASSIGNMENTS:
				return entityAssignments != null && !entityAssignments.isEmpty();
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				return unnamedIndividualAssignments != null && !unnamedIndividualAssignments.isEmpty();
			case MetaPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
				return literalAssignments != null && !literalAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeAssignmentImpl
