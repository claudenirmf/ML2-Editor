/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.DerivationConstraint#getFeatureContext <em>Feature Context</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.DerivationConstraint#getContextType <em>Context Type</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getDerivationConstraint()
 * @model
 * @generated
 */
public interface DerivationConstraint extends Constraint
{
  /**
   * Returns the value of the '<em><b>Feature Context</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Context</em>' attribute list.
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getDerivationConstraint_FeatureContext()
   * @model unique="false"
   * @generated
   */
  EList<String> getFeatureContext();

  /**
   * Returns the value of the '<em><b>Context Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Type</em>' containment reference.
   * @see #setContextType(TypeLiteralExpression)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getDerivationConstraint_ContextType()
   * @model containment="true"
   * @generated
   */
  TypeLiteralExpression getContextType();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.DerivationConstraint#getContextType <em>Context Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Type</em>' containment reference.
   * @see #getContextType()
   * @generated
   */
  void setContextType(TypeLiteralExpression value);

} // DerivationConstraint