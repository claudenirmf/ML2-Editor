package br.ufes.inf.nemo.ml2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalML2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'include'", "';'", "'}'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'class'", "'specializes'", "'datatype'", "'order'", "'subordinatedTo'", "'isPowertypeOf'", "'orderless'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'att'", "'['", "'..'", "']'", "'subsets'", "'regularity'", "'ref'", "'isOppositeTo'", "'*'", "'='", "'true'", "'false'", "'-'", "'context'", "'inv'", "'::'", "'derive'", "'let'", "'in'", "'if'", "'then'", "'else'", "'endif'", "'implies'", "'xor'", "'or'", "'and'", "'('", "')'", "'allInstances'", "'->'", "'|'", "'self'", "'null'", "'Set'", "'Boolean'", "'Number'", "'String'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'determinesMaxValue'", "'determinesMinValue'", "'determinesValue'", "'determinesAllowedValues'", "'determinesType'", "'determinesAllowedTypes'", "'<>'", "'>'", "'<'", "'>='", "'<='", "'+'", "'/'", "'NONE'", "'not'", "'abs'", "'floor'", "'round'", "'oclIsUndefined'", "'min'", "'max'", "'div'", "'size'", "'isEmpty'", "'notEmpty'", "'sum'", "'asSet'", "'flatten'", "'includes'", "'includesAll'", "'excludes'", "'excludesAll'", "'including'", "'excluding'", "'count'", "'union'", "'intersection'", "'symmetricDifference'", "'select'", "'reject'", "'collect'", "'any'", "'one'", "'isUnique'", "'closure'", "'exists'", "'forAll'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalML2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalML2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalML2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalML2.g"; }



     	private ML2GrammarAccess grammarAccess;

        public InternalML2Parser(TokenStream input, ML2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ML2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalML2.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalML2.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalML2.g:66:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalML2.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalML2.g:78:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' ) )
            // InternalML2.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' )
            {
            // InternalML2.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' )
            // InternalML2.g:80:3: otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModuleKeyword_0());
              		
            }
            // InternalML2.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalML2.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalML2.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalML2.g:86:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalML2.g:107:3: ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=18 && LA1_0<=19)||LA1_0==22||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=28 && LA1_0<=31)||LA1_0==48) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalML2.g:108:4: (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            	    {
            	    // InternalML2.g:108:4: (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            	    // InternalML2.g:109:5: otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getIncludeKeyword_3_0_0());
            	      				
            	    }
            	    // InternalML2.g:113:5: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:114:6: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:114:6: ( ruleQualifiedName )
            	    // InternalML2.g:115:7: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getModelRule());
            	      							}
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_6);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalML2.g:135:4: ( (lv_elements_6_0= ruleModelElement ) )
            	    {
            	    // InternalML2.g:135:4: ( (lv_elements_6_0= ruleModelElement ) )
            	    // InternalML2.g:136:5: (lv_elements_6_0= ruleModelElement )
            	    {
            	    // InternalML2.g:136:5: (lv_elements_6_0= ruleModelElement )
            	    // InternalML2.g:137:6: lv_elements_6_0= ruleModelElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_elements_6_0=ruleModelElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_6_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.ModelElement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalML2.g:163:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalML2.g:163:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalML2.g:164:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalML2.g:170:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalML2.g:176:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalML2.g:177:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalML2.g:177:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalML2.g:178:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalML2.g:185:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalML2.g:186:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalML2.g:203:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalML2.g:203:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalML2.g:204:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalML2.g:210:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalML2.g:216:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalML2.g:217:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalML2.g:217:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalML2.g:218:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalML2.g:228:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalML2.g:229:4: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalML2.g:239:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalML2.g:239:47: (iv_ruleImport= ruleImport EOF )
            // InternalML2.g:240:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalML2.g:246:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:252:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalML2.g:253:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalML2.g:253:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalML2.g:254:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalML2.g:258:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalML2.g:259:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalML2.g:259:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalML2.g:260:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModelElement"
    // InternalML2.g:281:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalML2.g:281:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalML2.g:282:2: iv_ruleModelElement= ruleModelElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalML2.g:288:1: ruleModelElement returns [EObject current=null] : ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_ConstraintDeclaration_3= ruleConstraintDeclaration ) otherlv_4= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_Import_0 = null;

        EObject this_EntityDeclaration_1 = null;

        EObject this_GeneralizationSet_2 = null;

        EObject this_ConstraintDeclaration_3 = null;



        	enterRule();

        try {
            // InternalML2.g:294:2: ( ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_ConstraintDeclaration_3= ruleConstraintDeclaration ) otherlv_4= ';' ) )
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_ConstraintDeclaration_3= ruleConstraintDeclaration ) otherlv_4= ';' )
            {
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_ConstraintDeclaration_3= ruleConstraintDeclaration ) otherlv_4= ';' )
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_ConstraintDeclaration_3= ruleConstraintDeclaration ) otherlv_4= ';'
            {
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_ConstraintDeclaration_3= ruleConstraintDeclaration )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
            case 22:
            case 24:
            case 25:
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
            case 30:
            case 31:
                {
                alt4=3;
                }
                break;
            case 48:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalML2.g:297:4: this_Import_0= ruleImport
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getModelElementAccess().getImportParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_Import_0=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Import_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:306:4: this_EntityDeclaration_1= ruleEntityDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_EntityDeclaration_1=ruleEntityDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EntityDeclaration_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:315:4: this_GeneralizationSet_2= ruleGeneralizationSet
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_GeneralizationSet_2=ruleGeneralizationSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GeneralizationSet_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalML2.g:324:4: this_ConstraintDeclaration_3= ruleConstraintDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getModelElementAccess().getConstraintDeclarationParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_ConstraintDeclaration_3=ruleConstraintDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConstraintDeclaration_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModelElementAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleEntityDeclaration"
    // InternalML2.g:341:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalML2.g:341:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalML2.g:342:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntityDeclaration=ruleEntityDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDeclaration"


    // $ANTLR start "ruleEntityDeclaration"
    // InternalML2.g:348:1: ruleEntityDeclaration returns [EObject current=null] : (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Individual_1 = null;



        	enterRule();

        try {
            // InternalML2.g:354:2: ( (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) )
            // InternalML2.g:355:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
            {
            // InternalML2.g:355:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22||(LA5_0>=24 && LA5_0<=25)||LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalML2.g:356:3: this_Class_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Class_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:365:3: this_Individual_1= ruleIndividual
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Individual_1=ruleIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Individual_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityDeclaration"


    // $ANTLR start "entryRuleClass"
    // InternalML2.g:377:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalML2.g:377:46: (iv_ruleClass= ruleClass EOF )
            // InternalML2.g:378:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalML2.g:384:1: ruleClass returns [EObject current=null] : (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        EObject this_FirstOrderClassOrDataType_0 = null;

        EObject this_HigherOrderClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:390:2: ( (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) )
            // InternalML2.g:391:2: (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass )
            {
            // InternalML2.g:391:2: (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22||LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25||LA6_0==28) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalML2.g:392:3: this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getClassAccess().getFirstOrderClassOrDataTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FirstOrderClassOrDataType_0=ruleFirstOrderClassOrDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FirstOrderClassOrDataType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:401:3: this_HigherOrderClass_1= ruleHigherOrderClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getClassAccess().getHigherOrderClassParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HigherOrderClass_1=ruleHigherOrderClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HigherOrderClass_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleFirstOrderClassOrDataType"
    // InternalML2.g:413:1: entryRuleFirstOrderClassOrDataType returns [EObject current=null] : iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF ;
    public final EObject entryRuleFirstOrderClassOrDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstOrderClassOrDataType = null;


        try {
            // InternalML2.g:413:66: (iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF )
            // InternalML2.g:414:2: iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstOrderClassOrDataTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFirstOrderClassOrDataType=ruleFirstOrderClassOrDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstOrderClassOrDataType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFirstOrderClassOrDataType"


    // $ANTLR start "ruleFirstOrderClassOrDataType"
    // InternalML2.g:420:1: ruleFirstOrderClassOrDataType returns [EObject current=null] : (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFirstOrderClassOrDataType() throws RecognitionException {
        EObject current = null;

        EObject this_FirstOrderClass_0 = null;

        EObject this_DataType_1 = null;



        	enterRule();

        try {
            // InternalML2.g:426:2: ( (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType ) )
            // InternalML2.g:427:2: (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType )
            {
            // InternalML2.g:427:2: (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalML2.g:428:3: this_FirstOrderClass_0= ruleFirstOrderClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFirstOrderClassOrDataTypeAccess().getFirstOrderClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FirstOrderClass_0=ruleFirstOrderClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FirstOrderClass_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:437:3: this_DataType_1= ruleDataType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFirstOrderClassOrDataTypeAccess().getDataTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirstOrderClassOrDataType"


    // $ANTLR start "entryRuleHigherOrderClass"
    // InternalML2.g:449:1: entryRuleHigherOrderClass returns [EObject current=null] : iv_ruleHigherOrderClass= ruleHigherOrderClass EOF ;
    public final EObject entryRuleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderClass = null;


        try {
            // InternalML2.g:449:57: (iv_ruleHigherOrderClass= ruleHigherOrderClass EOF )
            // InternalML2.g:450:2: iv_ruleHigherOrderClass= ruleHigherOrderClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHigherOrderClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHigherOrderClass=ruleHigherOrderClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHigherOrderClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHigherOrderClass"


    // $ANTLR start "ruleHigherOrderClass"
    // InternalML2.g:456:1: ruleHigherOrderClass returns [EObject current=null] : (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass ) ;
    public final EObject ruleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        EObject this_HighOrderClass_0 = null;

        EObject this_OrderlessClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:462:2: ( (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass ) )
            // InternalML2.g:463:2: (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass )
            {
            // InternalML2.g:463:2: (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalML2.g:464:3: this_HighOrderClass_0= ruleHighOrderClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHigherOrderClassAccess().getHighOrderClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HighOrderClass_0=ruleHighOrderClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HighOrderClass_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:473:3: this_OrderlessClass_1= ruleOrderlessClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getHigherOrderClassAccess().getOrderlessClassParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OrderlessClass_1=ruleOrderlessClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OrderlessClass_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHigherOrderClass"


    // $ANTLR start "entryRuleIndividual"
    // InternalML2.g:485:1: entryRuleIndividual returns [EObject current=null] : iv_ruleIndividual= ruleIndividual EOF ;
    public final EObject entryRuleIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividual = null;


        try {
            // InternalML2.g:485:51: (iv_ruleIndividual= ruleIndividual EOF )
            // InternalML2.g:486:2: iv_ruleIndividual= ruleIndividual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndividualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndividual=ruleIndividual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndividual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndividual"


    // $ANTLR start "ruleIndividual"
    // InternalML2.g:492:1: ruleIndividual returns [EObject current=null] : (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_assignments_7_0 = null;



        	enterRule();

        try {
            // InternalML2.g:498:2: ( (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) )
            // InternalML2.g:499:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            {
            // InternalML2.g:499:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            // InternalML2.g:500:3: otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndividualAccess().getIndividualKeyword_0());
              		
            }
            // InternalML2.g:504:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:505:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:505:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:506:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getIndividualAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIndividualRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIndividualAccess().getColonKeyword_2());
              		
            }
            // InternalML2.g:526:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:527:4: ( ruleQualifiedName )
            {
            // InternalML2.g:527:4: ( ruleQualifiedName )
            // InternalML2.g:528:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIndividualRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIndividualAccess().getClassifiersClassCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:542:3: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalML2.g:543:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getIndividualAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalML2.g:547:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:548:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:548:5: ( ruleQualifiedName )
            	    // InternalML2.g:549:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getIndividualRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIndividualAccess().getClassifiersClassCrossReference_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalML2.g:564:3: (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalML2.g:565:4: otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0());
                      			
                    }
                    // InternalML2.g:569:4: ( (lv_assignments_7_0= ruleFeatureAssignment ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==35||LA10_0==41) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalML2.g:570:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:570:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    // InternalML2.g:571:6: lv_assignments_7_0= ruleFeatureAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIndividualAccess().getAssignmentsFeatureAssignmentParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_assignments_7_0=ruleFeatureAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIndividualRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"assignments",
                    	      							lv_assignments_7_0,
                    	      							"br.ufes.inf.nemo.ml2.ML2.FeatureAssignment");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_5_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndividual"


    // $ANTLR start "entryRuleOrderedClass"
    // InternalML2.g:597:1: entryRuleOrderedClass returns [EObject current=null] : iv_ruleOrderedClass= ruleOrderedClass EOF ;
    public final EObject entryRuleOrderedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedClass = null;


        try {
            // InternalML2.g:597:53: (iv_ruleOrderedClass= ruleOrderedClass EOF )
            // InternalML2.g:598:2: iv_ruleOrderedClass= ruleOrderedClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderedClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderedClass=ruleOrderedClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderedClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderedClass"


    // $ANTLR start "ruleOrderedClass"
    // InternalML2.g:604:1: ruleOrderedClass returns [EObject current=null] : (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass ) ;
    public final EObject ruleOrderedClass() throws RecognitionException {
        EObject current = null;

        EObject this_HighOrderClass_0 = null;

        EObject this_FirstOrderClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:610:2: ( (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass ) )
            // InternalML2.g:611:2: (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass )
            {
            // InternalML2.g:611:2: (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalML2.g:612:3: this_HighOrderClass_0= ruleHighOrderClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOrderedClassAccess().getHighOrderClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HighOrderClass_0=ruleHighOrderClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HighOrderClass_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:621:3: this_FirstOrderClass_1= ruleFirstOrderClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOrderedClassAccess().getFirstOrderClassParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FirstOrderClass_1=ruleFirstOrderClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FirstOrderClass_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderedClass"


    // $ANTLR start "entryRuleFirstOrderClass"
    // InternalML2.g:633:1: entryRuleFirstOrderClass returns [EObject current=null] : iv_ruleFirstOrderClass= ruleFirstOrderClass EOF ;
    public final EObject entryRuleFirstOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstOrderClass = null;


        try {
            // InternalML2.g:633:56: (iv_ruleFirstOrderClass= ruleFirstOrderClass EOF )
            // InternalML2.g:634:2: iv_ruleFirstOrderClass= ruleFirstOrderClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstOrderClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFirstOrderClass=ruleFirstOrderClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstOrderClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFirstOrderClass"


    // $ANTLR start "ruleFirstOrderClass"
    // InternalML2.g:640:1: ruleFirstOrderClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleFirstOrderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_assignments_11_0 = null;

        EObject lv_features_12_0 = null;



        	enterRule();

        try {
            // InternalML2.g:646:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalML2.g:647:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalML2.g:647:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalML2.g:648:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFirstOrderClassAccess().getClassKeyword_0());
              		
            }
            // InternalML2.g:652:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:653:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:653:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:654:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFirstOrderClassAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFirstOrderClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalML2.g:670:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalML2.g:671:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFirstOrderClassAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalML2.g:675:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:676:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:676:5: ( ruleQualifiedName )
                    // InternalML2.g:677:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFirstOrderClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFirstOrderClassAccess().getClassifiersClassCrossReference_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:691:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalML2.g:692:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFirstOrderClassAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:696:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:697:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:697:6: ( ruleQualifiedName )
                    	    // InternalML2.g:698:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getFirstOrderClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getClassifiersClassCrossReference_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:714:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalML2.g:715:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFirstOrderClassAccess().getSpecializesKeyword_3_0());
                      			
                    }
                    // InternalML2.g:719:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:720:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:720:5: ( ruleQualifiedName )
                    // InternalML2.g:721:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFirstOrderClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFirstOrderClassAccess().getSuperClassesClassCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:735:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalML2.g:736:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getFirstOrderClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:740:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:741:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:741:6: ( ruleQualifiedName )
                    	    // InternalML2.g:742:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getFirstOrderClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getSuperClassesClassCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:758:3: (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalML2.g:759:4: otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFirstOrderClassAccess().getLeftCurlyBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:763:4: ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==RULE_ID) ) {
                                int LA17_6 = input.LA(3);

                                if ( (LA17_6==20) ) {
                                    alt17=2;
                                }
                                else if ( (LA17_6==16||LA17_6==44) ) {
                                    alt17=1;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA17_3 = input.LA(2);

                            if ( (LA17_3==RULE_ID) ) {
                                int LA17_4 = input.LA(3);

                                if ( (LA17_4==20) ) {
                                    alt17=2;
                                }
                                else if ( (LA17_4==16||LA17_4==44) ) {
                                    alt17=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA17_4 = input.LA(2);

                            if ( (LA17_4==20) ) {
                                alt17=2;
                            }
                            else if ( (LA17_4==16||LA17_4==44) ) {
                                alt17=1;
                            }


                            }
                            break;
                        case 40:
                            {
                            alt17=2;
                            }
                            break;

                        }

                        switch (alt17) {
                    	case 1 :
                    	    // InternalML2.g:764:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:764:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:765:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:765:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    // InternalML2.g:766:7: lv_assignments_11_0= ruleFeatureAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_4_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_assignments_11_0=ruleFeatureAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFirstOrderClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"assignments",
                    	      								lv_assignments_11_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.FeatureAssignment");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:784:5: ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:784:5: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalML2.g:785:6: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:785:6: (lv_features_12_0= ruleFeature )
                    	    // InternalML2.g:786:7: lv_features_12_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getFeaturesFeatureParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_features_12_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFirstOrderClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"features",
                    	      								lv_features_12_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getFirstOrderClassAccess().getRightCurlyBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirstOrderClass"


    // $ANTLR start "entryRuleDataType"
    // InternalML2.g:813:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalML2.g:813:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalML2.g:814:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalML2.g:820:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_assignments_11_0 = null;

        EObject lv_features_12_0 = null;



        	enterRule();

        try {
            // InternalML2.g:826:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalML2.g:827:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalML2.g:827:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalML2.g:828:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalML2.g:832:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:833:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:833:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:834:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDataTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalML2.g:850:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalML2.g:851:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalML2.g:855:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:856:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:856:5: ( ruleQualifiedName )
                    // InternalML2.g:857:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataTypeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataTypeAccess().getClassifiersClassCrossReference_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:871:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalML2.g:872:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:876:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:877:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:877:6: ( ruleQualifiedName )
                    	    // InternalML2.g:878:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDataTypeRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDataTypeAccess().getClassifiersClassCrossReference_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:894:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalML2.g:895:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getSpecializesKeyword_3_0());
                      			
                    }
                    // InternalML2.g:899:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:900:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:900:5: ( ruleQualifiedName )
                    // InternalML2.g:901:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDataTypeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDataTypeAccess().getSuperClassesClassCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:915:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalML2.g:916:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:920:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:921:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:921:6: ( ruleQualifiedName )
                    	    // InternalML2.g:922:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDataTypeRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDataTypeAccess().getSuperClassesClassCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:938:3: (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalML2.g:939:4: otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:943:4: ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==RULE_ID) ) {
                                int LA23_6 = input.LA(3);

                                if ( (LA23_6==20) ) {
                                    alt23=2;
                                }
                                else if ( (LA23_6==16||LA23_6==44) ) {
                                    alt23=1;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA23_3 = input.LA(2);

                            if ( (LA23_3==RULE_ID) ) {
                                int LA23_4 = input.LA(3);

                                if ( (LA23_4==16||LA23_4==44) ) {
                                    alt23=1;
                                }
                                else if ( (LA23_4==20) ) {
                                    alt23=2;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA23_4 = input.LA(2);

                            if ( (LA23_4==16||LA23_4==44) ) {
                                alt23=1;
                            }
                            else if ( (LA23_4==20) ) {
                                alt23=2;
                            }


                            }
                            break;
                        case 40:
                            {
                            alt23=2;
                            }
                            break;

                        }

                        switch (alt23) {
                    	case 1 :
                    	    // InternalML2.g:944:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:944:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:945:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:945:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    // InternalML2.g:946:7: lv_assignments_11_0= ruleFeatureAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDataTypeAccess().getAssignmentsFeatureAssignmentParserRuleCall_4_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_assignments_11_0=ruleFeatureAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"assignments",
                    	      								lv_assignments_11_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.FeatureAssignment");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:964:5: ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:964:5: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalML2.g:965:6: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:965:6: (lv_features_12_0= ruleFeature )
                    	    // InternalML2.g:966:7: lv_features_12_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDataTypeAccess().getFeaturesFeatureParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_features_12_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"features",
                    	      								lv_features_12_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleHighOrderClass"
    // InternalML2.g:993:1: entryRuleHighOrderClass returns [EObject current=null] : iv_ruleHighOrderClass= ruleHighOrderClass EOF ;
    public final EObject entryRuleHighOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighOrderClass = null;


        try {
            // InternalML2.g:993:55: (iv_ruleHighOrderClass= ruleHighOrderClass EOF )
            // InternalML2.g:994:2: iv_ruleHighOrderClass= ruleHighOrderClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHighOrderClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHighOrderClass=ruleHighOrderClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHighOrderClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighOrderClass"


    // $ANTLR start "ruleHighOrderClass"
    // InternalML2.g:1000:1: ruleHighOrderClass returns [EObject current=null] : (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? ) ;
    public final EObject ruleHighOrderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_order_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Enumerator lv_categorizationType_16_0 = null;

        EObject lv_assignments_21_0 = null;

        EObject lv_features_22_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1006:2: ( (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? ) )
            // InternalML2.g:1007:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? )
            {
            // InternalML2.g:1007:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? )
            // InternalML2.g:1008:3: otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHighOrderClassAccess().getOrderKeyword_0());
              		
            }
            // InternalML2.g:1012:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalML2.g:1013:4: (lv_order_1_0= RULE_INT )
            {
            // InternalML2.g:1013:4: (lv_order_1_0= RULE_INT )
            // InternalML2.g:1014:5: lv_order_1_0= RULE_INT
            {
            lv_order_1_0=(Token)match(input,RULE_INT,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_order_1_0, grammarAccess.getHighOrderClassAccess().getOrderINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHighOrderClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"order",
              						lv_order_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getHighOrderClassAccess().getClassKeyword_2());
              		
            }
            // InternalML2.g:1034:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalML2.g:1035:4: (lv_name_3_0= RULE_ID )
            {
            // InternalML2.g:1035:4: (lv_name_3_0= RULE_ID )
            // InternalML2.g:1036:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getHighOrderClassAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHighOrderClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalML2.g:1052:3: (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalML2.g:1053:4: otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getHighOrderClassAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalML2.g:1057:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1058:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1058:5: ( ruleQualifiedName )
                    // InternalML2.g:1059:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getHighOrderClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHighOrderClassAccess().getClassifiersClassCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:1073:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalML2.g:1074:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getHighOrderClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1078:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1079:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1079:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1080:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getClassifiersClassCrossReference_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1096:3: (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalML2.g:1097:4: otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getHighOrderClassAccess().getSpecializesKeyword_5_0());
                      			
                    }
                    // InternalML2.g:1101:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1102:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1102:5: ( ruleQualifiedName )
                    // InternalML2.g:1103:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getHighOrderClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHighOrderClassAccess().getSuperClassesClassCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:1117:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalML2.g:1118:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getHighOrderClassAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1122:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1123:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1123:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1124:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getSuperClassesClassCrossReference_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1140:3: (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalML2.g:1141:4: otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getHighOrderClassAccess().getSubordinatedToKeyword_6_0());
                      			
                    }
                    // InternalML2.g:1145:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1146:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1146:5: ( ruleQualifiedName )
                    // InternalML2.g:1147:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getHighOrderClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHighOrderClassAccess().getSubordinatorsHigherOrderClassCrossReference_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:1161:4: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalML2.g:1162:5: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getHighOrderClassAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1166:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1167:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1167:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1168:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getSubordinatorsHigherOrderClassCrossReference_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1184:3: ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=73 && LA31_0<=76)) ) {
                alt31=1;
            }
            else if ( (LA31_0==27) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalML2.g:1185:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1185:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1186:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1186:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) )
                    // InternalML2.g:1187:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    {
                    // InternalML2.g:1187:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    // InternalML2.g:1188:7: lv_categorizationType_16_0= ruleCategorizationType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_7_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_16_0=ruleCategorizationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getHighOrderClassRule());
                      							}
                      							set(
                      								current,
                      								"categorizationType",
                      								lv_categorizationType_16_0,
                      								"br.ufes.inf.nemo.ml2.ML2.CategorizationType");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalML2.g:1205:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1206:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1206:6: ( ruleQualifiedName )
                    // InternalML2.g:1207:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getHighOrderClassRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getCategorizedClassClassCrossReference_7_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1223:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1223:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1224:5: otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getHighOrderClassAccess().getIsPowertypeOfKeyword_7_1_0());
                      				
                    }
                    // InternalML2.g:1228:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1229:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1229:6: ( ruleQualifiedName )
                    // InternalML2.g:1230:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getHighOrderClassRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getPowertypeOfClassCrossReference_7_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1246:3: (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalML2.g:1247:4: otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getHighOrderClassAccess().getLeftCurlyBracketKeyword_8_0());
                      			
                    }
                    // InternalML2.g:1251:4: ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )*
                    loop32:
                    do {
                        int alt32=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==RULE_ID) ) {
                                int LA32_6 = input.LA(3);

                                if ( (LA32_6==20) ) {
                                    alt32=2;
                                }
                                else if ( (LA32_6==16||LA32_6==44) ) {
                                    alt32=1;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA32_3 = input.LA(2);

                            if ( (LA32_3==RULE_ID) ) {
                                int LA32_4 = input.LA(3);

                                if ( (LA32_4==20) ) {
                                    alt32=2;
                                }
                                else if ( (LA32_4==16||LA32_4==44) ) {
                                    alt32=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA32_4 = input.LA(2);

                            if ( (LA32_4==20) ) {
                                alt32=2;
                            }
                            else if ( (LA32_4==16||LA32_4==44) ) {
                                alt32=1;
                            }


                            }
                            break;
                        case 40:
                            {
                            alt32=2;
                            }
                            break;

                        }

                        switch (alt32) {
                    	case 1 :
                    	    // InternalML2.g:1252:5: ( (lv_assignments_21_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:1252:5: ( (lv_assignments_21_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:1253:6: (lv_assignments_21_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:1253:6: (lv_assignments_21_0= ruleFeatureAssignment )
                    	    // InternalML2.g:1254:7: lv_assignments_21_0= ruleFeatureAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_8_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_assignments_21_0=ruleFeatureAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getHighOrderClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"assignments",
                    	      								lv_assignments_21_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.FeatureAssignment");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:1272:5: ( (lv_features_22_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:1272:5: ( (lv_features_22_0= ruleFeature ) )
                    	    // InternalML2.g:1273:6: (lv_features_22_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:1273:6: (lv_features_22_0= ruleFeature )
                    	    // InternalML2.g:1274:7: lv_features_22_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getHighOrderClassAccess().getFeaturesFeatureParserRuleCall_8_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_features_22_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getHighOrderClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"features",
                    	      								lv_features_22_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getHighOrderClassAccess().getRightCurlyBracketKeyword_8_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighOrderClass"


    // $ANTLR start "entryRuleOrderlessClass"
    // InternalML2.g:1301:1: entryRuleOrderlessClass returns [EObject current=null] : iv_ruleOrderlessClass= ruleOrderlessClass EOF ;
    public final EObject entryRuleOrderlessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderlessClass = null;


        try {
            // InternalML2.g:1301:55: (iv_ruleOrderlessClass= ruleOrderlessClass EOF )
            // InternalML2.g:1302:2: iv_ruleOrderlessClass= ruleOrderlessClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderlessClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderlessClass=ruleOrderlessClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderlessClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderlessClass"


    // $ANTLR start "ruleOrderlessClass"
    // InternalML2.g:1308:1: ruleOrderlessClass returns [EObject current=null] : (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? ) ;
    public final EObject ruleOrderlessClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Enumerator lv_categorizationType_15_0 = null;

        EObject lv_assignments_20_0 = null;

        EObject lv_features_21_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1314:2: ( (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? ) )
            // InternalML2.g:1315:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? )
            {
            // InternalML2.g:1315:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? )
            // InternalML2.g:1316:3: otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOrderlessClassAccess().getClassKeyword_1());
              		
            }
            // InternalML2.g:1324:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:1325:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:1325:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:1326:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOrderlessClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalML2.g:1342:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalML2.g:1343:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0());
                      			
                    }
                    // InternalML2.g:1347:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1348:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1348:5: ( ruleQualifiedName )
                    // InternalML2.g:1349:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrderlessClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrderlessClassAccess().getClassifiersClassCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:1363:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalML2.g:1364:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1368:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1369:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1369:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1370:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getClassifiersClassCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1386:3: (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalML2.g:1387:4: otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0());
                      			
                    }
                    // InternalML2.g:1391:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1392:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1392:5: ( ruleQualifiedName )
                    // InternalML2.g:1393:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrderlessClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrderlessClassAccess().getSuperClassesClassCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:1407:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalML2.g:1408:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1412:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1413:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1413:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1414:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getSuperClassesClassCrossReference_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1430:3: (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalML2.g:1431:4: otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getOrderlessClassAccess().getSubordinatedToKeyword_5_0());
                      			
                    }
                    // InternalML2.g:1435:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1436:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1436:5: ( ruleQualifiedName )
                    // InternalML2.g:1437:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrderlessClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrderlessClassAccess().getSubordinatorsHigherOrderClassCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:1451:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalML2.g:1452:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_13, grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1456:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1457:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1457:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1458:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getSubordinatorsHigherOrderClassCrossReference_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1474:3: ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=73 && LA40_0<=76)) ) {
                alt40=1;
            }
            else if ( (LA40_0==27) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // InternalML2.g:1475:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1475:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1476:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1476:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) )
                    // InternalML2.g:1477:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    {
                    // InternalML2.g:1477:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    // InternalML2.g:1478:7: lv_categorizationType_15_0= ruleCategorizationType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_6_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_15_0=ruleCategorizationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOrderlessClassRule());
                      							}
                      							set(
                      								current,
                      								"categorizationType",
                      								lv_categorizationType_15_0,
                      								"br.ufes.inf.nemo.ml2.ML2.CategorizationType");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalML2.g:1495:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1496:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1496:6: ( ruleQualifiedName )
                    // InternalML2.g:1497:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getOrderlessClassRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getCategorizedClassClassCrossReference_6_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1513:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1513:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1514:5: otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getOrderlessClassAccess().getIsPowertypeOfKeyword_6_1_0());
                      				
                    }
                    // InternalML2.g:1518:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1519:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1519:6: ( ruleQualifiedName )
                    // InternalML2.g:1520:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getOrderlessClassRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getPowertypeOfClassCrossReference_6_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1536:3: (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:1537:4: otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}'
                    {
                    otherlv_19=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getOrderlessClassAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    // InternalML2.g:1541:4: ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )*
                    loop41:
                    do {
                        int alt41=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA41_2 = input.LA(2);

                            if ( (LA41_2==RULE_ID) ) {
                                int LA41_6 = input.LA(3);

                                if ( (LA41_6==20) ) {
                                    alt41=2;
                                }
                                else if ( (LA41_6==16||LA41_6==44) ) {
                                    alt41=1;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA41_3 = input.LA(2);

                            if ( (LA41_3==RULE_ID) ) {
                                int LA41_4 = input.LA(3);

                                if ( (LA41_4==16||LA41_4==44) ) {
                                    alt41=1;
                                }
                                else if ( (LA41_4==20) ) {
                                    alt41=2;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA41_4 = input.LA(2);

                            if ( (LA41_4==16||LA41_4==44) ) {
                                alt41=1;
                            }
                            else if ( (LA41_4==20) ) {
                                alt41=2;
                            }


                            }
                            break;
                        case 40:
                            {
                            alt41=2;
                            }
                            break;

                        }

                        switch (alt41) {
                    	case 1 :
                    	    // InternalML2.g:1542:5: ( (lv_assignments_20_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:1542:5: ( (lv_assignments_20_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:1543:6: (lv_assignments_20_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:1543:6: (lv_assignments_20_0= ruleFeatureAssignment )
                    	    // InternalML2.g:1544:7: lv_assignments_20_0= ruleFeatureAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_7_1_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_assignments_20_0=ruleFeatureAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrderlessClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"assignments",
                    	      								lv_assignments_20_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.FeatureAssignment");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:1562:5: ( (lv_features_21_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:1562:5: ( (lv_features_21_0= ruleFeature ) )
                    	    // InternalML2.g:1563:6: (lv_features_21_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:1563:6: (lv_features_21_0= ruleFeature )
                    	    // InternalML2.g:1564:7: lv_features_21_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderlessClassAccess().getFeaturesFeatureParserRuleCall_7_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_features_21_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrderlessClassRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"features",
                    	      								lv_features_21_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getOrderlessClassAccess().getRightCurlyBracketKeyword_7_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderlessClass"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalML2.g:1591:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalML2.g:1591:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalML2.g:1592:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralizationSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalML2.g:1598:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isDisjoint_1_0=null;
        Token lv_isComplete_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalML2.g:1604:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalML2.g:1605:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalML2.g:1605:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalML2.g:1606:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
            {
            // InternalML2.g:1606:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalML2.g:1607:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalML2.g:1607:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            // InternalML2.g:1608:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            // InternalML2.g:1611:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            // InternalML2.g:1612:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            {
            // InternalML2.g:1612:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( LA43_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalML2.g:1613:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalML2.g:1613:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    // InternalML2.g:1614:5: {...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalML2.g:1614:114: ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    // InternalML2.g:1615:6: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
            	    // InternalML2.g:1618:9: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    // InternalML2.g:1618:10: {...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1618:19: ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    // InternalML2.g:1618:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    {
            	    // InternalML2.g:1618:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    // InternalML2.g:1619:10: lv_isDisjoint_1_0= 'disjoint'
            	    {
            	    lv_isDisjoint_1_0=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_isDisjoint_1_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	      										}
            	      										setWithLastConsumed(current, "isDisjoint", true, "disjoint");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalML2.g:1636:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalML2.g:1636:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    // InternalML2.g:1637:5: {...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalML2.g:1637:114: ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    // InternalML2.g:1638:6: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
            	    // InternalML2.g:1641:9: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    // InternalML2.g:1641:10: {...}? => ( (lv_isComplete_2_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1641:19: ( (lv_isComplete_2_0= 'complete' ) )
            	    // InternalML2.g:1641:20: (lv_isComplete_2_0= 'complete' )
            	    {
            	    // InternalML2.g:1641:20: (lv_isComplete_2_0= 'complete' )
            	    // InternalML2.g:1642:10: lv_isComplete_2_0= 'complete'
            	    {
            	    lv_isComplete_2_0=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_isComplete_2_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	      										}
            	      										setWithLastConsumed(current, "isComplete", true, "complete");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());

            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1());
              		
            }
            // InternalML2.g:1670:3: ( (lv_name_4_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalML2.g:1671:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalML2.g:1671:4: (lv_name_4_0= RULE_ID )
                    // InternalML2.g:1672:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_4_0, grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralizationSetRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_4_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3());
              		
            }
            // InternalML2.g:1692:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1693:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1693:4: ( ruleQualifiedName )
            // InternalML2.g:1694:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGeneralizationSetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:1708:3: (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalML2.g:1709:4: otherlv_7= 'categorizer' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0());
                      			
                    }
                    // InternalML2.g:1713:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1714:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1714:5: ( ruleQualifiedName )
                    // InternalML2.g:1715:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCategorizerHigherOrderClassCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6());
              		
            }
            // InternalML2.g:1734:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1735:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1735:4: ( ruleQualifiedName )
            // InternalML2.g:1736:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGeneralizationSetRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0());
              				
            }
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:1750:3: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==21) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalML2.g:1751:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	      			
            	    }
            	    // InternalML2.g:1755:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:1756:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:1756:5: ( ruleQualifiedName )
            	    // InternalML2.g:1757:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleFeature"
    // InternalML2.g:1776:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalML2.g:1776:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalML2.g:1777:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalML2.g:1783:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:1789:2: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // InternalML2.g:1790:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // InternalML2.g:1790:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt47=2;
            switch ( input.LA(1) ) {
            case 40:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==41) ) {
                    alt47=2;
                }
                else if ( (LA47_1==RULE_ID||LA47_1==35) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 35:
                {
                alt47=1;
                }
                break;
            case 41:
                {
                alt47=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalML2.g:1791:3: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Attribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:1800:3: this_Reference_1= ruleReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Reference_1=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Reference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAttribute"
    // InternalML2.g:1812:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalML2.g:1812:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalML2.g:1813:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalML2.g:1819:1: ruleAttribute returns [EObject current=null] : (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_RegularityAttribute_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        Enumerator lv_primitiveType_9_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1825:2: ( (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) ) )
            // InternalML2.g:1826:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            {
            // InternalML2.g:1826:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalML2.g:1827:3: this_RegularityAttribute_0= ruleRegularityAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeAccess().getRegularityAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RegularityAttribute_0=ruleRegularityAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RegularityAttribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:1836:3: ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? )
                    {
                    // InternalML2.g:1836:3: ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? )
                    // InternalML2.g:1837:4: (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    {
                    // InternalML2.g:1837:4: (otherlv_1= 'att' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==35) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalML2.g:1838:5: otherlv_1= 'att'
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalML2.g:1843:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalML2.g:1844:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalML2.g:1844:5: (lv_name_2_0= RULE_ID )
                    // InternalML2.g:1845:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAttributeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_1_2());
                      			
                    }
                    // InternalML2.g:1865:4: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalML2.g:1866:5: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_3_0());
                              				
                            }
                            // InternalML2.g:1870:5: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                            // InternalML2.g:1871:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:1871:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            // InternalML2.g:1872:7: lv_lowerBound_5_0= ruleCARDINALITY
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundCARDINALITYParserRuleCall_1_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_lowerBound_5_0=ruleCARDINALITY();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAttributeRule());
                              							}
                              							set(
                              								current,
                              								"lowerBound",
                              								lv_lowerBound_5_0,
                              								"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,37,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_1_3_2());
                              				
                            }
                            // InternalML2.g:1893:5: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                            // InternalML2.g:1894:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:1894:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            // InternalML2.g:1895:7: lv_upperBound_7_0= ruleCARDINALITY
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundCARDINALITYParserRuleCall_1_3_3_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
                            lv_upperBound_7_0=ruleCARDINALITY();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAttributeRule());
                              							}
                              							set(
                              								current,
                              								"upperBound",
                              								lv_upperBound_7_0,
                              								"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3_4());
                              				
                            }

                            }
                            break;

                    }

                    // InternalML2.g:1917:4: ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=70 && LA50_0<=72)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_ID) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalML2.g:1918:5: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                            {
                            // InternalML2.g:1918:5: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                            // InternalML2.g:1919:6: (lv_primitiveType_9_0= rulePrimitiveType )
                            {
                            // InternalML2.g:1919:6: (lv_primitiveType_9_0= rulePrimitiveType )
                            // InternalML2.g:1920:7: lv_primitiveType_9_0= rulePrimitiveType
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_1_4_0_0());
                              						
                            }
                            pushFollow(FOLLOW_34);
                            lv_primitiveType_9_0=rulePrimitiveType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAttributeRule());
                              							}
                              							set(
                              								current,
                              								"primitiveType",
                              								lv_primitiveType_9_0,
                              								"br.ufes.inf.nemo.ml2.ML2.PrimitiveType");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalML2.g:1938:5: ( ( ruleQualifiedName ) )
                            {
                            // InternalML2.g:1938:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:1939:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:1939:6: ( ruleQualifiedName )
                            // InternalML2.g:1940:7: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeRule());
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_1_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_34);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalML2.g:1955:4: (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==39) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalML2.g:1956:5: otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_11=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getSubsetsKeyword_1_5_0());
                              				
                            }
                            // InternalML2.g:1960:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:1961:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:1961:6: ( ruleQualifiedName )
                            // InternalML2.g:1962:7: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeRule());
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_1_5_1_0());
                              						
                            }
                            pushFollow(FOLLOW_28);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalML2.g:1976:5: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==21) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalML2.g:1977:6: otherlv_13= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_13=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getCommaKeyword_1_5_2_0());
                            	      					
                            	    }
                            	    // InternalML2.g:1981:6: ( ( ruleQualifiedName ) )
                            	    // InternalML2.g:1982:7: ( ruleQualifiedName )
                            	    {
                            	    // InternalML2.g:1982:7: ( ruleQualifiedName )
                            	    // InternalML2.g:1983:8: ruleQualifiedName
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElement(grammarAccess.getAttributeRule());
                            	      								}
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_1_5_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_28);
                            	    ruleQualifiedName();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRegularityAttribute"
    // InternalML2.g:2004:1: entryRuleRegularityAttribute returns [EObject current=null] : iv_ruleRegularityAttribute= ruleRegularityAttribute EOF ;
    public final EObject entryRuleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityAttribute = null;


        try {
            // InternalML2.g:2004:60: (iv_ruleRegularityAttribute= ruleRegularityAttribute EOF )
            // InternalML2.g:2005:2: iv_ruleRegularityAttribute= ruleRegularityAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularityAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRegularityAttribute=ruleRegularityAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularityAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularityAttribute"


    // $ANTLR start "ruleRegularityAttribute"
    // InternalML2.g:2011:1: ruleRegularityAttribute returns [EObject current=null] : ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        Enumerator lv_primitiveType_9_0 = null;

        Enumerator lv_regularityType_15_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2017:2: ( ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2018:2: ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2018:2: ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2019:3: (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:2019:3: (otherlv_0= 'regularity' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalML2.g:2020:4: otherlv_0= 'regularity'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2025:3: (otherlv_1= 'att' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==35) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalML2.g:2026:4: otherlv_1= 'att'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRegularityAttributeAccess().getAttKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2031:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:2032:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:2032:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:2033:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getRegularityAttributeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRegularityAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRegularityAttributeAccess().getColonKeyword_3());
              		
            }
            // InternalML2.g:2053:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalML2.g:2054:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:2058:4: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                    // InternalML2.g:2059:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2059:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    // InternalML2.g:2060:6: lv_lowerBound_5_0= ruleCARDINALITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getLowerBoundCARDINALITYParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_lowerBound_5_0=ruleCARDINALITY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                      						}
                      						set(
                      							current,
                      							"lowerBound",
                      							lv_lowerBound_5_0,
                      							"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2());
                      			
                    }
                    // InternalML2.g:2081:4: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                    // InternalML2.g:2082:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2082:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    // InternalML2.g:2083:6: lv_upperBound_7_0= ruleCARDINALITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getUpperBoundCARDINALITYParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_upperBound_7_0=ruleCARDINALITY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_7_0,
                      							"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,38,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2105:3: ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=70 && LA57_0<=72)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalML2.g:2106:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    {
                    // InternalML2.g:2106:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    // InternalML2.g:2107:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    {
                    // InternalML2.g:2107:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    // InternalML2.g:2108:6: lv_primitiveType_9_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_5_0_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_primitiveType_9_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                      						}
                      						set(
                      							current,
                      							"primitiveType",
                      							lv_primitiveType_9_0,
                      							"br.ufes.inf.nemo.ml2.ML2.PrimitiveType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2126:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2126:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2127:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2127:5: ( ruleQualifiedName )
                    // InternalML2.g:2128:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:2143:3: (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalML2.g:2144:4: otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0());
                      			
                    }
                    // InternalML2.g:2148:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2149:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2149:5: ( ruleQualifiedName )
                    // InternalML2.g:2150:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:2164:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==21) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalML2.g:2165:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_13, grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:2169:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2170:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2170:6: ( ruleQualifiedName )
                    	    // InternalML2.g:2171:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:2187:3: ( (lv_regularityType_15_0= ruleRegularityFeatureType ) )
            // InternalML2.g:2188:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:2188:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            // InternalML2.g:2189:5: lv_regularityType_15_0= ruleRegularityFeatureType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_regularityType_15_0=ruleRegularityFeatureType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
              					}
              					set(
              						current,
              						"regularityType",
              						lv_regularityType_15_0,
              						"br.ufes.inf.nemo.ml2.ML2.RegularityFeatureType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:2206:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2207:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2207:4: ( ruleQualifiedName )
            // InternalML2.g:2208:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRegularityAttributeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegulatesAttributeCrossReference_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularityAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalML2.g:2226:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalML2.g:2226:50: (iv_ruleReference= ruleReference EOF )
            // InternalML2.g:2227:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalML2.g:2233:1: ruleReference returns [EObject current=null] : (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_RegularityReference_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2239:2: ( (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ) )
            // InternalML2.g:2240:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            {
            // InternalML2.g:2240:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalML2.g:2241:3: this_RegularityReference_0= ruleRegularityReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferenceAccess().getRegularityReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RegularityReference_0=ruleRegularityReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RegularityReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:2250:3: (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
                    {
                    // InternalML2.g:2250:3: (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
                    // InternalML2.g:2251:4: otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getRefKeyword_1_0());
                      			
                    }
                    // InternalML2.g:2255:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalML2.g:2256:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalML2.g:2256:5: (lv_name_2_0= RULE_ID )
                    // InternalML2.g:2257:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferenceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_1_2());
                      			
                    }
                    // InternalML2.g:2277:4: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==36) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalML2.g:2278:5: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_1_3_0());
                              				
                            }
                            // InternalML2.g:2282:5: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                            // InternalML2.g:2283:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:2283:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            // InternalML2.g:2284:7: lv_lowerBound_5_0= ruleCARDINALITY
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundCARDINALITYParserRuleCall_1_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_lowerBound_5_0=ruleCARDINALITY();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getReferenceRule());
                              							}
                              							set(
                              								current,
                              								"lowerBound",
                              								lv_lowerBound_5_0,
                              								"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,37,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_1_3_2());
                              				
                            }
                            // InternalML2.g:2305:5: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                            // InternalML2.g:2306:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:2306:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            // InternalML2.g:2307:7: lv_upperBound_7_0= ruleCARDINALITY
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundCARDINALITYParserRuleCall_1_3_3_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
                            lv_upperBound_7_0=ruleCARDINALITY();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getReferenceRule());
                              							}
                              							set(
                              								current,
                              								"upperBound",
                              								lv_upperBound_7_0,
                              								"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_1_3_4());
                              				
                            }

                            }
                            break;

                    }

                    // InternalML2.g:2329:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2330:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2330:5: ( ruleQualifiedName )
                    // InternalML2.g:2331:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferenceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReferenceAccess().get_typeClassCrossReference_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:2345:4: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==39) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalML2.g:2346:5: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_10=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getReferenceAccess().getSubsetsKeyword_1_5_0());
                              				
                            }
                            // InternalML2.g:2350:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:2351:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:2351:6: ( ruleQualifiedName )
                            // InternalML2.g:2352:7: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getReferenceRule());
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_1_5_1_0());
                              						
                            }
                            pushFollow(FOLLOW_40);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalML2.g:2366:5: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==21) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalML2.g:2367:6: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_12, grammarAccess.getReferenceAccess().getCommaKeyword_1_5_2_0());
                            	      					
                            	    }
                            	    // InternalML2.g:2371:6: ( ( ruleQualifiedName ) )
                            	    // InternalML2.g:2372:7: ( ruleQualifiedName )
                            	    {
                            	    // InternalML2.g:2372:7: ( ruleQualifiedName )
                            	    // InternalML2.g:2373:8: ruleQualifiedName
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElement(grammarAccess.getReferenceRule());
                            	      								}
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_1_5_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_40);
                            	    ruleQualifiedName();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop61;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalML2.g:2389:4: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==42) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalML2.g:2390:5: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                            {
                            otherlv_14=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getReferenceAccess().getIsOppositeToKeyword_1_6_0());
                              				
                            }
                            // InternalML2.g:2394:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:2395:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:2395:6: ( ruleQualifiedName )
                            // InternalML2.g:2396:7: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getReferenceRule());
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_1_6_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleRegularityReference"
    // InternalML2.g:2416:1: entryRuleRegularityReference returns [EObject current=null] : iv_ruleRegularityReference= ruleRegularityReference EOF ;
    public final EObject entryRuleRegularityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityReference = null;


        try {
            // InternalML2.g:2416:60: (iv_ruleRegularityReference= ruleRegularityReference EOF )
            // InternalML2.g:2417:2: iv_ruleRegularityReference= ruleRegularityReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularityReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRegularityReference=ruleRegularityReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularityReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularityReference"


    // $ANTLR start "ruleRegularityReference"
    // InternalML2.g:2423:1: ruleRegularityReference returns [EObject current=null] : ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRegularityReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        Enumerator lv_regularityType_16_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2429:2: ( ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2430:2: ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2430:2: ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2431:3: (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:2431:3: (otherlv_0= 'regularity' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==40) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalML2.g:2432:4: otherlv_0= 'regularity'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0());
                      			
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRegularityReferenceAccess().getRefKeyword_1());
              		
            }
            // InternalML2.g:2441:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:2442:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:2442:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:2443:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getRegularityReferenceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRegularityReferenceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRegularityReferenceAccess().getColonKeyword_3());
              		
            }
            // InternalML2.g:2463:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==36) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalML2.g:2464:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:2468:4: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                    // InternalML2.g:2469:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2469:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    // InternalML2.g:2470:6: lv_lowerBound_5_0= ruleCARDINALITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getLowerBoundCARDINALITYParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_lowerBound_5_0=ruleCARDINALITY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
                      						}
                      						set(
                      							current,
                      							"lowerBound",
                      							lv_lowerBound_5_0,
                      							"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2());
                      			
                    }
                    // InternalML2.g:2491:4: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                    // InternalML2.g:2492:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2492:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    // InternalML2.g:2493:6: lv_upperBound_7_0= ruleCARDINALITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getUpperBoundCARDINALITYParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_upperBound_7_0=ruleCARDINALITY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_7_0,
                      							"br.ufes.inf.nemo.ml2.ML2.CARDINALITY");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2515:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2516:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2516:4: ( ruleQualifiedName )
            // InternalML2.g:2517:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRegularityReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRegularityReferenceAccess().get_typeClassCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:2531:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==39) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalML2.g:2532:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0());
                      			
                    }
                    // InternalML2.g:2536:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2537:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2537:5: ( ruleQualifiedName )
                    // InternalML2.g:2538:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:2552:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==21) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalML2.g:2553:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:2557:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2558:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2558:6: ( ruleQualifiedName )
                    	    // InternalML2.g:2559:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_43);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:2575:3: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==42) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalML2.g:2576:4: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0());
                      			
                    }
                    // InternalML2.g:2580:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2581:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2581:5: ( ruleQualifiedName )
                    // InternalML2.g:2582:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:2597:3: ( (lv_regularityType_16_0= ruleRegularityFeatureType ) )
            // InternalML2.g:2598:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:2598:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            // InternalML2.g:2599:5: lv_regularityType_16_0= ruleRegularityFeatureType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_regularityType_16_0=ruleRegularityFeatureType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
              					}
              					set(
              						current,
              						"regularityType",
              						lv_regularityType_16_0,
              						"br.ufes.inf.nemo.ml2.ML2.RegularityFeatureType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:2616:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2617:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2617:4: ( ruleQualifiedName )
            // InternalML2.g:2618:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRegularityReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegulatesReferenceCrossReference_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularityReference"


    // $ANTLR start "entryRuleRegularityFeature"
    // InternalML2.g:2636:1: entryRuleRegularityFeature returns [EObject current=null] : iv_ruleRegularityFeature= ruleRegularityFeature EOF ;
    public final EObject entryRuleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityFeature = null;


        try {
            // InternalML2.g:2636:58: (iv_ruleRegularityFeature= ruleRegularityFeature EOF )
            // InternalML2.g:2637:2: iv_ruleRegularityFeature= ruleRegularityFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularityFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRegularityFeature=ruleRegularityFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularityFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularityFeature"


    // $ANTLR start "ruleRegularityFeature"
    // InternalML2.g:2643:1: ruleRegularityFeature returns [EObject current=null] : (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) ;
    public final EObject ruleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_RegularityAttribute_0 = null;

        EObject this_RegularityReference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:2649:2: ( (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) )
            // InternalML2.g:2650:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
            {
            // InternalML2.g:2650:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
            int alt70=2;
            switch ( input.LA(1) ) {
            case 40:
                {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==RULE_ID||LA70_1==35) ) {
                    alt70=1;
                }
                else if ( (LA70_1==41) ) {
                    alt70=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 35:
                {
                alt70=1;
                }
                break;
            case 41:
                {
                alt70=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalML2.g:2651:3: this_RegularityAttribute_0= ruleRegularityAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRegularityFeatureAccess().getRegularityAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RegularityAttribute_0=ruleRegularityAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RegularityAttribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:2660:3: this_RegularityReference_1= ruleRegularityReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRegularityFeatureAccess().getRegularityReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RegularityReference_1=ruleRegularityReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RegularityReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularityFeature"


    // $ANTLR start "entryRuleCARDINALITY"
    // InternalML2.g:2672:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalML2.g:2672:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalML2.g:2673:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCARDINALITYRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCARDINALITY=ruleCARDINALITY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCARDINALITY.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCARDINALITY"


    // $ANTLR start "ruleCARDINALITY"
    // InternalML2.g:2679:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalML2.g:2685:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalML2.g:2686:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalML2.g:2686:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_INT) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalML2.g:2687:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:2693:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getCARDINALITYAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCARDINALITY"


    // $ANTLR start "entryRuleFeatureAssignment"
    // InternalML2.g:2704:1: entryRuleFeatureAssignment returns [EObject current=null] : iv_ruleFeatureAssignment= ruleFeatureAssignment EOF ;
    public final EObject entryRuleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureAssignment = null;


        try {
            // InternalML2.g:2704:58: (iv_ruleFeatureAssignment= ruleFeatureAssignment EOF )
            // InternalML2.g:2705:2: iv_ruleFeatureAssignment= ruleFeatureAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureAssignment=ruleFeatureAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureAssignment"


    // $ANTLR start "ruleFeatureAssignment"
    // InternalML2.g:2711:1: ruleFeatureAssignment returns [EObject current=null] : (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment ) ;
    public final EObject ruleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_SingleReferenceAssignment_0 = null;

        EObject this_MultipleReferenceAssignment_1 = null;

        EObject this_SingleAttributeAssignment_2 = null;

        EObject this_MultipleAttributeAssignment_3 = null;



        	enterRule();

        try {
            // InternalML2.g:2717:2: ( (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment ) )
            // InternalML2.g:2718:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )
            {
            // InternalML2.g:2718:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )
            int alt72=4;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalML2.g:2719:3: this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getSingleReferenceAssignmentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SingleReferenceAssignment_0=ruleSingleReferenceAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SingleReferenceAssignment_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:2728:3: this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getMultipleReferenceAssignmentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MultipleReferenceAssignment_1=ruleMultipleReferenceAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MultipleReferenceAssignment_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:2737:3: this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SingleAttributeAssignment_2=ruleSingleAttributeAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SingleAttributeAssignment_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalML2.g:2746:3: this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getMultipleAttributeAssignmentParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MultipleAttributeAssignment_3=ruleMultipleAttributeAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MultipleAttributeAssignment_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureAssignment"


    // $ANTLR start "entryRuleSingleReferenceAssignment"
    // InternalML2.g:2758:1: entryRuleSingleReferenceAssignment returns [EObject current=null] : iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF ;
    public final EObject entryRuleSingleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleReferenceAssignment = null;


        try {
            // InternalML2.g:2758:66: (iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF )
            // InternalML2.g:2759:2: iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleReferenceAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleReferenceAssignment=ruleSingleReferenceAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleReferenceAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleReferenceAssignment"


    // $ANTLR start "ruleSingleReferenceAssignment"
    // InternalML2.g:2765:1: ruleSingleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSingleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalML2.g:2771:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2772:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2772:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2773:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSingleReferenceAssignmentAccess().getRefKeyword_0());
              		
            }
            // InternalML2.g:2777:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2778:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2778:4: ( ruleQualifiedName )
            // InternalML2.g:2779:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleReferenceAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSingleReferenceAssignmentAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalML2.g:2797:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2798:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2798:4: ( ruleQualifiedName )
            // InternalML2.g:2799:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleReferenceAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleReferenceAssignmentAccess().getValuesEntityDeclarationCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleReferenceAssignment"


    // $ANTLR start "entryRuleMultipleReferenceAssignment"
    // InternalML2.g:2817:1: entryRuleMultipleReferenceAssignment returns [EObject current=null] : iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF ;
    public final EObject entryRuleMultipleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleReferenceAssignment = null;


        try {
            // InternalML2.g:2817:68: (iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF )
            // InternalML2.g:2818:2: iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultipleReferenceAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultipleReferenceAssignment=ruleMultipleReferenceAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultipleReferenceAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleReferenceAssignment"


    // $ANTLR start "ruleMultipleReferenceAssignment"
    // InternalML2.g:2824:1: ruleMultipleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleMultipleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalML2.g:2830:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ) )
            // InternalML2.g:2831:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )
            {
            // InternalML2.g:2831:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )
            // InternalML2.g:2832:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultipleReferenceAssignmentAccess().getRefKeyword_0());
              		
            }
            // InternalML2.g:2836:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2837:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2837:4: ( ruleQualifiedName )
            // InternalML2.g:2838:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultipleReferenceAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultipleReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultipleReferenceAssignmentAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMultipleReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalML2.g:2860:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2861:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2861:4: ( ruleQualifiedName )
            // InternalML2.g:2862:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultipleReferenceAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultipleReferenceAssignmentAccess().getValuesEntityDeclarationCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_45);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:2876:3: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==21) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalML2.g:2877:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getMultipleReferenceAssignmentAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalML2.g:2881:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:2882:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:2882:5: ( ruleQualifiedName )
            	    // InternalML2.g:2883:6: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMultipleReferenceAssignmentRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultipleReferenceAssignmentAccess().getValuesEntityDeclarationCrossReference_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMultipleReferenceAssignmentAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleReferenceAssignment"


    // $ANTLR start "entryRuleSingleAttributeAssignment"
    // InternalML2.g:2906:1: entryRuleSingleAttributeAssignment returns [EObject current=null] : iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF ;
    public final EObject entryRuleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAttributeAssignment = null;


        try {
            // InternalML2.g:2906:66: (iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF )
            // InternalML2.g:2907:2: iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleAttributeAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleAttributeAssignment=ruleSingleAttributeAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleAttributeAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleAttributeAssignment"


    // $ANTLR start "ruleSingleAttributeAssignment"
    // InternalML2.g:2913:1: ruleSingleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ) ;
    public final EObject ruleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_stringValues_3_0=null;
        AntlrDatatypeRuleToken lv_numberValues_4_0 = null;

        AntlrDatatypeRuleToken lv_booleanValues_5_0 = null;

        EObject lv_unnamedValues_7_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2919:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ) )
            // InternalML2.g:2920:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) )
            {
            // InternalML2.g:2920:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) )
            // InternalML2.g:2921:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) )
            {
            // InternalML2.g:2921:3: (otherlv_0= 'att' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==35) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalML2.g:2922:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2927:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2928:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2928:4: ( ruleQualifiedName )
            // InternalML2.g:2929:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalML2.g:2947:3: ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) )
            int alt75=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt75=1;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt75=2;
                }
                break;
            case 45:
            case 46:
                {
                alt75=3;
                }
                break;
            case RULE_ID:
                {
                alt75=4;
                }
                break;
            case 36:
                {
                alt75=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalML2.g:2948:4: ( (lv_stringValues_3_0= RULE_STRING ) )
                    {
                    // InternalML2.g:2948:4: ( (lv_stringValues_3_0= RULE_STRING ) )
                    // InternalML2.g:2949:5: (lv_stringValues_3_0= RULE_STRING )
                    {
                    // InternalML2.g:2949:5: (lv_stringValues_3_0= RULE_STRING )
                    // InternalML2.g:2950:6: lv_stringValues_3_0= RULE_STRING
                    {
                    lv_stringValues_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_stringValues_3_0, grammarAccess.getSingleAttributeAssignmentAccess().getStringValuesSTRINGTerminalRuleCall_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"stringValues",
                      							lv_stringValues_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2967:4: ( (lv_numberValues_4_0= ruleNUMBER ) )
                    {
                    // InternalML2.g:2967:4: ( (lv_numberValues_4_0= ruleNUMBER ) )
                    // InternalML2.g:2968:5: (lv_numberValues_4_0= ruleNUMBER )
                    {
                    // InternalML2.g:2968:5: (lv_numberValues_4_0= ruleNUMBER )
                    // InternalML2.g:2969:6: lv_numberValues_4_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getNumberValuesNUMBERParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_numberValues_4_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"numberValues",
                      							lv_numberValues_4_0,
                      							"br.ufes.inf.nemo.ml2.ML2.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:2987:4: ( (lv_booleanValues_5_0= ruleBOOLEAN ) )
                    {
                    // InternalML2.g:2987:4: ( (lv_booleanValues_5_0= ruleBOOLEAN ) )
                    // InternalML2.g:2988:5: (lv_booleanValues_5_0= ruleBOOLEAN )
                    {
                    // InternalML2.g:2988:5: (lv_booleanValues_5_0= ruleBOOLEAN )
                    // InternalML2.g:2989:6: lv_booleanValues_5_0= ruleBOOLEAN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getBooleanValuesBOOLEANParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_booleanValues_5_0=ruleBOOLEAN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"booleanValues",
                      							lv_booleanValues_5_0,
                      							"br.ufes.inf.nemo.ml2.ML2.BOOLEAN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3007:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:3007:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3008:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3008:5: ( ruleQualifiedName )
                    // InternalML2.g:3009:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:3024:4: ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3024:4: ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3025:5: (lv_unnamedValues_7_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3025:5: (lv_unnamedValues_7_0= ruleUnnamedIndividual )
                    // InternalML2.g:3026:6: lv_unnamedValues_7_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_unnamedValues_7_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"unnamedValues",
                      							lv_unnamedValues_7_0,
                      							"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleAttributeAssignment"


    // $ANTLR start "entryRuleMultipleAttributeAssignment"
    // InternalML2.g:3048:1: entryRuleMultipleAttributeAssignment returns [EObject current=null] : iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF ;
    public final EObject entryRuleMultipleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleAttributeAssignment = null;


        try {
            // InternalML2.g:3048:68: (iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF )
            // InternalML2.g:3049:2: iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultipleAttributeAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultipleAttributeAssignment=ruleMultipleAttributeAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultipleAttributeAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleAttributeAssignment"


    // $ANTLR start "ruleMultipleAttributeAssignment"
    // InternalML2.g:3055:1: ruleMultipleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) ) ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_19= '}' ) ;
    public final EObject ruleMultipleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_stringValues_4_0=null;
        Token otherlv_9=null;
        Token lv_stringValues_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_numberValues_5_0 = null;

        AntlrDatatypeRuleToken lv_booleanValues_6_0 = null;

        EObject lv_unnamedValues_8_0 = null;

        AntlrDatatypeRuleToken lv_numberValues_12_0 = null;

        AntlrDatatypeRuleToken lv_booleanValues_14_0 = null;

        EObject lv_unnamedValues_18_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3061:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) ) ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_19= '}' ) )
            // InternalML2.g:3062:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) ) ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_19= '}' )
            {
            // InternalML2.g:3062:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) ) ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_19= '}' )
            // InternalML2.g:3063:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) ) ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_19= '}'
            {
            // InternalML2.g:3063:3: (otherlv_0= 'att' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==35) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalML2.g:3064:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:3069:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3070:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3070:4: ( ruleQualifiedName )
            // InternalML2.g:3071:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultipleAttributeAssignmentAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,12,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMultipleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalML2.g:3093:3: ( ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) ) ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )* )
            // InternalML2.g:3094:4: ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) ) ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )*
            {
            // InternalML2.g:3094:4: ( ( (lv_stringValues_4_0= RULE_STRING ) ) | ( (lv_numberValues_5_0= ruleNUMBER ) ) | ( (lv_booleanValues_6_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) ) )
            int alt77=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt77=1;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt77=2;
                }
                break;
            case 45:
            case 46:
                {
                alt77=3;
                }
                break;
            case RULE_ID:
                {
                alt77=4;
                }
                break;
            case 36:
                {
                alt77=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalML2.g:3095:5: ( (lv_stringValues_4_0= RULE_STRING ) )
                    {
                    // InternalML2.g:3095:5: ( (lv_stringValues_4_0= RULE_STRING ) )
                    // InternalML2.g:3096:6: (lv_stringValues_4_0= RULE_STRING )
                    {
                    // InternalML2.g:3096:6: (lv_stringValues_4_0= RULE_STRING )
                    // InternalML2.g:3097:7: lv_stringValues_4_0= RULE_STRING
                    {
                    lv_stringValues_4_0=(Token)match(input,RULE_STRING,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_stringValues_4_0, grammarAccess.getMultipleAttributeAssignmentAccess().getStringValuesSTRINGTerminalRuleCall_4_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      							addWithLastConsumed(
                      								current,
                      								"stringValues",
                      								lv_stringValues_4_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3114:5: ( (lv_numberValues_5_0= ruleNUMBER ) )
                    {
                    // InternalML2.g:3114:5: ( (lv_numberValues_5_0= ruleNUMBER ) )
                    // InternalML2.g:3115:6: (lv_numberValues_5_0= ruleNUMBER )
                    {
                    // InternalML2.g:3115:6: (lv_numberValues_5_0= ruleNUMBER )
                    // InternalML2.g:3116:7: lv_numberValues_5_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getNumberValuesNUMBERParserRuleCall_4_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_numberValues_5_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"numberValues",
                      								lv_numberValues_5_0,
                      								"br.ufes.inf.nemo.ml2.ML2.NUMBER");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3134:5: ( (lv_booleanValues_6_0= ruleBOOLEAN ) )
                    {
                    // InternalML2.g:3134:5: ( (lv_booleanValues_6_0= ruleBOOLEAN ) )
                    // InternalML2.g:3135:6: (lv_booleanValues_6_0= ruleBOOLEAN )
                    {
                    // InternalML2.g:3135:6: (lv_booleanValues_6_0= ruleBOOLEAN )
                    // InternalML2.g:3136:7: lv_booleanValues_6_0= ruleBOOLEAN
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getBooleanValuesBOOLEANParserRuleCall_4_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_booleanValues_6_0=ruleBOOLEAN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"booleanValues",
                      								lv_booleanValues_6_0,
                      								"br.ufes.inf.nemo.ml2.ML2.BOOLEAN");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3154:5: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:3154:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3155:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3155:6: ( ruleQualifiedName )
                    // InternalML2.g:3156:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_4_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:3171:5: ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3171:5: ( (lv_unnamedValues_8_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3172:6: (lv_unnamedValues_8_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3172:6: (lv_unnamedValues_8_0= ruleUnnamedIndividual )
                    // InternalML2.g:3173:7: lv_unnamedValues_8_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_4_0_4_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_unnamedValues_8_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"unnamedValues",
                      								lv_unnamedValues_8_0,
                      								"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:3191:4: ( (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) ) | (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) ) | (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) ) | (otherlv_15= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) ) )*
            loop78:
            do {
                int alt78=6;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==21) ) {
                    switch ( input.LA(2) ) {
                    case RULE_INT:
                    case 47:
                        {
                        alt78=2;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt78=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt78=4;
                        }
                        break;
                    case 45:
                    case 46:
                        {
                        alt78=3;
                        }
                        break;
                    case 36:
                        {
                        alt78=5;
                        }
                        break;

                    }

                }


                switch (alt78) {
            	case 1 :
            	    // InternalML2.g:3192:5: (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) )
            	    {
            	    // InternalML2.g:3192:5: (otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) ) )
            	    // InternalML2.g:3193:6: otherlv_9= ',' ( (lv_stringValues_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_9, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_0_0());
            	      					
            	    }
            	    // InternalML2.g:3197:6: ( (lv_stringValues_10_0= RULE_STRING ) )
            	    // InternalML2.g:3198:7: (lv_stringValues_10_0= RULE_STRING )
            	    {
            	    // InternalML2.g:3198:7: (lv_stringValues_10_0= RULE_STRING )
            	    // InternalML2.g:3199:8: lv_stringValues_10_0= RULE_STRING
            	    {
            	    lv_stringValues_10_0=(Token)match(input,RULE_STRING,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_stringValues_10_0, grammarAccess.getMultipleAttributeAssignmentAccess().getStringValuesSTRINGTerminalRuleCall_4_1_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
            	      								}
            	      								addWithLastConsumed(
            	      									current,
            	      									"stringValues",
            	      									lv_stringValues_10_0,
            	      									"org.eclipse.xtext.common.Terminals.STRING");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalML2.g:3217:5: (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) )
            	    {
            	    // InternalML2.g:3217:5: (otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) ) )
            	    // InternalML2.g:3218:6: otherlv_11= ',' ( (lv_numberValues_12_0= ruleNUMBER ) )
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_11, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_1_0());
            	      					
            	    }
            	    // InternalML2.g:3222:6: ( (lv_numberValues_12_0= ruleNUMBER ) )
            	    // InternalML2.g:3223:7: (lv_numberValues_12_0= ruleNUMBER )
            	    {
            	    // InternalML2.g:3223:7: (lv_numberValues_12_0= ruleNUMBER )
            	    // InternalML2.g:3224:8: lv_numberValues_12_0= ruleNUMBER
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getNumberValuesNUMBERParserRuleCall_4_1_1_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_numberValues_12_0=ruleNUMBER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
            	      								}
            	      								add(
            	      									current,
            	      									"numberValues",
            	      									lv_numberValues_12_0,
            	      									"br.ufes.inf.nemo.ml2.ML2.NUMBER");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalML2.g:3243:5: (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) )
            	    {
            	    // InternalML2.g:3243:5: (otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) ) )
            	    // InternalML2.g:3244:6: otherlv_13= ',' ( (lv_booleanValues_14_0= ruleBOOLEAN ) )
            	    {
            	    otherlv_13=(Token)match(input,21,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_13, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_2_0());
            	      					
            	    }
            	    // InternalML2.g:3248:6: ( (lv_booleanValues_14_0= ruleBOOLEAN ) )
            	    // InternalML2.g:3249:7: (lv_booleanValues_14_0= ruleBOOLEAN )
            	    {
            	    // InternalML2.g:3249:7: (lv_booleanValues_14_0= ruleBOOLEAN )
            	    // InternalML2.g:3250:8: lv_booleanValues_14_0= ruleBOOLEAN
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getBooleanValuesBOOLEANParserRuleCall_4_1_2_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_booleanValues_14_0=ruleBOOLEAN();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
            	      								}
            	      								add(
            	      									current,
            	      									"booleanValues",
            	      									lv_booleanValues_14_0,
            	      									"br.ufes.inf.nemo.ml2.ML2.BOOLEAN");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalML2.g:3269:5: (otherlv_15= ',' ( ( ruleQualifiedName ) ) )
            	    {
            	    // InternalML2.g:3269:5: (otherlv_15= ',' ( ( ruleQualifiedName ) ) )
            	    // InternalML2.g:3270:6: otherlv_15= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_15=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_15, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_3_0());
            	      					
            	    }
            	    // InternalML2.g:3274:6: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:3275:7: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:3275:7: ( ruleQualifiedName )
            	    // InternalML2.g:3276:8: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_4_1_3_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalML2.g:3292:5: (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) )
            	    {
            	    // InternalML2.g:3292:5: (otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) ) )
            	    // InternalML2.g:3293:6: otherlv_17= ',' ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) )
            	    {
            	    otherlv_17=(Token)match(input,21,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_17, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_4_0());
            	      					
            	    }
            	    // InternalML2.g:3297:6: ( (lv_unnamedValues_18_0= ruleUnnamedIndividual ) )
            	    // InternalML2.g:3298:7: (lv_unnamedValues_18_0= ruleUnnamedIndividual )
            	    {
            	    // InternalML2.g:3298:7: (lv_unnamedValues_18_0= ruleUnnamedIndividual )
            	    // InternalML2.g:3299:8: lv_unnamedValues_18_0= ruleUnnamedIndividual
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_4_1_4_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_unnamedValues_18_0=ruleUnnamedIndividual();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
            	      								}
            	      								add(
            	      									current,
            	      									"unnamedValues",
            	      									lv_unnamedValues_18_0,
            	      									"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getMultipleAttributeAssignmentAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleAttributeAssignment"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalML2.g:3327:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalML2.g:3327:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalML2.g:3328:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalML2.g:3334:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalML2.g:3340:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalML2.g:3341:2: (kw= 'true' | kw= 'false' )
            {
            // InternalML2.g:3341:2: (kw= 'true' | kw= 'false' )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==45) ) {
                alt79=1;
            }
            else if ( (LA79_0==46) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalML2.g:3342:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:3348:3: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // InternalML2.g:3357:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalML2.g:3357:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalML2.g:3358:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalML2.g:3364:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalML2.g:3370:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalML2.g:3371:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalML2.g:3371:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalML2.g:3372:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalML2.g:3372:3: (kw= '-' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==47) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalML2.g:3373:4: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
              		
            }
            // InternalML2.g:3386:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==16) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalML2.g:3387:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleUnnamedIndividual"
    // InternalML2.g:3404:1: entryRuleUnnamedIndividual returns [EObject current=null] : iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF ;
    public final EObject entryRuleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedIndividual = null;


        try {
            // InternalML2.g:3404:58: (iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF )
            // InternalML2.g:3405:2: iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedIndividualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedIndividual=ruleUnnamedIndividual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedIndividual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnnamedIndividual"


    // $ANTLR start "ruleUnnamedIndividual"
    // InternalML2.g:3411:1: ruleUnnamedIndividual returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) ;
    public final EObject ruleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3417:2: ( ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) )
            // InternalML2.g:3418:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            {
            // InternalML2.g:3418:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            // InternalML2.g:3419:3: () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']'
            {
            // InternalML2.g:3419:3: ()
            // InternalML2.g:3420:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnnamedIndividualAccess().getIndividualAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnnamedIndividualAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalML2.g:3430:3: ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_ID) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalML2.g:3431:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    {
            	    // InternalML2.g:3431:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    // InternalML2.g:3432:5: lv_assignments_2_0= ruleSimpleAttributeAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getUnnamedIndividualAccess().getAssignmentsSimpleAttributeAssignmentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_assignments_2_0=ruleSimpleAttributeAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getUnnamedIndividualRule());
            	      					}
            	      					add(
            	      						current,
            	      						"assignments",
            	      						lv_assignments_2_0,
            	      						"br.ufes.inf.nemo.ml2.ML2.SimpleAttributeAssignment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getUnnamedIndividualAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnnamedIndividual"


    // $ANTLR start "entryRuleSimpleAttributeAssignment"
    // InternalML2.g:3457:1: entryRuleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3457:66: (iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF )
            // InternalML2.g:3458:2: iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleAttributeAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAttributeAssignment=ruleSimpleAttributeAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleAttributeAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAttributeAssignment"


    // $ANTLR start "ruleSimpleAttributeAssignment"
    // InternalML2.g:3464:1: ruleSimpleAttributeAssignment returns [EObject current=null] : (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment ) ;
    public final EObject ruleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSimpleAttributeAssignment_0 = null;

        EObject this_MultipleSimpleAttributeAssignment_1 = null;



        	enterRule();

        try {
            // InternalML2.g:3470:2: ( (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment ) )
            // InternalML2.g:3471:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )
            {
            // InternalML2.g:3471:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalML2.g:3472:3: this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getSingleSimpleAttributeAssignmentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SingleSimpleAttributeAssignment_0=ruleSingleSimpleAttributeAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SingleSimpleAttributeAssignment_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:3481:3: this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getMultipleSimpleAttributeAssignmentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MultipleSimpleAttributeAssignment_1=ruleMultipleSimpleAttributeAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MultipleSimpleAttributeAssignment_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAttributeAssignment"


    // $ANTLR start "entryRuleSingleSimpleAttributeAssignment"
    // InternalML2.g:3493:1: entryRuleSingleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSingleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3493:72: (iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF )
            // InternalML2.g:3494:2: iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleSimpleAttributeAssignment=ruleSingleSimpleAttributeAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSimpleAttributeAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleSimpleAttributeAssignment"


    // $ANTLR start "ruleSingleSimpleAttributeAssignment"
    // InternalML2.g:3500:1: ruleSingleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_stringValues_2_0= RULE_STRING ) ) | ( (lv_numberValues_3_0= ruleNUMBER ) ) | ( (lv_booleanValues_4_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) ) ) ) ;
    public final EObject ruleSingleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_stringValues_2_0=null;
        AntlrDatatypeRuleToken lv_numberValues_3_0 = null;

        AntlrDatatypeRuleToken lv_booleanValues_4_0 = null;

        EObject lv_unnamedValues_6_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3506:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_stringValues_2_0= RULE_STRING ) ) | ( (lv_numberValues_3_0= ruleNUMBER ) ) | ( (lv_booleanValues_4_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) ) ) ) )
            // InternalML2.g:3507:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_stringValues_2_0= RULE_STRING ) ) | ( (lv_numberValues_3_0= ruleNUMBER ) ) | ( (lv_booleanValues_4_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) ) ) )
            {
            // InternalML2.g:3507:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_stringValues_2_0= RULE_STRING ) ) | ( (lv_numberValues_3_0= ruleNUMBER ) ) | ( (lv_booleanValues_4_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) ) ) )
            // InternalML2.g:3508:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_stringValues_2_0= RULE_STRING ) ) | ( (lv_numberValues_3_0= ruleNUMBER ) ) | ( (lv_booleanValues_4_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) ) )
            {
            // InternalML2.g:3508:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3509:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3509:4: ( ruleQualifiedName )
            // InternalML2.g:3510:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSingleSimpleAttributeAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSingleSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalML2.g:3528:3: ( ( (lv_stringValues_2_0= RULE_STRING ) ) | ( (lv_numberValues_3_0= ruleNUMBER ) ) | ( (lv_booleanValues_4_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) ) )
            int alt84=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt84=1;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt84=2;
                }
                break;
            case 45:
            case 46:
                {
                alt84=3;
                }
                break;
            case RULE_ID:
                {
                alt84=4;
                }
                break;
            case 36:
                {
                alt84=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalML2.g:3529:4: ( (lv_stringValues_2_0= RULE_STRING ) )
                    {
                    // InternalML2.g:3529:4: ( (lv_stringValues_2_0= RULE_STRING ) )
                    // InternalML2.g:3530:5: (lv_stringValues_2_0= RULE_STRING )
                    {
                    // InternalML2.g:3530:5: (lv_stringValues_2_0= RULE_STRING )
                    // InternalML2.g:3531:6: lv_stringValues_2_0= RULE_STRING
                    {
                    lv_stringValues_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_stringValues_2_0, grammarAccess.getSingleSimpleAttributeAssignmentAccess().getStringValuesSTRINGTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"stringValues",
                      							lv_stringValues_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3548:4: ( (lv_numberValues_3_0= ruleNUMBER ) )
                    {
                    // InternalML2.g:3548:4: ( (lv_numberValues_3_0= ruleNUMBER ) )
                    // InternalML2.g:3549:5: (lv_numberValues_3_0= ruleNUMBER )
                    {
                    // InternalML2.g:3549:5: (lv_numberValues_3_0= ruleNUMBER )
                    // InternalML2.g:3550:6: lv_numberValues_3_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getNumberValuesNUMBERParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_numberValues_3_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"numberValues",
                      							lv_numberValues_3_0,
                      							"br.ufes.inf.nemo.ml2.ML2.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3568:4: ( (lv_booleanValues_4_0= ruleBOOLEAN ) )
                    {
                    // InternalML2.g:3568:4: ( (lv_booleanValues_4_0= ruleBOOLEAN ) )
                    // InternalML2.g:3569:5: (lv_booleanValues_4_0= ruleBOOLEAN )
                    {
                    // InternalML2.g:3569:5: (lv_booleanValues_4_0= ruleBOOLEAN )
                    // InternalML2.g:3570:6: lv_booleanValues_4_0= ruleBOOLEAN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getBooleanValuesBOOLEANParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_booleanValues_4_0=ruleBOOLEAN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"booleanValues",
                      							lv_booleanValues_4_0,
                      							"br.ufes.inf.nemo.ml2.ML2.BOOLEAN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3588:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:3588:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3589:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3589:5: ( ruleQualifiedName )
                    // InternalML2.g:3590:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:3605:4: ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3605:4: ( (lv_unnamedValues_6_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3606:5: (lv_unnamedValues_6_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3606:5: (lv_unnamedValues_6_0= ruleUnnamedIndividual )
                    // InternalML2.g:3607:6: lv_unnamedValues_6_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_unnamedValues_6_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"unnamedValues",
                      							lv_unnamedValues_6_0,
                      							"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleSimpleAttributeAssignment"


    // $ANTLR start "entryRuleMultipleSimpleAttributeAssignment"
    // InternalML2.g:3629:1: entryRuleMultipleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleMultipleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3629:74: (iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF )
            // InternalML2.g:3630:2: iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultipleSimpleAttributeAssignment=ruleMultipleSimpleAttributeAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultipleSimpleAttributeAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleSimpleAttributeAssignment"


    // $ANTLR start "ruleMultipleSimpleAttributeAssignment"
    // InternalML2.g:3636:1: ruleMultipleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_18= '}' ) ;
    public final EObject ruleMultipleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_stringValues_3_0=null;
        Token otherlv_8=null;
        Token lv_stringValues_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_numberValues_4_0 = null;

        AntlrDatatypeRuleToken lv_booleanValues_5_0 = null;

        EObject lv_unnamedValues_7_0 = null;

        AntlrDatatypeRuleToken lv_numberValues_11_0 = null;

        AntlrDatatypeRuleToken lv_booleanValues_13_0 = null;

        EObject lv_unnamedValues_17_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3642:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_18= '}' ) )
            // InternalML2.g:3643:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_18= '}' )
            {
            // InternalML2.g:3643:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_18= '}' )
            // InternalML2.g:3644:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )* ) otherlv_18= '}'
            {
            // InternalML2.g:3644:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3645:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3645:4: ( ruleQualifiedName )
            // InternalML2.g:3646:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalML2.g:3668:3: ( ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )* )
            // InternalML2.g:3669:4: ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) ) ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )*
            {
            // InternalML2.g:3669:4: ( ( (lv_stringValues_3_0= RULE_STRING ) ) | ( (lv_numberValues_4_0= ruleNUMBER ) ) | ( (lv_booleanValues_5_0= ruleBOOLEAN ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) ) )
            int alt85=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt85=1;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt85=2;
                }
                break;
            case 45:
            case 46:
                {
                alt85=3;
                }
                break;
            case RULE_ID:
                {
                alt85=4;
                }
                break;
            case 36:
                {
                alt85=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalML2.g:3670:5: ( (lv_stringValues_3_0= RULE_STRING ) )
                    {
                    // InternalML2.g:3670:5: ( (lv_stringValues_3_0= RULE_STRING ) )
                    // InternalML2.g:3671:6: (lv_stringValues_3_0= RULE_STRING )
                    {
                    // InternalML2.g:3671:6: (lv_stringValues_3_0= RULE_STRING )
                    // InternalML2.g:3672:7: lv_stringValues_3_0= RULE_STRING
                    {
                    lv_stringValues_3_0=(Token)match(input,RULE_STRING,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_stringValues_3_0, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getStringValuesSTRINGTerminalRuleCall_3_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      							addWithLastConsumed(
                      								current,
                      								"stringValues",
                      								lv_stringValues_3_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3689:5: ( (lv_numberValues_4_0= ruleNUMBER ) )
                    {
                    // InternalML2.g:3689:5: ( (lv_numberValues_4_0= ruleNUMBER ) )
                    // InternalML2.g:3690:6: (lv_numberValues_4_0= ruleNUMBER )
                    {
                    // InternalML2.g:3690:6: (lv_numberValues_4_0= ruleNUMBER )
                    // InternalML2.g:3691:7: lv_numberValues_4_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getNumberValuesNUMBERParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_numberValues_4_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"numberValues",
                      								lv_numberValues_4_0,
                      								"br.ufes.inf.nemo.ml2.ML2.NUMBER");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3709:5: ( (lv_booleanValues_5_0= ruleBOOLEAN ) )
                    {
                    // InternalML2.g:3709:5: ( (lv_booleanValues_5_0= ruleBOOLEAN ) )
                    // InternalML2.g:3710:6: (lv_booleanValues_5_0= ruleBOOLEAN )
                    {
                    // InternalML2.g:3710:6: (lv_booleanValues_5_0= ruleBOOLEAN )
                    // InternalML2.g:3711:7: lv_booleanValues_5_0= ruleBOOLEAN
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getBooleanValuesBOOLEANParserRuleCall_3_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_booleanValues_5_0=ruleBOOLEAN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"booleanValues",
                      								lv_booleanValues_5_0,
                      								"br.ufes.inf.nemo.ml2.ML2.BOOLEAN");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3729:5: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:3729:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3730:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3730:6: ( ruleQualifiedName )
                    // InternalML2.g:3731:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:3746:5: ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3746:5: ( (lv_unnamedValues_7_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3747:6: (lv_unnamedValues_7_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3747:6: (lv_unnamedValues_7_0= ruleUnnamedIndividual )
                    // InternalML2.g:3748:7: lv_unnamedValues_7_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_0_4_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_unnamedValues_7_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"unnamedValues",
                      								lv_unnamedValues_7_0,
                      								"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:3766:4: ( (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) ) | (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) ) | (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) ) | (otherlv_14= ',' ( ( ruleQualifiedName ) ) ) | (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) ) )*
            loop86:
            do {
                int alt86=6;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==21) ) {
                    switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt86=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt86=4;
                        }
                        break;
                    case 45:
                    case 46:
                        {
                        alt86=3;
                        }
                        break;
                    case 36:
                        {
                        alt86=5;
                        }
                        break;
                    case RULE_INT:
                    case 47:
                        {
                        alt86=2;
                        }
                        break;

                    }

                }


                switch (alt86) {
            	case 1 :
            	    // InternalML2.g:3767:5: (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalML2.g:3767:5: (otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) ) )
            	    // InternalML2.g:3768:6: otherlv_8= ',' ( (lv_stringValues_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_8, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_1_0_0());
            	      					
            	    }
            	    // InternalML2.g:3772:6: ( (lv_stringValues_9_0= RULE_STRING ) )
            	    // InternalML2.g:3773:7: (lv_stringValues_9_0= RULE_STRING )
            	    {
            	    // InternalML2.g:3773:7: (lv_stringValues_9_0= RULE_STRING )
            	    // InternalML2.g:3774:8: lv_stringValues_9_0= RULE_STRING
            	    {
            	    lv_stringValues_9_0=(Token)match(input,RULE_STRING,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_stringValues_9_0, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getStringValuesSTRINGTerminalRuleCall_3_1_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
            	      								}
            	      								addWithLastConsumed(
            	      									current,
            	      									"stringValues",
            	      									lv_stringValues_9_0,
            	      									"org.eclipse.xtext.common.Terminals.STRING");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalML2.g:3792:5: (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) )
            	    {
            	    // InternalML2.g:3792:5: (otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) ) )
            	    // InternalML2.g:3793:6: otherlv_10= ',' ( (lv_numberValues_11_0= ruleNUMBER ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_10, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_1_1_0());
            	      					
            	    }
            	    // InternalML2.g:3797:6: ( (lv_numberValues_11_0= ruleNUMBER ) )
            	    // InternalML2.g:3798:7: (lv_numberValues_11_0= ruleNUMBER )
            	    {
            	    // InternalML2.g:3798:7: (lv_numberValues_11_0= ruleNUMBER )
            	    // InternalML2.g:3799:8: lv_numberValues_11_0= ruleNUMBER
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getNumberValuesNUMBERParserRuleCall_3_1_1_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_numberValues_11_0=ruleNUMBER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
            	      								}
            	      								add(
            	      									current,
            	      									"numberValues",
            	      									lv_numberValues_11_0,
            	      									"br.ufes.inf.nemo.ml2.ML2.NUMBER");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalML2.g:3818:5: (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) )
            	    {
            	    // InternalML2.g:3818:5: (otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) ) )
            	    // InternalML2.g:3819:6: otherlv_12= ',' ( (lv_booleanValues_13_0= ruleBOOLEAN ) )
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_12, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_1_2_0());
            	      					
            	    }
            	    // InternalML2.g:3823:6: ( (lv_booleanValues_13_0= ruleBOOLEAN ) )
            	    // InternalML2.g:3824:7: (lv_booleanValues_13_0= ruleBOOLEAN )
            	    {
            	    // InternalML2.g:3824:7: (lv_booleanValues_13_0= ruleBOOLEAN )
            	    // InternalML2.g:3825:8: lv_booleanValues_13_0= ruleBOOLEAN
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getBooleanValuesBOOLEANParserRuleCall_3_1_2_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_booleanValues_13_0=ruleBOOLEAN();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
            	      								}
            	      								add(
            	      									current,
            	      									"booleanValues",
            	      									lv_booleanValues_13_0,
            	      									"br.ufes.inf.nemo.ml2.ML2.BOOLEAN");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalML2.g:3844:5: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )
            	    {
            	    // InternalML2.g:3844:5: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )
            	    // InternalML2.g:3845:6: otherlv_14= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_14=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_14, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_1_3_0());
            	      					
            	    }
            	    // InternalML2.g:3849:6: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:3850:7: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:3850:7: ( ruleQualifiedName )
            	    // InternalML2.g:3851:8: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_1_3_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalML2.g:3867:5: (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) )
            	    {
            	    // InternalML2.g:3867:5: (otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) ) )
            	    // InternalML2.g:3868:6: otherlv_16= ',' ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) )
            	    {
            	    otherlv_16=(Token)match(input,21,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_16, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_1_4_0());
            	      					
            	    }
            	    // InternalML2.g:3872:6: ( (lv_unnamedValues_17_0= ruleUnnamedIndividual ) )
            	    // InternalML2.g:3873:7: (lv_unnamedValues_17_0= ruleUnnamedIndividual )
            	    {
            	    // InternalML2.g:3873:7: (lv_unnamedValues_17_0= ruleUnnamedIndividual )
            	    // InternalML2.g:3874:8: lv_unnamedValues_17_0= ruleUnnamedIndividual
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_1_4_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_unnamedValues_17_0=ruleUnnamedIndividual();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
            	      								}
            	      								add(
            	      									current,
            	      									"unnamedValues",
            	      									lv_unnamedValues_17_0,
            	      									"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleSimpleAttributeAssignment"


    // $ANTLR start "entryRuleConstraintDeclaration"
    // InternalML2.g:3902:1: entryRuleConstraintDeclaration returns [EObject current=null] : iv_ruleConstraintDeclaration= ruleConstraintDeclaration EOF ;
    public final EObject entryRuleConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintDeclaration = null;


        try {
            // InternalML2.g:3902:62: (iv_ruleConstraintDeclaration= ruleConstraintDeclaration EOF )
            // InternalML2.g:3903:2: iv_ruleConstraintDeclaration= ruleConstraintDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraintDeclaration=ruleConstraintDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintDeclaration"


    // $ANTLR start "ruleConstraintDeclaration"
    // InternalML2.g:3909:1: ruleConstraintDeclaration returns [EObject current=null] : (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint ) ;
    public final EObject ruleConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantConstraint_0 = null;

        EObject this_DerivationConstraint_1 = null;



        	enterRule();

        try {
            // InternalML2.g:3915:2: ( (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint ) )
            // InternalML2.g:3916:2: (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint )
            {
            // InternalML2.g:3916:2: (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==48) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==RULE_ID) ) {
                    int LA87_2 = input.LA(3);

                    if ( (LA87_2==49) ) {
                        alt87=1;
                    }
                    else if ( (LA87_2==50) ) {
                        alt87=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalML2.g:3917:3: this_InvariantConstraint_0= ruleInvariantConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstraintDeclarationAccess().getInvariantConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvariantConstraint_0=ruleInvariantConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvariantConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:3926:3: this_DerivationConstraint_1= ruleDerivationConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstraintDeclarationAccess().getDerivationConstraintParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DerivationConstraint_1=ruleDerivationConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DerivationConstraint_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintDeclaration"


    // $ANTLR start "entryRuleInvariantConstraint"
    // InternalML2.g:3938:1: entryRuleInvariantConstraint returns [EObject current=null] : iv_ruleInvariantConstraint= ruleInvariantConstraint EOF ;
    public final EObject entryRuleInvariantConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantConstraint = null;


        try {
            // InternalML2.g:3938:60: (iv_ruleInvariantConstraint= ruleInvariantConstraint EOF )
            // InternalML2.g:3939:2: iv_ruleInvariantConstraint= ruleInvariantConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvariantConstraint=ruleInvariantConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariantConstraint"


    // $ANTLR start "ruleInvariantConstraint"
    // InternalML2.g:3945:1: ruleInvariantConstraint returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_invariantAlias_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_expression_5_0= ruleOclExpression ) ) ) ;
    public final EObject ruleInvariantConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_invariantAlias_3_0=null;
        Token otherlv_4=null;
        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3951:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_invariantAlias_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_expression_5_0= ruleOclExpression ) ) ) )
            // InternalML2.g:3952:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_invariantAlias_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_expression_5_0= ruleOclExpression ) ) )
            {
            // InternalML2.g:3952:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_invariantAlias_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_expression_5_0= ruleOclExpression ) ) )
            // InternalML2.g:3953:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_invariantAlias_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_expression_5_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantConstraintAccess().getContextKeyword_0());
              		
            }
            // InternalML2.g:3957:3: ( (otherlv_1= RULE_ID ) )
            // InternalML2.g:3958:4: (otherlv_1= RULE_ID )
            {
            // InternalML2.g:3958:4: (otherlv_1= RULE_ID )
            // InternalML2.g:3959:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvariantConstraintRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getInvariantConstraintAccess().getClassContextClassCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInvariantConstraintAccess().getInvKeyword_2());
              		
            }
            // InternalML2.g:3974:3: ( (lv_invariantAlias_3_0= RULE_ID ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalML2.g:3975:4: (lv_invariantAlias_3_0= RULE_ID )
                    {
                    // InternalML2.g:3975:4: (lv_invariantAlias_3_0= RULE_ID )
                    // InternalML2.g:3976:5: lv_invariantAlias_3_0= RULE_ID
                    {
                    lv_invariantAlias_3_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_invariantAlias_3_0, grammarAccess.getInvariantConstraintAccess().getInvariantAliasIDTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInvariantConstraintRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"invariantAlias",
                      						lv_invariantAlias_3_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInvariantConstraintAccess().getColonKeyword_4());
              		
            }
            // InternalML2.g:3996:3: ( (lv_expression_5_0= ruleOclExpression ) )
            // InternalML2.g:3997:4: (lv_expression_5_0= ruleOclExpression )
            {
            // InternalML2.g:3997:4: (lv_expression_5_0= ruleOclExpression )
            // InternalML2.g:3998:5: lv_expression_5_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvariantConstraintAccess().getExpressionOclExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvariantConstraintRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_5_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariantConstraint"


    // $ANTLR start "entryRuleDerivationConstraint"
    // InternalML2.g:4019:1: entryRuleDerivationConstraint returns [EObject current=null] : iv_ruleDerivationConstraint= ruleDerivationConstraint EOF ;
    public final EObject entryRuleDerivationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivationConstraint = null;


        try {
            // InternalML2.g:4019:61: (iv_ruleDerivationConstraint= ruleDerivationConstraint EOF )
            // InternalML2.g:4020:2: iv_ruleDerivationConstraint= ruleDerivationConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDerivationConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDerivationConstraint=ruleDerivationConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDerivationConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDerivationConstraint"


    // $ANTLR start "ruleDerivationConstraint"
    // InternalML2.g:4026:1: ruleDerivationConstraint returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_featureContext_3_0= RULE_ID ) ) )+ otherlv_4= ':' ( (lv_contextType_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) ) ;
    public final EObject ruleDerivationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_featureContext_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_contextType_5_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4032:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_featureContext_3_0= RULE_ID ) ) )+ otherlv_4= ':' ( (lv_contextType_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) ) )
            // InternalML2.g:4033:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_featureContext_3_0= RULE_ID ) ) )+ otherlv_4= ':' ( (lv_contextType_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) )
            {
            // InternalML2.g:4033:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_featureContext_3_0= RULE_ID ) ) )+ otherlv_4= ':' ( (lv_contextType_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) )
            // InternalML2.g:4034:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '::' ( (lv_featureContext_3_0= RULE_ID ) ) )+ otherlv_4= ':' ( (lv_contextType_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDerivationConstraintAccess().getContextKeyword_0());
              		
            }
            // InternalML2.g:4038:3: ( (otherlv_1= RULE_ID ) )
            // InternalML2.g:4039:4: (otherlv_1= RULE_ID )
            {
            // InternalML2.g:4039:4: (otherlv_1= RULE_ID )
            // InternalML2.g:4040:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDerivationConstraintRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDerivationConstraintAccess().getClassContextClassCrossReference_1_0());
              				
            }

            }


            }

            // InternalML2.g:4051:3: (otherlv_2= '::' ( (lv_featureContext_3_0= RULE_ID ) ) )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==50) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalML2.g:4052:4: otherlv_2= '::' ( (lv_featureContext_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDerivationConstraintAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    // InternalML2.g:4056:4: ( (lv_featureContext_3_0= RULE_ID ) )
            	    // InternalML2.g:4057:5: (lv_featureContext_3_0= RULE_ID )
            	    {
            	    // InternalML2.g:4057:5: (lv_featureContext_3_0= RULE_ID )
            	    // InternalML2.g:4058:6: lv_featureContext_3_0= RULE_ID
            	    {
            	    lv_featureContext_3_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_featureContext_3_0, grammarAccess.getDerivationConstraintAccess().getFeatureContextIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDerivationConstraintRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"featureContext",
            	      							lv_featureContext_3_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDerivationConstraintAccess().getColonKeyword_3());
              		
            }
            // InternalML2.g:4079:3: ( (lv_contextType_5_0= ruleTypeLiteralExpression ) )
            // InternalML2.g:4080:4: (lv_contextType_5_0= ruleTypeLiteralExpression )
            {
            // InternalML2.g:4080:4: (lv_contextType_5_0= ruleTypeLiteralExpression )
            // InternalML2.g:4081:5: lv_contextType_5_0= ruleTypeLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDerivationConstraintAccess().getContextTypeTypeLiteralExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_57);
            lv_contextType_5_0=ruleTypeLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDerivationConstraintRule());
              					}
              					set(
              						current,
              						"contextType",
              						lv_contextType_5_0,
              						"br.ufes.inf.nemo.ml2.ML2.TypeLiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDerivationConstraintAccess().getDeriveKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,20,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDerivationConstraintAccess().getColonKeyword_6());
              		
            }
            // InternalML2.g:4106:3: ( (lv_expression_8_0= ruleOclExpression ) )
            // InternalML2.g:4107:4: (lv_expression_8_0= ruleOclExpression )
            {
            // InternalML2.g:4107:4: (lv_expression_8_0= ruleOclExpression )
            // InternalML2.g:4108:5: lv_expression_8_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDerivationConstraintAccess().getExpressionOclExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_8_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDerivationConstraintRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_8_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDerivationConstraint"


    // $ANTLR start "entryRuleOclExpression"
    // InternalML2.g:4129:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // InternalML2.g:4129:54: (iv_ruleOclExpression= ruleOclExpression EOF )
            // InternalML2.g:4130:2: iv_ruleOclExpression= ruleOclExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOclExpression=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclExpression"


    // $ANTLR start "ruleOclExpression"
    // InternalML2.g:4136:1: ruleOclExpression returns [EObject current=null] : (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LetExpression_0 = null;

        EObject this_IfExpression_1 = null;

        EObject this_ImpliesExpression_2 = null;



        	enterRule();

        try {
            // InternalML2.g:4142:2: ( (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression ) )
            // InternalML2.g:4143:2: (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression )
            {
            // InternalML2.g:4143:2: (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt90=1;
                }
                break;
            case 54:
                {
                alt90=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
            case 62:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 90:
            case 91:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalML2.g:4144:3: this_LetExpression_0= ruleLetExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOclExpressionAccess().getLetExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LetExpression_0=ruleLetExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:4153:3: this_IfExpression_1= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOclExpressionAccess().getIfExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpression_1=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:4162:3: this_ImpliesExpression_2= ruleImpliesExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOclExpressionAccess().getImpliesExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ImpliesExpression_2=ruleImpliesExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ImpliesExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclExpression"


    // $ANTLR start "entryRuleLetExpression"
    // InternalML2.g:4174:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // InternalML2.g:4174:54: (iv_ruleLetExpression= ruleLetExpression EOF )
            // InternalML2.g:4175:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // InternalML2.g:4181:1: ruleLetExpression returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) ) ;
    public final EObject ruleLetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_inExpression_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4187:2: ( (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) ) )
            // InternalML2.g:4188:2: (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) )
            {
            // InternalML2.g:4188:2: (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) )
            // InternalML2.g:4189:3: otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpressionAccess().getLetKeyword_0());
              		
            }
            // InternalML2.g:4193:3: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // InternalML2.g:4194:4: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // InternalML2.g:4194:4: (lv_variables_1_0= ruleVariableDeclaration )
            // InternalML2.g:4195:5: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpressionAccess().getVariablesVariableDeclarationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_variables_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              					}
              					add(
              						current,
              						"variables",
              						lv_variables_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.VariableDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4212:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==21) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalML2.g:4213:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalML2.g:4217:4: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // InternalML2.g:4218:5: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // InternalML2.g:4218:5: (lv_variables_3_0= ruleVariableDeclaration )
            	    // InternalML2.g:4219:6: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpressionAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_variables_3_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variables",
            	      							lv_variables_3_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.VariableDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_4=(Token)match(input,53,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getInKeyword_3());
              		
            }
            // InternalML2.g:4241:3: ( (lv_inExpression_5_0= ruleOclExpression ) )
            // InternalML2.g:4242:4: (lv_inExpression_5_0= ruleOclExpression )
            {
            // InternalML2.g:4242:4: (lv_inExpression_5_0= ruleOclExpression )
            // InternalML2.g:4243:5: lv_inExpression_5_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpressionAccess().getInExpressionOclExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_inExpression_5_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              					}
              					set(
              						current,
              						"inExpression",
              						lv_inExpression_5_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalML2.g:4264:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalML2.g:4264:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalML2.g:4265:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalML2.g:4271:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleImpliesExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variableType_2_0 = null;

        EObject lv_initialValue_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4277:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleImpliesExpression ) ) ) )
            // InternalML2.g:4278:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleImpliesExpression ) ) )
            {
            // InternalML2.g:4278:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleImpliesExpression ) ) )
            // InternalML2.g:4279:3: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleImpliesExpression ) )
            {
            // InternalML2.g:4279:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalML2.g:4280:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalML2.g:4280:4: (lv_variableName_0_0= RULE_ID )
            // InternalML2.g:4281:5: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variableName_0_0, grammarAccess.getVariableDeclarationAccess().getVariableNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"variableName",
              						lv_variableName_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalML2.g:4301:3: ( (lv_variableType_2_0= ruleTypeLiteralExpression ) )
            // InternalML2.g:4302:4: (lv_variableType_2_0= ruleTypeLiteralExpression )
            {
            // InternalML2.g:4302:4: (lv_variableType_2_0= ruleTypeLiteralExpression )
            // InternalML2.g:4303:5: lv_variableType_2_0= ruleTypeLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableTypeTypeLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_variableType_2_0=ruleTypeLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"variableType",
              						lv_variableType_2_0,
              						"br.ufes.inf.nemo.ml2.ML2.TypeLiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalML2.g:4324:3: ( (lv_initialValue_4_0= ruleImpliesExpression ) )
            // InternalML2.g:4325:4: (lv_initialValue_4_0= ruleImpliesExpression )
            {
            // InternalML2.g:4325:4: (lv_initialValue_4_0= ruleImpliesExpression )
            // InternalML2.g:4326:5: lv_initialValue_4_0= ruleImpliesExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInitialValueImpliesExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialValue_4_0=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"initialValue",
              						lv_initialValue_4_0,
              						"br.ufes.inf.nemo.ml2.ML2.ImpliesExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIfExpression"
    // InternalML2.g:4347:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalML2.g:4347:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalML2.g:4348:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalML2.g:4354:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4360:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) )
            // InternalML2.g:4361:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            {
            // InternalML2.g:4361:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            // InternalML2.g:4362:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
              		
            }
            // InternalML2.g:4366:3: ( (lv_condition_1_0= ruleOclExpression ) )
            // InternalML2.g:4367:4: (lv_condition_1_0= ruleOclExpression )
            {
            // InternalML2.g:4367:4: (lv_condition_1_0= ruleOclExpression )
            // InternalML2.g:4368:5: lv_condition_1_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionOclExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_condition_1_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
              		
            }
            // InternalML2.g:4389:3: ( (lv_thenExpression_3_0= ruleOclExpression ) )
            // InternalML2.g:4390:4: (lv_thenExpression_3_0= ruleOclExpression )
            {
            // InternalML2.g:4390:4: (lv_thenExpression_3_0= ruleOclExpression )
            // InternalML2.g:4391:5: lv_thenExpression_3_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionOclExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_60);
            lv_thenExpression_3_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"thenExpression",
              						lv_thenExpression_3_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getElseKeyword_4());
              		
            }
            // InternalML2.g:4412:3: ( (lv_elseExpression_5_0= ruleOclExpression ) )
            // InternalML2.g:4413:4: (lv_elseExpression_5_0= ruleOclExpression )
            {
            // InternalML2.g:4413:4: (lv_elseExpression_5_0= ruleOclExpression )
            // InternalML2.g:4414:5: lv_elseExpression_5_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionOclExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_elseExpression_5_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"elseExpression",
              						lv_elseExpression_5_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getEndifKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalML2.g:4439:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalML2.g:4439:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalML2.g:4440:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalML2.g:4446:1: ruleImpliesExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4452:2: ( ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* ) )
            // InternalML2.g:4453:2: ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* )
            {
            // InternalML2.g:4453:2: ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* )
            // InternalML2.g:4454:3: ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )*
            {
            // InternalML2.g:4454:3: ( (lv_left_0_0= ruleXorExpression ) )
            // InternalML2.g:4455:4: (lv_left_0_0= ruleXorExpression )
            {
            // InternalML2.g:4455:4: (lv_left_0_0= ruleXorExpression )
            // InternalML2.g:4456:5: lv_left_0_0= ruleXorExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImpliesExpressionAccess().getLeftXorExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_62);
            lv_left_0_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.XorExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4473:3: (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==58) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalML2.g:4474:4: otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,58,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4478:4: ( (lv_right_2_0= ruleXorExpression ) )
            	    // InternalML2.g:4479:5: (lv_right_2_0= ruleXorExpression )
            	    {
            	    // InternalML2.g:4479:5: (lv_right_2_0= ruleXorExpression )
            	    // InternalML2.g:4480:6: lv_right_2_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
            	    lv_right_2_0=ruleXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"right",
            	      							lv_right_2_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.XorExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalML2.g:4502:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalML2.g:4502:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalML2.g:4503:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalML2.g:4509:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4515:2: ( ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* ) )
            // InternalML2.g:4516:2: ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* )
            {
            // InternalML2.g:4516:2: ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* )
            // InternalML2.g:4517:3: ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )*
            {
            // InternalML2.g:4517:3: ( (lv_left_0_0= ruleOrExpression ) )
            // InternalML2.g:4518:4: (lv_left_0_0= ruleOrExpression )
            {
            // InternalML2.g:4518:4: (lv_left_0_0= ruleOrExpression )
            // InternalML2.g:4519:5: lv_left_0_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXorExpressionAccess().getLeftOrExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_63);
            lv_left_0_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXorExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.OrExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4536:3: (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==59) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalML2.g:4537:4: otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,59,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getXorExpressionAccess().getXorKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4541:4: ( (lv_right_2_0= ruleOrExpression ) )
            	    // InternalML2.g:4542:5: (lv_right_2_0= ruleOrExpression )
            	    {
            	    // InternalML2.g:4542:5: (lv_right_2_0= ruleOrExpression )
            	    // InternalML2.g:4543:6: lv_right_2_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightOrExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_right_2_0=ruleOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"right",
            	      							lv_right_2_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.OrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalML2.g:4565:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalML2.g:4565:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalML2.g:4566:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalML2.g:4572:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4578:2: ( ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* ) )
            // InternalML2.g:4579:2: ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* )
            {
            // InternalML2.g:4579:2: ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* )
            // InternalML2.g:4580:3: ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )*
            {
            // InternalML2.g:4580:3: ( (lv_left_0_0= ruleAndExpression ) )
            // InternalML2.g:4581:4: (lv_left_0_0= ruleAndExpression )
            {
            // InternalML2.g:4581:4: (lv_left_0_0= ruleAndExpression )
            // InternalML2.g:4582:5: lv_left_0_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftAndExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_64);
            lv_left_0_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.AndExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4599:3: (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==60) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalML2.g:4600:4: otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4604:4: ( (lv_right_2_0= ruleAndExpression ) )
            	    // InternalML2.g:4605:5: (lv_right_2_0= ruleAndExpression )
            	    {
            	    // InternalML2.g:4605:5: (lv_right_2_0= ruleAndExpression )
            	    // InternalML2.g:4606:6: lv_right_2_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_right_2_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"right",
            	      							lv_right_2_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalML2.g:4628:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalML2.g:4628:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalML2.g:4629:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalML2.g:4635:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4641:2: ( ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* ) )
            // InternalML2.g:4642:2: ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* )
            {
            // InternalML2.g:4642:2: ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* )
            // InternalML2.g:4643:3: ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )*
            {
            // InternalML2.g:4643:3: ( (lv_left_0_0= ruleComparisonExpression ) )
            // InternalML2.g:4644:4: (lv_left_0_0= ruleComparisonExpression )
            {
            // InternalML2.g:4644:4: (lv_left_0_0= ruleComparisonExpression )
            // InternalML2.g:4645:5: lv_left_0_0= ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftComparisonExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_left_0_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.ComparisonExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4662:3: (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==61) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalML2.g:4663:4: otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,61,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4667:4: ( (lv_right_2_0= ruleComparisonExpression ) )
            	    // InternalML2.g:4668:5: (lv_right_2_0= ruleComparisonExpression )
            	    {
            	    // InternalML2.g:4668:5: (lv_right_2_0= ruleComparisonExpression )
            	    // InternalML2.g:4669:6: lv_right_2_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_right_2_0=ruleComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"right",
            	      							lv_right_2_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.ComparisonExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalML2.g:4691:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalML2.g:4691:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalML2.g:4692:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalML2.g:4698:1: ruleComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4704:2: ( ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* ) )
            // InternalML2.g:4705:2: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* )
            {
            // InternalML2.g:4705:2: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* )
            // InternalML2.g:4706:3: ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )*
            {
            // InternalML2.g:4706:3: ( (lv_left_0_0= ruleRelationalExpression ) )
            // InternalML2.g:4707:4: (lv_left_0_0= ruleRelationalExpression )
            {
            // InternalML2.g:4707:4: (lv_left_0_0= ruleRelationalExpression )
            // InternalML2.g:4708:5: lv_left_0_0= ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getLeftRelationalExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_66);
            lv_left_0_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.RelationalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4725:3: ( (lv_right_1_0= ruleComparisonOperation ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==44||LA96_0==83) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalML2.g:4726:4: (lv_right_1_0= ruleComparisonOperation )
            	    {
            	    // InternalML2.g:4726:4: (lv_right_1_0= ruleComparisonOperation )
            	    // InternalML2.g:4727:5: lv_right_1_0= ruleComparisonOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightComparisonOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_66);
            	    lv_right_1_0=ruleComparisonOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"right",
            	      						lv_right_1_0,
            	      						"br.ufes.inf.nemo.ml2.ML2.ComparisonOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonOperation"
    // InternalML2.g:4748:1: entryRuleComparisonOperation returns [EObject current=null] : iv_ruleComparisonOperation= ruleComparisonOperation EOF ;
    public final EObject entryRuleComparisonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperation = null;


        try {
            // InternalML2.g:4748:60: (iv_ruleComparisonOperation= ruleComparisonOperation EOF )
            // InternalML2.g:4749:2: iv_ruleComparisonOperation= ruleComparisonOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperation=ruleComparisonOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonOperation"


    // $ANTLR start "ruleComparisonOperation"
    // InternalML2.g:4755:1: ruleComparisonOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) ) ;
    public final EObject ruleComparisonOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4761:2: ( ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) ) )
            // InternalML2.g:4762:2: ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) )
            {
            // InternalML2.g:4762:2: ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) )
            // InternalML2.g:4763:3: ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) )
            {
            // InternalML2.g:4763:3: ( (lv_operator_0_0= ruleComparisonOperator ) )
            // InternalML2.g:4764:4: (lv_operator_0_0= ruleComparisonOperator )
            {
            // InternalML2.g:4764:4: (lv_operator_0_0= ruleComparisonOperator )
            // InternalML2.g:4765:5: lv_operator_0_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonOperationAccess().getOperatorComparisonOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_operator_0_0=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.ComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4782:3: ( (lv_right_1_0= ruleRelationalExpression ) )
            // InternalML2.g:4783:4: (lv_right_1_0= ruleRelationalExpression )
            {
            // InternalML2.g:4783:4: (lv_right_1_0= ruleRelationalExpression )
            // InternalML2.g:4784:5: lv_right_1_0= ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonOperationAccess().getRightRelationalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.RelationalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperation"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalML2.g:4805:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalML2.g:4805:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalML2.g:4806:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalML2.g:4812:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4818:2: ( ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* ) )
            // InternalML2.g:4819:2: ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* )
            {
            // InternalML2.g:4819:2: ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* )
            // InternalML2.g:4820:3: ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )*
            {
            // InternalML2.g:4820:3: ( (lv_left_0_0= ruleAdditionExpression ) )
            // InternalML2.g:4821:4: (lv_left_0_0= ruleAdditionExpression )
            {
            // InternalML2.g:4821:4: (lv_left_0_0= ruleAdditionExpression )
            // InternalML2.g:4822:5: lv_left_0_0= ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalExpressionAccess().getLeftAdditionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_67);
            lv_left_0_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.AdditionExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4839:3: ( (lv_right_1_0= ruleRelationalOperation ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=84 && LA97_0<=87)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalML2.g:4840:4: (lv_right_1_0= ruleRelationalOperation )
            	    {
            	    // InternalML2.g:4840:4: (lv_right_1_0= ruleRelationalOperation )
            	    // InternalML2.g:4841:5: lv_right_1_0= ruleRelationalOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightRelationalOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_right_1_0=ruleRelationalOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"right",
            	      						lv_right_1_0,
            	      						"br.ufes.inf.nemo.ml2.ML2.RelationalOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOperation"
    // InternalML2.g:4862:1: entryRuleRelationalOperation returns [EObject current=null] : iv_ruleRelationalOperation= ruleRelationalOperation EOF ;
    public final EObject entryRuleRelationalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOperation = null;


        try {
            // InternalML2.g:4862:60: (iv_ruleRelationalOperation= ruleRelationalOperation EOF )
            // InternalML2.g:4863:2: iv_ruleRelationalOperation= ruleRelationalOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOperation=ruleRelationalOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOperation"


    // $ANTLR start "ruleRelationalOperation"
    // InternalML2.g:4869:1: ruleRelationalOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) ) ;
    public final EObject ruleRelationalOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4875:2: ( ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) ) )
            // InternalML2.g:4876:2: ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) )
            {
            // InternalML2.g:4876:2: ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) )
            // InternalML2.g:4877:3: ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) )
            {
            // InternalML2.g:4877:3: ( (lv_operator_0_0= ruleRelationalOperator ) )
            // InternalML2.g:4878:4: (lv_operator_0_0= ruleRelationalOperator )
            {
            // InternalML2.g:4878:4: (lv_operator_0_0= ruleRelationalOperator )
            // InternalML2.g:4879:5: lv_operator_0_0= ruleRelationalOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalOperationAccess().getOperatorRelationalOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_operator_0_0=ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationalOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.RelationalOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4896:3: ( (lv_right_1_0= ruleAdditionExpression ) )
            // InternalML2.g:4897:4: (lv_right_1_0= ruleAdditionExpression )
            {
            // InternalML2.g:4897:4: (lv_right_1_0= ruleAdditionExpression )
            // InternalML2.g:4898:5: lv_right_1_0= ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalOperationAccess().getRightAdditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationalOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.AdditionExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperation"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalML2.g:4919:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalML2.g:4919:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalML2.g:4920:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalML2.g:4926:1: ruleAdditionExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4932:2: ( ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* ) )
            // InternalML2.g:4933:2: ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* )
            {
            // InternalML2.g:4933:2: ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* )
            // InternalML2.g:4934:3: ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )*
            {
            // InternalML2.g:4934:3: ( (lv_left_0_0= ruleMultiplicationExpression ) )
            // InternalML2.g:4935:4: (lv_left_0_0= ruleMultiplicationExpression )
            {
            // InternalML2.g:4935:4: (lv_left_0_0= ruleMultiplicationExpression )
            // InternalML2.g:4936:5: lv_left_0_0= ruleMultiplicationExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionExpressionAccess().getLeftMultiplicationExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_68);
            lv_left_0_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.MultiplicationExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:4953:3: ( (lv_right_1_0= ruleAdditionOperation ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==47||LA98_0==88) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalML2.g:4954:4: (lv_right_1_0= ruleAdditionOperation )
            	    {
            	    // InternalML2.g:4954:4: (lv_right_1_0= ruleAdditionOperation )
            	    // InternalML2.g:4955:5: lv_right_1_0= ruleAdditionOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightAdditionOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_68);
            	    lv_right_1_0=ruleAdditionOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"right",
            	      						lv_right_1_0,
            	      						"br.ufes.inf.nemo.ml2.ML2.AdditionOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleAdditionOperation"
    // InternalML2.g:4976:1: entryRuleAdditionOperation returns [EObject current=null] : iv_ruleAdditionOperation= ruleAdditionOperation EOF ;
    public final EObject entryRuleAdditionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperation = null;


        try {
            // InternalML2.g:4976:58: (iv_ruleAdditionOperation= ruleAdditionOperation EOF )
            // InternalML2.g:4977:2: iv_ruleAdditionOperation= ruleAdditionOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditionOperation=ruleAdditionOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionOperation"


    // $ANTLR start "ruleAdditionOperation"
    // InternalML2.g:4983:1: ruleAdditionOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) ) ;
    public final EObject ruleAdditionOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4989:2: ( ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) ) )
            // InternalML2.g:4990:2: ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) )
            {
            // InternalML2.g:4990:2: ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) )
            // InternalML2.g:4991:3: ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) )
            {
            // InternalML2.g:4991:3: ( (lv_operator_0_0= ruleAdditionOperator ) )
            // InternalML2.g:4992:4: (lv_operator_0_0= ruleAdditionOperator )
            {
            // InternalML2.g:4992:4: (lv_operator_0_0= ruleAdditionOperator )
            // InternalML2.g:4993:5: lv_operator_0_0= ruleAdditionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionOperationAccess().getOperatorAdditionOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_operator_0_0=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdditionOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.AdditionOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:5010:3: ( (lv_right_1_0= ruleMultiplicationExpression ) )
            // InternalML2.g:5011:4: (lv_right_1_0= ruleMultiplicationExpression )
            {
            // InternalML2.g:5011:4: (lv_right_1_0= ruleMultiplicationExpression )
            // InternalML2.g:5012:5: lv_right_1_0= ruleMultiplicationExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionOperationAccess().getRightMultiplicationExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAdditionOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.MultiplicationExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperation"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalML2.g:5033:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalML2.g:5033:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalML2.g:5034:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalML2.g:5040:1: ruleMultiplicationExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicationOperation ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5046:2: ( ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicationOperation ) )* ) )
            // InternalML2.g:5047:2: ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicationOperation ) )* )
            {
            // InternalML2.g:5047:2: ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicationOperation ) )* )
            // InternalML2.g:5048:3: ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicationOperation ) )*
            {
            // InternalML2.g:5048:3: ( (lv_left_0_0= ruleUnaryExpression ) )
            // InternalML2.g:5049:4: (lv_left_0_0= ruleUnaryExpression )
            {
            // InternalML2.g:5049:4: (lv_left_0_0= ruleUnaryExpression )
            // InternalML2.g:5050:5: lv_left_0_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getLeftUnaryExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_69);
            lv_left_0_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.UnaryExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:5067:3: ( (lv_right_1_0= ruleMultiplicationOperation ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==43||LA99_0==89) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalML2.g:5068:4: (lv_right_1_0= ruleMultiplicationOperation )
            	    {
            	    // InternalML2.g:5068:4: (lv_right_1_0= ruleMultiplicationOperation )
            	    // InternalML2.g:5069:5: lv_right_1_0= ruleMultiplicationOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightMultiplicationOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_69);
            	    lv_right_1_0=ruleMultiplicationOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"right",
            	      						lv_right_1_0,
            	      						"br.ufes.inf.nemo.ml2.ML2.MultiplicationOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleMultiplicationOperation"
    // InternalML2.g:5090:1: entryRuleMultiplicationOperation returns [EObject current=null] : iv_ruleMultiplicationOperation= ruleMultiplicationOperation EOF ;
    public final EObject entryRuleMultiplicationOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperation = null;


        try {
            // InternalML2.g:5090:64: (iv_ruleMultiplicationOperation= ruleMultiplicationOperation EOF )
            // InternalML2.g:5091:2: iv_ruleMultiplicationOperation= ruleMultiplicationOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationOperation=ruleMultiplicationOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationOperation"


    // $ANTLR start "ruleMultiplicationOperation"
    // InternalML2.g:5097:1: ruleMultiplicationOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMultiplicationOperator ) ) ( (lv_right_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleMultiplicationOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5103:2: ( ( ( (lv_operator_0_0= ruleMultiplicationOperator ) ) ( (lv_right_1_0= ruleUnaryExpression ) ) ) )
            // InternalML2.g:5104:2: ( ( (lv_operator_0_0= ruleMultiplicationOperator ) ) ( (lv_right_1_0= ruleUnaryExpression ) ) )
            {
            // InternalML2.g:5104:2: ( ( (lv_operator_0_0= ruleMultiplicationOperator ) ) ( (lv_right_1_0= ruleUnaryExpression ) ) )
            // InternalML2.g:5105:3: ( (lv_operator_0_0= ruleMultiplicationOperator ) ) ( (lv_right_1_0= ruleUnaryExpression ) )
            {
            // InternalML2.g:5105:3: ( (lv_operator_0_0= ruleMultiplicationOperator ) )
            // InternalML2.g:5106:4: (lv_operator_0_0= ruleMultiplicationOperator )
            {
            // InternalML2.g:5106:4: (lv_operator_0_0= ruleMultiplicationOperator )
            // InternalML2.g:5107:5: lv_operator_0_0= ruleMultiplicationOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationOperationAccess().getOperatorMultiplicationOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_operator_0_0=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicationOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.MultiplicationOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:5124:3: ( (lv_right_1_0= ruleUnaryExpression ) )
            // InternalML2.g:5125:4: (lv_right_1_0= ruleUnaryExpression )
            {
            // InternalML2.g:5125:4: (lv_right_1_0= ruleUnaryExpression )
            // InternalML2.g:5126:5: lv_right_1_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationOperationAccess().getRightUnaryExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicationOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.UnaryExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationOperation"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalML2.g:5147:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalML2.g:5147:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalML2.g:5148:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalML2.g:5154:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5160:2: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) ) )
            // InternalML2.g:5161:2: ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) )
            {
            // InternalML2.g:5161:2: ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) )
            // InternalML2.g:5162:3: ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) )
            {
            // InternalML2.g:5162:3: ( (lv_operator_0_0= ruleUnaryOperator ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==47||(LA100_0>=90 && LA100_0<=91)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalML2.g:5163:4: (lv_operator_0_0= ruleUnaryOperator )
                    {
                    // InternalML2.g:5163:4: (lv_operator_0_0= ruleUnaryOperator )
                    // InternalML2.g:5164:5: lv_operator_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_53);
                    lv_operator_0_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      					}
                      					set(
                      						current,
                      						"operator",
                      						lv_operator_0_0,
                      						"br.ufes.inf.nemo.ml2.ML2.UnaryOperator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalML2.g:5181:3: ( (lv_right_1_0= ruleTermExpression ) )
            // InternalML2.g:5182:4: (lv_right_1_0= ruleTermExpression )
            {
            // InternalML2.g:5182:4: (lv_right_1_0= ruleTermExpression )
            // InternalML2.g:5183:5: lv_right_1_0= ruleTermExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightTermExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleTermExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.TermExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleTermExpression"
    // InternalML2.g:5204:1: entryRuleTermExpression returns [EObject current=null] : iv_ruleTermExpression= ruleTermExpression EOF ;
    public final EObject entryRuleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermExpression = null;


        try {
            // InternalML2.g:5204:55: (iv_ruleTermExpression= ruleTermExpression EOF )
            // InternalML2.g:5205:2: iv_ruleTermExpression= ruleTermExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTermExpression=ruleTermExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermExpression"


    // $ANTLR start "ruleTermExpression"
    // InternalML2.g:5211:1: ruleTermExpression returns [EObject current=null] : ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) ) ;
    public final EObject ruleTermExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_CallExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_OclExpression_3 = null;



        	enterRule();

        try {
            // InternalML2.g:5217:2: ( ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) ) )
            // InternalML2.g:5218:2: ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) )
            {
            // InternalML2.g:5218:2: ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) )
            int alt101=3;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // InternalML2.g:5219:3: ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression )
                    {
                    // InternalML2.g:5219:3: ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression )
                    // InternalML2.g:5220:4: ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTermExpressionAccess().getCallExpressionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_CallExpression_0=ruleCallExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CallExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:5231:3: this_LiteralExpression_1= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTermExpressionAccess().getLiteralExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:5240:3: (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' )
                    {
                    // InternalML2.g:5240:3: (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' )
                    // InternalML2.g:5241:4: otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTermExpressionAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTermExpressionAccess().getOclExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_70);
                    this_OclExpression_3=ruleOclExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_OclExpression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTermExpressionAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermExpression"


    // $ANTLR start "entryRuleCallExpression"
    // InternalML2.g:5262:1: entryRuleCallExpression returns [EObject current=null] : iv_ruleCallExpression= ruleCallExpression EOF ;
    public final EObject entryRuleCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpression = null;


        try {
            // InternalML2.g:5262:55: (iv_ruleCallExpression= ruleCallExpression EOF )
            // InternalML2.g:5263:2: iv_ruleCallExpression= ruleCallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallExpression=ruleCallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallExpression"


    // $ANTLR start "ruleCallExpression"
    // InternalML2.g:5269:1: ruleCallExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleNavigationSource ) ) ( (lv_right_1_0= ruleCallOperation ) )* ) ;
    public final EObject ruleCallExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5275:2: ( ( ( (lv_left_0_0= ruleNavigationSource ) ) ( (lv_right_1_0= ruleCallOperation ) )* ) )
            // InternalML2.g:5276:2: ( ( (lv_left_0_0= ruleNavigationSource ) ) ( (lv_right_1_0= ruleCallOperation ) )* )
            {
            // InternalML2.g:5276:2: ( ( (lv_left_0_0= ruleNavigationSource ) ) ( (lv_right_1_0= ruleCallOperation ) )* )
            // InternalML2.g:5277:3: ( (lv_left_0_0= ruleNavigationSource ) ) ( (lv_right_1_0= ruleCallOperation ) )*
            {
            // InternalML2.g:5277:3: ( (lv_left_0_0= ruleNavigationSource ) )
            // InternalML2.g:5278:4: (lv_left_0_0= ruleNavigationSource )
            {
            // InternalML2.g:5278:4: (lv_left_0_0= ruleNavigationSource )
            // InternalML2.g:5279:5: lv_left_0_0= ruleNavigationSource
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCallExpressionAccess().getLeftNavigationSourceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_71);
            lv_left_0_0=ruleNavigationSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCallExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.NavigationSource");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:5296:3: ( (lv_right_1_0= ruleCallOperation ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==16||LA102_0==65) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalML2.g:5297:4: (lv_right_1_0= ruleCallOperation )
            	    {
            	    // InternalML2.g:5297:4: (lv_right_1_0= ruleCallOperation )
            	    // InternalML2.g:5298:5: lv_right_1_0= ruleCallOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallExpressionAccess().getRightCallOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_71);
            	    lv_right_1_0=ruleCallOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCallExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"right",
            	      						lv_right_1_0,
            	      						"br.ufes.inf.nemo.ml2.ML2.CallOperation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallExpression"


    // $ANTLR start "entryRuleNavigationSource"
    // InternalML2.g:5319:1: entryRuleNavigationSource returns [EObject current=null] : iv_ruleNavigationSource= ruleNavigationSource EOF ;
    public final EObject entryRuleNavigationSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationSource = null;


        try {
            // InternalML2.g:5319:57: (iv_ruleNavigationSource= ruleNavigationSource EOF )
            // InternalML2.g:5320:2: iv_ruleNavigationSource= ruleNavigationSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationSourceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigationSource=ruleNavigationSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationSource; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationSource"


    // $ANTLR start "ruleNavigationSource"
    // InternalML2.g:5326:1: ruleNavigationSource returns [EObject current=null] : ( ( ( (lv_source_0_0= ruleTypeLiteralExpression ) ) otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_source_5_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleNavigationSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_source_0_0 = null;

        EObject lv_source_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5332:2: ( ( ( ( (lv_source_0_0= ruleTypeLiteralExpression ) ) otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_source_5_0= ruleVariableExpression ) ) ) )
            // InternalML2.g:5333:2: ( ( ( (lv_source_0_0= ruleTypeLiteralExpression ) ) otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_source_5_0= ruleVariableExpression ) ) )
            {
            // InternalML2.g:5333:2: ( ( ( (lv_source_0_0= ruleTypeLiteralExpression ) ) otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' ) | ( (lv_source_5_0= ruleVariableExpression ) ) )
            int alt103=2;
            switch ( input.LA(1) ) {
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt103=1;
                }
                break;
            case RULE_ID:
                {
                int LA103_2 = input.LA(2);

                if ( (LA103_2==16) ) {
                    int LA103_4 = input.LA(3);

                    if ( (LA103_4==RULE_ID||LA103_4==67||(LA103_4>=92 && LA103_4<=98)||(LA103_4>=124 && LA103_4<=126)) ) {
                        alt103=2;
                    }
                    else if ( (LA103_4==64) ) {
                        alt103=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA103_2==EOF||LA103_2==14||LA103_2==21||(LA103_2>=43 && LA103_2<=44)||LA103_2==47||LA103_2==53||(LA103_2>=55 && LA103_2<=61)||LA103_2==63||LA103_2==65||(LA103_2>=83 && LA103_2<=89)) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 2, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt103=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalML2.g:5334:3: ( ( (lv_source_0_0= ruleTypeLiteralExpression ) ) otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' )
                    {
                    // InternalML2.g:5334:3: ( ( (lv_source_0_0= ruleTypeLiteralExpression ) ) otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' )
                    // InternalML2.g:5335:4: ( (lv_source_0_0= ruleTypeLiteralExpression ) ) otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')'
                    {
                    // InternalML2.g:5335:4: ( (lv_source_0_0= ruleTypeLiteralExpression ) )
                    // InternalML2.g:5336:5: (lv_source_0_0= ruleTypeLiteralExpression )
                    {
                    // InternalML2.g:5336:5: (lv_source_0_0= ruleTypeLiteralExpression )
                    // InternalML2.g:5337:6: lv_source_0_0= ruleTypeLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigationSourceAccess().getSourceTypeLiteralExpressionParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
                    lv_source_0_0=ruleTypeLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigationSourceRule());
                      						}
                      						set(
                      							current,
                      							"source",
                      							lv_source_0_0,
                      							"br.ufes.inf.nemo.ml2.ML2.TypeLiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNavigationSourceAccess().getFullStopKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,64,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigationSourceAccess().getAllInstancesKeyword_0_2());
                      			
                    }
                    otherlv_3=(Token)match(input,62,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNavigationSourceAccess().getLeftParenthesisKeyword_0_3());
                      			
                    }
                    otherlv_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNavigationSourceAccess().getRightParenthesisKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:5372:3: ( (lv_source_5_0= ruleVariableExpression ) )
                    {
                    // InternalML2.g:5372:3: ( (lv_source_5_0= ruleVariableExpression ) )
                    // InternalML2.g:5373:4: (lv_source_5_0= ruleVariableExpression )
                    {
                    // InternalML2.g:5373:4: (lv_source_5_0= ruleVariableExpression )
                    // InternalML2.g:5374:5: lv_source_5_0= ruleVariableExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNavigationSourceAccess().getSourceVariableExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_source_5_0=ruleVariableExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNavigationSourceRule());
                      					}
                      					set(
                      						current,
                      						"source",
                      						lv_source_5_0,
                      						"br.ufes.inf.nemo.ml2.ML2.VariableExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationSource"


    // $ANTLR start "entryRuleCallOperation"
    // InternalML2.g:5395:1: entryRuleCallOperation returns [EObject current=null] : iv_ruleCallOperation= ruleCallOperation EOF ;
    public final EObject entryRuleCallOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallOperation = null;


        try {
            // InternalML2.g:5395:54: (iv_ruleCallOperation= ruleCallOperation EOF )
            // InternalML2.g:5396:2: iv_ruleCallOperation= ruleCallOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallOperation=ruleCallOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallOperation"


    // $ANTLR start "ruleCallOperation"
    // InternalML2.g:5402:1: ruleCallOperation returns [EObject current=null] : ( (otherlv_0= '.' this_DotOperation_1= ruleDotOperation ) | (otherlv_2= '->' this_ArrowOperation_3= ruleArrowOperation ) ) ;
    public final EObject ruleCallOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DotOperation_1 = null;

        EObject this_ArrowOperation_3 = null;



        	enterRule();

        try {
            // InternalML2.g:5408:2: ( ( (otherlv_0= '.' this_DotOperation_1= ruleDotOperation ) | (otherlv_2= '->' this_ArrowOperation_3= ruleArrowOperation ) ) )
            // InternalML2.g:5409:2: ( (otherlv_0= '.' this_DotOperation_1= ruleDotOperation ) | (otherlv_2= '->' this_ArrowOperation_3= ruleArrowOperation ) )
            {
            // InternalML2.g:5409:2: ( (otherlv_0= '.' this_DotOperation_1= ruleDotOperation ) | (otherlv_2= '->' this_ArrowOperation_3= ruleArrowOperation ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==16) ) {
                alt104=1;
            }
            else if ( (LA104_0==65) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalML2.g:5410:3: (otherlv_0= '.' this_DotOperation_1= ruleDotOperation )
                    {
                    // InternalML2.g:5410:3: (otherlv_0= '.' this_DotOperation_1= ruleDotOperation )
                    // InternalML2.g:5411:4: otherlv_0= '.' this_DotOperation_1= ruleDotOperation
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCallOperationAccess().getFullStopKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallOperationAccess().getDotOperationParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_DotOperation_1=ruleDotOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DotOperation_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:5425:3: (otherlv_2= '->' this_ArrowOperation_3= ruleArrowOperation )
                    {
                    // InternalML2.g:5425:3: (otherlv_2= '->' this_ArrowOperation_3= ruleArrowOperation )
                    // InternalML2.g:5426:4: otherlv_2= '->' this_ArrowOperation_3= ruleArrowOperation
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCallOperationAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCallOperationAccess().getArrowOperationParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrowOperation_3=ruleArrowOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ArrowOperation_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallOperation"


    // $ANTLR start "entryRuleDotOperation"
    // InternalML2.g:5443:1: entryRuleDotOperation returns [EObject current=null] : iv_ruleDotOperation= ruleDotOperation EOF ;
    public final EObject entryRuleDotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotOperation = null;


        try {
            // InternalML2.g:5443:53: (iv_ruleDotOperation= ruleDotOperation EOF )
            // InternalML2.g:5444:2: iv_ruleDotOperation= ruleDotOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDotOperation=ruleDotOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotOperation"


    // $ANTLR start "ruleDotOperation"
    // InternalML2.g:5450:1: ruleDotOperation returns [EObject current=null] : (this_UnaryNumberOperation_0= ruleUnaryNumberOperation | this_BinaryNumberOperation_1= ruleBinaryNumberOperation | this_TypeOperation_2= ruleTypeOperation | this_VariableExpression_3= ruleVariableExpression ) ;
    public final EObject ruleDotOperation() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryNumberOperation_0 = null;

        EObject this_BinaryNumberOperation_1 = null;

        EObject this_TypeOperation_2 = null;

        EObject this_VariableExpression_3 = null;



        	enterRule();

        try {
            // InternalML2.g:5456:2: ( (this_UnaryNumberOperation_0= ruleUnaryNumberOperation | this_BinaryNumberOperation_1= ruleBinaryNumberOperation | this_TypeOperation_2= ruleTypeOperation | this_VariableExpression_3= ruleVariableExpression ) )
            // InternalML2.g:5457:2: (this_UnaryNumberOperation_0= ruleUnaryNumberOperation | this_BinaryNumberOperation_1= ruleBinaryNumberOperation | this_TypeOperation_2= ruleTypeOperation | this_VariableExpression_3= ruleVariableExpression )
            {
            // InternalML2.g:5457:2: (this_UnaryNumberOperation_0= ruleUnaryNumberOperation | this_BinaryNumberOperation_1= ruleBinaryNumberOperation | this_TypeOperation_2= ruleTypeOperation | this_VariableExpression_3= ruleVariableExpression )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt105=1;
                }
                break;
            case 96:
            case 97:
            case 98:
                {
                alt105=2;
                }
                break;
            case 124:
            case 125:
            case 126:
                {
                alt105=3;
                }
                break;
            case RULE_ID:
            case 67:
                {
                alt105=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalML2.g:5458:3: this_UnaryNumberOperation_0= ruleUnaryNumberOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDotOperationAccess().getUnaryNumberOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryNumberOperation_0=ruleUnaryNumberOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryNumberOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:5467:3: this_BinaryNumberOperation_1= ruleBinaryNumberOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDotOperationAccess().getBinaryNumberOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryNumberOperation_1=ruleBinaryNumberOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryNumberOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:5476:3: this_TypeOperation_2= ruleTypeOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDotOperationAccess().getTypeOperationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeOperation_2=ruleTypeOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeOperation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalML2.g:5485:3: this_VariableExpression_3= ruleVariableExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDotOperationAccess().getVariableExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableExpression_3=ruleVariableExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotOperation"


    // $ANTLR start "entryRuleUnaryNumberOperation"
    // InternalML2.g:5497:1: entryRuleUnaryNumberOperation returns [EObject current=null] : iv_ruleUnaryNumberOperation= ruleUnaryNumberOperation EOF ;
    public final EObject entryRuleUnaryNumberOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryNumberOperation = null;


        try {
            // InternalML2.g:5497:61: (iv_ruleUnaryNumberOperation= ruleUnaryNumberOperation EOF )
            // InternalML2.g:5498:2: iv_ruleUnaryNumberOperation= ruleUnaryNumberOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryNumberOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryNumberOperation=ruleUnaryNumberOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryNumberOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryNumberOperation"


    // $ANTLR start "ruleUnaryNumberOperation"
    // InternalML2.g:5504:1: ruleUnaryNumberOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryNumberOperator ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleUnaryNumberOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5510:2: ( ( ( (lv_operator_0_0= ruleUnaryNumberOperator ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalML2.g:5511:2: ( ( (lv_operator_0_0= ruleUnaryNumberOperator ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalML2.g:5511:2: ( ( (lv_operator_0_0= ruleUnaryNumberOperator ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalML2.g:5512:3: ( (lv_operator_0_0= ruleUnaryNumberOperator ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalML2.g:5512:3: ( (lv_operator_0_0= ruleUnaryNumberOperator ) )
            // InternalML2.g:5513:4: (lv_operator_0_0= ruleUnaryNumberOperator )
            {
            // InternalML2.g:5513:4: (lv_operator_0_0= ruleUnaryNumberOperator )
            // InternalML2.g:5514:5: lv_operator_0_0= ruleUnaryNumberOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryNumberOperationAccess().getOperatorUnaryNumberOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_operator_0_0=ruleUnaryNumberOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryNumberOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.UnaryNumberOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnaryNumberOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnaryNumberOperationAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryNumberOperation"


    // $ANTLR start "entryRuleBinaryNumberOperation"
    // InternalML2.g:5543:1: entryRuleBinaryNumberOperation returns [EObject current=null] : iv_ruleBinaryNumberOperation= ruleBinaryNumberOperation EOF ;
    public final EObject entryRuleBinaryNumberOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryNumberOperation = null;


        try {
            // InternalML2.g:5543:62: (iv_ruleBinaryNumberOperation= ruleBinaryNumberOperation EOF )
            // InternalML2.g:5544:2: iv_ruleBinaryNumberOperation= ruleBinaryNumberOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryNumberOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryNumberOperation=ruleBinaryNumberOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryNumberOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryNumberOperation"


    // $ANTLR start "ruleBinaryNumberOperation"
    // InternalML2.g:5550:1: ruleBinaryNumberOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleBinaryNumberOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleBinaryNumberOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5556:2: ( ( ( (lv_operator_0_0= ruleBinaryNumberOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' ) )
            // InternalML2.g:5557:2: ( ( (lv_operator_0_0= ruleBinaryNumberOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' )
            {
            // InternalML2.g:5557:2: ( ( (lv_operator_0_0= ruleBinaryNumberOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' )
            // InternalML2.g:5558:3: ( (lv_operator_0_0= ruleBinaryNumberOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')'
            {
            // InternalML2.g:5558:3: ( (lv_operator_0_0= ruleBinaryNumberOperator ) )
            // InternalML2.g:5559:4: (lv_operator_0_0= ruleBinaryNumberOperator )
            {
            // InternalML2.g:5559:4: (lv_operator_0_0= ruleBinaryNumberOperator )
            // InternalML2.g:5560:5: lv_operator_0_0= ruleBinaryNumberOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryNumberOperationAccess().getOperatorBinaryNumberOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_operator_0_0=ruleBinaryNumberOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBinaryNumberOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.BinaryNumberOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBinaryNumberOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:5581:3: ( (lv_argument_2_0= ruleOclExpression ) )
            // InternalML2.g:5582:4: (lv_argument_2_0= ruleOclExpression )
            {
            // InternalML2.g:5582:4: (lv_argument_2_0= ruleOclExpression )
            // InternalML2.g:5583:5: lv_argument_2_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryNumberOperationAccess().getArgumentOclExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_argument_2_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBinaryNumberOperationRule());
              					}
              					set(
              						current,
              						"argument",
              						lv_argument_2_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBinaryNumberOperationAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryNumberOperation"


    // $ANTLR start "entryRuleArrowOperation"
    // InternalML2.g:5608:1: entryRuleArrowOperation returns [EObject current=null] : iv_ruleArrowOperation= ruleArrowOperation EOF ;
    public final EObject entryRuleArrowOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOperation = null;


        try {
            // InternalML2.g:5608:55: (iv_ruleArrowOperation= ruleArrowOperation EOF )
            // InternalML2.g:5609:2: iv_ruleArrowOperation= ruleArrowOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrowOperation=ruleArrowOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrowOperation"


    // $ANTLR start "ruleArrowOperation"
    // InternalML2.g:5615:1: ruleArrowOperation returns [EObject current=null] : (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_MultiaryIteration_3= ruleMultiaryIteration | this_TypeOperation_4= ruleTypeOperation ) ;
    public final EObject ruleArrowOperation() throws RecognitionException {
        EObject current = null;

        EObject this_UnarySetOperation_0 = null;

        EObject this_BinarySetOperation_1 = null;

        EObject this_UnaryIteration_2 = null;

        EObject this_MultiaryIteration_3 = null;

        EObject this_TypeOperation_4 = null;



        	enterRule();

        try {
            // InternalML2.g:5621:2: ( (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_MultiaryIteration_3= ruleMultiaryIteration | this_TypeOperation_4= ruleTypeOperation ) )
            // InternalML2.g:5622:2: (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_MultiaryIteration_3= ruleMultiaryIteration | this_TypeOperation_4= ruleTypeOperation )
            {
            // InternalML2.g:5622:2: (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_MultiaryIteration_3= ruleMultiaryIteration | this_TypeOperation_4= ruleTypeOperation )
            int alt106=5;
            switch ( input.LA(1) ) {
            case 96:
            case 97:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                {
                alt106=1;
                }
                break;
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
                {
                alt106=2;
                }
                break;
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
                {
                alt106=3;
                }
                break;
            case 122:
            case 123:
                {
                alt106=4;
                }
                break;
            case 124:
            case 125:
            case 126:
                {
                alt106=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalML2.g:5623:3: this_UnarySetOperation_0= ruleUnarySetOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrowOperationAccess().getUnarySetOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnarySetOperation_0=ruleUnarySetOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnarySetOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:5632:3: this_BinarySetOperation_1= ruleBinarySetOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrowOperationAccess().getBinarySetOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinarySetOperation_1=ruleBinarySetOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinarySetOperation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:5641:3: this_UnaryIteration_2= ruleUnaryIteration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrowOperationAccess().getUnaryIterationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryIteration_2=ruleUnaryIteration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryIteration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalML2.g:5650:3: this_MultiaryIteration_3= ruleMultiaryIteration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrowOperationAccess().getMultiaryIterationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MultiaryIteration_3=ruleMultiaryIteration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MultiaryIteration_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalML2.g:5659:3: this_TypeOperation_4= ruleTypeOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrowOperationAccess().getTypeOperationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeOperation_4=ruleTypeOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeOperation_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowOperation"


    // $ANTLR start "entryRuleUnarySetOperation"
    // InternalML2.g:5671:1: entryRuleUnarySetOperation returns [EObject current=null] : iv_ruleUnarySetOperation= ruleUnarySetOperation EOF ;
    public final EObject entryRuleUnarySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnarySetOperation = null;


        try {
            // InternalML2.g:5671:58: (iv_ruleUnarySetOperation= ruleUnarySetOperation EOF )
            // InternalML2.g:5672:2: iv_ruleUnarySetOperation= ruleUnarySetOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnarySetOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnarySetOperation=ruleUnarySetOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnarySetOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnarySetOperation"


    // $ANTLR start "ruleUnarySetOperation"
    // InternalML2.g:5678:1: ruleUnarySetOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleUnarySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5684:2: ( ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalML2.g:5685:2: ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalML2.g:5685:2: ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalML2.g:5686:3: ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalML2.g:5686:3: ( (lv_operator_0_0= ruleUnarySetOperator ) )
            // InternalML2.g:5687:4: (lv_operator_0_0= ruleUnarySetOperator )
            {
            // InternalML2.g:5687:4: (lv_operator_0_0= ruleUnarySetOperator )
            // InternalML2.g:5688:5: lv_operator_0_0= ruleUnarySetOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnarySetOperationAccess().getOperatorUnarySetOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_operator_0_0=ruleUnarySetOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnarySetOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.UnarySetOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnarySetOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnarySetOperationAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnarySetOperation"


    // $ANTLR start "entryRuleBinarySetOperation"
    // InternalML2.g:5717:1: entryRuleBinarySetOperation returns [EObject current=null] : iv_ruleBinarySetOperation= ruleBinarySetOperation EOF ;
    public final EObject entryRuleBinarySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySetOperation = null;


        try {
            // InternalML2.g:5717:59: (iv_ruleBinarySetOperation= ruleBinarySetOperation EOF )
            // InternalML2.g:5718:2: iv_ruleBinarySetOperation= ruleBinarySetOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinarySetOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinarySetOperation=ruleBinarySetOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinarySetOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinarySetOperation"


    // $ANTLR start "ruleBinarySetOperation"
    // InternalML2.g:5724:1: ruleBinarySetOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleBinarySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5730:2: ( ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' ) )
            // InternalML2.g:5731:2: ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' )
            {
            // InternalML2.g:5731:2: ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' )
            // InternalML2.g:5732:3: ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')'
            {
            // InternalML2.g:5732:3: ( (lv_operator_0_0= ruleBinarySetOperator ) )
            // InternalML2.g:5733:4: (lv_operator_0_0= ruleBinarySetOperator )
            {
            // InternalML2.g:5733:4: (lv_operator_0_0= ruleBinarySetOperator )
            // InternalML2.g:5734:5: lv_operator_0_0= ruleBinarySetOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinarySetOperationAccess().getOperatorBinarySetOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_operator_0_0=ruleBinarySetOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBinarySetOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.BinarySetOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBinarySetOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:5755:3: ( (lv_argument_2_0= ruleOclExpression ) )
            // InternalML2.g:5756:4: (lv_argument_2_0= ruleOclExpression )
            {
            // InternalML2.g:5756:4: (lv_argument_2_0= ruleOclExpression )
            // InternalML2.g:5757:5: lv_argument_2_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinarySetOperationAccess().getArgumentOclExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_argument_2_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBinarySetOperationRule());
              					}
              					set(
              						current,
              						"argument",
              						lv_argument_2_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBinarySetOperationAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinarySetOperation"


    // $ANTLR start "entryRuleUnaryIteration"
    // InternalML2.g:5782:1: entryRuleUnaryIteration returns [EObject current=null] : iv_ruleUnaryIteration= ruleUnaryIteration EOF ;
    public final EObject entryRuleUnaryIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryIteration = null;


        try {
            // InternalML2.g:5782:55: (iv_ruleUnaryIteration= ruleUnaryIteration EOF )
            // InternalML2.g:5783:2: iv_ruleUnaryIteration= ruleUnaryIteration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryIterationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryIteration=ruleUnaryIteration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryIteration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryIteration"


    // $ANTLR start "ruleUnaryIteration"
    // InternalML2.g:5789:1: ruleUnaryIteration returns [EObject current=null] : ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleUnaryIteration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_iterator_0_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5795:2: ( ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' ) )
            // InternalML2.g:5796:2: ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' )
            {
            // InternalML2.g:5796:2: ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' )
            // InternalML2.g:5797:3: ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')'
            {
            // InternalML2.g:5797:3: ( (lv_iterator_0_0= ruleUnaryIterator ) )
            // InternalML2.g:5798:4: (lv_iterator_0_0= ruleUnaryIterator )
            {
            // InternalML2.g:5798:4: (lv_iterator_0_0= ruleUnaryIterator )
            // InternalML2.g:5799:5: lv_iterator_0_0= ruleUnaryIterator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryIterationAccess().getIteratorUnaryIteratorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_iterator_0_0=ruleUnaryIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryIterationRule());
              					}
              					set(
              						current,
              						"iterator",
              						lv_iterator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.UnaryIterator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnaryIterationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:5820:3: ( ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= '|' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==66) ) {
                    alt107=1;
                }
            }
            switch (alt107) {
                case 1 :
                    // InternalML2.g:5821:4: ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= '|'
                    {
                    // InternalML2.g:5821:4: ( (lv_variable_2_0= RULE_ID ) )
                    // InternalML2.g:5822:5: (lv_variable_2_0= RULE_ID )
                    {
                    // InternalML2.g:5822:5: (lv_variable_2_0= RULE_ID )
                    // InternalML2.g:5823:6: lv_variable_2_0= RULE_ID
                    {
                    lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variable_2_0, grammarAccess.getUnaryIterationAccess().getVariableIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryIterationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"variable",
                      							lv_variable_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,66,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUnaryIterationAccess().getVerticalLineKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:5844:3: ( (lv_body_4_0= ruleOclExpression ) )
            // InternalML2.g:5845:4: (lv_body_4_0= ruleOclExpression )
            {
            // InternalML2.g:5845:4: (lv_body_4_0= ruleOclExpression )
            // InternalML2.g:5846:5: lv_body_4_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryIterationAccess().getBodyOclExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_body_4_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnaryIterationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_4_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getUnaryIterationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryIteration"


    // $ANTLR start "entryRuleMultiaryIteration"
    // InternalML2.g:5871:1: entryRuleMultiaryIteration returns [EObject current=null] : iv_ruleMultiaryIteration= ruleMultiaryIteration EOF ;
    public final EObject entryRuleMultiaryIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiaryIteration = null;


        try {
            // InternalML2.g:5871:58: (iv_ruleMultiaryIteration= ruleMultiaryIteration EOF )
            // InternalML2.g:5872:2: iv_ruleMultiaryIteration= ruleMultiaryIteration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiaryIterationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiaryIteration=ruleMultiaryIteration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiaryIteration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiaryIteration"


    // $ANTLR start "ruleMultiaryIteration"
    // InternalML2.g:5878:1: ruleMultiaryIteration returns [EObject current=null] : ( ( (lv_iterator_0_0= ruleMultiaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+ otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleMultiaryIteration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_variables_2_0=null;
        Token otherlv_3=null;
        Token lv_variables_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_iterator_0_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5884:2: ( ( ( (lv_iterator_0_0= ruleMultiaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+ otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' ) )
            // InternalML2.g:5885:2: ( ( (lv_iterator_0_0= ruleMultiaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+ otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' )
            {
            // InternalML2.g:5885:2: ( ( (lv_iterator_0_0= ruleMultiaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+ otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' )
            // InternalML2.g:5886:3: ( (lv_iterator_0_0= ruleMultiaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+ otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')'
            {
            // InternalML2.g:5886:3: ( (lv_iterator_0_0= ruleMultiaryIterator ) )
            // InternalML2.g:5887:4: (lv_iterator_0_0= ruleMultiaryIterator )
            {
            // InternalML2.g:5887:4: (lv_iterator_0_0= ruleMultiaryIterator )
            // InternalML2.g:5888:5: lv_iterator_0_0= ruleMultiaryIterator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiaryIterationAccess().getIteratorMultiaryIteratorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_iterator_0_0=ruleMultiaryIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiaryIterationRule());
              					}
              					set(
              						current,
              						"iterator",
              						lv_iterator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.MultiaryIterator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMultiaryIterationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:5909:3: ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+ otherlv_5= '|' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_ID) ) {
                int LA109_1 = input.LA(2);

                if ( (LA109_1==21) ) {
                    alt109=1;
                }
            }
            switch (alt109) {
                case 1 :
                    // InternalML2.g:5910:4: ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+ otherlv_5= '|'
                    {
                    // InternalML2.g:5910:4: ( (lv_variables_2_0= RULE_ID ) )
                    // InternalML2.g:5911:5: (lv_variables_2_0= RULE_ID )
                    {
                    // InternalML2.g:5911:5: (lv_variables_2_0= RULE_ID )
                    // InternalML2.g:5912:6: lv_variables_2_0= RULE_ID
                    {
                    lv_variables_2_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variables_2_0, grammarAccess.getMultiaryIterationAccess().getVariablesIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultiaryIterationRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"variables",
                      							lv_variables_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalML2.g:5928:4: (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )+
                    int cnt108=0;
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==21) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalML2.g:5929:5: otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMultiaryIterationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalML2.g:5933:5: ( (lv_variables_4_0= RULE_ID ) )
                    	    // InternalML2.g:5934:6: (lv_variables_4_0= RULE_ID )
                    	    {
                    	    // InternalML2.g:5934:6: (lv_variables_4_0= RULE_ID )
                    	    // InternalML2.g:5935:7: lv_variables_4_0= RULE_ID
                    	    {
                    	    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_78); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_variables_4_0, grammarAccess.getMultiaryIterationAccess().getVariablesIDTerminalRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getMultiaryIterationRule());
                    	      							}
                    	      							addWithLastConsumed(
                    	      								current,
                    	      								"variables",
                    	      								lv_variables_4_0,
                    	      								"org.eclipse.xtext.common.Terminals.ID");
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt108 >= 1 ) break loop108;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(108, input);
                                throw eee;
                        }
                        cnt108++;
                    } while (true);

                    otherlv_5=(Token)match(input,66,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMultiaryIterationAccess().getVerticalLineKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:5957:3: ( (lv_body_6_0= ruleOclExpression ) )
            // InternalML2.g:5958:4: (lv_body_6_0= ruleOclExpression )
            {
            // InternalML2.g:5958:4: (lv_body_6_0= ruleOclExpression )
            // InternalML2.g:5959:5: lv_body_6_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiaryIterationAccess().getBodyOclExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_body_6_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiaryIterationRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMultiaryIterationAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiaryIteration"


    // $ANTLR start "entryRuleTypeOperation"
    // InternalML2.g:5984:1: entryRuleTypeOperation returns [EObject current=null] : iv_ruleTypeOperation= ruleTypeOperation EOF ;
    public final EObject entryRuleTypeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeOperation = null;


        try {
            // InternalML2.g:5984:54: (iv_ruleTypeOperation= ruleTypeOperation EOF )
            // InternalML2.g:5985:2: iv_ruleTypeOperation= ruleTypeOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeOperation=ruleTypeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeOperation"


    // $ANTLR start "ruleTypeOperation"
    // InternalML2.g:5991:1: ruleTypeOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleTypeOperator ) ) otherlv_1= '(' ( ( (lv_referredType_2_0= ruleTypeLiteralExpression ) ) | otherlv_3= 'self' ) otherlv_4= ')' ) ;
    public final EObject ruleTypeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_referredType_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5997:2: ( ( ( (lv_operator_0_0= ruleTypeOperator ) ) otherlv_1= '(' ( ( (lv_referredType_2_0= ruleTypeLiteralExpression ) ) | otherlv_3= 'self' ) otherlv_4= ')' ) )
            // InternalML2.g:5998:2: ( ( (lv_operator_0_0= ruleTypeOperator ) ) otherlv_1= '(' ( ( (lv_referredType_2_0= ruleTypeLiteralExpression ) ) | otherlv_3= 'self' ) otherlv_4= ')' )
            {
            // InternalML2.g:5998:2: ( ( (lv_operator_0_0= ruleTypeOperator ) ) otherlv_1= '(' ( ( (lv_referredType_2_0= ruleTypeLiteralExpression ) ) | otherlv_3= 'self' ) otherlv_4= ')' )
            // InternalML2.g:5999:3: ( (lv_operator_0_0= ruleTypeOperator ) ) otherlv_1= '(' ( ( (lv_referredType_2_0= ruleTypeLiteralExpression ) ) | otherlv_3= 'self' ) otherlv_4= ')'
            {
            // InternalML2.g:5999:3: ( (lv_operator_0_0= ruleTypeOperator ) )
            // InternalML2.g:6000:4: (lv_operator_0_0= ruleTypeOperator )
            {
            // InternalML2.g:6000:4: (lv_operator_0_0= ruleTypeOperator )
            // InternalML2.g:6001:5: lv_operator_0_0= ruleTypeOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeOperationAccess().getOperatorTypeOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_operator_0_0=ruleTypeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeOperationRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_0_0,
              						"br.ufes.inf.nemo.ml2.ML2.TypeOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypeOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:6022:3: ( ( (lv_referredType_2_0= ruleTypeLiteralExpression ) ) | otherlv_3= 'self' )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_ID||(LA110_0>=69 && LA110_0<=72)) ) {
                alt110=1;
            }
            else if ( (LA110_0==67) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalML2.g:6023:4: ( (lv_referredType_2_0= ruleTypeLiteralExpression ) )
                    {
                    // InternalML2.g:6023:4: ( (lv_referredType_2_0= ruleTypeLiteralExpression ) )
                    // InternalML2.g:6024:5: (lv_referredType_2_0= ruleTypeLiteralExpression )
                    {
                    // InternalML2.g:6024:5: (lv_referredType_2_0= ruleTypeLiteralExpression )
                    // InternalML2.g:6025:6: lv_referredType_2_0= ruleTypeLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeOperationAccess().getReferredTypeTypeLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_70);
                    lv_referredType_2_0=ruleTypeLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeOperationRule());
                      						}
                      						set(
                      							current,
                      							"referredType",
                      							lv_referredType_2_0,
                      							"br.ufes.inf.nemo.ml2.ML2.TypeLiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6043:4: otherlv_3= 'self'
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeOperationAccess().getSelfKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypeOperationAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeOperation"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalML2.g:6056:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalML2.g:6056:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalML2.g:6057:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalML2.g:6063:1: ruleLiteralExpression returns [EObject current=null] : (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_SetLiteralExpression_1= ruleSetLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveLiteralExpression_0 = null;

        EObject this_SetLiteralExpression_1 = null;

        EObject this_TypeLiteralExpression_2 = null;



        	enterRule();

        try {
            // InternalML2.g:6069:2: ( (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_SetLiteralExpression_1= ruleSetLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression ) )
            // InternalML2.g:6070:2: (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_SetLiteralExpression_1= ruleSetLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression )
            {
            // InternalML2.g:6070:2: (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_SetLiteralExpression_1= ruleSetLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression )
            int alt111=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 68:
                {
                alt111=1;
                }
                break;
            case 69:
                {
                int LA111_2 = input.LA(2);

                if ( (LA111_2==62) ) {
                    alt111=3;
                }
                else if ( (LA111_2==12) ) {
                    alt111=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 70:
            case 71:
            case 72:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalML2.g:6071:3: this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getPrimitiveLiteralExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveLiteralExpression_0=rulePrimitiveLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:6080:3: this_SetLiteralExpression_1= ruleSetLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getSetLiteralExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetLiteralExpression_1=ruleSetLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetLiteralExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:6089:3: this_TypeLiteralExpression_2= ruleTypeLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getTypeLiteralExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLiteralExpression_2=ruleTypeLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRulePrimitiveLiteralExpression"
    // InternalML2.g:6101:1: entryRulePrimitiveLiteralExpression returns [EObject current=null] : iv_rulePrimitiveLiteralExpression= rulePrimitiveLiteralExpression EOF ;
    public final EObject entryRulePrimitiveLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpression = null;


        try {
            // InternalML2.g:6101:67: (iv_rulePrimitiveLiteralExpression= rulePrimitiveLiteralExpression EOF )
            // InternalML2.g:6102:2: iv_rulePrimitiveLiteralExpression= rulePrimitiveLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveLiteralExpression=rulePrimitiveLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveLiteralExpression"


    // $ANTLR start "rulePrimitiveLiteralExpression"
    // InternalML2.g:6108:1: rulePrimitiveLiteralExpression returns [EObject current=null] : (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_NumberLiteralExpression_1= ruleNumberLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression ) ;
    public final EObject rulePrimitiveLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteralExpression_0 = null;

        EObject this_NumberLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_NullLiteralExpression_3 = null;



        	enterRule();

        try {
            // InternalML2.g:6114:2: ( (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_NumberLiteralExpression_1= ruleNumberLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression ) )
            // InternalML2.g:6115:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_NumberLiteralExpression_1= ruleNumberLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression )
            {
            // InternalML2.g:6115:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_NumberLiteralExpression_1= ruleNumberLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_NullLiteralExpression_3= ruleNullLiteralExpression )
            int alt112=4;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
                {
                alt112=1;
                }
                break;
            case RULE_INT:
                {
                alt112=2;
                }
                break;
            case RULE_STRING:
                {
                alt112=3;
                }
                break;
            case 68:
                {
                alt112=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalML2.g:6116:3: this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpression_0=ruleBooleanLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:6125:3: this_NumberLiteralExpression_1= ruleNumberLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getNumberLiteralExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteralExpression_1=ruleNumberLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:6134:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpression_2=ruleStringLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalML2.g:6143:3: this_NullLiteralExpression_3= ruleNullLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getNullLiteralExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpression_3=ruleNullLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveLiteralExpression"


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // InternalML2.g:6155:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalML2.g:6155:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalML2.g:6156:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpression"


    // $ANTLR start "ruleBooleanLiteralExpression"
    // InternalML2.g:6162:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_booleanSymbol_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:6168:2: ( ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) ) )
            // InternalML2.g:6169:2: ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) )
            {
            // InternalML2.g:6169:2: ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) )
            // InternalML2.g:6170:3: (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL )
            {
            // InternalML2.g:6170:3: (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL )
            // InternalML2.g:6171:4: lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBooleanLiteralExpressionAccess().getBooleanSymbolBOOLEAN_LITERALParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_booleanSymbol_0_0=ruleBOOLEAN_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBooleanLiteralExpressionRule());
              				}
              				set(
              					current,
              					"booleanSymbol",
              					lv_booleanSymbol_0_0,
              					"br.ufes.inf.nemo.ml2.ML2.BOOLEAN_LITERAL");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpression"


    // $ANTLR start "entryRuleNumberLiteralExpression"
    // InternalML2.g:6191:1: entryRuleNumberLiteralExpression returns [EObject current=null] : iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF ;
    public final EObject entryRuleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpression = null;


        try {
            // InternalML2.g:6191:64: (iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF )
            // InternalML2.g:6192:2: iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteralExpression=ruleNumberLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteralExpression"


    // $ANTLR start "ruleNumberLiteralExpression"
    // InternalML2.g:6198:1: ruleNumberLiteralExpression returns [EObject current=null] : ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numberSymbol_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:6204:2: ( ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalML2.g:6205:2: ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalML2.g:6205:2: ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) )
            // InternalML2.g:6206:3: (lv_numberSymbol_0_0= ruleNUMBER_LITERAL )
            {
            // InternalML2.g:6206:3: (lv_numberSymbol_0_0= ruleNUMBER_LITERAL )
            // InternalML2.g:6207:4: lv_numberSymbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberLiteralExpressionAccess().getNumberSymbolNUMBER_LITERALParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_numberSymbol_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberLiteralExpressionRule());
              				}
              				set(
              					current,
              					"numberSymbol",
              					lv_numberSymbol_0_0,
              					"br.ufes.inf.nemo.ml2.ML2.NUMBER_LITERAL");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteralExpression"


    // $ANTLR start "entryRuleStringLiteralExpression"
    // InternalML2.g:6227:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalML2.g:6227:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalML2.g:6228:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpression=ruleStringLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExpression"


    // $ANTLR start "ruleStringLiteralExpression"
    // InternalML2.g:6234:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_stringSymbol_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_stringSymbol_0_0=null;


        	enterRule();

        try {
            // InternalML2.g:6240:2: ( ( (lv_stringSymbol_0_0= RULE_STRING ) ) )
            // InternalML2.g:6241:2: ( (lv_stringSymbol_0_0= RULE_STRING ) )
            {
            // InternalML2.g:6241:2: ( (lv_stringSymbol_0_0= RULE_STRING ) )
            // InternalML2.g:6242:3: (lv_stringSymbol_0_0= RULE_STRING )
            {
            // InternalML2.g:6242:3: (lv_stringSymbol_0_0= RULE_STRING )
            // InternalML2.g:6243:4: lv_stringSymbol_0_0= RULE_STRING
            {
            lv_stringSymbol_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_stringSymbol_0_0, grammarAccess.getStringLiteralExpressionAccess().getStringSymbolSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringLiteralExpressionRule());
              				}
              				setWithLastConsumed(
              					current,
              					"stringSymbol",
              					lv_stringSymbol_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExpression"


    // $ANTLR start "entryRuleNullLiteralExpression"
    // InternalML2.g:6262:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalML2.g:6262:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalML2.g:6263:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpression=ruleNullLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteralExpression"


    // $ANTLR start "ruleNullLiteralExpression"
    // InternalML2.g:6269:1: ruleNullLiteralExpression returns [EObject current=null] : ( (lv_nullSymbol_0_0= 'null' ) ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_nullSymbol_0_0=null;


        	enterRule();

        try {
            // InternalML2.g:6275:2: ( ( (lv_nullSymbol_0_0= 'null' ) ) )
            // InternalML2.g:6276:2: ( (lv_nullSymbol_0_0= 'null' ) )
            {
            // InternalML2.g:6276:2: ( (lv_nullSymbol_0_0= 'null' ) )
            // InternalML2.g:6277:3: (lv_nullSymbol_0_0= 'null' )
            {
            // InternalML2.g:6277:3: (lv_nullSymbol_0_0= 'null' )
            // InternalML2.g:6278:4: lv_nullSymbol_0_0= 'null'
            {
            lv_nullSymbol_0_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nullSymbol_0_0, grammarAccess.getNullLiteralExpressionAccess().getNullSymbolNullKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNullLiteralExpressionRule());
              				}
              				setWithLastConsumed(current, "nullSymbol", lv_nullSymbol_0_0, "null");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExpression"


    // $ANTLR start "entryRuleSetLiteralExpression"
    // InternalML2.g:6293:1: entryRuleSetLiteralExpression returns [EObject current=null] : iv_ruleSetLiteralExpression= ruleSetLiteralExpression EOF ;
    public final EObject entryRuleSetLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteralExpression = null;


        try {
            // InternalML2.g:6293:61: (iv_ruleSetLiteralExpression= ruleSetLiteralExpression EOF )
            // InternalML2.g:6294:2: iv_ruleSetLiteralExpression= ruleSetLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetLiteralExpression=ruleSetLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLiteralExpression"


    // $ANTLR start "ruleSetLiteralExpression"
    // InternalML2.g:6300:1: ruleSetLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) ) (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleSetLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parts_3_0 = null;

        EObject lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:6306:2: ( ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) ) (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalML2.g:6307:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) ) (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalML2.g:6307:2: ( () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) ) (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )* )? otherlv_6= '}' )
            // InternalML2.g:6308:3: () otherlv_1= 'Set' otherlv_2= '{' ( ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) ) (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalML2.g:6308:3: ()
            // InternalML2.g:6309:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSetLiteralExpressionAccess().getSetLiteralExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetLiteralExpressionAccess().getSetKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSetLiteralExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalML2.g:6323:3: ( ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) ) (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=RULE_INT && LA114_0<=RULE_STRING)||(LA114_0>=45 && LA114_0<=46)||LA114_0==68) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalML2.g:6324:4: ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) ) (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )*
                    {
                    // InternalML2.g:6324:4: ( (lv_parts_3_0= rulePrimitiveLiteralExpression ) )
                    // InternalML2.g:6325:5: (lv_parts_3_0= rulePrimitiveLiteralExpression )
                    {
                    // InternalML2.g:6325:5: (lv_parts_3_0= rulePrimitiveLiteralExpression )
                    // InternalML2.g:6326:6: lv_parts_3_0= rulePrimitiveLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSetLiteralExpressionAccess().getPartsPrimitiveLiteralExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_parts_3_0=rulePrimitiveLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSetLiteralExpressionRule());
                      						}
                      						add(
                      							current,
                      							"parts",
                      							lv_parts_3_0,
                      							"br.ufes.inf.nemo.ml2.ML2.PrimitiveLiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalML2.g:6343:4: (otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==21) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalML2.g:6344:5: otherlv_4= ',' ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_81); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getSetLiteralExpressionAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalML2.g:6348:5: ( (lv_parts_5_0= rulePrimitiveLiteralExpression ) )
                    	    // InternalML2.g:6349:6: (lv_parts_5_0= rulePrimitiveLiteralExpression )
                    	    {
                    	    // InternalML2.g:6349:6: (lv_parts_5_0= rulePrimitiveLiteralExpression )
                    	    // InternalML2.g:6350:7: lv_parts_5_0= rulePrimitiveLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSetLiteralExpressionAccess().getPartsPrimitiveLiteralExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_parts_5_0=rulePrimitiveLiteralExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSetLiteralExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parts",
                    	      								lv_parts_5_0,
                    	      								"br.ufes.inf.nemo.ml2.ML2.PrimitiveLiteralExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSetLiteralExpressionAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLiteralExpression"


    // $ANTLR start "entryRuleTypeLiteralExpression"
    // InternalML2.g:6377:1: entryRuleTypeLiteralExpression returns [EObject current=null] : iv_ruleTypeLiteralExpression= ruleTypeLiteralExpression EOF ;
    public final EObject entryRuleTypeLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpression = null;


        try {
            // InternalML2.g:6377:62: (iv_ruleTypeLiteralExpression= ruleTypeLiteralExpression EOF )
            // InternalML2.g:6378:2: iv_ruleTypeLiteralExpression= ruleTypeLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralExpression=ruleTypeLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralExpression"


    // $ANTLR start "ruleTypeLiteralExpression"
    // InternalML2.g:6384:1: ruleTypeLiteralExpression returns [EObject current=null] : (this_PrimitiveTypeLiteral_0= rulePrimitiveTypeLiteral | this_SetTypeLiteral_1= ruleSetTypeLiteral | this_UserDefinedTypeLiteral_2= ruleUserDefinedTypeLiteral ) ;
    public final EObject ruleTypeLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeLiteral_0 = null;

        EObject this_SetTypeLiteral_1 = null;

        EObject this_UserDefinedTypeLiteral_2 = null;



        	enterRule();

        try {
            // InternalML2.g:6390:2: ( (this_PrimitiveTypeLiteral_0= rulePrimitiveTypeLiteral | this_SetTypeLiteral_1= ruleSetTypeLiteral | this_UserDefinedTypeLiteral_2= ruleUserDefinedTypeLiteral ) )
            // InternalML2.g:6391:2: (this_PrimitiveTypeLiteral_0= rulePrimitiveTypeLiteral | this_SetTypeLiteral_1= ruleSetTypeLiteral | this_UserDefinedTypeLiteral_2= ruleUserDefinedTypeLiteral )
            {
            // InternalML2.g:6391:2: (this_PrimitiveTypeLiteral_0= rulePrimitiveTypeLiteral | this_SetTypeLiteral_1= ruleSetTypeLiteral | this_UserDefinedTypeLiteral_2= ruleUserDefinedTypeLiteral )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 70:
            case 71:
            case 72:
                {
                alt115=1;
                }
                break;
            case 69:
                {
                alt115=2;
                }
                break;
            case RULE_ID:
                {
                alt115=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalML2.g:6392:3: this_PrimitiveTypeLiteral_0= rulePrimitiveTypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getPrimitiveTypeLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeLiteral_0=rulePrimitiveTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:6401:3: this_SetTypeLiteral_1= ruleSetTypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getSetTypeLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetTypeLiteral_1=ruleSetTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetTypeLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:6410:3: this_UserDefinedTypeLiteral_2= ruleUserDefinedTypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getUserDefinedTypeLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UserDefinedTypeLiteral_2=ruleUserDefinedTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UserDefinedTypeLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralExpression"


    // $ANTLR start "entryRuleVariableExpression"
    // InternalML2.g:6422:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalML2.g:6422:59: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalML2.g:6423:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // InternalML2.g:6429:1: ruleVariableExpression returns [EObject current=null] : ( ( (lv_referringVariable_0_0= 'self' ) ) | ( (lv_referringVariable_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        Token lv_referringVariable_0_0=null;
        Token lv_referringVariable_1_0=null;


        	enterRule();

        try {
            // InternalML2.g:6435:2: ( ( ( (lv_referringVariable_0_0= 'self' ) ) | ( (lv_referringVariable_1_0= RULE_ID ) ) ) )
            // InternalML2.g:6436:2: ( ( (lv_referringVariable_0_0= 'self' ) ) | ( (lv_referringVariable_1_0= RULE_ID ) ) )
            {
            // InternalML2.g:6436:2: ( ( (lv_referringVariable_0_0= 'self' ) ) | ( (lv_referringVariable_1_0= RULE_ID ) ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==67) ) {
                alt116=1;
            }
            else if ( (LA116_0==RULE_ID) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalML2.g:6437:3: ( (lv_referringVariable_0_0= 'self' ) )
                    {
                    // InternalML2.g:6437:3: ( (lv_referringVariable_0_0= 'self' ) )
                    // InternalML2.g:6438:4: (lv_referringVariable_0_0= 'self' )
                    {
                    // InternalML2.g:6438:4: (lv_referringVariable_0_0= 'self' )
                    // InternalML2.g:6439:5: lv_referringVariable_0_0= 'self'
                    {
                    lv_referringVariable_0_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referringVariable_0_0, grammarAccess.getVariableExpressionAccess().getReferringVariableSelfKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableExpressionRule());
                      					}
                      					setWithLastConsumed(current, "referringVariable", lv_referringVariable_0_0, "self");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6452:3: ( (lv_referringVariable_1_0= RULE_ID ) )
                    {
                    // InternalML2.g:6452:3: ( (lv_referringVariable_1_0= RULE_ID ) )
                    // InternalML2.g:6453:4: (lv_referringVariable_1_0= RULE_ID )
                    {
                    // InternalML2.g:6453:4: (lv_referringVariable_1_0= RULE_ID )
                    // InternalML2.g:6454:5: lv_referringVariable_1_0= RULE_ID
                    {
                    lv_referringVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referringVariable_1_0, grammarAccess.getVariableExpressionAccess().getReferringVariableIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableExpressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"referringVariable",
                      						lv_referringVariable_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "entryRulePrimitiveTypeLiteral"
    // InternalML2.g:6474:1: entryRulePrimitiveTypeLiteral returns [EObject current=null] : iv_rulePrimitiveTypeLiteral= rulePrimitiveTypeLiteral EOF ;
    public final EObject entryRulePrimitiveTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeLiteral = null;


        try {
            // InternalML2.g:6474:61: (iv_rulePrimitiveTypeLiteral= rulePrimitiveTypeLiteral EOF )
            // InternalML2.g:6475:2: iv_rulePrimitiveTypeLiteral= rulePrimitiveTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeLiteral=rulePrimitiveTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeLiteral"


    // $ANTLR start "rulePrimitiveTypeLiteral"
    // InternalML2.g:6481:1: rulePrimitiveTypeLiteral returns [EObject current=null] : ( ( (lv_typeName_0_0= 'Boolean' ) ) | ( (lv_typeName_1_0= 'Number' ) ) | ( (lv_typeName_2_0= 'String' ) ) ) ;
    public final EObject rulePrimitiveTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_0=null;
        Token lv_typeName_1_0=null;
        Token lv_typeName_2_0=null;


        	enterRule();

        try {
            // InternalML2.g:6487:2: ( ( ( (lv_typeName_0_0= 'Boolean' ) ) | ( (lv_typeName_1_0= 'Number' ) ) | ( (lv_typeName_2_0= 'String' ) ) ) )
            // InternalML2.g:6488:2: ( ( (lv_typeName_0_0= 'Boolean' ) ) | ( (lv_typeName_1_0= 'Number' ) ) | ( (lv_typeName_2_0= 'String' ) ) )
            {
            // InternalML2.g:6488:2: ( ( (lv_typeName_0_0= 'Boolean' ) ) | ( (lv_typeName_1_0= 'Number' ) ) | ( (lv_typeName_2_0= 'String' ) ) )
            int alt117=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt117=1;
                }
                break;
            case 71:
                {
                alt117=2;
                }
                break;
            case 72:
                {
                alt117=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalML2.g:6489:3: ( (lv_typeName_0_0= 'Boolean' ) )
                    {
                    // InternalML2.g:6489:3: ( (lv_typeName_0_0= 'Boolean' ) )
                    // InternalML2.g:6490:4: (lv_typeName_0_0= 'Boolean' )
                    {
                    // InternalML2.g:6490:4: (lv_typeName_0_0= 'Boolean' )
                    // InternalML2.g:6491:5: lv_typeName_0_0= 'Boolean'
                    {
                    lv_typeName_0_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_0_0, grammarAccess.getPrimitiveTypeLiteralAccess().getTypeNameBooleanKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeLiteralRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_0_0, "Boolean");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6504:3: ( (lv_typeName_1_0= 'Number' ) )
                    {
                    // InternalML2.g:6504:3: ( (lv_typeName_1_0= 'Number' ) )
                    // InternalML2.g:6505:4: (lv_typeName_1_0= 'Number' )
                    {
                    // InternalML2.g:6505:4: (lv_typeName_1_0= 'Number' )
                    // InternalML2.g:6506:5: lv_typeName_1_0= 'Number'
                    {
                    lv_typeName_1_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_1_0, grammarAccess.getPrimitiveTypeLiteralAccess().getTypeNameNumberKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeLiteralRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_1_0, "Number");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6519:3: ( (lv_typeName_2_0= 'String' ) )
                    {
                    // InternalML2.g:6519:3: ( (lv_typeName_2_0= 'String' ) )
                    // InternalML2.g:6520:4: (lv_typeName_2_0= 'String' )
                    {
                    // InternalML2.g:6520:4: (lv_typeName_2_0= 'String' )
                    // InternalML2.g:6521:5: lv_typeName_2_0= 'String'
                    {
                    lv_typeName_2_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_2_0, grammarAccess.getPrimitiveTypeLiteralAccess().getTypeNameStringKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeLiteralRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_2_0, "String");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeLiteral"


    // $ANTLR start "entryRuleSetTypeLiteral"
    // InternalML2.g:6537:1: entryRuleSetTypeLiteral returns [EObject current=null] : iv_ruleSetTypeLiteral= ruleSetTypeLiteral EOF ;
    public final EObject entryRuleSetTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetTypeLiteral = null;


        try {
            // InternalML2.g:6537:55: (iv_ruleSetTypeLiteral= ruleSetTypeLiteral EOF )
            // InternalML2.g:6538:2: iv_ruleSetTypeLiteral= ruleSetTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetTypeLiteral=ruleSetTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetTypeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetTypeLiteral"


    // $ANTLR start "ruleSetTypeLiteral"
    // InternalML2.g:6544:1: ruleSetTypeLiteral returns [EObject current=null] : ( ( (lv_typeName_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_setType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_setType_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:6550:2: ( ( ( (lv_typeName_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_setType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' ) )
            // InternalML2.g:6551:2: ( ( (lv_typeName_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_setType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' )
            {
            // InternalML2.g:6551:2: ( ( (lv_typeName_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_setType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' )
            // InternalML2.g:6552:3: ( (lv_typeName_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_setType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')'
            {
            // InternalML2.g:6552:3: ( (lv_typeName_0_0= 'Set' ) )
            // InternalML2.g:6553:4: (lv_typeName_0_0= 'Set' )
            {
            // InternalML2.g:6553:4: (lv_typeName_0_0= 'Set' )
            // InternalML2.g:6554:5: lv_typeName_0_0= 'Set'
            {
            lv_typeName_0_0=(Token)match(input,69,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_typeName_0_0, grammarAccess.getSetTypeLiteralAccess().getTypeNameSetKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSetTypeLiteralRule());
              					}
              					setWithLastConsumed(current, "typeName", lv_typeName_0_0, "Set");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetTypeLiteralAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:6570:3: ( (lv_setType_2_0= ruleTypeLiteralExpression ) )
            // InternalML2.g:6571:4: (lv_setType_2_0= ruleTypeLiteralExpression )
            {
            // InternalML2.g:6571:4: (lv_setType_2_0= ruleTypeLiteralExpression )
            // InternalML2.g:6572:5: lv_setType_2_0= ruleTypeLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetTypeLiteralAccess().getSetTypeTypeLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_setType_2_0=ruleTypeLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetTypeLiteralRule());
              					}
              					set(
              						current,
              						"setType",
              						lv_setType_2_0,
              						"br.ufes.inf.nemo.ml2.ML2.TypeLiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSetTypeLiteralAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetTypeLiteral"


    // $ANTLR start "entryRuleUserDefinedTypeLiteral"
    // InternalML2.g:6597:1: entryRuleUserDefinedTypeLiteral returns [EObject current=null] : iv_ruleUserDefinedTypeLiteral= ruleUserDefinedTypeLiteral EOF ;
    public final EObject entryRuleUserDefinedTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDefinedTypeLiteral = null;


        try {
            // InternalML2.g:6597:63: (iv_ruleUserDefinedTypeLiteral= ruleUserDefinedTypeLiteral EOF )
            // InternalML2.g:6598:2: iv_ruleUserDefinedTypeLiteral= ruleUserDefinedTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserDefinedTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUserDefinedTypeLiteral=ruleUserDefinedTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUserDefinedTypeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserDefinedTypeLiteral"


    // $ANTLR start "ruleUserDefinedTypeLiteral"
    // InternalML2.g:6604:1: ruleUserDefinedTypeLiteral returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUserDefinedTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalML2.g:6610:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalML2.g:6611:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalML2.g:6611:2: ( (otherlv_0= RULE_ID ) )
            // InternalML2.g:6612:3: (otherlv_0= RULE_ID )
            {
            // InternalML2.g:6612:3: (otherlv_0= RULE_ID )
            // InternalML2.g:6613:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getUserDefinedTypeLiteralRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getUserDefinedTypeLiteralAccess().getTypeNameClassCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserDefinedTypeLiteral"


    // $ANTLR start "entryRuleBOOLEAN_LITERAL"
    // InternalML2.g:6627:1: entryRuleBOOLEAN_LITERAL returns [String current=null] : iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF ;
    public final String entryRuleBOOLEAN_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN_LITERAL = null;


        try {
            // InternalML2.g:6627:55: (iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF )
            // InternalML2.g:6628:2: iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEAN_LITERALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN_LITERAL=ruleBOOLEAN_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN_LITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN_LITERAL"


    // $ANTLR start "ruleBOOLEAN_LITERAL"
    // InternalML2.g:6634:1: ruleBOOLEAN_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalML2.g:6640:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalML2.g:6641:2: (kw= 'true' | kw= 'false' )
            {
            // InternalML2.g:6641:2: (kw= 'true' | kw= 'false' )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==45) ) {
                alt118=1;
            }
            else if ( (LA118_0==46) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalML2.g:6642:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:6648:3: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN_LITERAL"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // InternalML2.g:6657:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalML2.g:6657:54: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalML2.g:6658:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // InternalML2.g:6664:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalML2.g:6670:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalML2.g:6671:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalML2.g:6671:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalML2.g:6672:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalML2.g:6679:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==16) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalML2.g:6680:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_2, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "ruleCategorizationType"
    // InternalML2.g:6697:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:6703:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalML2.g:6704:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalML2.g:6704:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt120=1;
                }
                break;
            case 74:
                {
                alt120=2;
                }
                break;
            case 75:
                {
                alt120=3;
                }
                break;
            case 76:
                {
                alt120=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // InternalML2.g:6705:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalML2.g:6705:3: (enumLiteral_0= 'categorizes' )
                    // InternalML2.g:6706:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6713:3: (enumLiteral_1= 'completeCategorizes' )
                    {
                    // InternalML2.g:6713:3: (enumLiteral_1= 'completeCategorizes' )
                    // InternalML2.g:6714:4: enumLiteral_1= 'completeCategorizes'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6721:3: (enumLiteral_2= 'disjointCategorizes' )
                    {
                    // InternalML2.g:6721:3: (enumLiteral_2= 'disjointCategorizes' )
                    // InternalML2.g:6722:4: enumLiteral_2= 'disjointCategorizes'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6729:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalML2.g:6729:3: (enumLiteral_3= 'partitions' )
                    // InternalML2.g:6730:4: enumLiteral_3= 'partitions'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategorizationType"


    // $ANTLR start "rulePrimitiveType"
    // InternalML2.g:6740:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:6746:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) )
            // InternalML2.g:6747:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            {
            // InternalML2.g:6747:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            int alt121=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt121=1;
                }
                break;
            case 71:
                {
                alt121=2;
                }
                break;
            case 70:
                {
                alt121=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalML2.g:6748:3: (enumLiteral_0= 'String' )
                    {
                    // InternalML2.g:6748:3: (enumLiteral_0= 'String' )
                    // InternalML2.g:6749:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6756:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalML2.g:6756:3: (enumLiteral_1= 'Number' )
                    // InternalML2.g:6757:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6764:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalML2.g:6764:3: (enumLiteral_2= 'Boolean' )
                    // InternalML2.g:6765:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleRegularityFeatureType"
    // InternalML2.g:6775:1: ruleRegularityFeatureType returns [Enumerator current=null] : ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) ) ;
    public final Enumerator ruleRegularityFeatureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalML2.g:6781:2: ( ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) ) )
            // InternalML2.g:6782:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) )
            {
            // InternalML2.g:6782:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) )
            int alt122=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt122=1;
                }
                break;
            case 78:
                {
                alt122=2;
                }
                break;
            case 79:
                {
                alt122=3;
                }
                break;
            case 80:
                {
                alt122=4;
                }
                break;
            case 81:
                {
                alt122=5;
                }
                break;
            case 82:
                {
                alt122=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // InternalML2.g:6783:3: (enumLiteral_0= 'determinesMaxValue' )
                    {
                    // InternalML2.g:6783:3: (enumLiteral_0= 'determinesMaxValue' )
                    // InternalML2.g:6784:4: enumLiteral_0= 'determinesMaxValue'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6791:3: (enumLiteral_1= 'determinesMinValue' )
                    {
                    // InternalML2.g:6791:3: (enumLiteral_1= 'determinesMinValue' )
                    // InternalML2.g:6792:4: enumLiteral_1= 'determinesMinValue'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6799:3: (enumLiteral_2= 'determinesValue' )
                    {
                    // InternalML2.g:6799:3: (enumLiteral_2= 'determinesValue' )
                    // InternalML2.g:6800:4: enumLiteral_2= 'determinesValue'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6807:3: (enumLiteral_3= 'determinesAllowedValues' )
                    {
                    // InternalML2.g:6807:3: (enumLiteral_3= 'determinesAllowedValues' )
                    // InternalML2.g:6808:4: enumLiteral_3= 'determinesAllowedValues'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:6815:3: (enumLiteral_4= 'determinesType' )
                    {
                    // InternalML2.g:6815:3: (enumLiteral_4= 'determinesType' )
                    // InternalML2.g:6816:4: enumLiteral_4= 'determinesType'
                    {
                    enumLiteral_4=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:6823:3: (enumLiteral_5= 'determinesAllowedTypes' )
                    {
                    // InternalML2.g:6823:3: (enumLiteral_5= 'determinesAllowedTypes' )
                    // InternalML2.g:6824:4: enumLiteral_5= 'determinesAllowedTypes'
                    {
                    enumLiteral_5=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularityFeatureType"


    // $ANTLR start "ruleComparisonOperator"
    // InternalML2.g:6834:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalML2.g:6840:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalML2.g:6841:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalML2.g:6841:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==44) ) {
                alt123=1;
            }
            else if ( (LA123_0==83) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalML2.g:6842:3: (enumLiteral_0= '=' )
                    {
                    // InternalML2.g:6842:3: (enumLiteral_0= '=' )
                    // InternalML2.g:6843:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6850:3: (enumLiteral_1= '<>' )
                    {
                    // InternalML2.g:6850:3: (enumLiteral_1= '<>' )
                    // InternalML2.g:6851:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalML2.g:6861:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:6867:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) )
            // InternalML2.g:6868:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalML2.g:6868:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            int alt124=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt124=1;
                }
                break;
            case 85:
                {
                alt124=2;
                }
                break;
            case 86:
                {
                alt124=3;
                }
                break;
            case 87:
                {
                alt124=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // InternalML2.g:6869:3: (enumLiteral_0= '>' )
                    {
                    // InternalML2.g:6869:3: (enumLiteral_0= '>' )
                    // InternalML2.g:6870:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOperatorAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGREATEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6877:3: (enumLiteral_1= '<' )
                    {
                    // InternalML2.g:6877:3: (enumLiteral_1= '<' )
                    // InternalML2.g:6878:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOperatorAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getLESSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6885:3: (enumLiteral_2= '>=' )
                    {
                    // InternalML2.g:6885:3: (enumLiteral_2= '>=' )
                    // InternalML2.g:6886:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6893:3: (enumLiteral_3= '<=' )
                    {
                    // InternalML2.g:6893:3: (enumLiteral_3= '<=' )
                    // InternalML2.g:6894:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleAdditionOperator"
    // InternalML2.g:6904:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalML2.g:6910:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalML2.g:6911:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalML2.g:6911:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==88) ) {
                alt125=1;
            }
            else if ( (LA125_0==47) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalML2.g:6912:3: (enumLiteral_0= '+' )
                    {
                    // InternalML2.g:6912:3: (enumLiteral_0= '+' )
                    // InternalML2.g:6913:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6920:3: (enumLiteral_1= '-' )
                    {
                    // InternalML2.g:6920:3: (enumLiteral_1= '-' )
                    // InternalML2.g:6921:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalML2.g:6931:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalML2.g:6937:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalML2.g:6938:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalML2.g:6938:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==43) ) {
                alt126=1;
            }
            else if ( (LA126_0==89) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalML2.g:6939:3: (enumLiteral_0= '*' )
                    {
                    // InternalML2.g:6939:3: (enumLiteral_0= '*' )
                    // InternalML2.g:6940:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6947:3: (enumLiteral_1= '/' )
                    {
                    // InternalML2.g:6947:3: (enumLiteral_1= '/' )
                    // InternalML2.g:6948:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicationOperatorAccess().getOVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getOVEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalML2.g:6958:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:6964:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) ) )
            // InternalML2.g:6965:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) )
            {
            // InternalML2.g:6965:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) )
            int alt127=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt127=1;
                }
                break;
            case 91:
                {
                alt127=2;
                }
                break;
            case 47:
                {
                alt127=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalML2.g:6966:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalML2.g:6966:3: (enumLiteral_0= 'NONE' )
                    // InternalML2.g:6967:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6974:3: (enumLiteral_1= 'not' )
                    {
                    // InternalML2.g:6974:3: (enumLiteral_1= 'not' )
                    // InternalML2.g:6975:4: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6982:3: (enumLiteral_2= '-' )
                    {
                    // InternalML2.g:6982:3: (enumLiteral_2= '-' )
                    // InternalML2.g:6983:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleUnaryNumberOperator"
    // InternalML2.g:6993:1: ruleUnaryNumberOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'abs' ) | (enumLiteral_1= 'floor' ) | (enumLiteral_2= 'round' ) | (enumLiteral_3= 'oclIsUndefined' ) ) ;
    public final Enumerator ruleUnaryNumberOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:6999:2: ( ( (enumLiteral_0= 'abs' ) | (enumLiteral_1= 'floor' ) | (enumLiteral_2= 'round' ) | (enumLiteral_3= 'oclIsUndefined' ) ) )
            // InternalML2.g:7000:2: ( (enumLiteral_0= 'abs' ) | (enumLiteral_1= 'floor' ) | (enumLiteral_2= 'round' ) | (enumLiteral_3= 'oclIsUndefined' ) )
            {
            // InternalML2.g:7000:2: ( (enumLiteral_0= 'abs' ) | (enumLiteral_1= 'floor' ) | (enumLiteral_2= 'round' ) | (enumLiteral_3= 'oclIsUndefined' ) )
            int alt128=4;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt128=1;
                }
                break;
            case 93:
                {
                alt128=2;
                }
                break;
            case 94:
                {
                alt128=3;
                }
                break;
            case 95:
                {
                alt128=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // InternalML2.g:7001:3: (enumLiteral_0= 'abs' )
                    {
                    // InternalML2.g:7001:3: (enumLiteral_0= 'abs' )
                    // InternalML2.g:7002:4: enumLiteral_0= 'abs'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryNumberOperatorAccess().getABSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryNumberOperatorAccess().getABSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:7009:3: (enumLiteral_1= 'floor' )
                    {
                    // InternalML2.g:7009:3: (enumLiteral_1= 'floor' )
                    // InternalML2.g:7010:4: enumLiteral_1= 'floor'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryNumberOperatorAccess().getFLOOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryNumberOperatorAccess().getFLOOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:7017:3: (enumLiteral_2= 'round' )
                    {
                    // InternalML2.g:7017:3: (enumLiteral_2= 'round' )
                    // InternalML2.g:7018:4: enumLiteral_2= 'round'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryNumberOperatorAccess().getROUNDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnaryNumberOperatorAccess().getROUNDEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:7025:3: (enumLiteral_3= 'oclIsUndefined' )
                    {
                    // InternalML2.g:7025:3: (enumLiteral_3= 'oclIsUndefined' )
                    // InternalML2.g:7026:4: enumLiteral_3= 'oclIsUndefined'
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryNumberOperatorAccess().getOCL_IS_UNDEFINEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnaryNumberOperatorAccess().getOCL_IS_UNDEFINEDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryNumberOperator"


    // $ANTLR start "ruleBinaryNumberOperator"
    // InternalML2.g:7036:1: ruleBinaryNumberOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'div' ) ) ;
    public final Enumerator ruleBinaryNumberOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:7042:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'div' ) ) )
            // InternalML2.g:7043:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'div' ) )
            {
            // InternalML2.g:7043:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'div' ) )
            int alt129=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt129=1;
                }
                break;
            case 97:
                {
                alt129=2;
                }
                break;
            case 98:
                {
                alt129=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // InternalML2.g:7044:3: (enumLiteral_0= 'min' )
                    {
                    // InternalML2.g:7044:3: (enumLiteral_0= 'min' )
                    // InternalML2.g:7045:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryNumberOperatorAccess().getMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryNumberOperatorAccess().getMINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:7052:3: (enumLiteral_1= 'max' )
                    {
                    // InternalML2.g:7052:3: (enumLiteral_1= 'max' )
                    // InternalML2.g:7053:4: enumLiteral_1= 'max'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryNumberOperatorAccess().getMAXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryNumberOperatorAccess().getMAXEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:7060:3: (enumLiteral_2= 'div' )
                    {
                    // InternalML2.g:7060:3: (enumLiteral_2= 'div' )
                    // InternalML2.g:7061:4: enumLiteral_2= 'div'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryNumberOperatorAccess().getDIVEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBinaryNumberOperatorAccess().getDIVEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryNumberOperator"


    // $ANTLR start "ruleUnarySetOperator"
    // InternalML2.g:7071:1: ruleUnarySetOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) | (enumLiteral_6= 'asSet' ) | (enumLiteral_7= 'flatten' ) ) ;
    public final Enumerator ruleUnarySetOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalML2.g:7077:2: ( ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) | (enumLiteral_6= 'asSet' ) | (enumLiteral_7= 'flatten' ) ) )
            // InternalML2.g:7078:2: ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) | (enumLiteral_6= 'asSet' ) | (enumLiteral_7= 'flatten' ) )
            {
            // InternalML2.g:7078:2: ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) | (enumLiteral_6= 'asSet' ) | (enumLiteral_7= 'flatten' ) )
            int alt130=8;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt130=1;
                }
                break;
            case 100:
                {
                alt130=2;
                }
                break;
            case 101:
                {
                alt130=3;
                }
                break;
            case 102:
                {
                alt130=4;
                }
                break;
            case 96:
                {
                alt130=5;
                }
                break;
            case 97:
                {
                alt130=6;
                }
                break;
            case 103:
                {
                alt130=7;
                }
                break;
            case 104:
                {
                alt130=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // InternalML2.g:7079:3: (enumLiteral_0= 'size' )
                    {
                    // InternalML2.g:7079:3: (enumLiteral_0= 'size' )
                    // InternalML2.g:7080:4: enumLiteral_0= 'size'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getSIZEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnarySetOperatorAccess().getSIZEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:7087:3: (enumLiteral_1= 'isEmpty' )
                    {
                    // InternalML2.g:7087:3: (enumLiteral_1= 'isEmpty' )
                    // InternalML2.g:7088:4: enumLiteral_1= 'isEmpty'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getIS_EMPTYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnarySetOperatorAccess().getIS_EMPTYEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:7095:3: (enumLiteral_2= 'notEmpty' )
                    {
                    // InternalML2.g:7095:3: (enumLiteral_2= 'notEmpty' )
                    // InternalML2.g:7096:4: enumLiteral_2= 'notEmpty'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getNOT_EMPTYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnarySetOperatorAccess().getNOT_EMPTYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:7103:3: (enumLiteral_3= 'sum' )
                    {
                    // InternalML2.g:7103:3: (enumLiteral_3= 'sum' )
                    // InternalML2.g:7104:4: enumLiteral_3= 'sum'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getSUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnarySetOperatorAccess().getSUMEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:7111:3: (enumLiteral_4= 'min' )
                    {
                    // InternalML2.g:7111:3: (enumLiteral_4= 'min' )
                    // InternalML2.g:7112:4: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getUnarySetOperatorAccess().getMINEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:7119:3: (enumLiteral_5= 'max' )
                    {
                    // InternalML2.g:7119:3: (enumLiteral_5= 'max' )
                    // InternalML2.g:7120:4: enumLiteral_5= 'max'
                    {
                    enumLiteral_5=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getMAXEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getUnarySetOperatorAccess().getMAXEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalML2.g:7127:3: (enumLiteral_6= 'asSet' )
                    {
                    // InternalML2.g:7127:3: (enumLiteral_6= 'asSet' )
                    // InternalML2.g:7128:4: enumLiteral_6= 'asSet'
                    {
                    enumLiteral_6=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getAS_SETEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getUnarySetOperatorAccess().getAS_SETEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalML2.g:7135:3: (enumLiteral_7= 'flatten' )
                    {
                    // InternalML2.g:7135:3: (enumLiteral_7= 'flatten' )
                    // InternalML2.g:7136:4: enumLiteral_7= 'flatten'
                    {
                    enumLiteral_7=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getFLATTENEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getUnarySetOperatorAccess().getFLATTENEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnarySetOperator"


    // $ANTLR start "ruleBinarySetOperator"
    // InternalML2.g:7146:1: ruleBinarySetOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'count' ) | (enumLiteral_7= 'union' ) | (enumLiteral_8= 'intersection' ) | (enumLiteral_9= 'symmetricDifference' ) ) ;
    public final Enumerator ruleBinarySetOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalML2.g:7152:2: ( ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'count' ) | (enumLiteral_7= 'union' ) | (enumLiteral_8= 'intersection' ) | (enumLiteral_9= 'symmetricDifference' ) ) )
            // InternalML2.g:7153:2: ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'count' ) | (enumLiteral_7= 'union' ) | (enumLiteral_8= 'intersection' ) | (enumLiteral_9= 'symmetricDifference' ) )
            {
            // InternalML2.g:7153:2: ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'count' ) | (enumLiteral_7= 'union' ) | (enumLiteral_8= 'intersection' ) | (enumLiteral_9= 'symmetricDifference' ) )
            int alt131=10;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt131=1;
                }
                break;
            case 106:
                {
                alt131=2;
                }
                break;
            case 107:
                {
                alt131=3;
                }
                break;
            case 108:
                {
                alt131=4;
                }
                break;
            case 109:
                {
                alt131=5;
                }
                break;
            case 110:
                {
                alt131=6;
                }
                break;
            case 111:
                {
                alt131=7;
                }
                break;
            case 112:
                {
                alt131=8;
                }
                break;
            case 113:
                {
                alt131=9;
                }
                break;
            case 114:
                {
                alt131=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalML2.g:7154:3: (enumLiteral_0= 'includes' )
                    {
                    // InternalML2.g:7154:3: (enumLiteral_0= 'includes' )
                    // InternalML2.g:7155:4: enumLiteral_0= 'includes'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINCLUDESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinarySetOperatorAccess().getINCLUDESEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:7162:3: (enumLiteral_1= 'includesAll' )
                    {
                    // InternalML2.g:7162:3: (enumLiteral_1= 'includesAll' )
                    // InternalML2.g:7163:4: enumLiteral_1= 'includesAll'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINCLUDES_ALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinarySetOperatorAccess().getINCLUDES_ALLEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:7170:3: (enumLiteral_2= 'excludes' )
                    {
                    // InternalML2.g:7170:3: (enumLiteral_2= 'excludes' )
                    // InternalML2.g:7171:4: enumLiteral_2= 'excludes'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getEXCLUDESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBinarySetOperatorAccess().getEXCLUDESEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:7178:3: (enumLiteral_3= 'excludesAll' )
                    {
                    // InternalML2.g:7178:3: (enumLiteral_3= 'excludesAll' )
                    // InternalML2.g:7179:4: enumLiteral_3= 'excludesAll'
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getEXCLUDES_ALLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBinarySetOperatorAccess().getEXCLUDES_ALLEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:7186:3: (enumLiteral_4= 'including' )
                    {
                    // InternalML2.g:7186:3: (enumLiteral_4= 'including' )
                    // InternalML2.g:7187:4: enumLiteral_4= 'including'
                    {
                    enumLiteral_4=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINCLUDINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBinarySetOperatorAccess().getINCLUDINGEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:7194:3: (enumLiteral_5= 'excluding' )
                    {
                    // InternalML2.g:7194:3: (enumLiteral_5= 'excluding' )
                    // InternalML2.g:7195:4: enumLiteral_5= 'excluding'
                    {
                    enumLiteral_5=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getEXCLUDINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getBinarySetOperatorAccess().getEXCLUDINGEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalML2.g:7202:3: (enumLiteral_6= 'count' )
                    {
                    // InternalML2.g:7202:3: (enumLiteral_6= 'count' )
                    // InternalML2.g:7203:4: enumLiteral_6= 'count'
                    {
                    enumLiteral_6=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getCOUNTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getBinarySetOperatorAccess().getCOUNTEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalML2.g:7210:3: (enumLiteral_7= 'union' )
                    {
                    // InternalML2.g:7210:3: (enumLiteral_7= 'union' )
                    // InternalML2.g:7211:4: enumLiteral_7= 'union'
                    {
                    enumLiteral_7=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getUNIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getBinarySetOperatorAccess().getUNIONEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalML2.g:7218:3: (enumLiteral_8= 'intersection' )
                    {
                    // InternalML2.g:7218:3: (enumLiteral_8= 'intersection' )
                    // InternalML2.g:7219:4: enumLiteral_8= 'intersection'
                    {
                    enumLiteral_8=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINTERSECTIONEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getBinarySetOperatorAccess().getINTERSECTIONEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalML2.g:7226:3: (enumLiteral_9= 'symmetricDifference' )
                    {
                    // InternalML2.g:7226:3: (enumLiteral_9= 'symmetricDifference' )
                    // InternalML2.g:7227:4: enumLiteral_9= 'symmetricDifference'
                    {
                    enumLiteral_9=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getSYMMETRIC_DIFFERENCEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getBinarySetOperatorAccess().getSYMMETRIC_DIFFERENCEEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinarySetOperator"


    // $ANTLR start "ruleUnaryIterator"
    // InternalML2.g:7237:1: ruleUnaryIterator returns [Enumerator current=null] : ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) | (enumLiteral_2= 'collect' ) | (enumLiteral_3= 'any' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'closure' ) ) ;
    public final Enumerator ruleUnaryIterator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalML2.g:7243:2: ( ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) | (enumLiteral_2= 'collect' ) | (enumLiteral_3= 'any' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'closure' ) ) )
            // InternalML2.g:7244:2: ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) | (enumLiteral_2= 'collect' ) | (enumLiteral_3= 'any' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'closure' ) )
            {
            // InternalML2.g:7244:2: ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) | (enumLiteral_2= 'collect' ) | (enumLiteral_3= 'any' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'closure' ) )
            int alt132=7;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt132=1;
                }
                break;
            case 116:
                {
                alt132=2;
                }
                break;
            case 117:
                {
                alt132=3;
                }
                break;
            case 118:
                {
                alt132=4;
                }
                break;
            case 119:
                {
                alt132=5;
                }
                break;
            case 120:
                {
                alt132=6;
                }
                break;
            case 121:
                {
                alt132=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalML2.g:7245:3: (enumLiteral_0= 'select' )
                    {
                    // InternalML2.g:7245:3: (enumLiteral_0= 'select' )
                    // InternalML2.g:7246:4: enumLiteral_0= 'select'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getSELECTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryIteratorAccess().getSELECTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:7253:3: (enumLiteral_1= 'reject' )
                    {
                    // InternalML2.g:7253:3: (enumLiteral_1= 'reject' )
                    // InternalML2.g:7254:4: enumLiteral_1= 'reject'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getREJECTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryIteratorAccess().getREJECTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:7261:3: (enumLiteral_2= 'collect' )
                    {
                    // InternalML2.g:7261:3: (enumLiteral_2= 'collect' )
                    // InternalML2.g:7262:4: enumLiteral_2= 'collect'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getCOLLECTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnaryIteratorAccess().getCOLLECTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:7269:3: (enumLiteral_3= 'any' )
                    {
                    // InternalML2.g:7269:3: (enumLiteral_3= 'any' )
                    // InternalML2.g:7270:4: enumLiteral_3= 'any'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getANYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnaryIteratorAccess().getANYEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:7277:3: (enumLiteral_4= 'one' )
                    {
                    // InternalML2.g:7277:3: (enumLiteral_4= 'one' )
                    // InternalML2.g:7278:4: enumLiteral_4= 'one'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getUnaryIteratorAccess().getONEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:7285:3: (enumLiteral_5= 'isUnique' )
                    {
                    // InternalML2.g:7285:3: (enumLiteral_5= 'isUnique' )
                    // InternalML2.g:7286:4: enumLiteral_5= 'isUnique'
                    {
                    enumLiteral_5=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getIS_UNIQUEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getUnaryIteratorAccess().getIS_UNIQUEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalML2.g:7293:3: (enumLiteral_6= 'closure' )
                    {
                    // InternalML2.g:7293:3: (enumLiteral_6= 'closure' )
                    // InternalML2.g:7294:4: enumLiteral_6= 'closure'
                    {
                    enumLiteral_6=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getCLOSUREEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getUnaryIteratorAccess().getCLOSUREEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryIterator"


    // $ANTLR start "ruleMultiaryIterator"
    // InternalML2.g:7304:1: ruleMultiaryIterator returns [Enumerator current=null] : ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) ) ;
    public final Enumerator ruleMultiaryIterator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalML2.g:7310:2: ( ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) ) )
            // InternalML2.g:7311:2: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) )
            {
            // InternalML2.g:7311:2: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==122) ) {
                alt133=1;
            }
            else if ( (LA133_0==123) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // InternalML2.g:7312:3: (enumLiteral_0= 'exists' )
                    {
                    // InternalML2.g:7312:3: (enumLiteral_0= 'exists' )
                    // InternalML2.g:7313:4: enumLiteral_0= 'exists'
                    {
                    enumLiteral_0=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiaryIteratorAccess().getEXISTSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMultiaryIteratorAccess().getEXISTSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:7320:3: (enumLiteral_1= 'forAll' )
                    {
                    // InternalML2.g:7320:3: (enumLiteral_1= 'forAll' )
                    // InternalML2.g:7321:4: enumLiteral_1= 'forAll'
                    {
                    enumLiteral_1=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiaryIteratorAccess().getFOR_ALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMultiaryIteratorAccess().getFOR_ALLEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiaryIterator"


    // $ANTLR start "ruleTypeOperator"
    // InternalML2.g:7331:1: ruleTypeOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'oclAsType' ) | (enumLiteral_1= 'oclIsKindOf' ) | (enumLiteral_2= 'oclIsTypeOf' ) ) ;
    public final Enumerator ruleTypeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:7337:2: ( ( (enumLiteral_0= 'oclAsType' ) | (enumLiteral_1= 'oclIsKindOf' ) | (enumLiteral_2= 'oclIsTypeOf' ) ) )
            // InternalML2.g:7338:2: ( (enumLiteral_0= 'oclAsType' ) | (enumLiteral_1= 'oclIsKindOf' ) | (enumLiteral_2= 'oclIsTypeOf' ) )
            {
            // InternalML2.g:7338:2: ( (enumLiteral_0= 'oclAsType' ) | (enumLiteral_1= 'oclIsKindOf' ) | (enumLiteral_2= 'oclIsTypeOf' ) )
            int alt134=3;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt134=1;
                }
                break;
            case 125:
                {
                alt134=2;
                }
                break;
            case 126:
                {
                alt134=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // InternalML2.g:7339:3: (enumLiteral_0= 'oclAsType' )
                    {
                    // InternalML2.g:7339:3: (enumLiteral_0= 'oclAsType' )
                    // InternalML2.g:7340:4: enumLiteral_0= 'oclAsType'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeOperatorAccess().getOCL_AS_TYPEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeOperatorAccess().getOCL_AS_TYPEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:7347:3: (enumLiteral_1= 'oclIsKindOf' )
                    {
                    // InternalML2.g:7347:3: (enumLiteral_1= 'oclIsKindOf' )
                    // InternalML2.g:7348:4: enumLiteral_1= 'oclIsKindOf'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeOperatorAccess().getOCL_IS_KIND_OFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeOperatorAccess().getOCL_IS_KIND_OFEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:7355:3: (enumLiteral_2= 'oclIsTypeOf' )
                    {
                    // InternalML2.g:7355:3: (enumLiteral_2= 'oclIsTypeOf' )
                    // InternalML2.g:7356:4: enumLiteral_2= 'oclIsTypeOf'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeOperatorAccess().getOCL_IS_TYPE_OFEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTypeOperatorAccess().getOCL_IS_TYPE_OFEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeOperator"

    // $ANTLR start synpred1_InternalML2
    public final void synpred1_InternalML2_fragment() throws RecognitionException {   
        // InternalML2.g:5220:4: ( ruleCallExpression )
        // InternalML2.g:5220:5: ruleCallExpression
        {
        pushFollow(FOLLOW_2);
        ruleCallExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalML2

    // Delegated rules

    public final boolean synpred1_InternalML2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalML2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA53 dfa53 = new DFA53(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA101 dfa101 = new DFA101(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\6\uffff\4\15\6\uffff\2\15\5\uffff\2\15\1\uffff\1\15";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\24\1\4\1\5\4\4\2\45\1\4\1\uffff\1\4\1\5\2\4\2\46\7\4";
    static final String dfa_4s = "\1\50\1\uffff\1\4\1\24\1\110\1\53\4\122\2\45\1\4\1\uffff\1\4\1\53\2\122\2\46\2\4\1\110\2\122\1\4\1\122";
    static final String dfa_5s = "\1\uffff\1\1\13\uffff\1\2\15\uffff";
    static final String dfa_6s = "\33\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\36\uffff\1\2\4\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\11\37\uffff\1\5\41\uffff\1\10\1\7\1\6",
            "\1\13\45\uffff\1\12",
            "\1\15\12\uffff\1\15\23\uffff\1\15\3\uffff\1\14\2\15\43\uffff\6\1",
            "\1\15\12\uffff\1\15\23\uffff\1\15\3\uffff\1\14\2\15\43\uffff\6\1",
            "\1\15\12\uffff\1\15\23\uffff\1\15\3\uffff\1\14\2\15\43\uffff\6\1",
            "\1\15\12\uffff\1\15\1\16\22\uffff\1\15\3\uffff\1\14\2\15\43\uffff\6\1",
            "\1\17",
            "\1\17",
            "\1\20",
            "",
            "\1\21",
            "\1\23\45\uffff\1\22",
            "\1\15\12\uffff\1\15\1\24\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\43\uffff\6\1",
            "\1\15\12\uffff\1\15\1\16\22\uffff\1\15\3\uffff\1\14\2\15\43\uffff\6\1",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\11\101\uffff\1\10\1\7\1\6",
            "\1\15\12\uffff\1\15\1\24\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\43\uffff\6\1",
            "\1\15\12\uffff\1\15\1\31\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\43\uffff\6\1",
            "\1\32",
            "\1\15\12\uffff\1\15\1\31\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\43\uffff\6\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1826:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )";
        }
    }
    static final String dfa_8s = "\34\uffff";
    static final String dfa_9s = "\6\uffff\1\14\7\uffff\3\14\6\uffff\3\14\1\uffff\1\14";
    static final String dfa_10s = "\1\50\1\uffff\1\4\1\24\1\4\1\5\1\4\2\45\3\4\1\uffff\1\5\3\4\2\46\11\4";
    static final String dfa_11s = "\1\51\1\uffff\1\4\1\24\1\44\1\53\1\122\2\45\3\4\1\uffff\1\53\3\122\2\46\4\4\3\122\1\4\1\122";
    static final String dfa_12s = "\1\uffff\1\1\12\uffff\1\2\17\uffff";
    static final String dfa_13s = "\34\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\6\37\uffff\1\5",
            "\1\10\45\uffff\1\7",
            "\1\14\12\uffff\1\14\1\11\22\uffff\1\14\3\uffff\1\12\2\14\1\13\42\uffff\6\1",
            "\1\15",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "\1\22\45\uffff\1\21",
            "\1\14\12\uffff\1\14\1\11\22\uffff\1\14\3\uffff\1\12\2\14\1\13\42\uffff\6\1",
            "\1\14\12\uffff\1\14\1\23\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\42\uffff\6\1",
            "\1\14\12\uffff\1\14\1\25\22\uffff\1\14\4\uffff\2\14\43\uffff\6\1",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\6",
            "\1\14\12\uffff\1\14\1\23\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\42\uffff\6\1",
            "\1\14\12\uffff\1\14\1\32\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\42\uffff\6\1",
            "\1\14\12\uffff\1\14\1\25\22\uffff\1\14\4\uffff\2\14\43\uffff\6\1",
            "\1\33",
            "\1\14\12\uffff\1\14\1\32\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\42\uffff\6\1"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2240:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )";
        }
    }
    static final String dfa_15s = "\17\uffff";
    static final String dfa_16s = "\3\4\2\20\4\4\1\20\2\uffff\1\20\2\uffff";
    static final String dfa_17s = "\1\51\2\4\2\54\1\4\1\57\1\4\1\14\1\54\2\uffff\1\54\2\uffff";
    static final String dfa_18s = "\12\uffff\1\4\1\3\1\uffff\1\1\1\2";
    static final String dfa_19s = "\17\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\36\uffff\1\2\5\uffff\1\1",
            "\1\4",
            "\1\3",
            "\1\5\33\uffff\1\6",
            "\1\7\33\uffff\1\10",
            "\1\11",
            "\3\13\5\uffff\1\12\27\uffff\1\13\10\uffff\3\13",
            "\1\14",
            "\1\15\7\uffff\1\16",
            "\1\5\33\uffff\1\6",
            "",
            "",
            "\1\7\33\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2718:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )";
        }
    }
    static final String dfa_21s = "\7\uffff";
    static final String dfa_22s = "\1\4\1\20\2\4\1\20\2\uffff";
    static final String dfa_23s = "\1\4\1\54\1\4\1\57\1\54\2\uffff";
    static final String dfa_24s = "\5\uffff\1\1\1\2";
    static final String dfa_25s = "\7\uffff}>";
    static final String[] dfa_26s = {
            "\1\1",
            "\1\2\33\uffff\1\3",
            "\1\4",
            "\3\5\5\uffff\1\6\27\uffff\1\5\10\uffff\3\5",
            "\1\2\33\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "3471:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )";
        }
    }
    static final String dfa_27s = "\15\uffff";
    static final String dfa_28s = "\1\4\5\0\7\uffff";
    static final String dfa_29s = "\1\110\5\0\7\uffff";
    static final String dfa_30s = "\6\uffff\1\1\1\2\4\uffff\1\3";
    static final String dfa_31s = "\1\0\1\1\1\2\1\3\1\4\1\5\7\uffff}>";
    static final String[] dfa_32s = {
            "\1\5\2\7\46\uffff\2\7\17\uffff\1\14\4\uffff\1\6\1\7\1\4\1\1\1\2\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "5218:2: ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA101_0 = input.LA(1);

                         
                        int index101_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA101_0==70) ) {s = 1;}

                        else if ( (LA101_0==71) ) {s = 2;}

                        else if ( (LA101_0==72) ) {s = 3;}

                        else if ( (LA101_0==69) ) {s = 4;}

                        else if ( (LA101_0==RULE_ID) ) {s = 5;}

                        else if ( (LA101_0==67) && (synpred1_InternalML2())) {s = 6;}

                        else if ( ((LA101_0>=RULE_INT && LA101_0<=RULE_STRING)||(LA101_0>=45 && LA101_0<=46)||LA101_0==68) ) {s = 7;}

                        else if ( (LA101_0==62) ) {s = 12;}

                         
                        input.seek(index101_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA101_1 = input.LA(1);

                         
                        int index101_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalML2()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index101_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA101_2 = input.LA(1);

                         
                        int index101_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalML2()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index101_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA101_3 = input.LA(1);

                         
                        int index101_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalML2()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index101_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA101_4 = input.LA(1);

                         
                        int index101_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalML2()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index101_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA101_5 = input.LA(1);

                         
                        int index101_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalML2()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index101_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 101, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00010000F34CA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020800008010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000901002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000A01002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000030800008010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C901002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000CA01002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C201002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008201002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000010L,0x00000000000001C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L,0x00000000000001C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L,0x000000000007E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000200000L,0x000000000007E000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000200002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000048000000000L,0x000000000007E000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000048000200000L,0x000000000007E000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000E01000000070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4050E00000000070L,0x000000000C0001F8L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0004000000100000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L,0x00000000000001E0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000000200000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000100000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000800000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000080000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000010L,0x70000007F00001E8L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x7FFFFFFB00000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000004L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000010L,0x00000000000001E8L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000600000008060L,0x0000000000000010L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000600000000060L,0x0000000000000010L});

}
