/**
 * ML2Generator.xtend
 * 
 * Author:
 * 	Fernando Amaral Musso
 */
package br.ufes.inf.nemo.ml2.generator;

import br.ufes.inf.nemo.ml2.model.AdditionExpression;
import br.ufes.inf.nemo.ml2.model.AdditionOperation;
import br.ufes.inf.nemo.ml2.model.AdditionOperator;
import br.ufes.inf.nemo.ml2.model.AndExpression;
import br.ufes.inf.nemo.ml2.model.ArrowOperation;
import br.ufes.inf.nemo.ml2.model.Attribute;
import br.ufes.inf.nemo.ml2.model.AttributeAssignment;
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperation;
import br.ufes.inf.nemo.ml2.model.BinaryNumberOperator;
import br.ufes.inf.nemo.ml2.model.BinarySetOperation;
import br.ufes.inf.nemo.ml2.model.BinarySetOperator;
import br.ufes.inf.nemo.ml2.model.BooleanLiteralExpression;
import br.ufes.inf.nemo.ml2.model.CallExpression;
import br.ufes.inf.nemo.ml2.model.CallOperation;
import br.ufes.inf.nemo.ml2.model.CategorizationType;
import br.ufes.inf.nemo.ml2.model.CollectionLiteralExpression;
import br.ufes.inf.nemo.ml2.model.ComparisonExpression;
import br.ufes.inf.nemo.ml2.model.ComparisonOperation;
import br.ufes.inf.nemo.ml2.model.ComparisonOperator;
import br.ufes.inf.nemo.ml2.model.DataType;
import br.ufes.inf.nemo.ml2.model.DerivationConstraint;
import br.ufes.inf.nemo.ml2.model.DotOperation;
import br.ufes.inf.nemo.ml2.model.EntityDeclaration;
import br.ufes.inf.nemo.ml2.model.Feature;
import br.ufes.inf.nemo.ml2.model.FeatureAssignment;
import br.ufes.inf.nemo.ml2.model.FirstOrderClass;
import br.ufes.inf.nemo.ml2.model.GeneralizationSet;
import br.ufes.inf.nemo.ml2.model.HighOrderClass;
import br.ufes.inf.nemo.ml2.model.HigherOrderClass;
import br.ufes.inf.nemo.ml2.model.IfExpression;
import br.ufes.inf.nemo.ml2.model.ImpliesExpression;
import br.ufes.inf.nemo.ml2.model.Individual;
import br.ufes.inf.nemo.ml2.model.InvariantConstraint;
import br.ufes.inf.nemo.ml2.model.LetExpression;
import br.ufes.inf.nemo.ml2.model.LiteralExpression;
import br.ufes.inf.nemo.ml2.model.Model;
import br.ufes.inf.nemo.ml2.model.ModelElement;
import br.ufes.inf.nemo.ml2.model.MultiaryIteration;
import br.ufes.inf.nemo.ml2.model.MultiaryIterator;
import br.ufes.inf.nemo.ml2.model.MultiplicationExpression;
import br.ufes.inf.nemo.ml2.model.NullLiteralExpression;
import br.ufes.inf.nemo.ml2.model.NumberLiteralExpression;
import br.ufes.inf.nemo.ml2.model.OclExpression;
import br.ufes.inf.nemo.ml2.model.OrExpression;
import br.ufes.inf.nemo.ml2.model.OrderlessClass;
import br.ufes.inf.nemo.ml2.model.PrimitiveLiteralExpression;
import br.ufes.inf.nemo.ml2.model.PrimitiveType;
import br.ufes.inf.nemo.ml2.model.Reference;
import br.ufes.inf.nemo.ml2.model.ReferenceAssignment;
import br.ufes.inf.nemo.ml2.model.RegularityAttribute;
import br.ufes.inf.nemo.ml2.model.RegularityFeatureType;
import br.ufes.inf.nemo.ml2.model.RegularityReference;
import br.ufes.inf.nemo.ml2.model.RelationalExpression;
import br.ufes.inf.nemo.ml2.model.RelationalOperation;
import br.ufes.inf.nemo.ml2.model.RelationalOperator;
import br.ufes.inf.nemo.ml2.model.StringLiteralExpression;
import br.ufes.inf.nemo.ml2.model.TermExpression;
import br.ufes.inf.nemo.ml2.model.TupleLiteralExpression;
import br.ufes.inf.nemo.ml2.model.TypeLiteralExpression;
import br.ufes.inf.nemo.ml2.model.UnaryExpression;
import br.ufes.inf.nemo.ml2.model.UnaryIteration;
import br.ufes.inf.nemo.ml2.model.UnaryIterator;
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperation;
import br.ufes.inf.nemo.ml2.model.UnaryNumberOperator;
import br.ufes.inf.nemo.ml2.model.UnaryOperator;
import br.ufes.inf.nemo.ml2.model.UnarySetOperation;
import br.ufes.inf.nemo.ml2.model.UnarySetOperator;
import br.ufes.inf.nemo.ml2.model.VariableDeclaration;
import br.ufes.inf.nemo.ml2.model.VariableExpression;
import br.ufes.inf.nemo.ml2.model.XorExpression;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates an Alloy model from an ML2 Model.
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
    final Model model = ((Model) _get);
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
  public static CharSequence generateAlloyModel(final Model ml2model) {
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
    CharSequence _generateDisjointDisconnectedHierarchiesFact = ML2Generator.generateDisjointDisconnectedHierarchiesFact(ml2model);
    _builder.append(_generateDisjointDisconnectedHierarchiesFact);
    _builder.newLineIfNotEmpty();
    CharSequence _generateUnwantedInstantiationsFact = ML2Generator.generateUnwantedInstantiationsFact(ml2model);
    _builder.append(_generateUnwantedInstantiationsFact);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
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
  public static CharSequence generateMLTStarAlloyModel(final Model model) {
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
    _builder.newLine();
    _builder.append("fun abs [self: Int] : Int {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("self < 0 implies negate[self] else self");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fun min [self, i: Int] : Int {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("let a = int[self], b = int[i] | a <= b implies a else b");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("fun max [self, i: Int] : Int {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("let a = int[self], b = int[i] | a <= b implies b else a");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates the Alloy counterpart of an ML2 Individual element.
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
   * Generates the Alloy counterpart of an ML2 Class element.
   * 
   * @param ml2class the ML2 Class element to be transformed.
   */
  protected static CharSequence _generateAlloyElement(final br.ufes.inf.nemo.ml2.model.Class _class) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateAlloySignature = ML2Generator.generateAlloySignature(_class);
    _builder.append(_generateAlloySignature);
    _builder.newLineIfNotEmpty();
    CharSequence _generateAlloySingleton = ML2Generator.generateAlloySingleton(_class);
    _builder.append(_generateAlloySingleton);
    _builder.newLineIfNotEmpty();
    _builder.append("fact ");
    String _name = _class.getName();
    _builder.append(_name);
    _builder.append("ReifiedDefinition {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("all e: Entity | e in ");
    String _name_1 = _class.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Reified iff (all e\': Entity | iof[e\',e] iff e\' in ");
    String _name_2 = _class.getName();
    _builder.append(_name_2, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    CharSequence _generateProperSpecializationFact = ML2Generator.generateProperSpecializationFact(_class);
    _builder.append(_generateProperSpecializationFact);
    _builder.newLineIfNotEmpty();
    CharSequence _generatePowertypeFact = ML2Generator.generatePowertypeFact(_class);
    _builder.append(_generatePowertypeFact);
    _builder.newLineIfNotEmpty();
    CharSequence _generateCategorizationFact = ML2Generator.generateCategorizationFact(_class);
    _builder.append(_generateCategorizationFact);
    _builder.newLineIfNotEmpty();
    CharSequence _generateSubordinationFact = ML2Generator.generateSubordinationFact(_class);
    _builder.append(_generateSubordinationFact);
    _builder.newLineIfNotEmpty();
    {
      EList<br.ufes.inf.nemo.ml2.model.Class> _classifiers = _class.getClassifiers();
      for(final br.ufes.inf.nemo.ml2.model.Class classifier : _classifiers) {
        {
          if (((classifier instanceof HigherOrderClass) && (((HigherOrderClass) classifier).getCategorizedClass() != null))) {
            {
              EList<FeatureAssignment> _assignments = _class.getAssignments();
              for(final FeatureAssignment assignment : _assignments) {
                CharSequence _generateRegularityFeatureFact = ML2Generator.generateRegularityFeatureFact(assignment, _class);
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
   * Generates the Alloy counterpart of an ML2 Generalization Set element.
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
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
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
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function_1 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
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
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function_2 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
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
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function_3 = (br.ufes.inf.nemo.ml2.model.Class it) -> {
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
   * def static dispatch generateAlloyElement(InvariantConstraint constraint) {'''
   * fact {
   * all self: «constraint.classContext.name» | «generateOclExpression(constraint.expression)»
   * }
   * 
   * '''
   * }
   * 
   * def static dispatch generateAlloyElement(DerivationConstraint constraint) {'''
   * fact {
   * «««	all self: «constraint.classContext.name» | self.«constraint.featureContext.name» = «generateOclExpression(constraint.expression)»
   * }
   * 
   * '''
   * }
   * 
   * def static dispatch CharSequence generateOclExpression(LetExpression expression) {
   * '''let «FOR variable : expression.variables SEPARATOR ', '»«generateVariableDeclaration(variable)»«ENDFOR» | «generateOclExpression(expression.inExpression)»'''
   * }
   * 
   * def static dispatch CharSequence generateOclExpression(IfExpression expression) {
   * '''«generateOclExpression(expression.condition)» implies «generateOclExpression(expression.thenExpression)» else «generateOclExpression(expression.elseExpression)»'''
   * }
   * 
   * def static dispatch CharSequence generateOclExpression(ImpliesExpression expression) {
   * '''«generateXorExpression(expression.left)»«FOR operation : expression.right SEPARATOR ' implies '»«generateXorExpression(operation)»«ENDFOR»'''
   * }
   * 
   * def static generateVariableDeclaration(VariableDeclaration variable) {
   * '''«variable.variableName» = «generateLiteralExpression(variable.initialValue)»'''
   * }
   * 
   * def static generateXorExpression(XorExpression expression) {
   * if(expression.right.size > 0) {
   * '''(«generateOrExpression(expression.left)» or «FOR operation : expression.right SEPARATOR ' or '»«generateOrExpression(operation)»«ENDFOR») and not («generateOrExpression(expression.left)» and «FOR operation : expression.right SEPARATOR ' and '»«generateOrExpression(operation)»«ENDFOR»)'''
   * } else {
   * '''«generateOrExpression(expression.left)»'''
   * }
   * }
   * 
   * def static generateOrExpression(OrExpression expression) {
   * '''«generateAndExpression(expression.left)»«FOR operation : expression.right SEPARATOR ' or '»«generateAndExpression(operation)»«ENDFOR»'''
   * }
   * 
   * def static generateAndExpression(AndExpression expression) {
   * '''«generateComparisonExpression(expression.left)»«FOR operation : expression.right SEPARATOR ' and '»«generateComparisonExpression(operation)»«ENDFOR»'''
   * }
   * 
   * def static generateComparisonExpression(ComparisonExpression expression) {
   * '''«generateRelationalExpression(expression.left)»«FOR operation : expression.right»«generateComparisonOperation(operation)»«ENDFOR»'''
   * }
   * 
   * def static generateComparisonOperation(ComparisonOperation operation) {
   * switch operation.operator {
   * case ComparisonOperator.EQUAL:
   * ''' = «generateRelationalExpression(operation.right)»'''
   * case ComparisonOperator.NOT_EQUAL:
   * ''' != «generateRelationalExpression(operation.right)»'''
   * }
   * }
   * 
   * def static generateRelationalExpression(RelationalExpression expression) {
   * '''«generateAdditionExpression(expression.left)»«FOR operation : expression.right»«generateRelationalOperation(operation)»«ENDFOR»'''
   * }
   * 
   * def static generateRelationalOperation(RelationalOperation operation) {
   * switch operation.operator {
   * case RelationalOperator.GREATER:
   * ''' > «generateAdditionExpression(operation.right)»'''
   * case RelationalOperator.LESS:
   * ''' < «generateAdditionExpression(operation.right)»'''
   * case RelationalOperator.GREATER_EQUAL:
   * ''' >= «generateAdditionExpression(operation.right)»'''
   * case RelationalOperator.LESS_EQUAL:
   * ''' <= «generateAdditionExpression(operation.right)»'''
   * }
   * }
   * 
   * def static generateAdditionExpression(AdditionExpression expression) {
   * '''«generateMultiplicationExpression(expression.left)»«FOR operation : expression.right»«generateAdditionOperation(operation)»«ENDFOR»'''
   * }
   * 
   * def static generateAdditionOperation(AdditionOperation operation) {
   * switch operation.operator {
   * case AdditionOperator.PLUS:
   * '''.plus[«generateMultiplicationExpression(operation.right)»]'''
   * case AdditionOperator.MINUS:
   * '''.minus[«generateMultiplicationExpression(operation.right)»]'''
   * }
   * }
   * 
   * def static generateMultiplicationExpression(MultiplicationExpression expression) {
   * '''«generateUnaryExpression(expression.left)»«FOR operation : expression.right».mul[«generateUnaryExpression(operation)»]«ENDFOR»'''
   * }
   * 
   * // TODO: set difference
   * def static generateUnaryExpression(UnaryExpression expression) {
   * switch expression.operator {
   * case UnaryOperator.NONE:
   * '''«generateTermExpression(expression.right)»'''
   * case UnaryOperator.NOT:
   * '''not «generateTermExpression(expression.right)»'''
   * case UnaryOperator.MINUS:
   * '''negate[«generateTermExpression(expression.right)»]'''
   * }
   * }
   * 
   * def static dispatch CharSequence generateTermExpression(CallExpression expression) {
   * generateCallExpression(expression)
   * }
   * 
   * def static dispatch CharSequence generateTermExpression(LiteralExpression expression) {
   * generateLiteralExpression(expression)
   * }
   * 
   * def static dispatch CharSequence generateTermExpression(OclExpression expression) {
   * '''(«generateOclExpression(expression)»)'''
   * }
   * 
   * def static generateCallExpression(CallExpression expression) {
   * '''«generateVariableExpression(expression.left)»«FOR operation : expression.right»«generateCallOperation(operation)»«ENDFOR»'''
   * }
   * 
   * def static dispatch CharSequence generateCallOperation(DotOperation operation) {
   * '''.«generateVariableExpression(operation.right)»'''
   * }
   * 
   * def static dispatch CharSequence generateCallOperation(ArrowOperation operation) {
   * generateBuiltInOperation(operation.right)
   * }
   * 
   * def static dispatch CharSequence generateBuiltInOperation(UnarySetOperation operation) {
   * '''uso'''
   * }
   * 
   * def static dispatch CharSequence generateBuiltInOperation(BinarySetOperation operation) {
   * '''bso'''
   * }
   * 
   * def static dispatch CharSequence generateBuiltInOperation(UnaryIteration operation) {
   * '''ui'''
   * }
   * 
   * def static dispatch CharSequence generateBuiltInOperation(BinaryIteration operation) {
   * '''bi'''
   * }
   * 
   * def static dispatch CharSequence generateLiteralExpression(PrimitiveLiteralExpression expression) {
   * generatePrimitiveLiteralExpression(expression)
   * }
   * 
   * def static dispatch CharSequence generateLiteralExpression(CollectionLiteralExpression expression) {
   * '''«FOR part : expression.parts SEPARATOR ' + '»«generateLiteralExpression(part)»«ENDFOR»'''
   * }
   * 
   * def static dispatch CharSequence generateLiteralExpression(TypeLiteralExpression expression) {
   * '''TYPE_LITERAL_TRANSFORM'''
   * }
   * 
   * def static dispatch CharSequence generateLiteralExpression(TupleLiteralExpression expression) {
   * '''TUPLE_TRANSFORM'''
   * }
   * 
   * def static dispatch CharSequence generatePrimitiveLiteralExpression(NullLiteralExpression expression) {
   * '''none'''
   * }
   * 
   * def static dispatch CharSequence generatePrimitiveLiteralExpression(BooleanLiteralExpression expression) {
   * '''«expression.booleanSymbol»'''
   * }
   * 
   * def static dispatch CharSequence generatePrimitiveLiteralExpression(NumberLiteralExpression expression) {
   * '''«expression.numberSymbol.intValue»'''
   * }
   * 
   * def static dispatch CharSequence generatePrimitiveLiteralExpression(StringLiteralExpression expression) {
   * '''«expression.stringSymbol»'''
   * }
   * 
   * def static generateVariableExpression(VariableExpression expression) {
   * '''«expression.referringVariable»'''
   * }
   */
  protected static CharSequence _generateAlloyElement(final InvariantConstraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fact {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("all self: ");
    String _name = constraint.getClassContext().getName();
    _builder.append(_name, "\t");
    _builder.append(" | ");
    CharSequence _generateOclExpression = ML2Generator.generateOclExpression(constraint.getExpression());
    _builder.append(_generateOclExpression, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence _generateAlloyElement(final DerivationConstraint constraint) {
    CharSequence _xblockexpression = null;
    {
      Feature feature = constraint.getFeatureContext();
      CharSequence _xifexpression = null;
      if ((feature instanceof Attribute)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fact {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("all self: ");
        String _name = constraint.getClassContext().getName();
        _builder.append(_name, "\t");
        _builder.append(" | self.");
        String _name_1 = ((Attribute)feature).getName();
        _builder.append(_name_1, "\t");
        _builder.append(" = ");
        CharSequence _generateOclExpression = ML2Generator.generateOclExpression(constraint.getExpression());
        _builder.append(_generateOclExpression, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _xifexpression = _builder;
      } else {
        CharSequence _xifexpression_1 = null;
        if ((feature instanceof Reference)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("fact {");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("all self: ");
          String _name_2 = constraint.getClassContext().getName();
          _builder_1.append(_name_2, "\t");
          _builder_1.append(" | self.");
          String _name_3 = ((Reference)feature).getName();
          _builder_1.append(_name_3, "\t");
          _builder_1.append(" = ");
          CharSequence _generateOclExpression_1 = ML2Generator.generateOclExpression(constraint.getExpression());
          _builder_1.append(_generateOclExpression_1, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _builder_1.newLine();
          _xifexpression_1 = _builder_1;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * TODO: parenthesis
   */
  protected static CharSequence _generateOclExpression(final LetExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("let ");
    {
      EList<VariableDeclaration> _variables = expression.getVariables();
      boolean _hasElements = false;
      for(final VariableDeclaration variable : _variables) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _generateVariableDeclaration = ML2Generator.generateVariableDeclaration(variable);
        _builder.append(_generateVariableDeclaration);
      }
    }
    _builder.append(" | ");
    CharSequence _generateOclExpression = ML2Generator.generateOclExpression(expression.getInExpression());
    _builder.append(_generateOclExpression);
    return _builder;
  }
  
  protected static CharSequence _generateOclExpression(final IfExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _generateOclExpression = ML2Generator.generateOclExpression(expression.getCondition());
    _builder.append(_generateOclExpression);
    _builder.append(" implies ");
    CharSequence _generateOclExpression_1 = ML2Generator.generateOclExpression(expression.getThenExpression());
    _builder.append(_generateOclExpression_1);
    _builder.append(" else ");
    CharSequence _generateOclExpression_2 = ML2Generator.generateOclExpression(expression.getElseExpression());
    _builder.append(_generateOclExpression_2);
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _generateOclExpression(final ImpliesExpression expression) {
    CharSequence result = ML2Generator.generateXorExpression(expression.getLeft());
    EList<XorExpression> _right = expression.getRight();
    for (final XorExpression operation : _right) {
      CharSequence _generateXorExpression = ML2Generator.generateXorExpression(operation);
      String _plus = ((("(" + result) + " implies ") + _generateXorExpression);
      String _plus_1 = (_plus + ")");
      result = _plus_1;
    }
    return result;
  }
  
  public static CharSequence generateVariableDeclaration(final VariableDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _variableName = variable.getVariableName();
    _builder.append(_variableName);
    _builder.append(" = ");
    CharSequence _generateTermExpression = ML2Generator.generateTermExpression(variable.getInitialValue());
    _builder.append(_generateTermExpression);
    return _builder;
  }
  
  public static CharSequence generateXorExpression(final XorExpression expression) {
    CharSequence result = ML2Generator.generateOrExpression(expression.getLeft());
    EList<OrExpression> _right = expression.getRight();
    for (final OrExpression operation : _right) {
      CharSequence _generateOrExpression = ML2Generator.generateOrExpression(operation);
      String _plus = ((("((" + result) + " or ") + _generateOrExpression);
      String _plus_1 = (_plus + ") and not (");
      String _plus_2 = (_plus_1 + result);
      String _plus_3 = (_plus_2 + " and ");
      CharSequence _generateOrExpression_1 = ML2Generator.generateOrExpression(operation);
      String _plus_4 = (_plus_3 + _generateOrExpression_1);
      String _plus_5 = (_plus_4 + "))");
      result = _plus_5;
    }
    return result;
  }
  
  public static CharSequence generateOrExpression(final OrExpression expression) {
    CharSequence result = ML2Generator.generateAndExpression(expression.getLeft());
    EList<AndExpression> _right = expression.getRight();
    for (final AndExpression operation : _right) {
      String _plus = (result + " or ");
      CharSequence _generateAndExpression = ML2Generator.generateAndExpression(operation);
      String _plus_1 = (_plus + _generateAndExpression);
      result = _plus_1;
    }
    return result;
  }
  
  public static CharSequence generateAndExpression(final AndExpression expression) {
    CharSequence result = ML2Generator.generateComparisonExpression(expression.getLeft());
    EList<ComparisonExpression> _right = expression.getRight();
    for (final ComparisonExpression operation : _right) {
      String _plus = (result + " and ");
      CharSequence _generateComparisonExpression = ML2Generator.generateComparisonExpression(operation);
      String _plus_1 = (_plus + _generateComparisonExpression);
      result = _plus_1;
    }
    return result;
  }
  
  public static CharSequence generateComparisonExpression(final ComparisonExpression expression) {
    CharSequence result = ML2Generator.generateRelationalExpression(expression.getLeft());
    EList<ComparisonOperation> _right = expression.getRight();
    for (final ComparisonOperation operation : _right) {
      ComparisonOperator _operator = operation.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case EQUAL:
            CharSequence _generateRelationalExpression = ML2Generator.generateRelationalExpression(operation.getRight());
            String _plus = ((("(" + result) + " = ") + _generateRelationalExpression);
            String _plus_1 = (_plus + ")");
            result = _plus_1;
            break;
          case NOT_EQUAL:
            CharSequence _generateRelationalExpression_1 = ML2Generator.generateRelationalExpression(operation.getRight());
            String _plus_2 = ((("(" + result) + " != ") + _generateRelationalExpression_1);
            String _plus_3 = (_plus_2 + ")");
            result = _plus_3;
            break;
          default:
            break;
        }
      }
    }
    return result;
  }
  
  public static CharSequence generateRelationalExpression(final RelationalExpression expression) {
    CharSequence result = ML2Generator.generateAdditionExpression(expression.getLeft());
    EList<RelationalOperation> _right = expression.getRight();
    for (final RelationalOperation operation : _right) {
      RelationalOperator _operator = operation.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case GREATER:
            CharSequence _generateAdditionExpression = ML2Generator.generateAdditionExpression(operation.getRight());
            String _plus = ((("(" + result) + " > ") + _generateAdditionExpression);
            String _plus_1 = (_plus + ")");
            result = _plus_1;
            break;
          case LESS:
            CharSequence _generateAdditionExpression_1 = ML2Generator.generateAdditionExpression(operation.getRight());
            String _plus_2 = ((("(" + result) + " < ") + _generateAdditionExpression_1);
            String _plus_3 = (_plus_2 + ")");
            result = _plus_3;
            break;
          case GREATER_EQUAL:
            CharSequence _generateAdditionExpression_2 = ML2Generator.generateAdditionExpression(operation.getRight());
            String _plus_4 = ((("(" + result) + " >= ") + _generateAdditionExpression_2);
            String _plus_5 = (_plus_4 + ")");
            result = _plus_5;
            break;
          case LESS_EQUAL:
            CharSequence _generateAdditionExpression_3 = ML2Generator.generateAdditionExpression(operation.getRight());
            String _plus_6 = ((("(" + result) + " <= ") + _generateAdditionExpression_3);
            String _plus_7 = (_plus_6 + ")");
            result = _plus_7;
            break;
          default:
            break;
        }
      }
    }
    return result;
  }
  
  public static CharSequence generateAdditionExpression(final AdditionExpression expression) {
    CharSequence result = ML2Generator.generateMultiplicationExpression(expression.getLeft());
    EList<AdditionOperation> _right = expression.getRight();
    for (final AdditionOperation operation : _right) {
      AdditionOperator _operator = operation.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case PLUS:
            String _plus = (result + ".plus[");
            CharSequence _generateMultiplicationExpression = ML2Generator.generateMultiplicationExpression(operation.getRight());
            String _plus_1 = (_plus + _generateMultiplicationExpression);
            String _plus_2 = (_plus_1 + "]");
            result = _plus_2;
            break;
          case MINUS:
            String _plus_3 = (result + ".minus[");
            CharSequence _generateMultiplicationExpression_1 = ML2Generator.generateMultiplicationExpression(operation.getRight());
            String _plus_4 = (_plus_3 + _generateMultiplicationExpression_1);
            String _plus_5 = (_plus_4 + "]");
            result = _plus_5;
            break;
          default:
            break;
        }
      }
    }
    return result;
  }
  
  public static CharSequence generateMultiplicationExpression(final MultiplicationExpression expression) {
    CharSequence result = ML2Generator.generateUnaryExpression(expression.getLeft());
    EList<UnaryExpression> _right = expression.getRight();
    for (final UnaryExpression operation : _right) {
      String _plus = (result + ".mul[");
      CharSequence _generateUnaryExpression = ML2Generator.generateUnaryExpression(operation);
      String _plus_1 = (_plus + _generateUnaryExpression);
      String _plus_2 = (_plus_1 + "]");
      result = _plus_2;
    }
    return result;
  }
  
  /**
   * TODO: set difference
   */
  public static CharSequence generateUnaryExpression(final UnaryExpression expression) {
    UnaryOperator _operator = expression.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case NONE:
          return ML2Generator.generateTermExpression(expression.getRight());
        case NOT:
          CharSequence _generateTermExpression = ML2Generator.generateTermExpression(expression.getRight());
          return ("not " + _generateTermExpression);
        case MINUS:
          CharSequence _generateTermExpression_1 = ML2Generator.generateTermExpression(expression.getRight());
          String _plus = ("negate[" + _generateTermExpression_1);
          return (_plus + "]");
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _generateTermExpression(final CallExpression expression) {
    String result = ML2Generator.generateVariableExpression(expression.getLeft());
    EList<CallOperation> _right = expression.getRight();
    for (final CallOperation operation : _right) {
      result = ML2Generator.generateCallExpression(operation, result).toString();
    }
    return result;
  }
  
  protected static CharSequence _generateTermExpression(final LiteralExpression expression) {
    return ML2Generator.generateLiteralExpression(expression);
  }
  
  protected static CharSequence _generateTermExpression(final OclExpression expression) {
    CharSequence _generateOclExpression = ML2Generator.generateOclExpression(expression);
    String _plus = ("(" + _generateOclExpression);
    return (_plus + ")");
  }
  
  protected static CharSequence _generateCallExpression(final DotOperation operation, final CharSequence result) {
    return ML2Generator.generateDotOperation(operation, result);
  }
  
  protected static CharSequence _generateDotOperation(final UnaryNumberOperation operation, final CharSequence result) {
    UnaryNumberOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case ABS:
          return (("abs[" + result) + "]");
        case FLOOR:
          return result;
        case ROUND:
          return result;
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _generateDotOperation(final BinaryNumberOperation operation, final CharSequence result) {
    BinaryNumberOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case MIN:
          CharSequence _generateOclExpression = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus = ((("min[" + result) + ", ") + _generateOclExpression);
          return (_plus + "]");
        case MAX:
          CharSequence _generateOclExpression_1 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_1 = ((("max[" + result) + ", ") + _generateOclExpression_1);
          return (_plus_1 + "]");
        case DIV:
          CharSequence _generateOclExpression_2 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_2 = ((("(" + result) + ").div[") + _generateOclExpression_2);
          return (_plus_2 + "]");
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _generateDotOperation(final VariableExpression operation, final CharSequence result) {
    String _plus = (result + ".");
    String _generateVariableExpression = ML2Generator.generateVariableExpression(operation);
    return (_plus + _generateVariableExpression);
  }
  
  protected static CharSequence _generateCallExpression(final ArrowOperation operation, final CharSequence result) {
    return ML2Generator.generateArrowOperation(operation, result);
  }
  
  protected static CharSequence _generateArrowOperation(final UnarySetOperation operation, final CharSequence result) {
    UnarySetOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case SIZE:
          return (("(# " + result) + ")");
        case IS_EMPTY:
          return (("(no " + result) + ")");
        case NOT_EMPTY:
          return (("(some " + result) + ")");
        case SUM:
          return (("(sum " + result) + ")");
        case MIN:
          return (((("{ i: " + result) + " | all j: ") + result) + " | int[i] <= int[j] }");
        case MAX:
          return (((("{ i: " + result) + " | all j: ") + result) + " | int[i] >= int[j] }");
        case AS_SET:
          return result;
        case FLATTEN:
          return result;
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _generateArrowOperation(final BinarySetOperation operation, final CharSequence result) {
    BinarySetOperator _operator = operation.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case INCLUDES:
          CharSequence _generateOclExpression = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus = ("(" + _generateOclExpression);
          String _plus_1 = (_plus + " in ");
          String _plus_2 = (_plus_1 + result);
          return (_plus_2 + ")");
        case INCLUDES_ALL:
          CharSequence _generateOclExpression_1 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_3 = ("(" + _generateOclExpression_1);
          String _plus_4 = (_plus_3 + " in ");
          String _plus_5 = (_plus_4 + result);
          return (_plus_5 + ")");
        case EXCLUDES:
          CharSequence _generateOclExpression_2 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_6 = ("(" + _generateOclExpression_2);
          String _plus_7 = (_plus_6 + " not in ");
          String _plus_8 = (_plus_7 + result);
          return (_plus_8 + ")");
        case EXCLUDES_ALL:
          CharSequence _generateOclExpression_3 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_9 = ("(no (" + _generateOclExpression_3);
          String _plus_10 = (_plus_9 + " & ");
          String _plus_11 = (_plus_10 + result);
          return (_plus_11 + "))");
        case INCLUDING:
          CharSequence _generateOclExpression_4 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_12 = ((("(" + result) + " + ") + _generateOclExpression_4);
          return (_plus_12 + ")");
        case EXCLUDING:
          CharSequence _generateOclExpression_5 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_13 = ((("(" + result) + " - ") + _generateOclExpression_5);
          return (_plus_13 + ")");
        case COUNT:
          CharSequence _generateOclExpression_6 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_14 = ("(" + _generateOclExpression_6);
          String _plus_15 = (_plus_14 + " in ");
          String _plus_16 = (_plus_15 + result);
          return (_plus_16 + " implies 1 else 0)");
        case UNION:
          CharSequence _generateOclExpression_7 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_17 = ((("(" + result) + " + ") + _generateOclExpression_7);
          return (_plus_17 + ")");
        case INTERSECTION:
          CharSequence _generateOclExpression_8 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_18 = ((("(" + result) + " & ") + _generateOclExpression_8);
          return (_plus_18 + ")");
        case SYMMETRIC_DIFFERENCE:
          CharSequence _generateOclExpression_9 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_19 = ((("((" + result) + " - ") + _generateOclExpression_9);
          String _plus_20 = (_plus_19 + ") + (");
          CharSequence _generateOclExpression_10 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_21 = (_plus_20 + _generateOclExpression_10);
          String _plus_22 = (_plus_21 + " - ");
          String _plus_23 = (_plus_22 + result);
          return (_plus_23 + "))");
        case PRODUCT:
          CharSequence _generateOclExpression_11 = ML2Generator.generateOclExpression(operation.getArgument());
          String _plus_24 = ((("(" + result) + " -> ") + _generateOclExpression_11);
          return (_plus_24 + ")");
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _generateArrowOperation(final UnaryIteration operation, final CharSequence result) {
    String variable = "x";
    String _variable = operation.getVariable();
    boolean _tripleNotEquals = (_variable != null);
    if (_tripleNotEquals) {
      variable = operation.getVariable();
    }
    UnaryIterator _iterator = operation.getIterator();
    if (_iterator != null) {
      switch (_iterator) {
        case SELECT:
          CharSequence _generateOclExpression = ML2Generator.generateOclExpression(operation.getBody());
          String _plus = ((((("{" + variable) + " : ") + result) + " | ") + _generateOclExpression);
          return (_plus + "}");
        case REJECT:
          CharSequence _generateOclExpression_1 = ML2Generator.generateOclExpression(operation.getBody());
          String _plus_1 = ((((("{" + variable) + " : ") + result) + " | not ") + _generateOclExpression_1);
          return (_plus_1 + "}");
        case COLLECT:
          return "";
        case ANY:
          return "";
        case ONE:
          return "";
        case IS_UNIQUE:
          return "";
        case CLOSURE:
          return "";
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _generateArrowOperation(final MultiaryIteration operation, final CharSequence result) {
    MultiaryIterator _iterator = operation.getIterator();
    if (_iterator != null) {
      switch (_iterator) {
        case EXISTS:
          return "";
        case FOR_ALL:
          return "";
        default:
          break;
      }
    }
    return null;
  }
  
  protected static CharSequence _generateLiteralExpression(final PrimitiveLiteralExpression expression) {
    return ML2Generator.generatePrimitiveLiteralExpression(expression);
  }
  
  protected static CharSequence _generateLiteralExpression(final CollectionLiteralExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<LiteralExpression> _parts = expression.getParts();
      boolean _hasElements = false;
      for(final LiteralExpression part : _parts) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" + ", "");
        }
        CharSequence _generateLiteralExpression = ML2Generator.generateLiteralExpression(part);
        _builder.append(_generateLiteralExpression);
      }
    }
    return _builder;
  }
  
  protected static CharSequence _generateLiteralExpression(final TypeLiteralExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TYPE_LITERAL_TRANSFORM");
    return _builder;
  }
  
  protected static CharSequence _generateLiteralExpression(final TupleLiteralExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TUPLE_TRANSFORM");
    return _builder;
  }
  
  protected static CharSequence _generatePrimitiveLiteralExpression(final NullLiteralExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("none");
    return _builder;
  }
  
  protected static CharSequence _generatePrimitiveLiteralExpression(final BooleanLiteralExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    boolean _isBooleanSymbol = expression.isBooleanSymbol();
    _builder.append(_isBooleanSymbol);
    return _builder;
  }
  
  protected static CharSequence _generatePrimitiveLiteralExpression(final NumberLiteralExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    int _intValue = Double.valueOf(expression.getNumberSymbol()).intValue();
    _builder.append(_intValue);
    return _builder;
  }
  
  protected static CharSequence _generatePrimitiveLiteralExpression(final StringLiteralExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _stringSymbol = expression.getStringSymbol();
    _builder.append(_stringSymbol);
    return _builder;
  }
  
  public static String generateVariableExpression(final VariableExpression expression) {
    return expression.getReferringVariable();
  }
  
  /**
   * Generates an Alloy signature related to an ML2 First-Order Class element.
   * 
   * @param foclass the ML2 First-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySignature(final FirstOrderClass foclass) {
    CharSequence _switchResult = null;
    int _size = foclass.getSuperClasses().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        {
          int _size_1 = foclass.getFeatures().size();
          boolean _equals = (_size_1 == 0);
          if (_equals) {
            _builder.append("sig ");
            String _name = foclass.getName();
            _builder.append(_name);
            _builder.append(" in Individual {}");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("sig ");
            String _name_1 = foclass.getName();
            _builder.append(_name_1);
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
          }
        }
        _builder.newLine();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        {
          int _size_2 = foclass.getFeatures().size();
          boolean _equals_1 = (_size_2 == 0);
          if (_equals_1) {
            _builder_1.append("sig ");
            String _name_2 = foclass.getName();
            _builder_1.append(_name_2);
            _builder_1.append(" in ");
            String _name_3 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>head(foclass.getSuperClasses()).getName();
            _builder_1.append(_name_3);
            _builder_1.append(" {}");
            _builder_1.newLineIfNotEmpty();
          } else {
            _builder_1.append("sig ");
            String _name_4 = foclass.getName();
            _builder_1.append(_name_4);
            _builder_1.append(" in ");
            String _name_5 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>head(foclass.getSuperClasses()).getName();
            _builder_1.append(_name_5);
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
          }
        }
        _builder_1.newLine();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        {
          int _size_3 = foclass.getFeatures().size();
          boolean _equals_2 = (_size_3 == 0);
          if (_equals_2) {
            _builder_2.append("sig ");
            String _name_6 = foclass.getName();
            _builder_2.append(_name_6);
            _builder_2.append(" in Individual {}");
            _builder_2.newLineIfNotEmpty();
          } else {
            _builder_2.append("sig ");
            String _name_7 = foclass.getName();
            _builder_2.append(_name_7);
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
          }
        }
        _builder_2.newLine();
        _builder_2.append("fact ");
        String _name_8 = foclass.getName();
        _builder_2.append(_name_8);
        _builder_2.append("SuperClasses {");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("all x: ");
        String _name_9 = foclass.getName();
        _builder_2.append(_name_9, "\t");
        _builder_2.append(" | x in (");
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
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
   * Generates an Alloy signature related to an ML2 High-Order Class element.
   * 
   * @param hoclass the ML2 High-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySignature(final HighOrderClass hoclass) {
    CharSequence _switchResult = null;
    int _size = hoclass.getSuperClasses().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        {
          int _size_1 = hoclass.getFeatures().size();
          boolean _equals = (_size_1 == 0);
          if (_equals) {
            _builder.append("sig ");
            String _name = hoclass.getName();
            _builder.append(_name);
            _builder.append(" in Order");
            int _order = hoclass.getOrder();
            int _minus = (_order - 1);
            _builder.append(_minus);
            _builder.append("Type {}");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("sig ");
            String _name_1 = hoclass.getName();
            _builder.append(_name_1);
            _builder.append(" in Order");
            int _order_1 = hoclass.getOrder();
            int _minus_1 = (_order_1 - 1);
            _builder.append(_minus_1);
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
          }
        }
        _builder.newLine();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        {
          int _size_2 = hoclass.getFeatures().size();
          boolean _equals_1 = (_size_2 == 0);
          if (_equals_1) {
            _builder_1.append("sig ");
            String _name_2 = hoclass.getName();
            _builder_1.append(_name_2);
            _builder_1.append(" in ");
            String _name_3 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>head(hoclass.getSuperClasses()).getName();
            _builder_1.append(_name_3);
            _builder_1.append(" {}");
            _builder_1.newLineIfNotEmpty();
          } else {
            _builder_1.append("sig ");
            String _name_4 = hoclass.getName();
            _builder_1.append(_name_4);
            _builder_1.append(" in ");
            String _name_5 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>head(hoclass.getSuperClasses()).getName();
            _builder_1.append(_name_5);
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
          }
        }
        _builder_1.newLine();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        {
          int _size_3 = hoclass.getFeatures().size();
          boolean _equals_2 = (_size_3 == 0);
          if (_equals_2) {
            _builder_2.append("sig ");
            String _name_6 = hoclass.getName();
            _builder_2.append(_name_6);
            _builder_2.append(" in Order");
            int _order_2 = hoclass.getOrder();
            int _minus_2 = (_order_2 - 1);
            _builder_2.append(_minus_2);
            _builder_2.append("Type {}");
            _builder_2.newLineIfNotEmpty();
          } else {
            _builder_2.append("sig ");
            String _name_7 = hoclass.getName();
            _builder_2.append(_name_7);
            _builder_2.append(" in Order");
            int _order_3 = hoclass.getOrder();
            int _minus_3 = (_order_3 - 1);
            _builder_2.append(_minus_3);
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
          }
        }
        _builder_2.newLine();
        _builder_2.append("fact ");
        String _name_8 = hoclass.getName();
        _builder_2.append(_name_8);
        _builder_2.append("SuperClasses {");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("\t");
        _builder_2.append("all x: ");
        String _name_9 = hoclass.getName();
        _builder_2.append(_name_9, "\t");
        _builder_2.append(" | x in (");
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
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
   * Generates an Alloy signature related to an ML2 Orderless Class element.
   * 
   * @param olclass the ML2 Orderless Class element to be transformed.
   */
  protected static CharSequence _generateAlloySignature(final OrderlessClass olclass) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = olclass.getFeatures().size();
      boolean _equals = (_size == 0);
      if (_equals) {
        _builder.append("sig ");
        String _name = olclass.getName();
        _builder.append(_name);
        _builder.append(" in OrderlessType {}");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sig ");
        String _name_1 = olclass.getName();
        _builder.append(_name_1);
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
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates an Alloy signature field related to an ML2 Attribute element.
   * 
   * @param attribute the ML2 Attribute element to be transformed.
   */
  protected static CharSequence _generateAlloySignatureFields(final Attribute attribute) {
    CharSequence _xifexpression = null;
    DataType __type = attribute.get_type();
    boolean _tripleNotEquals = (__type != null);
    if (_tripleNotEquals) {
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
   * Generates an Alloy signature field related to an ML2 Reference element.
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
   * Generates an Alloy singleton related to an ML2 Individual element.
   * 
   * @param individual the ML2 Individual element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final Individual individual) {
    CharSequence _switchResult = null;
    int _size = individual.getClassifiers().size();
    switch (_size) {
      case 1:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("one sig ");
        String _name = individual.getName();
        _builder.append(_name);
        _builder.append(" in ");
        String _name_1 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>head(individual.getClassifiers()).getName();
        _builder.append(_name_1);
        _builder.append(" {}");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact = ML2Generator.generateAlloySingletonAssignmentsFact(individual);
        _builder.append(_generateAlloySingletonAssignmentsFact);
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
        break;
      default:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("one sig ");
        String _name_2 = individual.getName();
        _builder_1.append(_name_2);
        _builder_1.append(" in Individual {}");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact_1 = ML2Generator.generateAlloySingletonAssignmentsFact(individual);
        _builder_1.append(_generateAlloySingletonAssignmentsFact_1);
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("fact ");
        String _name_3 = individual.getName();
        _builder_1.append(_name_3);
        _builder_1.append("InstantiatedClasses {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        String _name_4 = individual.getName();
        _builder_1.append(_name_4, "\t");
        _builder_1.append(" in (");
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
          return it.getName();
        };
        String _collect = individual.getClassifiers().stream().<String>map(_function).collect(Collectors.joining(" & "));
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
   * Generates an Alloy singleton related to an ML2 First-Order Class element.
   * 
   * @param foclass the ML2 First-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final FirstOrderClass foclass) {
    CharSequence _switchResult = null;
    int _size = foclass.getClassifiers().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("one sig ");
        String _name = foclass.getName();
        _builder.append(_name);
        _builder.append("Reified in Order1Type {}");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact = ML2Generator.generateAlloySingletonAssignmentsFact(foclass);
        _builder.append(_generateAlloySingletonAssignmentsFact);
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("one sig ");
        String _name_1 = foclass.getName();
        _builder_1.append(_name_1);
        _builder_1.append("Reified in ");
        String _name_2 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>head(foclass.getClassifiers()).getName();
        _builder_1.append(_name_2);
        _builder_1.append(" {}");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact_1 = ML2Generator.generateAlloySingletonAssignmentsFact(foclass);
        _builder_1.append(_generateAlloySingletonAssignmentsFact_1);
        _builder_1.newLineIfNotEmpty();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("one sig ");
        String _name_3 = foclass.getName();
        _builder_2.append(_name_3);
        _builder_2.append("Reified in Order1Type{}");
        _builder_2.newLineIfNotEmpty();
        _builder_2.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact_2 = ML2Generator.generateAlloySingletonAssignmentsFact(foclass);
        _builder_2.append(_generateAlloySingletonAssignmentsFact_2);
        _builder_2.newLineIfNotEmpty();
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
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
          return it.getName();
        };
        String _collect = foclass.getClassifiers().stream().<String>map(_function).collect(Collectors.joining(" & "));
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
   * Generates an Alloy singleton related to an ML2 High-Order Class element.
   * 
   * @param hoclass the ML2 High-Order Class element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final HighOrderClass hoclass) {
    CharSequence _switchResult = null;
    int _size = hoclass.getClassifiers().size();
    switch (_size) {
      case 0:
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("one sig ");
        String _name = hoclass.getName();
        _builder.append(_name);
        _builder.append("Reified in Order");
        int _order = hoclass.getOrder();
        _builder.append(_order);
        _builder.append("Type {}");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact = ML2Generator.generateAlloySingletonAssignmentsFact(hoclass);
        _builder.append(_generateAlloySingletonAssignmentsFact);
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
        break;
      case 1:
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("one sig ");
        String _name_1 = hoclass.getName();
        _builder_1.append(_name_1);
        _builder_1.append("Reified in ");
        String _name_2 = IterableExtensions.<br.ufes.inf.nemo.ml2.model.Class>head(hoclass.getClassifiers()).getName();
        _builder_1.append(_name_2);
        _builder_1.append(" {}");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact_1 = ML2Generator.generateAlloySingletonAssignmentsFact(hoclass);
        _builder_1.append(_generateAlloySingletonAssignmentsFact_1);
        _builder_1.newLineIfNotEmpty();
        _switchResult = _builder_1;
        break;
      default:
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("one sig ");
        String _name_3 = hoclass.getName();
        _builder_2.append(_name_3);
        _builder_2.append("Reified in Order");
        int _order_1 = hoclass.getOrder();
        _builder_2.append(_order_1);
        _builder_2.append("Type {}");
        _builder_2.newLineIfNotEmpty();
        _builder_2.newLine();
        CharSequence _generateAlloySingletonAssignmentsFact_2 = ML2Generator.generateAlloySingletonAssignmentsFact(hoclass);
        _builder_2.append(_generateAlloySingletonAssignmentsFact_2);
        _builder_2.newLineIfNotEmpty();
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
        final Function<br.ufes.inf.nemo.ml2.model.Class, String> _function = (br.ufes.inf.nemo.ml2.model.Class it) -> {
          return it.getName();
        };
        String _collect = hoclass.getClassifiers().stream().<String>map(_function).collect(Collectors.joining(" & "));
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
   * Generates an Alloy singleton related to an ML2 Orderless Class element.
   * 
   * @param olclass the ML2 Orderless Class element to be transformed.
   */
  protected static CharSequence _generateAlloySingleton(final OrderlessClass olclass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("one sig ");
    String _name = olclass.getName();
    _builder.append(_name);
    _builder.append("Reified in OrderlessType {}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateAlloySingletonAssignmentsFact = ML2Generator.generateAlloySingletonAssignmentsFact(olclass);
    _builder.append(_generateAlloySingletonAssignmentsFact);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 Individual element's assignments.
   * 
   * @param individual the ML2 Individual element to be considered.
   */
  protected static CharSequence _generateAlloySingletonAssignmentsFact(final Individual individual) {
    CharSequence _xifexpression = null;
    int _size = individual.getAssignments().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fact {");
      _builder.newLine();
      {
        EList<FeatureAssignment> _assignments = individual.getAssignments();
        for(final FeatureAssignment assignment : _assignments) {
          _builder.append("\t");
          String _name = individual.getName();
          _builder.append(_name, "\t");
          _builder.append(".");
          CharSequence _generateAlloySingletonAssignment = ML2Generator.generateAlloySingletonAssignment(assignment);
          _builder.append(_generateAlloySingletonAssignment, "\t");
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
   * Generates an Alloy fact related to an ML2 Class element's assignments.
   * 
   * @param ml2class the ML2 Class element to be considered.
   */
  protected static CharSequence _generateAlloySingletonAssignmentsFact(final br.ufes.inf.nemo.ml2.model.Class ml2class) {
    CharSequence _xifexpression = null;
    int _size = ml2class.getAssignments().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fact {");
      _builder.newLine();
      {
        EList<FeatureAssignment> _assignments = ml2class.getAssignments();
        for(final FeatureAssignment assignment : _assignments) {
          _builder.append("\t");
          String _name = ml2class.getName();
          _builder.append(_name, "\t");
          _builder.append("Reified.");
          CharSequence _generateAlloySingletonAssignment = ML2Generator.generateAlloySingletonAssignment(assignment);
          _builder.append(_generateAlloySingletonAssignment, "\t");
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
   * Generates an Alloy singleton assignment related to an ML2 AttributeAssignment element.
   * 
   * @param attributeAssignment the ML2 AttributeAssignment element to be transformed.
   */
  protected static CharSequence _generateAlloySingletonAssignment(final AttributeAssignment attributeAssignment) {
    CharSequence _xifexpression = null;
    int _size = attributeAssignment.getDatatypeValues().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = attributeAssignment.getAttribute().getName();
      _builder.append(_name);
      _builder.append(" = ");
      final Function<Individual, String> _function = (Individual it) -> {
        return it.getName();
      };
      String _collect = attributeAssignment.getDatatypeValues().stream().<String>map(_function).collect(Collectors.joining("+"));
      _builder.append(_collect);
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy singleton assignment related to an ML2 ReferenceAssignment element.
   * 
   * @param referenceAssignment the ML2 ReferenceAssignment element to be transformed.
   */
  protected static CharSequence _generateAlloySingletonAssignment(final ReferenceAssignment referenceAssignment) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = referenceAssignment.getReference().getName();
    _builder.append(_name);
    _builder.append(" = ");
    final Function<EntityDeclaration, String> _function = (EntityDeclaration it) -> {
      return it.getName();
    };
    String _collect = referenceAssignment.getValues().stream().<String>map(_function).collect(Collectors.joining("+"));
    _builder.append(_collect);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 Proper Specialization relation of a First-Order Class element.
   * 
   * @param foclass the ML2 First-Order Class element to be considered.
   */
  protected static CharSequence _generateProperSpecializationFact(final FirstOrderClass foclass) {
    CharSequence _xifexpression = null;
    int _size = foclass.getSuperClasses().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fact ");
      String _name = foclass.getName();
      _builder.append(_name);
      _builder.append("ReifiedProperSpecialization {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("properSpecializes[");
      String _name_1 = foclass.getName();
      _builder.append(_name_1, "\t");
      _builder.append("Reified,Individual_]");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("fact ");
      String _name_2 = foclass.getName();
      _builder_1.append(_name_2);
      _builder_1.append("ReifiedProperSpecialization {");
      _builder_1.newLineIfNotEmpty();
      {
        EList<br.ufes.inf.nemo.ml2.model.Class> _superClasses = foclass.getSuperClasses();
        for(final br.ufes.inf.nemo.ml2.model.Class superClass : _superClasses) {
          _builder_1.append("\t");
          _builder_1.append("properSpecializes[");
          String _name_3 = foclass.getName();
          _builder_1.append(_name_3, "\t");
          _builder_1.append("Reified,");
          String _name_4 = superClass.getName();
          _builder_1.append(_name_4, "\t");
          _builder_1.append("Reified]");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 Proper Specialization relation of a High-Order Class element.
   * 
   * @param hoclass the ML2 High-Order Class element to be considered.
   */
  protected static CharSequence _generateProperSpecializationFact(final HighOrderClass hoclass) {
    CharSequence _xifexpression = null;
    int _size = hoclass.getSuperClasses().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fact ");
      String _name = hoclass.getName();
      _builder.append(_name);
      _builder.append("ReifiedProperSpecialization {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("properSpecializes[");
      String _name_1 = hoclass.getName();
      _builder.append(_name_1, "\t");
      _builder.append("Reified,Order");
      int _order = hoclass.getOrder();
      int _minus = (_order - 1);
      _builder.append(_minus, "\t");
      _builder.append("TypeReified]");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("fact ");
      String _name_2 = hoclass.getName();
      _builder_1.append(_name_2);
      _builder_1.append("ReifiedProperSpecialization {");
      _builder_1.newLineIfNotEmpty();
      {
        EList<br.ufes.inf.nemo.ml2.model.Class> _superClasses = hoclass.getSuperClasses();
        for(final br.ufes.inf.nemo.ml2.model.Class superClass : _superClasses) {
          _builder_1.append("\t");
          _builder_1.append("properSpecializes[");
          String _name_3 = hoclass.getName();
          _builder_1.append(_name_3, "\t");
          _builder_1.append("Reified,");
          String _name_4 = superClass.getName();
          _builder_1.append(_name_4, "\t");
          _builder_1.append("Reified]");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 Proper Specialization relation of a Orderless Class element.
   * 
   * @param olclass the ML2 Orderless Class element to be considered.
   */
  protected static CharSequence _generateProperSpecializationFact(final OrderlessClass olclass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fact ");
    String _name = olclass.getName();
    _builder.append(_name);
    _builder.append("ReifiedProperSpecialization {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("properSpecializes[");
    String _name_1 = olclass.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Reified,OrderlessType_]");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 AttributeAssignment element regulated by an ML2 Attribute element.
   * 
   * @param attributeAssignment the ML2 AttributeAssignment element with regulated feature.
   * @param ml2class the ML2 Class element with regulator feature.
   */
  protected static CharSequence _generateRegularityFeatureFact(final AttributeAssignment attributeAssignment, final br.ufes.inf.nemo.ml2.model.Class ml2class) {
    CharSequence _xifexpression = null;
    Attribute _attribute = attributeAssignment.getAttribute();
    if ((_attribute instanceof RegularityAttribute)) {
      CharSequence _xblockexpression = null;
      {
        Attribute _attribute_1 = attributeAssignment.getAttribute();
        final RegularityAttribute regAtt = ((RegularityAttribute) _attribute_1);
        CharSequence _switchResult = null;
        RegularityFeatureType _regularityType = regAtt.getRegularityType();
        if (_regularityType != null) {
          switch (_regularityType) {
            case DETERMINES_VALUE:
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("fact ");
              String _name = regAtt.getName();
              _builder.append(_name);
              _builder.append("Regulates");
              String _name_1 = regAtt.getRegulates().getName();
              _builder.append(_name_1);
              _builder.append(" {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("all x: ");
              String _name_2 = ml2class.getName();
              _builder.append(_name_2, "\t");
              _builder.append(" | x.");
              String _name_3 = regAtt.getRegulates().getName();
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
              String _name_6 = regAtt.getName();
              _builder_1.append(_name_6);
              _builder_1.append("Regulates");
              String _name_7 = regAtt.getRegulates().getName();
              _builder_1.append(_name_7);
              _builder_1.append(" {");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t");
              _builder_1.append("all x: ");
              String _name_8 = ml2class.getName();
              _builder_1.append(_name_8, "\t");
              _builder_1.append(" | x.");
              String _name_9 = regAtt.getRegulates().getName();
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
              String _name_12 = regAtt.getName();
              _builder_2.append(_name_12);
              _builder_2.append("Regulates");
              String _name_13 = regAtt.getRegulates().getName();
              _builder_2.append(_name_13);
              _builder_2.append(" {");
              _builder_2.newLineIfNotEmpty();
              _builder_2.append("\t");
              _builder_2.append("all x: ");
              String _name_14 = ml2class.getName();
              _builder_2.append(_name_14, "\t");
              _builder_2.append(" | x.");
              String _name_15 = regAtt.getRegulates().getName();
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
        _xblockexpression = _switchResult;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 ReferenceAssignment element regulated by an ML2 Reference element.
   * 
   * @param referenceAssignment the ML2 ReferenceAssignment element with regulated feature.
   * @param ml2class the ML2 Class element with regulator feature.
   */
  protected static CharSequence _generateRegularityFeatureFact(final ReferenceAssignment referenceAssignment, final br.ufes.inf.nemo.ml2.model.Class ml2class) {
    CharSequence _xifexpression = null;
    Reference _reference = referenceAssignment.getReference();
    Reference _regulates = ((RegularityReference) _reference).getRegulates();
    boolean _tripleNotEquals = (_regulates != null);
    if (_tripleNotEquals) {
      CharSequence _xblockexpression = null;
      {
        Reference _reference_1 = referenceAssignment.getReference();
        final RegularityReference regRef = ((RegularityReference) _reference_1);
        CharSequence _switchResult = null;
        RegularityFeatureType _regularityType = regRef.getRegularityType();
        if (_regularityType != null) {
          switch (_regularityType) {
            case DETERMINES_TYPE:
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("fact ");
              String _name = regRef.getName();
              _builder.append(_name);
              _builder.append("Regulates");
              String _name_1 = regRef.getRegulates().getName();
              _builder.append(_name_1);
              _builder.append(" {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("all x: ");
              String _name_2 = ml2class.getName();
              _builder.append(_name_2, "\t");
              _builder.append(" | x.");
              String _name_3 = regRef.getRegulates().getName();
              _builder.append(_name_3, "\t");
              _builder.append(" = ");
              String _name_4 = ml2class.getName();
              _builder.append(_name_4, "\t");
              _builder.append("Reified.");
              String _name_5 = regRef.getName();
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
        _xblockexpression = _switchResult;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 Powertype cross-level relation.
   * 
   * @param ml2class the ML2 Class element to be considered.
   */
  public static CharSequence generatePowertypeFact(final br.ufes.inf.nemo.ml2.model.Class _class) {
    CharSequence _xifexpression = null;
    if ((_class instanceof HigherOrderClass)) {
      CharSequence _xifexpression_1 = null;
      br.ufes.inf.nemo.ml2.model.Class _powertypeOf = ((HigherOrderClass)_class).getPowertypeOf();
      boolean _tripleNotEquals = (_powertypeOf != null);
      if (_tripleNotEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fact ");
        String _name = ((HigherOrderClass)_class).getName();
        _builder.append(_name);
        _builder.append("Powertype {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("powertypeOf[");
        String _name_1 = ((HigherOrderClass)_class).getName();
        _builder.append(_name_1, "\t");
        _builder.append("Reified,");
        String _name_2 = ((HigherOrderClass)_class).getPowertypeOf().getName();
        _builder.append(_name_2, "\t");
        _builder.append("Reified]");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _xifexpression_1 = _builder;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 Subordination cross-level relation.
   * 
   * @param ml2class the ML2 Class element to be considered.
   */
  public static CharSequence generateSubordinationFact(final br.ufes.inf.nemo.ml2.model.Class _class) {
    CharSequence _xifexpression = null;
    if ((_class instanceof HigherOrderClass)) {
      CharSequence _xifexpression_1 = null;
      int _size = ((HigherOrderClass)_class).getSubordinators().size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fact ");
        String _name = ((HigherOrderClass)_class).getName();
        _builder.append(_name);
        _builder.append("Subordination {");
        _builder.newLineIfNotEmpty();
        {
          EList<HigherOrderClass> _subordinators = ((HigherOrderClass)_class).getSubordinators();
          for(final HigherOrderClass subordinator : _subordinators) {
            _builder.append("\t");
            _builder.append("isSubordinatedTo[");
            String _name_1 = ((HigherOrderClass)_class).getName();
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
        _xifexpression_1 = _builder;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact related to an ML2 Categorization cross-level relation.
   * 
   * @param ml2class the ML2 Class element to be considered.
   */
  public static CharSequence generateCategorizationFact(final br.ufes.inf.nemo.ml2.model.Class _class) {
    CharSequence _xifexpression = null;
    if ((_class instanceof HigherOrderClass)) {
      CharSequence _xifexpression_1 = null;
      br.ufes.inf.nemo.ml2.model.Class _categorizedClass = ((HigherOrderClass)_class).getCategorizedClass();
      boolean _tripleNotEquals = (_categorizedClass != null);
      if (_tripleNotEquals) {
        CharSequence _switchResult = null;
        CategorizationType _categorizationType = ((HigherOrderClass)_class).getCategorizationType();
        if (_categorizationType != null) {
          switch (_categorizationType) {
            case CATEGORIZER:
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("fact ");
              String _name = ((HigherOrderClass)_class).getName();
              _builder.append(_name);
              _builder.append("Categorization {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("categorizes[");
              String _name_1 = ((HigherOrderClass)_class).getName();
              _builder.append(_name_1, "\t");
              _builder.append("Reified,");
              String _name_2 = ((HigherOrderClass)_class).getCategorizedClass().getName();
              _builder.append(_name_2, "\t");
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
              String _name_3 = ((HigherOrderClass)_class).getName();
              _builder_1.append(_name_3);
              _builder_1.append("CompleteCategorization {");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t");
              _builder_1.append("compCategorizes[");
              String _name_4 = ((HigherOrderClass)_class).getName();
              _builder_1.append(_name_4, "\t");
              _builder_1.append("Reified,");
              String _name_5 = ((HigherOrderClass)_class).getCategorizedClass().getName();
              _builder_1.append(_name_5, "\t");
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
              String _name_6 = ((HigherOrderClass)_class).getName();
              _builder_2.append(_name_6);
              _builder_2.append("DisjointCategorization {");
              _builder_2.newLineIfNotEmpty();
              _builder_2.append("\t");
              _builder_2.append("disjCategorizes[");
              String _name_7 = ((HigherOrderClass)_class).getName();
              _builder_2.append(_name_7, "\t");
              _builder_2.append("Reified,");
              String _name_8 = ((HigherOrderClass)_class).getCategorizedClass().getName();
              _builder_2.append(_name_8, "\t");
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
              String _name_9 = ((HigherOrderClass)_class).getName();
              _builder_3.append(_name_9);
              _builder_3.append("Partition {");
              _builder_3.newLineIfNotEmpty();
              _builder_3.append("\t");
              _builder_3.append("partitions[");
              String _name_10 = ((HigherOrderClass)_class).getName();
              _builder_3.append(_name_10, "\t");
              _builder_3.append("Reified,");
              String _name_11 = ((HigherOrderClass)_class).getCategorizedClass().getName();
              _builder_3.append(_name_11, "\t");
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
        _xifexpression_1 = _switchResult;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Generates an Alloy fact to ensure the disjointness of all individuals.
   * 
   * @param ml2model the ML2 Model to be considered.
   */
  public static CharSequence generateDisjointIndividualsFact(final Model ml2model) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<Individual> individualsToInclude = new ArrayList<Individual>();
      Iterable<Individual> _filter = Iterables.<Individual>filter(ml2model.getElements(), Individual.class);
      for (final Individual individual : _filter) {
        individualsToInclude.add(individual);
      }
      CharSequence _xifexpression = null;
      int _size = individualsToInclude.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fact DisjointIndividuals {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("disjoint[");
        {
          boolean _hasElements = false;
          for(final Individual i : individualsToInclude) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            String _name = i.getName();
            _builder.append(_name, "\t");
          }
        }
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _xifexpression = _builder;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Generates an Alloy fact to ensure the disjointness of disconnected hierarchies.
   * 
   * @param ml2model the ML2 Model to be considered.
   */
  public static CharSequence generateDisjointDisconnectedHierarchiesFact(final Model ml2model) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<HashSet<br.ufes.inf.nemo.ml2.model.Class>> disconnectedHierarchies = new ArrayList<HashSet<br.ufes.inf.nemo.ml2.model.Class>>();
      Iterable<br.ufes.inf.nemo.ml2.model.Class> _filter = Iterables.<br.ufes.inf.nemo.ml2.model.Class>filter(ml2model.getElements(), br.ufes.inf.nemo.ml2.model.Class.class);
      for (final br.ufes.inf.nemo.ml2.model.Class ml2class : _filter) {
        {
          ArrayList<br.ufes.inf.nemo.ml2.model.Class> ml2classesArray = new ArrayList<br.ufes.inf.nemo.ml2.model.Class>();
          HashSet<br.ufes.inf.nemo.ml2.model.Class> hierarchy = new HashSet<br.ufes.inf.nemo.ml2.model.Class>();
          ml2classesArray.add(ml2class);
          while ((ml2classesArray.size() != 0)) {
            {
              br.ufes.inf.nemo.ml2.model.Class aux = ml2classesArray.remove(0);
              hierarchy.add(aux);
              EList<br.ufes.inf.nemo.ml2.model.Class> _superClasses = aux.getSuperClasses();
              for (final br.ufes.inf.nemo.ml2.model.Class superClass : _superClasses) {
                ml2classesArray.add(superClass);
              }
            }
          }
          ArrayList<HashSet<br.ufes.inf.nemo.ml2.model.Class>> hierarchiesToRemove = new ArrayList<HashSet<br.ufes.inf.nemo.ml2.model.Class>>();
          for (final HashSet<br.ufes.inf.nemo.ml2.model.Class> h : disconnectedHierarchies) {
            {
              HashSet<br.ufes.inf.nemo.ml2.model.Class> intersection = new HashSet<br.ufes.inf.nemo.ml2.model.Class>(hierarchy);
              intersection.retainAll(h);
              int _size = intersection.size();
              boolean _notEquals = (_size != 0);
              if (_notEquals) {
                hierarchy.addAll(h);
                hierarchiesToRemove.add(h);
              }
            }
          }
          disconnectedHierarchies.add(hierarchy);
          for (final HashSet<br.ufes.inf.nemo.ml2.model.Class> h_1 : hierarchiesToRemove) {
            disconnectedHierarchies.remove(h_1);
          }
        }
      }
      CharSequence _xifexpression = null;
      int _size = disconnectedHierarchies.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fact DisjointDisconnectedHierarchies {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("disjoint[");
        {
          boolean _hasElements = false;
          for(final HashSet<br.ufes.inf.nemo.ml2.model.Class> h : disconnectedHierarchies) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            {
              int _size_1 = h.size();
              boolean _equals = (_size_1 == 1);
              if (_equals) {
                {
                  for(final br.ufes.inf.nemo.ml2.model.Class c : h) {
                    String _name = c.getName();
                    _builder.append(_name, "\t");
                  }
                }
              } else {
                {
                  boolean _hasElements_1 = false;
                  for(final br.ufes.inf.nemo.ml2.model.Class c_1 : h) {
                    if (!_hasElements_1) {
                      _hasElements_1 = true;
                      _builder.append("(", "\t");
                    } else {
                      _builder.appendImmediate("+", "\t");
                    }
                    String _name_1 = c_1.getName();
                    _builder.append(_name_1, "\t");
                  }
                  if (_hasElements_1) {
                    _builder.append(")", "\t");
                  }
                }
              }
            }
          }
        }
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _xifexpression = _builder;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Generates an Alloy fact to ensure that some classes are not instances of other classes,
   * if the instantiation was not explicitly defined.
   * 
   * @param ml2model the ML2 Model to be considered.
   */
  public static CharSequence generateUnwantedInstantiationsFact(final Model ml2model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fact UnwantedInstantiations {");
    _builder.newLine();
    {
      Iterable<FirstOrderClass> _filter = Iterables.<FirstOrderClass>filter(ml2model.getElements(), FirstOrderClass.class);
      for(final FirstOrderClass foclass : _filter) {
        {
          final Function1<HighOrderClass, Boolean> _function = (HighOrderClass it) -> {
            int _order = it.getOrder();
            return Boolean.valueOf((_order == 2));
          };
          Iterable<HighOrderClass> _filter_1 = IterableExtensions.<HighOrderClass>filter(Iterables.<HighOrderClass>filter(ml2model.getElements(), HighOrderClass.class), _function);
          for(final HighOrderClass hoclass : _filter_1) {
            {
              boolean _contains = foclass.getClassifiers().contains(hoclass);
              boolean _not = (!_contains);
              if (_not) {
                _builder.append("\t");
                _builder.append("not iof[");
                String _name = foclass.getName();
                _builder.append(_name, "\t");
                _builder.append("Reified,");
                String _name_1 = hoclass.getName();
                _builder.append(_name_1, "\t");
                _builder.append("Reified]");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    {
      Iterable<HighOrderClass> _filter_2 = Iterables.<HighOrderClass>filter(ml2model.getElements(), HighOrderClass.class);
      for(final HighOrderClass hoclass_1 : _filter_2) {
        {
          final Function1<HighOrderClass, Boolean> _function_1 = (HighOrderClass it) -> {
            int _order = it.getOrder();
            int _order_1 = hoclass_1.getOrder();
            int _plus = (_order_1 + 1);
            return Boolean.valueOf((_order == _plus));
          };
          Iterable<HighOrderClass> _filter_3 = IterableExtensions.<HighOrderClass>filter(Iterables.<HighOrderClass>filter(ml2model.getElements(), HighOrderClass.class), _function_1);
          for(final HighOrderClass hoclass2 : _filter_3) {
            {
              boolean _contains_1 = hoclass_1.getClassifiers().contains(hoclass2);
              boolean _not_1 = (!_contains_1);
              if (_not_1) {
                _builder.append("\t");
                _builder.append("not iof[");
                String _name_2 = hoclass_1.getName();
                _builder.append(_name_2, "\t");
                _builder.append("Reified,");
                String _name_3 = hoclass2.getName();
                _builder.append(_name_3, "\t");
                _builder.append("Reified]");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generates Alloy signatures and singletons for each MLT* basic ordered type used in the Alloy
   * model being generated. The number of types considered is given by the order of the class with
   * the highest order in the ML2 Model.
   * 
   * @param ml2class the ML2 Model to be considered.
   */
  public static CharSequence generateNotableConstantsSection(final Model model) {
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
    int _xifexpression = (int) 0;
    if ((feature instanceof Attribute)) {
      _xifexpression = ((Attribute)feature).getLowerBound();
    } else {
      _xifexpression = ((Reference) feature).getLowerBound();
    }
    final int lowerBound = _xifexpression;
    int _xifexpression_1 = (int) 0;
    if ((feature instanceof Attribute)) {
      _xifexpression_1 = ((Attribute)feature).getUpperBound();
    } else {
      _xifexpression_1 = ((Reference) feature).getUpperBound();
    }
    final int upperBound = _xifexpression_1;
    if ((lowerBound == 0)) {
      if ((upperBound == 1)) {
        return "lone ";
      } else {
        return "set ";
      }
    } else {
      if ((upperBound == 1)) {
        return "one ";
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
  public static int highestOrder(final Model model) {
    int order = 1;
    EList<ModelElement> _elements = model.getElements();
    for (final ModelElement element : _elements) {
      if ((element instanceof HighOrderClass)) {
        int _order = ((HighOrderClass)element).getOrder();
        boolean _greaterThan = (_order > order);
        if (_greaterThan) {
          order = ((HighOrderClass)element).getOrder();
        }
      }
    }
    return order;
  }
  
  public static CharSequence generateAlloyElement(final ModelElement _class) {
    if (_class instanceof br.ufes.inf.nemo.ml2.model.Class) {
      return _generateAlloyElement((br.ufes.inf.nemo.ml2.model.Class)_class);
    } else if (_class instanceof DerivationConstraint) {
      return _generateAlloyElement((DerivationConstraint)_class);
    } else if (_class instanceof Individual) {
      return _generateAlloyElement((Individual)_class);
    } else if (_class instanceof InvariantConstraint) {
      return _generateAlloyElement((InvariantConstraint)_class);
    } else if (_class instanceof GeneralizationSet) {
      return _generateAlloyElement((GeneralizationSet)_class);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(_class).toString());
    }
  }
  
  public static CharSequence generateOclExpression(final OclExpression expression) {
    if (expression instanceof IfExpression) {
      return _generateOclExpression((IfExpression)expression);
    } else if (expression instanceof ImpliesExpression) {
      return _generateOclExpression((ImpliesExpression)expression);
    } else if (expression instanceof LetExpression) {
      return _generateOclExpression((LetExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public static CharSequence generateTermExpression(final TermExpression expression) {
    if (expression instanceof CallExpression) {
      return _generateTermExpression((CallExpression)expression);
    } else if (expression instanceof LiteralExpression) {
      return _generateTermExpression((LiteralExpression)expression);
    } else if (expression instanceof OclExpression) {
      return _generateTermExpression((OclExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public static CharSequence generateCallExpression(final CallOperation operation, final CharSequence result) {
    if (operation instanceof ArrowOperation) {
      return _generateCallExpression((ArrowOperation)operation, result);
    } else if (operation instanceof DotOperation) {
      return _generateCallExpression((DotOperation)operation, result);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation, result).toString());
    }
  }
  
  public static CharSequence generateDotOperation(final DotOperation operation, final CharSequence result) {
    if (operation instanceof BinaryNumberOperation) {
      return _generateDotOperation((BinaryNumberOperation)operation, result);
    } else if (operation instanceof UnaryNumberOperation) {
      return _generateDotOperation((UnaryNumberOperation)operation, result);
    } else if (operation instanceof VariableExpression) {
      return _generateDotOperation((VariableExpression)operation, result);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation, result).toString());
    }
  }
  
  public static CharSequence generateArrowOperation(final ArrowOperation operation, final CharSequence result) {
    if (operation instanceof BinarySetOperation) {
      return _generateArrowOperation((BinarySetOperation)operation, result);
    } else if (operation instanceof MultiaryIteration) {
      return _generateArrowOperation((MultiaryIteration)operation, result);
    } else if (operation instanceof UnaryIteration) {
      return _generateArrowOperation((UnaryIteration)operation, result);
    } else if (operation instanceof UnarySetOperation) {
      return _generateArrowOperation((UnarySetOperation)operation, result);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(operation, result).toString());
    }
  }
  
  public static CharSequence generateLiteralExpression(final LiteralExpression expression) {
    if (expression instanceof CollectionLiteralExpression) {
      return _generateLiteralExpression((CollectionLiteralExpression)expression);
    } else if (expression instanceof PrimitiveLiteralExpression) {
      return _generateLiteralExpression((PrimitiveLiteralExpression)expression);
    } else if (expression instanceof TupleLiteralExpression) {
      return _generateLiteralExpression((TupleLiteralExpression)expression);
    } else if (expression instanceof TypeLiteralExpression) {
      return _generateLiteralExpression((TypeLiteralExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public static CharSequence generatePrimitiveLiteralExpression(final PrimitiveLiteralExpression expression) {
    if (expression instanceof BooleanLiteralExpression) {
      return _generatePrimitiveLiteralExpression((BooleanLiteralExpression)expression);
    } else if (expression instanceof NullLiteralExpression) {
      return _generatePrimitiveLiteralExpression((NullLiteralExpression)expression);
    } else if (expression instanceof NumberLiteralExpression) {
      return _generatePrimitiveLiteralExpression((NumberLiteralExpression)expression);
    } else if (expression instanceof StringLiteralExpression) {
      return _generatePrimitiveLiteralExpression((StringLiteralExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
  
  public static CharSequence generateAlloySignature(final br.ufes.inf.nemo.ml2.model.Class foclass) {
    if (foclass instanceof FirstOrderClass) {
      return _generateAlloySignature((FirstOrderClass)foclass);
    } else if (foclass instanceof HighOrderClass) {
      return _generateAlloySignature((HighOrderClass)foclass);
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
    if (foclass instanceof FirstOrderClass) {
      return _generateAlloySingleton((FirstOrderClass)foclass);
    } else if (foclass instanceof HighOrderClass) {
      return _generateAlloySingleton((HighOrderClass)foclass);
    } else if (foclass instanceof OrderlessClass) {
      return _generateAlloySingleton((OrderlessClass)foclass);
    } else if (foclass instanceof Individual) {
      return _generateAlloySingleton((Individual)foclass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(foclass).toString());
    }
  }
  
  public static CharSequence generateAlloySingletonAssignmentsFact(final EntityDeclaration ml2class) {
    if (ml2class instanceof br.ufes.inf.nemo.ml2.model.Class) {
      return _generateAlloySingletonAssignmentsFact((br.ufes.inf.nemo.ml2.model.Class)ml2class);
    } else if (ml2class instanceof Individual) {
      return _generateAlloySingletonAssignmentsFact((Individual)ml2class);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ml2class).toString());
    }
  }
  
  public static CharSequence generateAlloySingletonAssignment(final FeatureAssignment attributeAssignment) {
    if (attributeAssignment instanceof AttributeAssignment) {
      return _generateAlloySingletonAssignment((AttributeAssignment)attributeAssignment);
    } else if (attributeAssignment instanceof ReferenceAssignment) {
      return _generateAlloySingletonAssignment((ReferenceAssignment)attributeAssignment);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attributeAssignment).toString());
    }
  }
  
  public static CharSequence generateProperSpecializationFact(final br.ufes.inf.nemo.ml2.model.Class foclass) {
    if (foclass instanceof FirstOrderClass) {
      return _generateProperSpecializationFact((FirstOrderClass)foclass);
    } else if (foclass instanceof HighOrderClass) {
      return _generateProperSpecializationFact((HighOrderClass)foclass);
    } else if (foclass instanceof OrderlessClass) {
      return _generateProperSpecializationFact((OrderlessClass)foclass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(foclass).toString());
    }
  }
  
  public static CharSequence generateRegularityFeatureFact(final FeatureAssignment attributeAssignment, final br.ufes.inf.nemo.ml2.model.Class ml2class) {
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
