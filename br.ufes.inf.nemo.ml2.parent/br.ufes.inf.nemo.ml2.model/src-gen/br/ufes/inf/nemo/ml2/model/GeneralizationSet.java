/**
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getGeneral <em>General</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getCategorizer <em>Categorizer</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getSpecifics <em>Specifics</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"anonymous"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getGeneralizationSet_Name()
	 * @model default="anonymous" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getGeneralizationSet_IsDisjoint()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsDisjoint();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Complete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Complete</em>' attribute.
	 * @see #setIsComplete(boolean)
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getGeneralizationSet_IsComplete()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsComplete();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete</em>' attribute.
	 * @see #isIsComplete()
	 * @generated
	 */
	void setIsComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(ML2Class)
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getGeneralizationSet_General()
	 * @model
	 * @generated
	 */
	ML2Class getGeneral();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(ML2Class value);

	/**
	 * Returns the value of the '<em><b>Categorizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorizer</em>' reference.
	 * @see #setCategorizer(ML2Class)
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getGeneralizationSet_Categorizer()
	 * @model
	 * @generated
	 */
	ML2Class getCategorizer();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getCategorizer <em>Categorizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorizer</em>' reference.
	 * @see #getCategorizer()
	 * @generated
	 */
	void setCategorizer(ML2Class value);

	/**
	 * Returns the value of the '<em><b>Specifics</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.ml2.model.ML2Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifics</em>' reference list.
	 * @see br.ufes.inf.nemo.ml2.model.ModelPackage#getGeneralizationSet_Specifics()
	 * @model
	 * @generated
	 */
	EList<ML2Class> getSpecifics();

} // GeneralizationSet
