/**
 * generated by Xtext 2.20.0
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
public interface ModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelFactory eINSTANCE = br.ufes.inf.nemo.ml2.model.impl.ModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  ModelElement createModelElement();

  /**
   * Returns a new object of class '<em>Entity Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Declaration</em>'.
   * @generated
   */
  EntityDeclaration createEntityDeclaration();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>First Order Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>First Order Class</em>'.
   * @generated
   */
  FirstOrderClass createFirstOrderClass();

  /**
   * Returns a new object of class '<em>Higher Order Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Higher Order Class</em>'.
   * @generated
   */
  HigherOrderClass createHigherOrderClass();

  /**
   * Returns a new object of class '<em>Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Individual</em>'.
   * @generated
   */
  Individual createIndividual();

  /**
   * Returns a new object of class '<em>Ordered Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered Class</em>'.
   * @generated
   */
  OrderedClass createOrderedClass();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>High Order Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>High Order Class</em>'.
   * @generated
   */
  HighOrderClass createHighOrderClass();

  /**
   * Returns a new object of class '<em>Orderless Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orderless Class</em>'.
   * @generated
   */
  OrderlessClass createOrderlessClass();

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
   * Returns a new object of class '<em>Regularity Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regularity Attribute</em>'.
   * @generated
   */
  RegularityAttribute createRegularityAttribute();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Regularity Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regularity Reference</em>'.
   * @generated
   */
  RegularityReference createRegularityReference();

  /**
   * Returns a new object of class '<em>Regularity Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regularity Feature</em>'.
   * @generated
   */
  RegularityFeature createRegularityFeature();

  /**
   * Returns a new object of class '<em>Feature Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Assignment</em>'.
   * @generated
   */
  FeatureAssignment createFeatureAssignment();

  /**
   * Returns a new object of class '<em>Reference Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Assignment</em>'.
   * @generated
   */
  ReferenceAssignment createReferenceAssignment();

  /**
   * Returns a new object of class '<em>Attribute Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Assignment</em>'.
   * @generated
   */
  AttributeAssignment createAttributeAssignment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModelPackage getModelPackage();

} //ModelFactory
