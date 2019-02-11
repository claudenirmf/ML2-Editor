/**
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.ReferenceAssignment#getReference <em>Reference</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.ReferenceAssignment#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReferenceAssignment()
 * @model
 * @generated
 */
public interface ReferenceAssignment extends FeatureAssignment {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Reference)
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReferenceAssignment_Reference()
	 * @model
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.ReferenceAssignment#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.EntityDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getReferenceAssignment_Assignments()
	 * @model
	 * @generated
	 */
	EList<EntityDeclaration> getAssignments();

} // ReferenceAssignment
