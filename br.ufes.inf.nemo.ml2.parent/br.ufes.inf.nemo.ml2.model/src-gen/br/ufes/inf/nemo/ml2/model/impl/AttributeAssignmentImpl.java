/**
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.AttributeAssignment;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.Literal;
import br.ufes.inf.nemo.ml2.model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
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
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl#getIndividualAssignments <em>Individual Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl#getUnnamedIndividualAssignments <em>Unnamed Individual Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl#getLiteralAssignments <em>Literal Assignments</em>}</li>
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
	 * The cached value of the '{@link #getIndividualAssignments() <em>Individual Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> individualAssignments;

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
		return ModelPackage.Literals.ATTRIBUTE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
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
	@Override
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Individual> getIndividualAssignments() {
		if (individualAssignments == null) {
			individualAssignments = new EObjectResolvingEList<Individual>(Individual.class, this, ModelPackage.ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS);
		}
		return individualAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Individual> getUnnamedIndividualAssignments() {
		if (unnamedIndividualAssignments == null) {
			unnamedIndividualAssignments = new EObjectContainmentEList<Individual>(Individual.class, this, ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS);
		}
		return unnamedIndividualAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Literal> getLiteralAssignments() {
		if (literalAssignments == null) {
			literalAssignments = new EObjectContainmentEList<Literal>(Literal.class, this, ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS);
		}
		return literalAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasIndividualAssignments() {
		return ((!this.getIndividualAssignments().isEmpty()) || (!this.getUnnamedIndividualAssignments().isEmpty()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasLiteralAssignments() {
		boolean _isEmpty = this.getLiteralAssignments().isEmpty();
		return (!_isEmpty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Individual> getAllIndividualAssignments() {
		final BasicEList<Individual> l = new BasicEList<Individual>();
		l.addAll(this.getIndividualAssignments());
		l.addAll(this.getUnnamedIndividualAssignments());
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAllAssignments() {
		final BasicEList<Object> l = new BasicEList<Object>();
		l.addAll(this.getIndividualAssignments());
		l.addAll(this.getUnnamedIndividualAssignments());
		l.addAll(this.getLiteralAssignments());
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				return ((InternalEList<?>)getUnnamedIndividualAssignments()).basicRemove(otherEnd, msgs);
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
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
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS:
				return getIndividualAssignments();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				return getUnnamedIndividualAssignments();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
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
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS:
				getIndividualAssignments().clear();
				getIndividualAssignments().addAll((Collection<? extends Individual>)newValue);
				return;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				getUnnamedIndividualAssignments().clear();
				getUnnamedIndividualAssignments().addAll((Collection<? extends Individual>)newValue);
				return;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
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
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS:
				getIndividualAssignments().clear();
				return;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				getUnnamedIndividualAssignments().clear();
				return;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
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
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
				return attribute != null;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS:
				return individualAssignments != null && !individualAssignments.isEmpty();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS:
				return unnamedIndividualAssignments != null && !unnamedIndividualAssignments.isEmpty();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS:
				return literalAssignments != null && !literalAssignments.isEmpty();
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
			case ModelPackage.ATTRIBUTE_ASSIGNMENT___HAS_INDIVIDUAL_ASSIGNMENTS:
				return hasIndividualAssignments();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT___HAS_LITERAL_ASSIGNMENTS:
				return hasLiteralAssignments();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT___GET_ALL_INDIVIDUAL_ASSIGNMENTS:
				return getAllIndividualAssignments();
			case ModelPackage.ATTRIBUTE_ASSIGNMENT___GET_ALL_ASSIGNMENTS:
				return getAllAssignments();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeAssignmentImpl
