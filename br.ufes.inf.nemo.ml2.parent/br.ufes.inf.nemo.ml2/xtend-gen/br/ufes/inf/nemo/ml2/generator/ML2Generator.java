/**
 * ML2Generator.xtend
 * 
 * Author:
 * 	Fernando Amaral Musso
 */
package br.ufes.inf.nemo.ml2.generator;

import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.AttributeAssignment;
import br.ufes.inf.nemo.ml2.model.CategorizationType;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.EntityDeclaration;
import br.ufes.inf.nemo.ml2.model.FOClass;
import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.FeatureAssignment;
import br.ufes.inf.nemo.ml2.model.GeneralizationSet;
import br.ufes.inf.nemo.ml2.model.HOClass;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.Literal;
import br.ufes.inf.nemo.ml2.model.ML2Boolean;
import br.ufes.inf.nemo.ml2.model.ML2Class;
import br.ufes.inf.nemo.ml2.model.ML2Model;
import br.ufes.inf.nemo.ml2.model.ML2Number;
import br.ufes.inf.nemo.ml2.model.ML2String;
import br.ufes.inf.nemo.ml2.model.ModelElement;
import br.ufes.inf.nemo.ml2.model.OrderlessClass;
import br.ufes.inf.nemo.ml2.model.PrimitiveType;
import br.ufes.inf.nemo.ml2.model.Reference;
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates an Alloy model from a ML2 Model.
 */
