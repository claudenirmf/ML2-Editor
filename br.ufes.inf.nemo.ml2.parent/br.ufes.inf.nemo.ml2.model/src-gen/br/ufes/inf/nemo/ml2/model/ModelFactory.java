/**
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = br.ufes.inf.nemo.ml2.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ML2 Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML2 Model</em>'.
	 * @generated
	 */
	ML2Model createML2Model();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual</em>'.
	 * @generated
	 */
	Individual createIndividual();

	/**
	 * Returns a new object of class '<em>Orderless Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orderless Class</em>'.
	 * @generated
	 */
	OrderlessClass createOrderlessClass();

	/**
	 * Returns a new object of class '<em>HO Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HO Class</em>'.
	 * @generated
	 */
	HOClass createHOClass();

	/**
	 * Returns a new object of class '<em>FO Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FO Class</em>'.
	 * @generated
	 */
	FOClass createFOClass();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Set</em>'.
	 * @generated
	 */
	GeneralizationSet createGeneralizationSet();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Feature Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Assignment</em>'.
	 * @generated
	 */
	FeatureAssignment createFeatureAssignment();

	/**
	 * Returns a new object of class '<em>Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Assignment</em>'.
	 * @generated
	 */
	AttributeAssignment createAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Reference Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Assignment</em>'.
	 * @generated
	 */
	ReferenceAssignment createReferenceAssignment();

	/**
	 * Returns a new object of class '<em>ML2 String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML2 String</em>'.
	 * @generated
	 */
	ML2String createML2String();

	/**
	 * Returns a new object of class '<em>ML2 Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML2 Number</em>'.
	 * @generated
	 */
	ML2Number createML2Number();

	/**
	 * Returns a new object of class '<em>ML2 Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML2 Boolean</em>'.
	 * @generated
	 */
	ML2Boolean createML2Boolean();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
