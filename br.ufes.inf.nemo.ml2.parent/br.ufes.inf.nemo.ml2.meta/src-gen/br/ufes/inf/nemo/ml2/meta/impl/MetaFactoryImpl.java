/**
 */
package br.ufes.inf.nemo.ml2.meta.impl;

import br.ufes.inf.nemo.ml2.meta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaFactoryImpl extends EFactoryImpl implements MetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaFactory init() {
		try {
			MetaFactory theMetaFactory = (MetaFactory)EPackage.Registry.INSTANCE.getEFactory(MetaPackage.eNS_URI);
			if (theMetaFactory != null) {
				return theMetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetaPackage.ML2_MODEL: return createML2Model();
			case MetaPackage.IMPORT: return createImport();
			case MetaPackage.INDIVIDUAL: return createIndividual();
			case MetaPackage.ORDERLESS_CLASS: return createOrderlessClass();
			case MetaPackage.HO_CLASS: return createHOClass();
			case MetaPackage.FO_CLASS: return createFOClass();
			case MetaPackage.DATA_TYPE: return createDataType();
			case MetaPackage.GENERALIZATION_SET: return createGeneralizationSet();
			case MetaPackage.FEATURE: return createFeature();
			case MetaPackage.ATTRIBUTE: return createAttribute();
			case MetaPackage.REFERENCE: return createReference();
			case MetaPackage.FEATURE_ASSIGNMENT: return createFeatureAssignment();
			case MetaPackage.ATTRIBUTE_ASSIGNMENT: return createAttributeAssignment();
			case MetaPackage.REFERENCE_ASSIGNMENT: return createReferenceAssignment();
			case MetaPackage.ML2_STRING: return createML2String();
			case MetaPackage.ML2_NUMBER: return createML2Number();
			case MetaPackage.ML2_BOOLEAN: return createML2Boolean();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetaPackage.CATEGORIZATION_TYPE:
				return createCategorizationTypeFromString(eDataType, initialValue);
			case MetaPackage.REGULARITY_FEATURE_TYPE:
				return createRegularityFeatureTypeFromString(eDataType, initialValue);
			case MetaPackage.PRIMITIVE_TYPE:
				return createPrimitiveTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetaPackage.CATEGORIZATION_TYPE:
				return convertCategorizationTypeToString(eDataType, instanceValue);
			case MetaPackage.REGULARITY_FEATURE_TYPE:
				return convertRegularityFeatureTypeToString(eDataType, instanceValue);
			case MetaPackage.PRIMITIVE_TYPE:
				return convertPrimitiveTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2Model createML2Model() {
		ML2ModelImpl ml2Model = new ML2ModelImpl();
		return ml2Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual createIndividual() {
		IndividualImpl individual = new IndividualImpl();
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderlessClass createOrderlessClass() {
		OrderlessClassImpl orderlessClass = new OrderlessClassImpl();
		return orderlessClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HOClass createHOClass() {
		HOClassImpl hoClass = new HOClassImpl();
		return hoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOClass createFOClass() {
		FOClassImpl foClass = new FOClassImpl();
		return foClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAssignment createFeatureAssignment() {
		FeatureAssignmentImpl featureAssignment = new FeatureAssignmentImpl();
		return featureAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignment createAttributeAssignment() {
		AttributeAssignmentImpl attributeAssignment = new AttributeAssignmentImpl();
		return attributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceAssignment createReferenceAssignment() {
		ReferenceAssignmentImpl referenceAssignment = new ReferenceAssignmentImpl();
		return referenceAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2String createML2String() {
		ML2StringImpl ml2String = new ML2StringImpl();
		return ml2String;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2Number createML2Number() {
		ML2NumberImpl ml2Number = new ML2NumberImpl();
		return ml2Number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ML2Boolean createML2Boolean() {
		ML2BooleanImpl ml2Boolean = new ML2BooleanImpl();
		return ml2Boolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizationType createCategorizationTypeFromString(EDataType eDataType, String initialValue) {
		CategorizationType result = CategorizationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategorizationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularityFeatureType createRegularityFeatureTypeFromString(EDataType eDataType, String initialValue) {
		RegularityFeatureType result = RegularityFeatureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegularityFeatureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaPackage getMetaPackage() {
		return (MetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaPackage getPackage() {
		return MetaPackage.eINSTANCE;
	}

} //MetaFactoryImpl
