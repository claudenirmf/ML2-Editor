/**
 */
package br.ufes.inf.nemo.ml2.meta.util;

import br.ufes.inf.nemo.ml2.meta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ml2.meta.MetaPackage
 * @generated
 */
public class MetaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaSwitch<Adapter> modelSwitch =
		new MetaSwitch<Adapter>() {
			@Override
			public Adapter caseML2Model(ML2Model object) {
				return createML2ModelAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseEntityDeclaration(EntityDeclaration object) {
				return createEntityDeclarationAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseML2Class(ML2Class object) {
				return createML2ClassAdapter();
			}
			@Override
			public Adapter caseOrderlessClass(OrderlessClass object) {
				return createOrderlessClassAdapter();
			}
			@Override
			public Adapter caseOrderedClass(OrderedClass object) {
				return createOrderedClassAdapter();
			}
			@Override
			public Adapter caseHOClass(HOClass object) {
				return createHOClassAdapter();
			}
			@Override
			public Adapter caseFOClass(FOClass object) {
				return createFOClassAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseGeneralizationSet(GeneralizationSet object) {
				return createGeneralizationSetAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseFeatureAssignment(FeatureAssignment object) {
				return createFeatureAssignmentAdapter();
			}
			@Override
			public Adapter caseAttributeAssignment(AttributeAssignment object) {
				return createAttributeAssignmentAdapter();
			}
			@Override
			public Adapter caseReferenceAssignment(ReferenceAssignment object) {
				return createReferenceAssignmentAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseML2String(ML2String object) {
				return createML2StringAdapter();
			}
			@Override
			public Adapter caseML2Number(ML2Number object) {
				return createML2NumberAdapter();
			}
			@Override
			public Adapter caseML2Boolean(ML2Boolean object) {
				return createML2BooleanAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.ML2Model <em>ML2 Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.ML2Model
	 * @generated
	 */
	public Adapter createML2ModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.EntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.EntityDeclaration
	 * @generated
	 */
	public Adapter createEntityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.ML2Class <em>ML2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.ML2Class
	 * @generated
	 */
	public Adapter createML2ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.OrderlessClass <em>Orderless Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.OrderlessClass
	 * @generated
	 */
	public Adapter createOrderlessClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.OrderedClass <em>Ordered Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.OrderedClass
	 * @generated
	 */
	public Adapter createOrderedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.HOClass <em>HO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.HOClass
	 * @generated
	 */
	public Adapter createHOClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.FOClass <em>FO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.FOClass
	 * @generated
	 */
	public Adapter createFOClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.FeatureAssignment <em>Feature Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.FeatureAssignment
	 * @generated
	 */
	public Adapter createFeatureAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.AttributeAssignment
	 * @generated
	 */
	public Adapter createAttributeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.ReferenceAssignment <em>Reference Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.ReferenceAssignment
	 * @generated
	 */
	public Adapter createReferenceAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.ML2String <em>ML2 String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.ML2String
	 * @generated
	 */
	public Adapter createML2StringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.ML2Number <em>ML2 Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.ML2Number
	 * @generated
	 */
	public Adapter createML2NumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ml2.meta.ML2Boolean <em>ML2 Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.nemo.ml2.meta.ML2Boolean
	 * @generated
	 */
	public Adapter createML2BooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetaAdapterFactory
