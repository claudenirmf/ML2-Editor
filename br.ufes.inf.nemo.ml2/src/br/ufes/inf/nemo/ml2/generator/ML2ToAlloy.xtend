/**
 * Transformation of an ML2 model to an Alloy model.
 * 
 * @author Fernando Amaral Musso
 */
package br.ufes.inf.nemo.ml2.generator

import com.google.inject.Inject
import java.util.ArrayList
import java.util.HashSet
import java.util.stream.Collectors

import br.ufes.inf.nemo.ml2.model.Attribute
import br.ufes.inf.nemo.ml2.model.AttributeAssignment
import br.ufes.inf.nemo.ml2.model.CategorizationType
import br.ufes.inf.nemo.ml2.model.Class
import br.ufes.inf.nemo.ml2.model.Constraint
import br.ufes.inf.nemo.ml2.model.Feature
import br.ufes.inf.nemo.ml2.model.FirstOrderClass
import br.ufes.inf.nemo.ml2.model.GeneralizationSet
import br.ufes.inf.nemo.ml2.model.HighOrderClass
import br.ufes.inf.nemo.ml2.model.HigherOrderClass
import br.ufes.inf.nemo.ml2.model.Individual
import br.ufes.inf.nemo.ml2.model.Model
import br.ufes.inf.nemo.ml2.model.OrderlessClass
import br.ufes.inf.nemo.ml2.model.PrimitiveType
import br.ufes.inf.nemo.ml2.model.Reference
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment
import br.ufes.inf.nemo.ml2.model.RegularityAttribute
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType
import br.ufes.inf.nemo.ml2.model.RegularityReference

class ML2ToAlloy {
	@Inject extension OCLToAlloy
	
	/**
	 * Generates the file <modelname>.als containing Alloy code, derived from the transformation
	 * of the ML2 Model provided by the file <modelname>.ml2.
	 * 
	 * @param ml2model the ML2 Model to be transformed.
	 */
	def generateAlloyModel(Model ml2model) {'''
		module «ml2model.name»
		open MLTStar
		open utils
		
		«FOR element : ml2model.elements»
			«generateAlloyElement(element)»
		«ENDFOR»
		«generateDisjointIndividualsFact(ml2model)»
		«generateDisjointDisconnectedHierarchiesFact(ml2model)»
		«generateUnwantedInstantiationsFact(ml2model)»
		
	'''
	}
	