@SuppressWarnings("all")
public class ML2Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource xtextResource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EcoreUtil.resolveAll(xtextResource);
    EcoreUtil2.resolveAll(xtextResource.getResourceSet());
    boolean _isEmpty = xtextResource.getContents().isEmpty();
    if (_isEmpty) {
      return;
    }
    EObject _get = xtextResource.getContents().get(0);
    final ML2Model model = ((ML2Model) _get);
    String _name = model.getName();
    String _plus = (_name + ".als");
    fsa.generateFile(_plus, ML2Generator.generateAlloyModel(model));
    fsa.generateFile("MLTStar.als", ML2Generator.generateMLTStarAlloyModel(model));
    fsa.generateFile("utils.als", ML2Generator.generateUtilsAlloyModel());
  }
  
  /**
   * Generates the file <modelname>.als containing Alloy code, derived from the transformation
   * of the ML2 Model provided by the file <modelname>.ml2.
   * 
   * @param ml2model the ML2 Model to be transformed.
   */
  public static CharSequence generateAlloyModel(final ML2Model ml2model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module ");
    String _name = ml2model.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("open MLTStar");
    _builder.newLine();
    _builder.append("open utils");
    _builder.newLine();
    _builder.newLine();
    {
      EList<ModelElement> _elements = ml2model.getElements();
      for(final ModelElement element : _elements) {
        CharSequence _generateAlloyElement = ML2Generator.generateAlloyElement(element);
        _builder.append(_generateAlloyElement);
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _generateDisjointIndividualsFact = ML2Generator.generateDisjointIndividualsFact(ml2model);
    _builder.append(_generateDisjointIndividualsFact);
    _builder.newLineIfNotEmpty();
    return _builder;
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
  public static CharSequence generateMLTStarAlloyModel(final ML2Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tMLT*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tMLT* extends basic MLT. The domain of quantification is a superset of Basic MLT,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tadmitting types that are not stratified. This opens up the possibility of the types");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t\"Entity\" (the type of all entities, i.e., the universe), \"Type\" (the type of all");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\ttypes), \"OrderedType\" (which is the type of all types in Basic MLT), etc.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tSome known limitations of this specification are:");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t  - Static classification only;");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t  - No support for entity\'s features (attributes and domain relations).");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAuthors:");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t  Victorio Carvalho - Basic MLT");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t  João Paulo Almeida - Contributions to Basic MLT and initial developments of MLT*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\t  Claudenir Fonseca - Revision and refactoring of MLT* and further developments");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("module MLTStar");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/********************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* UTILS - PREDICATES AND FUNCTIONS");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The predicates below are used throughout the code improving its readability.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*******************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("pred iof[x,y: Entity] \t\t\t\t\t{ x in iof.y }");
    _builder.newLine();
    _builder.append("pred specializes[x,y: Entity] \t\t\t{ x in specializes.y }");
    _builder.newLine();
    _builder.append("pred properSpecializes[ x,y: Entity] \t{ x in properSpecializes.y }");
    _builder.newLine();
    _builder.append("pred powertypeOf[x,y: Entity] \t\t\t{ x in powertypeOf.y }");
    _builder.newLine();
    _builder.append("pred categorizes[x,y: Entity] \t\t\t{ x in categorizes.y }");
    _builder.newLine();
    _builder.append("pred compCategorizes[x,y: Entity] \t\t{ x in compCategorizes.y }");
    _builder.newLine();
    _builder.append("pred disjCategorizes[x,y: Entity] \t\t{ x in disjCategorizes.y }");
    _builder.newLine();
    _builder.append("pred partitions[x,y: Entity] \t\t\t{ x in partitions.y }");
    _builder.newLine();
    _builder.append("pred isSubordinatedTo[x,y: Entity] \t\t{ x in isSubordinatedTo.y }");
    _builder.newLine();
    _builder.append("pred disjointExtentions[t,t\': Type] \t{ no iof.t & iof.t\' }");
    _builder.newLine();
    _builder.append("pred disjoint_[x,y: Entity] \t\t\t{ no x & y }");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/********************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MODEL SPECIFICATION");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Signatures and Constraints.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*******************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tEntity");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tRepresents an entity, with all possible relations that may be established between");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tentities according to the theory.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig Entity { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("iof: set Entity,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("directIof: set Entity");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tDirect instantiations are used to simplify the visualization of\tinstantiations.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all e: Entity | e.directIof = (e.iof) - (e.iof).properSpecializes");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tIndividual");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAn individual is an entity that has no possible instances. The signature Individual");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tdoes not account for the entity Individual, which is going to be specified later");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tthrough the signature Individual_ (with an underscore at the end).");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig Individual in Entity {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact individualDef {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all x: Entity | (x in Individual iff no iof.x)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tType");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tA type is an entity that has instances. Also, types must be in an instantiation");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tchain that eventually leads to some individual. As Individual, Type does not");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\taccount for the entity type, which is specified later as Type_.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig Type in Entity {");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("specializes: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("properSpecializes: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("isSubordinatedTo: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("powertypeOf: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("categorizes: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("compCategorizes: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("disjCategorizes: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("partitions: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("directSpecializes: set Entity,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("isDirectSubordinateTo: set Type,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("directCategorizes: set Type");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all e: Entity | e in Type iff some (iof.e)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tTypes are ultimately founded upon individuals.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact typeWellFounded {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t: Type | t in Type iff some (^iof.t & Individual)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tDirect relations are used to improve visualization of runs and checkings.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t: Type | t.directSpecializes = (t.properSpecializes) - (t.properSpecializes).properSpecializes");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t: Type | t.isDirectSubordinateTo = (t.isSubordinatedTo) - (t.isSubordinatedTo).properSpecializes");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t: Type | t.directCategorizes = ((t.categorizes) - (t.categorizes+t.powertypeOf).properSpecializes)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tBasicType");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tBasic types are the highest entities in their specialization chain of any instance");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\torder. That is, for any given type order there is one entity that every ordered");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\ttype specializes. In other words, a basic type is a type at the top of the ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\thierarchy of specializations of types that are \"stratified\" in Basic MLT.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig BasicType in Type {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all b: Type | b in BasicType iff ((all e: Entity | iof[e,b] iff e in Individual) or (some lot: BasicType | powertypeOf[b,lot]))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tNot necessary in Basic MLT but saves up to 15 seconds.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact noIofLoopForBasicTypes\t{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all x: BasicType | x not in x.^iof");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tOrderedType");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tA type is a ordered type iff it is a specialization of a basic type.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig OrderedType in Type {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t: Type | t in OrderedType iff (some b: BasicType | specializes[t,b])");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tOrderlessType");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tA type is a orderless type iff it is not an ordered one.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig OrderlessType in Type {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t: Type | t in OrderlessType iff (no b: BasicType | specializes[t,b])");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/********************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* CONSTANT MODEL ENTITIES");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Signatures to reference the entities which instances are members of the sets defined above.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*******************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tDefining the \"Individual_\" basic type.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig Individual_ in Type {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all e: Entity | e in Individual_ iff (all e\': Entity | iof[e\',e] iff no iof.e\')");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tDefining the type \"Type\", whose instances are all types.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig Type_ in Entity {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t: Entity | t in Type_ iff (all e: Entity | iof[e,t] iff e in Type)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tDefining the universal type \"Entity\".");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig Entity_ in Entity {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all e: Entity | e in Entity_ iff (all e\': Entity | iof[e\',e] iff e\' in Entity)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tDefining the type \"OrderedType\", whose instances are all types whose instances");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tare at the same order. These are the types in Basic MLT.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig OrderedType_ in Entity {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all e: Entity | e in OrderedType_ iff (all e\': Entity | iof[e\',e] iff e\' in OrderedType)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tDefining the type \"OrderlessType\", whose instances are all types whose instances");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tspan through different orders. These are the types in Basic MLT.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("sig OrderlessType_ in Entity {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all e: Entity | e in OrderlessType_ iff (e in Type and (all e\': Entity | iof[e\',e] iff e\' in OrderlessType))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/********************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* DEFINITIONS");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*******************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A7 - Two types are equal iff the set of all their possible instances is the same");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact typesEquivalence {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Type | (t1 = t2 iff iof.t1 = iof.t2)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A8 - Specialization Definition: t1 specializes t2 iff all instances of t1 are also");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tinstances of t2.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact specializationDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Type | specializes[t1,t2] iff (all e: iof.t1 | iof[e,t2])");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A9 - Proper Specialization Definition: t1 proper specializes t2 iff t1 specializes");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tt2 and is different from it.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact properSpecializationDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Type | properSpecializes[t1,t2] iff (specializes[t1,t2] and t1 != t2)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A10 - Subordination Definition: t1 is subordinate to t2 iff every instance of t1");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tspecializes an instance of t2.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact subordinationDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Type | isSubordinatedTo[t1,t2] iff (all t3: iof.t1 | some (t3.properSpecializes & iof.t2))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A11 - Powertype Definition: a type t1 is powertype of a type t2 iff all instances of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tt1 are specializations of t2 and all possible specializations of t2 are instances of t1.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact powertypeOfDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all pwt,t: Type | powertypeOf[pwt,t] iff (all t\': Entity | (iof[t\',pwt] iff specializes[t\',t]))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A12 - Categorization Definition: a type t1 categorizes a type t2 iff all instances");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tof t1 are proper specializations of t2.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact categorizationDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Type | categorizes[t1,t2] iff iof.t1 in properSpecializes.t2");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A13 - Complete Categorization Definition: a type t1 completely categorizes a type t2");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tiff t1 categorizes t2 and for every instance of t2 there is some type that is instantiated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tby it and is instance of t1.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact completeCategorizationDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Type | compCategorizes[t1,t2] iff (categorizes[t1,t2] and (all e: iof.t2 | some e.iof & iof.t1))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A14 - Disjoint Categorization Definition: a type t1 disjointly categorizes a type t2");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tiff t1 categorizes t2 and for any pair of different types that are instances of t1 implies");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tthis pair has disjoint extensions.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact disjointCategorizationDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Type | disjCategorizes[t1,t2] iff (categorizes[t1,t2] and (all t3,t4: iof.t1 | t3 != t4 implies disjoint_[iof.t3,iof.t4]))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tAxiom A15 - Partitions Definition: a type t1 partitions a type t2 iff t1 disjointly categorizes");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tt2 and t1 completely categorizes t2.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("fact partitionsDefinition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all t1,t2: Entity | partitions[t1,t2] iff (disjCategorizes[t1,t2] and compCategorizes[t1,t2])");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/********************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* USEFUL CONSTRAINTS");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Some constraints for cutting out unwanted models.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*******************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact allEntitiesConnectedByInstantiation {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("let navigableiof = iof + ~iof | all x,y: Entity | (x in y.*navigableiof)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact someIndividuals {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("some e: Entity | no iof.e");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fact someBasicTypes {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("some BasicType");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/********************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* NOTABLE CONSTANTS");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Signatures to represent the most used Ordered Types.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*******************************************************************************************/");
    _builder.newLine();
    _builder.newLine();
    CharSequence _generateNotableConstantsSection = ML2Generator.generateNotableConstantsSection(model);
    _builder.append(_generateNotableConstantsSection);
    _builder.newLineIfNotEmpty();
    return _builder;
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
  public static CharSequence generateUtilsAlloyModel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module utils");
    _builder.newLine();
    _builder.newLine();
    _builder.append("enum Boolean {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("true, false");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of a ML2 Individual element.
   * 
   * @param individual the ML2 Individual element to be transformed.
   */
  protected static CharSequence _generateAlloyElement(final Individual individual) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateAlloySingleton = ML2Generator.generateAlloySingleton(individual);
    _builder.append(_generateAlloySingleton);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of a ML2 Class element.
   * 
   * @param ml2class the ML2 Class element to be transformed.
   */
  protected static CharSequence _generateAlloyElement(final ML2Class ml2class) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateAlloySignature = ML2Generator.generateAlloySignature(ml2class);
    _builder.append(_generateAlloySignature);
    _builder.newLineIfNotEmpty();
    CharSequence _generateAlloySingleton = ML2Generator.generateAlloySingleton(ml2class);
    _builder.append(_generateAlloySingleton);
    _builder.newLineIfNotEmpty();
    CharSequence _generatePowertypeFact = ML2Generator.generatePowertypeFact(ml2class);
    _builder.append(_generatePowertypeFact);
    _builder.newLineIfNotEmpty();
    CharSequence _generateCategorizationFact = ML2Generator.generateCategorizationFact(ml2class);
    _builder.append(_generateCategorizationFact);
    _builder.newLineIfNotEmpty();
    CharSequence _generateSubordinationFact = ML2Generator.generateSubordinationFact(ml2class);
    _builder.append(_generateSubordinationFact);
    _builder.newLineIfNotEmpty();
    _builder.append("fact ");
    String _name = ml2class.getName();
    _builder.append(_name);
    _builder.append("ReifiedDefinition {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("all e: Entity | e in ");
    String _name_1 = ml2class.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Reified iff (all e\': Entity | iof[e\',e] iff e\' in ");
    String _name_2 = ml2class.getName();
    _builder.append(_name_2, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<ML2Class> _instantiatedClasses = ml2class.getInstantiatedClasses();
      for(final ML2Class instantiatedClass : _instantiatedClasses) {
        {
          ML2Class _categorizedClass = instantiatedClass.getCategorizedClass();
          boolean _notEquals = (!Objects.equal(_categorizedClass, null));
          if (_notEquals) {
            {
              EList<FeatureAssignment> _assignments = ml2class.getAssignments();
              for(final FeatureAssignment assignment : _assignments) {
                CharSequence _generateRegularityFeatureFact = ML2Generator.generateRegularityFeatureFact(assignment, ml2class);
                _builder.append(_generateRegularityFeatureFact);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of a ML2 Generalization Set element.
   * 
   * @param genset the ML2 Generalization Set element to be transformed.
   */
  protected static CharSequence _generateAlloyElement(final GeneralizationSet genset) {
    CharSequence _xifexpression = null;
    boolean _isIsDisjoint = genset.isIsDisjoint();
    if (_isIsDisjoint) {
      CharSequence _xifexpression_1 = null;
      boolean _isIsComplete = genset.isIsComplete();
      if (_isIsComplete) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fact DisjointCompleteGenSet");
        String _name = genset.getName();
        _builder.append(_name);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("disjoint[");
        final Function<ML2Class, String> _function = (ML2Class it) -> {
          return it.getName();
        };
        String _collect = genset.getSpecifics().stream().<String>map(_function).collect(Collectors.joining(","));
        _builder.append(_collect, "\t");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_1 = genset.getGeneral().getName();
        _builder.append(_name_1, "\t");
        _builder.append(" = ");
        final Function<ML2Class, String> _function_1 = (ML2Class it) -> {
          return it.getName();
        };
        String _collect_1 = genset.getSpecifics().stream().<String>map(_function_1).collect(Collectors.joining("+"));
        _builder.append(_collect_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("fact DisjointGenSet");
        String _name_2 = genset.getName();
        _builder_1.append(_name_2);
        _builder_1.append(" {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("disjoint[");
        final Function<ML2Class, String> _function_2 = (ML2Class it) -> {
          return it.getName();
        };
        String _collect_2 = genset.getSpecifics().stream().<String>map(_function_2).collect(Collectors.joining(","));
        _builder_1.append(_collect_2, "\t");
        _builder_1.append("]");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    } else {
      CharSequence _xifexpression_2 = null;
      boolean _isIsComplete_1 = genset.isIsComplete();
      if (_isIsComplete_1) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("fact CompleteGenSet");
        String _name_3 = genset.getName();
        _builder_2.append(_name_3);
        _builder_2.append(" {");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        String _name_4 = genset.getGeneral().getName();
        _builder_2.append(_name_4, "\t");
        _builder_2.append(" = ");
        final Function<ML2Class, String> _function_3 = (ML2Class it) -> {
          return it.getName();
        };
        String _collect_3 = genset.getSpecifics().stream().<String>map(_function_3).collect(Collectors.joining("+"));
        _builder_2.append(_collect_3, "\t");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _xifexpression_2 = _builder_2;
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy signature related to a ML2 First-Order Class element.
   * 
   * @param foclass the ML2 First-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySignature(final FOClass foclass) {
    CharSequence _switchResult = null;
    int _size = foclass.getSuperClasses().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("sig ");
        String _name = foclass.getName();
        _builder.append(_name);
        _builder.append(" in Individual {");
        _builder.newLineIfNotEmpty();
        {
          EList<Feature> _features = foclass.getFeatures();
          boolean _hasElements = false;
          for(final Feature feature : _features) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            _builder.append("\t");
            CharSequence _generateAlloySignatureFields = ML2Generator.generateAlloySignatureFields(feature);
            _builder.append(_generateAlloySignatureFields, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("sig ");
        String _name_1 = foclass.getName();
        _builder_1.append(_name_1);
        _builder_1.append(" in ");
        String _name_2 = IterableExtensions.<ML2Class>head(foclass.getSuperClasses()).getName();
        _builder_1.append(_name_2);
        _builder_1.append(" {");
        _builder_1.newLineIfNotEmpty();
        {
          EList<Feature> _features_1 = foclass.getFeatures();
          boolean _hasElements_1 = false;
          for(final Feature feature_1 : _features_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder_1.appendImmediate(",", "\t");
            }
            _builder_1.append("\t");
            CharSequence _generateAlloySignatureFields_1 = ML2Generator.generateAlloySignatureFields(feature_1);
            _builder_1.append(_generateAlloySignatureFields_1, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("sig ");
        String _name_3 = foclass.getName();
        _builder_2.append(_name_3);
        _builder_2.append(" in Individual {");
        _builder_2.newLineIfNotEmpty();
        {
          EList<Feature> _features_2 = foclass.getFeatures();
          boolean _hasElements_2 = false;
          for(final Feature feature_2 : _features_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder_2.appendImmediate(",", "\t");
            }
            _builder_2.append("\t");
            CharSequence _generateAlloySignatureFields_2 = ML2Generator.generateAlloySignatureFields(feature_2);
            _builder_2.append(_generateAlloySignatureFields_2, "\t");
            _builder_2.newLineIfNotEmpty();
          }
        }
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("fact ");
        String _name_4 = foclass.getName();
        _builder_2.append(_name_4);
        _builder_2.append("SuperClasses {");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("all x: ");
        String _name_5 = foclass.getName();
        _builder_2.append(_name_5, "\t");
        _builder_2.append(" | x in (");
        final Function<ML2Class, String> _function = (ML2Class it) -> {
          return it.getName();
        };
        String _collect = foclass.getSuperClasses().stream().<String>map(_function).collect(Collectors.joining(" & "));
        _builder_2.append(_collect, "\t");
        _builder_2.append(")");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _switchResult = _builder_2;
        break;
    }
    return _switchResult;
  }
  
  /**
   * Generates an Alloy signature related to a ML2 High-Order Class element.
   * 
   * @param hoclass the ML2 High-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySignature(final HOClass hoclass) {
    CharSequence _switchResult = null;
    int _size = hoclass.getSuperClasses().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("sig ");
        String _name = hoclass.getName();
        _builder.append(_name);
        _builder.append(" in Order");
        Integer _order = hoclass.getOrder();
        int _minus = ((_order).intValue() - 1);
        _builder.append(_minus);
        _builder.append("Type {");
        _builder.newLineIfNotEmpty();
        {
          EList<Feature> _features = hoclass.getFeatures();
          boolean _hasElements = false;
          for(final Feature feature : _features) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            _builder.append("\t");
            CharSequence _generateAlloySignatureFields = ML2Generator.generateAlloySignatureFields(feature);
            _builder.append(_generateAlloySignatureFields, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("sig ");
        String _name_1 = hoclass.getName();
        _builder_1.append(_name_1);
        _builder_1.append(" in ");
        String _name_2 = IterableExtensions.<ML2Class>head(hoclass.getSuperClasses()).getName();
        _builder_1.append(_name_2);
        _builder_1.append(" {");
        _builder_1.newLineIfNotEmpty();
        {
          EList<Feature> _features_1 = hoclass.getFeatures();
          boolean _hasElements_1 = false;
          for(final Feature feature_1 : _features_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder_1.appendImmediate(",", "\t");
            }
            _builder_1.append("\t");
            CharSequence _generateAlloySignatureFields_1 = ML2Generator.generateAlloySignatureFields(feature_1);
            _builder_1.append(_generateAlloySignatureFields_1, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("sig ");
        String _name_3 = hoclass.getName();
        _builder_2.append(_name_3);
        _builder_2.append(" in Order");
        Integer _order_1 = hoclass.getOrder();
        int _minus_1 = ((_order_1).intValue() - 1);
        _builder_2.append(_minus_1);
        _builder_2.append("Type {");
        _builder_2.newLineIfNotEmpty();
        {
          EList<Feature> _features_2 = hoclass.getFeatures();
          boolean _hasElements_2 = false;
          for(final Feature feature_2 : _features_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder_2.appendImmediate(",", "\t");
            }
            _builder_2.append("\t");
            CharSequence _generateAlloySignatureFields_2 = ML2Generator.generateAlloySignatureFields(feature_2);
            _builder_2.append(_generateAlloySignatureFields_2, "\t");
            _builder_2.newLineIfNotEmpty();
          }
        }
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("fact ");
        String _name_4 = hoclass.getName();
        _builder_2.append(_name_4);
        _builder_2.append("SuperClasses {");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("all x: ");
        String _name_5 = hoclass.getName();
        _builder_2.append(_name_5, "\t");
        _builder_2.append(" | x in (");
        final Function<ML2Class, String> _function = (ML2Class it) -> {
          return it.getName();
        };
        String _collect = hoclass.getSuperClasses().stream().<String>map(_function).collect(Collectors.joining(" & "));
        _builder_2.append(_collect, "\t");
        _builder_2.append(")");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _switchResult = _builder_2;
        break;
    }
    return _switchResult;
  }
  
  /**
   * Generates an Alloy signature related to a ML2 Orderless Class element.
   * 
   * @param olclass the ML2 Orderless Class element to be transformed.
   */
  protected static CharSequence _generateAlloySignature(final OrderlessClass olclass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sig ");
    String _name = olclass.getName();
    _builder.append(_name);
    _builder.append(" in OrderlessType {");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = olclass.getFeatures();
      boolean _hasElements = false;
      for(final Feature feature : _features) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        CharSequence _generateAlloySignatureFields = ML2Generator.generateAlloySignatureFields(feature);
        _builder.append(_generateAlloySignatureFields, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates an Alloy signature field related to a ML2 Attribute element.
   * 
   * @param attribute the ML2 Attribute element to be transformed.
   */
  protected static CharSequence _generateAlloySignatureFields(final Attribute attribute) {
    CharSequence _xifexpression = null;
    DataType __type = attribute.get_type();
    boolean _notEquals = (!Objects.equal(__type, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = attribute.getName();
      _builder.append(_name);
      _builder.append(": ");
      String _decideMultiplicityKeyword = ML2Generator.decideMultiplicityKeyword(attribute);
      _builder.append(_decideMultiplicityKeyword);
      String _name_1 = attribute.get_type().getName();
      _builder.append(_name_1);
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      CharSequence _switchResult = null;
      PrimitiveType _primitiveType = attribute.getPrimitiveType();
      if (_primitiveType != null) {
        switch (_primitiveType) {
          case BOOLEAN:
            StringConcatenation _builder_1 = new StringConcatenation();
            String _name_2 = attribute.getName();
            _builder_1.append(_name_2);
            _builder_1.append(": ");
            String _decideMultiplicityKeyword_1 = ML2Generator.decideMultiplicityKeyword(attribute);
            _builder_1.append(_decideMultiplicityKeyword_1);
            _builder_1.append("Boolean");
            _builder_1.newLineIfNotEmpty();
            _switchResult = _builder_1;
            break;
          case NUMBER:
            StringConcatenation _builder_2 = new StringConcatenation();
            String _name_3 = attribute.getName();
            _builder_2.append(_name_3);
            _builder_2.append(": ");
            String _decideMultiplicityKeyword_2 = ML2Generator.decideMultiplicityKeyword(attribute);
            _builder_2.append(_decideMultiplicityKeyword_2);
            _builder_2.append("Int");
            _builder_2.newLineIfNotEmpty();
            _switchResult = _builder_2;
            break;
          case STRING:
            StringConcatenation _builder_3 = new StringConcatenation();
            String _name_4 = attribute.getName();
            _builder_3.append(_name_4);
            _builder_3.append(": ");
            String _decideMultiplicityKeyword_3 = ML2Generator.decideMultiplicityKeyword(attribute);
            _builder_3.append(_decideMultiplicityKeyword_3);
            _builder_3.append("String");
            _builder_3.newLineIfNotEmpty();
            _switchResult = _builder_3;
            break;
          default:
            break;
        }
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy signature field related to a ML2 Reference element.
   * 
   * @param reference the ML2 Reference element to be transformed.
   */
  protected static CharSequence _generateAlloySignatureFields(final Reference reference) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = reference.getName();
    _builder.append(_name);
    _builder.append(": ");
    String _decideMultiplicityKeyword = ML2Generator.decideMultiplicityKeyword(reference);
    _builder.append(_decideMultiplicityKeyword);
    String _name_1 = reference.get_type().getName();
    _builder.append(_name_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates an Alloy singleton related to a ML2 Individual element.
   * 
   * @param individual the ML2 Individual element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final Individual individual) {
    CharSequence _switchResult = null;
    int _size = individual.getInstantiatedClasses().size();
    switch (_size) {
      case 1:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("one sig ");
        String _name = individual.getName();
        _builder.append(_name);
        _builder.append(" in ");
        String _name_1 = IterableExtensions.<ML2Class>head(individual.getInstantiatedClasses()).getName();
        _builder.append(_name_1);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments = individual.getAssignments();
          boolean _hasElements = false;
          for(final FeatureAssignment assignment : _assignments) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("}{", "\t");
            }
            _builder.append("\t");
            CharSequence _generateAlloySingletonFields = ML2Generator.generateAlloySingletonFields(assignment);
            _builder.append(_generateAlloySingletonFields, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _switchResult = _builder;
        break;
      default:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("one sig ");
        String _name_2 = individual.getName();
        _builder_1.append(_name_2);
        _builder_1.append(" in Individual {");
        _builder_1.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments_1 = individual.getAssignments();
          boolean _hasElements_1 = false;
          for(final FeatureAssignment assignment_1 : _assignments_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder_1.append("}{", "\t");
            }
            _builder_1.append("\t");
            CharSequence _generateAlloySingletonFields_1 = ML2Generator.generateAlloySingletonFields(assignment_1);
            _builder_1.append(_generateAlloySingletonFields_1, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("fact ");
        String _name_3 = individual.getName();
        _builder_1.append(_name_3);
        _builder_1.append("InstantiatedClasses {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        String _name_4 = individual.getName();
        _builder_1.append(_name_4, "\t");
        _builder_1.append(" in (");
        final Function<ML2Class, String> _function = (ML2Class it) -> {
          return it.getName();
        };
        String _collect = individual.getInstantiatedClasses().stream().<String>map(_function).collect(Collectors.joining(" & "));
        _builder_1.append(_collect, "\t");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _switchResult = _builder_1;
        break;
    }
    return _switchResult;
  }
  
  /**
   * Generates an Alloy singleton related to a ML2 First-Order Class element.
   * 
   * @param foclass the ML2 First-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final FOClass foclass) {
    CharSequence _switchResult = null;
    int _size = foclass.getInstantiatedClasses().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("one sig ");
        String _name = foclass.getName();
        _builder.append(_name);
        _builder.append("Reified in Order1Type {");
        _builder.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments = foclass.getAssignments();
          boolean _hasElements = false;
          for(final FeatureAssignment assignment : _assignments) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("}{", "\t");
            }
            _builder.append("\t");
            CharSequence _generateAlloySingletonFields = ML2Generator.generateAlloySingletonFields(assignment);
            _builder.append(_generateAlloySingletonFields, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("one sig ");
        String _name_1 = foclass.getName();
        _builder_1.append(_name_1);
        _builder_1.append("Reified in ");
        String _name_2 = IterableExtensions.<ML2Class>head(foclass.getInstantiatedClasses()).getName();
        _builder_1.append(_name_2);
        _builder_1.append(" {");
        _builder_1.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments_1 = foclass.getAssignments();
          boolean _hasElements_1 = false;
          for(final FeatureAssignment assignment_1 : _assignments_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder_1.append("}{", "\t");
            }
            _builder_1.append("\t");
            CharSequence _generateAlloySingletonFields_1 = ML2Generator.generateAlloySingletonFields(assignment_1);
            _builder_1.append(_generateAlloySingletonFields_1, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("one sig ");
        String _name_3 = foclass.getName();
        _builder_2.append(_name_3);
        _builder_2.append("Reified in Order1Type{");
        _builder_2.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments_2 = foclass.getAssignments();
          boolean _hasElements_2 = false;
          for(final FeatureAssignment assignment_2 : _assignments_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
              _builder_2.append("}{", "\t");
            }
            _builder_2.append("\t");
            CharSequence _generateAlloySingletonFields_2 = ML2Generator.generateAlloySingletonFields(assignment_2);
            _builder_2.append(_generateAlloySingletonFields_2, "\t");
            _builder_2.newLineIfNotEmpty();
          }
        }
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("fact ");
        String _name_4 = foclass.getName();
        _builder_2.append(_name_4);
        _builder_2.append("InstantiatedClasses {");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("all x: ");
        String _name_5 = foclass.getName();
        _builder_2.append(_name_5, "\t");
        _builder_2.append("Reified | x in (");
        final Function<ML2Class, String> _function = (ML2Class it) -> {
          return it.getName();
        };
        String _collect = foclass.getInstantiatedClasses().stream().<String>map(_function).collect(Collectors.joining(" & "));
        _builder_2.append(_collect, "\t");
        _builder_2.append(")");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _switchResult = _builder_2;
        break;
    }
    return _switchResult;
  }
  
  /**
   * Generates an Alloy singleton related to a ML2 High-Order Class element.
   * 
   * @param hoclass the ML2 High-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final HOClass hoclass) {
    CharSequence _switchResult = null;
    int _size = hoclass.getInstantiatedClasses().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("one sig ");
        String _name = hoclass.getName();
        _builder.append(_name);
        _builder.append("Reified in Order");
        Integer _order = hoclass.getOrder();
        _builder.append(_order);
        _builder.append("Type {");
        _builder.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments = hoclass.getAssignments();
          boolean _hasElements = false;
          for(final FeatureAssignment assignment : _assignments) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("}{", "\t");
            }
            _builder.append("\t");
            CharSequence _generateAlloySingletonFields = ML2Generator.generateAlloySingletonFields(assignment);
            _builder.append(_generateAlloySingletonFields, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("one sig ");
        String _name_1 = hoclass.getName();
        _builder_1.append(_name_1);
        _builder_1.append("Reified in ");
        String _name_2 = IterableExtensions.<ML2Class>head(hoclass.getInstantiatedClasses()).getName();
        _builder_1.append(_name_2);
        _builder_1.append(" {");
        _builder_1.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments_1 = hoclass.getAssignments();
          boolean _hasElements_1 = false;
          for(final FeatureAssignment assignment_1 : _assignments_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder_1.append("}{", "\t");
            }
            _builder_1.append("\t");
            CharSequence _generateAlloySingletonFields_1 = ML2Generator.generateAlloySingletonFields(assignment_1);
            _builder_1.append(_generateAlloySingletonFields_1, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("one sig ");
        String _name_3 = hoclass.getName();
        _builder_2.append(_name_3);
        _builder_2.append("Reified in Order");
        Integer _order_1 = hoclass.getOrder();
        _builder_2.append(_order_1);
        _builder_2.append("Type {");
        _builder_2.newLineIfNotEmpty();
        {
          EList<FeatureAssignment> _assignments_2 = hoclass.getAssignments();
          boolean _hasElements_2 = false;
          for(final FeatureAssignment assignment_2 : _assignments_2) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
              _builder_2.append("}{", "\t");
            }
            _builder_2.append("\t");
            CharSequence _generateAlloySingletonFields_2 = ML2Generator.generateAlloySingletonFields(assignment_2);
            _builder_2.append(_generateAlloySingletonFields_2, "\t");
            _builder_2.newLineIfNotEmpty();
          }
        }
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("fact ");
        String _name_4 = hoclass.getName();
        _builder_2.append(_name_4);
        _builder_2.append("InstantiatedClasses {");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("all x: ");
        String _name_5 = hoclass.getName();
        _builder_2.append(_name_5, "\t");
        _builder_2.append("Reified | x in (");
        final Function<ML2Class, String> _function = (ML2Class it) -> {
          return it.getName();
        };
        String _collect = hoclass.getInstantiatedClasses().stream().<String>map(_function).collect(Collectors.joining(" & "));
        _builder_2.append(_collect, "\t");
        _builder_2.append(")");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("}");
        _builder_2.newLine();
        _builder_2.newLine();
        _switchResult = _builder_2;
        break;
    }
    return _switchResult;
  }
  
  /**
   * Generates an Alloy singleton related to a ML2 Orderless Class element.
   * 
   * @param olclass the ML2 Orderless Class element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final OrderlessClass olclass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("one sig ");
    String _name = olclass.getName();
    _builder.append(_name);
    _builder.append("Reified in OrderlessType {");
    _builder.newLineIfNotEmpty();
    {
      EList<FeatureAssignment> _assignments = olclass.getAssignments();
      boolean _hasElements = false;
      for(final FeatureAssignment assignment : _assignments) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("}{", "\t");
        }
        _builder.append("\t");
        CharSequence _generateAlloySingletonFields = ML2Generator.generateAlloySingletonFields(assignment);
        _builder.append(_generateAlloySingletonFields, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates an Alloy singleton field related to a ML2 AttributeAssignment element.
   * 
   * @param attributeAssignment the ML2 AttributeAssignment element to be transformed.
   */
  protected static CharSequence _generateAlloySingletonFields(final AttributeAssignment attributeAssignment) {
    CharSequence _xifexpression = null;
    int _size = attributeAssignment.getIndividualAssignments().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = attributeAssignment.getAttribute().getName();
      _builder.append(_name);
      _builder.append(" = ");
      final Function<Individual, String> _function = (Individual it) -> {
        return it.getName();
      };
      String _collect = attributeAssignment.getIndividualAssignments().stream().<String>map(_function).collect(Collectors.joining("+"));
      _builder.append(_collect);
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      CharSequence _switchResult = null;
      PrimitiveType _primitiveType = attributeAssignment.getAttribute().getPrimitiveType();
      if (_primitiveType != null) {
        switch (_primitiveType) {
          case BOOLEAN:
            StringConcatenation _builder_1 = new StringConcatenation();
            String _name_1 = attributeAssignment.getAttribute().getName();
            _builder_1.append(_name_1);
            _builder_1.append(" = ");
            final Function<ML2Boolean, String> _function_1 = (ML2Boolean it) -> {
              return Boolean.valueOf(it.isValue()).toString();
            };
            String _collect_1 = ML2Generator.convertToBooleanList(attributeAssignment.getLiteralAssignments()).stream().<String>map(_function_1).collect(Collectors.joining("+"));
            _builder_1.append(_collect_1);
            _builder_1.newLineIfNotEmpty();
            _switchResult = _builder_1;
            break;
          case NUMBER:
            StringConcatenation _builder_2 = new StringConcatenation();
            String _name_2 = attributeAssignment.getAttribute().getName();
            _builder_2.append(_name_2);
            _builder_2.append(" = ");
            final Function<ML2Number, String> _function_2 = (ML2Number it) -> {
              return Integer.valueOf(Double.valueOf(it.getValue()).intValue()).toString();
            };
            String _collect_2 = ML2Generator.convertToNumberList(attributeAssignment.getLiteralAssignments()).stream().<String>map(_function_2).collect(Collectors.joining("+"));
            _builder_2.append(_collect_2);
            _builder_2.newLineIfNotEmpty();
            _switchResult = _builder_2;
            break;
          case STRING:
            StringConcatenation _builder_3 = new StringConcatenation();
            String _name_3 = attributeAssignment.getAttribute().getName();
            _builder_3.append(_name_3);
            _builder_3.append(" = ");
            final Function<ML2String, String> _function_3 = (ML2String it) -> {
              String _value = it.getValue();
              String _plus = ("\"" + _value);
              return (_plus + "\"");
            };
            String _collect_3 = ML2Generator.convertToStringList(attributeAssignment.getLiteralAssignments()).stream().<String>map(_function_3).collect(Collectors.joining("+"));
            _builder_3.append(_collect_3);
            _builder_3.newLineIfNotEmpty();
            _switchResult = _builder_3;
            break;
          default:
            break;
        }
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy singleton field related to a ML2 ReferenceAssignment element.
   * 
   * @param referenceAssignment the ML2 ReferenceAssignment element to be transformed.
   */
  protected static CharSequence _generateAlloySingletonFields(final ReferenceAssignment referenceAssignment) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = referenceAssignment.getReference().getName();
    _builder.append(_name);
    _builder.append(" = ");
    final Function<EntityDeclaration, String> _function = (EntityDeclaration it) -> {
      return it.getName();
    };
    String _collect = referenceAssignment.getAssignments().stream().<String>map(_function).collect(Collectors.joining("+"));
    _builder.append(_collect);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates an Alloy fact related to a ML2 AttributeAssignment element regulated by a ML2 Attribute element.
   * 
   * @param attributeAssignment the ML2 AttributeAssignment element with regulated feature.
   * @param ml2class the ML2 Class element with regulator feature.
   */
  protected static CharSequence _generateRegularityFeatureFact(final AttributeAssignment attributeAssignment, final ML2Class ml2class) {
    CharSequence _xifexpression = null;
    Feature _regulatedFeature = attributeAssignment.getAttribute().getRegulatedFeature();
    boolean _notEquals = (!Objects.equal(_regulatedFeature, null));
    if (_notEquals) {
      CharSequence _switchResult = null;
      RegularityFeatureType _regularityType = attributeAssignment.getAttribute().getRegularityType();
      if (_regularityType != null) {
        switch (_regularityType) {
          case DETERMINES_VALUE:
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("fact ");
            String _name = attributeAssignment.getAttribute().getName();
            _builder.append(_name);
            _builder.append("Regulates");
            String _name_1 = attributeAssignment.getAttribute().getRegulatedFeature().getName();
            _builder.append(_name_1);
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("all x: ");
            String _name_2 = ml2class.getName();
            _builder.append(_name_2, "\t");
            _builder.append(" | x.");
            String _name_3 = attributeAssignment.getAttribute().getRegulatedFeature().getName();
            _builder.append(_name_3, "\t");
            _builder.append(" = ");
            String _name_4 = ml2class.getName();
            _builder.append(_name_4, "\t");
            _builder.append("Reified.");
            String _name_5 = attributeAssignment.getAttribute().getName();
            _builder.append(_name_5, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _switchResult = _builder;
            break;
          case DETERMINES_MIN_VALUE:
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("fact ");
            String _name_6 = attributeAssignment.getAttribute().getName();
            _builder_1.append(_name_6);
            _builder_1.append("Regulates");
            String _name_7 = attributeAssignment.getAttribute().getRegulatedFeature().getName();
            _builder_1.append(_name_7);
            _builder_1.append(" {");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("all x: ");
            String _name_8 = ml2class.getName();
            _builder_1.append(_name_8, "\t");
            _builder_1.append(" | x.");
            String _name_9 = attributeAssignment.getAttribute().getRegulatedFeature().getName();
            _builder_1.append(_name_9, "\t");
            _builder_1.append(" >= ");
            String _name_10 = ml2class.getName();
            _builder_1.append(_name_10, "\t");
            _builder_1.append("Reified.");
            String _name_11 = attributeAssignment.getAttribute().getName();
            _builder_1.append(_name_11, "\t");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.newLine();
            _switchResult = _builder_1;
            break;
          case DETERMINES_MAX_VALUE:
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("fact ");
            String _name_12 = attributeAssignment.getAttribute().getName();
            _builder_2.append(_name_12);
            _builder_2.append("Regulates");
            String _name_13 = attributeAssignment.getAttribute().getRegulatedFeature().getName();
            _builder_2.append(_name_13);
            _builder_2.append(" {");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("\t");
            _builder_2.append("all x: ");
            String _name_14 = ml2class.getName();
            _builder_2.append(_name_14, "\t");
            _builder_2.append(" | x.");
            String _name_15 = attributeAssignment.getAttribute().getRegulatedFeature().getName();
            _builder_2.append(_name_15, "\t");
            _builder_2.append(" <= ");
            String _name_16 = ml2class.getName();
            _builder_2.append(_name_16, "\t");
            _builder_2.append("Reified.");
            String _name_17 = attributeAssignment.getAttribute().getName();
            _builder_2.append(_name_17, "\t");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("}");
            _builder_2.newLine();
            _builder_2.newLine();
            _switchResult = _builder_2;
            break;
          default:
            StringConcatenation _builder_3 = new StringConcatenation();
            _switchResult = _builder_3;
            break;
        }
      } else {
        StringConcatenation _builder_3 = new StringConcatenation();
        _switchResult = _builder_3;
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to a ML2 ReferenceAssignment element regulated by a ML2 Reference element.
   * 
   * @param referenceAssignment the ML2 ReferenceAssignment element with regulated feature.
   * @param ml2class the ML2 Class element with regulator feature.
   */
  protected static CharSequence _generateRegularityFeatureFact(final ReferenceAssignment referenceAssignment, final ML2Class ml2class) {
    CharSequence _xifexpression = null;
    Feature _regulatedFeature = referenceAssignment.getReference().getRegulatedFeature();
    boolean _notEquals = (!Objects.equal(_regulatedFeature, null));
    if (_notEquals) {
      CharSequence _switchResult = null;
      RegularityFeatureType _regularityType = referenceAssignment.getReference().getRegularityType();
      if (_regularityType != null) {
        switch (_regularityType) {
          case DETERMINES_TYPE:
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("fact ");
            String _name = referenceAssignment.getReference().getName();
            _builder.append(_name);
            _builder.append("Regulates");
            String _name_1 = referenceAssignment.getReference().getRegulatedFeature().getName();
            _builder.append(_name_1);
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("all x: ");
            String _name_2 = ml2class.getName();
            _builder.append(_name_2, "\t");
            _builder.append(" | x.");
            String _name_3 = referenceAssignment.getReference().getRegulatedFeature().getName();
            _builder.append(_name_3, "\t");
            _builder.append(" = ");
            String _name_4 = ml2class.getName();
            _builder.append(_name_4, "\t");
            _builder.append("Reified.");
            String _name_5 = referenceAssignment.getReference().getName();
            _builder.append(_name_5, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _switchResult = _builder;
            break;
          default:
            StringConcatenation _builder_1 = new StringConcatenation();
            _switchResult = _builder_1;
            break;
        }
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _switchResult = _builder_1;
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to a ML2 Powertype cross-level relation.
   * 
   * @param ml2class the ML2 Class element to be considered.
   */
  public static CharSequence generatePowertypeFact(final ML2Class ml2class) {
    CharSequence _xifexpression = null;
    ML2Class _powertypeOf = ml2class.getPowertypeOf();
    boolean _notEquals = (!Objects.equal(_powertypeOf, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fact ");
      String _name = ml2class.getName();
      _builder.append(_name);
      _builder.append("IsPowertypeOf");
      String _name_1 = ml2class.getPowertypeOf().getName();
      _builder.append(_name_1);
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("powertypeOf[");
      String _name_2 = ml2class.getName();
      _builder.append(_name_2, "\t");
      _builder.append("Reified,");
      String _name_3 = ml2class.getPowertypeOf().getName();
      _builder.append(_name_3, "\t");
      _builder.append("Reified]");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to a ML2 Subordination cross-level relation.
   * 
   * @param ml2class the ML2 Class element to be considered.
   */
  public static CharSequence generateSubordinationFact(final ML2Class ml2class) {
    CharSequence _xifexpression = null;
    int _size = ml2class.getSubordinators().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fact ");
      String _name = ml2class.getName();
      _builder.append(_name);
      _builder.append("isSubordinatedTo {");
      _builder.newLineIfNotEmpty();
      {
        EList<ML2Class> _subordinators = ml2class.getSubordinators();
        for(final ML2Class subordinator : _subordinators) {
          _builder.append("\t");
          _builder.append("isSubordinatedTo[");
          String _name_1 = ml2class.getName();
          _builder.append(_name_1, "\t");
          _builder.append("Reified,");
          String _name_2 = subordinator.getName();
          _builder.append(_name_2, "\t");
          _builder.append("Reified]");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to a ML2 Categorization cross-level relation.
   * 
   * @param ml2class the ML2 Class element to be considered.
   */
  public static CharSequence generateCategorizationFact(final ML2Class ml2class) {
    CharSequence _xifexpression = null;
    ML2Class _categorizedClass = ml2class.getCategorizedClass();
    boolean _notEquals = (!Objects.equal(_categorizedClass, null));
    if (_notEquals) {
      CharSequence _switchResult = null;
      CategorizationType _categorizationType = ml2class.getCategorizationType();
      if (_categorizationType != null) {
        switch (_categorizationType) {
          case CATEGORIZER:
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("fact ");
            String _name = ml2class.getName();
            _builder.append(_name);
            _builder.append("Categorizes");
            String _name_1 = ml2class.getCategorizedClass().getName();
            _builder.append(_name_1);
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("categorizes[");
            String _name_2 = ml2class.getName();
            _builder.append(_name_2, "\t");
            _builder.append("Reified,");
            String _name_3 = ml2class.getCategorizedClass().getName();
            _builder.append(_name_3, "\t");
            _builder.append("Reified]");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _switchResult = _builder;
            break;
          case COMPLETE_CATEGORIZER:
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("fact ");
            String _name_4 = ml2class.getName();
            _builder_1.append(_name_4);
            _builder_1.append("CompleteCategorizes");
            String _name_5 = ml2class.getCategorizedClass().getName();
            _builder_1.append(_name_5);
            _builder_1.append(" {");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            _builder_1.append("compCategorizes[");
            String _name_6 = ml2class.getName();
            _builder_1.append(_name_6, "\t");
            _builder_1.append("Reified,");
            String _name_7 = ml2class.getCategorizedClass().getName();
            _builder_1.append(_name_7, "\t");
            _builder_1.append("Reified]");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.newLine();
            _switchResult = _builder_1;
            break;
          case DISJOINT_CATEGORIZER:
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("fact ");
            String _name_8 = ml2class.getName();
            _builder_2.append(_name_8);
            _builder_2.append("DisjointCategorizes");
            String _name_9 = ml2class.getCategorizedClass().getName();
            _builder_2.append(_name_9);
            _builder_2.append(" {");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("\t");
            _builder_2.append("disjCategorizes[");
            String _name_10 = ml2class.getName();
            _builder_2.append(_name_10, "\t");
            _builder_2.append("Reified,");
            String _name_11 = ml2class.getCategorizedClass().getName();
            _builder_2.append(_name_11, "\t");
            _builder_2.append("Reified]");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("}");
            _builder_2.newLine();
            _builder_2.newLine();
            _switchResult = _builder_2;
            break;
          case PARTITIONER:
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("fact ");
            String _name_12 = ml2class.getName();
            _builder_3.append(_name_12);
            _builder_3.append("Partitions");
            String _name_13 = ml2class.getCategorizedClass().getName();
            _builder_3.append(_name_13);
            _builder_3.append(" {");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("\t");
            _builder_3.append("partitions[");
            String _name_14 = ml2class.getName();
            _builder_3.append(_name_14, "\t");
            _builder_3.append("Reified,");
            String _name_15 = ml2class.getCategorizedClass().getName();
            _builder_3.append(_name_15, "\t");
            _builder_3.append("Reified]");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("}");
            _builder_3.newLine();
            _builder_3.newLine();
            _switchResult = _builder_3;
            break;
          default:
            break;
        }
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact to ensure the disjointness of all individuals.
   * 
   * @param ml2class the ML2 Model to be considered.
   */
  public static CharSequence generateDisjointIndividualsFact(final ML2Model ml2model) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<Individual> list = new ArrayList<Individual>();
      EList<ModelElement> _elements = ml2model.getElements();
      for (final ModelElement element : _elements) {
        if ((element instanceof Individual)) {
          list.add(((Individual)element));
        }
      }
      CharSequence _xifexpression = null;
      int _size = list.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fact disjointIndividuals {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("disjoint[");
        final Function<Individual, String> _function = (Individual it) -> {
          return it.getName();
        };
        String _collect = list.stream().<String>map(_function).collect(Collectors.joining(","));
        _builder.append(_collect, "\t");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _xifexpression = _builder;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Generates Alloy signatures and singletons for each MLT* basic ordered type used in the Alloy
   * model being generated. The number of types considered is given by the order of the class with
   * the highest order in the ML2 Model.
   * 
   * @param ml2class the ML2 Model to be considered.
   */
  public static CharSequence generateNotableConstantsSection(final ML2Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _highestOrder = ML2Generator.highestOrder(model);
      IntegerRange _upTo = new IntegerRange(1, _highestOrder);
      for(final Integer order : _upTo) {
        _builder.append("sig Order");
        _builder.append(order);
        _builder.append("Type in OrderedType {");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("fact Order");
        _builder.append(order);
        _builder.append("TypeDefinition {");
        _builder.newLineIfNotEmpty();
        {
          if (((order).intValue() == 1)) {
            _builder.append("\t");
            _builder.append("all e: Entity | (e in Order");
            _builder.append(order, "\t");
            _builder.append("Type iff (some b: BasicType,f: Individual_ | iof[e,b] and powertypeOf[b,f]))");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("all e: Entity | (e in Order");
            _builder.append(order, "\t");
            _builder.append("Type iff (some b: BasicType,f: Order");
            _builder.append(((order).intValue() - 1), "\t");
            _builder.append("TypeReified | iof[e,b] and powertypeOf[b,f]))");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("one sig Order");
        _builder.append(order);
        _builder.append("TypeReified in OrderedType {");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("fact Order");
        _builder.append(order);
        _builder.append("TypeReifiedDefinition {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("all e: Entity | e in Order");
        _builder.append(order, "\t");
        _builder.append("TypeReified iff (all e\': Entity | iof[e\',e] iff e\' in Order");
        _builder.append(order, "\t");
        _builder.append("Type)");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  /**
   * Decides the Alloy multiplicity keyword to be used in ML2 Feature declarations.
   * 
   * @param feature the ML2 Feature to be considered.
   */
  public static String decideMultiplicityKeyword(final Feature feature) {
    int _lowerBound = feature.getLowerBound();
    boolean _equals = (_lowerBound == 0);
    if (_equals) {
      int _upperBound = feature.getUpperBound();
      boolean _equals_1 = (_upperBound == 1);
      if (_equals_1) {
        return "lone ";
      } else {
        return "set ";
      }
    } else {
      int _upperBound_1 = feature.getUpperBound();
      boolean _equals_2 = (_upperBound_1 == 1);
      if (_equals_2) {
        return "";
      } else {
        return "some ";
      }
    }
  }
  
  /**
   * Determines the highest order of an ML2 model.
   * 
   * @param model the ML2 Model to be considered.
   */
  public static int highestOrder(final ML2Model model) {
    int order = 1;
    EList<ModelElement> _elements = model.getElements();
    for (final ModelElement element : _elements) {
      if ((element instanceof HOClass)) {
        Integer _order = ((HOClass)element).getOrder();
        boolean _greaterThan = ((_order).intValue() > order);
        if (_greaterThan) {
          order = (((HOClass)element).getOrder()).intValue();
        }
      }
    }
    return order;
  }
  
  /**
   * Converts an EList of ML2 Literals to an ArrayList of ML2 Booleans.
   * 
   * @param list the list of ML2 Literals to be converted.
   */
  public static ArrayList<ML2Boolean> convertToBooleanList(final EList<Literal> list) {
    ArrayList<ML2Boolean> booleanList = new ArrayList<ML2Boolean>();
    for (final Literal element : list) {
      if ((element instanceof ML2Boolean)) {
        booleanList.add(((ML2Boolean)element));
      }
    }
    return booleanList;
  }
  
  /**
   * Converts an EList of ML2 Literals to an ArrayList of ML2 Numbers.
   * 
   * @param list the list of ML2 Literals to be converted.
   */
  public static ArrayList<ML2Number> convertToNumberList(final EList<Literal> list) {
    ArrayList<ML2Number> numberList = new ArrayList<ML2Number>();
    for (final Literal element : list) {
      if ((element instanceof ML2Number)) {
        numberList.add(((ML2Number)element));
      }
    }
    return numberList;
  }
  
  /**
   * Converts an EList of ML2 Literals to an ArrayList of ML2 Strings.
   * 
   * @param list the list of ML2 Literals to be converted.
   */
  public static ArrayList<ML2String> convertToStringList(final EList<Literal> list) {
    ArrayList<ML2String> stringList = new ArrayList<ML2String>();
    for (final Literal element : list) {
      if ((element instanceof ML2String)) {
        stringList.add(((ML2String)element));
      }
    }
    return stringList;
  }
  
  public static CharSequence generateAlloyElement(final ModelElement individual) {
    if (individual instanceof Individual) {
      return _generateAlloyElement((Individual)individual);
    } else if (individual instanceof ML2Class) {
      return _generateAlloyElement((ML2Class)individual);
    } else if (individual instanceof GeneralizationSet) {
      return _generateAlloyElement((GeneralizationSet)individual);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(individual).toString());
    }
  }
  
  public static CharSequence generateAlloySignature(final ML2Class foclass) {
    if (foclass instanceof FOClass) {
      return _generateAlloySignature((FOClass)foclass);
    } else if (foclass instanceof HOClass) {
      return _generateAlloySignature((HOClass)foclass);
    } else if (foclass instanceof OrderlessClass) {
      return _generateAlloySignature((OrderlessClass)foclass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(foclass).toString());
    }
  }
  
  public static CharSequence generateAlloySignatureFields(final Feature attribute) {
    if (attribute instanceof Attribute) {
      return _generateAlloySignatureFields((Attribute)attribute);
    } else if (attribute instanceof Reference) {
      return _generateAlloySignatureFields((Reference)attribute);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attribute).toString());
    }
  }
  
  public static CharSequence generateAlloySingleton(final EntityDeclaration foclass) {
    if (foclass instanceof FOClass) {
      return _generateAlloySingleton((FOClass)foclass);
    } else if (foclass instanceof HOClass) {
      return _generateAlloySingleton((HOClass)foclass);
    } else if (foclass instanceof OrderlessClass) {
      return _generateAlloySingleton((OrderlessClass)foclass);
    } else if (foclass instanceof Individual) {
      return _generateAlloySingleton((Individual)foclass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(foclass).toString());
    }
  }
  
  public static CharSequence generateAlloySingletonFields(final FeatureAssignment attributeAssignment) {
    if (attributeAssignment instanceof AttributeAssignment) {
      return _generateAlloySingletonFields((AttributeAssignment)attributeAssignment);
    } else if (attributeAssignment instanceof ReferenceAssignment) {
      return _generateAlloySingletonFields((ReferenceAssignment)attributeAssignment);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attributeAssignment).toString());
    }
  }
  
  public static CharSequence generateRegularityFeatureFact(final FeatureAssignment attributeAssignment, final ML2Class ml2class) {
    if (attributeAssignment instanceof AttributeAssignment) {
      return _generateRegularityFeatureFact((AttributeAssignment)attributeAssignment, ml2class);
    } else if (attributeAssignment instanceof ReferenceAssignment) {
      return _generateRegularityFeatureFact((ReferenceAssignment)attributeAssignment, ml2class);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attributeAssignment, ml2class).toString());
    }
  }
}
