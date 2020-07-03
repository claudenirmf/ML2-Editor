/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.TermExpression;
import br.ufes.inf.nemo.ml2.model.TypeLiteralExpression;
import br.ufes.inf.nemo.ml2.model.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.VariableDeclarationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.VariableDeclarationImpl#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.VariableDeclarationImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration
{
  /**
   * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableName()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableName()
   * @generated
   * @ordered
   */
  protected String variableName = VARIABLE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableType()
   * @generated
   * @ordered
   */
  protected TypeLiteralExpression variableType;

  /**
   * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected TermExpression initialValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return ModelPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariableName()
  {
    return variableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariableName(String newVariableName)
  {
    String oldVariableName = variableName;
    variableName = newVariableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE_DECLARATION__VARIABLE_NAME, oldVariableName, variableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeLiteralExpression getVariableType()
  {
    return variableType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableType(TypeLiteralExpression newVariableType, NotificationChain msgs)
  {
    TypeLiteralExpression oldVariableType = variableType;
    variableType = newVariableType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE, oldVariableType, newVariableType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariableType(TypeLiteralExpression newVariableType)
  {
    if (newVariableType != variableType)
    {
      NotificationChain msgs = null;
      if (variableType != null)
        msgs = ((InternalEObject)variableType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE, null, msgs);
      if (newVariableType != null)
        msgs = ((InternalEObject)newVariableType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE, null, msgs);
      msgs = basicSetVariableType(newVariableType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE, newVariableType, newVariableType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TermExpression getInitialValue()
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialValue(TermExpression newInitialValue, NotificationChain msgs)
  {
    TermExpression oldInitialValue = initialValue;
    initialValue = newInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE, oldInitialValue, newInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitialValue(TermExpression newInitialValue)
  {
    if (newInitialValue != initialValue)
    {
      NotificationChain msgs = null;
      if (initialValue != null)
        msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE, null, msgs);
      if (newInitialValue != null)
        msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE, null, msgs);
      msgs = basicSetInitialValue(newInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE, newInitialValue, newInitialValue));
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
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
        return basicSetVariableType(null, msgs);
      case ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE:
        return basicSetInitialValue(null, msgs);
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
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        return getVariableName();
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
        return getVariableType();
      case ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE:
        return getInitialValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        setVariableName((String)newValue);
        return;
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
        setVariableType((TypeLiteralExpression)newValue);
        return;
      case ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE:
        setInitialValue((TermExpression)newValue);
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
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        setVariableName(VARIABLE_NAME_EDEFAULT);
        return;
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
        setVariableType((TypeLiteralExpression)null);
        return;
      case ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE:
        setInitialValue((TermExpression)null);
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
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_NAME:
        return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
      case ModelPackage.VARIABLE_DECLARATION__VARIABLE_TYPE:
        return variableType != null;
      case ModelPackage.VARIABLE_DECLARATION__INITIAL_VALUE:
        return initialValue != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (variableName: ");
    result.append(variableName);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationImpl
