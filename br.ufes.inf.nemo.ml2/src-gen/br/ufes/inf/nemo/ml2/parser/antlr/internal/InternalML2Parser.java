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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'include'", "';'", "'}'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'class'", "'specializes'", "'datatype'", "'order'", "'subordinatedTo'", "'isPowertypeOf'", "'orderless'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'att'", "'['", "'..'", "']'", "'subsets'", "'regularity'", "'ref'", "'isOppositeTo'", "'*'", "'='", "'true'", "'false'", "'-'", "'context'", "'inv'", "'::'", "'derive'", "'let'", "'in'", "'if'", "'then'", "'else'", "'endif'", "'implies'", "'xor'", "'or'", "'and'", "'('", "')'", "'->'", "'|'", "'forAll'", "'null'", "'Set'", "'Tuple'", "'self'", "'Boolean'", "'Number'", "'String'", "'OclAny'", "'OclVoid'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'determinesMaxValue'", "'determinesMinValue'", "'determinesValue'", "'determinesAllowedValues'", "'determinesType'", "'determinesAllowedTypes'", "'<>'", "'>'", "'<'", "'>='", "'<='", "'+'", "'NONE'", "'not'", "'size'", "'isEmpty'", "'notEmpty'", "'sum'", "'includes'", "'includesAll'", "'excludes'", "'excludesAll'", "'including'", "'excluding'", "'union'", "'intersection'", "'symmetricDifference'", "'count'", "'exists'", "'select'", "'reject'", "'one'", "'isUnique'", "'collect'"
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
    public static final int T__63=63;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
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
                else if ( (LA1_0==RULE_ID||(LA1_0>=18 && LA1_0<=19)||LA1_0==22||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=28 && LA1_0<=31)||LA1_0==35||(LA1_0>=40 && LA1_0<=41)||LA1_0==48) ) {
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
    // InternalML2.g:288:1: ruleModelElement returns [EObject current=null] : ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment | this_ConstraintDeclaration_5= ruleConstraintDeclaration ) otherlv_6= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        EObject this_Import_0 = null;

        EObject this_EntityDeclaration_1 = null;

        EObject this_GeneralizationSet_2 = null;

        EObject this_Feature_3 = null;

        EObject this_FeatureAssignment_4 = null;

        EObject this_ConstraintDeclaration_5 = null;



        	enterRule();

        try {
            // InternalML2.g:294:2: ( ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment | this_ConstraintDeclaration_5= ruleConstraintDeclaration ) otherlv_6= ';' ) )
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment | this_ConstraintDeclaration_5= ruleConstraintDeclaration ) otherlv_6= ';' )
            {
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment | this_ConstraintDeclaration_5= ruleConstraintDeclaration ) otherlv_6= ';' )
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment | this_ConstraintDeclaration_5= ruleConstraintDeclaration ) otherlv_6= ';'
            {
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment | this_ConstraintDeclaration_5= ruleConstraintDeclaration )
            int alt4=6;
            alt4 = dfa4.predict(input);
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
                    // InternalML2.g:324:4: this_Feature_3= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getModelElementAccess().getFeatureParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_Feature_3=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Feature_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalML2.g:333:4: this_FeatureAssignment_4= ruleFeatureAssignment
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getModelElementAccess().getFeatureAssignmentParserRuleCall_0_4());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_FeatureAssignment_4=ruleFeatureAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FeatureAssignment_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalML2.g:342:4: this_ConstraintDeclaration_5= ruleConstraintDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getModelElementAccess().getConstraintDeclarationParserRuleCall_0_5());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_ConstraintDeclaration_5=ruleConstraintDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConstraintDeclaration_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModelElementAccess().getSemicolonKeyword_1());
              		
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
    // InternalML2.g:359:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalML2.g:359:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalML2.g:360:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
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
    // InternalML2.g:366:1: ruleEntityDeclaration returns [EObject current=null] : (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Individual_1 = null;



        	enterRule();

        try {
            // InternalML2.g:372:2: ( (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) )
            // InternalML2.g:373:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
            {
            // InternalML2.g:373:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
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
                    // InternalML2.g:374:3: this_Class_0= ruleClass
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
                    // InternalML2.g:383:3: this_Individual_1= ruleIndividual
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
    // InternalML2.g:395:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalML2.g:395:46: (iv_ruleClass= ruleClass EOF )
            // InternalML2.g:396:2: iv_ruleClass= ruleClass EOF
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
    // InternalML2.g:402:1: ruleClass returns [EObject current=null] : (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        EObject this_FirstOrderClassOrDataType_0 = null;

        EObject this_HigherOrderClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:408:2: ( (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) )
            // InternalML2.g:409:2: (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass )
            {
            // InternalML2.g:409:2: (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass )
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
                    // InternalML2.g:410:3: this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType
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
                    // InternalML2.g:419:3: this_HigherOrderClass_1= ruleHigherOrderClass
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
    // InternalML2.g:431:1: entryRuleFirstOrderClassOrDataType returns [EObject current=null] : iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF ;
    public final EObject entryRuleFirstOrderClassOrDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstOrderClassOrDataType = null;


        try {
            // InternalML2.g:431:66: (iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF )
            // InternalML2.g:432:2: iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF
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
    // InternalML2.g:438:1: ruleFirstOrderClassOrDataType returns [EObject current=null] : (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFirstOrderClassOrDataType() throws RecognitionException {
        EObject current = null;

        EObject this_FirstOrderClass_0 = null;

        EObject this_DataType_1 = null;



        	enterRule();

        try {
            // InternalML2.g:444:2: ( (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType ) )
            // InternalML2.g:445:2: (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType )
            {
            // InternalML2.g:445:2: (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType )
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
                    // InternalML2.g:446:3: this_FirstOrderClass_0= ruleFirstOrderClass
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
                    // InternalML2.g:455:3: this_DataType_1= ruleDataType
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
    // InternalML2.g:467:1: entryRuleHigherOrderClass returns [EObject current=null] : iv_ruleHigherOrderClass= ruleHigherOrderClass EOF ;
    public final EObject entryRuleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderClass = null;


        try {
            // InternalML2.g:467:57: (iv_ruleHigherOrderClass= ruleHigherOrderClass EOF )
            // InternalML2.g:468:2: iv_ruleHigherOrderClass= ruleHigherOrderClass EOF
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
    // InternalML2.g:474:1: ruleHigherOrderClass returns [EObject current=null] : (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass ) ;
    public final EObject ruleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        EObject this_HighOrderClass_0 = null;

        EObject this_OrderlessClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:480:2: ( (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass ) )
            // InternalML2.g:481:2: (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass )
            {
            // InternalML2.g:481:2: (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass )
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
                    // InternalML2.g:482:3: this_HighOrderClass_0= ruleHighOrderClass
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
                    // InternalML2.g:491:3: this_OrderlessClass_1= ruleOrderlessClass
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
    // InternalML2.g:503:1: entryRuleIndividual returns [EObject current=null] : iv_ruleIndividual= ruleIndividual EOF ;
    public final EObject entryRuleIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividual = null;


        try {
            // InternalML2.g:503:51: (iv_ruleIndividual= ruleIndividual EOF )
            // InternalML2.g:504:2: iv_ruleIndividual= ruleIndividual EOF
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
    // InternalML2.g:510:1: ruleIndividual returns [EObject current=null] : (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) ;
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
            // InternalML2.g:516:2: ( (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) )
            // InternalML2.g:517:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            {
            // InternalML2.g:517:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            // InternalML2.g:518:3: otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndividualAccess().getIndividualKeyword_0());
              		
            }
            // InternalML2.g:522:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:523:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:523:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:524:5: lv_name_1_0= RULE_ID
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
            // InternalML2.g:544:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:545:4: ( ruleQualifiedName )
            {
            // InternalML2.g:545:4: ( ruleQualifiedName )
            // InternalML2.g:546:5: ruleQualifiedName
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

            // InternalML2.g:560:3: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalML2.g:561:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getIndividualAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalML2.g:565:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:566:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:566:5: ( ruleQualifiedName )
            	    // InternalML2.g:567:6: ruleQualifiedName
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

            // InternalML2.g:582:3: (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalML2.g:583:4: otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0());
                      			
                    }
                    // InternalML2.g:587:4: ( (lv_assignments_7_0= ruleFeatureAssignment ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==35||LA10_0==41) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalML2.g:588:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:588:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    // InternalML2.g:589:6: lv_assignments_7_0= ruleFeatureAssignment
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
    // InternalML2.g:615:1: entryRuleOrderedClass returns [EObject current=null] : iv_ruleOrderedClass= ruleOrderedClass EOF ;
    public final EObject entryRuleOrderedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedClass = null;


        try {
            // InternalML2.g:615:53: (iv_ruleOrderedClass= ruleOrderedClass EOF )
            // InternalML2.g:616:2: iv_ruleOrderedClass= ruleOrderedClass EOF
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
    // InternalML2.g:622:1: ruleOrderedClass returns [EObject current=null] : (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass ) ;
    public final EObject ruleOrderedClass() throws RecognitionException {
        EObject current = null;

        EObject this_HighOrderClass_0 = null;

        EObject this_FirstOrderClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:628:2: ( (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass ) )
            // InternalML2.g:629:2: (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass )
            {
            // InternalML2.g:629:2: (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass )
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
                    // InternalML2.g:630:3: this_HighOrderClass_0= ruleHighOrderClass
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
                    // InternalML2.g:639:3: this_FirstOrderClass_1= ruleFirstOrderClass
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
    // InternalML2.g:651:1: entryRuleFirstOrderClass returns [EObject current=null] : iv_ruleFirstOrderClass= ruleFirstOrderClass EOF ;
    public final EObject entryRuleFirstOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstOrderClass = null;


        try {
            // InternalML2.g:651:56: (iv_ruleFirstOrderClass= ruleFirstOrderClass EOF )
            // InternalML2.g:652:2: iv_ruleFirstOrderClass= ruleFirstOrderClass EOF
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
    // InternalML2.g:658:1: ruleFirstOrderClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
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
            // InternalML2.g:664:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalML2.g:665:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalML2.g:665:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalML2.g:666:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFirstOrderClassAccess().getClassKeyword_0());
              		
            }
            // InternalML2.g:670:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:671:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:671:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:672:5: lv_name_1_0= RULE_ID
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

            // InternalML2.g:688:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalML2.g:689:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFirstOrderClassAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalML2.g:693:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:694:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:694:5: ( ruleQualifiedName )
                    // InternalML2.g:695:6: ruleQualifiedName
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

                    // InternalML2.g:709:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalML2.g:710:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFirstOrderClassAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:714:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:715:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:715:6: ( ruleQualifiedName )
                    	    // InternalML2.g:716:7: ruleQualifiedName
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

            // InternalML2.g:732:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalML2.g:733:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFirstOrderClassAccess().getSpecializesKeyword_3_0());
                      			
                    }
                    // InternalML2.g:737:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:738:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:738:5: ( ruleQualifiedName )
                    // InternalML2.g:739:6: ruleQualifiedName
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

                    // InternalML2.g:753:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalML2.g:754:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getFirstOrderClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:758:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:759:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:759:6: ( ruleQualifiedName )
                    	    // InternalML2.g:760:7: ruleQualifiedName
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

            // InternalML2.g:776:3: (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalML2.g:777:4: otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFirstOrderClassAccess().getLeftCurlyBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:781:4: ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )*
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
                    	    // InternalML2.g:782:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:782:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:783:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:783:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    // InternalML2.g:784:7: lv_assignments_11_0= ruleFeatureAssignment
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
                    	    // InternalML2.g:802:5: ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:802:5: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalML2.g:803:6: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:803:6: (lv_features_12_0= ruleFeature )
                    	    // InternalML2.g:804:7: lv_features_12_0= ruleFeature
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
    // InternalML2.g:831:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalML2.g:831:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalML2.g:832:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalML2.g:838:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
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
            // InternalML2.g:844:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalML2.g:845:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalML2.g:845:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalML2.g:846:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalML2.g:850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:851:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:852:5: lv_name_1_0= RULE_ID
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

            // InternalML2.g:868:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalML2.g:869:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalML2.g:873:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:874:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:874:5: ( ruleQualifiedName )
                    // InternalML2.g:875:6: ruleQualifiedName
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

                    // InternalML2.g:889:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalML2.g:890:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:894:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:895:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:895:6: ( ruleQualifiedName )
                    	    // InternalML2.g:896:7: ruleQualifiedName
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

            // InternalML2.g:912:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalML2.g:913:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getSpecializesKeyword_3_0());
                      			
                    }
                    // InternalML2.g:917:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:918:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:918:5: ( ruleQualifiedName )
                    // InternalML2.g:919:6: ruleQualifiedName
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

                    // InternalML2.g:933:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalML2.g:934:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:938:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:939:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:939:6: ( ruleQualifiedName )
                    	    // InternalML2.g:940:7: ruleQualifiedName
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

            // InternalML2.g:956:3: (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalML2.g:957:4: otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:961:4: ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )*
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
                    	    // InternalML2.g:962:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:962:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:963:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:963:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    // InternalML2.g:964:7: lv_assignments_11_0= ruleFeatureAssignment
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
                    	    // InternalML2.g:982:5: ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:982:5: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalML2.g:983:6: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:983:6: (lv_features_12_0= ruleFeature )
                    	    // InternalML2.g:984:7: lv_features_12_0= ruleFeature
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
    // InternalML2.g:1011:1: entryRuleHighOrderClass returns [EObject current=null] : iv_ruleHighOrderClass= ruleHighOrderClass EOF ;
    public final EObject entryRuleHighOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighOrderClass = null;


        try {
            // InternalML2.g:1011:55: (iv_ruleHighOrderClass= ruleHighOrderClass EOF )
            // InternalML2.g:1012:2: iv_ruleHighOrderClass= ruleHighOrderClass EOF
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
    // InternalML2.g:1018:1: ruleHighOrderClass returns [EObject current=null] : (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? ) ;
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
            // InternalML2.g:1024:2: ( (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? ) )
            // InternalML2.g:1025:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? )
            {
            // InternalML2.g:1025:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? )
            // InternalML2.g:1026:3: otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHighOrderClassAccess().getOrderKeyword_0());
              		
            }
            // InternalML2.g:1030:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalML2.g:1031:4: (lv_order_1_0= RULE_INT )
            {
            // InternalML2.g:1031:4: (lv_order_1_0= RULE_INT )
            // InternalML2.g:1032:5: lv_order_1_0= RULE_INT
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
            // InternalML2.g:1052:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalML2.g:1053:4: (lv_name_3_0= RULE_ID )
            {
            // InternalML2.g:1053:4: (lv_name_3_0= RULE_ID )
            // InternalML2.g:1054:5: lv_name_3_0= RULE_ID
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

            // InternalML2.g:1070:3: (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalML2.g:1071:4: otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getHighOrderClassAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalML2.g:1075:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1076:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1076:5: ( ruleQualifiedName )
                    // InternalML2.g:1077:6: ruleQualifiedName
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

                    // InternalML2.g:1091:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalML2.g:1092:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getHighOrderClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1096:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1097:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1097:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1098:7: ruleQualifiedName
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

            // InternalML2.g:1114:3: (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalML2.g:1115:4: otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getHighOrderClassAccess().getSpecializesKeyword_5_0());
                      			
                    }
                    // InternalML2.g:1119:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1120:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1120:5: ( ruleQualifiedName )
                    // InternalML2.g:1121:6: ruleQualifiedName
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

                    // InternalML2.g:1135:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalML2.g:1136:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getHighOrderClassAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1140:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1141:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1141:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1142:7: ruleQualifiedName
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

            // InternalML2.g:1158:3: (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalML2.g:1159:4: otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getHighOrderClassAccess().getSubordinatedToKeyword_6_0());
                      			
                    }
                    // InternalML2.g:1163:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1164:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1164:5: ( ruleQualifiedName )
                    // InternalML2.g:1165:6: ruleQualifiedName
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

                    // InternalML2.g:1179:4: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalML2.g:1180:5: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_14, grammarAccess.getHighOrderClassAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1184:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1185:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1185:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1186:7: ruleQualifiedName
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

            // InternalML2.g:1202:3: ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=76 && LA31_0<=79)) ) {
                alt31=1;
            }
            else if ( (LA31_0==27) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalML2.g:1203:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1203:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1204:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1204:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) )
                    // InternalML2.g:1205:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    {
                    // InternalML2.g:1205:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    // InternalML2.g:1206:7: lv_categorizationType_16_0= ruleCategorizationType
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

                    // InternalML2.g:1223:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1224:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1224:6: ( ruleQualifiedName )
                    // InternalML2.g:1225:7: ruleQualifiedName
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
                    // InternalML2.g:1241:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1241:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1242:5: otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_18, grammarAccess.getHighOrderClassAccess().getIsPowertypeOfKeyword_7_1_0());
                      				
                    }
                    // InternalML2.g:1246:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1247:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1247:6: ( ruleQualifiedName )
                    // InternalML2.g:1248:7: ruleQualifiedName
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

            // InternalML2.g:1264:3: (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalML2.g:1265:4: otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getHighOrderClassAccess().getLeftCurlyBracketKeyword_8_0());
                      			
                    }
                    // InternalML2.g:1269:4: ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )*
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
                    	    // InternalML2.g:1270:5: ( (lv_assignments_21_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:1270:5: ( (lv_assignments_21_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:1271:6: (lv_assignments_21_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:1271:6: (lv_assignments_21_0= ruleFeatureAssignment )
                    	    // InternalML2.g:1272:7: lv_assignments_21_0= ruleFeatureAssignment
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
                    	    // InternalML2.g:1290:5: ( (lv_features_22_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:1290:5: ( (lv_features_22_0= ruleFeature ) )
                    	    // InternalML2.g:1291:6: (lv_features_22_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:1291:6: (lv_features_22_0= ruleFeature )
                    	    // InternalML2.g:1292:7: lv_features_22_0= ruleFeature
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
    // InternalML2.g:1319:1: entryRuleOrderlessClass returns [EObject current=null] : iv_ruleOrderlessClass= ruleOrderlessClass EOF ;
    public final EObject entryRuleOrderlessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderlessClass = null;


        try {
            // InternalML2.g:1319:55: (iv_ruleOrderlessClass= ruleOrderlessClass EOF )
            // InternalML2.g:1320:2: iv_ruleOrderlessClass= ruleOrderlessClass EOF
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
    // InternalML2.g:1326:1: ruleOrderlessClass returns [EObject current=null] : (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? ) ;
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
            // InternalML2.g:1332:2: ( (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? ) )
            // InternalML2.g:1333:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? )
            {
            // InternalML2.g:1333:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? )
            // InternalML2.g:1334:3: otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOrderlessClassAccess().getClassKeyword_1());
              		
            }
            // InternalML2.g:1342:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:1343:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:1343:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:1344:5: lv_name_2_0= RULE_ID
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

            // InternalML2.g:1360:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalML2.g:1361:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0());
                      			
                    }
                    // InternalML2.g:1365:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1366:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1366:5: ( ruleQualifiedName )
                    // InternalML2.g:1367:6: ruleQualifiedName
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

                    // InternalML2.g:1381:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalML2.g:1382:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1386:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1387:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1387:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1388:7: ruleQualifiedName
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

            // InternalML2.g:1404:3: (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalML2.g:1405:4: otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0());
                      			
                    }
                    // InternalML2.g:1409:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1410:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1410:5: ( ruleQualifiedName )
                    // InternalML2.g:1411:6: ruleQualifiedName
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

                    // InternalML2.g:1425:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalML2.g:1426:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1430:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1431:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1431:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1432:7: ruleQualifiedName
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

            // InternalML2.g:1448:3: (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalML2.g:1449:4: otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getOrderlessClassAccess().getSubordinatedToKeyword_5_0());
                      			
                    }
                    // InternalML2.g:1453:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1454:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1454:5: ( ruleQualifiedName )
                    // InternalML2.g:1455:6: ruleQualifiedName
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

                    // InternalML2.g:1469:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalML2.g:1470:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_13, grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:1474:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1475:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1475:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1476:7: ruleQualifiedName
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

            // InternalML2.g:1492:3: ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=76 && LA40_0<=79)) ) {
                alt40=1;
            }
            else if ( (LA40_0==27) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // InternalML2.g:1493:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1493:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1494:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1494:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) )
                    // InternalML2.g:1495:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    {
                    // InternalML2.g:1495:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    // InternalML2.g:1496:7: lv_categorizationType_15_0= ruleCategorizationType
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

                    // InternalML2.g:1513:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1514:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1514:6: ( ruleQualifiedName )
                    // InternalML2.g:1515:7: ruleQualifiedName
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
                    // InternalML2.g:1531:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1531:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1532:5: otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getOrderlessClassAccess().getIsPowertypeOfKeyword_6_1_0());
                      				
                    }
                    // InternalML2.g:1536:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1537:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1537:6: ( ruleQualifiedName )
                    // InternalML2.g:1538:7: ruleQualifiedName
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

            // InternalML2.g:1554:3: (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:1555:4: otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}'
                    {
                    otherlv_19=(Token)match(input,12,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getOrderlessClassAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    // InternalML2.g:1559:4: ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )*
                    loop41:
                    do {
                        int alt41=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA41_2 = input.LA(2);

                            if ( (LA41_2==RULE_ID) ) {
                                int LA41_6 = input.LA(3);

                                if ( (LA41_6==16||LA41_6==44) ) {
                                    alt41=1;
                                }
                                else if ( (LA41_6==20) ) {
                                    alt41=2;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA41_3 = input.LA(2);

                            if ( (LA41_3==RULE_ID) ) {
                                int LA41_4 = input.LA(3);

                                if ( (LA41_4==20) ) {
                                    alt41=2;
                                }
                                else if ( (LA41_4==16||LA41_4==44) ) {
                                    alt41=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA41_4 = input.LA(2);

                            if ( (LA41_4==20) ) {
                                alt41=2;
                            }
                            else if ( (LA41_4==16||LA41_4==44) ) {
                                alt41=1;
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
                    	    // InternalML2.g:1560:5: ( (lv_assignments_20_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:1560:5: ( (lv_assignments_20_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:1561:6: (lv_assignments_20_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:1561:6: (lv_assignments_20_0= ruleFeatureAssignment )
                    	    // InternalML2.g:1562:7: lv_assignments_20_0= ruleFeatureAssignment
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
                    	    // InternalML2.g:1580:5: ( (lv_features_21_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:1580:5: ( (lv_features_21_0= ruleFeature ) )
                    	    // InternalML2.g:1581:6: (lv_features_21_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:1581:6: (lv_features_21_0= ruleFeature )
                    	    // InternalML2.g:1582:7: lv_features_21_0= ruleFeature
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
    // InternalML2.g:1609:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalML2.g:1609:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalML2.g:1610:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalML2.g:1616:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) ;
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
            // InternalML2.g:1622:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalML2.g:1623:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalML2.g:1623:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalML2.g:1624:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
            {
            // InternalML2.g:1624:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalML2.g:1625:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalML2.g:1625:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            // InternalML2.g:1626:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            // InternalML2.g:1629:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            // InternalML2.g:1630:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            {
            // InternalML2.g:1630:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
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
            	    // InternalML2.g:1631:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalML2.g:1631:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    // InternalML2.g:1632:5: {...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalML2.g:1632:114: ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    // InternalML2.g:1633:6: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
            	    // InternalML2.g:1636:9: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    // InternalML2.g:1636:10: {...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1636:19: ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    // InternalML2.g:1636:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    {
            	    // InternalML2.g:1636:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    // InternalML2.g:1637:10: lv_isDisjoint_1_0= 'disjoint'
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
            	    // InternalML2.g:1654:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalML2.g:1654:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    // InternalML2.g:1655:5: {...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalML2.g:1655:114: ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    // InternalML2.g:1656:6: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
            	    // InternalML2.g:1659:9: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    // InternalML2.g:1659:10: {...}? => ( (lv_isComplete_2_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1659:19: ( (lv_isComplete_2_0= 'complete' ) )
            	    // InternalML2.g:1659:20: (lv_isComplete_2_0= 'complete' )
            	    {
            	    // InternalML2.g:1659:20: (lv_isComplete_2_0= 'complete' )
            	    // InternalML2.g:1660:10: lv_isComplete_2_0= 'complete'
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
            // InternalML2.g:1688:3: ( (lv_name_4_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalML2.g:1689:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalML2.g:1689:4: (lv_name_4_0= RULE_ID )
                    // InternalML2.g:1690:5: lv_name_4_0= RULE_ID
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
            // InternalML2.g:1710:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1711:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1711:4: ( ruleQualifiedName )
            // InternalML2.g:1712:5: ruleQualifiedName
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

            // InternalML2.g:1726:3: (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalML2.g:1727:4: otherlv_7= 'categorizer' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0());
                      			
                    }
                    // InternalML2.g:1731:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1732:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1732:5: ( ruleQualifiedName )
                    // InternalML2.g:1733:6: ruleQualifiedName
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
            // InternalML2.g:1752:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1753:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1753:4: ( ruleQualifiedName )
            // InternalML2.g:1754:5: ruleQualifiedName
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

            // InternalML2.g:1768:3: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
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
            	    // InternalML2.g:1769:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	      			
            	    }
            	    // InternalML2.g:1773:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:1774:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:1774:5: ( ruleQualifiedName )
            	    // InternalML2.g:1775:6: ruleQualifiedName
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
    // InternalML2.g:1794:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalML2.g:1794:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalML2.g:1795:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalML2.g:1801:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:1807:2: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // InternalML2.g:1808:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // InternalML2.g:1808:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
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
                    // InternalML2.g:1809:3: this_Attribute_0= ruleAttribute
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
                    // InternalML2.g:1818:3: this_Reference_1= ruleReference
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
    // InternalML2.g:1830:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalML2.g:1830:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalML2.g:1831:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalML2.g:1837:1: ruleAttribute returns [EObject current=null] : (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) ) ;
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
            // InternalML2.g:1843:2: ( (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) ) )
            // InternalML2.g:1844:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            {
            // InternalML2.g:1844:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalML2.g:1845:3: this_RegularityAttribute_0= ruleRegularityAttribute
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
                    // InternalML2.g:1854:3: ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? )
                    {
                    // InternalML2.g:1854:3: ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? )
                    // InternalML2.g:1855:4: (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    {
                    // InternalML2.g:1855:4: (otherlv_1= 'att' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==35) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalML2.g:1856:5: otherlv_1= 'att'
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalML2.g:1861:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalML2.g:1862:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalML2.g:1862:5: (lv_name_2_0= RULE_ID )
                    // InternalML2.g:1863:6: lv_name_2_0= RULE_ID
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
                    // InternalML2.g:1883:4: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalML2.g:1884:5: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_3_0());
                              				
                            }
                            // InternalML2.g:1888:5: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                            // InternalML2.g:1889:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:1889:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            // InternalML2.g:1890:7: lv_lowerBound_5_0= ruleCARDINALITY
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
                            // InternalML2.g:1911:5: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                            // InternalML2.g:1912:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:1912:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            // InternalML2.g:1913:7: lv_upperBound_7_0= ruleCARDINALITY
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

                    // InternalML2.g:1935:4: ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=71 && LA50_0<=73)) ) {
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
                            // InternalML2.g:1936:5: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                            {
                            // InternalML2.g:1936:5: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                            // InternalML2.g:1937:6: (lv_primitiveType_9_0= rulePrimitiveType )
                            {
                            // InternalML2.g:1937:6: (lv_primitiveType_9_0= rulePrimitiveType )
                            // InternalML2.g:1938:7: lv_primitiveType_9_0= rulePrimitiveType
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
                            // InternalML2.g:1956:5: ( ( ruleQualifiedName ) )
                            {
                            // InternalML2.g:1956:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:1957:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:1957:6: ( ruleQualifiedName )
                            // InternalML2.g:1958:7: ruleQualifiedName
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

                    // InternalML2.g:1973:4: (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==39) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalML2.g:1974:5: otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_11=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getSubsetsKeyword_1_5_0());
                              				
                            }
                            // InternalML2.g:1978:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:1979:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:1979:6: ( ruleQualifiedName )
                            // InternalML2.g:1980:7: ruleQualifiedName
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

                            // InternalML2.g:1994:5: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==21) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalML2.g:1995:6: otherlv_13= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_13=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getCommaKeyword_1_5_2_0());
                            	      					
                            	    }
                            	    // InternalML2.g:1999:6: ( ( ruleQualifiedName ) )
                            	    // InternalML2.g:2000:7: ( ruleQualifiedName )
                            	    {
                            	    // InternalML2.g:2000:7: ( ruleQualifiedName )
                            	    // InternalML2.g:2001:8: ruleQualifiedName
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
    // InternalML2.g:2022:1: entryRuleRegularityAttribute returns [EObject current=null] : iv_ruleRegularityAttribute= ruleRegularityAttribute EOF ;
    public final EObject entryRuleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityAttribute = null;


        try {
            // InternalML2.g:2022:60: (iv_ruleRegularityAttribute= ruleRegularityAttribute EOF )
            // InternalML2.g:2023:2: iv_ruleRegularityAttribute= ruleRegularityAttribute EOF
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
    // InternalML2.g:2029:1: ruleRegularityAttribute returns [EObject current=null] : ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
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
            // InternalML2.g:2035:2: ( ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2036:2: ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2036:2: ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2037:3: (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:2037:3: (otherlv_0= 'regularity' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalML2.g:2038:4: otherlv_0= 'regularity'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2043:3: (otherlv_1= 'att' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==35) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalML2.g:2044:4: otherlv_1= 'att'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRegularityAttributeAccess().getAttKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2049:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:2050:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:2050:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:2051:5: lv_name_2_0= RULE_ID
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
            // InternalML2.g:2071:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalML2.g:2072:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:2076:4: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                    // InternalML2.g:2077:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2077:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    // InternalML2.g:2078:6: lv_lowerBound_5_0= ruleCARDINALITY
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
                    // InternalML2.g:2099:4: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                    // InternalML2.g:2100:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2100:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    // InternalML2.g:2101:6: lv_upperBound_7_0= ruleCARDINALITY
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

            // InternalML2.g:2123:3: ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=71 && LA57_0<=73)) ) {
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
                    // InternalML2.g:2124:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    {
                    // InternalML2.g:2124:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    // InternalML2.g:2125:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    {
                    // InternalML2.g:2125:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    // InternalML2.g:2126:6: lv_primitiveType_9_0= rulePrimitiveType
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
                    // InternalML2.g:2144:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2144:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2145:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2145:5: ( ruleQualifiedName )
                    // InternalML2.g:2146:6: ruleQualifiedName
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

            // InternalML2.g:2161:3: (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalML2.g:2162:4: otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0());
                      			
                    }
                    // InternalML2.g:2166:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2167:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2167:5: ( ruleQualifiedName )
                    // InternalML2.g:2168:6: ruleQualifiedName
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

                    // InternalML2.g:2182:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==21) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalML2.g:2183:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_13, grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:2187:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2188:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2188:6: ( ruleQualifiedName )
                    	    // InternalML2.g:2189:7: ruleQualifiedName
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

            // InternalML2.g:2205:3: ( (lv_regularityType_15_0= ruleRegularityFeatureType ) )
            // InternalML2.g:2206:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:2206:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            // InternalML2.g:2207:5: lv_regularityType_15_0= ruleRegularityFeatureType
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

            // InternalML2.g:2224:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2225:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2225:4: ( ruleQualifiedName )
            // InternalML2.g:2226:5: ruleQualifiedName
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
    // InternalML2.g:2244:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalML2.g:2244:50: (iv_ruleReference= ruleReference EOF )
            // InternalML2.g:2245:2: iv_ruleReference= ruleReference EOF
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
    // InternalML2.g:2251:1: ruleReference returns [EObject current=null] : (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ) ;
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
            // InternalML2.g:2257:2: ( (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ) )
            // InternalML2.g:2258:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            {
            // InternalML2.g:2258:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalML2.g:2259:3: this_RegularityReference_0= ruleRegularityReference
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
                    // InternalML2.g:2268:3: (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
                    {
                    // InternalML2.g:2268:3: (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
                    // InternalML2.g:2269:4: otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getRefKeyword_1_0());
                      			
                    }
                    // InternalML2.g:2273:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalML2.g:2274:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalML2.g:2274:5: (lv_name_2_0= RULE_ID )
                    // InternalML2.g:2275:6: lv_name_2_0= RULE_ID
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
                    // InternalML2.g:2295:4: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==36) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalML2.g:2296:5: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_1_3_0());
                              				
                            }
                            // InternalML2.g:2300:5: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                            // InternalML2.g:2301:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:2301:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            // InternalML2.g:2302:7: lv_lowerBound_5_0= ruleCARDINALITY
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
                            // InternalML2.g:2323:5: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                            // InternalML2.g:2324:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:2324:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            // InternalML2.g:2325:7: lv_upperBound_7_0= ruleCARDINALITY
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

                    // InternalML2.g:2347:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2348:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2348:5: ( ruleQualifiedName )
                    // InternalML2.g:2349:6: ruleQualifiedName
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

                    // InternalML2.g:2363:4: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==39) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalML2.g:2364:5: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_10=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getReferenceAccess().getSubsetsKeyword_1_5_0());
                              				
                            }
                            // InternalML2.g:2368:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:2369:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:2369:6: ( ruleQualifiedName )
                            // InternalML2.g:2370:7: ruleQualifiedName
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

                            // InternalML2.g:2384:5: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==21) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalML2.g:2385:6: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_12, grammarAccess.getReferenceAccess().getCommaKeyword_1_5_2_0());
                            	      					
                            	    }
                            	    // InternalML2.g:2389:6: ( ( ruleQualifiedName ) )
                            	    // InternalML2.g:2390:7: ( ruleQualifiedName )
                            	    {
                            	    // InternalML2.g:2390:7: ( ruleQualifiedName )
                            	    // InternalML2.g:2391:8: ruleQualifiedName
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

                    // InternalML2.g:2407:4: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==42) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalML2.g:2408:5: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                            {
                            otherlv_14=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getReferenceAccess().getIsOppositeToKeyword_1_6_0());
                              				
                            }
                            // InternalML2.g:2412:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:2413:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:2413:6: ( ruleQualifiedName )
                            // InternalML2.g:2414:7: ruleQualifiedName
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
    // InternalML2.g:2434:1: entryRuleRegularityReference returns [EObject current=null] : iv_ruleRegularityReference= ruleRegularityReference EOF ;
    public final EObject entryRuleRegularityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityReference = null;


        try {
            // InternalML2.g:2434:60: (iv_ruleRegularityReference= ruleRegularityReference EOF )
            // InternalML2.g:2435:2: iv_ruleRegularityReference= ruleRegularityReference EOF
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
    // InternalML2.g:2441:1: ruleRegularityReference returns [EObject current=null] : ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
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
            // InternalML2.g:2447:2: ( ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2448:2: ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2448:2: ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2449:3: (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:2449:3: (otherlv_0= 'regularity' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==40) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalML2.g:2450:4: otherlv_0= 'regularity'
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
            // InternalML2.g:2459:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:2460:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:2460:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:2461:5: lv_name_2_0= RULE_ID
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
            // InternalML2.g:2481:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==36) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalML2.g:2482:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalML2.g:2486:4: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                    // InternalML2.g:2487:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2487:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    // InternalML2.g:2488:6: lv_lowerBound_5_0= ruleCARDINALITY
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
                    // InternalML2.g:2509:4: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                    // InternalML2.g:2510:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2510:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    // InternalML2.g:2511:6: lv_upperBound_7_0= ruleCARDINALITY
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

            // InternalML2.g:2533:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2534:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2534:4: ( ruleQualifiedName )
            // InternalML2.g:2535:5: ruleQualifiedName
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

            // InternalML2.g:2549:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==39) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalML2.g:2550:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0());
                      			
                    }
                    // InternalML2.g:2554:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2555:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2555:5: ( ruleQualifiedName )
                    // InternalML2.g:2556:6: ruleQualifiedName
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

                    // InternalML2.g:2570:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==21) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalML2.g:2571:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalML2.g:2575:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2576:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2576:6: ( ruleQualifiedName )
                    	    // InternalML2.g:2577:7: ruleQualifiedName
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

            // InternalML2.g:2593:3: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==42) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalML2.g:2594:4: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0());
                      			
                    }
                    // InternalML2.g:2598:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2599:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2599:5: ( ruleQualifiedName )
                    // InternalML2.g:2600:6: ruleQualifiedName
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

            // InternalML2.g:2615:3: ( (lv_regularityType_16_0= ruleRegularityFeatureType ) )
            // InternalML2.g:2616:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:2616:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            // InternalML2.g:2617:5: lv_regularityType_16_0= ruleRegularityFeatureType
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

            // InternalML2.g:2634:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2635:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2635:4: ( ruleQualifiedName )
            // InternalML2.g:2636:5: ruleQualifiedName
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
    // InternalML2.g:2654:1: entryRuleRegularityFeature returns [EObject current=null] : iv_ruleRegularityFeature= ruleRegularityFeature EOF ;
    public final EObject entryRuleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityFeature = null;


        try {
            // InternalML2.g:2654:58: (iv_ruleRegularityFeature= ruleRegularityFeature EOF )
            // InternalML2.g:2655:2: iv_ruleRegularityFeature= ruleRegularityFeature EOF
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
    // InternalML2.g:2661:1: ruleRegularityFeature returns [EObject current=null] : (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) ;
    public final EObject ruleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_RegularityAttribute_0 = null;

        EObject this_RegularityReference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:2667:2: ( (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) )
            // InternalML2.g:2668:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
            {
            // InternalML2.g:2668:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
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
                    // InternalML2.g:2669:3: this_RegularityAttribute_0= ruleRegularityAttribute
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
                    // InternalML2.g:2678:3: this_RegularityReference_1= ruleRegularityReference
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
    // InternalML2.g:2690:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalML2.g:2690:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalML2.g:2691:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
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
    // InternalML2.g:2697:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalML2.g:2703:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalML2.g:2704:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalML2.g:2704:2: (kw= '*' | this_INT_1= RULE_INT )
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
                    // InternalML2.g:2705:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:2711:3: this_INT_1= RULE_INT
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
    // InternalML2.g:2722:1: entryRuleFeatureAssignment returns [EObject current=null] : iv_ruleFeatureAssignment= ruleFeatureAssignment EOF ;
    public final EObject entryRuleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureAssignment = null;


        try {
            // InternalML2.g:2722:58: (iv_ruleFeatureAssignment= ruleFeatureAssignment EOF )
            // InternalML2.g:2723:2: iv_ruleFeatureAssignment= ruleFeatureAssignment EOF
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
    // InternalML2.g:2729:1: ruleFeatureAssignment returns [EObject current=null] : (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment ) ;
    public final EObject ruleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_SingleReferenceAssignment_0 = null;

        EObject this_MultipleReferenceAssignment_1 = null;

        EObject this_SingleAttributeAssignment_2 = null;

        EObject this_MultipleAttributeAssignment_3 = null;



        	enterRule();

        try {
            // InternalML2.g:2735:2: ( (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment ) )
            // InternalML2.g:2736:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )
            {
            // InternalML2.g:2736:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )
            int alt72=4;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalML2.g:2737:3: this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment
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
                    // InternalML2.g:2746:3: this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment
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
                    // InternalML2.g:2755:3: this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment
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
                    // InternalML2.g:2764:3: this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment
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
    // InternalML2.g:2776:1: entryRuleSingleReferenceAssignment returns [EObject current=null] : iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF ;
    public final EObject entryRuleSingleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleReferenceAssignment = null;


        try {
            // InternalML2.g:2776:66: (iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF )
            // InternalML2.g:2777:2: iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF
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
    // InternalML2.g:2783:1: ruleSingleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSingleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalML2.g:2789:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2790:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2790:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2791:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSingleReferenceAssignmentAccess().getRefKeyword_0());
              		
            }
            // InternalML2.g:2795:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2796:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2796:4: ( ruleQualifiedName )
            // InternalML2.g:2797:5: ruleQualifiedName
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
            // InternalML2.g:2815:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2816:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2816:4: ( ruleQualifiedName )
            // InternalML2.g:2817:5: ruleQualifiedName
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
    // InternalML2.g:2835:1: entryRuleMultipleReferenceAssignment returns [EObject current=null] : iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF ;
    public final EObject entryRuleMultipleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleReferenceAssignment = null;


        try {
            // InternalML2.g:2835:68: (iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF )
            // InternalML2.g:2836:2: iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF
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
    // InternalML2.g:2842:1: ruleMultipleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleMultipleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalML2.g:2848:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ) )
            // InternalML2.g:2849:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )
            {
            // InternalML2.g:2849:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )
            // InternalML2.g:2850:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultipleReferenceAssignmentAccess().getRefKeyword_0());
              		
            }
            // InternalML2.g:2854:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2855:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2855:4: ( ruleQualifiedName )
            // InternalML2.g:2856:5: ruleQualifiedName
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
            // InternalML2.g:2878:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2879:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2879:4: ( ruleQualifiedName )
            // InternalML2.g:2880:5: ruleQualifiedName
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

            // InternalML2.g:2894:3: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==21) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalML2.g:2895:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getMultipleReferenceAssignmentAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalML2.g:2899:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:2900:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:2900:5: ( ruleQualifiedName )
            	    // InternalML2.g:2901:6: ruleQualifiedName
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
    // InternalML2.g:2924:1: entryRuleSingleAttributeAssignment returns [EObject current=null] : iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF ;
    public final EObject entryRuleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAttributeAssignment = null;


        try {
            // InternalML2.g:2924:66: (iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF )
            // InternalML2.g:2925:2: iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF
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
    // InternalML2.g:2931:1: ruleSingleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) ) ;
    public final EObject ruleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_literalValues_3_0 = null;

        EObject lv_unnamedValues_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2937:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) ) )
            // InternalML2.g:2938:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) )
            {
            // InternalML2.g:2938:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) )
            // InternalML2.g:2939:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) )
            {
            // InternalML2.g:2939:3: (otherlv_0= 'att' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==35) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalML2.g:2940:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:2945:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2946:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2946:4: ( ruleQualifiedName )
            // InternalML2.g:2947:5: ruleQualifiedName
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
            // InternalML2.g:2965:3: ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
                {
                alt75=1;
                }
                break;
            case RULE_ID:
                {
                alt75=2;
                }
                break;
            case 36:
                {
                alt75=3;
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
                    // InternalML2.g:2966:4: ( (lv_literalValues_3_0= ruleLiteral ) )
                    {
                    // InternalML2.g:2966:4: ( (lv_literalValues_3_0= ruleLiteral ) )
                    // InternalML2.g:2967:5: (lv_literalValues_3_0= ruleLiteral )
                    {
                    // InternalML2.g:2967:5: (lv_literalValues_3_0= ruleLiteral )
                    // InternalML2.g:2968:6: lv_literalValues_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_literalValues_3_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"literalValues",
                      							lv_literalValues_3_0,
                      							"br.ufes.inf.nemo.ml2.ML2.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2986:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2986:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2987:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2987:5: ( ruleQualifiedName )
                    // InternalML2.g:2988:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_1_0());
                      					
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
                case 3 :
                    // InternalML2.g:3003:4: ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3003:4: ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3004:5: (lv_unnamedValues_5_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3004:5: (lv_unnamedValues_5_0= ruleUnnamedIndividual )
                    // InternalML2.g:3005:6: lv_unnamedValues_5_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_unnamedValues_5_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"unnamedValues",
                      							lv_unnamedValues_5_0,
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
    // InternalML2.g:3027:1: entryRuleMultipleAttributeAssignment returns [EObject current=null] : iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF ;
    public final EObject entryRuleMultipleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleAttributeAssignment = null;


        try {
            // InternalML2.g:3027:68: (iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF )
            // InternalML2.g:3028:2: iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF
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
    // InternalML2.g:3034:1: ruleMultipleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' ) ;
    public final EObject ruleMultipleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_literalValues_4_0 = null;

        EObject lv_literalValues_6_0 = null;

        EObject lv_unnamedValues_10_0 = null;

        EObject lv_unnamedValues_12_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3040:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' ) )
            // InternalML2.g:3041:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' )
            {
            // InternalML2.g:3041:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' )
            // InternalML2.g:3042:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}'
            {
            // InternalML2.g:3042:3: (otherlv_0= 'att' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==35) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalML2.g:3043:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:3048:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3049:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3049:4: ( ruleQualifiedName )
            // InternalML2.g:3050:5: ruleQualifiedName
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
            // InternalML2.g:3072:3: ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
                {
                alt80=1;
                }
                break;
            case RULE_ID:
                {
                alt80=2;
                }
                break;
            case 36:
                {
                alt80=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalML2.g:3073:4: ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* )
                    {
                    // InternalML2.g:3073:4: ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* )
                    // InternalML2.g:3074:5: ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )*
                    {
                    // InternalML2.g:3074:5: ( (lv_literalValues_4_0= ruleLiteral ) )
                    // InternalML2.g:3075:6: (lv_literalValues_4_0= ruleLiteral )
                    {
                    // InternalML2.g:3075:6: (lv_literalValues_4_0= ruleLiteral )
                    // InternalML2.g:3076:7: lv_literalValues_4_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_4_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_literalValues_4_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"literalValues",
                      								lv_literalValues_4_0,
                      								"br.ufes.inf.nemo.ml2.ML2.Literal");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalML2.g:3093:5: (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==21) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalML2.g:3094:6: otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_0_1_0());
                    	      					
                    	    }
                    	    // InternalML2.g:3098:6: ( (lv_literalValues_6_0= ruleLiteral ) )
                    	    // InternalML2.g:3099:7: (lv_literalValues_6_0= ruleLiteral )
                    	    {
                    	    // InternalML2.g:3099:7: (lv_literalValues_6_0= ruleLiteral )
                    	    // InternalML2.g:3100:8: lv_literalValues_6_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_4_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_literalValues_6_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"literalValues",
                    	      									lv_literalValues_6_0,
                    	      									"br.ufes.inf.nemo.ml2.ML2.Literal");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3120:4: ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // InternalML2.g:3120:4: ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )
                    // InternalML2.g:3121:5: ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalML2.g:3121:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3122:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3122:6: ( ruleQualifiedName )
                    // InternalML2.g:3123:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_4_1_0_0());
                      						
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

                    // InternalML2.g:3137:5: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==21) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalML2.g:3138:6: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_8, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_1_0());
                    	      					
                    	    }
                    	    // InternalML2.g:3142:6: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:3143:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:3143:7: ( ruleQualifiedName )
                    	    // InternalML2.g:3144:8: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                    	      								}
                    	      							
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_4_1_1_1_0());
                    	      							
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
                    	    break loop78;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3161:4: ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* )
                    {
                    // InternalML2.g:3161:4: ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* )
                    // InternalML2.g:3162:5: ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )*
                    {
                    // InternalML2.g:3162:5: ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3163:6: (lv_unnamedValues_10_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3163:6: (lv_unnamedValues_10_0= ruleUnnamedIndividual )
                    // InternalML2.g:3164:7: lv_unnamedValues_10_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_4_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_unnamedValues_10_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"unnamedValues",
                      								lv_unnamedValues_10_0,
                      								"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalML2.g:3181:5: (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==21) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalML2.g:3182:6: otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_11, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_2_1_0());
                    	      					
                    	    }
                    	    // InternalML2.g:3186:6: ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) )
                    	    // InternalML2.g:3187:7: (lv_unnamedValues_12_0= ruleUnnamedIndividual )
                    	    {
                    	    // InternalML2.g:3187:7: (lv_unnamedValues_12_0= ruleUnnamedIndividual )
                    	    // InternalML2.g:3188:8: lv_unnamedValues_12_0= ruleUnnamedIndividual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_4_2_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_unnamedValues_12_0=ruleUnnamedIndividual();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"unnamedValues",
                    	      									lv_unnamedValues_12_0,
                    	      									"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getMultipleAttributeAssignmentAccess().getRightCurlyBracketKeyword_5());
              		
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


    // $ANTLR start "entryRuleLiteral"
    // InternalML2.g:3216:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalML2.g:3216:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalML2.g:3217:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalML2.g:3223:1: ruleLiteral returns [EObject current=null] : (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalML2.g:3229:2: ( (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN ) )
            // InternalML2.g:3230:2: (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN )
            {
            // InternalML2.g:3230:2: (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt81=1;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt81=2;
                }
                break;
            case 45:
            case 46:
                {
                alt81=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalML2.g:3231:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:3236:3: ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNUMBERParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:3244:3: ruleBOOLEAN
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBOOLEANParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleBOOLEAN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalML2.g:3255:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalML2.g:3255:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalML2.g:3256:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalML2.g:3262:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalML2.g:3268:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalML2.g:3269:2: (kw= 'true' | kw= 'false' )
            {
            // InternalML2.g:3269:2: (kw= 'true' | kw= 'false' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==45) ) {
                alt82=1;
            }
            else if ( (LA82_0==46) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalML2.g:3270:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:3276:3: kw= 'false'
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
    // InternalML2.g:3285:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalML2.g:3285:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalML2.g:3286:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalML2.g:3292:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalML2.g:3298:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalML2.g:3299:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalML2.g:3299:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalML2.g:3300:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalML2.g:3300:3: (kw= '-' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==47) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalML2.g:3301:4: kw= '-'
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
            // InternalML2.g:3314:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==16) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalML2.g:3315:4: kw= '.' this_INT_3= RULE_INT
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
    // InternalML2.g:3332:1: entryRuleUnnamedIndividual returns [EObject current=null] : iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF ;
    public final EObject entryRuleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedIndividual = null;


        try {
            // InternalML2.g:3332:58: (iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF )
            // InternalML2.g:3333:2: iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF
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
    // InternalML2.g:3339:1: ruleUnnamedIndividual returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) ;
    public final EObject ruleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3345:2: ( ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) )
            // InternalML2.g:3346:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            {
            // InternalML2.g:3346:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            // InternalML2.g:3347:3: () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']'
            {
            // InternalML2.g:3347:3: ()
            // InternalML2.g:3348:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnnamedIndividualAccess().getIndividualAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnnamedIndividualAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalML2.g:3358:3: ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RULE_ID) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalML2.g:3359:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    {
            	    // InternalML2.g:3359:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    // InternalML2.g:3360:5: lv_assignments_2_0= ruleSimpleAttributeAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getUnnamedIndividualAccess().getAssignmentsSimpleAttributeAssignmentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_48);
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
            	    break loop85;
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
    // InternalML2.g:3385:1: entryRuleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3385:66: (iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF )
            // InternalML2.g:3386:2: iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF
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
    // InternalML2.g:3392:1: ruleSimpleAttributeAssignment returns [EObject current=null] : (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment ) ;
    public final EObject ruleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSimpleAttributeAssignment_0 = null;

        EObject this_MultipleSimpleAttributeAssignment_1 = null;



        	enterRule();

        try {
            // InternalML2.g:3398:2: ( (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment ) )
            // InternalML2.g:3399:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )
            {
            // InternalML2.g:3399:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalML2.g:3400:3: this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment
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
                    // InternalML2.g:3409:3: this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment
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
    // InternalML2.g:3421:1: entryRuleSingleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSingleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3421:72: (iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF )
            // InternalML2.g:3422:2: iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF
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
    // InternalML2.g:3428:1: ruleSingleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) ) ;
    public final EObject ruleSingleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_literalValues_2_0 = null;

        EObject lv_unnamedValues_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3434:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) ) )
            // InternalML2.g:3435:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) )
            {
            // InternalML2.g:3435:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) )
            // InternalML2.g:3436:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) )
            {
            // InternalML2.g:3436:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3437:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3437:4: ( ruleQualifiedName )
            // InternalML2.g:3438:5: ruleQualifiedName
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
            // InternalML2.g:3456:3: ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
                {
                alt87=1;
                }
                break;
            case RULE_ID:
                {
                alt87=2;
                }
                break;
            case 36:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalML2.g:3457:4: ( (lv_literalValues_2_0= ruleLiteral ) )
                    {
                    // InternalML2.g:3457:4: ( (lv_literalValues_2_0= ruleLiteral ) )
                    // InternalML2.g:3458:5: (lv_literalValues_2_0= ruleLiteral )
                    {
                    // InternalML2.g:3458:5: (lv_literalValues_2_0= ruleLiteral )
                    // InternalML2.g:3459:6: lv_literalValues_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_literalValues_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"literalValues",
                      							lv_literalValues_2_0,
                      							"br.ufes.inf.nemo.ml2.ML2.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3477:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:3477:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3478:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3478:5: ( ruleQualifiedName )
                    // InternalML2.g:3479:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_2_1_0());
                      					
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
                case 3 :
                    // InternalML2.g:3494:4: ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3494:4: ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3495:5: (lv_unnamedValues_4_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3495:5: (lv_unnamedValues_4_0= ruleUnnamedIndividual )
                    // InternalML2.g:3496:6: lv_unnamedValues_4_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_unnamedValues_4_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                      						}
                      						add(
                      							current,
                      							"unnamedValues",
                      							lv_unnamedValues_4_0,
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
    // InternalML2.g:3518:1: entryRuleMultipleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleMultipleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3518:74: (iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF )
            // InternalML2.g:3519:2: iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF
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
    // InternalML2.g:3525:1: ruleMultipleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' ) ;
    public final EObject ruleMultipleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_literalValues_3_0 = null;

        EObject lv_literalValues_5_0 = null;

        EObject lv_unnamedValues_9_0 = null;

        EObject lv_unnamedValues_11_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3531:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' ) )
            // InternalML2.g:3532:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' )
            {
            // InternalML2.g:3532:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' )
            // InternalML2.g:3533:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}'
            {
            // InternalML2.g:3533:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3534:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3534:4: ( ruleQualifiedName )
            // InternalML2.g:3535:5: ruleQualifiedName
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
            // InternalML2.g:3557:3: ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) )
            int alt91=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
                {
                alt91=1;
                }
                break;
            case RULE_ID:
                {
                alt91=2;
                }
                break;
            case 36:
                {
                alt91=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalML2.g:3558:4: ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* )
                    {
                    // InternalML2.g:3558:4: ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* )
                    // InternalML2.g:3559:5: ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )*
                    {
                    // InternalML2.g:3559:5: ( (lv_literalValues_3_0= ruleLiteral ) )
                    // InternalML2.g:3560:6: (lv_literalValues_3_0= ruleLiteral )
                    {
                    // InternalML2.g:3560:6: (lv_literalValues_3_0= ruleLiteral )
                    // InternalML2.g:3561:7: lv_literalValues_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_3_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_literalValues_3_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"literalValues",
                      								lv_literalValues_3_0,
                      								"br.ufes.inf.nemo.ml2.ML2.Literal");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalML2.g:3578:5: (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==21) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalML2.g:3579:6: otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_0_1_0());
                    	      					
                    	    }
                    	    // InternalML2.g:3583:6: ( (lv_literalValues_5_0= ruleLiteral ) )
                    	    // InternalML2.g:3584:7: (lv_literalValues_5_0= ruleLiteral )
                    	    {
                    	    // InternalML2.g:3584:7: (lv_literalValues_5_0= ruleLiteral )
                    	    // InternalML2.g:3585:8: lv_literalValues_5_0= ruleLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_3_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_literalValues_5_0=ruleLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"literalValues",
                    	      									lv_literalValues_5_0,
                    	      									"br.ufes.inf.nemo.ml2.ML2.Literal");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3605:4: ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // InternalML2.g:3605:4: ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )
                    // InternalML2.g:3606:5: ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalML2.g:3606:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3607:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3607:6: ( ruleQualifiedName )
                    // InternalML2.g:3608:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_1_0_0());
                      						
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

                    // InternalML2.g:3622:5: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==21) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalML2.g:3623:6: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_7, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_1_1_0());
                    	      					
                    	    }
                    	    // InternalML2.g:3627:6: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:3628:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:3628:7: ( ruleQualifiedName )
                    	    // InternalML2.g:3629:8: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                    	      								}
                    	      							
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_1_1_1_0());
                    	      							
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
                    	    break loop89;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3646:4: ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* )
                    {
                    // InternalML2.g:3646:4: ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* )
                    // InternalML2.g:3647:5: ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )*
                    {
                    // InternalML2.g:3647:5: ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3648:6: (lv_unnamedValues_9_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3648:6: (lv_unnamedValues_9_0= ruleUnnamedIndividual )
                    // InternalML2.g:3649:7: lv_unnamedValues_9_0= ruleUnnamedIndividual
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_unnamedValues_9_0=ruleUnnamedIndividual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                      							}
                      							add(
                      								current,
                      								"unnamedValues",
                      								lv_unnamedValues_9_0,
                      								"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalML2.g:3666:5: (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==21) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalML2.g:3667:6: otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_10, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_2_1_0());
                    	      					
                    	    }
                    	    // InternalML2.g:3671:6: ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) )
                    	    // InternalML2.g:3672:7: (lv_unnamedValues_11_0= ruleUnnamedIndividual )
                    	    {
                    	    // InternalML2.g:3672:7: (lv_unnamedValues_11_0= ruleUnnamedIndividual )
                    	    // InternalML2.g:3673:8: lv_unnamedValues_11_0= ruleUnnamedIndividual
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_2_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_unnamedValues_11_0=ruleUnnamedIndividual();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"unnamedValues",
                    	      									lv_unnamedValues_11_0,
                    	      									"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_4());
              		
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
    // InternalML2.g:3701:1: entryRuleConstraintDeclaration returns [EObject current=null] : iv_ruleConstraintDeclaration= ruleConstraintDeclaration EOF ;
    public final EObject entryRuleConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintDeclaration = null;


        try {
            // InternalML2.g:3701:62: (iv_ruleConstraintDeclaration= ruleConstraintDeclaration EOF )
            // InternalML2.g:3702:2: iv_ruleConstraintDeclaration= ruleConstraintDeclaration EOF
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
    // InternalML2.g:3708:1: ruleConstraintDeclaration returns [EObject current=null] : (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint ) ;
    public final EObject ruleConstraintDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantConstraint_0 = null;

        EObject this_DerivationConstraint_1 = null;



        	enterRule();

        try {
            // InternalML2.g:3714:2: ( (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint ) )
            // InternalML2.g:3715:2: (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint )
            {
            // InternalML2.g:3715:2: (this_InvariantConstraint_0= ruleInvariantConstraint | this_DerivationConstraint_1= ruleDerivationConstraint )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==48) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==RULE_ID) ) {
                    int LA92_2 = input.LA(3);

                    if ( (LA92_2==20||LA92_2==49) ) {
                        alt92=1;
                    }
                    else if ( (LA92_2==50) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalML2.g:3716:3: this_InvariantConstraint_0= ruleInvariantConstraint
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
                    // InternalML2.g:3725:3: this_DerivationConstraint_1= ruleDerivationConstraint
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
    // InternalML2.g:3737:1: entryRuleInvariantConstraint returns [EObject current=null] : iv_ruleInvariantConstraint= ruleInvariantConstraint EOF ;
    public final EObject entryRuleInvariantConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantConstraint = null;


        try {
            // InternalML2.g:3737:60: (iv_ruleInvariantConstraint= ruleInvariantConstraint EOF )
            // InternalML2.g:3738:2: iv_ruleInvariantConstraint= ruleInvariantConstraint EOF
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
    // InternalML2.g:3744:1: ruleInvariantConstraint returns [EObject current=null] : (otherlv_0= 'context' ( ( (lv_contextAlias_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'inv' ( (lv_invariantAlias_5_0= RULE_ID ) )? otherlv_6= ':' ( (lv_expression_7_0= ruleOclExpression ) ) ) ;
    public final EObject ruleInvariantConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_contextAlias_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_invariantAlias_5_0=null;
        Token otherlv_6=null;
        EObject lv_expression_7_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3750:2: ( (otherlv_0= 'context' ( ( (lv_contextAlias_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'inv' ( (lv_invariantAlias_5_0= RULE_ID ) )? otherlv_6= ':' ( (lv_expression_7_0= ruleOclExpression ) ) ) )
            // InternalML2.g:3751:2: (otherlv_0= 'context' ( ( (lv_contextAlias_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'inv' ( (lv_invariantAlias_5_0= RULE_ID ) )? otherlv_6= ':' ( (lv_expression_7_0= ruleOclExpression ) ) )
            {
            // InternalML2.g:3751:2: (otherlv_0= 'context' ( ( (lv_contextAlias_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'inv' ( (lv_invariantAlias_5_0= RULE_ID ) )? otherlv_6= ':' ( (lv_expression_7_0= ruleOclExpression ) ) )
            // InternalML2.g:3752:3: otherlv_0= 'context' ( ( (lv_contextAlias_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'inv' ( (lv_invariantAlias_5_0= RULE_ID ) )? otherlv_6= ':' ( (lv_expression_7_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantConstraintAccess().getContextKeyword_0());
              		
            }
            // InternalML2.g:3756:3: ( ( (lv_contextAlias_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==20) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // InternalML2.g:3757:4: ( (lv_contextAlias_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // InternalML2.g:3757:4: ( (lv_contextAlias_1_0= RULE_ID ) )
                    // InternalML2.g:3758:5: (lv_contextAlias_1_0= RULE_ID )
                    {
                    // InternalML2.g:3758:5: (lv_contextAlias_1_0= RULE_ID )
                    // InternalML2.g:3759:6: lv_contextAlias_1_0= RULE_ID
                    {
                    lv_contextAlias_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_contextAlias_1_0, grammarAccess.getInvariantConstraintAccess().getContextAliasIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInvariantConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"contextAlias",
                      							lv_contextAlias_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getInvariantConstraintAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:3780:3: ( (otherlv_3= RULE_ID ) )
            // InternalML2.g:3781:4: (otherlv_3= RULE_ID )
            {
            // InternalML2.g:3781:4: (otherlv_3= RULE_ID )
            // InternalML2.g:3782:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvariantConstraintRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getInvariantConstraintAccess().getClassContextClassCrossReference_2_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInvariantConstraintAccess().getInvKeyword_3());
              		
            }
            // InternalML2.g:3797:3: ( (lv_invariantAlias_5_0= RULE_ID ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalML2.g:3798:4: (lv_invariantAlias_5_0= RULE_ID )
                    {
                    // InternalML2.g:3798:4: (lv_invariantAlias_5_0= RULE_ID )
                    // InternalML2.g:3799:5: lv_invariantAlias_5_0= RULE_ID
                    {
                    lv_invariantAlias_5_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_invariantAlias_5_0, grammarAccess.getInvariantConstraintAccess().getInvariantAliasIDTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInvariantConstraintRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"invariantAlias",
                      						lv_invariantAlias_5_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getInvariantConstraintAccess().getColonKeyword_5());
              		
            }
            // InternalML2.g:3819:3: ( (lv_expression_7_0= ruleOclExpression ) )
            // InternalML2.g:3820:4: (lv_expression_7_0= ruleOclExpression )
            {
            // InternalML2.g:3820:4: (lv_expression_7_0= ruleOclExpression )
            // InternalML2.g:3821:5: lv_expression_7_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvariantConstraintAccess().getExpressionOclExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_7_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvariantConstraintRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_7_0,
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
    // InternalML2.g:3842:1: entryRuleDerivationConstraint returns [EObject current=null] : iv_ruleDerivationConstraint= ruleDerivationConstraint EOF ;
    public final EObject entryRuleDerivationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivationConstraint = null;


        try {
            // InternalML2.g:3842:61: (iv_ruleDerivationConstraint= ruleDerivationConstraint EOF )
            // InternalML2.g:3843:2: iv_ruleDerivationConstraint= ruleDerivationConstraint EOF
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
    // InternalML2.g:3849:1: ruleDerivationConstraint returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_typename_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) ) ;
    public final EObject ruleDerivationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_typename_5_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3855:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_typename_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) ) )
            // InternalML2.g:3856:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_typename_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) )
            {
            // InternalML2.g:3856:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_typename_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) ) )
            // InternalML2.g:3857:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_typename_5_0= ruleTypeLiteralExpression ) ) otherlv_6= 'derive' otherlv_7= ':' ( (lv_expression_8_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDerivationConstraintAccess().getContextKeyword_0());
              		
            }
            // InternalML2.g:3861:3: ( (otherlv_1= RULE_ID ) )
            // InternalML2.g:3862:4: (otherlv_1= RULE_ID )
            {
            // InternalML2.g:3862:4: (otherlv_1= RULE_ID )
            // InternalML2.g:3863:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDerivationConstraintRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDerivationConstraintAccess().getClassContextClassCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDerivationConstraintAccess().getColonColonKeyword_2());
              		
            }
            // InternalML2.g:3878:3: ( (otherlv_3= RULE_ID ) )
            // InternalML2.g:3879:4: (otherlv_3= RULE_ID )
            {
            // InternalML2.g:3879:4: (otherlv_3= RULE_ID )
            // InternalML2.g:3880:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDerivationConstraintRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDerivationConstraintAccess().getFeatureContextFeatureCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDerivationConstraintAccess().getColonKeyword_4());
              		
            }
            // InternalML2.g:3895:3: ( (lv_typename_5_0= ruleTypeLiteralExpression ) )
            // InternalML2.g:3896:4: (lv_typename_5_0= ruleTypeLiteralExpression )
            {
            // InternalML2.g:3896:4: (lv_typename_5_0= ruleTypeLiteralExpression )
            // InternalML2.g:3897:5: lv_typename_5_0= ruleTypeLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDerivationConstraintAccess().getTypenameTypeLiteralExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_54);
            lv_typename_5_0=ruleTypeLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDerivationConstraintRule());
              					}
              					set(
              						current,
              						"typename",
              						lv_typename_5_0,
              						"br.ufes.inf.nemo.ml2.ML2.TypeLiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDerivationConstraintAccess().getDeriveKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,20,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDerivationConstraintAccess().getColonKeyword_7());
              		
            }
            // InternalML2.g:3922:3: ( (lv_expression_8_0= ruleOclExpression ) )
            // InternalML2.g:3923:4: (lv_expression_8_0= ruleOclExpression )
            {
            // InternalML2.g:3923:4: (lv_expression_8_0= ruleOclExpression )
            // InternalML2.g:3924:5: lv_expression_8_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDerivationConstraintAccess().getExpressionOclExpressionParserRuleCall_8_0());
              				
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
    // InternalML2.g:3945:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // InternalML2.g:3945:54: (iv_ruleOclExpression= ruleOclExpression EOF )
            // InternalML2.g:3946:2: iv_ruleOclExpression= ruleOclExpression EOF
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
    // InternalML2.g:3952:1: ruleOclExpression returns [EObject current=null] : (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LetExpression_0 = null;

        EObject this_IfExpression_1 = null;

        EObject this_ImpliesExpression_2 = null;



        	enterRule();

        try {
            // InternalML2.g:3958:2: ( (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression ) )
            // InternalML2.g:3959:2: (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression )
            {
            // InternalML2.g:3959:2: (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_ImpliesExpression_2= ruleImpliesExpression )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt95=1;
                }
                break;
            case 54:
                {
                alt95=2;
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
            case 73:
            case 74:
            case 75:
            case 92:
            case 93:
                {
                alt95=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalML2.g:3960:3: this_LetExpression_0= ruleLetExpression
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
                    // InternalML2.g:3969:3: this_IfExpression_1= ruleIfExpression
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
                    // InternalML2.g:3978:3: this_ImpliesExpression_2= ruleImpliesExpression
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
    // InternalML2.g:3990:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // InternalML2.g:3990:54: (iv_ruleLetExpression= ruleLetExpression EOF )
            // InternalML2.g:3991:2: iv_ruleLetExpression= ruleLetExpression EOF
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
    // InternalML2.g:3997:1: ruleLetExpression returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) ) ;
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
            // InternalML2.g:4003:2: ( (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) ) )
            // InternalML2.g:4004:2: (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) )
            {
            // InternalML2.g:4004:2: (otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) ) )
            // InternalML2.g:4005:3: otherlv_0= 'let' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_inExpression_5_0= ruleOclExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpressionAccess().getLetKeyword_0());
              		
            }
            // InternalML2.g:4009:3: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // InternalML2.g:4010:4: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // InternalML2.g:4010:4: (lv_variables_1_0= ruleVariableDeclaration )
            // InternalML2.g:4011:5: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpressionAccess().getVariablesVariableDeclarationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_55);
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

            // InternalML2.g:4028:3: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==21) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalML2.g:4029:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalML2.g:4033:4: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // InternalML2.g:4034:5: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // InternalML2.g:4034:5: (lv_variables_3_0= ruleVariableDeclaration )
            	    // InternalML2.g:4035:6: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpressionAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
            	    break loop96;
                }
            } while (true);

            otherlv_4=(Token)match(input,53,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getInKeyword_3());
              		
            }
            // InternalML2.g:4057:3: ( (lv_inExpression_5_0= ruleOclExpression ) )
            // InternalML2.g:4058:4: (lv_inExpression_5_0= ruleOclExpression )
            {
            // InternalML2.g:4058:4: (lv_inExpression_5_0= ruleOclExpression )
            // InternalML2.g:4059:5: lv_inExpression_5_0= ruleOclExpression
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
    // InternalML2.g:4080:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalML2.g:4080:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalML2.g:4081:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalML2.g:4087:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variableType_2_0 = null;

        EObject lv_initialValue_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4093:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleLiteralExpression ) ) ) )
            // InternalML2.g:4094:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleLiteralExpression ) ) )
            {
            // InternalML2.g:4094:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleLiteralExpression ) ) )
            // InternalML2.g:4095:3: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_variableType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= '=' ( (lv_initialValue_4_0= ruleLiteralExpression ) )
            {
            // InternalML2.g:4095:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalML2.g:4096:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalML2.g:4096:4: (lv_variableName_0_0= RULE_ID )
            // InternalML2.g:4097:5: lv_variableName_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,20,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalML2.g:4117:3: ( (lv_variableType_2_0= ruleTypeLiteralExpression ) )
            // InternalML2.g:4118:4: (lv_variableType_2_0= ruleTypeLiteralExpression )
            {
            // InternalML2.g:4118:4: (lv_variableType_2_0= ruleTypeLiteralExpression )
            // InternalML2.g:4119:5: lv_variableType_2_0= ruleTypeLiteralExpression
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

            otherlv_3=(Token)match(input,44,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalML2.g:4140:3: ( (lv_initialValue_4_0= ruleLiteralExpression ) )
            // InternalML2.g:4141:4: (lv_initialValue_4_0= ruleLiteralExpression )
            {
            // InternalML2.g:4141:4: (lv_initialValue_4_0= ruleLiteralExpression )
            // InternalML2.g:4142:5: lv_initialValue_4_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInitialValueLiteralExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_initialValue_4_0=ruleLiteralExpression();

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
              						"br.ufes.inf.nemo.ml2.ML2.LiteralExpression");
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
    // InternalML2.g:4163:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalML2.g:4163:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalML2.g:4164:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalML2.g:4170:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) ;
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
            // InternalML2.g:4176:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' ) )
            // InternalML2.g:4177:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            {
            // InternalML2.g:4177:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif' )
            // InternalML2.g:4178:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleOclExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleOclExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleOclExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
              		
            }
            // InternalML2.g:4182:3: ( (lv_condition_1_0= ruleOclExpression ) )
            // InternalML2.g:4183:4: (lv_condition_1_0= ruleOclExpression )
            {
            // InternalML2.g:4183:4: (lv_condition_1_0= ruleOclExpression )
            // InternalML2.g:4184:5: lv_condition_1_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionOclExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_57);
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

            otherlv_2=(Token)match(input,55,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
              		
            }
            // InternalML2.g:4205:3: ( (lv_thenExpression_3_0= ruleOclExpression ) )
            // InternalML2.g:4206:4: (lv_thenExpression_3_0= ruleOclExpression )
            {
            // InternalML2.g:4206:4: (lv_thenExpression_3_0= ruleOclExpression )
            // InternalML2.g:4207:5: lv_thenExpression_3_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionOclExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_58);
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

            otherlv_4=(Token)match(input,56,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getElseKeyword_4());
              		
            }
            // InternalML2.g:4228:3: ( (lv_elseExpression_5_0= ruleOclExpression ) )
            // InternalML2.g:4229:4: (lv_elseExpression_5_0= ruleOclExpression )
            {
            // InternalML2.g:4229:4: (lv_elseExpression_5_0= ruleOclExpression )
            // InternalML2.g:4230:5: lv_elseExpression_5_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionOclExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_59);
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
    // InternalML2.g:4255:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalML2.g:4255:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalML2.g:4256:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
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
    // InternalML2.g:4262:1: ruleImpliesExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4268:2: ( ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* ) )
            // InternalML2.g:4269:2: ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* )
            {
            // InternalML2.g:4269:2: ( ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )* )
            // InternalML2.g:4270:3: ( (lv_left_0_0= ruleXorExpression ) ) (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )*
            {
            // InternalML2.g:4270:3: ( (lv_left_0_0= ruleXorExpression ) )
            // InternalML2.g:4271:4: (lv_left_0_0= ruleXorExpression )
            {
            // InternalML2.g:4271:4: (lv_left_0_0= ruleXorExpression )
            // InternalML2.g:4272:5: lv_left_0_0= ruleXorExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImpliesExpressionAccess().getLeftXorExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_60);
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

            // InternalML2.g:4289:3: (otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==58) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalML2.g:4290:4: otherlv_1= 'implies' ( (lv_right_2_0= ruleXorExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,58,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4294:4: ( (lv_right_2_0= ruleXorExpression ) )
            	    // InternalML2.g:4295:5: (lv_right_2_0= ruleXorExpression )
            	    {
            	    // InternalML2.g:4295:5: (lv_right_2_0= ruleXorExpression )
            	    // InternalML2.g:4296:6: lv_right_2_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalML2.g:4318:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalML2.g:4318:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalML2.g:4319:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalML2.g:4325:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4331:2: ( ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* ) )
            // InternalML2.g:4332:2: ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* )
            {
            // InternalML2.g:4332:2: ( ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )* )
            // InternalML2.g:4333:3: ( (lv_left_0_0= ruleOrExpression ) ) (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )*
            {
            // InternalML2.g:4333:3: ( (lv_left_0_0= ruleOrExpression ) )
            // InternalML2.g:4334:4: (lv_left_0_0= ruleOrExpression )
            {
            // InternalML2.g:4334:4: (lv_left_0_0= ruleOrExpression )
            // InternalML2.g:4335:5: lv_left_0_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXorExpressionAccess().getLeftOrExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_61);
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

            // InternalML2.g:4352:3: (otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==59) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalML2.g:4353:4: otherlv_1= 'xor' ( (lv_right_2_0= ruleOrExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,59,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getXorExpressionAccess().getXorKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4357:4: ( (lv_right_2_0= ruleOrExpression ) )
            	    // InternalML2.g:4358:5: (lv_right_2_0= ruleOrExpression )
            	    {
            	    // InternalML2.g:4358:5: (lv_right_2_0= ruleOrExpression )
            	    // InternalML2.g:4359:6: lv_right_2_0= ruleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightOrExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalML2.g:4381:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalML2.g:4381:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalML2.g:4382:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalML2.g:4388:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4394:2: ( ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* ) )
            // InternalML2.g:4395:2: ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* )
            {
            // InternalML2.g:4395:2: ( ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )* )
            // InternalML2.g:4396:3: ( (lv_left_0_0= ruleAndExpression ) ) (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )*
            {
            // InternalML2.g:4396:3: ( (lv_left_0_0= ruleAndExpression ) )
            // InternalML2.g:4397:4: (lv_left_0_0= ruleAndExpression )
            {
            // InternalML2.g:4397:4: (lv_left_0_0= ruleAndExpression )
            // InternalML2.g:4398:5: lv_left_0_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftAndExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            // InternalML2.g:4415:3: (otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==60) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalML2.g:4416:4: otherlv_1= 'or' ( (lv_right_2_0= ruleAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,60,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4420:4: ( (lv_right_2_0= ruleAndExpression ) )
            	    // InternalML2.g:4421:5: (lv_right_2_0= ruleAndExpression )
            	    {
            	    // InternalML2.g:4421:5: (lv_right_2_0= ruleAndExpression )
            	    // InternalML2.g:4422:6: lv_right_2_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_62);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalML2.g:4444:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalML2.g:4444:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalML2.g:4445:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalML2.g:4451:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4457:2: ( ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* ) )
            // InternalML2.g:4458:2: ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* )
            {
            // InternalML2.g:4458:2: ( ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )* )
            // InternalML2.g:4459:3: ( (lv_left_0_0= ruleComparisonExpression ) ) (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )*
            {
            // InternalML2.g:4459:3: ( (lv_left_0_0= ruleComparisonExpression ) )
            // InternalML2.g:4460:4: (lv_left_0_0= ruleComparisonExpression )
            {
            // InternalML2.g:4460:4: (lv_left_0_0= ruleComparisonExpression )
            // InternalML2.g:4461:5: lv_left_0_0= ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftComparisonExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            // InternalML2.g:4478:3: (otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==61) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalML2.g:4479:4: otherlv_1= 'and' ( (lv_right_2_0= ruleComparisonExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,61,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4483:4: ( (lv_right_2_0= ruleComparisonExpression ) )
            	    // InternalML2.g:4484:5: (lv_right_2_0= ruleComparisonExpression )
            	    {
            	    // InternalML2.g:4484:5: (lv_right_2_0= ruleComparisonExpression )
            	    // InternalML2.g:4485:6: lv_right_2_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break loop100;
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
    // InternalML2.g:4507:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalML2.g:4507:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalML2.g:4508:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalML2.g:4514:1: ruleComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4520:2: ( ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* ) )
            // InternalML2.g:4521:2: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* )
            {
            // InternalML2.g:4521:2: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )* )
            // InternalML2.g:4522:3: ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleComparisonOperation ) )*
            {
            // InternalML2.g:4522:3: ( (lv_left_0_0= ruleRelationalExpression ) )
            // InternalML2.g:4523:4: (lv_left_0_0= ruleRelationalExpression )
            {
            // InternalML2.g:4523:4: (lv_left_0_0= ruleRelationalExpression )
            // InternalML2.g:4524:5: lv_left_0_0= ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getLeftRelationalExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_64);
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

            // InternalML2.g:4541:3: ( (lv_right_1_0= ruleComparisonOperation ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==44||LA101_0==86) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalML2.g:4542:4: (lv_right_1_0= ruleComparisonOperation )
            	    {
            	    // InternalML2.g:4542:4: (lv_right_1_0= ruleComparisonOperation )
            	    // InternalML2.g:4543:5: lv_right_1_0= ruleComparisonOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightComparisonOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_64);
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
            	    break loop101;
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
    // InternalML2.g:4564:1: entryRuleComparisonOperation returns [EObject current=null] : iv_ruleComparisonOperation= ruleComparisonOperation EOF ;
    public final EObject entryRuleComparisonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperation = null;


        try {
            // InternalML2.g:4564:60: (iv_ruleComparisonOperation= ruleComparisonOperation EOF )
            // InternalML2.g:4565:2: iv_ruleComparisonOperation= ruleComparisonOperation EOF
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
    // InternalML2.g:4571:1: ruleComparisonOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) ) ;
    public final EObject ruleComparisonOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4577:2: ( ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) ) )
            // InternalML2.g:4578:2: ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) )
            {
            // InternalML2.g:4578:2: ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) ) )
            // InternalML2.g:4579:3: ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_right_1_0= ruleRelationalExpression ) )
            {
            // InternalML2.g:4579:3: ( (lv_operator_0_0= ruleComparisonOperator ) )
            // InternalML2.g:4580:4: (lv_operator_0_0= ruleComparisonOperator )
            {
            // InternalML2.g:4580:4: (lv_operator_0_0= ruleComparisonOperator )
            // InternalML2.g:4581:5: lv_operator_0_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonOperationAccess().getOperatorComparisonOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalML2.g:4598:3: ( (lv_right_1_0= ruleRelationalExpression ) )
            // InternalML2.g:4599:4: (lv_right_1_0= ruleRelationalExpression )
            {
            // InternalML2.g:4599:4: (lv_right_1_0= ruleRelationalExpression )
            // InternalML2.g:4600:5: lv_right_1_0= ruleRelationalExpression
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
    // InternalML2.g:4621:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalML2.g:4621:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalML2.g:4622:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalML2.g:4628:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4634:2: ( ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* ) )
            // InternalML2.g:4635:2: ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* )
            {
            // InternalML2.g:4635:2: ( ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )* )
            // InternalML2.g:4636:3: ( (lv_left_0_0= ruleAdditionExpression ) ) ( (lv_right_1_0= ruleRelationalOperation ) )*
            {
            // InternalML2.g:4636:3: ( (lv_left_0_0= ruleAdditionExpression ) )
            // InternalML2.g:4637:4: (lv_left_0_0= ruleAdditionExpression )
            {
            // InternalML2.g:4637:4: (lv_left_0_0= ruleAdditionExpression )
            // InternalML2.g:4638:5: lv_left_0_0= ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalExpressionAccess().getLeftAdditionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            // InternalML2.g:4655:3: ( (lv_right_1_0= ruleRelationalOperation ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=87 && LA102_0<=90)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalML2.g:4656:4: (lv_right_1_0= ruleRelationalOperation )
            	    {
            	    // InternalML2.g:4656:4: (lv_right_1_0= ruleRelationalOperation )
            	    // InternalML2.g:4657:5: lv_right_1_0= ruleRelationalOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightRelationalOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_65);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOperation"
    // InternalML2.g:4678:1: entryRuleRelationalOperation returns [EObject current=null] : iv_ruleRelationalOperation= ruleRelationalOperation EOF ;
    public final EObject entryRuleRelationalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOperation = null;


        try {
            // InternalML2.g:4678:60: (iv_ruleRelationalOperation= ruleRelationalOperation EOF )
            // InternalML2.g:4679:2: iv_ruleRelationalOperation= ruleRelationalOperation EOF
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
    // InternalML2.g:4685:1: ruleRelationalOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) ) ;
    public final EObject ruleRelationalOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4691:2: ( ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) ) )
            // InternalML2.g:4692:2: ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) )
            {
            // InternalML2.g:4692:2: ( ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) ) )
            // InternalML2.g:4693:3: ( (lv_operator_0_0= ruleRelationalOperator ) ) ( (lv_right_1_0= ruleAdditionExpression ) )
            {
            // InternalML2.g:4693:3: ( (lv_operator_0_0= ruleRelationalOperator ) )
            // InternalML2.g:4694:4: (lv_operator_0_0= ruleRelationalOperator )
            {
            // InternalML2.g:4694:4: (lv_operator_0_0= ruleRelationalOperator )
            // InternalML2.g:4695:5: lv_operator_0_0= ruleRelationalOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationalOperationAccess().getOperatorRelationalOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalML2.g:4712:3: ( (lv_right_1_0= ruleAdditionExpression ) )
            // InternalML2.g:4713:4: (lv_right_1_0= ruleAdditionExpression )
            {
            // InternalML2.g:4713:4: (lv_right_1_0= ruleAdditionExpression )
            // InternalML2.g:4714:5: lv_right_1_0= ruleAdditionExpression
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
    // InternalML2.g:4735:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalML2.g:4735:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalML2.g:4736:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
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
    // InternalML2.g:4742:1: ruleAdditionExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4748:2: ( ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* ) )
            // InternalML2.g:4749:2: ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* )
            {
            // InternalML2.g:4749:2: ( ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )* )
            // InternalML2.g:4750:3: ( (lv_left_0_0= ruleMultiplicationExpression ) ) ( (lv_right_1_0= ruleAdditionOperation ) )*
            {
            // InternalML2.g:4750:3: ( (lv_left_0_0= ruleMultiplicationExpression ) )
            // InternalML2.g:4751:4: (lv_left_0_0= ruleMultiplicationExpression )
            {
            // InternalML2.g:4751:4: (lv_left_0_0= ruleMultiplicationExpression )
            // InternalML2.g:4752:5: lv_left_0_0= ruleMultiplicationExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionExpressionAccess().getLeftMultiplicationExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_66);
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

            // InternalML2.g:4769:3: ( (lv_right_1_0= ruleAdditionOperation ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==47||LA103_0==91) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalML2.g:4770:4: (lv_right_1_0= ruleAdditionOperation )
            	    {
            	    // InternalML2.g:4770:4: (lv_right_1_0= ruleAdditionOperation )
            	    // InternalML2.g:4771:5: lv_right_1_0= ruleAdditionOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightAdditionOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_66);
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
            	    break loop103;
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
    // InternalML2.g:4792:1: entryRuleAdditionOperation returns [EObject current=null] : iv_ruleAdditionOperation= ruleAdditionOperation EOF ;
    public final EObject entryRuleAdditionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperation = null;


        try {
            // InternalML2.g:4792:58: (iv_ruleAdditionOperation= ruleAdditionOperation EOF )
            // InternalML2.g:4793:2: iv_ruleAdditionOperation= ruleAdditionOperation EOF
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
    // InternalML2.g:4799:1: ruleAdditionOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) ) ;
    public final EObject ruleAdditionOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4805:2: ( ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) ) )
            // InternalML2.g:4806:2: ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) )
            {
            // InternalML2.g:4806:2: ( ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) ) )
            // InternalML2.g:4807:3: ( (lv_operator_0_0= ruleAdditionOperator ) ) ( (lv_right_1_0= ruleMultiplicationExpression ) )
            {
            // InternalML2.g:4807:3: ( (lv_operator_0_0= ruleAdditionOperator ) )
            // InternalML2.g:4808:4: (lv_operator_0_0= ruleAdditionOperator )
            {
            // InternalML2.g:4808:4: (lv_operator_0_0= ruleAdditionOperator )
            // InternalML2.g:4809:5: lv_operator_0_0= ruleAdditionOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAdditionOperationAccess().getOperatorAdditionOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalML2.g:4826:3: ( (lv_right_1_0= ruleMultiplicationExpression ) )
            // InternalML2.g:4827:4: (lv_right_1_0= ruleMultiplicationExpression )
            {
            // InternalML2.g:4827:4: (lv_right_1_0= ruleMultiplicationExpression )
            // InternalML2.g:4828:5: lv_right_1_0= ruleMultiplicationExpression
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
    // InternalML2.g:4849:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalML2.g:4849:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalML2.g:4850:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
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
    // InternalML2.g:4856:1: ruleMultiplicationExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleUnaryExpression ) ) (otherlv_1= '*' ( (lv_right_2_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4862:2: ( ( ( (lv_left_0_0= ruleUnaryExpression ) ) (otherlv_1= '*' ( (lv_right_2_0= ruleUnaryExpression ) ) )* ) )
            // InternalML2.g:4863:2: ( ( (lv_left_0_0= ruleUnaryExpression ) ) (otherlv_1= '*' ( (lv_right_2_0= ruleUnaryExpression ) ) )* )
            {
            // InternalML2.g:4863:2: ( ( (lv_left_0_0= ruleUnaryExpression ) ) (otherlv_1= '*' ( (lv_right_2_0= ruleUnaryExpression ) ) )* )
            // InternalML2.g:4864:3: ( (lv_left_0_0= ruleUnaryExpression ) ) (otherlv_1= '*' ( (lv_right_2_0= ruleUnaryExpression ) ) )*
            {
            // InternalML2.g:4864:3: ( (lv_left_0_0= ruleUnaryExpression ) )
            // InternalML2.g:4865:4: (lv_left_0_0= ruleUnaryExpression )
            {
            // InternalML2.g:4865:4: (lv_left_0_0= ruleUnaryExpression )
            // InternalML2.g:4866:5: lv_left_0_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getLeftUnaryExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_67);
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

            // InternalML2.g:4883:3: (otherlv_1= '*' ( (lv_right_2_0= ruleUnaryExpression ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==43) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalML2.g:4884:4: otherlv_1= '*' ( (lv_right_2_0= ruleUnaryExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,43,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getMultiplicationExpressionAccess().getAsteriskKeyword_1_0());
            	      			
            	    }
            	    // InternalML2.g:4888:4: ( (lv_right_2_0= ruleUnaryExpression ) )
            	    // InternalML2.g:4889:5: (lv_right_2_0= ruleUnaryExpression )
            	    {
            	    // InternalML2.g:4889:5: (lv_right_2_0= ruleUnaryExpression )
            	    // InternalML2.g:4890:6: lv_right_2_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_right_2_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"right",
            	      							lv_right_2_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.UnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
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


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalML2.g:4912:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalML2.g:4912:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalML2.g:4913:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalML2.g:4919:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:4925:2: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) ) )
            // InternalML2.g:4926:2: ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) )
            {
            // InternalML2.g:4926:2: ( ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) ) )
            // InternalML2.g:4927:3: ( (lv_operator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleTermExpression ) )
            {
            // InternalML2.g:4927:3: ( (lv_operator_0_0= ruleUnaryOperator ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==47||(LA105_0>=92 && LA105_0<=93)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalML2.g:4928:4: (lv_operator_0_0= ruleUnaryOperator )
                    {
                    // InternalML2.g:4928:4: (lv_operator_0_0= ruleUnaryOperator )
                    // InternalML2.g:4929:5: lv_operator_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_51);
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

            // InternalML2.g:4946:3: ( (lv_right_1_0= ruleTermExpression ) )
            // InternalML2.g:4947:4: (lv_right_1_0= ruleTermExpression )
            {
            // InternalML2.g:4947:4: (lv_right_1_0= ruleTermExpression )
            // InternalML2.g:4948:5: lv_right_1_0= ruleTermExpression
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
    // InternalML2.g:4969:1: entryRuleTermExpression returns [EObject current=null] : iv_ruleTermExpression= ruleTermExpression EOF ;
    public final EObject entryRuleTermExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermExpression = null;


        try {
            // InternalML2.g:4969:55: (iv_ruleTermExpression= ruleTermExpression EOF )
            // InternalML2.g:4970:2: iv_ruleTermExpression= ruleTermExpression EOF
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
    // InternalML2.g:4976:1: ruleTermExpression returns [EObject current=null] : ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) ) ;
    public final EObject ruleTermExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_CallExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_OclExpression_3 = null;



        	enterRule();

        try {
            // InternalML2.g:4982:2: ( ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) ) )
            // InternalML2.g:4983:2: ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) )
            {
            // InternalML2.g:4983:2: ( ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression ) | this_LiteralExpression_1= ruleLiteralExpression | (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' ) )
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                int LA106_1 = input.LA(2);

                if ( (synpred1_InternalML2()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA106_0==70) && (synpred1_InternalML2())) {
                alt106=1;
            }
            else if ( ((LA106_0>=RULE_INT && LA106_0<=RULE_STRING)||(LA106_0>=45 && LA106_0<=46)||(LA106_0>=67 && LA106_0<=69)||(LA106_0>=71 && LA106_0<=75)) ) {
                alt106=2;
            }
            else if ( (LA106_0==62) ) {
                alt106=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalML2.g:4984:3: ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression )
                    {
                    // InternalML2.g:4984:3: ( ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression )
                    // InternalML2.g:4985:4: ( ruleCallExpression )=>this_CallExpression_0= ruleCallExpression
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
                    // InternalML2.g:4996:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalML2.g:5005:3: (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' )
                    {
                    // InternalML2.g:5005:3: (otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')' )
                    // InternalML2.g:5006:4: otherlv_2= '(' this_OclExpression_3= ruleOclExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTermExpressionAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTermExpressionAccess().getOclExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_68);
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
    // InternalML2.g:5027:1: entryRuleCallExpression returns [EObject current=null] : iv_ruleCallExpression= ruleCallExpression EOF ;
    public final EObject entryRuleCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpression = null;


        try {
            // InternalML2.g:5027:55: (iv_ruleCallExpression= ruleCallExpression EOF )
            // InternalML2.g:5028:2: iv_ruleCallExpression= ruleCallExpression EOF
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
    // InternalML2.g:5034:1: ruleCallExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariableExpression ) ) ( (lv_right_1_0= ruleCallOperation ) )* ) ;
    public final EObject ruleCallExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5040:2: ( ( ( (lv_left_0_0= ruleVariableExpression ) ) ( (lv_right_1_0= ruleCallOperation ) )* ) )
            // InternalML2.g:5041:2: ( ( (lv_left_0_0= ruleVariableExpression ) ) ( (lv_right_1_0= ruleCallOperation ) )* )
            {
            // InternalML2.g:5041:2: ( ( (lv_left_0_0= ruleVariableExpression ) ) ( (lv_right_1_0= ruleCallOperation ) )* )
            // InternalML2.g:5042:3: ( (lv_left_0_0= ruleVariableExpression ) ) ( (lv_right_1_0= ruleCallOperation ) )*
            {
            // InternalML2.g:5042:3: ( (lv_left_0_0= ruleVariableExpression ) )
            // InternalML2.g:5043:4: (lv_left_0_0= ruleVariableExpression )
            {
            // InternalML2.g:5043:4: (lv_left_0_0= ruleVariableExpression )
            // InternalML2.g:5044:5: lv_left_0_0= ruleVariableExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCallExpressionAccess().getLeftVariableExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_69);
            lv_left_0_0=ruleVariableExpression();

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
              						"br.ufes.inf.nemo.ml2.ML2.VariableExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:5061:3: ( (lv_right_1_0= ruleCallOperation ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==16||LA107_0==64) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalML2.g:5062:4: (lv_right_1_0= ruleCallOperation )
            	    {
            	    // InternalML2.g:5062:4: (lv_right_1_0= ruleCallOperation )
            	    // InternalML2.g:5063:5: lv_right_1_0= ruleCallOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallExpressionAccess().getRightCallOperationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_69);
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
            	    break loop107;
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


    // $ANTLR start "entryRuleCallOperation"
    // InternalML2.g:5084:1: entryRuleCallOperation returns [EObject current=null] : iv_ruleCallOperation= ruleCallOperation EOF ;
    public final EObject entryRuleCallOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallOperation = null;


        try {
            // InternalML2.g:5084:54: (iv_ruleCallOperation= ruleCallOperation EOF )
            // InternalML2.g:5085:2: iv_ruleCallOperation= ruleCallOperation EOF
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
    // InternalML2.g:5091:1: ruleCallOperation returns [EObject current=null] : (this_DotOperation_0= ruleDotOperation | this_ArrowOperation_1= ruleArrowOperation ) ;
    public final EObject ruleCallOperation() throws RecognitionException {
        EObject current = null;

        EObject this_DotOperation_0 = null;

        EObject this_ArrowOperation_1 = null;



        	enterRule();

        try {
            // InternalML2.g:5097:2: ( (this_DotOperation_0= ruleDotOperation | this_ArrowOperation_1= ruleArrowOperation ) )
            // InternalML2.g:5098:2: (this_DotOperation_0= ruleDotOperation | this_ArrowOperation_1= ruleArrowOperation )
            {
            // InternalML2.g:5098:2: (this_DotOperation_0= ruleDotOperation | this_ArrowOperation_1= ruleArrowOperation )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==16) ) {
                alt108=1;
            }
            else if ( (LA108_0==64) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalML2.g:5099:3: this_DotOperation_0= ruleDotOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallOperationAccess().getDotOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DotOperation_0=ruleDotOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DotOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:5108:3: this_ArrowOperation_1= ruleArrowOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallOperationAccess().getArrowOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrowOperation_1=ruleArrowOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrowOperation_1;
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
    // $ANTLR end "ruleCallOperation"


    // $ANTLR start "entryRuleDotOperation"
    // InternalML2.g:5120:1: entryRuleDotOperation returns [EObject current=null] : iv_ruleDotOperation= ruleDotOperation EOF ;
    public final EObject entryRuleDotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotOperation = null;


        try {
            // InternalML2.g:5120:53: (iv_ruleDotOperation= ruleDotOperation EOF )
            // InternalML2.g:5121:2: iv_ruleDotOperation= ruleDotOperation EOF
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
    // InternalML2.g:5127:1: ruleDotOperation returns [EObject current=null] : (otherlv_0= '.' ( (lv_right_1_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleDotOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5133:2: ( (otherlv_0= '.' ( (lv_right_1_0= ruleVariableExpression ) ) ) )
            // InternalML2.g:5134:2: (otherlv_0= '.' ( (lv_right_1_0= ruleVariableExpression ) ) )
            {
            // InternalML2.g:5134:2: (otherlv_0= '.' ( (lv_right_1_0= ruleVariableExpression ) ) )
            // InternalML2.g:5135:3: otherlv_0= '.' ( (lv_right_1_0= ruleVariableExpression ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDotOperationAccess().getFullStopKeyword_0());
              		
            }
            // InternalML2.g:5139:3: ( (lv_right_1_0= ruleVariableExpression ) )
            // InternalML2.g:5140:4: (lv_right_1_0= ruleVariableExpression )
            {
            // InternalML2.g:5140:4: (lv_right_1_0= ruleVariableExpression )
            // InternalML2.g:5141:5: lv_right_1_0= ruleVariableExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDotOperationAccess().getRightVariableExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleVariableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDotOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.VariableExpression");
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
    // $ANTLR end "ruleDotOperation"


    // $ANTLR start "entryRuleArrowOperation"
    // InternalML2.g:5162:1: entryRuleArrowOperation returns [EObject current=null] : iv_ruleArrowOperation= ruleArrowOperation EOF ;
    public final EObject entryRuleArrowOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOperation = null;


        try {
            // InternalML2.g:5162:55: (iv_ruleArrowOperation= ruleArrowOperation EOF )
            // InternalML2.g:5163:2: iv_ruleArrowOperation= ruleArrowOperation EOF
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
    // InternalML2.g:5169:1: ruleArrowOperation returns [EObject current=null] : (otherlv_0= '->' ( (lv_right_1_0= ruleBuiltInOperation ) ) ) ;
    public final EObject ruleArrowOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5175:2: ( (otherlv_0= '->' ( (lv_right_1_0= ruleBuiltInOperation ) ) ) )
            // InternalML2.g:5176:2: (otherlv_0= '->' ( (lv_right_1_0= ruleBuiltInOperation ) ) )
            {
            // InternalML2.g:5176:2: (otherlv_0= '->' ( (lv_right_1_0= ruleBuiltInOperation ) ) )
            // InternalML2.g:5177:3: otherlv_0= '->' ( (lv_right_1_0= ruleBuiltInOperation ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrowOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());
              		
            }
            // InternalML2.g:5181:3: ( (lv_right_1_0= ruleBuiltInOperation ) )
            // InternalML2.g:5182:4: (lv_right_1_0= ruleBuiltInOperation )
            {
            // InternalML2.g:5182:4: (lv_right_1_0= ruleBuiltInOperation )
            // InternalML2.g:5183:5: lv_right_1_0= ruleBuiltInOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrowOperationAccess().getRightBuiltInOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleBuiltInOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrowOperationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"br.ufes.inf.nemo.ml2.ML2.BuiltInOperation");
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
    // $ANTLR end "ruleArrowOperation"


    // $ANTLR start "entryRuleBuiltInOperation"
    // InternalML2.g:5204:1: entryRuleBuiltInOperation returns [EObject current=null] : iv_ruleBuiltInOperation= ruleBuiltInOperation EOF ;
    public final EObject entryRuleBuiltInOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInOperation = null;


        try {
            // InternalML2.g:5204:57: (iv_ruleBuiltInOperation= ruleBuiltInOperation EOF )
            // InternalML2.g:5205:2: iv_ruleBuiltInOperation= ruleBuiltInOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBuiltInOperation=ruleBuiltInOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInOperation; 
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
    // $ANTLR end "entryRuleBuiltInOperation"


    // $ANTLR start "ruleBuiltInOperation"
    // InternalML2.g:5211:1: ruleBuiltInOperation returns [EObject current=null] : (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_BinaryIteration_3= ruleBinaryIteration ) ;
    public final EObject ruleBuiltInOperation() throws RecognitionException {
        EObject current = null;

        EObject this_UnarySetOperation_0 = null;

        EObject this_BinarySetOperation_1 = null;

        EObject this_UnaryIteration_2 = null;

        EObject this_BinaryIteration_3 = null;



        	enterRule();

        try {
            // InternalML2.g:5217:2: ( (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_BinaryIteration_3= ruleBinaryIteration ) )
            // InternalML2.g:5218:2: (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_BinaryIteration_3= ruleBinaryIteration )
            {
            // InternalML2.g:5218:2: (this_UnarySetOperation_0= ruleUnarySetOperation | this_BinarySetOperation_1= ruleBinarySetOperation | this_UnaryIteration_2= ruleUnaryIteration | this_BinaryIteration_3= ruleBinaryIteration )
            int alt109=4;
            switch ( input.LA(1) ) {
            case 94:
            case 95:
            case 96:
            case 97:
                {
                alt109=1;
                }
                break;
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
                {
                alt109=2;
                }
                break;
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
                {
                alt109=3;
                }
                break;
            case 66:
                {
                alt109=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalML2.g:5219:3: this_UnarySetOperation_0= ruleUnarySetOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBuiltInOperationAccess().getUnarySetOperationParserRuleCall_0());
                      		
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
                    // InternalML2.g:5228:3: this_BinarySetOperation_1= ruleBinarySetOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBuiltInOperationAccess().getBinarySetOperationParserRuleCall_1());
                      		
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
                    // InternalML2.g:5237:3: this_UnaryIteration_2= ruleUnaryIteration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBuiltInOperationAccess().getUnaryIterationParserRuleCall_2());
                      		
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
                    // InternalML2.g:5246:3: this_BinaryIteration_3= ruleBinaryIteration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBuiltInOperationAccess().getBinaryIterationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryIteration_3=ruleBinaryIteration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryIteration_3;
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
    // $ANTLR end "ruleBuiltInOperation"


    // $ANTLR start "entryRuleUnarySetOperation"
    // InternalML2.g:5258:1: entryRuleUnarySetOperation returns [EObject current=null] : iv_ruleUnarySetOperation= ruleUnarySetOperation EOF ;
    public final EObject entryRuleUnarySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnarySetOperation = null;


        try {
            // InternalML2.g:5258:58: (iv_ruleUnarySetOperation= ruleUnarySetOperation EOF )
            // InternalML2.g:5259:2: iv_ruleUnarySetOperation= ruleUnarySetOperation EOF
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
    // InternalML2.g:5265:1: ruleUnarySetOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleUnarySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5271:2: ( ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalML2.g:5272:2: ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalML2.g:5272:2: ( ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalML2.g:5273:3: ( (lv_operator_0_0= ruleUnarySetOperator ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalML2.g:5273:3: ( (lv_operator_0_0= ruleUnarySetOperator ) )
            // InternalML2.g:5274:4: (lv_operator_0_0= ruleUnarySetOperator )
            {
            // InternalML2.g:5274:4: (lv_operator_0_0= ruleUnarySetOperator )
            // InternalML2.g:5275:5: lv_operator_0_0= ruleUnarySetOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnarySetOperationAccess().getOperatorUnarySetOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_72);
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

            otherlv_1=(Token)match(input,62,FOLLOW_68); if (state.failed) return current;
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
    // InternalML2.g:5304:1: entryRuleBinarySetOperation returns [EObject current=null] : iv_ruleBinarySetOperation= ruleBinarySetOperation EOF ;
    public final EObject entryRuleBinarySetOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySetOperation = null;


        try {
            // InternalML2.g:5304:59: (iv_ruleBinarySetOperation= ruleBinarySetOperation EOF )
            // InternalML2.g:5305:2: iv_ruleBinarySetOperation= ruleBinarySetOperation EOF
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
    // InternalML2.g:5311:1: ruleBinarySetOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleBinarySetOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5317:2: ( ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' ) )
            // InternalML2.g:5318:2: ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' )
            {
            // InternalML2.g:5318:2: ( ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')' )
            // InternalML2.g:5319:3: ( (lv_operator_0_0= ruleBinarySetOperator ) ) otherlv_1= '(' ( (lv_argument_2_0= ruleOclExpression ) ) otherlv_3= ')'
            {
            // InternalML2.g:5319:3: ( (lv_operator_0_0= ruleBinarySetOperator ) )
            // InternalML2.g:5320:4: (lv_operator_0_0= ruleBinarySetOperator )
            {
            // InternalML2.g:5320:4: (lv_operator_0_0= ruleBinarySetOperator )
            // InternalML2.g:5321:5: lv_operator_0_0= ruleBinarySetOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinarySetOperationAccess().getOperatorBinarySetOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_72);
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

            otherlv_1=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBinarySetOperationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:5342:3: ( (lv_argument_2_0= ruleOclExpression ) )
            // InternalML2.g:5343:4: (lv_argument_2_0= ruleOclExpression )
            {
            // InternalML2.g:5343:4: (lv_argument_2_0= ruleOclExpression )
            // InternalML2.g:5344:5: lv_argument_2_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinarySetOperationAccess().getArgumentOclExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_68);
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
    // InternalML2.g:5369:1: entryRuleUnaryIteration returns [EObject current=null] : iv_ruleUnaryIteration= ruleUnaryIteration EOF ;
    public final EObject entryRuleUnaryIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryIteration = null;


        try {
            // InternalML2.g:5369:55: (iv_ruleUnaryIteration= ruleUnaryIteration EOF )
            // InternalML2.g:5370:2: iv_ruleUnaryIteration= ruleUnaryIteration EOF
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
    // InternalML2.g:5376:1: ruleUnaryIteration returns [EObject current=null] : ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleUnaryIteration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_variables_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_iterator_0_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5382:2: ( ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' ) )
            // InternalML2.g:5383:2: ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' )
            {
            // InternalML2.g:5383:2: ( ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')' )
            // InternalML2.g:5384:3: ( (lv_iterator_0_0= ruleUnaryIterator ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= '|' )? ( (lv_body_4_0= ruleOclExpression ) ) otherlv_5= ')'
            {
            // InternalML2.g:5384:3: ( (lv_iterator_0_0= ruleUnaryIterator ) )
            // InternalML2.g:5385:4: (lv_iterator_0_0= ruleUnaryIterator )
            {
            // InternalML2.g:5385:4: (lv_iterator_0_0= ruleUnaryIterator )
            // InternalML2.g:5386:5: lv_iterator_0_0= ruleUnaryIterator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryIterationAccess().getIteratorUnaryIteratorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_72);
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

            otherlv_1=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnaryIterationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:5407:3: ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= '|' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_ID) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==65) ) {
                    alt110=1;
                }
            }
            switch (alt110) {
                case 1 :
                    // InternalML2.g:5408:4: ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= '|'
                    {
                    // InternalML2.g:5408:4: ( (lv_variables_2_0= RULE_ID ) )
                    // InternalML2.g:5409:5: (lv_variables_2_0= RULE_ID )
                    {
                    // InternalML2.g:5409:5: (lv_variables_2_0= RULE_ID )
                    // InternalML2.g:5410:6: lv_variables_2_0= RULE_ID
                    {
                    lv_variables_2_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variables_2_0, grammarAccess.getUnaryIterationAccess().getVariablesIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryIterationRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"variables",
                      							lv_variables_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,65,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUnaryIterationAccess().getVerticalLineKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:5431:3: ( (lv_body_4_0= ruleOclExpression ) )
            // InternalML2.g:5432:4: (lv_body_4_0= ruleOclExpression )
            {
            // InternalML2.g:5432:4: (lv_body_4_0= ruleOclExpression )
            // InternalML2.g:5433:5: lv_body_4_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryIterationAccess().getBodyOclExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_68);
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


    // $ANTLR start "entryRuleBinaryIteration"
    // InternalML2.g:5458:1: entryRuleBinaryIteration returns [EObject current=null] : iv_ruleBinaryIteration= ruleBinaryIteration EOF ;
    public final EObject entryRuleBinaryIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryIteration = null;


        try {
            // InternalML2.g:5458:56: (iv_ruleBinaryIteration= ruleBinaryIteration EOF )
            // InternalML2.g:5459:2: iv_ruleBinaryIteration= ruleBinaryIteration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryIterationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryIteration=ruleBinaryIteration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryIteration; 
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
    // $ANTLR end "entryRuleBinaryIteration"


    // $ANTLR start "ruleBinaryIteration"
    // InternalML2.g:5465:1: ruleBinaryIteration returns [EObject current=null] : (otherlv_0= 'forAll' otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleBinaryIteration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_variables_2_0=null;
        Token otherlv_3=null;
        Token lv_variables_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5471:2: ( (otherlv_0= 'forAll' otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' ) )
            // InternalML2.g:5472:2: (otherlv_0= 'forAll' otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' )
            {
            // InternalML2.g:5472:2: (otherlv_0= 'forAll' otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')' )
            // InternalML2.g:5473:3: otherlv_0= 'forAll' otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) otherlv_5= '|' )? ( (lv_body_6_0= ruleOclExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryIterationAccess().getForAllKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBinaryIterationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:5481:3: ( ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) otherlv_5= '|' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_ID) ) {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==21) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // InternalML2.g:5482:4: ( (lv_variables_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) otherlv_5= '|'
                    {
                    // InternalML2.g:5482:4: ( (lv_variables_2_0= RULE_ID ) )
                    // InternalML2.g:5483:5: (lv_variables_2_0= RULE_ID )
                    {
                    // InternalML2.g:5483:5: (lv_variables_2_0= RULE_ID )
                    // InternalML2.g:5484:6: lv_variables_2_0= RULE_ID
                    {
                    lv_variables_2_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variables_2_0, grammarAccess.getBinaryIterationAccess().getVariablesIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryIterationRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"variables",
                      							lv_variables_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBinaryIterationAccess().getCommaKeyword_2_1());
                      			
                    }
                    // InternalML2.g:5504:4: ( (lv_variables_4_0= RULE_ID ) )
                    // InternalML2.g:5505:5: (lv_variables_4_0= RULE_ID )
                    {
                    // InternalML2.g:5505:5: (lv_variables_4_0= RULE_ID )
                    // InternalML2.g:5506:6: lv_variables_4_0= RULE_ID
                    {
                    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variables_4_0, grammarAccess.getBinaryIterationAccess().getVariablesIDTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryIterationRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"variables",
                      							lv_variables_4_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,65,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getBinaryIterationAccess().getVerticalLineKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalML2.g:5527:3: ( (lv_body_6_0= ruleOclExpression ) )
            // InternalML2.g:5528:4: (lv_body_6_0= ruleOclExpression )
            {
            // InternalML2.g:5528:4: (lv_body_6_0= ruleOclExpression )
            // InternalML2.g:5529:5: lv_body_6_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryIterationAccess().getBodyOclExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_68);
            lv_body_6_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBinaryIterationRule());
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

              			newLeafNode(otherlv_7, grammarAccess.getBinaryIterationAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleBinaryIteration"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalML2.g:5554:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalML2.g:5554:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalML2.g:5555:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalML2.g:5561:1: ruleLiteralExpression returns [EObject current=null] : (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_CollectionLiteralExpression_1= ruleCollectionLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression | this_TupleLiteralExpression_3= ruleTupleLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveLiteralExpression_0 = null;

        EObject this_CollectionLiteralExpression_1 = null;

        EObject this_TypeLiteralExpression_2 = null;

        EObject this_TupleLiteralExpression_3 = null;



        	enterRule();

        try {
            // InternalML2.g:5567:2: ( (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_CollectionLiteralExpression_1= ruleCollectionLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression | this_TupleLiteralExpression_3= ruleTupleLiteralExpression ) )
            // InternalML2.g:5568:2: (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_CollectionLiteralExpression_1= ruleCollectionLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression | this_TupleLiteralExpression_3= ruleTupleLiteralExpression )
            {
            // InternalML2.g:5568:2: (this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression | this_CollectionLiteralExpression_1= ruleCollectionLiteralExpression | this_TypeLiteralExpression_2= ruleTypeLiteralExpression | this_TupleLiteralExpression_3= ruleTupleLiteralExpression )
            int alt112=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 67:
                {
                alt112=1;
                }
                break;
            case 68:
                {
                int LA112_2 = input.LA(2);

                if ( (LA112_2==62) ) {
                    alt112=3;
                }
                else if ( (LA112_2==12) ) {
                    alt112=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt112=3;
                }
                break;
            case 69:
                {
                int LA112_4 = input.LA(2);

                if ( (LA112_4==62) ) {
                    alt112=3;
                }
                else if ( (LA112_4==12) ) {
                    alt112=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 4, input);

                    throw nvae;
                }
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
                    // InternalML2.g:5569:3: this_PrimitiveLiteralExpression_0= rulePrimitiveLiteralExpression
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
                    // InternalML2.g:5578:3: this_CollectionLiteralExpression_1= ruleCollectionLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getCollectionLiteralExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionLiteralExpression_1=ruleCollectionLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:5587:3: this_TypeLiteralExpression_2= ruleTypeLiteralExpression
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
                case 4 :
                    // InternalML2.g:5596:3: this_TupleLiteralExpression_3= ruleTupleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getTupleLiteralExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleLiteralExpression_3=ruleTupleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExpression_3;
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
    // InternalML2.g:5608:1: entryRulePrimitiveLiteralExpression returns [EObject current=null] : iv_rulePrimitiveLiteralExpression= rulePrimitiveLiteralExpression EOF ;
    public final EObject entryRulePrimitiveLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpression = null;


        try {
            // InternalML2.g:5608:67: (iv_rulePrimitiveLiteralExpression= rulePrimitiveLiteralExpression EOF )
            // InternalML2.g:5609:2: iv_rulePrimitiveLiteralExpression= rulePrimitiveLiteralExpression EOF
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
    // InternalML2.g:5615:1: rulePrimitiveLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_NumberLiteralExpression_2= ruleNumberLiteralExpression | this_StringLiteralExpression_3= ruleStringLiteralExpression ) ;
    public final EObject rulePrimitiveLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_NumberLiteralExpression_2 = null;

        EObject this_StringLiteralExpression_3 = null;



        	enterRule();

        try {
            // InternalML2.g:5621:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_NumberLiteralExpression_2= ruleNumberLiteralExpression | this_StringLiteralExpression_3= ruleStringLiteralExpression ) )
            // InternalML2.g:5622:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_NumberLiteralExpression_2= ruleNumberLiteralExpression | this_StringLiteralExpression_3= ruleStringLiteralExpression )
            {
            // InternalML2.g:5622:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_NumberLiteralExpression_2= ruleNumberLiteralExpression | this_StringLiteralExpression_3= ruleStringLiteralExpression )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt113=1;
                }
                break;
            case 45:
            case 46:
                {
                alt113=2;
                }
                break;
            case RULE_INT:
                {
                alt113=3;
                }
                break;
            case RULE_STRING:
                {
                alt113=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalML2.g:5623:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getNullLiteralExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpression_0=ruleNullLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:5632:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpression_1=ruleBooleanLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:5641:3: this_NumberLiteralExpression_2= ruleNumberLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getNumberLiteralExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteralExpression_2=ruleNumberLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalML2.g:5650:3: this_StringLiteralExpression_3= ruleStringLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpression_3=ruleStringLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpression_3;
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


    // $ANTLR start "entryRuleNullLiteralExpression"
    // InternalML2.g:5662:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalML2.g:5662:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalML2.g:5663:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalML2.g:5669:1: ruleNullLiteralExpression returns [EObject current=null] : ( (lv_nullSymbol_0_0= 'null' ) ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_nullSymbol_0_0=null;


        	enterRule();

        try {
            // InternalML2.g:5675:2: ( ( (lv_nullSymbol_0_0= 'null' ) ) )
            // InternalML2.g:5676:2: ( (lv_nullSymbol_0_0= 'null' ) )
            {
            // InternalML2.g:5676:2: ( (lv_nullSymbol_0_0= 'null' ) )
            // InternalML2.g:5677:3: (lv_nullSymbol_0_0= 'null' )
            {
            // InternalML2.g:5677:3: (lv_nullSymbol_0_0= 'null' )
            // InternalML2.g:5678:4: lv_nullSymbol_0_0= 'null'
            {
            lv_nullSymbol_0_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // InternalML2.g:5693:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalML2.g:5693:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalML2.g:5694:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalML2.g:5700:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_booleanSymbol_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5706:2: ( ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) ) )
            // InternalML2.g:5707:2: ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) )
            {
            // InternalML2.g:5707:2: ( (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL ) )
            // InternalML2.g:5708:3: (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL )
            {
            // InternalML2.g:5708:3: (lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL )
            // InternalML2.g:5709:4: lv_booleanSymbol_0_0= ruleBOOLEAN_LITERAL
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
    // InternalML2.g:5729:1: entryRuleNumberLiteralExpression returns [EObject current=null] : iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF ;
    public final EObject entryRuleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpression = null;


        try {
            // InternalML2.g:5729:64: (iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF )
            // InternalML2.g:5730:2: iv_ruleNumberLiteralExpression= ruleNumberLiteralExpression EOF
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
    // InternalML2.g:5736:1: ruleNumberLiteralExpression returns [EObject current=null] : ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numberSymbol_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5742:2: ( ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalML2.g:5743:2: ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalML2.g:5743:2: ( (lv_numberSymbol_0_0= ruleNUMBER_LITERAL ) )
            // InternalML2.g:5744:3: (lv_numberSymbol_0_0= ruleNUMBER_LITERAL )
            {
            // InternalML2.g:5744:3: (lv_numberSymbol_0_0= ruleNUMBER_LITERAL )
            // InternalML2.g:5745:4: lv_numberSymbol_0_0= ruleNUMBER_LITERAL
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
    // InternalML2.g:5765:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalML2.g:5765:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalML2.g:5766:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalML2.g:5772:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_stringSymbol_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_stringSymbol_0_0=null;


        	enterRule();

        try {
            // InternalML2.g:5778:2: ( ( (lv_stringSymbol_0_0= RULE_STRING ) ) )
            // InternalML2.g:5779:2: ( (lv_stringSymbol_0_0= RULE_STRING ) )
            {
            // InternalML2.g:5779:2: ( (lv_stringSymbol_0_0= RULE_STRING ) )
            // InternalML2.g:5780:3: (lv_stringSymbol_0_0= RULE_STRING )
            {
            // InternalML2.g:5780:3: (lv_stringSymbol_0_0= RULE_STRING )
            // InternalML2.g:5781:4: lv_stringSymbol_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleCollectionLiteralExpression"
    // InternalML2.g:5800:1: entryRuleCollectionLiteralExpression returns [EObject current=null] : iv_ruleCollectionLiteralExpression= ruleCollectionLiteralExpression EOF ;
    public final EObject entryRuleCollectionLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpression = null;


        try {
            // InternalML2.g:5800:68: (iv_ruleCollectionLiteralExpression= ruleCollectionLiteralExpression EOF )
            // InternalML2.g:5801:2: iv_ruleCollectionLiteralExpression= ruleCollectionLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralExpression=ruleCollectionLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpression; 
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
    // $ANTLR end "entryRuleCollectionLiteralExpression"


    // $ANTLR start "ruleCollectionLiteralExpression"
    // InternalML2.g:5807:1: ruleCollectionLiteralExpression returns [EObject current=null] : (otherlv_0= 'Set' otherlv_1= '{' ( (lv_parts_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleOclExpression ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parts_2_0 = null;

        EObject lv_parts_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:5813:2: ( (otherlv_0= 'Set' otherlv_1= '{' ( (lv_parts_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleOclExpression ) ) )* otherlv_5= '}' ) )
            // InternalML2.g:5814:2: (otherlv_0= 'Set' otherlv_1= '{' ( (lv_parts_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleOclExpression ) ) )* otherlv_5= '}' )
            {
            // InternalML2.g:5814:2: (otherlv_0= 'Set' otherlv_1= '{' ( (lv_parts_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleOclExpression ) ) )* otherlv_5= '}' )
            // InternalML2.g:5815:3: otherlv_0= 'Set' otherlv_1= '{' ( (lv_parts_2_0= ruleOclExpression ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleOclExpression ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCollectionLiteralExpressionAccess().getSetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalML2.g:5823:3: ( (lv_parts_2_0= ruleOclExpression ) )
            // InternalML2.g:5824:4: (lv_parts_2_0= ruleOclExpression )
            {
            // InternalML2.g:5824:4: (lv_parts_2_0= ruleOclExpression )
            // InternalML2.g:5825:5: lv_parts_2_0= ruleOclExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpressionAccess().getPartsOclExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_parts_2_0=ruleOclExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpressionRule());
              					}
              					add(
              						current,
              						"parts",
              						lv_parts_2_0,
              						"br.ufes.inf.nemo.ml2.ML2.OclExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalML2.g:5842:3: (otherlv_3= ',' ( (lv_parts_4_0= ruleOclExpression ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==21) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalML2.g:5843:4: otherlv_3= ',' ( (lv_parts_4_0= ruleOclExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpressionAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalML2.g:5847:4: ( (lv_parts_4_0= ruleOclExpression ) )
            	    // InternalML2.g:5848:5: (lv_parts_4_0= ruleOclExpression )
            	    {
            	    // InternalML2.g:5848:5: (lv_parts_4_0= ruleOclExpression )
            	    // InternalML2.g:5849:6: lv_parts_4_0= ruleOclExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCollectionLiteralExpressionAccess().getPartsOclExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_parts_4_0=ruleOclExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parts",
            	      							lv_parts_4_0,
            	      							"br.ufes.inf.nemo.ml2.ML2.OclExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpressionAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleCollectionLiteralExpression"


    // $ANTLR start "entryRuleTypeLiteralExpression"
    // InternalML2.g:5875:1: entryRuleTypeLiteralExpression returns [EObject current=null] : iv_ruleTypeLiteralExpression= ruleTypeLiteralExpression EOF ;
    public final EObject entryRuleTypeLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpression = null;


        try {
            // InternalML2.g:5875:62: (iv_ruleTypeLiteralExpression= ruleTypeLiteralExpression EOF )
            // InternalML2.g:5876:2: iv_ruleTypeLiteralExpression= ruleTypeLiteralExpression EOF
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
    // InternalML2.g:5882:1: ruleTypeLiteralExpression returns [EObject current=null] : (this_PrimitiveTypeName_0= rulePrimitiveTypeName | this_CollectionTypeName_1= ruleCollectionTypeName | this_TupleTypeName_2= ruleTupleTypeName | this_OclTypeName_3= ruleOclTypeName | this_DataTypeName_4= ruleDataTypeName ) ;
    public final EObject ruleTypeLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeName_0 = null;

        EObject this_CollectionTypeName_1 = null;

        EObject this_TupleTypeName_2 = null;

        EObject this_OclTypeName_3 = null;

        EObject this_DataTypeName_4 = null;



        	enterRule();

        try {
            // InternalML2.g:5888:2: ( (this_PrimitiveTypeName_0= rulePrimitiveTypeName | this_CollectionTypeName_1= ruleCollectionTypeName | this_TupleTypeName_2= ruleTupleTypeName | this_OclTypeName_3= ruleOclTypeName | this_DataTypeName_4= ruleDataTypeName ) )
            // InternalML2.g:5889:2: (this_PrimitiveTypeName_0= rulePrimitiveTypeName | this_CollectionTypeName_1= ruleCollectionTypeName | this_TupleTypeName_2= ruleTupleTypeName | this_OclTypeName_3= ruleOclTypeName | this_DataTypeName_4= ruleDataTypeName )
            {
            // InternalML2.g:5889:2: (this_PrimitiveTypeName_0= rulePrimitiveTypeName | this_CollectionTypeName_1= ruleCollectionTypeName | this_TupleTypeName_2= ruleTupleTypeName | this_OclTypeName_3= ruleOclTypeName | this_DataTypeName_4= ruleDataTypeName )
            int alt115=5;
            switch ( input.LA(1) ) {
            case 71:
            case 72:
            case 73:
                {
                alt115=1;
                }
                break;
            case 68:
                {
                alt115=2;
                }
                break;
            case 69:
                {
                alt115=3;
                }
                break;
            case 74:
            case 75:
                {
                alt115=4;
                }
                break;
            case RULE_ID:
                {
                alt115=5;
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
                    // InternalML2.g:5890:3: this_PrimitiveTypeName_0= rulePrimitiveTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getPrimitiveTypeNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeName_0=rulePrimitiveTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeName_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:5899:3: this_CollectionTypeName_1= ruleCollectionTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getCollectionTypeNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionTypeName_1=ruleCollectionTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionTypeName_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalML2.g:5908:3: this_TupleTypeName_2= ruleTupleTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getTupleTypeNameParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleTypeName_2=ruleTupleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTypeName_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalML2.g:5917:3: this_OclTypeName_3= ruleOclTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getOclTypeNameParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OclTypeName_3=ruleOclTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OclTypeName_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalML2.g:5926:3: this_DataTypeName_4= ruleDataTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralExpressionAccess().getDataTypeNameParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DataTypeName_4=ruleDataTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataTypeName_4;
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


    // $ANTLR start "entryRuleTupleLiteralExpression"
    // InternalML2.g:5938:1: entryRuleTupleLiteralExpression returns [EObject current=null] : iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF ;
    public final EObject entryRuleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpression = null;


        try {
            // InternalML2.g:5938:63: (iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF )
            // InternalML2.g:5939:2: iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralExpression=ruleTupleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpression; 
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
    // $ANTLR end "entryRuleTupleLiteralExpression"


    // $ANTLR start "ruleTupleLiteralExpression"
    // InternalML2.g:5945:1: ruleTupleLiteralExpression returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_variables_2_0=null;
        Token otherlv_3=null;
        Token lv_variables_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalML2.g:5951:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* otherlv_5= '}' ) )
            // InternalML2.g:5952:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // InternalML2.g:5952:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* otherlv_5= '}' )
            // InternalML2.g:5953:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpressionAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalML2.g:5961:3: ( (lv_variables_2_0= RULE_ID ) )
            // InternalML2.g:5962:4: (lv_variables_2_0= RULE_ID )
            {
            // InternalML2.g:5962:4: (lv_variables_2_0= RULE_ID )
            // InternalML2.g:5963:5: lv_variables_2_0= RULE_ID
            {
            lv_variables_2_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variables_2_0, grammarAccess.getTupleLiteralExpressionAccess().getVariablesIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleLiteralExpressionRule());
              					}
              					addWithLastConsumed(
              						current,
              						"variables",
              						lv_variables_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalML2.g:5979:3: (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==21) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalML2.g:5980:4: otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpressionAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalML2.g:5984:4: ( (lv_variables_4_0= RULE_ID ) )
            	    // InternalML2.g:5985:5: (lv_variables_4_0= RULE_ID )
            	    {
            	    // InternalML2.g:5985:5: (lv_variables_4_0= RULE_ID )
            	    // InternalML2.g:5986:6: lv_variables_4_0= RULE_ID
            	    {
            	    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_variables_4_0, grammarAccess.getTupleLiteralExpressionAccess().getVariablesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getTupleLiteralExpressionRule());
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
            	    break loop116;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpressionAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleTupleLiteralExpression"


    // $ANTLR start "entryRuleVariableExpression"
    // InternalML2.g:6011:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalML2.g:6011:59: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalML2.g:6012:2: iv_ruleVariableExpression= ruleVariableExpression EOF
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
    // InternalML2.g:6018:1: ruleVariableExpression returns [EObject current=null] : ( ( (lv_referringVariable_0_0= RULE_ID ) ) | ( (lv_referringVariable_1_0= 'self' ) ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        Token lv_referringVariable_0_0=null;
        Token lv_referringVariable_1_0=null;


        	enterRule();

        try {
            // InternalML2.g:6024:2: ( ( ( (lv_referringVariable_0_0= RULE_ID ) ) | ( (lv_referringVariable_1_0= 'self' ) ) ) )
            // InternalML2.g:6025:2: ( ( (lv_referringVariable_0_0= RULE_ID ) ) | ( (lv_referringVariable_1_0= 'self' ) ) )
            {
            // InternalML2.g:6025:2: ( ( (lv_referringVariable_0_0= RULE_ID ) ) | ( (lv_referringVariable_1_0= 'self' ) ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==RULE_ID) ) {
                alt117=1;
            }
            else if ( (LA117_0==70) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalML2.g:6026:3: ( (lv_referringVariable_0_0= RULE_ID ) )
                    {
                    // InternalML2.g:6026:3: ( (lv_referringVariable_0_0= RULE_ID ) )
                    // InternalML2.g:6027:4: (lv_referringVariable_0_0= RULE_ID )
                    {
                    // InternalML2.g:6027:4: (lv_referringVariable_0_0= RULE_ID )
                    // InternalML2.g:6028:5: lv_referringVariable_0_0= RULE_ID
                    {
                    lv_referringVariable_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referringVariable_0_0, grammarAccess.getVariableExpressionAccess().getReferringVariableIDTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableExpressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"referringVariable",
                      						lv_referringVariable_0_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6045:3: ( (lv_referringVariable_1_0= 'self' ) )
                    {
                    // InternalML2.g:6045:3: ( (lv_referringVariable_1_0= 'self' ) )
                    // InternalML2.g:6046:4: (lv_referringVariable_1_0= 'self' )
                    {
                    // InternalML2.g:6046:4: (lv_referringVariable_1_0= 'self' )
                    // InternalML2.g:6047:5: lv_referringVariable_1_0= 'self'
                    {
                    lv_referringVariable_1_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_referringVariable_1_0, grammarAccess.getVariableExpressionAccess().getReferringVariableSelfKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableExpressionRule());
                      					}
                      					setWithLastConsumed(current, "referringVariable", lv_referringVariable_1_0, "self");
                      				
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


    // $ANTLR start "entryRuleBOOLEAN_LITERAL"
    // InternalML2.g:6063:1: entryRuleBOOLEAN_LITERAL returns [String current=null] : iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF ;
    public final String entryRuleBOOLEAN_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN_LITERAL = null;


        try {
            // InternalML2.g:6063:55: (iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF )
            // InternalML2.g:6064:2: iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF
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
    // InternalML2.g:6070:1: ruleBOOLEAN_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalML2.g:6076:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalML2.g:6077:2: (kw= 'true' | kw= 'false' )
            {
            // InternalML2.g:6077:2: (kw= 'true' | kw= 'false' )
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
                    // InternalML2.g:6078:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalML2.g:6084:3: kw= 'false'
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
    // InternalML2.g:6093:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalML2.g:6093:54: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalML2.g:6094:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
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
    // InternalML2.g:6100:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalML2.g:6106:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalML2.g:6107:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalML2.g:6107:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalML2.g:6108:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalML2.g:6115:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==16) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalML2.g:6116:4: kw= '.' this_INT_2= RULE_INT
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


    // $ANTLR start "entryRulePrimitiveTypeName"
    // InternalML2.g:6133:1: entryRulePrimitiveTypeName returns [EObject current=null] : iv_rulePrimitiveTypeName= rulePrimitiveTypeName EOF ;
    public final EObject entryRulePrimitiveTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeName = null;


        try {
            // InternalML2.g:6133:58: (iv_rulePrimitiveTypeName= rulePrimitiveTypeName EOF )
            // InternalML2.g:6134:2: iv_rulePrimitiveTypeName= rulePrimitiveTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeName=rulePrimitiveTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeName; 
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
    // $ANTLR end "entryRulePrimitiveTypeName"


    // $ANTLR start "rulePrimitiveTypeName"
    // InternalML2.g:6140:1: rulePrimitiveTypeName returns [EObject current=null] : ( ( (lv_typename_0_0= 'Boolean' ) ) | ( (lv_typename_1_0= 'Number' ) ) | ( (lv_typename_2_0= 'String' ) ) ) ;
    public final EObject rulePrimitiveTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_typename_0_0=null;
        Token lv_typename_1_0=null;
        Token lv_typename_2_0=null;


        	enterRule();

        try {
            // InternalML2.g:6146:2: ( ( ( (lv_typename_0_0= 'Boolean' ) ) | ( (lv_typename_1_0= 'Number' ) ) | ( (lv_typename_2_0= 'String' ) ) ) )
            // InternalML2.g:6147:2: ( ( (lv_typename_0_0= 'Boolean' ) ) | ( (lv_typename_1_0= 'Number' ) ) | ( (lv_typename_2_0= 'String' ) ) )
            {
            // InternalML2.g:6147:2: ( ( (lv_typename_0_0= 'Boolean' ) ) | ( (lv_typename_1_0= 'Number' ) ) | ( (lv_typename_2_0= 'String' ) ) )
            int alt120=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt120=1;
                }
                break;
            case 72:
                {
                alt120=2;
                }
                break;
            case 73:
                {
                alt120=3;
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
                    // InternalML2.g:6148:3: ( (lv_typename_0_0= 'Boolean' ) )
                    {
                    // InternalML2.g:6148:3: ( (lv_typename_0_0= 'Boolean' ) )
                    // InternalML2.g:6149:4: (lv_typename_0_0= 'Boolean' )
                    {
                    // InternalML2.g:6149:4: (lv_typename_0_0= 'Boolean' )
                    // InternalML2.g:6150:5: lv_typename_0_0= 'Boolean'
                    {
                    lv_typename_0_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_0, grammarAccess.getPrimitiveTypeNameAccess().getTypenameBooleanKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_0, "Boolean");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6163:3: ( (lv_typename_1_0= 'Number' ) )
                    {
                    // InternalML2.g:6163:3: ( (lv_typename_1_0= 'Number' ) )
                    // InternalML2.g:6164:4: (lv_typename_1_0= 'Number' )
                    {
                    // InternalML2.g:6164:4: (lv_typename_1_0= 'Number' )
                    // InternalML2.g:6165:5: lv_typename_1_0= 'Number'
                    {
                    lv_typename_1_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_1_0, grammarAccess.getPrimitiveTypeNameAccess().getTypenameNumberKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_1_0, "Number");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6178:3: ( (lv_typename_2_0= 'String' ) )
                    {
                    // InternalML2.g:6178:3: ( (lv_typename_2_0= 'String' ) )
                    // InternalML2.g:6179:4: (lv_typename_2_0= 'String' )
                    {
                    // InternalML2.g:6179:4: (lv_typename_2_0= 'String' )
                    // InternalML2.g:6180:5: lv_typename_2_0= 'String'
                    {
                    lv_typename_2_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_2_0, grammarAccess.getPrimitiveTypeNameAccess().getTypenameStringKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_2_0, "String");
                      				
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
    // $ANTLR end "rulePrimitiveTypeName"


    // $ANTLR start "entryRuleCollectionTypeName"
    // InternalML2.g:6196:1: entryRuleCollectionTypeName returns [EObject current=null] : iv_ruleCollectionTypeName= ruleCollectionTypeName EOF ;
    public final EObject entryRuleCollectionTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeName = null;


        try {
            // InternalML2.g:6196:59: (iv_ruleCollectionTypeName= ruleCollectionTypeName EOF )
            // InternalML2.g:6197:2: iv_ruleCollectionTypeName= ruleCollectionTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeName=ruleCollectionTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeName; 
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
    // $ANTLR end "entryRuleCollectionTypeName"


    // $ANTLR start "ruleCollectionTypeName"
    // InternalML2.g:6203:1: ruleCollectionTypeName returns [EObject current=null] : ( ( (lv_typename_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_elementType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCollectionTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_typename_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:6209:2: ( ( ( (lv_typename_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_elementType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' ) )
            // InternalML2.g:6210:2: ( ( (lv_typename_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_elementType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' )
            {
            // InternalML2.g:6210:2: ( ( (lv_typename_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_elementType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')' )
            // InternalML2.g:6211:3: ( (lv_typename_0_0= 'Set' ) ) otherlv_1= '(' ( (lv_elementType_2_0= ruleTypeLiteralExpression ) ) otherlv_3= ')'
            {
            // InternalML2.g:6211:3: ( (lv_typename_0_0= 'Set' ) )
            // InternalML2.g:6212:4: (lv_typename_0_0= 'Set' )
            {
            // InternalML2.g:6212:4: (lv_typename_0_0= 'Set' )
            // InternalML2.g:6213:5: lv_typename_0_0= 'Set'
            {
            lv_typename_0_0=(Token)match(input,68,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_typename_0_0, grammarAccess.getCollectionTypeNameAccess().getTypenameSetKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCollectionTypeNameRule());
              					}
              					setWithLastConsumed(current, "typename", lv_typename_0_0, "Set");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:6229:3: ( (lv_elementType_2_0= ruleTypeLiteralExpression ) )
            // InternalML2.g:6230:4: (lv_elementType_2_0= ruleTypeLiteralExpression )
            {
            // InternalML2.g:6230:4: (lv_elementType_2_0= ruleTypeLiteralExpression )
            // InternalML2.g:6231:5: lv_elementType_2_0= ruleTypeLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeNameAccess().getElementTypeTypeLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_68);
            lv_elementType_2_0=ruleTypeLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeNameRule());
              					}
              					set(
              						current,
              						"elementType",
              						lv_elementType_2_0,
              						"br.ufes.inf.nemo.ml2.ML2.TypeLiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeNameAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleCollectionTypeName"


    // $ANTLR start "entryRuleTupleTypeName"
    // InternalML2.g:6256:1: entryRuleTupleTypeName returns [EObject current=null] : iv_ruleTupleTypeName= ruleTupleTypeName EOF ;
    public final EObject entryRuleTupleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeName = null;


        try {
            // InternalML2.g:6256:54: (iv_ruleTupleTypeName= ruleTupleTypeName EOF )
            // InternalML2.g:6257:2: iv_ruleTupleTypeName= ruleTupleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleTypeName=ruleTupleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeName; 
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
    // $ANTLR end "entryRuleTupleTypeName"


    // $ANTLR start "ruleTupleTypeName"
    // InternalML2.g:6263:1: ruleTupleTypeName returns [EObject current=null] : ( ( (lv_typename_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTupleTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_typename_0_0=null;
        Token otherlv_1=null;
        Token lv_variables_2_0=null;
        Token otherlv_3=null;
        Token lv_variables_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalML2.g:6269:2: ( ( ( (lv_typename_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ) )
            // InternalML2.g:6270:2: ( ( (lv_typename_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )
            {
            // InternalML2.g:6270:2: ( ( (lv_typename_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )
            // InternalML2.g:6271:3: ( (lv_typename_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* )? otherlv_5= ')'
            {
            // InternalML2.g:6271:3: ( (lv_typename_0_0= 'Tuple' ) )
            // InternalML2.g:6272:4: (lv_typename_0_0= 'Tuple' )
            {
            // InternalML2.g:6272:4: (lv_typename_0_0= 'Tuple' )
            // InternalML2.g:6273:5: lv_typename_0_0= 'Tuple'
            {
            lv_typename_0_0=(Token)match(input,69,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_typename_0_0, grammarAccess.getTupleTypeNameAccess().getTypenameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleTypeNameRule());
              					}
              					setWithLastConsumed(current, "typename", lv_typename_0_0, "Tuple");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleTypeNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalML2.g:6289:3: ( ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )* )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_ID) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalML2.g:6290:4: ( (lv_variables_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )*
                    {
                    // InternalML2.g:6290:4: ( (lv_variables_2_0= RULE_ID ) )
                    // InternalML2.g:6291:5: (lv_variables_2_0= RULE_ID )
                    {
                    // InternalML2.g:6291:5: (lv_variables_2_0= RULE_ID )
                    // InternalML2.g:6292:6: lv_variables_2_0= RULE_ID
                    {
                    lv_variables_2_0=(Token)match(input,RULE_ID,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_variables_2_0, grammarAccess.getTupleTypeNameAccess().getVariablesIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTupleTypeNameRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"variables",
                      							lv_variables_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalML2.g:6308:4: (otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==21) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalML2.g:6309:5: otherlv_3= ',' ( (lv_variables_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getTupleTypeNameAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalML2.g:6313:5: ( (lv_variables_4_0= RULE_ID ) )
                    	    // InternalML2.g:6314:6: (lv_variables_4_0= RULE_ID )
                    	    {
                    	    // InternalML2.g:6314:6: (lv_variables_4_0= RULE_ID )
                    	    // InternalML2.g:6315:7: lv_variables_4_0= RULE_ID
                    	    {
                    	    lv_variables_4_0=(Token)match(input,RULE_ID,FOLLOW_75); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_variables_4_0, grammarAccess.getTupleTypeNameAccess().getVariablesIDTerminalRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getTupleTypeNameRule());
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
                    	    break loop121;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleTypeNameAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleTupleTypeName"


    // $ANTLR start "entryRuleOclTypeName"
    // InternalML2.g:6341:1: entryRuleOclTypeName returns [EObject current=null] : iv_ruleOclTypeName= ruleOclTypeName EOF ;
    public final EObject entryRuleOclTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclTypeName = null;


        try {
            // InternalML2.g:6341:52: (iv_ruleOclTypeName= ruleOclTypeName EOF )
            // InternalML2.g:6342:2: iv_ruleOclTypeName= ruleOclTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOclTypeName=ruleOclTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclTypeName; 
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
    // $ANTLR end "entryRuleOclTypeName"


    // $ANTLR start "ruleOclTypeName"
    // InternalML2.g:6348:1: ruleOclTypeName returns [EObject current=null] : ( ( (lv_typename_0_0= 'OclAny' ) ) | ( (lv_typename_1_0= 'OclVoid' ) ) ) ;
    public final EObject ruleOclTypeName() throws RecognitionException {
        EObject current = null;

        Token lv_typename_0_0=null;
        Token lv_typename_1_0=null;


        	enterRule();

        try {
            // InternalML2.g:6354:2: ( ( ( (lv_typename_0_0= 'OclAny' ) ) | ( (lv_typename_1_0= 'OclVoid' ) ) ) )
            // InternalML2.g:6355:2: ( ( (lv_typename_0_0= 'OclAny' ) ) | ( (lv_typename_1_0= 'OclVoid' ) ) )
            {
            // InternalML2.g:6355:2: ( ( (lv_typename_0_0= 'OclAny' ) ) | ( (lv_typename_1_0= 'OclVoid' ) ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==74) ) {
                alt123=1;
            }
            else if ( (LA123_0==75) ) {
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
                    // InternalML2.g:6356:3: ( (lv_typename_0_0= 'OclAny' ) )
                    {
                    // InternalML2.g:6356:3: ( (lv_typename_0_0= 'OclAny' ) )
                    // InternalML2.g:6357:4: (lv_typename_0_0= 'OclAny' )
                    {
                    // InternalML2.g:6357:4: (lv_typename_0_0= 'OclAny' )
                    // InternalML2.g:6358:5: lv_typename_0_0= 'OclAny'
                    {
                    lv_typename_0_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_0_0, grammarAccess.getOclTypeNameAccess().getTypenameOclAnyKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOclTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_0_0, "OclAny");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6371:3: ( (lv_typename_1_0= 'OclVoid' ) )
                    {
                    // InternalML2.g:6371:3: ( (lv_typename_1_0= 'OclVoid' ) )
                    // InternalML2.g:6372:4: (lv_typename_1_0= 'OclVoid' )
                    {
                    // InternalML2.g:6372:4: (lv_typename_1_0= 'OclVoid' )
                    // InternalML2.g:6373:5: lv_typename_1_0= 'OclVoid'
                    {
                    lv_typename_1_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typename_1_0, grammarAccess.getOclTypeNameAccess().getTypenameOclVoidKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOclTypeNameRule());
                      					}
                      					setWithLastConsumed(current, "typename", lv_typename_1_0, "OclVoid");
                      				
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
    // $ANTLR end "ruleOclTypeName"


    // $ANTLR start "entryRuleDataTypeName"
    // InternalML2.g:6389:1: entryRuleDataTypeName returns [EObject current=null] : iv_ruleDataTypeName= ruleDataTypeName EOF ;
    public final EObject entryRuleDataTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeName = null;


        try {
            // InternalML2.g:6389:53: (iv_ruleDataTypeName= ruleDataTypeName EOF )
            // InternalML2.g:6390:2: iv_ruleDataTypeName= ruleDataTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeName=ruleDataTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeName; 
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
    // $ANTLR end "entryRuleDataTypeName"


    // $ANTLR start "ruleDataTypeName"
    // InternalML2.g:6396:1: ruleDataTypeName returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDataTypeName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalML2.g:6402:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalML2.g:6403:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalML2.g:6403:2: ( (otherlv_0= RULE_ID ) )
            // InternalML2.g:6404:3: (otherlv_0= RULE_ID )
            {
            // InternalML2.g:6404:3: (otherlv_0= RULE_ID )
            // InternalML2.g:6405:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDataTypeNameRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getDataTypeNameAccess().getTypenameDataTypeCrossReference_0());
              			
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
    // $ANTLR end "ruleDataTypeName"


    // $ANTLR start "ruleCategorizationType"
    // InternalML2.g:6419:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:6425:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalML2.g:6426:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalML2.g:6426:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt124=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt124=1;
                }
                break;
            case 77:
                {
                alt124=2;
                }
                break;
            case 78:
                {
                alt124=3;
                }
                break;
            case 79:
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
                    // InternalML2.g:6427:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalML2.g:6427:3: (enumLiteral_0= 'categorizes' )
                    // InternalML2.g:6428:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6435:3: (enumLiteral_1= 'completeCategorizes' )
                    {
                    // InternalML2.g:6435:3: (enumLiteral_1= 'completeCategorizes' )
                    // InternalML2.g:6436:4: enumLiteral_1= 'completeCategorizes'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6443:3: (enumLiteral_2= 'disjointCategorizes' )
                    {
                    // InternalML2.g:6443:3: (enumLiteral_2= 'disjointCategorizes' )
                    // InternalML2.g:6444:4: enumLiteral_2= 'disjointCategorizes'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6451:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalML2.g:6451:3: (enumLiteral_3= 'partitions' )
                    // InternalML2.g:6452:4: enumLiteral_3= 'partitions'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
    // InternalML2.g:6462:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:6468:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) )
            // InternalML2.g:6469:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            {
            // InternalML2.g:6469:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            int alt125=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt125=1;
                }
                break;
            case 72:
                {
                alt125=2;
                }
                break;
            case 71:
                {
                alt125=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // InternalML2.g:6470:3: (enumLiteral_0= 'String' )
                    {
                    // InternalML2.g:6470:3: (enumLiteral_0= 'String' )
                    // InternalML2.g:6471:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6478:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalML2.g:6478:3: (enumLiteral_1= 'Number' )
                    // InternalML2.g:6479:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6486:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalML2.g:6486:3: (enumLiteral_2= 'Boolean' )
                    // InternalML2.g:6487:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalML2.g:6497:1: ruleRegularityFeatureType returns [Enumerator current=null] : ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) ) ;
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
            // InternalML2.g:6503:2: ( ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) ) )
            // InternalML2.g:6504:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) )
            {
            // InternalML2.g:6504:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) )
            int alt126=6;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt126=1;
                }
                break;
            case 81:
                {
                alt126=2;
                }
                break;
            case 82:
                {
                alt126=3;
                }
                break;
            case 83:
                {
                alt126=4;
                }
                break;
            case 84:
                {
                alt126=5;
                }
                break;
            case 85:
                {
                alt126=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // InternalML2.g:6505:3: (enumLiteral_0= 'determinesMaxValue' )
                    {
                    // InternalML2.g:6505:3: (enumLiteral_0= 'determinesMaxValue' )
                    // InternalML2.g:6506:4: enumLiteral_0= 'determinesMaxValue'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6513:3: (enumLiteral_1= 'determinesMinValue' )
                    {
                    // InternalML2.g:6513:3: (enumLiteral_1= 'determinesMinValue' )
                    // InternalML2.g:6514:4: enumLiteral_1= 'determinesMinValue'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6521:3: (enumLiteral_2= 'determinesValue' )
                    {
                    // InternalML2.g:6521:3: (enumLiteral_2= 'determinesValue' )
                    // InternalML2.g:6522:4: enumLiteral_2= 'determinesValue'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6529:3: (enumLiteral_3= 'determinesAllowedValues' )
                    {
                    // InternalML2.g:6529:3: (enumLiteral_3= 'determinesAllowedValues' )
                    // InternalML2.g:6530:4: enumLiteral_3= 'determinesAllowedValues'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:6537:3: (enumLiteral_4= 'determinesType' )
                    {
                    // InternalML2.g:6537:3: (enumLiteral_4= 'determinesType' )
                    // InternalML2.g:6538:4: enumLiteral_4= 'determinesType'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:6545:3: (enumLiteral_5= 'determinesAllowedTypes' )
                    {
                    // InternalML2.g:6545:3: (enumLiteral_5= 'determinesAllowedTypes' )
                    // InternalML2.g:6546:4: enumLiteral_5= 'determinesAllowedTypes'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
    // InternalML2.g:6556:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalML2.g:6562:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalML2.g:6563:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalML2.g:6563:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==44) ) {
                alt127=1;
            }
            else if ( (LA127_0==86) ) {
                alt127=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // InternalML2.g:6564:3: (enumLiteral_0= '=' )
                    {
                    // InternalML2.g:6564:3: (enumLiteral_0= '=' )
                    // InternalML2.g:6565:4: enumLiteral_0= '='
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
                    // InternalML2.g:6572:3: (enumLiteral_1= '<>' )
                    {
                    // InternalML2.g:6572:3: (enumLiteral_1= '<>' )
                    // InternalML2.g:6573:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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
    // InternalML2.g:6583:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:6589:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) ) )
            // InternalML2.g:6590:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalML2.g:6590:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<=' ) )
            int alt128=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt128=1;
                }
                break;
            case 88:
                {
                alt128=2;
                }
                break;
            case 89:
                {
                alt128=3;
                }
                break;
            case 90:
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
                    // InternalML2.g:6591:3: (enumLiteral_0= '>' )
                    {
                    // InternalML2.g:6591:3: (enumLiteral_0= '>' )
                    // InternalML2.g:6592:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOperatorAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getGREATEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6599:3: (enumLiteral_1= '<' )
                    {
                    // InternalML2.g:6599:3: (enumLiteral_1= '<' )
                    // InternalML2.g:6600:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOperatorAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getLESSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6607:3: (enumLiteral_2= '>=' )
                    {
                    // InternalML2.g:6607:3: (enumLiteral_2= '>=' )
                    // InternalML2.g:6608:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationalOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6615:3: (enumLiteral_3= '<=' )
                    {
                    // InternalML2.g:6615:3: (enumLiteral_3= '<=' )
                    // InternalML2.g:6616:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
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
    // InternalML2.g:6626:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalML2.g:6632:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalML2.g:6633:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalML2.g:6633:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==91) ) {
                alt129=1;
            }
            else if ( (LA129_0==47) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalML2.g:6634:3: (enumLiteral_0= '+' )
                    {
                    // InternalML2.g:6634:3: (enumLiteral_0= '+' )
                    // InternalML2.g:6635:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6642:3: (enumLiteral_1= '-' )
                    {
                    // InternalML2.g:6642:3: (enumLiteral_1= '-' )
                    // InternalML2.g:6643:4: enumLiteral_1= '-'
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


    // $ANTLR start "ruleUnaryOperator"
    // InternalML2.g:6653:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:6659:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) ) )
            // InternalML2.g:6660:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) )
            {
            // InternalML2.g:6660:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'not' ) | (enumLiteral_2= '-' ) )
            int alt130=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt130=1;
                }
                break;
            case 93:
                {
                alt130=2;
                }
                break;
            case 47:
                {
                alt130=3;
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
                    // InternalML2.g:6661:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalML2.g:6661:3: (enumLiteral_0= 'NONE' )
                    // InternalML2.g:6662:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6669:3: (enumLiteral_1= 'not' )
                    {
                    // InternalML2.g:6669:3: (enumLiteral_1= 'not' )
                    // InternalML2.g:6670:4: enumLiteral_1= 'not'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6677:3: (enumLiteral_2= '-' )
                    {
                    // InternalML2.g:6677:3: (enumLiteral_2= '-' )
                    // InternalML2.g:6678:4: enumLiteral_2= '-'
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


    // $ANTLR start "ruleUnarySetOperator"
    // InternalML2.g:6688:1: ruleUnarySetOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) ) ;
    public final Enumerator ruleUnarySetOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:6694:2: ( ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) ) )
            // InternalML2.g:6695:2: ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) )
            {
            // InternalML2.g:6695:2: ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'isEmpty' ) | (enumLiteral_2= 'notEmpty' ) | (enumLiteral_3= 'sum' ) )
            int alt131=4;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt131=1;
                }
                break;
            case 95:
                {
                alt131=2;
                }
                break;
            case 96:
                {
                alt131=3;
                }
                break;
            case 97:
                {
                alt131=4;
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
                    // InternalML2.g:6696:3: (enumLiteral_0= 'size' )
                    {
                    // InternalML2.g:6696:3: (enumLiteral_0= 'size' )
                    // InternalML2.g:6697:4: enumLiteral_0= 'size'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getSIZEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnarySetOperatorAccess().getSIZEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6704:3: (enumLiteral_1= 'isEmpty' )
                    {
                    // InternalML2.g:6704:3: (enumLiteral_1= 'isEmpty' )
                    // InternalML2.g:6705:4: enumLiteral_1= 'isEmpty'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getIS_EMPTYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnarySetOperatorAccess().getIS_EMPTYEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6712:3: (enumLiteral_2= 'notEmpty' )
                    {
                    // InternalML2.g:6712:3: (enumLiteral_2= 'notEmpty' )
                    // InternalML2.g:6713:4: enumLiteral_2= 'notEmpty'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getNOT_EMPTYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnarySetOperatorAccess().getNOT_EMPTYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6720:3: (enumLiteral_3= 'sum' )
                    {
                    // InternalML2.g:6720:3: (enumLiteral_3= 'sum' )
                    // InternalML2.g:6721:4: enumLiteral_3= 'sum'
                    {
                    enumLiteral_3=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnarySetOperatorAccess().getSUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnarySetOperatorAccess().getSUMEnumLiteralDeclaration_3());
                      			
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
    // InternalML2.g:6731:1: ruleBinarySetOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'union' ) | (enumLiteral_7= 'intersection' ) | (enumLiteral_8= 'symmetricDifference' ) ) ;
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


        	enterRule();

        try {
            // InternalML2.g:6737:2: ( ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'union' ) | (enumLiteral_7= 'intersection' ) | (enumLiteral_8= 'symmetricDifference' ) ) )
            // InternalML2.g:6738:2: ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'union' ) | (enumLiteral_7= 'intersection' ) | (enumLiteral_8= 'symmetricDifference' ) )
            {
            // InternalML2.g:6738:2: ( (enumLiteral_0= 'includes' ) | (enumLiteral_1= 'includesAll' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'excludesAll' ) | (enumLiteral_4= 'including' ) | (enumLiteral_5= 'excluding' ) | (enumLiteral_6= 'union' ) | (enumLiteral_7= 'intersection' ) | (enumLiteral_8= 'symmetricDifference' ) )
            int alt132=9;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt132=1;
                }
                break;
            case 99:
                {
                alt132=2;
                }
                break;
            case 100:
                {
                alt132=3;
                }
                break;
            case 101:
                {
                alt132=4;
                }
                break;
            case 102:
                {
                alt132=5;
                }
                break;
            case 103:
                {
                alt132=6;
                }
                break;
            case 104:
                {
                alt132=7;
                }
                break;
            case 105:
                {
                alt132=8;
                }
                break;
            case 106:
                {
                alt132=9;
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
                    // InternalML2.g:6739:3: (enumLiteral_0= 'includes' )
                    {
                    // InternalML2.g:6739:3: (enumLiteral_0= 'includes' )
                    // InternalML2.g:6740:4: enumLiteral_0= 'includes'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINCLUDESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinarySetOperatorAccess().getINCLUDESEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6747:3: (enumLiteral_1= 'includesAll' )
                    {
                    // InternalML2.g:6747:3: (enumLiteral_1= 'includesAll' )
                    // InternalML2.g:6748:4: enumLiteral_1= 'includesAll'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINCLUDES_ALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinarySetOperatorAccess().getINCLUDES_ALLEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6755:3: (enumLiteral_2= 'excludes' )
                    {
                    // InternalML2.g:6755:3: (enumLiteral_2= 'excludes' )
                    // InternalML2.g:6756:4: enumLiteral_2= 'excludes'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getEXCLUDESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBinarySetOperatorAccess().getEXCLUDESEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6763:3: (enumLiteral_3= 'excludesAll' )
                    {
                    // InternalML2.g:6763:3: (enumLiteral_3= 'excludesAll' )
                    // InternalML2.g:6764:4: enumLiteral_3= 'excludesAll'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getEXCLUDES_ALLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBinarySetOperatorAccess().getEXCLUDES_ALLEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:6771:3: (enumLiteral_4= 'including' )
                    {
                    // InternalML2.g:6771:3: (enumLiteral_4= 'including' )
                    // InternalML2.g:6772:4: enumLiteral_4= 'including'
                    {
                    enumLiteral_4=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINCLUDINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBinarySetOperatorAccess().getINCLUDINGEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:6779:3: (enumLiteral_5= 'excluding' )
                    {
                    // InternalML2.g:6779:3: (enumLiteral_5= 'excluding' )
                    // InternalML2.g:6780:4: enumLiteral_5= 'excluding'
                    {
                    enumLiteral_5=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getEXCLUDINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getBinarySetOperatorAccess().getEXCLUDINGEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalML2.g:6787:3: (enumLiteral_6= 'union' )
                    {
                    // InternalML2.g:6787:3: (enumLiteral_6= 'union' )
                    // InternalML2.g:6788:4: enumLiteral_6= 'union'
                    {
                    enumLiteral_6=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getUNIONEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getBinarySetOperatorAccess().getUNIONEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalML2.g:6795:3: (enumLiteral_7= 'intersection' )
                    {
                    // InternalML2.g:6795:3: (enumLiteral_7= 'intersection' )
                    // InternalML2.g:6796:4: enumLiteral_7= 'intersection'
                    {
                    enumLiteral_7=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getINTERSECTIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getBinarySetOperatorAccess().getINTERSECTIONEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalML2.g:6803:3: (enumLiteral_8= 'symmetricDifference' )
                    {
                    // InternalML2.g:6803:3: (enumLiteral_8= 'symmetricDifference' )
                    // InternalML2.g:6804:4: enumLiteral_8= 'symmetricDifference'
                    {
                    enumLiteral_8=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinarySetOperatorAccess().getSYMMETRIC_DIFFERENCEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getBinarySetOperatorAccess().getSYMMETRIC_DIFFERENCEEnumLiteralDeclaration_8());
                      			
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
    // InternalML2.g:6814:1: ruleUnaryIterator returns [Enumerator current=null] : ( (enumLiteral_0= 'count' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'select' ) | (enumLiteral_3= 'reject' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'collect' ) ) ;
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
            // InternalML2.g:6820:2: ( ( (enumLiteral_0= 'count' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'select' ) | (enumLiteral_3= 'reject' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'collect' ) ) )
            // InternalML2.g:6821:2: ( (enumLiteral_0= 'count' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'select' ) | (enumLiteral_3= 'reject' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'collect' ) )
            {
            // InternalML2.g:6821:2: ( (enumLiteral_0= 'count' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'select' ) | (enumLiteral_3= 'reject' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'isUnique' ) | (enumLiteral_6= 'collect' ) )
            int alt133=7;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt133=1;
                }
                break;
            case 108:
                {
                alt133=2;
                }
                break;
            case 109:
                {
                alt133=3;
                }
                break;
            case 110:
                {
                alt133=4;
                }
                break;
            case 111:
                {
                alt133=5;
                }
                break;
            case 112:
                {
                alt133=6;
                }
                break;
            case 113:
                {
                alt133=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // InternalML2.g:6822:3: (enumLiteral_0= 'count' )
                    {
                    // InternalML2.g:6822:3: (enumLiteral_0= 'count' )
                    // InternalML2.g:6823:4: enumLiteral_0= 'count'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getCOUNTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryIteratorAccess().getCOUNTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:6830:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalML2.g:6830:3: (enumLiteral_1= 'exists' )
                    // InternalML2.g:6831:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getEXISTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryIteratorAccess().getEXISTSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:6838:3: (enumLiteral_2= 'select' )
                    {
                    // InternalML2.g:6838:3: (enumLiteral_2= 'select' )
                    // InternalML2.g:6839:4: enumLiteral_2= 'select'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getSELECTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnaryIteratorAccess().getSELECTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:6846:3: (enumLiteral_3= 'reject' )
                    {
                    // InternalML2.g:6846:3: (enumLiteral_3= 'reject' )
                    // InternalML2.g:6847:4: enumLiteral_3= 'reject'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getREJECTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnaryIteratorAccess().getREJECTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:6854:3: (enumLiteral_4= 'one' )
                    {
                    // InternalML2.g:6854:3: (enumLiteral_4= 'one' )
                    // InternalML2.g:6855:4: enumLiteral_4= 'one'
                    {
                    enumLiteral_4=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getUnaryIteratorAccess().getONEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:6862:3: (enumLiteral_5= 'isUnique' )
                    {
                    // InternalML2.g:6862:3: (enumLiteral_5= 'isUnique' )
                    // InternalML2.g:6863:4: enumLiteral_5= 'isUnique'
                    {
                    enumLiteral_5=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getIS_UNIQUEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getUnaryIteratorAccess().getIS_UNIQUEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalML2.g:6870:3: (enumLiteral_6= 'collect' )
                    {
                    // InternalML2.g:6870:3: (enumLiteral_6= 'collect' )
                    // InternalML2.g:6871:4: enumLiteral_6= 'collect'
                    {
                    enumLiteral_6=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryIteratorAccess().getCOLLECTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getUnaryIteratorAccess().getCOLLECTEnumLiteralDeclaration_6());
                      			
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

    // $ANTLR start synpred1_InternalML2
    public final void synpred1_InternalML2_fragment() throws RecognitionException {   
        // InternalML2.g:4985:4: ( ruleCallExpression )
        // InternalML2.g:4985:5: ruleCallExpression
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\4\uffff\1\4\1\20\1\4\2\uffff\1\20";
    static final String dfa_3s = "\1\60\4\uffff\1\4\1\54\1\4\2\uffff\1\54";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\1\5\1\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\15\uffff\1\1\1\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\3\3\3\uffff\1\5\4\uffff\1\4\1\7\6\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\11\3\uffff\1\4\27\uffff\1\11",
            "\1\12",
            "",
            "",
            "\1\11\3\uffff\1\4\27\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment | this_ConstraintDeclaration_5= ruleConstraintDeclaration )";
        }
    }
    static final String dfa_7s = "\33\uffff";
    static final String dfa_8s = "\6\uffff\4\15\6\uffff\2\15\5\uffff\2\15\1\uffff\1\15";
    static final String dfa_9s = "\1\4\1\uffff\1\4\1\24\1\4\1\5\4\4\2\45\1\4\1\uffff\1\4\1\5\2\4\2\46\7\4";
    static final String dfa_10s = "\1\50\1\uffff\1\4\1\24\1\111\1\53\4\125\2\45\1\4\1\uffff\1\4\1\53\2\125\2\46\2\4\1\111\2\125\1\4\1\125";
    static final String dfa_11s = "\1\uffff\1\1\13\uffff\1\2\15\uffff";
    static final String dfa_12s = "\33\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\36\uffff\1\2\4\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\11\37\uffff\1\5\42\uffff\1\10\1\7\1\6",
            "\1\13\45\uffff\1\12",
            "\1\15\11\uffff\2\15\23\uffff\1\15\3\uffff\1\14\2\15\46\uffff\6\1",
            "\1\15\11\uffff\2\15\23\uffff\1\15\3\uffff\1\14\2\15\46\uffff\6\1",
            "\1\15\11\uffff\2\15\23\uffff\1\15\3\uffff\1\14\2\15\46\uffff\6\1",
            "\1\15\11\uffff\2\15\1\16\22\uffff\1\15\3\uffff\1\14\2\15\46\uffff\6\1",
            "\1\17",
            "\1\17",
            "\1\20",
            "",
            "\1\21",
            "\1\23\45\uffff\1\22",
            "\1\15\11\uffff\2\15\1\24\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\46\uffff\6\1",
            "\1\15\11\uffff\2\15\1\16\22\uffff\1\15\3\uffff\1\14\2\15\46\uffff\6\1",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\11\102\uffff\1\10\1\7\1\6",
            "\1\15\11\uffff\2\15\1\24\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\46\uffff\6\1",
            "\1\15\11\uffff\2\15\1\31\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\46\uffff\6\1",
            "\1\32",
            "\1\15\11\uffff\2\15\1\31\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\46\uffff\6\1"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1844:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )";
        }
    }
    static final String dfa_14s = "\34\uffff";
    static final String dfa_15s = "\6\uffff\1\14\7\uffff\3\14\6\uffff\3\14\1\uffff\1\14";
    static final String dfa_16s = "\1\50\1\uffff\1\4\1\24\1\4\1\5\1\4\2\45\3\4\1\uffff\1\5\3\4\2\46\11\4";
    static final String dfa_17s = "\1\51\1\uffff\1\4\1\24\1\44\1\53\1\125\2\45\3\4\1\uffff\1\53\3\125\2\46\4\4\3\125\1\4\1\125";
    static final String dfa_18s = "\1\uffff\1\1\12\uffff\1\2\17\uffff";
    static final String dfa_19s = "\34\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\6\37\uffff\1\5",
            "\1\10\45\uffff\1\7",
            "\1\14\11\uffff\2\14\1\11\22\uffff\1\14\3\uffff\1\12\2\14\1\13\45\uffff\6\1",
            "\1\15",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "\1\22\45\uffff\1\21",
            "\1\14\11\uffff\2\14\1\11\22\uffff\1\14\3\uffff\1\12\2\14\1\13\45\uffff\6\1",
            "\1\14\11\uffff\2\14\1\23\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\45\uffff\6\1",
            "\1\14\11\uffff\2\14\1\25\22\uffff\1\14\4\uffff\2\14\46\uffff\6\1",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\6",
            "\1\14\11\uffff\2\14\1\23\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\45\uffff\6\1",
            "\1\14\11\uffff\2\14\1\32\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\45\uffff\6\1",
            "\1\14\11\uffff\2\14\1\25\22\uffff\1\14\4\uffff\2\14\46\uffff\6\1",
            "\1\33",
            "\1\14\11\uffff\2\14\1\32\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\45\uffff\6\1"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2258:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )";
        }
    }
    static final String dfa_21s = "\17\uffff";
    static final String dfa_22s = "\3\4\2\20\4\4\1\20\2\uffff\1\20\2\uffff";
    static final String dfa_23s = "\1\51\2\4\2\54\1\4\1\57\1\4\1\14\1\54\2\uffff\1\54\2\uffff";
    static final String dfa_24s = "\12\uffff\1\3\1\4\1\uffff\1\1\1\2";
    static final String dfa_25s = "\17\uffff}>";
    static final String[] dfa_26s = {
            "\1\3\36\uffff\1\2\5\uffff\1\1",
            "\1\4",
            "\1\3",
            "\1\5\33\uffff\1\6",
            "\1\7\33\uffff\1\10",
            "\1\11",
            "\3\12\5\uffff\1\13\27\uffff\1\12\10\uffff\3\12",
            "\1\14",
            "\1\15\7\uffff\1\16",
            "\1\5\33\uffff\1\6",
            "",
            "",
            "\1\7\33\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2736:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )";
        }
    }
    static final String dfa_27s = "\7\uffff";
    static final String dfa_28s = "\1\4\1\20\2\4\1\20\2\uffff";
    static final String dfa_29s = "\1\4\1\54\1\4\1\57\1\54\2\uffff";
    static final String dfa_30s = "\5\uffff\1\1\1\2";
    static final String dfa_31s = "\7\uffff}>";
    static final String[] dfa_32s = {
            "\1\1",
            "\1\2\33\uffff\1\3",
            "\1\4",
            "\3\5\5\uffff\1\6\27\uffff\1\5\10\uffff\3\5",
            "\1\2\33\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "3399:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00010308F34CA010L});
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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C901002L,0x000000000000F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000CA01002L,0x000000000000F000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C201002L,0x000000000000F000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008201002L,0x000000000000F000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000010L,0x0000000000000380L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000380L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000200000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000200002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000048000000000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000048000200000L,0x00000000003F0000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000E01000000070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000E00000000060L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4050E00000000070L,0x0000000030000FF8L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000FB0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000600000000070L,0x0000000000000FB8L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000100000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000007800000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000800000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0003FFFFC0000004L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x8000000000200000L});

}
