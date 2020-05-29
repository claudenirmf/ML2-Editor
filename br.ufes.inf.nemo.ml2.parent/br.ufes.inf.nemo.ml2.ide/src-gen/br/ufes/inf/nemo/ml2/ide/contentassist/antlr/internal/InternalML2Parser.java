package br.ufes.inf.nemo.ml2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.ufes.inf.nemo.ml2.services.ML2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalML2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'String'", "'Number'", "'Boolean'", "'determinesValue'", "'determinesType'", "'determinesMinValue'", "'determinesAllowedValues'", "'determinesAllowedTypes'", "'determinesMaxValue'", "'module'", "'{'", "'}'", "'include'", "';'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'specializes'", "'subordinatedTo'", "'isPowertypeOf'", "'class'", "'datatype'", "'order'", "'orderless'", "'genset'", "'general'", "'specifics'", "'categorizer'", "'att'", "'subsets'", "'ref'", "'isOppositeTo'", "'regularity'", "'='", "'disjoint'", "'complete'"
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

    	public void setGrammarAccess(ML2GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalML2.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalML2.g:54:1: ( ruleModel EOF )
            // InternalML2.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalML2.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalML2.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalML2.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalML2.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalML2.g:69:3: ( rule__Model__Group__0 )
            // InternalML2.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalML2.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalML2.g:79:1: ( ruleQualifiedName EOF )
            // InternalML2.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalML2.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalML2.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalML2.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalML2.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalML2.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalML2.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalML2.g:103:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalML2.g:104:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalML2.g:105:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalML2.g:112:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:116:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalML2.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalML2.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalML2.g:118:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalML2.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalML2.g:119:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalML2.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalML2.g:129:1: ( ruleImport EOF )
            // InternalML2.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalML2.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalML2.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalML2.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalML2.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalML2.g:144:3: ( rule__Import__Group__0 )
            // InternalML2.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModelElement"
    // InternalML2.g:153:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalML2.g:154:1: ( ruleModelElement EOF )
            // InternalML2.g:155:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalML2.g:162:1: ruleModelElement : ( ( rule__ModelElement__Group__0 ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:166:2: ( ( ( rule__ModelElement__Group__0 ) ) )
            // InternalML2.g:167:2: ( ( rule__ModelElement__Group__0 ) )
            {
            // InternalML2.g:167:2: ( ( rule__ModelElement__Group__0 ) )
            // InternalML2.g:168:3: ( rule__ModelElement__Group__0 )
            {
             before(grammarAccess.getModelElementAccess().getGroup()); 
            // InternalML2.g:169:3: ( rule__ModelElement__Group__0 )
            // InternalML2.g:169:4: rule__ModelElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleEntityDeclaration"
    // InternalML2.g:178:1: entryRuleEntityDeclaration : ruleEntityDeclaration EOF ;
    public final void entryRuleEntityDeclaration() throws RecognitionException {
        try {
            // InternalML2.g:179:1: ( ruleEntityDeclaration EOF )
            // InternalML2.g:180:1: ruleEntityDeclaration EOF
            {
             before(grammarAccess.getEntityDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityDeclaration();

            state._fsp--;

             after(grammarAccess.getEntityDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityDeclaration"


    // $ANTLR start "ruleEntityDeclaration"
    // InternalML2.g:187:1: ruleEntityDeclaration : ( ( rule__EntityDeclaration__Alternatives ) ) ;
    public final void ruleEntityDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:191:2: ( ( ( rule__EntityDeclaration__Alternatives ) ) )
            // InternalML2.g:192:2: ( ( rule__EntityDeclaration__Alternatives ) )
            {
            // InternalML2.g:192:2: ( ( rule__EntityDeclaration__Alternatives ) )
            // InternalML2.g:193:3: ( rule__EntityDeclaration__Alternatives )
            {
             before(grammarAccess.getEntityDeclarationAccess().getAlternatives()); 
            // InternalML2.g:194:3: ( rule__EntityDeclaration__Alternatives )
            // InternalML2.g:194:4: rule__EntityDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityDeclaration"


    // $ANTLR start "entryRuleIndividual"
    // InternalML2.g:203:1: entryRuleIndividual : ruleIndividual EOF ;
    public final void entryRuleIndividual() throws RecognitionException {
        try {
            // InternalML2.g:204:1: ( ruleIndividual EOF )
            // InternalML2.g:205:1: ruleIndividual EOF
            {
             before(grammarAccess.getIndividualRule()); 
            pushFollow(FOLLOW_1);
            ruleIndividual();

            state._fsp--;

             after(grammarAccess.getIndividualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndividual"


    // $ANTLR start "ruleIndividual"
    // InternalML2.g:212:1: ruleIndividual : ( ( rule__Individual__Group__0 ) ) ;
    public final void ruleIndividual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:216:2: ( ( ( rule__Individual__Group__0 ) ) )
            // InternalML2.g:217:2: ( ( rule__Individual__Group__0 ) )
            {
            // InternalML2.g:217:2: ( ( rule__Individual__Group__0 ) )
            // InternalML2.g:218:3: ( rule__Individual__Group__0 )
            {
             before(grammarAccess.getIndividualAccess().getGroup()); 
            // InternalML2.g:219:3: ( rule__Individual__Group__0 )
            // InternalML2.g:219:4: rule__Individual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndividual"


    // $ANTLR start "entryRuleClass"
    // InternalML2.g:228:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalML2.g:229:1: ( ruleClass EOF )
            // InternalML2.g:230:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalML2.g:237:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:241:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalML2.g:242:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalML2.g:242:2: ( ( rule__Class__Group__0 ) )
            // InternalML2.g:243:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalML2.g:244:3: ( rule__Class__Group__0 )
            // InternalML2.g:244:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleFOClassOrDataType"
    // InternalML2.g:253:1: entryRuleFOClassOrDataType : ruleFOClassOrDataType EOF ;
    public final void entryRuleFOClassOrDataType() throws RecognitionException {
        try {
            // InternalML2.g:254:1: ( ruleFOClassOrDataType EOF )
            // InternalML2.g:255:1: ruleFOClassOrDataType EOF
            {
             before(grammarAccess.getFOClassOrDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFOClassOrDataType();

            state._fsp--;

             after(grammarAccess.getFOClassOrDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFOClassOrDataType"


    // $ANTLR start "ruleFOClassOrDataType"
    // InternalML2.g:262:1: ruleFOClassOrDataType : ( ( rule__FOClassOrDataType__Group__0 ) ) ;
    public final void ruleFOClassOrDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:266:2: ( ( ( rule__FOClassOrDataType__Group__0 ) ) )
            // InternalML2.g:267:2: ( ( rule__FOClassOrDataType__Group__0 ) )
            {
            // InternalML2.g:267:2: ( ( rule__FOClassOrDataType__Group__0 ) )
            // InternalML2.g:268:3: ( rule__FOClassOrDataType__Group__0 )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getGroup()); 
            // InternalML2.g:269:3: ( rule__FOClassOrDataType__Group__0 )
            // InternalML2.g:269:4: rule__FOClassOrDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFOClassOrDataType"


    // $ANTLR start "entryRuleHigherOrderClass"
    // InternalML2.g:278:1: entryRuleHigherOrderClass : ruleHigherOrderClass EOF ;
    public final void entryRuleHigherOrderClass() throws RecognitionException {
        try {
            // InternalML2.g:279:1: ( ruleHigherOrderClass EOF )
            // InternalML2.g:280:1: ruleHigherOrderClass EOF
            {
             before(grammarAccess.getHigherOrderClassRule()); 
            pushFollow(FOLLOW_1);
            ruleHigherOrderClass();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHigherOrderClass"


    // $ANTLR start "ruleHigherOrderClass"
    // InternalML2.g:287:1: ruleHigherOrderClass : ( ( rule__HigherOrderClass__Group__0 ) ) ;
    public final void ruleHigherOrderClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:291:2: ( ( ( rule__HigherOrderClass__Group__0 ) ) )
            // InternalML2.g:292:2: ( ( rule__HigherOrderClass__Group__0 ) )
            {
            // InternalML2.g:292:2: ( ( rule__HigherOrderClass__Group__0 ) )
            // InternalML2.g:293:3: ( rule__HigherOrderClass__Group__0 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getGroup()); 
            // InternalML2.g:294:3: ( rule__HigherOrderClass__Group__0 )
            // InternalML2.g:294:4: rule__HigherOrderClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHigherOrderClass"


    // $ANTLR start "entryRuleFOClass"
    // InternalML2.g:303:1: entryRuleFOClass : ruleFOClass EOF ;
    public final void entryRuleFOClass() throws RecognitionException {
        try {
            // InternalML2.g:304:1: ( ruleFOClass EOF )
            // InternalML2.g:305:1: ruleFOClass EOF
            {
             before(grammarAccess.getFOClassRule()); 
            pushFollow(FOLLOW_1);
            ruleFOClass();

            state._fsp--;

             after(grammarAccess.getFOClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFOClass"


    // $ANTLR start "ruleFOClass"
    // InternalML2.g:312:1: ruleFOClass : ( ( rule__FOClass__Group__0 ) ) ;
    public final void ruleFOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:316:2: ( ( ( rule__FOClass__Group__0 ) ) )
            // InternalML2.g:317:2: ( ( rule__FOClass__Group__0 ) )
            {
            // InternalML2.g:317:2: ( ( rule__FOClass__Group__0 ) )
            // InternalML2.g:318:3: ( rule__FOClass__Group__0 )
            {
             before(grammarAccess.getFOClassAccess().getGroup()); 
            // InternalML2.g:319:3: ( rule__FOClass__Group__0 )
            // InternalML2.g:319:4: rule__FOClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFOClass"


    // $ANTLR start "entryRuleDataType"
    // InternalML2.g:328:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalML2.g:329:1: ( ruleDataType EOF )
            // InternalML2.g:330:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalML2.g:337:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:341:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalML2.g:342:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalML2.g:342:2: ( ( rule__DataType__Group__0 ) )
            // InternalML2.g:343:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalML2.g:344:3: ( rule__DataType__Group__0 )
            // InternalML2.g:344:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleHOClass"
    // InternalML2.g:353:1: entryRuleHOClass : ruleHOClass EOF ;
    public final void entryRuleHOClass() throws RecognitionException {
        try {
            // InternalML2.g:354:1: ( ruleHOClass EOF )
            // InternalML2.g:355:1: ruleHOClass EOF
            {
             before(grammarAccess.getHOClassRule()); 
            pushFollow(FOLLOW_1);
            ruleHOClass();

            state._fsp--;

             after(grammarAccess.getHOClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHOClass"


    // $ANTLR start "ruleHOClass"
    // InternalML2.g:362:1: ruleHOClass : ( ( rule__HOClass__Group__0 ) ) ;
    public final void ruleHOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:366:2: ( ( ( rule__HOClass__Group__0 ) ) )
            // InternalML2.g:367:2: ( ( rule__HOClass__Group__0 ) )
            {
            // InternalML2.g:367:2: ( ( rule__HOClass__Group__0 ) )
            // InternalML2.g:368:3: ( rule__HOClass__Group__0 )
            {
             before(grammarAccess.getHOClassAccess().getGroup()); 
            // InternalML2.g:369:3: ( rule__HOClass__Group__0 )
            // InternalML2.g:369:4: rule__HOClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHOClass"


    // $ANTLR start "entryRuleOrderlessClass"
    // InternalML2.g:378:1: entryRuleOrderlessClass : ruleOrderlessClass EOF ;
    public final void entryRuleOrderlessClass() throws RecognitionException {
        try {
            // InternalML2.g:379:1: ( ruleOrderlessClass EOF )
            // InternalML2.g:380:1: ruleOrderlessClass EOF
            {
             before(grammarAccess.getOrderlessClassRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderlessClass();

            state._fsp--;

             after(grammarAccess.getOrderlessClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderlessClass"


    // $ANTLR start "ruleOrderlessClass"
    // InternalML2.g:387:1: ruleOrderlessClass : ( ( rule__OrderlessClass__Group__0 ) ) ;
    public final void ruleOrderlessClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:391:2: ( ( ( rule__OrderlessClass__Group__0 ) ) )
            // InternalML2.g:392:2: ( ( rule__OrderlessClass__Group__0 ) )
            {
            // InternalML2.g:392:2: ( ( rule__OrderlessClass__Group__0 ) )
            // InternalML2.g:393:3: ( rule__OrderlessClass__Group__0 )
            {
             before(grammarAccess.getOrderlessClassAccess().getGroup()); 
            // InternalML2.g:394:3: ( rule__OrderlessClass__Group__0 )
            // InternalML2.g:394:4: rule__OrderlessClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderlessClass"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalML2.g:403:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalML2.g:404:1: ( ruleGeneralizationSet EOF )
            // InternalML2.g:405:1: ruleGeneralizationSet EOF
            {
             before(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralizationSet();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalML2.g:412:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:416:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalML2.g:417:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalML2.g:417:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalML2.g:418:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalML2.g:419:3: ( rule__GeneralizationSet__Group__0 )
            // InternalML2.g:419:4: rule__GeneralizationSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleFeature"
    // InternalML2.g:428:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalML2.g:429:1: ( ruleFeature EOF )
            // InternalML2.g:430:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalML2.g:437:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:441:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalML2.g:442:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalML2.g:442:2: ( ( rule__Feature__Alternatives ) )
            // InternalML2.g:443:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalML2.g:444:3: ( rule__Feature__Alternatives )
            // InternalML2.g:444:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleCommonFeature"
    // InternalML2.g:453:1: entryRuleCommonFeature : ruleCommonFeature EOF ;
    public final void entryRuleCommonFeature() throws RecognitionException {
        try {
            // InternalML2.g:454:1: ( ruleCommonFeature EOF )
            // InternalML2.g:455:1: ruleCommonFeature EOF
            {
             before(grammarAccess.getCommonFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleCommonFeature();

            state._fsp--;

             after(grammarAccess.getCommonFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommonFeature"


    // $ANTLR start "ruleCommonFeature"
    // InternalML2.g:462:1: ruleCommonFeature : ( ( rule__CommonFeature__Alternatives ) ) ;
    public final void ruleCommonFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:466:2: ( ( ( rule__CommonFeature__Alternatives ) ) )
            // InternalML2.g:467:2: ( ( rule__CommonFeature__Alternatives ) )
            {
            // InternalML2.g:467:2: ( ( rule__CommonFeature__Alternatives ) )
            // InternalML2.g:468:3: ( rule__CommonFeature__Alternatives )
            {
             before(grammarAccess.getCommonFeatureAccess().getAlternatives()); 
            // InternalML2.g:469:3: ( rule__CommonFeature__Alternatives )
            // InternalML2.g:469:4: rule__CommonFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CommonFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommonFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommonFeature"


    // $ANTLR start "entryRuleRegularityFeature"
    // InternalML2.g:478:1: entryRuleRegularityFeature : ruleRegularityFeature EOF ;
    public final void entryRuleRegularityFeature() throws RecognitionException {
        try {
            // InternalML2.g:479:1: ( ruleRegularityFeature EOF )
            // InternalML2.g:480:1: ruleRegularityFeature EOF
            {
             before(grammarAccess.getRegularityFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularityFeature();

            state._fsp--;

             after(grammarAccess.getRegularityFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularityFeature"


    // $ANTLR start "ruleRegularityFeature"
    // InternalML2.g:487:1: ruleRegularityFeature : ( ( rule__RegularityFeature__Alternatives ) ) ;
    public final void ruleRegularityFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:491:2: ( ( ( rule__RegularityFeature__Alternatives ) ) )
            // InternalML2.g:492:2: ( ( rule__RegularityFeature__Alternatives ) )
            {
            // InternalML2.g:492:2: ( ( rule__RegularityFeature__Alternatives ) )
            // InternalML2.g:493:3: ( rule__RegularityFeature__Alternatives )
            {
             before(grammarAccess.getRegularityFeatureAccess().getAlternatives()); 
            // InternalML2.g:494:3: ( rule__RegularityFeature__Alternatives )
            // InternalML2.g:494:4: rule__RegularityFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RegularityFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegularityFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityFeature"


    // $ANTLR start "entryRuleAttribute"
    // InternalML2.g:503:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalML2.g:504:1: ( ruleAttribute EOF )
            // InternalML2.g:505:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalML2.g:512:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:516:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalML2.g:517:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalML2.g:517:2: ( ( rule__Attribute__Group__0 ) )
            // InternalML2.g:518:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalML2.g:519:3: ( rule__Attribute__Group__0 )
            // InternalML2.g:519:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalML2.g:528:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalML2.g:529:1: ( ruleReference EOF )
            // InternalML2.g:530:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalML2.g:537:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:541:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalML2.g:542:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalML2.g:542:2: ( ( rule__Reference__Group__0 ) )
            // InternalML2.g:543:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalML2.g:544:3: ( rule__Reference__Group__0 )
            // InternalML2.g:544:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleRegularityAttribute"
    // InternalML2.g:553:1: entryRuleRegularityAttribute : ruleRegularityAttribute EOF ;
    public final void entryRuleRegularityAttribute() throws RecognitionException {
        try {
            // InternalML2.g:554:1: ( ruleRegularityAttribute EOF )
            // InternalML2.g:555:1: ruleRegularityAttribute EOF
            {
             before(grammarAccess.getRegularityAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularityAttribute();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularityAttribute"


    // $ANTLR start "ruleRegularityAttribute"
    // InternalML2.g:562:1: ruleRegularityAttribute : ( ( rule__RegularityAttribute__Group__0 ) ) ;
    public final void ruleRegularityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:566:2: ( ( ( rule__RegularityAttribute__Group__0 ) ) )
            // InternalML2.g:567:2: ( ( rule__RegularityAttribute__Group__0 ) )
            {
            // InternalML2.g:567:2: ( ( rule__RegularityAttribute__Group__0 ) )
            // InternalML2.g:568:3: ( rule__RegularityAttribute__Group__0 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup()); 
            // InternalML2.g:569:3: ( rule__RegularityAttribute__Group__0 )
            // InternalML2.g:569:4: rule__RegularityAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityAttribute"


    // $ANTLR start "entryRuleRegularityReference"
    // InternalML2.g:578:1: entryRuleRegularityReference : ruleRegularityReference EOF ;
    public final void entryRuleRegularityReference() throws RecognitionException {
        try {
            // InternalML2.g:579:1: ( ruleRegularityReference EOF )
            // InternalML2.g:580:1: ruleRegularityReference EOF
            {
             before(grammarAccess.getRegularityReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularityReference();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularityReference"


    // $ANTLR start "ruleRegularityReference"
    // InternalML2.g:587:1: ruleRegularityReference : ( ( rule__RegularityReference__Group__0 ) ) ;
    public final void ruleRegularityReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:591:2: ( ( ( rule__RegularityReference__Group__0 ) ) )
            // InternalML2.g:592:2: ( ( rule__RegularityReference__Group__0 ) )
            {
            // InternalML2.g:592:2: ( ( rule__RegularityReference__Group__0 ) )
            // InternalML2.g:593:3: ( rule__RegularityReference__Group__0 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup()); 
            // InternalML2.g:594:3: ( rule__RegularityReference__Group__0 )
            // InternalML2.g:594:4: rule__RegularityReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityReference"


    // $ANTLR start "entryRuleFeatureAssignment"
    // InternalML2.g:603:1: entryRuleFeatureAssignment : ruleFeatureAssignment EOF ;
    public final void entryRuleFeatureAssignment() throws RecognitionException {
        try {
            // InternalML2.g:604:1: ( ruleFeatureAssignment EOF )
            // InternalML2.g:605:1: ruleFeatureAssignment EOF
            {
             before(grammarAccess.getFeatureAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureAssignment();

            state._fsp--;

             after(grammarAccess.getFeatureAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureAssignment"


    // $ANTLR start "ruleFeatureAssignment"
    // InternalML2.g:612:1: ruleFeatureAssignment : ( ( rule__FeatureAssignment__Alternatives ) ) ;
    public final void ruleFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:616:2: ( ( ( rule__FeatureAssignment__Alternatives ) ) )
            // InternalML2.g:617:2: ( ( rule__FeatureAssignment__Alternatives ) )
            {
            // InternalML2.g:617:2: ( ( rule__FeatureAssignment__Alternatives ) )
            // InternalML2.g:618:3: ( rule__FeatureAssignment__Alternatives )
            {
             before(grammarAccess.getFeatureAssignmentAccess().getAlternatives()); 
            // InternalML2.g:619:3: ( rule__FeatureAssignment__Alternatives )
            // InternalML2.g:619:4: rule__FeatureAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureAssignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAssignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureAssignment"


    // $ANTLR start "entryRuleSingleAttributeAssignment"
    // InternalML2.g:628:1: entryRuleSingleAttributeAssignment : ruleSingleAttributeAssignment EOF ;
    public final void entryRuleSingleAttributeAssignment() throws RecognitionException {
        try {
            // InternalML2.g:629:1: ( ruleSingleAttributeAssignment EOF )
            // InternalML2.g:630:1: ruleSingleAttributeAssignment EOF
            {
             before(grammarAccess.getSingleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getSingleAttributeAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleAttributeAssignment"


    // $ANTLR start "ruleSingleAttributeAssignment"
    // InternalML2.g:637:1: ruleSingleAttributeAssignment : ( ( rule__SingleAttributeAssignment__Group__0 ) ) ;
    public final void ruleSingleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:641:2: ( ( ( rule__SingleAttributeAssignment__Group__0 ) ) )
            // InternalML2.g:642:2: ( ( rule__SingleAttributeAssignment__Group__0 ) )
            {
            // InternalML2.g:642:2: ( ( rule__SingleAttributeAssignment__Group__0 ) )
            // InternalML2.g:643:3: ( rule__SingleAttributeAssignment__Group__0 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getGroup()); 
            // InternalML2.g:644:3: ( rule__SingleAttributeAssignment__Group__0 )
            // InternalML2.g:644:4: rule__SingleAttributeAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleAttributeAssignment"


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalML2.g:653:1: entryRuleReferenceAssignment : ruleReferenceAssignment EOF ;
    public final void entryRuleReferenceAssignment() throws RecognitionException {
        try {
            // InternalML2.g:654:1: ( ruleReferenceAssignment EOF )
            // InternalML2.g:655:1: ruleReferenceAssignment EOF
            {
             before(grammarAccess.getReferenceAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceAssignment();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceAssignment"


    // $ANTLR start "ruleReferenceAssignment"
    // InternalML2.g:662:1: ruleReferenceAssignment : ( ( rule__ReferenceAssignment__Group__0 ) ) ;
    public final void ruleReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:666:2: ( ( ( rule__ReferenceAssignment__Group__0 ) ) )
            // InternalML2.g:667:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            {
            // InternalML2.g:667:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            // InternalML2.g:668:3: ( rule__ReferenceAssignment__Group__0 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup()); 
            // InternalML2.g:669:3: ( rule__ReferenceAssignment__Group__0 )
            // InternalML2.g:669:4: rule__ReferenceAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceAssignment"


    // $ANTLR start "ruleCategorizationType"
    // InternalML2.g:678:1: ruleCategorizationType : ( ( rule__CategorizationType__Alternatives ) ) ;
    public final void ruleCategorizationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:682:1: ( ( ( rule__CategorizationType__Alternatives ) ) )
            // InternalML2.g:683:2: ( ( rule__CategorizationType__Alternatives ) )
            {
            // InternalML2.g:683:2: ( ( rule__CategorizationType__Alternatives ) )
            // InternalML2.g:684:3: ( rule__CategorizationType__Alternatives )
            {
             before(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 
            // InternalML2.g:685:3: ( rule__CategorizationType__Alternatives )
            // InternalML2.g:685:4: rule__CategorizationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CategorizationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategorizationType"


    // $ANTLR start "rulePrimitiveType"
    // InternalML2.g:694:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:698:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalML2.g:699:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalML2.g:699:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalML2.g:700:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalML2.g:701:3: ( rule__PrimitiveType__Alternatives )
            // InternalML2.g:701:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleRegularityFeatureType"
    // InternalML2.g:710:1: ruleRegularityFeatureType : ( ( rule__RegularityFeatureType__Alternatives ) ) ;
    public final void ruleRegularityFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:714:1: ( ( ( rule__RegularityFeatureType__Alternatives ) ) )
            // InternalML2.g:715:2: ( ( rule__RegularityFeatureType__Alternatives ) )
            {
            // InternalML2.g:715:2: ( ( rule__RegularityFeatureType__Alternatives ) )
            // InternalML2.g:716:3: ( rule__RegularityFeatureType__Alternatives )
            {
             before(grammarAccess.getRegularityFeatureTypeAccess().getAlternatives()); 
            // InternalML2.g:717:3: ( rule__RegularityFeatureType__Alternatives )
            // InternalML2.g:717:4: rule__RegularityFeatureType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RegularityFeatureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegularityFeatureTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularityFeatureType"


    // $ANTLR start "rule__Model__Alternatives_3"
    // InternalML2.g:725:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:729:1: ( ( ( rule__Model__Group_3_0__0 ) ) | ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=31 && LA1_0<=32)||(LA1_0>=38 && LA1_0<=42)||(LA1_0>=52 && LA1_0<=53)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalML2.g:730:2: ( ( rule__Model__Group_3_0__0 ) )
                    {
                    // InternalML2.g:730:2: ( ( rule__Model__Group_3_0__0 ) )
                    // InternalML2.g:731:3: ( rule__Model__Group_3_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_3_0()); 
                    // InternalML2.g:732:3: ( rule__Model__Group_3_0__0 )
                    // InternalML2.g:732:4: rule__Model__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:736:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    {
                    // InternalML2.g:736:2: ( ( rule__Model__ElementsAssignment_3_1 ) )
                    // InternalML2.g:737:3: ( rule__Model__ElementsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
                    // InternalML2.g:738:3: ( rule__Model__ElementsAssignment_3_1 )
                    // InternalML2.g:738:4: rule__Model__ElementsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ElementsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_3"


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalML2.g:746:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:750:1: ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt2=2;
                }
                break;
            case 42:
            case 52:
            case 53:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalML2.g:751:2: ( ruleImport )
                    {
                    // InternalML2.g:751:2: ( ruleImport )
                    // InternalML2.g:752:3: ruleImport
                    {
                     before(grammarAccess.getModelElementAccess().getImportParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getImportParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:757:2: ( ruleEntityDeclaration )
                    {
                    // InternalML2.g:757:2: ( ruleEntityDeclaration )
                    // InternalML2.g:758:3: ruleEntityDeclaration
                    {
                     before(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getEntityDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:763:2: ( ruleGeneralizationSet )
                    {
                    // InternalML2.g:763:2: ( ruleGeneralizationSet )
                    // InternalML2.g:764:3: ruleGeneralizationSet
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralizationSet();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Alternatives_0"


    // $ANTLR start "rule__EntityDeclaration__Alternatives"
    // InternalML2.g:773:1: rule__EntityDeclaration__Alternatives : ( ( ruleClass ) | ( ruleIndividual ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:777:1: ( ( ruleClass ) | ( ruleIndividual ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=38 && LA3_0<=41)) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalML2.g:778:2: ( ruleClass )
                    {
                    // InternalML2.g:778:2: ( ruleClass )
                    // InternalML2.g:779:3: ruleClass
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:784:2: ( ruleIndividual )
                    {
                    // InternalML2.g:784:2: ( ruleIndividual )
                    // InternalML2.g:785:3: ruleIndividual
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIndividual();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getIndividualParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityDeclaration__Alternatives"


    // $ANTLR start "rule__Class__Alternatives_0"
    // InternalML2.g:794:1: rule__Class__Alternatives_0 : ( ( ruleFOClassOrDataType ) | ( ruleHigherOrderClass ) );
    public final void rule__Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:798:1: ( ( ruleFOClassOrDataType ) | ( ruleHigherOrderClass ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=38 && LA4_0<=39)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=40 && LA4_0<=41)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalML2.g:799:2: ( ruleFOClassOrDataType )
                    {
                    // InternalML2.g:799:2: ( ruleFOClassOrDataType )
                    // InternalML2.g:800:3: ruleFOClassOrDataType
                    {
                     before(grammarAccess.getClassAccess().getFOClassOrDataTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFOClassOrDataType();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getFOClassOrDataTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:805:2: ( ruleHigherOrderClass )
                    {
                    // InternalML2.g:805:2: ( ruleHigherOrderClass )
                    // InternalML2.g:806:3: ruleHigherOrderClass
                    {
                     before(grammarAccess.getClassAccess().getHigherOrderClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHigherOrderClass();

                    state._fsp--;

                     after(grammarAccess.getClassAccess().getHigherOrderClassParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Alternatives_0"


    // $ANTLR start "rule__Class__Alternatives_1_1"
    // InternalML2.g:815:1: rule__Class__Alternatives_1_1 : ( ( ( rule__Class__AssignmentsAssignment_1_1_0 ) ) | ( ( rule__Class__FeaturesAssignment_1_1_1 ) ) );
    public final void rule__Class__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:819:1: ( ( ( rule__Class__AssignmentsAssignment_1_1_0 ) ) | ( ( rule__Class__FeaturesAssignment_1_1_1 ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==29||LA5_5==51) ) {
                        alt5=1;
                    }
                    else if ( (LA5_5==33) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==33) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==29||LA5_3==51) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==33) ) {
                    alt5=2;
                }
                else if ( (LA5_3==29||LA5_3==51) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalML2.g:820:2: ( ( rule__Class__AssignmentsAssignment_1_1_0 ) )
                    {
                    // InternalML2.g:820:2: ( ( rule__Class__AssignmentsAssignment_1_1_0 ) )
                    // InternalML2.g:821:3: ( rule__Class__AssignmentsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getClassAccess().getAssignmentsAssignment_1_1_0()); 
                    // InternalML2.g:822:3: ( rule__Class__AssignmentsAssignment_1_1_0 )
                    // InternalML2.g:822:4: rule__Class__AssignmentsAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AssignmentsAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getAssignmentsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:826:2: ( ( rule__Class__FeaturesAssignment_1_1_1 ) )
                    {
                    // InternalML2.g:826:2: ( ( rule__Class__FeaturesAssignment_1_1_1 ) )
                    // InternalML2.g:827:3: ( rule__Class__FeaturesAssignment_1_1_1 )
                    {
                     before(grammarAccess.getClassAccess().getFeaturesAssignment_1_1_1()); 
                    // InternalML2.g:828:3: ( rule__Class__FeaturesAssignment_1_1_1 )
                    // InternalML2.g:828:4: rule__Class__FeaturesAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__FeaturesAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassAccess().getFeaturesAssignment_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Alternatives_1_1"


    // $ANTLR start "rule__FOClassOrDataType__Alternatives_0"
    // InternalML2.g:836:1: rule__FOClassOrDataType__Alternatives_0 : ( ( ruleFOClass ) | ( ruleDataType ) );
    public final void rule__FOClassOrDataType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:840:1: ( ( ruleFOClass ) | ( ruleDataType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                alt6=1;
            }
            else if ( (LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalML2.g:841:2: ( ruleFOClass )
                    {
                    // InternalML2.g:841:2: ( ruleFOClass )
                    // InternalML2.g:842:3: ruleFOClass
                    {
                     before(grammarAccess.getFOClassOrDataTypeAccess().getFOClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFOClass();

                    state._fsp--;

                     after(grammarAccess.getFOClassOrDataTypeAccess().getFOClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:847:2: ( ruleDataType )
                    {
                    // InternalML2.g:847:2: ( ruleDataType )
                    // InternalML2.g:848:3: ruleDataType
                    {
                     before(grammarAccess.getFOClassOrDataTypeAccess().getDataTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getFOClassOrDataTypeAccess().getDataTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Alternatives_0"


    // $ANTLR start "rule__HigherOrderClass__Alternatives_0"
    // InternalML2.g:857:1: rule__HigherOrderClass__Alternatives_0 : ( ( ruleHOClass ) | ( ruleOrderlessClass ) );
    public final void rule__HigherOrderClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:861:1: ( ( ruleHOClass ) | ( ruleOrderlessClass ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==40) ) {
                alt7=1;
            }
            else if ( (LA7_0==41) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalML2.g:862:2: ( ruleHOClass )
                    {
                    // InternalML2.g:862:2: ( ruleHOClass )
                    // InternalML2.g:863:3: ruleHOClass
                    {
                     before(grammarAccess.getHigherOrderClassAccess().getHOClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHOClass();

                    state._fsp--;

                     after(grammarAccess.getHigherOrderClassAccess().getHOClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:868:2: ( ruleOrderlessClass )
                    {
                    // InternalML2.g:868:2: ( ruleOrderlessClass )
                    // InternalML2.g:869:3: ruleOrderlessClass
                    {
                     before(grammarAccess.getHigherOrderClassAccess().getOrderlessClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrderlessClass();

                    state._fsp--;

                     after(grammarAccess.getHigherOrderClassAccess().getOrderlessClassParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Alternatives_0"


    // $ANTLR start "rule__HigherOrderClass__Alternatives_4"
    // InternalML2.g:878:1: rule__HigherOrderClass__Alternatives_4 : ( ( ( rule__HigherOrderClass__Group_4_0__0 ) ) | ( ( rule__HigherOrderClass__Group_4_1__0 ) ) );
    public final void rule__HigherOrderClass__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:882:1: ( ( ( rule__HigherOrderClass__Group_4_0__0 ) ) | ( ( rule__HigherOrderClass__Group_4_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=14)) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalML2.g:883:2: ( ( rule__HigherOrderClass__Group_4_0__0 ) )
                    {
                    // InternalML2.g:883:2: ( ( rule__HigherOrderClass__Group_4_0__0 ) )
                    // InternalML2.g:884:3: ( rule__HigherOrderClass__Group_4_0__0 )
                    {
                     before(grammarAccess.getHigherOrderClassAccess().getGroup_4_0()); 
                    // InternalML2.g:885:3: ( rule__HigherOrderClass__Group_4_0__0 )
                    // InternalML2.g:885:4: rule__HigherOrderClass__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HigherOrderClass__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHigherOrderClassAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:889:2: ( ( rule__HigherOrderClass__Group_4_1__0 ) )
                    {
                    // InternalML2.g:889:2: ( ( rule__HigherOrderClass__Group_4_1__0 ) )
                    // InternalML2.g:890:3: ( rule__HigherOrderClass__Group_4_1__0 )
                    {
                     before(grammarAccess.getHigherOrderClassAccess().getGroup_4_1()); 
                    // InternalML2.g:891:3: ( rule__HigherOrderClass__Group_4_1__0 )
                    // InternalML2.g:891:4: rule__HigherOrderClass__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HigherOrderClass__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHigherOrderClassAccess().getGroup_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Alternatives_4"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalML2.g:899:1: rule__Feature__Alternatives : ( ( ruleCommonFeature ) | ( ruleRegularityFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:903:1: ( ( ruleCommonFeature ) | ( ruleRegularityFeature ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==46||LA9_0==48) ) {
                alt9=1;
            }
            else if ( (LA9_0==50) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalML2.g:904:2: ( ruleCommonFeature )
                    {
                    // InternalML2.g:904:2: ( ruleCommonFeature )
                    // InternalML2.g:905:3: ruleCommonFeature
                    {
                     before(grammarAccess.getFeatureAccess().getCommonFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommonFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getCommonFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:910:2: ( ruleRegularityFeature )
                    {
                    // InternalML2.g:910:2: ( ruleRegularityFeature )
                    // InternalML2.g:911:3: ruleRegularityFeature
                    {
                     before(grammarAccess.getFeatureAccess().getRegularityFeatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularityFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getRegularityFeatureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__CommonFeature__Alternatives"
    // InternalML2.g:920:1: rule__CommonFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__CommonFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:924:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==46) ) {
                alt10=1;
            }
            else if ( (LA10_0==48) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalML2.g:925:2: ( ruleAttribute )
                    {
                    // InternalML2.g:925:2: ( ruleAttribute )
                    // InternalML2.g:926:3: ruleAttribute
                    {
                     before(grammarAccess.getCommonFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getCommonFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:931:2: ( ruleReference )
                    {
                    // InternalML2.g:931:2: ( ruleReference )
                    // InternalML2.g:932:3: ruleReference
                    {
                     before(grammarAccess.getCommonFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getCommonFeatureAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonFeature__Alternatives"


    // $ANTLR start "rule__RegularityFeature__Alternatives"
    // InternalML2.g:941:1: rule__RegularityFeature__Alternatives : ( ( ruleRegularityAttribute ) | ( ruleRegularityReference ) );
    public final void rule__RegularityFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:945:1: ( ( ruleRegularityAttribute ) | ( ruleRegularityReference ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID||LA11_1==46) ) {
                    alt11=1;
                }
                else if ( (LA11_1==48) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalML2.g:946:2: ( ruleRegularityAttribute )
                    {
                    // InternalML2.g:946:2: ( ruleRegularityAttribute )
                    // InternalML2.g:947:3: ruleRegularityAttribute
                    {
                     before(grammarAccess.getRegularityFeatureAccess().getRegularityAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularityAttribute();

                    state._fsp--;

                     after(grammarAccess.getRegularityFeatureAccess().getRegularityAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:952:2: ( ruleRegularityReference )
                    {
                    // InternalML2.g:952:2: ( ruleRegularityReference )
                    // InternalML2.g:953:3: ruleRegularityReference
                    {
                     before(grammarAccess.getRegularityFeatureAccess().getRegularityReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularityReference();

                    state._fsp--;

                     after(grammarAccess.getRegularityFeatureAccess().getRegularityReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityFeature__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives_3"
    // InternalML2.g:962:1: rule__Attribute__Alternatives_3 : ( ( ( rule__Attribute__PrimitiveTypeAssignment_3_0 ) ) | ( ( rule__Attribute___typeAssignment_3_1 ) ) );
    public final void rule__Attribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:966:1: ( ( ( rule__Attribute__PrimitiveTypeAssignment_3_0 ) ) | ( ( rule__Attribute___typeAssignment_3_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=15 && LA12_0<=17)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalML2.g:967:2: ( ( rule__Attribute__PrimitiveTypeAssignment_3_0 ) )
                    {
                    // InternalML2.g:967:2: ( ( rule__Attribute__PrimitiveTypeAssignment_3_0 ) )
                    // InternalML2.g:968:3: ( rule__Attribute__PrimitiveTypeAssignment_3_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getPrimitiveTypeAssignment_3_0()); 
                    // InternalML2.g:969:3: ( rule__Attribute__PrimitiveTypeAssignment_3_0 )
                    // InternalML2.g:969:4: rule__Attribute__PrimitiveTypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__PrimitiveTypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getPrimitiveTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:973:2: ( ( rule__Attribute___typeAssignment_3_1 ) )
                    {
                    // InternalML2.g:973:2: ( ( rule__Attribute___typeAssignment_3_1 ) )
                    // InternalML2.g:974:3: ( rule__Attribute___typeAssignment_3_1 )
                    {
                     before(grammarAccess.getAttributeAccess().get_typeAssignment_3_1()); 
                    // InternalML2.g:975:3: ( rule__Attribute___typeAssignment_3_1 )
                    // InternalML2.g:975:4: rule__Attribute___typeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute___typeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().get_typeAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives_3"


    // $ANTLR start "rule__RegularityAttribute__Alternatives_4"
    // InternalML2.g:983:1: rule__RegularityAttribute__Alternatives_4 : ( ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_4_0 ) ) | ( ( rule__RegularityAttribute___typeAssignment_4_1 ) ) );
    public final void rule__RegularityAttribute__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:987:1: ( ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_4_0 ) ) | ( ( rule__RegularityAttribute___typeAssignment_4_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=17)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalML2.g:988:2: ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_4_0 ) )
                    {
                    // InternalML2.g:988:2: ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_4_0 ) )
                    // InternalML2.g:989:3: ( rule__RegularityAttribute__PrimitiveTypeAssignment_4_0 )
                    {
                     before(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypeAssignment_4_0()); 
                    // InternalML2.g:990:3: ( rule__RegularityAttribute__PrimitiveTypeAssignment_4_0 )
                    // InternalML2.g:990:4: rule__RegularityAttribute__PrimitiveTypeAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__PrimitiveTypeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:994:2: ( ( rule__RegularityAttribute___typeAssignment_4_1 ) )
                    {
                    // InternalML2.g:994:2: ( ( rule__RegularityAttribute___typeAssignment_4_1 ) )
                    // InternalML2.g:995:3: ( rule__RegularityAttribute___typeAssignment_4_1 )
                    {
                     before(grammarAccess.getRegularityAttributeAccess().get_typeAssignment_4_1()); 
                    // InternalML2.g:996:3: ( rule__RegularityAttribute___typeAssignment_4_1 )
                    // InternalML2.g:996:4: rule__RegularityAttribute___typeAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute___typeAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularityAttributeAccess().get_typeAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Alternatives_4"


    // $ANTLR start "rule__FeatureAssignment__Alternatives"
    // InternalML2.g:1004:1: rule__FeatureAssignment__Alternatives : ( ( ruleReferenceAssignment ) | ( ruleSingleAttributeAssignment ) );
    public final void rule__FeatureAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1008:1: ( ( ruleReferenceAssignment ) | ( ruleSingleAttributeAssignment ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||LA14_0==46) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalML2.g:1009:2: ( ruleReferenceAssignment )
                    {
                    // InternalML2.g:1009:2: ( ruleReferenceAssignment )
                    // InternalML2.g:1010:3: ruleReferenceAssignment
                    {
                     before(grammarAccess.getFeatureAssignmentAccess().getReferenceAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceAssignment();

                    state._fsp--;

                     after(grammarAccess.getFeatureAssignmentAccess().getReferenceAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1015:2: ( ruleSingleAttributeAssignment )
                    {
                    // InternalML2.g:1015:2: ( ruleSingleAttributeAssignment )
                    // InternalML2.g:1016:3: ruleSingleAttributeAssignment
                    {
                     before(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleAttributeAssignment();

                    state._fsp--;

                     after(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssignment__Alternatives"


    // $ANTLR start "rule__ReferenceAssignment__Alternatives_3"
    // InternalML2.g:1025:1: rule__ReferenceAssignment__Alternatives_3 : ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) );
    public final void rule__ReferenceAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1029:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalML2.g:1030:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalML2.g:1030:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalML2.g:1031:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalML2.g:1032:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    // InternalML2.g:1032:4: rule__ReferenceAssignment__AssignmentsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceAssignment__AssignmentsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1036:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    {
                    // InternalML2.g:1036:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    // InternalML2.g:1037:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 
                    // InternalML2.g:1038:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    // InternalML2.g:1038:4: rule__ReferenceAssignment__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceAssignment__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Alternatives_3"


    // $ANTLR start "rule__CategorizationType__Alternatives"
    // InternalML2.g:1046:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1050:1: ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt16=1;
                }
                break;
            case 12:
                {
                alt16=2;
                }
                break;
            case 13:
                {
                alt16=3;
                }
                break;
            case 14:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalML2.g:1051:2: ( ( 'categorizes' ) )
                    {
                    // InternalML2.g:1051:2: ( ( 'categorizes' ) )
                    // InternalML2.g:1052:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalML2.g:1053:3: ( 'categorizes' )
                    // InternalML2.g:1053:4: 'categorizes'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1057:2: ( ( 'completeCategorizes' ) )
                    {
                    // InternalML2.g:1057:2: ( ( 'completeCategorizes' ) )
                    // InternalML2.g:1058:3: ( 'completeCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalML2.g:1059:3: ( 'completeCategorizes' )
                    // InternalML2.g:1059:4: 'completeCategorizes'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1063:2: ( ( 'disjointCategorizes' ) )
                    {
                    // InternalML2.g:1063:2: ( ( 'disjointCategorizes' ) )
                    // InternalML2.g:1064:3: ( 'disjointCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalML2.g:1065:3: ( 'disjointCategorizes' )
                    // InternalML2.g:1065:4: 'disjointCategorizes'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:1069:2: ( ( 'partitions' ) )
                    {
                    // InternalML2.g:1069:2: ( ( 'partitions' ) )
                    // InternalML2.g:1070:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalML2.g:1071:3: ( 'partitions' )
                    // InternalML2.g:1071:4: 'partitions'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategorizationType__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalML2.g:1079:1: rule__PrimitiveType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1083:1: ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt17=1;
                }
                break;
            case 16:
                {
                alt17=2;
                }
                break;
            case 17:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalML2.g:1084:2: ( ( 'String' ) )
                    {
                    // InternalML2.g:1084:2: ( ( 'String' ) )
                    // InternalML2.g:1085:3: ( 'String' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalML2.g:1086:3: ( 'String' )
                    // InternalML2.g:1086:4: 'String'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1090:2: ( ( 'Number' ) )
                    {
                    // InternalML2.g:1090:2: ( ( 'Number' ) )
                    // InternalML2.g:1091:3: ( 'Number' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // InternalML2.g:1092:3: ( 'Number' )
                    // InternalML2.g:1092:4: 'Number'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1096:2: ( ( 'Boolean' ) )
                    {
                    // InternalML2.g:1096:2: ( ( 'Boolean' ) )
                    // InternalML2.g:1097:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalML2.g:1098:3: ( 'Boolean' )
                    // InternalML2.g:1098:4: 'Boolean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__RegularityFeatureType__Alternatives"
    // InternalML2.g:1106:1: rule__RegularityFeatureType__Alternatives : ( ( ( 'determinesValue' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesAllowedValues' ) ) | ( ( 'determinesAllowedTypes' ) ) | ( ( 'determinesMaxValue' ) ) );
    public final void rule__RegularityFeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1110:1: ( ( ( 'determinesValue' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesAllowedValues' ) ) | ( ( 'determinesAllowedTypes' ) ) | ( ( 'determinesMaxValue' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt18=1;
                }
                break;
            case 19:
                {
                alt18=2;
                }
                break;
            case 20:
                {
                alt18=3;
                }
                break;
            case 21:
                {
                alt18=4;
                }
                break;
            case 22:
                {
                alt18=5;
                }
                break;
            case 23:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalML2.g:1111:2: ( ( 'determinesValue' ) )
                    {
                    // InternalML2.g:1111:2: ( ( 'determinesValue' ) )
                    // InternalML2.g:1112:3: ( 'determinesValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 
                    // InternalML2.g:1113:3: ( 'determinesValue' )
                    // InternalML2.g:1113:4: 'determinesValue'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1117:2: ( ( 'determinesType' ) )
                    {
                    // InternalML2.g:1117:2: ( ( 'determinesType' ) )
                    // InternalML2.g:1118:3: ( 'determinesType' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1()); 
                    // InternalML2.g:1119:3: ( 'determinesType' )
                    // InternalML2.g:1119:4: 'determinesType'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1123:2: ( ( 'determinesMinValue' ) )
                    {
                    // InternalML2.g:1123:2: ( ( 'determinesMinValue' ) )
                    // InternalML2.g:1124:3: ( 'determinesMinValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2()); 
                    // InternalML2.g:1125:3: ( 'determinesMinValue' )
                    // InternalML2.g:1125:4: 'determinesMinValue'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:1129:2: ( ( 'determinesAllowedValues' ) )
                    {
                    // InternalML2.g:1129:2: ( ( 'determinesAllowedValues' ) )
                    // InternalML2.g:1130:3: ( 'determinesAllowedValues' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3()); 
                    // InternalML2.g:1131:3: ( 'determinesAllowedValues' )
                    // InternalML2.g:1131:4: 'determinesAllowedValues'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:1135:2: ( ( 'determinesAllowedTypes' ) )
                    {
                    // InternalML2.g:1135:2: ( ( 'determinesAllowedTypes' ) )
                    // InternalML2.g:1136:3: ( 'determinesAllowedTypes' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4()); 
                    // InternalML2.g:1137:3: ( 'determinesAllowedTypes' )
                    // InternalML2.g:1137:4: 'determinesAllowedTypes'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:1141:2: ( ( 'determinesMaxValue' ) )
                    {
                    // InternalML2.g:1141:2: ( ( 'determinesMaxValue' ) )
                    // InternalML2.g:1142:3: ( 'determinesMaxValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_5()); 
                    // InternalML2.g:1143:3: ( 'determinesMaxValue' )
                    // InternalML2.g:1143:4: 'determinesMaxValue'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityFeatureType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalML2.g:1151:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1155:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalML2.g:1156:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalML2.g:1163:1: rule__Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1167:1: ( ( 'module' ) )
            // InternalML2.g:1168:1: ( 'module' )
            {
            // InternalML2.g:1168:1: ( 'module' )
            // InternalML2.g:1169:2: 'module'
            {
             before(grammarAccess.getModelAccess().getModuleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalML2.g:1178:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1182:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalML2.g:1183:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalML2.g:1190:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1194:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalML2.g:1195:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalML2.g:1195:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalML2.g:1196:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalML2.g:1197:2: ( rule__Model__NameAssignment_1 )
            // InternalML2.g:1197:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalML2.g:1205:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1209:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalML2.g:1210:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalML2.g:1217:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1221:1: ( ( '{' ) )
            // InternalML2.g:1222:1: ( '{' )
            {
            // InternalML2.g:1222:1: ( '{' )
            // InternalML2.g:1223:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalML2.g:1232:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1236:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalML2.g:1237:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalML2.g:1244:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1248:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // InternalML2.g:1249:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // InternalML2.g:1249:1: ( ( rule__Model__Alternatives_3 )* )
            // InternalML2.g:1250:2: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // InternalML2.g:1251:2: ( rule__Model__Alternatives_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27||(LA19_0>=31 && LA19_0<=32)||(LA19_0>=38 && LA19_0<=42)||(LA19_0>=52 && LA19_0<=53)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalML2.g:1251:3: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalML2.g:1259:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1263:1: ( rule__Model__Group__4__Impl )
            // InternalML2.g:1264:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalML2.g:1270:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1274:1: ( ( '}' ) )
            // InternalML2.g:1275:1: ( '}' )
            {
            // InternalML2.g:1275:1: ( '}' )
            // InternalML2.g:1276:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3_0__0"
    // InternalML2.g:1286:1: rule__Model__Group_3_0__0 : rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 ;
    public final void rule__Model__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1290:1: ( rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 )
            // InternalML2.g:1291:2: rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__0"


    // $ANTLR start "rule__Model__Group_3_0__0__Impl"
    // InternalML2.g:1298:1: rule__Model__Group_3_0__0__Impl : ( 'include' ) ;
    public final void rule__Model__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1302:1: ( ( 'include' ) )
            // InternalML2.g:1303:1: ( 'include' )
            {
            // InternalML2.g:1303:1: ( 'include' )
            // InternalML2.g:1304:2: 'include'
            {
             before(grammarAccess.getModelAccess().getIncludeKeyword_3_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getIncludeKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__0__Impl"


    // $ANTLR start "rule__Model__Group_3_0__1"
    // InternalML2.g:1313:1: rule__Model__Group_3_0__1 : rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 ;
    public final void rule__Model__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1317:1: ( rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 )
            // InternalML2.g:1318:2: rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__1"


    // $ANTLR start "rule__Model__Group_3_0__1__Impl"
    // InternalML2.g:1325:1: rule__Model__Group_3_0__1__Impl : ( ( rule__Model__IncludesAssignment_3_0_1 ) ) ;
    public final void rule__Model__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1329:1: ( ( ( rule__Model__IncludesAssignment_3_0_1 ) ) )
            // InternalML2.g:1330:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            {
            // InternalML2.g:1330:1: ( ( rule__Model__IncludesAssignment_3_0_1 ) )
            // InternalML2.g:1331:2: ( rule__Model__IncludesAssignment_3_0_1 )
            {
             before(grammarAccess.getModelAccess().getIncludesAssignment_3_0_1()); 
            // InternalML2.g:1332:2: ( rule__Model__IncludesAssignment_3_0_1 )
            // InternalML2.g:1332:3: rule__Model__IncludesAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__IncludesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getIncludesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__1__Impl"


    // $ANTLR start "rule__Model__Group_3_0__2"
    // InternalML2.g:1340:1: rule__Model__Group_3_0__2 : rule__Model__Group_3_0__2__Impl ;
    public final void rule__Model__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1344:1: ( rule__Model__Group_3_0__2__Impl )
            // InternalML2.g:1345:2: rule__Model__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__2"


    // $ANTLR start "rule__Model__Group_3_0__2__Impl"
    // InternalML2.g:1351:1: rule__Model__Group_3_0__2__Impl : ( ';' ) ;
    public final void rule__Model__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1355:1: ( ( ';' ) )
            // InternalML2.g:1356:1: ( ';' )
            {
            // InternalML2.g:1356:1: ( ';' )
            // InternalML2.g:1357:2: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_0__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalML2.g:1367:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1371:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalML2.g:1372:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalML2.g:1379:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1383:1: ( ( RULE_ID ) )
            // InternalML2.g:1384:1: ( RULE_ID )
            {
            // InternalML2.g:1384:1: ( RULE_ID )
            // InternalML2.g:1385:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalML2.g:1394:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1398:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalML2.g:1399:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalML2.g:1405:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1409:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalML2.g:1410:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalML2.g:1410:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalML2.g:1411:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalML2.g:1412:2: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalML2.g:1412:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalML2.g:1421:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1425:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalML2.g:1426:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalML2.g:1433:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1437:1: ( ( '.' ) )
            // InternalML2.g:1438:1: ( '.' )
            {
            // InternalML2.g:1438:1: ( '.' )
            // InternalML2.g:1439:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalML2.g:1448:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1452:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalML2.g:1453:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalML2.g:1459:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1463:1: ( ( RULE_ID ) )
            // InternalML2.g:1464:1: ( RULE_ID )
            {
            // InternalML2.g:1464:1: ( RULE_ID )
            // InternalML2.g:1465:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalML2.g:1475:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1479:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalML2.g:1480:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalML2.g:1487:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1491:1: ( ( ruleQualifiedName ) )
            // InternalML2.g:1492:1: ( ruleQualifiedName )
            {
            // InternalML2.g:1492:1: ( ruleQualifiedName )
            // InternalML2.g:1493:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalML2.g:1502:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1506:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalML2.g:1507:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalML2.g:1513:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1517:1: ( ( ( '.*' )? ) )
            // InternalML2.g:1518:1: ( ( '.*' )? )
            {
            // InternalML2.g:1518:1: ( ( '.*' )? )
            // InternalML2.g:1519:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalML2.g:1520:2: ( '.*' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalML2.g:1520:3: '.*'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalML2.g:1529:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1533:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalML2.g:1534:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalML2.g:1541:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1545:1: ( ( 'import' ) )
            // InternalML2.g:1546:1: ( 'import' )
            {
            // InternalML2.g:1546:1: ( 'import' )
            // InternalML2.g:1547:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalML2.g:1556:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1560:1: ( rule__Import__Group__1__Impl )
            // InternalML2.g:1561:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalML2.g:1567:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1571:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalML2.g:1572:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalML2.g:1572:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalML2.g:1573:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalML2.g:1574:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalML2.g:1574:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ModelElement__Group__0"
    // InternalML2.g:1583:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1587:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalML2.g:1588:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ModelElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__0"


    // $ANTLR start "rule__ModelElement__Group__0__Impl"
    // InternalML2.g:1595:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1599:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalML2.g:1600:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalML2.g:1600:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalML2.g:1601:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalML2.g:1602:2: ( rule__ModelElement__Alternatives_0 )
            // InternalML2.g:1602:3: rule__ModelElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__0__Impl"


    // $ANTLR start "rule__ModelElement__Group__1"
    // InternalML2.g:1610:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1614:1: ( rule__ModelElement__Group__1__Impl )
            // InternalML2.g:1615:2: rule__ModelElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__1"


    // $ANTLR start "rule__ModelElement__Group__1__Impl"
    // InternalML2.g:1621:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1625:1: ( ( ';' ) )
            // InternalML2.g:1626:1: ( ';' )
            {
            // InternalML2.g:1626:1: ( ';' )
            // InternalML2.g:1627:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__1__Impl"


    // $ANTLR start "rule__Individual__Group__0"
    // InternalML2.g:1637:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1641:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalML2.g:1642:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Individual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__0"


    // $ANTLR start "rule__Individual__Group__0__Impl"
    // InternalML2.g:1649:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1653:1: ( ( 'individual' ) )
            // InternalML2.g:1654:1: ( 'individual' )
            {
            // InternalML2.g:1654:1: ( 'individual' )
            // InternalML2.g:1655:2: 'individual'
            {
             before(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__0__Impl"


    // $ANTLR start "rule__Individual__Group__1"
    // InternalML2.g:1664:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1668:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalML2.g:1669:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Individual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__1"


    // $ANTLR start "rule__Individual__Group__1__Impl"
    // InternalML2.g:1676:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1680:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalML2.g:1681:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalML2.g:1681:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalML2.g:1682:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalML2.g:1683:2: ( rule__Individual__NameAssignment_1 )
            // InternalML2.g:1683:3: rule__Individual__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__1__Impl"


    // $ANTLR start "rule__Individual__Group__2"
    // InternalML2.g:1691:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1695:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalML2.g:1696:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Individual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__2"


    // $ANTLR start "rule__Individual__Group__2__Impl"
    // InternalML2.g:1703:1: rule__Individual__Group__2__Impl : ( ':' ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1707:1: ( ( ':' ) )
            // InternalML2.g:1708:1: ( ':' )
            {
            // InternalML2.g:1708:1: ( ':' )
            // InternalML2.g:1709:2: ':'
            {
             before(grammarAccess.getIndividualAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__2__Impl"


    // $ANTLR start "rule__Individual__Group__3"
    // InternalML2.g:1718:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl rule__Individual__Group__4 ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1722:1: ( rule__Individual__Group__3__Impl rule__Individual__Group__4 )
            // InternalML2.g:1723:2: rule__Individual__Group__3__Impl rule__Individual__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Individual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__3"


    // $ANTLR start "rule__Individual__Group__3__Impl"
    // InternalML2.g:1730:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__InstantiatesAssignment_3 ) ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1734:1: ( ( ( rule__Individual__InstantiatesAssignment_3 ) ) )
            // InternalML2.g:1735:1: ( ( rule__Individual__InstantiatesAssignment_3 ) )
            {
            // InternalML2.g:1735:1: ( ( rule__Individual__InstantiatesAssignment_3 ) )
            // InternalML2.g:1736:2: ( rule__Individual__InstantiatesAssignment_3 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatesAssignment_3()); 
            // InternalML2.g:1737:2: ( rule__Individual__InstantiatesAssignment_3 )
            // InternalML2.g:1737:3: rule__Individual__InstantiatesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Individual__InstantiatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getInstantiatesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__3__Impl"


    // $ANTLR start "rule__Individual__Group__4"
    // InternalML2.g:1745:1: rule__Individual__Group__4 : rule__Individual__Group__4__Impl rule__Individual__Group__5 ;
    public final void rule__Individual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1749:1: ( rule__Individual__Group__4__Impl rule__Individual__Group__5 )
            // InternalML2.g:1750:2: rule__Individual__Group__4__Impl rule__Individual__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Individual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__4"


    // $ANTLR start "rule__Individual__Group__4__Impl"
    // InternalML2.g:1757:1: rule__Individual__Group__4__Impl : ( ( rule__Individual__Group_4__0 )* ) ;
    public final void rule__Individual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1761:1: ( ( ( rule__Individual__Group_4__0 )* ) )
            // InternalML2.g:1762:1: ( ( rule__Individual__Group_4__0 )* )
            {
            // InternalML2.g:1762:1: ( ( rule__Individual__Group_4__0 )* )
            // InternalML2.g:1763:2: ( rule__Individual__Group_4__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_4()); 
            // InternalML2.g:1764:2: ( rule__Individual__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalML2.g:1764:3: rule__Individual__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getIndividualAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__4__Impl"


    // $ANTLR start "rule__Individual__Group__5"
    // InternalML2.g:1772:1: rule__Individual__Group__5 : rule__Individual__Group__5__Impl ;
    public final void rule__Individual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1776:1: ( rule__Individual__Group__5__Impl )
            // InternalML2.g:1777:2: rule__Individual__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__5"


    // $ANTLR start "rule__Individual__Group__5__Impl"
    // InternalML2.g:1783:1: rule__Individual__Group__5__Impl : ( ( rule__Individual__Group_5__0 )? ) ;
    public final void rule__Individual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1787:1: ( ( ( rule__Individual__Group_5__0 )? ) )
            // InternalML2.g:1788:1: ( ( rule__Individual__Group_5__0 )? )
            {
            // InternalML2.g:1788:1: ( ( rule__Individual__Group_5__0 )? )
            // InternalML2.g:1789:2: ( rule__Individual__Group_5__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_5()); 
            // InternalML2.g:1790:2: ( rule__Individual__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalML2.g:1790:3: rule__Individual__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Individual__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIndividualAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group__5__Impl"


    // $ANTLR start "rule__Individual__Group_4__0"
    // InternalML2.g:1799:1: rule__Individual__Group_4__0 : rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1 ;
    public final void rule__Individual__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1803:1: ( rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1 )
            // InternalML2.g:1804:2: rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Individual__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_4__0"


    // $ANTLR start "rule__Individual__Group_4__0__Impl"
    // InternalML2.g:1811:1: rule__Individual__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1815:1: ( ( ',' ) )
            // InternalML2.g:1816:1: ( ',' )
            {
            // InternalML2.g:1816:1: ( ',' )
            // InternalML2.g:1817:2: ','
            {
             before(grammarAccess.getIndividualAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_4__0__Impl"


    // $ANTLR start "rule__Individual__Group_4__1"
    // InternalML2.g:1826:1: rule__Individual__Group_4__1 : rule__Individual__Group_4__1__Impl ;
    public final void rule__Individual__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1830:1: ( rule__Individual__Group_4__1__Impl )
            // InternalML2.g:1831:2: rule__Individual__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_4__1"


    // $ANTLR start "rule__Individual__Group_4__1__Impl"
    // InternalML2.g:1837:1: rule__Individual__Group_4__1__Impl : ( ( rule__Individual__InstantiatesAssignment_4_1 ) ) ;
    public final void rule__Individual__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1841:1: ( ( ( rule__Individual__InstantiatesAssignment_4_1 ) ) )
            // InternalML2.g:1842:1: ( ( rule__Individual__InstantiatesAssignment_4_1 ) )
            {
            // InternalML2.g:1842:1: ( ( rule__Individual__InstantiatesAssignment_4_1 ) )
            // InternalML2.g:1843:2: ( rule__Individual__InstantiatesAssignment_4_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatesAssignment_4_1()); 
            // InternalML2.g:1844:2: ( rule__Individual__InstantiatesAssignment_4_1 )
            // InternalML2.g:1844:3: rule__Individual__InstantiatesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__InstantiatesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getInstantiatesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_4__1__Impl"


    // $ANTLR start "rule__Individual__Group_5__0"
    // InternalML2.g:1853:1: rule__Individual__Group_5__0 : rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1 ;
    public final void rule__Individual__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1857:1: ( rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1 )
            // InternalML2.g:1858:2: rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Individual__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_5__0"


    // $ANTLR start "rule__Individual__Group_5__0__Impl"
    // InternalML2.g:1865:1: rule__Individual__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1869:1: ( ( '{' ) )
            // InternalML2.g:1870:1: ( '{' )
            {
            // InternalML2.g:1870:1: ( '{' )
            // InternalML2.g:1871:2: '{'
            {
             before(grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_5__0__Impl"


    // $ANTLR start "rule__Individual__Group_5__1"
    // InternalML2.g:1880:1: rule__Individual__Group_5__1 : rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2 ;
    public final void rule__Individual__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1884:1: ( rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2 )
            // InternalML2.g:1885:2: rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Individual__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Individual__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_5__1"


    // $ANTLR start "rule__Individual__Group_5__1__Impl"
    // InternalML2.g:1892:1: rule__Individual__Group_5__1__Impl : ( ( rule__Individual__AssignmentsAssignment_5_1 )* ) ;
    public final void rule__Individual__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1896:1: ( ( ( rule__Individual__AssignmentsAssignment_5_1 )* ) )
            // InternalML2.g:1897:1: ( ( rule__Individual__AssignmentsAssignment_5_1 )* )
            {
            // InternalML2.g:1897:1: ( ( rule__Individual__AssignmentsAssignment_5_1 )* )
            // InternalML2.g:1898:2: ( rule__Individual__AssignmentsAssignment_5_1 )*
            {
             before(grammarAccess.getIndividualAccess().getAssignmentsAssignment_5_1()); 
            // InternalML2.g:1899:2: ( rule__Individual__AssignmentsAssignment_5_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==46||LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalML2.g:1899:3: rule__Individual__AssignmentsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__AssignmentsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getIndividualAccess().getAssignmentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_5__1__Impl"


    // $ANTLR start "rule__Individual__Group_5__2"
    // InternalML2.g:1907:1: rule__Individual__Group_5__2 : rule__Individual__Group_5__2__Impl ;
    public final void rule__Individual__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1911:1: ( rule__Individual__Group_5__2__Impl )
            // InternalML2.g:1912:2: rule__Individual__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Individual__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_5__2"


    // $ANTLR start "rule__Individual__Group_5__2__Impl"
    // InternalML2.g:1918:1: rule__Individual__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1922:1: ( ( '}' ) )
            // InternalML2.g:1923:1: ( '}' )
            {
            // InternalML2.g:1923:1: ( '}' )
            // InternalML2.g:1924:2: '}'
            {
             before(grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalML2.g:1934:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1938:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalML2.g:1939:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalML2.g:1946:1: rule__Class__Group__0__Impl : ( ( rule__Class__Alternatives_0 ) ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1950:1: ( ( ( rule__Class__Alternatives_0 ) ) )
            // InternalML2.g:1951:1: ( ( rule__Class__Alternatives_0 ) )
            {
            // InternalML2.g:1951:1: ( ( rule__Class__Alternatives_0 ) )
            // InternalML2.g:1952:2: ( rule__Class__Alternatives_0 )
            {
             before(grammarAccess.getClassAccess().getAlternatives_0()); 
            // InternalML2.g:1953:2: ( rule__Class__Alternatives_0 )
            // InternalML2.g:1953:3: rule__Class__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalML2.g:1961:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1965:1: ( rule__Class__Group__1__Impl )
            // InternalML2.g:1966:2: rule__Class__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalML2.g:1972:1: rule__Class__Group__1__Impl : ( ( rule__Class__Group_1__0 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1976:1: ( ( ( rule__Class__Group_1__0 )? ) )
            // InternalML2.g:1977:1: ( ( rule__Class__Group_1__0 )? )
            {
            // InternalML2.g:1977:1: ( ( rule__Class__Group_1__0 )? )
            // InternalML2.g:1978:2: ( rule__Class__Group_1__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_1()); 
            // InternalML2.g:1979:2: ( rule__Class__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalML2.g:1979:3: rule__Class__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group_1__0"
    // InternalML2.g:1988:1: rule__Class__Group_1__0 : rule__Class__Group_1__0__Impl rule__Class__Group_1__1 ;
    public final void rule__Class__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1992:1: ( rule__Class__Group_1__0__Impl rule__Class__Group_1__1 )
            // InternalML2.g:1993:2: rule__Class__Group_1__0__Impl rule__Class__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0"


    // $ANTLR start "rule__Class__Group_1__0__Impl"
    // InternalML2.g:2000:1: rule__Class__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Class__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2004:1: ( ( '{' ) )
            // InternalML2.g:2005:1: ( '{' )
            {
            // InternalML2.g:2005:1: ( '{' )
            // InternalML2.g:2006:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0__Impl"


    // $ANTLR start "rule__Class__Group_1__1"
    // InternalML2.g:2015:1: rule__Class__Group_1__1 : rule__Class__Group_1__1__Impl rule__Class__Group_1__2 ;
    public final void rule__Class__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2019:1: ( rule__Class__Group_1__1__Impl rule__Class__Group_1__2 )
            // InternalML2.g:2020:2: rule__Class__Group_1__1__Impl rule__Class__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1"


    // $ANTLR start "rule__Class__Group_1__1__Impl"
    // InternalML2.g:2027:1: rule__Class__Group_1__1__Impl : ( ( rule__Class__Alternatives_1_1 )* ) ;
    public final void rule__Class__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2031:1: ( ( ( rule__Class__Alternatives_1_1 )* ) )
            // InternalML2.g:2032:1: ( ( rule__Class__Alternatives_1_1 )* )
            {
            // InternalML2.g:2032:1: ( ( rule__Class__Alternatives_1_1 )* )
            // InternalML2.g:2033:2: ( rule__Class__Alternatives_1_1 )*
            {
             before(grammarAccess.getClassAccess().getAlternatives_1_1()); 
            // InternalML2.g:2034:2: ( rule__Class__Alternatives_1_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==46||LA26_0==48||LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalML2.g:2034:3: rule__Class__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group_1__2"
    // InternalML2.g:2042:1: rule__Class__Group_1__2 : rule__Class__Group_1__2__Impl ;
    public final void rule__Class__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2046:1: ( rule__Class__Group_1__2__Impl )
            // InternalML2.g:2047:2: rule__Class__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__2"


    // $ANTLR start "rule__Class__Group_1__2__Impl"
    // InternalML2.g:2053:1: rule__Class__Group_1__2__Impl : ( '}' ) ;
    public final void rule__Class__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2057:1: ( ( '}' ) )
            // InternalML2.g:2058:1: ( '}' )
            {
            // InternalML2.g:2058:1: ( '}' )
            // InternalML2.g:2059:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__2__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group__0"
    // InternalML2.g:2069:1: rule__FOClassOrDataType__Group__0 : rule__FOClassOrDataType__Group__0__Impl rule__FOClassOrDataType__Group__1 ;
    public final void rule__FOClassOrDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2073:1: ( rule__FOClassOrDataType__Group__0__Impl rule__FOClassOrDataType__Group__1 )
            // InternalML2.g:2074:2: rule__FOClassOrDataType__Group__0__Impl rule__FOClassOrDataType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FOClassOrDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group__0"


    // $ANTLR start "rule__FOClassOrDataType__Group__0__Impl"
    // InternalML2.g:2081:1: rule__FOClassOrDataType__Group__0__Impl : ( ( rule__FOClassOrDataType__Alternatives_0 ) ) ;
    public final void rule__FOClassOrDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2085:1: ( ( ( rule__FOClassOrDataType__Alternatives_0 ) ) )
            // InternalML2.g:2086:1: ( ( rule__FOClassOrDataType__Alternatives_0 ) )
            {
            // InternalML2.g:2086:1: ( ( rule__FOClassOrDataType__Alternatives_0 ) )
            // InternalML2.g:2087:2: ( rule__FOClassOrDataType__Alternatives_0 )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getAlternatives_0()); 
            // InternalML2.g:2088:2: ( rule__FOClassOrDataType__Alternatives_0 )
            // InternalML2.g:2088:3: rule__FOClassOrDataType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group__0__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group__1"
    // InternalML2.g:2096:1: rule__FOClassOrDataType__Group__1 : rule__FOClassOrDataType__Group__1__Impl rule__FOClassOrDataType__Group__2 ;
    public final void rule__FOClassOrDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2100:1: ( rule__FOClassOrDataType__Group__1__Impl rule__FOClassOrDataType__Group__2 )
            // InternalML2.g:2101:2: rule__FOClassOrDataType__Group__1__Impl rule__FOClassOrDataType__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FOClassOrDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group__1"


    // $ANTLR start "rule__FOClassOrDataType__Group__1__Impl"
    // InternalML2.g:2108:1: rule__FOClassOrDataType__Group__1__Impl : ( ( rule__FOClassOrDataType__Group_1__0 )? ) ;
    public final void rule__FOClassOrDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2112:1: ( ( ( rule__FOClassOrDataType__Group_1__0 )? ) )
            // InternalML2.g:2113:1: ( ( rule__FOClassOrDataType__Group_1__0 )? )
            {
            // InternalML2.g:2113:1: ( ( rule__FOClassOrDataType__Group_1__0 )? )
            // InternalML2.g:2114:2: ( rule__FOClassOrDataType__Group_1__0 )?
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getGroup_1()); 
            // InternalML2.g:2115:2: ( rule__FOClassOrDataType__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalML2.g:2115:3: rule__FOClassOrDataType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FOClassOrDataType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group__1__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group__2"
    // InternalML2.g:2123:1: rule__FOClassOrDataType__Group__2 : rule__FOClassOrDataType__Group__2__Impl ;
    public final void rule__FOClassOrDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2127:1: ( rule__FOClassOrDataType__Group__2__Impl )
            // InternalML2.g:2128:2: rule__FOClassOrDataType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group__2"


    // $ANTLR start "rule__FOClassOrDataType__Group__2__Impl"
    // InternalML2.g:2134:1: rule__FOClassOrDataType__Group__2__Impl : ( ( rule__FOClassOrDataType__Group_2__0 )? ) ;
    public final void rule__FOClassOrDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2138:1: ( ( ( rule__FOClassOrDataType__Group_2__0 )? ) )
            // InternalML2.g:2139:1: ( ( rule__FOClassOrDataType__Group_2__0 )? )
            {
            // InternalML2.g:2139:1: ( ( rule__FOClassOrDataType__Group_2__0 )? )
            // InternalML2.g:2140:2: ( rule__FOClassOrDataType__Group_2__0 )?
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getGroup_2()); 
            // InternalML2.g:2141:2: ( rule__FOClassOrDataType__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalML2.g:2141:3: rule__FOClassOrDataType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FOClassOrDataType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group__2__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_1__0"
    // InternalML2.g:2150:1: rule__FOClassOrDataType__Group_1__0 : rule__FOClassOrDataType__Group_1__0__Impl rule__FOClassOrDataType__Group_1__1 ;
    public final void rule__FOClassOrDataType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2154:1: ( rule__FOClassOrDataType__Group_1__0__Impl rule__FOClassOrDataType__Group_1__1 )
            // InternalML2.g:2155:2: rule__FOClassOrDataType__Group_1__0__Impl rule__FOClassOrDataType__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClassOrDataType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1__0"


    // $ANTLR start "rule__FOClassOrDataType__Group_1__0__Impl"
    // InternalML2.g:2162:1: rule__FOClassOrDataType__Group_1__0__Impl : ( ':' ) ;
    public final void rule__FOClassOrDataType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2166:1: ( ( ':' ) )
            // InternalML2.g:2167:1: ( ':' )
            {
            // InternalML2.g:2167:1: ( ':' )
            // InternalML2.g:2168:2: ':'
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getColonKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFOClassOrDataTypeAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1__0__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_1__1"
    // InternalML2.g:2177:1: rule__FOClassOrDataType__Group_1__1 : rule__FOClassOrDataType__Group_1__1__Impl rule__FOClassOrDataType__Group_1__2 ;
    public final void rule__FOClassOrDataType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2181:1: ( rule__FOClassOrDataType__Group_1__1__Impl rule__FOClassOrDataType__Group_1__2 )
            // InternalML2.g:2182:2: rule__FOClassOrDataType__Group_1__1__Impl rule__FOClassOrDataType__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__FOClassOrDataType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1__1"


    // $ANTLR start "rule__FOClassOrDataType__Group_1__1__Impl"
    // InternalML2.g:2189:1: rule__FOClassOrDataType__Group_1__1__Impl : ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_1 ) ) ;
    public final void rule__FOClassOrDataType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2193:1: ( ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_1 ) ) )
            // InternalML2.g:2194:1: ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_1 ) )
            {
            // InternalML2.g:2194:1: ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_1 ) )
            // InternalML2.g:2195:2: ( rule__FOClassOrDataType__InstantiatesAssignment_1_1 )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesAssignment_1_1()); 
            // InternalML2.g:2196:2: ( rule__FOClassOrDataType__InstantiatesAssignment_1_1 )
            // InternalML2.g:2196:3: rule__FOClassOrDataType__InstantiatesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__InstantiatesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1__1__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_1__2"
    // InternalML2.g:2204:1: rule__FOClassOrDataType__Group_1__2 : rule__FOClassOrDataType__Group_1__2__Impl ;
    public final void rule__FOClassOrDataType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2208:1: ( rule__FOClassOrDataType__Group_1__2__Impl )
            // InternalML2.g:2209:2: rule__FOClassOrDataType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1__2"


    // $ANTLR start "rule__FOClassOrDataType__Group_1__2__Impl"
    // InternalML2.g:2215:1: rule__FOClassOrDataType__Group_1__2__Impl : ( ( rule__FOClassOrDataType__Group_1_2__0 )* ) ;
    public final void rule__FOClassOrDataType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2219:1: ( ( ( rule__FOClassOrDataType__Group_1_2__0 )* ) )
            // InternalML2.g:2220:1: ( ( rule__FOClassOrDataType__Group_1_2__0 )* )
            {
            // InternalML2.g:2220:1: ( ( rule__FOClassOrDataType__Group_1_2__0 )* )
            // InternalML2.g:2221:2: ( rule__FOClassOrDataType__Group_1_2__0 )*
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getGroup_1_2()); 
            // InternalML2.g:2222:2: ( rule__FOClassOrDataType__Group_1_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalML2.g:2222:3: rule__FOClassOrDataType__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClassOrDataType__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getFOClassOrDataTypeAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1__2__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_1_2__0"
    // InternalML2.g:2231:1: rule__FOClassOrDataType__Group_1_2__0 : rule__FOClassOrDataType__Group_1_2__0__Impl rule__FOClassOrDataType__Group_1_2__1 ;
    public final void rule__FOClassOrDataType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2235:1: ( rule__FOClassOrDataType__Group_1_2__0__Impl rule__FOClassOrDataType__Group_1_2__1 )
            // InternalML2.g:2236:2: rule__FOClassOrDataType__Group_1_2__0__Impl rule__FOClassOrDataType__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClassOrDataType__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1_2__0"


    // $ANTLR start "rule__FOClassOrDataType__Group_1_2__0__Impl"
    // InternalML2.g:2243:1: rule__FOClassOrDataType__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FOClassOrDataType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2247:1: ( ( ',' ) )
            // InternalML2.g:2248:1: ( ',' )
            {
            // InternalML2.g:2248:1: ( ',' )
            // InternalML2.g:2249:2: ','
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getCommaKeyword_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFOClassOrDataTypeAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1_2__0__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_1_2__1"
    // InternalML2.g:2258:1: rule__FOClassOrDataType__Group_1_2__1 : rule__FOClassOrDataType__Group_1_2__1__Impl ;
    public final void rule__FOClassOrDataType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2262:1: ( rule__FOClassOrDataType__Group_1_2__1__Impl )
            // InternalML2.g:2263:2: rule__FOClassOrDataType__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1_2__1"


    // $ANTLR start "rule__FOClassOrDataType__Group_1_2__1__Impl"
    // InternalML2.g:2269:1: rule__FOClassOrDataType__Group_1_2__1__Impl : ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_2_1 ) ) ;
    public final void rule__FOClassOrDataType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2273:1: ( ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_2_1 ) ) )
            // InternalML2.g:2274:1: ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_2_1 ) )
            {
            // InternalML2.g:2274:1: ( ( rule__FOClassOrDataType__InstantiatesAssignment_1_2_1 ) )
            // InternalML2.g:2275:2: ( rule__FOClassOrDataType__InstantiatesAssignment_1_2_1 )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesAssignment_1_2_1()); 
            // InternalML2.g:2276:2: ( rule__FOClassOrDataType__InstantiatesAssignment_1_2_1 )
            // InternalML2.g:2276:3: rule__FOClassOrDataType__InstantiatesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__InstantiatesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_1_2__1__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_2__0"
    // InternalML2.g:2285:1: rule__FOClassOrDataType__Group_2__0 : rule__FOClassOrDataType__Group_2__0__Impl rule__FOClassOrDataType__Group_2__1 ;
    public final void rule__FOClassOrDataType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2289:1: ( rule__FOClassOrDataType__Group_2__0__Impl rule__FOClassOrDataType__Group_2__1 )
            // InternalML2.g:2290:2: rule__FOClassOrDataType__Group_2__0__Impl rule__FOClassOrDataType__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClassOrDataType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2__0"


    // $ANTLR start "rule__FOClassOrDataType__Group_2__0__Impl"
    // InternalML2.g:2297:1: rule__FOClassOrDataType__Group_2__0__Impl : ( 'specializes' ) ;
    public final void rule__FOClassOrDataType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2301:1: ( ( 'specializes' ) )
            // InternalML2.g:2302:1: ( 'specializes' )
            {
            // InternalML2.g:2302:1: ( 'specializes' )
            // InternalML2.g:2303:2: 'specializes'
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getSpecializesKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFOClassOrDataTypeAccess().getSpecializesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2__0__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_2__1"
    // InternalML2.g:2312:1: rule__FOClassOrDataType__Group_2__1 : rule__FOClassOrDataType__Group_2__1__Impl rule__FOClassOrDataType__Group_2__2 ;
    public final void rule__FOClassOrDataType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2316:1: ( rule__FOClassOrDataType__Group_2__1__Impl rule__FOClassOrDataType__Group_2__2 )
            // InternalML2.g:2317:2: rule__FOClassOrDataType__Group_2__1__Impl rule__FOClassOrDataType__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__FOClassOrDataType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2__1"


    // $ANTLR start "rule__FOClassOrDataType__Group_2__1__Impl"
    // InternalML2.g:2324:1: rule__FOClassOrDataType__Group_2__1__Impl : ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_1 ) ) ;
    public final void rule__FOClassOrDataType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2328:1: ( ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_1 ) ) )
            // InternalML2.g:2329:1: ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_1 ) )
            {
            // InternalML2.g:2329:1: ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_1 ) )
            // InternalML2.g:2330:2: ( rule__FOClassOrDataType__SuperClassesAssignment_2_1 )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesAssignment_2_1()); 
            // InternalML2.g:2331:2: ( rule__FOClassOrDataType__SuperClassesAssignment_2_1 )
            // InternalML2.g:2331:3: rule__FOClassOrDataType__SuperClassesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__SuperClassesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2__1__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_2__2"
    // InternalML2.g:2339:1: rule__FOClassOrDataType__Group_2__2 : rule__FOClassOrDataType__Group_2__2__Impl ;
    public final void rule__FOClassOrDataType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2343:1: ( rule__FOClassOrDataType__Group_2__2__Impl )
            // InternalML2.g:2344:2: rule__FOClassOrDataType__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2__2"


    // $ANTLR start "rule__FOClassOrDataType__Group_2__2__Impl"
    // InternalML2.g:2350:1: rule__FOClassOrDataType__Group_2__2__Impl : ( ( rule__FOClassOrDataType__Group_2_2__0 )* ) ;
    public final void rule__FOClassOrDataType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2354:1: ( ( ( rule__FOClassOrDataType__Group_2_2__0 )* ) )
            // InternalML2.g:2355:1: ( ( rule__FOClassOrDataType__Group_2_2__0 )* )
            {
            // InternalML2.g:2355:1: ( ( rule__FOClassOrDataType__Group_2_2__0 )* )
            // InternalML2.g:2356:2: ( rule__FOClassOrDataType__Group_2_2__0 )*
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getGroup_2_2()); 
            // InternalML2.g:2357:2: ( rule__FOClassOrDataType__Group_2_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalML2.g:2357:3: rule__FOClassOrDataType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FOClassOrDataType__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFOClassOrDataTypeAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2__2__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_2_2__0"
    // InternalML2.g:2366:1: rule__FOClassOrDataType__Group_2_2__0 : rule__FOClassOrDataType__Group_2_2__0__Impl rule__FOClassOrDataType__Group_2_2__1 ;
    public final void rule__FOClassOrDataType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2370:1: ( rule__FOClassOrDataType__Group_2_2__0__Impl rule__FOClassOrDataType__Group_2_2__1 )
            // InternalML2.g:2371:2: rule__FOClassOrDataType__Group_2_2__0__Impl rule__FOClassOrDataType__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClassOrDataType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2_2__0"


    // $ANTLR start "rule__FOClassOrDataType__Group_2_2__0__Impl"
    // InternalML2.g:2378:1: rule__FOClassOrDataType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FOClassOrDataType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2382:1: ( ( ',' ) )
            // InternalML2.g:2383:1: ( ',' )
            {
            // InternalML2.g:2383:1: ( ',' )
            // InternalML2.g:2384:2: ','
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getCommaKeyword_2_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFOClassOrDataTypeAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2_2__0__Impl"


    // $ANTLR start "rule__FOClassOrDataType__Group_2_2__1"
    // InternalML2.g:2393:1: rule__FOClassOrDataType__Group_2_2__1 : rule__FOClassOrDataType__Group_2_2__1__Impl ;
    public final void rule__FOClassOrDataType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2397:1: ( rule__FOClassOrDataType__Group_2_2__1__Impl )
            // InternalML2.g:2398:2: rule__FOClassOrDataType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2_2__1"


    // $ANTLR start "rule__FOClassOrDataType__Group_2_2__1__Impl"
    // InternalML2.g:2404:1: rule__FOClassOrDataType__Group_2_2__1__Impl : ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_2_1 ) ) ;
    public final void rule__FOClassOrDataType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2408:1: ( ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_2_1 ) ) )
            // InternalML2.g:2409:1: ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_2_1 ) )
            {
            // InternalML2.g:2409:1: ( ( rule__FOClassOrDataType__SuperClassesAssignment_2_2_1 ) )
            // InternalML2.g:2410:2: ( rule__FOClassOrDataType__SuperClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesAssignment_2_2_1()); 
            // InternalML2.g:2411:2: ( rule__FOClassOrDataType__SuperClassesAssignment_2_2_1 )
            // InternalML2.g:2411:3: rule__FOClassOrDataType__SuperClassesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClassOrDataType__SuperClassesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__Group_2_2__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group__0"
    // InternalML2.g:2420:1: rule__HigherOrderClass__Group__0 : rule__HigherOrderClass__Group__0__Impl rule__HigherOrderClass__Group__1 ;
    public final void rule__HigherOrderClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2424:1: ( rule__HigherOrderClass__Group__0__Impl rule__HigherOrderClass__Group__1 )
            // InternalML2.g:2425:2: rule__HigherOrderClass__Group__0__Impl rule__HigherOrderClass__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__HigherOrderClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__0"


    // $ANTLR start "rule__HigherOrderClass__Group__0__Impl"
    // InternalML2.g:2432:1: rule__HigherOrderClass__Group__0__Impl : ( ( rule__HigherOrderClass__Alternatives_0 ) ) ;
    public final void rule__HigherOrderClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2436:1: ( ( ( rule__HigherOrderClass__Alternatives_0 ) ) )
            // InternalML2.g:2437:1: ( ( rule__HigherOrderClass__Alternatives_0 ) )
            {
            // InternalML2.g:2437:1: ( ( rule__HigherOrderClass__Alternatives_0 ) )
            // InternalML2.g:2438:2: ( rule__HigherOrderClass__Alternatives_0 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getAlternatives_0()); 
            // InternalML2.g:2439:2: ( rule__HigherOrderClass__Alternatives_0 )
            // InternalML2.g:2439:3: rule__HigherOrderClass__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group__1"
    // InternalML2.g:2447:1: rule__HigherOrderClass__Group__1 : rule__HigherOrderClass__Group__1__Impl rule__HigherOrderClass__Group__2 ;
    public final void rule__HigherOrderClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2451:1: ( rule__HigherOrderClass__Group__1__Impl rule__HigherOrderClass__Group__2 )
            // InternalML2.g:2452:2: rule__HigherOrderClass__Group__1__Impl rule__HigherOrderClass__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__HigherOrderClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__1"


    // $ANTLR start "rule__HigherOrderClass__Group__1__Impl"
    // InternalML2.g:2459:1: rule__HigherOrderClass__Group__1__Impl : ( ( rule__HigherOrderClass__Group_1__0 )? ) ;
    public final void rule__HigherOrderClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2463:1: ( ( ( rule__HigherOrderClass__Group_1__0 )? ) )
            // InternalML2.g:2464:1: ( ( rule__HigherOrderClass__Group_1__0 )? )
            {
            // InternalML2.g:2464:1: ( ( rule__HigherOrderClass__Group_1__0 )? )
            // InternalML2.g:2465:2: ( rule__HigherOrderClass__Group_1__0 )?
            {
             before(grammarAccess.getHigherOrderClassAccess().getGroup_1()); 
            // InternalML2.g:2466:2: ( rule__HigherOrderClass__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalML2.g:2466:3: rule__HigherOrderClass__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HigherOrderClass__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHigherOrderClassAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group__2"
    // InternalML2.g:2474:1: rule__HigherOrderClass__Group__2 : rule__HigherOrderClass__Group__2__Impl rule__HigherOrderClass__Group__3 ;
    public final void rule__HigherOrderClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2478:1: ( rule__HigherOrderClass__Group__2__Impl rule__HigherOrderClass__Group__3 )
            // InternalML2.g:2479:2: rule__HigherOrderClass__Group__2__Impl rule__HigherOrderClass__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__HigherOrderClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__2"


    // $ANTLR start "rule__HigherOrderClass__Group__2__Impl"
    // InternalML2.g:2486:1: rule__HigherOrderClass__Group__2__Impl : ( ( rule__HigherOrderClass__Group_2__0 )? ) ;
    public final void rule__HigherOrderClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2490:1: ( ( ( rule__HigherOrderClass__Group_2__0 )? ) )
            // InternalML2.g:2491:1: ( ( rule__HigherOrderClass__Group_2__0 )? )
            {
            // InternalML2.g:2491:1: ( ( rule__HigherOrderClass__Group_2__0 )? )
            // InternalML2.g:2492:2: ( rule__HigherOrderClass__Group_2__0 )?
            {
             before(grammarAccess.getHigherOrderClassAccess().getGroup_2()); 
            // InternalML2.g:2493:2: ( rule__HigherOrderClass__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalML2.g:2493:3: rule__HigherOrderClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HigherOrderClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHigherOrderClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__2__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group__3"
    // InternalML2.g:2501:1: rule__HigherOrderClass__Group__3 : rule__HigherOrderClass__Group__3__Impl rule__HigherOrderClass__Group__4 ;
    public final void rule__HigherOrderClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2505:1: ( rule__HigherOrderClass__Group__3__Impl rule__HigherOrderClass__Group__4 )
            // InternalML2.g:2506:2: rule__HigherOrderClass__Group__3__Impl rule__HigherOrderClass__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__HigherOrderClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__3"


    // $ANTLR start "rule__HigherOrderClass__Group__3__Impl"
    // InternalML2.g:2513:1: rule__HigherOrderClass__Group__3__Impl : ( ( rule__HigherOrderClass__Group_3__0 )? ) ;
    public final void rule__HigherOrderClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2517:1: ( ( ( rule__HigherOrderClass__Group_3__0 )? ) )
            // InternalML2.g:2518:1: ( ( rule__HigherOrderClass__Group_3__0 )? )
            {
            // InternalML2.g:2518:1: ( ( rule__HigherOrderClass__Group_3__0 )? )
            // InternalML2.g:2519:2: ( rule__HigherOrderClass__Group_3__0 )?
            {
             before(grammarAccess.getHigherOrderClassAccess().getGroup_3()); 
            // InternalML2.g:2520:2: ( rule__HigherOrderClass__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalML2.g:2520:3: rule__HigherOrderClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HigherOrderClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHigherOrderClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__3__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group__4"
    // InternalML2.g:2528:1: rule__HigherOrderClass__Group__4 : rule__HigherOrderClass__Group__4__Impl ;
    public final void rule__HigherOrderClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2532:1: ( rule__HigherOrderClass__Group__4__Impl )
            // InternalML2.g:2533:2: rule__HigherOrderClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__4"


    // $ANTLR start "rule__HigherOrderClass__Group__4__Impl"
    // InternalML2.g:2539:1: rule__HigherOrderClass__Group__4__Impl : ( ( rule__HigherOrderClass__Alternatives_4 )? ) ;
    public final void rule__HigherOrderClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2543:1: ( ( ( rule__HigherOrderClass__Alternatives_4 )? ) )
            // InternalML2.g:2544:1: ( ( rule__HigherOrderClass__Alternatives_4 )? )
            {
            // InternalML2.g:2544:1: ( ( rule__HigherOrderClass__Alternatives_4 )? )
            // InternalML2.g:2545:2: ( rule__HigherOrderClass__Alternatives_4 )?
            {
             before(grammarAccess.getHigherOrderClassAccess().getAlternatives_4()); 
            // InternalML2.g:2546:2: ( rule__HigherOrderClass__Alternatives_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=11 && LA34_0<=14)||LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalML2.g:2546:3: rule__HigherOrderClass__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__HigherOrderClass__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHigherOrderClassAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group__4__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_1__0"
    // InternalML2.g:2555:1: rule__HigherOrderClass__Group_1__0 : rule__HigherOrderClass__Group_1__0__Impl rule__HigherOrderClass__Group_1__1 ;
    public final void rule__HigherOrderClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2559:1: ( rule__HigherOrderClass__Group_1__0__Impl rule__HigherOrderClass__Group_1__1 )
            // InternalML2.g:2560:2: rule__HigherOrderClass__Group_1__0__Impl rule__HigherOrderClass__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1__0"


    // $ANTLR start "rule__HigherOrderClass__Group_1__0__Impl"
    // InternalML2.g:2567:1: rule__HigherOrderClass__Group_1__0__Impl : ( ':' ) ;
    public final void rule__HigherOrderClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2571:1: ( ( ':' ) )
            // InternalML2.g:2572:1: ( ':' )
            {
            // InternalML2.g:2572:1: ( ':' )
            // InternalML2.g:2573:2: ':'
            {
             before(grammarAccess.getHigherOrderClassAccess().getColonKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHigherOrderClassAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_1__1"
    // InternalML2.g:2582:1: rule__HigherOrderClass__Group_1__1 : rule__HigherOrderClass__Group_1__1__Impl rule__HigherOrderClass__Group_1__2 ;
    public final void rule__HigherOrderClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2586:1: ( rule__HigherOrderClass__Group_1__1__Impl rule__HigherOrderClass__Group_1__2 )
            // InternalML2.g:2587:2: rule__HigherOrderClass__Group_1__1__Impl rule__HigherOrderClass__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__HigherOrderClass__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1__1"


    // $ANTLR start "rule__HigherOrderClass__Group_1__1__Impl"
    // InternalML2.g:2594:1: rule__HigherOrderClass__Group_1__1__Impl : ( ( rule__HigherOrderClass__InstantiatesAssignment_1_1 ) ) ;
    public final void rule__HigherOrderClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2598:1: ( ( ( rule__HigherOrderClass__InstantiatesAssignment_1_1 ) ) )
            // InternalML2.g:2599:1: ( ( rule__HigherOrderClass__InstantiatesAssignment_1_1 ) )
            {
            // InternalML2.g:2599:1: ( ( rule__HigherOrderClass__InstantiatesAssignment_1_1 ) )
            // InternalML2.g:2600:2: ( rule__HigherOrderClass__InstantiatesAssignment_1_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getInstantiatesAssignment_1_1()); 
            // InternalML2.g:2601:2: ( rule__HigherOrderClass__InstantiatesAssignment_1_1 )
            // InternalML2.g:2601:3: rule__HigherOrderClass__InstantiatesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__InstantiatesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getInstantiatesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_1__2"
    // InternalML2.g:2609:1: rule__HigherOrderClass__Group_1__2 : rule__HigherOrderClass__Group_1__2__Impl ;
    public final void rule__HigherOrderClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2613:1: ( rule__HigherOrderClass__Group_1__2__Impl )
            // InternalML2.g:2614:2: rule__HigherOrderClass__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1__2"


    // $ANTLR start "rule__HigherOrderClass__Group_1__2__Impl"
    // InternalML2.g:2620:1: rule__HigherOrderClass__Group_1__2__Impl : ( ( rule__HigherOrderClass__Group_1_2__0 )* ) ;
    public final void rule__HigherOrderClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2624:1: ( ( ( rule__HigherOrderClass__Group_1_2__0 )* ) )
            // InternalML2.g:2625:1: ( ( rule__HigherOrderClass__Group_1_2__0 )* )
            {
            // InternalML2.g:2625:1: ( ( rule__HigherOrderClass__Group_1_2__0 )* )
            // InternalML2.g:2626:2: ( rule__HigherOrderClass__Group_1_2__0 )*
            {
             before(grammarAccess.getHigherOrderClassAccess().getGroup_1_2()); 
            // InternalML2.g:2627:2: ( rule__HigherOrderClass__Group_1_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalML2.g:2627:3: rule__HigherOrderClass__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HigherOrderClass__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getHigherOrderClassAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1__2__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_1_2__0"
    // InternalML2.g:2636:1: rule__HigherOrderClass__Group_1_2__0 : rule__HigherOrderClass__Group_1_2__0__Impl rule__HigherOrderClass__Group_1_2__1 ;
    public final void rule__HigherOrderClass__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2640:1: ( rule__HigherOrderClass__Group_1_2__0__Impl rule__HigherOrderClass__Group_1_2__1 )
            // InternalML2.g:2641:2: rule__HigherOrderClass__Group_1_2__0__Impl rule__HigherOrderClass__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1_2__0"


    // $ANTLR start "rule__HigherOrderClass__Group_1_2__0__Impl"
    // InternalML2.g:2648:1: rule__HigherOrderClass__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__HigherOrderClass__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2652:1: ( ( ',' ) )
            // InternalML2.g:2653:1: ( ',' )
            {
            // InternalML2.g:2653:1: ( ',' )
            // InternalML2.g:2654:2: ','
            {
             before(grammarAccess.getHigherOrderClassAccess().getCommaKeyword_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHigherOrderClassAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1_2__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_1_2__1"
    // InternalML2.g:2663:1: rule__HigherOrderClass__Group_1_2__1 : rule__HigherOrderClass__Group_1_2__1__Impl ;
    public final void rule__HigherOrderClass__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2667:1: ( rule__HigherOrderClass__Group_1_2__1__Impl )
            // InternalML2.g:2668:2: rule__HigherOrderClass__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1_2__1"


    // $ANTLR start "rule__HigherOrderClass__Group_1_2__1__Impl"
    // InternalML2.g:2674:1: rule__HigherOrderClass__Group_1_2__1__Impl : ( ( rule__HigherOrderClass__InstantiatesAssignment_1_2_1 ) ) ;
    public final void rule__HigherOrderClass__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2678:1: ( ( ( rule__HigherOrderClass__InstantiatesAssignment_1_2_1 ) ) )
            // InternalML2.g:2679:1: ( ( rule__HigherOrderClass__InstantiatesAssignment_1_2_1 ) )
            {
            // InternalML2.g:2679:1: ( ( rule__HigherOrderClass__InstantiatesAssignment_1_2_1 ) )
            // InternalML2.g:2680:2: ( rule__HigherOrderClass__InstantiatesAssignment_1_2_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getInstantiatesAssignment_1_2_1()); 
            // InternalML2.g:2681:2: ( rule__HigherOrderClass__InstantiatesAssignment_1_2_1 )
            // InternalML2.g:2681:3: rule__HigherOrderClass__InstantiatesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__InstantiatesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getInstantiatesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_1_2__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_2__0"
    // InternalML2.g:2690:1: rule__HigherOrderClass__Group_2__0 : rule__HigherOrderClass__Group_2__0__Impl rule__HigherOrderClass__Group_2__1 ;
    public final void rule__HigherOrderClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2694:1: ( rule__HigherOrderClass__Group_2__0__Impl rule__HigherOrderClass__Group_2__1 )
            // InternalML2.g:2695:2: rule__HigherOrderClass__Group_2__0__Impl rule__HigherOrderClass__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2__0"


    // $ANTLR start "rule__HigherOrderClass__Group_2__0__Impl"
    // InternalML2.g:2702:1: rule__HigherOrderClass__Group_2__0__Impl : ( 'specializes' ) ;
    public final void rule__HigherOrderClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2706:1: ( ( 'specializes' ) )
            // InternalML2.g:2707:1: ( 'specializes' )
            {
            // InternalML2.g:2707:1: ( 'specializes' )
            // InternalML2.g:2708:2: 'specializes'
            {
             before(grammarAccess.getHigherOrderClassAccess().getSpecializesKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHigherOrderClassAccess().getSpecializesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_2__1"
    // InternalML2.g:2717:1: rule__HigherOrderClass__Group_2__1 : rule__HigherOrderClass__Group_2__1__Impl rule__HigherOrderClass__Group_2__2 ;
    public final void rule__HigherOrderClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2721:1: ( rule__HigherOrderClass__Group_2__1__Impl rule__HigherOrderClass__Group_2__2 )
            // InternalML2.g:2722:2: rule__HigherOrderClass__Group_2__1__Impl rule__HigherOrderClass__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__HigherOrderClass__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2__1"


    // $ANTLR start "rule__HigherOrderClass__Group_2__1__Impl"
    // InternalML2.g:2729:1: rule__HigherOrderClass__Group_2__1__Impl : ( ( rule__HigherOrderClass__SuperClassesAssignment_2_1 ) ) ;
    public final void rule__HigherOrderClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2733:1: ( ( ( rule__HigherOrderClass__SuperClassesAssignment_2_1 ) ) )
            // InternalML2.g:2734:1: ( ( rule__HigherOrderClass__SuperClassesAssignment_2_1 ) )
            {
            // InternalML2.g:2734:1: ( ( rule__HigherOrderClass__SuperClassesAssignment_2_1 ) )
            // InternalML2.g:2735:2: ( rule__HigherOrderClass__SuperClassesAssignment_2_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSuperClassesAssignment_2_1()); 
            // InternalML2.g:2736:2: ( rule__HigherOrderClass__SuperClassesAssignment_2_1 )
            // InternalML2.g:2736:3: rule__HigherOrderClass__SuperClassesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__SuperClassesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getSuperClassesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_2__2"
    // InternalML2.g:2744:1: rule__HigherOrderClass__Group_2__2 : rule__HigherOrderClass__Group_2__2__Impl ;
    public final void rule__HigherOrderClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2748:1: ( rule__HigherOrderClass__Group_2__2__Impl )
            // InternalML2.g:2749:2: rule__HigherOrderClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2__2"


    // $ANTLR start "rule__HigherOrderClass__Group_2__2__Impl"
    // InternalML2.g:2755:1: rule__HigherOrderClass__Group_2__2__Impl : ( ( rule__HigherOrderClass__Group_2_2__0 )* ) ;
    public final void rule__HigherOrderClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2759:1: ( ( ( rule__HigherOrderClass__Group_2_2__0 )* ) )
            // InternalML2.g:2760:1: ( ( rule__HigherOrderClass__Group_2_2__0 )* )
            {
            // InternalML2.g:2760:1: ( ( rule__HigherOrderClass__Group_2_2__0 )* )
            // InternalML2.g:2761:2: ( rule__HigherOrderClass__Group_2_2__0 )*
            {
             before(grammarAccess.getHigherOrderClassAccess().getGroup_2_2()); 
            // InternalML2.g:2762:2: ( rule__HigherOrderClass__Group_2_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalML2.g:2762:3: rule__HigherOrderClass__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HigherOrderClass__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getHigherOrderClassAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2__2__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_2_2__0"
    // InternalML2.g:2771:1: rule__HigherOrderClass__Group_2_2__0 : rule__HigherOrderClass__Group_2_2__0__Impl rule__HigherOrderClass__Group_2_2__1 ;
    public final void rule__HigherOrderClass__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2775:1: ( rule__HigherOrderClass__Group_2_2__0__Impl rule__HigherOrderClass__Group_2_2__1 )
            // InternalML2.g:2776:2: rule__HigherOrderClass__Group_2_2__0__Impl rule__HigherOrderClass__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2_2__0"


    // $ANTLR start "rule__HigherOrderClass__Group_2_2__0__Impl"
    // InternalML2.g:2783:1: rule__HigherOrderClass__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__HigherOrderClass__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2787:1: ( ( ',' ) )
            // InternalML2.g:2788:1: ( ',' )
            {
            // InternalML2.g:2788:1: ( ',' )
            // InternalML2.g:2789:2: ','
            {
             before(grammarAccess.getHigherOrderClassAccess().getCommaKeyword_2_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHigherOrderClassAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2_2__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_2_2__1"
    // InternalML2.g:2798:1: rule__HigherOrderClass__Group_2_2__1 : rule__HigherOrderClass__Group_2_2__1__Impl ;
    public final void rule__HigherOrderClass__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2802:1: ( rule__HigherOrderClass__Group_2_2__1__Impl )
            // InternalML2.g:2803:2: rule__HigherOrderClass__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2_2__1"


    // $ANTLR start "rule__HigherOrderClass__Group_2_2__1__Impl"
    // InternalML2.g:2809:1: rule__HigherOrderClass__Group_2_2__1__Impl : ( ( rule__HigherOrderClass__SuperClassesAssignment_2_2_1 ) ) ;
    public final void rule__HigherOrderClass__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2813:1: ( ( ( rule__HigherOrderClass__SuperClassesAssignment_2_2_1 ) ) )
            // InternalML2.g:2814:1: ( ( rule__HigherOrderClass__SuperClassesAssignment_2_2_1 ) )
            {
            // InternalML2.g:2814:1: ( ( rule__HigherOrderClass__SuperClassesAssignment_2_2_1 ) )
            // InternalML2.g:2815:2: ( rule__HigherOrderClass__SuperClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSuperClassesAssignment_2_2_1()); 
            // InternalML2.g:2816:2: ( rule__HigherOrderClass__SuperClassesAssignment_2_2_1 )
            // InternalML2.g:2816:3: rule__HigherOrderClass__SuperClassesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__SuperClassesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getSuperClassesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_2_2__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_3__0"
    // InternalML2.g:2825:1: rule__HigherOrderClass__Group_3__0 : rule__HigherOrderClass__Group_3__0__Impl rule__HigherOrderClass__Group_3__1 ;
    public final void rule__HigherOrderClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2829:1: ( rule__HigherOrderClass__Group_3__0__Impl rule__HigherOrderClass__Group_3__1 )
            // InternalML2.g:2830:2: rule__HigherOrderClass__Group_3__0__Impl rule__HigherOrderClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3__0"


    // $ANTLR start "rule__HigherOrderClass__Group_3__0__Impl"
    // InternalML2.g:2837:1: rule__HigherOrderClass__Group_3__0__Impl : ( 'subordinatedTo' ) ;
    public final void rule__HigherOrderClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2841:1: ( ( 'subordinatedTo' ) )
            // InternalML2.g:2842:1: ( 'subordinatedTo' )
            {
            // InternalML2.g:2842:1: ( 'subordinatedTo' )
            // InternalML2.g:2843:2: 'subordinatedTo'
            {
             before(grammarAccess.getHigherOrderClassAccess().getSubordinatedToKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getHigherOrderClassAccess().getSubordinatedToKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_3__1"
    // InternalML2.g:2852:1: rule__HigherOrderClass__Group_3__1 : rule__HigherOrderClass__Group_3__1__Impl rule__HigherOrderClass__Group_3__2 ;
    public final void rule__HigherOrderClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2856:1: ( rule__HigherOrderClass__Group_3__1__Impl rule__HigherOrderClass__Group_3__2 )
            // InternalML2.g:2857:2: rule__HigherOrderClass__Group_3__1__Impl rule__HigherOrderClass__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__HigherOrderClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3__1"


    // $ANTLR start "rule__HigherOrderClass__Group_3__1__Impl"
    // InternalML2.g:2864:1: rule__HigherOrderClass__Group_3__1__Impl : ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_1 ) ) ;
    public final void rule__HigherOrderClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2868:1: ( ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_1 ) ) )
            // InternalML2.g:2869:1: ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_1 ) )
            {
            // InternalML2.g:2869:1: ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_1 ) )
            // InternalML2.g:2870:2: ( rule__HigherOrderClass__SubordinatorsAssignment_3_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSubordinatorsAssignment_3_1()); 
            // InternalML2.g:2871:2: ( rule__HigherOrderClass__SubordinatorsAssignment_3_1 )
            // InternalML2.g:2871:3: rule__HigherOrderClass__SubordinatorsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__SubordinatorsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getSubordinatorsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_3__2"
    // InternalML2.g:2879:1: rule__HigherOrderClass__Group_3__2 : rule__HigherOrderClass__Group_3__2__Impl ;
    public final void rule__HigherOrderClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2883:1: ( rule__HigherOrderClass__Group_3__2__Impl )
            // InternalML2.g:2884:2: rule__HigherOrderClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3__2"


    // $ANTLR start "rule__HigherOrderClass__Group_3__2__Impl"
    // InternalML2.g:2890:1: rule__HigherOrderClass__Group_3__2__Impl : ( ( rule__HigherOrderClass__Group_3_2__0 )* ) ;
    public final void rule__HigherOrderClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2894:1: ( ( ( rule__HigherOrderClass__Group_3_2__0 )* ) )
            // InternalML2.g:2895:1: ( ( rule__HigherOrderClass__Group_3_2__0 )* )
            {
            // InternalML2.g:2895:1: ( ( rule__HigherOrderClass__Group_3_2__0 )* )
            // InternalML2.g:2896:2: ( rule__HigherOrderClass__Group_3_2__0 )*
            {
             before(grammarAccess.getHigherOrderClassAccess().getGroup_3_2()); 
            // InternalML2.g:2897:2: ( rule__HigherOrderClass__Group_3_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalML2.g:2897:3: rule__HigherOrderClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__HigherOrderClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getHigherOrderClassAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3__2__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_3_2__0"
    // InternalML2.g:2906:1: rule__HigherOrderClass__Group_3_2__0 : rule__HigherOrderClass__Group_3_2__0__Impl rule__HigherOrderClass__Group_3_2__1 ;
    public final void rule__HigherOrderClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2910:1: ( rule__HigherOrderClass__Group_3_2__0__Impl rule__HigherOrderClass__Group_3_2__1 )
            // InternalML2.g:2911:2: rule__HigherOrderClass__Group_3_2__0__Impl rule__HigherOrderClass__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3_2__0"


    // $ANTLR start "rule__HigherOrderClass__Group_3_2__0__Impl"
    // InternalML2.g:2918:1: rule__HigherOrderClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__HigherOrderClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2922:1: ( ( ',' ) )
            // InternalML2.g:2923:1: ( ',' )
            {
            // InternalML2.g:2923:1: ( ',' )
            // InternalML2.g:2924:2: ','
            {
             before(grammarAccess.getHigherOrderClassAccess().getCommaKeyword_3_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHigherOrderClassAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3_2__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_3_2__1"
    // InternalML2.g:2933:1: rule__HigherOrderClass__Group_3_2__1 : rule__HigherOrderClass__Group_3_2__1__Impl ;
    public final void rule__HigherOrderClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2937:1: ( rule__HigherOrderClass__Group_3_2__1__Impl )
            // InternalML2.g:2938:2: rule__HigherOrderClass__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3_2__1"


    // $ANTLR start "rule__HigherOrderClass__Group_3_2__1__Impl"
    // InternalML2.g:2944:1: rule__HigherOrderClass__Group_3_2__1__Impl : ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_2_1 ) ) ;
    public final void rule__HigherOrderClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2948:1: ( ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_2_1 ) ) )
            // InternalML2.g:2949:1: ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_2_1 ) )
            {
            // InternalML2.g:2949:1: ( ( rule__HigherOrderClass__SubordinatorsAssignment_3_2_1 ) )
            // InternalML2.g:2950:2: ( rule__HigherOrderClass__SubordinatorsAssignment_3_2_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSubordinatorsAssignment_3_2_1()); 
            // InternalML2.g:2951:2: ( rule__HigherOrderClass__SubordinatorsAssignment_3_2_1 )
            // InternalML2.g:2951:3: rule__HigherOrderClass__SubordinatorsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__SubordinatorsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getSubordinatorsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_3_2__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_4_0__0"
    // InternalML2.g:2960:1: rule__HigherOrderClass__Group_4_0__0 : rule__HigherOrderClass__Group_4_0__0__Impl rule__HigherOrderClass__Group_4_0__1 ;
    public final void rule__HigherOrderClass__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2964:1: ( rule__HigherOrderClass__Group_4_0__0__Impl rule__HigherOrderClass__Group_4_0__1 )
            // InternalML2.g:2965:2: rule__HigherOrderClass__Group_4_0__0__Impl rule__HigherOrderClass__Group_4_0__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_0__0"


    // $ANTLR start "rule__HigherOrderClass__Group_4_0__0__Impl"
    // InternalML2.g:2972:1: rule__HigherOrderClass__Group_4_0__0__Impl : ( ( rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0 ) ) ;
    public final void rule__HigherOrderClass__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2976:1: ( ( ( rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0 ) ) )
            // InternalML2.g:2977:1: ( ( rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0 ) )
            {
            // InternalML2.g:2977:1: ( ( rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0 ) )
            // InternalML2.g:2978:2: ( rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getCategorizationTypeAssignment_4_0_0()); 
            // InternalML2.g:2979:2: ( rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0 )
            // InternalML2.g:2979:3: rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getCategorizationTypeAssignment_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_0__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_4_0__1"
    // InternalML2.g:2987:1: rule__HigherOrderClass__Group_4_0__1 : rule__HigherOrderClass__Group_4_0__1__Impl ;
    public final void rule__HigherOrderClass__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2991:1: ( rule__HigherOrderClass__Group_4_0__1__Impl )
            // InternalML2.g:2992:2: rule__HigherOrderClass__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_0__1"


    // $ANTLR start "rule__HigherOrderClass__Group_4_0__1__Impl"
    // InternalML2.g:2998:1: rule__HigherOrderClass__Group_4_0__1__Impl : ( ( rule__HigherOrderClass__CategorizedClassAssignment_4_0_1 ) ) ;
    public final void rule__HigherOrderClass__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3002:1: ( ( ( rule__HigherOrderClass__CategorizedClassAssignment_4_0_1 ) ) )
            // InternalML2.g:3003:1: ( ( rule__HigherOrderClass__CategorizedClassAssignment_4_0_1 ) )
            {
            // InternalML2.g:3003:1: ( ( rule__HigherOrderClass__CategorizedClassAssignment_4_0_1 ) )
            // InternalML2.g:3004:2: ( rule__HigherOrderClass__CategorizedClassAssignment_4_0_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getCategorizedClassAssignment_4_0_1()); 
            // InternalML2.g:3005:2: ( rule__HigherOrderClass__CategorizedClassAssignment_4_0_1 )
            // InternalML2.g:3005:3: rule__HigherOrderClass__CategorizedClassAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__CategorizedClassAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getCategorizedClassAssignment_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_0__1__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_4_1__0"
    // InternalML2.g:3014:1: rule__HigherOrderClass__Group_4_1__0 : rule__HigherOrderClass__Group_4_1__0__Impl rule__HigherOrderClass__Group_4_1__1 ;
    public final void rule__HigherOrderClass__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3018:1: ( rule__HigherOrderClass__Group_4_1__0__Impl rule__HigherOrderClass__Group_4_1__1 )
            // InternalML2.g:3019:2: rule__HigherOrderClass__Group_4_1__0__Impl rule__HigherOrderClass__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__HigherOrderClass__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_1__0"


    // $ANTLR start "rule__HigherOrderClass__Group_4_1__0__Impl"
    // InternalML2.g:3026:1: rule__HigherOrderClass__Group_4_1__0__Impl : ( 'isPowertypeOf' ) ;
    public final void rule__HigherOrderClass__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3030:1: ( ( 'isPowertypeOf' ) )
            // InternalML2.g:3031:1: ( 'isPowertypeOf' )
            {
            // InternalML2.g:3031:1: ( 'isPowertypeOf' )
            // InternalML2.g:3032:2: 'isPowertypeOf'
            {
             before(grammarAccess.getHigherOrderClassAccess().getIsPowertypeOfKeyword_4_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHigherOrderClassAccess().getIsPowertypeOfKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_1__0__Impl"


    // $ANTLR start "rule__HigherOrderClass__Group_4_1__1"
    // InternalML2.g:3041:1: rule__HigherOrderClass__Group_4_1__1 : rule__HigherOrderClass__Group_4_1__1__Impl ;
    public final void rule__HigherOrderClass__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3045:1: ( rule__HigherOrderClass__Group_4_1__1__Impl )
            // InternalML2.g:3046:2: rule__HigherOrderClass__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_1__1"


    // $ANTLR start "rule__HigherOrderClass__Group_4_1__1__Impl"
    // InternalML2.g:3052:1: rule__HigherOrderClass__Group_4_1__1__Impl : ( ( rule__HigherOrderClass__PowertypeOfAssignment_4_1_1 ) ) ;
    public final void rule__HigherOrderClass__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3056:1: ( ( ( rule__HigherOrderClass__PowertypeOfAssignment_4_1_1 ) ) )
            // InternalML2.g:3057:1: ( ( rule__HigherOrderClass__PowertypeOfAssignment_4_1_1 ) )
            {
            // InternalML2.g:3057:1: ( ( rule__HigherOrderClass__PowertypeOfAssignment_4_1_1 ) )
            // InternalML2.g:3058:2: ( rule__HigherOrderClass__PowertypeOfAssignment_4_1_1 )
            {
             before(grammarAccess.getHigherOrderClassAccess().getPowertypeOfAssignment_4_1_1()); 
            // InternalML2.g:3059:2: ( rule__HigherOrderClass__PowertypeOfAssignment_4_1_1 )
            // InternalML2.g:3059:3: rule__HigherOrderClass__PowertypeOfAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HigherOrderClass__PowertypeOfAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHigherOrderClassAccess().getPowertypeOfAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__Group_4_1__1__Impl"


    // $ANTLR start "rule__FOClass__Group__0"
    // InternalML2.g:3068:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3072:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalML2.g:3073:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FOClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FOClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__0"


    // $ANTLR start "rule__FOClass__Group__0__Impl"
    // InternalML2.g:3080:1: rule__FOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3084:1: ( ( 'class' ) )
            // InternalML2.g:3085:1: ( 'class' )
            {
            // InternalML2.g:3085:1: ( 'class' )
            // InternalML2.g:3086:2: 'class'
            {
             before(grammarAccess.getFOClassAccess().getClassKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__0__Impl"


    // $ANTLR start "rule__FOClass__Group__1"
    // InternalML2.g:3095:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3099:1: ( rule__FOClass__Group__1__Impl )
            // InternalML2.g:3100:2: rule__FOClass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__1"


    // $ANTLR start "rule__FOClass__Group__1__Impl"
    // InternalML2.g:3106:1: rule__FOClass__Group__1__Impl : ( ( rule__FOClass__NameAssignment_1 ) ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3110:1: ( ( ( rule__FOClass__NameAssignment_1 ) ) )
            // InternalML2.g:3111:1: ( ( rule__FOClass__NameAssignment_1 ) )
            {
            // InternalML2.g:3111:1: ( ( rule__FOClass__NameAssignment_1 ) )
            // InternalML2.g:3112:2: ( rule__FOClass__NameAssignment_1 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_1()); 
            // InternalML2.g:3113:2: ( rule__FOClass__NameAssignment_1 )
            // InternalML2.g:3113:3: rule__FOClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FOClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFOClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalML2.g:3122:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3126:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalML2.g:3127:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalML2.g:3134:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3138:1: ( ( 'datatype' ) )
            // InternalML2.g:3139:1: ( 'datatype' )
            {
            // InternalML2.g:3139:1: ( 'datatype' )
            // InternalML2.g:3140:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalML2.g:3149:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3153:1: ( rule__DataType__Group__1__Impl )
            // InternalML2.g:3154:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalML2.g:3160:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3164:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalML2.g:3165:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalML2.g:3165:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalML2.g:3166:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalML2.g:3167:2: ( rule__DataType__NameAssignment_1 )
            // InternalML2.g:3167:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__HOClass__Group__0"
    // InternalML2.g:3176:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3180:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalML2.g:3181:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__HOClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__0"


    // $ANTLR start "rule__HOClass__Group__0__Impl"
    // InternalML2.g:3188:1: rule__HOClass__Group__0__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3192:1: ( ( 'order' ) )
            // InternalML2.g:3193:1: ( 'order' )
            {
            // InternalML2.g:3193:1: ( 'order' )
            // InternalML2.g:3194:2: 'order'
            {
             before(grammarAccess.getHOClassAccess().getOrderKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getOrderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__0__Impl"


    // $ANTLR start "rule__HOClass__Group__1"
    // InternalML2.g:3203:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3207:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalML2.g:3208:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__HOClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__1"


    // $ANTLR start "rule__HOClass__Group__1__Impl"
    // InternalML2.g:3215:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__OrderAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3219:1: ( ( ( rule__HOClass__OrderAssignment_1 ) ) )
            // InternalML2.g:3220:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            {
            // InternalML2.g:3220:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            // InternalML2.g:3221:2: ( rule__HOClass__OrderAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 
            // InternalML2.g:3222:2: ( rule__HOClass__OrderAssignment_1 )
            // InternalML2.g:3222:3: rule__HOClass__OrderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__OrderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__1__Impl"


    // $ANTLR start "rule__HOClass__Group__2"
    // InternalML2.g:3230:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3234:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalML2.g:3235:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__HOClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HOClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__2"


    // $ANTLR start "rule__HOClass__Group__2__Impl"
    // InternalML2.g:3242:1: rule__HOClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3246:1: ( ( 'class' ) )
            // InternalML2.g:3247:1: ( 'class' )
            {
            // InternalML2.g:3247:1: ( 'class' )
            // InternalML2.g:3248:2: 'class'
            {
             before(grammarAccess.getHOClassAccess().getClassKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__2__Impl"


    // $ANTLR start "rule__HOClass__Group__3"
    // InternalML2.g:3257:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3261:1: ( rule__HOClass__Group__3__Impl )
            // InternalML2.g:3262:2: rule__HOClass__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__3"


    // $ANTLR start "rule__HOClass__Group__3__Impl"
    // InternalML2.g:3268:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__NameAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3272:1: ( ( ( rule__HOClass__NameAssignment_3 ) ) )
            // InternalML2.g:3273:1: ( ( rule__HOClass__NameAssignment_3 ) )
            {
            // InternalML2.g:3273:1: ( ( rule__HOClass__NameAssignment_3 ) )
            // InternalML2.g:3274:2: ( rule__HOClass__NameAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_3()); 
            // InternalML2.g:3275:2: ( rule__HOClass__NameAssignment_3 )
            // InternalML2.g:3275:3: rule__HOClass__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HOClass__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHOClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__Group__3__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__0"
    // InternalML2.g:3284:1: rule__OrderlessClass__Group__0 : rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 ;
    public final void rule__OrderlessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3288:1: ( rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 )
            // InternalML2.g:3289:2: rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OrderlessClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__0"


    // $ANTLR start "rule__OrderlessClass__Group__0__Impl"
    // InternalML2.g:3296:1: rule__OrderlessClass__Group__0__Impl : ( 'orderless' ) ;
    public final void rule__OrderlessClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3300:1: ( ( 'orderless' ) )
            // InternalML2.g:3301:1: ( 'orderless' )
            {
            // InternalML2.g:3301:1: ( 'orderless' )
            // InternalML2.g:3302:2: 'orderless'
            {
             before(grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__0__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__1"
    // InternalML2.g:3311:1: rule__OrderlessClass__Group__1 : rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 ;
    public final void rule__OrderlessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3315:1: ( rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 )
            // InternalML2.g:3316:2: rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__OrderlessClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__1"


    // $ANTLR start "rule__OrderlessClass__Group__1__Impl"
    // InternalML2.g:3323:1: rule__OrderlessClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__OrderlessClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3327:1: ( ( 'class' ) )
            // InternalML2.g:3328:1: ( 'class' )
            {
            // InternalML2.g:3328:1: ( 'class' )
            // InternalML2.g:3329:2: 'class'
            {
             before(grammarAccess.getOrderlessClassAccess().getClassKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__1__Impl"


    // $ANTLR start "rule__OrderlessClass__Group__2"
    // InternalML2.g:3338:1: rule__OrderlessClass__Group__2 : rule__OrderlessClass__Group__2__Impl ;
    public final void rule__OrderlessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3342:1: ( rule__OrderlessClass__Group__2__Impl )
            // InternalML2.g:3343:2: rule__OrderlessClass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__2"


    // $ANTLR start "rule__OrderlessClass__Group__2__Impl"
    // InternalML2.g:3349:1: rule__OrderlessClass__Group__2__Impl : ( ( rule__OrderlessClass__NameAssignment_2 ) ) ;
    public final void rule__OrderlessClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3353:1: ( ( ( rule__OrderlessClass__NameAssignment_2 ) ) )
            // InternalML2.g:3354:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            {
            // InternalML2.g:3354:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            // InternalML2.g:3355:2: ( rule__OrderlessClass__NameAssignment_2 )
            {
             before(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 
            // InternalML2.g:3356:2: ( rule__OrderlessClass__NameAssignment_2 )
            // InternalML2.g:3356:3: rule__OrderlessClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrderlessClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__Group__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__0"
    // InternalML2.g:3365:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3369:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalML2.g:3370:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__GeneralizationSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0"


    // $ANTLR start "rule__GeneralizationSet__Group__0__Impl"
    // InternalML2.g:3377:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3381:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) )
            // InternalML2.g:3382:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            {
            // InternalML2.g:3382:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            // InternalML2.g:3383:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0()); 
            // InternalML2.g:3384:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            // InternalML2.g:3384:3: rule__GeneralizationSet__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__1"
    // InternalML2.g:3392:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3396:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalML2.g:3397:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__GeneralizationSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1"


    // $ANTLR start "rule__GeneralizationSet__Group__1__Impl"
    // InternalML2.g:3404:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3408:1: ( ( 'genset' ) )
            // InternalML2.g:3409:1: ( 'genset' )
            {
            // InternalML2.g:3409:1: ( 'genset' )
            // InternalML2.g:3410:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__2"
    // InternalML2.g:3419:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3423:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalML2.g:3424:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__GeneralizationSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2"


    // $ANTLR start "rule__GeneralizationSet__Group__2__Impl"
    // InternalML2.g:3431:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3435:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalML2.g:3436:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalML2.g:3436:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalML2.g:3437:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalML2.g:3438:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalML2.g:3438:3: rule__GeneralizationSet__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__3"
    // InternalML2.g:3446:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3450:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalML2.g:3451:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3"


    // $ANTLR start "rule__GeneralizationSet__Group__3__Impl"
    // InternalML2.g:3458:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3462:1: ( ( 'general' ) )
            // InternalML2.g:3463:1: ( 'general' )
            {
            // InternalML2.g:3463:1: ( 'general' )
            // InternalML2.g:3464:2: 'general'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__4"
    // InternalML2.g:3473:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3477:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalML2.g:3478:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__GeneralizationSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__4"


    // $ANTLR start "rule__GeneralizationSet__Group__4__Impl"
    // InternalML2.g:3485:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3489:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalML2.g:3490:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalML2.g:3490:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalML2.g:3491:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalML2.g:3492:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalML2.g:3492:3: rule__GeneralizationSet__GeneralAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__GeneralAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__4__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__5"
    // InternalML2.g:3500:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3504:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalML2.g:3505:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__GeneralizationSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__5"


    // $ANTLR start "rule__GeneralizationSet__Group__5__Impl"
    // InternalML2.g:3512:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3516:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalML2.g:3517:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalML2.g:3517:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalML2.g:3518:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalML2.g:3519:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalML2.g:3519:3: rule__GeneralizationSet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__5__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__6"
    // InternalML2.g:3527:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3531:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalML2.g:3532:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__6"


    // $ANTLR start "rule__GeneralizationSet__Group__6__Impl"
    // InternalML2.g:3539:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3543:1: ( ( 'specifics' ) )
            // InternalML2.g:3544:1: ( 'specifics' )
            {
            // InternalML2.g:3544:1: ( 'specifics' )
            // InternalML2.g:3545:2: 'specifics'
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__6__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__7"
    // InternalML2.g:3554:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3558:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalML2.g:3559:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__GeneralizationSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__7"


    // $ANTLR start "rule__GeneralizationSet__Group__7__Impl"
    // InternalML2.g:3566:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3570:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalML2.g:3571:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalML2.g:3571:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalML2.g:3572:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalML2.g:3573:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalML2.g:3573:3: rule__GeneralizationSet__SpecificsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__SpecificsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__7__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__8"
    // InternalML2.g:3581:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3585:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalML2.g:3586:2: rule__GeneralizationSet__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__8"


    // $ANTLR start "rule__GeneralizationSet__Group__8__Impl"
    // InternalML2.g:3592:1: rule__GeneralizationSet__Group__8__Impl : ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3596:1: ( ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) )
            // InternalML2.g:3597:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            {
            // InternalML2.g:3597:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalML2.g:3598:2: ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalML2.g:3598:2: ( ( rule__GeneralizationSet__Group_8__0 ) )
            // InternalML2.g:3599:3: ( rule__GeneralizationSet__Group_8__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalML2.g:3600:3: ( rule__GeneralizationSet__Group_8__0 )
            // InternalML2.g:3600:4: rule__GeneralizationSet__Group_8__0
            {
            pushFollow(FOLLOW_13);
            rule__GeneralizationSet__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }

            // InternalML2.g:3603:2: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalML2.g:3604:3: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalML2.g:3605:3: ( rule__GeneralizationSet__Group_8__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==34) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalML2.g:3605:4: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__8__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_5__0"
    // InternalML2.g:3615:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3619:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalML2.g:3620:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__0"


    // $ANTLR start "rule__GeneralizationSet__Group_5__0__Impl"
    // InternalML2.g:3627:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3631:1: ( ( 'categorizer' ) )
            // InternalML2.g:3632:1: ( 'categorizer' )
            {
            // InternalML2.g:3632:1: ( 'categorizer' )
            // InternalML2.g:3633:2: 'categorizer'
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_5__1"
    // InternalML2.g:3642:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3646:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalML2.g:3647:2: rule__GeneralizationSet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__1"


    // $ANTLR start "rule__GeneralizationSet__Group_5__1__Impl"
    // InternalML2.g:3653:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3657:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalML2.g:3658:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalML2.g:3658:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalML2.g:3659:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalML2.g:3660:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalML2.g:3660:3: rule__GeneralizationSet__CategorizerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__CategorizerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_5__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_8__0"
    // InternalML2.g:3669:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3673:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalML2.g:3674:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__GeneralizationSet__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__0"


    // $ANTLR start "rule__GeneralizationSet__Group_8__0__Impl"
    // InternalML2.g:3681:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3685:1: ( ( ',' ) )
            // InternalML2.g:3686:1: ( ',' )
            {
            // InternalML2.g:3686:1: ( ',' )
            // InternalML2.g:3687:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_8__1"
    // InternalML2.g:3696:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3700:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalML2.g:3701:2: rule__GeneralizationSet__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__1"


    // $ANTLR start "rule__GeneralizationSet__Group_8__1__Impl"
    // InternalML2.g:3707:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3711:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalML2.g:3712:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalML2.g:3712:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalML2.g:3713:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalML2.g:3714:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalML2.g:3714:3: rule__GeneralizationSet__SpecificsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__SpecificsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_8__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalML2.g:3723:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3727:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalML2.g:3728:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalML2.g:3735:1: rule__Attribute__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3739:1: ( ( ( 'att' )? ) )
            // InternalML2.g:3740:1: ( ( 'att' )? )
            {
            // InternalML2.g:3740:1: ( ( 'att' )? )
            // InternalML2.g:3741:2: ( 'att' )?
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            // InternalML2.g:3742:2: ( 'att' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalML2.g:3742:3: 'att'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAttKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalML2.g:3750:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3754:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalML2.g:3755:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalML2.g:3762:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3766:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalML2.g:3767:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalML2.g:3767:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalML2.g:3768:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalML2.g:3769:2: ( rule__Attribute__NameAssignment_1 )
            // InternalML2.g:3769:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalML2.g:3777:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3781:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalML2.g:3782:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalML2.g:3789:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3793:1: ( ( ':' ) )
            // InternalML2.g:3794:1: ( ':' )
            {
            // InternalML2.g:3794:1: ( ':' )
            // InternalML2.g:3795:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalML2.g:3804:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3808:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalML2.g:3809:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalML2.g:3816:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Alternatives_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3820:1: ( ( ( rule__Attribute__Alternatives_3 ) ) )
            // InternalML2.g:3821:1: ( ( rule__Attribute__Alternatives_3 ) )
            {
            // InternalML2.g:3821:1: ( ( rule__Attribute__Alternatives_3 ) )
            // InternalML2.g:3822:2: ( rule__Attribute__Alternatives_3 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_3()); 
            // InternalML2.g:3823:2: ( rule__Attribute__Alternatives_3 )
            // InternalML2.g:3823:3: rule__Attribute__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalML2.g:3831:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3835:1: ( rule__Attribute__Group__4__Impl )
            // InternalML2.g:3836:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalML2.g:3842:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3846:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // InternalML2.g:3847:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // InternalML2.g:3847:1: ( ( rule__Attribute__Group_4__0 )? )
            // InternalML2.g:3848:2: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // InternalML2.g:3849:2: ( rule__Attribute__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:3849:3: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // InternalML2.g:3858:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3862:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // InternalML2.g:3863:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // InternalML2.g:3870:1: rule__Attribute__Group_4__0__Impl : ( 'subsets' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3874:1: ( ( 'subsets' ) )
            // InternalML2.g:3875:1: ( 'subsets' )
            {
            // InternalML2.g:3875:1: ( 'subsets' )
            // InternalML2.g:3876:2: 'subsets'
            {
             before(grammarAccess.getAttributeAccess().getSubsetsKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSubsetsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // InternalML2.g:3885:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3889:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // InternalML2.g:3890:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // InternalML2.g:3897:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3901:1: ( ( ( rule__Attribute__SubsetOfAssignment_4_1 ) ) )
            // InternalML2.g:3902:1: ( ( rule__Attribute__SubsetOfAssignment_4_1 ) )
            {
            // InternalML2.g:3902:1: ( ( rule__Attribute__SubsetOfAssignment_4_1 ) )
            // InternalML2.g:3903:2: ( rule__Attribute__SubsetOfAssignment_4_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_4_1()); 
            // InternalML2.g:3904:2: ( rule__Attribute__SubsetOfAssignment_4_1 )
            // InternalML2.g:3904:3: rule__Attribute__SubsetOfAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__SubsetOfAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__2"
    // InternalML2.g:3912:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3916:1: ( rule__Attribute__Group_4__2__Impl )
            // InternalML2.g:3917:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2"


    // $ANTLR start "rule__Attribute__Group_4__2__Impl"
    // InternalML2.g:3923:1: rule__Attribute__Group_4__2__Impl : ( ( rule__Attribute__Group_4_2__0 )* ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3927:1: ( ( ( rule__Attribute__Group_4_2__0 )* ) )
            // InternalML2.g:3928:1: ( ( rule__Attribute__Group_4_2__0 )* )
            {
            // InternalML2.g:3928:1: ( ( rule__Attribute__Group_4_2__0 )* )
            // InternalML2.g:3929:2: ( rule__Attribute__Group_4_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_4_2()); 
            // InternalML2.g:3930:2: ( rule__Attribute__Group_4_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==34) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalML2.g:3930:3: rule__Attribute__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__0"
    // InternalML2.g:3939:1: rule__Attribute__Group_4_2__0 : rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 ;
    public final void rule__Attribute__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3943:1: ( rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 )
            // InternalML2.g:3944:2: rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__0"


    // $ANTLR start "rule__Attribute__Group_4_2__0__Impl"
    // InternalML2.g:3951:1: rule__Attribute__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3955:1: ( ( ',' ) )
            // InternalML2.g:3956:1: ( ',' )
            {
            // InternalML2.g:3956:1: ( ',' )
            // InternalML2.g:3957:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__1"
    // InternalML2.g:3966:1: rule__Attribute__Group_4_2__1 : rule__Attribute__Group_4_2__1__Impl ;
    public final void rule__Attribute__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3970:1: ( rule__Attribute__Group_4_2__1__Impl )
            // InternalML2.g:3971:2: rule__Attribute__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__1"


    // $ANTLR start "rule__Attribute__Group_4_2__1__Impl"
    // InternalML2.g:3977:1: rule__Attribute__Group_4_2__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_4_2_1 ) ) ;
    public final void rule__Attribute__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3981:1: ( ( ( rule__Attribute__SubsetOfAssignment_4_2_1 ) ) )
            // InternalML2.g:3982:1: ( ( rule__Attribute__SubsetOfAssignment_4_2_1 ) )
            {
            // InternalML2.g:3982:1: ( ( rule__Attribute__SubsetOfAssignment_4_2_1 ) )
            // InternalML2.g:3983:2: ( rule__Attribute__SubsetOfAssignment_4_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_4_2_1()); 
            // InternalML2.g:3984:2: ( rule__Attribute__SubsetOfAssignment_4_2_1 )
            // InternalML2.g:3984:3: rule__Attribute__SubsetOfAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__SubsetOfAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalML2.g:3993:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3997:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalML2.g:3998:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalML2.g:4005:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4009:1: ( ( 'ref' ) )
            // InternalML2.g:4010:1: ( 'ref' )
            {
            // InternalML2.g:4010:1: ( 'ref' )
            // InternalML2.g:4011:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalML2.g:4020:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4024:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalML2.g:4025:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalML2.g:4032:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4036:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalML2.g:4037:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalML2.g:4037:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalML2.g:4038:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalML2.g:4039:2: ( rule__Reference__NameAssignment_1 )
            // InternalML2.g:4039:3: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalML2.g:4047:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4051:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalML2.g:4052:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalML2.g:4059:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4063:1: ( ( ':' ) )
            // InternalML2.g:4064:1: ( ':' )
            {
            // InternalML2.g:4064:1: ( ':' )
            // InternalML2.g:4065:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalML2.g:4074:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4078:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalML2.g:4079:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalML2.g:4086:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4090:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalML2.g:4091:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalML2.g:4091:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalML2.g:4092:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalML2.g:4093:2: ( rule__Reference__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalML2.g:4093:3: rule__Reference__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalML2.g:4101:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4105:1: ( rule__Reference__Group__4__Impl )
            // InternalML2.g:4106:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalML2.g:4112:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4116:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // InternalML2.g:4117:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // InternalML2.g:4117:1: ( ( rule__Reference__Group_4__0 )? )
            // InternalML2.g:4118:2: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // InternalML2.g:4119:2: ( rule__Reference__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalML2.g:4119:3: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group_3__0"
    // InternalML2.g:4128:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4132:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalML2.g:4133:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0"


    // $ANTLR start "rule__Reference__Group_3__0__Impl"
    // InternalML2.g:4140:1: rule__Reference__Group_3__0__Impl : ( 'subsets' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4144:1: ( ( 'subsets' ) )
            // InternalML2.g:4145:1: ( 'subsets' )
            {
            // InternalML2.g:4145:1: ( 'subsets' )
            // InternalML2.g:4146:2: 'subsets'
            {
             before(grammarAccess.getReferenceAccess().getSubsetsKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getSubsetsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0__Impl"


    // $ANTLR start "rule__Reference__Group_3__1"
    // InternalML2.g:4155:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4159:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalML2.g:4160:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__Reference__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1"


    // $ANTLR start "rule__Reference__Group_3__1__Impl"
    // InternalML2.g:4167:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__SubsetOfAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4171:1: ( ( ( rule__Reference__SubsetOfAssignment_3_1 ) ) )
            // InternalML2.g:4172:1: ( ( rule__Reference__SubsetOfAssignment_3_1 ) )
            {
            // InternalML2.g:4172:1: ( ( rule__Reference__SubsetOfAssignment_3_1 ) )
            // InternalML2.g:4173:2: ( rule__Reference__SubsetOfAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_3_1()); 
            // InternalML2.g:4174:2: ( rule__Reference__SubsetOfAssignment_3_1 )
            // InternalML2.g:4174:3: rule__Reference__SubsetOfAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__SubsetOfAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getSubsetOfAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1__Impl"


    // $ANTLR start "rule__Reference__Group_3__2"
    // InternalML2.g:4182:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4186:1: ( rule__Reference__Group_3__2__Impl )
            // InternalML2.g:4187:2: rule__Reference__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__2"


    // $ANTLR start "rule__Reference__Group_3__2__Impl"
    // InternalML2.g:4193:1: rule__Reference__Group_3__2__Impl : ( ( rule__Reference__Group_3_2__0 )* ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4197:1: ( ( ( rule__Reference__Group_3_2__0 )* ) )
            // InternalML2.g:4198:1: ( ( rule__Reference__Group_3_2__0 )* )
            {
            // InternalML2.g:4198:1: ( ( rule__Reference__Group_3_2__0 )* )
            // InternalML2.g:4199:2: ( rule__Reference__Group_3_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_3_2()); 
            // InternalML2.g:4200:2: ( rule__Reference__Group_3_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==34) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalML2.g:4200:3: rule__Reference__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Reference__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__2__Impl"


    // $ANTLR start "rule__Reference__Group_3_2__0"
    // InternalML2.g:4209:1: rule__Reference__Group_3_2__0 : rule__Reference__Group_3_2__0__Impl rule__Reference__Group_3_2__1 ;
    public final void rule__Reference__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4213:1: ( rule__Reference__Group_3_2__0__Impl rule__Reference__Group_3_2__1 )
            // InternalML2.g:4214:2: rule__Reference__Group_3_2__0__Impl rule__Reference__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3_2__0"


    // $ANTLR start "rule__Reference__Group_3_2__0__Impl"
    // InternalML2.g:4221:1: rule__Reference__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4225:1: ( ( ',' ) )
            // InternalML2.g:4226:1: ( ',' )
            {
            // InternalML2.g:4226:1: ( ',' )
            // InternalML2.g:4227:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_3_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_3_2__1"
    // InternalML2.g:4236:1: rule__Reference__Group_3_2__1 : rule__Reference__Group_3_2__1__Impl ;
    public final void rule__Reference__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4240:1: ( rule__Reference__Group_3_2__1__Impl )
            // InternalML2.g:4241:2: rule__Reference__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3_2__1"


    // $ANTLR start "rule__Reference__Group_3_2__1__Impl"
    // InternalML2.g:4247:1: rule__Reference__Group_3_2__1__Impl : ( ( rule__Reference__SubsetOfAssignment_3_2_1 ) ) ;
    public final void rule__Reference__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4251:1: ( ( ( rule__Reference__SubsetOfAssignment_3_2_1 ) ) )
            // InternalML2.g:4252:1: ( ( rule__Reference__SubsetOfAssignment_3_2_1 ) )
            {
            // InternalML2.g:4252:1: ( ( rule__Reference__SubsetOfAssignment_3_2_1 ) )
            // InternalML2.g:4253:2: ( rule__Reference__SubsetOfAssignment_3_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_3_2_1()); 
            // InternalML2.g:4254:2: ( rule__Reference__SubsetOfAssignment_3_2_1 )
            // InternalML2.g:4254:3: rule__Reference__SubsetOfAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__SubsetOfAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getSubsetOfAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3_2__1__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // InternalML2.g:4263:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4267:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // InternalML2.g:4268:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // InternalML2.g:4275:1: rule__Reference__Group_4__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4279:1: ( ( 'isOppositeTo' ) )
            // InternalML2.g:4280:1: ( 'isOppositeTo' )
            {
            // InternalML2.g:4280:1: ( 'isOppositeTo' )
            // InternalML2.g:4281:2: 'isOppositeTo'
            {
             before(grammarAccess.getReferenceAccess().getIsOppositeToKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getIsOppositeToKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // InternalML2.g:4290:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4294:1: ( rule__Reference__Group_4__1__Impl )
            // InternalML2.g:4295:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // InternalML2.g:4301:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeToAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4305:1: ( ( ( rule__Reference__OppositeToAssignment_4_1 ) ) )
            // InternalML2.g:4306:1: ( ( rule__Reference__OppositeToAssignment_4_1 ) )
            {
            // InternalML2.g:4306:1: ( ( rule__Reference__OppositeToAssignment_4_1 ) )
            // InternalML2.g:4307:2: ( rule__Reference__OppositeToAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToAssignment_4_1()); 
            // InternalML2.g:4308:2: ( rule__Reference__OppositeToAssignment_4_1 )
            // InternalML2.g:4308:3: rule__Reference__OppositeToAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__OppositeToAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeToAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__0"
    // InternalML2.g:4317:1: rule__RegularityAttribute__Group__0 : rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 ;
    public final void rule__RegularityAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4321:1: ( rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 )
            // InternalML2.g:4322:2: rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__RegularityAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__0"


    // $ANTLR start "rule__RegularityAttribute__Group__0__Impl"
    // InternalML2.g:4329:1: rule__RegularityAttribute__Group__0__Impl : ( 'regularity' ) ;
    public final void rule__RegularityAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4333:1: ( ( 'regularity' ) )
            // InternalML2.g:4334:1: ( 'regularity' )
            {
            // InternalML2.g:4334:1: ( 'regularity' )
            // InternalML2.g:4335:2: 'regularity'
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__1"
    // InternalML2.g:4344:1: rule__RegularityAttribute__Group__1 : rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 ;
    public final void rule__RegularityAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4348:1: ( rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 )
            // InternalML2.g:4349:2: rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__RegularityAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__1"


    // $ANTLR start "rule__RegularityAttribute__Group__1__Impl"
    // InternalML2.g:4356:1: rule__RegularityAttribute__Group__1__Impl : ( ( 'att' )? ) ;
    public final void rule__RegularityAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4360:1: ( ( ( 'att' )? ) )
            // InternalML2.g:4361:1: ( ( 'att' )? )
            {
            // InternalML2.g:4361:1: ( ( 'att' )? )
            // InternalML2.g:4362:2: ( 'att' )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getAttKeyword_1()); 
            // InternalML2.g:4363:2: ( 'att' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalML2.g:4363:3: 'att'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRegularityAttributeAccess().getAttKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__2"
    // InternalML2.g:4371:1: rule__RegularityAttribute__Group__2 : rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 ;
    public final void rule__RegularityAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4375:1: ( rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 )
            // InternalML2.g:4376:2: rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RegularityAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__2"


    // $ANTLR start "rule__RegularityAttribute__Group__2__Impl"
    // InternalML2.g:4383:1: rule__RegularityAttribute__Group__2__Impl : ( ( rule__RegularityAttribute__NameAssignment_2 ) ) ;
    public final void rule__RegularityAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4387:1: ( ( ( rule__RegularityAttribute__NameAssignment_2 ) ) )
            // InternalML2.g:4388:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            {
            // InternalML2.g:4388:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            // InternalML2.g:4389:2: ( rule__RegularityAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getNameAssignment_2()); 
            // InternalML2.g:4390:2: ( rule__RegularityAttribute__NameAssignment_2 )
            // InternalML2.g:4390:3: rule__RegularityAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__2__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__3"
    // InternalML2.g:4398:1: rule__RegularityAttribute__Group__3 : rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 ;
    public final void rule__RegularityAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4402:1: ( rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 )
            // InternalML2.g:4403:2: rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__RegularityAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__3"


    // $ANTLR start "rule__RegularityAttribute__Group__3__Impl"
    // InternalML2.g:4410:1: rule__RegularityAttribute__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4414:1: ( ( ':' ) )
            // InternalML2.g:4415:1: ( ':' )
            {
            // InternalML2.g:4415:1: ( ':' )
            // InternalML2.g:4416:2: ':'
            {
             before(grammarAccess.getRegularityAttributeAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__3__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__4"
    // InternalML2.g:4425:1: rule__RegularityAttribute__Group__4 : rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 ;
    public final void rule__RegularityAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4429:1: ( rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 )
            // InternalML2.g:4430:2: rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__RegularityAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__4"


    // $ANTLR start "rule__RegularityAttribute__Group__4__Impl"
    // InternalML2.g:4437:1: rule__RegularityAttribute__Group__4__Impl : ( ( rule__RegularityAttribute__Alternatives_4 ) ) ;
    public final void rule__RegularityAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4441:1: ( ( ( rule__RegularityAttribute__Alternatives_4 ) ) )
            // InternalML2.g:4442:1: ( ( rule__RegularityAttribute__Alternatives_4 ) )
            {
            // InternalML2.g:4442:1: ( ( rule__RegularityAttribute__Alternatives_4 ) )
            // InternalML2.g:4443:2: ( rule__RegularityAttribute__Alternatives_4 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getAlternatives_4()); 
            // InternalML2.g:4444:2: ( rule__RegularityAttribute__Alternatives_4 )
            // InternalML2.g:4444:3: rule__RegularityAttribute__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__4__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__5"
    // InternalML2.g:4452:1: rule__RegularityAttribute__Group__5 : rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 ;
    public final void rule__RegularityAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4456:1: ( rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 )
            // InternalML2.g:4457:2: rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__RegularityAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__5"


    // $ANTLR start "rule__RegularityAttribute__Group__5__Impl"
    // InternalML2.g:4464:1: rule__RegularityAttribute__Group__5__Impl : ( ( rule__RegularityAttribute__Group_5__0 )? ) ;
    public final void rule__RegularityAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4468:1: ( ( ( rule__RegularityAttribute__Group_5__0 )? ) )
            // InternalML2.g:4469:1: ( ( rule__RegularityAttribute__Group_5__0 )? )
            {
            // InternalML2.g:4469:1: ( ( rule__RegularityAttribute__Group_5__0 )? )
            // InternalML2.g:4470:2: ( rule__RegularityAttribute__Group_5__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_5()); 
            // InternalML2.g:4471:2: ( rule__RegularityAttribute__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalML2.g:4471:3: rule__RegularityAttribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__5__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__6"
    // InternalML2.g:4479:1: rule__RegularityAttribute__Group__6 : rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 ;
    public final void rule__RegularityAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4483:1: ( rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 )
            // InternalML2.g:4484:2: rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__6"


    // $ANTLR start "rule__RegularityAttribute__Group__6__Impl"
    // InternalML2.g:4491:1: rule__RegularityAttribute__Group__6__Impl : ( ( rule__RegularityAttribute__RegularityTypeAssignment_6 ) ) ;
    public final void rule__RegularityAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4495:1: ( ( ( rule__RegularityAttribute__RegularityTypeAssignment_6 ) ) )
            // InternalML2.g:4496:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_6 ) )
            {
            // InternalML2.g:4496:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_6 ) )
            // InternalML2.g:4497:2: ( rule__RegularityAttribute__RegularityTypeAssignment_6 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityTypeAssignment_6()); 
            // InternalML2.g:4498:2: ( rule__RegularityAttribute__RegularityTypeAssignment_6 )
            // InternalML2.g:4498:3: rule__RegularityAttribute__RegularityTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__RegularityTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getRegularityTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__6__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__7"
    // InternalML2.g:4506:1: rule__RegularityAttribute__Group__7 : rule__RegularityAttribute__Group__7__Impl ;
    public final void rule__RegularityAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4510:1: ( rule__RegularityAttribute__Group__7__Impl )
            // InternalML2.g:4511:2: rule__RegularityAttribute__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__7"


    // $ANTLR start "rule__RegularityAttribute__Group__7__Impl"
    // InternalML2.g:4517:1: rule__RegularityAttribute__Group__7__Impl : ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_7 ) ) ;
    public final void rule__RegularityAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4521:1: ( ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_7 ) ) )
            // InternalML2.g:4522:1: ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_7 ) )
            {
            // InternalML2.g:4522:1: ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_7 ) )
            // InternalML2.g:4523:2: ( rule__RegularityAttribute__RegulatedFeatureAssignment_7 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureAssignment_7()); 
            // InternalML2.g:4524:2: ( rule__RegularityAttribute__RegulatedFeatureAssignment_7 )
            // InternalML2.g:4524:3: rule__RegularityAttribute__RegulatedFeatureAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__RegulatedFeatureAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group__7__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_5__0"
    // InternalML2.g:4533:1: rule__RegularityAttribute__Group_5__0 : rule__RegularityAttribute__Group_5__0__Impl rule__RegularityAttribute__Group_5__1 ;
    public final void rule__RegularityAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4537:1: ( rule__RegularityAttribute__Group_5__0__Impl rule__RegularityAttribute__Group_5__1 )
            // InternalML2.g:4538:2: rule__RegularityAttribute__Group_5__0__Impl rule__RegularityAttribute__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5__0"


    // $ANTLR start "rule__RegularityAttribute__Group_5__0__Impl"
    // InternalML2.g:4545:1: rule__RegularityAttribute__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4549:1: ( ( 'subsets' ) )
            // InternalML2.g:4550:1: ( 'subsets' )
            {
            // InternalML2.g:4550:1: ( 'subsets' )
            // InternalML2.g:4551:2: 'subsets'
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_5__1"
    // InternalML2.g:4560:1: rule__RegularityAttribute__Group_5__1 : rule__RegularityAttribute__Group_5__1__Impl rule__RegularityAttribute__Group_5__2 ;
    public final void rule__RegularityAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4564:1: ( rule__RegularityAttribute__Group_5__1__Impl rule__RegularityAttribute__Group_5__2 )
            // InternalML2.g:4565:2: rule__RegularityAttribute__Group_5__1__Impl rule__RegularityAttribute__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__RegularityAttribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5__1"


    // $ANTLR start "rule__RegularityAttribute__Group_5__1__Impl"
    // InternalML2.g:4572:1: rule__RegularityAttribute__Group_5__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__RegularityAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4576:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_5_1 ) ) )
            // InternalML2.g:4577:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_5_1 ) )
            {
            // InternalML2.g:4577:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_5_1 ) )
            // InternalML2.g:4578:2: ( rule__RegularityAttribute__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_5_1()); 
            // InternalML2.g:4579:2: ( rule__RegularityAttribute__SubsetOfAssignment_5_1 )
            // InternalML2.g:4579:3: rule__RegularityAttribute__SubsetOfAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__SubsetOfAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_5__2"
    // InternalML2.g:4587:1: rule__RegularityAttribute__Group_5__2 : rule__RegularityAttribute__Group_5__2__Impl ;
    public final void rule__RegularityAttribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4591:1: ( rule__RegularityAttribute__Group_5__2__Impl )
            // InternalML2.g:4592:2: rule__RegularityAttribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5__2"


    // $ANTLR start "rule__RegularityAttribute__Group_5__2__Impl"
    // InternalML2.g:4598:1: rule__RegularityAttribute__Group_5__2__Impl : ( ( rule__RegularityAttribute__Group_5_2__0 )* ) ;
    public final void rule__RegularityAttribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4602:1: ( ( ( rule__RegularityAttribute__Group_5_2__0 )* ) )
            // InternalML2.g:4603:1: ( ( rule__RegularityAttribute__Group_5_2__0 )* )
            {
            // InternalML2.g:4603:1: ( ( rule__RegularityAttribute__Group_5_2__0 )* )
            // InternalML2.g:4604:2: ( rule__RegularityAttribute__Group_5_2__0 )*
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_5_2()); 
            // InternalML2.g:4605:2: ( rule__RegularityAttribute__Group_5_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==34) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalML2.g:4605:3: rule__RegularityAttribute__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityAttribute__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getRegularityAttributeAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5__2__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_5_2__0"
    // InternalML2.g:4614:1: rule__RegularityAttribute__Group_5_2__0 : rule__RegularityAttribute__Group_5_2__0__Impl rule__RegularityAttribute__Group_5_2__1 ;
    public final void rule__RegularityAttribute__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4618:1: ( rule__RegularityAttribute__Group_5_2__0__Impl rule__RegularityAttribute__Group_5_2__1 )
            // InternalML2.g:4619:2: rule__RegularityAttribute__Group_5_2__0__Impl rule__RegularityAttribute__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5_2__0"


    // $ANTLR start "rule__RegularityAttribute__Group_5_2__0__Impl"
    // InternalML2.g:4626:1: rule__RegularityAttribute__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityAttribute__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4630:1: ( ( ',' ) )
            // InternalML2.g:4631:1: ( ',' )
            {
            // InternalML2.g:4631:1: ( ',' )
            // InternalML2.g:4632:2: ','
            {
             before(grammarAccess.getRegularityAttributeAccess().getCommaKeyword_5_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5_2__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_5_2__1"
    // InternalML2.g:4641:1: rule__RegularityAttribute__Group_5_2__1 : rule__RegularityAttribute__Group_5_2__1__Impl ;
    public final void rule__RegularityAttribute__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4645:1: ( rule__RegularityAttribute__Group_5_2__1__Impl )
            // InternalML2.g:4646:2: rule__RegularityAttribute__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5_2__1"


    // $ANTLR start "rule__RegularityAttribute__Group_5_2__1__Impl"
    // InternalML2.g:4652:1: rule__RegularityAttribute__Group_5_2__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__RegularityAttribute__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4656:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_5_2_1 ) ) )
            // InternalML2.g:4657:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalML2.g:4657:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_5_2_1 ) )
            // InternalML2.g:4658:2: ( rule__RegularityAttribute__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalML2.g:4659:2: ( rule__RegularityAttribute__SubsetOfAssignment_5_2_1 )
            // InternalML2.g:4659:3: rule__RegularityAttribute__SubsetOfAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__SubsetOfAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__Group_5_2__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group__0"
    // InternalML2.g:4668:1: rule__RegularityReference__Group__0 : rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 ;
    public final void rule__RegularityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4672:1: ( rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 )
            // InternalML2.g:4673:2: rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__RegularityReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__0"


    // $ANTLR start "rule__RegularityReference__Group__0__Impl"
    // InternalML2.g:4680:1: rule__RegularityReference__Group__0__Impl : ( 'regularity' ) ;
    public final void rule__RegularityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4684:1: ( ( 'regularity' ) )
            // InternalML2.g:4685:1: ( 'regularity' )
            {
            // InternalML2.g:4685:1: ( 'regularity' )
            // InternalML2.g:4686:2: 'regularity'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group__1"
    // InternalML2.g:4695:1: rule__RegularityReference__Group__1 : rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 ;
    public final void rule__RegularityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4699:1: ( rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 )
            // InternalML2.g:4700:2: rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__1"


    // $ANTLR start "rule__RegularityReference__Group__1__Impl"
    // InternalML2.g:4707:1: rule__RegularityReference__Group__1__Impl : ( 'ref' ) ;
    public final void rule__RegularityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4711:1: ( ( 'ref' ) )
            // InternalML2.g:4712:1: ( 'ref' )
            {
            // InternalML2.g:4712:1: ( 'ref' )
            // InternalML2.g:4713:2: 'ref'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRefKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getRefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group__2"
    // InternalML2.g:4722:1: rule__RegularityReference__Group__2 : rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 ;
    public final void rule__RegularityReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4726:1: ( rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 )
            // InternalML2.g:4727:2: rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RegularityReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__2"


    // $ANTLR start "rule__RegularityReference__Group__2__Impl"
    // InternalML2.g:4734:1: rule__RegularityReference__Group__2__Impl : ( ( rule__RegularityReference__NameAssignment_2 ) ) ;
    public final void rule__RegularityReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4738:1: ( ( ( rule__RegularityReference__NameAssignment_2 ) ) )
            // InternalML2.g:4739:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            {
            // InternalML2.g:4739:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            // InternalML2.g:4740:2: ( rule__RegularityReference__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getNameAssignment_2()); 
            // InternalML2.g:4741:2: ( rule__RegularityReference__NameAssignment_2 )
            // InternalML2.g:4741:3: rule__RegularityReference__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__2__Impl"


    // $ANTLR start "rule__RegularityReference__Group__3"
    // InternalML2.g:4749:1: rule__RegularityReference__Group__3 : rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 ;
    public final void rule__RegularityReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4753:1: ( rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 )
            // InternalML2.g:4754:2: rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__RegularityReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__3"


    // $ANTLR start "rule__RegularityReference__Group__3__Impl"
    // InternalML2.g:4761:1: rule__RegularityReference__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4765:1: ( ( ':' ) )
            // InternalML2.g:4766:1: ( ':' )
            {
            // InternalML2.g:4766:1: ( ':' )
            // InternalML2.g:4767:2: ':'
            {
             before(grammarAccess.getRegularityReferenceAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__3__Impl"


    // $ANTLR start "rule__RegularityReference__Group__4"
    // InternalML2.g:4776:1: rule__RegularityReference__Group__4 : rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 ;
    public final void rule__RegularityReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4780:1: ( rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 )
            // InternalML2.g:4781:2: rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__RegularityReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__4"


    // $ANTLR start "rule__RegularityReference__Group__4__Impl"
    // InternalML2.g:4788:1: rule__RegularityReference__Group__4__Impl : ( ( rule__RegularityReference__Group_4__0 )? ) ;
    public final void rule__RegularityReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4792:1: ( ( ( rule__RegularityReference__Group_4__0 )? ) )
            // InternalML2.g:4793:1: ( ( rule__RegularityReference__Group_4__0 )? )
            {
            // InternalML2.g:4793:1: ( ( rule__RegularityReference__Group_4__0 )? )
            // InternalML2.g:4794:2: ( rule__RegularityReference__Group_4__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_4()); 
            // InternalML2.g:4795:2: ( rule__RegularityReference__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalML2.g:4795:3: rule__RegularityReference__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__4__Impl"


    // $ANTLR start "rule__RegularityReference__Group__5"
    // InternalML2.g:4803:1: rule__RegularityReference__Group__5 : rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 ;
    public final void rule__RegularityReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4807:1: ( rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 )
            // InternalML2.g:4808:2: rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__RegularityReference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__5"


    // $ANTLR start "rule__RegularityReference__Group__5__Impl"
    // InternalML2.g:4815:1: rule__RegularityReference__Group__5__Impl : ( ( rule__RegularityReference__Group_5__0 )? ) ;
    public final void rule__RegularityReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4819:1: ( ( ( rule__RegularityReference__Group_5__0 )? ) )
            // InternalML2.g:4820:1: ( ( rule__RegularityReference__Group_5__0 )? )
            {
            // InternalML2.g:4820:1: ( ( rule__RegularityReference__Group_5__0 )? )
            // InternalML2.g:4821:2: ( rule__RegularityReference__Group_5__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_5()); 
            // InternalML2.g:4822:2: ( rule__RegularityReference__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalML2.g:4822:3: rule__RegularityReference__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__5__Impl"


    // $ANTLR start "rule__RegularityReference__Group__6"
    // InternalML2.g:4830:1: rule__RegularityReference__Group__6 : rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 ;
    public final void rule__RegularityReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4834:1: ( rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 )
            // InternalML2.g:4835:2: rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__6"


    // $ANTLR start "rule__RegularityReference__Group__6__Impl"
    // InternalML2.g:4842:1: rule__RegularityReference__Group__6__Impl : ( ( rule__RegularityReference__RegularityTypeAssignment_6 ) ) ;
    public final void rule__RegularityReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4846:1: ( ( ( rule__RegularityReference__RegularityTypeAssignment_6 ) ) )
            // InternalML2.g:4847:1: ( ( rule__RegularityReference__RegularityTypeAssignment_6 ) )
            {
            // InternalML2.g:4847:1: ( ( rule__RegularityReference__RegularityTypeAssignment_6 ) )
            // InternalML2.g:4848:2: ( rule__RegularityReference__RegularityTypeAssignment_6 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityTypeAssignment_6()); 
            // InternalML2.g:4849:2: ( rule__RegularityReference__RegularityTypeAssignment_6 )
            // InternalML2.g:4849:3: rule__RegularityReference__RegularityTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__RegularityTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getRegularityTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__6__Impl"


    // $ANTLR start "rule__RegularityReference__Group__7"
    // InternalML2.g:4857:1: rule__RegularityReference__Group__7 : rule__RegularityReference__Group__7__Impl ;
    public final void rule__RegularityReference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4861:1: ( rule__RegularityReference__Group__7__Impl )
            // InternalML2.g:4862:2: rule__RegularityReference__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__7"


    // $ANTLR start "rule__RegularityReference__Group__7__Impl"
    // InternalML2.g:4868:1: rule__RegularityReference__Group__7__Impl : ( ( rule__RegularityReference__RegulatedFeatureAssignment_7 ) ) ;
    public final void rule__RegularityReference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4872:1: ( ( ( rule__RegularityReference__RegulatedFeatureAssignment_7 ) ) )
            // InternalML2.g:4873:1: ( ( rule__RegularityReference__RegulatedFeatureAssignment_7 ) )
            {
            // InternalML2.g:4873:1: ( ( rule__RegularityReference__RegulatedFeatureAssignment_7 ) )
            // InternalML2.g:4874:2: ( rule__RegularityReference__RegulatedFeatureAssignment_7 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureAssignment_7()); 
            // InternalML2.g:4875:2: ( rule__RegularityReference__RegulatedFeatureAssignment_7 )
            // InternalML2.g:4875:3: rule__RegularityReference__RegulatedFeatureAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__RegulatedFeatureAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group__7__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__0"
    // InternalML2.g:4884:1: rule__RegularityReference__Group_4__0 : rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 ;
    public final void rule__RegularityReference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4888:1: ( rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 )
            // InternalML2.g:4889:2: rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__0"


    // $ANTLR start "rule__RegularityReference__Group_4__0__Impl"
    // InternalML2.g:4896:1: rule__RegularityReference__Group_4__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityReference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4900:1: ( ( 'subsets' ) )
            // InternalML2.g:4901:1: ( 'subsets' )
            {
            // InternalML2.g:4901:1: ( 'subsets' )
            // InternalML2.g:4902:2: 'subsets'
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__1"
    // InternalML2.g:4911:1: rule__RegularityReference__Group_4__1 : rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 ;
    public final void rule__RegularityReference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4915:1: ( rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 )
            // InternalML2.g:4916:2: rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__RegularityReference__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__1"


    // $ANTLR start "rule__RegularityReference__Group_4__1__Impl"
    // InternalML2.g:4923:1: rule__RegularityReference__Group_4__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_4_1 ) ) ;
    public final void rule__RegularityReference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4927:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_4_1 ) ) )
            // InternalML2.g:4928:1: ( ( rule__RegularityReference__SubsetOfAssignment_4_1 ) )
            {
            // InternalML2.g:4928:1: ( ( rule__RegularityReference__SubsetOfAssignment_4_1 ) )
            // InternalML2.g:4929:2: ( rule__RegularityReference__SubsetOfAssignment_4_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_4_1()); 
            // InternalML2.g:4930:2: ( rule__RegularityReference__SubsetOfAssignment_4_1 )
            // InternalML2.g:4930:3: rule__RegularityReference__SubsetOfAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__SubsetOfAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__2"
    // InternalML2.g:4938:1: rule__RegularityReference__Group_4__2 : rule__RegularityReference__Group_4__2__Impl ;
    public final void rule__RegularityReference__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4942:1: ( rule__RegularityReference__Group_4__2__Impl )
            // InternalML2.g:4943:2: rule__RegularityReference__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__2"


    // $ANTLR start "rule__RegularityReference__Group_4__2__Impl"
    // InternalML2.g:4949:1: rule__RegularityReference__Group_4__2__Impl : ( ( rule__RegularityReference__Group_4_2__0 )* ) ;
    public final void rule__RegularityReference__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4953:1: ( ( ( rule__RegularityReference__Group_4_2__0 )* ) )
            // InternalML2.g:4954:1: ( ( rule__RegularityReference__Group_4_2__0 )* )
            {
            // InternalML2.g:4954:1: ( ( rule__RegularityReference__Group_4_2__0 )* )
            // InternalML2.g:4955:2: ( rule__RegularityReference__Group_4_2__0 )*
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_4_2()); 
            // InternalML2.g:4956:2: ( rule__RegularityReference__Group_4_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalML2.g:4956:3: rule__RegularityReference__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityReference__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getRegularityReferenceAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4__2__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4_2__0"
    // InternalML2.g:4965:1: rule__RegularityReference__Group_4_2__0 : rule__RegularityReference__Group_4_2__0__Impl rule__RegularityReference__Group_4_2__1 ;
    public final void rule__RegularityReference__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4969:1: ( rule__RegularityReference__Group_4_2__0__Impl rule__RegularityReference__Group_4_2__1 )
            // InternalML2.g:4970:2: rule__RegularityReference__Group_4_2__0__Impl rule__RegularityReference__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4_2__0"


    // $ANTLR start "rule__RegularityReference__Group_4_2__0__Impl"
    // InternalML2.g:4977:1: rule__RegularityReference__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityReference__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4981:1: ( ( ',' ) )
            // InternalML2.g:4982:1: ( ',' )
            {
            // InternalML2.g:4982:1: ( ',' )
            // InternalML2.g:4983:2: ','
            {
             before(grammarAccess.getRegularityReferenceAccess().getCommaKeyword_4_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4_2__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4_2__1"
    // InternalML2.g:4992:1: rule__RegularityReference__Group_4_2__1 : rule__RegularityReference__Group_4_2__1__Impl ;
    public final void rule__RegularityReference__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4996:1: ( rule__RegularityReference__Group_4_2__1__Impl )
            // InternalML2.g:4997:2: rule__RegularityReference__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4_2__1"


    // $ANTLR start "rule__RegularityReference__Group_4_2__1__Impl"
    // InternalML2.g:5003:1: rule__RegularityReference__Group_4_2__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_4_2_1 ) ) ;
    public final void rule__RegularityReference__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5007:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_4_2_1 ) ) )
            // InternalML2.g:5008:1: ( ( rule__RegularityReference__SubsetOfAssignment_4_2_1 ) )
            {
            // InternalML2.g:5008:1: ( ( rule__RegularityReference__SubsetOfAssignment_4_2_1 ) )
            // InternalML2.g:5009:2: ( rule__RegularityReference__SubsetOfAssignment_4_2_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_4_2_1()); 
            // InternalML2.g:5010:2: ( rule__RegularityReference__SubsetOfAssignment_4_2_1 )
            // InternalML2.g:5010:3: rule__RegularityReference__SubsetOfAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__SubsetOfAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_4_2__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_5__0"
    // InternalML2.g:5019:1: rule__RegularityReference__Group_5__0 : rule__RegularityReference__Group_5__0__Impl rule__RegularityReference__Group_5__1 ;
    public final void rule__RegularityReference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5023:1: ( rule__RegularityReference__Group_5__0__Impl rule__RegularityReference__Group_5__1 )
            // InternalML2.g:5024:2: rule__RegularityReference__Group_5__0__Impl rule__RegularityReference__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_5__0"


    // $ANTLR start "rule__RegularityReference__Group_5__0__Impl"
    // InternalML2.g:5031:1: rule__RegularityReference__Group_5__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__RegularityReference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5035:1: ( ( 'isOppositeTo' ) )
            // InternalML2.g:5036:1: ( 'isOppositeTo' )
            {
            // InternalML2.g:5036:1: ( 'isOppositeTo' )
            // InternalML2.g:5037:2: 'isOppositeTo'
            {
             before(grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_5__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_5__1"
    // InternalML2.g:5046:1: rule__RegularityReference__Group_5__1 : rule__RegularityReference__Group_5__1__Impl ;
    public final void rule__RegularityReference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5050:1: ( rule__RegularityReference__Group_5__1__Impl )
            // InternalML2.g:5051:2: rule__RegularityReference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_5__1"


    // $ANTLR start "rule__RegularityReference__Group_5__1__Impl"
    // InternalML2.g:5057:1: rule__RegularityReference__Group_5__1__Impl : ( ( rule__RegularityReference__OppositeToAssignment_5_1 ) ) ;
    public final void rule__RegularityReference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5061:1: ( ( ( rule__RegularityReference__OppositeToAssignment_5_1 ) ) )
            // InternalML2.g:5062:1: ( ( rule__RegularityReference__OppositeToAssignment_5_1 ) )
            {
            // InternalML2.g:5062:1: ( ( rule__RegularityReference__OppositeToAssignment_5_1 ) )
            // InternalML2.g:5063:2: ( rule__RegularityReference__OppositeToAssignment_5_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToAssignment_5_1()); 
            // InternalML2.g:5064:2: ( rule__RegularityReference__OppositeToAssignment_5_1 )
            // InternalML2.g:5064:3: rule__RegularityReference__OppositeToAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__OppositeToAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__Group_5__1__Impl"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__0"
    // InternalML2.g:5073:1: rule__SingleAttributeAssignment__Group__0 : rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1 ;
    public final void rule__SingleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5077:1: ( rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1 )
            // InternalML2.g:5078:2: rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__SingleAttributeAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__0"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__0__Impl"
    // InternalML2.g:5085:1: rule__SingleAttributeAssignment__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__SingleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5089:1: ( ( ( 'att' )? ) )
            // InternalML2.g:5090:1: ( ( 'att' )? )
            {
            // InternalML2.g:5090:1: ( ( 'att' )? )
            // InternalML2.g:5091:2: ( 'att' )?
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0()); 
            // InternalML2.g:5092:2: ( 'att' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalML2.g:5092:3: 'att'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__0__Impl"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__1"
    // InternalML2.g:5100:1: rule__SingleAttributeAssignment__Group__1 : rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2 ;
    public final void rule__SingleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5104:1: ( rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2 )
            // InternalML2.g:5105:2: rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__SingleAttributeAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__1"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__1__Impl"
    // InternalML2.g:5112:1: rule__SingleAttributeAssignment__Group__1__Impl : ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__SingleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5116:1: ( ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalML2.g:5117:1: ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalML2.g:5117:1: ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) )
            // InternalML2.g:5118:2: ( rule__SingleAttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalML2.g:5119:2: ( rule__SingleAttributeAssignment__AttributeAssignment_1 )
            // InternalML2.g:5119:3: rule__SingleAttributeAssignment__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__1__Impl"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__2"
    // InternalML2.g:5127:1: rule__SingleAttributeAssignment__Group__2 : rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3 ;
    public final void rule__SingleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5131:1: ( rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3 )
            // InternalML2.g:5132:2: rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SingleAttributeAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__2"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__2__Impl"
    // InternalML2.g:5139:1: rule__SingleAttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__SingleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5143:1: ( ( '=' ) )
            // InternalML2.g:5144:1: ( '=' )
            {
            // InternalML2.g:5144:1: ( '=' )
            // InternalML2.g:5145:2: '='
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__2__Impl"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__3"
    // InternalML2.g:5154:1: rule__SingleAttributeAssignment__Group__3 : rule__SingleAttributeAssignment__Group__3__Impl ;
    public final void rule__SingleAttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5158:1: ( rule__SingleAttributeAssignment__Group__3__Impl )
            // InternalML2.g:5159:2: rule__SingleAttributeAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__3"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__3__Impl"
    // InternalML2.g:5165:1: rule__SingleAttributeAssignment__Group__3__Impl : ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3 ) ) ;
    public final void rule__SingleAttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5169:1: ( ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3 ) ) )
            // InternalML2.g:5170:1: ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3 ) )
            {
            // InternalML2.g:5170:1: ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3 ) )
            // InternalML2.g:5171:2: ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_3()); 
            // InternalML2.g:5172:2: ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3 )
            // InternalML2.g:5172:3: rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__Group__3__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__0"
    // InternalML2.g:5181:1: rule__ReferenceAssignment__Group__0 : rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 ;
    public final void rule__ReferenceAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5185:1: ( rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 )
            // InternalML2.g:5186:2: rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReferenceAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__0"


    // $ANTLR start "rule__ReferenceAssignment__Group__0__Impl"
    // InternalML2.g:5193:1: rule__ReferenceAssignment__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5197:1: ( ( 'ref' ) )
            // InternalML2.g:5198:1: ( 'ref' )
            {
            // InternalML2.g:5198:1: ( 'ref' )
            // InternalML2.g:5199:2: 'ref'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__0__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__1"
    // InternalML2.g:5208:1: rule__ReferenceAssignment__Group__1 : rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 ;
    public final void rule__ReferenceAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5212:1: ( rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 )
            // InternalML2.g:5213:2: rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ReferenceAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__1"


    // $ANTLR start "rule__ReferenceAssignment__Group__1__Impl"
    // InternalML2.g:5220:1: rule__ReferenceAssignment__Group__1__Impl : ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5224:1: ( ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) )
            // InternalML2.g:5225:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            {
            // InternalML2.g:5225:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            // InternalML2.g:5226:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 
            // InternalML2.g:5227:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            // InternalML2.g:5227:3: rule__ReferenceAssignment__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__1__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__2"
    // InternalML2.g:5235:1: rule__ReferenceAssignment__Group__2 : rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 ;
    public final void rule__ReferenceAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5239:1: ( rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 )
            // InternalML2.g:5240:2: rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ReferenceAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__2"


    // $ANTLR start "rule__ReferenceAssignment__Group__2__Impl"
    // InternalML2.g:5247:1: rule__ReferenceAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__ReferenceAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5251:1: ( ( '=' ) )
            // InternalML2.g:5252:1: ( '=' )
            {
            // InternalML2.g:5252:1: ( '=' )
            // InternalML2.g:5253:2: '='
            {
             before(grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__2__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__3"
    // InternalML2.g:5262:1: rule__ReferenceAssignment__Group__3 : rule__ReferenceAssignment__Group__3__Impl ;
    public final void rule__ReferenceAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5266:1: ( rule__ReferenceAssignment__Group__3__Impl )
            // InternalML2.g:5267:2: rule__ReferenceAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__3"


    // $ANTLR start "rule__ReferenceAssignment__Group__3__Impl"
    // InternalML2.g:5273:1: rule__ReferenceAssignment__Group__3__Impl : ( ( rule__ReferenceAssignment__Alternatives_3 ) ) ;
    public final void rule__ReferenceAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5277:1: ( ( ( rule__ReferenceAssignment__Alternatives_3 ) ) )
            // InternalML2.g:5278:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            {
            // InternalML2.g:5278:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            // InternalML2.g:5279:2: ( rule__ReferenceAssignment__Alternatives_3 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 
            // InternalML2.g:5280:2: ( rule__ReferenceAssignment__Alternatives_3 )
            // InternalML2.g:5280:3: rule__ReferenceAssignment__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group__3__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__0"
    // InternalML2.g:5289:1: rule__ReferenceAssignment__Group_3_1__0 : rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 ;
    public final void rule__ReferenceAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5293:1: ( rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 )
            // InternalML2.g:5294:2: rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ReferenceAssignment__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__0"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__0__Impl"
    // InternalML2.g:5301:1: rule__ReferenceAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5305:1: ( ( '{' ) )
            // InternalML2.g:5306:1: ( '{' )
            {
            // InternalML2.g:5306:1: ( '{' )
            // InternalML2.g:5307:2: '{'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__0__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__1"
    // InternalML2.g:5316:1: rule__ReferenceAssignment__Group_3_1__1 : rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 ;
    public final void rule__ReferenceAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5320:1: ( rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 )
            // InternalML2.g:5321:2: rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_36);
            rule__ReferenceAssignment__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__1"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__1__Impl"
    // InternalML2.g:5328:1: rule__ReferenceAssignment__Group_3_1__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5332:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalML2.g:5333:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalML2.g:5333:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalML2.g:5334:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalML2.g:5335:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            // InternalML2.g:5335:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__AssignmentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__1__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__2"
    // InternalML2.g:5343:1: rule__ReferenceAssignment__Group_3_1__2 : rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 ;
    public final void rule__ReferenceAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5347:1: ( rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 )
            // InternalML2.g:5348:2: rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_36);
            rule__ReferenceAssignment__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__2"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__2__Impl"
    // InternalML2.g:5355:1: rule__ReferenceAssignment__Group_3_1__2__Impl : ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__ReferenceAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5359:1: ( ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) )
            // InternalML2.g:5360:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            {
            // InternalML2.g:5360:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            // InternalML2.g:5361:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 
            // InternalML2.g:5362:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==34) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalML2.g:5362:3: rule__ReferenceAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ReferenceAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__2__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__3"
    // InternalML2.g:5370:1: rule__ReferenceAssignment__Group_3_1__3 : rule__ReferenceAssignment__Group_3_1__3__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5374:1: ( rule__ReferenceAssignment__Group_3_1__3__Impl )
            // InternalML2.g:5375:2: rule__ReferenceAssignment__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__3"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1__3__Impl"
    // InternalML2.g:5381:1: rule__ReferenceAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5385:1: ( ( '}' ) )
            // InternalML2.g:5386:1: ( '}' )
            {
            // InternalML2.g:5386:1: ( '}' )
            // InternalML2.g:5387:2: '}'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1__3__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__0"
    // InternalML2.g:5397:1: rule__ReferenceAssignment__Group_3_1_2__0 : rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5401:1: ( rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 )
            // InternalML2.g:5402:2: rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ReferenceAssignment__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__0"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__0__Impl"
    // InternalML2.g:5409:1: rule__ReferenceAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5413:1: ( ( ',' ) )
            // InternalML2.g:5414:1: ( ',' )
            {
            // InternalML2.g:5414:1: ( ',' )
            // InternalML2.g:5415:2: ','
            {
             before(grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__1"
    // InternalML2.g:5424:1: rule__ReferenceAssignment__Group_3_1_2__1 : rule__ReferenceAssignment__Group_3_1_2__1__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5428:1: ( rule__ReferenceAssignment__Group_3_1_2__1__Impl )
            // InternalML2.g:5429:2: rule__ReferenceAssignment__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__Group_3_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__1"


    // $ANTLR start "rule__ReferenceAssignment__Group_3_1_2__1__Impl"
    // InternalML2.g:5435:1: rule__ReferenceAssignment__Group_3_1_2__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5439:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalML2.g:5440:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalML2.g:5440:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalML2.g:5441:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalML2.g:5442:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalML2.g:5442:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0"
    // InternalML2.g:5451:1: rule__GeneralizationSet__UnorderedGroup_0 : ( rule__GeneralizationSet__UnorderedGroup_0__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
        	
        try {
            // InternalML2.g:5456:1: ( ( rule__GeneralizationSet__UnorderedGroup_0__0 )? )
            // InternalML2.g:5457:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            {
            // InternalML2.g:5457:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalML2.g:5457:2: rule__GeneralizationSet__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__UnorderedGroup_0__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0__Impl"
    // InternalML2.g:5465:1: rule__GeneralizationSet__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalML2.g:5470:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) )
            // InternalML2.g:5471:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            {
            // InternalML2.g:5471:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalML2.g:5472:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    {
                    // InternalML2.g:5472:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    // InternalML2.g:5473:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalML2.g:5473:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    // InternalML2.g:5474:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalML2.g:5480:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalML2.g:5481:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalML2.g:5482:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalML2.g:5482:7: rule__GeneralizationSet__IsDisjointAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsDisjointAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:5487:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    {
                    // InternalML2.g:5487:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    // InternalML2.g:5488:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalML2.g:5488:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    // InternalML2.g:5489:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalML2.g:5495:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalML2.g:5496:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalML2.g:5497:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalML2.g:5497:7: rule__GeneralizationSet__IsCompleteAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsCompleteAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0__0"
    // InternalML2.g:5510:1: rule__GeneralizationSet__UnorderedGroup_0__0 : rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5514:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? )
            // InternalML2.g:5515:2: rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_37);
            rule__GeneralizationSet__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalML2.g:5516:2: ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalML2.g:5516:2: rule__GeneralizationSet__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0__0"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0__1"
    // InternalML2.g:5522:1: rule__GeneralizationSet__UnorderedGroup_0__1 : rule__GeneralizationSet__UnorderedGroup_0__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5526:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl )
            // InternalML2.g:5527:2: rule__GeneralizationSet__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__UnorderedGroup_0__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0__1"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalML2.g:5534:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5538:1: ( ( ruleQualifiedName ) )
            // InternalML2.g:5539:2: ( ruleQualifiedName )
            {
            // InternalML2.g:5539:2: ( ruleQualifiedName )
            // InternalML2.g:5540:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__IncludesAssignment_3_0_1"
    // InternalML2.g:5549:1: rule__Model__IncludesAssignment_3_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Model__IncludesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5553:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5554:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5554:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5555:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0()); 
            // InternalML2.g:5556:3: ( ruleQualifiedName )
            // InternalML2.g:5557:4: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getIncludesModelQualifiedNameParserRuleCall_3_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getIncludesModelQualifiedNameParserRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getModelAccess().getIncludesModelCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IncludesAssignment_3_0_1"


    // $ANTLR start "rule__Model__ElementsAssignment_3_1"
    // InternalML2.g:5568:1: rule__Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5572:1: ( ( ruleModelElement ) )
            // InternalML2.g:5573:2: ( ruleModelElement )
            {
            // InternalML2.g:5573:2: ( ruleModelElement )
            // InternalML2.g:5574:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalML2.g:5583:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5587:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalML2.g:5588:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalML2.g:5588:2: ( ruleQualifiedNameWithWildcard )
            // InternalML2.g:5589:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Individual__NameAssignment_1"
    // InternalML2.g:5598:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5602:1: ( ( RULE_ID ) )
            // InternalML2.g:5603:2: ( RULE_ID )
            {
            // InternalML2.g:5603:2: ( RULE_ID )
            // InternalML2.g:5604:3: RULE_ID
            {
             before(grammarAccess.getIndividualAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndividualAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__NameAssignment_1"


    // $ANTLR start "rule__Individual__InstantiatesAssignment_3"
    // InternalML2.g:5613:1: rule__Individual__InstantiatesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5617:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5618:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5618:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5619:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatesClassCrossReference_3_0()); 
            // InternalML2.g:5620:3: ( ruleQualifiedName )
            // InternalML2.g:5621:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getInstantiatesClassQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getInstantiatesClassQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getInstantiatesClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__InstantiatesAssignment_3"


    // $ANTLR start "rule__Individual__InstantiatesAssignment_4_1"
    // InternalML2.g:5632:1: rule__Individual__InstantiatesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5636:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5637:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5637:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5638:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatesClassCrossReference_4_1_0()); 
            // InternalML2.g:5639:3: ( ruleQualifiedName )
            // InternalML2.g:5640:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getInstantiatesClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getInstantiatesClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getInstantiatesClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__InstantiatesAssignment_4_1"


    // $ANTLR start "rule__Individual__AssignmentsAssignment_5_1"
    // InternalML2.g:5651:1: rule__Individual__AssignmentsAssignment_5_1 : ( ruleFeatureAssignment ) ;
    public final void rule__Individual__AssignmentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5655:1: ( ( ruleFeatureAssignment ) )
            // InternalML2.g:5656:2: ( ruleFeatureAssignment )
            {
            // InternalML2.g:5656:2: ( ruleFeatureAssignment )
            // InternalML2.g:5657:3: ruleFeatureAssignment
            {
             before(grammarAccess.getIndividualAccess().getAssignmentsFeatureAssignmentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureAssignment();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getAssignmentsFeatureAssignmentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Individual__AssignmentsAssignment_5_1"


    // $ANTLR start "rule__Class__AssignmentsAssignment_1_1_0"
    // InternalML2.g:5666:1: rule__Class__AssignmentsAssignment_1_1_0 : ( ruleFeatureAssignment ) ;
    public final void rule__Class__AssignmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5670:1: ( ( ruleFeatureAssignment ) )
            // InternalML2.g:5671:2: ( ruleFeatureAssignment )
            {
            // InternalML2.g:5671:2: ( ruleFeatureAssignment )
            // InternalML2.g:5672:3: ruleFeatureAssignment
            {
             before(grammarAccess.getClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureAssignment();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AssignmentsAssignment_1_1_0"


    // $ANTLR start "rule__Class__FeaturesAssignment_1_1_1"
    // InternalML2.g:5681:1: rule__Class__FeaturesAssignment_1_1_1 : ( ruleFeature ) ;
    public final void rule__Class__FeaturesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5685:1: ( ( ruleFeature ) )
            // InternalML2.g:5686:2: ( ruleFeature )
            {
            // InternalML2.g:5686:2: ( ruleFeature )
            // InternalML2.g:5687:3: ruleFeature
            {
             before(grammarAccess.getClassAccess().getFeaturesFeatureParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getClassAccess().getFeaturesFeatureParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__FeaturesAssignment_1_1_1"


    // $ANTLR start "rule__FOClassOrDataType__InstantiatesAssignment_1_1"
    // InternalML2.g:5696:1: rule__FOClassOrDataType__InstantiatesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClassOrDataType__InstantiatesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5700:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5701:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5701:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5702:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassCrossReference_1_1_0()); 
            // InternalML2.g:5703:3: ( ruleQualifiedName )
            // InternalML2.g:5704:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__InstantiatesAssignment_1_1"


    // $ANTLR start "rule__FOClassOrDataType__InstantiatesAssignment_1_2_1"
    // InternalML2.g:5715:1: rule__FOClassOrDataType__InstantiatesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClassOrDataType__InstantiatesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5719:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5720:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5720:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5721:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassCrossReference_1_2_1_0()); 
            // InternalML2.g:5722:3: ( ruleQualifiedName )
            // InternalML2.g:5723:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getInstantiatesClassCrossReference_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__InstantiatesAssignment_1_2_1"


    // $ANTLR start "rule__FOClassOrDataType__SuperClassesAssignment_2_1"
    // InternalML2.g:5734:1: rule__FOClassOrDataType__SuperClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClassOrDataType__SuperClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5738:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5739:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5739:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5740:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassCrossReference_2_1_0()); 
            // InternalML2.g:5741:3: ( ruleQualifiedName )
            // InternalML2.g:5742:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__SuperClassesAssignment_2_1"


    // $ANTLR start "rule__FOClassOrDataType__SuperClassesAssignment_2_2_1"
    // InternalML2.g:5753:1: rule__FOClassOrDataType__SuperClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FOClassOrDataType__SuperClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5757:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5758:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5758:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5759:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassCrossReference_2_2_1_0()); 
            // InternalML2.g:5760:3: ( ruleQualifiedName )
            // InternalML2.g:5761:4: ruleQualifiedName
            {
             before(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getFOClassOrDataTypeAccess().getSuperClassesClassCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClassOrDataType__SuperClassesAssignment_2_2_1"


    // $ANTLR start "rule__HigherOrderClass__InstantiatesAssignment_1_1"
    // InternalML2.g:5772:1: rule__HigherOrderClass__InstantiatesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__InstantiatesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5776:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5777:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5777:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5778:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassCrossReference_1_1_0()); 
            // InternalML2.g:5779:3: ( ruleQualifiedName )
            // InternalML2.g:5780:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__InstantiatesAssignment_1_1"


    // $ANTLR start "rule__HigherOrderClass__InstantiatesAssignment_1_2_1"
    // InternalML2.g:5791:1: rule__HigherOrderClass__InstantiatesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__InstantiatesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5795:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5796:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5796:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5797:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassCrossReference_1_2_1_0()); 
            // InternalML2.g:5798:3: ( ruleQualifiedName )
            // InternalML2.g:5799:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassQualifiedNameParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getInstantiatesClassCrossReference_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__InstantiatesAssignment_1_2_1"


    // $ANTLR start "rule__HigherOrderClass__SuperClassesAssignment_2_1"
    // InternalML2.g:5810:1: rule__HigherOrderClass__SuperClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__SuperClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5814:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5815:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5815:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5816:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassCrossReference_2_1_0()); 
            // InternalML2.g:5817:3: ( ruleQualifiedName )
            // InternalML2.g:5818:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__SuperClassesAssignment_2_1"


    // $ANTLR start "rule__HigherOrderClass__SuperClassesAssignment_2_2_1"
    // InternalML2.g:5829:1: rule__HigherOrderClass__SuperClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__SuperClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5833:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5834:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5834:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5835:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassCrossReference_2_2_1_0()); 
            // InternalML2.g:5836:3: ( ruleQualifiedName )
            // InternalML2.g:5837:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getSuperClassesClassCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__SuperClassesAssignment_2_2_1"


    // $ANTLR start "rule__HigherOrderClass__SubordinatorsAssignment_3_1"
    // InternalML2.g:5848:1: rule__HigherOrderClass__SubordinatorsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__SubordinatorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5852:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5853:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5853:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5854:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassCrossReference_3_1_0()); 
            // InternalML2.g:5855:3: ( ruleQualifiedName )
            // InternalML2.g:5856:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__SubordinatorsAssignment_3_1"


    // $ANTLR start "rule__HigherOrderClass__SubordinatorsAssignment_3_2_1"
    // InternalML2.g:5867:1: rule__HigherOrderClass__SubordinatorsAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__SubordinatorsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5871:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5872:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5872:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5873:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassCrossReference_3_2_1_0()); 
            // InternalML2.g:5874:3: ( ruleQualifiedName )
            // InternalML2.g:5875:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getSubordinatorsClassCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__SubordinatorsAssignment_3_2_1"


    // $ANTLR start "rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0"
    // InternalML2.g:5886:1: rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0 : ( ruleCategorizationType ) ;
    public final void rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5890:1: ( ( ruleCategorizationType ) )
            // InternalML2.g:5891:2: ( ruleCategorizationType )
            {
            // InternalML2.g:5891:2: ( ruleCategorizationType )
            // InternalML2.g:5892:3: ruleCategorizationType
            {
             before(grammarAccess.getHigherOrderClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategorizationType();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__CategorizationTypeAssignment_4_0_0"


    // $ANTLR start "rule__HigherOrderClass__CategorizedClassAssignment_4_0_1"
    // InternalML2.g:5901:1: rule__HigherOrderClass__CategorizedClassAssignment_4_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__CategorizedClassAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5905:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5906:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5906:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5907:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getCategorizedClassClassCrossReference_4_0_1_0()); 
            // InternalML2.g:5908:3: ( ruleQualifiedName )
            // InternalML2.g:5909:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getCategorizedClassClassQualifiedNameParserRuleCall_4_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getCategorizedClassClassQualifiedNameParserRuleCall_4_0_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getCategorizedClassClassCrossReference_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__CategorizedClassAssignment_4_0_1"


    // $ANTLR start "rule__HigherOrderClass__PowertypeOfAssignment_4_1_1"
    // InternalML2.g:5920:1: rule__HigherOrderClass__PowertypeOfAssignment_4_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__HigherOrderClass__PowertypeOfAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5924:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:5925:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:5925:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:5926:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getHigherOrderClassAccess().getPowertypeOfClassCrossReference_4_1_1_0()); 
            // InternalML2.g:5927:3: ( ruleQualifiedName )
            // InternalML2.g:5928:4: ruleQualifiedName
            {
             before(grammarAccess.getHigherOrderClassAccess().getPowertypeOfClassQualifiedNameParserRuleCall_4_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getHigherOrderClassAccess().getPowertypeOfClassQualifiedNameParserRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getHigherOrderClassAccess().getPowertypeOfClassCrossReference_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HigherOrderClass__PowertypeOfAssignment_4_1_1"


    // $ANTLR start "rule__FOClass__NameAssignment_1"
    // InternalML2.g:5939:1: rule__FOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5943:1: ( ( RULE_ID ) )
            // InternalML2.g:5944:2: ( RULE_ID )
            {
            // InternalML2.g:5944:2: ( RULE_ID )
            // InternalML2.g:5945:3: RULE_ID
            {
             before(grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFOClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FOClass__NameAssignment_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalML2.g:5954:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5958:1: ( ( RULE_ID ) )
            // InternalML2.g:5959:2: ( RULE_ID )
            {
            // InternalML2.g:5959:2: ( RULE_ID )
            // InternalML2.g:5960:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__HOClass__OrderAssignment_1"
    // InternalML2.g:5969:1: rule__HOClass__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5973:1: ( ( RULE_INT ) )
            // InternalML2.g:5974:2: ( RULE_INT )
            {
            // InternalML2.g:5974:2: ( RULE_INT )
            // InternalML2.g:5975:3: RULE_INT
            {
             before(grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getOrderINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__OrderAssignment_1"


    // $ANTLR start "rule__HOClass__NameAssignment_3"
    // InternalML2.g:5984:1: rule__HOClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5988:1: ( ( RULE_ID ) )
            // InternalML2.g:5989:2: ( RULE_ID )
            {
            // InternalML2.g:5989:2: ( RULE_ID )
            // InternalML2.g:5990:3: RULE_ID
            {
             before(grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHOClassAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOClass__NameAssignment_3"


    // $ANTLR start "rule__OrderlessClass__NameAssignment_2"
    // InternalML2.g:5999:1: rule__OrderlessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OrderlessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6003:1: ( ( RULE_ID ) )
            // InternalML2.g:6004:2: ( RULE_ID )
            {
            // InternalML2.g:6004:2: ( RULE_ID )
            // InternalML2.g:6005:3: RULE_ID
            {
             before(grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOrderlessClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderlessClass__NameAssignment_2"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_0"
    // InternalML2.g:6014:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6018:1: ( ( ( 'disjoint' ) ) )
            // InternalML2.g:6019:2: ( ( 'disjoint' ) )
            {
            // InternalML2.g:6019:2: ( ( 'disjoint' ) )
            // InternalML2.g:6020:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalML2.g:6021:3: ( 'disjoint' )
            // InternalML2.g:6022:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_0"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_1"
    // InternalML2.g:6033:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6037:1: ( ( ( 'complete' ) ) )
            // InternalML2.g:6038:2: ( ( 'complete' ) )
            {
            // InternalML2.g:6038:2: ( ( 'complete' ) )
            // InternalML2.g:6039:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalML2.g:6040:3: ( 'complete' )
            // InternalML2.g:6041:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_1"


    // $ANTLR start "rule__GeneralizationSet__NameAssignment_2"
    // InternalML2.g:6052:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6056:1: ( ( RULE_ID ) )
            // InternalML2.g:6057:2: ( RULE_ID )
            {
            // InternalML2.g:6057:2: ( RULE_ID )
            // InternalML2.g:6058:3: RULE_ID
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__NameAssignment_2"


    // $ANTLR start "rule__GeneralizationSet__GeneralAssignment_4"
    // InternalML2.g:6067:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6071:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6072:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6072:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6073:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0()); 
            // InternalML2.g:6074:3: ( ruleQualifiedName )
            // InternalML2.g:6075:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__GeneralAssignment_4"


    // $ANTLR start "rule__GeneralizationSet__CategorizerAssignment_5_1"
    // InternalML2.g:6086:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6090:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6091:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6091:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6092:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerClassCrossReference_5_1_0()); 
            // InternalML2.g:6093:3: ( ruleQualifiedName )
            // InternalML2.g:6094:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerClassCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__CategorizerAssignment_5_1"


    // $ANTLR start "rule__GeneralizationSet__SpecificsAssignment_7"
    // InternalML2.g:6105:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6109:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6110:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6110:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6111:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0()); 
            // InternalML2.g:6112:3: ( ruleQualifiedName )
            // InternalML2.g:6113:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__SpecificsAssignment_7"


    // $ANTLR start "rule__GeneralizationSet__SpecificsAssignment_8_1"
    // InternalML2.g:6124:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6128:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6129:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6129:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6130:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0()); 
            // InternalML2.g:6131:3: ( ruleQualifiedName )
            // InternalML2.g:6132:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassQualifiedNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsClassCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__SpecificsAssignment_8_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalML2.g:6143:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6147:1: ( ( RULE_ID ) )
            // InternalML2.g:6148:2: ( RULE_ID )
            {
            // InternalML2.g:6148:2: ( RULE_ID )
            // InternalML2.g:6149:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__PrimitiveTypeAssignment_3_0"
    // InternalML2.g:6158:1: rule__Attribute__PrimitiveTypeAssignment_3_0 : ( rulePrimitiveType ) ;
    public final void rule__Attribute__PrimitiveTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6162:1: ( ( rulePrimitiveType ) )
            // InternalML2.g:6163:2: ( rulePrimitiveType )
            {
            // InternalML2.g:6163:2: ( rulePrimitiveType )
            // InternalML2.g:6164:3: rulePrimitiveType
            {
             before(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__PrimitiveTypeAssignment_3_0"


    // $ANTLR start "rule__Attribute___typeAssignment_3_1"
    // InternalML2.g:6173:1: rule__Attribute___typeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute___typeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6177:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6178:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6178:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6179:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_3_1_0()); 
            // InternalML2.g:6180:3: ( ruleQualifiedName )
            // InternalML2.g:6181:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute___typeAssignment_3_1"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_4_1"
    // InternalML2.g:6192:1: rule__Attribute__SubsetOfAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6196:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6197:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6197:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6198:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_4_1_0()); 
            // InternalML2.g:6199:3: ( ruleQualifiedName )
            // InternalML2.g:6200:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__SubsetOfAssignment_4_1"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_4_2_1"
    // InternalML2.g:6211:1: rule__Attribute__SubsetOfAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6215:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6216:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6216:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6217:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_4_2_1_0()); 
            // InternalML2.g:6218:3: ( ruleQualifiedName )
            // InternalML2.g:6219:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__SubsetOfAssignment_4_2_1"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalML2.g:6230:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6234:1: ( ( RULE_ID ) )
            // InternalML2.g:6235:2: ( RULE_ID )
            {
            // InternalML2.g:6235:2: ( RULE_ID )
            // InternalML2.g:6236:3: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__SubsetOfAssignment_3_1"
    // InternalML2.g:6245:1: rule__Reference__SubsetOfAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6249:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6250:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6250:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6251:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_3_1_0()); 
            // InternalML2.g:6252:3: ( ruleQualifiedName )
            // InternalML2.g:6253:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SubsetOfAssignment_3_1"


    // $ANTLR start "rule__Reference__SubsetOfAssignment_3_2_1"
    // InternalML2.g:6264:1: rule__Reference__SubsetOfAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6268:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6269:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6269:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6270:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_3_2_1_0()); 
            // InternalML2.g:6271:3: ( ruleQualifiedName )
            // InternalML2.g:6272:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SubsetOfAssignment_3_2_1"


    // $ANTLR start "rule__Reference__OppositeToAssignment_4_1"
    // InternalML2.g:6283:1: rule__Reference__OppositeToAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__OppositeToAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6287:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6288:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6288:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6289:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_4_1_0()); 
            // InternalML2.g:6290:3: ( ruleQualifiedName )
            // InternalML2.g:6291:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OppositeToAssignment_4_1"


    // $ANTLR start "rule__RegularityAttribute__NameAssignment_2"
    // InternalML2.g:6302:1: rule__RegularityAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6306:1: ( ( RULE_ID ) )
            // InternalML2.g:6307:2: ( RULE_ID )
            {
            // InternalML2.g:6307:2: ( RULE_ID )
            // InternalML2.g:6308:3: RULE_ID
            {
             before(grammarAccess.getRegularityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__NameAssignment_2"


    // $ANTLR start "rule__RegularityAttribute__PrimitiveTypeAssignment_4_0"
    // InternalML2.g:6317:1: rule__RegularityAttribute__PrimitiveTypeAssignment_4_0 : ( rulePrimitiveType ) ;
    public final void rule__RegularityAttribute__PrimitiveTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6321:1: ( ( rulePrimitiveType ) )
            // InternalML2.g:6322:2: ( rulePrimitiveType )
            {
            // InternalML2.g:6322:2: ( rulePrimitiveType )
            // InternalML2.g:6323:3: rulePrimitiveType
            {
             before(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__PrimitiveTypeAssignment_4_0"


    // $ANTLR start "rule__RegularityAttribute___typeAssignment_4_1"
    // InternalML2.g:6332:1: rule__RegularityAttribute___typeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute___typeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6336:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6337:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6337:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6338:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_4_1_0()); 
            // InternalML2.g:6339:3: ( ruleQualifiedName )
            // InternalML2.g:6340:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute___typeAssignment_4_1"


    // $ANTLR start "rule__RegularityAttribute__SubsetOfAssignment_5_1"
    // InternalML2.g:6351:1: rule__RegularityAttribute__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6355:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6356:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6356:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6357:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 
            // InternalML2.g:6358:3: ( ruleQualifiedName )
            // InternalML2.g:6359:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__SubsetOfAssignment_5_1"


    // $ANTLR start "rule__RegularityAttribute__SubsetOfAssignment_5_2_1"
    // InternalML2.g:6370:1: rule__RegularityAttribute__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6374:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6375:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6375:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6376:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 
            // InternalML2.g:6377:3: ( ruleQualifiedName )
            // InternalML2.g:6378:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__SubsetOfAssignment_5_2_1"


    // $ANTLR start "rule__RegularityAttribute__RegularityTypeAssignment_6"
    // InternalML2.g:6389:1: rule__RegularityAttribute__RegularityTypeAssignment_6 : ( ruleRegularityFeatureType ) ;
    public final void rule__RegularityAttribute__RegularityTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6393:1: ( ( ruleRegularityFeatureType ) )
            // InternalML2.g:6394:2: ( ruleRegularityFeatureType )
            {
            // InternalML2.g:6394:2: ( ruleRegularityFeatureType )
            // InternalML2.g:6395:3: ruleRegularityFeatureType
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityFeatureType();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__RegularityTypeAssignment_6"


    // $ANTLR start "rule__RegularityAttribute__RegulatedFeatureAssignment_7"
    // InternalML2.g:6404:1: rule__RegularityAttribute__RegulatedFeatureAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__RegulatedFeatureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6408:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6409:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6409:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6410:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureCrossReference_7_0()); 
            // InternalML2.g:6411:3: ( ruleQualifiedName )
            // InternalML2.g:6412:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__RegulatedFeatureAssignment_7"


    // $ANTLR start "rule__RegularityReference__NameAssignment_2"
    // InternalML2.g:6423:1: rule__RegularityReference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityReference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6427:1: ( ( RULE_ID ) )
            // InternalML2.g:6428:2: ( RULE_ID )
            {
            // InternalML2.g:6428:2: ( RULE_ID )
            // InternalML2.g:6429:3: RULE_ID
            {
             before(grammarAccess.getRegularityReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__NameAssignment_2"


    // $ANTLR start "rule__RegularityReference__SubsetOfAssignment_4_1"
    // InternalML2.g:6438:1: rule__RegularityReference__SubsetOfAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6442:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6443:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6443:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6444:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_4_1_0()); 
            // InternalML2.g:6445:3: ( ruleQualifiedName )
            // InternalML2.g:6446:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__SubsetOfAssignment_4_1"


    // $ANTLR start "rule__RegularityReference__SubsetOfAssignment_4_2_1"
    // InternalML2.g:6457:1: rule__RegularityReference__SubsetOfAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6461:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6462:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6462:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6463:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_4_2_1_0()); 
            // InternalML2.g:6464:3: ( ruleQualifiedName )
            // InternalML2.g:6465:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__SubsetOfAssignment_4_2_1"


    // $ANTLR start "rule__RegularityReference__OppositeToAssignment_5_1"
    // InternalML2.g:6476:1: rule__RegularityReference__OppositeToAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__OppositeToAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6480:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6481:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6481:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6482:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_5_1_0()); 
            // InternalML2.g:6483:3: ( ruleQualifiedName )
            // InternalML2.g:6484:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__OppositeToAssignment_5_1"


    // $ANTLR start "rule__RegularityReference__RegularityTypeAssignment_6"
    // InternalML2.g:6495:1: rule__RegularityReference__RegularityTypeAssignment_6 : ( ruleRegularityFeatureType ) ;
    public final void rule__RegularityReference__RegularityTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6499:1: ( ( ruleRegularityFeatureType ) )
            // InternalML2.g:6500:2: ( ruleRegularityFeatureType )
            {
            // InternalML2.g:6500:2: ( ruleRegularityFeatureType )
            // InternalML2.g:6501:3: ruleRegularityFeatureType
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityFeatureType();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__RegularityTypeAssignment_6"


    // $ANTLR start "rule__RegularityReference__RegulatedFeatureAssignment_7"
    // InternalML2.g:6510:1: rule__RegularityReference__RegulatedFeatureAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__RegulatedFeatureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6514:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6515:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6515:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6516:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureCrossReference_7_0()); 
            // InternalML2.g:6517:3: ( ruleQualifiedName )
            // InternalML2.g:6518:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityReference__RegulatedFeatureAssignment_7"


    // $ANTLR start "rule__SingleAttributeAssignment__AttributeAssignment_1"
    // InternalML2.g:6529:1: rule__SingleAttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SingleAttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6533:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6534:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6534:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6535:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalML2.g:6536:3: ( ruleQualifiedName )
            // InternalML2.g:6537:4: ruleQualifiedName
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__AttributeAssignment_1"


    // $ANTLR start "rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3"
    // InternalML2.g:6548:1: rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6552:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6553:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6553:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6554:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_3_0()); 
            // InternalML2.g:6555:3: ( ruleQualifiedName )
            // InternalML2.g:6556:4: ruleQualifiedName
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3"


    // $ANTLR start "rule__ReferenceAssignment__ReferenceAssignment_1"
    // InternalML2.g:6567:1: rule__ReferenceAssignment__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6571:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6572:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6572:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6573:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 
            // InternalML2.g:6574:3: ( ruleQualifiedName )
            // InternalML2.g:6575:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__ReferenceAssignment_1"


    // $ANTLR start "rule__ReferenceAssignment__AssignmentsAssignment_3_0"
    // InternalML2.g:6586:1: rule__ReferenceAssignment__AssignmentsAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6590:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6591:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6591:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6592:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0()); 
            // InternalML2.g:6593:3: ( ruleQualifiedName )
            // InternalML2.g:6594:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__AssignmentsAssignment_3_0"


    // $ANTLR start "rule__ReferenceAssignment__AssignmentsAssignment_3_1_1"
    // InternalML2.g:6605:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6609:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6610:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6610:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6611:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0()); 
            // InternalML2.g:6612:3: ( ruleQualifiedName )
            // InternalML2.g:6613:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__AssignmentsAssignment_3_1_1"


    // $ANTLR start "rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1"
    // InternalML2.g:6624:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6628:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:6629:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:6629:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:6630:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0()); 
            // InternalML2.g:6631:3: ( ruleQualifiedName )
            // InternalML2.g:6632:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationQualifiedNameParserRuleCall_3_1_2_1_0_1()); 

            }

             after(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x003003C18C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x003003C188000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001400004000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001400000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0005400004000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0005400000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003A00007800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000FC0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002800000FC0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001400000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0030000000000002L});

}
