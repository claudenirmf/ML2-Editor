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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'include'", "';'", "'}'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'specializes'", "'subordinatedTo'", "'isPowertypeOf'", "'class'", "'datatype'", "'order'", "'orderless'", "'disjoint'", "'complete'", "'genset'", "'general'", "'categorizer'", "'specifics'", "'att'", "'['", "'..'", "']'", "'subsets'", "'ref'", "'isOppositeTo'", "'regularity'", "'*'", "'='", "'true'", "'false'", "'-'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'String'", "'Number'", "'Boolean'", "'determinesValue'", "'determinesType'", "'determinesMinValue'", "'determinesAllowedValues'", "'determinesAllowedTypes'", "'determinesMaxValue'"
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
        	return "ML2Model";
       	}

       	@Override
       	protected ML2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleML2Model"
    // InternalML2.g:65:1: entryRuleML2Model returns [EObject current=null] : iv_ruleML2Model= ruleML2Model EOF ;
    public final EObject entryRuleML2Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleML2Model = null;


        try {
            // InternalML2.g:65:49: (iv_ruleML2Model= ruleML2Model EOF )
            // InternalML2.g:66:2: iv_ruleML2Model= ruleML2Model EOF
            {
             newCompositeNode(grammarAccess.getML2ModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleML2Model=ruleML2Model();

            state._fsp--;

             current =iv_ruleML2Model; 
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
    // $ANTLR end "entryRuleML2Model"


    // $ANTLR start "ruleML2Model"
    // InternalML2.g:72:1: ruleML2Model returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (otherlv_3= 'include' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | ( (lv_elements_6_0= ruleModelElement ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleML2Model() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getML2ModelAccess().getModuleKeyword_0());
            		
            // InternalML2.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalML2.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalML2.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalML2.g:86:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getML2ModelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getML2ModelRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getML2ModelAccess().getLeftCurlyBracketKeyword_2());
            		
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

            	    					newLeafNode(otherlv_3, grammarAccess.getML2ModelAccess().getIncludeKeyword_3_0_0());
            	    				
            	    // InternalML2.g:113:5: ( ( ruleQualifiedName ) )
            	    // InternalML2.g:114:6: ( ruleQualifiedName )
            	    {
            	    // InternalML2.g:114:6: ( ruleQualifiedName )
            	    // InternalML2.g:115:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getML2ModelRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getML2ModelAccess().getIncludesML2ModelCrossReference_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    					newLeafNode(otherlv_5, grammarAccess.getML2ModelAccess().getSemicolonKeyword_3_0_2());
            	    				

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

            	    						newCompositeNode(grammarAccess.getML2ModelAccess().getElementsModelElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elements_6_0=ruleModelElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getML2ModelRule());
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

            			newLeafNode(otherlv_7, grammarAccess.getML2ModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleML2Model"


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
    // InternalML2.g:339:1: ruleEntityDeclaration returns [EObject current=null] : (this_ML2Class_0= ruleML2Class | this_Individual_1= ruleIndividual ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ML2Class_0 = null;

        EObject this_Individual_1 = null;



        	enterRule();

        try {
            // InternalML2.g:345:2: ( (this_ML2Class_0= ruleML2Class | this_Individual_1= ruleIndividual ) )
            // InternalML2.g:346:2: (this_ML2Class_0= ruleML2Class | this_Individual_1= ruleIndividual )
            {
            // InternalML2.g:346:2: (this_ML2Class_0= ruleML2Class | this_Individual_1= ruleIndividual )
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
                    // InternalML2.g:347:3: this_ML2Class_0= ruleML2Class
                    {

                    			newCompositeNode(grammarAccess.getEntityDeclarationAccess().getML2ClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ML2Class_0=ruleML2Class();

                    state._fsp--;


                    			current = this_ML2Class_0;
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
            				

            					newCompositeNode(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_3_0());
            				
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
            	    					

            	    						newCompositeNode(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_4_1_0());
            	    					
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

                        if ( (LA7_0==RULE_ID||LA7_0==35||LA7_0==40) ) {
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


    // $ANTLR start "entryRuleML2Class"
    // InternalML2.g:480:1: entryRuleML2Class returns [EObject current=null] : iv_ruleML2Class= ruleML2Class EOF ;
    public final EObject entryRuleML2Class() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleML2Class = null;


        try {
            // InternalML2.g:480:49: (iv_ruleML2Class= ruleML2Class EOF )
            // InternalML2.g:481:2: iv_ruleML2Class= ruleML2Class EOF
            {
             newCompositeNode(grammarAccess.getML2ClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleML2Class=ruleML2Class();

            state._fsp--;

             current =iv_ruleML2Class; 
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
    // $ANTLR end "entryRuleML2Class"


    // $ANTLR start "ruleML2Class"
    // InternalML2.g:487:1: ruleML2Class returns [EObject current=null] : ( (this_SomeFOClass_0= ruleSomeFOClass | this_NonFOClass_1= ruleNonFOClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleML2Class() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_SomeFOClass_0 = null;

        EObject this_NonFOClass_1 = null;

        EObject lv_assignments_3_0 = null;

        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalML2.g:493:2: ( ( (this_SomeFOClass_0= ruleSomeFOClass | this_NonFOClass_1= ruleNonFOClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? ) )
            // InternalML2.g:494:2: ( (this_SomeFOClass_0= ruleSomeFOClass | this_NonFOClass_1= ruleNonFOClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? )
            {
            // InternalML2.g:494:2: ( (this_SomeFOClass_0= ruleSomeFOClass | this_NonFOClass_1= ruleNonFOClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )? )
            // InternalML2.g:495:3: (this_SomeFOClass_0= ruleSomeFOClass | this_NonFOClass_1= ruleNonFOClass ) (otherlv_2= '{' ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )* otherlv_5= '}' )?
            {
            // InternalML2.g:495:3: (this_SomeFOClass_0= ruleSomeFOClass | this_NonFOClass_1= ruleNonFOClass )
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
                    // InternalML2.g:496:4: this_SomeFOClass_0= ruleSomeFOClass
                    {

                    				newCompositeNode(grammarAccess.getML2ClassAccess().getSomeFOClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_SomeFOClass_0=ruleSomeFOClass();

                    state._fsp--;


                    				current = this_SomeFOClass_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalML2.g:505:4: this_NonFOClass_1= ruleNonFOClass
                    {

                    				newCompositeNode(grammarAccess.getML2ClassAccess().getNonFOClassParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_NonFOClass_1=ruleNonFOClass();

                    state._fsp--;


                    				current = this_NonFOClass_1;
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

                    				newLeafNode(otherlv_2, grammarAccess.getML2ClassAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalML2.g:519:4: ( ( (lv_assignments_3_0= ruleFeatureAssignment ) ) | ( (lv_features_4_0= ruleFeature ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        switch ( input.LA(1) ) {
                        case 35:
                            {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==RULE_ID) ) {
                                int LA10_3 = input.LA(3);

                                if ( (LA10_3==16||LA10_3==44) ) {
                                    alt10=1;
                                }
                                else if ( (LA10_3==20) ) {
                                    alt10=2;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA10_3 = input.LA(2);

                            if ( (LA10_3==16||LA10_3==44) ) {
                                alt10=1;
                            }
                            else if ( (LA10_3==20) ) {
                                alt10=2;
                            }


                            }
                            break;
                        case 40:
                            {
                            int LA10_4 = input.LA(2);

                            if ( (LA10_4==RULE_ID) ) {
                                int LA10_7 = input.LA(3);

                                if ( (LA10_7==16||LA10_7==44) ) {
                                    alt10=1;
                                }
                                else if ( (LA10_7==20) ) {
                                    alt10=2;
                                }


                            }


                            }
                            break;
                        case 42:
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

                    	    							newCompositeNode(grammarAccess.getML2ClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_assignments_3_0=ruleFeatureAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getML2ClassRule());
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

                    	    							newCompositeNode(grammarAccess.getML2ClassAccess().getFeaturesFeatureParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_features_4_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getML2ClassRule());
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

                    				newLeafNode(otherlv_5, grammarAccess.getML2ClassAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleML2Class"


    // $ANTLR start "entryRuleSomeFOClass"
    // InternalML2.g:569:1: entryRuleSomeFOClass returns [EObject current=null] : iv_ruleSomeFOClass= ruleSomeFOClass EOF ;
    public final EObject entryRuleSomeFOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeFOClass = null;


        try {
            // InternalML2.g:569:52: (iv_ruleSomeFOClass= ruleSomeFOClass EOF )
            // InternalML2.g:570:2: iv_ruleSomeFOClass= ruleSomeFOClass EOF
            {
             newCompositeNode(grammarAccess.getSomeFOClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSomeFOClass=ruleSomeFOClass();

            state._fsp--;

             current =iv_ruleSomeFOClass; 
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
    // $ANTLR end "entryRuleSomeFOClass"


    // $ANTLR start "ruleSomeFOClass"
    // InternalML2.g:576:1: ruleSomeFOClass returns [EObject current=null] : ( (this_FOClass_0= ruleFOClass | this_DataType_1= ruleDataType ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleSomeFOClass() throws RecognitionException {
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

                    				newCompositeNode(grammarAccess.getSomeFOClassAccess().getFOClassParserRuleCall_0_0());
                    			
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

                    				newCompositeNode(grammarAccess.getSomeFOClassAccess().getDataTypeParserRuleCall_0_1());
                    			
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

                    				newLeafNode(otherlv_2, grammarAccess.getSomeFOClassAccess().getColonKeyword_1_0());
                    			
                    // InternalML2.g:608:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:609:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:609:5: ( ruleQualifiedName )
                    // InternalML2.g:610:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSomeFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0());
                    					
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

                    	    					newLeafNode(otherlv_4, grammarAccess.getSomeFOClassAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalML2.g:629:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:630:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:630:6: ( ruleQualifiedName )
                    	    // InternalML2.g:631:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSomeFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0());
                    	    						
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

                    				newLeafNode(otherlv_6, grammarAccess.getSomeFOClassAccess().getSpecializesKeyword_2_0());
                    			
                    // InternalML2.g:652:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:653:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:653:5: ( ruleQualifiedName )
                    // InternalML2.g:654:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSomeFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0());
                    					
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

                    	    					newLeafNode(otherlv_8, grammarAccess.getSomeFOClassAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalML2.g:673:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:674:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:674:6: ( ruleQualifiedName )
                    	    // InternalML2.g:675:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSomeFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0());
                    	    						
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
    // $ANTLR end "ruleSomeFOClass"


    // $ANTLR start "entryRuleNonFOClass"
    // InternalML2.g:695:1: entryRuleNonFOClass returns [EObject current=null] : iv_ruleNonFOClass= ruleNonFOClass EOF ;
    public final EObject entryRuleNonFOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFOClass = null;


        try {
            // InternalML2.g:695:51: (iv_ruleNonFOClass= ruleNonFOClass EOF )
            // InternalML2.g:696:2: iv_ruleNonFOClass= ruleNonFOClass EOF
            {
             newCompositeNode(grammarAccess.getNonFOClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFOClass=ruleNonFOClass();

            state._fsp--;

             current =iv_ruleNonFOClass; 
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
    // $ANTLR end "entryRuleNonFOClass"


    // $ANTLR start "ruleNonFOClass"
    // InternalML2.g:702:1: ruleNonFOClass returns [EObject current=null] : ( (this_HOClass_0= ruleHOClass | this_OrderlessClass_1= ruleOrderlessClass ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_6= 'specializes' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_10= 'subordinatedTo' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ( ( ( (lv_categorizationType_14_0= ruleCategorizationType ) ) ( ( ruleQualifiedName ) ) ) | (otherlv_16= 'isPowertypeOf' ( ( ruleQualifiedName ) ) ) )? ) ;
    public final EObject ruleNonFOClass() throws RecognitionException {
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

                    				newCompositeNode(grammarAccess.getNonFOClassAccess().getHOClassParserRuleCall_0_0());
                    			
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

                    				newCompositeNode(grammarAccess.getNonFOClassAccess().getOrderlessClassParserRuleCall_0_1());
                    			
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

                    				newLeafNode(otherlv_2, grammarAccess.getNonFOClassAccess().getColonKeyword_1_0());
                    			
                    // InternalML2.g:734:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:735:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:735:5: ( ruleQualifiedName )
                    // InternalML2.g:736:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0());
                    					
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

                    	    					newLeafNode(otherlv_4, grammarAccess.getNonFOClassAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalML2.g:755:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:756:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:756:6: ( ruleQualifiedName )
                    	    // InternalML2.g:757:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNonFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0());
                    	    						
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

                    				newLeafNode(otherlv_6, grammarAccess.getNonFOClassAccess().getSpecializesKeyword_2_0());
                    			
                    // InternalML2.g:778:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:779:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:779:5: ( ruleQualifiedName )
                    // InternalML2.g:780:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0());
                    					
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

                    	    					newLeafNode(otherlv_8, grammarAccess.getNonFOClassAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalML2.g:799:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:800:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:800:6: ( ruleQualifiedName )
                    	    // InternalML2.g:801:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNonFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0());
                    	    						
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

                    				newLeafNode(otherlv_10, grammarAccess.getNonFOClassAccess().getSubordinatedToKeyword_3_0());
                    			
                    // InternalML2.g:822:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:823:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:823:5: ( ruleQualifiedName )
                    // InternalML2.g:824:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFOClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_1_0());
                    					
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

                    	    					newLeafNode(otherlv_12, grammarAccess.getNonFOClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalML2.g:843:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:844:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:844:6: ( ruleQualifiedName )
                    	    // InternalML2.g:845:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNonFOClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_2_1_0());
                    	    						
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

            if ( ((LA24_0>=48 && LA24_0<=51)) ) {
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

                    							newCompositeNode(grammarAccess.getNonFOClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_4_0_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_categorizationType_14_0=ruleCategorizationType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNonFOClassRule());
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
                    								current = createModelElement(grammarAccess.getNonFOClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFOClassAccess().getCategorizedClassML2ClassCrossReference_4_0_1_0());
                    						
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

                    					newLeafNode(otherlv_16, grammarAccess.getNonFOClassAccess().getIsPowertypeOfKeyword_4_1_0());
                    				
                    // InternalML2.g:905:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:906:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:906:6: ( ruleQualifiedName )
                    // InternalML2.g:907:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFOClassRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFOClassAccess().getPowertypeOfML2ClassCrossReference_4_1_1_0());
                    						
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
    // $ANTLR end "ruleNonFOClass"


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
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralML2ClassCrossReference_4_0());
            				
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
                    					

                    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCategorizerML2ClassCrossReference_5_1_0());
                    					
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
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_7_0());
            				
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
            	    					

            	    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_8_1_0());
            	    					
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

            if ( (LA29_0==RULE_ID||LA29_0==35||LA29_0==40) ) {
                alt29=1;
            }
            else if ( (LA29_0==42) ) {
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
            else if ( (LA30_0==40) ) {
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

            if ( (LA31_0==42) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==40) ) {
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
    // InternalML2.g:1417:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( (lv_primitiveType_8_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_lowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_6_0 = null;

        Enumerator lv_primitiveType_8_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1423:2: ( ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( (lv_primitiveType_8_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? ) )
            // InternalML2.g:1424:2: ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( (lv_primitiveType_8_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? )
            {
            // InternalML2.g:1424:2: ( (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( (lv_primitiveType_8_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? )
            // InternalML2.g:1425:3: (otherlv_0= 'att' )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( (lv_primitiveType_8_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
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
            		
            // InternalML2.g:1453:3: (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalML2.g:1454:4: otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalML2.g:1458:4: ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:1459:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:1459:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    // InternalML2.g:1460:6: lv_lowerBound_4_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_lowerBound_4_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_4_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalML2.g:1481:4: ( (lv_upperBound_6_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:1482:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:1482:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    // InternalML2.g:1483:6: lv_upperBound_6_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_upperBound_6_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_6_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,38,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalML2.g:1505:3: ( ( (lv_primitiveType_8_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=52 && LA34_0<=54)) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalML2.g:1506:4: ( (lv_primitiveType_8_0= rulePrimitiveType ) )
                    {
                    // InternalML2.g:1506:4: ( (lv_primitiveType_8_0= rulePrimitiveType ) )
                    // InternalML2.g:1507:5: (lv_primitiveType_8_0= rulePrimitiveType )
                    {
                    // InternalML2.g:1507:5: (lv_primitiveType_8_0= rulePrimitiveType )
                    // InternalML2.g:1508:6: lv_primitiveType_8_0= rulePrimitiveType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_primitiveType_8_0=rulePrimitiveType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"primitiveType",
                    							lv_primitiveType_8_0,
                    							"br.ufes.inf.nemo.ml2.ML2.PrimitiveType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1526:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1526:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1527:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1527:5: ( ruleQualifiedName )
                    // InternalML2.g:1528:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1543:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalML2.g:1544:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0());
                    			
                    // InternalML2.g:1548:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1549:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1549:5: ( ruleQualifiedName )
                    // InternalML2.g:1550:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1564:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==21) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalML2.g:1565:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalML2.g:1569:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1570:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1570:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1571:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
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
    // InternalML2.g:1591:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalML2.g:1591:50: (iv_ruleReference= ruleReference EOF )
            // InternalML2.g:1592:2: iv_ruleReference= ruleReference EOF
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
    // InternalML2.g:1598:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_lowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_6_0 = null;



        	enterRule();

        try {
            // InternalML2.g:1604:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ) )
            // InternalML2.g:1605:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalML2.g:1605:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? )
            // InternalML2.g:1606:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )? ( ( ruleQualifiedName ) ) (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalML2.g:1610:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalML2.g:1611:4: (lv_name_1_0= RULE_ID )
            {
            // InternalML2.g:1611:4: (lv_name_1_0= RULE_ID )
            // InternalML2.g:1612:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
            		
            // InternalML2.g:1632:3: (otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalML2.g:1633:4: otherlv_3= '[' ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) ) otherlv_5= '..' ( (lv_upperBound_6_0= ruleELEMENTBOUND ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalML2.g:1637:4: ( (lv_lowerBound_4_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:1638:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:1638:5: (lv_lowerBound_4_0= ruleELEMENTBOUND )
                    // InternalML2.g:1639:6: lv_lowerBound_4_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_lowerBound_4_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_4_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2());
                    			
                    // InternalML2.g:1660:4: ( (lv_upperBound_6_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:1661:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:1661:5: (lv_upperBound_6_0= ruleELEMENTBOUND )
                    // InternalML2.g:1662:6: lv_upperBound_6_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_upperBound_6_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_6_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalML2.g:1684:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1685:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1685:4: ( ruleQualifiedName )
            // InternalML2.g:1686:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().get_typeML2ClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:1700:3: (otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalML2.g:1701:4: otherlv_9= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0());
                    			
                    // InternalML2.g:1705:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1706:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1706:5: ( ruleQualifiedName )
                    // InternalML2.g:1707:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1721:4: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalML2.g:1722:5: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalML2.g:1726:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1727:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1727:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1728:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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

            // InternalML2.g:1744:3: (otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalML2.g:1745:4: otherlv_13= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_13=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getReferenceAccess().getIsOppositeToKeyword_6_0());
                    			
                    // InternalML2.g:1749:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1750:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1750:5: ( ruleQualifiedName )
                    // InternalML2.g:1751:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0());
                    					
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
    // InternalML2.g:1770:1: entryRuleRegularityAttribute returns [EObject current=null] : iv_ruleRegularityAttribute= ruleRegularityAttribute EOF ;
    public final EObject entryRuleRegularityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityAttribute = null;


        try {
            // InternalML2.g:1770:60: (iv_ruleRegularityAttribute= ruleRegularityAttribute EOF )
            // InternalML2.g:1771:2: iv_ruleRegularityAttribute= ruleRegularityAttribute EOF
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
    // InternalML2.g:1777:1: ruleRegularityAttribute returns [EObject current=null] : (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
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
            // InternalML2.g:1783:2: ( (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:1784:2: (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:1784:2: (otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:1785:3: otherlv_0= 'regularity' (otherlv_1= 'att' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_regularityType_15_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0());
            		
            // InternalML2.g:1789:3: (otherlv_1= 'att' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalML2.g:1790:4: otherlv_1= 'att'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRegularityAttributeAccess().getAttKeyword_1());
                    			

                    }
                    break;

            }

            // InternalML2.g:1795:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:1796:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:1796:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:1797:5: lv_name_2_0= RULE_ID
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
            		
            // InternalML2.g:1817:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:1818:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalML2.g:1822:4: ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:1823:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:1823:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    // InternalML2.g:1824:6: lv_lowerBound_5_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_lowerBound_5_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalML2.g:1845:4: ( (lv_upperBound_7_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:1846:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:1846:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    // InternalML2.g:1847:6: lv_upperBound_7_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_upperBound_7_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,38,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalML2.g:1869:3: ( ( (lv_primitiveType_9_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=52 && LA43_0<=54)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalML2.g:1870:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    {
                    // InternalML2.g:1870:4: ( (lv_primitiveType_9_0= rulePrimitiveType ) )
                    // InternalML2.g:1871:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    {
                    // InternalML2.g:1871:5: (lv_primitiveType_9_0= rulePrimitiveType )
                    // InternalML2.g:1872:6: lv_primitiveType_9_0= rulePrimitiveType
                    {

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_39);
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
                    // InternalML2.g:1890:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:1890:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1891:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1891:5: ( ruleQualifiedName )
                    // InternalML2.g:1892:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:1907:3: (otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalML2.g:1908:4: otherlv_11= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalML2.g:1912:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:1913:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:1913:5: ( ruleQualifiedName )
                    // InternalML2.g:1914:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:1928:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalML2.g:1929:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalML2.g:1933:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:1934:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:1934:6: ( ruleQualifiedName )
                    	    // InternalML2.g:1935:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityAttributeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:1951:3: ( (lv_regularityType_15_0= ruleRegularityFeatureType ) )
            // InternalML2.g:1952:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:1952:4: (lv_regularityType_15_0= ruleRegularityFeatureType )
            // InternalML2.g:1953:5: lv_regularityType_15_0= ruleRegularityFeatureType
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

            // InternalML2.g:1970:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:1971:4: ( ruleQualifiedName )
            {
            // InternalML2.g:1971:4: ( ruleQualifiedName )
            // InternalML2.g:1972:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureCrossReference_8_0());
            				
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
    // InternalML2.g:1990:1: entryRuleRegularityReference returns [EObject current=null] : iv_ruleRegularityReference= ruleRegularityReference EOF ;
    public final EObject entryRuleRegularityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularityReference = null;


        try {
            // InternalML2.g:1990:60: (iv_ruleRegularityReference= ruleRegularityReference EOF )
            // InternalML2.g:1991:2: iv_ruleRegularityReference= ruleRegularityReference EOF
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
    // InternalML2.g:1997:1: ruleRegularityReference returns [EObject current=null] : (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) ;
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
            // InternalML2.g:2003:2: ( (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalML2.g:2004:2: (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalML2.g:2004:2: (otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) ) )
            // InternalML2.g:2005:3: otherlv_0= 'regularity' otherlv_1= 'ref' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )? ( ( ruleQualifiedName ) ) (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )? ( (lv_regularityType_16_0= ruleRegularityFeatureType ) ) ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularityReferenceAccess().getRefKeyword_1());
            		
            // InternalML2.g:2013:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalML2.g:2014:4: (lv_name_2_0= RULE_ID )
            {
            // InternalML2.g:2014:4: (lv_name_2_0= RULE_ID )
            // InternalML2.g:2015:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularityReferenceAccess().getColonKeyword_3());
            		
            // InternalML2.g:2035:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalML2.g:2036:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleELEMENTBOUND ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalML2.g:2040:4: ( (lv_lowerBound_5_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:2041:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:2041:5: (lv_lowerBound_5_0= ruleELEMENTBOUND )
                    // InternalML2.g:2042:6: lv_lowerBound_5_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_lowerBound_5_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2());
                    			
                    // InternalML2.g:2063:4: ( (lv_upperBound_7_0= ruleELEMENTBOUND ) )
                    // InternalML2.g:2064:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    {
                    // InternalML2.g:2064:5: (lv_upperBound_7_0= ruleELEMENTBOUND )
                    // InternalML2.g:2065:6: lv_upperBound_7_0= ruleELEMENTBOUND
                    {

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_upperBound_7_0=ruleELEMENTBOUND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularityReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"br.ufes.inf.nemo.ml2.ML2.ELEMENTBOUND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalML2.g:2087:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2088:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2088:4: ( ruleQualifiedName )
            // InternalML2.g:2089:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().get_typeML2ClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalML2.g:2103:3: (otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalML2.g:2104:4: otherlv_10= 'subsets' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0());
                    			
                    // InternalML2.g:2108:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2109:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2109:5: ( ruleQualifiedName )
                    // InternalML2.g:2110:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalML2.g:2124:4: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==21) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalML2.g:2125:5: otherlv_12= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalML2.g:2129:5: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2130:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2130:6: ( ruleQualifiedName )
                    	    // InternalML2.g:2131:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalML2.g:2147:3: (otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalML2.g:2148:4: otherlv_14= 'isOppositeTo' ( ( ruleQualifiedName ) )
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0());
                    			
                    // InternalML2.g:2152:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2153:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2153:5: ( ruleQualifiedName )
                    // InternalML2.g:2154:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularityReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalML2.g:2169:3: ( (lv_regularityType_16_0= ruleRegularityFeatureType ) )
            // InternalML2.g:2170:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            {
            // InternalML2.g:2170:4: (lv_regularityType_16_0= ruleRegularityFeatureType )
            // InternalML2.g:2171:5: lv_regularityType_16_0= ruleRegularityFeatureType
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

            // InternalML2.g:2188:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2189:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2189:4: ( ruleQualifiedName )
            // InternalML2.g:2190:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularityReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureCrossReference_9_0());
            				
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


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalML2.g:2208:1: entryRuleELEMENTBOUND returns [String current=null] : iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF ;
    public final String entryRuleELEMENTBOUND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELEMENTBOUND = null;


        try {
            // InternalML2.g:2208:52: (iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF )
            // InternalML2.g:2209:2: iv_ruleELEMENTBOUND= ruleELEMENTBOUND EOF
            {
             newCompositeNode(grammarAccess.getELEMENTBOUNDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELEMENTBOUND=ruleELEMENTBOUND();

            state._fsp--;

             current =iv_ruleELEMENTBOUND.getText(); 
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
    // $ANTLR end "entryRuleELEMENTBOUND"


    // $ANTLR start "ruleELEMENTBOUND"
    // InternalML2.g:2215:1: ruleELEMENTBOUND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELEMENTBOUND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalML2.g:2221:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalML2.g:2222:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalML2.g:2222:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_INT) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalML2.g:2223:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2229:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getELEMENTBOUNDAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleELEMENTBOUND"


    // $ANTLR start "entryRuleFeatureAssignment"
    // InternalML2.g:2240:1: entryRuleFeatureAssignment returns [EObject current=null] : iv_ruleFeatureAssignment= ruleFeatureAssignment EOF ;
    public final EObject entryRuleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureAssignment = null;


        try {
            // InternalML2.g:2240:58: (iv_ruleFeatureAssignment= ruleFeatureAssignment EOF )
            // InternalML2.g:2241:2: iv_ruleFeatureAssignment= ruleFeatureAssignment EOF
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
    // InternalML2.g:2247:1: ruleFeatureAssignment returns [EObject current=null] : (this_SingleAttributeAssignment_0= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_1= ruleMultipleAttributeAssignment | this_ReferenceAssignment_2= ruleReferenceAssignment ) ;
    public final EObject ruleFeatureAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_SingleAttributeAssignment_0 = null;

        EObject this_MultipleAttributeAssignment_1 = null;

        EObject this_ReferenceAssignment_2 = null;



        	enterRule();

        try {
            // InternalML2.g:2253:2: ( (this_SingleAttributeAssignment_0= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_1= ruleMultipleAttributeAssignment | this_ReferenceAssignment_2= ruleReferenceAssignment ) )
            // InternalML2.g:2254:2: (this_SingleAttributeAssignment_0= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_1= ruleMultipleAttributeAssignment | this_ReferenceAssignment_2= ruleReferenceAssignment )
            {
            // InternalML2.g:2254:2: (this_SingleAttributeAssignment_0= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_1= ruleMultipleAttributeAssignment | this_ReferenceAssignment_2= ruleReferenceAssignment )
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalML2.g:2255:3: this_SingleAttributeAssignment_0= ruleSingleAttributeAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleAttributeAssignment_0=ruleSingleAttributeAssignment();

                    state._fsp--;


                    			current = this_SingleAttributeAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2264:3: this_MultipleAttributeAssignment_1= ruleMultipleAttributeAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getMultipleAttributeAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleAttributeAssignment_1=ruleMultipleAttributeAssignment();

                    state._fsp--;


                    			current = this_MultipleAttributeAssignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalML2.g:2273:3: this_ReferenceAssignment_2= ruleReferenceAssignment
                    {

                    			newCompositeNode(grammarAccess.getFeatureAssignmentAccess().getReferenceAssignmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceAssignment_2=ruleReferenceAssignment();

                    state._fsp--;


                    			current = this_ReferenceAssignment_2;
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
    // InternalML2.g:2285:1: entryRuleSingleAttributeAssignment returns [EObject current=null] : iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF ;
    public final EObject entryRuleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAttributeAssignment = null;


        try {
            // InternalML2.g:2285:66: (iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF )
            // InternalML2.g:2286:2: iv_ruleSingleAttributeAssignment= ruleSingleAttributeAssignment EOF
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
    // InternalML2.g:2292:1: ruleSingleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_5_0= ruleLiteral ) ) ) ) ;
    public final EObject ruleSingleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_unnamedIndividualAssignments_4_0 = null;

        EObject lv_literalAssignments_5_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2298:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_5_0= ruleLiteral ) ) ) ) )
            // InternalML2.g:2299:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_5_0= ruleLiteral ) ) ) )
            {
            // InternalML2.g:2299:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_5_0= ruleLiteral ) ) ) )
            // InternalML2.g:2300:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_5_0= ruleLiteral ) ) )
            {
            // InternalML2.g:2300:3: (otherlv_0= 'att' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==35) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalML2.g:2301:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0());
                    			

                    }
                    break;

            }

            // InternalML2.g:2306:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2307:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2307:4: ( ruleQualifiedName )
            // InternalML2.g:2308:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalML2.g:2326:3: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_5_0= ruleLiteral ) ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt53=1;
                }
                break;
            case 36:
                {
                alt53=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalML2.g:2327:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2327:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2328:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2328:5: ( ruleQualifiedName )
                    // InternalML2.g:2329:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleAttributeAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2344:4: ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:2344:4: ( (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:2345:5: (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:2345:5: (lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual )
                    // InternalML2.g:2346:6: lv_unnamedIndividualAssignments_4_0= ruleUnnamedIndividual
                    {

                    						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unnamedIndividualAssignments_4_0=ruleUnnamedIndividual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleAttributeAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"unnamedIndividualAssignments",
                    							lv_unnamedIndividualAssignments_4_0,
                    							"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:2364:4: ( (lv_literalAssignments_5_0= ruleLiteral ) )
                    {
                    // InternalML2.g:2364:4: ( (lv_literalAssignments_5_0= ruleLiteral ) )
                    // InternalML2.g:2365:5: (lv_literalAssignments_5_0= ruleLiteral )
                    {
                    // InternalML2.g:2365:5: (lv_literalAssignments_5_0= ruleLiteral )
                    // InternalML2.g:2366:6: lv_literalAssignments_5_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literalAssignments_5_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleAttributeAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"literalAssignments",
                    							lv_literalAssignments_5_0,
                    							"br.ufes.inf.nemo.ml2.ML2.Literal");
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
    // InternalML2.g:2388:1: entryRuleMultipleAttributeAssignment returns [EObject current=null] : iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF ;
    public final EObject entryRuleMultipleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleAttributeAssignment = null;


        try {
            // InternalML2.g:2388:68: (iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF )
            // InternalML2.g:2389:2: iv_ruleMultipleAttributeAssignment= ruleMultipleAttributeAssignment EOF
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
    // InternalML2.g:2395:1: ruleMultipleAttributeAssignment returns [EObject current=null] : ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_12= '}' ) ;
    public final EObject ruleMultipleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_literalAssignments_4_0 = null;

        EObject lv_literalAssignments_6_0 = null;

        EObject lv_unnamedIndividualAssignments_8_0 = null;

        EObject lv_unnamedIndividualAssignments_11_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2401:2: ( ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_12= '}' ) )
            // InternalML2.g:2402:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_12= '}' )
            {
            // InternalML2.g:2402:2: ( (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_12= '}' )
            // InternalML2.g:2403:3: (otherlv_0= 'att' )? ( ( ruleQualifiedName ) ) otherlv_2= '=' otherlv_3= '{' ( ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_12= '}'
            {
            // InternalML2.g:2403:3: (otherlv_0= 'att' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==35) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalML2.g:2404:4: otherlv_0= 'att'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0());
                    			

                    }
                    break;

            }

            // InternalML2.g:2409:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2410:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2410:4: ( ruleQualifiedName )
            // InternalML2.g:2411:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMultipleAttributeAssignmentAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getMultipleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalML2.g:2433:3: ( ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* ) )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_INT && LA59_0<=RULE_STRING)||(LA59_0>=45 && LA59_0<=47)) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID||LA59_0==36) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // InternalML2.g:2434:4: ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* )
                    {
                    // InternalML2.g:2434:4: ( ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )* )
                    // InternalML2.g:2435:5: ( (lv_literalAssignments_4_0= ruleLiteral ) ) (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )*
                    {
                    // InternalML2.g:2435:5: ( (lv_literalAssignments_4_0= ruleLiteral ) )
                    // InternalML2.g:2436:6: (lv_literalAssignments_4_0= ruleLiteral )
                    {
                    // InternalML2.g:2436:6: (lv_literalAssignments_4_0= ruleLiteral )
                    // InternalML2.g:2437:7: lv_literalAssignments_4_0= ruleLiteral
                    {

                    							newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_4_0_0_0());
                    						
                    pushFollow(FOLLOW_47);
                    lv_literalAssignments_4_0=ruleLiteral();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                    							}
                    							add(
                    								current,
                    								"literalAssignments",
                    								lv_literalAssignments_4_0,
                    								"br.ufes.inf.nemo.ml2.ML2.Literal");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalML2.g:2454:5: (otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==21) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalML2.g:2455:6: otherlv_5= ',' ( (lv_literalAssignments_6_0= ruleLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_45); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_0_1_0());
                    	    					
                    	    // InternalML2.g:2459:6: ( (lv_literalAssignments_6_0= ruleLiteral ) )
                    	    // InternalML2.g:2460:7: (lv_literalAssignments_6_0= ruleLiteral )
                    	    {
                    	    // InternalML2.g:2460:7: (lv_literalAssignments_6_0= ruleLiteral )
                    	    // InternalML2.g:2461:8: lv_literalAssignments_6_0= ruleLiteral
                    	    {

                    	    								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_4_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_47);
                    	    lv_literalAssignments_6_0=ruleLiteral();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"literalAssignments",
                    	    									lv_literalAssignments_6_0,
                    	    									"br.ufes.inf.nemo.ml2.ML2.Literal");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:2481:4: ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* )
                    {
                    // InternalML2.g:2481:4: ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )* )
                    // InternalML2.g:2482:5: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) ) (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )*
                    {
                    // InternalML2.g:2482:5: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) ) )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_ID) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==36) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalML2.g:2483:6: ( ( ruleQualifiedName ) )
                            {
                            // InternalML2.g:2483:6: ( ( ruleQualifiedName ) )
                            // InternalML2.g:2484:7: ( ruleQualifiedName )
                            {
                            // InternalML2.g:2484:7: ( ruleQualifiedName )
                            // InternalML2.g:2485:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_4_1_0_0_0());
                            							
                            pushFollow(FOLLOW_47);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalML2.g:2500:6: ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) )
                            {
                            // InternalML2.g:2500:6: ( (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual ) )
                            // InternalML2.g:2501:7: (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual )
                            {
                            // InternalML2.g:2501:7: (lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual )
                            // InternalML2.g:2502:8: lv_unnamedIndividualAssignments_8_0= ruleUnnamedIndividual
                            {

                            								newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_4_1_0_1_0());
                            							
                            pushFollow(FOLLOW_47);
                            lv_unnamedIndividualAssignments_8_0=ruleUnnamedIndividual();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                            								}
                            								add(
                            									current,
                            									"unnamedIndividualAssignments",
                            									lv_unnamedIndividualAssignments_8_0,
                            									"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalML2.g:2520:5: (otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==21) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalML2.g:2521:6: otherlv_9= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_35); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_1_0());
                    	    					
                    	    // InternalML2.g:2525:6: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) ) )
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==RULE_ID) ) {
                    	        alt57=1;
                    	    }
                    	    else if ( (LA57_0==36) ) {
                    	        alt57=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 57, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // InternalML2.g:2526:7: ( ( ruleQualifiedName ) )
                    	            {
                    	            // InternalML2.g:2526:7: ( ( ruleQualifiedName ) )
                    	            // InternalML2.g:2527:8: ( ruleQualifiedName )
                    	            {
                    	            // InternalML2.g:2527:8: ( ruleQualifiedName )
                    	            // InternalML2.g:2528:9: ruleQualifiedName
                    	            {

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getMultipleAttributeAssignmentRule());
                    	            									}
                    	            								

                    	            									newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_4_1_1_1_0_0());
                    	            								
                    	            pushFollow(FOLLOW_47);
                    	            ruleQualifiedName();

                    	            state._fsp--;


                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalML2.g:2543:7: ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) )
                    	            {
                    	            // InternalML2.g:2543:7: ( (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual ) )
                    	            // InternalML2.g:2544:8: (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual )
                    	            {
                    	            // InternalML2.g:2544:8: (lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual )
                    	            // InternalML2.g:2545:9: lv_unnamedIndividualAssignments_11_0= ruleUnnamedIndividual
                    	            {

                    	            									newCompositeNode(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_4_1_1_1_1_0());
                    	            								
                    	            pushFollow(FOLLOW_47);
                    	            lv_unnamedIndividualAssignments_11_0=ruleUnnamedIndividual();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getMultipleAttributeAssignmentRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"unnamedIndividualAssignments",
                    	            										lv_unnamedIndividualAssignments_11_0,
                    	            										"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMultipleAttributeAssignmentAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalML2.g:2574:1: entryRuleReferenceAssignment returns [EObject current=null] : iv_ruleReferenceAssignment= ruleReferenceAssignment EOF ;
    public final EObject entryRuleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceAssignment = null;


        try {
            // InternalML2.g:2574:60: (iv_ruleReferenceAssignment= ruleReferenceAssignment EOF )
            // InternalML2.g:2575:2: iv_ruleReferenceAssignment= ruleReferenceAssignment EOF
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
    // InternalML2.g:2581:1: ruleReferenceAssignment returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleReferenceAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalML2.g:2587:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) ) )
            // InternalML2.g:2588:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) )
            {
            // InternalML2.g:2588:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) ) )
            // InternalML2.g:2589:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0());
            		
            // InternalML2.g:2593:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2594:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2594:4: ( ruleQualifiedName )
            // InternalML2.g:2595:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalML2.g:2613:3: ( ( ( ruleQualifiedName ) ) | (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==12) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalML2.g:2614:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:2614:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2615:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2615:5: ( ruleQualifiedName )
                    // InternalML2.g:2616:6: ruleQualifiedName
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
                    // InternalML2.g:2631:4: (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' )
                    {
                    // InternalML2.g:2631:4: (otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}' )
                    // InternalML2.g:2632:5: otherlv_4= '{' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalML2.g:2636:5: ( ( ruleQualifiedName ) )
                    // InternalML2.g:2637:6: ( ruleQualifiedName )
                    {
                    // InternalML2.g:2637:6: ( ruleQualifiedName )
                    // InternalML2.g:2638:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0());
                    						
                    pushFollow(FOLLOW_47);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalML2.g:2652:5: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==21) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalML2.g:2653:6: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0());
                    	    					
                    	    // InternalML2.g:2657:6: ( ( ruleQualifiedName ) )
                    	    // InternalML2.g:2658:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalML2.g:2658:7: ( ruleQualifiedName )
                    	    // InternalML2.g:2659:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getReferenceAssignmentRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_47);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
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


    // $ANTLR start "entryRuleLiteral"
    // InternalML2.g:2684:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalML2.g:2684:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalML2.g:2685:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalML2.g:2691:1: ruleLiteral returns [EObject current=null] : (this_ML2String_0= ruleML2String | this_ML2Number_1= ruleML2Number | this_ML2Boolean_2= ruleML2Boolean ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_ML2String_0 = null;

        EObject this_ML2Number_1 = null;

        EObject this_ML2Boolean_2 = null;



        	enterRule();

        try {
            // InternalML2.g:2697:2: ( (this_ML2String_0= ruleML2String | this_ML2Number_1= ruleML2Number | this_ML2Boolean_2= ruleML2Boolean ) )
            // InternalML2.g:2698:2: (this_ML2String_0= ruleML2String | this_ML2Number_1= ruleML2Number | this_ML2Boolean_2= ruleML2Boolean )
            {
            // InternalML2.g:2698:2: (this_ML2String_0= ruleML2String | this_ML2Number_1= ruleML2Number | this_ML2Boolean_2= ruleML2Boolean )
            int alt62=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt62=1;
                }
                break;
            case RULE_INT:
            case 47:
                {
                alt62=2;
                }
                break;
            case 45:
            case 46:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalML2.g:2699:3: this_ML2String_0= ruleML2String
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getML2StringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ML2String_0=ruleML2String();

                    state._fsp--;


                    			current = this_ML2String_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2708:3: this_ML2Number_1= ruleML2Number
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getML2NumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ML2Number_1=ruleML2Number();

                    state._fsp--;


                    			current = this_ML2Number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalML2.g:2717:3: this_ML2Boolean_2= ruleML2Boolean
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getML2BooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ML2Boolean_2=ruleML2Boolean();

                    state._fsp--;


                    			current = this_ML2Boolean_2;
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


    // $ANTLR start "entryRuleML2String"
    // InternalML2.g:2729:1: entryRuleML2String returns [EObject current=null] : iv_ruleML2String= ruleML2String EOF ;
    public final EObject entryRuleML2String() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleML2String = null;


        try {
            // InternalML2.g:2729:50: (iv_ruleML2String= ruleML2String EOF )
            // InternalML2.g:2730:2: iv_ruleML2String= ruleML2String EOF
            {
             newCompositeNode(grammarAccess.getML2StringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleML2String=ruleML2String();

            state._fsp--;

             current =iv_ruleML2String; 
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
    // $ANTLR end "entryRuleML2String"


    // $ANTLR start "ruleML2String"
    // InternalML2.g:2736:1: ruleML2String returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleML2String() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalML2.g:2742:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalML2.g:2743:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalML2.g:2743:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalML2.g:2744:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalML2.g:2744:3: (lv_value_0_0= RULE_STRING )
            // InternalML2.g:2745:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getML2StringAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getML2StringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleML2String"


    // $ANTLR start "entryRuleML2Number"
    // InternalML2.g:2764:1: entryRuleML2Number returns [EObject current=null] : iv_ruleML2Number= ruleML2Number EOF ;
    public final EObject entryRuleML2Number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleML2Number = null;


        try {
            // InternalML2.g:2764:50: (iv_ruleML2Number= ruleML2Number EOF )
            // InternalML2.g:2765:2: iv_ruleML2Number= ruleML2Number EOF
            {
             newCompositeNode(grammarAccess.getML2NumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleML2Number=ruleML2Number();

            state._fsp--;

             current =iv_ruleML2Number; 
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
    // $ANTLR end "entryRuleML2Number"


    // $ANTLR start "ruleML2Number"
    // InternalML2.g:2771:1: ruleML2Number returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleML2Number() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2777:2: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalML2.g:2778:2: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalML2.g:2778:2: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalML2.g:2779:3: (lv_value_0_0= ruleNUMBER )
            {
            // InternalML2.g:2779:3: (lv_value_0_0= ruleNUMBER )
            // InternalML2.g:2780:4: lv_value_0_0= ruleNUMBER
            {

            				newCompositeNode(grammarAccess.getML2NumberAccess().getValueNUMBERParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getML2NumberRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"br.ufes.inf.nemo.ml2.ML2.NUMBER");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleML2Number"


    // $ANTLR start "entryRuleML2Boolean"
    // InternalML2.g:2800:1: entryRuleML2Boolean returns [EObject current=null] : iv_ruleML2Boolean= ruleML2Boolean EOF ;
    public final EObject entryRuleML2Boolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleML2Boolean = null;


        try {
            // InternalML2.g:2800:51: (iv_ruleML2Boolean= ruleML2Boolean EOF )
            // InternalML2.g:2801:2: iv_ruleML2Boolean= ruleML2Boolean EOF
            {
             newCompositeNode(grammarAccess.getML2BooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleML2Boolean=ruleML2Boolean();

            state._fsp--;

             current =iv_ruleML2Boolean; 
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
    // $ANTLR end "entryRuleML2Boolean"


    // $ANTLR start "ruleML2Boolean"
    // InternalML2.g:2807:1: ruleML2Boolean returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleML2Boolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2813:2: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // InternalML2.g:2814:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // InternalML2.g:2814:2: ( (lv_value_0_0= ruleBOOLEAN ) )
            // InternalML2.g:2815:3: (lv_value_0_0= ruleBOOLEAN )
            {
            // InternalML2.g:2815:3: (lv_value_0_0= ruleBOOLEAN )
            // InternalML2.g:2816:4: lv_value_0_0= ruleBOOLEAN
            {

            				newCompositeNode(grammarAccess.getML2BooleanAccess().getValueBOOLEANParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBOOLEAN();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getML2BooleanRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"br.ufes.inf.nemo.ml2.ML2.BOOLEAN");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleML2Boolean"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalML2.g:2836:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalML2.g:2836:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalML2.g:2837:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalML2.g:2843:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalML2.g:2849:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalML2.g:2850:2: (kw= 'true' | kw= 'false' )
            {
            // InternalML2.g:2850:2: (kw= 'true' | kw= 'false' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            else if ( (LA63_0==46) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalML2.g:2851:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalML2.g:2857:3: kw= 'false'
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
    // InternalML2.g:2866:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalML2.g:2866:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalML2.g:2867:2: iv_ruleNUMBER= ruleNUMBER EOF
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
    // InternalML2.g:2873:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalML2.g:2879:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalML2.g:2880:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalML2.g:2880:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalML2.g:2881:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalML2.g:2881:3: (kw= '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==47) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalML2.g:2882:4: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
            		
            // InternalML2.g:2895:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==16) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalML2.g:2896:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,16,FOLLOW_21); 

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
    // InternalML2.g:2913:1: entryRuleUnnamedIndividual returns [EObject current=null] : iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF ;
    public final EObject entryRuleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedIndividual = null;


        try {
            // InternalML2.g:2913:58: (iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF )
            // InternalML2.g:2914:2: iv_ruleUnnamedIndividual= ruleUnnamedIndividual EOF
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
    // InternalML2.g:2920:1: ruleUnnamedIndividual returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) ;
    public final EObject ruleUnnamedIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignments_2_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2926:2: ( ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' ) )
            // InternalML2.g:2927:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            {
            // InternalML2.g:2927:2: ( () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']' )
            // InternalML2.g:2928:3: () otherlv_1= '[' ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )* otherlv_3= ']'
            {
            // InternalML2.g:2928:3: ()
            // InternalML2.g:2929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnnamedIndividualAccess().getIndividualAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getUnnamedIndividualAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalML2.g:2939:3: ( (lv_assignments_2_0= ruleSimpleAttributeAssignment ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalML2.g:2940:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    {
            	    // InternalML2.g:2940:4: (lv_assignments_2_0= ruleSimpleAttributeAssignment )
            	    // InternalML2.g:2941:5: lv_assignments_2_0= ruleSimpleAttributeAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getUnnamedIndividualAccess().getAssignmentsSimpleAttributeAssignmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop66;
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
    // InternalML2.g:2966:1: entryRuleSimpleAttributeAssignment returns [EObject current=null] : iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF ;
    public final EObject entryRuleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttributeAssignment = null;


        try {
            // InternalML2.g:2966:66: (iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF )
            // InternalML2.g:2967:2: iv_ruleSimpleAttributeAssignment= ruleSimpleAttributeAssignment EOF
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
    // InternalML2.g:2973:1: ruleSimpleAttributeAssignment returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_4_0= ruleLiteral ) ) | (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' ) ) ) ;
    public final EObject ruleSimpleAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_unnamedIndividualAssignments_3_0 = null;

        EObject lv_literalAssignments_4_0 = null;

        EObject lv_literalAssignments_6_0 = null;

        EObject lv_literalAssignments_8_0 = null;

        EObject lv_unnamedIndividualAssignments_10_0 = null;

        EObject lv_unnamedIndividualAssignments_13_0 = null;



        	enterRule();

        try {
            // InternalML2.g:2979:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_4_0= ruleLiteral ) ) | (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' ) ) ) )
            // InternalML2.g:2980:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_4_0= ruleLiteral ) ) | (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' ) ) )
            {
            // InternalML2.g:2980:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_4_0= ruleLiteral ) ) | (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' ) ) )
            // InternalML2.g:2981:3: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_4_0= ruleLiteral ) ) | (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' ) )
            {
            // InternalML2.g:2981:3: ( ( ruleQualifiedName ) )
            // InternalML2.g:2982:4: ( ruleQualifiedName )
            {
            // InternalML2.g:2982:4: ( ruleQualifiedName )
            // InternalML2.g:2983:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAttributeAssignmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalML2.g:3001:3: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) ) | ( (lv_literalAssignments_4_0= ruleLiteral ) ) | (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt72=1;
                }
                break;
            case 36:
                {
                alt72=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
                {
                alt72=3;
                }
                break;
            case 12:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalML2.g:3002:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalML2.g:3002:4: ( ( ruleQualifiedName ) )
                    // InternalML2.g:3003:5: ( ruleQualifiedName )
                    {
                    // InternalML2.g:3003:5: ( ruleQualifiedName )
                    // InternalML2.g:3004:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleAttributeAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3019:4: ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) )
                    {
                    // InternalML2.g:3019:4: ( (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual ) )
                    // InternalML2.g:3020:5: (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual )
                    {
                    // InternalML2.g:3020:5: (lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual )
                    // InternalML2.g:3021:6: lv_unnamedIndividualAssignments_3_0= ruleUnnamedIndividual
                    {

                    						newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unnamedIndividualAssignments_3_0=ruleUnnamedIndividual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"unnamedIndividualAssignments",
                    							lv_unnamedIndividualAssignments_3_0,
                    							"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3039:4: ( (lv_literalAssignments_4_0= ruleLiteral ) )
                    {
                    // InternalML2.g:3039:4: ( (lv_literalAssignments_4_0= ruleLiteral ) )
                    // InternalML2.g:3040:5: (lv_literalAssignments_4_0= ruleLiteral )
                    {
                    // InternalML2.g:3040:5: (lv_literalAssignments_4_0= ruleLiteral )
                    // InternalML2.g:3041:6: lv_literalAssignments_4_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literalAssignments_4_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"literalAssignments",
                    							lv_literalAssignments_4_0,
                    							"br.ufes.inf.nemo.ml2.ML2.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3059:4: (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' )
                    {
                    // InternalML2.g:3059:4: (otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}' )
                    // InternalML2.g:3060:5: otherlv_5= '{' ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )? otherlv_14= '}'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_46); 

                    					newLeafNode(otherlv_5, grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_3_0());
                    				
                    // InternalML2.g:3064:5: ( ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* ) | ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* ) )?
                    int alt71=3;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=RULE_INT && LA71_0<=RULE_STRING)||(LA71_0>=45 && LA71_0<=47)) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==RULE_ID||LA71_0==36) ) {
                        alt71=2;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalML2.g:3065:6: ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* )
                            {
                            // InternalML2.g:3065:6: ( ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )* )
                            // InternalML2.g:3066:7: ( (lv_literalAssignments_6_0= ruleLiteral ) ) (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )*
                            {
                            // InternalML2.g:3066:7: ( (lv_literalAssignments_6_0= ruleLiteral ) )
                            // InternalML2.g:3067:8: (lv_literalAssignments_6_0= ruleLiteral )
                            {
                            // InternalML2.g:3067:8: (lv_literalAssignments_6_0= ruleLiteral )
                            // InternalML2.g:3068:9: lv_literalAssignments_6_0= ruleLiteral
                            {

                            									newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_3_1_0_0_0());
                            								
                            pushFollow(FOLLOW_47);
                            lv_literalAssignments_6_0=ruleLiteral();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                            									}
                            									add(
                            										current,
                            										"literalAssignments",
                            										lv_literalAssignments_6_0,
                            										"br.ufes.inf.nemo.ml2.ML2.Literal");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalML2.g:3085:7: (otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==21) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // InternalML2.g:3086:8: otherlv_7= ',' ( (lv_literalAssignments_8_0= ruleLiteral ) )
                            	    {
                            	    otherlv_7=(Token)match(input,21,FOLLOW_45); 

                            	    								newLeafNode(otherlv_7, grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_0_1_0());
                            	    							
                            	    // InternalML2.g:3090:8: ( (lv_literalAssignments_8_0= ruleLiteral ) )
                            	    // InternalML2.g:3091:9: (lv_literalAssignments_8_0= ruleLiteral )
                            	    {
                            	    // InternalML2.g:3091:9: (lv_literalAssignments_8_0= ruleLiteral )
                            	    // InternalML2.g:3092:10: lv_literalAssignments_8_0= ruleLiteral
                            	    {

                            	    										newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_3_1_0_1_1_0());
                            	    									
                            	    pushFollow(FOLLOW_47);
                            	    lv_literalAssignments_8_0=ruleLiteral();

                            	    state._fsp--;


                            	    										if (current==null) {
                            	    											current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                            	    										}
                            	    										add(
                            	    											current,
                            	    											"literalAssignments",
                            	    											lv_literalAssignments_8_0,
                            	    											"br.ufes.inf.nemo.ml2.ML2.Literal");
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


                            }
                            break;
                        case 2 :
                            // InternalML2.g:3112:6: ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* )
                            {
                            // InternalML2.g:3112:6: ( ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )* )
                            // InternalML2.g:3113:7: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) ) (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )*
                            {
                            // InternalML2.g:3113:7: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) ) )
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==RULE_ID) ) {
                                alt68=1;
                            }
                            else if ( (LA68_0==36) ) {
                                alt68=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 68, 0, input);

                                throw nvae;
                            }
                            switch (alt68) {
                                case 1 :
                                    // InternalML2.g:3114:8: ( ( ruleQualifiedName ) )
                                    {
                                    // InternalML2.g:3114:8: ( ( ruleQualifiedName ) )
                                    // InternalML2.g:3115:9: ( ruleQualifiedName )
                                    {
                                    // InternalML2.g:3115:9: ( ruleQualifiedName )
                                    // InternalML2.g:3116:10: ruleQualifiedName
                                    {

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getSimpleAttributeAssignmentRule());
                                    										}
                                    									

                                    										newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_3_1_1_0_0_0());
                                    									
                                    pushFollow(FOLLOW_47);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalML2.g:3131:8: ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) )
                                    {
                                    // InternalML2.g:3131:8: ( (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual ) )
                                    // InternalML2.g:3132:9: (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual )
                                    {
                                    // InternalML2.g:3132:9: (lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual )
                                    // InternalML2.g:3133:10: lv_unnamedIndividualAssignments_10_0= ruleUnnamedIndividual
                                    {

                                    										newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_3_1_1_0_1_0());
                                    									
                                    pushFollow(FOLLOW_47);
                                    lv_unnamedIndividualAssignments_10_0=ruleUnnamedIndividual();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                                    										}
                                    										add(
                                    											current,
                                    											"unnamedIndividualAssignments",
                                    											lv_unnamedIndividualAssignments_10_0,
                                    											"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalML2.g:3151:7: (otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==21) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // InternalML2.g:3152:8: otherlv_11= ',' ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) )
                            	    {
                            	    otherlv_11=(Token)match(input,21,FOLLOW_35); 

                            	    								newLeafNode(otherlv_11, grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_1_1_0());
                            	    							
                            	    // InternalML2.g:3156:8: ( ( ( ruleQualifiedName ) ) | ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) ) )
                            	    int alt69=2;
                            	    int LA69_0 = input.LA(1);

                            	    if ( (LA69_0==RULE_ID) ) {
                            	        alt69=1;
                            	    }
                            	    else if ( (LA69_0==36) ) {
                            	        alt69=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 69, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt69) {
                            	        case 1 :
                            	            // InternalML2.g:3157:9: ( ( ruleQualifiedName ) )
                            	            {
                            	            // InternalML2.g:3157:9: ( ( ruleQualifiedName ) )
                            	            // InternalML2.g:3158:10: ( ruleQualifiedName )
                            	            {
                            	            // InternalML2.g:3158:10: ( ruleQualifiedName )
                            	            // InternalML2.g:3159:11: ruleQualifiedName
                            	            {

                            	            											if (current==null) {
                            	            												current = createModelElement(grammarAccess.getSimpleAttributeAssignmentRule());
                            	            											}
                            	            										

                            	            											newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_3_1_1_1_1_0_0());
                            	            										
                            	            pushFollow(FOLLOW_47);
                            	            ruleQualifiedName();

                            	            state._fsp--;


                            	            											afterParserOrEnumRuleCall();
                            	            										

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalML2.g:3174:9: ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) )
                            	            {
                            	            // InternalML2.g:3174:9: ( (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual ) )
                            	            // InternalML2.g:3175:10: (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual )
                            	            {
                            	            // InternalML2.g:3175:10: (lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual )
                            	            // InternalML2.g:3176:11: lv_unnamedIndividualAssignments_13_0= ruleUnnamedIndividual
                            	            {

                            	            											newCompositeNode(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_3_1_1_1_1_1_0());
                            	            										
                            	            pushFollow(FOLLOW_47);
                            	            lv_unnamedIndividualAssignments_13_0=ruleUnnamedIndividual();

                            	            state._fsp--;


                            	            											if (current==null) {
                            	            												current = createModelElementForParent(grammarAccess.getSimpleAttributeAssignmentRule());
                            	            											}
                            	            											add(
                            	            												current,
                            	            												"unnamedIndividualAssignments",
                            	            												lv_unnamedIndividualAssignments_13_0,
                            	            												"br.ufes.inf.nemo.ml2.ML2.UnnamedIndividual");
                            	            											afterParserOrEnumRuleCall();
                            	            										

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop70;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_14, grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_3_2());
                    				

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
    // $ANTLR end "ruleSimpleAttributeAssignment"


    // $ANTLR start "ruleCategorizationType"
    // InternalML2.g:3207:1: ruleCategorizationType returns [Enumerator current=null] : ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) ;
    public final Enumerator ruleCategorizationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalML2.g:3213:2: ( ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) ) )
            // InternalML2.g:3214:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            {
            // InternalML2.g:3214:2: ( (enumLiteral_0= 'categorizes' ) | (enumLiteral_1= 'completeCategorizes' ) | (enumLiteral_2= 'disjointCategorizes' ) | (enumLiteral_3= 'partitions' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt73=1;
                }
                break;
            case 49:
                {
                alt73=2;
                }
                break;
            case 50:
                {
                alt73=3;
                }
                break;
            case 51:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalML2.g:3215:3: (enumLiteral_0= 'categorizes' )
                    {
                    // InternalML2.g:3215:3: (enumLiteral_0= 'categorizes' )
                    // InternalML2.g:3216:4: enumLiteral_0= 'categorizes'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3223:3: (enumLiteral_1= 'completeCategorizes' )
                    {
                    // InternalML2.g:3223:3: (enumLiteral_1= 'completeCategorizes' )
                    // InternalML2.g:3224:4: enumLiteral_1= 'completeCategorizes'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3231:3: (enumLiteral_2= 'disjointCategorizes' )
                    {
                    // InternalML2.g:3231:3: (enumLiteral_2= 'disjointCategorizes' )
                    // InternalML2.g:3232:4: enumLiteral_2= 'disjointCategorizes'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3239:3: (enumLiteral_3= 'partitions' )
                    {
                    // InternalML2.g:3239:3: (enumLiteral_3= 'partitions' )
                    // InternalML2.g:3240:4: enumLiteral_3= 'partitions'
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
    // InternalML2.g:3250:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalML2.g:3256:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) ) )
            // InternalML2.g:3257:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            {
            // InternalML2.g:3257:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt74=1;
                }
                break;
            case 53:
                {
                alt74=2;
                }
                break;
            case 54:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalML2.g:3258:3: (enumLiteral_0= 'String' )
                    {
                    // InternalML2.g:3258:3: (enumLiteral_0= 'String' )
                    // InternalML2.g:3259:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3266:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalML2.g:3266:3: (enumLiteral_1= 'Number' )
                    // InternalML2.g:3267:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3274:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalML2.g:3274:3: (enumLiteral_2= 'Boolean' )
                    // InternalML2.g:3275:4: enumLiteral_2= 'Boolean'
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
    // InternalML2.g:3285:1: ruleRegularityFeatureType returns [Enumerator current=null] : ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) ) ;
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
            // InternalML2.g:3291:2: ( ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) ) )
            // InternalML2.g:3292:2: ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) )
            {
            // InternalML2.g:3292:2: ( (enumLiteral_0= 'determinesValue' ) | (enumLiteral_1= 'determinesType' ) | (enumLiteral_2= 'determinesMinValue' ) | (enumLiteral_3= 'determinesAllowedValues' ) | (enumLiteral_4= 'determinesAllowedTypes' ) | (enumLiteral_5= 'determinesMaxValue' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt75=1;
                }
                break;
            case 56:
                {
                alt75=2;
                }
                break;
            case 57:
                {
                alt75=3;
                }
                break;
            case 58:
                {
                alt75=4;
                }
                break;
            case 59:
                {
                alt75=5;
                }
                break;
            case 60:
                {
                alt75=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalML2.g:3293:3: (enumLiteral_0= 'determinesValue' )
                    {
                    // InternalML2.g:3293:3: (enumLiteral_0= 'determinesValue' )
                    // InternalML2.g:3294:4: enumLiteral_0= 'determinesValue'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:3301:3: (enumLiteral_1= 'determinesType' )
                    {
                    // InternalML2.g:3301:3: (enumLiteral_1= 'determinesType' )
                    // InternalML2.g:3302:4: enumLiteral_1= 'determinesType'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:3309:3: (enumLiteral_2= 'determinesMinValue' )
                    {
                    // InternalML2.g:3309:3: (enumLiteral_2= 'determinesMinValue' )
                    // InternalML2.g:3310:4: enumLiteral_2= 'determinesMinValue'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:3317:3: (enumLiteral_3= 'determinesAllowedValues' )
                    {
                    // InternalML2.g:3317:3: (enumLiteral_3= 'determinesAllowedValues' )
                    // InternalML2.g:3318:4: enumLiteral_3= 'determinesAllowedValues'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:3325:3: (enumLiteral_4= 'determinesAllowedTypes' )
                    {
                    // InternalML2.g:3325:3: (enumLiteral_4= 'determinesAllowedTypes' )
                    // InternalML2.g:3326:4: enumLiteral_4= 'determinesAllowedTypes'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:3333:3: (enumLiteral_5= 'determinesMaxValue' )
                    {
                    // InternalML2.g:3333:3: (enumLiteral_5= 'determinesMaxValue' )
                    // InternalML2.g:3334:4: enumLiteral_5= 'determinesMaxValue'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); 

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


    protected DFA51 dfa51 = new DFA51(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\4\1\20\1\uffff\2\4\1\20\2\uffff";
    static final String dfa_3s = "\1\50\1\4\1\54\1\uffff\1\4\1\57\1\54\2\uffff";
    static final String dfa_4s = "\3\uffff\1\3\3\uffff\1\1\1\2";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\36\uffff\1\1\4\uffff\1\3",
            "\1\2",
            "\1\4\33\uffff\1\5",
            "",
            "\1\6",
            "\3\7\5\uffff\1\10\27\uffff\1\7\10\uffff\3\7",
            "\1\4\33\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2254:2: (this_SingleAttributeAssignment_0= ruleSingleAttributeAssignment | this_MultipleAttributeAssignment_1= ruleMultipleAttributeAssignment | this_ReferenceAssignment_2= ruleReferenceAssignment )";
        }
    }
 

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010800008010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000050800008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000F000001D00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000F000001E00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000F000001A00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000F000001200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0070001000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0070000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000200002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1F80008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1F80008000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1F80028000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1F80028000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000E01000000070L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000E01000008070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000E01000001070L});

}
