/**
 */
package br.ufes.inf.nemo.ml2.meta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Attribute#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Attribute#get_type <em>type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.Attribute#getSubsetOf <em>Subset Of</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.ml2.meta.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ml2.meta.PrimitiveType
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttribute_PrimitiveType()
	 * @model unique="false"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.Attribute#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see br.ufes.inf.nemo.ml2.meta.PrimitiveType
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>type</em>' reference.
	 * @see #set_type(DataType)
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttribute__type()
	 * @model
	 * @generated
	 */
	DataType get_type();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.Attribute#get_type <em>type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>type</em>' reference.
	 * @see #get_type()
	 * @generated
	 */
	void set_type(DataType value);

	/**
	 * Returns the value of the '<em><b>Subset Of</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.meta.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Of</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttribute_SubsetOf()
	 * @model
	 * @generated
	 */
	EList<Attribute> getSubsetOf();

} // Attribute
