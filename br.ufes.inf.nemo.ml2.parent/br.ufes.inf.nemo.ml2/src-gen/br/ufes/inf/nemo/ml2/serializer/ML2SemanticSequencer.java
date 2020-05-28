/*
 * generated by Xtext 2.16.0
 */
package br.ufes.inf.nemo.ml2.serializer;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.AttributeAssignment;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.FOClass;
import br.ufes.inf.nemo.ml2.model.GeneralizationSet;
import br.ufes.inf.nemo.ml2.model.HOClass;
import br.ufes.inf.nemo.ml2.model.Import;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.ML2Boolean;
import br.ufes.inf.nemo.ml2.model.ML2Model;
import br.ufes.inf.nemo.ml2.model.ML2Number;
import br.ufes.inf.nemo.ml2.model.ML2String;
import br.ufes.inf.nemo.ml2.model.ModelPackage;
import br.ufes.inf.nemo.ml2.model.OrderlessClass;
import br.ufes.inf.nemo.ml2.model.Reference;
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ML2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ML2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ModelPackage.ATTRIBUTE:
				if (rule == grammarAccess.getCommonFeatureRule()
						|| rule == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureRule()) {
					sequence_Attribute_RegularityAttribute(context, (Attribute) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRegularityFeatureRule()
						|| rule == grammarAccess.getRegularityAttributeRule()) {
					sequence_RegularityAttribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.ATTRIBUTE_ASSIGNMENT:
				if (rule == grammarAccess.getMultipleAttributeAssignmentRule()) {
					sequence_MultipleAttributeAssignment(context, (AttributeAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureAssignmentRule()) {
					sequence_MultipleAttributeAssignment_SingleAttributeAssignment(context, (AttributeAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimpleAttributeAssignmentRule()) {
					sequence_SimpleAttributeAssignment(context, (AttributeAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSingleAttributeAssignmentRule()) {
					sequence_SingleAttributeAssignment(context, (AttributeAssignment) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DATA_TYPE:
				if (rule == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getML2ClassRule()) {
					sequence_DataType_ML2Class_SomeFOClass(context, (DataType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSomeFOClassRule()) {
					sequence_DataType_SomeFOClass(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.FO_CLASS:
				if (rule == grammarAccess.getFOClassRule()) {
					sequence_FOClass(context, (FOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getML2ClassRule()) {
					sequence_FOClass_ML2Class_SomeFOClass(context, (FOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSomeFOClassRule()) {
					sequence_FOClass_SomeFOClass(context, (FOClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.GENERALIZATION_SET:
				sequence_GeneralizationSet(context, (GeneralizationSet) semanticObject); 
				return; 
			case ModelPackage.HO_CLASS:
				if (rule == grammarAccess.getHOClassRule()) {
					sequence_HOClass(context, (HOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getML2ClassRule()) {
					sequence_HOClass_ML2Class_NonFOClass(context, (HOClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNonFOClassRule()) {
					sequence_HOClass_NonFOClass(context, (HOClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ModelPackage.INDIVIDUAL:
				if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getIndividualRule()) {
					sequence_Individual(context, (Individual) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnnamedIndividualRule()) {
					sequence_UnnamedIndividual(context, (Individual) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.ML2_BOOLEAN:
				sequence_ML2Boolean(context, (ML2Boolean) semanticObject); 
				return; 
			case ModelPackage.ML2_MODEL:
				sequence_ML2Model(context, (ML2Model) semanticObject); 
				return; 
			case ModelPackage.ML2_NUMBER:
				sequence_ML2Number(context, (ML2Number) semanticObject); 
				return; 
			case ModelPackage.ML2_STRING:
				sequence_ML2String(context, (ML2String) semanticObject); 
				return; 
			case ModelPackage.ORDERLESS_CLASS:
				if (rule == grammarAccess.getModelElementRule()
						|| rule == grammarAccess.getEntityDeclarationRule()
						|| rule == grammarAccess.getML2ClassRule()) {
					sequence_ML2Class_NonFOClass_OrderlessClass(context, (OrderlessClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNonFOClassRule()) {
					sequence_NonFOClass_OrderlessClass(context, (OrderlessClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOrderlessClassRule()) {
					sequence_OrderlessClass(context, (OrderlessClass) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.REFERENCE:
				if (rule == grammarAccess.getCommonFeatureRule()
						|| rule == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureRule()) {
					sequence_Reference_RegularityReference(context, (Reference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRegularityFeatureRule()
						|| rule == grammarAccess.getRegularityReferenceRule()) {
					sequence_RegularityReference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.REFERENCE_ASSIGNMENT:
				sequence_ReferenceAssignment(context, (ReferenceAssignment) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CommonFeature returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         (primitiveType=PrimitiveType | _type=[DataType|QualifiedName]) 
	 *         (subsetOf+=[Attribute|QualifiedName] subsetOf+=[Attribute|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *             (primitiveType=PrimitiveType | _type=[DataType|QualifiedName]) 
	 *             (subsetOf+=[Attribute|QualifiedName] subsetOf+=[Attribute|QualifiedName]*)?
	 *         ) | 
	 *         (
	 *             name=ID 
	 *             (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *             (primitiveType=PrimitiveType | _type=[DataType|QualifiedName]) 
	 *             (subsetOf+=[Attribute|QualifiedName] subsetOf+=[Attribute|QualifiedName]*)? 
	 *             regularityType=RegularityFeatureType 
	 *             regulatedFeature=[Feature|QualifiedName]
	 *         )
	 *     )
	 */
	protected void sequence_Attribute_RegularityAttribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns DataType
	 *     EntityDeclaration returns DataType
	 *     ML2Class returns DataType
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)? 
	 *         (assignments+=FeatureAssignment | features+=Feature)*
	 *     )
	 */
	protected void sequence_DataType_ML2Class_SomeFOClass(ISerializationContext context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SomeFOClass returns DataType
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_DataType_SomeFOClass(ISerializationContext context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FOClass returns FOClass
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FOClass(ISerializationContext context, FOClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns FOClass
	 *     EntityDeclaration returns FOClass
	 *     ML2Class returns FOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)? 
	 *         (assignments+=FeatureAssignment | features+=Feature)*
	 *     )
	 */
	protected void sequence_FOClass_ML2Class_SomeFOClass(ISerializationContext context, FOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SomeFOClass returns FOClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_FOClass_SomeFOClass(ISerializationContext context, FOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns GeneralizationSet
	 *     GeneralizationSet returns GeneralizationSet
	 *
	 * Constraint:
	 *     (
	 *         (isDisjoint?='disjoint' | isComplete?='complete')* 
	 *         name=ID? 
	 *         general=[ML2Class|QualifiedName] 
	 *         categorizer=[ML2Class|QualifiedName]? 
	 *         specifics+=[ML2Class|QualifiedName] 
	 *         specifics+=[ML2Class|QualifiedName]+
	 *     )
	 */
	protected void sequence_GeneralizationSet(ISerializationContext context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HOClass returns HOClass
	 *
	 * Constraint:
	 *     (order=INT name=ID)
	 */
	protected void sequence_HOClass(ISerializationContext context, HOClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.HO_CLASS__ORDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.HO_CLASS__ORDER));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_1_0(), semanticObject.getOrder());
		feeder.accept(grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns HOClass
	 *     EntityDeclaration returns HOClass
	 *     ML2Class returns HOClass
	 *
	 * Constraint:
	 *     (
	 *         order=INT 
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)? 
	 *         (subordinators+=[ML2Class|QualifiedName] subordinators+=[ML2Class|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType categorizedClass=[ML2Class|QualifiedName]) | powertypeOf=[ML2Class|QualifiedName])? 
	 *         (assignments+=FeatureAssignment | features+=Feature)*
	 *     )
	 */
	protected void sequence_HOClass_ML2Class_NonFOClass(ISerializationContext context, HOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NonFOClass returns HOClass
	 *
	 * Constraint:
	 *     (
	 *         order=INT 
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)? 
	 *         (subordinators+=[ML2Class|QualifiedName] subordinators+=[ML2Class|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType categorizedClass=[ML2Class|QualifiedName]) | powertypeOf=[ML2Class|QualifiedName])?
	 *     )
	 */
	protected void sequence_HOClass_NonFOClass(ISerializationContext context, HOClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *     ModelElement returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns Individual
	 *     EntityDeclaration returns Individual
	 *     Individual returns Individual
	 *
	 * Constraint:
	 *     (name=ID instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]* assignments+=FeatureAssignment*)
	 */
	protected void sequence_Individual(ISerializationContext context, Individual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns ML2Boolean
	 *     ML2Boolean returns ML2Boolean
	 *
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_ML2Boolean(ISerializationContext context, ML2Boolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ML2_BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ML2_BOOLEAN__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getML2BooleanAccess().getValueBOOLEANParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns OrderlessClass
	 *     EntityDeclaration returns OrderlessClass
	 *     ML2Class returns OrderlessClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)? 
	 *         (subordinators+=[ML2Class|QualifiedName] subordinators+=[ML2Class|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType categorizedClass=[ML2Class|QualifiedName]) | powertypeOf=[ML2Class|QualifiedName])? 
	 *         (assignments+=FeatureAssignment | features+=Feature)*
	 *     )
	 */
	protected void sequence_ML2Class_NonFOClass_OrderlessClass(ISerializationContext context, OrderlessClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ML2Model returns ML2Model
	 *
	 * Constraint:
	 *     (name=QualifiedName (includes+=[ML2Model|QualifiedName] | elements+=ModelElement)*)
	 */
	protected void sequence_ML2Model(ISerializationContext context, ML2Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns ML2Number
	 *     ML2Number returns ML2Number
	 *
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_ML2Number(ISerializationContext context, ML2Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ML2_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ML2_NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getML2NumberAccess().getValueNUMBERParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns ML2String
	 *     ML2String returns ML2String
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_ML2String(ISerializationContext context, ML2String semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ML2_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ML2_STRING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getML2StringAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MultipleAttributeAssignment returns AttributeAssignment
	 *
	 * Constraint:
	 *     (
	 *         attribute=[Attribute|QualifiedName] 
	 *         (
	 *             (literalAssignments+=Literal literalAssignments+=Literal*) | 
	 *             (
	 *                 (individualAssignments+=[Individual|QualifiedName] | unnamedIndividualAssignments+=UnnamedIndividual) 
	 *                 individualAssignments+=[Individual|QualifiedName]? 
	 *                 (unnamedIndividualAssignments+=UnnamedIndividual? individualAssignments+=[Individual|QualifiedName]?)*
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_MultipleAttributeAssignment(ISerializationContext context, AttributeAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureAssignment returns AttributeAssignment
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             attribute=[Attribute|QualifiedName] 
	 *             (individualAssignments+=[Individual|QualifiedName] | unnamedIndividualAssignments+=UnnamedIndividual | literalAssignments+=Literal)
	 *         ) | 
	 *         (
	 *             attribute=[Attribute|QualifiedName] 
	 *             (individualAssignments+=[Individual|QualifiedName] | unnamedIndividualAssignments+=UnnamedIndividual) 
	 *             unnamedIndividualAssignments+=UnnamedIndividual? 
	 *             (individualAssignments+=[Individual|QualifiedName]? unnamedIndividualAssignments+=UnnamedIndividual?)*
	 *         ) | 
	 *         (attribute=[Attribute|QualifiedName] (literalAssignments+=Literal literalAssignments+=Literal*)?)
	 *     )
	 */
	protected void sequence_MultipleAttributeAssignment_SingleAttributeAssignment(ISerializationContext context, AttributeAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NonFOClass returns OrderlessClass
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (instantiatedClasses+=[ML2Class|QualifiedName] instantiatedClasses+=[ML2Class|QualifiedName]*)? 
	 *         (superClasses+=[ML2Class|QualifiedName] superClasses+=[ML2Class|QualifiedName]*)? 
	 *         (subordinators+=[ML2Class|QualifiedName] subordinators+=[ML2Class|QualifiedName]*)? 
	 *         ((categorizationType=CategorizationType categorizedClass=[ML2Class|QualifiedName]) | powertypeOf=[ML2Class|QualifiedName])?
	 *     )
	 */
	protected void sequence_NonFOClass_OrderlessClass(ISerializationContext context, OrderlessClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OrderlessClass returns OrderlessClass
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_OrderlessClass(ISerializationContext context, OrderlessClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ENTITY_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureAssignment returns ReferenceAssignment
	 *     ReferenceAssignment returns ReferenceAssignment
	 *
	 * Constraint:
	 *     (
	 *         reference=[Reference|QualifiedName] 
	 *         (
	 *             assignments+=[EntityDeclaration|QualifiedName] | 
	 *             (assignments+=[EntityDeclaration|QualifiedName] assignments+=[EntityDeclaration|QualifiedName]*)
	 *         )
	 *     )
	 */
	protected void sequence_ReferenceAssignment(ISerializationContext context, ReferenceAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CommonFeature returns Reference
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         _type=[ML2Class|QualifiedName] 
	 *         (subsetOf+=[Reference|QualifiedName] subsetOf+=[Reference|QualifiedName]*)? 
	 *         oppositeTo=[Reference|QualifiedName]?
	 *     )
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Reference
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *             _type=[ML2Class|QualifiedName] 
	 *             (subsetOf+=[Reference|QualifiedName] subsetOf+=[Reference|QualifiedName]*)? 
	 *             oppositeTo=[Reference|QualifiedName]?
	 *         ) | 
	 *         (
	 *             name=ID 
	 *             (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *             _type=[ML2Class|QualifiedName] 
	 *             (subsetOf+=[Reference|QualifiedName] subsetOf+=[Reference|QualifiedName]*)? 
	 *             oppositeTo=[Reference|QualifiedName]? 
	 *             regularityType=RegularityFeatureType 
	 *             regulatedFeature=[Feature|QualifiedName]
	 *         )
	 *     )
	 */
	protected void sequence_Reference_RegularityReference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RegularityFeature returns Attribute
	 *     RegularityAttribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         (primitiveType=PrimitiveType | _type=[DataType|QualifiedName]) 
	 *         (subsetOf+=[Attribute|QualifiedName] subsetOf+=[Attribute|QualifiedName]*)? 
	 *         regularityType=RegularityFeatureType 
	 *         regulatedFeature=[Feature|QualifiedName]
	 *     )
	 */
	protected void sequence_RegularityAttribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RegularityFeature returns Reference
	 *     RegularityReference returns Reference
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (lowerBound=ELEMENTBOUND upperBound=ELEMENTBOUND)? 
	 *         _type=[ML2Class|QualifiedName] 
	 *         (subsetOf+=[Reference|QualifiedName] subsetOf+=[Reference|QualifiedName]*)? 
	 *         oppositeTo=[Reference|QualifiedName]? 
	 *         regularityType=RegularityFeatureType 
	 *         regulatedFeature=[Feature|QualifiedName]
	 *     )
	 */
	protected void sequence_RegularityReference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleAttributeAssignment returns AttributeAssignment
	 *
	 * Constraint:
	 *     (
	 *         attribute=[Attribute|QualifiedName] 
	 *         (
	 *             individualAssignments+=[Individual|QualifiedName] | 
	 *             unnamedIndividualAssignments+=UnnamedIndividual | 
	 *             literalAssignments+=Literal | 
	 *             (literalAssignments+=Literal literalAssignments+=Literal*) | 
	 *             (
	 *                 (individualAssignments+=[Individual|QualifiedName] | unnamedIndividualAssignments+=UnnamedIndividual) 
	 *                 individualAssignments+=[Individual|QualifiedName]? 
	 *                 (unnamedIndividualAssignments+=UnnamedIndividual? individualAssignments+=[Individual|QualifiedName]?)*
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_SimpleAttributeAssignment(ISerializationContext context, AttributeAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleAttributeAssignment returns AttributeAssignment
	 *
	 * Constraint:
	 *     (
	 *         attribute=[Attribute|QualifiedName] 
	 *         (individualAssignments+=[Individual|QualifiedName] | unnamedIndividualAssignments+=UnnamedIndividual | literalAssignments+=Literal)
	 *     )
	 */
	protected void sequence_SingleAttributeAssignment(ISerializationContext context, AttributeAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnnamedIndividual returns Individual
	 *
	 * Constraint:
	 *     assignments+=SimpleAttributeAssignment*
	 */
	protected void sequence_UnnamedIndividual(ISerializationContext context, Individual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
