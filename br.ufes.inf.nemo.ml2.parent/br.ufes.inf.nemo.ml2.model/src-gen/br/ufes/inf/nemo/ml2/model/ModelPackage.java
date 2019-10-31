/**
 */
package br.ufes.inf.nemo.ml2.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ml2.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nemo.inf.ufes.br/ml2/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2ModelImpl <em>ML2 Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ML2ModelImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Model()
	 * @generated
	 */
	int ML2_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_MODEL__INCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_MODEL__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>ML2 Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ML2 Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ModelElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelElementImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ImportImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.EntityDeclarationImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getEntityDeclaration()
	 * @generated
	 */
	int ENTITY_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__INSTANTIATED_CLASSES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION__ASSIGNMENTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION___IS_UNNAMED = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DECLARATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.IndividualImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAME = ENTITY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__INSTANTIATED_CLASSES = ENTITY_DECLARATION__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ASSIGNMENTS = ENTITY_DECLARATION__ASSIGNMENTS;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = ENTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL___IS_UNNAMED = ENTITY_DECLARATION___IS_UNNAMED;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = ENTITY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl <em>ML2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Class()
	 * @generated
	 */
	int ML2_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__NAME = ENTITY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__INSTANTIATED_CLASSES = ENTITY_DECLARATION__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__ASSIGNMENTS = ENTITY_DECLARATION__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__SUPER_CLASSES = ENTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__SUBORDINATORS = ENTITY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__POWERTYPE_OF = ENTITY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Categorized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__CATEGORIZED_CLASS = ENTITY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__CATEGORIZATION_TYPE = ENTITY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS__FEATURES = ENTITY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ML2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS_FEATURE_COUNT = ENTITY_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS___IS_UNNAMED = ENTITY_DECLARATION___IS_UNNAMED;

	/**
	 * The operation id for the '<em>Get Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS___GET_ATTRIBUTES = ENTITY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS___GET_REFERENCES = ENTITY_DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>ML2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_CLASS_OPERATION_COUNT = ENTITY_DECLARATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.OrderlessClassImpl <em>Orderless Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.OrderlessClassImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getOrderlessClass()
	 * @generated
	 */
	int ORDERLESS_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__NAME = ML2_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__INSTANTIATED_CLASSES = ML2_CLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__ASSIGNMENTS = ML2_CLASS__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__SUPER_CLASSES = ML2_CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__SUBORDINATORS = ML2_CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__POWERTYPE_OF = ML2_CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Categorized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__CATEGORIZED_CLASS = ML2_CLASS__CATEGORIZED_CLASS;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__CATEGORIZATION_TYPE = ML2_CLASS__CATEGORIZATION_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS__FEATURES = ML2_CLASS__FEATURES;

	/**
	 * The number of structural features of the '<em>Orderless Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS_FEATURE_COUNT = ML2_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS___IS_UNNAMED = ML2_CLASS___IS_UNNAMED;

	/**
	 * The operation id for the '<em>Get Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS___GET_ATTRIBUTES = ML2_CLASS___GET_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS___GET_REFERENCES = ML2_CLASS___GET_REFERENCES;

	/**
	 * The number of operations of the '<em>Orderless Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERLESS_CLASS_OPERATION_COUNT = ML2_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.OrderedClassImpl <em>Ordered Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.OrderedClassImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getOrderedClass()
	 * @generated
	 */
	int ORDERED_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__NAME = ML2_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__INSTANTIATED_CLASSES = ML2_CLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__ASSIGNMENTS = ML2_CLASS__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__SUPER_CLASSES = ML2_CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__SUBORDINATORS = ML2_CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__POWERTYPE_OF = ML2_CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Categorized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__CATEGORIZED_CLASS = ML2_CLASS__CATEGORIZED_CLASS;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__CATEGORIZATION_TYPE = ML2_CLASS__CATEGORIZATION_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS__FEATURES = ML2_CLASS__FEATURES;

	/**
	 * The number of structural features of the '<em>Ordered Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS_FEATURE_COUNT = ML2_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS___IS_UNNAMED = ML2_CLASS___IS_UNNAMED;

	/**
	 * The operation id for the '<em>Get Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS___GET_ATTRIBUTES = ML2_CLASS___GET_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS___GET_REFERENCES = ML2_CLASS___GET_REFERENCES;

	/**
	 * The number of operations of the '<em>Ordered Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_CLASS_OPERATION_COUNT = ML2_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.HOClassImpl <em>HO Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.HOClassImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getHOClass()
	 * @generated
	 */
	int HO_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__NAME = ORDERED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__INSTANTIATED_CLASSES = ORDERED_CLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__ASSIGNMENTS = ORDERED_CLASS__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__SUPER_CLASSES = ORDERED_CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__SUBORDINATORS = ORDERED_CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__POWERTYPE_OF = ORDERED_CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Categorized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__CATEGORIZED_CLASS = ORDERED_CLASS__CATEGORIZED_CLASS;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__CATEGORIZATION_TYPE = ORDERED_CLASS__CATEGORIZATION_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__FEATURES = ORDERED_CLASS__FEATURES;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS__ORDER = ORDERED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS_FEATURE_COUNT = ORDERED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS___IS_UNNAMED = ORDERED_CLASS___IS_UNNAMED;

	/**
	 * The operation id for the '<em>Get Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS___GET_ATTRIBUTES = ORDERED_CLASS___GET_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS___GET_REFERENCES = ORDERED_CLASS___GET_REFERENCES;

	/**
	 * The number of operations of the '<em>HO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HO_CLASS_OPERATION_COUNT = ORDERED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.FOClassImpl <em>FO Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.FOClassImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getFOClass()
	 * @generated
	 */
	int FO_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__NAME = ORDERED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__INSTANTIATED_CLASSES = ORDERED_CLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__ASSIGNMENTS = ORDERED_CLASS__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__SUPER_CLASSES = ORDERED_CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__SUBORDINATORS = ORDERED_CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__POWERTYPE_OF = ORDERED_CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Categorized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__CATEGORIZED_CLASS = ORDERED_CLASS__CATEGORIZED_CLASS;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__CATEGORIZATION_TYPE = ORDERED_CLASS__CATEGORIZATION_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS__FEATURES = ORDERED_CLASS__FEATURES;

	/**
	 * The number of structural features of the '<em>FO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS_FEATURE_COUNT = ORDERED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS___IS_UNNAMED = ORDERED_CLASS___IS_UNNAMED;

	/**
	 * The operation id for the '<em>Get Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS___GET_ATTRIBUTES = ORDERED_CLASS___GET_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS___GET_REFERENCES = ORDERED_CLASS___GET_REFERENCES;

	/**
	 * The number of operations of the '<em>FO Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_CLASS_OPERATION_COUNT = ORDERED_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.DataTypeImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = FO_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INSTANTIATED_CLASSES = FO_CLASS__INSTANTIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ASSIGNMENTS = FO_CLASS__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUPER_CLASSES = FO_CLASS__SUPER_CLASSES;

	/**
	 * The feature id for the '<em><b>Subordinators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUBORDINATORS = FO_CLASS__SUBORDINATORS;

	/**
	 * The feature id for the '<em><b>Powertype Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__POWERTYPE_OF = FO_CLASS__POWERTYPE_OF;

	/**
	 * The feature id for the '<em><b>Categorized Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CATEGORIZED_CLASS = FO_CLASS__CATEGORIZED_CLASS;

	/**
	 * The feature id for the '<em><b>Categorization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CATEGORIZATION_TYPE = FO_CLASS__CATEGORIZATION_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FEATURES = FO_CLASS__FEATURES;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = FO_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Unnamed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_UNNAMED = FO_CLASS___IS_UNNAMED;

	/**
	 * The operation id for the '<em>Get Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_ATTRIBUTES = FO_CLASS___GET_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_REFERENCES = FO_CLASS___GET_REFERENCES;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = FO_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.GeneralizationSetImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_DISJOINT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_COMPLETE = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__GENERAL = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Categorizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__CATEGORIZER = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Specifics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__SPECIFICS = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.FeatureImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LOWER_BOUND = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UPPER_BOUND = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regularity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REGULARITY_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Regulated Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REGULATED_FEATURE = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.AttributeImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LOWER_BOUND = FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_BOUND = FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Regularity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REGULARITY_TYPE = FEATURE__REGULARITY_TYPE;

	/**
	 * The feature id for the '<em><b>Regulated Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REGULATED_FEATURE = FEATURE__REGULATED_FEATURE;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRIMITIVE_TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subset Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SUBSET_OF = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_PRIMITIVE = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ReferenceImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LOWER_BOUND = FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UPPER_BOUND = FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Regularity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REGULARITY_TYPE = FEATURE__REGULARITY_TYPE;

	/**
	 * The feature id for the '<em><b>Regulated Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REGULATED_FEATURE = FEATURE__REGULATED_FEATURE;

	/**
	 * The feature id for the '<em><b>type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subset Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SUBSET_OF = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opposite To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OPPOSITE_TO = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.FeatureAssignmentImpl <em>Feature Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.FeatureAssignmentImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getFeatureAssignment()
	 * @generated
	 */
	int FEATURE_ASSIGNMENT = 15;

	/**
	 * The number of structural features of the '<em>Feature Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ASSIGNMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ASSIGNMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getAttributeAssignment()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = FEATURE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Individual Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS = FEATURE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unnamed Individual Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS = FEATURE_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Literal Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS = FEATURE_ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = FEATURE_ASSIGNMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Individual Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT___HAS_INDIVIDUAL_ASSIGNMENTS = FEATURE_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Literal Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT___HAS_LITERAL_ASSIGNMENTS = FEATURE_ASSIGNMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Individual Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT___GET_ALL_INDIVIDUAL_ASSIGNMENTS = FEATURE_ASSIGNMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Assignments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT___GET_ALL_ASSIGNMENTS = FEATURE_ASSIGNMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_OPERATION_COUNT = FEATURE_ASSIGNMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ReferenceAssignmentImpl <em>Reference Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ReferenceAssignmentImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getReferenceAssignment()
	 * @generated
	 */
	int REFERENCE_ASSIGNMENT = 17;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__REFERENCE = FEATURE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT__ASSIGNMENTS = FEATURE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT_FEATURE_COUNT = FEATURE_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ASSIGNMENT_OPERATION_COUNT = FEATURE_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.LiteralImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 18;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2StringImpl <em>ML2 String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ML2StringImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2String()
	 * @generated
	 */
	int ML2_STRING = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_STRING__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ML2 String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_STRING_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_STRING___EQUALS__OBJECT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>ML2 String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_STRING_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2NumberImpl <em>ML2 Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ML2NumberImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Number()
	 * @generated
	 */
	int ML2_NUMBER = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_NUMBER__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ML2 Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_NUMBER_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_NUMBER___EQUALS__OBJECT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>ML2 Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_NUMBER_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2BooleanImpl <em>ML2 Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.impl.ML2BooleanImpl
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Boolean()
	 * @generated
	 */
	int ML2_BOOLEAN = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_BOOLEAN__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ML2 Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_BOOLEAN_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_BOOLEAN___EQUALS__OBJECT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>ML2 Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML2_BOOLEAN_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.CategorizationType <em>Categorization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.CategorizationType
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getCategorizationType()
	 * @generated
	 */
	int CATEGORIZATION_TYPE = 22;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.RegularityFeatureType <em>Regularity Feature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.RegularityFeatureType
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getRegularityFeatureType()
	 * @generated
	 */
	int REGULARITY_FEATURE_TYPE = 23;

	/**
	 * The meta object id for the '{@link br.ufes.inf.nemo.ml2.model.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.nemo.ml2.model.PrimitiveType
	 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.ML2Model <em>ML2 Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML2 Model</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Model
	 * @generated
	 */
	EClass getML2Model();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.ML2Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Model#getName()
	 * @see #getML2Model()
	 * @generated
	 */
	EAttribute getML2Model_Name();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.ML2Model#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Model#getIncludes()
	 * @see #getML2Model()
	 * @generated
	 */
	EReference getML2Model_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ml2.model.ML2Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Model#getElements()
	 * @see #getML2Model()
	 * @generated
	 */
	EReference getML2Model_Elements();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.ModelElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Declaration</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.EntityDeclaration
	 * @generated
	 */
	EClass getEntityDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.EntityDeclaration#getName()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EAttribute getEntityDeclaration_Name();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#getInstantiatedClasses <em>Instantiated Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiated Classes</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.EntityDeclaration#getInstantiatedClasses()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_InstantiatedClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.EntityDeclaration#getAssignments()
	 * @see #getEntityDeclaration()
	 * @generated
	 */
	EReference getEntityDeclaration_Assignments();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.EntityDeclaration#isUnnamed() <em>Is Unnamed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Unnamed</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.EntityDeclaration#isUnnamed()
	 * @generated
	 */
	EOperation getEntityDeclaration__IsUnnamed();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.ML2Class <em>ML2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML2 Class</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class
	 * @generated
	 */
	EClass getML2Class();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Classes</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getSuperClasses()
	 * @see #getML2Class()
	 * @generated
	 */
	EReference getML2Class_SuperClasses();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getSubordinators <em>Subordinators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subordinators</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getSubordinators()
	 * @see #getML2Class()
	 * @generated
	 */
	EReference getML2Class_Subordinators();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getPowertypeOf <em>Powertype Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powertype Of</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getPowertypeOf()
	 * @see #getML2Class()
	 * @generated
	 */
	EReference getML2Class_PowertypeOf();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getCategorizedClass <em>Categorized Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorized Class</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getCategorizedClass()
	 * @see #getML2Class()
	 * @generated
	 */
	EReference getML2Class_CategorizedClass();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getCategorizationType <em>Categorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorization Type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getCategorizationType()
	 * @see #getML2Class()
	 * @generated
	 */
	EAttribute getML2Class_CategorizationType();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getFeatures()
	 * @see #getML2Class()
	 * @generated
	 */
	EReference getML2Class_Features();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getAttributes() <em>Get Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attributes</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getAttributes()
	 * @generated
	 */
	EOperation getML2Class__GetAttributes();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.ML2Class#getReferences() <em>Get References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get References</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Class#getReferences()
	 * @generated
	 */
	EOperation getML2Class__GetReferences();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.OrderlessClass <em>Orderless Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orderless Class</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.OrderlessClass
	 * @generated
	 */
	EClass getOrderlessClass();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.OrderedClass <em>Ordered Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Class</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.OrderedClass
	 * @generated
	 */
	EClass getOrderedClass();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.HOClass <em>HO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HO Class</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.HOClass
	 * @generated
	 */
	EClass getHOClass();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.HOClass#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.HOClass#getOrder()
	 * @see #getHOClass()
	 * @generated
	 */
	EAttribute getHOClass_Order();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.FOClass <em>FO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FO Class</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.FOClass
	 * @generated
	 */
	EClass getFOClass();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.GeneralizationSet#getName()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsComplete <em>Is Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.GeneralizationSet#isIsComplete()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsComplete();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.GeneralizationSet#getGeneral()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_General();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getCategorizer <em>Categorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorizer</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.GeneralizationSet#getCategorizer()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Categorizer();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.GeneralizationSet#getSpecifics <em>Specifics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifics</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.GeneralizationSet#getSpecifics()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Specifics();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.Feature#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Feature#getLowerBound()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.Feature#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Feature#getUpperBound()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.Feature#getRegularityType <em>Regularity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regularity Type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Feature#getRegularityType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_RegularityType();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.Feature#getRegulatedFeature <em>Regulated Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulated Feature</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Feature#getRegulatedFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RegulatedFeature();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.Attribute#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Attribute#getPrimitiveType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_PrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.Attribute#get_type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Attribute#get_type()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute__type();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.Attribute#getSubsetOf <em>Subset Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subset Of</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Attribute#getSubsetOf()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_SubsetOf();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.Attribute#isPrimitive() <em>Is Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.Attribute#isPrimitive()
	 * @generated
	 */
	EOperation getAttribute__IsPrimitive();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.Reference#get_type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Reference#get_type()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference__type();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.Reference#getSubsetOf <em>Subset Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subset Of</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Reference#getSubsetOf()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_SubsetOf();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.Reference#getOppositeTo <em>Opposite To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite To</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Reference#getOppositeTo()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_OppositeTo();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.FeatureAssignment <em>Feature Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Assignment</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.FeatureAssignment
	 * @generated
	 */
	EClass getFeatureAssignment();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment
	 * @generated
	 */
	EClass getAttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAttribute()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getIndividualAssignments <em>Individual Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Individual Assignments</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#getIndividualAssignments()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_IndividualAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getUnnamedIndividualAssignments <em>Unnamed Individual Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unnamed Individual Assignments</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#getUnnamedIndividualAssignments()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_UnnamedIndividualAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getLiteralAssignments <em>Literal Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal Assignments</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#getLiteralAssignments()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_LiteralAssignments();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#hasIndividualAssignments() <em>Has Individual Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Individual Assignments</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#hasIndividualAssignments()
	 * @generated
	 */
	EOperation getAttributeAssignment__HasIndividualAssignments();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#hasLiteralAssignments() <em>Has Literal Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Literal Assignments</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#hasLiteralAssignments()
	 * @generated
	 */
	EOperation getAttributeAssignment__HasLiteralAssignments();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAllIndividualAssignments() <em>Get All Individual Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Individual Assignments</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAllIndividualAssignments()
	 * @generated
	 */
	EOperation getAttributeAssignment__GetAllIndividualAssignments();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAllAssignments() <em>Get All Assignments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Assignments</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.AttributeAssignment#getAllAssignments()
	 * @generated
	 */
	EOperation getAttributeAssignment__GetAllAssignments();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.ReferenceAssignment <em>Reference Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Assignment</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ReferenceAssignment
	 * @generated
	 */
	EClass getReferenceAssignment();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ml2.model.ReferenceAssignment#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ReferenceAssignment#getReference()
	 * @see #getReferenceAssignment()
	 * @generated
	 */
	EReference getReferenceAssignment_Reference();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ml2.model.ReferenceAssignment#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ReferenceAssignment#getAssignments()
	 * @see #getReferenceAssignment()
	 * @generated
	 */
	EReference getReferenceAssignment_Assignments();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.ML2String <em>ML2 String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML2 String</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2String
	 * @generated
	 */
	EClass getML2String();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.ML2String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2String#getValue()
	 * @see #getML2String()
	 * @generated
	 */
	EAttribute getML2String_Value();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.ML2String#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.ML2String#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getML2String__Equals__Object();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.ML2Number <em>ML2 Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML2 Number</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Number
	 * @generated
	 */
	EClass getML2Number();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.ML2Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Number#getValue()
	 * @see #getML2Number()
	 * @generated
	 */
	EAttribute getML2Number_Value();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.ML2Number#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Number#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getML2Number__Equals__Object();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.nemo.ml2.model.ML2Boolean <em>ML2 Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML2 Boolean</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Boolean
	 * @generated
	 */
	EClass getML2Boolean();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ml2.model.ML2Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Boolean#isValue()
	 * @see #getML2Boolean()
	 * @generated
	 */
	EAttribute getML2Boolean_Value();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.nemo.ml2.model.ML2Boolean#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see br.ufes.inf.nemo.ml2.model.ML2Boolean#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getML2Boolean__Equals__Object();

	/**
	 * Returns the meta object for enum '{@link br.ufes.inf.nemo.ml2.model.CategorizationType <em>Categorization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categorization Type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.CategorizationType
	 * @generated
	 */
	EEnum getCategorizationType();

	/**
	 * Returns the meta object for enum '{@link br.ufes.inf.nemo.ml2.model.RegularityFeatureType <em>Regularity Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regularity Feature Type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.RegularityFeatureType
	 * @generated
	 */
	EEnum getRegularityFeatureType();

	/**
	 * Returns the meta object for enum '{@link br.ufes.inf.nemo.ml2.model.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see br.ufes.inf.nemo.ml2.model.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2ModelImpl <em>ML2 Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ML2ModelImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Model()
		 * @generated
		 */
		EClass ML2_MODEL = eINSTANCE.getML2Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML2_MODEL__NAME = eINSTANCE.getML2Model_Name();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML2_MODEL__INCLUDES = eINSTANCE.getML2Model_Includes();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML2_MODEL__ELEMENTS = eINSTANCE.getML2Model_Elements();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ModelElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelElementImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ImportImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.EntityDeclarationImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getEntityDeclaration()
		 * @generated
		 */
		EClass ENTITY_DECLARATION = eINSTANCE.getEntityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_DECLARATION__NAME = eINSTANCE.getEntityDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Instantiated Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__INSTANTIATED_CLASSES = eINSTANCE.getEntityDeclaration_InstantiatedClasses();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DECLARATION__ASSIGNMENTS = eINSTANCE.getEntityDeclaration_Assignments();

		/**
		 * The meta object literal for the '<em><b>Is Unnamed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_DECLARATION___IS_UNNAMED = eINSTANCE.getEntityDeclaration__IsUnnamed();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.IndividualImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl <em>ML2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ML2ClassImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Class()
		 * @generated
		 */
		EClass ML2_CLASS = eINSTANCE.getML2Class();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML2_CLASS__SUPER_CLASSES = eINSTANCE.getML2Class_SuperClasses();

		/**
		 * The meta object literal for the '<em><b>Subordinators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML2_CLASS__SUBORDINATORS = eINSTANCE.getML2Class_Subordinators();

		/**
		 * The meta object literal for the '<em><b>Powertype Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML2_CLASS__POWERTYPE_OF = eINSTANCE.getML2Class_PowertypeOf();

		/**
		 * The meta object literal for the '<em><b>Categorized Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML2_CLASS__CATEGORIZED_CLASS = eINSTANCE.getML2Class_CategorizedClass();

		/**
		 * The meta object literal for the '<em><b>Categorization Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML2_CLASS__CATEGORIZATION_TYPE = eINSTANCE.getML2Class_CategorizationType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML2_CLASS__FEATURES = eINSTANCE.getML2Class_Features();

		/**
		 * The meta object literal for the '<em><b>Get Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML2_CLASS___GET_ATTRIBUTES = eINSTANCE.getML2Class__GetAttributes();

		/**
		 * The meta object literal for the '<em><b>Get References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML2_CLASS___GET_REFERENCES = eINSTANCE.getML2Class__GetReferences();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.OrderlessClassImpl <em>Orderless Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.OrderlessClassImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getOrderlessClass()
		 * @generated
		 */
		EClass ORDERLESS_CLASS = eINSTANCE.getOrderlessClass();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.OrderedClassImpl <em>Ordered Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.OrderedClassImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getOrderedClass()
		 * @generated
		 */
		EClass ORDERED_CLASS = eINSTANCE.getOrderedClass();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.HOClassImpl <em>HO Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.HOClassImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getHOClass()
		 * @generated
		 */
		EClass HO_CLASS = eINSTANCE.getHOClass();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HO_CLASS__ORDER = eINSTANCE.getHOClass_Order();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.FOClassImpl <em>FO Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.FOClassImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getFOClass()
		 * @generated
		 */
		EClass FO_CLASS = eINSTANCE.getFOClass();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.DataTypeImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.GeneralizationSetImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__NAME = eINSTANCE.getGeneralizationSet_Name();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_DISJOINT = eINSTANCE.getGeneralizationSet_IsDisjoint();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_COMPLETE = eINSTANCE.getGeneralizationSet_IsComplete();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__GENERAL = eINSTANCE.getGeneralizationSet_General();

		/**
		 * The meta object literal for the '<em><b>Categorizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__CATEGORIZER = eINSTANCE.getGeneralizationSet_Categorizer();

		/**
		 * The meta object literal for the '<em><b>Specifics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__SPECIFICS = eINSTANCE.getGeneralizationSet_Specifics();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.FeatureImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__LOWER_BOUND = eINSTANCE.getFeature_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__UPPER_BOUND = eINSTANCE.getFeature_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Regularity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__REGULARITY_TYPE = eINSTANCE.getFeature_RegularityType();

		/**
		 * The meta object literal for the '<em><b>Regulated Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REGULATED_FEATURE = eINSTANCE.getFeature_RegulatedFeature();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.AttributeImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PRIMITIVE_TYPE = eINSTANCE.getAttribute_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute__type();

		/**
		 * The meta object literal for the '<em><b>Subset Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__SUBSET_OF = eINSTANCE.getAttribute_SubsetOf();

		/**
		 * The meta object literal for the '<em><b>Is Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_PRIMITIVE = eINSTANCE.getAttribute__IsPrimitive();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ReferenceImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TYPE = eINSTANCE.getReference__type();

		/**
		 * The meta object literal for the '<em><b>Subset Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SUBSET_OF = eINSTANCE.getReference_SubsetOf();

		/**
		 * The meta object literal for the '<em><b>Opposite To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__OPPOSITE_TO = eINSTANCE.getReference_OppositeTo();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.FeatureAssignmentImpl <em>Feature Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.FeatureAssignmentImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getFeatureAssignment()
		 * @generated
		 */
		EClass FEATURE_ASSIGNMENT = eINSTANCE.getFeatureAssignment();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.AttributeAssignmentImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getAttributeAssignment()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT = eINSTANCE.getAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getAttributeAssignment_Attribute();

		/**
		 * The meta object literal for the '<em><b>Individual Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS = eINSTANCE.getAttributeAssignment_IndividualAssignments();

		/**
		 * The meta object literal for the '<em><b>Unnamed Individual Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS = eINSTANCE.getAttributeAssignment_UnnamedIndividualAssignments();

		/**
		 * The meta object literal for the '<em><b>Literal Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS = eINSTANCE.getAttributeAssignment_LiteralAssignments();

		/**
		 * The meta object literal for the '<em><b>Has Individual Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_ASSIGNMENT___HAS_INDIVIDUAL_ASSIGNMENTS = eINSTANCE.getAttributeAssignment__HasIndividualAssignments();

		/**
		 * The meta object literal for the '<em><b>Has Literal Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_ASSIGNMENT___HAS_LITERAL_ASSIGNMENTS = eINSTANCE.getAttributeAssignment__HasLiteralAssignments();

		/**
		 * The meta object literal for the '<em><b>Get All Individual Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_ASSIGNMENT___GET_ALL_INDIVIDUAL_ASSIGNMENTS = eINSTANCE.getAttributeAssignment__GetAllIndividualAssignments();

		/**
		 * The meta object literal for the '<em><b>Get All Assignments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_ASSIGNMENT___GET_ALL_ASSIGNMENTS = eINSTANCE.getAttributeAssignment__GetAllAssignments();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ReferenceAssignmentImpl <em>Reference Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ReferenceAssignmentImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getReferenceAssignment()
		 * @generated
		 */
		EClass REFERENCE_ASSIGNMENT = eINSTANCE.getReferenceAssignment();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ASSIGNMENT__REFERENCE = eINSTANCE.getReferenceAssignment_Reference();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ASSIGNMENT__ASSIGNMENTS = eINSTANCE.getReferenceAssignment_Assignments();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.LiteralImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2StringImpl <em>ML2 String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ML2StringImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2String()
		 * @generated
		 */
		EClass ML2_STRING = eINSTANCE.getML2String();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML2_STRING__VALUE = eINSTANCE.getML2String_Value();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML2_STRING___EQUALS__OBJECT = eINSTANCE.getML2String__Equals__Object();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2NumberImpl <em>ML2 Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ML2NumberImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Number()
		 * @generated
		 */
		EClass ML2_NUMBER = eINSTANCE.getML2Number();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML2_NUMBER__VALUE = eINSTANCE.getML2Number_Value();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML2_NUMBER___EQUALS__OBJECT = eINSTANCE.getML2Number__Equals__Object();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.impl.ML2BooleanImpl <em>ML2 Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.impl.ML2BooleanImpl
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getML2Boolean()
		 * @generated
		 */
		EClass ML2_BOOLEAN = eINSTANCE.getML2Boolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML2_BOOLEAN__VALUE = eINSTANCE.getML2Boolean_Value();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML2_BOOLEAN___EQUALS__OBJECT = eINSTANCE.getML2Boolean__Equals__Object();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.CategorizationType <em>Categorization Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.CategorizationType
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getCategorizationType()
		 * @generated
		 */
		EEnum CATEGORIZATION_TYPE = eINSTANCE.getCategorizationType();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.RegularityFeatureType <em>Regularity Feature Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.RegularityFeatureType
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getRegularityFeatureType()
		 * @generated
		 */
		EEnum REGULARITY_FEATURE_TYPE = eINSTANCE.getRegularityFeatureType();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.nemo.ml2.model.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.nemo.ml2.model.PrimitiveType
		 * @see br.ufes.inf.nemo.ml2.model.impl.ModelPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //ModelPackage
