/*
 * generated by Xtext 2.16.0
 */
package br.ufes.inf.nemo.ml2.serializer;

import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ML2SyntacticSequencer extends AbstractSyntacticSequencer {

	protected ML2GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute_AttKeyword_0_q;
	protected AbstractElementAlias match_Individual___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_ML2Class___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_MultipleAttributeAssignment_AttKeyword_0_q;
	protected AbstractElementAlias match_RegularityAttribute_AttKeyword_1_q;
	protected AbstractElementAlias match_SingleAttributeAssignment_AttKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ML2GrammarAccess) access;
		match_Attribute_AttKeyword_0_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getAttKeyword_0());
		match_Individual___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_5_2()));
		match_ML2Class___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getML2ClassAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getML2ClassAccess().getRightCurlyBracketKeyword_1_2()));
		match_MultipleAttributeAssignment_AttKeyword_0_q = new TokenAlias(false, true, grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0());
		match_RegularityAttribute_AttKeyword_1_q = new TokenAlias(false, true, grammarAccess.getRegularityAttributeAccess().getAttKeyword_1());
		match_SingleAttributeAssignment_AttKeyword_0_q = new TokenAlias(false, true, grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Attribute_AttKeyword_0_q.equals(syntax))
				emit_Attribute_AttKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Individual___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_Individual___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ML2Class___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_ML2Class___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MultipleAttributeAssignment_AttKeyword_0_q.equals(syntax))
				emit_MultipleAttributeAssignment_AttKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RegularityAttribute_AttKeyword_1_q.equals(syntax))
				emit_RegularityAttribute_AttKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SingleAttributeAssignment_AttKeyword_0_q.equals(syntax))
				emit_SingleAttributeAssignment_AttKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'att'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Attribute_AttKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     instantiatedClasses+=[ML2Class|QualifiedName] (ambiguity) ';' (rule end)
	 *     instantiatedClasses+=[ML2Class|QualifiedName] (ambiguity) (rule end)
	 */
	protected void emit_Individual___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     categorizedClass=[ML2Class|QualifiedName] (ambiguity) ';' (rule end)
	 *     categorizedClass=[ML2Class|QualifiedName] (ambiguity) (rule end)
	 *     instantiatedClasses+=[ML2Class|QualifiedName] (ambiguity) ';' (rule end)
	 *     instantiatedClasses+=[ML2Class|QualifiedName] (ambiguity) (rule end)
	 *     name=ID (ambiguity) ';' (rule end)
	 *     name=ID (ambiguity) (rule end)
	 *     powertypeOf=[ML2Class|QualifiedName] (ambiguity) ';' (rule end)
	 *     powertypeOf=[ML2Class|QualifiedName] (ambiguity) (rule end)
	 *     subordinators+=[ML2Class|QualifiedName] (ambiguity) ';' (rule end)
	 *     subordinators+=[ML2Class|QualifiedName] (ambiguity) (rule end)
	 *     superClasses+=[ML2Class|QualifiedName] (ambiguity) ';' (rule end)
	 *     superClasses+=[ML2Class|QualifiedName] (ambiguity) (rule end)
	 */
	protected void emit_ML2Class___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'att'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) attribute=[Attribute|QualifiedName]
	 */
	protected void emit_MultipleAttributeAssignment_AttKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'att'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'regularity' (ambiguity) name=ID
	 */
	protected void emit_RegularityAttribute_AttKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'att'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) attribute=[Attribute|QualifiedName]
	 */
	protected void emit_SingleAttributeAssignment_AttKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
