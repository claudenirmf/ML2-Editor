/**
 */
package br.ufes.inf.nemo.ml2.meta;

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
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.AttributeAssignment#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.AttributeAssignment#getEntityAssignments <em>Entity Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.AttributeAssignment#getUnnamedIndividualAssignments <em>Unnamed Individual Assignments</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.meta.AttributeAssignment#getLiteralAssignments <em>Literal Assignments</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttributeAssignment()
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
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttributeAssignment_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.meta.AttributeAssignment#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Entity Assignments</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.meta.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Assignments</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttributeAssignment_EntityAssignments()
	 * @model
	 * @generated
	 */
	EList<Individual> getEntityAssignments();

	/**
	 * Returns the value of the '<em><b>Unnamed Individual Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.meta.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unnamed Individual Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unnamed Individual Assignments</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttributeAssignment_UnnamedIndividualAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getUnnamedIndividualAssignments();

	/**
	 * Returns the value of the '<em><b>Literal Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.meta.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Assignments</em>' containment reference list.
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#getAttributeAssignment_LiteralAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Literal> getLiteralAssignments();

} // AttributeAssignment