	/**
	 * Generates the file MLTStar.als, containing the Alloy formalization of the MLT* theory
	 * developed by Victorio Carvalho, João Paulo Almeida and Claudenir Fonseca.
	 * 
	 * A new section named NOTABLE CONSTANTS is added, in order to make explicit the use of
	 * signatures for the MLT* basic ordered types used in the Alloy model being generated.
	 * 
	 * @param ml2model the ML2 Model (used to add signatures to the notable constants section).
	 */
	def generateMLTStarAlloyModel(Model model) {'''
		/**
		 *	MLT*
		 *	
		 *	MLT* extends basic MLT. The domain of quantification is a superset of Basic MLT,
		 *	admitting types that are not stratified. This opens up the possibility of the types
		 *	"Entity" (the type of all entities, i.e., the universe), "Type" (the type of all
		 *	types), "OrderedType" (which is the type of all types in Basic MLT), etc.
		 *
		 *	Some known limitations of this specification are:
		 *	  - Static classification only;
		 *	  - No support for entity's features (attributes and domain relations).
		 *
		 *	Authors:
		 *	  Victorio Carvalho - Basic MLT
		 *	  João Paulo Almeida - Contributions to Basic MLT and initial developments of MLT*
		 *	  Claudenir Fonseca - Revision and refactoring of MLT* and further developments
		 */

		module MLTStar

		/********************************************************************************************
		 * UTILS - PREDICATES AND FUNCTIONS
		 * The predicates below are used throughout the code improving its readability.
		 *******************************************************************************************/

		pred iof[x,y: Entity] 					{ x in iof.y }
		pred specializes[x,y: Entity] 			{ x in specializes.y }
		pred properSpecializes[ x,y: Entity] 	{ x in properSpecializes.y }
		pred powertypeOf[x,y: Entity] 			{ x in powertypeOf.y }
		pred categorizes[x,y: Entity] 			{ x in categorizes.y }
		pred compCategorizes[x,y: Entity] 		{ x in compCategorizes.y }
		pred disjCategorizes[x,y: Entity] 		{ x in disjCategorizes.y }
		pred partitions[x,y: Entity] 			{ x in partitions.y }
		pred isSubordinatedTo[x,y: Entity] 		{ x in isSubordinatedTo.y }
		pred disjointExtentions[t,t': Type] 	{ no iof.t & iof.t' }
		pred disjoint_[x,y: Entity] 			{ no x & y }

		/********************************************************************************************
		 * MODEL SPECIFICATION
		 * Signatures and Constraints.
		 *******************************************************************************************/

		/**
		 *	Entity
		 *
		 *	Represents an entity, with all possible relations that may be established between
		 *	entities according to the theory.
		 */
		sig Entity { 
			iof: set Entity,
			directIof: set Entity
		}

		/**
		 *	Direct instantiations are used to simplify the visualization of	instantiations.
		 */
		fact {
			all e: Entity | e.directIof = (e.iof) - (e.iof).properSpecializes
		}

		/**
		 *	Individual
		 *
		 *	An individual is an entity that has no possible instances. The signature Individual
		 *	does not account for the entity Individual, which is going to be specified later
		 *	through the signature Individual_ (with an underscore at the end).
		 */
		sig Individual in Entity {
		}

		fact individualDef {
			all x: Entity | (x in Individual iff no iof.x)
		}

		/**
		 *	Type
		 *
		 *	A type is an entity that has instances. Also, types must be in an instantiation
		 *	chain that eventually leads to some individual. As Individual, Type does not
		 *	account for the entity type, which is specified later as Type_.
		 */
		sig Type in Entity {
		 	specializes: set Type,
			properSpecializes: set Type,
			isSubordinatedTo: set Type,
			powertypeOf: set Type,
			categorizes: set Type,
			compCategorizes: set Type,
			disjCategorizes: set Type,
			partitions: set Type,
			directSpecializes: set Entity,
			isDirectSubordinateTo: set Type,
			directCategorizes: set Type
		}

		fact {
			all e: Entity | e in Type iff some (iof.e)
		}
		
		/**
		 *	Types are ultimately founded upon individuals.
		 */
		fact typeWellFounded {
			all t: Type | t in Type iff some (^iof.t & Individual)
		}

		/**
		 *	Direct relations are used to improve visualization of runs and checkings.
		 */
		fact {
			all t: Type | t.directSpecializes = (t.properSpecializes) - (t.properSpecializes).properSpecializes
			all t: Type | t.isDirectSubordinateTo = (t.isSubordinatedTo) - (t.isSubordinatedTo).properSpecializes
			all t: Type | t.directCategorizes = ((t.categorizes) - (t.categorizes+t.powertypeOf).properSpecializes)
		}

		/**
		 *	BasicType
		 *
		 *	Basic types are the highest entities in their specialization chain of any instance
		 *	order. That is, for any given type order there is one entity that every ordered
		 *	type specializes. In other words, a basic type is a type at the top of the 
		 *	hierarchy of specializations of types that are "stratified" in Basic MLT.
		 */
		sig BasicType in Type {
		}

		fact {
			all b: Type | b in BasicType iff ((all e: Entity | iof[e,b] iff e in Individual) or (some lot: BasicType | powertypeOf[b,lot]))
		}

		/**
		 *	Not necessary in Basic MLT but saves up to 15 seconds.
		 */
		fact noIofLoopForBasicTypes	{
			all x: BasicType | x not in x.^iof
		}

		/**
		 *	OrderedType
		 *
		 *	A type is a ordered type iff it is a specialization of a basic type.
		 */
		sig OrderedType in Type {
		}

		fact {
			all t: Type | t in OrderedType iff (some b: BasicType | specializes[t,b])
		}

		/**
		 *	OrderlessType
		 *
		 *	A type is a orderless type iff it is not an ordered one.
		 */
		sig OrderlessType in Type {
		}

		fact {
			all t: Type | t in OrderlessType iff (no b: BasicType | specializes[t,b])
		}

		/********************************************************************************************
		 * CONSTANT MODEL ENTITIES
		 * Signatures to reference the entities which instances are members of the sets defined above.
		 *******************************************************************************************/

		/**
		 *	Defining the "Individual_" basic type.
		 */
		sig Individual_ in Type {
		}

		fact {
			all e: Entity | e in Individual_ iff (all e': Entity | iof[e',e] iff no iof.e')
		}

		/**
		 *	Defining the type "Type", whose instances are all types.
		 */
		sig Type_ in Entity {
		}

		fact {
			all t: Entity | t in Type_ iff (all e: Entity | iof[e,t] iff e in Type)
		}

		/**
		 *	Defining the universal type "Entity".
		 */
		sig Entity_ in Entity {
		}

		fact {
			all e: Entity | e in Entity_ iff (all e': Entity | iof[e',e] iff e' in Entity)
		}

		/**
		 *	Defining the type "OrderedType", whose instances are all types whose instances
		 *	are at the same order. These are the types in Basic MLT.
		 */
		sig OrderedType_ in Entity {
		}

		fact {
			all e: Entity | e in OrderedType_ iff (all e': Entity | iof[e',e] iff e' in OrderedType)
		}

		/**
		 *	Defining the type "OrderlessType", whose instances are all types whose instances
		 *	span through different orders. These are the types in Basic MLT.
		 */
		sig OrderlessType_ in Entity {
		}

		fact {
			all e: Entity | e in OrderlessType_ iff (e in Type and (all e': Entity | iof[e',e] iff e' in OrderlessType))
		}

		/********************************************************************************************
		 * DEFINITIONS
		 *******************************************************************************************/

		/**
		 *	Axiom A7 - Two types are equal iff the set of all their possible instances is the same
		 */
		fact typesEquivalence {
			all t1,t2: Type | (t1 = t2 iff iof.t1 = iof.t2)
		}

		/**
		 *	Axiom A8 - Specialization Definition: t1 specializes t2 iff all instances of t1 are also
		 *	instances of t2.
		 */
		fact specializationDefinition {
			all t1,t2: Type | specializes[t1,t2] iff (all e: iof.t1 | iof[e,t2])
		}

		/**
		 *	Axiom A9 - Proper Specialization Definition: t1 proper specializes t2 iff t1 specializes
		 *	t2 and is different from it.
		 */
		fact properSpecializationDefinition {
			all t1,t2: Type | properSpecializes[t1,t2] iff (specializes[t1,t2] and t1 != t2)
		}

		/**
		 *	Axiom A10 - Subordination Definition: t1 is subordinate to t2 iff every instance of t1
		 *	specializes an instance of t2.
		 */
		fact subordinationDefinition {
			all t1,t2: Type | isSubordinatedTo[t1,t2] iff (all t3: iof.t1 | some (t3.properSpecializes & iof.t2))
		}

		/**
		 *	Axiom A11 - Powertype Definition: a type t1 is powertype of a type t2 iff all instances of
		 *	t1 are specializations of t2 and all possible specializations of t2 are instances of t1.
		 */
		fact powertypeOfDefinition {
			all pwt,t: Type | powertypeOf[pwt,t] iff (all t': Entity | (iof[t',pwt] iff specializes[t',t]))
		}

		/**
		 *	Axiom A12 - Categorization Definition: a type t1 categorizes a type t2 iff all instances
		 *	of t1 are proper specializations of t2.
		 */
		fact categorizationDefinition {
			all t1,t2: Type | categorizes[t1,t2] iff iof.t1 in properSpecializes.t2
		}

		/**
		 *	Axiom A13 - Complete Categorization Definition: a type t1 completely categorizes a type t2
		 *	iff t1 categorizes t2 and for every instance of t2 there is some type that is instantiated
		 *	by it and is instance of t1.
		 */
		fact completeCategorizationDefinition {
			all t1,t2: Type | compCategorizes[t1,t2] iff (categorizes[t1,t2] and (all e: iof.t2 | some e.iof & iof.t1))
		}

		/**
		 *	Axiom A14 - Disjoint Categorization Definition: a type t1 disjointly categorizes a type t2
		 *	iff t1 categorizes t2 and for any pair of different types that are instances of t1 implies
		 *	this pair has disjoint extensions.
		 */
		fact disjointCategorizationDefinition {
			all t1,t2: Type | disjCategorizes[t1,t2] iff (categorizes[t1,t2] and (all t3,t4: iof.t1 | t3 != t4 implies disjoint_[iof.t3,iof.t4]))
		}

		/**
		 *	Axiom A15 - Partitions Definition: a type t1 partitions a type t2 iff t1 disjointly categorizes
		 *	t2 and t1 completely categorizes t2.
		 */
		fact partitionsDefinition {
			all t1,t2: Entity | partitions[t1,t2] iff (disjCategorizes[t1,t2] and compCategorizes[t1,t2])
		}

		/********************************************************************************************
		 * USEFUL CONSTRAINTS
		 * Some constraints for cutting out unwanted models.
		 *******************************************************************************************/

		fact allEntitiesConnectedByInstantiation {
			let navigableiof = iof + ~iof | all x,y: Entity | (x in y.*navigableiof)
		}

		fact someIndividuals {
			some e: Entity | no iof.e
		}

		fact someBasicTypes {
			some BasicType
		}

		/********************************************************************************************
		 * NOTABLE CONSTANTS
		 * Signatures to represent the most used Ordered Types.
		 *******************************************************************************************/

		«generateNotableConstantsSection(model)»
	'''	
	}
	
