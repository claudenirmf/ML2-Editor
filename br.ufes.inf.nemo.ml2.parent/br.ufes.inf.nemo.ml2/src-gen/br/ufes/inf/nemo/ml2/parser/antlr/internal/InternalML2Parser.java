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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'include'", "';'", "'}'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'specializes'", "'subordinatedTo'", "'isPowertypeOf'", "'class'", "'datatype'", "'order'", "'orderless'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'att'", "'subsets'", "'ref'", "'isOppositeTo'", "'regularity'", "'='", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'String'", "'Number'", "'Boolean'", "'determinesValue'", "'determinesType'", "'determinesMinValue'", "'determinesAllowedValues'", "'determinesAllowedTypes'", "'determinesMaxValue'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
                else if ( ((LA1_0>=18 && LA1_0<=19)||(LA1_0>=25 && LA1_0<=31)) ) {
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
    // InternalML2.g:288:1: ruleModelElement returns [EObject current=null] : ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Import_0 = null;

        EObject this_EntityDeclaration_1 = null;

        EObject this_GeneralizationSet_2 = null;



        	enterRule();

        try {
            // InternalML2.g:294:2: ( ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) )
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            {
            // InternalML2.g:295:2: ( (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';'
            {
            // InternalML2.g:296:3: (this_Import_0= ruleImport | this_EntityDeclaration_1= ruleEntityDeclaration | this_GeneralizationSet_2= ruleGeneralizationSet )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
            case 25:
            case 26:
            case 27:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

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

            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelElementAccess().getSemicolonKeyword_1());
            		

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
    // InternalML2.g:332:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalML2.g:332:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalML2.g:333:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
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
    // InternalML2.g:339:1: ruleEntityDeclaration returns [EObject current=null] : (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Individual_1 = null;



        	enterRule();

        try {
            // InternalML2.g:345:2: ( (this_Class_0= ruleClass | this_Individual_1= ruleIndividual ) )
            // InternalML2.g:346:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
            {
            // InternalML2.g:346:2: (this_Class_0= ruleClass | this_Individual_1= ruleIndividual )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=25 && LA5_0<=28)) ) {
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
                    // InternalML2.g:347:3: this_Class_0= ruleClass
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
                    // InternalML2.g:356:3: this_Individual_1= ruleIndividual
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


    // $ANTLR start "entryRuleIndividual"
    // InternalML2.g:368:1: entryRuleIndividual returns [EObject current=null] : iv_ruleIndividual= ruleIndividual EOF ;
    public final EObject entryRuleIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividual = null;


        try {
            // InternalML2.g:368:51: (iv_ruleIndividual= ruleIndividual EOF )
            // InternalML2.g:369:2: iv_ruleIndividual= ruleIndividual EOF
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
    // InternalML2.g:375:1: ruleIndividual returns [EObject current=null] : (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) ;
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
            // InternalML2.g:381:2: ( (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? ) )
            // InternalML2.g:382:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            {
            // InternalML2.g:382:2: (otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )? )
            // InternalML2.g:383:3: otherlv_0= 'individual' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndividualAccess().getIndividualKeyword_0());
            		
            // InternalML2.g:387:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:388:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:388:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:389:5: lv_name_1_0= RULE_ID
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
            		
            // InternalML2.g:409:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:410:4: ( ruleQualifiedName )
            {
            // InternalML2.g:410:4: ( ruleQualifiedName )
            // InternalML2.g:411:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndividualRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIndividualAccess().getInstantiatesClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:425:3: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalML2.g:426:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIndividualAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalML2.g:430:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:431:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:431:5: ( ruleQualifiedName )
            	    // InternalML2.g:432:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIndividualRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getIndividualAccess().getInstantiatesClassCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalML2.g:447:3: (otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalML2.g:448:4: otherlv_6= '{' ( (lv_assignments_7_0= ruleFeatureAssignment ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalML2.g:452:4: ( (lv_assignments_7_0= ruleFeatureAssignment ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID||LA7_0==35||LA7_0==37) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalML2.g:453:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:453:5: (lv_assignments_7_0= ruleFeatureAssignment )
                    	    // InternalML2.g:454:6: lv_assignments_7_0= ruleFeatureAssignment
                    	    {

                    	    						newCompositeNode(grammarAccess.getIndividualAccess().getAssignmentsFeatureAssignmentParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop7;
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


    // $ANTLR start "entryRuleClass"
    // InternalML2.g:480:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalML2.g:480:46: (iv_ruleClass= ruleClass EOF )
            // InternalML2.g:481:2: iv_ruleClass= ruleClass EOF
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
    // InternalML2.g:487:1: ruleClass returns [EObject current=null] : ( (this_FOClassOrDataType_0= ruleFOClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_FOClassOrDataType_0 = null;

        EObject this_HigherOrderClass_1 = null;

        EObject lv_assignments_3_0 = null;

        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:493:2: ( ( (this_FOClassOrDataType_0= ruleFOClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? ) )
            // InternalML2.g:494:2: ( (this_FOClassOrDataType_0= ruleFOClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? )
            {
            // InternalML2.g:494:2: ( (this_FOClassOrDataType_0= ruleFOClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? )
            // InternalML2.g:495:3: (this_FOClassOrDataType_0= ruleFOClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )?
            {
            // InternalML2.g:495:3: (this_FOClassOrDataType_0= ruleFOClassOrDataType | this_HigherOrderClass_1= ruleHigherOrderClass )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=25 && LA9_0<=26)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalML2.g:496:4: this_FOClassOrDataType_0= ruleFOClassOrDataType
                    {

                    				newCompositeNode(grammarAccess.getClassAccess().getFOClassOrDataTypeParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_FOClassOrDataType_0=ruleFOClassOrDataType();

                    state._fsp--;


                    				current = this_FOClassOrDataType_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalML2.g:505:4: this_HigherOrderClass_1= ruleHigherOrderClass
                    {

                    				newCompositeNode(grammarAccess.getClassAccess().getHigherOrderClassParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_HigherOrderClass_1=ruleHigherOrderClass();

                    state._fsp--;


                    				current = this_HigherOrderClass_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalML2.g:514:3: (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalML2.g:515:4: otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalML2.g:519:4: ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        switch ( input.LA(1) ) {
                        case 37:
                            {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==RULE_ID) ) {
                                int LA10_6 = input.LA(3);

                                if ( (LA10_6==20) ) {
                                    alt10=2;
                                }
                                else if ( (LA10_6==16||LA10_6==40) ) {
                                    alt10=1;
                                }


                            }


                            }
                            break;
                        case 35:
                            {
                            int LA10_3 = input.LA(2);

                            if ( (LA10_3==RULE_ID) ) {
                                int LA10_4 = input.LA(3);

                                if ( (LA10_4==16||LA10_4==40) ) {
                                    alt10=1;
                                }
                                else if ( (LA10_4==20) ) {
                                    alt10=2;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA10_4 = input.LA(2);

                            if ( (LA10_4==16||LA10_4==40) ) {
                                alt10=1;
                            }
                            else if ( (LA10_4==20) ) {
                                alt10=2;
                            }


                            }
                            break;
                        case 39:
                            {
                            alt10=2;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // InternalML2.g:520:5: ( (lv_assignments_3_0= ruleFeatureAssignment ) )
                    	    {
                    	    // InternalML2.g:520:5: ( (lv_assignments_3_0= ruleFeatureAssignment ) )
                    	    // InternalML2.g:521:6: (lv_assignments_3_0= ruleFeatureAssignment )
                    	    {
                    	    // InternalML2.g:521:6: (lv_assignments_3_0= ruleFeatureAssignment )
                    	    // InternalML2.g:522:7: lv_assignments_3_0= ruleFeatureAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_assignments_3_0=ruleFeatureAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_3_0,
                    	    								"br.ufes.inf.nemo.ml2.ML2.FeatureAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalML2.g:540:5: ( (lv_features_4_0= ruleFeature ) )
                    	    {
                    	    // InternalML2.g:540:5: ( (lv_features_4_0= ruleFeature ) )
                    	    // InternalML2.g:541:6: (lv_features_4_0= ruleFeature )
                    	    {
                    	    // InternalML2.g:541:6: (lv_features_4_0= ruleFeature )
                    	    // InternalML2.g:542:7: lv_features_4_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getFeaturesFeatureParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_features_4_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"features",
                    	    								lv_features_4_0,
                    	    								"br.ufes.inf.nemo.ml2.ML2.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleFOClassOrDataType"
    // InternalML2.g:569:1: entryRuleFOClassOrDataType returns [EObject current=null] : iv_ruleFOClassOrDataType= ruleFOClassOrDataType EOF ;
    public final EObject entryRuleFOClassOrDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFOClassOrDataType = null;


        try {
            // InternalML2.g:569:58: (iv_ruleFOClassOrDataType= ruleFOClassOrDataType EOF )
            // InternalML2.g:570:2: iv_ruleFOClassOrDataType= ruleFOClassOrDataType EOF
            {
             newCompositeNode(grammarAccess.getFOClassOrDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFOClassOrDataType=ruleFOClassOrDataType();

            state._fsp--;

             current =iv_ruleFOClassOrDataType; 
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
    // $ANTLR end "entryRuleFOClassOrDataType"


    // $ANTLR start "ruleFOClassOrDataType"
    // InternalML2.g:576:1: ruleFOClassOrDataType returns [EObject current=null] : ( (this_FOClass_0= ruleFOClass | this_DataType_1= ruleDataType ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleFOClassOrDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_FOClass_0 = null;

        EObject this_DataType_1 = null;



        	enterRule();

        try {
            // InternalML2.g:582:2: ( ( (this_FOClass_0= ruleFOClass | this_DataType_1= ruleDataType ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalML2.g:583:2: ( (this_FOClass_0= ruleFOClass | this_DataType_1= ruleDataType ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalML2.g:583:2: ( (this_FOClass_0= ruleFOClass | this_DataType_1= ruleDataType ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalML2.g:584:3: (this_FOClass_0= ruleFOClass | this_DataType_1= ruleDataType ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalML2.g:584:3: (this_FOClass_0= ruleFOClass | this_DataType_1= ruleDataType )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalML2.g:585:4: this_FOClass_0= ruleFOClass
                    {

                    				newCompositeNode(grammarAccess.getFOClassOrDataTypeAccess().getFOClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_14);
                    this_FOClass_0=ruleFOClass();

                    state._fsp--;


                    				current = this_FOClass_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalML2.g:594:4: this_DataType_1= ruleDataType
                    {

                    				newCompositeNode(grammarAccess.getFOClassOrDataTypeAccess().getDataTypeParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    				current = this_DataType_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalML2.g:603:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalML2.g:604:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getFOClassOrDataTypeAccess().getColonKeyword_1_0());
                    			
                    // InternalML2.g:608:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:609:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:609:5: ( ruleQualifiedName )
                    // InternalML2.g:610:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFOClassOrDataTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:624:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalML2.g:625:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFOClassOrDataTypeAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalML2.g:629:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:630:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:630:6: ( ruleQualifiedName )
                    	    // InternalML2.g:631:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFOClassOrDataTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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

            // InternalML2.g:647:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalML2.g:648:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFOClassOrDataTypeAccess().getSpecializesKeyword_2_0());
                    			
                    // InternalML2.g:652:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:653:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:653:5: ( ruleQualifiedName )
                    // InternalML2.g:654:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFOClassOrDataTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:668:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalML2.g:669:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFOClassOrDataTypeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalML2.g:673:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:674:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:674:6: ( ruleQualifiedName )
                    	    // InternalML2.g:675:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFOClassOrDataTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
    // $ANTLR end "ruleFOClassOrDataType"


    // $ANTLR start "entryRuleHigherOrderClass"
    // InternalML2.g:695:1: entryRuleHigherOrderClass returns [EObject current=null] : iv_ruleHigherOrderClass= ruleHigherOrderClass EOF ;
    public final EObject entryRuleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderClass = null;


        try {
            // InternalML2.g:695:57: (iv_ruleHigherOrderClass= ruleHigherOrderClass EOF )
            // InternalML2.g:696:2: iv_ruleHigherOrderClass= ruleHigherOrderClass EOF
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
    // InternalML2.g:702:1: ruleHigherOrderClass returns [EObject current=null] : ( (this_HOClass_0= ruleHOClass | this_OrderlessClass_1= ruleOrderlessClass ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? ) ;
    public final EObject ruleHigherOrderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject this_HOClass_0 = null;

        EObject this_OrderlessClass_1 = null;

        Enumerator lv_categorizationType_14_0 = null;



        	enterRule();

        try {
            // InternalML2.g:708:2: ( ( (this_HOClass_0= ruleHOClass | this_OrderlessClass_1= ruleOrderlessClass ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? ) )
            // InternalML2.g:709:2: ( (this_HOClass_0= ruleHOClass | this_OrderlessClass_1= ruleOrderlessClass ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? )
            {
            // InternalML2.g:709:2: ( (this_HOClass_0= ruleHOClass | this_OrderlessClass_1= ruleOrderlessClass ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? )
            // InternalML2.g:710:3: (this_HOClass_0= ruleHOClass | this_OrderlessClass_1= ruleOrderlessClass ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            {
            // InternalML2.g:710:3: (this_HOClass_0= ruleHOClass | this_OrderlessClass_1= ruleOrderlessClass )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==28) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalML2.g:711:4: this_HOClass_0= ruleHOClass
                    {

                    				newCompositeNode(grammarAccess.getHigherOrderClassAccess().getHOClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_HOClass_0=ruleHOClass();

                    state._fsp--;


                    				current = this_HOClass_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalML2.g:720:4: this_OrderlessClass_1= ruleOrderlessClass
                    {

                    				newCompositeNode(grammarAccess.getHigherOrderClassAccess().getOrderlessClassParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_OrderlessClass_1=ruleOrderlessClass();

                    state._fsp--;


                    				current = this_OrderlessClass_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalML2.g:729:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalML2.g:730:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getHigherOrderClassAccess().getColonKeyword_1_0());
                    			
                    // InternalML2.g:734:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:735:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:735:5: ( ruleQualifiedName )
                    // InternalML2.g:736:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:750:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalML2.g:751:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getHigherOrderClassAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalML2.g:755:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:756:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:756:6: ( ruleQualifiedName )
                    	    // InternalML2.g:757:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:773:3: (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalML2.g:774:4: otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getHigherOrderClassAccess().getSpecializesKeyword_2_0());
                    			
                    // InternalML2.g:778:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:779:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:779:5: ( ruleQualifiedName )
                    // InternalML2.g:780:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:794:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==21) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalML2.g:795:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getHigherOrderClassAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalML2.g:799:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:800:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:800:6: ( ruleQualifiedName )
                    	    // InternalML2.g:801:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:817:3: (otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalML2.g:818:4: otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getHigherOrderClassAccess().getSubordinatedToKeyword_3_0());
                    			
                    // InternalML2.g:822:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:823:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:823:5: ( ruleQualifiedName )
                    // InternalML2.g:824:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:838:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==21) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalML2.g:839:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getHigherOrderClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalML2.g:843:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:844:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:844:6: ( ruleQualifiedName )
                    	    // InternalML2.g:845:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:861:3: ( ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=41 && LA24_0<=44)) ) {
                alt24=1;
            }
            else if ( (LA24_0==24) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalML2.g:862:4: ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:862:4: ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:863:5: ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:863:5: ( (lv_categorizationType_14_0= ruleCategorizationType ) )
                    // InternalML2.g:864:6: (lv_categorizationType_14_0= ruleCategorizationType )
                    {
                    // InternalML2.g:864:6: (lv_categorizationType_14_0= ruleCategorizationType )
                    // InternalML2.g:865:7: lv_categorizationType_14_0= ruleCategorizationType
                    {

                    							newCompositeNode(grammarAccess.getHigherOrderClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_4_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_14_0=ruleCategorizationType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHigherOrderClassRule());
                    							}
                    							set(
                    								current,
                    								"categorizationType",
                    								lv_categorizationType_14_0,
                    								"br.ufes.inf.nemo.ml2.ML2.CategorizationType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalML2.g:882:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:883:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:883:6: ( ruleQualifiedName )
                    // InternalML2.g:884:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHigherOrderClassAccess().getCategorizedClassClassCrossReference_4_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:900:4: (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalML2.g:900:4: (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) )
                    // InternalML2.g:901:5: otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) )
                    {
                    otherlv_16=(Token)match(input,24,FOLLOW_3); 

                    					newLeafNode(otherlv_16, grammarAccess.getHigherOrderClassAccess().getIsPowertypeOfKeyword_4_1_0());
                    				
                    // InternalML2.g:905:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:906:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:906:6: ( ruleQualifiedName )
                    // InternalML2.g:907:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHigherOrderClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getHigherOrderClassAccess().getPowertypeOfClassCrossReference_4_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleHigherOrderClass"


    // $ANTLR start "entryRuleFOClass"
    // InternalML2.g:927:1: entryRuleFOClass returns [EObject current=null] : iv_ruleFOClass= ruleFOClass EOF ;
    public final EObject entryRuleFOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFOClass = null;


        try {
            // InternalML2.g:927:48: (iv_ruleFOClass= ruleFOClass EOF )
            // InternalML2.g:928:2: iv_ruleFOClass= ruleFOClass EOF
            {
             newCompositeNode(grammarAccess.getFOClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFOClass=ruleFOClass();

            state._fsp--;

             current =iv_ruleFOClass; 
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
    // $ANTLR end "entryRuleFOClass"


    // $ANTLR start "ruleFOClass"
    // InternalML2.g:934:1: ruleFOClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFOClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalML2.g:940:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalML2.g:941:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalML2.g:941:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalML2.g:942:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFOClassAccess().getClassKeyword_0());
            		
            // InternalML2.g:946:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:947:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:947:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:948:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFOClass"


    // $ANTLR start "entryRuleDataType"
    // InternalML2.g:968:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalML2.g:968:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalML2.g:969:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalML2.g:975:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalML2.g:981:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalML2.g:982:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalML2.g:982:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalML2.g:983:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalML2.g:987:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:988:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:988:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:989:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleHOClass"
    // InternalML2.g:1009:1: entryRuleHOClass returns [EObject current=null] : iv_ruleHOClass= ruleHOClass EOF ;
    public final EObject entryRuleHOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHOClass = null;


        try {
            // InternalML2.g:1009:48: (iv_ruleHOClass= ruleHOClass EOF )
            // InternalML2.g:1010:2: iv_ruleHOClass= ruleHOClass EOF
            {
             newCompositeNode(grammarAccess.getHOClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHOClass=ruleHOClass();

            state._fsp--;

             current =iv_ruleHOClass; 
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
    // $ANTLR end "entryRuleHOClass"


    // $ANTLR start "ruleHOClass"
    // InternalML2.g:1016:1: ruleHOClass returns [EObject current=null] : (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleHOClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_order_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalML2.g:1022:2: ( (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalML2.g:1023:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalML2.g:1023:2: (otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalML2.g:1024:3: otherlv_0= 'order' ( (lv_order_1_0= RULE_INT ) ) otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getHOClassAccess().getOrderKeyword_0());
            		
            // InternalML2.g:1028:3: ( (lv_order_1_0= RULE_INT ) )
            // InternalML2.g:1029:4: (lv_order_1_0= RULE_INT )
            {
            // InternalML2.g:1029:4: (lv_order_1_0= RULE_INT )
            // InternalML2.g:1030:5: lv_order_1_0= RULE_INT
            {
            lv_order_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_order_1_0, grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getHOClassAccess().getClassKeyword_2());
            		
            // InternalML2.g:1050:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalML2.g:1051:4: (lv_name_3_0= RULE_ID )
            {
            // InternalML2.g:1051:4: (lv_name_3_0= RULE_ID )
            // InternalML2.g:1052:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleHOClass"


    // $ANTLR start "entryRuleOrderlessClass"
    // InternalML2.g:1072:1: entryRuleOrderlessClass returns [EObject current=null] : iv_ruleOrderlessClass= ruleOrderlessClass EOF ;
    public final EObject entryRuleOrderlessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderlessClass = null;


        try {
            // InternalML2.g:1072:55: (iv_ruleOrderlessClass= ruleOrderlessClass EOF )
            // InternalML2.g:1073:2: iv_ruleOrderlessClass= ruleOrderlessClass EOF
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
    // InternalML2.g:1079:1: ruleOrderlessClass returns [EObject current=null] : (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOrderlessClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalML2.g:1085:2: ( (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalML2.g:1086:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalML2.g:1086:2: (otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalML2.g:1087:3: otherlv_0= 'orderless' otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderlessClassAccess().getClassKeyword_1());
            		
            // InternalML2.g:1095:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:1096:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:1096:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:1097:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalML2.g:1117:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalML2.g:1117:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalML2.g:1118:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalML2.g:1124:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) ;
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
            // InternalML2.g:1130:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalML2.g:1131:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalML2.g:1131:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+ )
            // InternalML2.g:1132:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'genset' ( (lv_name_4_0= RULE_ID ) )? otherlv_5= 'general' ( ( ruleQualifiedName ) ) (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )? otherlv_9= 'specifics' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
            {
            // InternalML2.g:1132:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalML2.g:1133:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalML2.g:1133:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            // InternalML2.g:1134:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            				
            // InternalML2.g:1137:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            // InternalML2.g:1138:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            {
            // InternalML2.g:1138:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalML2.g:1139:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalML2.g:1139:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    // InternalML2.g:1140:5: {...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalML2.g:1140:114: ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    // InternalML2.g:1141:6: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalML2.g:1144:9: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    // InternalML2.g:1144:10: {...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1144:19: ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    // InternalML2.g:1144:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    {
            	    // InternalML2.g:1144:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    // InternalML2.g:1145:10: lv_isDisjoint_1_0= 'disjoint'
            	    {
            	    lv_isDisjoint_1_0=(Token)match(input,29,FOLLOW_23); 

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
            	    // InternalML2.g:1162:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalML2.g:1162:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    // InternalML2.g:1163:5: {...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalML2.g:1163:114: ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    // InternalML2.g:1164:6: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalML2.g:1167:9: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    // InternalML2.g:1167:10: {...}? => ( (lv_isComplete_2_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalML2.g:1167:19: ( (lv_isComplete_2_0= 'complete' ) )
            	    // InternalML2.g:1167:20: (lv_isComplete_2_0= 'complete' )
            	    {
            	    // InternalML2.g:1167:20: (lv_isComplete_2_0= 'complete' )
            	    // InternalML2.g:1168:10: lv_isComplete_2_0= 'complete'
            	    {
            	    lv_isComplete_2_0=(Token)match(input,30,FOLLOW_23); 

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
            	    break loop25;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            				

            }

            otherlv_3=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1());
            		
            // InternalML2.g:1196:3: ( (lv_name_4_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalML2.g:1197:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalML2.g:1197:4: (lv_name_4_0= RULE_ID )
                    // InternalML2.g:1198:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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
            		
            // InternalML2.g:1218:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1219:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1219:4: ( ruleQualifiedName )
            // InternalML2.g:1220:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:1234:3: (otherlv_7= 'categorizer' ( ( ruleQualifiedName ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalML2.g:1235:4: otherlv_7= 'categorizer' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0());
                    			
                    // InternalML2.g:1239:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1240:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1240:5: ( ruleQualifiedName )
                    // InternalML2.g:1241:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCategorizerClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
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
            		
            // InternalML2.g:1260:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1261:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1261:4: ( ruleQualifiedName )
            // InternalML2.g:1262:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0());
            				
            pushFollow(FOLLOW_28);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:1276:3: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalML2.g:1277:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalML2.g:1281:4: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:1282:5: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:1282:5: ( ruleQualifiedName )
            	    // InternalML2.g:1283:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalML2.g:1302:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalML2.g:1302:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalML2.g:1303:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalML2.g:1309:1: ruleFeature returns [EObject current=null] : (this_CommonFeature_0= ruleCommonFeature | this_RegularityFeature_1= ruleRegularityFeature ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_CommonFeature_0 = null;

        EObject this_RegularityFeature_1 = null;



        	enterRule();

        try {
            // InternalML2.g:1315:2: ( (this_CommonFeature_0= ruleCommonFeature | this_RegularityFeature_1= ruleRegularityFeature ) )
            // InternalML2.g:1316:2: (this_CommonFeature_0= ruleCommonFeature | this_RegularityFeature_1= ruleRegularityFeature )
            {
            // InternalML2.g:1316:2: (this_CommonFeature_0= ruleCommonFeature | this_RegularityFeature_1= ruleRegularityFeature )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==35||LA29_0==37) ) {
                alt29=1;
            }
            else if ( (LA29_0==39) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalML2.g:1317:3: this_CommonFeature_0= ruleCommonFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getCommonFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommonFeature_0=ruleCommonFeature();

                    state._fsp--;


                    			current = this_CommonFeature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:1326:3: this_RegularityFeature_1= ruleRegularityFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getRegularityFeatureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularityFeature_1=ruleRegularityFeature();

                    state._fsp--;


                    			current = this_RegularityFeature_1;
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


    // $ANTLR start "entryRuleCommonFeature"
    // InternalML2.g:1338:1: entryRuleCommonFeature returns [EObject current=null] : iv_ruleCommonFeature= ruleCommonFeature EOF ;
    public final EObject entryRuleCommonFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonFeature = null;


        try {
            // InternalML2.g:1338:54: (iv_ruleCommonFeature= ruleCommonFeature EOF )
            // InternalML2.g:1339:2: iv_ruleCommonFeature= ruleCommonFeature EOF
            {
             newCompositeNode(grammarAccess.getCommonFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonFeature=ruleCommonFeature();

            state._fsp--;

             current =iv_ruleCommonFeature; 
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
    // $ANTLR end "entryRuleCommonFeature"


    // $ANTLR start "ruleCommonFeature"
    // InternalML2.g:1345:1: ruleCommonFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleCommonFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:1351:2: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // InternalML2.g:1352:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // InternalML2.g:1352:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==35) ) {
                alt30=1;
            }
            else if ( (LA30_0==37) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalML2.g:1353:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getCommonFeatureAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:1362:3: this_Reference_1= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getCommonFeatureAccess().getReferenceParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleCommonFeature"


    // $ANTLR start "entryRuleRegularityFeature"
    // InternalML2.g:1374:1: entryRuleRegularityFeature returns [EObject current=null] : iv_ruleRegularityFeature= ruleRegularityFeature EOF ;
    public final EObject entryRuleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityFeature = null;


        try {
            // InternalML2.g:1374:58: (iv_ruleRegularityFeature= ruleRegularityFeature EOF )
            // InternalML2.g:1375:2: iv_ruleRegularityFeature= ruleRegularityFeature EOF
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
    // InternalML2.g:1381:1: ruleRegularityFeature returns [EObject current=null] : (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) ;
    public final EObject ruleRegularityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_RegularityAttribute_0 = null;

        EObject this_RegularityReference_1 = null;



        	enterRule();

        try {
            // InternalML2.g:1387:2: ( (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference ) )
            // InternalML2.g:1388:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
            {
            // InternalML2.g:1388:2: (this_RegularityAttribute_0= ruleRegularityAttribute | this_RegularityReference_1= ruleRegularityReference )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==37) ) {
                    alt31=2;
                }
                else if ( (LA31_1==RULE_ID||LA31_1==35) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalML2.g:1389:3: this_RegularityAttribute_0= ruleRegularityAttribute
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
                    // InternalML2.g:1398:3: this_RegularityReference_1= ruleRegularityReference
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


    // $ANTLR start "entryRuleAttribute"
    // InternalML2.g:1410:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalML2.g:1410:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalML2.g:1411:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalML2.g:1417:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_primitiveType_3_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_5= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_primitiveType_3_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1423:2: ( ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_primitiveType_3_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_5= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalML2.g:1424:2: ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_primitiveType_3_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_5= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalML2.g:1424:2: ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_primitiveType_3_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_5= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalML2.g:1425:3: (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_primitiveType_3_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_5= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
            {
            // InternalML2.g:1425:3: (otherlv_0= 'att' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalML2.g:1426:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
                    			

                    }
                    break;

            }

            // InternalML2.g:1431:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:1432:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:1432:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:1433:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalML2.g:1453:3: ( ( (lv_primitiveType_3_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=45 && LA33_0<=47)) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalML2.g:1454:4: ( (lv_primitiveType_3_0= rulePrimitiveType ) )
                    {
                    // InternalML2.g:1454:4: ( (lv_primitiveType_3_0= rulePrimitiveType ) )
                    // InternalML2.g:1455:5: (lv_primitiveType_3_0= rulePrimitiveType )
                    {
                    // InternalML2.g:1455:5: (lv_primitiveType_3_0= rulePrimitiveType )
                    // InternalML2.g:1456:6: lv_primitiveType_3_0= rulePrimitiveType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_primitiveType_3_0=rulePrimitiveType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"primitiveType",
                    							lv_primitiveType_3_0,
                    							"br.ufes.inf.nemo.ml2.ML2.PrimitiveType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1474:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1474:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1475:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1475:5: ( ruleQualifiedName )
                    // InternalML2.g:1476:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1491:3: (otherlv_5= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalML2.g:1492:4: otherlv_5= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getSubsetsKeyword_4_0());
                    			
                    // InternalML2.g:1496:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1497:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1497:5: ( ruleQualifiedName )
                    // InternalML2.g:1498:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1512:4: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalML2.g:1513:5: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalML2.g:1517:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1518:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1518:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1519:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_4_2_1_0());
                    	    						
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


    // $ANTLR start "entryRuleReference"
    // InternalML2.g:1539:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalML2.g:1539:50: (iv_ruleReference= ruleReference EOF )
            // InternalML2.g:1540:2: iv_ruleReference= ruleReference EOF
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
    // InternalML2.g:1546:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalML2.g:1552:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            // InternalML2.g:1553:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalML2.g:1553:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
            // InternalML2.g:1554:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalML2.g:1558:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:1559:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:1559:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:1560:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
            		
            // InternalML2.g:1580:3: (otherlv_3= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalML2.g:1581:4: otherlv_3= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getSubsetsKeyword_3_0());
                    			
                    // InternalML2.g:1585:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1586:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1586:5: ( ruleQualifiedName )
                    // InternalML2.g:1587:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1601:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalML2.g:1602:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalML2.g:1606:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1607:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1607:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1608:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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

            // InternalML2.g:1624:3: (otherlv_7= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalML2.g:1625:4: otherlv_7= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getIsOppositeToKeyword_4_0());
                    			
                    // InternalML2.g:1629:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1630:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1630:5: ( ruleQualifiedName )
                    // InternalML2.g:1631:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_4_1_0());
                    					
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


    // $ANTLR start "entryRuleRegularityAttribute"
    // InternalML2.g:1650:1: entryRuleRegularityAttribute returns [EObject current=null] : iv_ruleRegularityAttribute= ruleRegularityAttribute EOF ;
    public final EObject entryRuleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityAttribute = null;


        try {
            // InternalML2.g:1650:60: (iv_ruleRegularityAttribute= ruleRegularityAttribute EOF )
            // InternalML2.g:1651:2: iv_ruleRegularityAttribute= ruleRegularityAttribute EOF
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
    // InternalML2.g:1657:1: ruleRegularityAttribute returns [EObject current=null] : (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_primitiveType_4_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_6= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_primitiveType_4_0 = null;

        Enumerator lv_regularityType_10_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1663:2: ( (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_primitiveType_4_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_6= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:1664:2: (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_primitiveType_4_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_6= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:1664:2: (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_primitiveType_4_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_6= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:1665:3: otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_primitiveType_4_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_6= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0());
            		
            // InternalML2.g:1669:3: (otherlv_1= 'att' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalML2.g:1670:4: otherlv_1= 'att'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRegularityAttributeAccess().getAttKeyword_1());
                    			

                    }
                    break;

            }

            // InternalML2.g:1675:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:1676:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:1676:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:1677:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularityAttributeAccess().getColonKeyword_3());
            		
            // InternalML2.g:1697:3: ( ( (lv_primitiveType_4_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=45 && LA40_0<=47)) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalML2.g:1698:4: ( (lv_primitiveType_4_0= rulePrimitiveType ) )
                    {
                    // InternalML2.g:1698:4: ( (lv_primitiveType_4_0= rulePrimitiveType ) )
                    // InternalML2.g:1699:5: (lv_primitiveType_4_0= rulePrimitiveType )
                    {
                    // InternalML2.g:1699:5: (lv_primitiveType_4_0= rulePrimitiveType )
                    // InternalML2.g:1700:6: lv_primitiveType_4_0= rulePrimitiveType
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_primitiveType_4_0=rulePrimitiveType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"primitiveType",
                    							lv_primitiveType_4_0,
                    							"br.ufes.inf.nemo.ml2.ML2.PrimitiveType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1718:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1718:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1719:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1719:5: ( ruleQualifiedName )
                    // InternalML2.g:1720:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1735:3: (otherlv_6= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:1736:4: otherlv_6= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_5_0());
                    			
                    // InternalML2.g:1740:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1741:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1741:5: ( ruleQualifiedName )
                    // InternalML2.g:1742:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1756:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==21) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalML2.g:1757:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRegularityAttributeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalML2.g:1761:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1762:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1762:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1763:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1779:3: ( (lv_regularityType_10_0= ruleRegularityFeatureType ) )
            // InternalML2.g:1780:4: (lv_regularityType_10_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:1780:4: (lv_regularityType_10_0= ruleRegularityFeatureType )
            // InternalML2.g:1781:5: lv_regularityType_10_0= ruleRegularityFeatureType
            {

            					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_3);
            lv_regularityType_10_0=ruleRegularityFeatureType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
            					}
            					set(
            						current,
            						"regularityType",
            						lv_regularityType_10_0,
            						"br.ufes.inf.nemo.ml2.ML2.RegularityFeatureType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:1798:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1799:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1799:4: ( ruleQualifiedName )
            // InternalML2.g:1800:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureCrossReference_7_0());
            				
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


    // $ANTLR start "entryRuleRegularityReference"
    // InternalML2.g:1818:1: entryRuleRegularityReference returns [EObject current=null] : iv_ruleRegularityReference= ruleRegularityReference EOF ;
    public final EObject entryRuleRegularityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityReference = null;


        try {
            // InternalML2.g:1818:60: (iv_ruleRegularityReference= ruleRegularityReference EOF )
            // InternalML2.g:1819:2: iv_ruleRegularityReference= ruleRegularityReference EOF
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
    // InternalML2.g:1825:1: ruleRegularityReference returns [EObject current=null] : (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRegularityReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_regularityType_10_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1831:2: ( (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:1832:2: (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:1832:2: (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:1833:3: otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_8= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_10_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularityReferenceAccess().getRefKeyword_1());
            		
            // InternalML2.g:1841:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:1842:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:1842:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:1843:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,20,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularityReferenceAccess().getColonKeyword_3());
            		
            // InternalML2.g:1863:3: (otherlv_4= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==36) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalML2.g:1864:4: otherlv_4= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_4_0());
                    			
                    // InternalML2.g:1868:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1869:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1869:5: ( ruleQualifiedName )
                    // InternalML2.g:1870:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1884:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==21) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalML2.g:1885:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRegularityReferenceAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalML2.g:1889:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1890:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1890:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1891:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1907:3: (otherlv_8= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalML2.g:1908:4: otherlv_8= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_5_0());
                    			
                    // InternalML2.g:1912:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1913:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1913:5: ( ruleQualifiedName )
                    // InternalML2.g:1914:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1929:3: ( (lv_regularityType_10_0= ruleRegularityFeatureType ) )
            // InternalML2.g:1930:4: (lv_regularityType_10_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:1930:4: (lv_regularityType_10_0= ruleRegularityFeatureType )
            // InternalML2.g:1931:5: lv_regularityType_10_0= ruleRegularityFeatureType
            {

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_3);
            lv_regularityType_10_0=ruleRegularityFeatureType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
            					}
            					set(
            						current,
            						"regularityType",
            						lv_regularityType_10_0,
            						"br.ufes.inf.nemo.ml2.ML2.RegularityFeatureType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:1948:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1949:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1949:4: ( ruleQualifiedName )
            // InternalML2.g:1950:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureCrossReference_7_0());
            				
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


    // $ANTLR start "entryRuleFeatureAssignment"
    // InternalML2.g:1968:1: entryRuleFeatureAssignment returns [EObject current=null] : iv_ruleFeatureAssignment= ruleFeatureAssignment EOF ;
    public final EObject entryRuleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureAssignment = null;


        try {
            // InternalML2.g:1968:58: (iv_ruleFeatureAssignment= ruleFeatureAssignment EOF )
            // InternalML2.g:1969:2: iv_ruleFeatureAssignment= ruleFeatureAssignment EOF
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
    // InternalML2.g:1975:1: ruleFeatureAssignment returns [EObject current=null] : (this_ReferenceAssignment_0= ruleReferenceAssignment | this_SingleAttributeAssignment_1= ruleSingleAttributeAssignment ) ;
    public final EObject ruleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceAssignment_0 = null;

        EObject this_SingleAttributeAssignment_1 = null;



        	enterRule();

        try {
            // InternalML2.g:1981:2: ( (this_ReferenceAssignment_0= ruleReferenceAssignment | this_SingleAttributeAssignment_1= ruleSingleAttributeAssignment ) )
            // InternalML2.g:1982:2: (this_ReferenceAssignment_0= ruleReferenceAssignment | this_SingleAttributeAssignment_1= ruleSingleAttributeAssignment )
            {
            // InternalML2.g:1982:2: (this_ReferenceAssignment_0= ruleReferenceAssignment | this_SingleAttributeAssignment_1= ruleSingleAttributeAssignment )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID||LA46_0==35) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalML2.g:1983:3: this_ReferenceAssignment_0= ruleReferenceAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getReferenceAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceAssignment_0=ruleReferenceAssignment();

                    state._fsp--;


                    			current = this_ReferenceAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:1992:3: this_SingleAttributeAssignment_1= ruleSingleAttributeAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleAttributeAssignment_1=ruleSingleAttributeAssignment();

                    state._fsp--;


                    			current = this_SingleAttributeAssignment_1;
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


    // $ANTLR start "entryRuleSingleAttributeAssignment"
    // InternalML2.g:2004:1: entryRuleSingleAttributeAssignment returns [EObject current=null] : iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF ;
    public final EObject entryRuleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAttributeAssignment = null;


        try {
            // InternalML2.g:2004:66: (iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF )
            // InternalML2.g:2005:2: iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF
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
    // InternalML2.g:2011:1: ruleSingleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalML2.g:2017:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2018:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2018:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2019:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:2019:3: (otherlv_0= 'att' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalML2.g:2020:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0());
                    			

                    }
                    break;

            }

            // InternalML2.g:2025:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2026:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2026:4: ( ruleQualifiedName )
            // InternalML2.g:2027:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalML2.g:2045:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2046:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2046:4: ( ruleQualifiedName )
            // InternalML2.g:2047:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_3_0());
            				
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
    // $ANTLR end "ruleSingleAttributeAssignment"


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalML2.g:2065:1: entryRuleReferenceAssignment returns [EObject current=null] : iv_ruleReferenceAssignment= ruleReferenceAssignment EOF ;
    public final EObject entryRuleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceAssignment = null;


        try {
            // InternalML2.g:2065:60: (iv_ruleReferenceAssignment= ruleReferenceAssignment EOF )
            // InternalML2.g:2066:2: iv_ruleReferenceAssignment= ruleReferenceAssignment EOF
            {
             newCompositeNode(grammarAccess.getReferenceAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceAssignment=ruleReferenceAssignment();

            state._fsp--;

             current =iv_ruleReferenceAssignment; 
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
    // $ANTLR end "entryRuleReferenceAssignment"


    // $ANTLR start "ruleReferenceAssignment"
    // InternalML2.g:2072:1: ruleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalML2.g:2078:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) ) )
            // InternalML2.g:2079:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) )
            {
            // InternalML2.g:2079:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) )
            // InternalML2.g:2080:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0());
            		
            // InternalML2.g:2084:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2085:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2085:4: ( ruleQualifiedName )
            // InternalML2.g:2086:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalML2.g:2104:3: ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==12) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalML2.g:2105:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2105:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2106:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2106:5: ( ruleQualifiedName )
                    // InternalML2.g:2107:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2122:4: (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' )
                    {
                    // InternalML2.g:2122:4: (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' )
                    // InternalML2.g:2123:5: otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalML2.g:2127:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2128:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2128:6: ( ruleQualifiedName )
                    // InternalML2.g:2129:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0());
                    						
                    pushFollow(FOLLOW_41);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalML2.g:2143:5: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==21) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalML2.g:2144:6: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0());
                    	    					
                    	    // InternalML2.g:2148:6: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2149:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2149:7: ( ruleQualifiedName )
                    	    // InternalML2.g:2150:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_41);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3());
                    				

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
    // $ANTLR end "ruleReferenceAssignment"


    // $ANTLR start "ruleCategorizationType"
    // InternalML2.g:2175:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:2181:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalML2.g:2182:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalML2.g:2182:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt50=1;
                }
                break;
            case 42:
                {
                alt50=2;
                }
                break;
            case 43:
                {
                alt50=3;
                }
                break;
            case 44:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalML2.g:2183:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalML2.g:2183:3: (enumLiteral_0= 'categorizes' )
                    // InternalML2.g:2184:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2191:3: (enumLiteral_1= 'completeCategorizes' )
                    {
                    // InternalML2.g:2191:3: (enumLiteral_1= 'completeCategorizes' )
                    // InternalML2.g:2192:4: enumLiteral_1= 'completeCategorizes'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:2199:3: (enumLiteral_2= 'disjointCategorizes' )
                    {
                    // InternalML2.g:2199:3: (enumLiteral_2= 'disjointCategorizes' )
                    // InternalML2.g:2200:4: enumLiteral_2= 'disjointCategorizes'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:2207:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalML2.g:2207:3: (enumLiteral_3= 'partitions' )
                    // InternalML2.g:2208:4: enumLiteral_3= 'partitions'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

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
    // InternalML2.g:2218:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:2224:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) )
            // InternalML2.g:2225:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            {
            // InternalML2.g:2225:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt51=1;
                }
                break;
            case 46:
                {
                alt51=2;
                }
                break;
            case 47:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalML2.g:2226:3: (enumLiteral_0= 'String' )
                    {
                    // InternalML2.g:2226:3: (enumLiteral_0= 'String' )
                    // InternalML2.g:2227:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2234:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalML2.g:2234:3: (enumLiteral_1= 'Number' )
                    // InternalML2.g:2235:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:2242:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalML2.g:2242:3: (enumLiteral_2= 'Boolean' )
                    // InternalML2.g:2243:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

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
    // InternalML2.g:2253:1: ruleRegularityFeatureType returns [Enumerator current=null] : ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) ) ;
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
            // InternalML2.g:2259:2: ( ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) ) )
            // InternalML2.g:2260:2: ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) )
            {
            // InternalML2.g:2260:2: ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt52=1;
                }
                break;
            case 49:
                {
                alt52=2;
                }
                break;
            case 50:
                {
                alt52=3;
                }
                break;
            case 51:
                {
                alt52=4;
                }
                break;
            case 52:
                {
                alt52=5;
                }
                break;
            case 53:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalML2.g:2261:3: (enumLiteral_0= 'determinesValue' )
                    {
                    // InternalML2.g:2261:3: (enumLiteral_0= 'determinesValue' )
                    // InternalML2.g:2262:4: enumLiteral_0= 'determinesValue'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2269:3: (enumLiteral_1= 'determinesType' )
                    {
                    // InternalML2.g:2269:3: (enumLiteral_1= 'determinesType' )
                    // InternalML2.g:2270:4: enumLiteral_1= 'determinesType'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:2277:3: (enumLiteral_2= 'determinesMinValue' )
                    {
                    // InternalML2.g:2277:3: (enumLiteral_2= 'determinesMinValue' )
                    // InternalML2.g:2278:4: enumLiteral_2= 'determinesMinValue'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:2285:3: (enumLiteral_3= 'determinesAllowedValues' )
                    {
                    // InternalML2.g:2285:3: (enumLiteral_3= 'determinesAllowedValues' )
                    // InternalML2.g:2286:4: enumLiteral_3= 'determinesAllowedValues'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:2293:3: (enumLiteral_4= 'determinesAllowedTypes' )
                    {
                    // InternalML2.g:2293:3: (enumLiteral_4= 'determinesAllowedTypes' )
                    // InternalML2.g:2294:4: enumLiteral_4= 'determinesAllowedTypes'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:2301:3: (enumLiteral_5= 'determinesMaxValue' )
                    {
                    // InternalML2.g:2301:3: (enumLiteral_5= 'determinesMaxValue' )
                    // InternalML2.g:2302:4: enumLiteral_5= 'determinesMaxValue'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_5());
                    			

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000FE0CA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002800008010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000A800008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00001E0001D00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001E0001E00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001E0001A00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00001E0001200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000E00000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000200002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x003F001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x003F001000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x003F005000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x003F005000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000208000L});

}
