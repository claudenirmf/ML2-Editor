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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'true'", "'false'", "'E'", "'e'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'determinesValue'", "'determinesType'", "'determinesMinValue'", "'determinesAllowedValues'", "'determinesAllowedTypes'", "'determinesMaxValue'", "'module'", "'{'", "'}'", "'include'", "';'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'specializes'", "'subordinatedTo'", "'isPowertypeOf'", "'class'", "'datatype'", "'order'", "'orderless'", "'genset'", "'general'", "'specifics'", "'categorizer'", "'att'", "'['", "'..'", "']'", "'subsets'", "'ref'", "'isOppositeTo'", "'regularity'", "'='", "'-'", "'disjoint'", "'complete'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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



    // $ANTLR start "entryRuleML2Model"
    // InternalML2.g:53:1: entryRuleML2Model : ruleML2Model EOF ;
    public final void entryRuleML2Model() throws RecognitionException {
        try {
            // InternalML2.g:54:1: ( ruleML2Model EOF )
            // InternalML2.g:55:1: ruleML2Model EOF
            {
             before(grammarAccess.getML2ModelRule()); 
            pushFollow(FOLLOW_1);
            ruleML2Model();

            state._fsp--;

             after(grammarAccess.getML2ModelRule()); 
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
    // $ANTLR end "entryRuleML2Model"


    // $ANTLR start "ruleML2Model"
    // InternalML2.g:62:1: ruleML2Model : ( ( rule__ML2Model__Group__0 ) ) ;
    public final void ruleML2Model() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:66:2: ( ( ( rule__ML2Model__Group__0 ) ) )
            // InternalML2.g:67:2: ( ( rule__ML2Model__Group__0 ) )
            {
            // InternalML2.g:67:2: ( ( rule__ML2Model__Group__0 ) )
            // InternalML2.g:68:3: ( rule__ML2Model__Group__0 )
            {
             before(grammarAccess.getML2ModelAccess().getGroup()); 
            // InternalML2.g:69:3: ( rule__ML2Model__Group__0 )
            // InternalML2.g:69:4: rule__ML2Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ML2Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getML2ModelAccess().getGroup()); 

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
    // $ANTLR end "ruleML2Model"


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


    // $ANTLR start "entryRuleML2Class"
    // InternalML2.g:228:1: entryRuleML2Class : ruleML2Class EOF ;
    public final void entryRuleML2Class() throws RecognitionException {
        try {
            // InternalML2.g:229:1: ( ruleML2Class EOF )
            // InternalML2.g:230:1: ruleML2Class EOF
            {
             before(grammarAccess.getML2ClassRule()); 
            pushFollow(FOLLOW_1);
            ruleML2Class();

            state._fsp--;

             after(grammarAccess.getML2ClassRule()); 
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
    // $ANTLR end "entryRuleML2Class"


    // $ANTLR start "ruleML2Class"
    // InternalML2.g:237:1: ruleML2Class : ( ( rule__ML2Class__Group__0 ) ) ;
    public final void ruleML2Class() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:241:2: ( ( ( rule__ML2Class__Group__0 ) ) )
            // InternalML2.g:242:2: ( ( rule__ML2Class__Group__0 ) )
            {
            // InternalML2.g:242:2: ( ( rule__ML2Class__Group__0 ) )
            // InternalML2.g:243:3: ( rule__ML2Class__Group__0 )
            {
             before(grammarAccess.getML2ClassAccess().getGroup()); 
            // InternalML2.g:244:3: ( rule__ML2Class__Group__0 )
            // InternalML2.g:244:4: rule__ML2Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ML2Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getML2ClassAccess().getGroup()); 

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
    // $ANTLR end "ruleML2Class"


    // $ANTLR start "entryRuleSomeFOClass"
    // InternalML2.g:253:1: entryRuleSomeFOClass : ruleSomeFOClass EOF ;
    public final void entryRuleSomeFOClass() throws RecognitionException {
        try {
            // InternalML2.g:254:1: ( ruleSomeFOClass EOF )
            // InternalML2.g:255:1: ruleSomeFOClass EOF
            {
             before(grammarAccess.getSomeFOClassRule()); 
            pushFollow(FOLLOW_1);
            ruleSomeFOClass();

            state._fsp--;

             after(grammarAccess.getSomeFOClassRule()); 
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
    // $ANTLR end "entryRuleSomeFOClass"


    // $ANTLR start "ruleSomeFOClass"
    // InternalML2.g:262:1: ruleSomeFOClass : ( ( rule__SomeFOClass__Group__0 ) ) ;
    public final void ruleSomeFOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:266:2: ( ( ( rule__SomeFOClass__Group__0 ) ) )
            // InternalML2.g:267:2: ( ( rule__SomeFOClass__Group__0 ) )
            {
            // InternalML2.g:267:2: ( ( rule__SomeFOClass__Group__0 ) )
            // InternalML2.g:268:3: ( rule__SomeFOClass__Group__0 )
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup()); 
            // InternalML2.g:269:3: ( rule__SomeFOClass__Group__0 )
            // InternalML2.g:269:4: rule__SomeFOClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSomeFOClassAccess().getGroup()); 

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
    // $ANTLR end "ruleSomeFOClass"


    // $ANTLR start "entryRuleNonFOClass"
    // InternalML2.g:278:1: entryRuleNonFOClass : ruleNonFOClass EOF ;
    public final void entryRuleNonFOClass() throws RecognitionException {
        try {
            // InternalML2.g:279:1: ( ruleNonFOClass EOF )
            // InternalML2.g:280:1: ruleNonFOClass EOF
            {
             before(grammarAccess.getNonFOClassRule()); 
            pushFollow(FOLLOW_1);
            ruleNonFOClass();

            state._fsp--;

             after(grammarAccess.getNonFOClassRule()); 
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
    // $ANTLR end "entryRuleNonFOClass"


    // $ANTLR start "ruleNonFOClass"
    // InternalML2.g:287:1: ruleNonFOClass : ( ( rule__NonFOClass__Group__0 ) ) ;
    public final void ruleNonFOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:291:2: ( ( ( rule__NonFOClass__Group__0 ) ) )
            // InternalML2.g:292:2: ( ( rule__NonFOClass__Group__0 ) )
            {
            // InternalML2.g:292:2: ( ( rule__NonFOClass__Group__0 ) )
            // InternalML2.g:293:3: ( rule__NonFOClass__Group__0 )
            {
             before(grammarAccess.getNonFOClassAccess().getGroup()); 
            // InternalML2.g:294:3: ( rule__NonFOClass__Group__0 )
            // InternalML2.g:294:4: rule__NonFOClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getGroup()); 

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
    // $ANTLR end "ruleNonFOClass"


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


    // $ANTLR start "entryRuleELEMENTBOUND"
    // InternalML2.g:603:1: entryRuleELEMENTBOUND : ruleELEMENTBOUND EOF ;
    public final void entryRuleELEMENTBOUND() throws RecognitionException {
        try {
            // InternalML2.g:604:1: ( ruleELEMENTBOUND EOF )
            // InternalML2.g:605:1: ruleELEMENTBOUND EOF
            {
             before(grammarAccess.getELEMENTBOUNDRule()); 
            pushFollow(FOLLOW_1);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getELEMENTBOUNDRule()); 
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
    // $ANTLR end "entryRuleELEMENTBOUND"


    // $ANTLR start "ruleELEMENTBOUND"
    // InternalML2.g:612:1: ruleELEMENTBOUND : ( ( rule__ELEMENTBOUND__Alternatives ) ) ;
    public final void ruleELEMENTBOUND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:616:2: ( ( ( rule__ELEMENTBOUND__Alternatives ) ) )
            // InternalML2.g:617:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            {
            // InternalML2.g:617:2: ( ( rule__ELEMENTBOUND__Alternatives ) )
            // InternalML2.g:618:3: ( rule__ELEMENTBOUND__Alternatives )
            {
             before(grammarAccess.getELEMENTBOUNDAccess().getAlternatives()); 
            // InternalML2.g:619:3: ( rule__ELEMENTBOUND__Alternatives )
            // InternalML2.g:619:4: rule__ELEMENTBOUND__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ELEMENTBOUND__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getELEMENTBOUNDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleELEMENTBOUND"


    // $ANTLR start "entryRuleFeatureAssignment"
    // InternalML2.g:628:1: entryRuleFeatureAssignment : ruleFeatureAssignment EOF ;
    public final void entryRuleFeatureAssignment() throws RecognitionException {
        try {
            // InternalML2.g:629:1: ( ruleFeatureAssignment EOF )
            // InternalML2.g:630:1: ruleFeatureAssignment EOF
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
    // InternalML2.g:637:1: ruleFeatureAssignment : ( ( rule__FeatureAssignment__Alternatives ) ) ;
    public final void ruleFeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:641:2: ( ( ( rule__FeatureAssignment__Alternatives ) ) )
            // InternalML2.g:642:2: ( ( rule__FeatureAssignment__Alternatives ) )
            {
            // InternalML2.g:642:2: ( ( rule__FeatureAssignment__Alternatives ) )
            // InternalML2.g:643:3: ( rule__FeatureAssignment__Alternatives )
            {
             before(grammarAccess.getFeatureAssignmentAccess().getAlternatives()); 
            // InternalML2.g:644:3: ( rule__FeatureAssignment__Alternatives )
            // InternalML2.g:644:4: rule__FeatureAssignment__Alternatives
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
    // InternalML2.g:653:1: entryRuleSingleAttributeAssignment : ruleSingleAttributeAssignment EOF ;
    public final void entryRuleSingleAttributeAssignment() throws RecognitionException {
        try {
            // InternalML2.g:654:1: ( ruleSingleAttributeAssignment EOF )
            // InternalML2.g:655:1: ruleSingleAttributeAssignment EOF
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
    // InternalML2.g:662:1: ruleSingleAttributeAssignment : ( ( rule__SingleAttributeAssignment__Group__0 ) ) ;
    public final void ruleSingleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:666:2: ( ( ( rule__SingleAttributeAssignment__Group__0 ) ) )
            // InternalML2.g:667:2: ( ( rule__SingleAttributeAssignment__Group__0 ) )
            {
            // InternalML2.g:667:2: ( ( rule__SingleAttributeAssignment__Group__0 ) )
            // InternalML2.g:668:3: ( rule__SingleAttributeAssignment__Group__0 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getGroup()); 
            // InternalML2.g:669:3: ( rule__SingleAttributeAssignment__Group__0 )
            // InternalML2.g:669:4: rule__SingleAttributeAssignment__Group__0
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


    // $ANTLR start "entryRuleMultipleAttributeAssignment"
    // InternalML2.g:678:1: entryRuleMultipleAttributeAssignment : ruleMultipleAttributeAssignment EOF ;
    public final void entryRuleMultipleAttributeAssignment() throws RecognitionException {
        try {
            // InternalML2.g:679:1: ( ruleMultipleAttributeAssignment EOF )
            // InternalML2.g:680:1: ruleMultipleAttributeAssignment EOF
            {
             before(grammarAccess.getMultipleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentRule()); 
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
    // $ANTLR end "entryRuleMultipleAttributeAssignment"


    // $ANTLR start "ruleMultipleAttributeAssignment"
    // InternalML2.g:687:1: ruleMultipleAttributeAssignment : ( ( rule__MultipleAttributeAssignment__Group__0 ) ) ;
    public final void ruleMultipleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:691:2: ( ( ( rule__MultipleAttributeAssignment__Group__0 ) ) )
            // InternalML2.g:692:2: ( ( rule__MultipleAttributeAssignment__Group__0 ) )
            {
            // InternalML2.g:692:2: ( ( rule__MultipleAttributeAssignment__Group__0 ) )
            // InternalML2.g:693:3: ( rule__MultipleAttributeAssignment__Group__0 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup()); 
            // InternalML2.g:694:3: ( rule__MultipleAttributeAssignment__Group__0 )
            // InternalML2.g:694:4: rule__MultipleAttributeAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleMultipleAttributeAssignment"


    // $ANTLR start "entryRuleReferenceAssignment"
    // InternalML2.g:703:1: entryRuleReferenceAssignment : ruleReferenceAssignment EOF ;
    public final void entryRuleReferenceAssignment() throws RecognitionException {
        try {
            // InternalML2.g:704:1: ( ruleReferenceAssignment EOF )
            // InternalML2.g:705:1: ruleReferenceAssignment EOF
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
    // InternalML2.g:712:1: ruleReferenceAssignment : ( ( rule__ReferenceAssignment__Group__0 ) ) ;
    public final void ruleReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:716:2: ( ( ( rule__ReferenceAssignment__Group__0 ) ) )
            // InternalML2.g:717:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            {
            // InternalML2.g:717:2: ( ( rule__ReferenceAssignment__Group__0 ) )
            // InternalML2.g:718:3: ( rule__ReferenceAssignment__Group__0 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup()); 
            // InternalML2.g:719:3: ( rule__ReferenceAssignment__Group__0 )
            // InternalML2.g:719:4: rule__ReferenceAssignment__Group__0
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


    // $ANTLR start "entryRuleLiteral"
    // InternalML2.g:728:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalML2.g:729:1: ( ruleLiteral EOF )
            // InternalML2.g:730:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalML2.g:737:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:741:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalML2.g:742:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalML2.g:742:2: ( ( rule__Literal__Alternatives ) )
            // InternalML2.g:743:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalML2.g:744:3: ( rule__Literal__Alternatives )
            // InternalML2.g:744:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleML2String"
    // InternalML2.g:753:1: entryRuleML2String : ruleML2String EOF ;
    public final void entryRuleML2String() throws RecognitionException {
        try {
            // InternalML2.g:754:1: ( ruleML2String EOF )
            // InternalML2.g:755:1: ruleML2String EOF
            {
             before(grammarAccess.getML2StringRule()); 
            pushFollow(FOLLOW_1);
            ruleML2String();

            state._fsp--;

             after(grammarAccess.getML2StringRule()); 
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
    // $ANTLR end "entryRuleML2String"


    // $ANTLR start "ruleML2String"
    // InternalML2.g:762:1: ruleML2String : ( ( rule__ML2String__ValueAssignment ) ) ;
    public final void ruleML2String() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:766:2: ( ( ( rule__ML2String__ValueAssignment ) ) )
            // InternalML2.g:767:2: ( ( rule__ML2String__ValueAssignment ) )
            {
            // InternalML2.g:767:2: ( ( rule__ML2String__ValueAssignment ) )
            // InternalML2.g:768:3: ( rule__ML2String__ValueAssignment )
            {
             before(grammarAccess.getML2StringAccess().getValueAssignment()); 
            // InternalML2.g:769:3: ( rule__ML2String__ValueAssignment )
            // InternalML2.g:769:4: rule__ML2String__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ML2String__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getML2StringAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleML2String"


    // $ANTLR start "entryRuleML2Number"
    // InternalML2.g:778:1: entryRuleML2Number : ruleML2Number EOF ;
    public final void entryRuleML2Number() throws RecognitionException {
        try {
            // InternalML2.g:779:1: ( ruleML2Number EOF )
            // InternalML2.g:780:1: ruleML2Number EOF
            {
             before(grammarAccess.getML2NumberRule()); 
            pushFollow(FOLLOW_1);
            ruleML2Number();

            state._fsp--;

             after(grammarAccess.getML2NumberRule()); 
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
    // $ANTLR end "entryRuleML2Number"


    // $ANTLR start "ruleML2Number"
    // InternalML2.g:787:1: ruleML2Number : ( ( rule__ML2Number__ValueAssignment ) ) ;
    public final void ruleML2Number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:791:2: ( ( ( rule__ML2Number__ValueAssignment ) ) )
            // InternalML2.g:792:2: ( ( rule__ML2Number__ValueAssignment ) )
            {
            // InternalML2.g:792:2: ( ( rule__ML2Number__ValueAssignment ) )
            // InternalML2.g:793:3: ( rule__ML2Number__ValueAssignment )
            {
             before(grammarAccess.getML2NumberAccess().getValueAssignment()); 
            // InternalML2.g:794:3: ( rule__ML2Number__ValueAssignment )
            // InternalML2.g:794:4: rule__ML2Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ML2Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getML2NumberAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleML2Number"


    // $ANTLR start "entryRuleML2Boolean"
    // InternalML2.g:803:1: entryRuleML2Boolean : ruleML2Boolean EOF ;
    public final void entryRuleML2Boolean() throws RecognitionException {
        try {
            // InternalML2.g:804:1: ( ruleML2Boolean EOF )
            // InternalML2.g:805:1: ruleML2Boolean EOF
            {
             before(grammarAccess.getML2BooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleML2Boolean();

            state._fsp--;

             after(grammarAccess.getML2BooleanRule()); 
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
    // $ANTLR end "entryRuleML2Boolean"


    // $ANTLR start "ruleML2Boolean"
    // InternalML2.g:812:1: ruleML2Boolean : ( ( rule__ML2Boolean__ValueAssignment ) ) ;
    public final void ruleML2Boolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:816:2: ( ( ( rule__ML2Boolean__ValueAssignment ) ) )
            // InternalML2.g:817:2: ( ( rule__ML2Boolean__ValueAssignment ) )
            {
            // InternalML2.g:817:2: ( ( rule__ML2Boolean__ValueAssignment ) )
            // InternalML2.g:818:3: ( rule__ML2Boolean__ValueAssignment )
            {
             before(grammarAccess.getML2BooleanAccess().getValueAssignment()); 
            // InternalML2.g:819:3: ( rule__ML2Boolean__ValueAssignment )
            // InternalML2.g:819:4: rule__ML2Boolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ML2Boolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getML2BooleanAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleML2Boolean"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalML2.g:828:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalML2.g:829:1: ( ruleBOOLEAN EOF )
            // InternalML2.g:830:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalML2.g:837:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:841:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalML2.g:842:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalML2.g:842:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalML2.g:843:3: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // InternalML2.g:844:3: ( rule__BOOLEAN__Alternatives )
            // InternalML2.g:844:4: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // InternalML2.g:853:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalML2.g:854:1: ( ruleNUMBER EOF )
            // InternalML2.g:855:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalML2.g:862:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:866:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalML2.g:867:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalML2.g:867:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalML2.g:868:3: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // InternalML2.g:869:3: ( rule__NUMBER__Group__0 )
            // InternalML2.g:869:4: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getGroup()); 

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleUnnamedIndividual"
    // InternalML2.g:878:1: entryRuleUnnamedIndividual : ruleUnnamedIndividual EOF ;
    public final void entryRuleUnnamedIndividual() throws RecognitionException {
        try {
            // InternalML2.g:879:1: ( ruleUnnamedIndividual EOF )
            // InternalML2.g:880:1: ruleUnnamedIndividual EOF
            {
             before(grammarAccess.getUnnamedIndividualRule()); 
            pushFollow(FOLLOW_1);
            ruleUnnamedIndividual();

            state._fsp--;

             after(grammarAccess.getUnnamedIndividualRule()); 
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
    // $ANTLR end "entryRuleUnnamedIndividual"


    // $ANTLR start "ruleUnnamedIndividual"
    // InternalML2.g:887:1: ruleUnnamedIndividual : ( ( rule__UnnamedIndividual__Group__0 ) ) ;
    public final void ruleUnnamedIndividual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:891:2: ( ( ( rule__UnnamedIndividual__Group__0 ) ) )
            // InternalML2.g:892:2: ( ( rule__UnnamedIndividual__Group__0 ) )
            {
            // InternalML2.g:892:2: ( ( rule__UnnamedIndividual__Group__0 ) )
            // InternalML2.g:893:3: ( rule__UnnamedIndividual__Group__0 )
            {
             before(grammarAccess.getUnnamedIndividualAccess().getGroup()); 
            // InternalML2.g:894:3: ( rule__UnnamedIndividual__Group__0 )
            // InternalML2.g:894:4: rule__UnnamedIndividual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedIndividual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedIndividualAccess().getGroup()); 

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
    // $ANTLR end "ruleUnnamedIndividual"


    // $ANTLR start "entryRuleSimpleAttributeAssignment"
    // InternalML2.g:903:1: entryRuleSimpleAttributeAssignment : ruleSimpleAttributeAssignment EOF ;
    public final void entryRuleSimpleAttributeAssignment() throws RecognitionException {
        try {
            // InternalML2.g:904:1: ( ruleSimpleAttributeAssignment EOF )
            // InternalML2.g:905:1: ruleSimpleAttributeAssignment EOF
            {
             before(grammarAccess.getSimpleAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentRule()); 
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
    // $ANTLR end "entryRuleSimpleAttributeAssignment"


    // $ANTLR start "ruleSimpleAttributeAssignment"
    // InternalML2.g:912:1: ruleSimpleAttributeAssignment : ( ( rule__SimpleAttributeAssignment__Group__0 ) ) ;
    public final void ruleSimpleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:916:2: ( ( ( rule__SimpleAttributeAssignment__Group__0 ) ) )
            // InternalML2.g:917:2: ( ( rule__SimpleAttributeAssignment__Group__0 ) )
            {
            // InternalML2.g:917:2: ( ( rule__SimpleAttributeAssignment__Group__0 ) )
            // InternalML2.g:918:3: ( rule__SimpleAttributeAssignment__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup()); 
            // InternalML2.g:919:3: ( rule__SimpleAttributeAssignment__Group__0 )
            // InternalML2.g:919:4: rule__SimpleAttributeAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleAttributeAssignment"


    // $ANTLR start "ruleCategorizationType"
    // InternalML2.g:928:1: ruleCategorizationType : ( ( rule__CategorizationType__Alternatives ) ) ;
    public final void ruleCategorizationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:932:1: ( ( ( rule__CategorizationType__Alternatives ) ) )
            // InternalML2.g:933:2: ( ( rule__CategorizationType__Alternatives ) )
            {
            // InternalML2.g:933:2: ( ( rule__CategorizationType__Alternatives ) )
            // InternalML2.g:934:3: ( rule__CategorizationType__Alternatives )
            {
             before(grammarAccess.getCategorizationTypeAccess().getAlternatives()); 
            // InternalML2.g:935:3: ( rule__CategorizationType__Alternatives )
            // InternalML2.g:935:4: rule__CategorizationType__Alternatives
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


    // $ANTLR start "ruleRegularityFeatureType"
    // InternalML2.g:944:1: ruleRegularityFeatureType : ( ( rule__RegularityFeatureType__Alternatives ) ) ;
    public final void ruleRegularityFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:948:1: ( ( ( rule__RegularityFeatureType__Alternatives ) ) )
            // InternalML2.g:949:2: ( ( rule__RegularityFeatureType__Alternatives ) )
            {
            // InternalML2.g:949:2: ( ( rule__RegularityFeatureType__Alternatives ) )
            // InternalML2.g:950:3: ( rule__RegularityFeatureType__Alternatives )
            {
             before(grammarAccess.getRegularityFeatureTypeAccess().getAlternatives()); 
            // InternalML2.g:951:3: ( rule__RegularityFeatureType__Alternatives )
            // InternalML2.g:951:4: rule__RegularityFeatureType__Alternatives
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


    // $ANTLR start "rule__ML2Model__Alternatives_3"
    // InternalML2.g:959:1: rule__ML2Model__Alternatives_3 : ( ( ( rule__ML2Model__Group_3_0__0 ) ) | ( ( rule__ML2Model__ElementsAssignment_3_1 ) ) );
    public final void rule__ML2Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:963:1: ( ( ( rule__ML2Model__Group_3_0__0 ) ) | ( ( rule__ML2Model__ElementsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=33 && LA1_0<=34)||(LA1_0>=40 && LA1_0<=44)||(LA1_0>=58 && LA1_0<=59)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalML2.g:964:2: ( ( rule__ML2Model__Group_3_0__0 ) )
                    {
                    // InternalML2.g:964:2: ( ( rule__ML2Model__Group_3_0__0 ) )
                    // InternalML2.g:965:3: ( rule__ML2Model__Group_3_0__0 )
                    {
                     before(grammarAccess.getML2ModelAccess().getGroup_3_0()); 
                    // InternalML2.g:966:3: ( rule__ML2Model__Group_3_0__0 )
                    // InternalML2.g:966:4: rule__ML2Model__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ML2Model__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getML2ModelAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:970:2: ( ( rule__ML2Model__ElementsAssignment_3_1 ) )
                    {
                    // InternalML2.g:970:2: ( ( rule__ML2Model__ElementsAssignment_3_1 ) )
                    // InternalML2.g:971:3: ( rule__ML2Model__ElementsAssignment_3_1 )
                    {
                     before(grammarAccess.getML2ModelAccess().getElementsAssignment_3_1()); 
                    // InternalML2.g:972:3: ( rule__ML2Model__ElementsAssignment_3_1 )
                    // InternalML2.g:972:4: rule__ML2Model__ElementsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ML2Model__ElementsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getML2ModelAccess().getElementsAssignment_3_1()); 

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
    // $ANTLR end "rule__ML2Model__Alternatives_3"


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalML2.g:980:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:984:1: ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 34:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt2=2;
                }
                break;
            case 44:
            case 58:
            case 59:
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
                    // InternalML2.g:985:2: ( ruleImport )
                    {
                    // InternalML2.g:985:2: ( ruleImport )
                    // InternalML2.g:986:3: ruleImport
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
                    // InternalML2.g:991:2: ( ruleEntityDeclaration )
                    {
                    // InternalML2.g:991:2: ( ruleEntityDeclaration )
                    // InternalML2.g:992:3: ruleEntityDeclaration
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
                    // InternalML2.g:997:2: ( ruleGeneralizationSet )
                    {
                    // InternalML2.g:997:2: ( ruleGeneralizationSet )
                    // InternalML2.g:998:3: ruleGeneralizationSet
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
    // InternalML2.g:1007:1: rule__EntityDeclaration__Alternatives : ( ( ruleML2Class ) | ( ruleIndividual ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1011:1: ( ( ruleML2Class ) | ( ruleIndividual ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=40 && LA3_0<=43)) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalML2.g:1012:2: ( ruleML2Class )
                    {
                    // InternalML2.g:1012:2: ( ruleML2Class )
                    // InternalML2.g:1013:3: ruleML2Class
                    {
                     before(grammarAccess.getEntityDeclarationAccess().getML2ClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleML2Class();

                    state._fsp--;

                     after(grammarAccess.getEntityDeclarationAccess().getML2ClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1018:2: ( ruleIndividual )
                    {
                    // InternalML2.g:1018:2: ( ruleIndividual )
                    // InternalML2.g:1019:3: ruleIndividual
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


    // $ANTLR start "rule__ML2Class__Alternatives_0"
    // InternalML2.g:1028:1: rule__ML2Class__Alternatives_0 : ( ( ruleSomeFOClass ) | ( ruleNonFOClass ) );
    public final void rule__ML2Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1032:1: ( ( ruleSomeFOClass ) | ( ruleNonFOClass ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=40 && LA4_0<=41)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=42 && LA4_0<=43)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalML2.g:1033:2: ( ruleSomeFOClass )
                    {
                    // InternalML2.g:1033:2: ( ruleSomeFOClass )
                    // InternalML2.g:1034:3: ruleSomeFOClass
                    {
                     before(grammarAccess.getML2ClassAccess().getSomeFOClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSomeFOClass();

                    state._fsp--;

                     after(grammarAccess.getML2ClassAccess().getSomeFOClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1039:2: ( ruleNonFOClass )
                    {
                    // InternalML2.g:1039:2: ( ruleNonFOClass )
                    // InternalML2.g:1040:3: ruleNonFOClass
                    {
                     before(grammarAccess.getML2ClassAccess().getNonFOClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonFOClass();

                    state._fsp--;

                     after(grammarAccess.getML2ClassAccess().getNonFOClassParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__ML2Class__Alternatives_0"


    // $ANTLR start "rule__ML2Class__Alternatives_1_1"
    // InternalML2.g:1049:1: rule__ML2Class__Alternatives_1_1 : ( ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) ) | ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) ) );
    public final void rule__ML2Class__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1053:1: ( ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) ) | ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==31||LA5_2==56) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==35) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

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
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==31||LA5_2==56) ) {
                    alt5=1;
                }
                else if ( (LA5_2==35) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==RULE_ID) ) {
                    int LA5_6 = input.LA(3);

                    if ( (LA5_6==31||LA5_6==56) ) {
                        alt5=1;
                    }
                    else if ( (LA5_6==35) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 55:
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
                    // InternalML2.g:1054:2: ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) )
                    {
                    // InternalML2.g:1054:2: ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) )
                    // InternalML2.g:1055:3: ( rule__ML2Class__AssignmentsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getML2ClassAccess().getAssignmentsAssignment_1_1_0()); 
                    // InternalML2.g:1056:3: ( rule__ML2Class__AssignmentsAssignment_1_1_0 )
                    // InternalML2.g:1056:4: rule__ML2Class__AssignmentsAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ML2Class__AssignmentsAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getML2ClassAccess().getAssignmentsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1060:2: ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) )
                    {
                    // InternalML2.g:1060:2: ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) )
                    // InternalML2.g:1061:3: ( rule__ML2Class__FeaturesAssignment_1_1_1 )
                    {
                     before(grammarAccess.getML2ClassAccess().getFeaturesAssignment_1_1_1()); 
                    // InternalML2.g:1062:3: ( rule__ML2Class__FeaturesAssignment_1_1_1 )
                    // InternalML2.g:1062:4: rule__ML2Class__FeaturesAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ML2Class__FeaturesAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getML2ClassAccess().getFeaturesAssignment_1_1_1()); 

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
    // $ANTLR end "rule__ML2Class__Alternatives_1_1"


    // $ANTLR start "rule__SomeFOClass__Alternatives_0"
    // InternalML2.g:1070:1: rule__SomeFOClass__Alternatives_0 : ( ( ruleFOClass ) | ( ruleDataType ) );
    public final void rule__SomeFOClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1074:1: ( ( ruleFOClass ) | ( ruleDataType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
                alt6=1;
            }
            else if ( (LA6_0==41) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalML2.g:1075:2: ( ruleFOClass )
                    {
                    // InternalML2.g:1075:2: ( ruleFOClass )
                    // InternalML2.g:1076:3: ruleFOClass
                    {
                     before(grammarAccess.getSomeFOClassAccess().getFOClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFOClass();

                    state._fsp--;

                     after(grammarAccess.getSomeFOClassAccess().getFOClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1081:2: ( ruleDataType )
                    {
                    // InternalML2.g:1081:2: ( ruleDataType )
                    // InternalML2.g:1082:3: ruleDataType
                    {
                     before(grammarAccess.getSomeFOClassAccess().getDataTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getSomeFOClassAccess().getDataTypeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__SomeFOClass__Alternatives_0"


    // $ANTLR start "rule__NonFOClass__Alternatives_0"
    // InternalML2.g:1091:1: rule__NonFOClass__Alternatives_0 : ( ( ruleHOClass ) | ( ruleOrderlessClass ) );
    public final void rule__NonFOClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1095:1: ( ( ruleHOClass ) | ( ruleOrderlessClass ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            else if ( (LA7_0==43) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalML2.g:1096:2: ( ruleHOClass )
                    {
                    // InternalML2.g:1096:2: ( ruleHOClass )
                    // InternalML2.g:1097:3: ruleHOClass
                    {
                     before(grammarAccess.getNonFOClassAccess().getHOClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHOClass();

                    state._fsp--;

                     after(grammarAccess.getNonFOClassAccess().getHOClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1102:2: ( ruleOrderlessClass )
                    {
                    // InternalML2.g:1102:2: ( ruleOrderlessClass )
                    // InternalML2.g:1103:3: ruleOrderlessClass
                    {
                     before(grammarAccess.getNonFOClassAccess().getOrderlessClassParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrderlessClass();

                    state._fsp--;

                     after(grammarAccess.getNonFOClassAccess().getOrderlessClassParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__NonFOClass__Alternatives_0"


    // $ANTLR start "rule__NonFOClass__Alternatives_4"
    // InternalML2.g:1112:1: rule__NonFOClass__Alternatives_4 : ( ( ( rule__NonFOClass__Group_4_0__0 ) ) | ( ( rule__NonFOClass__Group_4_1__0 ) ) );
    public final void rule__NonFOClass__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1116:1: ( ( ( rule__NonFOClass__Group_4_0__0 ) ) | ( ( rule__NonFOClass__Group_4_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=16 && LA8_0<=19)) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalML2.g:1117:2: ( ( rule__NonFOClass__Group_4_0__0 ) )
                    {
                    // InternalML2.g:1117:2: ( ( rule__NonFOClass__Group_4_0__0 ) )
                    // InternalML2.g:1118:3: ( rule__NonFOClass__Group_4_0__0 )
                    {
                     before(grammarAccess.getNonFOClassAccess().getGroup_4_0()); 
                    // InternalML2.g:1119:3: ( rule__NonFOClass__Group_4_0__0 )
                    // InternalML2.g:1119:4: rule__NonFOClass__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFOClass__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonFOClassAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1123:2: ( ( rule__NonFOClass__Group_4_1__0 ) )
                    {
                    // InternalML2.g:1123:2: ( ( rule__NonFOClass__Group_4_1__0 ) )
                    // InternalML2.g:1124:3: ( rule__NonFOClass__Group_4_1__0 )
                    {
                     before(grammarAccess.getNonFOClassAccess().getGroup_4_1()); 
                    // InternalML2.g:1125:3: ( rule__NonFOClass__Group_4_1__0 )
                    // InternalML2.g:1125:4: rule__NonFOClass__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFOClass__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonFOClassAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__NonFOClass__Alternatives_4"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalML2.g:1133:1: rule__Feature__Alternatives : ( ( ruleCommonFeature ) | ( ruleRegularityFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1137:1: ( ( ruleCommonFeature ) | ( ruleRegularityFeature ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==48||LA9_0==53) ) {
                alt9=1;
            }
            else if ( (LA9_0==55) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalML2.g:1138:2: ( ruleCommonFeature )
                    {
                    // InternalML2.g:1138:2: ( ruleCommonFeature )
                    // InternalML2.g:1139:3: ruleCommonFeature
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
                    // InternalML2.g:1144:2: ( ruleRegularityFeature )
                    {
                    // InternalML2.g:1144:2: ( ruleRegularityFeature )
                    // InternalML2.g:1145:3: ruleRegularityFeature
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
    // InternalML2.g:1154:1: rule__CommonFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__CommonFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1158:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==48) ) {
                alt10=1;
            }
            else if ( (LA10_0==53) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalML2.g:1159:2: ( ruleAttribute )
                    {
                    // InternalML2.g:1159:2: ( ruleAttribute )
                    // InternalML2.g:1160:3: ruleAttribute
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
                    // InternalML2.g:1165:2: ( ruleReference )
                    {
                    // InternalML2.g:1165:2: ( ruleReference )
                    // InternalML2.g:1166:3: ruleReference
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
    // InternalML2.g:1175:1: rule__RegularityFeature__Alternatives : ( ( ruleRegularityAttribute ) | ( ruleRegularityReference ) );
    public final void rule__RegularityFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1179:1: ( ( ruleRegularityAttribute ) | ( ruleRegularityReference ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==55) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==53) ) {
                    alt11=2;
                }
                else if ( (LA11_1==RULE_ID||LA11_1==48) ) {
                    alt11=1;
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
                    // InternalML2.g:1180:2: ( ruleRegularityAttribute )
                    {
                    // InternalML2.g:1180:2: ( ruleRegularityAttribute )
                    // InternalML2.g:1181:3: ruleRegularityAttribute
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
                    // InternalML2.g:1186:2: ( ruleRegularityReference )
                    {
                    // InternalML2.g:1186:2: ( ruleRegularityReference )
                    // InternalML2.g:1187:3: ruleRegularityReference
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


    // $ANTLR start "rule__ELEMENTBOUND__Alternatives"
    // InternalML2.g:1196:1: rule__ELEMENTBOUND__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__ELEMENTBOUND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1200:1: ( ( '*' ) | ( RULE_INT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalML2.g:1201:2: ( '*' )
                    {
                    // InternalML2.g:1201:2: ( '*' )
                    // InternalML2.g:1202:3: '*'
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1207:2: ( RULE_INT )
                    {
                    // InternalML2.g:1207:2: ( RULE_INT )
                    // InternalML2.g:1208:3: RULE_INT
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ELEMENTBOUND__Alternatives"


    // $ANTLR start "rule__FeatureAssignment__Alternatives"
    // InternalML2.g:1217:1: rule__FeatureAssignment__Alternatives : ( ( ruleSingleAttributeAssignment ) | ( ruleMultipleAttributeAssignment ) | ( ruleReferenceAssignment ) );
    public final void rule__FeatureAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1221:1: ( ( ruleSingleAttributeAssignment ) | ( ruleMultipleAttributeAssignment ) | ( ruleReferenceAssignment ) )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalML2.g:1222:2: ( ruleSingleAttributeAssignment )
                    {
                    // InternalML2.g:1222:2: ( ruleSingleAttributeAssignment )
                    // InternalML2.g:1223:3: ruleSingleAttributeAssignment
                    {
                     before(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleAttributeAssignment();

                    state._fsp--;

                     after(grammarAccess.getFeatureAssignmentAccess().getSingleAttributeAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1228:2: ( ruleMultipleAttributeAssignment )
                    {
                    // InternalML2.g:1228:2: ( ruleMultipleAttributeAssignment )
                    // InternalML2.g:1229:3: ruleMultipleAttributeAssignment
                    {
                     before(grammarAccess.getFeatureAssignmentAccess().getMultipleAttributeAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMultipleAttributeAssignment();

                    state._fsp--;

                     after(grammarAccess.getFeatureAssignmentAccess().getMultipleAttributeAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1234:2: ( ruleReferenceAssignment )
                    {
                    // InternalML2.g:1234:2: ( ruleReferenceAssignment )
                    // InternalML2.g:1235:3: ruleReferenceAssignment
                    {
                     before(grammarAccess.getFeatureAssignmentAccess().getReferenceAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReferenceAssignment();

                    state._fsp--;

                     after(grammarAccess.getFeatureAssignmentAccess().getReferenceAssignmentParserRuleCall_2()); 

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


    // $ANTLR start "rule__SingleAttributeAssignment__Alternatives_3"
    // InternalML2.g:1244:1: rule__SingleAttributeAssignment__Alternatives_3 : ( ( ( rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0 ) ) | ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) ) | ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) ) );
    public final void rule__SingleAttributeAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1248:1: ( ( ( rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0 ) ) | ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) ) | ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 49:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 12:
            case 13:
            case 57:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalML2.g:1249:2: ( ( rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0 ) )
                    {
                    // InternalML2.g:1249:2: ( ( rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0 ) )
                    // InternalML2.g:1250:3: ( rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getSingleAttributeAssignmentAccess().getEntityAssignmentsAssignment_3_0()); 
                    // InternalML2.g:1251:3: ( rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0 )
                    // InternalML2.g:1251:4: rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleAttributeAssignmentAccess().getEntityAssignmentsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1255:2: ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) )
                    {
                    // InternalML2.g:1255:2: ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) )
                    // InternalML2.g:1256:3: ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 )
                    {
                     before(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_3_1()); 
                    // InternalML2.g:1257:3: ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 )
                    // InternalML2.g:1257:4: rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1261:2: ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) )
                    {
                    // InternalML2.g:1261:2: ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) )
                    // InternalML2.g:1262:3: ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 )
                    {
                     before(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_3_2()); 
                    // InternalML2.g:1263:3: ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 )
                    // InternalML2.g:1263:4: rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_3_2()); 

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
    // $ANTLR end "rule__SingleAttributeAssignment__Alternatives_3"


    // $ANTLR start "rule__MultipleAttributeAssignment__Alternatives_4"
    // InternalML2.g:1271:1: rule__MultipleAttributeAssignment__Alternatives_4 : ( ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) ) | ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) ) );
    public final void rule__MultipleAttributeAssignment__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1275:1: ( ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) ) | ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==RULE_STRING||(LA15_0>=12 && LA15_0<=13)||LA15_0==57) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID||LA15_0==49) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalML2.g:1276:2: ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) )
                    {
                    // InternalML2.g:1276:2: ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) )
                    // InternalML2.g:1277:3: ( rule__MultipleAttributeAssignment__Group_4_0__0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_0()); 
                    // InternalML2.g:1278:3: ( rule__MultipleAttributeAssignment__Group_4_0__0 )
                    // InternalML2.g:1278:4: rule__MultipleAttributeAssignment__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1282:2: ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) )
                    {
                    // InternalML2.g:1282:2: ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) )
                    // InternalML2.g:1283:3: ( rule__MultipleAttributeAssignment__Group_4_1__0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_1()); 
                    // InternalML2.g:1284:3: ( rule__MultipleAttributeAssignment__Group_4_1__0 )
                    // InternalML2.g:1284:4: rule__MultipleAttributeAssignment__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Alternatives_4"


    // $ANTLR start "rule__MultipleAttributeAssignment__Alternatives_4_1_0"
    // InternalML2.g:1292:1: rule__MultipleAttributeAssignment__Alternatives_4_1_0 : ( ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) ) );
    public final void rule__MultipleAttributeAssignment__Alternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1296:1: ( ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==49) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalML2.g:1297:2: ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0 ) )
                    {
                    // InternalML2.g:1297:2: ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0 ) )
                    // InternalML2.g:1298:3: ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsAssignment_4_1_0_0()); 
                    // InternalML2.g:1299:3: ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0 )
                    // InternalML2.g:1299:4: rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsAssignment_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1303:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) )
                    {
                    // InternalML2.g:1303:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) )
                    // InternalML2.g:1304:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_4_1_0_1()); 
                    // InternalML2.g:1305:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 )
                    // InternalML2.g:1305:4: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_4_1_0_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Alternatives_4_1_0"


    // $ANTLR start "rule__MultipleAttributeAssignment__Alternatives_4_1_1_1"
    // InternalML2.g:1313:1: rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 : ( ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) ) );
    public final void rule__MultipleAttributeAssignment__Alternatives_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1317:1: ( ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==49) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalML2.g:1318:2: ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0 ) )
                    {
                    // InternalML2.g:1318:2: ( ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0 ) )
                    // InternalML2.g:1319:3: ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsAssignment_4_1_1_1_0()); 
                    // InternalML2.g:1320:3: ( rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0 )
                    // InternalML2.g:1320:4: rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsAssignment_4_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1324:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) )
                    {
                    // InternalML2.g:1324:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) )
                    // InternalML2.g:1325:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_4_1_1_1_1()); 
                    // InternalML2.g:1326:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 )
                    // InternalML2.g:1326:4: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_4_1_1_1_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Alternatives_4_1_1_1"


    // $ANTLR start "rule__ReferenceAssignment__Alternatives_3"
    // InternalML2.g:1334:1: rule__ReferenceAssignment__Alternatives_3 : ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) );
    public final void rule__ReferenceAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1338:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalML2.g:1339:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalML2.g:1339:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalML2.g:1340:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalML2.g:1341:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    // InternalML2.g:1341:4: rule__ReferenceAssignment__AssignmentsAssignment_3_0
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
                    // InternalML2.g:1345:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    {
                    // InternalML2.g:1345:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    // InternalML2.g:1346:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 
                    // InternalML2.g:1347:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    // InternalML2.g:1347:4: rule__ReferenceAssignment__Group_3_1__0
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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalML2.g:1355:1: rule__Literal__Alternatives : ( ( ruleML2String ) | ( ruleML2Number ) | ( ruleML2Boolean ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1359:1: ( ( ruleML2String ) | ( ruleML2Number ) | ( ruleML2Boolean ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
            case 57:
                {
                alt19=2;
                }
                break;
            case 12:
            case 13:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalML2.g:1360:2: ( ruleML2String )
                    {
                    // InternalML2.g:1360:2: ( ruleML2String )
                    // InternalML2.g:1361:3: ruleML2String
                    {
                     before(grammarAccess.getLiteralAccess().getML2StringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleML2String();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getML2StringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1366:2: ( ruleML2Number )
                    {
                    // InternalML2.g:1366:2: ( ruleML2Number )
                    // InternalML2.g:1367:3: ruleML2Number
                    {
                     before(grammarAccess.getLiteralAccess().getML2NumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleML2Number();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getML2NumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1372:2: ( ruleML2Boolean )
                    {
                    // InternalML2.g:1372:2: ( ruleML2Boolean )
                    // InternalML2.g:1373:3: ruleML2Boolean
                    {
                     before(grammarAccess.getLiteralAccess().getML2BooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleML2Boolean();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getML2BooleanParserRuleCall_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalML2.g:1382:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1386:1: ( ( 'true' ) | ( 'false' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            else if ( (LA20_0==13) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalML2.g:1387:2: ( 'true' )
                    {
                    // InternalML2.g:1387:2: ( 'true' )
                    // InternalML2.g:1388:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1393:2: ( 'false' )
                    {
                    // InternalML2.g:1393:2: ( 'false' )
                    // InternalML2.g:1394:3: 'false'
                    {
                     before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives_2_2_0"
    // InternalML2.g:1403:1: rule__NUMBER__Alternatives_2_2_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__NUMBER__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1407:1: ( ( 'E' ) | ( 'e' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            else if ( (LA21_0==15) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalML2.g:1408:2: ( 'E' )
                    {
                    // InternalML2.g:1408:2: ( 'E' )
                    // InternalML2.g:1409:3: 'E'
                    {
                     before(grammarAccess.getNUMBERAccess().getEKeyword_2_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getEKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1414:2: ( 'e' )
                    {
                    // InternalML2.g:1414:2: ( 'e' )
                    // InternalML2.g:1415:3: 'e'
                    {
                     before(grammarAccess.getNUMBERAccess().getEKeyword_2_2_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getEKeyword_2_2_0_1()); 

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
    // $ANTLR end "rule__NUMBER__Alternatives_2_2_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Alternatives_2"
    // InternalML2.g:1424:1: rule__SimpleAttributeAssignment__Alternatives_2 : ( ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) ) | ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1428:1: ( ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) ) | ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case 49:
                {
                alt22=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 12:
            case 13:
            case 57:
                {
                alt22=3;
                }
                break;
            case 27:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalML2.g:1429:2: ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0 ) )
                    {
                    // InternalML2.g:1429:2: ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0 ) )
                    // InternalML2.g:1430:3: ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsAssignment_2_0()); 
                    // InternalML2.g:1431:3: ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0 )
                    // InternalML2.g:1431:4: rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1435:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) )
                    {
                    // InternalML2.g:1435:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) )
                    // InternalML2.g:1436:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_1()); 
                    // InternalML2.g:1437:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 )
                    // InternalML2.g:1437:4: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1441:2: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) )
                    {
                    // InternalML2.g:1441:2: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) )
                    // InternalML2.g:1442:3: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_2()); 
                    // InternalML2.g:1443:3: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 )
                    // InternalML2.g:1443:4: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:1447:2: ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) )
                    {
                    // InternalML2.g:1447:2: ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) )
                    // InternalML2.g:1448:3: ( rule__SimpleAttributeAssignment__Group_2_3__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3()); 
                    // InternalML2.g:1449:3: ( rule__SimpleAttributeAssignment__Group_2_3__0 )
                    // InternalML2.g:1449:4: rule__SimpleAttributeAssignment__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Alternatives_2"


    // $ANTLR start "rule__SimpleAttributeAssignment__Alternatives_2_3_1"
    // InternalML2.g:1457:1: rule__SimpleAttributeAssignment__Alternatives_2_3_1 : ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1461:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==RULE_STRING||(LA23_0>=12 && LA23_0<=13)||LA23_0==57) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID||LA23_0==49) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalML2.g:1462:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) )
                    {
                    // InternalML2.g:1462:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) )
                    // InternalML2.g:1463:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_0()); 
                    // InternalML2.g:1464:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 )
                    // InternalML2.g:1464:4: rule__SimpleAttributeAssignment__Group_2_3_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__Group_2_3_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1468:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) )
                    {
                    // InternalML2.g:1468:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) )
                    // InternalML2.g:1469:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_1()); 
                    // InternalML2.g:1470:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 )
                    // InternalML2.g:1470:4: rule__SimpleAttributeAssignment__Group_2_3_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__Group_2_3_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Alternatives_2_3_1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0"
    // InternalML2.g:1478:1: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 : ( ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1482:1: ( ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==49) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalML2.g:1483:2: ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0 ) )
                    {
                    // InternalML2.g:1483:2: ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0 ) )
                    // InternalML2.g:1484:3: ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsAssignment_2_3_1_1_0_0()); 
                    // InternalML2.g:1485:3: ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0 )
                    // InternalML2.g:1485:4: rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsAssignment_2_3_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1489:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) )
                    {
                    // InternalML2.g:1489:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) )
                    // InternalML2.g:1490:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1()); 
                    // InternalML2.g:1491:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 )
                    // InternalML2.g:1491:4: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1"
    // InternalML2.g:1499:1: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 : ( ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1503:1: ( ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==49) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalML2.g:1504:2: ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0 ) )
                    {
                    // InternalML2.g:1504:2: ( ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0 ) )
                    // InternalML2.g:1505:3: ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsAssignment_2_3_1_1_1_1_0()); 
                    // InternalML2.g:1506:3: ( rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0 )
                    // InternalML2.g:1506:4: rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsAssignment_2_3_1_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1510:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) )
                    {
                    // InternalML2.g:1510:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) )
                    // InternalML2.g:1511:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1()); 
                    // InternalML2.g:1512:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 )
                    // InternalML2.g:1512:4: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1"


    // $ANTLR start "rule__CategorizationType__Alternatives"
    // InternalML2.g:1520:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1524:1: ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt26=1;
                }
                break;
            case 17:
                {
                alt26=2;
                }
                break;
            case 18:
                {
                alt26=3;
                }
                break;
            case 19:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalML2.g:1525:2: ( ( 'categorizes' ) )
                    {
                    // InternalML2.g:1525:2: ( ( 'categorizes' ) )
                    // InternalML2.g:1526:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalML2.g:1527:3: ( 'categorizes' )
                    // InternalML2.g:1527:4: 'categorizes'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1531:2: ( ( 'completeCategorizes' ) )
                    {
                    // InternalML2.g:1531:2: ( ( 'completeCategorizes' ) )
                    // InternalML2.g:1532:3: ( 'completeCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalML2.g:1533:3: ( 'completeCategorizes' )
                    // InternalML2.g:1533:4: 'completeCategorizes'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1537:2: ( ( 'disjointCategorizes' ) )
                    {
                    // InternalML2.g:1537:2: ( ( 'disjointCategorizes' ) )
                    // InternalML2.g:1538:3: ( 'disjointCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalML2.g:1539:3: ( 'disjointCategorizes' )
                    // InternalML2.g:1539:4: 'disjointCategorizes'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:1543:2: ( ( 'partitions' ) )
                    {
                    // InternalML2.g:1543:2: ( ( 'partitions' ) )
                    // InternalML2.g:1544:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalML2.g:1545:3: ( 'partitions' )
                    // InternalML2.g:1545:4: 'partitions'
                    {
                    match(input,19,FOLLOW_2); 

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


    // $ANTLR start "rule__RegularityFeatureType__Alternatives"
    // InternalML2.g:1553:1: rule__RegularityFeatureType__Alternatives : ( ( ( 'determinesValue' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesAllowedValues' ) ) | ( ( 'determinesAllowedTypes' ) ) | ( ( 'determinesMaxValue' ) ) );
    public final void rule__RegularityFeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1557:1: ( ( ( 'determinesValue' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesAllowedValues' ) ) | ( ( 'determinesAllowedTypes' ) ) | ( ( 'determinesMaxValue' ) ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt27=1;
                }
                break;
            case 21:
                {
                alt27=2;
                }
                break;
            case 22:
                {
                alt27=3;
                }
                break;
            case 23:
                {
                alt27=4;
                }
                break;
            case 24:
                {
                alt27=5;
                }
                break;
            case 25:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalML2.g:1558:2: ( ( 'determinesValue' ) )
                    {
                    // InternalML2.g:1558:2: ( ( 'determinesValue' ) )
                    // InternalML2.g:1559:3: ( 'determinesValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 
                    // InternalML2.g:1560:3: ( 'determinesValue' )
                    // InternalML2.g:1560:4: 'determinesValue'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1564:2: ( ( 'determinesType' ) )
                    {
                    // InternalML2.g:1564:2: ( ( 'determinesType' ) )
                    // InternalML2.g:1565:3: ( 'determinesType' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1()); 
                    // InternalML2.g:1566:3: ( 'determinesType' )
                    // InternalML2.g:1566:4: 'determinesType'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1570:2: ( ( 'determinesMinValue' ) )
                    {
                    // InternalML2.g:1570:2: ( ( 'determinesMinValue' ) )
                    // InternalML2.g:1571:3: ( 'determinesMinValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2()); 
                    // InternalML2.g:1572:3: ( 'determinesMinValue' )
                    // InternalML2.g:1572:4: 'determinesMinValue'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:1576:2: ( ( 'determinesAllowedValues' ) )
                    {
                    // InternalML2.g:1576:2: ( ( 'determinesAllowedValues' ) )
                    // InternalML2.g:1577:3: ( 'determinesAllowedValues' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3()); 
                    // InternalML2.g:1578:3: ( 'determinesAllowedValues' )
                    // InternalML2.g:1578:4: 'determinesAllowedValues'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:1582:2: ( ( 'determinesAllowedTypes' ) )
                    {
                    // InternalML2.g:1582:2: ( ( 'determinesAllowedTypes' ) )
                    // InternalML2.g:1583:3: ( 'determinesAllowedTypes' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4()); 
                    // InternalML2.g:1584:3: ( 'determinesAllowedTypes' )
                    // InternalML2.g:1584:4: 'determinesAllowedTypes'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:1588:2: ( ( 'determinesMaxValue' ) )
                    {
                    // InternalML2.g:1588:2: ( ( 'determinesMaxValue' ) )
                    // InternalML2.g:1589:3: ( 'determinesMaxValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_5()); 
                    // InternalML2.g:1590:3: ( 'determinesMaxValue' )
                    // InternalML2.g:1590:4: 'determinesMaxValue'
                    {
                    match(input,25,FOLLOW_2); 

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


    // $ANTLR start "rule__ML2Model__Group__0"
    // InternalML2.g:1598:1: rule__ML2Model__Group__0 : rule__ML2Model__Group__0__Impl rule__ML2Model__Group__1 ;
    public final void rule__ML2Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1602:1: ( rule__ML2Model__Group__0__Impl rule__ML2Model__Group__1 )
            // InternalML2.g:1603:2: rule__ML2Model__Group__0__Impl rule__ML2Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ML2Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Model__Group__1();

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
    // $ANTLR end "rule__ML2Model__Group__0"


    // $ANTLR start "rule__ML2Model__Group__0__Impl"
    // InternalML2.g:1610:1: rule__ML2Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__ML2Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1614:1: ( ( 'module' ) )
            // InternalML2.g:1615:1: ( 'module' )
            {
            // InternalML2.g:1615:1: ( 'module' )
            // InternalML2.g:1616:2: 'module'
            {
             before(grammarAccess.getML2ModelAccess().getModuleKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getML2ModelAccess().getModuleKeyword_0()); 

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
    // $ANTLR end "rule__ML2Model__Group__0__Impl"


    // $ANTLR start "rule__ML2Model__Group__1"
    // InternalML2.g:1625:1: rule__ML2Model__Group__1 : rule__ML2Model__Group__1__Impl rule__ML2Model__Group__2 ;
    public final void rule__ML2Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1629:1: ( rule__ML2Model__Group__1__Impl rule__ML2Model__Group__2 )
            // InternalML2.g:1630:2: rule__ML2Model__Group__1__Impl rule__ML2Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ML2Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Model__Group__2();

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
    // $ANTLR end "rule__ML2Model__Group__1"


    // $ANTLR start "rule__ML2Model__Group__1__Impl"
    // InternalML2.g:1637:1: rule__ML2Model__Group__1__Impl : ( ( rule__ML2Model__NameAssignment_1 ) ) ;
    public final void rule__ML2Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1641:1: ( ( ( rule__ML2Model__NameAssignment_1 ) ) )
            // InternalML2.g:1642:1: ( ( rule__ML2Model__NameAssignment_1 ) )
            {
            // InternalML2.g:1642:1: ( ( rule__ML2Model__NameAssignment_1 ) )
            // InternalML2.g:1643:2: ( rule__ML2Model__NameAssignment_1 )
            {
             before(grammarAccess.getML2ModelAccess().getNameAssignment_1()); 
            // InternalML2.g:1644:2: ( rule__ML2Model__NameAssignment_1 )
            // InternalML2.g:1644:3: rule__ML2Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ML2Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getML2ModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ML2Model__Group__1__Impl"


    // $ANTLR start "rule__ML2Model__Group__2"
    // InternalML2.g:1652:1: rule__ML2Model__Group__2 : rule__ML2Model__Group__2__Impl rule__ML2Model__Group__3 ;
    public final void rule__ML2Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1656:1: ( rule__ML2Model__Group__2__Impl rule__ML2Model__Group__3 )
            // InternalML2.g:1657:2: rule__ML2Model__Group__2__Impl rule__ML2Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ML2Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Model__Group__3();

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
    // $ANTLR end "rule__ML2Model__Group__2"


    // $ANTLR start "rule__ML2Model__Group__2__Impl"
    // InternalML2.g:1664:1: rule__ML2Model__Group__2__Impl : ( '{' ) ;
    public final void rule__ML2Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1668:1: ( ( '{' ) )
            // InternalML2.g:1669:1: ( '{' )
            {
            // InternalML2.g:1669:1: ( '{' )
            // InternalML2.g:1670:2: '{'
            {
             before(grammarAccess.getML2ModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getML2ModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ML2Model__Group__2__Impl"


    // $ANTLR start "rule__ML2Model__Group__3"
    // InternalML2.g:1679:1: rule__ML2Model__Group__3 : rule__ML2Model__Group__3__Impl rule__ML2Model__Group__4 ;
    public final void rule__ML2Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1683:1: ( rule__ML2Model__Group__3__Impl rule__ML2Model__Group__4 )
            // InternalML2.g:1684:2: rule__ML2Model__Group__3__Impl rule__ML2Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ML2Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Model__Group__4();

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
    // $ANTLR end "rule__ML2Model__Group__3"


    // $ANTLR start "rule__ML2Model__Group__3__Impl"
    // InternalML2.g:1691:1: rule__ML2Model__Group__3__Impl : ( ( rule__ML2Model__Alternatives_3 )* ) ;
    public final void rule__ML2Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1695:1: ( ( ( rule__ML2Model__Alternatives_3 )* ) )
            // InternalML2.g:1696:1: ( ( rule__ML2Model__Alternatives_3 )* )
            {
            // InternalML2.g:1696:1: ( ( rule__ML2Model__Alternatives_3 )* )
            // InternalML2.g:1697:2: ( rule__ML2Model__Alternatives_3 )*
            {
             before(grammarAccess.getML2ModelAccess().getAlternatives_3()); 
            // InternalML2.g:1698:2: ( rule__ML2Model__Alternatives_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29||(LA28_0>=33 && LA28_0<=34)||(LA28_0>=40 && LA28_0<=44)||(LA28_0>=58 && LA28_0<=59)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalML2.g:1698:3: rule__ML2Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ML2Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getML2ModelAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__ML2Model__Group__3__Impl"


    // $ANTLR start "rule__ML2Model__Group__4"
    // InternalML2.g:1706:1: rule__ML2Model__Group__4 : rule__ML2Model__Group__4__Impl ;
    public final void rule__ML2Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1710:1: ( rule__ML2Model__Group__4__Impl )
            // InternalML2.g:1711:2: rule__ML2Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ML2Model__Group__4__Impl();

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
    // $ANTLR end "rule__ML2Model__Group__4"


    // $ANTLR start "rule__ML2Model__Group__4__Impl"
    // InternalML2.g:1717:1: rule__ML2Model__Group__4__Impl : ( '}' ) ;
    public final void rule__ML2Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1721:1: ( ( '}' ) )
            // InternalML2.g:1722:1: ( '}' )
            {
            // InternalML2.g:1722:1: ( '}' )
            // InternalML2.g:1723:2: '}'
            {
             before(grammarAccess.getML2ModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getML2ModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ML2Model__Group__4__Impl"


    // $ANTLR start "rule__ML2Model__Group_3_0__0"
    // InternalML2.g:1733:1: rule__ML2Model__Group_3_0__0 : rule__ML2Model__Group_3_0__0__Impl rule__ML2Model__Group_3_0__1 ;
    public final void rule__ML2Model__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1737:1: ( rule__ML2Model__Group_3_0__0__Impl rule__ML2Model__Group_3_0__1 )
            // InternalML2.g:1738:2: rule__ML2Model__Group_3_0__0__Impl rule__ML2Model__Group_3_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ML2Model__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Model__Group_3_0__1();

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
    // $ANTLR end "rule__ML2Model__Group_3_0__0"


    // $ANTLR start "rule__ML2Model__Group_3_0__0__Impl"
    // InternalML2.g:1745:1: rule__ML2Model__Group_3_0__0__Impl : ( 'include' ) ;
    public final void rule__ML2Model__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1749:1: ( ( 'include' ) )
            // InternalML2.g:1750:1: ( 'include' )
            {
            // InternalML2.g:1750:1: ( 'include' )
            // InternalML2.g:1751:2: 'include'
            {
             before(grammarAccess.getML2ModelAccess().getIncludeKeyword_3_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getML2ModelAccess().getIncludeKeyword_3_0_0()); 

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
    // $ANTLR end "rule__ML2Model__Group_3_0__0__Impl"


    // $ANTLR start "rule__ML2Model__Group_3_0__1"
    // InternalML2.g:1760:1: rule__ML2Model__Group_3_0__1 : rule__ML2Model__Group_3_0__1__Impl rule__ML2Model__Group_3_0__2 ;
    public final void rule__ML2Model__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1764:1: ( rule__ML2Model__Group_3_0__1__Impl rule__ML2Model__Group_3_0__2 )
            // InternalML2.g:1765:2: rule__ML2Model__Group_3_0__1__Impl rule__ML2Model__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__ML2Model__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Model__Group_3_0__2();

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
    // $ANTLR end "rule__ML2Model__Group_3_0__1"


    // $ANTLR start "rule__ML2Model__Group_3_0__1__Impl"
    // InternalML2.g:1772:1: rule__ML2Model__Group_3_0__1__Impl : ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) ) ;
    public final void rule__ML2Model__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1776:1: ( ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) ) )
            // InternalML2.g:1777:1: ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) )
            {
            // InternalML2.g:1777:1: ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) )
            // InternalML2.g:1778:2: ( rule__ML2Model__IncludesAssignment_3_0_1 )
            {
             before(grammarAccess.getML2ModelAccess().getIncludesAssignment_3_0_1()); 
            // InternalML2.g:1779:2: ( rule__ML2Model__IncludesAssignment_3_0_1 )
            // InternalML2.g:1779:3: rule__ML2Model__IncludesAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ML2Model__IncludesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getML2ModelAccess().getIncludesAssignment_3_0_1()); 

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
    // $ANTLR end "rule__ML2Model__Group_3_0__1__Impl"


    // $ANTLR start "rule__ML2Model__Group_3_0__2"
    // InternalML2.g:1787:1: rule__ML2Model__Group_3_0__2 : rule__ML2Model__Group_3_0__2__Impl ;
    public final void rule__ML2Model__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1791:1: ( rule__ML2Model__Group_3_0__2__Impl )
            // InternalML2.g:1792:2: rule__ML2Model__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ML2Model__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__ML2Model__Group_3_0__2"


    // $ANTLR start "rule__ML2Model__Group_3_0__2__Impl"
    // InternalML2.g:1798:1: rule__ML2Model__Group_3_0__2__Impl : ( ';' ) ;
    public final void rule__ML2Model__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1802:1: ( ( ';' ) )
            // InternalML2.g:1803:1: ( ';' )
            {
            // InternalML2.g:1803:1: ( ';' )
            // InternalML2.g:1804:2: ';'
            {
             before(grammarAccess.getML2ModelAccess().getSemicolonKeyword_3_0_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getML2ModelAccess().getSemicolonKeyword_3_0_2()); 

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
    // $ANTLR end "rule__ML2Model__Group_3_0__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalML2.g:1814:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1818:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalML2.g:1819:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalML2.g:1826:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1830:1: ( ( RULE_ID ) )
            // InternalML2.g:1831:1: ( RULE_ID )
            {
            // InternalML2.g:1831:1: ( RULE_ID )
            // InternalML2.g:1832:2: RULE_ID
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
    // InternalML2.g:1841:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1845:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalML2.g:1846:2: rule__QualifiedName__Group__1__Impl
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
    // InternalML2.g:1852:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1856:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalML2.g:1857:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalML2.g:1857:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalML2.g:1858:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalML2.g:1859:2: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalML2.g:1859:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalML2.g:1868:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1872:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalML2.g:1873:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalML2.g:1880:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1884:1: ( ( '.' ) )
            // InternalML2.g:1885:1: ( '.' )
            {
            // InternalML2.g:1885:1: ( '.' )
            // InternalML2.g:1886:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalML2.g:1895:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1899:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalML2.g:1900:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalML2.g:1906:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1910:1: ( ( RULE_ID ) )
            // InternalML2.g:1911:1: ( RULE_ID )
            {
            // InternalML2.g:1911:1: ( RULE_ID )
            // InternalML2.g:1912:2: RULE_ID
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
    // InternalML2.g:1922:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1926:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalML2.g:1927:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalML2.g:1934:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1938:1: ( ( ruleQualifiedName ) )
            // InternalML2.g:1939:1: ( ruleQualifiedName )
            {
            // InternalML2.g:1939:1: ( ruleQualifiedName )
            // InternalML2.g:1940:2: ruleQualifiedName
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
    // InternalML2.g:1949:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1953:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalML2.g:1954:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalML2.g:1960:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1964:1: ( ( ( '.*' )? ) )
            // InternalML2.g:1965:1: ( ( '.*' )? )
            {
            // InternalML2.g:1965:1: ( ( '.*' )? )
            // InternalML2.g:1966:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalML2.g:1967:2: ( '.*' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalML2.g:1967:3: '.*'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalML2.g:1976:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1980:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalML2.g:1981:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalML2.g:1988:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1992:1: ( ( 'import' ) )
            // InternalML2.g:1993:1: ( 'import' )
            {
            // InternalML2.g:1993:1: ( 'import' )
            // InternalML2.g:1994:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalML2.g:2003:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2007:1: ( rule__Import__Group__1__Impl )
            // InternalML2.g:2008:2: rule__Import__Group__1__Impl
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
    // InternalML2.g:2014:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2018:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalML2.g:2019:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalML2.g:2019:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalML2.g:2020:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalML2.g:2021:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalML2.g:2021:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalML2.g:2030:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2034:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalML2.g:2035:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalML2.g:2042:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2046:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalML2.g:2047:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalML2.g:2047:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalML2.g:2048:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalML2.g:2049:2: ( rule__ModelElement__Alternatives_0 )
            // InternalML2.g:2049:3: rule__ModelElement__Alternatives_0
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
    // InternalML2.g:2057:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2061:1: ( rule__ModelElement__Group__1__Impl )
            // InternalML2.g:2062:2: rule__ModelElement__Group__1__Impl
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
    // InternalML2.g:2068:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2072:1: ( ( ';' ) )
            // InternalML2.g:2073:1: ( ';' )
            {
            // InternalML2.g:2073:1: ( ';' )
            // InternalML2.g:2074:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalML2.g:2084:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2088:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalML2.g:2089:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
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
    // InternalML2.g:2096:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2100:1: ( ( 'individual' ) )
            // InternalML2.g:2101:1: ( 'individual' )
            {
            // InternalML2.g:2101:1: ( 'individual' )
            // InternalML2.g:2102:2: 'individual'
            {
             before(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalML2.g:2111:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2115:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalML2.g:2116:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
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
    // InternalML2.g:2123:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2127:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalML2.g:2128:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalML2.g:2128:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalML2.g:2129:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalML2.g:2130:2: ( rule__Individual__NameAssignment_1 )
            // InternalML2.g:2130:3: rule__Individual__NameAssignment_1
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
    // InternalML2.g:2138:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2142:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalML2.g:2143:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
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
    // InternalML2.g:2150:1: rule__Individual__Group__2__Impl : ( ':' ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2154:1: ( ( ':' ) )
            // InternalML2.g:2155:1: ( ':' )
            {
            // InternalML2.g:2155:1: ( ':' )
            // InternalML2.g:2156:2: ':'
            {
             before(grammarAccess.getIndividualAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalML2.g:2165:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl rule__Individual__Group__4 ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2169:1: ( rule__Individual__Group__3__Impl rule__Individual__Group__4 )
            // InternalML2.g:2170:2: rule__Individual__Group__3__Impl rule__Individual__Group__4
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
    // InternalML2.g:2177:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_3 ) ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2181:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_3 ) ) )
            // InternalML2.g:2182:1: ( ( rule__Individual__InstantiatedClassesAssignment_3 ) )
            {
            // InternalML2.g:2182:1: ( ( rule__Individual__InstantiatedClassesAssignment_3 ) )
            // InternalML2.g:2183:2: ( rule__Individual__InstantiatedClassesAssignment_3 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_3()); 
            // InternalML2.g:2184:2: ( rule__Individual__InstantiatedClassesAssignment_3 )
            // InternalML2.g:2184:3: rule__Individual__InstantiatedClassesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Individual__InstantiatedClassesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_3()); 

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
    // InternalML2.g:2192:1: rule__Individual__Group__4 : rule__Individual__Group__4__Impl rule__Individual__Group__5 ;
    public final void rule__Individual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2196:1: ( rule__Individual__Group__4__Impl rule__Individual__Group__5 )
            // InternalML2.g:2197:2: rule__Individual__Group__4__Impl rule__Individual__Group__5
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
    // InternalML2.g:2204:1: rule__Individual__Group__4__Impl : ( ( rule__Individual__Group_4__0 )* ) ;
    public final void rule__Individual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2208:1: ( ( ( rule__Individual__Group_4__0 )* ) )
            // InternalML2.g:2209:1: ( ( rule__Individual__Group_4__0 )* )
            {
            // InternalML2.g:2209:1: ( ( rule__Individual__Group_4__0 )* )
            // InternalML2.g:2210:2: ( rule__Individual__Group_4__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_4()); 
            // InternalML2.g:2211:2: ( rule__Individual__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalML2.g:2211:3: rule__Individual__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalML2.g:2219:1: rule__Individual__Group__5 : rule__Individual__Group__5__Impl ;
    public final void rule__Individual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2223:1: ( rule__Individual__Group__5__Impl )
            // InternalML2.g:2224:2: rule__Individual__Group__5__Impl
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
    // InternalML2.g:2230:1: rule__Individual__Group__5__Impl : ( ( rule__Individual__Group_5__0 )? ) ;
    public final void rule__Individual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2234:1: ( ( ( rule__Individual__Group_5__0 )? ) )
            // InternalML2.g:2235:1: ( ( rule__Individual__Group_5__0 )? )
            {
            // InternalML2.g:2235:1: ( ( rule__Individual__Group_5__0 )? )
            // InternalML2.g:2236:2: ( rule__Individual__Group_5__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_5()); 
            // InternalML2.g:2237:2: ( rule__Individual__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalML2.g:2237:3: rule__Individual__Group_5__0
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
    // InternalML2.g:2246:1: rule__Individual__Group_4__0 : rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1 ;
    public final void rule__Individual__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2250:1: ( rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1 )
            // InternalML2.g:2251:2: rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1
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
    // InternalML2.g:2258:1: rule__Individual__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2262:1: ( ( ',' ) )
            // InternalML2.g:2263:1: ( ',' )
            {
            // InternalML2.g:2263:1: ( ',' )
            // InternalML2.g:2264:2: ','
            {
             before(grammarAccess.getIndividualAccess().getCommaKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:2273:1: rule__Individual__Group_4__1 : rule__Individual__Group_4__1__Impl ;
    public final void rule__Individual__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2277:1: ( rule__Individual__Group_4__1__Impl )
            // InternalML2.g:2278:2: rule__Individual__Group_4__1__Impl
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
    // InternalML2.g:2284:1: rule__Individual__Group_4__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) ) ;
    public final void rule__Individual__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2288:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) ) )
            // InternalML2.g:2289:1: ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) )
            {
            // InternalML2.g:2289:1: ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) )
            // InternalML2.g:2290:2: ( rule__Individual__InstantiatedClassesAssignment_4_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_4_1()); 
            // InternalML2.g:2291:2: ( rule__Individual__InstantiatedClassesAssignment_4_1 )
            // InternalML2.g:2291:3: rule__Individual__InstantiatedClassesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Individual__InstantiatedClassesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_4_1()); 

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
    // InternalML2.g:2300:1: rule__Individual__Group_5__0 : rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1 ;
    public final void rule__Individual__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2304:1: ( rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1 )
            // InternalML2.g:2305:2: rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1
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
    // InternalML2.g:2312:1: rule__Individual__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2316:1: ( ( '{' ) )
            // InternalML2.g:2317:1: ( '{' )
            {
            // InternalML2.g:2317:1: ( '{' )
            // InternalML2.g:2318:2: '{'
            {
             before(grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalML2.g:2327:1: rule__Individual__Group_5__1 : rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2 ;
    public final void rule__Individual__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2331:1: ( rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2 )
            // InternalML2.g:2332:2: rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2
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
    // InternalML2.g:2339:1: rule__Individual__Group_5__1__Impl : ( ( rule__Individual__AssignmentsAssignment_5_1 )* ) ;
    public final void rule__Individual__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2343:1: ( ( ( rule__Individual__AssignmentsAssignment_5_1 )* ) )
            // InternalML2.g:2344:1: ( ( rule__Individual__AssignmentsAssignment_5_1 )* )
            {
            // InternalML2.g:2344:1: ( ( rule__Individual__AssignmentsAssignment_5_1 )* )
            // InternalML2.g:2345:2: ( rule__Individual__AssignmentsAssignment_5_1 )*
            {
             before(grammarAccess.getIndividualAccess().getAssignmentsAssignment_5_1()); 
            // InternalML2.g:2346:2: ( rule__Individual__AssignmentsAssignment_5_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==48||LA33_0==53) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalML2.g:2346:3: rule__Individual__AssignmentsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__AssignmentsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalML2.g:2354:1: rule__Individual__Group_5__2 : rule__Individual__Group_5__2__Impl ;
    public final void rule__Individual__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2358:1: ( rule__Individual__Group_5__2__Impl )
            // InternalML2.g:2359:2: rule__Individual__Group_5__2__Impl
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
    // InternalML2.g:2365:1: rule__Individual__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2369:1: ( ( '}' ) )
            // InternalML2.g:2370:1: ( '}' )
            {
            // InternalML2.g:2370:1: ( '}' )
            // InternalML2.g:2371:2: '}'
            {
             before(grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__ML2Class__Group__0"
    // InternalML2.g:2381:1: rule__ML2Class__Group__0 : rule__ML2Class__Group__0__Impl rule__ML2Class__Group__1 ;
    public final void rule__ML2Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2385:1: ( rule__ML2Class__Group__0__Impl rule__ML2Class__Group__1 )
            // InternalML2.g:2386:2: rule__ML2Class__Group__0__Impl rule__ML2Class__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ML2Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Class__Group__1();

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
    // $ANTLR end "rule__ML2Class__Group__0"


    // $ANTLR start "rule__ML2Class__Group__0__Impl"
    // InternalML2.g:2393:1: rule__ML2Class__Group__0__Impl : ( ( rule__ML2Class__Alternatives_0 ) ) ;
    public final void rule__ML2Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2397:1: ( ( ( rule__ML2Class__Alternatives_0 ) ) )
            // InternalML2.g:2398:1: ( ( rule__ML2Class__Alternatives_0 ) )
            {
            // InternalML2.g:2398:1: ( ( rule__ML2Class__Alternatives_0 ) )
            // InternalML2.g:2399:2: ( rule__ML2Class__Alternatives_0 )
            {
             before(grammarAccess.getML2ClassAccess().getAlternatives_0()); 
            // InternalML2.g:2400:2: ( rule__ML2Class__Alternatives_0 )
            // InternalML2.g:2400:3: rule__ML2Class__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ML2Class__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getML2ClassAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__ML2Class__Group__0__Impl"


    // $ANTLR start "rule__ML2Class__Group__1"
    // InternalML2.g:2408:1: rule__ML2Class__Group__1 : rule__ML2Class__Group__1__Impl ;
    public final void rule__ML2Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2412:1: ( rule__ML2Class__Group__1__Impl )
            // InternalML2.g:2413:2: rule__ML2Class__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ML2Class__Group__1__Impl();

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
    // $ANTLR end "rule__ML2Class__Group__1"


    // $ANTLR start "rule__ML2Class__Group__1__Impl"
    // InternalML2.g:2419:1: rule__ML2Class__Group__1__Impl : ( ( rule__ML2Class__Group_1__0 )? ) ;
    public final void rule__ML2Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2423:1: ( ( ( rule__ML2Class__Group_1__0 )? ) )
            // InternalML2.g:2424:1: ( ( rule__ML2Class__Group_1__0 )? )
            {
            // InternalML2.g:2424:1: ( ( rule__ML2Class__Group_1__0 )? )
            // InternalML2.g:2425:2: ( rule__ML2Class__Group_1__0 )?
            {
             before(grammarAccess.getML2ClassAccess().getGroup_1()); 
            // InternalML2.g:2426:2: ( rule__ML2Class__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalML2.g:2426:3: rule__ML2Class__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ML2Class__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getML2ClassAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ML2Class__Group__1__Impl"


    // $ANTLR start "rule__ML2Class__Group_1__0"
    // InternalML2.g:2435:1: rule__ML2Class__Group_1__0 : rule__ML2Class__Group_1__0__Impl rule__ML2Class__Group_1__1 ;
    public final void rule__ML2Class__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2439:1: ( rule__ML2Class__Group_1__0__Impl rule__ML2Class__Group_1__1 )
            // InternalML2.g:2440:2: rule__ML2Class__Group_1__0__Impl rule__ML2Class__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ML2Class__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Class__Group_1__1();

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
    // $ANTLR end "rule__ML2Class__Group_1__0"


    // $ANTLR start "rule__ML2Class__Group_1__0__Impl"
    // InternalML2.g:2447:1: rule__ML2Class__Group_1__0__Impl : ( '{' ) ;
    public final void rule__ML2Class__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2451:1: ( ( '{' ) )
            // InternalML2.g:2452:1: ( '{' )
            {
            // InternalML2.g:2452:1: ( '{' )
            // InternalML2.g:2453:2: '{'
            {
             before(grammarAccess.getML2ClassAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getML2ClassAccess().getLeftCurlyBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__ML2Class__Group_1__0__Impl"


    // $ANTLR start "rule__ML2Class__Group_1__1"
    // InternalML2.g:2462:1: rule__ML2Class__Group_1__1 : rule__ML2Class__Group_1__1__Impl rule__ML2Class__Group_1__2 ;
    public final void rule__ML2Class__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2466:1: ( rule__ML2Class__Group_1__1__Impl rule__ML2Class__Group_1__2 )
            // InternalML2.g:2467:2: rule__ML2Class__Group_1__1__Impl rule__ML2Class__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ML2Class__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ML2Class__Group_1__2();

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
    // $ANTLR end "rule__ML2Class__Group_1__1"


    // $ANTLR start "rule__ML2Class__Group_1__1__Impl"
    // InternalML2.g:2474:1: rule__ML2Class__Group_1__1__Impl : ( ( rule__ML2Class__Alternatives_1_1 )* ) ;
    public final void rule__ML2Class__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2478:1: ( ( ( rule__ML2Class__Alternatives_1_1 )* ) )
            // InternalML2.g:2479:1: ( ( rule__ML2Class__Alternatives_1_1 )* )
            {
            // InternalML2.g:2479:1: ( ( rule__ML2Class__Alternatives_1_1 )* )
            // InternalML2.g:2480:2: ( rule__ML2Class__Alternatives_1_1 )*
            {
             before(grammarAccess.getML2ClassAccess().getAlternatives_1_1()); 
            // InternalML2.g:2481:2: ( rule__ML2Class__Alternatives_1_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==48||LA35_0==53||LA35_0==55) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalML2.g:2481:3: rule__ML2Class__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ML2Class__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getML2ClassAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__ML2Class__Group_1__1__Impl"


    // $ANTLR start "rule__ML2Class__Group_1__2"
    // InternalML2.g:2489:1: rule__ML2Class__Group_1__2 : rule__ML2Class__Group_1__2__Impl ;
    public final void rule__ML2Class__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2493:1: ( rule__ML2Class__Group_1__2__Impl )
            // InternalML2.g:2494:2: rule__ML2Class__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ML2Class__Group_1__2__Impl();

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
    // $ANTLR end "rule__ML2Class__Group_1__2"


    // $ANTLR start "rule__ML2Class__Group_1__2__Impl"
    // InternalML2.g:2500:1: rule__ML2Class__Group_1__2__Impl : ( '}' ) ;
    public final void rule__ML2Class__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2504:1: ( ( '}' ) )
            // InternalML2.g:2505:1: ( '}' )
            {
            // InternalML2.g:2505:1: ( '}' )
            // InternalML2.g:2506:2: '}'
            {
             before(grammarAccess.getML2ClassAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getML2ClassAccess().getRightCurlyBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__ML2Class__Group_1__2__Impl"


    // $ANTLR start "rule__SomeFOClass__Group__0"
    // InternalML2.g:2516:1: rule__SomeFOClass__Group__0 : rule__SomeFOClass__Group__0__Impl rule__SomeFOClass__Group__1 ;
    public final void rule__SomeFOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2520:1: ( rule__SomeFOClass__Group__0__Impl rule__SomeFOClass__Group__1 )
            // InternalML2.g:2521:2: rule__SomeFOClass__Group__0__Impl rule__SomeFOClass__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SomeFOClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group__1();

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
    // $ANTLR end "rule__SomeFOClass__Group__0"


    // $ANTLR start "rule__SomeFOClass__Group__0__Impl"
    // InternalML2.g:2528:1: rule__SomeFOClass__Group__0__Impl : ( ( rule__SomeFOClass__Alternatives_0 ) ) ;
    public final void rule__SomeFOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2532:1: ( ( ( rule__SomeFOClass__Alternatives_0 ) ) )
            // InternalML2.g:2533:1: ( ( rule__SomeFOClass__Alternatives_0 ) )
            {
            // InternalML2.g:2533:1: ( ( rule__SomeFOClass__Alternatives_0 ) )
            // InternalML2.g:2534:2: ( rule__SomeFOClass__Alternatives_0 )
            {
             before(grammarAccess.getSomeFOClassAccess().getAlternatives_0()); 
            // InternalML2.g:2535:2: ( rule__SomeFOClass__Alternatives_0 )
            // InternalML2.g:2535:3: rule__SomeFOClass__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSomeFOClassAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__SomeFOClass__Group__0__Impl"


    // $ANTLR start "rule__SomeFOClass__Group__1"
    // InternalML2.g:2543:1: rule__SomeFOClass__Group__1 : rule__SomeFOClass__Group__1__Impl rule__SomeFOClass__Group__2 ;
    public final void rule__SomeFOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2547:1: ( rule__SomeFOClass__Group__1__Impl rule__SomeFOClass__Group__2 )
            // InternalML2.g:2548:2: rule__SomeFOClass__Group__1__Impl rule__SomeFOClass__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SomeFOClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group__2();

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
    // $ANTLR end "rule__SomeFOClass__Group__1"


    // $ANTLR start "rule__SomeFOClass__Group__1__Impl"
    // InternalML2.g:2555:1: rule__SomeFOClass__Group__1__Impl : ( ( rule__SomeFOClass__Group_1__0 )? ) ;
    public final void rule__SomeFOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2559:1: ( ( ( rule__SomeFOClass__Group_1__0 )? ) )
            // InternalML2.g:2560:1: ( ( rule__SomeFOClass__Group_1__0 )? )
            {
            // InternalML2.g:2560:1: ( ( rule__SomeFOClass__Group_1__0 )? )
            // InternalML2.g:2561:2: ( rule__SomeFOClass__Group_1__0 )?
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_1()); 
            // InternalML2.g:2562:2: ( rule__SomeFOClass__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalML2.g:2562:3: rule__SomeFOClass__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SomeFOClass__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSomeFOClassAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SomeFOClass__Group__1__Impl"


    // $ANTLR start "rule__SomeFOClass__Group__2"
    // InternalML2.g:2570:1: rule__SomeFOClass__Group__2 : rule__SomeFOClass__Group__2__Impl ;
    public final void rule__SomeFOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2574:1: ( rule__SomeFOClass__Group__2__Impl )
            // InternalML2.g:2575:2: rule__SomeFOClass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group__2__Impl();

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
    // $ANTLR end "rule__SomeFOClass__Group__2"


    // $ANTLR start "rule__SomeFOClass__Group__2__Impl"
    // InternalML2.g:2581:1: rule__SomeFOClass__Group__2__Impl : ( ( rule__SomeFOClass__Group_2__0 )? ) ;
    public final void rule__SomeFOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2585:1: ( ( ( rule__SomeFOClass__Group_2__0 )? ) )
            // InternalML2.g:2586:1: ( ( rule__SomeFOClass__Group_2__0 )? )
            {
            // InternalML2.g:2586:1: ( ( rule__SomeFOClass__Group_2__0 )? )
            // InternalML2.g:2587:2: ( rule__SomeFOClass__Group_2__0 )?
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_2()); 
            // InternalML2.g:2588:2: ( rule__SomeFOClass__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalML2.g:2588:3: rule__SomeFOClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SomeFOClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSomeFOClassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SomeFOClass__Group__2__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_1__0"
    // InternalML2.g:2597:1: rule__SomeFOClass__Group_1__0 : rule__SomeFOClass__Group_1__0__Impl rule__SomeFOClass__Group_1__1 ;
    public final void rule__SomeFOClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2601:1: ( rule__SomeFOClass__Group_1__0__Impl rule__SomeFOClass__Group_1__1 )
            // InternalML2.g:2602:2: rule__SomeFOClass__Group_1__0__Impl rule__SomeFOClass__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SomeFOClass__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_1__1();

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
    // $ANTLR end "rule__SomeFOClass__Group_1__0"


    // $ANTLR start "rule__SomeFOClass__Group_1__0__Impl"
    // InternalML2.g:2609:1: rule__SomeFOClass__Group_1__0__Impl : ( ':' ) ;
    public final void rule__SomeFOClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2613:1: ( ( ':' ) )
            // InternalML2.g:2614:1: ( ':' )
            {
            // InternalML2.g:2614:1: ( ':' )
            // InternalML2.g:2615:2: ':'
            {
             before(grammarAccess.getSomeFOClassAccess().getColonKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSomeFOClassAccess().getColonKeyword_1_0()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_1__0__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_1__1"
    // InternalML2.g:2624:1: rule__SomeFOClass__Group_1__1 : rule__SomeFOClass__Group_1__1__Impl rule__SomeFOClass__Group_1__2 ;
    public final void rule__SomeFOClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2628:1: ( rule__SomeFOClass__Group_1__1__Impl rule__SomeFOClass__Group_1__2 )
            // InternalML2.g:2629:2: rule__SomeFOClass__Group_1__1__Impl rule__SomeFOClass__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__SomeFOClass__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_1__2();

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
    // $ANTLR end "rule__SomeFOClass__Group_1__1"


    // $ANTLR start "rule__SomeFOClass__Group_1__1__Impl"
    // InternalML2.g:2636:1: rule__SomeFOClass__Group_1__1__Impl : ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) ) ;
    public final void rule__SomeFOClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2640:1: ( ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) ) )
            // InternalML2.g:2641:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) )
            {
            // InternalML2.g:2641:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) )
            // InternalML2.g:2642:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesAssignment_1_1()); 
            // InternalML2.g:2643:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 )
            // InternalML2.g:2643:3: rule__SomeFOClass__InstantiatedClassesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__InstantiatedClassesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesAssignment_1_1()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_1__1__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_1__2"
    // InternalML2.g:2651:1: rule__SomeFOClass__Group_1__2 : rule__SomeFOClass__Group_1__2__Impl ;
    public final void rule__SomeFOClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2655:1: ( rule__SomeFOClass__Group_1__2__Impl )
            // InternalML2.g:2656:2: rule__SomeFOClass__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_1__2__Impl();

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
    // $ANTLR end "rule__SomeFOClass__Group_1__2"


    // $ANTLR start "rule__SomeFOClass__Group_1__2__Impl"
    // InternalML2.g:2662:1: rule__SomeFOClass__Group_1__2__Impl : ( ( rule__SomeFOClass__Group_1_2__0 )* ) ;
    public final void rule__SomeFOClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2666:1: ( ( ( rule__SomeFOClass__Group_1_2__0 )* ) )
            // InternalML2.g:2667:1: ( ( rule__SomeFOClass__Group_1_2__0 )* )
            {
            // InternalML2.g:2667:1: ( ( rule__SomeFOClass__Group_1_2__0 )* )
            // InternalML2.g:2668:2: ( rule__SomeFOClass__Group_1_2__0 )*
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_1_2()); 
            // InternalML2.g:2669:2: ( rule__SomeFOClass__Group_1_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==36) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalML2.g:2669:3: rule__SomeFOClass__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SomeFOClass__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSomeFOClassAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_1__2__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_1_2__0"
    // InternalML2.g:2678:1: rule__SomeFOClass__Group_1_2__0 : rule__SomeFOClass__Group_1_2__0__Impl rule__SomeFOClass__Group_1_2__1 ;
    public final void rule__SomeFOClass__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2682:1: ( rule__SomeFOClass__Group_1_2__0__Impl rule__SomeFOClass__Group_1_2__1 )
            // InternalML2.g:2683:2: rule__SomeFOClass__Group_1_2__0__Impl rule__SomeFOClass__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SomeFOClass__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_1_2__1();

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
    // $ANTLR end "rule__SomeFOClass__Group_1_2__0"


    // $ANTLR start "rule__SomeFOClass__Group_1_2__0__Impl"
    // InternalML2.g:2690:1: rule__SomeFOClass__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__SomeFOClass__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2694:1: ( ( ',' ) )
            // InternalML2.g:2695:1: ( ',' )
            {
            // InternalML2.g:2695:1: ( ',' )
            // InternalML2.g:2696:2: ','
            {
             before(grammarAccess.getSomeFOClassAccess().getCommaKeyword_1_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSomeFOClassAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_1_2__0__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_1_2__1"
    // InternalML2.g:2705:1: rule__SomeFOClass__Group_1_2__1 : rule__SomeFOClass__Group_1_2__1__Impl ;
    public final void rule__SomeFOClass__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2709:1: ( rule__SomeFOClass__Group_1_2__1__Impl )
            // InternalML2.g:2710:2: rule__SomeFOClass__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__SomeFOClass__Group_1_2__1"


    // $ANTLR start "rule__SomeFOClass__Group_1_2__1__Impl"
    // InternalML2.g:2716:1: rule__SomeFOClass__Group_1_2__1__Impl : ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) ) ;
    public final void rule__SomeFOClass__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2720:1: ( ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) ) )
            // InternalML2.g:2721:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            {
            // InternalML2.g:2721:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            // InternalML2.g:2722:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesAssignment_1_2_1()); 
            // InternalML2.g:2723:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 )
            // InternalML2.g:2723:3: rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_1_2__1__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_2__0"
    // InternalML2.g:2732:1: rule__SomeFOClass__Group_2__0 : rule__SomeFOClass__Group_2__0__Impl rule__SomeFOClass__Group_2__1 ;
    public final void rule__SomeFOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2736:1: ( rule__SomeFOClass__Group_2__0__Impl rule__SomeFOClass__Group_2__1 )
            // InternalML2.g:2737:2: rule__SomeFOClass__Group_2__0__Impl rule__SomeFOClass__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SomeFOClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_2__1();

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
    // $ANTLR end "rule__SomeFOClass__Group_2__0"


    // $ANTLR start "rule__SomeFOClass__Group_2__0__Impl"
    // InternalML2.g:2744:1: rule__SomeFOClass__Group_2__0__Impl : ( 'specializes' ) ;
    public final void rule__SomeFOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2748:1: ( ( 'specializes' ) )
            // InternalML2.g:2749:1: ( 'specializes' )
            {
            // InternalML2.g:2749:1: ( 'specializes' )
            // InternalML2.g:2750:2: 'specializes'
            {
             before(grammarAccess.getSomeFOClassAccess().getSpecializesKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSomeFOClassAccess().getSpecializesKeyword_2_0()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_2__0__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_2__1"
    // InternalML2.g:2759:1: rule__SomeFOClass__Group_2__1 : rule__SomeFOClass__Group_2__1__Impl rule__SomeFOClass__Group_2__2 ;
    public final void rule__SomeFOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2763:1: ( rule__SomeFOClass__Group_2__1__Impl rule__SomeFOClass__Group_2__2 )
            // InternalML2.g:2764:2: rule__SomeFOClass__Group_2__1__Impl rule__SomeFOClass__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__SomeFOClass__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_2__2();

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
    // $ANTLR end "rule__SomeFOClass__Group_2__1"


    // $ANTLR start "rule__SomeFOClass__Group_2__1__Impl"
    // InternalML2.g:2771:1: rule__SomeFOClass__Group_2__1__Impl : ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) ) ;
    public final void rule__SomeFOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2775:1: ( ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) ) )
            // InternalML2.g:2776:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) )
            {
            // InternalML2.g:2776:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) )
            // InternalML2.g:2777:2: ( rule__SomeFOClass__SuperClassesAssignment_2_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesAssignment_2_1()); 
            // InternalML2.g:2778:2: ( rule__SomeFOClass__SuperClassesAssignment_2_1 )
            // InternalML2.g:2778:3: rule__SomeFOClass__SuperClassesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__SuperClassesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSomeFOClassAccess().getSuperClassesAssignment_2_1()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_2__1__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_2__2"
    // InternalML2.g:2786:1: rule__SomeFOClass__Group_2__2 : rule__SomeFOClass__Group_2__2__Impl ;
    public final void rule__SomeFOClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2790:1: ( rule__SomeFOClass__Group_2__2__Impl )
            // InternalML2.g:2791:2: rule__SomeFOClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_2__2__Impl();

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
    // $ANTLR end "rule__SomeFOClass__Group_2__2"


    // $ANTLR start "rule__SomeFOClass__Group_2__2__Impl"
    // InternalML2.g:2797:1: rule__SomeFOClass__Group_2__2__Impl : ( ( rule__SomeFOClass__Group_2_2__0 )* ) ;
    public final void rule__SomeFOClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2801:1: ( ( ( rule__SomeFOClass__Group_2_2__0 )* ) )
            // InternalML2.g:2802:1: ( ( rule__SomeFOClass__Group_2_2__0 )* )
            {
            // InternalML2.g:2802:1: ( ( rule__SomeFOClass__Group_2_2__0 )* )
            // InternalML2.g:2803:2: ( rule__SomeFOClass__Group_2_2__0 )*
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_2_2()); 
            // InternalML2.g:2804:2: ( rule__SomeFOClass__Group_2_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalML2.g:2804:3: rule__SomeFOClass__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SomeFOClass__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getSomeFOClassAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_2__2__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_2_2__0"
    // InternalML2.g:2813:1: rule__SomeFOClass__Group_2_2__0 : rule__SomeFOClass__Group_2_2__0__Impl rule__SomeFOClass__Group_2_2__1 ;
    public final void rule__SomeFOClass__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2817:1: ( rule__SomeFOClass__Group_2_2__0__Impl rule__SomeFOClass__Group_2_2__1 )
            // InternalML2.g:2818:2: rule__SomeFOClass__Group_2_2__0__Impl rule__SomeFOClass__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SomeFOClass__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_2_2__1();

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
    // $ANTLR end "rule__SomeFOClass__Group_2_2__0"


    // $ANTLR start "rule__SomeFOClass__Group_2_2__0__Impl"
    // InternalML2.g:2825:1: rule__SomeFOClass__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__SomeFOClass__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2829:1: ( ( ',' ) )
            // InternalML2.g:2830:1: ( ',' )
            {
            // InternalML2.g:2830:1: ( ',' )
            // InternalML2.g:2831:2: ','
            {
             before(grammarAccess.getSomeFOClassAccess().getCommaKeyword_2_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSomeFOClassAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_2_2__0__Impl"


    // $ANTLR start "rule__SomeFOClass__Group_2_2__1"
    // InternalML2.g:2840:1: rule__SomeFOClass__Group_2_2__1 : rule__SomeFOClass__Group_2_2__1__Impl ;
    public final void rule__SomeFOClass__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2844:1: ( rule__SomeFOClass__Group_2_2__1__Impl )
            // InternalML2.g:2845:2: rule__SomeFOClass__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__SomeFOClass__Group_2_2__1"


    // $ANTLR start "rule__SomeFOClass__Group_2_2__1__Impl"
    // InternalML2.g:2851:1: rule__SomeFOClass__Group_2_2__1__Impl : ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) ) ;
    public final void rule__SomeFOClass__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2855:1: ( ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) ) )
            // InternalML2.g:2856:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) )
            {
            // InternalML2.g:2856:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) )
            // InternalML2.g:2857:2: ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesAssignment_2_2_1()); 
            // InternalML2.g:2858:2: ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 )
            // InternalML2.g:2858:3: rule__SomeFOClass__SuperClassesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SomeFOClass__SuperClassesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSomeFOClassAccess().getSuperClassesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__SomeFOClass__Group_2_2__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group__0"
    // InternalML2.g:2867:1: rule__NonFOClass__Group__0 : rule__NonFOClass__Group__0__Impl rule__NonFOClass__Group__1 ;
    public final void rule__NonFOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2871:1: ( rule__NonFOClass__Group__0__Impl rule__NonFOClass__Group__1 )
            // InternalML2.g:2872:2: rule__NonFOClass__Group__0__Impl rule__NonFOClass__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__NonFOClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group__1();

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
    // $ANTLR end "rule__NonFOClass__Group__0"


    // $ANTLR start "rule__NonFOClass__Group__0__Impl"
    // InternalML2.g:2879:1: rule__NonFOClass__Group__0__Impl : ( ( rule__NonFOClass__Alternatives_0 ) ) ;
    public final void rule__NonFOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2883:1: ( ( ( rule__NonFOClass__Alternatives_0 ) ) )
            // InternalML2.g:2884:1: ( ( rule__NonFOClass__Alternatives_0 ) )
            {
            // InternalML2.g:2884:1: ( ( rule__NonFOClass__Alternatives_0 ) )
            // InternalML2.g:2885:2: ( rule__NonFOClass__Alternatives_0 )
            {
             before(grammarAccess.getNonFOClassAccess().getAlternatives_0()); 
            // InternalML2.g:2886:2: ( rule__NonFOClass__Alternatives_0 )
            // InternalML2.g:2886:3: rule__NonFOClass__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group__1"
    // InternalML2.g:2894:1: rule__NonFOClass__Group__1 : rule__NonFOClass__Group__1__Impl rule__NonFOClass__Group__2 ;
    public final void rule__NonFOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2898:1: ( rule__NonFOClass__Group__1__Impl rule__NonFOClass__Group__2 )
            // InternalML2.g:2899:2: rule__NonFOClass__Group__1__Impl rule__NonFOClass__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__NonFOClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group__2();

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
    // $ANTLR end "rule__NonFOClass__Group__1"


    // $ANTLR start "rule__NonFOClass__Group__1__Impl"
    // InternalML2.g:2906:1: rule__NonFOClass__Group__1__Impl : ( ( rule__NonFOClass__Group_1__0 )? ) ;
    public final void rule__NonFOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2910:1: ( ( ( rule__NonFOClass__Group_1__0 )? ) )
            // InternalML2.g:2911:1: ( ( rule__NonFOClass__Group_1__0 )? )
            {
            // InternalML2.g:2911:1: ( ( rule__NonFOClass__Group_1__0 )? )
            // InternalML2.g:2912:2: ( rule__NonFOClass__Group_1__0 )?
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_1()); 
            // InternalML2.g:2913:2: ( rule__NonFOClass__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalML2.g:2913:3: rule__NonFOClass__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFOClass__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonFOClassAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group__2"
    // InternalML2.g:2921:1: rule__NonFOClass__Group__2 : rule__NonFOClass__Group__2__Impl rule__NonFOClass__Group__3 ;
    public final void rule__NonFOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2925:1: ( rule__NonFOClass__Group__2__Impl rule__NonFOClass__Group__3 )
            // InternalML2.g:2926:2: rule__NonFOClass__Group__2__Impl rule__NonFOClass__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__NonFOClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group__3();

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
    // $ANTLR end "rule__NonFOClass__Group__2"


    // $ANTLR start "rule__NonFOClass__Group__2__Impl"
    // InternalML2.g:2933:1: rule__NonFOClass__Group__2__Impl : ( ( rule__NonFOClass__Group_2__0 )? ) ;
    public final void rule__NonFOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2937:1: ( ( ( rule__NonFOClass__Group_2__0 )? ) )
            // InternalML2.g:2938:1: ( ( rule__NonFOClass__Group_2__0 )? )
            {
            // InternalML2.g:2938:1: ( ( rule__NonFOClass__Group_2__0 )? )
            // InternalML2.g:2939:2: ( rule__NonFOClass__Group_2__0 )?
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_2()); 
            // InternalML2.g:2940:2: ( rule__NonFOClass__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalML2.g:2940:3: rule__NonFOClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFOClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonFOClassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NonFOClass__Group__2__Impl"


    // $ANTLR start "rule__NonFOClass__Group__3"
    // InternalML2.g:2948:1: rule__NonFOClass__Group__3 : rule__NonFOClass__Group__3__Impl rule__NonFOClass__Group__4 ;
    public final void rule__NonFOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2952:1: ( rule__NonFOClass__Group__3__Impl rule__NonFOClass__Group__4 )
            // InternalML2.g:2953:2: rule__NonFOClass__Group__3__Impl rule__NonFOClass__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__NonFOClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group__4();

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
    // $ANTLR end "rule__NonFOClass__Group__3"


    // $ANTLR start "rule__NonFOClass__Group__3__Impl"
    // InternalML2.g:2960:1: rule__NonFOClass__Group__3__Impl : ( ( rule__NonFOClass__Group_3__0 )? ) ;
    public final void rule__NonFOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2964:1: ( ( ( rule__NonFOClass__Group_3__0 )? ) )
            // InternalML2.g:2965:1: ( ( rule__NonFOClass__Group_3__0 )? )
            {
            // InternalML2.g:2965:1: ( ( rule__NonFOClass__Group_3__0 )? )
            // InternalML2.g:2966:2: ( rule__NonFOClass__Group_3__0 )?
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_3()); 
            // InternalML2.g:2967:2: ( rule__NonFOClass__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:2967:3: rule__NonFOClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFOClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonFOClassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NonFOClass__Group__3__Impl"


    // $ANTLR start "rule__NonFOClass__Group__4"
    // InternalML2.g:2975:1: rule__NonFOClass__Group__4 : rule__NonFOClass__Group__4__Impl ;
    public final void rule__NonFOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2979:1: ( rule__NonFOClass__Group__4__Impl )
            // InternalML2.g:2980:2: rule__NonFOClass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group__4__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group__4"


    // $ANTLR start "rule__NonFOClass__Group__4__Impl"
    // InternalML2.g:2986:1: rule__NonFOClass__Group__4__Impl : ( ( rule__NonFOClass__Alternatives_4 )? ) ;
    public final void rule__NonFOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2990:1: ( ( ( rule__NonFOClass__Alternatives_4 )? ) )
            // InternalML2.g:2991:1: ( ( rule__NonFOClass__Alternatives_4 )? )
            {
            // InternalML2.g:2991:1: ( ( rule__NonFOClass__Alternatives_4 )? )
            // InternalML2.g:2992:2: ( rule__NonFOClass__Alternatives_4 )?
            {
             before(grammarAccess.getNonFOClassAccess().getAlternatives_4()); 
            // InternalML2.g:2993:2: ( rule__NonFOClass__Alternatives_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=16 && LA43_0<=19)||LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalML2.g:2993:3: rule__NonFOClass__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonFOClass__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonFOClassAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__NonFOClass__Group__4__Impl"


    // $ANTLR start "rule__NonFOClass__Group_1__0"
    // InternalML2.g:3002:1: rule__NonFOClass__Group_1__0 : rule__NonFOClass__Group_1__0__Impl rule__NonFOClass__Group_1__1 ;
    public final void rule__NonFOClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3006:1: ( rule__NonFOClass__Group_1__0__Impl rule__NonFOClass__Group_1__1 )
            // InternalML2.g:3007:2: rule__NonFOClass__Group_1__0__Impl rule__NonFOClass__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_1__1();

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
    // $ANTLR end "rule__NonFOClass__Group_1__0"


    // $ANTLR start "rule__NonFOClass__Group_1__0__Impl"
    // InternalML2.g:3014:1: rule__NonFOClass__Group_1__0__Impl : ( ':' ) ;
    public final void rule__NonFOClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3018:1: ( ( ':' ) )
            // InternalML2.g:3019:1: ( ':' )
            {
            // InternalML2.g:3019:1: ( ':' )
            // InternalML2.g:3020:2: ':'
            {
             before(grammarAccess.getNonFOClassAccess().getColonKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNonFOClassAccess().getColonKeyword_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_1__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_1__1"
    // InternalML2.g:3029:1: rule__NonFOClass__Group_1__1 : rule__NonFOClass__Group_1__1__Impl rule__NonFOClass__Group_1__2 ;
    public final void rule__NonFOClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3033:1: ( rule__NonFOClass__Group_1__1__Impl rule__NonFOClass__Group_1__2 )
            // InternalML2.g:3034:2: rule__NonFOClass__Group_1__1__Impl rule__NonFOClass__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__NonFOClass__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_1__2();

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
    // $ANTLR end "rule__NonFOClass__Group_1__1"


    // $ANTLR start "rule__NonFOClass__Group_1__1__Impl"
    // InternalML2.g:3041:1: rule__NonFOClass__Group_1__1__Impl : ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) ) ;
    public final void rule__NonFOClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3045:1: ( ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) ) )
            // InternalML2.g:3046:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) )
            {
            // InternalML2.g:3046:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) )
            // InternalML2.g:3047:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesAssignment_1_1()); 
            // InternalML2.g:3048:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 )
            // InternalML2.g:3048:3: rule__NonFOClass__InstantiatedClassesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__InstantiatedClassesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getInstantiatedClassesAssignment_1_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_1__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group_1__2"
    // InternalML2.g:3056:1: rule__NonFOClass__Group_1__2 : rule__NonFOClass__Group_1__2__Impl ;
    public final void rule__NonFOClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3060:1: ( rule__NonFOClass__Group_1__2__Impl )
            // InternalML2.g:3061:2: rule__NonFOClass__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_1__2__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_1__2"


    // $ANTLR start "rule__NonFOClass__Group_1__2__Impl"
    // InternalML2.g:3067:1: rule__NonFOClass__Group_1__2__Impl : ( ( rule__NonFOClass__Group_1_2__0 )* ) ;
    public final void rule__NonFOClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3071:1: ( ( ( rule__NonFOClass__Group_1_2__0 )* ) )
            // InternalML2.g:3072:1: ( ( rule__NonFOClass__Group_1_2__0 )* )
            {
            // InternalML2.g:3072:1: ( ( rule__NonFOClass__Group_1_2__0 )* )
            // InternalML2.g:3073:2: ( rule__NonFOClass__Group_1_2__0 )*
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_1_2()); 
            // InternalML2.g:3074:2: ( rule__NonFOClass__Group_1_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==36) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalML2.g:3074:3: rule__NonFOClass__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NonFOClass__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getNonFOClassAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__NonFOClass__Group_1__2__Impl"


    // $ANTLR start "rule__NonFOClass__Group_1_2__0"
    // InternalML2.g:3083:1: rule__NonFOClass__Group_1_2__0 : rule__NonFOClass__Group_1_2__0__Impl rule__NonFOClass__Group_1_2__1 ;
    public final void rule__NonFOClass__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3087:1: ( rule__NonFOClass__Group_1_2__0__Impl rule__NonFOClass__Group_1_2__1 )
            // InternalML2.g:3088:2: rule__NonFOClass__Group_1_2__0__Impl rule__NonFOClass__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_1_2__1();

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
    // $ANTLR end "rule__NonFOClass__Group_1_2__0"


    // $ANTLR start "rule__NonFOClass__Group_1_2__0__Impl"
    // InternalML2.g:3095:1: rule__NonFOClass__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__NonFOClass__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3099:1: ( ( ',' ) )
            // InternalML2.g:3100:1: ( ',' )
            {
            // InternalML2.g:3100:1: ( ',' )
            // InternalML2.g:3101:2: ','
            {
             before(grammarAccess.getNonFOClassAccess().getCommaKeyword_1_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNonFOClassAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_1_2__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_1_2__1"
    // InternalML2.g:3110:1: rule__NonFOClass__Group_1_2__1 : rule__NonFOClass__Group_1_2__1__Impl ;
    public final void rule__NonFOClass__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3114:1: ( rule__NonFOClass__Group_1_2__1__Impl )
            // InternalML2.g:3115:2: rule__NonFOClass__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_1_2__1"


    // $ANTLR start "rule__NonFOClass__Group_1_2__1__Impl"
    // InternalML2.g:3121:1: rule__NonFOClass__Group_1_2__1__Impl : ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) ) ;
    public final void rule__NonFOClass__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3125:1: ( ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) ) )
            // InternalML2.g:3126:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            {
            // InternalML2.g:3126:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            // InternalML2.g:3127:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesAssignment_1_2_1()); 
            // InternalML2.g:3128:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 )
            // InternalML2.g:3128:3: rule__NonFOClass__InstantiatedClassesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__InstantiatedClassesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getInstantiatedClassesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_1_2__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group_2__0"
    // InternalML2.g:3137:1: rule__NonFOClass__Group_2__0 : rule__NonFOClass__Group_2__0__Impl rule__NonFOClass__Group_2__1 ;
    public final void rule__NonFOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3141:1: ( rule__NonFOClass__Group_2__0__Impl rule__NonFOClass__Group_2__1 )
            // InternalML2.g:3142:2: rule__NonFOClass__Group_2__0__Impl rule__NonFOClass__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_2__1();

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
    // $ANTLR end "rule__NonFOClass__Group_2__0"


    // $ANTLR start "rule__NonFOClass__Group_2__0__Impl"
    // InternalML2.g:3149:1: rule__NonFOClass__Group_2__0__Impl : ( 'specializes' ) ;
    public final void rule__NonFOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3153:1: ( ( 'specializes' ) )
            // InternalML2.g:3154:1: ( 'specializes' )
            {
            // InternalML2.g:3154:1: ( 'specializes' )
            // InternalML2.g:3155:2: 'specializes'
            {
             before(grammarAccess.getNonFOClassAccess().getSpecializesKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNonFOClassAccess().getSpecializesKeyword_2_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_2__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_2__1"
    // InternalML2.g:3164:1: rule__NonFOClass__Group_2__1 : rule__NonFOClass__Group_2__1__Impl rule__NonFOClass__Group_2__2 ;
    public final void rule__NonFOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3168:1: ( rule__NonFOClass__Group_2__1__Impl rule__NonFOClass__Group_2__2 )
            // InternalML2.g:3169:2: rule__NonFOClass__Group_2__1__Impl rule__NonFOClass__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__NonFOClass__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_2__2();

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
    // $ANTLR end "rule__NonFOClass__Group_2__1"


    // $ANTLR start "rule__NonFOClass__Group_2__1__Impl"
    // InternalML2.g:3176:1: rule__NonFOClass__Group_2__1__Impl : ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) ) ;
    public final void rule__NonFOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3180:1: ( ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) ) )
            // InternalML2.g:3181:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) )
            {
            // InternalML2.g:3181:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) )
            // InternalML2.g:3182:2: ( rule__NonFOClass__SuperClassesAssignment_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesAssignment_2_1()); 
            // InternalML2.g:3183:2: ( rule__NonFOClass__SuperClassesAssignment_2_1 )
            // InternalML2.g:3183:3: rule__NonFOClass__SuperClassesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__SuperClassesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getSuperClassesAssignment_2_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_2__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group_2__2"
    // InternalML2.g:3191:1: rule__NonFOClass__Group_2__2 : rule__NonFOClass__Group_2__2__Impl ;
    public final void rule__NonFOClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3195:1: ( rule__NonFOClass__Group_2__2__Impl )
            // InternalML2.g:3196:2: rule__NonFOClass__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_2__2__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_2__2"


    // $ANTLR start "rule__NonFOClass__Group_2__2__Impl"
    // InternalML2.g:3202:1: rule__NonFOClass__Group_2__2__Impl : ( ( rule__NonFOClass__Group_2_2__0 )* ) ;
    public final void rule__NonFOClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3206:1: ( ( ( rule__NonFOClass__Group_2_2__0 )* ) )
            // InternalML2.g:3207:1: ( ( rule__NonFOClass__Group_2_2__0 )* )
            {
            // InternalML2.g:3207:1: ( ( rule__NonFOClass__Group_2_2__0 )* )
            // InternalML2.g:3208:2: ( rule__NonFOClass__Group_2_2__0 )*
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_2_2()); 
            // InternalML2.g:3209:2: ( rule__NonFOClass__Group_2_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==36) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalML2.g:3209:3: rule__NonFOClass__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NonFOClass__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getNonFOClassAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__NonFOClass__Group_2__2__Impl"


    // $ANTLR start "rule__NonFOClass__Group_2_2__0"
    // InternalML2.g:3218:1: rule__NonFOClass__Group_2_2__0 : rule__NonFOClass__Group_2_2__0__Impl rule__NonFOClass__Group_2_2__1 ;
    public final void rule__NonFOClass__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3222:1: ( rule__NonFOClass__Group_2_2__0__Impl rule__NonFOClass__Group_2_2__1 )
            // InternalML2.g:3223:2: rule__NonFOClass__Group_2_2__0__Impl rule__NonFOClass__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_2_2__1();

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
    // $ANTLR end "rule__NonFOClass__Group_2_2__0"


    // $ANTLR start "rule__NonFOClass__Group_2_2__0__Impl"
    // InternalML2.g:3230:1: rule__NonFOClass__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__NonFOClass__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3234:1: ( ( ',' ) )
            // InternalML2.g:3235:1: ( ',' )
            {
            // InternalML2.g:3235:1: ( ',' )
            // InternalML2.g:3236:2: ','
            {
             before(grammarAccess.getNonFOClassAccess().getCommaKeyword_2_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNonFOClassAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_2_2__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_2_2__1"
    // InternalML2.g:3245:1: rule__NonFOClass__Group_2_2__1 : rule__NonFOClass__Group_2_2__1__Impl ;
    public final void rule__NonFOClass__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3249:1: ( rule__NonFOClass__Group_2_2__1__Impl )
            // InternalML2.g:3250:2: rule__NonFOClass__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_2_2__1"


    // $ANTLR start "rule__NonFOClass__Group_2_2__1__Impl"
    // InternalML2.g:3256:1: rule__NonFOClass__Group_2_2__1__Impl : ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) ) ;
    public final void rule__NonFOClass__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3260:1: ( ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) ) )
            // InternalML2.g:3261:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) )
            {
            // InternalML2.g:3261:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) )
            // InternalML2.g:3262:2: ( rule__NonFOClass__SuperClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesAssignment_2_2_1()); 
            // InternalML2.g:3263:2: ( rule__NonFOClass__SuperClassesAssignment_2_2_1 )
            // InternalML2.g:3263:3: rule__NonFOClass__SuperClassesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__SuperClassesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getSuperClassesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_2_2__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group_3__0"
    // InternalML2.g:3272:1: rule__NonFOClass__Group_3__0 : rule__NonFOClass__Group_3__0__Impl rule__NonFOClass__Group_3__1 ;
    public final void rule__NonFOClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3276:1: ( rule__NonFOClass__Group_3__0__Impl rule__NonFOClass__Group_3__1 )
            // InternalML2.g:3277:2: rule__NonFOClass__Group_3__0__Impl rule__NonFOClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_3__1();

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
    // $ANTLR end "rule__NonFOClass__Group_3__0"


    // $ANTLR start "rule__NonFOClass__Group_3__0__Impl"
    // InternalML2.g:3284:1: rule__NonFOClass__Group_3__0__Impl : ( 'subordinatedTo' ) ;
    public final void rule__NonFOClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3288:1: ( ( 'subordinatedTo' ) )
            // InternalML2.g:3289:1: ( 'subordinatedTo' )
            {
            // InternalML2.g:3289:1: ( 'subordinatedTo' )
            // InternalML2.g:3290:2: 'subordinatedTo'
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatedToKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNonFOClassAccess().getSubordinatedToKeyword_3_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_3__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_3__1"
    // InternalML2.g:3299:1: rule__NonFOClass__Group_3__1 : rule__NonFOClass__Group_3__1__Impl rule__NonFOClass__Group_3__2 ;
    public final void rule__NonFOClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3303:1: ( rule__NonFOClass__Group_3__1__Impl rule__NonFOClass__Group_3__2 )
            // InternalML2.g:3304:2: rule__NonFOClass__Group_3__1__Impl rule__NonFOClass__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__NonFOClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_3__2();

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
    // $ANTLR end "rule__NonFOClass__Group_3__1"


    // $ANTLR start "rule__NonFOClass__Group_3__1__Impl"
    // InternalML2.g:3311:1: rule__NonFOClass__Group_3__1__Impl : ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) ) ;
    public final void rule__NonFOClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3315:1: ( ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) ) )
            // InternalML2.g:3316:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) )
            {
            // InternalML2.g:3316:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) )
            // InternalML2.g:3317:2: ( rule__NonFOClass__SubordinatorsAssignment_3_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsAssignment_3_1()); 
            // InternalML2.g:3318:2: ( rule__NonFOClass__SubordinatorsAssignment_3_1 )
            // InternalML2.g:3318:3: rule__NonFOClass__SubordinatorsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__SubordinatorsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getSubordinatorsAssignment_3_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_3__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group_3__2"
    // InternalML2.g:3326:1: rule__NonFOClass__Group_3__2 : rule__NonFOClass__Group_3__2__Impl ;
    public final void rule__NonFOClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3330:1: ( rule__NonFOClass__Group_3__2__Impl )
            // InternalML2.g:3331:2: rule__NonFOClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_3__2__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_3__2"


    // $ANTLR start "rule__NonFOClass__Group_3__2__Impl"
    // InternalML2.g:3337:1: rule__NonFOClass__Group_3__2__Impl : ( ( rule__NonFOClass__Group_3_2__0 )* ) ;
    public final void rule__NonFOClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3341:1: ( ( ( rule__NonFOClass__Group_3_2__0 )* ) )
            // InternalML2.g:3342:1: ( ( rule__NonFOClass__Group_3_2__0 )* )
            {
            // InternalML2.g:3342:1: ( ( rule__NonFOClass__Group_3_2__0 )* )
            // InternalML2.g:3343:2: ( rule__NonFOClass__Group_3_2__0 )*
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_3_2()); 
            // InternalML2.g:3344:2: ( rule__NonFOClass__Group_3_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==36) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalML2.g:3344:3: rule__NonFOClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NonFOClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getNonFOClassAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__NonFOClass__Group_3__2__Impl"


    // $ANTLR start "rule__NonFOClass__Group_3_2__0"
    // InternalML2.g:3353:1: rule__NonFOClass__Group_3_2__0 : rule__NonFOClass__Group_3_2__0__Impl rule__NonFOClass__Group_3_2__1 ;
    public final void rule__NonFOClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3357:1: ( rule__NonFOClass__Group_3_2__0__Impl rule__NonFOClass__Group_3_2__1 )
            // InternalML2.g:3358:2: rule__NonFOClass__Group_3_2__0__Impl rule__NonFOClass__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_3_2__1();

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
    // $ANTLR end "rule__NonFOClass__Group_3_2__0"


    // $ANTLR start "rule__NonFOClass__Group_3_2__0__Impl"
    // InternalML2.g:3365:1: rule__NonFOClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__NonFOClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3369:1: ( ( ',' ) )
            // InternalML2.g:3370:1: ( ',' )
            {
            // InternalML2.g:3370:1: ( ',' )
            // InternalML2.g:3371:2: ','
            {
             before(grammarAccess.getNonFOClassAccess().getCommaKeyword_3_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNonFOClassAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_3_2__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_3_2__1"
    // InternalML2.g:3380:1: rule__NonFOClass__Group_3_2__1 : rule__NonFOClass__Group_3_2__1__Impl ;
    public final void rule__NonFOClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3384:1: ( rule__NonFOClass__Group_3_2__1__Impl )
            // InternalML2.g:3385:2: rule__NonFOClass__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_3_2__1"


    // $ANTLR start "rule__NonFOClass__Group_3_2__1__Impl"
    // InternalML2.g:3391:1: rule__NonFOClass__Group_3_2__1__Impl : ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) ) ;
    public final void rule__NonFOClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3395:1: ( ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) ) )
            // InternalML2.g:3396:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) )
            {
            // InternalML2.g:3396:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) )
            // InternalML2.g:3397:2: ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsAssignment_3_2_1()); 
            // InternalML2.g:3398:2: ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 )
            // InternalML2.g:3398:3: rule__NonFOClass__SubordinatorsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__SubordinatorsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getSubordinatorsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_3_2__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group_4_0__0"
    // InternalML2.g:3407:1: rule__NonFOClass__Group_4_0__0 : rule__NonFOClass__Group_4_0__0__Impl rule__NonFOClass__Group_4_0__1 ;
    public final void rule__NonFOClass__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3411:1: ( rule__NonFOClass__Group_4_0__0__Impl rule__NonFOClass__Group_4_0__1 )
            // InternalML2.g:3412:2: rule__NonFOClass__Group_4_0__0__Impl rule__NonFOClass__Group_4_0__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_4_0__1();

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
    // $ANTLR end "rule__NonFOClass__Group_4_0__0"


    // $ANTLR start "rule__NonFOClass__Group_4_0__0__Impl"
    // InternalML2.g:3419:1: rule__NonFOClass__Group_4_0__0__Impl : ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) ) ;
    public final void rule__NonFOClass__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3423:1: ( ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) ) )
            // InternalML2.g:3424:1: ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) )
            {
            // InternalML2.g:3424:1: ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) )
            // InternalML2.g:3425:2: ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 )
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizationTypeAssignment_4_0_0()); 
            // InternalML2.g:3426:2: ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 )
            // InternalML2.g:3426:3: rule__NonFOClass__CategorizationTypeAssignment_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__CategorizationTypeAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getCategorizationTypeAssignment_4_0_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_4_0__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_4_0__1"
    // InternalML2.g:3434:1: rule__NonFOClass__Group_4_0__1 : rule__NonFOClass__Group_4_0__1__Impl ;
    public final void rule__NonFOClass__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3438:1: ( rule__NonFOClass__Group_4_0__1__Impl )
            // InternalML2.g:3439:2: rule__NonFOClass__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_4_0__1"


    // $ANTLR start "rule__NonFOClass__Group_4_0__1__Impl"
    // InternalML2.g:3445:1: rule__NonFOClass__Group_4_0__1__Impl : ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) ) ;
    public final void rule__NonFOClass__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3449:1: ( ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) ) )
            // InternalML2.g:3450:1: ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) )
            {
            // InternalML2.g:3450:1: ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) )
            // InternalML2.g:3451:2: ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizedClassAssignment_4_0_1()); 
            // InternalML2.g:3452:2: ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 )
            // InternalML2.g:3452:3: rule__NonFOClass__CategorizedClassAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__CategorizedClassAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getCategorizedClassAssignment_4_0_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_4_0__1__Impl"


    // $ANTLR start "rule__NonFOClass__Group_4_1__0"
    // InternalML2.g:3461:1: rule__NonFOClass__Group_4_1__0 : rule__NonFOClass__Group_4_1__0__Impl rule__NonFOClass__Group_4_1__1 ;
    public final void rule__NonFOClass__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3465:1: ( rule__NonFOClass__Group_4_1__0__Impl rule__NonFOClass__Group_4_1__1 )
            // InternalML2.g:3466:2: rule__NonFOClass__Group_4_1__0__Impl rule__NonFOClass__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__NonFOClass__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_4_1__1();

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
    // $ANTLR end "rule__NonFOClass__Group_4_1__0"


    // $ANTLR start "rule__NonFOClass__Group_4_1__0__Impl"
    // InternalML2.g:3473:1: rule__NonFOClass__Group_4_1__0__Impl : ( 'isPowertypeOf' ) ;
    public final void rule__NonFOClass__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3477:1: ( ( 'isPowertypeOf' ) )
            // InternalML2.g:3478:1: ( 'isPowertypeOf' )
            {
            // InternalML2.g:3478:1: ( 'isPowertypeOf' )
            // InternalML2.g:3479:2: 'isPowertypeOf'
            {
             before(grammarAccess.getNonFOClassAccess().getIsPowertypeOfKeyword_4_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNonFOClassAccess().getIsPowertypeOfKeyword_4_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__Group_4_1__0__Impl"


    // $ANTLR start "rule__NonFOClass__Group_4_1__1"
    // InternalML2.g:3488:1: rule__NonFOClass__Group_4_1__1 : rule__NonFOClass__Group_4_1__1__Impl ;
    public final void rule__NonFOClass__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3492:1: ( rule__NonFOClass__Group_4_1__1__Impl )
            // InternalML2.g:3493:2: rule__NonFOClass__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__NonFOClass__Group_4_1__1"


    // $ANTLR start "rule__NonFOClass__Group_4_1__1__Impl"
    // InternalML2.g:3499:1: rule__NonFOClass__Group_4_1__1__Impl : ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) ) ;
    public final void rule__NonFOClass__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3503:1: ( ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) ) )
            // InternalML2.g:3504:1: ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) )
            {
            // InternalML2.g:3504:1: ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) )
            // InternalML2.g:3505:2: ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getPowertypeOfAssignment_4_1_1()); 
            // InternalML2.g:3506:2: ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 )
            // InternalML2.g:3506:3: rule__NonFOClass__PowertypeOfAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFOClass__PowertypeOfAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFOClassAccess().getPowertypeOfAssignment_4_1_1()); 

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
    // $ANTLR end "rule__NonFOClass__Group_4_1__1__Impl"


    // $ANTLR start "rule__FOClass__Group__0"
    // InternalML2.g:3515:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3519:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalML2.g:3520:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
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
    // InternalML2.g:3527:1: rule__FOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3531:1: ( ( 'class' ) )
            // InternalML2.g:3532:1: ( 'class' )
            {
            // InternalML2.g:3532:1: ( 'class' )
            // InternalML2.g:3533:2: 'class'
            {
             before(grammarAccess.getFOClassAccess().getClassKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalML2.g:3542:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3546:1: ( rule__FOClass__Group__1__Impl )
            // InternalML2.g:3547:2: rule__FOClass__Group__1__Impl
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
    // InternalML2.g:3553:1: rule__FOClass__Group__1__Impl : ( ( rule__FOClass__NameAssignment_1 ) ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3557:1: ( ( ( rule__FOClass__NameAssignment_1 ) ) )
            // InternalML2.g:3558:1: ( ( rule__FOClass__NameAssignment_1 ) )
            {
            // InternalML2.g:3558:1: ( ( rule__FOClass__NameAssignment_1 ) )
            // InternalML2.g:3559:2: ( rule__FOClass__NameAssignment_1 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_1()); 
            // InternalML2.g:3560:2: ( rule__FOClass__NameAssignment_1 )
            // InternalML2.g:3560:3: rule__FOClass__NameAssignment_1
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
    // InternalML2.g:3569:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3573:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalML2.g:3574:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalML2.g:3581:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3585:1: ( ( 'datatype' ) )
            // InternalML2.g:3586:1: ( 'datatype' )
            {
            // InternalML2.g:3586:1: ( 'datatype' )
            // InternalML2.g:3587:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalML2.g:3596:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3600:1: ( rule__DataType__Group__1__Impl )
            // InternalML2.g:3601:2: rule__DataType__Group__1__Impl
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
    // InternalML2.g:3607:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3611:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalML2.g:3612:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalML2.g:3612:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalML2.g:3613:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalML2.g:3614:2: ( rule__DataType__NameAssignment_1 )
            // InternalML2.g:3614:3: rule__DataType__NameAssignment_1
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
    // InternalML2.g:3623:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3627:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalML2.g:3628:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
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
    // InternalML2.g:3635:1: rule__HOClass__Group__0__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3639:1: ( ( 'order' ) )
            // InternalML2.g:3640:1: ( 'order' )
            {
            // InternalML2.g:3640:1: ( 'order' )
            // InternalML2.g:3641:2: 'order'
            {
             before(grammarAccess.getHOClassAccess().getOrderKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalML2.g:3650:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3654:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalML2.g:3655:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
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
    // InternalML2.g:3662:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__OrderAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3666:1: ( ( ( rule__HOClass__OrderAssignment_1 ) ) )
            // InternalML2.g:3667:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            {
            // InternalML2.g:3667:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            // InternalML2.g:3668:2: ( rule__HOClass__OrderAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 
            // InternalML2.g:3669:2: ( rule__HOClass__OrderAssignment_1 )
            // InternalML2.g:3669:3: rule__HOClass__OrderAssignment_1
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
    // InternalML2.g:3677:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3681:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalML2.g:3682:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
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
    // InternalML2.g:3689:1: rule__HOClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3693:1: ( ( 'class' ) )
            // InternalML2.g:3694:1: ( 'class' )
            {
            // InternalML2.g:3694:1: ( 'class' )
            // InternalML2.g:3695:2: 'class'
            {
             before(grammarAccess.getHOClassAccess().getClassKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalML2.g:3704:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3708:1: ( rule__HOClass__Group__3__Impl )
            // InternalML2.g:3709:2: rule__HOClass__Group__3__Impl
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
    // InternalML2.g:3715:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__NameAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3719:1: ( ( ( rule__HOClass__NameAssignment_3 ) ) )
            // InternalML2.g:3720:1: ( ( rule__HOClass__NameAssignment_3 ) )
            {
            // InternalML2.g:3720:1: ( ( rule__HOClass__NameAssignment_3 ) )
            // InternalML2.g:3721:2: ( rule__HOClass__NameAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_3()); 
            // InternalML2.g:3722:2: ( rule__HOClass__NameAssignment_3 )
            // InternalML2.g:3722:3: rule__HOClass__NameAssignment_3
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
    // InternalML2.g:3731:1: rule__OrderlessClass__Group__0 : rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 ;
    public final void rule__OrderlessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3735:1: ( rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 )
            // InternalML2.g:3736:2: rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1
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
    // InternalML2.g:3743:1: rule__OrderlessClass__Group__0__Impl : ( 'orderless' ) ;
    public final void rule__OrderlessClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3747:1: ( ( 'orderless' ) )
            // InternalML2.g:3748:1: ( 'orderless' )
            {
            // InternalML2.g:3748:1: ( 'orderless' )
            // InternalML2.g:3749:2: 'orderless'
            {
             before(grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalML2.g:3758:1: rule__OrderlessClass__Group__1 : rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 ;
    public final void rule__OrderlessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3762:1: ( rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 )
            // InternalML2.g:3763:2: rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2
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
    // InternalML2.g:3770:1: rule__OrderlessClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__OrderlessClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3774:1: ( ( 'class' ) )
            // InternalML2.g:3775:1: ( 'class' )
            {
            // InternalML2.g:3775:1: ( 'class' )
            // InternalML2.g:3776:2: 'class'
            {
             before(grammarAccess.getOrderlessClassAccess().getClassKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalML2.g:3785:1: rule__OrderlessClass__Group__2 : rule__OrderlessClass__Group__2__Impl ;
    public final void rule__OrderlessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3789:1: ( rule__OrderlessClass__Group__2__Impl )
            // InternalML2.g:3790:2: rule__OrderlessClass__Group__2__Impl
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
    // InternalML2.g:3796:1: rule__OrderlessClass__Group__2__Impl : ( ( rule__OrderlessClass__NameAssignment_2 ) ) ;
    public final void rule__OrderlessClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3800:1: ( ( ( rule__OrderlessClass__NameAssignment_2 ) ) )
            // InternalML2.g:3801:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            {
            // InternalML2.g:3801:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            // InternalML2.g:3802:2: ( rule__OrderlessClass__NameAssignment_2 )
            {
             before(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 
            // InternalML2.g:3803:2: ( rule__OrderlessClass__NameAssignment_2 )
            // InternalML2.g:3803:3: rule__OrderlessClass__NameAssignment_2
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
    // InternalML2.g:3812:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3816:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalML2.g:3817:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
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
    // InternalML2.g:3824:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3828:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) )
            // InternalML2.g:3829:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            {
            // InternalML2.g:3829:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            // InternalML2.g:3830:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0()); 
            // InternalML2.g:3831:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            // InternalML2.g:3831:3: rule__GeneralizationSet__UnorderedGroup_0
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
    // InternalML2.g:3839:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3843:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalML2.g:3844:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
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
    // InternalML2.g:3851:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3855:1: ( ( 'genset' ) )
            // InternalML2.g:3856:1: ( 'genset' )
            {
            // InternalML2.g:3856:1: ( 'genset' )
            // InternalML2.g:3857:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalML2.g:3866:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3870:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalML2.g:3871:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
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
    // InternalML2.g:3878:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3882:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalML2.g:3883:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalML2.g:3883:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalML2.g:3884:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalML2.g:3885:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalML2.g:3885:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalML2.g:3893:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3897:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalML2.g:3898:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
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
    // InternalML2.g:3905:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3909:1: ( ( 'general' ) )
            // InternalML2.g:3910:1: ( 'general' )
            {
            // InternalML2.g:3910:1: ( 'general' )
            // InternalML2.g:3911:2: 'general'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalML2.g:3920:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3924:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalML2.g:3925:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
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
    // InternalML2.g:3932:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3936:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalML2.g:3937:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalML2.g:3937:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalML2.g:3938:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalML2.g:3939:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalML2.g:3939:3: rule__GeneralizationSet__GeneralAssignment_4
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
    // InternalML2.g:3947:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3951:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalML2.g:3952:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
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
    // InternalML2.g:3959:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3963:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalML2.g:3964:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalML2.g:3964:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalML2.g:3965:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalML2.g:3966:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalML2.g:3966:3: rule__GeneralizationSet__Group_5__0
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
    // InternalML2.g:3974:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3978:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalML2.g:3979:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
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
    // InternalML2.g:3986:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3990:1: ( ( 'specifics' ) )
            // InternalML2.g:3991:1: ( 'specifics' )
            {
            // InternalML2.g:3991:1: ( 'specifics' )
            // InternalML2.g:3992:2: 'specifics'
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6()); 
            match(input,46,FOLLOW_2); 
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
    // InternalML2.g:4001:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4005:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalML2.g:4006:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
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
    // InternalML2.g:4013:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4017:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalML2.g:4018:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalML2.g:4018:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalML2.g:4019:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalML2.g:4020:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalML2.g:4020:3: rule__GeneralizationSet__SpecificsAssignment_7
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
    // InternalML2.g:4028:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4032:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalML2.g:4033:2: rule__GeneralizationSet__Group__8__Impl
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
    // InternalML2.g:4039:1: rule__GeneralizationSet__Group__8__Impl : ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4043:1: ( ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) )
            // InternalML2.g:4044:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            {
            // InternalML2.g:4044:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalML2.g:4045:2: ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalML2.g:4045:2: ( ( rule__GeneralizationSet__Group_8__0 ) )
            // InternalML2.g:4046:3: ( rule__GeneralizationSet__Group_8__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalML2.g:4047:3: ( rule__GeneralizationSet__Group_8__0 )
            // InternalML2.g:4047:4: rule__GeneralizationSet__Group_8__0
            {
            pushFollow(FOLLOW_13);
            rule__GeneralizationSet__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }

            // InternalML2.g:4050:2: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalML2.g:4051:3: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalML2.g:4052:3: ( rule__GeneralizationSet__Group_8__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==36) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalML2.g:4052:4: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalML2.g:4062:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4066:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalML2.g:4067:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
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
    // InternalML2.g:4074:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4078:1: ( ( 'categorizer' ) )
            // InternalML2.g:4079:1: ( 'categorizer' )
            {
            // InternalML2.g:4079:1: ( 'categorizer' )
            // InternalML2.g:4080:2: 'categorizer'
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalML2.g:4089:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4093:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalML2.g:4094:2: rule__GeneralizationSet__Group_5__1__Impl
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
    // InternalML2.g:4100:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4104:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalML2.g:4105:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalML2.g:4105:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalML2.g:4106:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalML2.g:4107:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalML2.g:4107:3: rule__GeneralizationSet__CategorizerAssignment_5_1
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
    // InternalML2.g:4116:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4120:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalML2.g:4121:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
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
    // InternalML2.g:4128:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4132:1: ( ( ',' ) )
            // InternalML2.g:4133:1: ( ',' )
            {
            // InternalML2.g:4133:1: ( ',' )
            // InternalML2.g:4134:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:4143:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4147:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalML2.g:4148:2: rule__GeneralizationSet__Group_8__1__Impl
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
    // InternalML2.g:4154:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4158:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalML2.g:4159:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalML2.g:4159:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalML2.g:4160:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalML2.g:4161:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalML2.g:4161:3: rule__GeneralizationSet__SpecificsAssignment_8_1
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
    // InternalML2.g:4170:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4174:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalML2.g:4175:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalML2.g:4182:1: rule__Attribute__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4186:1: ( ( ( 'att' )? ) )
            // InternalML2.g:4187:1: ( ( 'att' )? )
            {
            // InternalML2.g:4187:1: ( ( 'att' )? )
            // InternalML2.g:4188:2: ( 'att' )?
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            // InternalML2.g:4189:2: ( 'att' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalML2.g:4189:3: 'att'
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalML2.g:4197:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4201:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalML2.g:4202:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalML2.g:4209:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4213:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalML2.g:4214:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalML2.g:4214:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalML2.g:4215:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalML2.g:4216:2: ( rule__Attribute__NameAssignment_1 )
            // InternalML2.g:4216:3: rule__Attribute__NameAssignment_1
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
    // InternalML2.g:4224:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4228:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalML2.g:4229:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalML2.g:4236:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4240:1: ( ( ':' ) )
            // InternalML2.g:4241:1: ( ':' )
            {
            // InternalML2.g:4241:1: ( ':' )
            // InternalML2.g:4242:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalML2.g:4251:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4255:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalML2.g:4256:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalML2.g:4263:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4267:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalML2.g:4268:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalML2.g:4268:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalML2.g:4269:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalML2.g:4270:2: ( rule__Attribute__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalML2.g:4270:3: rule__Attribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_3()); 

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
    // InternalML2.g:4278:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4282:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalML2.g:4283:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // InternalML2.g:4290:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute___typeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4294:1: ( ( ( rule__Attribute___typeAssignment_4 ) ) )
            // InternalML2.g:4295:1: ( ( rule__Attribute___typeAssignment_4 ) )
            {
            // InternalML2.g:4295:1: ( ( rule__Attribute___typeAssignment_4 ) )
            // InternalML2.g:4296:2: ( rule__Attribute___typeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().get_typeAssignment_4()); 
            // InternalML2.g:4297:2: ( rule__Attribute___typeAssignment_4 )
            // InternalML2.g:4297:3: rule__Attribute___typeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute___typeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().get_typeAssignment_4()); 

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


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalML2.g:4305:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4309:1: ( rule__Attribute__Group__5__Impl )
            // InternalML2.g:4310:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalML2.g:4316:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4320:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalML2.g:4321:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalML2.g:4321:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalML2.g:4322:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalML2.g:4323:2: ( rule__Attribute__Group_5__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalML2.g:4323:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // InternalML2.g:4332:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4336:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalML2.g:4337:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1();

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
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // InternalML2.g:4344:1: rule__Attribute__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4348:1: ( ( '[' ) )
            // InternalML2.g:4349:1: ( '[' )
            {
            // InternalML2.g:4349:1: ( '[' )
            // InternalML2.g:4350:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // InternalML2.g:4359:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4363:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalML2.g:4364:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__Attribute__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__2();

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
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // InternalML2.g:4371:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4375:1: ( ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) )
            // InternalML2.g:4376:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            {
            // InternalML2.g:4376:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            // InternalML2.g:4377:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 
            // InternalML2.g:4378:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            // InternalML2.g:4378:3: rule__Attribute__LowerBoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__LowerBoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 

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
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group_3__2"
    // InternalML2.g:4386:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4390:1: ( rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 )
            // InternalML2.g:4391:2: rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3
            {
            pushFollow(FOLLOW_29);
            rule__Attribute__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__3();

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
    // $ANTLR end "rule__Attribute__Group_3__2"


    // $ANTLR start "rule__Attribute__Group_3__2__Impl"
    // InternalML2.g:4398:1: rule__Attribute__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4402:1: ( ( '..' ) )
            // InternalML2.g:4403:1: ( '..' )
            {
            // InternalML2.g:4403:1: ( '..' )
            // InternalML2.g:4404:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2()); 

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
    // $ANTLR end "rule__Attribute__Group_3__2__Impl"


    // $ANTLR start "rule__Attribute__Group_3__3"
    // InternalML2.g:4413:1: rule__Attribute__Group_3__3 : rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 ;
    public final void rule__Attribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4417:1: ( rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 )
            // InternalML2.g:4418:2: rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4
            {
            pushFollow(FOLLOW_31);
            rule__Attribute__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__4();

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
    // $ANTLR end "rule__Attribute__Group_3__3"


    // $ANTLR start "rule__Attribute__Group_3__3__Impl"
    // InternalML2.g:4425:1: rule__Attribute__Group_3__3__Impl : ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Attribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4429:1: ( ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) )
            // InternalML2.g:4430:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            {
            // InternalML2.g:4430:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            // InternalML2.g:4431:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 
            // InternalML2.g:4432:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            // InternalML2.g:4432:3: rule__Attribute__UpperBoundAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UpperBoundAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 

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
    // $ANTLR end "rule__Attribute__Group_3__3__Impl"


    // $ANTLR start "rule__Attribute__Group_3__4"
    // InternalML2.g:4440:1: rule__Attribute__Group_3__4 : rule__Attribute__Group_3__4__Impl ;
    public final void rule__Attribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4444:1: ( rule__Attribute__Group_3__4__Impl )
            // InternalML2.g:4445:2: rule__Attribute__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__4__Impl();

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
    // $ANTLR end "rule__Attribute__Group_3__4"


    // $ANTLR start "rule__Attribute__Group_3__4__Impl"
    // InternalML2.g:4451:1: rule__Attribute__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4455:1: ( ( ']' ) )
            // InternalML2.g:4456:1: ( ']' )
            {
            // InternalML2.g:4456:1: ( ']' )
            // InternalML2.g:4457:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Attribute__Group_3__4__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalML2.g:4467:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4471:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalML2.g:4472:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

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
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalML2.g:4479:1: rule__Attribute__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4483:1: ( ( 'subsets' ) )
            // InternalML2.g:4484:1: ( 'subsets' )
            {
            // InternalML2.g:4484:1: ( 'subsets' )
            // InternalML2.g:4485:2: 'subsets'
            {
             before(grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalML2.g:4494:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4498:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalML2.g:4499:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2();

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
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalML2.g:4506:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4510:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) )
            // InternalML2.g:4511:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            {
            // InternalML2.g:4511:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            // InternalML2.g:4512:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 
            // InternalML2.g:4513:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            // InternalML2.g:4513:3: rule__Attribute__SubsetOfAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__SubsetOfAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__2"
    // InternalML2.g:4521:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4525:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalML2.g:4526:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5__2"


    // $ANTLR start "rule__Attribute__Group_5__2__Impl"
    // InternalML2.g:4532:1: rule__Attribute__Group_5__2__Impl : ( ( rule__Attribute__Group_5_2__0 )* ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4536:1: ( ( ( rule__Attribute__Group_5_2__0 )* ) )
            // InternalML2.g:4537:1: ( ( rule__Attribute__Group_5_2__0 )* )
            {
            // InternalML2.g:4537:1: ( ( rule__Attribute__Group_5_2__0 )* )
            // InternalML2.g:4538:2: ( rule__Attribute__Group_5_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2()); 
            // InternalML2.g:4539:2: ( rule__Attribute__Group_5_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==36) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalML2.g:4539:3: rule__Attribute__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__Attribute__Group_5__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2__0"
    // InternalML2.g:4548:1: rule__Attribute__Group_5_2__0 : rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 ;
    public final void rule__Attribute__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4552:1: ( rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 )
            // InternalML2.g:4553:2: rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2__1();

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
    // $ANTLR end "rule__Attribute__Group_5_2__0"


    // $ANTLR start "rule__Attribute__Group_5_2__0__Impl"
    // InternalML2.g:4560:1: rule__Attribute__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4564:1: ( ( ',' ) )
            // InternalML2.g:4565:1: ( ',' )
            {
            // InternalML2.g:4565:1: ( ',' )
            // InternalML2.g:4566:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5_2__1"
    // InternalML2.g:4575:1: rule__Attribute__Group_5_2__1 : rule__Attribute__Group_5_2__1__Impl ;
    public final void rule__Attribute__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4579:1: ( rule__Attribute__Group_5_2__1__Impl )
            // InternalML2.g:4580:2: rule__Attribute__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5_2__1"


    // $ANTLR start "rule__Attribute__Group_5_2__1__Impl"
    // InternalML2.g:4586:1: rule__Attribute__Group_5_2__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Attribute__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4590:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) )
            // InternalML2.g:4591:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalML2.g:4591:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            // InternalML2.g:4592:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalML2.g:4593:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            // InternalML2.g:4593:3: rule__Attribute__SubsetOfAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__SubsetOfAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5_2__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalML2.g:4602:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4606:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalML2.g:4607:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalML2.g:4614:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4618:1: ( ( 'ref' ) )
            // InternalML2.g:4619:1: ( 'ref' )
            {
            // InternalML2.g:4619:1: ( 'ref' )
            // InternalML2.g:4620:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalML2.g:4629:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4633:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalML2.g:4634:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
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
    // InternalML2.g:4641:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4645:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalML2.g:4646:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalML2.g:4646:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalML2.g:4647:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalML2.g:4648:2: ( rule__Reference__NameAssignment_1 )
            // InternalML2.g:4648:3: rule__Reference__NameAssignment_1
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
    // InternalML2.g:4656:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4660:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalML2.g:4661:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalML2.g:4668:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4672:1: ( ( ':' ) )
            // InternalML2.g:4673:1: ( ':' )
            {
            // InternalML2.g:4673:1: ( ':' )
            // InternalML2.g:4674:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalML2.g:4683:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4687:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalML2.g:4688:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalML2.g:4695:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4699:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalML2.g:4700:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalML2.g:4700:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalML2.g:4701:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalML2.g:4702:2: ( rule__Reference__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalML2.g:4702:3: rule__Reference__Group_3__0
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
    // InternalML2.g:4710:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4714:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalML2.g:4715:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__5();

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
    // InternalML2.g:4722:1: rule__Reference__Group__4__Impl : ( ( rule__Reference___typeAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4726:1: ( ( ( rule__Reference___typeAssignment_4 ) ) )
            // InternalML2.g:4727:1: ( ( rule__Reference___typeAssignment_4 ) )
            {
            // InternalML2.g:4727:1: ( ( rule__Reference___typeAssignment_4 ) )
            // InternalML2.g:4728:2: ( rule__Reference___typeAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().get_typeAssignment_4()); 
            // InternalML2.g:4729:2: ( rule__Reference___typeAssignment_4 )
            // InternalML2.g:4729:3: rule__Reference___typeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reference___typeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().get_typeAssignment_4()); 

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


    // $ANTLR start "rule__Reference__Group__5"
    // InternalML2.g:4737:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4741:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalML2.g:4742:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Reference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__6();

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
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // InternalML2.g:4749:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4753:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalML2.g:4754:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalML2.g:4754:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalML2.g:4755:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalML2.g:4756:2: ( rule__Reference__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalML2.g:4756:3: rule__Reference__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__6"
    // InternalML2.g:4764:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4768:1: ( rule__Reference__Group__6__Impl )
            // InternalML2.g:4769:2: rule__Reference__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__6__Impl();

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
    // $ANTLR end "rule__Reference__Group__6"


    // $ANTLR start "rule__Reference__Group__6__Impl"
    // InternalML2.g:4775:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__Group_6__0 )? ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4779:1: ( ( ( rule__Reference__Group_6__0 )? ) )
            // InternalML2.g:4780:1: ( ( rule__Reference__Group_6__0 )? )
            {
            // InternalML2.g:4780:1: ( ( rule__Reference__Group_6__0 )? )
            // InternalML2.g:4781:2: ( rule__Reference__Group_6__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_6()); 
            // InternalML2.g:4782:2: ( rule__Reference__Group_6__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalML2.g:4782:3: rule__Reference__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Reference__Group__6__Impl"


    // $ANTLR start "rule__Reference__Group_3__0"
    // InternalML2.g:4791:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4795:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalML2.g:4796:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalML2.g:4803:1: rule__Reference__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4807:1: ( ( '[' ) )
            // InternalML2.g:4808:1: ( '[' )
            {
            // InternalML2.g:4808:1: ( '[' )
            // InternalML2.g:4809:2: '['
            {
             before(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // InternalML2.g:4818:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4822:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalML2.g:4823:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalML2.g:4830:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4834:1: ( ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) )
            // InternalML2.g:4835:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            {
            // InternalML2.g:4835:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            // InternalML2.g:4836:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 
            // InternalML2.g:4837:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            // InternalML2.g:4837:3: rule__Reference__LowerBoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__LowerBoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 

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
    // InternalML2.g:4845:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4849:1: ( rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 )
            // InternalML2.g:4850:2: rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3
            {
            pushFollow(FOLLOW_29);
            rule__Reference__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__3();

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
    // InternalML2.g:4857:1: rule__Reference__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4861:1: ( ( '..' ) )
            // InternalML2.g:4862:1: ( '..' )
            {
            // InternalML2.g:4862:1: ( '..' )
            // InternalML2.g:4863:2: '..'
            {
             before(grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2()); 

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


    // $ANTLR start "rule__Reference__Group_3__3"
    // InternalML2.g:4872:1: rule__Reference__Group_3__3 : rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 ;
    public final void rule__Reference__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4876:1: ( rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 )
            // InternalML2.g:4877:2: rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4
            {
            pushFollow(FOLLOW_31);
            rule__Reference__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__4();

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
    // $ANTLR end "rule__Reference__Group_3__3"


    // $ANTLR start "rule__Reference__Group_3__3__Impl"
    // InternalML2.g:4884:1: rule__Reference__Group_3__3__Impl : ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Reference__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4888:1: ( ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) )
            // InternalML2.g:4889:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            {
            // InternalML2.g:4889:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            // InternalML2.g:4890:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 
            // InternalML2.g:4891:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            // InternalML2.g:4891:3: rule__Reference__UpperBoundAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Reference__UpperBoundAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 

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
    // $ANTLR end "rule__Reference__Group_3__3__Impl"


    // $ANTLR start "rule__Reference__Group_3__4"
    // InternalML2.g:4899:1: rule__Reference__Group_3__4 : rule__Reference__Group_3__4__Impl ;
    public final void rule__Reference__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4903:1: ( rule__Reference__Group_3__4__Impl )
            // InternalML2.g:4904:2: rule__Reference__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__4__Impl();

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
    // $ANTLR end "rule__Reference__Group_3__4"


    // $ANTLR start "rule__Reference__Group_3__4__Impl"
    // InternalML2.g:4910:1: rule__Reference__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4914:1: ( ( ']' ) )
            // InternalML2.g:4915:1: ( ']' )
            {
            // InternalML2.g:4915:1: ( ']' )
            // InternalML2.g:4916:2: ']'
            {
             before(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Reference__Group_3__4__Impl"


    // $ANTLR start "rule__Reference__Group_5__0"
    // InternalML2.g:4926:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4930:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalML2.g:4931:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__1();

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
    // $ANTLR end "rule__Reference__Group_5__0"


    // $ANTLR start "rule__Reference__Group_5__0__Impl"
    // InternalML2.g:4938:1: rule__Reference__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4942:1: ( ( 'subsets' ) )
            // InternalML2.g:4943:1: ( 'subsets' )
            {
            // InternalML2.g:4943:1: ( 'subsets' )
            // InternalML2.g:4944:2: 'subsets'
            {
             before(grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0()); 

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
    // $ANTLR end "rule__Reference__Group_5__0__Impl"


    // $ANTLR start "rule__Reference__Group_5__1"
    // InternalML2.g:4953:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4957:1: ( rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 )
            // InternalML2.g:4958:2: rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__Reference__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__2();

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
    // $ANTLR end "rule__Reference__Group_5__1"


    // $ANTLR start "rule__Reference__Group_5__1__Impl"
    // InternalML2.g:4965:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4969:1: ( ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) )
            // InternalML2.g:4970:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            {
            // InternalML2.g:4970:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            // InternalML2.g:4971:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 
            // InternalML2.g:4972:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            // InternalML2.g:4972:3: rule__Reference__SubsetOfAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__SubsetOfAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 

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
    // $ANTLR end "rule__Reference__Group_5__1__Impl"


    // $ANTLR start "rule__Reference__Group_5__2"
    // InternalML2.g:4980:1: rule__Reference__Group_5__2 : rule__Reference__Group_5__2__Impl ;
    public final void rule__Reference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4984:1: ( rule__Reference__Group_5__2__Impl )
            // InternalML2.g:4985:2: rule__Reference__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__2__Impl();

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
    // $ANTLR end "rule__Reference__Group_5__2"


    // $ANTLR start "rule__Reference__Group_5__2__Impl"
    // InternalML2.g:4991:1: rule__Reference__Group_5__2__Impl : ( ( rule__Reference__Group_5_2__0 )* ) ;
    public final void rule__Reference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4995:1: ( ( ( rule__Reference__Group_5_2__0 )* ) )
            // InternalML2.g:4996:1: ( ( rule__Reference__Group_5_2__0 )* )
            {
            // InternalML2.g:4996:1: ( ( rule__Reference__Group_5_2__0 )* )
            // InternalML2.g:4997:2: ( rule__Reference__Group_5_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_5_2()); 
            // InternalML2.g:4998:2: ( rule__Reference__Group_5_2__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==36) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalML2.g:4998:3: rule__Reference__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Reference__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__Reference__Group_5__2__Impl"


    // $ANTLR start "rule__Reference__Group_5_2__0"
    // InternalML2.g:5007:1: rule__Reference__Group_5_2__0 : rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 ;
    public final void rule__Reference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5011:1: ( rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 )
            // InternalML2.g:5012:2: rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5_2__1();

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
    // $ANTLR end "rule__Reference__Group_5_2__0"


    // $ANTLR start "rule__Reference__Group_5_2__0__Impl"
    // InternalML2.g:5019:1: rule__Reference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5023:1: ( ( ',' ) )
            // InternalML2.g:5024:1: ( ',' )
            {
            // InternalML2.g:5024:1: ( ',' )
            // InternalML2.g:5025:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__Reference__Group_5_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_5_2__1"
    // InternalML2.g:5034:1: rule__Reference__Group_5_2__1 : rule__Reference__Group_5_2__1__Impl ;
    public final void rule__Reference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5038:1: ( rule__Reference__Group_5_2__1__Impl )
            // InternalML2.g:5039:2: rule__Reference__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_5_2__1"


    // $ANTLR start "rule__Reference__Group_5_2__1__Impl"
    // InternalML2.g:5045:1: rule__Reference__Group_5_2__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Reference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5049:1: ( ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) )
            // InternalML2.g:5050:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalML2.g:5050:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            // InternalML2.g:5051:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalML2.g:5052:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            // InternalML2.g:5052:3: rule__Reference__SubsetOfAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__SubsetOfAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 

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
    // $ANTLR end "rule__Reference__Group_5_2__1__Impl"


    // $ANTLR start "rule__Reference__Group_6__0"
    // InternalML2.g:5061:1: rule__Reference__Group_6__0 : rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 ;
    public final void rule__Reference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5065:1: ( rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 )
            // InternalML2.g:5066:2: rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__1();

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
    // $ANTLR end "rule__Reference__Group_6__0"


    // $ANTLR start "rule__Reference__Group_6__0__Impl"
    // InternalML2.g:5073:1: rule__Reference__Group_6__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__Reference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5077:1: ( ( 'isOppositeTo' ) )
            // InternalML2.g:5078:1: ( 'isOppositeTo' )
            {
            // InternalML2.g:5078:1: ( 'isOppositeTo' )
            // InternalML2.g:5079:2: 'isOppositeTo'
            {
             before(grammarAccess.getReferenceAccess().getIsOppositeToKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getIsOppositeToKeyword_6_0()); 

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
    // $ANTLR end "rule__Reference__Group_6__0__Impl"


    // $ANTLR start "rule__Reference__Group_6__1"
    // InternalML2.g:5088:1: rule__Reference__Group_6__1 : rule__Reference__Group_6__1__Impl ;
    public final void rule__Reference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5092:1: ( rule__Reference__Group_6__1__Impl )
            // InternalML2.g:5093:2: rule__Reference__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_6__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_6__1"


    // $ANTLR start "rule__Reference__Group_6__1__Impl"
    // InternalML2.g:5099:1: rule__Reference__Group_6__1__Impl : ( ( rule__Reference__OppositeToAssignment_6_1 ) ) ;
    public final void rule__Reference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5103:1: ( ( ( rule__Reference__OppositeToAssignment_6_1 ) ) )
            // InternalML2.g:5104:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            {
            // InternalML2.g:5104:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            // InternalML2.g:5105:2: ( rule__Reference__OppositeToAssignment_6_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 
            // InternalML2.g:5106:2: ( rule__Reference__OppositeToAssignment_6_1 )
            // InternalML2.g:5106:3: rule__Reference__OppositeToAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__OppositeToAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 

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
    // $ANTLR end "rule__Reference__Group_6__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group__0"
    // InternalML2.g:5115:1: rule__RegularityAttribute__Group__0 : rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 ;
    public final void rule__RegularityAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5119:1: ( rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 )
            // InternalML2.g:5120:2: rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1
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
    // InternalML2.g:5127:1: rule__RegularityAttribute__Group__0__Impl : ( 'regularity' ) ;
    public final void rule__RegularityAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5131:1: ( ( 'regularity' ) )
            // InternalML2.g:5132:1: ( 'regularity' )
            {
            // InternalML2.g:5132:1: ( 'regularity' )
            // InternalML2.g:5133:2: 'regularity'
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalML2.g:5142:1: rule__RegularityAttribute__Group__1 : rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 ;
    public final void rule__RegularityAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5146:1: ( rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 )
            // InternalML2.g:5147:2: rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2
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
    // InternalML2.g:5154:1: rule__RegularityAttribute__Group__1__Impl : ( ( 'att' )? ) ;
    public final void rule__RegularityAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5158:1: ( ( ( 'att' )? ) )
            // InternalML2.g:5159:1: ( ( 'att' )? )
            {
            // InternalML2.g:5159:1: ( ( 'att' )? )
            // InternalML2.g:5160:2: ( 'att' )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getAttKeyword_1()); 
            // InternalML2.g:5161:2: ( 'att' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==48) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalML2.g:5161:3: 'att'
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalML2.g:5169:1: rule__RegularityAttribute__Group__2 : rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 ;
    public final void rule__RegularityAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5173:1: ( rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 )
            // InternalML2.g:5174:2: rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3
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
    // InternalML2.g:5181:1: rule__RegularityAttribute__Group__2__Impl : ( ( rule__RegularityAttribute__NameAssignment_2 ) ) ;
    public final void rule__RegularityAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5185:1: ( ( ( rule__RegularityAttribute__NameAssignment_2 ) ) )
            // InternalML2.g:5186:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            {
            // InternalML2.g:5186:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            // InternalML2.g:5187:2: ( rule__RegularityAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getNameAssignment_2()); 
            // InternalML2.g:5188:2: ( rule__RegularityAttribute__NameAssignment_2 )
            // InternalML2.g:5188:3: rule__RegularityAttribute__NameAssignment_2
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
    // InternalML2.g:5196:1: rule__RegularityAttribute__Group__3 : rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 ;
    public final void rule__RegularityAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5200:1: ( rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 )
            // InternalML2.g:5201:2: rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4
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
    // InternalML2.g:5208:1: rule__RegularityAttribute__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5212:1: ( ( ':' ) )
            // InternalML2.g:5213:1: ( ':' )
            {
            // InternalML2.g:5213:1: ( ':' )
            // InternalML2.g:5214:2: ':'
            {
             before(grammarAccess.getRegularityAttributeAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalML2.g:5223:1: rule__RegularityAttribute__Group__4 : rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 ;
    public final void rule__RegularityAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5227:1: ( rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 )
            // InternalML2.g:5228:2: rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalML2.g:5235:1: rule__RegularityAttribute__Group__4__Impl : ( ( rule__RegularityAttribute__Group_4__0 )? ) ;
    public final void rule__RegularityAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5239:1: ( ( ( rule__RegularityAttribute__Group_4__0 )? ) )
            // InternalML2.g:5240:1: ( ( rule__RegularityAttribute__Group_4__0 )? )
            {
            // InternalML2.g:5240:1: ( ( rule__RegularityAttribute__Group_4__0 )? )
            // InternalML2.g:5241:2: ( rule__RegularityAttribute__Group_4__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_4()); 
            // InternalML2.g:5242:2: ( rule__RegularityAttribute__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==49) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalML2.g:5242:3: rule__RegularityAttribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup_4()); 

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
    // InternalML2.g:5250:1: rule__RegularityAttribute__Group__5 : rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 ;
    public final void rule__RegularityAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5254:1: ( rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 )
            // InternalML2.g:5255:2: rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalML2.g:5262:1: rule__RegularityAttribute__Group__5__Impl : ( ( rule__RegularityAttribute___typeAssignment_5 ) ) ;
    public final void rule__RegularityAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5266:1: ( ( ( rule__RegularityAttribute___typeAssignment_5 ) ) )
            // InternalML2.g:5267:1: ( ( rule__RegularityAttribute___typeAssignment_5 ) )
            {
            // InternalML2.g:5267:1: ( ( rule__RegularityAttribute___typeAssignment_5 ) )
            // InternalML2.g:5268:2: ( rule__RegularityAttribute___typeAssignment_5 )
            {
             before(grammarAccess.getRegularityAttributeAccess().get_typeAssignment_5()); 
            // InternalML2.g:5269:2: ( rule__RegularityAttribute___typeAssignment_5 )
            // InternalML2.g:5269:3: rule__RegularityAttribute___typeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute___typeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().get_typeAssignment_5()); 

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
    // InternalML2.g:5277:1: rule__RegularityAttribute__Group__6 : rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 ;
    public final void rule__RegularityAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5281:1: ( rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 )
            // InternalML2.g:5282:2: rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalML2.g:5289:1: rule__RegularityAttribute__Group__6__Impl : ( ( rule__RegularityAttribute__Group_6__0 )? ) ;
    public final void rule__RegularityAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5293:1: ( ( ( rule__RegularityAttribute__Group_6__0 )? ) )
            // InternalML2.g:5294:1: ( ( rule__RegularityAttribute__Group_6__0 )? )
            {
            // InternalML2.g:5294:1: ( ( rule__RegularityAttribute__Group_6__0 )? )
            // InternalML2.g:5295:2: ( rule__RegularityAttribute__Group_6__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_6()); 
            // InternalML2.g:5296:2: ( rule__RegularityAttribute__Group_6__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==52) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalML2.g:5296:3: rule__RegularityAttribute__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityAttributeAccess().getGroup_6()); 

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
    // InternalML2.g:5304:1: rule__RegularityAttribute__Group__7 : rule__RegularityAttribute__Group__7__Impl rule__RegularityAttribute__Group__8 ;
    public final void rule__RegularityAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5308:1: ( rule__RegularityAttribute__Group__7__Impl rule__RegularityAttribute__Group__8 )
            // InternalML2.g:5309:2: rule__RegularityAttribute__Group__7__Impl rule__RegularityAttribute__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__8();

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
    // InternalML2.g:5316:1: rule__RegularityAttribute__Group__7__Impl : ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) ) ;
    public final void rule__RegularityAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5320:1: ( ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) ) )
            // InternalML2.g:5321:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) )
            {
            // InternalML2.g:5321:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) )
            // InternalML2.g:5322:2: ( rule__RegularityAttribute__RegularityTypeAssignment_7 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityTypeAssignment_7()); 
            // InternalML2.g:5323:2: ( rule__RegularityAttribute__RegularityTypeAssignment_7 )
            // InternalML2.g:5323:3: rule__RegularityAttribute__RegularityTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__RegularityTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getRegularityTypeAssignment_7()); 

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


    // $ANTLR start "rule__RegularityAttribute__Group__8"
    // InternalML2.g:5331:1: rule__RegularityAttribute__Group__8 : rule__RegularityAttribute__Group__8__Impl ;
    public final void rule__RegularityAttribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5335:1: ( rule__RegularityAttribute__Group__8__Impl )
            // InternalML2.g:5336:2: rule__RegularityAttribute__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group__8__Impl();

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
    // $ANTLR end "rule__RegularityAttribute__Group__8"


    // $ANTLR start "rule__RegularityAttribute__Group__8__Impl"
    // InternalML2.g:5342:1: rule__RegularityAttribute__Group__8__Impl : ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) ) ;
    public final void rule__RegularityAttribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5346:1: ( ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) ) )
            // InternalML2.g:5347:1: ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) )
            {
            // InternalML2.g:5347:1: ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) )
            // InternalML2.g:5348:2: ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureAssignment_8()); 
            // InternalML2.g:5349:2: ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 )
            // InternalML2.g:5349:3: rule__RegularityAttribute__RegulatedFeatureAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__RegulatedFeatureAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureAssignment_8()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group__8__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__0"
    // InternalML2.g:5358:1: rule__RegularityAttribute__Group_4__0 : rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1 ;
    public final void rule__RegularityAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5362:1: ( rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1 )
            // InternalML2.g:5363:2: rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__RegularityAttribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__1();

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__0"


    // $ANTLR start "rule__RegularityAttribute__Group_4__0__Impl"
    // InternalML2.g:5370:1: rule__RegularityAttribute__Group_4__0__Impl : ( '[' ) ;
    public final void rule__RegularityAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5374:1: ( ( '[' ) )
            // InternalML2.g:5375:1: ( '[' )
            {
            // InternalML2.g:5375:1: ( '[' )
            // InternalML2.g:5376:2: '['
            {
             before(grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__1"
    // InternalML2.g:5385:1: rule__RegularityAttribute__Group_4__1 : rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2 ;
    public final void rule__RegularityAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5389:1: ( rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2 )
            // InternalML2.g:5390:2: rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2
            {
            pushFollow(FOLLOW_30);
            rule__RegularityAttribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__2();

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__1"


    // $ANTLR start "rule__RegularityAttribute__Group_4__1__Impl"
    // InternalML2.g:5397:1: rule__RegularityAttribute__Group_4__1__Impl : ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__RegularityAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5401:1: ( ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) ) )
            // InternalML2.g:5402:1: ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) )
            {
            // InternalML2.g:5402:1: ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) )
            // InternalML2.g:5403:2: ( rule__RegularityAttribute__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getLowerBoundAssignment_4_1()); 
            // InternalML2.g:5404:2: ( rule__RegularityAttribute__LowerBoundAssignment_4_1 )
            // InternalML2.g:5404:3: rule__RegularityAttribute__LowerBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__LowerBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getLowerBoundAssignment_4_1()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__2"
    // InternalML2.g:5412:1: rule__RegularityAttribute__Group_4__2 : rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3 ;
    public final void rule__RegularityAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5416:1: ( rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3 )
            // InternalML2.g:5417:2: rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3
            {
            pushFollow(FOLLOW_29);
            rule__RegularityAttribute__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__3();

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__2"


    // $ANTLR start "rule__RegularityAttribute__Group_4__2__Impl"
    // InternalML2.g:5424:1: rule__RegularityAttribute__Group_4__2__Impl : ( '..' ) ;
    public final void rule__RegularityAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5428:1: ( ( '..' ) )
            // InternalML2.g:5429:1: ( '..' )
            {
            // InternalML2.g:5429:1: ( '..' )
            // InternalML2.g:5430:2: '..'
            {
             before(grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__2__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__3"
    // InternalML2.g:5439:1: rule__RegularityAttribute__Group_4__3 : rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4 ;
    public final void rule__RegularityAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5443:1: ( rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4 )
            // InternalML2.g:5444:2: rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4
            {
            pushFollow(FOLLOW_31);
            rule__RegularityAttribute__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__4();

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__3"


    // $ANTLR start "rule__RegularityAttribute__Group_4__3__Impl"
    // InternalML2.g:5451:1: rule__RegularityAttribute__Group_4__3__Impl : ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__RegularityAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5455:1: ( ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) ) )
            // InternalML2.g:5456:1: ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) )
            {
            // InternalML2.g:5456:1: ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) )
            // InternalML2.g:5457:2: ( rule__RegularityAttribute__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getUpperBoundAssignment_4_3()); 
            // InternalML2.g:5458:2: ( rule__RegularityAttribute__UpperBoundAssignment_4_3 )
            // InternalML2.g:5458:3: rule__RegularityAttribute__UpperBoundAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__UpperBoundAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getUpperBoundAssignment_4_3()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__3__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_4__4"
    // InternalML2.g:5466:1: rule__RegularityAttribute__Group_4__4 : rule__RegularityAttribute__Group_4__4__Impl ;
    public final void rule__RegularityAttribute__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5470:1: ( rule__RegularityAttribute__Group_4__4__Impl )
            // InternalML2.g:5471:2: rule__RegularityAttribute__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_4__4__Impl();

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__4"


    // $ANTLR start "rule__RegularityAttribute__Group_4__4__Impl"
    // InternalML2.g:5477:1: rule__RegularityAttribute__Group_4__4__Impl : ( ']' ) ;
    public final void rule__RegularityAttribute__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5481:1: ( ( ']' ) )
            // InternalML2.g:5482:1: ( ']' )
            {
            // InternalML2.g:5482:1: ( ']' )
            // InternalML2.g:5483:2: ']'
            {
             before(grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_4__4__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6__0"
    // InternalML2.g:5493:1: rule__RegularityAttribute__Group_6__0 : rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1 ;
    public final void rule__RegularityAttribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5497:1: ( rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1 )
            // InternalML2.g:5498:2: rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6__1();

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
    // $ANTLR end "rule__RegularityAttribute__Group_6__0"


    // $ANTLR start "rule__RegularityAttribute__Group_6__0__Impl"
    // InternalML2.g:5505:1: rule__RegularityAttribute__Group_6__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityAttribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5509:1: ( ( 'subsets' ) )
            // InternalML2.g:5510:1: ( 'subsets' )
            {
            // InternalML2.g:5510:1: ( 'subsets' )
            // InternalML2.g:5511:2: 'subsets'
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_6__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6__1"
    // InternalML2.g:5520:1: rule__RegularityAttribute__Group_6__1 : rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2 ;
    public final void rule__RegularityAttribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5524:1: ( rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2 )
            // InternalML2.g:5525:2: rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2
            {
            pushFollow(FOLLOW_19);
            rule__RegularityAttribute__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6__2();

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
    // $ANTLR end "rule__RegularityAttribute__Group_6__1"


    // $ANTLR start "rule__RegularityAttribute__Group_6__1__Impl"
    // InternalML2.g:5532:1: rule__RegularityAttribute__Group_6__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) ) ;
    public final void rule__RegularityAttribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5536:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) ) )
            // InternalML2.g:5537:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) )
            {
            // InternalML2.g:5537:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) )
            // InternalML2.g:5538:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_1()); 
            // InternalML2.g:5539:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_1 )
            // InternalML2.g:5539:3: rule__RegularityAttribute__SubsetOfAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__SubsetOfAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_1()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_6__1__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6__2"
    // InternalML2.g:5547:1: rule__RegularityAttribute__Group_6__2 : rule__RegularityAttribute__Group_6__2__Impl ;
    public final void rule__RegularityAttribute__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5551:1: ( rule__RegularityAttribute__Group_6__2__Impl )
            // InternalML2.g:5552:2: rule__RegularityAttribute__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6__2__Impl();

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
    // $ANTLR end "rule__RegularityAttribute__Group_6__2"


    // $ANTLR start "rule__RegularityAttribute__Group_6__2__Impl"
    // InternalML2.g:5558:1: rule__RegularityAttribute__Group_6__2__Impl : ( ( rule__RegularityAttribute__Group_6_2__0 )* ) ;
    public final void rule__RegularityAttribute__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5562:1: ( ( ( rule__RegularityAttribute__Group_6_2__0 )* ) )
            // InternalML2.g:5563:1: ( ( rule__RegularityAttribute__Group_6_2__0 )* )
            {
            // InternalML2.g:5563:1: ( ( rule__RegularityAttribute__Group_6_2__0 )* )
            // InternalML2.g:5564:2: ( rule__RegularityAttribute__Group_6_2__0 )*
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_6_2()); 
            // InternalML2.g:5565:2: ( rule__RegularityAttribute__Group_6_2__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==36) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalML2.g:5565:3: rule__RegularityAttribute__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityAttribute__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getRegularityAttributeAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_6__2__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__0"
    // InternalML2.g:5574:1: rule__RegularityAttribute__Group_6_2__0 : rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1 ;
    public final void rule__RegularityAttribute__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5578:1: ( rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1 )
            // InternalML2.g:5579:2: rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityAttribute__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6_2__1();

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
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__0"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__0__Impl"
    // InternalML2.g:5586:1: rule__RegularityAttribute__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityAttribute__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5590:1: ( ( ',' ) )
            // InternalML2.g:5591:1: ( ',' )
            {
            // InternalML2.g:5591:1: ( ',' )
            // InternalML2.g:5592:2: ','
            {
             before(grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__0__Impl"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__1"
    // InternalML2.g:5601:1: rule__RegularityAttribute__Group_6_2__1 : rule__RegularityAttribute__Group_6_2__1__Impl ;
    public final void rule__RegularityAttribute__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5605:1: ( rule__RegularityAttribute__Group_6_2__1__Impl )
            // InternalML2.g:5606:2: rule__RegularityAttribute__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__1"


    // $ANTLR start "rule__RegularityAttribute__Group_6_2__1__Impl"
    // InternalML2.g:5612:1: rule__RegularityAttribute__Group_6_2__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) ) ;
    public final void rule__RegularityAttribute__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5616:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) ) )
            // InternalML2.g:5617:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) )
            {
            // InternalML2.g:5617:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) )
            // InternalML2.g:5618:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_2_1()); 
            // InternalML2.g:5619:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 )
            // InternalML2.g:5619:3: rule__RegularityAttribute__SubsetOfAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__SubsetOfAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_2_1()); 

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
    // $ANTLR end "rule__RegularityAttribute__Group_6_2__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group__0"
    // InternalML2.g:5628:1: rule__RegularityReference__Group__0 : rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 ;
    public final void rule__RegularityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5632:1: ( rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 )
            // InternalML2.g:5633:2: rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalML2.g:5640:1: rule__RegularityReference__Group__0__Impl : ( 'regularity' ) ;
    public final void rule__RegularityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5644:1: ( ( 'regularity' ) )
            // InternalML2.g:5645:1: ( 'regularity' )
            {
            // InternalML2.g:5645:1: ( 'regularity' )
            // InternalML2.g:5646:2: 'regularity'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalML2.g:5655:1: rule__RegularityReference__Group__1 : rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 ;
    public final void rule__RegularityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5659:1: ( rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 )
            // InternalML2.g:5660:2: rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2
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
    // InternalML2.g:5667:1: rule__RegularityReference__Group__1__Impl : ( 'ref' ) ;
    public final void rule__RegularityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5671:1: ( ( 'ref' ) )
            // InternalML2.g:5672:1: ( 'ref' )
            {
            // InternalML2.g:5672:1: ( 'ref' )
            // InternalML2.g:5673:2: 'ref'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRefKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalML2.g:5682:1: rule__RegularityReference__Group__2 : rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 ;
    public final void rule__RegularityReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5686:1: ( rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 )
            // InternalML2.g:5687:2: rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3
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
    // InternalML2.g:5694:1: rule__RegularityReference__Group__2__Impl : ( ( rule__RegularityReference__NameAssignment_2 ) ) ;
    public final void rule__RegularityReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5698:1: ( ( ( rule__RegularityReference__NameAssignment_2 ) ) )
            // InternalML2.g:5699:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            {
            // InternalML2.g:5699:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            // InternalML2.g:5700:2: ( rule__RegularityReference__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getNameAssignment_2()); 
            // InternalML2.g:5701:2: ( rule__RegularityReference__NameAssignment_2 )
            // InternalML2.g:5701:3: rule__RegularityReference__NameAssignment_2
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
    // InternalML2.g:5709:1: rule__RegularityReference__Group__3 : rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 ;
    public final void rule__RegularityReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5713:1: ( rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 )
            // InternalML2.g:5714:2: rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalML2.g:5721:1: rule__RegularityReference__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5725:1: ( ( ':' ) )
            // InternalML2.g:5726:1: ( ':' )
            {
            // InternalML2.g:5726:1: ( ':' )
            // InternalML2.g:5727:2: ':'
            {
             before(grammarAccess.getRegularityReferenceAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalML2.g:5736:1: rule__RegularityReference__Group__4 : rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 ;
    public final void rule__RegularityReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5740:1: ( rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 )
            // InternalML2.g:5741:2: rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalML2.g:5748:1: rule__RegularityReference__Group__4__Impl : ( ( rule__RegularityReference__Group_4__0 )? ) ;
    public final void rule__RegularityReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5752:1: ( ( ( rule__RegularityReference__Group_4__0 )? ) )
            // InternalML2.g:5753:1: ( ( rule__RegularityReference__Group_4__0 )? )
            {
            // InternalML2.g:5753:1: ( ( rule__RegularityReference__Group_4__0 )? )
            // InternalML2.g:5754:2: ( rule__RegularityReference__Group_4__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_4()); 
            // InternalML2.g:5755:2: ( rule__RegularityReference__Group_4__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalML2.g:5755:3: rule__RegularityReference__Group_4__0
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
    // InternalML2.g:5763:1: rule__RegularityReference__Group__5 : rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 ;
    public final void rule__RegularityReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5767:1: ( rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 )
            // InternalML2.g:5768:2: rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalML2.g:5775:1: rule__RegularityReference__Group__5__Impl : ( ( rule__RegularityReference___typeAssignment_5 ) ) ;
    public final void rule__RegularityReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5779:1: ( ( ( rule__RegularityReference___typeAssignment_5 ) ) )
            // InternalML2.g:5780:1: ( ( rule__RegularityReference___typeAssignment_5 ) )
            {
            // InternalML2.g:5780:1: ( ( rule__RegularityReference___typeAssignment_5 ) )
            // InternalML2.g:5781:2: ( rule__RegularityReference___typeAssignment_5 )
            {
             before(grammarAccess.getRegularityReferenceAccess().get_typeAssignment_5()); 
            // InternalML2.g:5782:2: ( rule__RegularityReference___typeAssignment_5 )
            // InternalML2.g:5782:3: rule__RegularityReference___typeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference___typeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().get_typeAssignment_5()); 

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
    // InternalML2.g:5790:1: rule__RegularityReference__Group__6 : rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 ;
    public final void rule__RegularityReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5794:1: ( rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 )
            // InternalML2.g:5795:2: rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalML2.g:5802:1: rule__RegularityReference__Group__6__Impl : ( ( rule__RegularityReference__Group_6__0 )? ) ;
    public final void rule__RegularityReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5806:1: ( ( ( rule__RegularityReference__Group_6__0 )? ) )
            // InternalML2.g:5807:1: ( ( rule__RegularityReference__Group_6__0 )? )
            {
            // InternalML2.g:5807:1: ( ( rule__RegularityReference__Group_6__0 )? )
            // InternalML2.g:5808:2: ( rule__RegularityReference__Group_6__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_6()); 
            // InternalML2.g:5809:2: ( rule__RegularityReference__Group_6__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalML2.g:5809:3: rule__RegularityReference__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_6()); 

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
    // InternalML2.g:5817:1: rule__RegularityReference__Group__7 : rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8 ;
    public final void rule__RegularityReference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5821:1: ( rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8 )
            // InternalML2.g:5822:2: rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__RegularityReference__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__8();

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
    // InternalML2.g:5829:1: rule__RegularityReference__Group__7__Impl : ( ( rule__RegularityReference__Group_7__0 )? ) ;
    public final void rule__RegularityReference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5833:1: ( ( ( rule__RegularityReference__Group_7__0 )? ) )
            // InternalML2.g:5834:1: ( ( rule__RegularityReference__Group_7__0 )? )
            {
            // InternalML2.g:5834:1: ( ( rule__RegularityReference__Group_7__0 )? )
            // InternalML2.g:5835:2: ( rule__RegularityReference__Group_7__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_7()); 
            // InternalML2.g:5836:2: ( rule__RegularityReference__Group_7__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==54) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalML2.g:5836:3: rule__RegularityReference__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityReference__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularityReferenceAccess().getGroup_7()); 

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


    // $ANTLR start "rule__RegularityReference__Group__8"
    // InternalML2.g:5844:1: rule__RegularityReference__Group__8 : rule__RegularityReference__Group__8__Impl rule__RegularityReference__Group__9 ;
    public final void rule__RegularityReference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5848:1: ( rule__RegularityReference__Group__8__Impl rule__RegularityReference__Group__9 )
            // InternalML2.g:5849:2: rule__RegularityReference__Group__8__Impl rule__RegularityReference__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__9();

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
    // $ANTLR end "rule__RegularityReference__Group__8"


    // $ANTLR start "rule__RegularityReference__Group__8__Impl"
    // InternalML2.g:5856:1: rule__RegularityReference__Group__8__Impl : ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) ) ;
    public final void rule__RegularityReference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5860:1: ( ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) ) )
            // InternalML2.g:5861:1: ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) )
            {
            // InternalML2.g:5861:1: ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) )
            // InternalML2.g:5862:2: ( rule__RegularityReference__RegularityTypeAssignment_8 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityTypeAssignment_8()); 
            // InternalML2.g:5863:2: ( rule__RegularityReference__RegularityTypeAssignment_8 )
            // InternalML2.g:5863:3: rule__RegularityReference__RegularityTypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__RegularityTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getRegularityTypeAssignment_8()); 

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
    // $ANTLR end "rule__RegularityReference__Group__8__Impl"


    // $ANTLR start "rule__RegularityReference__Group__9"
    // InternalML2.g:5871:1: rule__RegularityReference__Group__9 : rule__RegularityReference__Group__9__Impl ;
    public final void rule__RegularityReference__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5875:1: ( rule__RegularityReference__Group__9__Impl )
            // InternalML2.g:5876:2: rule__RegularityReference__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group__9__Impl();

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
    // $ANTLR end "rule__RegularityReference__Group__9"


    // $ANTLR start "rule__RegularityReference__Group__9__Impl"
    // InternalML2.g:5882:1: rule__RegularityReference__Group__9__Impl : ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) ) ;
    public final void rule__RegularityReference__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5886:1: ( ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) ) )
            // InternalML2.g:5887:1: ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) )
            {
            // InternalML2.g:5887:1: ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) )
            // InternalML2.g:5888:2: ( rule__RegularityReference__RegulatedFeatureAssignment_9 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureAssignment_9()); 
            // InternalML2.g:5889:2: ( rule__RegularityReference__RegulatedFeatureAssignment_9 )
            // InternalML2.g:5889:3: rule__RegularityReference__RegulatedFeatureAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__RegulatedFeatureAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureAssignment_9()); 

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
    // $ANTLR end "rule__RegularityReference__Group__9__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__0"
    // InternalML2.g:5898:1: rule__RegularityReference__Group_4__0 : rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 ;
    public final void rule__RegularityReference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5902:1: ( rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 )
            // InternalML2.g:5903:2: rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalML2.g:5910:1: rule__RegularityReference__Group_4__0__Impl : ( '[' ) ;
    public final void rule__RegularityReference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5914:1: ( ( '[' ) )
            // InternalML2.g:5915:1: ( '[' )
            {
            // InternalML2.g:5915:1: ( '[' )
            // InternalML2.g:5916:2: '['
            {
             before(grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0()); 

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
    // InternalML2.g:5925:1: rule__RegularityReference__Group_4__1 : rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 ;
    public final void rule__RegularityReference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5929:1: ( rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 )
            // InternalML2.g:5930:2: rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalML2.g:5937:1: rule__RegularityReference__Group_4__1__Impl : ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__RegularityReference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5941:1: ( ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) ) )
            // InternalML2.g:5942:1: ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) )
            {
            // InternalML2.g:5942:1: ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) )
            // InternalML2.g:5943:2: ( rule__RegularityReference__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getLowerBoundAssignment_4_1()); 
            // InternalML2.g:5944:2: ( rule__RegularityReference__LowerBoundAssignment_4_1 )
            // InternalML2.g:5944:3: rule__RegularityReference__LowerBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__LowerBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getLowerBoundAssignment_4_1()); 

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
    // InternalML2.g:5952:1: rule__RegularityReference__Group_4__2 : rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3 ;
    public final void rule__RegularityReference__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5956:1: ( rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3 )
            // InternalML2.g:5957:2: rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3
            {
            pushFollow(FOLLOW_29);
            rule__RegularityReference__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__3();

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
    // InternalML2.g:5964:1: rule__RegularityReference__Group_4__2__Impl : ( '..' ) ;
    public final void rule__RegularityReference__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5968:1: ( ( '..' ) )
            // InternalML2.g:5969:1: ( '..' )
            {
            // InternalML2.g:5969:1: ( '..' )
            // InternalML2.g:5970:2: '..'
            {
             before(grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2()); 

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


    // $ANTLR start "rule__RegularityReference__Group_4__3"
    // InternalML2.g:5979:1: rule__RegularityReference__Group_4__3 : rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4 ;
    public final void rule__RegularityReference__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5983:1: ( rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4 )
            // InternalML2.g:5984:2: rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4
            {
            pushFollow(FOLLOW_31);
            rule__RegularityReference__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__4();

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
    // $ANTLR end "rule__RegularityReference__Group_4__3"


    // $ANTLR start "rule__RegularityReference__Group_4__3__Impl"
    // InternalML2.g:5991:1: rule__RegularityReference__Group_4__3__Impl : ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__RegularityReference__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5995:1: ( ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) ) )
            // InternalML2.g:5996:1: ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) )
            {
            // InternalML2.g:5996:1: ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) )
            // InternalML2.g:5997:2: ( rule__RegularityReference__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getUpperBoundAssignment_4_3()); 
            // InternalML2.g:5998:2: ( rule__RegularityReference__UpperBoundAssignment_4_3 )
            // InternalML2.g:5998:3: rule__RegularityReference__UpperBoundAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__UpperBoundAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getUpperBoundAssignment_4_3()); 

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
    // $ANTLR end "rule__RegularityReference__Group_4__3__Impl"


    // $ANTLR start "rule__RegularityReference__Group_4__4"
    // InternalML2.g:6006:1: rule__RegularityReference__Group_4__4 : rule__RegularityReference__Group_4__4__Impl ;
    public final void rule__RegularityReference__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6010:1: ( rule__RegularityReference__Group_4__4__Impl )
            // InternalML2.g:6011:2: rule__RegularityReference__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_4__4__Impl();

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
    // $ANTLR end "rule__RegularityReference__Group_4__4"


    // $ANTLR start "rule__RegularityReference__Group_4__4__Impl"
    // InternalML2.g:6017:1: rule__RegularityReference__Group_4__4__Impl : ( ']' ) ;
    public final void rule__RegularityReference__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6021:1: ( ( ']' ) )
            // InternalML2.g:6022:1: ( ']' )
            {
            // InternalML2.g:6022:1: ( ']' )
            // InternalML2.g:6023:2: ']'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__RegularityReference__Group_4__4__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6__0"
    // InternalML2.g:6033:1: rule__RegularityReference__Group_6__0 : rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1 ;
    public final void rule__RegularityReference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6037:1: ( rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1 )
            // InternalML2.g:6038:2: rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6__1();

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
    // $ANTLR end "rule__RegularityReference__Group_6__0"


    // $ANTLR start "rule__RegularityReference__Group_6__0__Impl"
    // InternalML2.g:6045:1: rule__RegularityReference__Group_6__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityReference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6049:1: ( ( 'subsets' ) )
            // InternalML2.g:6050:1: ( 'subsets' )
            {
            // InternalML2.g:6050:1: ( 'subsets' )
            // InternalML2.g:6051:2: 'subsets'
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0()); 

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
    // $ANTLR end "rule__RegularityReference__Group_6__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6__1"
    // InternalML2.g:6060:1: rule__RegularityReference__Group_6__1 : rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2 ;
    public final void rule__RegularityReference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6064:1: ( rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2 )
            // InternalML2.g:6065:2: rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2
            {
            pushFollow(FOLLOW_19);
            rule__RegularityReference__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6__2();

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
    // $ANTLR end "rule__RegularityReference__Group_6__1"


    // $ANTLR start "rule__RegularityReference__Group_6__1__Impl"
    // InternalML2.g:6072:1: rule__RegularityReference__Group_6__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) ) ;
    public final void rule__RegularityReference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6076:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) ) )
            // InternalML2.g:6077:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) )
            {
            // InternalML2.g:6077:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) )
            // InternalML2.g:6078:2: ( rule__RegularityReference__SubsetOfAssignment_6_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_1()); 
            // InternalML2.g:6079:2: ( rule__RegularityReference__SubsetOfAssignment_6_1 )
            // InternalML2.g:6079:3: rule__RegularityReference__SubsetOfAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__SubsetOfAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_1()); 

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
    // $ANTLR end "rule__RegularityReference__Group_6__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6__2"
    // InternalML2.g:6087:1: rule__RegularityReference__Group_6__2 : rule__RegularityReference__Group_6__2__Impl ;
    public final void rule__RegularityReference__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6091:1: ( rule__RegularityReference__Group_6__2__Impl )
            // InternalML2.g:6092:2: rule__RegularityReference__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6__2__Impl();

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
    // $ANTLR end "rule__RegularityReference__Group_6__2"


    // $ANTLR start "rule__RegularityReference__Group_6__2__Impl"
    // InternalML2.g:6098:1: rule__RegularityReference__Group_6__2__Impl : ( ( rule__RegularityReference__Group_6_2__0 )* ) ;
    public final void rule__RegularityReference__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6102:1: ( ( ( rule__RegularityReference__Group_6_2__0 )* ) )
            // InternalML2.g:6103:1: ( ( rule__RegularityReference__Group_6_2__0 )* )
            {
            // InternalML2.g:6103:1: ( ( rule__RegularityReference__Group_6_2__0 )* )
            // InternalML2.g:6104:2: ( rule__RegularityReference__Group_6_2__0 )*
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_6_2()); 
            // InternalML2.g:6105:2: ( rule__RegularityReference__Group_6_2__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==36) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalML2.g:6105:3: rule__RegularityReference__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityReference__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getRegularityReferenceAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__RegularityReference__Group_6__2__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6_2__0"
    // InternalML2.g:6114:1: rule__RegularityReference__Group_6_2__0 : rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1 ;
    public final void rule__RegularityReference__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6118:1: ( rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1 )
            // InternalML2.g:6119:2: rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6_2__1();

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
    // $ANTLR end "rule__RegularityReference__Group_6_2__0"


    // $ANTLR start "rule__RegularityReference__Group_6_2__0__Impl"
    // InternalML2.g:6126:1: rule__RegularityReference__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityReference__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6130:1: ( ( ',' ) )
            // InternalML2.g:6131:1: ( ',' )
            {
            // InternalML2.g:6131:1: ( ',' )
            // InternalML2.g:6132:2: ','
            {
             before(grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__RegularityReference__Group_6_2__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_6_2__1"
    // InternalML2.g:6141:1: rule__RegularityReference__Group_6_2__1 : rule__RegularityReference__Group_6_2__1__Impl ;
    public final void rule__RegularityReference__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6145:1: ( rule__RegularityReference__Group_6_2__1__Impl )
            // InternalML2.g:6146:2: rule__RegularityReference__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__RegularityReference__Group_6_2__1"


    // $ANTLR start "rule__RegularityReference__Group_6_2__1__Impl"
    // InternalML2.g:6152:1: rule__RegularityReference__Group_6_2__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) ) ;
    public final void rule__RegularityReference__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6156:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) ) )
            // InternalML2.g:6157:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) )
            {
            // InternalML2.g:6157:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) )
            // InternalML2.g:6158:2: ( rule__RegularityReference__SubsetOfAssignment_6_2_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_2_1()); 
            // InternalML2.g:6159:2: ( rule__RegularityReference__SubsetOfAssignment_6_2_1 )
            // InternalML2.g:6159:3: rule__RegularityReference__SubsetOfAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__SubsetOfAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_2_1()); 

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
    // $ANTLR end "rule__RegularityReference__Group_6_2__1__Impl"


    // $ANTLR start "rule__RegularityReference__Group_7__0"
    // InternalML2.g:6168:1: rule__RegularityReference__Group_7__0 : rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1 ;
    public final void rule__RegularityReference__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6172:1: ( rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1 )
            // InternalML2.g:6173:2: rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__RegularityReference__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_7__1();

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
    // $ANTLR end "rule__RegularityReference__Group_7__0"


    // $ANTLR start "rule__RegularityReference__Group_7__0__Impl"
    // InternalML2.g:6180:1: rule__RegularityReference__Group_7__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__RegularityReference__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6184:1: ( ( 'isOppositeTo' ) )
            // InternalML2.g:6185:1: ( 'isOppositeTo' )
            {
            // InternalML2.g:6185:1: ( 'isOppositeTo' )
            // InternalML2.g:6186:2: 'isOppositeTo'
            {
             before(grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0()); 

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
    // $ANTLR end "rule__RegularityReference__Group_7__0__Impl"


    // $ANTLR start "rule__RegularityReference__Group_7__1"
    // InternalML2.g:6195:1: rule__RegularityReference__Group_7__1 : rule__RegularityReference__Group_7__1__Impl ;
    public final void rule__RegularityReference__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6199:1: ( rule__RegularityReference__Group_7__1__Impl )
            // InternalML2.g:6200:2: rule__RegularityReference__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__Group_7__1__Impl();

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
    // $ANTLR end "rule__RegularityReference__Group_7__1"


    // $ANTLR start "rule__RegularityReference__Group_7__1__Impl"
    // InternalML2.g:6206:1: rule__RegularityReference__Group_7__1__Impl : ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) ) ;
    public final void rule__RegularityReference__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6210:1: ( ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) ) )
            // InternalML2.g:6211:1: ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) )
            {
            // InternalML2.g:6211:1: ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) )
            // InternalML2.g:6212:2: ( rule__RegularityReference__OppositeToAssignment_7_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToAssignment_7_1()); 
            // InternalML2.g:6213:2: ( rule__RegularityReference__OppositeToAssignment_7_1 )
            // InternalML2.g:6213:3: rule__RegularityReference__OppositeToAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularityReference__OppositeToAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToAssignment_7_1()); 

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
    // $ANTLR end "rule__RegularityReference__Group_7__1__Impl"


    // $ANTLR start "rule__SingleAttributeAssignment__Group__0"
    // InternalML2.g:6222:1: rule__SingleAttributeAssignment__Group__0 : rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1 ;
    public final void rule__SingleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6226:1: ( rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1 )
            // InternalML2.g:6227:2: rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalML2.g:6234:1: rule__SingleAttributeAssignment__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__SingleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6238:1: ( ( ( 'att' )? ) )
            // InternalML2.g:6239:1: ( ( 'att' )? )
            {
            // InternalML2.g:6239:1: ( ( 'att' )? )
            // InternalML2.g:6240:2: ( 'att' )?
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0()); 
            // InternalML2.g:6241:2: ( 'att' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==48) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalML2.g:6241:3: 'att'
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalML2.g:6249:1: rule__SingleAttributeAssignment__Group__1 : rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2 ;
    public final void rule__SingleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6253:1: ( rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2 )
            // InternalML2.g:6254:2: rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalML2.g:6261:1: rule__SingleAttributeAssignment__Group__1__Impl : ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__SingleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6265:1: ( ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalML2.g:6266:1: ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalML2.g:6266:1: ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) )
            // InternalML2.g:6267:2: ( rule__SingleAttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalML2.g:6268:2: ( rule__SingleAttributeAssignment__AttributeAssignment_1 )
            // InternalML2.g:6268:3: rule__SingleAttributeAssignment__AttributeAssignment_1
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
    // InternalML2.g:6276:1: rule__SingleAttributeAssignment__Group__2 : rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3 ;
    public final void rule__SingleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6280:1: ( rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3 )
            // InternalML2.g:6281:2: rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalML2.g:6288:1: rule__SingleAttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__SingleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6292:1: ( ( '=' ) )
            // InternalML2.g:6293:1: ( '=' )
            {
            // InternalML2.g:6293:1: ( '=' )
            // InternalML2.g:6294:2: '='
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalML2.g:6303:1: rule__SingleAttributeAssignment__Group__3 : rule__SingleAttributeAssignment__Group__3__Impl ;
    public final void rule__SingleAttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6307:1: ( rule__SingleAttributeAssignment__Group__3__Impl )
            // InternalML2.g:6308:2: rule__SingleAttributeAssignment__Group__3__Impl
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
    // InternalML2.g:6314:1: rule__SingleAttributeAssignment__Group__3__Impl : ( ( rule__SingleAttributeAssignment__Alternatives_3 ) ) ;
    public final void rule__SingleAttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6318:1: ( ( ( rule__SingleAttributeAssignment__Alternatives_3 ) ) )
            // InternalML2.g:6319:1: ( ( rule__SingleAttributeAssignment__Alternatives_3 ) )
            {
            // InternalML2.g:6319:1: ( ( rule__SingleAttributeAssignment__Alternatives_3 ) )
            // InternalML2.g:6320:2: ( rule__SingleAttributeAssignment__Alternatives_3 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAlternatives_3()); 
            // InternalML2.g:6321:2: ( rule__SingleAttributeAssignment__Alternatives_3 )
            // InternalML2.g:6321:3: rule__SingleAttributeAssignment__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleAttributeAssignment__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getAlternatives_3()); 

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


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__0"
    // InternalML2.g:6330:1: rule__MultipleAttributeAssignment__Group__0 : rule__MultipleAttributeAssignment__Group__0__Impl rule__MultipleAttributeAssignment__Group__1 ;
    public final void rule__MultipleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6334:1: ( rule__MultipleAttributeAssignment__Group__0__Impl rule__MultipleAttributeAssignment__Group__1 )
            // InternalML2.g:6335:2: rule__MultipleAttributeAssignment__Group__0__Impl rule__MultipleAttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__MultipleAttributeAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group__1();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__0"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__0__Impl"
    // InternalML2.g:6342:1: rule__MultipleAttributeAssignment__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__MultipleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6346:1: ( ( ( 'att' )? ) )
            // InternalML2.g:6347:1: ( ( 'att' )? )
            {
            // InternalML2.g:6347:1: ( ( 'att' )? )
            // InternalML2.g:6348:2: ( 'att' )?
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0()); 
            // InternalML2.g:6349:2: ( 'att' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==48) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalML2.g:6349:3: 'att'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__0__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__1"
    // InternalML2.g:6357:1: rule__MultipleAttributeAssignment__Group__1 : rule__MultipleAttributeAssignment__Group__1__Impl rule__MultipleAttributeAssignment__Group__2 ;
    public final void rule__MultipleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6361:1: ( rule__MultipleAttributeAssignment__Group__1__Impl rule__MultipleAttributeAssignment__Group__2 )
            // InternalML2.g:6362:2: rule__MultipleAttributeAssignment__Group__1__Impl rule__MultipleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__MultipleAttributeAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group__2();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__1"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__1__Impl"
    // InternalML2.g:6369:1: rule__MultipleAttributeAssignment__Group__1__Impl : ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6373:1: ( ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalML2.g:6374:1: ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalML2.g:6374:1: ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) )
            // InternalML2.g:6375:2: ( rule__MultipleAttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalML2.g:6376:2: ( rule__MultipleAttributeAssignment__AttributeAssignment_1 )
            // InternalML2.g:6376:3: rule__MultipleAttributeAssignment__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAssignment_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__1__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__2"
    // InternalML2.g:6384:1: rule__MultipleAttributeAssignment__Group__2 : rule__MultipleAttributeAssignment__Group__2__Impl rule__MultipleAttributeAssignment__Group__3 ;
    public final void rule__MultipleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6388:1: ( rule__MultipleAttributeAssignment__Group__2__Impl rule__MultipleAttributeAssignment__Group__3 )
            // InternalML2.g:6389:2: rule__MultipleAttributeAssignment__Group__2__Impl rule__MultipleAttributeAssignment__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MultipleAttributeAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group__3();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__2"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__2__Impl"
    // InternalML2.g:6396:1: rule__MultipleAttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__MultipleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6400:1: ( ( '=' ) )
            // InternalML2.g:6401:1: ( '=' )
            {
            // InternalML2.g:6401:1: ( '=' )
            // InternalML2.g:6402:2: '='
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMultipleAttributeAssignmentAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__2__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__3"
    // InternalML2.g:6411:1: rule__MultipleAttributeAssignment__Group__3 : rule__MultipleAttributeAssignment__Group__3__Impl rule__MultipleAttributeAssignment__Group__4 ;
    public final void rule__MultipleAttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6415:1: ( rule__MultipleAttributeAssignment__Group__3__Impl rule__MultipleAttributeAssignment__Group__4 )
            // InternalML2.g:6416:2: rule__MultipleAttributeAssignment__Group__3__Impl rule__MultipleAttributeAssignment__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__MultipleAttributeAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group__4();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__3"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__3__Impl"
    // InternalML2.g:6423:1: rule__MultipleAttributeAssignment__Group__3__Impl : ( '{' ) ;
    public final void rule__MultipleAttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6427:1: ( ( '{' ) )
            // InternalML2.g:6428:1: ( '{' )
            {
            // InternalML2.g:6428:1: ( '{' )
            // InternalML2.g:6429:2: '{'
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMultipleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__3__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__4"
    // InternalML2.g:6438:1: rule__MultipleAttributeAssignment__Group__4 : rule__MultipleAttributeAssignment__Group__4__Impl rule__MultipleAttributeAssignment__Group__5 ;
    public final void rule__MultipleAttributeAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6442:1: ( rule__MultipleAttributeAssignment__Group__4__Impl rule__MultipleAttributeAssignment__Group__5 )
            // InternalML2.g:6443:2: rule__MultipleAttributeAssignment__Group__4__Impl rule__MultipleAttributeAssignment__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__MultipleAttributeAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group__5();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__4"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__4__Impl"
    // InternalML2.g:6450:1: rule__MultipleAttributeAssignment__Group__4__Impl : ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? ) ;
    public final void rule__MultipleAttributeAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6454:1: ( ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? ) )
            // InternalML2.g:6455:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? )
            {
            // InternalML2.g:6455:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? )
            // InternalML2.g:6456:2: ( rule__MultipleAttributeAssignment__Alternatives_4 )?
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4()); 
            // InternalML2.g:6457:2: ( rule__MultipleAttributeAssignment__Alternatives_4 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_INT && LA68_0<=RULE_STRING)||(LA68_0>=12 && LA68_0<=13)||LA68_0==49||LA68_0==57) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalML2.g:6457:3: rule__MultipleAttributeAssignment__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__4__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__5"
    // InternalML2.g:6465:1: rule__MultipleAttributeAssignment__Group__5 : rule__MultipleAttributeAssignment__Group__5__Impl ;
    public final void rule__MultipleAttributeAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6469:1: ( rule__MultipleAttributeAssignment__Group__5__Impl )
            // InternalML2.g:6470:2: rule__MultipleAttributeAssignment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group__5__Impl();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__5"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group__5__Impl"
    // InternalML2.g:6476:1: rule__MultipleAttributeAssignment__Group__5__Impl : ( '}' ) ;
    public final void rule__MultipleAttributeAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6480:1: ( ( '}' ) )
            // InternalML2.g:6481:1: ( '}' )
            {
            // InternalML2.g:6481:1: ( '}' )
            // InternalML2.g:6482:2: '}'
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMultipleAttributeAssignmentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group__5__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0__0"
    // InternalML2.g:6492:1: rule__MultipleAttributeAssignment__Group_4_0__0 : rule__MultipleAttributeAssignment__Group_4_0__0__Impl rule__MultipleAttributeAssignment__Group_4_0__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6496:1: ( rule__MultipleAttributeAssignment__Group_4_0__0__Impl rule__MultipleAttributeAssignment__Group_4_0__1 )
            // InternalML2.g:6497:2: rule__MultipleAttributeAssignment__Group_4_0__0__Impl rule__MultipleAttributeAssignment__Group_4_0__1
            {
            pushFollow(FOLLOW_19);
            rule__MultipleAttributeAssignment__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_0__1();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0__0"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0__0__Impl"
    // InternalML2.g:6504:1: rule__MultipleAttributeAssignment__Group_4_0__0__Impl : ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6508:1: ( ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) ) )
            // InternalML2.g:6509:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) )
            {
            // InternalML2.g:6509:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) )
            // InternalML2.g:6510:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_4_0_0()); 
            // InternalML2.g:6511:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 )
            // InternalML2.g:6511:3: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_4_0_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0__0__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0__1"
    // InternalML2.g:6519:1: rule__MultipleAttributeAssignment__Group_4_0__1 : rule__MultipleAttributeAssignment__Group_4_0__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6523:1: ( rule__MultipleAttributeAssignment__Group_4_0__1__Impl )
            // InternalML2.g:6524:2: rule__MultipleAttributeAssignment__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0__1"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0__1__Impl"
    // InternalML2.g:6530:1: rule__MultipleAttributeAssignment__Group_4_0__1__Impl : ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6534:1: ( ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* ) )
            // InternalML2.g:6535:1: ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* )
            {
            // InternalML2.g:6535:1: ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* )
            // InternalML2.g:6536:2: ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )*
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_0_1()); 
            // InternalML2.g:6537:2: ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==36) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalML2.g:6537:3: rule__MultipleAttributeAssignment__Group_4_0_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MultipleAttributeAssignment__Group_4_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_0_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0__1__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0_1__0"
    // InternalML2.g:6546:1: rule__MultipleAttributeAssignment__Group_4_0_1__0 : rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl rule__MultipleAttributeAssignment__Group_4_0_1__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6550:1: ( rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl rule__MultipleAttributeAssignment__Group_4_0_1__1 )
            // InternalML2.g:6551:2: rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl rule__MultipleAttributeAssignment__Group_4_0_1__1
            {
            pushFollow(FOLLOW_37);
            rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_0_1__1();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0_1__0"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl"
    // InternalML2.g:6558:1: rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl : ( ',' ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6562:1: ( ( ',' ) )
            // InternalML2.g:6563:1: ( ',' )
            {
            // InternalML2.g:6563:1: ( ',' )
            // InternalML2.g:6564:2: ','
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_0_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_0_1_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0_1__1"
    // InternalML2.g:6573:1: rule__MultipleAttributeAssignment__Group_4_0_1__1 : rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6577:1: ( rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl )
            // InternalML2.g:6578:2: rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0_1__1"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl"
    // InternalML2.g:6584:1: rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl : ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6588:1: ( ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) ) )
            // InternalML2.g:6589:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) )
            {
            // InternalML2.g:6589:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) )
            // InternalML2.g:6590:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_4_0_1_1()); 
            // InternalML2.g:6591:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 )
            // InternalML2.g:6591:3: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_4_0_1_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1__0"
    // InternalML2.g:6600:1: rule__MultipleAttributeAssignment__Group_4_1__0 : rule__MultipleAttributeAssignment__Group_4_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6604:1: ( rule__MultipleAttributeAssignment__Group_4_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1__1 )
            // InternalML2.g:6605:2: rule__MultipleAttributeAssignment__Group_4_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1__1
            {
            pushFollow(FOLLOW_19);
            rule__MultipleAttributeAssignment__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_1__1();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1__0"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1__0__Impl"
    // InternalML2.g:6612:1: rule__MultipleAttributeAssignment__Group_4_1__0__Impl : ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6616:1: ( ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) ) )
            // InternalML2.g:6617:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) )
            {
            // InternalML2.g:6617:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) )
            // InternalML2.g:6618:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4_1_0()); 
            // InternalML2.g:6619:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 )
            // InternalML2.g:6619:3: rule__MultipleAttributeAssignment__Alternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Alternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4_1_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1__0__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1__1"
    // InternalML2.g:6627:1: rule__MultipleAttributeAssignment__Group_4_1__1 : rule__MultipleAttributeAssignment__Group_4_1__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6631:1: ( rule__MultipleAttributeAssignment__Group_4_1__1__Impl )
            // InternalML2.g:6632:2: rule__MultipleAttributeAssignment__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1__1"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1__1__Impl"
    // InternalML2.g:6638:1: rule__MultipleAttributeAssignment__Group_4_1__1__Impl : ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6642:1: ( ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* ) )
            // InternalML2.g:6643:1: ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* )
            {
            // InternalML2.g:6643:1: ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* )
            // InternalML2.g:6644:2: ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )*
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_1_1()); 
            // InternalML2.g:6645:2: ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==36) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalML2.g:6645:3: rule__MultipleAttributeAssignment__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MultipleAttributeAssignment__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_1_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1__1__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1_1__0"
    // InternalML2.g:6654:1: rule__MultipleAttributeAssignment__Group_4_1_1__0 : rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1_1__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6658:1: ( rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1_1__1 )
            // InternalML2.g:6659:2: rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_1_1__1();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1_1__0"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl"
    // InternalML2.g:6666:1: rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6670:1: ( ( ',' ) )
            // InternalML2.g:6671:1: ( ',' )
            {
            // InternalML2.g:6671:1: ( ',' )
            // InternalML2.g:6672:2: ','
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_1_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1_1__1"
    // InternalML2.g:6681:1: rule__MultipleAttributeAssignment__Group_4_1_1__1 : rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6685:1: ( rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl )
            // InternalML2.g:6686:2: rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl();

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1_1__1"


    // $ANTLR start "rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl"
    // InternalML2.g:6692:1: rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl : ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6696:1: ( ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) ) )
            // InternalML2.g:6697:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) )
            {
            // InternalML2.g:6697:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) )
            // InternalML2.g:6698:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4_1_1_1()); 
            // InternalML2.g:6699:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 )
            // InternalML2.g:6699:3: rule__MultipleAttributeAssignment__Alternatives_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAttributeAssignment__Alternatives_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4_1_1_1()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__ReferenceAssignment__Group__0"
    // InternalML2.g:6708:1: rule__ReferenceAssignment__Group__0 : rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 ;
    public final void rule__ReferenceAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6712:1: ( rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 )
            // InternalML2.g:6713:2: rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1
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
    // InternalML2.g:6720:1: rule__ReferenceAssignment__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6724:1: ( ( 'ref' ) )
            // InternalML2.g:6725:1: ( 'ref' )
            {
            // InternalML2.g:6725:1: ( 'ref' )
            // InternalML2.g:6726:2: 'ref'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalML2.g:6735:1: rule__ReferenceAssignment__Group__1 : rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 ;
    public final void rule__ReferenceAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6739:1: ( rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 )
            // InternalML2.g:6740:2: rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalML2.g:6747:1: rule__ReferenceAssignment__Group__1__Impl : ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6751:1: ( ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) )
            // InternalML2.g:6752:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            {
            // InternalML2.g:6752:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            // InternalML2.g:6753:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 
            // InternalML2.g:6754:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            // InternalML2.g:6754:3: rule__ReferenceAssignment__ReferenceAssignment_1
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
    // InternalML2.g:6762:1: rule__ReferenceAssignment__Group__2 : rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 ;
    public final void rule__ReferenceAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6766:1: ( rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 )
            // InternalML2.g:6767:2: rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalML2.g:6774:1: rule__ReferenceAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__ReferenceAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6778:1: ( ( '=' ) )
            // InternalML2.g:6779:1: ( '=' )
            {
            // InternalML2.g:6779:1: ( '=' )
            // InternalML2.g:6780:2: '='
            {
             before(grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalML2.g:6789:1: rule__ReferenceAssignment__Group__3 : rule__ReferenceAssignment__Group__3__Impl ;
    public final void rule__ReferenceAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6793:1: ( rule__ReferenceAssignment__Group__3__Impl )
            // InternalML2.g:6794:2: rule__ReferenceAssignment__Group__3__Impl
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
    // InternalML2.g:6800:1: rule__ReferenceAssignment__Group__3__Impl : ( ( rule__ReferenceAssignment__Alternatives_3 ) ) ;
    public final void rule__ReferenceAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6804:1: ( ( ( rule__ReferenceAssignment__Alternatives_3 ) ) )
            // InternalML2.g:6805:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            {
            // InternalML2.g:6805:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            // InternalML2.g:6806:2: ( rule__ReferenceAssignment__Alternatives_3 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 
            // InternalML2.g:6807:2: ( rule__ReferenceAssignment__Alternatives_3 )
            // InternalML2.g:6807:3: rule__ReferenceAssignment__Alternatives_3
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
    // InternalML2.g:6816:1: rule__ReferenceAssignment__Group_3_1__0 : rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 ;
    public final void rule__ReferenceAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6820:1: ( rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 )
            // InternalML2.g:6821:2: rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1
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
    // InternalML2.g:6828:1: rule__ReferenceAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6832:1: ( ( '{' ) )
            // InternalML2.g:6833:1: ( '{' )
            {
            // InternalML2.g:6833:1: ( '{' )
            // InternalML2.g:6834:2: '{'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalML2.g:6843:1: rule__ReferenceAssignment__Group_3_1__1 : rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 ;
    public final void rule__ReferenceAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6847:1: ( rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 )
            // InternalML2.g:6848:2: rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalML2.g:6855:1: rule__ReferenceAssignment__Group_3_1__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6859:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalML2.g:6860:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalML2.g:6860:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalML2.g:6861:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalML2.g:6862:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            // InternalML2.g:6862:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1
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
    // InternalML2.g:6870:1: rule__ReferenceAssignment__Group_3_1__2 : rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 ;
    public final void rule__ReferenceAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6874:1: ( rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 )
            // InternalML2.g:6875:2: rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalML2.g:6882:1: rule__ReferenceAssignment__Group_3_1__2__Impl : ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__ReferenceAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6886:1: ( ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) )
            // InternalML2.g:6887:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            {
            // InternalML2.g:6887:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            // InternalML2.g:6888:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 
            // InternalML2.g:6889:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==36) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalML2.g:6889:3: rule__ReferenceAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ReferenceAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalML2.g:6897:1: rule__ReferenceAssignment__Group_3_1__3 : rule__ReferenceAssignment__Group_3_1__3__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6901:1: ( rule__ReferenceAssignment__Group_3_1__3__Impl )
            // InternalML2.g:6902:2: rule__ReferenceAssignment__Group_3_1__3__Impl
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
    // InternalML2.g:6908:1: rule__ReferenceAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6912:1: ( ( '}' ) )
            // InternalML2.g:6913:1: ( '}' )
            {
            // InternalML2.g:6913:1: ( '}' )
            // InternalML2.g:6914:2: '}'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalML2.g:6924:1: rule__ReferenceAssignment__Group_3_1_2__0 : rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6928:1: ( rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 )
            // InternalML2.g:6929:2: rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1
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
    // InternalML2.g:6936:1: rule__ReferenceAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6940:1: ( ( ',' ) )
            // InternalML2.g:6941:1: ( ',' )
            {
            // InternalML2.g:6941:1: ( ',' )
            // InternalML2.g:6942:2: ','
            {
             before(grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:6951:1: rule__ReferenceAssignment__Group_3_1_2__1 : rule__ReferenceAssignment__Group_3_1_2__1__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6955:1: ( rule__ReferenceAssignment__Group_3_1_2__1__Impl )
            // InternalML2.g:6956:2: rule__ReferenceAssignment__Group_3_1_2__1__Impl
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
    // InternalML2.g:6962:1: rule__ReferenceAssignment__Group_3_1_2__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6966:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalML2.g:6967:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalML2.g:6967:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalML2.g:6968:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalML2.g:6969:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalML2.g:6969:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1
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


    // $ANTLR start "rule__NUMBER__Group__0"
    // InternalML2.g:6978:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6982:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalML2.g:6983:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1();

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
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // InternalML2.g:6990:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6994:1: ( ( ( '-' )? ) )
            // InternalML2.g:6995:1: ( ( '-' )? )
            {
            // InternalML2.g:6995:1: ( ( '-' )? )
            // InternalML2.g:6996:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            // InternalML2.g:6997:2: ( '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==57) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalML2.g:6997:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // InternalML2.g:7005:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7009:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalML2.g:7010:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__2();

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
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // InternalML2.g:7017:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7021:1: ( ( RULE_INT ) )
            // InternalML2.g:7022:1: ( RULE_INT )
            {
            // InternalML2.g:7022:1: ( RULE_INT )
            // InternalML2.g:7023:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__2"
    // InternalML2.g:7032:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7036:1: ( rule__NUMBER__Group__2__Impl )
            // InternalML2.g:7037:2: rule__NUMBER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__2__Impl();

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
    // $ANTLR end "rule__NUMBER__Group__2"


    // $ANTLR start "rule__NUMBER__Group__2__Impl"
    // InternalML2.g:7043:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7047:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalML2.g:7048:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalML2.g:7048:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalML2.g:7049:2: ( rule__NUMBER__Group_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            // InternalML2.g:7050:2: ( rule__NUMBER__Group_2__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==31) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalML2.g:7050:3: rule__NUMBER__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NUMBER__Group__2__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__0"
    // InternalML2.g:7059:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7063:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalML2.g:7064:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__NUMBER__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__1();

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
    // $ANTLR end "rule__NUMBER__Group_2__0"


    // $ANTLR start "rule__NUMBER__Group_2__0__Impl"
    // InternalML2.g:7071:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7075:1: ( ( '.' ) )
            // InternalML2.g:7076:1: ( '.' )
            {
            // InternalML2.g:7076:1: ( '.' )
            // InternalML2.g:7077:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__NUMBER__Group_2__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__1"
    // InternalML2.g:7086:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl rule__NUMBER__Group_2__2 ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7090:1: ( rule__NUMBER__Group_2__1__Impl rule__NUMBER__Group_2__2 )
            // InternalML2.g:7091:2: rule__NUMBER__Group_2__1__Impl rule__NUMBER__Group_2__2
            {
            pushFollow(FOLLOW_42);
            rule__NUMBER__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__2();

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
    // $ANTLR end "rule__NUMBER__Group_2__1"


    // $ANTLR start "rule__NUMBER__Group_2__1__Impl"
    // InternalML2.g:7098:1: rule__NUMBER__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7102:1: ( ( RULE_INT ) )
            // InternalML2.g:7103:1: ( RULE_INT )
            {
            // InternalML2.g:7103:1: ( RULE_INT )
            // InternalML2.g:7104:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__NUMBER__Group_2__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_2__2"
    // InternalML2.g:7113:1: rule__NUMBER__Group_2__2 : rule__NUMBER__Group_2__2__Impl ;
    public final void rule__NUMBER__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7117:1: ( rule__NUMBER__Group_2__2__Impl )
            // InternalML2.g:7118:2: rule__NUMBER__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__2__Impl();

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
    // $ANTLR end "rule__NUMBER__Group_2__2"


    // $ANTLR start "rule__NUMBER__Group_2__2__Impl"
    // InternalML2.g:7124:1: rule__NUMBER__Group_2__2__Impl : ( ( rule__NUMBER__Group_2_2__0 )? ) ;
    public final void rule__NUMBER__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7128:1: ( ( ( rule__NUMBER__Group_2_2__0 )? ) )
            // InternalML2.g:7129:1: ( ( rule__NUMBER__Group_2_2__0 )? )
            {
            // InternalML2.g:7129:1: ( ( rule__NUMBER__Group_2_2__0 )? )
            // InternalML2.g:7130:2: ( rule__NUMBER__Group_2_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2_2()); 
            // InternalML2.g:7131:2: ( rule__NUMBER__Group_2_2__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=14 && LA74_0<=15)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalML2.g:7131:3: rule__NUMBER__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__NUMBER__Group_2__2__Impl"


    // $ANTLR start "rule__NUMBER__Group_2_2__0"
    // InternalML2.g:7140:1: rule__NUMBER__Group_2_2__0 : rule__NUMBER__Group_2_2__0__Impl rule__NUMBER__Group_2_2__1 ;
    public final void rule__NUMBER__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7144:1: ( rule__NUMBER__Group_2_2__0__Impl rule__NUMBER__Group_2_2__1 )
            // InternalML2.g:7145:2: rule__NUMBER__Group_2_2__0__Impl rule__NUMBER__Group_2_2__1
            {
            pushFollow(FOLLOW_41);
            rule__NUMBER__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2_2__1();

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
    // $ANTLR end "rule__NUMBER__Group_2_2__0"


    // $ANTLR start "rule__NUMBER__Group_2_2__0__Impl"
    // InternalML2.g:7152:1: rule__NUMBER__Group_2_2__0__Impl : ( ( rule__NUMBER__Alternatives_2_2_0 ) ) ;
    public final void rule__NUMBER__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7156:1: ( ( ( rule__NUMBER__Alternatives_2_2_0 ) ) )
            // InternalML2.g:7157:1: ( ( rule__NUMBER__Alternatives_2_2_0 ) )
            {
            // InternalML2.g:7157:1: ( ( rule__NUMBER__Alternatives_2_2_0 ) )
            // InternalML2.g:7158:2: ( rule__NUMBER__Alternatives_2_2_0 )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives_2_2_0()); 
            // InternalML2.g:7159:2: ( rule__NUMBER__Alternatives_2_2_0 )
            // InternalML2.g:7159:3: rule__NUMBER__Alternatives_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Alternatives_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives_2_2_0()); 

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
    // $ANTLR end "rule__NUMBER__Group_2_2__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_2_2__1"
    // InternalML2.g:7167:1: rule__NUMBER__Group_2_2__1 : rule__NUMBER__Group_2_2__1__Impl rule__NUMBER__Group_2_2__2 ;
    public final void rule__NUMBER__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7171:1: ( rule__NUMBER__Group_2_2__1__Impl rule__NUMBER__Group_2_2__2 )
            // InternalML2.g:7172:2: rule__NUMBER__Group_2_2__1__Impl rule__NUMBER__Group_2_2__2
            {
            pushFollow(FOLLOW_41);
            rule__NUMBER__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2_2__2();

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
    // $ANTLR end "rule__NUMBER__Group_2_2__1"


    // $ANTLR start "rule__NUMBER__Group_2_2__1__Impl"
    // InternalML2.g:7179:1: rule__NUMBER__Group_2_2__1__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7183:1: ( ( ( '-' )? ) )
            // InternalML2.g:7184:1: ( ( '-' )? )
            {
            // InternalML2.g:7184:1: ( ( '-' )? )
            // InternalML2.g:7185:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_2_2_1()); 
            // InternalML2.g:7186:2: ( '-' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==57) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalML2.g:7186:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_2_2_1()); 

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
    // $ANTLR end "rule__NUMBER__Group_2_2__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_2_2__2"
    // InternalML2.g:7194:1: rule__NUMBER__Group_2_2__2 : rule__NUMBER__Group_2_2__2__Impl ;
    public final void rule__NUMBER__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7198:1: ( rule__NUMBER__Group_2_2__2__Impl )
            // InternalML2.g:7199:2: rule__NUMBER__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2_2__2__Impl();

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
    // $ANTLR end "rule__NUMBER__Group_2_2__2"


    // $ANTLR start "rule__NUMBER__Group_2_2__2__Impl"
    // InternalML2.g:7205:1: rule__NUMBER__Group_2_2__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7209:1: ( ( RULE_INT ) )
            // InternalML2.g:7210:1: ( RULE_INT )
            {
            // InternalML2.g:7210:1: ( RULE_INT )
            // InternalML2.g:7211:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_2_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_2_2()); 

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
    // $ANTLR end "rule__NUMBER__Group_2_2__2__Impl"


    // $ANTLR start "rule__UnnamedIndividual__Group__0"
    // InternalML2.g:7221:1: rule__UnnamedIndividual__Group__0 : rule__UnnamedIndividual__Group__0__Impl rule__UnnamedIndividual__Group__1 ;
    public final void rule__UnnamedIndividual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7225:1: ( rule__UnnamedIndividual__Group__0__Impl rule__UnnamedIndividual__Group__1 )
            // InternalML2.g:7226:2: rule__UnnamedIndividual__Group__0__Impl rule__UnnamedIndividual__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__UnnamedIndividual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedIndividual__Group__1();

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
    // $ANTLR end "rule__UnnamedIndividual__Group__0"


    // $ANTLR start "rule__UnnamedIndividual__Group__0__Impl"
    // InternalML2.g:7233:1: rule__UnnamedIndividual__Group__0__Impl : ( () ) ;
    public final void rule__UnnamedIndividual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7237:1: ( ( () ) )
            // InternalML2.g:7238:1: ( () )
            {
            // InternalML2.g:7238:1: ( () )
            // InternalML2.g:7239:2: ()
            {
             before(grammarAccess.getUnnamedIndividualAccess().getIndividualAction_0()); 
            // InternalML2.g:7240:2: ()
            // InternalML2.g:7240:3: 
            {
            }

             after(grammarAccess.getUnnamedIndividualAccess().getIndividualAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedIndividual__Group__0__Impl"


    // $ANTLR start "rule__UnnamedIndividual__Group__1"
    // InternalML2.g:7248:1: rule__UnnamedIndividual__Group__1 : rule__UnnamedIndividual__Group__1__Impl rule__UnnamedIndividual__Group__2 ;
    public final void rule__UnnamedIndividual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7252:1: ( rule__UnnamedIndividual__Group__1__Impl rule__UnnamedIndividual__Group__2 )
            // InternalML2.g:7253:2: rule__UnnamedIndividual__Group__1__Impl rule__UnnamedIndividual__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__UnnamedIndividual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedIndividual__Group__2();

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
    // $ANTLR end "rule__UnnamedIndividual__Group__1"


    // $ANTLR start "rule__UnnamedIndividual__Group__1__Impl"
    // InternalML2.g:7260:1: rule__UnnamedIndividual__Group__1__Impl : ( '[' ) ;
    public final void rule__UnnamedIndividual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7264:1: ( ( '[' ) )
            // InternalML2.g:7265:1: ( '[' )
            {
            // InternalML2.g:7265:1: ( '[' )
            // InternalML2.g:7266:2: '['
            {
             before(grammarAccess.getUnnamedIndividualAccess().getLeftSquareBracketKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getUnnamedIndividualAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__UnnamedIndividual__Group__1__Impl"


    // $ANTLR start "rule__UnnamedIndividual__Group__2"
    // InternalML2.g:7275:1: rule__UnnamedIndividual__Group__2 : rule__UnnamedIndividual__Group__2__Impl rule__UnnamedIndividual__Group__3 ;
    public final void rule__UnnamedIndividual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7279:1: ( rule__UnnamedIndividual__Group__2__Impl rule__UnnamedIndividual__Group__3 )
            // InternalML2.g:7280:2: rule__UnnamedIndividual__Group__2__Impl rule__UnnamedIndividual__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__UnnamedIndividual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnnamedIndividual__Group__3();

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
    // $ANTLR end "rule__UnnamedIndividual__Group__2"


    // $ANTLR start "rule__UnnamedIndividual__Group__2__Impl"
    // InternalML2.g:7287:1: rule__UnnamedIndividual__Group__2__Impl : ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* ) ;
    public final void rule__UnnamedIndividual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7291:1: ( ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* ) )
            // InternalML2.g:7292:1: ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* )
            {
            // InternalML2.g:7292:1: ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* )
            // InternalML2.g:7293:2: ( rule__UnnamedIndividual__AssignmentsAssignment_2 )*
            {
             before(grammarAccess.getUnnamedIndividualAccess().getAssignmentsAssignment_2()); 
            // InternalML2.g:7294:2: ( rule__UnnamedIndividual__AssignmentsAssignment_2 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalML2.g:7294:3: rule__UnnamedIndividual__AssignmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__UnnamedIndividual__AssignmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

             after(grammarAccess.getUnnamedIndividualAccess().getAssignmentsAssignment_2()); 

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
    // $ANTLR end "rule__UnnamedIndividual__Group__2__Impl"


    // $ANTLR start "rule__UnnamedIndividual__Group__3"
    // InternalML2.g:7302:1: rule__UnnamedIndividual__Group__3 : rule__UnnamedIndividual__Group__3__Impl ;
    public final void rule__UnnamedIndividual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7306:1: ( rule__UnnamedIndividual__Group__3__Impl )
            // InternalML2.g:7307:2: rule__UnnamedIndividual__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedIndividual__Group__3__Impl();

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
    // $ANTLR end "rule__UnnamedIndividual__Group__3"


    // $ANTLR start "rule__UnnamedIndividual__Group__3__Impl"
    // InternalML2.g:7313:1: rule__UnnamedIndividual__Group__3__Impl : ( ']' ) ;
    public final void rule__UnnamedIndividual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7317:1: ( ( ']' ) )
            // InternalML2.g:7318:1: ( ']' )
            {
            // InternalML2.g:7318:1: ( ']' )
            // InternalML2.g:7319:2: ']'
            {
             before(grammarAccess.getUnnamedIndividualAccess().getRightSquareBracketKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getUnnamedIndividualAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__UnnamedIndividual__Group__3__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__0"
    // InternalML2.g:7329:1: rule__SimpleAttributeAssignment__Group__0 : rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 ;
    public final void rule__SimpleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7333:1: ( rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 )
            // InternalML2.g:7334:2: rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__SimpleAttributeAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__1();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__0__Impl"
    // InternalML2.g:7341:1: rule__SimpleAttributeAssignment__Group__0__Impl : ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7345:1: ( ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) )
            // InternalML2.g:7346:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            {
            // InternalML2.g:7346:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            // InternalML2.g:7347:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAssignment_0()); 
            // InternalML2.g:7348:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            // InternalML2.g:7348:3: rule__SimpleAttributeAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__1"
    // InternalML2.g:7356:1: rule__SimpleAttributeAssignment__Group__1 : rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 ;
    public final void rule__SimpleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7360:1: ( rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 )
            // InternalML2.g:7361:2: rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__SimpleAttributeAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__2();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__1__Impl"
    // InternalML2.g:7368:1: rule__SimpleAttributeAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7372:1: ( ( '=' ) )
            // InternalML2.g:7373:1: ( '=' )
            {
            // InternalML2.g:7373:1: ( '=' )
            // InternalML2.g:7374:2: '='
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__2"
    // InternalML2.g:7383:1: rule__SimpleAttributeAssignment__Group__2 : rule__SimpleAttributeAssignment__Group__2__Impl ;
    public final void rule__SimpleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7387:1: ( rule__SimpleAttributeAssignment__Group__2__Impl )
            // InternalML2.g:7388:2: rule__SimpleAttributeAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__2"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group__2__Impl"
    // InternalML2.g:7394:1: rule__SimpleAttributeAssignment__Group__2__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7398:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) )
            // InternalML2.g:7399:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            {
            // InternalML2.g:7399:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            // InternalML2.g:7400:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2()); 
            // InternalML2.g:7401:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            // InternalML2.g:7401:3: rule__SimpleAttributeAssignment__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group__2__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3__0"
    // InternalML2.g:7410:1: rule__SimpleAttributeAssignment__Group_2_3__0 : rule__SimpleAttributeAssignment__Group_2_3__0__Impl rule__SimpleAttributeAssignment__Group_2_3__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7414:1: ( rule__SimpleAttributeAssignment__Group_2_3__0__Impl rule__SimpleAttributeAssignment__Group_2_3__1 )
            // InternalML2.g:7415:2: rule__SimpleAttributeAssignment__Group_2_3__0__Impl rule__SimpleAttributeAssignment__Group_2_3__1
            {
            pushFollow(FOLLOW_38);
            rule__SimpleAttributeAssignment__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3__1();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3__0__Impl"
    // InternalML2.g:7422:1: rule__SimpleAttributeAssignment__Group_2_3__0__Impl : ( '{' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7426:1: ( ( '{' ) )
            // InternalML2.g:7427:1: ( '{' )
            {
            // InternalML2.g:7427:1: ( '{' )
            // InternalML2.g:7428:2: '{'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_3_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3__1"
    // InternalML2.g:7437:1: rule__SimpleAttributeAssignment__Group_2_3__1 : rule__SimpleAttributeAssignment__Group_2_3__1__Impl rule__SimpleAttributeAssignment__Group_2_3__2 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7441:1: ( rule__SimpleAttributeAssignment__Group_2_3__1__Impl rule__SimpleAttributeAssignment__Group_2_3__2 )
            // InternalML2.g:7442:2: rule__SimpleAttributeAssignment__Group_2_3__1__Impl rule__SimpleAttributeAssignment__Group_2_3__2
            {
            pushFollow(FOLLOW_38);
            rule__SimpleAttributeAssignment__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3__2();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3__1__Impl"
    // InternalML2.g:7449:1: rule__SimpleAttributeAssignment__Group_2_3__1__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7453:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? ) )
            // InternalML2.g:7454:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? )
            {
            // InternalML2.g:7454:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? )
            // InternalML2.g:7455:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )?
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1()); 
            // InternalML2.g:7456:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_STRING)||(LA77_0>=12 && LA77_0<=13)||LA77_0==49||LA77_0==57) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalML2.g:7456:3: rule__SimpleAttributeAssignment__Alternatives_2_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__Alternatives_2_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3__2"
    // InternalML2.g:7464:1: rule__SimpleAttributeAssignment__Group_2_3__2 : rule__SimpleAttributeAssignment__Group_2_3__2__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7468:1: ( rule__SimpleAttributeAssignment__Group_2_3__2__Impl )
            // InternalML2.g:7469:2: rule__SimpleAttributeAssignment__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3__2__Impl();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3__2"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3__2__Impl"
    // InternalML2.g:7475:1: rule__SimpleAttributeAssignment__Group_2_3__2__Impl : ( '}' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7479:1: ( ( '}' ) )
            // InternalML2.g:7480:1: ( '}' )
            {
            // InternalML2.g:7480:1: ( '}' )
            // InternalML2.g:7481:2: '}'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_3_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_3_2()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3__2__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0__0"
    // InternalML2.g:7491:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__0 : rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7495:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0__1 )
            // InternalML2.g:7496:2: rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_0__1();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl"
    // InternalML2.g:7503:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl : ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7507:1: ( ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) ) )
            // InternalML2.g:7508:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) )
            {
            // InternalML2.g:7508:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) )
            // InternalML2.g:7509:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_3_1_0_0()); 
            // InternalML2.g:7510:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 )
            // InternalML2.g:7510:3: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_3_1_0_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0__1"
    // InternalML2.g:7518:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__1 : rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7522:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl )
            // InternalML2.g:7523:2: rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl"
    // InternalML2.g:7529:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl : ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7533:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* ) )
            // InternalML2.g:7534:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* )
            {
            // InternalML2.g:7534:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* )
            // InternalML2.g:7535:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )*
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_0_1()); 
            // InternalML2.g:7536:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==36) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalML2.g:7536:3: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_0_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0"
    // InternalML2.g:7545:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 : rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7549:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1 )
            // InternalML2.g:7550:2: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1
            {
            pushFollow(FOLLOW_37);
            rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl"
    // InternalML2.g:7557:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7561:1: ( ( ',' ) )
            // InternalML2.g:7562:1: ( ',' )
            {
            // InternalML2.g:7562:1: ( ',' )
            // InternalML2.g:7563:2: ','
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_0_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_0_1_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1"
    // InternalML2.g:7572:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1 : rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7576:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl )
            // InternalML2.g:7577:2: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl"
    // InternalML2.g:7583:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl : ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7587:1: ( ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) ) )
            // InternalML2.g:7588:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) )
            {
            // InternalML2.g:7588:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) )
            // InternalML2.g:7589:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_3_1_0_1_1()); 
            // InternalML2.g:7590:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 )
            // InternalML2.g:7590:3: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_3_1_0_1_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1__0"
    // InternalML2.g:7599:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__0 : rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7603:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1__1 )
            // InternalML2.g:7604:2: rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1__1
            {
            pushFollow(FOLLOW_19);
            rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_1__1();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl"
    // InternalML2.g:7611:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7615:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) ) )
            // InternalML2.g:7616:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) )
            {
            // InternalML2.g:7616:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) )
            // InternalML2.g:7617:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1_1_0()); 
            // InternalML2.g:7618:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 )
            // InternalML2.g:7618:3: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1_1_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1__1"
    // InternalML2.g:7626:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__1 : rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7630:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl )
            // InternalML2.g:7631:2: rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl"
    // InternalML2.g:7637:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl : ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7641:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* ) )
            // InternalML2.g:7642:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* )
            {
            // InternalML2.g:7642:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* )
            // InternalML2.g:7643:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )*
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_1_1()); 
            // InternalML2.g:7644:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==36) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalML2.g:7644:3: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_1_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0"
    // InternalML2.g:7653:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 : rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7657:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1 )
            // InternalML2.g:7658:2: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1
            {
            pushFollow(FOLLOW_27);
            rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl"
    // InternalML2.g:7665:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7669:1: ( ( ',' ) )
            // InternalML2.g:7670:1: ( ',' )
            {
            // InternalML2.g:7670:1: ( ',' )
            // InternalML2.g:7671:2: ','
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_1_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_1_1_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1"
    // InternalML2.g:7680:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1 : rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7684:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl )
            // InternalML2.g:7685:2: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl();

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1"


    // $ANTLR start "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl"
    // InternalML2.g:7691:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7695:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) ) )
            // InternalML2.g:7696:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) )
            {
            // InternalML2.g:7696:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) )
            // InternalML2.g:7697:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1_1_1_1()); 
            // InternalML2.g:7698:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 )
            // InternalML2.g:7698:3: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1_1_1_1()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0"
    // InternalML2.g:7707:1: rule__GeneralizationSet__UnorderedGroup_0 : ( rule__GeneralizationSet__UnorderedGroup_0__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
        	
        try {
            // InternalML2.g:7712:1: ( ( rule__GeneralizationSet__UnorderedGroup_0__0 )? )
            // InternalML2.g:7713:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            {
            // InternalML2.g:7713:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( LA80_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt80=1;
            }
            else if ( LA80_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalML2.g:7713:2: rule__GeneralizationSet__UnorderedGroup_0__0
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
    // InternalML2.g:7721:1: rule__GeneralizationSet__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalML2.g:7726:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) )
            // InternalML2.g:7727:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            {
            // InternalML2.g:7727:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( LA81_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt81=1;
            }
            else if ( LA81_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalML2.g:7728:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    {
                    // InternalML2.g:7728:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    // InternalML2.g:7729:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalML2.g:7729:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    // InternalML2.g:7730:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalML2.g:7736:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalML2.g:7737:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalML2.g:7738:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalML2.g:7738:7: rule__GeneralizationSet__IsDisjointAssignment_0_0
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
                    // InternalML2.g:7743:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    {
                    // InternalML2.g:7743:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    // InternalML2.g:7744:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalML2.g:7744:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    // InternalML2.g:7745:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalML2.g:7751:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalML2.g:7752:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalML2.g:7753:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalML2.g:7753:7: rule__GeneralizationSet__IsCompleteAssignment_0_1
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
    // InternalML2.g:7766:1: rule__GeneralizationSet__UnorderedGroup_0__0 : rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7770:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? )
            // InternalML2.g:7771:2: rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_47);
            rule__GeneralizationSet__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalML2.g:7772:2: ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( LA82_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt82=1;
            }
            else if ( LA82_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalML2.g:7772:2: rule__GeneralizationSet__UnorderedGroup_0__1
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
    // InternalML2.g:7778:1: rule__GeneralizationSet__UnorderedGroup_0__1 : rule__GeneralizationSet__UnorderedGroup_0__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7782:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl )
            // InternalML2.g:7783:2: rule__GeneralizationSet__UnorderedGroup_0__Impl
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


    // $ANTLR start "rule__ML2Model__NameAssignment_1"
    // InternalML2.g:7790:1: rule__ML2Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ML2Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7794:1: ( ( ruleQualifiedName ) )
            // InternalML2.g:7795:2: ( ruleQualifiedName )
            {
            // InternalML2.g:7795:2: ( ruleQualifiedName )
            // InternalML2.g:7796:3: ruleQualifiedName
            {
             before(grammarAccess.getML2ModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getML2ModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ML2Model__NameAssignment_1"


    // $ANTLR start "rule__ML2Model__IncludesAssignment_3_0_1"
    // InternalML2.g:7805:1: rule__ML2Model__IncludesAssignment_3_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ML2Model__IncludesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7809:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7810:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7810:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7811:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getML2ModelAccess().getIncludesML2ModelCrossReference_3_0_1_0()); 
            // InternalML2.g:7812:3: ( ruleQualifiedName )
            // InternalML2.g:7813:4: ruleQualifiedName
            {
             before(grammarAccess.getML2ModelAccess().getIncludesML2ModelQualifiedNameParserRuleCall_3_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getML2ModelAccess().getIncludesML2ModelQualifiedNameParserRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getML2ModelAccess().getIncludesML2ModelCrossReference_3_0_1_0()); 

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
    // $ANTLR end "rule__ML2Model__IncludesAssignment_3_0_1"


    // $ANTLR start "rule__ML2Model__ElementsAssignment_3_1"
    // InternalML2.g:7824:1: rule__ML2Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__ML2Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7828:1: ( ( ruleModelElement ) )
            // InternalML2.g:7829:2: ( ruleModelElement )
            {
            // InternalML2.g:7829:2: ( ruleModelElement )
            // InternalML2.g:7830:3: ruleModelElement
            {
             before(grammarAccess.getML2ModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getML2ModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ML2Model__ElementsAssignment_3_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalML2.g:7839:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7843:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalML2.g:7844:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalML2.g:7844:2: ( ruleQualifiedNameWithWildcard )
            // InternalML2.g:7845:3: ruleQualifiedNameWithWildcard
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
    // InternalML2.g:7854:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7858:1: ( ( RULE_ID ) )
            // InternalML2.g:7859:2: ( RULE_ID )
            {
            // InternalML2.g:7859:2: ( RULE_ID )
            // InternalML2.g:7860:3: RULE_ID
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


    // $ANTLR start "rule__Individual__InstantiatedClassesAssignment_3"
    // InternalML2.g:7869:1: rule__Individual__InstantiatedClassesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7873:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7874:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7874:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7875:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_3_0()); 
            // InternalML2.g:7876:3: ( ruleQualifiedName )
            // InternalML2.g:7877:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_3_0()); 

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
    // $ANTLR end "rule__Individual__InstantiatedClassesAssignment_3"


    // $ANTLR start "rule__Individual__InstantiatedClassesAssignment_4_1"
    // InternalML2.g:7888:1: rule__Individual__InstantiatedClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7892:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7893:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7893:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7894:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_4_1_0()); 
            // InternalML2.g:7895:3: ( ruleQualifiedName )
            // InternalML2.g:7896:4: ruleQualifiedName
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Individual__InstantiatedClassesAssignment_4_1"


    // $ANTLR start "rule__Individual__AssignmentsAssignment_5_1"
    // InternalML2.g:7907:1: rule__Individual__AssignmentsAssignment_5_1 : ( ruleFeatureAssignment ) ;
    public final void rule__Individual__AssignmentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7911:1: ( ( ruleFeatureAssignment ) )
            // InternalML2.g:7912:2: ( ruleFeatureAssignment )
            {
            // InternalML2.g:7912:2: ( ruleFeatureAssignment )
            // InternalML2.g:7913:3: ruleFeatureAssignment
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


    // $ANTLR start "rule__ML2Class__AssignmentsAssignment_1_1_0"
    // InternalML2.g:7922:1: rule__ML2Class__AssignmentsAssignment_1_1_0 : ( ruleFeatureAssignment ) ;
    public final void rule__ML2Class__AssignmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7926:1: ( ( ruleFeatureAssignment ) )
            // InternalML2.g:7927:2: ( ruleFeatureAssignment )
            {
            // InternalML2.g:7927:2: ( ruleFeatureAssignment )
            // InternalML2.g:7928:3: ruleFeatureAssignment
            {
             before(grammarAccess.getML2ClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureAssignment();

            state._fsp--;

             after(grammarAccess.getML2ClassAccess().getAssignmentsFeatureAssignmentParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__ML2Class__AssignmentsAssignment_1_1_0"


    // $ANTLR start "rule__ML2Class__FeaturesAssignment_1_1_1"
    // InternalML2.g:7937:1: rule__ML2Class__FeaturesAssignment_1_1_1 : ( ruleFeature ) ;
    public final void rule__ML2Class__FeaturesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7941:1: ( ( ruleFeature ) )
            // InternalML2.g:7942:2: ( ruleFeature )
            {
            // InternalML2.g:7942:2: ( ruleFeature )
            // InternalML2.g:7943:3: ruleFeature
            {
             before(grammarAccess.getML2ClassAccess().getFeaturesFeatureParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getML2ClassAccess().getFeaturesFeatureParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__ML2Class__FeaturesAssignment_1_1_1"


    // $ANTLR start "rule__SomeFOClass__InstantiatedClassesAssignment_1_1"
    // InternalML2.g:7952:1: rule__SomeFOClass__InstantiatedClassesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__InstantiatedClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7956:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7957:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7957:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7958:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0()); 
            // InternalML2.g:7959:3: ( ruleQualifiedName )
            // InternalML2.g:7960:4: ruleQualifiedName
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__SomeFOClass__InstantiatedClassesAssignment_1_1"


    // $ANTLR start "rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1"
    // InternalML2.g:7971:1: rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7975:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7976:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7976:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7977:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0()); 
            // InternalML2.g:7978:3: ( ruleQualifiedName )
            // InternalML2.g:7979:4: ruleQualifiedName
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0()); 

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
    // $ANTLR end "rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1"


    // $ANTLR start "rule__SomeFOClass__SuperClassesAssignment_2_1"
    // InternalML2.g:7990:1: rule__SomeFOClass__SuperClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__SuperClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7994:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7995:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7995:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7996:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0()); 
            // InternalML2.g:7997:3: ( ruleQualifiedName )
            // InternalML2.g:7998:4: ruleQualifiedName
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__SomeFOClass__SuperClassesAssignment_2_1"


    // $ANTLR start "rule__SomeFOClass__SuperClassesAssignment_2_2_1"
    // InternalML2.g:8009:1: rule__SomeFOClass__SuperClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__SuperClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8013:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8014:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8014:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8015:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0()); 
            // InternalML2.g:8016:3: ( ruleQualifiedName )
            // InternalML2.g:8017:4: ruleQualifiedName
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__SomeFOClass__SuperClassesAssignment_2_2_1"


    // $ANTLR start "rule__NonFOClass__InstantiatedClassesAssignment_1_1"
    // InternalML2.g:8028:1: rule__NonFOClass__InstantiatedClassesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__InstantiatedClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8032:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8033:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8033:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8034:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0()); 
            // InternalML2.g:8035:3: ( ruleQualifiedName )
            // InternalML2.g:8036:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__InstantiatedClassesAssignment_1_1"


    // $ANTLR start "rule__NonFOClass__InstantiatedClassesAssignment_1_2_1"
    // InternalML2.g:8047:1: rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__InstantiatedClassesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8051:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8052:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8052:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8053:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0()); 
            // InternalML2.g:8054:3: ( ruleQualifiedName )
            // InternalML2.g:8055:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassQualifiedNameParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__InstantiatedClassesAssignment_1_2_1"


    // $ANTLR start "rule__NonFOClass__SuperClassesAssignment_2_1"
    // InternalML2.g:8066:1: rule__NonFOClass__SuperClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SuperClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8070:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8071:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8071:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8072:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0()); 
            // InternalML2.g:8073:3: ( ruleQualifiedName )
            // InternalML2.g:8074:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__SuperClassesAssignment_2_1"


    // $ANTLR start "rule__NonFOClass__SuperClassesAssignment_2_2_1"
    // InternalML2.g:8085:1: rule__NonFOClass__SuperClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SuperClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8089:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8090:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8090:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8091:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0()); 
            // InternalML2.g:8092:3: ( ruleQualifiedName )
            // InternalML2.g:8093:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__SuperClassesAssignment_2_2_1"


    // $ANTLR start "rule__NonFOClass__SubordinatorsAssignment_3_1"
    // InternalML2.g:8104:1: rule__NonFOClass__SubordinatorsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SubordinatorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8108:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8109:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8109:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8110:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_1_0()); 
            // InternalML2.g:8111:3: ( ruleQualifiedName )
            // InternalML2.g:8112:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__SubordinatorsAssignment_3_1"


    // $ANTLR start "rule__NonFOClass__SubordinatorsAssignment_3_2_1"
    // InternalML2.g:8123:1: rule__NonFOClass__SubordinatorsAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SubordinatorsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8127:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8128:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8128:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8129:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_2_1_0()); 
            // InternalML2.g:8130:3: ( ruleQualifiedName )
            // InternalML2.g:8131:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_2_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__SubordinatorsAssignment_3_2_1"


    // $ANTLR start "rule__NonFOClass__CategorizationTypeAssignment_4_0_0"
    // InternalML2.g:8142:1: rule__NonFOClass__CategorizationTypeAssignment_4_0_0 : ( ruleCategorizationType ) ;
    public final void rule__NonFOClass__CategorizationTypeAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8146:1: ( ( ruleCategorizationType ) )
            // InternalML2.g:8147:2: ( ruleCategorizationType )
            {
            // InternalML2.g:8147:2: ( ruleCategorizationType )
            // InternalML2.g:8148:3: ruleCategorizationType
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategorizationType();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getCategorizationTypeCategorizationTypeEnumRuleCall_4_0_0_0()); 

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
    // $ANTLR end "rule__NonFOClass__CategorizationTypeAssignment_4_0_0"


    // $ANTLR start "rule__NonFOClass__CategorizedClassAssignment_4_0_1"
    // InternalML2.g:8157:1: rule__NonFOClass__CategorizedClassAssignment_4_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__CategorizedClassAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8161:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8162:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8162:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8163:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizedClassML2ClassCrossReference_4_0_1_0()); 
            // InternalML2.g:8164:3: ( ruleQualifiedName )
            // InternalML2.g:8165:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizedClassML2ClassQualifiedNameParserRuleCall_4_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getCategorizedClassML2ClassQualifiedNameParserRuleCall_4_0_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getCategorizedClassML2ClassCrossReference_4_0_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__CategorizedClassAssignment_4_0_1"


    // $ANTLR start "rule__NonFOClass__PowertypeOfAssignment_4_1_1"
    // InternalML2.g:8176:1: rule__NonFOClass__PowertypeOfAssignment_4_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__PowertypeOfAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8180:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8181:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8181:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8182:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getPowertypeOfML2ClassCrossReference_4_1_1_0()); 
            // InternalML2.g:8183:3: ( ruleQualifiedName )
            // InternalML2.g:8184:4: ruleQualifiedName
            {
             before(grammarAccess.getNonFOClassAccess().getPowertypeOfML2ClassQualifiedNameParserRuleCall_4_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNonFOClassAccess().getPowertypeOfML2ClassQualifiedNameParserRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getNonFOClassAccess().getPowertypeOfML2ClassCrossReference_4_1_1_0()); 

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
    // $ANTLR end "rule__NonFOClass__PowertypeOfAssignment_4_1_1"


    // $ANTLR start "rule__FOClass__NameAssignment_1"
    // InternalML2.g:8195:1: rule__FOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8199:1: ( ( RULE_ID ) )
            // InternalML2.g:8200:2: ( RULE_ID )
            {
            // InternalML2.g:8200:2: ( RULE_ID )
            // InternalML2.g:8201:3: RULE_ID
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
    // InternalML2.g:8210:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8214:1: ( ( RULE_ID ) )
            // InternalML2.g:8215:2: ( RULE_ID )
            {
            // InternalML2.g:8215:2: ( RULE_ID )
            // InternalML2.g:8216:3: RULE_ID
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
    // InternalML2.g:8225:1: rule__HOClass__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8229:1: ( ( RULE_INT ) )
            // InternalML2.g:8230:2: ( RULE_INT )
            {
            // InternalML2.g:8230:2: ( RULE_INT )
            // InternalML2.g:8231:3: RULE_INT
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
    // InternalML2.g:8240:1: rule__HOClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8244:1: ( ( RULE_ID ) )
            // InternalML2.g:8245:2: ( RULE_ID )
            {
            // InternalML2.g:8245:2: ( RULE_ID )
            // InternalML2.g:8246:3: RULE_ID
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
    // InternalML2.g:8255:1: rule__OrderlessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OrderlessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8259:1: ( ( RULE_ID ) )
            // InternalML2.g:8260:2: ( RULE_ID )
            {
            // InternalML2.g:8260:2: ( RULE_ID )
            // InternalML2.g:8261:3: RULE_ID
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
    // InternalML2.g:8270:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8274:1: ( ( ( 'disjoint' ) ) )
            // InternalML2.g:8275:2: ( ( 'disjoint' ) )
            {
            // InternalML2.g:8275:2: ( ( 'disjoint' ) )
            // InternalML2.g:8276:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalML2.g:8277:3: ( 'disjoint' )
            // InternalML2.g:8278:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalML2.g:8289:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8293:1: ( ( ( 'complete' ) ) )
            // InternalML2.g:8294:2: ( ( 'complete' ) )
            {
            // InternalML2.g:8294:2: ( ( 'complete' ) )
            // InternalML2.g:8295:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalML2.g:8296:3: ( 'complete' )
            // InternalML2.g:8297:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalML2.g:8308:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8312:1: ( ( RULE_ID ) )
            // InternalML2.g:8313:2: ( RULE_ID )
            {
            // InternalML2.g:8313:2: ( RULE_ID )
            // InternalML2.g:8314:3: RULE_ID
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
    // InternalML2.g:8323:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8327:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8328:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8328:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8329:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralML2ClassCrossReference_4_0()); 
            // InternalML2.g:8330:3: ( ruleQualifiedName )
            // InternalML2.g:8331:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralML2ClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralML2ClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralML2ClassCrossReference_4_0()); 

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
    // InternalML2.g:8342:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8346:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8347:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8347:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8348:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerML2ClassCrossReference_5_1_0()); 
            // InternalML2.g:8349:3: ( ruleQualifiedName )
            // InternalML2.g:8350:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerML2ClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerML2ClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getCategorizerML2ClassCrossReference_5_1_0()); 

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
    // InternalML2.g:8361:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8365:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8366:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8366:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8367:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_7_0()); 
            // InternalML2.g:8368:3: ( ruleQualifiedName )
            // InternalML2.g:8369:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassQualifiedNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassQualifiedNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_7_0()); 

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
    // InternalML2.g:8380:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8384:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8385:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8385:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8386:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_8_1_0()); 
            // InternalML2.g:8387:3: ( ruleQualifiedName )
            // InternalML2.g:8388:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassQualifiedNameParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_8_1_0()); 

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
    // InternalML2.g:8399:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8403:1: ( ( RULE_ID ) )
            // InternalML2.g:8404:2: ( RULE_ID )
            {
            // InternalML2.g:8404:2: ( RULE_ID )
            // InternalML2.g:8405:3: RULE_ID
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


    // $ANTLR start "rule__Attribute__LowerBoundAssignment_3_1"
    // InternalML2.g:8414:1: rule__Attribute__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8418:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8419:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8419:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8420:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Attribute__LowerBoundAssignment_3_1"


    // $ANTLR start "rule__Attribute__UpperBoundAssignment_3_3"
    // InternalML2.g:8429:1: rule__Attribute__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8433:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8434:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8434:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8435:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__Attribute__UpperBoundAssignment_3_3"


    // $ANTLR start "rule__Attribute___typeAssignment_4"
    // InternalML2.g:8444:1: rule__Attribute___typeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute___typeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8448:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8449:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8449:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8450:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_4_0()); 
            // InternalML2.g:8451:3: ( ruleQualifiedName )
            // InternalML2.g:8452:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Attribute___typeAssignment_4"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_5_1"
    // InternalML2.g:8463:1: rule__Attribute__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8467:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8468:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8468:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8469:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 
            // InternalML2.g:8470:3: ( ruleQualifiedName )
            // InternalML2.g:8471:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Attribute__SubsetOfAssignment_5_1"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_5_2_1"
    // InternalML2.g:8482:1: rule__Attribute__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8486:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8487:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8487:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8488:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 
            // InternalML2.g:8489:3: ( ruleQualifiedName )
            // InternalML2.g:8490:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__Attribute__SubsetOfAssignment_5_2_1"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalML2.g:8501:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8505:1: ( ( RULE_ID ) )
            // InternalML2.g:8506:2: ( RULE_ID )
            {
            // InternalML2.g:8506:2: ( RULE_ID )
            // InternalML2.g:8507:3: RULE_ID
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


    // $ANTLR start "rule__Reference__LowerBoundAssignment_3_1"
    // InternalML2.g:8516:1: rule__Reference__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8520:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8521:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8521:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8522:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Reference__LowerBoundAssignment_3_1"


    // $ANTLR start "rule__Reference__UpperBoundAssignment_3_3"
    // InternalML2.g:8531:1: rule__Reference__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8535:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8536:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8536:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8537:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__Reference__UpperBoundAssignment_3_3"


    // $ANTLR start "rule__Reference___typeAssignment_4"
    // InternalML2.g:8546:1: rule__Reference___typeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference___typeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8550:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8551:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8551:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8552:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().get_typeML2ClassCrossReference_4_0()); 
            // InternalML2.g:8553:3: ( ruleQualifiedName )
            // InternalML2.g:8554:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().get_typeML2ClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().get_typeML2ClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().get_typeML2ClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__Reference___typeAssignment_4"


    // $ANTLR start "rule__Reference__SubsetOfAssignment_5_1"
    // InternalML2.g:8565:1: rule__Reference__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8569:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8570:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8570:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8571:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 
            // InternalML2.g:8572:3: ( ruleQualifiedName )
            // InternalML2.g:8573:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Reference__SubsetOfAssignment_5_1"


    // $ANTLR start "rule__Reference__SubsetOfAssignment_5_2_1"
    // InternalML2.g:8584:1: rule__Reference__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8588:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8589:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8589:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8590:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 
            // InternalML2.g:8591:3: ( ruleQualifiedName )
            // InternalML2.g:8592:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__Reference__SubsetOfAssignment_5_2_1"


    // $ANTLR start "rule__Reference__OppositeToAssignment_6_1"
    // InternalML2.g:8603:1: rule__Reference__OppositeToAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__OppositeToAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8607:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8608:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8608:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8609:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 
            // InternalML2.g:8610:3: ( ruleQualifiedName )
            // InternalML2.g:8611:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Reference__OppositeToAssignment_6_1"


    // $ANTLR start "rule__RegularityAttribute__NameAssignment_2"
    // InternalML2.g:8622:1: rule__RegularityAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8626:1: ( ( RULE_ID ) )
            // InternalML2.g:8627:2: ( RULE_ID )
            {
            // InternalML2.g:8627:2: ( RULE_ID )
            // InternalML2.g:8628:3: RULE_ID
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


    // $ANTLR start "rule__RegularityAttribute__LowerBoundAssignment_4_1"
    // InternalML2.g:8637:1: rule__RegularityAttribute__LowerBoundAssignment_4_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityAttribute__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8641:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8642:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8642:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8643:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__LowerBoundAssignment_4_1"


    // $ANTLR start "rule__RegularityAttribute__UpperBoundAssignment_4_3"
    // InternalML2.g:8652:1: rule__RegularityAttribute__UpperBoundAssignment_4_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityAttribute__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8656:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8657:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8657:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8658:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__UpperBoundAssignment_4_3"


    // $ANTLR start "rule__RegularityAttribute___typeAssignment_5"
    // InternalML2.g:8667:1: rule__RegularityAttribute___typeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute___typeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8671:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8672:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8672:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8673:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_5_0()); 
            // InternalML2.g:8674:3: ( ruleQualifiedName )
            // InternalML2.g:8675:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_5_0()); 

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
    // $ANTLR end "rule__RegularityAttribute___typeAssignment_5"


    // $ANTLR start "rule__RegularityAttribute__SubsetOfAssignment_6_1"
    // InternalML2.g:8686:1: rule__RegularityAttribute__SubsetOfAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8690:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8691:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8691:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8692:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0()); 
            // InternalML2.g:8693:3: ( ruleQualifiedName )
            // InternalML2.g:8694:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__SubsetOfAssignment_6_1"


    // $ANTLR start "rule__RegularityAttribute__SubsetOfAssignment_6_2_1"
    // InternalML2.g:8705:1: rule__RegularityAttribute__SubsetOfAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8709:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8710:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8710:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8711:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0()); 
            // InternalML2.g:8712:3: ( ruleQualifiedName )
            // InternalML2.g:8713:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__SubsetOfAssignment_6_2_1"


    // $ANTLR start "rule__RegularityAttribute__RegularityTypeAssignment_7"
    // InternalML2.g:8724:1: rule__RegularityAttribute__RegularityTypeAssignment_7 : ( ruleRegularityFeatureType ) ;
    public final void rule__RegularityAttribute__RegularityTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8728:1: ( ( ruleRegularityFeatureType ) )
            // InternalML2.g:8729:2: ( ruleRegularityFeatureType )
            {
            // InternalML2.g:8729:2: ( ruleRegularityFeatureType )
            // InternalML2.g:8730:3: ruleRegularityFeatureType
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityFeatureType();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_7_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__RegularityTypeAssignment_7"


    // $ANTLR start "rule__RegularityAttribute__RegulatedFeatureAssignment_8"
    // InternalML2.g:8739:1: rule__RegularityAttribute__RegulatedFeatureAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__RegulatedFeatureAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8743:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8744:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8744:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8745:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureCrossReference_8_0()); 
            // InternalML2.g:8746:3: ( ruleQualifiedName )
            // InternalML2.g:8747:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureCrossReference_8_0()); 

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
    // $ANTLR end "rule__RegularityAttribute__RegulatedFeatureAssignment_8"


    // $ANTLR start "rule__RegularityReference__NameAssignment_2"
    // InternalML2.g:8758:1: rule__RegularityReference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityReference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8762:1: ( ( RULE_ID ) )
            // InternalML2.g:8763:2: ( RULE_ID )
            {
            // InternalML2.g:8763:2: ( RULE_ID )
            // InternalML2.g:8764:3: RULE_ID
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


    // $ANTLR start "rule__RegularityReference__LowerBoundAssignment_4_1"
    // InternalML2.g:8773:1: rule__RegularityReference__LowerBoundAssignment_4_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityReference__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8777:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8778:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8778:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8779:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getLowerBoundELEMENTBOUNDParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__RegularityReference__LowerBoundAssignment_4_1"


    // $ANTLR start "rule__RegularityReference__UpperBoundAssignment_4_3"
    // InternalML2.g:8788:1: rule__RegularityReference__UpperBoundAssignment_4_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityReference__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8792:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8793:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8793:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8794:3: ruleELEMENTBOUND
            {
             before(grammarAccess.getRegularityReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleELEMENTBOUND();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getUpperBoundELEMENTBOUNDParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__RegularityReference__UpperBoundAssignment_4_3"


    // $ANTLR start "rule__RegularityReference___typeAssignment_5"
    // InternalML2.g:8803:1: rule__RegularityReference___typeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference___typeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8807:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8808:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8808:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8809:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().get_typeML2ClassCrossReference_5_0()); 
            // InternalML2.g:8810:3: ( ruleQualifiedName )
            // InternalML2.g:8811:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().get_typeML2ClassQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().get_typeML2ClassQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().get_typeML2ClassCrossReference_5_0()); 

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
    // $ANTLR end "rule__RegularityReference___typeAssignment_5"


    // $ANTLR start "rule__RegularityReference__SubsetOfAssignment_6_1"
    // InternalML2.g:8822:1: rule__RegularityReference__SubsetOfAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8826:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8827:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8827:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8828:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0()); 
            // InternalML2.g:8829:3: ( ruleQualifiedName )
            // InternalML2.g:8830:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__RegularityReference__SubsetOfAssignment_6_1"


    // $ANTLR start "rule__RegularityReference__SubsetOfAssignment_6_2_1"
    // InternalML2.g:8841:1: rule__RegularityReference__SubsetOfAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8845:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8846:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8846:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8847:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0()); 
            // InternalML2.g:8848:3: ( ruleQualifiedName )
            // InternalML2.g:8849:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceQualifiedNameParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0()); 

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
    // $ANTLR end "rule__RegularityReference__SubsetOfAssignment_6_2_1"


    // $ANTLR start "rule__RegularityReference__OppositeToAssignment_7_1"
    // InternalML2.g:8860:1: rule__RegularityReference__OppositeToAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__OppositeToAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8864:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8865:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8865:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8866:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0()); 
            // InternalML2.g:8867:3: ( ruleQualifiedName )
            // InternalML2.g:8868:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__RegularityReference__OppositeToAssignment_7_1"


    // $ANTLR start "rule__RegularityReference__RegularityTypeAssignment_8"
    // InternalML2.g:8879:1: rule__RegularityReference__RegularityTypeAssignment_8 : ( ruleRegularityFeatureType ) ;
    public final void rule__RegularityReference__RegularityTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8883:1: ( ( ruleRegularityFeatureType ) )
            // InternalML2.g:8884:2: ( ruleRegularityFeatureType )
            {
            // InternalML2.g:8884:2: ( ruleRegularityFeatureType )
            // InternalML2.g:8885:3: ruleRegularityFeatureType
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRegularityFeatureType();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getRegularityTypeRegularityFeatureTypeEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__RegularityReference__RegularityTypeAssignment_8"


    // $ANTLR start "rule__RegularityReference__RegulatedFeatureAssignment_9"
    // InternalML2.g:8894:1: rule__RegularityReference__RegulatedFeatureAssignment_9 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__RegulatedFeatureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8898:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8899:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8899:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8900:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureCrossReference_9_0()); 
            // InternalML2.g:8901:3: ( ruleQualifiedName )
            // InternalML2.g:8902:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureQualifiedNameParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureCrossReference_9_0()); 

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
    // $ANTLR end "rule__RegularityReference__RegulatedFeatureAssignment_9"


    // $ANTLR start "rule__SingleAttributeAssignment__AttributeAssignment_1"
    // InternalML2.g:8913:1: rule__SingleAttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SingleAttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8917:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8918:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8918:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8919:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalML2.g:8920:3: ( ruleQualifiedName )
            // InternalML2.g:8921:4: ruleQualifiedName
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


    // $ANTLR start "rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0"
    // InternalML2.g:8932:1: rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8936:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8937:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8937:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8938:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_3_0_0()); 
            // InternalML2.g:8939:3: ( ruleQualifiedName )
            // InternalML2.g:8940:4: ruleQualifiedName
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSingleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__SingleAttributeAssignment__EntityAssignmentsAssignment_3_0"


    // $ANTLR start "rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1"
    // InternalML2.g:8951:1: rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8955:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:8956:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:8956:2: ( ruleUnnamedIndividual )
            // InternalML2.g:8957:3: ruleUnnamedIndividual
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedIndividual();

            state._fsp--;

             after(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1"


    // $ANTLR start "rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2"
    // InternalML2.g:8966:1: rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 : ( ruleLiteral ) ;
    public final void rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8970:1: ( ( ruleLiteral ) )
            // InternalML2.g:8971:2: ( ruleLiteral )
            {
            // InternalML2.g:8971:2: ( ruleLiteral )
            // InternalML2.g:8972:3: ruleLiteral
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2"


    // $ANTLR start "rule__MultipleAttributeAssignment__AttributeAssignment_1"
    // InternalML2.g:8981:1: rule__MultipleAttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MultipleAttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8985:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8986:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8986:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8987:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalML2.g:8988:3: ( ruleQualifiedName )
            // InternalML2.g:8989:4: ruleQualifiedName
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__AttributeAssignment_1"


    // $ANTLR start "rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0"
    // InternalML2.g:9000:1: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 : ( ruleLiteral ) ;
    public final void rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9004:1: ( ( ruleLiteral ) )
            // InternalML2.g:9005:2: ( ruleLiteral )
            {
            // InternalML2.g:9005:2: ( ruleLiteral )
            // InternalML2.g:9006:3: ruleLiteral
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_4_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_4_0_0_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0"


    // $ANTLR start "rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1"
    // InternalML2.g:9015:1: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 : ( ruleLiteral ) ;
    public final void rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9019:1: ( ( ruleLiteral ) )
            // InternalML2.g:9020:2: ( ruleLiteral )
            {
            // InternalML2.g:9020:2: ( ruleLiteral )
            // InternalML2.g:9021:3: ruleLiteral
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_4_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_4_0_1_1_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1"


    // $ANTLR start "rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0"
    // InternalML2.g:9030:1: rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9034:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9035:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9035:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9036:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_4_1_0_0_0()); 
            // InternalML2.g:9037:3: ( ruleQualifiedName )
            // InternalML2.g:9038:4: ruleQualifiedName
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_4_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_4_1_0_0_0_1()); 

            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_4_1_0_0_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_0_0"


    // $ANTLR start "rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1"
    // InternalML2.g:9049:1: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9053:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9054:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9054:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9055:3: ruleUnnamedIndividual
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_4_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedIndividual();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_4_1_0_1_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1"


    // $ANTLR start "rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0"
    // InternalML2.g:9064:1: rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9068:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9069:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9069:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9070:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_4_1_1_1_0_0()); 
            // InternalML2.g:9071:3: ( ruleQualifiedName )
            // InternalML2.g:9072:4: ruleQualifiedName
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_4_1_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_4_1_1_1_0_0_1()); 

            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_4_1_1_1_0_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__EntityAssignmentsAssignment_4_1_1_1_0"


    // $ANTLR start "rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1"
    // InternalML2.g:9083:1: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9087:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9088:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9088:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9089:3: ruleUnnamedIndividual
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_4_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedIndividual();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_4_1_1_1_1_0()); 

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
    // $ANTLR end "rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1"


    // $ANTLR start "rule__ReferenceAssignment__ReferenceAssignment_1"
    // InternalML2.g:9098:1: rule__ReferenceAssignment__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9102:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9103:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9103:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9104:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 
            // InternalML2.g:9105:3: ( ruleQualifiedName )
            // InternalML2.g:9106:4: ruleQualifiedName
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
    // InternalML2.g:9117:1: rule__ReferenceAssignment__AssignmentsAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9121:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9122:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9122:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9123:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0()); 
            // InternalML2.g:9124:3: ( ruleQualifiedName )
            // InternalML2.g:9125:4: ruleQualifiedName
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
    // InternalML2.g:9136:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9140:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9141:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9141:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9142:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0()); 
            // InternalML2.g:9143:3: ( ruleQualifiedName )
            // InternalML2.g:9144:4: ruleQualifiedName
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
    // InternalML2.g:9155:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9159:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9160:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9160:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9161:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0()); 
            // InternalML2.g:9162:3: ( ruleQualifiedName )
            // InternalML2.g:9163:4: ruleQualifiedName
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


    // $ANTLR start "rule__ML2String__ValueAssignment"
    // InternalML2.g:9174:1: rule__ML2String__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__ML2String__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9178:1: ( ( RULE_STRING ) )
            // InternalML2.g:9179:2: ( RULE_STRING )
            {
            // InternalML2.g:9179:2: ( RULE_STRING )
            // InternalML2.g:9180:3: RULE_STRING
            {
             before(grammarAccess.getML2StringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getML2StringAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ML2String__ValueAssignment"


    // $ANTLR start "rule__ML2Number__ValueAssignment"
    // InternalML2.g:9189:1: rule__ML2Number__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__ML2Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9193:1: ( ( ruleNUMBER ) )
            // InternalML2.g:9194:2: ( ruleNUMBER )
            {
            // InternalML2.g:9194:2: ( ruleNUMBER )
            // InternalML2.g:9195:3: ruleNUMBER
            {
             before(grammarAccess.getML2NumberAccess().getValueNUMBERParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getML2NumberAccess().getValueNUMBERParserRuleCall_0()); 

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
    // $ANTLR end "rule__ML2Number__ValueAssignment"


    // $ANTLR start "rule__ML2Boolean__ValueAssignment"
    // InternalML2.g:9204:1: rule__ML2Boolean__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__ML2Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9208:1: ( ( ruleBOOLEAN ) )
            // InternalML2.g:9209:2: ( ruleBOOLEAN )
            {
            // InternalML2.g:9209:2: ( ruleBOOLEAN )
            // InternalML2.g:9210:3: ruleBOOLEAN
            {
             before(grammarAccess.getML2BooleanAccess().getValueBOOLEANParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getML2BooleanAccess().getValueBOOLEANParserRuleCall_0()); 

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
    // $ANTLR end "rule__ML2Boolean__ValueAssignment"


    // $ANTLR start "rule__UnnamedIndividual__AssignmentsAssignment_2"
    // InternalML2.g:9219:1: rule__UnnamedIndividual__AssignmentsAssignment_2 : ( ruleSimpleAttributeAssignment ) ;
    public final void rule__UnnamedIndividual__AssignmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9223:1: ( ( ruleSimpleAttributeAssignment ) )
            // InternalML2.g:9224:2: ( ruleSimpleAttributeAssignment )
            {
            // InternalML2.g:9224:2: ( ruleSimpleAttributeAssignment )
            // InternalML2.g:9225:3: ruleSimpleAttributeAssignment
            {
             before(grammarAccess.getUnnamedIndividualAccess().getAssignmentsSimpleAttributeAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getUnnamedIndividualAccess().getAssignmentsSimpleAttributeAssignmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UnnamedIndividual__AssignmentsAssignment_2"


    // $ANTLR start "rule__SimpleAttributeAssignment__AttributeAssignment_0"
    // InternalML2.g:9234:1: rule__SimpleAttributeAssignment__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9238:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9239:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9239:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9240:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalML2.g:9241:3: ( ruleQualifiedName )
            // InternalML2.g:9242:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__AttributeAssignment_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0"
    // InternalML2.g:9253:1: rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9257:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9258:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9258:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9259:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_2_0_0()); 
            // InternalML2.g:9260:3: ( ruleQualifiedName )
            // InternalML2.g:9261:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1"
    // InternalML2.g:9272:1: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9276:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9277:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9277:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9278:3: ruleUnnamedIndividual
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedIndividual();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1"


    // $ANTLR start "rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2"
    // InternalML2.g:9287:1: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 : ( ruleLiteral ) ;
    public final void rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9291:1: ( ( ruleLiteral ) )
            // InternalML2.g:9292:2: ( ruleLiteral )
            {
            // InternalML2.g:9292:2: ( ruleLiteral )
            // InternalML2.g:9293:3: ruleLiteral
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2"


    // $ANTLR start "rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0"
    // InternalML2.g:9302:1: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 : ( ruleLiteral ) ;
    public final void rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9306:1: ( ( ruleLiteral ) )
            // InternalML2.g:9307:2: ( ruleLiteral )
            {
            // InternalML2.g:9307:2: ( ruleLiteral )
            // InternalML2.g:9308:3: ruleLiteral
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_3_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_3_1_0_0_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1"
    // InternalML2.g:9317:1: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 : ( ruleLiteral ) ;
    public final void rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9321:1: ( ( ruleLiteral ) )
            // InternalML2.g:9322:2: ( ruleLiteral )
            {
            // InternalML2.g:9322:2: ( ruleLiteral )
            // InternalML2.g:9323:3: ruleLiteral
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_3_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsLiteralParserRuleCall_2_3_1_0_1_1_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1"


    // $ANTLR start "rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0"
    // InternalML2.g:9332:1: rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9336:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9337:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9337:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9338:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_2_3_1_1_0_0_0()); 
            // InternalML2.g:9339:3: ( ruleQualifiedName )
            // InternalML2.g:9340:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_0_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_2_3_1_1_0_0_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_0_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1"
    // InternalML2.g:9351:1: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9355:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9356:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9356:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9357:3: ruleUnnamedIndividual
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_3_1_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedIndividual();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_3_1_1_0_1_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1"


    // $ANTLR start "rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0"
    // InternalML2.g:9366:1: rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9370:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9371:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9371:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9372:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_2_3_1_1_1_1_0_0()); 
            // InternalML2.g:9373:3: ( ruleQualifiedName )
            // InternalML2.g:9374:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_1_1_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getEntityAssignmentsIndividualCrossReference_2_3_1_1_1_1_0_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__EntityAssignmentsAssignment_2_3_1_1_1_1_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1"
    // InternalML2.g:9385:1: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9389:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9390:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9390:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9391:3: ruleUnnamedIndividual
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_3_1_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnnamedIndividual();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsUnnamedIndividualParserRuleCall_2_3_1_1_1_1_1_0()); 

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
    // $ANTLR end "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\5\1\37\1\uffff\1\5\1\4\1\37\2\uffff";
    static final String dfa_3s = "\1\65\1\5\1\70\1\uffff\1\5\1\71\1\70\2\uffff";
    static final String dfa_4s = "\3\uffff\1\3\3\uffff\1\2\1\1";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\52\uffff\1\1\4\uffff\1\3",
            "\1\2",
            "\1\4\30\uffff\1\5",
            "",
            "\1\6",
            "\3\10\5\uffff\2\10\15\uffff\1\7\25\uffff\1\10\7\uffff\1\10",
            "\1\4\30\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1217:1: rule__FeatureAssignment__Alternatives : ( ( ruleSingleAttributeAssignment ) | ( ruleMultipleAttributeAssignment ) | ( ruleReferenceAssignment ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0C000F0630000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0C000F0620000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0021000010000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0021000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00A1000010000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00A1000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000E8000F0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000003F00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0050000003F00000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0202000000003070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0202000010003070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0202000008003070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0C00000000000002L});

}
