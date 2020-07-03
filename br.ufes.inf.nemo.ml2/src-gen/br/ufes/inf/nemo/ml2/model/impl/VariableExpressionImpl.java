/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model.impl;

import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.VariableExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.impl.VariableExpressionImpl#getReferringVariable <em>Referring Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableExpressionImpl extends DotOperationImpl implements VariableExpression
{
  /**
   * The default value of the '{@link #getReferringVariable() <em>Referring Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferringVariable()
   * @generated
   * @ordered
   */
  protected static final String REFERRING_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferringVariable() <em>Referring Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferringVariable()
   * @generated
   * @ordered
   */
  protected String referringVariable = REFERRING_VARIABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableExpressionImpl()
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
    return ModelPackage.Literals.VARIABLE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReferringVariable()
  {
    return referringVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferringVariable(String newReferringVariable)
  {
    String oldReferringVariable = referringVariable;
    referringVariable = newReferringVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE_EXPRESSION__REFERRING_VARIABLE, oldReferringVariable, referringVariable));
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
      case ModelPackage.VARIABLE_EXPRESSION__REFERRING_VARIABLE:
        return getReferringVariable();
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
      case ModelPackage.VARIABLE_EXPRESSION__REFERRING_VARIABLE:
        setReferringVariable((String)newValue);
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
      case ModelPackage.VARIABLE_EXPRESSION__REFERRING_VARIABLE:
        setReferringVariable(REFERRING_VARIABLE_EDEFAULT);
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
      case ModelPackage.VARIABLE_EXPRESSION__REFERRING_VARIABLE:
        return REFERRING_VARIABLE_EDEFAULT == null ? referringVariable != null : !REFERRING_VARIABLE_EDEFAULT.equals(referringVariable);
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
    result.append(" (referringVariable: ");
    result.append(referringVariable);
    result.append(')');
    return result.toString();
  }

} //VariableExpressionImpl
