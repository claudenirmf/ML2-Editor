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

@SuppressWarnings("all")
public class InternalML2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'include'", "';'", "'}'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'class'", "'specializes'", "'datatype'", "'order'", "'subordinatedTo'", "'isPowertypeOf'", "'orderless'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'att'", "'['", "'..'", "']'", "'subsets'", "'regularity'", "'ref'", "'isOppositeTo'", "'*'", "'='", "'true'", "'false'", "'-'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'String'", "'Number'", "'Boolean'", "'determinesMaxValue'", "'determinesMinValue'", "'determinesValue'", "'determinesAllowedValues'", "'determinesType'", "'determinesAllowedTypes'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

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
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModuleKeyword_0());
            		
            // InternalML2.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalML2.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalML2.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalML2.g:86:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalML2.g:107:3: ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_ID||(LA1_0>=18 && LA1_0<=19)||LA1_0==22||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=28 && LA1_0<=31)||LA1_0==35||(LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalML2.g:108:4: (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            	    {
            	    // InternalML2.g:108:4: (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            	    // InternalML2.g:109:5: otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getIncludeKeyword_3_0_0());
            	    				
            	    // InternalML2.g:113:5: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:114:6: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:114:6: ( ruleQualifiedName )
            	    // InternalML2.g:115:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getModelRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2());
            	    				

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

            	    						newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elements_6_0=ruleModelElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
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
            	    kw=(Token)match(input,16,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
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
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

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
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalML2.g:258:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalML2.g:259:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalML2.g:259:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalML2.g:260:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:288:1: ruleModelElement returns [EObject current=null] : ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment ) otherlv_5= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_Import_0 = null;

        EObject this_EntityDeclaration_1 = null;

        EObject this_GeneralizationSet_2 = null;

        EObject this_Feature_3 = null;

        EObject this_FeatureAssignment_4 = null;



        	enterRule();

        try {
            // InternalML2.g:294:2: ( ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment ) otherlv_5= ';' ) )
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment ) otherlv_5= ';' )
            {
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment ) otherlv_5= ';' )
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment ) otherlv_5= ';'
            {
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalML2.g:297:4: this_Import_0= ruleImport
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getImportParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    				current = this_Import_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalML2.g:306:4: this_EntityDeclaration_1= ruleEntityDeclaration
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_EntityDeclaration_1=ruleEntityDeclaration();

                    state._fsp--;


                    				current = this_EntityDeclaration_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalML2.g:315:4: this_GeneralizationSet_2= ruleGeneralizationSet
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_6);
                    this_GeneralizationSet_2=ruleGeneralizationSet();

                    state._fsp--;


                    				current = this_GeneralizationSet_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalML2.g:324:4: this_Feature_3= ruleFeature
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getFeatureParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_6);
                    this_Feature_3=ruleFeature();

                    state._fsp--;


                    				current = this_Feature_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalML2.g:333:4: this_FeatureAssignment_4= ruleFeatureAssignment
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getFeatureAssignmentParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_6);
                    this_FeatureAssignment_4=ruleFeatureAssignment();

                    state._fsp--;


                    				current = this_FeatureAssignment_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelElementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalML2.g:350:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalML2.g:350:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalML2.g:351:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEntityDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDeclaration=ruleEntityDeclaration();

            state._fsp--;

             current =iv_ruleEntityDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:357:1: ruleEntityDeclaration returns [EObject current=null] : (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Individual_1 = null;



        	enterRule();

        try {
            // InternalML2.g:363:2: ( (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) )
            // InternalML2.g:364:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
            {
            // InternalML2.g:364:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22||(LA5_0>=24 && LA5_0<=25)||LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalML2.g:365:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:374:3: this_Individual_1= ruleIndividual
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Individual_1=ruleIndividual();

                    state._fsp--;


                    			current = this_Individual_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:386:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalML2.g:386:46: (iv_ruleClass= ruleClass EOF )
            // InternalML2.g:387:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:393:1: ruleClass returns [EObject current=null] : (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        EObject this_FirstOrderClassOrDataType_0 = null;

        EObject this_HigherOrderClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:399:2: ( (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) )
            // InternalML2.g:400:2: (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass )
            {
            // InternalML2.g:400:2: (this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22||LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25||LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalML2.g:401:3: this_FirstOrderClassOrDataType_0= ruleFirstOrderClassOrDataType
                    {

                    			newCompositeNode(grammarAccess.getClassAccess().getFirstOrderClassOrDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FirstOrderClassOrDataType_0=ruleFirstOrderClassOrDataType();

                    state._fsp--;


                    			current = this_FirstOrderClassOrDataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:410:3: this_HigherOrderClass_1= ruleHigherOrderClass
                    {

                    			newCompositeNode(grammarAccess.getClassAccess().getHigherOrderClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HigherOrderClass_1=ruleHigherOrderClass();

                    state._fsp--;


                    			current = this_HigherOrderClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:422:1: entryRuleFirstOrderClassOrDataType returns [EObject current=null] : iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF ;
    public final EObject entryRuleFirstOrderClassOrDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstOrderClassOrDataType = null;


        try {
            // InternalML2.g:422:66: (iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF )
            // InternalML2.g:423:2: iv_ruleFirstOrderClassOrDataType= ruleFirstOrderClassOrDataType EOF
            {
             newCompositeNode(grammarAccess.getFirstOrderClassOrDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirstOrderClassOrDataType=ruleFirstOrderClassOrDataType();

            state._fsp--;

             current =iv_ruleFirstOrderClassOrDataType; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:429:1: ruleFirstOrderClassOrDataType returns [EObject current=null] : (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFirstOrderClassOrDataType() throws RecognitionException {
        EObject current = null;

        EObject this_FirstOrderClass_0 = null;

        EObject this_DataType_1 = null;



        	enterRule();

        try {
            // InternalML2.g:435:2: ( (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType ) )
            // InternalML2.g:436:2: (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType )
            {
            // InternalML2.g:436:2: (this_FirstOrderClass_0= ruleFirstOrderClass | this_DataType_1= ruleDataType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalML2.g:437:3: this_FirstOrderClass_0= ruleFirstOrderClass
                    {

                    			newCompositeNode(grammarAccess.getFirstOrderClassOrDataTypeAccess().getFirstOrderClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FirstOrderClass_0=ruleFirstOrderClass();

                    state._fsp--;


                    			current = this_FirstOrderClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:446:3: this_DataType_1= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getFirstOrderClassOrDataTypeAccess().getDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:458:1: entryRuleHigherOrderClass returns [EObject current=null] : iv_ruleHigherOrderClass= ruleHigherOrderClass EOF ;
    public final EObject entryRuleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderClass = null;


        try {
            // InternalML2.g:458:57: (iv_ruleHigherOrderClass= ruleHigherOrderClass EOF )
            // InternalML2.g:459:2: iv_ruleHigherOrderClass= ruleHigherOrderClass EOF
            {
             newCompositeNode(grammarAccess.getHigherOrderClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHigherOrderClass=ruleHigherOrderClass();

            state._fsp--;

             current =iv_ruleHigherOrderClass; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:465:1: ruleHigherOrderClass returns [EObject current=null] : (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass ) ;
    public final EObject ruleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        EObject this_HighOrderClass_0 = null;

        EObject this_OrderlessClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:471:2: ( (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass ) )
            // InternalML2.g:472:2: (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass )
            {
            // InternalML2.g:472:2: (this_HighOrderClass_0= ruleHighOrderClass | this_OrderlessClass_1= ruleOrderlessClass )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalML2.g:473:3: this_HighOrderClass_0= ruleHighOrderClass
                    {

                    			newCompositeNode(grammarAccess.getHigherOrderClassAccess().getHighOrderClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HighOrderClass_0=ruleHighOrderClass();

                    state._fsp--;


                    			current = this_HighOrderClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:482:3: this_OrderlessClass_1= ruleOrderlessClass
                    {

                    			newCompositeNode(grammarAccess.getHigherOrderClassAccess().getOrderlessClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrderlessClass_1=ruleOrderlessClass();

                    state._fsp--;


                    			current = this_OrderlessClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:494:1: entryRuleIndividual returns [EObject current=null] : iv_ruleIndividual= ruleIndividual EOF ;
    public final EObject entryRuleIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividual = null;


        try {
            // InternalML2.g:494:51: (iv_ruleIndividual= ruleIndividual EOF )
            // InternalML2.g:495:2: iv_ruleIndividual= ruleIndividual EOF
            {
             newCompositeNode(grammarAccess.getIndividualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndividual=ruleIndividual();

            state._fsp--;

             current =iv_ruleIndividual; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:501:1: ruleIndividual returns [EObject current=null] : (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) ;
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
            // InternalML2.g:507:2: ( (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) )
            // InternalML2.g:508:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            {
            // InternalML2.g:508:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            // InternalML2.g:509:3: otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndividualAccess().getIndividualKeyword_0());
            		
            // InternalML2.g:513:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:514:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:514:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:515:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndividualAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIndividualAccess().getColonKeyword_2());
            		
            // InternalML2.g:535:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:536:4: ( ruleQualifiedName )
            {
            // InternalML2.g:536:4: ( ruleQualifiedName )
            // InternalML2.g:537:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndividualRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIndividualAccess().getClassifiersClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:551:3: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalML2.g:552:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIndividualAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalML2.g:556:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:557:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:557:5: ( ruleQualifiedName )
            	    // InternalML2.g:558:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIndividualRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getIndividualAccess().getClassifiersClassCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalML2.g:573:3: (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalML2.g:574:4: otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalML2.g:578:4: ( (lv_assignments_7_0= ruleFeatureAssignment ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==35||LA10_0==41) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalML2.g:579:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:579:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    // InternalML2.g:580:6: lv_assignments_7_0= ruleFeatureAssignment
                    	    {

                    	    						newCompositeNode(grammarAccess.getIndividualAccess().getAssignmentsFeatureAssignmentParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_assignments_7_0=ruleFeatureAssignment();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:606:1: entryRuleOrderedClass returns [EObject current=null] : iv_ruleOrderedClass= ruleOrderedClass EOF ;
    public final EObject entryRuleOrderedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedClass = null;


        try {
            // InternalML2.g:606:53: (iv_ruleOrderedClass= ruleOrderedClass EOF )
            // InternalML2.g:607:2: iv_ruleOrderedClass= ruleOrderedClass EOF
            {
             newCompositeNode(grammarAccess.getOrderedClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderedClass=ruleOrderedClass();

            state._fsp--;

             current =iv_ruleOrderedClass; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:613:1: ruleOrderedClass returns [EObject current=null] : (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass ) ;
    public final EObject ruleOrderedClass() throws RecognitionException {
        EObject current = null;

        EObject this_HighOrderClass_0 = null;

        EObject this_FirstOrderClass_1 = null;



        	enterRule();

        try {
            // InternalML2.g:619:2: ( (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass ) )
            // InternalML2.g:620:2: (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass )
            {
            // InternalML2.g:620:2: (this_HighOrderClass_0= ruleHighOrderClass | this_FirstOrderClass_1= ruleFirstOrderClass )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalML2.g:621:3: this_HighOrderClass_0= ruleHighOrderClass
                    {

                    			newCompositeNode(grammarAccess.getOrderedClassAccess().getHighOrderClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HighOrderClass_0=ruleHighOrderClass();

                    state._fsp--;


                    			current = this_HighOrderClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:630:3: this_FirstOrderClass_1= ruleFirstOrderClass
                    {

                    			newCompositeNode(grammarAccess.getOrderedClassAccess().getFirstOrderClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FirstOrderClass_1=ruleFirstOrderClass();

                    state._fsp--;


                    			current = this_FirstOrderClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:642:1: entryRuleFirstOrderClass returns [EObject current=null] : iv_ruleFirstOrderClass= ruleFirstOrderClass EOF ;
    public final EObject entryRuleFirstOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstOrderClass = null;


        try {
            // InternalML2.g:642:56: (iv_ruleFirstOrderClass= ruleFirstOrderClass EOF )
            // InternalML2.g:643:2: iv_ruleFirstOrderClass= ruleFirstOrderClass EOF
            {
             newCompositeNode(grammarAccess.getFirstOrderClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirstOrderClass=ruleFirstOrderClass();

            state._fsp--;

             current =iv_ruleFirstOrderClass; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:649:1: ruleFirstOrderClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
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
            // InternalML2.g:655:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalML2.g:656:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalML2.g:656:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalML2.g:657:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFirstOrderClassAccess().getClassKeyword_0());
            		
            // InternalML2.g:661:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:662:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:662:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:663:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFirstOrderClassAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalML2.g:679:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalML2.g:680:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getFirstOrderClassAccess().getColonKeyword_2_0());
                    			
                    // InternalML2.g:684:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:685:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:685:5: ( ruleQualifiedName )
                    // InternalML2.g:686:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFirstOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFirstOrderClassAccess().getClassifiersClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:700:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalML2.g:701:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFirstOrderClassAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalML2.g:705:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:706:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:706:6: ( ruleQualifiedName )
                    	    // InternalML2.g:707:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFirstOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getClassifiersClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:723:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalML2.g:724:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFirstOrderClassAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalML2.g:728:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:729:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:729:5: ( ruleQualifiedName )
                    // InternalML2.g:730:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFirstOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFirstOrderClassAccess().getSuperClassesClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:744:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalML2.g:745:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFirstOrderClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalML2.g:749:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:750:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:750:6: ( ruleQualifiedName )
                    	    // InternalML2.g:751:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFirstOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getSuperClassesClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:767:3: (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalML2.g:768:4: otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getFirstOrderClassAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalML2.g:772:4: ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==RULE_ID) ) {
                                int LA17_6 = input.LA(3);

                                if ( (LA17_6==16||LA17_6==44) ) {
                                    alt17=1;
                                }
                                else if ( (LA17_6==20) ) {
                                    alt17=2;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA17_3 = input.LA(2);

                            if ( (LA17_3==RULE_ID) ) {
                                int LA17_4 = input.LA(3);

                                if ( (LA17_4==16||LA17_4==44) ) {
                                    alt17=1;
                                }
                                else if ( (LA17_4==20) ) {
                                    alt17=2;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA17_4 = input.LA(2);

                            if ( (LA17_4==16||LA17_4==44) ) {
                                alt17=1;
                            }
                            else if ( (LA17_4==20) ) {
                                alt17=2;
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
                    	    // InternalML2.g:773:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:773:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:774:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:774:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    // InternalML2.g:775:7: lv_assignments_11_0= ruleFeatureAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_4_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_assignments_11_0=ruleFeatureAssignment();

                    	    state._fsp--;


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
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:793:5: ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:793:5: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalML2.g:794:6: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:794:6: (lv_features_12_0= ruleFeature )
                    	    // InternalML2.g:795:7: lv_features_12_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getFirstOrderClassAccess().getFeaturesFeatureParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_features_12_0=ruleFeature();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getFirstOrderClassAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:822:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalML2.g:822:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalML2.g:823:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:829:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
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
            // InternalML2.g:835:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalML2.g:836:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalML2.g:836:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalML2.g:837:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalML2.g:841:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:842:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:842:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:843:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalML2.g:859:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalML2.g:860:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getColonKeyword_2_0());
                    			
                    // InternalML2.g:864:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:865:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:865:5: ( ruleQualifiedName )
                    // InternalML2.g:866:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getClassifiersClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:880:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalML2.g:881:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalML2.g:885:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:886:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:886:6: ( ruleQualifiedName )
                    	    // InternalML2.g:887:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getClassifiersClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:903:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalML2.g:904:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalML2.g:908:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:909:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:909:5: ( ruleQualifiedName )
                    // InternalML2.g:910:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getSuperClassesClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:924:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalML2.g:925:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalML2.g:929:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:930:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:930:6: ( ruleQualifiedName )
                    	    // InternalML2.g:931:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getSuperClassesClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:947:3: (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalML2.g:948:4: otherlv_10= '{' ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalML2.g:952:4: ( ( (lv_assignments_11_0= ruleFeatureAssignment ) ) | ( (lv_features_12_0= ruleFeature ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==RULE_ID) ) {
                                int LA23_6 = input.LA(3);

                                if ( (LA23_6==16||LA23_6==44) ) {
                                    alt23=1;
                                }
                                else if ( (LA23_6==20) ) {
                                    alt23=2;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA23_3 = input.LA(2);

                            if ( (LA23_3==RULE_ID) ) {
                                int LA23_4 = input.LA(3);

                                if ( (LA23_4==20) ) {
                                    alt23=2;
                                }
                                else if ( (LA23_4==16||LA23_4==44) ) {
                                    alt23=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA23_4 = input.LA(2);

                            if ( (LA23_4==20) ) {
                                alt23=2;
                            }
                            else if ( (LA23_4==16||LA23_4==44) ) {
                                alt23=1;
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
                    	    // InternalML2.g:953:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:953:5: ( (lv_assignments_11_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:954:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:954:6: (lv_assignments_11_0= ruleFeatureAssignment )
                    	    // InternalML2.g:955:7: lv_assignments_11_0= ruleFeatureAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getAssignmentsFeatureAssignmentParserRuleCall_4_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_assignments_11_0=ruleFeatureAssignment();

                    	    state._fsp--;


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
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:973:5: ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:973:5: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalML2.g:974:6: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:974:6: (lv_features_12_0= ruleFeature )
                    	    // InternalML2.g:975:7: lv_features_12_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getFeaturesFeatureParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_features_12_0=ruleFeature();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:1002:1: entryRuleHighOrderClass returns [EObject current=null] : iv_ruleHighOrderClass= ruleHighOrderClass EOF ;
    public final EObject entryRuleHighOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighOrderClass = null;


        try {
            // InternalML2.g:1002:55: (iv_ruleHighOrderClass= ruleHighOrderClass EOF )
            // InternalML2.g:1003:2: iv_ruleHighOrderClass= ruleHighOrderClass EOF
            {
             newCompositeNode(grammarAccess.getHighOrderClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHighOrderClass=ruleHighOrderClass();

            state._fsp--;

             current =iv_ruleHighOrderClass; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:1009:1: ruleHighOrderClass returns [EObject current=null] : (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? ) ;
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
            // InternalML2.g:1015:2: ( (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? ) )
            // InternalML2.g:1016:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? )
            {
            // InternalML2.g:1016:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )? )
            // InternalML2.g:1017:3: otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighOrderClassAccess().getOrderKeyword_0());
            		
            // InternalML2.g:1021:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalML2.g:1022:4: (lv_order_1_0= RULE_INT )
            {
            // InternalML2.g:1022:4: (lv_order_1_0= RULE_INT )
            // InternalML2.g:1023:5: lv_order_1_0= RULE_INT
            {
            lv_order_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_order_1_0, grammarAccess.getHighOrderClassAccess().getOrderINTTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getHighOrderClassAccess().getClassKeyword_2());
            		
            // InternalML2.g:1043:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalML2.g:1044:4: (lv_name_3_0= RULE_ID )
            {
            // InternalML2.g:1044:4: (lv_name_3_0= RULE_ID )
            // InternalML2.g:1045:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_3_0, grammarAccess.getHighOrderClassAccess().getNameIDTerminalRuleCall_3_0());
            				

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

            // InternalML2.g:1061:3: (otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalML2.g:1062:4: otherlv_4= ':' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getHighOrderClassAccess().getColonKeyword_4_0());
                    			
                    // InternalML2.g:1066:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1067:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1067:5: ( ruleQualifiedName )
                    // InternalML2.g:1068:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHighOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHighOrderClassAccess().getClassifiersClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1082:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalML2.g:1083:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHighOrderClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalML2.g:1087:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1088:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1088:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1089:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getClassifiersClassCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:1105:3: (otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalML2.g:1106:4: otherlv_8= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getHighOrderClassAccess().getSpecializesKeyword_5_0());
                    			
                    // InternalML2.g:1110:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1111:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1111:5: ( ruleQualifiedName )
                    // InternalML2.g:1112:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHighOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHighOrderClassAccess().getSuperClassesClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1126:4: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==21) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalML2.g:1127:5: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getHighOrderClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalML2.g:1131:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1132:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1132:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1133:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getSuperClassesClassCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:1149:3: (otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalML2.g:1150:4: otherlv_12= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getHighOrderClassAccess().getSubordinatedToKeyword_6_0());
                    			
                    // InternalML2.g:1154:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1155:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1155:5: ( ruleQualifiedName )
                    // InternalML2.g:1156:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHighOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHighOrderClassAccess().getSubordinatorsHigherOrderClassCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1170:4: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalML2.g:1171:5: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getHighOrderClassAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalML2.g:1175:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1176:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1176:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1177:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getSubordinatorsHigherOrderClassCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:1193:3: ( ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=48 && LA31_0<=51)) ) {
                alt31=1;
            }
            else if ( (LA31_0==27) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalML2.g:1194:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1194:4: ( ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1195:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1195:5: ( (lv_categorizationType_16_0= ruleCategorizationType ) )
                    // InternalML2.g:1196:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    {
                    // InternalML2.g:1196:6: (lv_categorizationType_16_0= ruleCategorizationType )
                    // InternalML2.g:1197:7: lv_categorizationType_16_0= ruleCategorizationType
                    {

                    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_7_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_16_0=ruleCategorizationType();

                    state._fsp--;


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

                    // InternalML2.g:1214:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1215:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1215:6: ( ruleQualifiedName )
                    // InternalML2.g:1216:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getCategorizedClassClassCrossReference_7_0_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1232:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1232:4: (otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1233:5: otherlv_18= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_3); 

                    					newLeafNode(otherlv_18, grammarAccess.getHighOrderClassAccess().getIsPowertypeOfKeyword_7_1_0());
                    				
                    // InternalML2.g:1237:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1238:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1238:6: ( ruleQualifiedName )
                    // InternalML2.g:1239:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHighOrderClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getPowertypeOfClassCrossReference_7_1_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1255:3: (otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalML2.g:1256:4: otherlv_20= '{' ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )* otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getHighOrderClassAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalML2.g:1260:4: ( ( (lv_assignments_21_0= ruleFeatureAssignment ) ) | ( (lv_features_22_0= ruleFeature ) ) )*
                    loop32:
                    do {
                        int alt32=3;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==RULE_ID) ) {
                                int LA32_6 = input.LA(3);

                                if ( (LA32_6==16||LA32_6==44) ) {
                                    alt32=1;
                                }
                                else if ( (LA32_6==20) ) {
                                    alt32=2;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA32_3 = input.LA(2);

                            if ( (LA32_3==RULE_ID) ) {
                                int LA32_4 = input.LA(3);

                                if ( (LA32_4==16||LA32_4==44) ) {
                                    alt32=1;
                                }
                                else if ( (LA32_4==20) ) {
                                    alt32=2;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA32_4 = input.LA(2);

                            if ( (LA32_4==16||LA32_4==44) ) {
                                alt32=1;
                            }
                            else if ( (LA32_4==20) ) {
                                alt32=2;
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
                    	    // InternalML2.g:1261:5: ( (lv_assignments_21_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:1261:5: ( (lv_assignments_21_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:1262:6: (lv_assignments_21_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:1262:6: (lv_assignments_21_0= ruleFeatureAssignment )
                    	    // InternalML2.g:1263:7: lv_assignments_21_0= ruleFeatureAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_8_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_assignments_21_0=ruleFeatureAssignment();

                    	    state._fsp--;


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
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:1281:5: ( (lv_features_22_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:1281:5: ( (lv_features_22_0= ruleFeature ) )
                    	    // InternalML2.g:1282:6: (lv_features_22_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:1282:6: (lv_features_22_0= ruleFeature )
                    	    // InternalML2.g:1283:7: lv_features_22_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getHighOrderClassAccess().getFeaturesFeatureParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_features_22_0=ruleFeature();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getHighOrderClassAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:1310:1: entryRuleOrderlessClass returns [EObject current=null] : iv_ruleOrderlessClass= ruleOrderlessClass EOF ;
    public final EObject entryRuleOrderlessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderlessClass = null;


        try {
            // InternalML2.g:1310:55: (iv_ruleOrderlessClass= ruleOrderlessClass EOF )
            // InternalML2.g:1311:2: iv_ruleOrderlessClass= ruleOrderlessClass EOF
            {
             newCompositeNode(grammarAccess.getOrderlessClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderlessClass=ruleOrderlessClass();

            state._fsp--;

             current =iv_ruleOrderlessClass; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:1317:1: ruleOrderlessClass returns [EObject current=null] : (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? ) ;
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
            // InternalML2.g:1323:2: ( (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? ) )
            // InternalML2.g:1324:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? )
            {
            // InternalML2.g:1324:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )? )
            // InternalML2.g:1325:3: otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderlessClassAccess().getClassKeyword_1());
            		
            // InternalML2.g:1333:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:1334:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:1334:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:1335:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            // InternalML2.g:1351:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalML2.g:1352:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderlessClassAccess().getColonKeyword_3_0());
                    			
                    // InternalML2.g:1356:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1357:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1357:5: ( ruleQualifiedName )
                    // InternalML2.g:1358:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderlessClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOrderlessClassAccess().getClassifiersClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1372:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalML2.g:1373:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOrderlessClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalML2.g:1377:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1378:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1378:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1379:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getClassifiersClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:1395:3: (otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalML2.g:1396:4: otherlv_7= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOrderlessClassAccess().getSpecializesKeyword_4_0());
                    			
                    // InternalML2.g:1400:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1401:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1401:5: ( ruleQualifiedName )
                    // InternalML2.g:1402:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderlessClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOrderlessClassAccess().getSuperClassesClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1416:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalML2.g:1417:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOrderlessClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalML2.g:1421:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1422:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1422:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1423:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getSuperClassesClassCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:1439:3: (otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalML2.g:1440:4: otherlv_11= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getOrderlessClassAccess().getSubordinatedToKeyword_5_0());
                    			
                    // InternalML2.g:1444:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1445:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1445:5: ( ruleQualifiedName )
                    // InternalML2.g:1446:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderlessClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOrderlessClassAccess().getSubordinatorsHigherOrderClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1460:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalML2.g:1461:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOrderlessClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalML2.g:1465:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1466:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1466:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1467:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getSubordinatorsHigherOrderClassCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:1483:3: ( ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=48 && LA40_0<=51)) ) {
                alt40=1;
            }
            else if ( (LA40_0==27) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // InternalML2.g:1484:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1484:4: ( ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1485:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1485:5: ( (lv_categorizationType_15_0= ruleCategorizationType ) )
                    // InternalML2.g:1486:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    {
                    // InternalML2.g:1486:6: (lv_categorizationType_15_0= ruleCategorizationType )
                    // InternalML2.g:1487:7: lv_categorizationType_15_0= ruleCategorizationType
                    {

                    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_6_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_15_0=ruleCategorizationType();

                    state._fsp--;


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

                    // InternalML2.g:1504:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1505:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1505:6: ( ruleQualifiedName )
                    // InternalML2.g:1506:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getCategorizedClassClassCrossReference_6_0_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1522:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:1522:4: (otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:1523:5: otherlv_17= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_3); 

                    					newLeafNode(otherlv_17, grammarAccess.getOrderlessClassAccess().getIsPowertypeOfKeyword_6_1_0());
                    				
                    // InternalML2.g:1527:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1528:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1528:6: ( ruleQualifiedName )
                    // InternalML2.g:1529:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getOrderlessClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getPowertypeOfClassCrossReference_6_1_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1545:3: (otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:1546:4: otherlv_19= '{' ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )* otherlv_22= '}'
                    {
                    otherlv_19=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_19, grammarAccess.getOrderlessClassAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalML2.g:1550:4: ( ( (lv_assignments_20_0= ruleFeatureAssignment ) ) | ( (lv_features_21_0= ruleFeature ) ) )*
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
                    	    // InternalML2.g:1551:5: ( (lv_assignments_20_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:1551:5: ( (lv_assignments_20_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:1552:6: (lv_assignments_20_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:1552:6: (lv_assignments_20_0= ruleFeatureAssignment )
                    	    // InternalML2.g:1553:7: lv_assignments_20_0= ruleFeatureAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_7_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_assignments_20_0=ruleFeatureAssignment();

                    	    state._fsp--;


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
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:1571:5: ( (lv_features_21_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:1571:5: ( (lv_features_21_0= ruleFeature ) )
                    	    // InternalML2.g:1572:6: (lv_features_21_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:1572:6: (lv_features_21_0= ruleFeature )
                    	    // InternalML2.g:1573:7: lv_features_21_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrderlessClassAccess().getFeaturesFeatureParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_features_21_0=ruleFeature();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getOrderlessClassAccess().getRightCurlyBracketKeyword_7_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:1600:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalML2.g:1600:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalML2.g:1601:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:1607:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) ;
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
            // InternalML2.g:1613:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalML2.g:1614:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalML2.g:1614:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalML2.g:1615:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
            {
            // InternalML2.g:1615:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalML2.g:1616:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalML2.g:1616:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            // InternalML2.g:1617:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            				
            // InternalML2.g:1620:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            // InternalML2.g:1621:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            {
            // InternalML2.g:1621:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
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
            	    // InternalML2.g:1622:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalML2.g:1622:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    // InternalML2.g:1623:5: {...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalML2.g:1623:114: ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    // InternalML2.g:1624:6: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalML2.g:1627:9: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    // InternalML2.g:1627:10: {...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1627:19: ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    // InternalML2.g:1627:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    {
            	    // InternalML2.g:1627:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    // InternalML2.g:1628:10: lv_isDisjoint_1_0= 'disjoint'
            	    {
            	    lv_isDisjoint_1_0=(Token)match(input,29,FOLLOW_20); 

            	    										newLeafNode(lv_isDisjoint_1_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    										}
            	    										setWithLastConsumed(current, "isDisjoint", true, "disjoint");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalML2.g:1645:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalML2.g:1645:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    // InternalML2.g:1646:5: {...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalML2.g:1646:114: ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    // InternalML2.g:1647:6: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalML2.g:1650:9: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    // InternalML2.g:1650:10: {...}? => ( (lv_isComplete_2_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1650:19: ( (lv_isComplete_2_0= 'complete' ) )
            	    // InternalML2.g:1650:20: (lv_isComplete_2_0= 'complete' )
            	    {
            	    // InternalML2.g:1650:20: (lv_isComplete_2_0= 'complete' )
            	    // InternalML2.g:1651:10: lv_isComplete_2_0= 'complete'
            	    {
            	    lv_isComplete_2_0=(Token)match(input,30,FOLLOW_20); 

            	    										newLeafNode(lv_isComplete_2_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    										}
            	    										setWithLastConsumed(current, "isComplete", true, "complete");
            	    									

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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1());
            		
            // InternalML2.g:1679:3: ( (lv_name_4_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalML2.g:1680:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalML2.g:1680:4: (lv_name_4_0= RULE_ID )
                    // InternalML2.g:1681:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    					newLeafNode(lv_name_4_0, grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0());
                    				

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
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3());
            		
            // InternalML2.g:1701:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1702:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1702:4: ( ruleQualifiedName )
            // InternalML2.g:1703:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:1717:3: (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalML2.g:1718:4: otherlv_7= 'categorizer' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0());
                    			
                    // InternalML2.g:1722:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1723:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1723:5: ( ruleQualifiedName )
                    // InternalML2.g:1724:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCategorizerHigherOrderClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6());
            		
            // InternalML2.g:1743:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1744:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1744:4: ( ruleQualifiedName )
            // InternalML2.g:1745:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0());
            				
            pushFollow(FOLLOW_25);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:1759:3: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
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
            	    // InternalML2.g:1760:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalML2.g:1764:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:1765:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:1765:5: ( ruleQualifiedName )
            	    // InternalML2.g:1766:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalML2.g:1785:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalML2.g:1785:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalML2.g:1786:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:1792:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:1798:2: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // InternalML2.g:1799:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // InternalML2.g:1799:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt47=2;
            switch ( input.LA(1) ) {
            case 40:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_ID||LA47_1==35) ) {
                    alt47=1;
                }
                else if ( (LA47_1==41) ) {
                    alt47=2;
                }
                else {
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
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalML2.g:1800:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:1809:3: this_Reference_1= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_1=ruleReference();

                    state._fsp--;


                    			current = this_Reference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:1821:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalML2.g:1821:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalML2.g:1822:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:1828:1: ruleAttribute returns [EObject current=null] : (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) ) ;
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
            // InternalML2.g:1834:2: ( (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) ) )
            // InternalML2.g:1835:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            {
            // InternalML2.g:1835:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalML2.g:1836:3: this_RegularityAttribute_0= ruleRegularityAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getRegularityAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularityAttribute_0=ruleRegularityAttribute();

                    state._fsp--;


                    			current = this_RegularityAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:1845:3: ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? )
                    {
                    // InternalML2.g:1845:3: ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? )
                    // InternalML2.g:1846:4: (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    {
                    // InternalML2.g:1846:4: (otherlv_1= 'att' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==35) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalML2.g:1847:5: otherlv_1= 'att'
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttKeyword_1_0());
                            				

                            }
                            break;

                    }

                    // InternalML2.g:1852:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalML2.g:1853:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalML2.g:1853:5: (lv_name_2_0= RULE_ID )
                    // InternalML2.g:1854:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

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

                    otherlv_3=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_1_2());
                    			
                    // InternalML2.g:1874:4: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==36) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalML2.g:1875:5: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_28); 

                            					newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_3_0());
                            				
                            // InternalML2.g:1879:5: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                            // InternalML2.g:1880:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:1880:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            // InternalML2.g:1881:7: lv_lowerBound_5_0= ruleCARDINALITY
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundCARDINALITYParserRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_29);
                            lv_lowerBound_5_0=ruleCARDINALITY();

                            state._fsp--;


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

                            otherlv_6=(Token)match(input,37,FOLLOW_28); 

                            					newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_1_3_2());
                            				
                            // InternalML2.g:1902:5: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                            // InternalML2.g:1903:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:1903:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            // InternalML2.g:1904:7: lv_upperBound_7_0= ruleCARDINALITY
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundCARDINALITYParserRuleCall_1_3_3_0());
                            						
                            pushFollow(FOLLOW_30);
                            lv_upperBound_7_0=ruleCARDINALITY();

                            state._fsp--;


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

                            otherlv_8=(Token)match(input,38,FOLLOW_31); 

                            					newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3_4());
                            				

                            }
                            break;

                    }

                    // InternalML2.g:1926:4: ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=52 && LA50_0<=54)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_ID) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalML2.g:1927:5: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                            {
                            // InternalML2.g:1927:5: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                            // InternalML2.g:1928:6: (lv_primitiveType_9_0= rulePrimitiveType )
                            {
                            // InternalML2.g:1928:6: (lv_primitiveType_9_0= rulePrimitiveType )
                            // InternalML2.g:1929:7: lv_primitiveType_9_0= rulePrimitiveType
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_1_4_0_0());
                            						
                            pushFollow(FOLLOW_32);
                            lv_primitiveType_9_0=rulePrimitiveType();

                            state._fsp--;


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
                            break;
                        case 2 :
                            // InternalML2.g:1947:5: ( ( ruleQualifiedName ) )
                            {
                            // InternalML2.g:1947:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:1948:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:1948:6: ( ruleQualifiedName )
                            // InternalML2.g:1949:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAttributeRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_1_4_1_0());
                            						
                            pushFollow(FOLLOW_32);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalML2.g:1964:4: (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==39) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalML2.g:1965:5: otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_11=(Token)match(input,39,FOLLOW_3); 

                            					newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getSubsetsKeyword_1_5_0());
                            				
                            // InternalML2.g:1969:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:1970:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:1970:6: ( ruleQualifiedName )
                            // InternalML2.g:1971:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAttributeRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_1_5_1_0());
                            						
                            pushFollow(FOLLOW_26);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalML2.g:1985:5: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==21) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalML2.g:1986:6: otherlv_13= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_13=(Token)match(input,21,FOLLOW_3); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalML2.g:1990:6: ( ( ruleQualifiedName ) )
                            	    // InternalML2.g:1991:7: ( ruleQualifiedName )
                            	    {
                            	    // InternalML2.g:1991:7: ( ruleQualifiedName )
                            	    // InternalML2.g:1992:8: ruleQualifiedName
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getAttributeRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_26);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

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


            	leaveRule();

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
    // InternalML2.g:2013:1: entryRuleRegularityAttribute returns [EObject current=null] : iv_ruleRegularityAttribute= ruleRegularityAttribute EOF ;
    public final EObject entryRuleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityAttribute = null;


        try {
            // InternalML2.g:2013:60: (iv_ruleRegularityAttribute= ruleRegularityAttribute EOF )
            // InternalML2.g:2014:2: iv_ruleRegularityAttribute= ruleRegularityAttribute EOF
            {
             newCompositeNode(grammarAccess.getRegularityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularityAttribute=ruleRegularityAttribute();

            state._fsp--;

             current =iv_ruleRegularityAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2020:1: ruleRegularityAttribute returns [EObject current=null] : ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
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
            // InternalML2.g:2026:2: ( ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2027:2: ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2027:2: ( (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2028:3: (otherlv_0= 'regularity' )? (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:2028:3: (otherlv_0= 'regularity' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalML2.g:2029:4: otherlv_0= 'regularity'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0());
                    			

                    }
                    break;

            }

            // InternalML2.g:2034:3: (otherlv_1= 'att' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==35) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalML2.g:2035:4: otherlv_1= 'att'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRegularityAttributeAccess().getAttKeyword_1());
                    			

                    }
                    break;

            }

            // InternalML2.g:2040:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:2041:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:2041:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:2042:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRegularityAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularityAttributeAccess().getColonKeyword_3());
            		
            // InternalML2.g:2062:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalML2.g:2063:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalML2.g:2067:4: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                    // InternalML2.g:2068:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2068:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    // InternalML2.g:2069:6: lv_lowerBound_5_0= ruleCARDINALITY
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getLowerBoundCARDINALITYParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_lowerBound_5_0=ruleCARDINALITY();

                    state._fsp--;


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

                    otherlv_6=(Token)match(input,37,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalML2.g:2090:4: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                    // InternalML2.g:2091:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2091:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    // InternalML2.g:2092:6: lv_upperBound_7_0= ruleCARDINALITY
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getUpperBoundCARDINALITYParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_upperBound_7_0=ruleCARDINALITY();

                    state._fsp--;


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

                    otherlv_8=(Token)match(input,38,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalML2.g:2114:3: ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=52 && LA57_0<=54)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalML2.g:2115:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    {
                    // InternalML2.g:2115:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    // InternalML2.g:2116:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    {
                    // InternalML2.g:2116:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    // InternalML2.g:2117:6: lv_primitiveType_9_0= rulePrimitiveType
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_primitiveType_9_0=rulePrimitiveType();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalML2.g:2135:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2135:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2136:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2136:5: ( ruleQualifiedName )
                    // InternalML2.g:2137:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:2152:3: (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalML2.g:2153:4: otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalML2.g:2157:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2158:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2158:5: ( ruleQualifiedName )
                    // InternalML2.g:2159:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:2173:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==21) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalML2.g:2174:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalML2.g:2178:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2179:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2179:6: ( ruleQualifiedName )
                    	    // InternalML2.g:2180:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:2196:3: ( (lv_regularityType_15_0= ruleRegularityFeatureType ) )
            // InternalML2.g:2197:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:2197:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            // InternalML2.g:2198:5: lv_regularityType_15_0= ruleRegularityFeatureType
            {

            					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_3);
            lv_regularityType_15_0=ruleRegularityFeatureType();

            state._fsp--;


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

            // InternalML2.g:2215:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2216:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2216:4: ( ruleQualifiedName )
            // InternalML2.g:2217:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegulatesAttributeCrossReference_8_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:2235:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalML2.g:2235:50: (iv_ruleReference= ruleReference EOF )
            // InternalML2.g:2236:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2242:1: ruleReference returns [EObject current=null] : (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ) ;
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
            // InternalML2.g:2248:2: ( (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ) )
            // InternalML2.g:2249:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            {
            // InternalML2.g:2249:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalML2.g:2250:3: this_RegularityReference_0= ruleRegularityReference
                    {

                    			newCompositeNode(grammarAccess.getReferenceAccess().getRegularityReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularityReference_0=ruleRegularityReference();

                    state._fsp--;


                    			current = this_RegularityReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2259:3: (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
                    {
                    // InternalML2.g:2259:3: (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
                    // InternalML2.g:2260:4: otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getRefKeyword_1_0());
                    			
                    // InternalML2.g:2264:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalML2.g:2265:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalML2.g:2265:5: (lv_name_2_0= RULE_ID )
                    // InternalML2.g:2266:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

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

                    otherlv_3=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_1_2());
                    			
                    // InternalML2.g:2286:4: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==36) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalML2.g:2287:5: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_28); 

                            					newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_1_3_0());
                            				
                            // InternalML2.g:2291:5: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                            // InternalML2.g:2292:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:2292:6: (lv_lowerBound_5_0= ruleCARDINALITY )
                            // InternalML2.g:2293:7: lv_lowerBound_5_0= ruleCARDINALITY
                            {

                            							newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundCARDINALITYParserRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_29);
                            lv_lowerBound_5_0=ruleCARDINALITY();

                            state._fsp--;


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

                            otherlv_6=(Token)match(input,37,FOLLOW_28); 

                            					newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_1_3_2());
                            				
                            // InternalML2.g:2314:5: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                            // InternalML2.g:2315:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            {
                            // InternalML2.g:2315:6: (lv_upperBound_7_0= ruleCARDINALITY )
                            // InternalML2.g:2316:7: lv_upperBound_7_0= ruleCARDINALITY
                            {

                            							newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundCARDINALITYParserRuleCall_1_3_3_0());
                            						
                            pushFollow(FOLLOW_30);
                            lv_upperBound_7_0=ruleCARDINALITY();

                            state._fsp--;


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

                            otherlv_8=(Token)match(input,38,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_1_3_4());
                            				

                            }
                            break;

                    }

                    // InternalML2.g:2338:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2339:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2339:5: ( ruleQualifiedName )
                    // InternalML2.g:2340:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().get_typeClassCrossReference_1_4_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:2354:4: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==39) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalML2.g:2355:5: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_10=(Token)match(input,39,FOLLOW_3); 

                            					newLeafNode(otherlv_10, grammarAccess.getReferenceAccess().getSubsetsKeyword_1_5_0());
                            				
                            // InternalML2.g:2359:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:2360:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:2360:6: ( ruleQualifiedName )
                            // InternalML2.g:2361:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getReferenceRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_1_5_1_0());
                            						
                            pushFollow(FOLLOW_38);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalML2.g:2375:5: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==21) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // InternalML2.g:2376:6: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getReferenceAccess().getCommaKeyword_1_5_2_0());
                            	    					
                            	    // InternalML2.g:2380:6: ( ( ruleQualifiedName ) )
                            	    // InternalML2.g:2381:7: ( ruleQualifiedName )
                            	    {
                            	    // InternalML2.g:2381:7: ( ruleQualifiedName )
                            	    // InternalML2.g:2382:8: ruleQualifiedName
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getReferenceRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_1_5_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_38);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

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

                    // InternalML2.g:2398:4: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==42) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalML2.g:2399:5: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                            {
                            otherlv_14=(Token)match(input,42,FOLLOW_3); 

                            					newLeafNode(otherlv_14, grammarAccess.getReferenceAccess().getIsOppositeToKeyword_1_6_0());
                            				
                            // InternalML2.g:2403:5: ( ( ruleQualifiedName ) )
                            // InternalML2.g:2404:6: ( ruleQualifiedName )
                            {
                            // InternalML2.g:2404:6: ( ruleQualifiedName )
                            // InternalML2.g:2405:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getReferenceRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_1_6_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

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


            	leaveRule();

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
    // InternalML2.g:2425:1: entryRuleRegularityReference returns [EObject current=null] : iv_ruleRegularityReference= ruleRegularityReference EOF ;
    public final EObject entryRuleRegularityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityReference = null;


        try {
            // InternalML2.g:2425:60: (iv_ruleRegularityReference= ruleRegularityReference EOF )
            // InternalML2.g:2426:2: iv_ruleRegularityReference= ruleRegularityReference EOF
            {
             newCompositeNode(grammarAccess.getRegularityReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularityReference=ruleRegularityReference();

            state._fsp--;

             current =iv_ruleRegularityReference; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2432:1: ruleRegularityReference returns [EObject current=null] : ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
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
            // InternalML2.g:2438:2: ( ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2439:2: ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2439:2: ( (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2440:3: (otherlv_0= 'regularity' )? otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:2440:3: (otherlv_0= 'regularity' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==40) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalML2.g:2441:4: otherlv_0= 'regularity'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_0, grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularityReferenceAccess().getRefKeyword_1());
            		
            // InternalML2.g:2450:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:2451:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:2451:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:2452:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRegularityReferenceAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularityReferenceAccess().getColonKeyword_3());
            		
            // InternalML2.g:2472:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==36) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalML2.g:2473:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalML2.g:2477:4: ( (lv_lowerBound_5_0= ruleCARDINALITY ) )
                    // InternalML2.g:2478:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2478:5: (lv_lowerBound_5_0= ruleCARDINALITY )
                    // InternalML2.g:2479:6: lv_lowerBound_5_0= ruleCARDINALITY
                    {

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getLowerBoundCARDINALITYParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_lowerBound_5_0=ruleCARDINALITY();

                    state._fsp--;


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

                    otherlv_6=(Token)match(input,37,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalML2.g:2500:4: ( (lv_upperBound_7_0= ruleCARDINALITY ) )
                    // InternalML2.g:2501:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    {
                    // InternalML2.g:2501:5: (lv_upperBound_7_0= ruleCARDINALITY )
                    // InternalML2.g:2502:6: lv_upperBound_7_0= ruleCARDINALITY
                    {

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getUpperBoundCARDINALITYParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_upperBound_7_0=ruleCARDINALITY();

                    state._fsp--;


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

                    otherlv_8=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalML2.g:2524:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2525:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2525:4: ( ruleQualifiedName )
            // InternalML2.g:2526:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().get_typeClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_40);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:2540:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==39) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalML2.g:2541:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalML2.g:2545:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2546:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2546:5: ( ruleQualifiedName )
                    // InternalML2.g:2547:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:2561:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==21) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalML2.g:2562:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalML2.g:2566:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2567:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2567:6: ( ruleQualifiedName )
                    	    // InternalML2.g:2568:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalML2.g:2584:3: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==42) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalML2.g:2585:4: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0());
                    			
                    // InternalML2.g:2589:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2590:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2590:5: ( ruleQualifiedName )
                    // InternalML2.g:2591:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:2606:3: ( (lv_regularityType_16_0= ruleRegularityFeatureType ) )
            // InternalML2.g:2607:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:2607:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            // InternalML2.g:2608:5: lv_regularityType_16_0= ruleRegularityFeatureType
            {

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_3);
            lv_regularityType_16_0=ruleRegularityFeatureType();

            state._fsp--;


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

            // InternalML2.g:2625:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2626:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2626:4: ( ruleQualifiedName )
            // InternalML2.g:2627:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegulatesReferenceCrossReference_9_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:2645:1: entryRuleRegularityFeature returns [EObject current=null] : iv_ruleRegularityFeature= ruleRegularityFeature EOF ;
    public final EObject entryRuleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityFeature = null;


        try {
            // InternalML2.g:2645:58: (iv_ruleRegularityFeature= ruleRegularityFeature EOF )
            // InternalML2.g:2646:2: iv_ruleRegularityFeature= ruleRegularityFeature EOF
            {
             newCompositeNode(grammarAccess.getRegularityFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularityFeature=ruleRegularityFeature();

            state._fsp--;

             current =iv_ruleRegularityFeature; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2652:1: ruleRegularityFeature returns [EObject current=null] : (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) ;
    public final EObject ruleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_RegularityAttribute_0 = null;

        EObject this_RegularityReference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:2658:2: ( (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) )
            // InternalML2.g:2659:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
            {
            // InternalML2.g:2659:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalML2.g:2660:3: this_RegularityAttribute_0= ruleRegularityAttribute
                    {

                    			newCompositeNode(grammarAccess.getRegularityFeatureAccess().getRegularityAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularityAttribute_0=ruleRegularityAttribute();

                    state._fsp--;


                    			current = this_RegularityAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2669:3: this_RegularityReference_1= ruleRegularityReference
                    {

                    			newCompositeNode(grammarAccess.getRegularityFeatureAccess().getRegularityReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularityReference_1=ruleRegularityReference();

                    state._fsp--;


                    			current = this_RegularityReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:2681:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalML2.g:2681:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalML2.g:2682:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
            {
             newCompositeNode(grammarAccess.getCARDINALITYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCARDINALITY=ruleCARDINALITY();

            state._fsp--;

             current =iv_ruleCARDINALITY.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2688:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalML2.g:2694:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalML2.g:2695:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalML2.g:2695:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_INT) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalML2.g:2696:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2702:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCARDINALITYAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:2713:1: entryRuleFeatureAssignment returns [EObject current=null] : iv_ruleFeatureAssignment= ruleFeatureAssignment EOF ;
    public final EObject entryRuleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureAssignment = null;


        try {
            // InternalML2.g:2713:58: (iv_ruleFeatureAssignment= ruleFeatureAssignment EOF )
            // InternalML2.g:2714:2: iv_ruleFeatureAssignment= ruleFeatureAssignment EOF
            {
             newCompositeNode(grammarAccess.getFeatureAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureAssignment=ruleFeatureAssignment();

            state._fsp--;

             current =iv_ruleFeatureAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2720:1: ruleFeatureAssignment returns [EObject current=null] : (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment ) ;
    public final EObject ruleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_SingleReferenceAssignment_0 = null;

        EObject this_MultipleReferenceAssignment_1 = null;

        EObject this_SingleAttributeAssignment_2 = null;

        EObject this_MultipleAttributeAssignment_3 = null;



        	enterRule();

        try {
            // InternalML2.g:2726:2: ( (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment ) )
            // InternalML2.g:2727:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )
            {
            // InternalML2.g:2727:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )
            int alt72=4;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalML2.g:2728:3: this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getSingleReferenceAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleReferenceAssignment_0=ruleSingleReferenceAssignment();

                    state._fsp--;


                    			current = this_SingleReferenceAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2737:3: this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getMultipleReferenceAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleReferenceAssignment_1=ruleMultipleReferenceAssignment();

                    state._fsp--;


                    			current = this_MultipleReferenceAssignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalML2.g:2746:3: this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleAttributeAssignment_2=ruleSingleAttributeAssignment();

                    state._fsp--;


                    			current = this_SingleAttributeAssignment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalML2.g:2755:3: this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getMultipleAttributeAssignmentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleAttributeAssignment_3=ruleMultipleAttributeAssignment();

                    state._fsp--;


                    			current = this_MultipleAttributeAssignment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:2767:1: entryRuleSingleReferenceAssignment returns [EObject current=null] : iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF ;
    public final EObject entryRuleSingleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleReferenceAssignment = null;


        try {
            // InternalML2.g:2767:66: (iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF )
            // InternalML2.g:2768:2: iv_ruleSingleReferenceAssignment= ruleSingleReferenceAssignment EOF
            {
             newCompositeNode(grammarAccess.getSingleReferenceAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleReferenceAssignment=ruleSingleReferenceAssignment();

            state._fsp--;

             current =iv_ruleSingleReferenceAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2774:1: ruleSingleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSingleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalML2.g:2780:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2781:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2781:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2782:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleReferenceAssignmentAccess().getRefKeyword_0());
            		
            // InternalML2.g:2786:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2787:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2787:4: ( ruleQualifiedName )
            // InternalML2.g:2788:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleReferenceAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalML2.g:2806:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2807:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2807:4: ( ruleQualifiedName )
            // InternalML2.g:2808:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleReferenceAssignmentAccess().getValuesEntityDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:2826:1: entryRuleMultipleReferenceAssignment returns [EObject current=null] : iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF ;
    public final EObject entryRuleMultipleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleReferenceAssignment = null;


        try {
            // InternalML2.g:2826:68: (iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF )
            // InternalML2.g:2827:2: iv_ruleMultipleReferenceAssignment= ruleMultipleReferenceAssignment EOF
            {
             newCompositeNode(grammarAccess.getMultipleReferenceAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleReferenceAssignment=ruleMultipleReferenceAssignment();

            state._fsp--;

             current =iv_ruleMultipleReferenceAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2833:1: ruleMultipleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleMultipleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalML2.g:2839:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' ) )
            // InternalML2.g:2840:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )
            {
            // InternalML2.g:2840:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}' )
            // InternalML2.g:2841:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleReferenceAssignmentAccess().getRefKeyword_0());
            		
            // InternalML2.g:2845:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2846:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2846:4: ( ruleQualifiedName )
            // InternalML2.g:2847:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultipleReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleReferenceAssignmentAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMultipleReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalML2.g:2869:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2870:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2870:4: ( ruleQualifiedName )
            // InternalML2.g:2871:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultipleReferenceAssignmentAccess().getValuesEntityDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_43);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:2885:3: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==21) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalML2.g:2886:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMultipleReferenceAssignmentAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalML2.g:2890:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:2891:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:2891:5: ( ruleQualifiedName )
            	    // InternalML2.g:2892:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMultipleReferenceAssignmentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMultipleReferenceAssignmentAccess().getValuesEntityDeclarationCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMultipleReferenceAssignmentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalML2.g:2915:1: entryRuleSingleAttributeAssignment returns [EObject current=null] : iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF ;
    public final EObject entryRuleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAttributeAssignment = null;


        try {
            // InternalML2.g:2915:66: (iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF )
            // InternalML2.g:2916:2: iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getSingleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleAttributeAssignment=ruleSingleAttributeAssignment();

            state._fsp--;

             current =iv_ruleSingleAttributeAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:2922:1: ruleSingleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) ) ;
    public final EObject ruleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_literalValues_3_0 = null;

        EObject lv_unnamedValues_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2928:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) ) )
            // InternalML2.g:2929:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) )
            {
            // InternalML2.g:2929:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) ) )
            // InternalML2.g:2930:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) )
            {
            // InternalML2.g:2930:3: (otherlv_0= 'att' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==35) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalML2.g:2931:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0());
                    			

                    }
                    break;

            }

            // InternalML2.g:2936:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2937:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2937:4: ( ruleQualifiedName )
            // InternalML2.g:2938:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalML2.g:2956:3: ( ( (lv_literalValues_3_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalML2.g:2957:4: ( (lv_literalValues_3_0= ruleLiteral ) )
                    {
                    // InternalML2.g:2957:4: ( (lv_literalValues_3_0= ruleLiteral ) )
                    // InternalML2.g:2958:5: (lv_literalValues_3_0= ruleLiteral )
                    {
                    // InternalML2.g:2958:5: (lv_literalValues_3_0= ruleLiteral )
                    // InternalML2.g:2959:6: lv_literalValues_3_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literalValues_3_0=ruleLiteral();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalML2.g:2977:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2977:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2978:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2978:5: ( ruleQualifiedName )
                    // InternalML2.g:2979:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:2994:4: ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:2994:4: ( (lv_unnamedValues_5_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:2995:5: (lv_unnamedValues_5_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:2995:5: (lv_unnamedValues_5_0= ruleUnnamedIndividual )
                    // InternalML2.g:2996:6: lv_unnamedValues_5_0= ruleUnnamedIndividual
                    {

                    						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unnamedValues_5_0=ruleUnnamedIndividual();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:3018:1: entryRuleMultipleAttributeAssignment returns [EObject current=null] : iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF ;
    public final EObject entryRuleMultipleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleAttributeAssignment = null;


        try {
            // InternalML2.g:3018:68: (iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF )
            // InternalML2.g:3019:2: iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getMultipleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleAttributeAssignment=ruleMultipleAttributeAssignment();

            state._fsp--;

             current =iv_ruleMultipleAttributeAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3025:1: ruleMultipleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' ) ;
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
            // InternalML2.g:3031:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' ) )
            // InternalML2.g:3032:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' )
            {
            // InternalML2.g:3032:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}' )
            // InternalML2.g:3033:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_13= '}'
            {
            // InternalML2.g:3033:3: (otherlv_0= 'att' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==35) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalML2.g:3034:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0());
                    			

                    }
                    break;

            }

            // InternalML2.g:3039:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3040:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3040:4: ( ruleQualifiedName )
            // InternalML2.g:3041:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleAttributeAssignmentAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getMultipleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalML2.g:3063:3: ( ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalML2.g:3064:4: ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* )
                    {
                    // InternalML2.g:3064:4: ( ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )* )
                    // InternalML2.g:3065:5: ( (lv_literalValues_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )*
                    {
                    // InternalML2.g:3065:5: ( (lv_literalValues_4_0= ruleLiteral ) )
                    // InternalML2.g:3066:6: (lv_literalValues_4_0= ruleLiteral )
                    {
                    // InternalML2.g:3066:6: (lv_literalValues_4_0= ruleLiteral )
                    // InternalML2.g:3067:7: lv_literalValues_4_0= ruleLiteral
                    {

                    							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_4_0_0_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_literalValues_4_0=ruleLiteral();

                    state._fsp--;


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

                    // InternalML2.g:3084:5: (otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==21) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalML2.g:3085:6: otherlv_5= ',' ( (lv_literalValues_6_0= ruleLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_45); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_0_1_0());
                    	    					
                    	    // InternalML2.g:3089:6: ( (lv_literalValues_6_0= ruleLiteral ) )
                    	    // InternalML2.g:3090:7: (lv_literalValues_6_0= ruleLiteral )
                    	    {
                    	    // InternalML2.g:3090:7: (lv_literalValues_6_0= ruleLiteral )
                    	    // InternalML2.g:3091:8: lv_literalValues_6_0= ruleLiteral
                    	    {

                    	    								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_4_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_43);
                    	    lv_literalValues_6_0=ruleLiteral();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3111:4: ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // InternalML2.g:3111:4: ( ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )
                    // InternalML2.g:3112:5: ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalML2.g:3112:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3113:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3113:6: ( ruleQualifiedName )
                    // InternalML2.g:3114:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_4_1_0_0());
                    						
                    pushFollow(FOLLOW_43);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalML2.g:3128:5: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==21) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalML2.g:3129:6: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_1_0());
                    	    					
                    	    // InternalML2.g:3133:6: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:3134:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:3134:7: ( ruleQualifiedName )
                    	    // InternalML2.g:3135:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_4_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_43);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

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
                    // InternalML2.g:3152:4: ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* )
                    {
                    // InternalML2.g:3152:4: ( ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )* )
                    // InternalML2.g:3153:5: ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) ) (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )*
                    {
                    // InternalML2.g:3153:5: ( (lv_unnamedValues_10_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3154:6: (lv_unnamedValues_10_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3154:6: (lv_unnamedValues_10_0= ruleUnnamedIndividual )
                    // InternalML2.g:3155:7: lv_unnamedValues_10_0= ruleUnnamedIndividual
                    {

                    							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_4_2_0_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_unnamedValues_10_0=ruleUnnamedIndividual();

                    state._fsp--;


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

                    // InternalML2.g:3172:5: (otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==21) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalML2.g:3173:6: otherlv_11= ',' ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_44); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_2_1_0());
                    	    					
                    	    // InternalML2.g:3177:6: ( (lv_unnamedValues_12_0= ruleUnnamedIndividual ) )
                    	    // InternalML2.g:3178:7: (lv_unnamedValues_12_0= ruleUnnamedIndividual )
                    	    {
                    	    // InternalML2.g:3178:7: (lv_unnamedValues_12_0= ruleUnnamedIndividual )
                    	    // InternalML2.g:3179:8: lv_unnamedValues_12_0= ruleUnnamedIndividual
                    	    {

                    	    								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_4_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_43);
                    	    lv_unnamedValues_12_0=ruleUnnamedIndividual();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMultipleAttributeAssignmentAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalML2.g:3207:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalML2.g:3207:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalML2.g:3208:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3214:1: ruleLiteral returns [EObject current=null] : (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalML2.g:3220:2: ( (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN ) )
            // InternalML2.g:3221:2: (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN )
            {
            // InternalML2.g:3221:2: (this_STRING_0= RULE_STRING | ruleNUMBER | ruleBOOLEAN )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalML2.g:3222:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_0, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:3227:3: ruleNUMBER
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNUMBERParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleNUMBER();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalML2.g:3235:3: ruleBOOLEAN
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBOOLEANParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    ruleBOOLEAN();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:3246:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalML2.g:3246:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalML2.g:3247:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3253:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalML2.g:3259:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalML2.g:3260:2: (kw= 'true' | kw= 'false' )
            {
            // InternalML2.g:3260:2: (kw= 'true' | kw= 'false' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==45) ) {
                alt82=1;
            }
            else if ( (LA82_0==46) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalML2.g:3261:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:3267:3: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:3276:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalML2.g:3276:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalML2.g:3277:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3283:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalML2.g:3289:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalML2.g:3290:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalML2.g:3290:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalML2.g:3291:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalML2.g:3291:3: (kw= '-' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==47) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalML2.g:3292:4: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
            		
            // InternalML2.g:3305:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==16) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalML2.g:3306:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,16,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:3323:1: entryRuleUnnamedIndividual returns [EObject current=null] : iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF ;
    public final EObject entryRuleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedIndividual = null;


        try {
            // InternalML2.g:3323:58: (iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF )
            // InternalML2.g:3324:2: iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF
            {
             newCompositeNode(grammarAccess.getUnnamedIndividualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedIndividual=ruleUnnamedIndividual();

            state._fsp--;

             current =iv_ruleUnnamedIndividual; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3330:1: ruleUnnamedIndividual returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) ;
    public final EObject ruleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3336:2: ( ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) )
            // InternalML2.g:3337:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            {
            // InternalML2.g:3337:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            // InternalML2.g:3338:3: () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']'
            {
            // InternalML2.g:3338:3: ()
            // InternalML2.g:3339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnnamedIndividualAccess().getIndividualAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getUnnamedIndividualAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalML2.g:3349:3: ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RULE_ID) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalML2.g:3350:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    {
            	    // InternalML2.g:3350:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    // InternalML2.g:3351:5: lv_assignments_2_0= ruleSimpleAttributeAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getUnnamedIndividualAccess().getAssignmentsSimpleAttributeAssignmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_46);
            	    lv_assignments_2_0=ruleSimpleAttributeAssignment();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUnnamedIndividualAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalML2.g:3376:1: entryRuleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3376:66: (iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF )
            // InternalML2.g:3377:2: iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getSimpleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAttributeAssignment=ruleSimpleAttributeAssignment();

            state._fsp--;

             current =iv_ruleSimpleAttributeAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3383:1: ruleSimpleAttributeAssignment returns [EObject current=null] : (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment ) ;
    public final EObject ruleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSimpleAttributeAssignment_0 = null;

        EObject this_MultipleSimpleAttributeAssignment_1 = null;



        	enterRule();

        try {
            // InternalML2.g:3389:2: ( (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment ) )
            // InternalML2.g:3390:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )
            {
            // InternalML2.g:3390:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalML2.g:3391:3: this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment
                    {

                    			newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getSingleSimpleAttributeAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleSimpleAttributeAssignment_0=ruleSingleSimpleAttributeAssignment();

                    state._fsp--;


                    			current = this_SingleSimpleAttributeAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:3400:3: this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment
                    {

                    			newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getMultipleSimpleAttributeAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleSimpleAttributeAssignment_1=ruleMultipleSimpleAttributeAssignment();

                    state._fsp--;


                    			current = this_MultipleSimpleAttributeAssignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:3412:1: entryRuleSingleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSingleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3412:72: (iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF )
            // InternalML2.g:3413:2: iv_ruleSingleSimpleAttributeAssignment= ruleSingleSimpleAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleSimpleAttributeAssignment=ruleSingleSimpleAttributeAssignment();

            state._fsp--;

             current =iv_ruleSingleSimpleAttributeAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3419:1: ruleSingleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) ) ;
    public final EObject ruleSingleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_literalValues_2_0 = null;

        EObject lv_unnamedValues_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:3425:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) ) )
            // InternalML2.g:3426:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) )
            {
            // InternalML2.g:3426:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) ) )
            // InternalML2.g:3427:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) )
            {
            // InternalML2.g:3427:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3428:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3428:4: ( ruleQualifiedName )
            // InternalML2.g:3429:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleSimpleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalML2.g:3447:3: ( ( (lv_literalValues_2_0= ruleLiteral ) ) | ( ( ruleQualifiedName ) ) | ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalML2.g:3448:4: ( (lv_literalValues_2_0= ruleLiteral ) )
                    {
                    // InternalML2.g:3448:4: ( (lv_literalValues_2_0= ruleLiteral ) )
                    // InternalML2.g:3449:5: (lv_literalValues_2_0= ruleLiteral )
                    {
                    // InternalML2.g:3449:5: (lv_literalValues_2_0= ruleLiteral )
                    // InternalML2.g:3450:6: lv_literalValues_2_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literalValues_2_0=ruleLiteral();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalML2.g:3468:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:3468:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3469:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3469:5: ( ruleQualifiedName )
                    // InternalML2.g:3470:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleSimpleAttributeAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3485:4: ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3485:4: ( (lv_unnamedValues_4_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3486:5: (lv_unnamedValues_4_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3486:5: (lv_unnamedValues_4_0= ruleUnnamedIndividual )
                    // InternalML2.g:3487:6: lv_unnamedValues_4_0= ruleUnnamedIndividual
                    {

                    						newCompositeNode(grammarAccess.getSingleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unnamedValues_4_0=ruleUnnamedIndividual();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalML2.g:3509:1: entryRuleMultipleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleMultipleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:3509:74: (iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF )
            // InternalML2.g:3510:2: iv_ruleMultipleSimpleAttributeAssignment= ruleMultipleSimpleAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleSimpleAttributeAssignment=ruleMultipleSimpleAttributeAssignment();

            state._fsp--;

             current =iv_ruleMultipleSimpleAttributeAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalML2.g:3516:1: ruleMultipleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' ) ;
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
            // InternalML2.g:3522:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' ) )
            // InternalML2.g:3523:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' )
            {
            // InternalML2.g:3523:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}' )
            // InternalML2.g:3524:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' otherlv_2= '{' ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) ) otherlv_12= '}'
            {
            // InternalML2.g:3524:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:3525:4: ( ruleQualifiedName )
            {
            // InternalML2.g:3525:4: ( ruleQualifiedName )
            // InternalML2.g:3526:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalML2.g:3548:3: ( ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* ) | ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) | ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalML2.g:3549:4: ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* )
                    {
                    // InternalML2.g:3549:4: ( ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )* )
                    // InternalML2.g:3550:5: ( (lv_literalValues_3_0= ruleLiteral ) ) (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )*
                    {
                    // InternalML2.g:3550:5: ( (lv_literalValues_3_0= ruleLiteral ) )
                    // InternalML2.g:3551:6: (lv_literalValues_3_0= ruleLiteral )
                    {
                    // InternalML2.g:3551:6: (lv_literalValues_3_0= ruleLiteral )
                    // InternalML2.g:3552:7: lv_literalValues_3_0= ruleLiteral
                    {

                    							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_3_0_0_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_literalValues_3_0=ruleLiteral();

                    state._fsp--;


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

                    // InternalML2.g:3569:5: (otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==21) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalML2.g:3570:6: otherlv_4= ',' ( (lv_literalValues_5_0= ruleLiteral ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_45); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_0_1_0());
                    	    					
                    	    // InternalML2.g:3574:6: ( (lv_literalValues_5_0= ruleLiteral ) )
                    	    // InternalML2.g:3575:7: (lv_literalValues_5_0= ruleLiteral )
                    	    {
                    	    // InternalML2.g:3575:7: (lv_literalValues_5_0= ruleLiteral )
                    	    // InternalML2.g:3576:8: lv_literalValues_5_0= ruleLiteral
                    	    {

                    	    								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getLiteralValuesLiteralParserRuleCall_3_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_43);
                    	    lv_literalValues_5_0=ruleLiteral();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3596:4: ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // InternalML2.g:3596:4: ( ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )
                    // InternalML2.g:3597:5: ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalML2.g:3597:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3598:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3598:6: ( ruleQualifiedName )
                    // InternalML2.g:3599:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_1_0_0());
                    						
                    pushFollow(FOLLOW_43);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalML2.g:3613:5: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==21) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalML2.g:3614:6: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_1_1_0());
                    	    					
                    	    // InternalML2.g:3618:6: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:3619:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:3619:7: ( ruleQualifiedName )
                    	    // InternalML2.g:3620:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getMultipleSimpleAttributeAssignmentRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getDatatypeValuesIndividualCrossReference_3_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_43);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

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
                    // InternalML2.g:3637:4: ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* )
                    {
                    // InternalML2.g:3637:4: ( ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )* )
                    // InternalML2.g:3638:5: ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) ) (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )*
                    {
                    // InternalML2.g:3638:5: ( (lv_unnamedValues_9_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3639:6: (lv_unnamedValues_9_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3639:6: (lv_unnamedValues_9_0= ruleUnnamedIndividual )
                    // InternalML2.g:3640:7: lv_unnamedValues_9_0= ruleUnnamedIndividual
                    {

                    							newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_2_0_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_unnamedValues_9_0=ruleUnnamedIndividual();

                    state._fsp--;


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

                    // InternalML2.g:3657:5: (otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==21) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalML2.g:3658:6: otherlv_10= ',' ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_44); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getCommaKeyword_3_2_1_0());
                    	    					
                    	    // InternalML2.g:3662:6: ( (lv_unnamedValues_11_0= ruleUnnamedIndividual ) )
                    	    // InternalML2.g:3663:7: (lv_unnamedValues_11_0= ruleUnnamedIndividual )
                    	    {
                    	    // InternalML2.g:3663:7: (lv_unnamedValues_11_0= ruleUnnamedIndividual )
                    	    // InternalML2.g:3664:8: lv_unnamedValues_11_0= ruleUnnamedIndividual
                    	    {

                    	    								newCompositeNode(grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getUnnamedValuesUnnamedIndividualParserRuleCall_3_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_43);
                    	    lv_unnamedValues_11_0=ruleUnnamedIndividual();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMultipleSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "ruleCategorizationType"
    // InternalML2.g:3692:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:3698:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalML2.g:3699:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalML2.g:3699:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt92=1;
                }
                break;
            case 49:
                {
                alt92=2;
                }
                break;
            case 50:
                {
                alt92=3;
                }
                break;
            case 51:
                {
                alt92=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalML2.g:3700:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalML2.g:3700:3: (enumLiteral_0= 'categorizes' )
                    // InternalML2.g:3701:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3708:3: (enumLiteral_1= 'completeCategorizes' )
                    {
                    // InternalML2.g:3708:3: (enumLiteral_1= 'completeCategorizes' )
                    // InternalML2.g:3709:4: enumLiteral_1= 'completeCategorizes'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3716:3: (enumLiteral_2= 'disjointCategorizes' )
                    {
                    // InternalML2.g:3716:3: (enumLiteral_2= 'disjointCategorizes' )
                    // InternalML2.g:3717:4: enumLiteral_2= 'disjointCategorizes'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3724:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalML2.g:3724:3: (enumLiteral_3= 'partitions' )
                    // InternalML2.g:3725:4: enumLiteral_3= 'partitions'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:3735:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:3741:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) )
            // InternalML2.g:3742:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            {
            // InternalML2.g:3742:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt93=1;
                }
                break;
            case 53:
                {
                alt93=2;
                }
                break;
            case 54:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalML2.g:3743:3: (enumLiteral_0= 'String' )
                    {
                    // InternalML2.g:3743:3: (enumLiteral_0= 'String' )
                    // InternalML2.g:3744:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3751:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalML2.g:3751:3: (enumLiteral_1= 'Number' )
                    // InternalML2.g:3752:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3759:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalML2.g:3759:3: (enumLiteral_2= 'Boolean' )
                    // InternalML2.g:3760:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalML2.g:3770:1: ruleRegularityFeatureType returns [Enumerator current=null] : ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) ) ;
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
            // InternalML2.g:3776:2: ( ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) ) )
            // InternalML2.g:3777:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) )
            {
            // InternalML2.g:3777:2: ( (enumLiteral_0= 'determinesMaxValue' ) | (enumLiteral_1= 'determinesMinValue' ) | (enumLiteral_2= 'determinesValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesType' ) | (enumLiteral_5= 'determinesAllowedTypes' ) )
            int alt94=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt94=1;
                }
                break;
            case 56:
                {
                alt94=2;
                }
                break;
            case 57:
                {
                alt94=3;
                }
                break;
            case 58:
                {
                alt94=4;
                }
                break;
            case 59:
                {
                alt94=5;
                }
                break;
            case 60:
                {
                alt94=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalML2.g:3778:3: (enumLiteral_0= 'determinesMaxValue' )
                    {
                    // InternalML2.g:3778:3: (enumLiteral_0= 'determinesMaxValue' )
                    // InternalML2.g:3779:4: enumLiteral_0= 'determinesMaxValue'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3786:3: (enumLiteral_1= 'determinesMinValue' )
                    {
                    // InternalML2.g:3786:3: (enumLiteral_1= 'determinesMinValue' )
                    // InternalML2.g:3787:4: enumLiteral_1= 'determinesMinValue'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3794:3: (enumLiteral_2= 'determinesValue' )
                    {
                    // InternalML2.g:3794:3: (enumLiteral_2= 'determinesValue' )
                    // InternalML2.g:3795:4: enumLiteral_2= 'determinesValue'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3802:3: (enumLiteral_3= 'determinesAllowedValues' )
                    {
                    // InternalML2.g:3802:3: (enumLiteral_3= 'determinesAllowedValues' )
                    // InternalML2.g:3803:4: enumLiteral_3= 'determinesAllowedValues'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:3810:3: (enumLiteral_4= 'determinesType' )
                    {
                    // InternalML2.g:3810:3: (enumLiteral_4= 'determinesType' )
                    // InternalML2.g:3811:4: enumLiteral_4= 'determinesType'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:3818:3: (enumLiteral_5= 'determinesAllowedTypes' )
                    {
                    // InternalML2.g:3818:3: (enumLiteral_5= 'determinesAllowedTypes' )
                    // InternalML2.g:3819:4: enumLiteral_5= 'determinesAllowedTypes'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\4\uffff\1\4\1\20\1\4\1\uffff\1\20";
    static final String dfa_3s = "\1\51\4\uffff\1\4\1\54\1\4\1\uffff\1\54";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\15\uffff\1\1\1\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\3\3\3\uffff\1\5\4\uffff\1\4\1\7",
            "",
            "",
            "",
            "",
            "\1\6",
            "\1\10\3\uffff\1\4\27\uffff\1\10",
            "\1\11",
            "",
            "\1\10\3\uffff\1\4\27\uffff\1\10"
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
            return "296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet | this_Feature_3= ruleFeature | this_FeatureAssignment_4= ruleFeatureAssignment )";
        }
    }
    static final String dfa_7s = "\33\uffff";
    static final String dfa_8s = "\6\uffff\4\15\6\uffff\2\15\5\uffff\2\15\1\uffff\1\15";
    static final String dfa_9s = "\1\4\1\uffff\1\4\1\24\1\4\1\5\4\4\2\45\1\4\1\uffff\1\4\1\5\2\4\2\46\7\4";
    static final String dfa_10s = "\1\50\1\uffff\1\4\1\24\1\66\1\53\4\74\2\45\1\4\1\uffff\1\4\1\53\2\74\2\46\2\4\1\66\2\74\1\4\1\74";
    static final String dfa_11s = "\1\uffff\1\1\13\uffff\1\2\15\uffff";
    static final String dfa_12s = "\33\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\36\uffff\1\2\4\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\11\37\uffff\1\5\17\uffff\1\6\1\7\1\10",
            "\1\13\45\uffff\1\12",
            "\1\15\11\uffff\2\15\23\uffff\1\15\3\uffff\1\14\2\15\15\uffff\6\1",
            "\1\15\11\uffff\2\15\23\uffff\1\15\3\uffff\1\14\2\15\15\uffff\6\1",
            "\1\15\11\uffff\2\15\23\uffff\1\15\3\uffff\1\14\2\15\15\uffff\6\1",
            "\1\15\11\uffff\2\15\1\16\22\uffff\1\15\3\uffff\1\14\2\15\15\uffff\6\1",
            "\1\17",
            "\1\17",
            "\1\20",
            "",
            "\1\21",
            "\1\23\45\uffff\1\22",
            "\1\15\11\uffff\2\15\1\24\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\15\uffff\6\1",
            "\1\15\11\uffff\2\15\1\16\22\uffff\1\15\3\uffff\1\14\2\15\15\uffff\6\1",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\11\57\uffff\1\6\1\7\1\10",
            "\1\15\11\uffff\2\15\1\24\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\15\uffff\6\1",
            "\1\15\11\uffff\2\15\1\31\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\15\uffff\6\1",
            "\1\32",
            "\1\15\11\uffff\2\15\1\31\4\uffff\1\25\15\uffff\1\15\4\uffff\2\15\15\uffff\6\1"
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
            return "1835:2: (this_RegularityAttribute_0= ruleRegularityAttribute | ( (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ) )";
        }
    }
    static final String dfa_14s = "\34\uffff";
    static final String dfa_15s = "\6\uffff\1\14\7\uffff\3\14\6\uffff\3\14\1\uffff\1\14";
    static final String dfa_16s = "\1\50\1\uffff\1\4\1\24\1\4\1\5\1\4\2\45\3\4\1\uffff\1\5\3\4\2\46\11\4";
    static final String dfa_17s = "\1\51\1\uffff\1\4\1\24\1\44\1\53\1\74\2\45\3\4\1\uffff\1\53\3\74\2\46\4\4\3\74\1\4\1\74";
    static final String dfa_18s = "\1\uffff\1\1\12\uffff\1\2\17\uffff";
    static final String dfa_19s = "\34\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\6\37\uffff\1\5",
            "\1\10\45\uffff\1\7",
            "\1\14\11\uffff\2\14\1\11\22\uffff\1\14\3\uffff\1\12\2\14\1\13\14\uffff\6\1",
            "\1\15",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "\1\22\45\uffff\1\21",
            "\1\14\11\uffff\2\14\1\11\22\uffff\1\14\3\uffff\1\12\2\14\1\13\14\uffff\6\1",
            "\1\14\11\uffff\2\14\1\23\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\14\uffff\6\1",
            "\1\14\11\uffff\2\14\1\25\22\uffff\1\14\4\uffff\2\14\15\uffff\6\1",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\6",
            "\1\14\11\uffff\2\14\1\23\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\14\uffff\6\1",
            "\1\14\11\uffff\2\14\1\32\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\14\uffff\6\1",
            "\1\14\11\uffff\2\14\1\25\22\uffff\1\14\4\uffff\2\14\15\uffff\6\1",
            "\1\33",
            "\1\14\11\uffff\2\14\1\32\4\uffff\1\24\15\uffff\1\14\4\uffff\2\14\1\13\14\uffff\6\1"
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
            return "2249:2: (this_RegularityReference_0= ruleRegularityReference | (otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleCARDINALITY ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleCARDINALITY ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )";
        }
    }
    static final String dfa_21s = "\17\uffff";
    static final String dfa_22s = "\3\4\2\20\4\4\1\20\2\uffff\1\20\2\uffff";
    static final String dfa_23s = "\1\51\2\4\2\54\1\4\1\57\1\4\1\14\1\54\2\uffff\1\54\2\uffff";
    static final String dfa_24s = "\12\uffff\1\4\1\3\1\uffff\1\1\1\2";
    static final String dfa_25s = "\17\uffff}>";
    static final String[] dfa_26s = {
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
            return "2727:2: (this_SingleReferenceAssignment_0= ruleSingleReferenceAssignment | this_MultipleReferenceAssignment_1= ruleMultipleReferenceAssignment | this_SingleAttributeAssignment_2= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_3= ruleMultipleAttributeAssignment )";
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
            return "3390:2: (this_SingleSimpleAttributeAssignment_0= ruleSingleSimpleAttributeAssignment | this_MultipleSimpleAttributeAssignment_1= ruleMultipleSimpleAttributeAssignment )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000308F34CA010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000901002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000A01002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000F00000C901002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000F00000CA01002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000F00000C201002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000F000008201002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0070001000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0070000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1F80008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1F80008000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000200002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1F80048000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1F80048000200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000E01000000070L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000E00000000060L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000010L});

}
