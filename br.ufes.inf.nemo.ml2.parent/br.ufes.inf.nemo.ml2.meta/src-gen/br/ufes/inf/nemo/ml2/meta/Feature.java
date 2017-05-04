/**
 */
package br.ufes.inf.nemo.ml2.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Feature#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Feature#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Feature#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Feature#getRegularityType <em>Regularity Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Feature#getRegulatedFeature <em>Regulated Feature</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getFeature_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getFeature_LowerBound()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.Feature#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getFeature_UpperBound()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.Feature#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Regularity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.ml2.meta.RegularityFeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regularity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regularity Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ml2.meta.RegularityFeatureType
	 * @see #setRegularityType(RegularityFeatureType)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getFeature_RegularityType()
	 * @model unique="false"
	 * @generated
	 */
	RegularityFeatureType getRegularityType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.Feature#getRegularityType <em>Regularity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regularity Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ml2.meta.RegularityFeatureType
	 * @see #getRegularityType()
	 * @generated
	 */
	void setRegularityType(RegularityFeatureType value);

	/**
	 * Returns the value of the '<em><b>Regulated Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulated Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulated Feature</em>' reference.
	 * @see #setRegulatedFeature(Feature)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getFeature_RegulatedFeature()
	 * @model
	 * @generated
	 */
	Feature getRegulatedFeature();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.Feature#getRegulatedFeature <em>Regulated Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulated Feature</em>' reference.
	 * @see #getRegulatedFeature()
	 * @generated
	 */
	void setRegulatedFeature(Feature value);

} // Feature
