/**
 * generated by Xtext 2.21.0
 */
package br.ufes.inf.nemo.ml2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regularity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.RegularityAttribute#getRegulates <em>Regulates</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getRegularityAttribute()
 * @model
 * @generated
 */
public interface RegularityAttribute extends Attribute, RegularityFeature
{
  /**
   * Returns the value of the '<em><b>Regulates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regulates</em>' reference.
   * @see #setRegulates(Attribute)
   * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getRegularityAttribute_Regulates()
   * @model
   * @generated
   */
  Attribute getRegulates();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.RegularityAttribute#getRegulates <em>Regulates</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regulates</em>' reference.
   * @see #getRegulates()
   * @generated
   */
  void setRegulates(Attribute value);

} // RegularityAttribute