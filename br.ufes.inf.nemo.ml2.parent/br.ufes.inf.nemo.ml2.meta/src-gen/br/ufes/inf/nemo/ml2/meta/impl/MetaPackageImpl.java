/**
 */
package br.ufes.inf.nemo.ml2.meta.impl;

import br.ufes.inf.nemo.ml2.meta.Attribute;
import br.ufes.inf.nemo.ml2.meta.AttributeAssignment;
import br.ufes.inf.nemo.ml2.meta.CategorizationType;
import br.ufes.inf.nemo.ml2.meta.DataType;
import br.ufes.inf.nemo.ml2.meta.EntityDeclaration;
import br.ufes.inf.nemo.ml2.meta.FOClass;
import br.ufes.inf.nemo.ml2.meta.Feature;
import br.ufes.inf.nemo.ml2.meta.FeatureAssignment;
import br.ufes.inf.nemo.ml2.meta.GeneralizationSet;
import br.ufes.inf.nemo.ml2.meta.HOClass;
import br.ufes.inf.nemo.ml2.meta.Import;
import br.ufes.inf.nemo.ml2.meta.Individual;
import br.ufes.inf.nemo.ml2.meta.Literal;
import br.ufes.inf.nemo.ml2.meta.ML2Boolean;
import br.ufes.inf.nemo.ml2.meta.ML2Class;
import br.ufes.inf.nemo.ml2.meta.ML2Model;
import br.ufes.inf.nemo.ml2.meta.ML2Number;
import br.ufes.inf.nemo.ml2.meta.ML2String;
import br.ufes.inf.nemo.ml2.meta.MetaFactory;
import br.ufes.inf.nemo.ml2.meta.MetaPackage;
import br.ufes.inf.nemo.ml2.meta.ModelElement;
import br.ufes.inf.nemo.ml2.meta.OrderedClass;
import br.ufes.inf.nemo.ml2.meta.OrderlessClass;
import br.ufes.inf.nemo.ml2.meta.PrimitiveType;
import br.ufes.inf.nemo.ml2.meta.Reference;
import br.ufes.inf.nemo.ml2.meta.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.meta.RegularityFeatureType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaPackageImpl extends EPackageImpl implements MetaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ml2ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ml2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderlessClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ml2StringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ml2NumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ml2BooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categorizationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regularityFeatureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaPackageImpl() {
		super(eNS_URI, MetaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaPackage init() {
		if (isInited) return (MetaPackage)EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI);

		// Obtain or create and register package
		MetaPackageImpl theMetaPackage = (MetaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetaPackage.createPackageContents();

		// Initialize created meta-data
		theMetaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaPackage.eNS_URI, theMetaPackage);
		return theMetaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getML2Model() {
		return ml2ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getML2Model_Name() {
		return (EAttribute)ml2ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML2Model_Includes() {
		return (EReference)ml2ModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML2Model_Elements() {
		return (EReference)ml2ModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityDeclaration() {
		return entityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityDeclaration_Name() {
		return (EAttribute)entityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityDeclaration_InstantiatedClasses() {
		return (EReference)entityDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityDeclaration_Assignments() {
		return (EReference)entityDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityDeclaration__IsUnnamed() {
		return entityDeclarationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getML2Class() {
		return ml2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML2Class_SuperClasses() {
		return (EReference)ml2ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML2Class_Subordinators() {
		return (EReference)ml2ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML2Class_PowertypeOf() {
		return (EReference)ml2ClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML2Class_CategorizedClass() {
		return (EReference)ml2ClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getML2Class_CategorizationType() {
		return (EAttribute)ml2ClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getML2Class_Features() {
		return (EReference)ml2ClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getML2Class__GetAttributes() {
		return ml2ClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getML2Class__GetReferences() {
		return ml2ClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderlessClass() {
		return orderlessClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedClass() {
		return orderedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHOClass() {
		return hoClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHOClass_Order() {
		return (EAttribute)hoClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFOClass() {
		return foClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_Name() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsComplete() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_General() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Categorizer() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Specifics() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_LowerBound() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_UpperBound() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_RegularityType() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_RegulatedFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_PrimitiveType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute__type() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_SubsetOf() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference__type() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_SubsetOf() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_OppositeTo() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureAssignment() {
		return featureAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssignment() {
		return attributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_Attribute() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_IndividualAssignments() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_UnnamedIndividualAssignments() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_LiteralAssignments() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeAssignment__HasIndividualAssignments() {
		return attributeAssignmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeAssignment__HasLiteralAssignments() {
		return attributeAssignmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeAssignment__GetAllIndividualAssignments() {
		return attributeAssignmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeAssignment__GetAllAssignments() {
		return attributeAssignmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceAssignment() {
		return referenceAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceAssignment_Reference() {
		return (EReference)referenceAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceAssignment_Assignments() {
		return (EReference)referenceAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getML2String() {
		return ml2StringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getML2String_Value() {
		return (EAttribute)ml2StringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getML2String__Equals__Object() {
		return ml2StringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getML2Number() {
		return ml2NumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getML2Number_Value() {
		return (EAttribute)ml2NumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getML2Number__Equals__Object() {
		return ml2NumberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getML2Boolean() {
		return ml2BooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getML2Boolean_Value() {
		return (EAttribute)ml2BooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getML2Boolean__Equals__Object() {
		return ml2BooleanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategorizationType() {
		return categorizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegularityFeatureType() {
		return regularityFeatureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactory getMetaFactory() {
		return (MetaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ml2ModelEClass = createEClass(ML2_MODEL);
		createEAttribute(ml2ModelEClass, ML2_MODEL__NAME);
		createEReference(ml2ModelEClass, ML2_MODEL__INCLUDES);
		createEReference(ml2ModelEClass, ML2_MODEL__ELEMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		entityDeclarationEClass = createEClass(ENTITY_DECLARATION);
		createEAttribute(entityDeclarationEClass, ENTITY_DECLARATION__NAME);
		createEReference(entityDeclarationEClass, ENTITY_DECLARATION__INSTANTIATED_CLASSES);
		createEReference(entityDeclarationEClass, ENTITY_DECLARATION__ASSIGNMENTS);
		createEOperation(entityDeclarationEClass, ENTITY_DECLARATION___IS_UNNAMED);

		individualEClass = createEClass(INDIVIDUAL);

		ml2ClassEClass = createEClass(ML2_CLASS);
		createEReference(ml2ClassEClass, ML2_CLASS__SUPER_CLASSES);
		createEReference(ml2ClassEClass, ML2_CLASS__SUBORDINATORS);
		createEReference(ml2ClassEClass, ML2_CLASS__POWERTYPE_OF);
		createEReference(ml2ClassEClass, ML2_CLASS__CATEGORIZED_CLASS);
		createEAttribute(ml2ClassEClass, ML2_CLASS__CATEGORIZATION_TYPE);
		createEReference(ml2ClassEClass, ML2_CLASS__FEATURES);
		createEOperation(ml2ClassEClass, ML2_CLASS___GET_ATTRIBUTES);
		createEOperation(ml2ClassEClass, ML2_CLASS___GET_REFERENCES);

		orderlessClassEClass = createEClass(ORDERLESS_CLASS);

		orderedClassEClass = createEClass(ORDERED_CLASS);

		hoClassEClass = createEClass(HO_CLASS);
		createEAttribute(hoClassEClass, HO_CLASS__ORDER);

		foClassEClass = createEClass(FO_CLASS);

		dataTypeEClass = createEClass(DATA_TYPE);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__NAME);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COMPLETE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERAL);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__CATEGORIZER);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__SPECIFICS);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__LOWER_BOUND);
		createEAttribute(featureEClass, FEATURE__UPPER_BOUND);
		createEAttribute(featureEClass, FEATURE__REGULARITY_TYPE);
		createEReference(featureEClass, FEATURE__REGULATED_FEATURE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__PRIMITIVE_TYPE);
		createEReference(attributeEClass, ATTRIBUTE__TYPE);
		createEReference(attributeEClass, ATTRIBUTE__SUBSET_OF);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__TYPE);
		createEReference(referenceEClass, REFERENCE__SUBSET_OF);
		createEReference(referenceEClass, REFERENCE__OPPOSITE_TO);

		featureAssignmentEClass = createEClass(FEATURE_ASSIGNMENT);

		attributeAssignmentEClass = createEClass(ATTRIBUTE_ASSIGNMENT);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__ATTRIBUTE);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__INDIVIDUAL_ASSIGNMENTS);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__UNNAMED_INDIVIDUAL_ASSIGNMENTS);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__LITERAL_ASSIGNMENTS);
		createEOperation(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT___HAS_INDIVIDUAL_ASSIGNMENTS);
		createEOperation(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT___HAS_LITERAL_ASSIGNMENTS);
		createEOperation(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT___GET_ALL_INDIVIDUAL_ASSIGNMENTS);
		createEOperation(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT___GET_ALL_ASSIGNMENTS);

		referenceAssignmentEClass = createEClass(REFERENCE_ASSIGNMENT);
		createEReference(referenceAssignmentEClass, REFERENCE_ASSIGNMENT__REFERENCE);
		createEReference(referenceAssignmentEClass, REFERENCE_ASSIGNMENT__ASSIGNMENTS);

		literalEClass = createEClass(LITERAL);

		ml2StringEClass = createEClass(ML2_STRING);
		createEAttribute(ml2StringEClass, ML2_STRING__VALUE);
		createEOperation(ml2StringEClass, ML2_STRING___EQUALS__OBJECT);

		ml2NumberEClass = createEClass(ML2_NUMBER);
		createEAttribute(ml2NumberEClass, ML2_NUMBER__VALUE);
		createEOperation(ml2NumberEClass, ML2_NUMBER___EQUALS__OBJECT);

		ml2BooleanEClass = createEClass(ML2_BOOLEAN);
		createEAttribute(ml2BooleanEClass, ML2_BOOLEAN__VALUE);
		createEOperation(ml2BooleanEClass, ML2_BOOLEAN___EQUALS__OBJECT);

		// Create enums
		categorizationTypeEEnum = createEEnum(CATEGORIZATION_TYPE);
		regularityFeatureTypeEEnum = createEEnum(REGULARITY_FEATURE_TYPE);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		importEClass.getESuperTypes().add(this.getModelElement());
		entityDeclarationEClass.getESuperTypes().add(this.getModelElement());
		individualEClass.getESuperTypes().add(this.getEntityDeclaration());
		ml2ClassEClass.getESuperTypes().add(this.getEntityDeclaration());
		orderlessClassEClass.getESuperTypes().add(this.getML2Class());
		orderedClassEClass.getESuperTypes().add(this.getML2Class());
		hoClassEClass.getESuperTypes().add(this.getOrderedClass());
		foClassEClass.getESuperTypes().add(this.getOrderedClass());
		dataTypeEClass.getESuperTypes().add(this.getFOClass());
		generalizationSetEClass.getESuperTypes().add(this.getModelElement());
		featureEClass.getESuperTypes().add(this.getModelElement());
		attributeEClass.getESuperTypes().add(this.getFeature());
		referenceEClass.getESuperTypes().add(this.getFeature());
		featureAssignmentEClass.getESuperTypes().add(this.getModelElement());
		attributeAssignmentEClass.getESuperTypes().add(this.getFeatureAssignment());
		referenceAssignmentEClass.getESuperTypes().add(this.getFeatureAssignment());
		literalEClass.getESuperTypes().add(this.getModelElement());
		ml2StringEClass.getESuperTypes().add(this.getLiteral());
		ml2NumberEClass.getESuperTypes().add(this.getLiteral());
		ml2BooleanEClass.getESuperTypes().add(this.getLiteral());

		// Initialize classes, features, and operations; add parameters
		initEClass(ml2ModelEClass, ML2Model.class, "ML2Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getML2Model_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ML2Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getML2Model_Includes(), this.getML2Model(), null, "includes", null, 0, -1, ML2Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getML2Model_Elements(), this.getModelElement(), null, "elements", null, 0, -1, ML2Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDeclarationEClass, EntityDeclaration.class, "EntityDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityDeclaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityDeclaration_InstantiatedClasses(), this.getML2Class(), null, "instantiatedClasses", null, 0, -1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityDeclaration_Assignments(), this.getFeatureAssignment(), null, "assignments", null, 0, -1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEntityDeclaration__IsUnnamed(), theEcorePackage.getEBoolean(), "isUnnamed", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ml2ClassEClass, ML2Class.class, "ML2Class", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getML2Class_SuperClasses(), this.getML2Class(), null, "superClasses", null, 0, -1, ML2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getML2Class_Subordinators(), this.getML2Class(), null, "subordinators", null, 0, -1, ML2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getML2Class_PowertypeOf(), this.getML2Class(), null, "powertypeOf", null, 0, 1, ML2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getML2Class_CategorizedClass(), this.getML2Class(), null, "categorizedClass", null, 0, 1, ML2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getML2Class_CategorizationType(), this.getCategorizationType(), "categorizationType", null, 0, 1, ML2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getML2Class_Features(), this.getFeature(), null, "features", null, 0, -1, ML2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getML2Class__GetAttributes(), this.getAttribute(), "getAttributes", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getML2Class__GetReferences(), this.getReference(), "getReferences", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(orderlessClassEClass, OrderlessClass.class, "OrderlessClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedClassEClass, OrderedClass.class, "OrderedClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hoClassEClass, HOClass.class, "HOClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHOClass_Order(), theEcorePackage.getEIntegerObject(), "order", null, 0, 1, HOClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foClassEClass, FOClass.class, "FOClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_Name(), theEcorePackage.getEString(), "name", "anonymous", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsDisjoint(), theEcorePackage.getEBoolean(), "isDisjoint", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsComplete(), theEcorePackage.getEBoolean(), "isComplete", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_General(), this.getML2Class(), null, "general", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_Categorizer(), this.getML2Class(), null, "categorizer", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_Specifics(), this.getML2Class(), null, "specifics", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_LowerBound(), theEcorePackage.getEInt(), "lowerBound", "1", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_UpperBound(), theEcorePackage.getEInt(), "upperBound", "1", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_RegularityType(), this.getRegularityFeatureType(), "regularityType", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_RegulatedFeature(), this.getFeature(), null, "regulatedFeature", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_PrimitiveType(), this.getPrimitiveType(), "primitiveType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute__type(), this.getDataType(), null, "_type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_SubsetOf(), this.getAttribute(), null, "subsetOf", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference__type(), this.getML2Class(), null, "_type", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_SubsetOf(), this.getReference(), null, "subsetOf", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_OppositeTo(), this.getReference(), null, "oppositeTo", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureAssignmentEClass, FeatureAssignment.class, "FeatureAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeAssignmentEClass, AttributeAssignment.class, "AttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeAssignment_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssignment_IndividualAssignments(), this.getIndividual(), null, "individualAssignments", null, 0, -1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssignment_UnnamedIndividualAssignments(), this.getIndividual(), null, "unnamedIndividualAssignments", null, 0, -1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssignment_LiteralAssignments(), this.getLiteral(), null, "literalAssignments", null, 0, -1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAttributeAssignment__HasIndividualAssignments(), theEcorePackage.getEBoolean(), "hasIndividualAssignments", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAttributeAssignment__HasLiteralAssignments(), theEcorePackage.getEBoolean(), "hasLiteralAssignments", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAttributeAssignment__GetAllIndividualAssignments(), this.getIndividual(), "getAllIndividualAssignments", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAttributeAssignment__GetAllAssignments(), theEcorePackage.getEJavaObject(), "getAllAssignments", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(referenceAssignmentEClass, ReferenceAssignment.class, "ReferenceAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceAssignment_Reference(), this.getReference(), null, "reference", null, 0, 1, ReferenceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceAssignment_Assignments(), this.getEntityDeclaration(), null, "assignments", null, 0, -1, ReferenceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ml2StringEClass, ML2String.class, "ML2String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getML2String_Value(), theEcorePackage.getEString(), "value", null, 0, 1, ML2String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getML2String__Equals__Object(), theEcorePackage.getEBoolean(), "equals", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "obj", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ml2NumberEClass, ML2Number.class, "ML2Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getML2Number_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, ML2Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getML2Number__Equals__Object(), theEcorePackage.getEBoolean(), "equals", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "obj", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ml2BooleanEClass, ML2Boolean.class, "ML2Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getML2Boolean_Value(), theEcorePackage.getEBoolean(), "value", null, 0, 1, ML2Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getML2Boolean__Equals__Object(), theEcorePackage.getEBoolean(), "equals", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "obj", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(categorizationTypeEEnum, CategorizationType.class, "CategorizationType");
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.CATEGORIZER);
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.DISJOINT_CATEGORIZER);
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.COMPLETE_CATEGORIZER);
		addEEnumLiteral(categorizationTypeEEnum, CategorizationType.PARTITIONER);

		initEEnum(regularityFeatureTypeEEnum, RegularityFeatureType.class, "RegularityFeatureType");
		addEEnumLiteral(regularityFeatureTypeEEnum, RegularityFeatureType.DETERMINES_MAX_VALUE);
		addEEnumLiteral(regularityFeatureTypeEEnum, RegularityFeatureType.DETERMINES_MIN_VALUE);
		addEEnumLiteral(regularityFeatureTypeEEnum, RegularityFeatureType.DETERMINES_VALUE);
		addEEnumLiteral(regularityFeatureTypeEEnum, RegularityFeatureType.DETERMINES_ALLOWED_VALUES);
		addEEnumLiteral(regularityFeatureTypeEEnum, RegularityFeatureType.DETERMINES_TYPE);
		addEEnumLiteral(regularityFeatureTypeEEnum, RegularityFeatureType.DETERMINES_ALLOWED_TYPES);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.NUMBER);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //MetaPackageImpl
