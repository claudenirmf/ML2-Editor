/**
 * generated by Xtext 2.20.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.AttributeAssignment;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl#getLiteralValues <em>Literal Values</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl#getDatatypeValues <em>Datatype Values</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl#getUnnamedValues <em>Unnamed Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeAssignmentImpl extends FeatureAssignmentImpl implements AttributeAssignment
{
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
   * The cached value of the '{@link #getLiteralValues() <em>Literal Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralValues()
   * @generated
   * @ordered
   */
  protected EList<EObject> literalValues;

  /**
   * The cached value of the '{@link #getDatatypeValues() <em>Datatype Values</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypeValues()
   * @generated
   * @ordered
   */
  protected EList<Individual> datatypeValues;

  /**
   * The cached value of the '{@link #getUnnamedValues() <em>Unnamed Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnnamedValues()
   * @generated
   * @ordered
   */
  protected EList<Individual> unnamedValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeAssignmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.ATTRIBUTE_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (Attribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
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
  public Attribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttribute(Attribute newAttribute)
  {
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
  public EList<EObject> getLiteralValues()
  {
    if (literalValues == null)
    {
      literalValues = new EObjectContainmentEList<EObject>(EObject.class, this, ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_VALUES);
    }
    return literalValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Individual> getDatatypeValues()
  {
    if (datatypeValues == null)
    {
      datatypeValues = new EObjectResolvingEList<Individual>(Individual.class, this, ModelPackage.ATTRIBUTE_ASSIGNMENT__DATATYPE_VALUES);
    }
    return datatypeValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Individual> getUnnamedValues()
  {
    if (unnamedValues == null)
    {
      unnamedValues = new EObjectContainmentEList<Individual>(Individual.class, this, ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_VALUES);
    }
    return unnamedValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_VALUES:
        return ((InternalEList<?>)getLiteralValues()).basicRemove(otherEnd, msgs);
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_VALUES:
        return ((InternalEList<?>)getUnnamedValues()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_VALUES:
        return getLiteralValues();
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__DATATYPE_VALUES:
        return getDatatypeValues();
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_VALUES:
        return getUnnamedValues();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_VALUES:
        getLiteralValues().clear();
        getLiteralValues().addAll((Collection<? extends EObject>)newValue);
        return;
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__DATATYPE_VALUES:
        getDatatypeValues().clear();
        getDatatypeValues().addAll((Collection<? extends Individual>)newValue);
        return;
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_VALUES:
        getUnnamedValues().clear();
        getUnnamedValues().addAll((Collection<? extends Individual>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_VALUES:
        getLiteralValues().clear();
        return;
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__DATATYPE_VALUES:
        getDatatypeValues().clear();
        return;
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_VALUES:
        getUnnamedValues().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE:
        return attribute != null;
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__LITERAL_VALUES:
        return literalValues != null && !literalValues.isEmpty();
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__DATATYPE_VALUES:
        return datatypeValues != null && !datatypeValues.isEmpty();
      case ModelPackage.ATTRIBUTE_ASSIGNMENT__UNNAMED_VALUES:
        return unnamedValues != null && !unnamedValues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AttributeAssignmentImpl