	/**
	 * Generates the file utils.als, containing useful extra elements for the transformation.
	 * 
	 * The Boolean enumeration, for instance, is used to map ML2 booleans to Alloy, given that
	 * Alloy does not support booleans primitively.
	 * 
	 * Additional elements may be added to this file during the development of extensions to
	 * this model transformation.
	 */
	def generateUtilsAlloyModel() {'''
		module utils
		
		enum Boolean {
			true, false
		}
		
		pred TRUE {}
		pred FALSE { not TRUE }
		
		fun abs [self: Int] : Int {
			self < 0 implies negate[self] else self
		}
		
		fun min [self, i: Int] : Int {
			let a = int[self], b = int[i] | a <= b implies a else b
		}
		
		fun max [self, i: Int] : Int {
			let a = int[self], b = int[i] | a <= b implies b else a
		}
	'''
	}
	
	/************************************************************************************************
	 * Dispatch methods generateAlloyElement().
	 * 
	 * The following methods generate an Alloy element for each ML2 model element.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 element being
	 * considered.
	 ***********************************************************************************************/
	
	/**
	 * Generates the Alloy counterpart of an ML2 Individual element.
	 * 
	 * @param individual the ML2 Individual element to be transformed.
	 */
	def dispatch generateAlloyElement(Individual individual) {'''
		«generateAlloySingleton(individual)»
	'''
	}
	
	/**
	 * Generates the Alloy counterpart of an ML2 Class element.
	 * 
	 * @param ml2class the ML2 Class element to be transformed.
	 */
	def dispatch generateAlloyElement(Class _class) {'''
		«generateAlloySignature(_class)»
		«generateAlloySingleton(_class)»
		fact «_class.name»ReifiedDefinition {
			all e: Entity | e in «_class.name»Reified iff (all e': Entity | iof[e',e] iff e' in «_class.name»)
		}
		
		«generateProperSpecializationFact(_class)»
		«generatePowertypeFact(_class)»
		«generateCategorizationFact(_class)»
		«generateSubordinationFact(_class)»
		«FOR classifier : _class.classifiers»
			«IF classifier instanceof HigherOrderClass && (classifier as HigherOrderClass).categorizedClass !== null»
				«FOR assignment : _class.assignments»
					«generateRegularityFeatureFact(assignment, _class)»
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
	'''
	}

	/**
	 * Generates the Alloy counterpart of an ML2 Generalization Set element.
	 * 
	 * @param genset the ML2 Generalization Set element to be transformed.
	 */
	def dispatch generateAlloyElement(GeneralizationSet genset) {
		if(genset.isDisjoint) {
			if(genset.isComplete) {'''
				fact DisjointCompleteGenSet«genset.name» {
					disjoint[«genset.specifics.stream()
											  .map[it.name]
											  .collect(Collectors.joining(","))»]
					«genset.general.name» = «genset.specifics.stream()
									 					 	 .map[it.name]
									 					 	 .collect(Collectors.joining("+"))»
				}
				
			'''
			} else {'''
				fact DisjointGenSet«genset.name» {
					disjoint[«genset.specifics.stream()
											  .map[it.name]
											  .collect(Collectors.joining(","))»]
				}
				
			'''	
			}
		} else if(genset.isComplete) {'''
			fact CompleteGenSet«genset.name» {
				«genset.general.name» = «genset.specifics.stream()
													 	 .map[it.name]
													 	 .collect(Collectors.joining("+"))»
			}
			
		'''	
		}
	}
	
	/**
	 * Generates the Alloy counterpart of an ML2 Constraint element.
	 * (The implementation of this method can be found in br.ufes.inf.nemo.ml2.generator.OCLToAlloy)
	 * 
	 * @param constraint the ML2 Constraint element to be transformed.
	 */
	def dispatch generateAlloyElement(Constraint constraint) {'''
		«generateAlloyConstraint(constraint)»
	'''
	}

	/************************************************************************************************
	 * Dispatch methods generateAlloySignature().
	 * 
	 * The following methods generate an Alloy signature for each ML2 Class element.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 Class element being
	 * considered.
	 ***********************************************************************************************/
	
	/**
	 * Generates an Alloy signature related to an ML2 First-Order Class element.
	 * 
	 * @param foclass the ML2 First-Order Class element to be transformed.
	 */
	def dispatch generateAlloySignature(FirstOrderClass foclass) {
		switch foclass.superClasses.size {
			case 0:'''
				«IF foclass.features.size == 0»
					sig «foclass.name» in Individual {}
				«ELSE»
					sig «foclass.name» in Individual {
						«FOR feature : foclass.features SEPARATOR ','»
							«generateAlloySignatureFields(feature)»
						«ENDFOR»
					}
				«ENDIF»
				
			'''		
			case 1:'''
				«IF foclass.features.size == 0»
					sig «foclass.name» in «foclass.superClasses.head.name» {}
				«ELSE»
					sig «foclass.name» in «foclass.superClasses.head.name» {
						«FOR feature : foclass.features SEPARATOR ','»
							«generateAlloySignatureFields(feature)»
						«ENDFOR»
					}
				«ENDIF»
				
			'''
			default:'''
				«IF foclass.features.size == 0»
					sig «foclass.name» in Individual {}
				«ELSE»			
					sig «foclass.name» in Individual {
						«FOR feature : foclass.features SEPARATOR ','»
							«generateAlloySignatureFields(feature)»
						«ENDFOR»
					}
				«ENDIF»
				
				fact «foclass.name»SuperClasses {
					all x: «foclass.name» | x in («foclass.superClasses.stream()
																	   .map[it.name]
																	   .collect(Collectors.joining(" & "))»)
				}
				
			'''
		}
	}
	
	/**
	 * Generates an Alloy signature related to an ML2 High-Order Class element.
	 * 
	 * @param hoclass the ML2 High-Order Class element to be transformed.
	 */
	def dispatch generateAlloySignature(HighOrderClass hoclass) {
		switch hoclass.superClasses.size {
			case 0:'''
				«IF hoclass.features.size == 0»
					sig «hoclass.name» in Order«hoclass.order - 1»Type {}
				«ELSE»
					sig «hoclass.name» in Order«hoclass.order - 1»Type {
						«FOR feature : hoclass.features SEPARATOR ','»
							«generateAlloySignatureFields(feature)»
						«ENDFOR»
					}
				«ENDIF»
				
			'''			
			case 1:'''
				«IF hoclass.features.size == 0»
					sig «hoclass.name» in «hoclass.superClasses.head.name» {}
				«ELSE»
					sig «hoclass.name» in «hoclass.superClasses.head.name» {
						«FOR feature : hoclass.features SEPARATOR ','»
							«generateAlloySignatureFields(feature)»
						«ENDFOR»
					}
				«ENDIF»
				
			'''		
			default:'''
				«IF hoclass.features.size == 0»
					sig «hoclass.name» in Order«hoclass.order - 1»Type {}
				«ELSE»
					sig «hoclass.name» in Order«hoclass.order - 1»Type {
						«FOR feature : hoclass.features SEPARATOR ','»
							«generateAlloySignatureFields(feature)»
						«ENDFOR»
					}
				«ENDIF»
				
				fact «hoclass.name»SuperClasses {
					all x: «hoclass.name» | x in («hoclass.superClasses.stream()
																	   .map[it.name]
																	   .collect(Collectors.joining(" & "))»)
				}
				
			'''
		}
	}
	
	/**
	 * Generates an Alloy signature related to an ML2 Orderless Class element.
	 * 
	 * @param olclass the ML2 Orderless Class element to be transformed.
	 */
	def dispatch generateAlloySignature(OrderlessClass olclass) {'''
		«IF olclass.features.size == 0»
			sig «olclass.name» in OrderlessType {}
		«ELSE»
			sig «olclass.name» in OrderlessType {
				«FOR feature : olclass.features SEPARATOR ','»
					«generateAlloySignatureFields(feature)»
				«ENDFOR»
			}
		«ENDIF»
		
	'''
	}
	
	/************************************************************************************************
	 * Dispatch methods generateAlloySignatureFields().
	 * 
	 * The following methods generate Alloy signature fields for each ML2 Feature element, declared
	 * within an ML2 Class.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 Feature element being
	 * considered.
	 ***********************************************************************************************/
	
	/**
	 * Generates an Alloy signature field related to an ML2 Attribute element.
	 * 
	 * @param attribute the ML2 Attribute element to be transformed.
	 */
	def dispatch generateAlloySignatureFields(Attribute attribute) {
		if(attribute._type !== null) {'''
			«attribute.name»: «decideMultiplicityKeyword(attribute)»«attribute._type.name»
		'''
		} else {
			switch attribute.primitiveType {
				case PrimitiveType.BOOLEAN:'''
					«attribute.name»: «decideMultiplicityKeyword(attribute)»Boolean
				'''
				case PrimitiveType.NUMBER:'''
					«attribute.name»: «decideMultiplicityKeyword(attribute)»Int
				'''
				case PrimitiveType.STRING:'''
					«attribute.name»: «decideMultiplicityKeyword(attribute)»String
				'''
			}
		}
	}
	
	/**
	 * Generates an Alloy signature field related to an ML2 Reference element.
	 * 
	 * @param reference the ML2 Reference element to be transformed.
	 */
	def dispatch generateAlloySignatureFields(Reference reference) {'''
		«reference.name»: «decideMultiplicityKeyword(reference)»«reference._type.name»
	'''
	}
	
	/************************************************************************************************
	 * Dispatch methods generateAlloySingleton().
	 * 
	 * The following methods generate an Alloy singleton for each ML2 Individual or Class element.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 Individual or Class
	 * element being considered.
	 ***********************************************************************************************/
	
	/**
	 * Generates an Alloy singleton related to an ML2 Individual element.
	 * 
	 * @param individual the ML2 Individual element to be transformed.
	 */
	def dispatch generateAlloySingleton(Individual individual) {
		switch individual.classifiers.size {
			case 1:'''
				one sig «individual.name» in «individual.classifiers.head.name» {}
				
				«generateAlloySingletonAssignmentsFact(individual)»
			'''		
			default:'''
				one sig «individual.name» in Individual {}
				
				«generateAlloySingletonAssignmentsFact(individual)»
				fact «individual.name»InstantiatedClasses {
					«individual.name» in («individual.classifiers.stream()
																		 .map[it.name]
																		 .collect(Collectors.joining(" & "))»)
				}
				
			'''
		}
	}
	
	/**
	 * Generates an Alloy singleton related to an ML2 First-Order Class element.
	 * 
	 * @param foclass the ML2 First-Order Class element to be transformed.
	 */
	def dispatch generateAlloySingleton(FirstOrderClass foclass) {
		switch foclass.classifiers.size {
			case 0:'''
				one sig «foclass.name»Reified in Order1Type {}
				
				«generateAlloySingletonAssignmentsFact(foclass)»
			'''		
			case 1:'''
				one sig «foclass.name»Reified in «foclass.classifiers.head.name» {}
				
				«generateAlloySingletonAssignmentsFact(foclass)»
			'''		
			default:'''
				one sig «foclass.name»Reified in Order1Type{}
				
				«generateAlloySingletonAssignmentsFact(foclass)»
				fact «foclass.name»InstantiatedClasses {
					all x: «foclass.name»Reified | x in («foclass.classifiers.stream()
																					 .map[it.name]
																					 .collect(Collectors.joining(" & "))»)
				}
				
			'''
		}
	}
	
	/**
	 * Generates an Alloy singleton related to an ML2 High-Order Class element.
	 * 
	 * @param hoclass the ML2 High-Order Class element to be transformed.
	 */
	def dispatch generateAlloySingleton(HighOrderClass hoclass) {
		switch hoclass.classifiers.size {
			case 0:'''
				one sig «hoclass.name»Reified in Order«hoclass.order»Type {}
				
				«generateAlloySingletonAssignmentsFact(hoclass)»
			'''			
			case 1:'''
				one sig «hoclass.name»Reified in «hoclass.classifiers.head.name» {}
				
				«generateAlloySingletonAssignmentsFact(hoclass)»
			'''			
			default:'''
				one sig «hoclass.name»Reified in Order«hoclass.order»Type {}
				
				«generateAlloySingletonAssignmentsFact(hoclass)»
				fact «hoclass.name»InstantiatedClasses {
					all x: «hoclass.name»Reified | x in («hoclass.classifiers.stream()
																					 .map[it.name]
																					 .collect(Collectors.joining(" & "))»)
				}
				
			'''
		}
	}
	
	/**
	 * Generates an Alloy singleton related to an ML2 Orderless Class element.
	 * 
	 * @param olclass the ML2 Orderless Class element to be transformed.
	 */
	def dispatch generateAlloySingleton(OrderlessClass olclass) {'''
		one sig «olclass.name»Reified in OrderlessType {}
		
		«generateAlloySingletonAssignmentsFact(olclass)»
	'''
	}
	
	/************************************************************************************************
	 * Dispatch methods generateAlloySingletonAssignmentsFact().
	 * 
	 * The following methods generate an Alloy fact for each ML2 Individual or Class element, in
	 * order to hold its assignments.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 Individual or Class
	 * element being considered.
	 ***********************************************************************************************/

	/**
	 * Generates an Alloy fact related to an ML2 Individual element's assignments.
	 * 
	 * @param individual the ML2 Individual element to be considered.
	 */	
	def dispatch generateAlloySingletonAssignmentsFact(Individual individual) {
		if(individual.assignments.size != 0) {'''
			fact {
				«FOR assignment : individual.assignments»
					«individual.name».«generateAlloySingletonAssignment(assignment)»
				«ENDFOR»
			}
			
		'''	
		}
	}
	
	/**
	 * Generates an Alloy fact related to an ML2 Class element's assignments.
	 * 
	 * @param ml2class the ML2 Class element to be considered.
	 */
	def dispatch generateAlloySingletonAssignmentsFact(Class ml2class) {
		if(ml2class.assignments.size != 0) {'''
			fact {
				«FOR assignment : ml2class.assignments»
					«ml2class.name»Reified.«generateAlloySingletonAssignment(assignment)»
				«ENDFOR»
			}
			
		'''	
		}
	}	
	
	/************************************************************************************************
	 * Dispatch methods generateAlloySingletonAssignment().
	 * 
	 * The following methods generate Alloy singleton assignments for each ML2 FeatureAssignment
	 * element, assigned within an ML2 Individual or Class.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 FeatureAssignment
	 * element being considered.
	 ***********************************************************************************************/

	/**
	 * Generates an Alloy singleton assignment related to an ML2 AttributeAssignment element.
	 * 
	 * @param attributeAssignment the ML2 AttributeAssignment element to be transformed.
	 */
	def dispatch generateAlloySingletonAssignment(AttributeAssignment attributeAssignment) {
		if(attributeAssignment.datatypeValues.size != 0) {'''
			«attributeAssignment.attribute.name» = «attributeAssignment.datatypeValues.stream()
																							 .map[it.name]
																							 .collect(Collectors.joining(" + "))»
		'''
		} else {
			switch attributeAssignment.attribute.primitiveType {
				case PrimitiveType.BOOLEAN:'''
					«attributeAssignment.attribute.name» = «attributeAssignment.booleanValues.stream()
																							 .map[it.toString]
																							 .collect(Collectors.joining(" + "))»
				'''
				case PrimitiveType.NUMBER:'''
					«attributeAssignment.attribute.name» = «attributeAssignment.numberValues.stream()
																	  						.map[it.intValue.toString]
																	  						.collect(Collectors.joining(" + "))»
				'''
				case PrimitiveType.STRING:'''
					«attributeAssignment.attribute.name» = «attributeAssignment.stringValues.stream()
																	  						 .map["\""+it+"\""]
																	  						 .collect(Collectors.joining(" + "))»
				'''
			}
		}
	}
	
	/**
	 * Generates an Alloy singleton assignment related to an ML2 ReferenceAssignment element.
	 * 
	 * @param referenceAssignment the ML2 ReferenceAssignment element to be transformed.
	 */
	def dispatch generateAlloySingletonAssignment(ReferenceAssignment referenceAssignment) {'''
		«referenceAssignment.reference.name» = «referenceAssignment.values.stream()
																			   .map[it.name]
																			   .collect(Collectors.joining(" + "))»
	'''
	}
	
	/************************************************************************************************
	 * Dispatch methods generateProperSpecializationFact().
	 * 
	 * The following methods generate an Alloy fact for each ML2 Class element.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 Class element being
	 * considered.
	 ***********************************************************************************************/
	 
	 /**
	 * Generates an Alloy fact related to an ML2 Proper Specialization relation of a First-Order Class element.
	 * 
	 * @param foclass the ML2 First-Order Class element to be considered.
	 */
	def dispatch generateProperSpecializationFact(FirstOrderClass foclass) {
		if(foclass.superClasses.size == 0) {'''
			fact «foclass.name»ReifiedProperSpecialization {
				properSpecializes[«foclass.name»Reified,Individual_]
			}
			
		'''
		} else {'''
			fact «foclass.name»ReifiedProperSpecialization {
				«FOR superClass : foclass.superClasses»
					properSpecializes[«foclass.name»Reified,«superClass.name»Reified]
				«ENDFOR»
			}
			
		'''	
		}
	}

	/**
	 * Generates an Alloy fact related to an ML2 Proper Specialization relation of a High-Order Class element.
	 * 
	 * @param hoclass the ML2 High-Order Class element to be considered.
	 */
	def dispatch generateProperSpecializationFact(HighOrderClass hoclass) {
		if(hoclass.superClasses.size == 0) {'''
			fact «hoclass.name»ReifiedProperSpecialization {
				properSpecializes[«hoclass.name»Reified,Order«hoclass.order - 1»TypeReified]
			}
			
		'''
		} else {'''
			fact «hoclass.name»ReifiedProperSpecialization {
				«FOR superClass : hoclass.superClasses»
					properSpecializes[«hoclass.name»Reified,«superClass.name»Reified]
				«ENDFOR»
			}
			
		'''	
		}
	}
	
	/**
	 * Generates an Alloy fact related to an ML2 Proper Specialization relation of a Orderless Class element.
	 * 
	 * @param olclass the ML2 Orderless Class element to be considered.
	 */
	def dispatch generateProperSpecializationFact(OrderlessClass olclass) {'''
		fact «olclass.name»ReifiedProperSpecialization {
			properSpecializes[«olclass.name»Reified,OrderlessType_]
		}
		
	'''
	}
	
	/************************************************************************************************
	 * Dispatch methods generateRegularityFeatureFact().
	 * 
	 * The following methods generate an Alloy fact for each ML2 FeatureAssignment element regulated
	 * by an ML2 Feature element.
	 * 
	 * The specific dispatch method is called depending on the type of the ML2 FeatureAssignment
	 * element being considered.
	 ***********************************************************************************************/
	
	/**
	 * Generates an Alloy fact related to an ML2 AttributeAssignment element regulated by an ML2 Attribute element.
	 * 
	 * @param attributeAssignment the ML2 AttributeAssignment element with regulated feature.
	 * @param ml2class the ML2 Class element with regulator feature.
	 */
	def dispatch generateRegularityFeatureFact(AttributeAssignment attributeAssignment, Class ml2class) {
		if(attributeAssignment.attribute instanceof RegularityAttribute) {
			val regAtt = attributeAssignment.attribute as RegularityAttribute
			
			switch regAtt.regularityType {
				case RegularityFeatureType.DETERMINES_VALUE:'''
					fact «regAtt.name»Regulates«regAtt.regulates.name» {
						all x: «ml2class.name» | x.«regAtt.regulates.name» = «ml2class.name»Reified.«attributeAssignment.attribute.name»
					}
					
				'''
				case RegularityFeatureType.DETERMINES_MIN_VALUE:'''
					fact «regAtt.name»Regulates«regAtt.regulates.name» {
						all x: «ml2class.name» | x.«regAtt.regulates.name» >= «ml2class.name»Reified.«attributeAssignment.attribute.name»
					}
					
				'''
				case RegularityFeatureType.DETERMINES_MAX_VALUE:'''
					fact «regAtt.name»Regulates«regAtt.regulates.name» {
						all x: «ml2class.name» | x.«regAtt.regulates.name» <= «ml2class.name»Reified.«attributeAssignment.attribute.name»
					}
					
				'''
				default:''''''
			}
		}
	}
	
	/**
	 * Generates an Alloy fact related to an ML2 ReferenceAssignment element regulated by an ML2 Reference element.
	 * 
	 * @param referenceAssignment the ML2 ReferenceAssignment element with regulated feature.
	 * @param ml2class the ML2 Class element with regulator feature.
	 */
	def dispatch generateRegularityFeatureFact(ReferenceAssignment referenceAssignment, Class ml2class) {
		if((referenceAssignment.reference as RegularityReference).regulates !== null) {
			val regRef = referenceAssignment.reference as RegularityReference
			
			switch regRef.regularityType {
				case RegularityFeatureType.DETERMINES_TYPE:'''
					fact «regRef.name»Regulates«regRef.regulates.name» {
						all x: «ml2class.name» | x.«regRef.regulates.name» = «ml2class.name»Reified.«regRef.name»
					}
					
				'''
				default:''''''
			}
		}
	}

	/************************************************************************************************
	 * The following methods generate an Alloy fact for each ML2 cross-level relation.
	 ***********************************************************************************************/

	/**
	 * Generates an Alloy fact related to an ML2 Powertype cross-level relation.
	 * 
	 * @param ml2class the ML2 Class element to be considered.
	 */
	def generatePowertypeFact(Class _class) {
		if (_class instanceof HigherOrderClass) {
			if (_class.powertypeOf !== null) {
				'''
					fact «_class.name»Powertype {
						powertypeOf[«_class.name»Reified,«_class.powertypeOf.name»Reified]
					}
					
				'''
			}
		}
	}
	
	/**
	 * Generates an Alloy fact related to an ML2 Subordination cross-level relation.
	 * 
	 * @param ml2class the ML2 Class element to be considered.
	 */
	def generateSubordinationFact(Class _class) {
		if (_class instanceof HigherOrderClass) {
			if (_class.subordinators.size != 0) {
				'''
					fact «_class.name»Subordination {
						«FOR subordinator : _class.subordinators»
							isSubordinatedTo[«_class.name»Reified,«subordinator.name»Reified]
						«ENDFOR»
					}
					
				'''
			}
		}
	}
	
	/**
	 * Generates an Alloy fact related to an ML2 Categorization cross-level relation.
	 * 
	 * @param ml2class the ML2 Class element to be considered.
	 */
	def generateCategorizationFact(Class _class) {
		if (_class instanceof HigherOrderClass) {
			if (_class.categorizedClass !== null) {
				switch _class.categorizationType {
					case CategorizationType.CATEGORIZER: '''
						fact «_class.name»Categorization {
							categorizes[«_class.name»Reified,«_class.categorizedClass.name»Reified]
						}
						
					'''
					case CategorizationType.COMPLETE_CATEGORIZER: '''
						fact «_class.name»CompleteCategorization {
							compCategorizes[«_class.name»Reified,«_class.categorizedClass.name»Reified]
						}
						
					'''
					case CategorizationType.DISJOINT_CATEGORIZER: '''
						fact «_class.name»DisjointCategorization {
							disjCategorizes[«_class.name»Reified,«_class.categorizedClass.name»Reified]
						}
						
					'''
					case CategorizationType.PARTITIONER: '''
						fact «_class.name»Partition {
							partitions[«_class.name»Reified,«_class.categorizedClass.name»Reified]
						}
						
					'''
				}
			}
		}
	}

	/************************************************************************************************
	 * The following methods add additional facts necessary to keep the consistency of the Alloy
	 * model being generated.
	 ***********************************************************************************************/
	
	/**
	 * Generates an Alloy fact to ensure the disjointness of all individuals.
	 * 
	 * @param ml2model the ML2 Model to be considered.
	 */
	def generateDisjointIndividualsFact(Model ml2model) {
		var individualsToInclude = new ArrayList<Individual>()
		for(individual : ml2model.elements.filter(Individual)) {
				individualsToInclude.add(individual);
		}
		if(individualsToInclude.size > 1) {'''
			fact DisjointIndividuals {
				disjoint[«
				»«FOR i : individualsToInclude SEPARATOR ","»«
					»«i.name»«
				»«ENDFOR»«
				»]
			}
			
		'''
		}
	}

	/**
	 * Generates an Alloy fact to ensure the disjointness of disconnected hierarchies.
	 * 
	 * @param ml2model the ML2 Model to be considered.
	 */	
	def generateDisjointDisconnectedHierarchiesFact(Model ml2model) {
		var disconnectedHierarchies = new ArrayList<HashSet<Class>>()
		for(ml2class : ml2model.elements.filter(Class)) {
			var ml2classesArray = new ArrayList<Class>()
			var hierarchy = new HashSet<Class>()
			ml2classesArray.add(ml2class)
			while(ml2classesArray.size() != 0) {
				var aux = ml2classesArray.remove(0)
				hierarchy.add(aux)
				for(superClass : aux.superClasses) {
					ml2classesArray.add(superClass)
				}
			}
			var hierarchiesToRemove = new ArrayList<HashSet<Class>>()
			for(h : disconnectedHierarchies){
				var intersection = new HashSet<Class>(hierarchy)
				intersection.retainAll(h)
				if(intersection.size() != 0) {
					hierarchy.addAll(h)
					hierarchiesToRemove.add(h)
				}
			}
			disconnectedHierarchies.add(hierarchy)
			for(h : hierarchiesToRemove) {
				disconnectedHierarchies.remove(h)
			}
		}
		if(disconnectedHierarchies.size() > 1) {'''
			fact DisjointDisconnectedHierarchies {
				disjoint[«
				»«FOR h : disconnectedHierarchies SEPARATOR ","»«
					»«IF h.size() == 1»«
						»«FOR c : h»«
							»«c.name»«
						»«ENDFOR»«
					»«ELSE»«
						»«FOR c : h BEFORE "(" SEPARATOR "+" AFTER ")"»«
							»«c.name»«
						»«ENDFOR»«
					»«ENDIF»«
				»«ENDFOR»«
				»]
			}
			
		'''
		}
	}

	/**
	 * Generates an Alloy fact to ensure that some classes are not instances of other classes,
	 * if the instantiation was not explicitly defined.
	 * 
	 * @param ml2model the ML2 Model to be considered.
	 */	
	def generateUnwantedInstantiationsFact(Model ml2model) {'''
		fact UnwantedInstantiations {
			«FOR foclass : ml2model.elements.filter(FirstOrderClass)»
				«FOR hoclass : ml2model.elements.filter(HighOrderClass).filter[it.order == 2]»
					«IF !foclass.classifiers.contains(hoclass)»
						not iof[«foclass.name»Reified,«hoclass.name»Reified]
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«FOR hoclass : ml2model.elements.filter(HighOrderClass)»
				«FOR hoclass2 : ml2model.elements.filter(HighOrderClass).filter[it.order == hoclass.order + 1]»
					«IF !hoclass.classifiers.contains(hoclass2)»
						not iof[«hoclass.name»Reified,«hoclass2.name»Reified]
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
		}
		
	'''
	}
	
	/************************************************************************************************
	 * The following methods are called by other methods in order to do some kind of auxiliary task.
	 ***********************************************************************************************/

	/**
	 * Generates Alloy signatures and singletons for each MLT* basic ordered type used in the Alloy
	 * model being generated. The number of types considered is given by the order of the class with
	 * the highest order in the ML2 Model.
	 * 
	 * @param ml2class the ML2 Model to be considered.
	 */
	def CharSequence generateNotableConstantsSection(Model model) {'''
		«FOR order : 1 .. highestOrder(model)»
			sig Order«order»Type in OrderedType {
			}

			fact Order«order»TypeDefinition {
				«IF order == 1»
					all e: Entity | (e in Order«order»Type iff (some b: BasicType,f: Individual_ | iof[e,b] and powertypeOf[b,f]))
				«ELSE»
					all e: Entity | (e in Order«order»Type iff (some b: BasicType,f: Order«order - 1»TypeReified | iof[e,b] and powertypeOf[b,f]))
				«ENDIF»
			}

			one sig Order«order»TypeReified in OrderedType {
			}

			fact Order«order»TypeReifiedDefinition {
				all e: Entity | e in Order«order»TypeReified iff (all e': Entity | iof[e',e] iff e' in Order«order»Type)
			}

		«ENDFOR»
	'''
	}
		
	/**
	 * Decides the Alloy multiplicity keyword to be used in ML2 Feature declarations.
	 * 
	 * @param feature the ML2 Feature to be considered.
	 */
	def private decideMultiplicityKeyword(Feature feature) {
		val lowerBound = feature instanceof Attribute ?
				feature.lowerBound : (feature as Reference).lowerBound;
		val upperBound = feature instanceof Attribute ?
				feature.upperBound : (feature as Reference).upperBound;
		 
		if(lowerBound == 0) {
			if(upperBound == 1) {
				return "lone "
			} else {
				return "set "
			}
		} else {
			if(upperBound == 1) {
				return "one "
			} else {
				return "some "
			}
		}
	}

	/**
	 * Determines the highest order of an ML2 model.
	 * 
	 * @param model the ML2 Model to be considered.
	 */
	def private highestOrder(Model model) {
		var order = 1
		for(element : model.elements) {
			if(element instanceof HighOrderClass) {
				if(element.order > order) {
					order = element.order
				}
			}
		}
		return order
	}
}