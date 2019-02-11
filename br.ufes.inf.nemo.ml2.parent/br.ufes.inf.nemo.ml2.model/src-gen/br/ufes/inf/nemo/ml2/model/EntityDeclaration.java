/**
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#getInstantiatedClasses <em>Instantiated Classes</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getEntityDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface EntityDeclaration extends ModelElement {
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
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getEntityDeclaration_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instantiated Classes</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.ML2Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Classes</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getEntityDeclaration_InstantiatedClasses()
	 * @model
	 * @generated
	 */
	EList<ML2Class> getInstantiatedClasses();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.FeatureAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getEntityDeclaration_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureAssignment> getAssignments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	boolean isUnnamed();

} // EntityDeclaration
