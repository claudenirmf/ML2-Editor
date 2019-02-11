/**
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getIndividualAssignments <em>Individual Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getUnnamedIndividualAssignments <em>Unnamed Individual Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getLiteralAssignments <em>Literal Assignments</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAttributeAssignment()
 * @model
 * @generated
 */
public interface AttributeAssignment extends FeatureAssignment {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAttributeAssignment_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Individual Assignments</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Assignments</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAttributeAssignment_IndividualAssignments()
	 * @model
	 * @generated
	 */
	EList<Individual> getIndividualAssignments();

	/**
	 * Returns the value of the '<em><b>Unnamed Individual Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unnamed Individual Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unnamed Individual Assignments</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAttributeAssignment_UnnamedIndividualAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getUnnamedIndividualAssignments();

	/**
	 * Returns the value of the '<em><b>Literal Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Assignments</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getAttributeAssignment_LiteralAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Literal> getLiteralAssignments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean hasIndividualAssignments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean hasLiteralAssignments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<Individual> getAllIndividualAssignments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<Object> getAllAssignments();

} // AttributeAssignment
