/**
 */
package br.ufes.inf.nemo.ml2.model.util;

import br.ufes.inf.nemo.ml2.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ml2.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ML2_MODEL: {
				ML2Model ml2Model = (ML2Model)theEObject;
				T result = caseML2Model(ml2Model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseModelElement(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENTITY_DECLARATION: {
				EntityDeclaration entityDeclaration = (EntityDeclaration)theEObject;
				T result = caseEntityDeclaration(entityDeclaration);
				if (result == null) result = caseModelElement(entityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = caseEntityDeclaration(individual);
				if (result == null) result = caseModelElement(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ML2_CLASS: {
				ML2Class ml2Class = (ML2Class)theEObject;
				T result = caseML2Class(ml2Class);
				if (result == null) result = caseEntityDeclaration(ml2Class);
				if (result == null) result = caseModelElement(ml2Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ORDERLESS_CLASS: {
				OrderlessClass orderlessClass = (OrderlessClass)theEObject;
				T result = caseOrderlessClass(orderlessClass);
				if (result == null) result = caseML2Class(orderlessClass);
				if (result == null) result = caseEntityDeclaration(orderlessClass);
				if (result == null) result = caseModelElement(orderlessClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ORDERED_CLASS: {
				OrderedClass orderedClass = (OrderedClass)theEObject;
				T result = caseOrderedClass(orderedClass);
				if (result == null) result = caseML2Class(orderedClass);
				if (result == null) result = caseEntityDeclaration(orderedClass);
				if (result == null) result = caseModelElement(orderedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HO_CLASS: {
				HOClass hoClass = (HOClass)theEObject;
				T result = caseHOClass(hoClass);
				if (result == null) result = caseOrderedClass(hoClass);
				if (result == null) result = caseML2Class(hoClass);
				if (result == null) result = caseEntityDeclaration(hoClass);
				if (result == null) result = caseModelElement(hoClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FO_CLASS: {
				FOClass foClass = (FOClass)theEObject;
				T result = caseFOClass(foClass);
				if (result == null) result = caseOrderedClass(foClass);
				if (result == null) result = caseML2Class(foClass);
				if (result == null) result = caseEntityDeclaration(foClass);
				if (result == null) result = caseModelElement(foClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseFOClass(dataType);
				if (result == null) result = caseOrderedClass(dataType);
				if (result == null) result = caseML2Class(dataType);
				if (result == null) result = caseEntityDeclaration(dataType);
				if (result == null) result = caseModelElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERALIZATION_SET: {
				GeneralizationSet generalizationSet = (GeneralizationSet)theEObject;
				T result = caseGeneralizationSet(generalizationSet);
				if (result == null) result = caseModelElement(generalizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseModelElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseModelElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseFeature(reference);
				if (result == null) result = caseModelElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FEATURE_ASSIGNMENT: {
				FeatureAssignment featureAssignment = (FeatureAssignment)theEObject;
				T result = caseFeatureAssignment(featureAssignment);
				if (result == null) result = caseModelElement(featureAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATTRIBUTE_ASSIGNMENT: {
				AttributeAssignment attributeAssignment = (AttributeAssignment)theEObject;
				T result = caseAttributeAssignment(attributeAssignment);
				if (result == null) result = caseFeatureAssignment(attributeAssignment);
				if (result == null) result = caseModelElement(attributeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REFERENCE_ASSIGNMENT: {
				ReferenceAssignment referenceAssignment = (ReferenceAssignment)theEObject;
				T result = caseReferenceAssignment(referenceAssignment);
				if (result == null) result = caseFeatureAssignment(referenceAssignment);
				if (result == null) result = caseModelElement(referenceAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseModelElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ML2_STRING: {
				ML2String ml2String = (ML2String)theEObject;
				T result = caseML2String(ml2String);
				if (result == null) result = caseLiteral(ml2String);
				if (result == null) result = caseModelElement(ml2String);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ML2_NUMBER: {
				ML2Number ml2Number = (ML2Number)theEObject;
				T result = caseML2Number(ml2Number);
				if (result == null) result = caseLiteral(ml2Number);
				if (result == null) result = caseModelElement(ml2Number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ML2_BOOLEAN: {
				ML2Boolean ml2Boolean = (ML2Boolean)theEObject;
				T result = caseML2Boolean(ml2Boolean);
				if (result == null) result = caseLiteral(ml2Boolean);
				if (result == null) result = caseModelElement(ml2Boolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML2 Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML2 Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseML2Model(ML2Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDeclaration(EntityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseML2Class(ML2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orderless Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orderless Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderlessClass(OrderlessClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedClass(OrderedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HO Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HO Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHOClass(HOClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FO Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FO Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFOClass(FOClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureAssignment(FeatureAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAssignment(AttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceAssignment(ReferenceAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML2 String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML2 String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseML2String(ML2String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML2 Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML2 Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseML2Number(ML2Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML2 Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML2 Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseML2Boolean(ML2Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
