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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'true'", "'false'", "'categorizes'", "'completeCategorizes'", "'disjointCategorizes'", "'partitions'", "'String'", "'Number'", "'Boolean'", "'determinesValue'", "'determinesType'", "'determinesMinValue'", "'determinesAllowedValues'", "'determinesAllowedTypes'", "'determinesMaxValue'", "'module'", "'{'", "'}'", "'include'", "';'", "'.'", "'.*'", "'import'", "'individual'", "':'", "','", "'specializes'", "'subordinatedTo'", "'isPowertypeOf'", "'class'", "'datatype'", "'order'", "'orderless'", "'genset'", "'general'", "'specifics'", "'categorizer'", "'att'", "'['", "'..'", "']'", "'subsets'", "'ref'", "'isOppositeTo'", "'regularity'", "'='", "'-'", "'disjoint'", "'complete'"
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


    // $ANTLR start "rulePrimitiveType"
    // InternalML2.g:944:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:948:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalML2.g:949:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalML2.g:949:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalML2.g:950:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalML2.g:951:3: ( rule__PrimitiveType__Alternatives )
            // InternalML2.g:951:4: rule__PrimitiveType__Alternatives
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
    // InternalML2.g:960:1: ruleRegularityFeatureType : ( ( rule__RegularityFeatureType__Alternatives ) ) ;
    public final void ruleRegularityFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:964:1: ( ( ( rule__RegularityFeatureType__Alternatives ) ) )
            // InternalML2.g:965:2: ( ( rule__RegularityFeatureType__Alternatives ) )
            {
            // InternalML2.g:965:2: ( ( rule__RegularityFeatureType__Alternatives ) )
            // InternalML2.g:966:3: ( rule__RegularityFeatureType__Alternatives )
            {
             before(grammarAccess.getRegularityFeatureTypeAccess().getAlternatives()); 
            // InternalML2.g:967:3: ( rule__RegularityFeatureType__Alternatives )
            // InternalML2.g:967:4: rule__RegularityFeatureType__Alternatives
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
    // InternalML2.g:975:1: rule__ML2Model__Alternatives_3 : ( ( ( rule__ML2Model__Group_3_0__0 ) ) | ( ( rule__ML2Model__ElementsAssignment_3_1 ) ) );
    public final void rule__ML2Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:979:1: ( ( ( rule__ML2Model__Group_3_0__0 ) ) | ( ( rule__ML2Model__ElementsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=34 && LA1_0<=35)||(LA1_0>=41 && LA1_0<=45)||(LA1_0>=59 && LA1_0<=60)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalML2.g:980:2: ( ( rule__ML2Model__Group_3_0__0 ) )
                    {
                    // InternalML2.g:980:2: ( ( rule__ML2Model__Group_3_0__0 ) )
                    // InternalML2.g:981:3: ( rule__ML2Model__Group_3_0__0 )
                    {
                     before(grammarAccess.getML2ModelAccess().getGroup_3_0()); 
                    // InternalML2.g:982:3: ( rule__ML2Model__Group_3_0__0 )
                    // InternalML2.g:982:4: rule__ML2Model__Group_3_0__0
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
                    // InternalML2.g:986:2: ( ( rule__ML2Model__ElementsAssignment_3_1 ) )
                    {
                    // InternalML2.g:986:2: ( ( rule__ML2Model__ElementsAssignment_3_1 ) )
                    // InternalML2.g:987:3: ( rule__ML2Model__ElementsAssignment_3_1 )
                    {
                     before(grammarAccess.getML2ModelAccess().getElementsAssignment_3_1()); 
                    // InternalML2.g:988:3: ( rule__ML2Model__ElementsAssignment_3_1 )
                    // InternalML2.g:988:4: rule__ML2Model__ElementsAssignment_3_1
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
    // InternalML2.g:996:1: rule__ModelElement__Alternatives_0 : ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1000:1: ( ( ruleImport ) | ( ruleEntityDeclaration ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt2=2;
                }
                break;
            case 45:
            case 59:
            case 60:
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
                    // InternalML2.g:1001:2: ( ruleImport )
                    {
                    // InternalML2.g:1001:2: ( ruleImport )
                    // InternalML2.g:1002:3: ruleImport
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
                    // InternalML2.g:1007:2: ( ruleEntityDeclaration )
                    {
                    // InternalML2.g:1007:2: ( ruleEntityDeclaration )
                    // InternalML2.g:1008:3: ruleEntityDeclaration
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
                    // InternalML2.g:1013:2: ( ruleGeneralizationSet )
                    {
                    // InternalML2.g:1013:2: ( ruleGeneralizationSet )
                    // InternalML2.g:1014:3: ruleGeneralizationSet
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
    // InternalML2.g:1023:1: rule__EntityDeclaration__Alternatives : ( ( ruleML2Class ) | ( ruleIndividual ) );
    public final void rule__EntityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1027:1: ( ( ruleML2Class ) | ( ruleIndividual ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=41 && LA3_0<=44)) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalML2.g:1028:2: ( ruleML2Class )
                    {
                    // InternalML2.g:1028:2: ( ruleML2Class )
                    // InternalML2.g:1029:3: ruleML2Class
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
                    // InternalML2.g:1034:2: ( ruleIndividual )
                    {
                    // InternalML2.g:1034:2: ( ruleIndividual )
                    // InternalML2.g:1035:3: ruleIndividual
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
    // InternalML2.g:1044:1: rule__ML2Class__Alternatives_0 : ( ( ruleSomeFOClass ) | ( ruleNonFOClass ) );
    public final void rule__ML2Class__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1048:1: ( ( ruleSomeFOClass ) | ( ruleNonFOClass ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=41 && LA4_0<=42)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=43 && LA4_0<=44)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalML2.g:1049:2: ( ruleSomeFOClass )
                    {
                    // InternalML2.g:1049:2: ( ruleSomeFOClass )
                    // InternalML2.g:1050:3: ruleSomeFOClass
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
                    // InternalML2.g:1055:2: ( ruleNonFOClass )
                    {
                    // InternalML2.g:1055:2: ( ruleNonFOClass )
                    // InternalML2.g:1056:3: ruleNonFOClass
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
    // InternalML2.g:1065:1: rule__ML2Class__Alternatives_1_1 : ( ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) ) | ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) ) );
    public final void rule__ML2Class__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1069:1: ( ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) ) | ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==32||LA5_2==57) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==36) ) {
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

                if ( (LA5_2==32||LA5_2==57) ) {
                    alt5=1;
                }
                else if ( (LA5_2==36) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==RULE_ID) ) {
                    int LA5_6 = input.LA(3);

                    if ( (LA5_6==36) ) {
                        alt5=2;
                    }
                    else if ( (LA5_6==32||LA5_6==57) ) {
                        alt5=1;
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
            case 56:
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
                    // InternalML2.g:1070:2: ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) )
                    {
                    // InternalML2.g:1070:2: ( ( rule__ML2Class__AssignmentsAssignment_1_1_0 ) )
                    // InternalML2.g:1071:3: ( rule__ML2Class__AssignmentsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getML2ClassAccess().getAssignmentsAssignment_1_1_0()); 
                    // InternalML2.g:1072:3: ( rule__ML2Class__AssignmentsAssignment_1_1_0 )
                    // InternalML2.g:1072:4: rule__ML2Class__AssignmentsAssignment_1_1_0
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
                    // InternalML2.g:1076:2: ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) )
                    {
                    // InternalML2.g:1076:2: ( ( rule__ML2Class__FeaturesAssignment_1_1_1 ) )
                    // InternalML2.g:1077:3: ( rule__ML2Class__FeaturesAssignment_1_1_1 )
                    {
                     before(grammarAccess.getML2ClassAccess().getFeaturesAssignment_1_1_1()); 
                    // InternalML2.g:1078:3: ( rule__ML2Class__FeaturesAssignment_1_1_1 )
                    // InternalML2.g:1078:4: rule__ML2Class__FeaturesAssignment_1_1_1
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
    // InternalML2.g:1086:1: rule__SomeFOClass__Alternatives_0 : ( ( ruleFOClass ) | ( ruleDataType ) );
    public final void rule__SomeFOClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1090:1: ( ( ruleFOClass ) | ( ruleDataType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==42) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalML2.g:1091:2: ( ruleFOClass )
                    {
                    // InternalML2.g:1091:2: ( ruleFOClass )
                    // InternalML2.g:1092:3: ruleFOClass
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
                    // InternalML2.g:1097:2: ( ruleDataType )
                    {
                    // InternalML2.g:1097:2: ( ruleDataType )
                    // InternalML2.g:1098:3: ruleDataType
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
    // InternalML2.g:1107:1: rule__NonFOClass__Alternatives_0 : ( ( ruleHOClass ) | ( ruleOrderlessClass ) );
    public final void rule__NonFOClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1111:1: ( ( ruleHOClass ) | ( ruleOrderlessClass ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalML2.g:1112:2: ( ruleHOClass )
                    {
                    // InternalML2.g:1112:2: ( ruleHOClass )
                    // InternalML2.g:1113:3: ruleHOClass
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
                    // InternalML2.g:1118:2: ( ruleOrderlessClass )
                    {
                    // InternalML2.g:1118:2: ( ruleOrderlessClass )
                    // InternalML2.g:1119:3: ruleOrderlessClass
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
    // InternalML2.g:1128:1: rule__NonFOClass__Alternatives_4 : ( ( ( rule__NonFOClass__Group_4_0__0 ) ) | ( ( rule__NonFOClass__Group_4_1__0 ) ) );
    public final void rule__NonFOClass__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1132:1: ( ( ( rule__NonFOClass__Group_4_0__0 ) ) | ( ( rule__NonFOClass__Group_4_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=17)) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalML2.g:1133:2: ( ( rule__NonFOClass__Group_4_0__0 ) )
                    {
                    // InternalML2.g:1133:2: ( ( rule__NonFOClass__Group_4_0__0 ) )
                    // InternalML2.g:1134:3: ( rule__NonFOClass__Group_4_0__0 )
                    {
                     before(grammarAccess.getNonFOClassAccess().getGroup_4_0()); 
                    // InternalML2.g:1135:3: ( rule__NonFOClass__Group_4_0__0 )
                    // InternalML2.g:1135:4: rule__NonFOClass__Group_4_0__0
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
                    // InternalML2.g:1139:2: ( ( rule__NonFOClass__Group_4_1__0 ) )
                    {
                    // InternalML2.g:1139:2: ( ( rule__NonFOClass__Group_4_1__0 ) )
                    // InternalML2.g:1140:3: ( rule__NonFOClass__Group_4_1__0 )
                    {
                     before(grammarAccess.getNonFOClassAccess().getGroup_4_1()); 
                    // InternalML2.g:1141:3: ( rule__NonFOClass__Group_4_1__0 )
                    // InternalML2.g:1141:4: rule__NonFOClass__Group_4_1__0
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
    // InternalML2.g:1149:1: rule__Feature__Alternatives : ( ( ruleCommonFeature ) | ( ruleRegularityFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1153:1: ( ( ruleCommonFeature ) | ( ruleRegularityFeature ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==49||LA9_0==54) ) {
                alt9=1;
            }
            else if ( (LA9_0==56) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalML2.g:1154:2: ( ruleCommonFeature )
                    {
                    // InternalML2.g:1154:2: ( ruleCommonFeature )
                    // InternalML2.g:1155:3: ruleCommonFeature
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
                    // InternalML2.g:1160:2: ( ruleRegularityFeature )
                    {
                    // InternalML2.g:1160:2: ( ruleRegularityFeature )
                    // InternalML2.g:1161:3: ruleRegularityFeature
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
    // InternalML2.g:1170:1: rule__CommonFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__CommonFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1174:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==49) ) {
                alt10=1;
            }
            else if ( (LA10_0==54) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalML2.g:1175:2: ( ruleAttribute )
                    {
                    // InternalML2.g:1175:2: ( ruleAttribute )
                    // InternalML2.g:1176:3: ruleAttribute
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
                    // InternalML2.g:1181:2: ( ruleReference )
                    {
                    // InternalML2.g:1181:2: ( ruleReference )
                    // InternalML2.g:1182:3: ruleReference
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
    // InternalML2.g:1191:1: rule__RegularityFeature__Alternatives : ( ( ruleRegularityAttribute ) | ( ruleRegularityReference ) );
    public final void rule__RegularityFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1195:1: ( ( ruleRegularityAttribute ) | ( ruleRegularityReference ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==56) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID||LA11_1==49) ) {
                    alt11=1;
                }
                else if ( (LA11_1==54) ) {
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
                    // InternalML2.g:1196:2: ( ruleRegularityAttribute )
                    {
                    // InternalML2.g:1196:2: ( ruleRegularityAttribute )
                    // InternalML2.g:1197:3: ruleRegularityAttribute
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
                    // InternalML2.g:1202:2: ( ruleRegularityReference )
                    {
                    // InternalML2.g:1202:2: ( ruleRegularityReference )
                    // InternalML2.g:1203:3: ruleRegularityReference
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


    // $ANTLR start "rule__Attribute__Alternatives_4"
    // InternalML2.g:1212:1: rule__Attribute__Alternatives_4 : ( ( ( rule__Attribute__PrimitiveTypeAssignment_4_0 ) ) | ( ( rule__Attribute___typeAssignment_4_1 ) ) );
    public final void rule__Attribute__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1216:1: ( ( ( rule__Attribute__PrimitiveTypeAssignment_4_0 ) ) | ( ( rule__Attribute___typeAssignment_4_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=18 && LA12_0<=20)) ) {
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
                    // InternalML2.g:1217:2: ( ( rule__Attribute__PrimitiveTypeAssignment_4_0 ) )
                    {
                    // InternalML2.g:1217:2: ( ( rule__Attribute__PrimitiveTypeAssignment_4_0 ) )
                    // InternalML2.g:1218:3: ( rule__Attribute__PrimitiveTypeAssignment_4_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getPrimitiveTypeAssignment_4_0()); 
                    // InternalML2.g:1219:3: ( rule__Attribute__PrimitiveTypeAssignment_4_0 )
                    // InternalML2.g:1219:4: rule__Attribute__PrimitiveTypeAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__PrimitiveTypeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getPrimitiveTypeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1223:2: ( ( rule__Attribute___typeAssignment_4_1 ) )
                    {
                    // InternalML2.g:1223:2: ( ( rule__Attribute___typeAssignment_4_1 ) )
                    // InternalML2.g:1224:3: ( rule__Attribute___typeAssignment_4_1 )
                    {
                     before(grammarAccess.getAttributeAccess().get_typeAssignment_4_1()); 
                    // InternalML2.g:1225:3: ( rule__Attribute___typeAssignment_4_1 )
                    // InternalML2.g:1225:4: rule__Attribute___typeAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute___typeAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().get_typeAssignment_4_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_4"


    // $ANTLR start "rule__RegularityAttribute__Alternatives_5"
    // InternalML2.g:1233:1: rule__RegularityAttribute__Alternatives_5 : ( ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_5_0 ) ) | ( ( rule__RegularityAttribute___typeAssignment_5_1 ) ) );
    public final void rule__RegularityAttribute__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1237:1: ( ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_5_0 ) ) | ( ( rule__RegularityAttribute___typeAssignment_5_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=18 && LA13_0<=20)) ) {
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
                    // InternalML2.g:1238:2: ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_5_0 ) )
                    {
                    // InternalML2.g:1238:2: ( ( rule__RegularityAttribute__PrimitiveTypeAssignment_5_0 ) )
                    // InternalML2.g:1239:3: ( rule__RegularityAttribute__PrimitiveTypeAssignment_5_0 )
                    {
                     before(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypeAssignment_5_0()); 
                    // InternalML2.g:1240:3: ( rule__RegularityAttribute__PrimitiveTypeAssignment_5_0 )
                    // InternalML2.g:1240:4: rule__RegularityAttribute__PrimitiveTypeAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute__PrimitiveTypeAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypeAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1244:2: ( ( rule__RegularityAttribute___typeAssignment_5_1 ) )
                    {
                    // InternalML2.g:1244:2: ( ( rule__RegularityAttribute___typeAssignment_5_1 ) )
                    // InternalML2.g:1245:3: ( rule__RegularityAttribute___typeAssignment_5_1 )
                    {
                     before(grammarAccess.getRegularityAttributeAccess().get_typeAssignment_5_1()); 
                    // InternalML2.g:1246:3: ( rule__RegularityAttribute___typeAssignment_5_1 )
                    // InternalML2.g:1246:4: rule__RegularityAttribute___typeAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularityAttribute___typeAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularityAttributeAccess().get_typeAssignment_5_1()); 

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
    // $ANTLR end "rule__RegularityAttribute__Alternatives_5"


    // $ANTLR start "rule__ELEMENTBOUND__Alternatives"
    // InternalML2.g:1254:1: rule__ELEMENTBOUND__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__ELEMENTBOUND__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1258:1: ( ( '*' ) | ( RULE_INT ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalML2.g:1259:2: ( '*' )
                    {
                    // InternalML2.g:1259:2: ( '*' )
                    // InternalML2.g:1260:3: '*'
                    {
                     before(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getELEMENTBOUNDAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1265:2: ( RULE_INT )
                    {
                    // InternalML2.g:1265:2: ( RULE_INT )
                    // InternalML2.g:1266:3: RULE_INT
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
    // InternalML2.g:1275:1: rule__FeatureAssignment__Alternatives : ( ( ruleSingleAttributeAssignment ) | ( ruleMultipleAttributeAssignment ) | ( ruleReferenceAssignment ) );
    public final void rule__FeatureAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1279:1: ( ( ruleSingleAttributeAssignment ) | ( ruleMultipleAttributeAssignment ) | ( ruleReferenceAssignment ) )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalML2.g:1280:2: ( ruleSingleAttributeAssignment )
                    {
                    // InternalML2.g:1280:2: ( ruleSingleAttributeAssignment )
                    // InternalML2.g:1281:3: ruleSingleAttributeAssignment
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
                    // InternalML2.g:1286:2: ( ruleMultipleAttributeAssignment )
                    {
                    // InternalML2.g:1286:2: ( ruleMultipleAttributeAssignment )
                    // InternalML2.g:1287:3: ruleMultipleAttributeAssignment
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
                    // InternalML2.g:1292:2: ( ruleReferenceAssignment )
                    {
                    // InternalML2.g:1292:2: ( ruleReferenceAssignment )
                    // InternalML2.g:1293:3: ruleReferenceAssignment
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
    // InternalML2.g:1302:1: rule__SingleAttributeAssignment__Alternatives_3 : ( ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0 ) ) | ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) ) | ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) ) );
    public final void rule__SingleAttributeAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1306:1: ( ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0 ) ) | ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) ) | ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case 50:
                {
                alt16=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 12:
            case 13:
            case 58:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalML2.g:1307:2: ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0 ) )
                    {
                    // InternalML2.g:1307:2: ( ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0 ) )
                    // InternalML2.g:1308:3: ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_3_0()); 
                    // InternalML2.g:1309:3: ( rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0 )
                    // InternalML2.g:1309:4: rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1313:2: ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) )
                    {
                    // InternalML2.g:1313:2: ( ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 ) )
                    // InternalML2.g:1314:3: ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 )
                    {
                     before(grammarAccess.getSingleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_3_1()); 
                    // InternalML2.g:1315:3: ( rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 )
                    // InternalML2.g:1315:4: rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1
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
                    // InternalML2.g:1319:2: ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) )
                    {
                    // InternalML2.g:1319:2: ( ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 ) )
                    // InternalML2.g:1320:3: ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 )
                    {
                     before(grammarAccess.getSingleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_3_2()); 
                    // InternalML2.g:1321:3: ( rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 )
                    // InternalML2.g:1321:4: rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2
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
    // InternalML2.g:1329:1: rule__MultipleAttributeAssignment__Alternatives_4 : ( ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) ) | ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) ) );
    public final void rule__MultipleAttributeAssignment__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1333:1: ( ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) ) | ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==RULE_STRING||(LA17_0>=12 && LA17_0<=13)||LA17_0==58) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||LA17_0==50) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalML2.g:1334:2: ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) )
                    {
                    // InternalML2.g:1334:2: ( ( rule__MultipleAttributeAssignment__Group_4_0__0 ) )
                    // InternalML2.g:1335:3: ( rule__MultipleAttributeAssignment__Group_4_0__0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_0()); 
                    // InternalML2.g:1336:3: ( rule__MultipleAttributeAssignment__Group_4_0__0 )
                    // InternalML2.g:1336:4: rule__MultipleAttributeAssignment__Group_4_0__0
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
                    // InternalML2.g:1340:2: ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) )
                    {
                    // InternalML2.g:1340:2: ( ( rule__MultipleAttributeAssignment__Group_4_1__0 ) )
                    // InternalML2.g:1341:3: ( rule__MultipleAttributeAssignment__Group_4_1__0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_1()); 
                    // InternalML2.g:1342:3: ( rule__MultipleAttributeAssignment__Group_4_1__0 )
                    // InternalML2.g:1342:4: rule__MultipleAttributeAssignment__Group_4_1__0
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
    // InternalML2.g:1350:1: rule__MultipleAttributeAssignment__Alternatives_4_1_0 : ( ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) ) );
    public final void rule__MultipleAttributeAssignment__Alternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1354:1: ( ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==50) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalML2.g:1355:2: ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0 ) )
                    {
                    // InternalML2.g:1355:2: ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0 ) )
                    // InternalML2.g:1356:3: ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_4_1_0_0()); 
                    // InternalML2.g:1357:3: ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0 )
                    // InternalML2.g:1357:4: rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1361:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) )
                    {
                    // InternalML2.g:1361:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 ) )
                    // InternalML2.g:1362:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_4_1_0_1()); 
                    // InternalML2.g:1363:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 )
                    // InternalML2.g:1363:4: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1
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
    // InternalML2.g:1371:1: rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 : ( ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) ) );
    public final void rule__MultipleAttributeAssignment__Alternatives_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1375:1: ( ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0 ) ) | ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==50) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalML2.g:1376:2: ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0 ) )
                    {
                    // InternalML2.g:1376:2: ( ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0 ) )
                    // InternalML2.g:1377:3: ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_4_1_1_1_0()); 
                    // InternalML2.g:1378:3: ( rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0 )
                    // InternalML2.g:1378:4: rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_4_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1382:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) )
                    {
                    // InternalML2.g:1382:2: ( ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 ) )
                    // InternalML2.g:1383:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 )
                    {
                     before(grammarAccess.getMultipleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_4_1_1_1_1()); 
                    // InternalML2.g:1384:3: ( rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 )
                    // InternalML2.g:1384:4: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1
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
    // InternalML2.g:1392:1: rule__ReferenceAssignment__Alternatives_3 : ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) );
    public final void rule__ReferenceAssignment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1396:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) ) | ( ( rule__ReferenceAssignment__Group_3_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==28) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalML2.g:1397:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    {
                    // InternalML2.g:1397:2: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 ) )
                    // InternalML2.g:1398:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_0()); 
                    // InternalML2.g:1399:3: ( rule__ReferenceAssignment__AssignmentsAssignment_3_0 )
                    // InternalML2.g:1399:4: rule__ReferenceAssignment__AssignmentsAssignment_3_0
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
                    // InternalML2.g:1403:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    {
                    // InternalML2.g:1403:2: ( ( rule__ReferenceAssignment__Group_3_1__0 ) )
                    // InternalML2.g:1404:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    {
                     before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1()); 
                    // InternalML2.g:1405:3: ( rule__ReferenceAssignment__Group_3_1__0 )
                    // InternalML2.g:1405:4: rule__ReferenceAssignment__Group_3_1__0
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
    // InternalML2.g:1413:1: rule__Literal__Alternatives : ( ( ruleML2String ) | ( ruleML2Number ) | ( ruleML2Boolean ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1417:1: ( ( ruleML2String ) | ( ruleML2Number ) | ( ruleML2Boolean ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case RULE_INT:
            case 58:
                {
                alt21=2;
                }
                break;
            case 12:
            case 13:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalML2.g:1418:2: ( ruleML2String )
                    {
                    // InternalML2.g:1418:2: ( ruleML2String )
                    // InternalML2.g:1419:3: ruleML2String
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
                    // InternalML2.g:1424:2: ( ruleML2Number )
                    {
                    // InternalML2.g:1424:2: ( ruleML2Number )
                    // InternalML2.g:1425:3: ruleML2Number
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
                    // InternalML2.g:1430:2: ( ruleML2Boolean )
                    {
                    // InternalML2.g:1430:2: ( ruleML2Boolean )
                    // InternalML2.g:1431:3: ruleML2Boolean
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
    // InternalML2.g:1440:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1444:1: ( ( 'true' ) | ( 'false' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            else if ( (LA22_0==13) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalML2.g:1445:2: ( 'true' )
                    {
                    // InternalML2.g:1445:2: ( 'true' )
                    // InternalML2.g:1446:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1451:2: ( 'false' )
                    {
                    // InternalML2.g:1451:2: ( 'false' )
                    // InternalML2.g:1452:3: 'false'
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


    // $ANTLR start "rule__SimpleAttributeAssignment__Alternatives_2"
    // InternalML2.g:1461:1: rule__SimpleAttributeAssignment__Alternatives_2 : ( ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) ) | ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1465:1: ( ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) ) | ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case 50:
                {
                alt23=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 12:
            case 13:
            case 58:
                {
                alt23=3;
                }
                break;
            case 28:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalML2.g:1466:2: ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0 ) )
                    {
                    // InternalML2.g:1466:2: ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0 ) )
                    // InternalML2.g:1467:3: ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_2_0()); 
                    // InternalML2.g:1468:3: ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0 )
                    // InternalML2.g:1468:4: rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1472:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) )
                    {
                    // InternalML2.g:1472:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 ) )
                    // InternalML2.g:1473:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_1()); 
                    // InternalML2.g:1474:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 )
                    // InternalML2.g:1474:4: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1
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
                    // InternalML2.g:1478:2: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) )
                    {
                    // InternalML2.g:1478:2: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 ) )
                    // InternalML2.g:1479:3: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_2()); 
                    // InternalML2.g:1480:3: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 )
                    // InternalML2.g:1480:4: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2
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
                    // InternalML2.g:1484:2: ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) )
                    {
                    // InternalML2.g:1484:2: ( ( rule__SimpleAttributeAssignment__Group_2_3__0 ) )
                    // InternalML2.g:1485:3: ( rule__SimpleAttributeAssignment__Group_2_3__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3()); 
                    // InternalML2.g:1486:3: ( rule__SimpleAttributeAssignment__Group_2_3__0 )
                    // InternalML2.g:1486:4: rule__SimpleAttributeAssignment__Group_2_3__0
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
    // InternalML2.g:1494:1: rule__SimpleAttributeAssignment__Alternatives_2_3_1 : ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1498:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) ) | ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==RULE_STRING||(LA24_0>=12 && LA24_0<=13)||LA24_0==58) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalML2.g:1499:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) )
                    {
                    // InternalML2.g:1499:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 ) )
                    // InternalML2.g:1500:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_0()); 
                    // InternalML2.g:1501:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0 )
                    // InternalML2.g:1501:4: rule__SimpleAttributeAssignment__Group_2_3_1_0__0
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
                    // InternalML2.g:1505:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) )
                    {
                    // InternalML2.g:1505:2: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 ) )
                    // InternalML2.g:1506:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_1()); 
                    // InternalML2.g:1507:3: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0 )
                    // InternalML2.g:1507:4: rule__SimpleAttributeAssignment__Group_2_3_1_1__0
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
    // InternalML2.g:1515:1: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 : ( ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1519:1: ( ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==50) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalML2.g:1520:2: ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0 ) )
                    {
                    // InternalML2.g:1520:2: ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0 ) )
                    // InternalML2.g:1521:3: ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_2_3_1_1_0_0()); 
                    // InternalML2.g:1522:3: ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0 )
                    // InternalML2.g:1522:4: rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_2_3_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1526:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) )
                    {
                    // InternalML2.g:1526:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 ) )
                    // InternalML2.g:1527:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1()); 
                    // InternalML2.g:1528:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 )
                    // InternalML2.g:1528:4: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1
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
    // InternalML2.g:1536:1: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 : ( ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) ) );
    public final void rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1540:1: ( ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0 ) ) | ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==50) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalML2.g:1541:2: ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0 ) )
                    {
                    // InternalML2.g:1541:2: ( ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0 ) )
                    // InternalML2.g:1542:3: ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_2_3_1_1_1_1_0()); 
                    // InternalML2.g:1543:3: ( rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0 )
                    // InternalML2.g:1543:4: rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsAssignment_2_3_1_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1547:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) )
                    {
                    // InternalML2.g:1547:2: ( ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 ) )
                    // InternalML2.g:1548:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 )
                    {
                     before(grammarAccess.getSimpleAttributeAssignmentAccess().getUnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1()); 
                    // InternalML2.g:1549:3: ( rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 )
                    // InternalML2.g:1549:4: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1
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
    // InternalML2.g:1557:1: rule__CategorizationType__Alternatives : ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) );
    public final void rule__CategorizationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1561:1: ( ( ( 'categorizes' ) ) | ( ( 'completeCategorizes' ) ) | ( ( 'disjointCategorizes' ) ) | ( ( 'partitions' ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt27=1;
                }
                break;
            case 15:
                {
                alt27=2;
                }
                break;
            case 16:
                {
                alt27=3;
                }
                break;
            case 17:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalML2.g:1562:2: ( ( 'categorizes' ) )
                    {
                    // InternalML2.g:1562:2: ( ( 'categorizes' ) )
                    // InternalML2.g:1563:3: ( 'categorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 
                    // InternalML2.g:1564:3: ( 'categorizes' )
                    // InternalML2.g:1564:4: 'categorizes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCATEGORIZEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1568:2: ( ( 'completeCategorizes' ) )
                    {
                    // InternalML2.g:1568:2: ( ( 'completeCategorizes' ) )
                    // InternalML2.g:1569:3: ( 'completeCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 
                    // InternalML2.g:1570:3: ( 'completeCategorizes' )
                    // InternalML2.g:1570:4: 'completeCategorizes'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getCOMPLETE_CATEGORIZEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1574:2: ( ( 'disjointCategorizes' ) )
                    {
                    // InternalML2.g:1574:2: ( ( 'disjointCategorizes' ) )
                    // InternalML2.g:1575:3: ( 'disjointCategorizes' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 
                    // InternalML2.g:1576:3: ( 'disjointCategorizes' )
                    // InternalML2.g:1576:4: 'disjointCategorizes'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizationTypeAccess().getDISJOINT_CATEGORIZEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:1580:2: ( ( 'partitions' ) )
                    {
                    // InternalML2.g:1580:2: ( ( 'partitions' ) )
                    // InternalML2.g:1581:3: ( 'partitions' )
                    {
                     before(grammarAccess.getCategorizationTypeAccess().getPARTITIONEREnumLiteralDeclaration_3()); 
                    // InternalML2.g:1582:3: ( 'partitions' )
                    // InternalML2.g:1582:4: 'partitions'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalML2.g:1590:1: rule__PrimitiveType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1594:1: ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Boolean' ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt28=1;
                }
                break;
            case 19:
                {
                alt28=2;
                }
                break;
            case 20:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalML2.g:1595:2: ( ( 'String' ) )
                    {
                    // InternalML2.g:1595:2: ( ( 'String' ) )
                    // InternalML2.g:1596:3: ( 'String' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalML2.g:1597:3: ( 'String' )
                    // InternalML2.g:1597:4: 'String'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1601:2: ( ( 'Number' ) )
                    {
                    // InternalML2.g:1601:2: ( ( 'Number' ) )
                    // InternalML2.g:1602:3: ( 'Number' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // InternalML2.g:1603:3: ( 'Number' )
                    // InternalML2.g:1603:4: 'Number'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1607:2: ( ( 'Boolean' ) )
                    {
                    // InternalML2.g:1607:2: ( ( 'Boolean' ) )
                    // InternalML2.g:1608:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalML2.g:1609:3: ( 'Boolean' )
                    // InternalML2.g:1609:4: 'Boolean'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalML2.g:1617:1: rule__RegularityFeatureType__Alternatives : ( ( ( 'determinesValue' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesAllowedValues' ) ) | ( ( 'determinesAllowedTypes' ) ) | ( ( 'determinesMaxValue' ) ) );
    public final void rule__RegularityFeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1621:1: ( ( ( 'determinesValue' ) ) | ( ( 'determinesType' ) ) | ( ( 'determinesMinValue' ) ) | ( ( 'determinesAllowedValues' ) ) | ( ( 'determinesAllowedTypes' ) ) | ( ( 'determinesMaxValue' ) ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt29=1;
                }
                break;
            case 22:
                {
                alt29=2;
                }
                break;
            case 23:
                {
                alt29=3;
                }
                break;
            case 24:
                {
                alt29=4;
                }
                break;
            case 25:
                {
                alt29=5;
                }
                break;
            case 26:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalML2.g:1622:2: ( ( 'determinesValue' ) )
                    {
                    // InternalML2.g:1622:2: ( ( 'determinesValue' ) )
                    // InternalML2.g:1623:3: ( 'determinesValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 
                    // InternalML2.g:1624:3: ( 'determinesValue' )
                    // InternalML2.g:1624:4: 'determinesValue'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_VALUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalML2.g:1628:2: ( ( 'determinesType' ) )
                    {
                    // InternalML2.g:1628:2: ( ( 'determinesType' ) )
                    // InternalML2.g:1629:3: ( 'determinesType' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1()); 
                    // InternalML2.g:1630:3: ( 'determinesType' )
                    // InternalML2.g:1630:4: 'determinesType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_TYPEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalML2.g:1634:2: ( ( 'determinesMinValue' ) )
                    {
                    // InternalML2.g:1634:2: ( ( 'determinesMinValue' ) )
                    // InternalML2.g:1635:3: ( 'determinesMinValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2()); 
                    // InternalML2.g:1636:3: ( 'determinesMinValue' )
                    // InternalML2.g:1636:4: 'determinesMinValue'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MIN_VALUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalML2.g:1640:2: ( ( 'determinesAllowedValues' ) )
                    {
                    // InternalML2.g:1640:2: ( ( 'determinesAllowedValues' ) )
                    // InternalML2.g:1641:3: ( 'determinesAllowedValues' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3()); 
                    // InternalML2.g:1642:3: ( 'determinesAllowedValues' )
                    // InternalML2.g:1642:4: 'determinesAllowedValues'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_VALUESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalML2.g:1646:2: ( ( 'determinesAllowedTypes' ) )
                    {
                    // InternalML2.g:1646:2: ( ( 'determinesAllowedTypes' ) )
                    // InternalML2.g:1647:3: ( 'determinesAllowedTypes' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4()); 
                    // InternalML2.g:1648:3: ( 'determinesAllowedTypes' )
                    // InternalML2.g:1648:4: 'determinesAllowedTypes'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_ALLOWED_TYPESEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalML2.g:1652:2: ( ( 'determinesMaxValue' ) )
                    {
                    // InternalML2.g:1652:2: ( ( 'determinesMaxValue' ) )
                    // InternalML2.g:1653:3: ( 'determinesMaxValue' )
                    {
                     before(grammarAccess.getRegularityFeatureTypeAccess().getDETERMINES_MAX_VALUEEnumLiteralDeclaration_5()); 
                    // InternalML2.g:1654:3: ( 'determinesMaxValue' )
                    // InternalML2.g:1654:4: 'determinesMaxValue'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalML2.g:1662:1: rule__ML2Model__Group__0 : rule__ML2Model__Group__0__Impl rule__ML2Model__Group__1 ;
    public final void rule__ML2Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1666:1: ( rule__ML2Model__Group__0__Impl rule__ML2Model__Group__1 )
            // InternalML2.g:1667:2: rule__ML2Model__Group__0__Impl rule__ML2Model__Group__1
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
    // InternalML2.g:1674:1: rule__ML2Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__ML2Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1678:1: ( ( 'module' ) )
            // InternalML2.g:1679:1: ( 'module' )
            {
            // InternalML2.g:1679:1: ( 'module' )
            // InternalML2.g:1680:2: 'module'
            {
             before(grammarAccess.getML2ModelAccess().getModuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalML2.g:1689:1: rule__ML2Model__Group__1 : rule__ML2Model__Group__1__Impl rule__ML2Model__Group__2 ;
    public final void rule__ML2Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1693:1: ( rule__ML2Model__Group__1__Impl rule__ML2Model__Group__2 )
            // InternalML2.g:1694:2: rule__ML2Model__Group__1__Impl rule__ML2Model__Group__2
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
    // InternalML2.g:1701:1: rule__ML2Model__Group__1__Impl : ( ( rule__ML2Model__NameAssignment_1 ) ) ;
    public final void rule__ML2Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1705:1: ( ( ( rule__ML2Model__NameAssignment_1 ) ) )
            // InternalML2.g:1706:1: ( ( rule__ML2Model__NameAssignment_1 ) )
            {
            // InternalML2.g:1706:1: ( ( rule__ML2Model__NameAssignment_1 ) )
            // InternalML2.g:1707:2: ( rule__ML2Model__NameAssignment_1 )
            {
             before(grammarAccess.getML2ModelAccess().getNameAssignment_1()); 
            // InternalML2.g:1708:2: ( rule__ML2Model__NameAssignment_1 )
            // InternalML2.g:1708:3: rule__ML2Model__NameAssignment_1
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
    // InternalML2.g:1716:1: rule__ML2Model__Group__2 : rule__ML2Model__Group__2__Impl rule__ML2Model__Group__3 ;
    public final void rule__ML2Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1720:1: ( rule__ML2Model__Group__2__Impl rule__ML2Model__Group__3 )
            // InternalML2.g:1721:2: rule__ML2Model__Group__2__Impl rule__ML2Model__Group__3
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
    // InternalML2.g:1728:1: rule__ML2Model__Group__2__Impl : ( '{' ) ;
    public final void rule__ML2Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1732:1: ( ( '{' ) )
            // InternalML2.g:1733:1: ( '{' )
            {
            // InternalML2.g:1733:1: ( '{' )
            // InternalML2.g:1734:2: '{'
            {
             before(grammarAccess.getML2ModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalML2.g:1743:1: rule__ML2Model__Group__3 : rule__ML2Model__Group__3__Impl rule__ML2Model__Group__4 ;
    public final void rule__ML2Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1747:1: ( rule__ML2Model__Group__3__Impl rule__ML2Model__Group__4 )
            // InternalML2.g:1748:2: rule__ML2Model__Group__3__Impl rule__ML2Model__Group__4
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
    // InternalML2.g:1755:1: rule__ML2Model__Group__3__Impl : ( ( rule__ML2Model__Alternatives_3 )* ) ;
    public final void rule__ML2Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1759:1: ( ( ( rule__ML2Model__Alternatives_3 )* ) )
            // InternalML2.g:1760:1: ( ( rule__ML2Model__Alternatives_3 )* )
            {
            // InternalML2.g:1760:1: ( ( rule__ML2Model__Alternatives_3 )* )
            // InternalML2.g:1761:2: ( rule__ML2Model__Alternatives_3 )*
            {
             before(grammarAccess.getML2ModelAccess().getAlternatives_3()); 
            // InternalML2.g:1762:2: ( rule__ML2Model__Alternatives_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30||(LA30_0>=34 && LA30_0<=35)||(LA30_0>=41 && LA30_0<=45)||(LA30_0>=59 && LA30_0<=60)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalML2.g:1762:3: rule__ML2Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ML2Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalML2.g:1770:1: rule__ML2Model__Group__4 : rule__ML2Model__Group__4__Impl ;
    public final void rule__ML2Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1774:1: ( rule__ML2Model__Group__4__Impl )
            // InternalML2.g:1775:2: rule__ML2Model__Group__4__Impl
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
    // InternalML2.g:1781:1: rule__ML2Model__Group__4__Impl : ( '}' ) ;
    public final void rule__ML2Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1785:1: ( ( '}' ) )
            // InternalML2.g:1786:1: ( '}' )
            {
            // InternalML2.g:1786:1: ( '}' )
            // InternalML2.g:1787:2: '}'
            {
             before(grammarAccess.getML2ModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalML2.g:1797:1: rule__ML2Model__Group_3_0__0 : rule__ML2Model__Group_3_0__0__Impl rule__ML2Model__Group_3_0__1 ;
    public final void rule__ML2Model__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1801:1: ( rule__ML2Model__Group_3_0__0__Impl rule__ML2Model__Group_3_0__1 )
            // InternalML2.g:1802:2: rule__ML2Model__Group_3_0__0__Impl rule__ML2Model__Group_3_0__1
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
    // InternalML2.g:1809:1: rule__ML2Model__Group_3_0__0__Impl : ( 'include' ) ;
    public final void rule__ML2Model__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1813:1: ( ( 'include' ) )
            // InternalML2.g:1814:1: ( 'include' )
            {
            // InternalML2.g:1814:1: ( 'include' )
            // InternalML2.g:1815:2: 'include'
            {
             before(grammarAccess.getML2ModelAccess().getIncludeKeyword_3_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalML2.g:1824:1: rule__ML2Model__Group_3_0__1 : rule__ML2Model__Group_3_0__1__Impl rule__ML2Model__Group_3_0__2 ;
    public final void rule__ML2Model__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1828:1: ( rule__ML2Model__Group_3_0__1__Impl rule__ML2Model__Group_3_0__2 )
            // InternalML2.g:1829:2: rule__ML2Model__Group_3_0__1__Impl rule__ML2Model__Group_3_0__2
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
    // InternalML2.g:1836:1: rule__ML2Model__Group_3_0__1__Impl : ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) ) ;
    public final void rule__ML2Model__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1840:1: ( ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) ) )
            // InternalML2.g:1841:1: ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) )
            {
            // InternalML2.g:1841:1: ( ( rule__ML2Model__IncludesAssignment_3_0_1 ) )
            // InternalML2.g:1842:2: ( rule__ML2Model__IncludesAssignment_3_0_1 )
            {
             before(grammarAccess.getML2ModelAccess().getIncludesAssignment_3_0_1()); 
            // InternalML2.g:1843:2: ( rule__ML2Model__IncludesAssignment_3_0_1 )
            // InternalML2.g:1843:3: rule__ML2Model__IncludesAssignment_3_0_1
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
    // InternalML2.g:1851:1: rule__ML2Model__Group_3_0__2 : rule__ML2Model__Group_3_0__2__Impl ;
    public final void rule__ML2Model__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1855:1: ( rule__ML2Model__Group_3_0__2__Impl )
            // InternalML2.g:1856:2: rule__ML2Model__Group_3_0__2__Impl
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
    // InternalML2.g:1862:1: rule__ML2Model__Group_3_0__2__Impl : ( ';' ) ;
    public final void rule__ML2Model__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1866:1: ( ( ';' ) )
            // InternalML2.g:1867:1: ( ';' )
            {
            // InternalML2.g:1867:1: ( ';' )
            // InternalML2.g:1868:2: ';'
            {
             before(grammarAccess.getML2ModelAccess().getSemicolonKeyword_3_0_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalML2.g:1878:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1882:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalML2.g:1883:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalML2.g:1890:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1894:1: ( ( RULE_ID ) )
            // InternalML2.g:1895:1: ( RULE_ID )
            {
            // InternalML2.g:1895:1: ( RULE_ID )
            // InternalML2.g:1896:2: RULE_ID
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
    // InternalML2.g:1905:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1909:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalML2.g:1910:2: rule__QualifiedName__Group__1__Impl
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
    // InternalML2.g:1916:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1920:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalML2.g:1921:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalML2.g:1921:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalML2.g:1922:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalML2.g:1923:2: ( rule__QualifiedName__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalML2.g:1923:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalML2.g:1932:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1936:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalML2.g:1937:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalML2.g:1944:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1948:1: ( ( '.' ) )
            // InternalML2.g:1949:1: ( '.' )
            {
            // InternalML2.g:1949:1: ( '.' )
            // InternalML2.g:1950:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalML2.g:1959:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1963:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalML2.g:1964:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalML2.g:1970:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1974:1: ( ( RULE_ID ) )
            // InternalML2.g:1975:1: ( RULE_ID )
            {
            // InternalML2.g:1975:1: ( RULE_ID )
            // InternalML2.g:1976:2: RULE_ID
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
    // InternalML2.g:1986:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:1990:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalML2.g:1991:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalML2.g:1998:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2002:1: ( ( ruleQualifiedName ) )
            // InternalML2.g:2003:1: ( ruleQualifiedName )
            {
            // InternalML2.g:2003:1: ( ruleQualifiedName )
            // InternalML2.g:2004:2: ruleQualifiedName
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
    // InternalML2.g:2013:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2017:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalML2.g:2018:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalML2.g:2024:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2028:1: ( ( ( '.*' )? ) )
            // InternalML2.g:2029:1: ( ( '.*' )? )
            {
            // InternalML2.g:2029:1: ( ( '.*' )? )
            // InternalML2.g:2030:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalML2.g:2031:2: ( '.*' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalML2.g:2031:3: '.*'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalML2.g:2040:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2044:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalML2.g:2045:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalML2.g:2052:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2056:1: ( ( 'import' ) )
            // InternalML2.g:2057:1: ( 'import' )
            {
            // InternalML2.g:2057:1: ( 'import' )
            // InternalML2.g:2058:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalML2.g:2067:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2071:1: ( rule__Import__Group__1__Impl )
            // InternalML2.g:2072:2: rule__Import__Group__1__Impl
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
    // InternalML2.g:2078:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2082:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalML2.g:2083:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalML2.g:2083:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalML2.g:2084:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalML2.g:2085:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalML2.g:2085:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalML2.g:2094:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2098:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalML2.g:2099:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalML2.g:2106:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2110:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalML2.g:2111:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalML2.g:2111:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalML2.g:2112:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalML2.g:2113:2: ( rule__ModelElement__Alternatives_0 )
            // InternalML2.g:2113:3: rule__ModelElement__Alternatives_0
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
    // InternalML2.g:2121:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2125:1: ( rule__ModelElement__Group__1__Impl )
            // InternalML2.g:2126:2: rule__ModelElement__Group__1__Impl
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
    // InternalML2.g:2132:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2136:1: ( ( ';' ) )
            // InternalML2.g:2137:1: ( ';' )
            {
            // InternalML2.g:2137:1: ( ';' )
            // InternalML2.g:2138:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalML2.g:2148:1: rule__Individual__Group__0 : rule__Individual__Group__0__Impl rule__Individual__Group__1 ;
    public final void rule__Individual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2152:1: ( rule__Individual__Group__0__Impl rule__Individual__Group__1 )
            // InternalML2.g:2153:2: rule__Individual__Group__0__Impl rule__Individual__Group__1
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
    // InternalML2.g:2160:1: rule__Individual__Group__0__Impl : ( 'individual' ) ;
    public final void rule__Individual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2164:1: ( ( 'individual' ) )
            // InternalML2.g:2165:1: ( 'individual' )
            {
            // InternalML2.g:2165:1: ( 'individual' )
            // InternalML2.g:2166:2: 'individual'
            {
             before(grammarAccess.getIndividualAccess().getIndividualKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalML2.g:2175:1: rule__Individual__Group__1 : rule__Individual__Group__1__Impl rule__Individual__Group__2 ;
    public final void rule__Individual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2179:1: ( rule__Individual__Group__1__Impl rule__Individual__Group__2 )
            // InternalML2.g:2180:2: rule__Individual__Group__1__Impl rule__Individual__Group__2
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
    // InternalML2.g:2187:1: rule__Individual__Group__1__Impl : ( ( rule__Individual__NameAssignment_1 ) ) ;
    public final void rule__Individual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2191:1: ( ( ( rule__Individual__NameAssignment_1 ) ) )
            // InternalML2.g:2192:1: ( ( rule__Individual__NameAssignment_1 ) )
            {
            // InternalML2.g:2192:1: ( ( rule__Individual__NameAssignment_1 ) )
            // InternalML2.g:2193:2: ( rule__Individual__NameAssignment_1 )
            {
             before(grammarAccess.getIndividualAccess().getNameAssignment_1()); 
            // InternalML2.g:2194:2: ( rule__Individual__NameAssignment_1 )
            // InternalML2.g:2194:3: rule__Individual__NameAssignment_1
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
    // InternalML2.g:2202:1: rule__Individual__Group__2 : rule__Individual__Group__2__Impl rule__Individual__Group__3 ;
    public final void rule__Individual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2206:1: ( rule__Individual__Group__2__Impl rule__Individual__Group__3 )
            // InternalML2.g:2207:2: rule__Individual__Group__2__Impl rule__Individual__Group__3
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
    // InternalML2.g:2214:1: rule__Individual__Group__2__Impl : ( ':' ) ;
    public final void rule__Individual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2218:1: ( ( ':' ) )
            // InternalML2.g:2219:1: ( ':' )
            {
            // InternalML2.g:2219:1: ( ':' )
            // InternalML2.g:2220:2: ':'
            {
             before(grammarAccess.getIndividualAccess().getColonKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:2229:1: rule__Individual__Group__3 : rule__Individual__Group__3__Impl rule__Individual__Group__4 ;
    public final void rule__Individual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2233:1: ( rule__Individual__Group__3__Impl rule__Individual__Group__4 )
            // InternalML2.g:2234:2: rule__Individual__Group__3__Impl rule__Individual__Group__4
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
    // InternalML2.g:2241:1: rule__Individual__Group__3__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_3 ) ) ;
    public final void rule__Individual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2245:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_3 ) ) )
            // InternalML2.g:2246:1: ( ( rule__Individual__InstantiatedClassesAssignment_3 ) )
            {
            // InternalML2.g:2246:1: ( ( rule__Individual__InstantiatedClassesAssignment_3 ) )
            // InternalML2.g:2247:2: ( rule__Individual__InstantiatedClassesAssignment_3 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_3()); 
            // InternalML2.g:2248:2: ( rule__Individual__InstantiatedClassesAssignment_3 )
            // InternalML2.g:2248:3: rule__Individual__InstantiatedClassesAssignment_3
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
    // InternalML2.g:2256:1: rule__Individual__Group__4 : rule__Individual__Group__4__Impl rule__Individual__Group__5 ;
    public final void rule__Individual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2260:1: ( rule__Individual__Group__4__Impl rule__Individual__Group__5 )
            // InternalML2.g:2261:2: rule__Individual__Group__4__Impl rule__Individual__Group__5
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
    // InternalML2.g:2268:1: rule__Individual__Group__4__Impl : ( ( rule__Individual__Group_4__0 )* ) ;
    public final void rule__Individual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2272:1: ( ( ( rule__Individual__Group_4__0 )* ) )
            // InternalML2.g:2273:1: ( ( rule__Individual__Group_4__0 )* )
            {
            // InternalML2.g:2273:1: ( ( rule__Individual__Group_4__0 )* )
            // InternalML2.g:2274:2: ( rule__Individual__Group_4__0 )*
            {
             before(grammarAccess.getIndividualAccess().getGroup_4()); 
            // InternalML2.g:2275:2: ( rule__Individual__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==37) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalML2.g:2275:3: rule__Individual__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Individual__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalML2.g:2283:1: rule__Individual__Group__5 : rule__Individual__Group__5__Impl ;
    public final void rule__Individual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2287:1: ( rule__Individual__Group__5__Impl )
            // InternalML2.g:2288:2: rule__Individual__Group__5__Impl
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
    // InternalML2.g:2294:1: rule__Individual__Group__5__Impl : ( ( rule__Individual__Group_5__0 )? ) ;
    public final void rule__Individual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2298:1: ( ( ( rule__Individual__Group_5__0 )? ) )
            // InternalML2.g:2299:1: ( ( rule__Individual__Group_5__0 )? )
            {
            // InternalML2.g:2299:1: ( ( rule__Individual__Group_5__0 )? )
            // InternalML2.g:2300:2: ( rule__Individual__Group_5__0 )?
            {
             before(grammarAccess.getIndividualAccess().getGroup_5()); 
            // InternalML2.g:2301:2: ( rule__Individual__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalML2.g:2301:3: rule__Individual__Group_5__0
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
    // InternalML2.g:2310:1: rule__Individual__Group_4__0 : rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1 ;
    public final void rule__Individual__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2314:1: ( rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1 )
            // InternalML2.g:2315:2: rule__Individual__Group_4__0__Impl rule__Individual__Group_4__1
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
    // InternalML2.g:2322:1: rule__Individual__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Individual__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2326:1: ( ( ',' ) )
            // InternalML2.g:2327:1: ( ',' )
            {
            // InternalML2.g:2327:1: ( ',' )
            // InternalML2.g:2328:2: ','
            {
             before(grammarAccess.getIndividualAccess().getCommaKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:2337:1: rule__Individual__Group_4__1 : rule__Individual__Group_4__1__Impl ;
    public final void rule__Individual__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2341:1: ( rule__Individual__Group_4__1__Impl )
            // InternalML2.g:2342:2: rule__Individual__Group_4__1__Impl
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
    // InternalML2.g:2348:1: rule__Individual__Group_4__1__Impl : ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) ) ;
    public final void rule__Individual__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2352:1: ( ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) ) )
            // InternalML2.g:2353:1: ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) )
            {
            // InternalML2.g:2353:1: ( ( rule__Individual__InstantiatedClassesAssignment_4_1 ) )
            // InternalML2.g:2354:2: ( rule__Individual__InstantiatedClassesAssignment_4_1 )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesAssignment_4_1()); 
            // InternalML2.g:2355:2: ( rule__Individual__InstantiatedClassesAssignment_4_1 )
            // InternalML2.g:2355:3: rule__Individual__InstantiatedClassesAssignment_4_1
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
    // InternalML2.g:2364:1: rule__Individual__Group_5__0 : rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1 ;
    public final void rule__Individual__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2368:1: ( rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1 )
            // InternalML2.g:2369:2: rule__Individual__Group_5__0__Impl rule__Individual__Group_5__1
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
    // InternalML2.g:2376:1: rule__Individual__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Individual__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2380:1: ( ( '{' ) )
            // InternalML2.g:2381:1: ( '{' )
            {
            // InternalML2.g:2381:1: ( '{' )
            // InternalML2.g:2382:2: '{'
            {
             before(grammarAccess.getIndividualAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalML2.g:2391:1: rule__Individual__Group_5__1 : rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2 ;
    public final void rule__Individual__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2395:1: ( rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2 )
            // InternalML2.g:2396:2: rule__Individual__Group_5__1__Impl rule__Individual__Group_5__2
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
    // InternalML2.g:2403:1: rule__Individual__Group_5__1__Impl : ( ( rule__Individual__AssignmentsAssignment_5_1 )* ) ;
    public final void rule__Individual__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2407:1: ( ( ( rule__Individual__AssignmentsAssignment_5_1 )* ) )
            // InternalML2.g:2408:1: ( ( rule__Individual__AssignmentsAssignment_5_1 )* )
            {
            // InternalML2.g:2408:1: ( ( rule__Individual__AssignmentsAssignment_5_1 )* )
            // InternalML2.g:2409:2: ( rule__Individual__AssignmentsAssignment_5_1 )*
            {
             before(grammarAccess.getIndividualAccess().getAssignmentsAssignment_5_1()); 
            // InternalML2.g:2410:2: ( rule__Individual__AssignmentsAssignment_5_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==49||LA35_0==54) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalML2.g:2410:3: rule__Individual__AssignmentsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Individual__AssignmentsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalML2.g:2418:1: rule__Individual__Group_5__2 : rule__Individual__Group_5__2__Impl ;
    public final void rule__Individual__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2422:1: ( rule__Individual__Group_5__2__Impl )
            // InternalML2.g:2423:2: rule__Individual__Group_5__2__Impl
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
    // InternalML2.g:2429:1: rule__Individual__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Individual__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2433:1: ( ( '}' ) )
            // InternalML2.g:2434:1: ( '}' )
            {
            // InternalML2.g:2434:1: ( '}' )
            // InternalML2.g:2435:2: '}'
            {
             before(grammarAccess.getIndividualAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalML2.g:2445:1: rule__ML2Class__Group__0 : rule__ML2Class__Group__0__Impl rule__ML2Class__Group__1 ;
    public final void rule__ML2Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2449:1: ( rule__ML2Class__Group__0__Impl rule__ML2Class__Group__1 )
            // InternalML2.g:2450:2: rule__ML2Class__Group__0__Impl rule__ML2Class__Group__1
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
    // InternalML2.g:2457:1: rule__ML2Class__Group__0__Impl : ( ( rule__ML2Class__Alternatives_0 ) ) ;
    public final void rule__ML2Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2461:1: ( ( ( rule__ML2Class__Alternatives_0 ) ) )
            // InternalML2.g:2462:1: ( ( rule__ML2Class__Alternatives_0 ) )
            {
            // InternalML2.g:2462:1: ( ( rule__ML2Class__Alternatives_0 ) )
            // InternalML2.g:2463:2: ( rule__ML2Class__Alternatives_0 )
            {
             before(grammarAccess.getML2ClassAccess().getAlternatives_0()); 
            // InternalML2.g:2464:2: ( rule__ML2Class__Alternatives_0 )
            // InternalML2.g:2464:3: rule__ML2Class__Alternatives_0
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
    // InternalML2.g:2472:1: rule__ML2Class__Group__1 : rule__ML2Class__Group__1__Impl ;
    public final void rule__ML2Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2476:1: ( rule__ML2Class__Group__1__Impl )
            // InternalML2.g:2477:2: rule__ML2Class__Group__1__Impl
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
    // InternalML2.g:2483:1: rule__ML2Class__Group__1__Impl : ( ( rule__ML2Class__Group_1__0 )? ) ;
    public final void rule__ML2Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2487:1: ( ( ( rule__ML2Class__Group_1__0 )? ) )
            // InternalML2.g:2488:1: ( ( rule__ML2Class__Group_1__0 )? )
            {
            // InternalML2.g:2488:1: ( ( rule__ML2Class__Group_1__0 )? )
            // InternalML2.g:2489:2: ( rule__ML2Class__Group_1__0 )?
            {
             before(grammarAccess.getML2ClassAccess().getGroup_1()); 
            // InternalML2.g:2490:2: ( rule__ML2Class__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalML2.g:2490:3: rule__ML2Class__Group_1__0
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
    // InternalML2.g:2499:1: rule__ML2Class__Group_1__0 : rule__ML2Class__Group_1__0__Impl rule__ML2Class__Group_1__1 ;
    public final void rule__ML2Class__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2503:1: ( rule__ML2Class__Group_1__0__Impl rule__ML2Class__Group_1__1 )
            // InternalML2.g:2504:2: rule__ML2Class__Group_1__0__Impl rule__ML2Class__Group_1__1
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
    // InternalML2.g:2511:1: rule__ML2Class__Group_1__0__Impl : ( '{' ) ;
    public final void rule__ML2Class__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2515:1: ( ( '{' ) )
            // InternalML2.g:2516:1: ( '{' )
            {
            // InternalML2.g:2516:1: ( '{' )
            // InternalML2.g:2517:2: '{'
            {
             before(grammarAccess.getML2ClassAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalML2.g:2526:1: rule__ML2Class__Group_1__1 : rule__ML2Class__Group_1__1__Impl rule__ML2Class__Group_1__2 ;
    public final void rule__ML2Class__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2530:1: ( rule__ML2Class__Group_1__1__Impl rule__ML2Class__Group_1__2 )
            // InternalML2.g:2531:2: rule__ML2Class__Group_1__1__Impl rule__ML2Class__Group_1__2
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
    // InternalML2.g:2538:1: rule__ML2Class__Group_1__1__Impl : ( ( rule__ML2Class__Alternatives_1_1 )* ) ;
    public final void rule__ML2Class__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2542:1: ( ( ( rule__ML2Class__Alternatives_1_1 )* ) )
            // InternalML2.g:2543:1: ( ( rule__ML2Class__Alternatives_1_1 )* )
            {
            // InternalML2.g:2543:1: ( ( rule__ML2Class__Alternatives_1_1 )* )
            // InternalML2.g:2544:2: ( rule__ML2Class__Alternatives_1_1 )*
            {
             before(grammarAccess.getML2ClassAccess().getAlternatives_1_1()); 
            // InternalML2.g:2545:2: ( rule__ML2Class__Alternatives_1_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==49||LA37_0==54||LA37_0==56) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalML2.g:2545:3: rule__ML2Class__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ML2Class__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalML2.g:2553:1: rule__ML2Class__Group_1__2 : rule__ML2Class__Group_1__2__Impl ;
    public final void rule__ML2Class__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2557:1: ( rule__ML2Class__Group_1__2__Impl )
            // InternalML2.g:2558:2: rule__ML2Class__Group_1__2__Impl
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
    // InternalML2.g:2564:1: rule__ML2Class__Group_1__2__Impl : ( '}' ) ;
    public final void rule__ML2Class__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2568:1: ( ( '}' ) )
            // InternalML2.g:2569:1: ( '}' )
            {
            // InternalML2.g:2569:1: ( '}' )
            // InternalML2.g:2570:2: '}'
            {
             before(grammarAccess.getML2ClassAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalML2.g:2580:1: rule__SomeFOClass__Group__0 : rule__SomeFOClass__Group__0__Impl rule__SomeFOClass__Group__1 ;
    public final void rule__SomeFOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2584:1: ( rule__SomeFOClass__Group__0__Impl rule__SomeFOClass__Group__1 )
            // InternalML2.g:2585:2: rule__SomeFOClass__Group__0__Impl rule__SomeFOClass__Group__1
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
    // InternalML2.g:2592:1: rule__SomeFOClass__Group__0__Impl : ( ( rule__SomeFOClass__Alternatives_0 ) ) ;
    public final void rule__SomeFOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2596:1: ( ( ( rule__SomeFOClass__Alternatives_0 ) ) )
            // InternalML2.g:2597:1: ( ( rule__SomeFOClass__Alternatives_0 ) )
            {
            // InternalML2.g:2597:1: ( ( rule__SomeFOClass__Alternatives_0 ) )
            // InternalML2.g:2598:2: ( rule__SomeFOClass__Alternatives_0 )
            {
             before(grammarAccess.getSomeFOClassAccess().getAlternatives_0()); 
            // InternalML2.g:2599:2: ( rule__SomeFOClass__Alternatives_0 )
            // InternalML2.g:2599:3: rule__SomeFOClass__Alternatives_0
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
    // InternalML2.g:2607:1: rule__SomeFOClass__Group__1 : rule__SomeFOClass__Group__1__Impl rule__SomeFOClass__Group__2 ;
    public final void rule__SomeFOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2611:1: ( rule__SomeFOClass__Group__1__Impl rule__SomeFOClass__Group__2 )
            // InternalML2.g:2612:2: rule__SomeFOClass__Group__1__Impl rule__SomeFOClass__Group__2
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
    // InternalML2.g:2619:1: rule__SomeFOClass__Group__1__Impl : ( ( rule__SomeFOClass__Group_1__0 )? ) ;
    public final void rule__SomeFOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2623:1: ( ( ( rule__SomeFOClass__Group_1__0 )? ) )
            // InternalML2.g:2624:1: ( ( rule__SomeFOClass__Group_1__0 )? )
            {
            // InternalML2.g:2624:1: ( ( rule__SomeFOClass__Group_1__0 )? )
            // InternalML2.g:2625:2: ( rule__SomeFOClass__Group_1__0 )?
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_1()); 
            // InternalML2.g:2626:2: ( rule__SomeFOClass__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalML2.g:2626:3: rule__SomeFOClass__Group_1__0
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
    // InternalML2.g:2634:1: rule__SomeFOClass__Group__2 : rule__SomeFOClass__Group__2__Impl ;
    public final void rule__SomeFOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2638:1: ( rule__SomeFOClass__Group__2__Impl )
            // InternalML2.g:2639:2: rule__SomeFOClass__Group__2__Impl
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
    // InternalML2.g:2645:1: rule__SomeFOClass__Group__2__Impl : ( ( rule__SomeFOClass__Group_2__0 )? ) ;
    public final void rule__SomeFOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2649:1: ( ( ( rule__SomeFOClass__Group_2__0 )? ) )
            // InternalML2.g:2650:1: ( ( rule__SomeFOClass__Group_2__0 )? )
            {
            // InternalML2.g:2650:1: ( ( rule__SomeFOClass__Group_2__0 )? )
            // InternalML2.g:2651:2: ( rule__SomeFOClass__Group_2__0 )?
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_2()); 
            // InternalML2.g:2652:2: ( rule__SomeFOClass__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalML2.g:2652:3: rule__SomeFOClass__Group_2__0
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
    // InternalML2.g:2661:1: rule__SomeFOClass__Group_1__0 : rule__SomeFOClass__Group_1__0__Impl rule__SomeFOClass__Group_1__1 ;
    public final void rule__SomeFOClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2665:1: ( rule__SomeFOClass__Group_1__0__Impl rule__SomeFOClass__Group_1__1 )
            // InternalML2.g:2666:2: rule__SomeFOClass__Group_1__0__Impl rule__SomeFOClass__Group_1__1
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
    // InternalML2.g:2673:1: rule__SomeFOClass__Group_1__0__Impl : ( ':' ) ;
    public final void rule__SomeFOClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2677:1: ( ( ':' ) )
            // InternalML2.g:2678:1: ( ':' )
            {
            // InternalML2.g:2678:1: ( ':' )
            // InternalML2.g:2679:2: ':'
            {
             before(grammarAccess.getSomeFOClassAccess().getColonKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:2688:1: rule__SomeFOClass__Group_1__1 : rule__SomeFOClass__Group_1__1__Impl rule__SomeFOClass__Group_1__2 ;
    public final void rule__SomeFOClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2692:1: ( rule__SomeFOClass__Group_1__1__Impl rule__SomeFOClass__Group_1__2 )
            // InternalML2.g:2693:2: rule__SomeFOClass__Group_1__1__Impl rule__SomeFOClass__Group_1__2
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
    // InternalML2.g:2700:1: rule__SomeFOClass__Group_1__1__Impl : ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) ) ;
    public final void rule__SomeFOClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2704:1: ( ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) ) )
            // InternalML2.g:2705:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) )
            {
            // InternalML2.g:2705:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 ) )
            // InternalML2.g:2706:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesAssignment_1_1()); 
            // InternalML2.g:2707:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_1 )
            // InternalML2.g:2707:3: rule__SomeFOClass__InstantiatedClassesAssignment_1_1
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
    // InternalML2.g:2715:1: rule__SomeFOClass__Group_1__2 : rule__SomeFOClass__Group_1__2__Impl ;
    public final void rule__SomeFOClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2719:1: ( rule__SomeFOClass__Group_1__2__Impl )
            // InternalML2.g:2720:2: rule__SomeFOClass__Group_1__2__Impl
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
    // InternalML2.g:2726:1: rule__SomeFOClass__Group_1__2__Impl : ( ( rule__SomeFOClass__Group_1_2__0 )* ) ;
    public final void rule__SomeFOClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2730:1: ( ( ( rule__SomeFOClass__Group_1_2__0 )* ) )
            // InternalML2.g:2731:1: ( ( rule__SomeFOClass__Group_1_2__0 )* )
            {
            // InternalML2.g:2731:1: ( ( rule__SomeFOClass__Group_1_2__0 )* )
            // InternalML2.g:2732:2: ( rule__SomeFOClass__Group_1_2__0 )*
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_1_2()); 
            // InternalML2.g:2733:2: ( rule__SomeFOClass__Group_1_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalML2.g:2733:3: rule__SomeFOClass__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SomeFOClass__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalML2.g:2742:1: rule__SomeFOClass__Group_1_2__0 : rule__SomeFOClass__Group_1_2__0__Impl rule__SomeFOClass__Group_1_2__1 ;
    public final void rule__SomeFOClass__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2746:1: ( rule__SomeFOClass__Group_1_2__0__Impl rule__SomeFOClass__Group_1_2__1 )
            // InternalML2.g:2747:2: rule__SomeFOClass__Group_1_2__0__Impl rule__SomeFOClass__Group_1_2__1
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
    // InternalML2.g:2754:1: rule__SomeFOClass__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__SomeFOClass__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2758:1: ( ( ',' ) )
            // InternalML2.g:2759:1: ( ',' )
            {
            // InternalML2.g:2759:1: ( ',' )
            // InternalML2.g:2760:2: ','
            {
             before(grammarAccess.getSomeFOClassAccess().getCommaKeyword_1_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:2769:1: rule__SomeFOClass__Group_1_2__1 : rule__SomeFOClass__Group_1_2__1__Impl ;
    public final void rule__SomeFOClass__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2773:1: ( rule__SomeFOClass__Group_1_2__1__Impl )
            // InternalML2.g:2774:2: rule__SomeFOClass__Group_1_2__1__Impl
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
    // InternalML2.g:2780:1: rule__SomeFOClass__Group_1_2__1__Impl : ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) ) ;
    public final void rule__SomeFOClass__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2784:1: ( ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) ) )
            // InternalML2.g:2785:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            {
            // InternalML2.g:2785:1: ( ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            // InternalML2.g:2786:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesAssignment_1_2_1()); 
            // InternalML2.g:2787:2: ( rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 )
            // InternalML2.g:2787:3: rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1
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
    // InternalML2.g:2796:1: rule__SomeFOClass__Group_2__0 : rule__SomeFOClass__Group_2__0__Impl rule__SomeFOClass__Group_2__1 ;
    public final void rule__SomeFOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2800:1: ( rule__SomeFOClass__Group_2__0__Impl rule__SomeFOClass__Group_2__1 )
            // InternalML2.g:2801:2: rule__SomeFOClass__Group_2__0__Impl rule__SomeFOClass__Group_2__1
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
    // InternalML2.g:2808:1: rule__SomeFOClass__Group_2__0__Impl : ( 'specializes' ) ;
    public final void rule__SomeFOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2812:1: ( ( 'specializes' ) )
            // InternalML2.g:2813:1: ( 'specializes' )
            {
            // InternalML2.g:2813:1: ( 'specializes' )
            // InternalML2.g:2814:2: 'specializes'
            {
             before(grammarAccess.getSomeFOClassAccess().getSpecializesKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalML2.g:2823:1: rule__SomeFOClass__Group_2__1 : rule__SomeFOClass__Group_2__1__Impl rule__SomeFOClass__Group_2__2 ;
    public final void rule__SomeFOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2827:1: ( rule__SomeFOClass__Group_2__1__Impl rule__SomeFOClass__Group_2__2 )
            // InternalML2.g:2828:2: rule__SomeFOClass__Group_2__1__Impl rule__SomeFOClass__Group_2__2
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
    // InternalML2.g:2835:1: rule__SomeFOClass__Group_2__1__Impl : ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) ) ;
    public final void rule__SomeFOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2839:1: ( ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) ) )
            // InternalML2.g:2840:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) )
            {
            // InternalML2.g:2840:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_1 ) )
            // InternalML2.g:2841:2: ( rule__SomeFOClass__SuperClassesAssignment_2_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesAssignment_2_1()); 
            // InternalML2.g:2842:2: ( rule__SomeFOClass__SuperClassesAssignment_2_1 )
            // InternalML2.g:2842:3: rule__SomeFOClass__SuperClassesAssignment_2_1
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
    // InternalML2.g:2850:1: rule__SomeFOClass__Group_2__2 : rule__SomeFOClass__Group_2__2__Impl ;
    public final void rule__SomeFOClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2854:1: ( rule__SomeFOClass__Group_2__2__Impl )
            // InternalML2.g:2855:2: rule__SomeFOClass__Group_2__2__Impl
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
    // InternalML2.g:2861:1: rule__SomeFOClass__Group_2__2__Impl : ( ( rule__SomeFOClass__Group_2_2__0 )* ) ;
    public final void rule__SomeFOClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2865:1: ( ( ( rule__SomeFOClass__Group_2_2__0 )* ) )
            // InternalML2.g:2866:1: ( ( rule__SomeFOClass__Group_2_2__0 )* )
            {
            // InternalML2.g:2866:1: ( ( rule__SomeFOClass__Group_2_2__0 )* )
            // InternalML2.g:2867:2: ( rule__SomeFOClass__Group_2_2__0 )*
            {
             before(grammarAccess.getSomeFOClassAccess().getGroup_2_2()); 
            // InternalML2.g:2868:2: ( rule__SomeFOClass__Group_2_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==37) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalML2.g:2868:3: rule__SomeFOClass__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SomeFOClass__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalML2.g:2877:1: rule__SomeFOClass__Group_2_2__0 : rule__SomeFOClass__Group_2_2__0__Impl rule__SomeFOClass__Group_2_2__1 ;
    public final void rule__SomeFOClass__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2881:1: ( rule__SomeFOClass__Group_2_2__0__Impl rule__SomeFOClass__Group_2_2__1 )
            // InternalML2.g:2882:2: rule__SomeFOClass__Group_2_2__0__Impl rule__SomeFOClass__Group_2_2__1
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
    // InternalML2.g:2889:1: rule__SomeFOClass__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__SomeFOClass__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2893:1: ( ( ',' ) )
            // InternalML2.g:2894:1: ( ',' )
            {
            // InternalML2.g:2894:1: ( ',' )
            // InternalML2.g:2895:2: ','
            {
             before(grammarAccess.getSomeFOClassAccess().getCommaKeyword_2_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:2904:1: rule__SomeFOClass__Group_2_2__1 : rule__SomeFOClass__Group_2_2__1__Impl ;
    public final void rule__SomeFOClass__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2908:1: ( rule__SomeFOClass__Group_2_2__1__Impl )
            // InternalML2.g:2909:2: rule__SomeFOClass__Group_2_2__1__Impl
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
    // InternalML2.g:2915:1: rule__SomeFOClass__Group_2_2__1__Impl : ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) ) ;
    public final void rule__SomeFOClass__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2919:1: ( ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) ) )
            // InternalML2.g:2920:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) )
            {
            // InternalML2.g:2920:1: ( ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 ) )
            // InternalML2.g:2921:2: ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesAssignment_2_2_1()); 
            // InternalML2.g:2922:2: ( rule__SomeFOClass__SuperClassesAssignment_2_2_1 )
            // InternalML2.g:2922:3: rule__SomeFOClass__SuperClassesAssignment_2_2_1
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
    // InternalML2.g:2931:1: rule__NonFOClass__Group__0 : rule__NonFOClass__Group__0__Impl rule__NonFOClass__Group__1 ;
    public final void rule__NonFOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2935:1: ( rule__NonFOClass__Group__0__Impl rule__NonFOClass__Group__1 )
            // InternalML2.g:2936:2: rule__NonFOClass__Group__0__Impl rule__NonFOClass__Group__1
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
    // InternalML2.g:2943:1: rule__NonFOClass__Group__0__Impl : ( ( rule__NonFOClass__Alternatives_0 ) ) ;
    public final void rule__NonFOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2947:1: ( ( ( rule__NonFOClass__Alternatives_0 ) ) )
            // InternalML2.g:2948:1: ( ( rule__NonFOClass__Alternatives_0 ) )
            {
            // InternalML2.g:2948:1: ( ( rule__NonFOClass__Alternatives_0 ) )
            // InternalML2.g:2949:2: ( rule__NonFOClass__Alternatives_0 )
            {
             before(grammarAccess.getNonFOClassAccess().getAlternatives_0()); 
            // InternalML2.g:2950:2: ( rule__NonFOClass__Alternatives_0 )
            // InternalML2.g:2950:3: rule__NonFOClass__Alternatives_0
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
    // InternalML2.g:2958:1: rule__NonFOClass__Group__1 : rule__NonFOClass__Group__1__Impl rule__NonFOClass__Group__2 ;
    public final void rule__NonFOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2962:1: ( rule__NonFOClass__Group__1__Impl rule__NonFOClass__Group__2 )
            // InternalML2.g:2963:2: rule__NonFOClass__Group__1__Impl rule__NonFOClass__Group__2
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
    // InternalML2.g:2970:1: rule__NonFOClass__Group__1__Impl : ( ( rule__NonFOClass__Group_1__0 )? ) ;
    public final void rule__NonFOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2974:1: ( ( ( rule__NonFOClass__Group_1__0 )? ) )
            // InternalML2.g:2975:1: ( ( rule__NonFOClass__Group_1__0 )? )
            {
            // InternalML2.g:2975:1: ( ( rule__NonFOClass__Group_1__0 )? )
            // InternalML2.g:2976:2: ( rule__NonFOClass__Group_1__0 )?
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_1()); 
            // InternalML2.g:2977:2: ( rule__NonFOClass__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalML2.g:2977:3: rule__NonFOClass__Group_1__0
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
    // InternalML2.g:2985:1: rule__NonFOClass__Group__2 : rule__NonFOClass__Group__2__Impl rule__NonFOClass__Group__3 ;
    public final void rule__NonFOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:2989:1: ( rule__NonFOClass__Group__2__Impl rule__NonFOClass__Group__3 )
            // InternalML2.g:2990:2: rule__NonFOClass__Group__2__Impl rule__NonFOClass__Group__3
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
    // InternalML2.g:2997:1: rule__NonFOClass__Group__2__Impl : ( ( rule__NonFOClass__Group_2__0 )? ) ;
    public final void rule__NonFOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3001:1: ( ( ( rule__NonFOClass__Group_2__0 )? ) )
            // InternalML2.g:3002:1: ( ( rule__NonFOClass__Group_2__0 )? )
            {
            // InternalML2.g:3002:1: ( ( rule__NonFOClass__Group_2__0 )? )
            // InternalML2.g:3003:2: ( rule__NonFOClass__Group_2__0 )?
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_2()); 
            // InternalML2.g:3004:2: ( rule__NonFOClass__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalML2.g:3004:3: rule__NonFOClass__Group_2__0
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
    // InternalML2.g:3012:1: rule__NonFOClass__Group__3 : rule__NonFOClass__Group__3__Impl rule__NonFOClass__Group__4 ;
    public final void rule__NonFOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3016:1: ( rule__NonFOClass__Group__3__Impl rule__NonFOClass__Group__4 )
            // InternalML2.g:3017:2: rule__NonFOClass__Group__3__Impl rule__NonFOClass__Group__4
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
    // InternalML2.g:3024:1: rule__NonFOClass__Group__3__Impl : ( ( rule__NonFOClass__Group_3__0 )? ) ;
    public final void rule__NonFOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3028:1: ( ( ( rule__NonFOClass__Group_3__0 )? ) )
            // InternalML2.g:3029:1: ( ( rule__NonFOClass__Group_3__0 )? )
            {
            // InternalML2.g:3029:1: ( ( rule__NonFOClass__Group_3__0 )? )
            // InternalML2.g:3030:2: ( rule__NonFOClass__Group_3__0 )?
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_3()); 
            // InternalML2.g:3031:2: ( rule__NonFOClass__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalML2.g:3031:3: rule__NonFOClass__Group_3__0
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
    // InternalML2.g:3039:1: rule__NonFOClass__Group__4 : rule__NonFOClass__Group__4__Impl ;
    public final void rule__NonFOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3043:1: ( rule__NonFOClass__Group__4__Impl )
            // InternalML2.g:3044:2: rule__NonFOClass__Group__4__Impl
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
    // InternalML2.g:3050:1: rule__NonFOClass__Group__4__Impl : ( ( rule__NonFOClass__Alternatives_4 )? ) ;
    public final void rule__NonFOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3054:1: ( ( ( rule__NonFOClass__Alternatives_4 )? ) )
            // InternalML2.g:3055:1: ( ( rule__NonFOClass__Alternatives_4 )? )
            {
            // InternalML2.g:3055:1: ( ( rule__NonFOClass__Alternatives_4 )? )
            // InternalML2.g:3056:2: ( rule__NonFOClass__Alternatives_4 )?
            {
             before(grammarAccess.getNonFOClassAccess().getAlternatives_4()); 
            // InternalML2.g:3057:2: ( rule__NonFOClass__Alternatives_4 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=14 && LA45_0<=17)||LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalML2.g:3057:3: rule__NonFOClass__Alternatives_4
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
    // InternalML2.g:3066:1: rule__NonFOClass__Group_1__0 : rule__NonFOClass__Group_1__0__Impl rule__NonFOClass__Group_1__1 ;
    public final void rule__NonFOClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3070:1: ( rule__NonFOClass__Group_1__0__Impl rule__NonFOClass__Group_1__1 )
            // InternalML2.g:3071:2: rule__NonFOClass__Group_1__0__Impl rule__NonFOClass__Group_1__1
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
    // InternalML2.g:3078:1: rule__NonFOClass__Group_1__0__Impl : ( ':' ) ;
    public final void rule__NonFOClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3082:1: ( ( ':' ) )
            // InternalML2.g:3083:1: ( ':' )
            {
            // InternalML2.g:3083:1: ( ':' )
            // InternalML2.g:3084:2: ':'
            {
             before(grammarAccess.getNonFOClassAccess().getColonKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:3093:1: rule__NonFOClass__Group_1__1 : rule__NonFOClass__Group_1__1__Impl rule__NonFOClass__Group_1__2 ;
    public final void rule__NonFOClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3097:1: ( rule__NonFOClass__Group_1__1__Impl rule__NonFOClass__Group_1__2 )
            // InternalML2.g:3098:2: rule__NonFOClass__Group_1__1__Impl rule__NonFOClass__Group_1__2
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
    // InternalML2.g:3105:1: rule__NonFOClass__Group_1__1__Impl : ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) ) ;
    public final void rule__NonFOClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3109:1: ( ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) ) )
            // InternalML2.g:3110:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) )
            {
            // InternalML2.g:3110:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 ) )
            // InternalML2.g:3111:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesAssignment_1_1()); 
            // InternalML2.g:3112:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_1 )
            // InternalML2.g:3112:3: rule__NonFOClass__InstantiatedClassesAssignment_1_1
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
    // InternalML2.g:3120:1: rule__NonFOClass__Group_1__2 : rule__NonFOClass__Group_1__2__Impl ;
    public final void rule__NonFOClass__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3124:1: ( rule__NonFOClass__Group_1__2__Impl )
            // InternalML2.g:3125:2: rule__NonFOClass__Group_1__2__Impl
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
    // InternalML2.g:3131:1: rule__NonFOClass__Group_1__2__Impl : ( ( rule__NonFOClass__Group_1_2__0 )* ) ;
    public final void rule__NonFOClass__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3135:1: ( ( ( rule__NonFOClass__Group_1_2__0 )* ) )
            // InternalML2.g:3136:1: ( ( rule__NonFOClass__Group_1_2__0 )* )
            {
            // InternalML2.g:3136:1: ( ( rule__NonFOClass__Group_1_2__0 )* )
            // InternalML2.g:3137:2: ( rule__NonFOClass__Group_1_2__0 )*
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_1_2()); 
            // InternalML2.g:3138:2: ( rule__NonFOClass__Group_1_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==37) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalML2.g:3138:3: rule__NonFOClass__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NonFOClass__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalML2.g:3147:1: rule__NonFOClass__Group_1_2__0 : rule__NonFOClass__Group_1_2__0__Impl rule__NonFOClass__Group_1_2__1 ;
    public final void rule__NonFOClass__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3151:1: ( rule__NonFOClass__Group_1_2__0__Impl rule__NonFOClass__Group_1_2__1 )
            // InternalML2.g:3152:2: rule__NonFOClass__Group_1_2__0__Impl rule__NonFOClass__Group_1_2__1
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
    // InternalML2.g:3159:1: rule__NonFOClass__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__NonFOClass__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3163:1: ( ( ',' ) )
            // InternalML2.g:3164:1: ( ',' )
            {
            // InternalML2.g:3164:1: ( ',' )
            // InternalML2.g:3165:2: ','
            {
             before(grammarAccess.getNonFOClassAccess().getCommaKeyword_1_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:3174:1: rule__NonFOClass__Group_1_2__1 : rule__NonFOClass__Group_1_2__1__Impl ;
    public final void rule__NonFOClass__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3178:1: ( rule__NonFOClass__Group_1_2__1__Impl )
            // InternalML2.g:3179:2: rule__NonFOClass__Group_1_2__1__Impl
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
    // InternalML2.g:3185:1: rule__NonFOClass__Group_1_2__1__Impl : ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) ) ;
    public final void rule__NonFOClass__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3189:1: ( ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) ) )
            // InternalML2.g:3190:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            {
            // InternalML2.g:3190:1: ( ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 ) )
            // InternalML2.g:3191:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesAssignment_1_2_1()); 
            // InternalML2.g:3192:2: ( rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 )
            // InternalML2.g:3192:3: rule__NonFOClass__InstantiatedClassesAssignment_1_2_1
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
    // InternalML2.g:3201:1: rule__NonFOClass__Group_2__0 : rule__NonFOClass__Group_2__0__Impl rule__NonFOClass__Group_2__1 ;
    public final void rule__NonFOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3205:1: ( rule__NonFOClass__Group_2__0__Impl rule__NonFOClass__Group_2__1 )
            // InternalML2.g:3206:2: rule__NonFOClass__Group_2__0__Impl rule__NonFOClass__Group_2__1
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
    // InternalML2.g:3213:1: rule__NonFOClass__Group_2__0__Impl : ( 'specializes' ) ;
    public final void rule__NonFOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3217:1: ( ( 'specializes' ) )
            // InternalML2.g:3218:1: ( 'specializes' )
            {
            // InternalML2.g:3218:1: ( 'specializes' )
            // InternalML2.g:3219:2: 'specializes'
            {
             before(grammarAccess.getNonFOClassAccess().getSpecializesKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalML2.g:3228:1: rule__NonFOClass__Group_2__1 : rule__NonFOClass__Group_2__1__Impl rule__NonFOClass__Group_2__2 ;
    public final void rule__NonFOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3232:1: ( rule__NonFOClass__Group_2__1__Impl rule__NonFOClass__Group_2__2 )
            // InternalML2.g:3233:2: rule__NonFOClass__Group_2__1__Impl rule__NonFOClass__Group_2__2
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
    // InternalML2.g:3240:1: rule__NonFOClass__Group_2__1__Impl : ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) ) ;
    public final void rule__NonFOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3244:1: ( ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) ) )
            // InternalML2.g:3245:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) )
            {
            // InternalML2.g:3245:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_1 ) )
            // InternalML2.g:3246:2: ( rule__NonFOClass__SuperClassesAssignment_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesAssignment_2_1()); 
            // InternalML2.g:3247:2: ( rule__NonFOClass__SuperClassesAssignment_2_1 )
            // InternalML2.g:3247:3: rule__NonFOClass__SuperClassesAssignment_2_1
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
    // InternalML2.g:3255:1: rule__NonFOClass__Group_2__2 : rule__NonFOClass__Group_2__2__Impl ;
    public final void rule__NonFOClass__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3259:1: ( rule__NonFOClass__Group_2__2__Impl )
            // InternalML2.g:3260:2: rule__NonFOClass__Group_2__2__Impl
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
    // InternalML2.g:3266:1: rule__NonFOClass__Group_2__2__Impl : ( ( rule__NonFOClass__Group_2_2__0 )* ) ;
    public final void rule__NonFOClass__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3270:1: ( ( ( rule__NonFOClass__Group_2_2__0 )* ) )
            // InternalML2.g:3271:1: ( ( rule__NonFOClass__Group_2_2__0 )* )
            {
            // InternalML2.g:3271:1: ( ( rule__NonFOClass__Group_2_2__0 )* )
            // InternalML2.g:3272:2: ( rule__NonFOClass__Group_2_2__0 )*
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_2_2()); 
            // InternalML2.g:3273:2: ( rule__NonFOClass__Group_2_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==37) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalML2.g:3273:3: rule__NonFOClass__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NonFOClass__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalML2.g:3282:1: rule__NonFOClass__Group_2_2__0 : rule__NonFOClass__Group_2_2__0__Impl rule__NonFOClass__Group_2_2__1 ;
    public final void rule__NonFOClass__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3286:1: ( rule__NonFOClass__Group_2_2__0__Impl rule__NonFOClass__Group_2_2__1 )
            // InternalML2.g:3287:2: rule__NonFOClass__Group_2_2__0__Impl rule__NonFOClass__Group_2_2__1
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
    // InternalML2.g:3294:1: rule__NonFOClass__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__NonFOClass__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3298:1: ( ( ',' ) )
            // InternalML2.g:3299:1: ( ',' )
            {
            // InternalML2.g:3299:1: ( ',' )
            // InternalML2.g:3300:2: ','
            {
             before(grammarAccess.getNonFOClassAccess().getCommaKeyword_2_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:3309:1: rule__NonFOClass__Group_2_2__1 : rule__NonFOClass__Group_2_2__1__Impl ;
    public final void rule__NonFOClass__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3313:1: ( rule__NonFOClass__Group_2_2__1__Impl )
            // InternalML2.g:3314:2: rule__NonFOClass__Group_2_2__1__Impl
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
    // InternalML2.g:3320:1: rule__NonFOClass__Group_2_2__1__Impl : ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) ) ;
    public final void rule__NonFOClass__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3324:1: ( ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) ) )
            // InternalML2.g:3325:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) )
            {
            // InternalML2.g:3325:1: ( ( rule__NonFOClass__SuperClassesAssignment_2_2_1 ) )
            // InternalML2.g:3326:2: ( rule__NonFOClass__SuperClassesAssignment_2_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesAssignment_2_2_1()); 
            // InternalML2.g:3327:2: ( rule__NonFOClass__SuperClassesAssignment_2_2_1 )
            // InternalML2.g:3327:3: rule__NonFOClass__SuperClassesAssignment_2_2_1
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
    // InternalML2.g:3336:1: rule__NonFOClass__Group_3__0 : rule__NonFOClass__Group_3__0__Impl rule__NonFOClass__Group_3__1 ;
    public final void rule__NonFOClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3340:1: ( rule__NonFOClass__Group_3__0__Impl rule__NonFOClass__Group_3__1 )
            // InternalML2.g:3341:2: rule__NonFOClass__Group_3__0__Impl rule__NonFOClass__Group_3__1
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
    // InternalML2.g:3348:1: rule__NonFOClass__Group_3__0__Impl : ( 'subordinatedTo' ) ;
    public final void rule__NonFOClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3352:1: ( ( 'subordinatedTo' ) )
            // InternalML2.g:3353:1: ( 'subordinatedTo' )
            {
            // InternalML2.g:3353:1: ( 'subordinatedTo' )
            // InternalML2.g:3354:2: 'subordinatedTo'
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatedToKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalML2.g:3363:1: rule__NonFOClass__Group_3__1 : rule__NonFOClass__Group_3__1__Impl rule__NonFOClass__Group_3__2 ;
    public final void rule__NonFOClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3367:1: ( rule__NonFOClass__Group_3__1__Impl rule__NonFOClass__Group_3__2 )
            // InternalML2.g:3368:2: rule__NonFOClass__Group_3__1__Impl rule__NonFOClass__Group_3__2
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
    // InternalML2.g:3375:1: rule__NonFOClass__Group_3__1__Impl : ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) ) ;
    public final void rule__NonFOClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3379:1: ( ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) ) )
            // InternalML2.g:3380:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) )
            {
            // InternalML2.g:3380:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_1 ) )
            // InternalML2.g:3381:2: ( rule__NonFOClass__SubordinatorsAssignment_3_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsAssignment_3_1()); 
            // InternalML2.g:3382:2: ( rule__NonFOClass__SubordinatorsAssignment_3_1 )
            // InternalML2.g:3382:3: rule__NonFOClass__SubordinatorsAssignment_3_1
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
    // InternalML2.g:3390:1: rule__NonFOClass__Group_3__2 : rule__NonFOClass__Group_3__2__Impl ;
    public final void rule__NonFOClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3394:1: ( rule__NonFOClass__Group_3__2__Impl )
            // InternalML2.g:3395:2: rule__NonFOClass__Group_3__2__Impl
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
    // InternalML2.g:3401:1: rule__NonFOClass__Group_3__2__Impl : ( ( rule__NonFOClass__Group_3_2__0 )* ) ;
    public final void rule__NonFOClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3405:1: ( ( ( rule__NonFOClass__Group_3_2__0 )* ) )
            // InternalML2.g:3406:1: ( ( rule__NonFOClass__Group_3_2__0 )* )
            {
            // InternalML2.g:3406:1: ( ( rule__NonFOClass__Group_3_2__0 )* )
            // InternalML2.g:3407:2: ( rule__NonFOClass__Group_3_2__0 )*
            {
             before(grammarAccess.getNonFOClassAccess().getGroup_3_2()); 
            // InternalML2.g:3408:2: ( rule__NonFOClass__Group_3_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==37) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalML2.g:3408:3: rule__NonFOClass__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NonFOClass__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalML2.g:3417:1: rule__NonFOClass__Group_3_2__0 : rule__NonFOClass__Group_3_2__0__Impl rule__NonFOClass__Group_3_2__1 ;
    public final void rule__NonFOClass__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3421:1: ( rule__NonFOClass__Group_3_2__0__Impl rule__NonFOClass__Group_3_2__1 )
            // InternalML2.g:3422:2: rule__NonFOClass__Group_3_2__0__Impl rule__NonFOClass__Group_3_2__1
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
    // InternalML2.g:3429:1: rule__NonFOClass__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__NonFOClass__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3433:1: ( ( ',' ) )
            // InternalML2.g:3434:1: ( ',' )
            {
            // InternalML2.g:3434:1: ( ',' )
            // InternalML2.g:3435:2: ','
            {
             before(grammarAccess.getNonFOClassAccess().getCommaKeyword_3_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:3444:1: rule__NonFOClass__Group_3_2__1 : rule__NonFOClass__Group_3_2__1__Impl ;
    public final void rule__NonFOClass__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3448:1: ( rule__NonFOClass__Group_3_2__1__Impl )
            // InternalML2.g:3449:2: rule__NonFOClass__Group_3_2__1__Impl
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
    // InternalML2.g:3455:1: rule__NonFOClass__Group_3_2__1__Impl : ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) ) ;
    public final void rule__NonFOClass__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3459:1: ( ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) ) )
            // InternalML2.g:3460:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) )
            {
            // InternalML2.g:3460:1: ( ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 ) )
            // InternalML2.g:3461:2: ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsAssignment_3_2_1()); 
            // InternalML2.g:3462:2: ( rule__NonFOClass__SubordinatorsAssignment_3_2_1 )
            // InternalML2.g:3462:3: rule__NonFOClass__SubordinatorsAssignment_3_2_1
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
    // InternalML2.g:3471:1: rule__NonFOClass__Group_4_0__0 : rule__NonFOClass__Group_4_0__0__Impl rule__NonFOClass__Group_4_0__1 ;
    public final void rule__NonFOClass__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3475:1: ( rule__NonFOClass__Group_4_0__0__Impl rule__NonFOClass__Group_4_0__1 )
            // InternalML2.g:3476:2: rule__NonFOClass__Group_4_0__0__Impl rule__NonFOClass__Group_4_0__1
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
    // InternalML2.g:3483:1: rule__NonFOClass__Group_4_0__0__Impl : ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) ) ;
    public final void rule__NonFOClass__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3487:1: ( ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) ) )
            // InternalML2.g:3488:1: ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) )
            {
            // InternalML2.g:3488:1: ( ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 ) )
            // InternalML2.g:3489:2: ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 )
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizationTypeAssignment_4_0_0()); 
            // InternalML2.g:3490:2: ( rule__NonFOClass__CategorizationTypeAssignment_4_0_0 )
            // InternalML2.g:3490:3: rule__NonFOClass__CategorizationTypeAssignment_4_0_0
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
    // InternalML2.g:3498:1: rule__NonFOClass__Group_4_0__1 : rule__NonFOClass__Group_4_0__1__Impl ;
    public final void rule__NonFOClass__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3502:1: ( rule__NonFOClass__Group_4_0__1__Impl )
            // InternalML2.g:3503:2: rule__NonFOClass__Group_4_0__1__Impl
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
    // InternalML2.g:3509:1: rule__NonFOClass__Group_4_0__1__Impl : ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) ) ;
    public final void rule__NonFOClass__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3513:1: ( ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) ) )
            // InternalML2.g:3514:1: ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) )
            {
            // InternalML2.g:3514:1: ( ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 ) )
            // InternalML2.g:3515:2: ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizedClassAssignment_4_0_1()); 
            // InternalML2.g:3516:2: ( rule__NonFOClass__CategorizedClassAssignment_4_0_1 )
            // InternalML2.g:3516:3: rule__NonFOClass__CategorizedClassAssignment_4_0_1
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
    // InternalML2.g:3525:1: rule__NonFOClass__Group_4_1__0 : rule__NonFOClass__Group_4_1__0__Impl rule__NonFOClass__Group_4_1__1 ;
    public final void rule__NonFOClass__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3529:1: ( rule__NonFOClass__Group_4_1__0__Impl rule__NonFOClass__Group_4_1__1 )
            // InternalML2.g:3530:2: rule__NonFOClass__Group_4_1__0__Impl rule__NonFOClass__Group_4_1__1
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
    // InternalML2.g:3537:1: rule__NonFOClass__Group_4_1__0__Impl : ( 'isPowertypeOf' ) ;
    public final void rule__NonFOClass__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3541:1: ( ( 'isPowertypeOf' ) )
            // InternalML2.g:3542:1: ( 'isPowertypeOf' )
            {
            // InternalML2.g:3542:1: ( 'isPowertypeOf' )
            // InternalML2.g:3543:2: 'isPowertypeOf'
            {
             before(grammarAccess.getNonFOClassAccess().getIsPowertypeOfKeyword_4_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalML2.g:3552:1: rule__NonFOClass__Group_4_1__1 : rule__NonFOClass__Group_4_1__1__Impl ;
    public final void rule__NonFOClass__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3556:1: ( rule__NonFOClass__Group_4_1__1__Impl )
            // InternalML2.g:3557:2: rule__NonFOClass__Group_4_1__1__Impl
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
    // InternalML2.g:3563:1: rule__NonFOClass__Group_4_1__1__Impl : ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) ) ;
    public final void rule__NonFOClass__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3567:1: ( ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) ) )
            // InternalML2.g:3568:1: ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) )
            {
            // InternalML2.g:3568:1: ( ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 ) )
            // InternalML2.g:3569:2: ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 )
            {
             before(grammarAccess.getNonFOClassAccess().getPowertypeOfAssignment_4_1_1()); 
            // InternalML2.g:3570:2: ( rule__NonFOClass__PowertypeOfAssignment_4_1_1 )
            // InternalML2.g:3570:3: rule__NonFOClass__PowertypeOfAssignment_4_1_1
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
    // InternalML2.g:3579:1: rule__FOClass__Group__0 : rule__FOClass__Group__0__Impl rule__FOClass__Group__1 ;
    public final void rule__FOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3583:1: ( rule__FOClass__Group__0__Impl rule__FOClass__Group__1 )
            // InternalML2.g:3584:2: rule__FOClass__Group__0__Impl rule__FOClass__Group__1
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
    // InternalML2.g:3591:1: rule__FOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__FOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3595:1: ( ( 'class' ) )
            // InternalML2.g:3596:1: ( 'class' )
            {
            // InternalML2.g:3596:1: ( 'class' )
            // InternalML2.g:3597:2: 'class'
            {
             before(grammarAccess.getFOClassAccess().getClassKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalML2.g:3606:1: rule__FOClass__Group__1 : rule__FOClass__Group__1__Impl ;
    public final void rule__FOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3610:1: ( rule__FOClass__Group__1__Impl )
            // InternalML2.g:3611:2: rule__FOClass__Group__1__Impl
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
    // InternalML2.g:3617:1: rule__FOClass__Group__1__Impl : ( ( rule__FOClass__NameAssignment_1 ) ) ;
    public final void rule__FOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3621:1: ( ( ( rule__FOClass__NameAssignment_1 ) ) )
            // InternalML2.g:3622:1: ( ( rule__FOClass__NameAssignment_1 ) )
            {
            // InternalML2.g:3622:1: ( ( rule__FOClass__NameAssignment_1 ) )
            // InternalML2.g:3623:2: ( rule__FOClass__NameAssignment_1 )
            {
             before(grammarAccess.getFOClassAccess().getNameAssignment_1()); 
            // InternalML2.g:3624:2: ( rule__FOClass__NameAssignment_1 )
            // InternalML2.g:3624:3: rule__FOClass__NameAssignment_1
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
    // InternalML2.g:3633:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3637:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalML2.g:3638:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalML2.g:3645:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3649:1: ( ( 'datatype' ) )
            // InternalML2.g:3650:1: ( 'datatype' )
            {
            // InternalML2.g:3650:1: ( 'datatype' )
            // InternalML2.g:3651:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalML2.g:3660:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3664:1: ( rule__DataType__Group__1__Impl )
            // InternalML2.g:3665:2: rule__DataType__Group__1__Impl
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
    // InternalML2.g:3671:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3675:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalML2.g:3676:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalML2.g:3676:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalML2.g:3677:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalML2.g:3678:2: ( rule__DataType__NameAssignment_1 )
            // InternalML2.g:3678:3: rule__DataType__NameAssignment_1
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
    // InternalML2.g:3687:1: rule__HOClass__Group__0 : rule__HOClass__Group__0__Impl rule__HOClass__Group__1 ;
    public final void rule__HOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3691:1: ( rule__HOClass__Group__0__Impl rule__HOClass__Group__1 )
            // InternalML2.g:3692:2: rule__HOClass__Group__0__Impl rule__HOClass__Group__1
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
    // InternalML2.g:3699:1: rule__HOClass__Group__0__Impl : ( 'order' ) ;
    public final void rule__HOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3703:1: ( ( 'order' ) )
            // InternalML2.g:3704:1: ( 'order' )
            {
            // InternalML2.g:3704:1: ( 'order' )
            // InternalML2.g:3705:2: 'order'
            {
             before(grammarAccess.getHOClassAccess().getOrderKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalML2.g:3714:1: rule__HOClass__Group__1 : rule__HOClass__Group__1__Impl rule__HOClass__Group__2 ;
    public final void rule__HOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3718:1: ( rule__HOClass__Group__1__Impl rule__HOClass__Group__2 )
            // InternalML2.g:3719:2: rule__HOClass__Group__1__Impl rule__HOClass__Group__2
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
    // InternalML2.g:3726:1: rule__HOClass__Group__1__Impl : ( ( rule__HOClass__OrderAssignment_1 ) ) ;
    public final void rule__HOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3730:1: ( ( ( rule__HOClass__OrderAssignment_1 ) ) )
            // InternalML2.g:3731:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            {
            // InternalML2.g:3731:1: ( ( rule__HOClass__OrderAssignment_1 ) )
            // InternalML2.g:3732:2: ( rule__HOClass__OrderAssignment_1 )
            {
             before(grammarAccess.getHOClassAccess().getOrderAssignment_1()); 
            // InternalML2.g:3733:2: ( rule__HOClass__OrderAssignment_1 )
            // InternalML2.g:3733:3: rule__HOClass__OrderAssignment_1
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
    // InternalML2.g:3741:1: rule__HOClass__Group__2 : rule__HOClass__Group__2__Impl rule__HOClass__Group__3 ;
    public final void rule__HOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3745:1: ( rule__HOClass__Group__2__Impl rule__HOClass__Group__3 )
            // InternalML2.g:3746:2: rule__HOClass__Group__2__Impl rule__HOClass__Group__3
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
    // InternalML2.g:3753:1: rule__HOClass__Group__2__Impl : ( 'class' ) ;
    public final void rule__HOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3757:1: ( ( 'class' ) )
            // InternalML2.g:3758:1: ( 'class' )
            {
            // InternalML2.g:3758:1: ( 'class' )
            // InternalML2.g:3759:2: 'class'
            {
             before(grammarAccess.getHOClassAccess().getClassKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalML2.g:3768:1: rule__HOClass__Group__3 : rule__HOClass__Group__3__Impl ;
    public final void rule__HOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3772:1: ( rule__HOClass__Group__3__Impl )
            // InternalML2.g:3773:2: rule__HOClass__Group__3__Impl
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
    // InternalML2.g:3779:1: rule__HOClass__Group__3__Impl : ( ( rule__HOClass__NameAssignment_3 ) ) ;
    public final void rule__HOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3783:1: ( ( ( rule__HOClass__NameAssignment_3 ) ) )
            // InternalML2.g:3784:1: ( ( rule__HOClass__NameAssignment_3 ) )
            {
            // InternalML2.g:3784:1: ( ( rule__HOClass__NameAssignment_3 ) )
            // InternalML2.g:3785:2: ( rule__HOClass__NameAssignment_3 )
            {
             before(grammarAccess.getHOClassAccess().getNameAssignment_3()); 
            // InternalML2.g:3786:2: ( rule__HOClass__NameAssignment_3 )
            // InternalML2.g:3786:3: rule__HOClass__NameAssignment_3
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
    // InternalML2.g:3795:1: rule__OrderlessClass__Group__0 : rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 ;
    public final void rule__OrderlessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3799:1: ( rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1 )
            // InternalML2.g:3800:2: rule__OrderlessClass__Group__0__Impl rule__OrderlessClass__Group__1
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
    // InternalML2.g:3807:1: rule__OrderlessClass__Group__0__Impl : ( 'orderless' ) ;
    public final void rule__OrderlessClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3811:1: ( ( 'orderless' ) )
            // InternalML2.g:3812:1: ( 'orderless' )
            {
            // InternalML2.g:3812:1: ( 'orderless' )
            // InternalML2.g:3813:2: 'orderless'
            {
             before(grammarAccess.getOrderlessClassAccess().getOrderlessKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalML2.g:3822:1: rule__OrderlessClass__Group__1 : rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 ;
    public final void rule__OrderlessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3826:1: ( rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2 )
            // InternalML2.g:3827:2: rule__OrderlessClass__Group__1__Impl rule__OrderlessClass__Group__2
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
    // InternalML2.g:3834:1: rule__OrderlessClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__OrderlessClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3838:1: ( ( 'class' ) )
            // InternalML2.g:3839:1: ( 'class' )
            {
            // InternalML2.g:3839:1: ( 'class' )
            // InternalML2.g:3840:2: 'class'
            {
             before(grammarAccess.getOrderlessClassAccess().getClassKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalML2.g:3849:1: rule__OrderlessClass__Group__2 : rule__OrderlessClass__Group__2__Impl ;
    public final void rule__OrderlessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3853:1: ( rule__OrderlessClass__Group__2__Impl )
            // InternalML2.g:3854:2: rule__OrderlessClass__Group__2__Impl
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
    // InternalML2.g:3860:1: rule__OrderlessClass__Group__2__Impl : ( ( rule__OrderlessClass__NameAssignment_2 ) ) ;
    public final void rule__OrderlessClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3864:1: ( ( ( rule__OrderlessClass__NameAssignment_2 ) ) )
            // InternalML2.g:3865:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            {
            // InternalML2.g:3865:1: ( ( rule__OrderlessClass__NameAssignment_2 ) )
            // InternalML2.g:3866:2: ( rule__OrderlessClass__NameAssignment_2 )
            {
             before(grammarAccess.getOrderlessClassAccess().getNameAssignment_2()); 
            // InternalML2.g:3867:2: ( rule__OrderlessClass__NameAssignment_2 )
            // InternalML2.g:3867:3: rule__OrderlessClass__NameAssignment_2
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
    // InternalML2.g:3876:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3880:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalML2.g:3881:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
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
    // InternalML2.g:3888:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3892:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) )
            // InternalML2.g:3893:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            {
            // InternalML2.g:3893:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            // InternalML2.g:3894:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0()); 
            // InternalML2.g:3895:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            // InternalML2.g:3895:3: rule__GeneralizationSet__UnorderedGroup_0
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
    // InternalML2.g:3903:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3907:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalML2.g:3908:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
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
    // InternalML2.g:3915:1: rule__GeneralizationSet__Group__1__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3919:1: ( ( 'genset' ) )
            // InternalML2.g:3920:1: ( 'genset' )
            {
            // InternalML2.g:3920:1: ( 'genset' )
            // InternalML2.g:3921:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalML2.g:3930:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3934:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalML2.g:3935:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
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
    // InternalML2.g:3942:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3946:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalML2.g:3947:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalML2.g:3947:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalML2.g:3948:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalML2.g:3949:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalML2.g:3949:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalML2.g:3957:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3961:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalML2.g:3962:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
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
    // InternalML2.g:3969:1: rule__GeneralizationSet__Group__3__Impl : ( 'general' ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3973:1: ( ( 'general' ) )
            // InternalML2.g:3974:1: ( 'general' )
            {
            // InternalML2.g:3974:1: ( 'general' )
            // InternalML2.g:3975:2: 'general'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalML2.g:3984:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:3988:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalML2.g:3989:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
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
    // InternalML2.g:3996:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4000:1: ( ( ( rule__GeneralizationSet__GeneralAssignment_4 ) ) )
            // InternalML2.g:4001:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            {
            // InternalML2.g:4001:1: ( ( rule__GeneralizationSet__GeneralAssignment_4 ) )
            // InternalML2.g:4002:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralAssignment_4()); 
            // InternalML2.g:4003:2: ( rule__GeneralizationSet__GeneralAssignment_4 )
            // InternalML2.g:4003:3: rule__GeneralizationSet__GeneralAssignment_4
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
    // InternalML2.g:4011:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4015:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalML2.g:4016:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
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
    // InternalML2.g:4023:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__Group_5__0 )? ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4027:1: ( ( ( rule__GeneralizationSet__Group_5__0 )? ) )
            // InternalML2.g:4028:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            {
            // InternalML2.g:4028:1: ( ( rule__GeneralizationSet__Group_5__0 )? )
            // InternalML2.g:4029:2: ( rule__GeneralizationSet__Group_5__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_5()); 
            // InternalML2.g:4030:2: ( rule__GeneralizationSet__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalML2.g:4030:3: rule__GeneralizationSet__Group_5__0
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
    // InternalML2.g:4038:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4042:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalML2.g:4043:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
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
    // InternalML2.g:4050:1: rule__GeneralizationSet__Group__6__Impl : ( 'specifics' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4054:1: ( ( 'specifics' ) )
            // InternalML2.g:4055:1: ( 'specifics' )
            {
            // InternalML2.g:4055:1: ( 'specifics' )
            // InternalML2.g:4056:2: 'specifics'
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsKeyword_6()); 
            match(input,47,FOLLOW_2); 
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
    // InternalML2.g:4065:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4069:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalML2.g:4070:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
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
    // InternalML2.g:4077:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4081:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) ) )
            // InternalML2.g:4082:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            {
            // InternalML2.g:4082:1: ( ( rule__GeneralizationSet__SpecificsAssignment_7 ) )
            // InternalML2.g:4083:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_7()); 
            // InternalML2.g:4084:2: ( rule__GeneralizationSet__SpecificsAssignment_7 )
            // InternalML2.g:4084:3: rule__GeneralizationSet__SpecificsAssignment_7
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
    // InternalML2.g:4092:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4096:1: ( rule__GeneralizationSet__Group__8__Impl )
            // InternalML2.g:4097:2: rule__GeneralizationSet__Group__8__Impl
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
    // InternalML2.g:4103:1: rule__GeneralizationSet__Group__8__Impl : ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4107:1: ( ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) ) )
            // InternalML2.g:4108:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            {
            // InternalML2.g:4108:1: ( ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalML2.g:4109:2: ( ( rule__GeneralizationSet__Group_8__0 ) ) ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalML2.g:4109:2: ( ( rule__GeneralizationSet__Group_8__0 ) )
            // InternalML2.g:4110:3: ( rule__GeneralizationSet__Group_8__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalML2.g:4111:3: ( rule__GeneralizationSet__Group_8__0 )
            // InternalML2.g:4111:4: rule__GeneralizationSet__Group_8__0
            {
            pushFollow(FOLLOW_13);
            rule__GeneralizationSet__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

            }

            // InternalML2.g:4114:2: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalML2.g:4115:3: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalML2.g:4116:3: ( rule__GeneralizationSet__Group_8__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==37) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalML2.g:4116:4: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalML2.g:4126:1: rule__GeneralizationSet__Group_5__0 : rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 ;
    public final void rule__GeneralizationSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4130:1: ( rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1 )
            // InternalML2.g:4131:2: rule__GeneralizationSet__Group_5__0__Impl rule__GeneralizationSet__Group_5__1
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
    // InternalML2.g:4138:1: rule__GeneralizationSet__Group_5__0__Impl : ( 'categorizer' ) ;
    public final void rule__GeneralizationSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4142:1: ( ( 'categorizer' ) )
            // InternalML2.g:4143:1: ( 'categorizer' )
            {
            // InternalML2.g:4143:1: ( 'categorizer' )
            // InternalML2.g:4144:2: 'categorizer'
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerKeyword_5_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalML2.g:4153:1: rule__GeneralizationSet__Group_5__1 : rule__GeneralizationSet__Group_5__1__Impl ;
    public final void rule__GeneralizationSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4157:1: ( rule__GeneralizationSet__Group_5__1__Impl )
            // InternalML2.g:4158:2: rule__GeneralizationSet__Group_5__1__Impl
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
    // InternalML2.g:4164:1: rule__GeneralizationSet__Group_5__1__Impl : ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) ;
    public final void rule__GeneralizationSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4168:1: ( ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) ) )
            // InternalML2.g:4169:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            {
            // InternalML2.g:4169:1: ( ( rule__GeneralizationSet__CategorizerAssignment_5_1 ) )
            // InternalML2.g:4170:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerAssignment_5_1()); 
            // InternalML2.g:4171:2: ( rule__GeneralizationSet__CategorizerAssignment_5_1 )
            // InternalML2.g:4171:3: rule__GeneralizationSet__CategorizerAssignment_5_1
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
    // InternalML2.g:4180:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4184:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalML2.g:4185:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
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
    // InternalML2.g:4192:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4196:1: ( ( ',' ) )
            // InternalML2.g:4197:1: ( ',' )
            {
            // InternalML2.g:4197:1: ( ',' )
            // InternalML2.g:4198:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:4207:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4211:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalML2.g:4212:2: rule__GeneralizationSet__Group_8__1__Impl
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
    // InternalML2.g:4218:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4222:1: ( ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) ) )
            // InternalML2.g:4223:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            {
            // InternalML2.g:4223:1: ( ( rule__GeneralizationSet__SpecificsAssignment_8_1 ) )
            // InternalML2.g:4224:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsAssignment_8_1()); 
            // InternalML2.g:4225:2: ( rule__GeneralizationSet__SpecificsAssignment_8_1 )
            // InternalML2.g:4225:3: rule__GeneralizationSet__SpecificsAssignment_8_1
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
    // InternalML2.g:4234:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4238:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalML2.g:4239:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalML2.g:4246:1: rule__Attribute__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4250:1: ( ( ( 'att' )? ) )
            // InternalML2.g:4251:1: ( ( 'att' )? )
            {
            // InternalML2.g:4251:1: ( ( 'att' )? )
            // InternalML2.g:4252:2: ( 'att' )?
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            // InternalML2.g:4253:2: ( 'att' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalML2.g:4253:3: 'att'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalML2.g:4261:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4265:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalML2.g:4266:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalML2.g:4273:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4277:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalML2.g:4278:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalML2.g:4278:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalML2.g:4279:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalML2.g:4280:2: ( rule__Attribute__NameAssignment_1 )
            // InternalML2.g:4280:3: rule__Attribute__NameAssignment_1
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
    // InternalML2.g:4288:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4292:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalML2.g:4293:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalML2.g:4300:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4304:1: ( ( ':' ) )
            // InternalML2.g:4305:1: ( ':' )
            {
            // InternalML2.g:4305:1: ( ':' )
            // InternalML2.g:4306:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:4315:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4319:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalML2.g:4320:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalML2.g:4327:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4331:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalML2.g:4332:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalML2.g:4332:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalML2.g:4333:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalML2.g:4334:2: ( rule__Attribute__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalML2.g:4334:3: rule__Attribute__Group_3__0
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
    // InternalML2.g:4342:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4346:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalML2.g:4347:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalML2.g:4354:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Alternatives_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4358:1: ( ( ( rule__Attribute__Alternatives_4 ) ) )
            // InternalML2.g:4359:1: ( ( rule__Attribute__Alternatives_4 ) )
            {
            // InternalML2.g:4359:1: ( ( rule__Attribute__Alternatives_4 ) )
            // InternalML2.g:4360:2: ( rule__Attribute__Alternatives_4 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_4()); 
            // InternalML2.g:4361:2: ( rule__Attribute__Alternatives_4 )
            // InternalML2.g:4361:3: rule__Attribute__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalML2.g:4369:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4373:1: ( rule__Attribute__Group__5__Impl )
            // InternalML2.g:4374:2: rule__Attribute__Group__5__Impl
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
    // InternalML2.g:4380:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4384:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalML2.g:4385:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalML2.g:4385:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalML2.g:4386:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalML2.g:4387:2: ( rule__Attribute__Group_5__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalML2.g:4387:3: rule__Attribute__Group_5__0
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
    // InternalML2.g:4396:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4400:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalML2.g:4401:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
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
    // InternalML2.g:4408:1: rule__Attribute__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4412:1: ( ( '[' ) )
            // InternalML2.g:4413:1: ( '[' )
            {
            // InternalML2.g:4413:1: ( '[' )
            // InternalML2.g:4414:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalML2.g:4423:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4427:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalML2.g:4428:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
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
    // InternalML2.g:4435:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4439:1: ( ( ( rule__Attribute__LowerBoundAssignment_3_1 ) ) )
            // InternalML2.g:4440:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            {
            // InternalML2.g:4440:1: ( ( rule__Attribute__LowerBoundAssignment_3_1 ) )
            // InternalML2.g:4441:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getLowerBoundAssignment_3_1()); 
            // InternalML2.g:4442:2: ( rule__Attribute__LowerBoundAssignment_3_1 )
            // InternalML2.g:4442:3: rule__Attribute__LowerBoundAssignment_3_1
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
    // InternalML2.g:4450:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4454:1: ( rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3 )
            // InternalML2.g:4455:2: rule__Attribute__Group_3__2__Impl rule__Attribute__Group_3__3
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
    // InternalML2.g:4462:1: rule__Attribute__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4466:1: ( ( '..' ) )
            // InternalML2.g:4467:1: ( '..' )
            {
            // InternalML2.g:4467:1: ( '..' )
            // InternalML2.g:4468:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalML2.g:4477:1: rule__Attribute__Group_3__3 : rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 ;
    public final void rule__Attribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4481:1: ( rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4 )
            // InternalML2.g:4482:2: rule__Attribute__Group_3__3__Impl rule__Attribute__Group_3__4
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
    // InternalML2.g:4489:1: rule__Attribute__Group_3__3__Impl : ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Attribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4493:1: ( ( ( rule__Attribute__UpperBoundAssignment_3_3 ) ) )
            // InternalML2.g:4494:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            {
            // InternalML2.g:4494:1: ( ( rule__Attribute__UpperBoundAssignment_3_3 ) )
            // InternalML2.g:4495:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getAttributeAccess().getUpperBoundAssignment_3_3()); 
            // InternalML2.g:4496:2: ( rule__Attribute__UpperBoundAssignment_3_3 )
            // InternalML2.g:4496:3: rule__Attribute__UpperBoundAssignment_3_3
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
    // InternalML2.g:4504:1: rule__Attribute__Group_3__4 : rule__Attribute__Group_3__4__Impl ;
    public final void rule__Attribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4508:1: ( rule__Attribute__Group_3__4__Impl )
            // InternalML2.g:4509:2: rule__Attribute__Group_3__4__Impl
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
    // InternalML2.g:4515:1: rule__Attribute__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4519:1: ( ( ']' ) )
            // InternalML2.g:4520:1: ( ']' )
            {
            // InternalML2.g:4520:1: ( ']' )
            // InternalML2.g:4521:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalML2.g:4531:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4535:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalML2.g:4536:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
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
    // InternalML2.g:4543:1: rule__Attribute__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4547:1: ( ( 'subsets' ) )
            // InternalML2.g:4548:1: ( 'subsets' )
            {
            // InternalML2.g:4548:1: ( 'subsets' )
            // InternalML2.g:4549:2: 'subsets'
            {
             before(grammarAccess.getAttributeAccess().getSubsetsKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalML2.g:4558:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4562:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalML2.g:4563:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
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
    // InternalML2.g:4570:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4574:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_1 ) ) )
            // InternalML2.g:4575:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            {
            // InternalML2.g:4575:1: ( ( rule__Attribute__SubsetOfAssignment_5_1 ) )
            // InternalML2.g:4576:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_1()); 
            // InternalML2.g:4577:2: ( rule__Attribute__SubsetOfAssignment_5_1 )
            // InternalML2.g:4577:3: rule__Attribute__SubsetOfAssignment_5_1
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
    // InternalML2.g:4585:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4589:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalML2.g:4590:2: rule__Attribute__Group_5__2__Impl
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
    // InternalML2.g:4596:1: rule__Attribute__Group_5__2__Impl : ( ( rule__Attribute__Group_5_2__0 )* ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4600:1: ( ( ( rule__Attribute__Group_5_2__0 )* ) )
            // InternalML2.g:4601:1: ( ( rule__Attribute__Group_5_2__0 )* )
            {
            // InternalML2.g:4601:1: ( ( rule__Attribute__Group_5_2__0 )* )
            // InternalML2.g:4602:2: ( rule__Attribute__Group_5_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_5_2()); 
            // InternalML2.g:4603:2: ( rule__Attribute__Group_5_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==37) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalML2.g:4603:3: rule__Attribute__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalML2.g:4612:1: rule__Attribute__Group_5_2__0 : rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 ;
    public final void rule__Attribute__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4616:1: ( rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1 )
            // InternalML2.g:4617:2: rule__Attribute__Group_5_2__0__Impl rule__Attribute__Group_5_2__1
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
    // InternalML2.g:4624:1: rule__Attribute__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4628:1: ( ( ',' ) )
            // InternalML2.g:4629:1: ( ',' )
            {
            // InternalML2.g:4629:1: ( ',' )
            // InternalML2.g:4630:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:4639:1: rule__Attribute__Group_5_2__1 : rule__Attribute__Group_5_2__1__Impl ;
    public final void rule__Attribute__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4643:1: ( rule__Attribute__Group_5_2__1__Impl )
            // InternalML2.g:4644:2: rule__Attribute__Group_5_2__1__Impl
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
    // InternalML2.g:4650:1: rule__Attribute__Group_5_2__1__Impl : ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Attribute__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4654:1: ( ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) ) )
            // InternalML2.g:4655:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalML2.g:4655:1: ( ( rule__Attribute__SubsetOfAssignment_5_2_1 ) )
            // InternalML2.g:4656:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalML2.g:4657:2: ( rule__Attribute__SubsetOfAssignment_5_2_1 )
            // InternalML2.g:4657:3: rule__Attribute__SubsetOfAssignment_5_2_1
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
    // InternalML2.g:4666:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4670:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalML2.g:4671:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalML2.g:4678:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4682:1: ( ( 'ref' ) )
            // InternalML2.g:4683:1: ( 'ref' )
            {
            // InternalML2.g:4683:1: ( 'ref' )
            // InternalML2.g:4684:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalML2.g:4693:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4697:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalML2.g:4698:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
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
    // InternalML2.g:4705:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4709:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalML2.g:4710:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalML2.g:4710:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalML2.g:4711:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalML2.g:4712:2: ( rule__Reference__NameAssignment_1 )
            // InternalML2.g:4712:3: rule__Reference__NameAssignment_1
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
    // InternalML2.g:4720:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4724:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalML2.g:4725:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalML2.g:4732:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4736:1: ( ( ':' ) )
            // InternalML2.g:4737:1: ( ':' )
            {
            // InternalML2.g:4737:1: ( ':' )
            // InternalML2.g:4738:2: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:4747:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4751:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalML2.g:4752:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalML2.g:4759:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4763:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalML2.g:4764:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalML2.g:4764:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalML2.g:4765:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalML2.g:4766:2: ( rule__Reference__Group_3__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalML2.g:4766:3: rule__Reference__Group_3__0
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
    // InternalML2.g:4774:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4778:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalML2.g:4779:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalML2.g:4786:1: rule__Reference__Group__4__Impl : ( ( rule__Reference___typeAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4790:1: ( ( ( rule__Reference___typeAssignment_4 ) ) )
            // InternalML2.g:4791:1: ( ( rule__Reference___typeAssignment_4 ) )
            {
            // InternalML2.g:4791:1: ( ( rule__Reference___typeAssignment_4 ) )
            // InternalML2.g:4792:2: ( rule__Reference___typeAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().get_typeAssignment_4()); 
            // InternalML2.g:4793:2: ( rule__Reference___typeAssignment_4 )
            // InternalML2.g:4793:3: rule__Reference___typeAssignment_4
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
    // InternalML2.g:4801:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4805:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalML2.g:4806:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalML2.g:4813:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4817:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalML2.g:4818:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalML2.g:4818:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalML2.g:4819:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalML2.g:4820:2: ( rule__Reference__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalML2.g:4820:3: rule__Reference__Group_5__0
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
    // InternalML2.g:4828:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4832:1: ( rule__Reference__Group__6__Impl )
            // InternalML2.g:4833:2: rule__Reference__Group__6__Impl
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
    // InternalML2.g:4839:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__Group_6__0 )? ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4843:1: ( ( ( rule__Reference__Group_6__0 )? ) )
            // InternalML2.g:4844:1: ( ( rule__Reference__Group_6__0 )? )
            {
            // InternalML2.g:4844:1: ( ( rule__Reference__Group_6__0 )? )
            // InternalML2.g:4845:2: ( rule__Reference__Group_6__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_6()); 
            // InternalML2.g:4846:2: ( rule__Reference__Group_6__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalML2.g:4846:3: rule__Reference__Group_6__0
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
    // InternalML2.g:4855:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4859:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalML2.g:4860:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
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
    // InternalML2.g:4867:1: rule__Reference__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4871:1: ( ( '[' ) )
            // InternalML2.g:4872:1: ( '[' )
            {
            // InternalML2.g:4872:1: ( '[' )
            // InternalML2.g:4873:2: '['
            {
             before(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalML2.g:4882:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4886:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalML2.g:4887:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
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
    // InternalML2.g:4894:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4898:1: ( ( ( rule__Reference__LowerBoundAssignment_3_1 ) ) )
            // InternalML2.g:4899:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            {
            // InternalML2.g:4899:1: ( ( rule__Reference__LowerBoundAssignment_3_1 ) )
            // InternalML2.g:4900:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_3_1()); 
            // InternalML2.g:4901:2: ( rule__Reference__LowerBoundAssignment_3_1 )
            // InternalML2.g:4901:3: rule__Reference__LowerBoundAssignment_3_1
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
    // InternalML2.g:4909:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4913:1: ( rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 )
            // InternalML2.g:4914:2: rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3
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
    // InternalML2.g:4921:1: rule__Reference__Group_3__2__Impl : ( '..' ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4925:1: ( ( '..' ) )
            // InternalML2.g:4926:1: ( '..' )
            {
            // InternalML2.g:4926:1: ( '..' )
            // InternalML2.g:4927:2: '..'
            {
             before(grammarAccess.getReferenceAccess().getFullStopFullStopKeyword_3_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalML2.g:4936:1: rule__Reference__Group_3__3 : rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 ;
    public final void rule__Reference__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4940:1: ( rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 )
            // InternalML2.g:4941:2: rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4
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
    // InternalML2.g:4948:1: rule__Reference__Group_3__3__Impl : ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__Reference__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4952:1: ( ( ( rule__Reference__UpperBoundAssignment_3_3 ) ) )
            // InternalML2.g:4953:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            {
            // InternalML2.g:4953:1: ( ( rule__Reference__UpperBoundAssignment_3_3 ) )
            // InternalML2.g:4954:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_3_3()); 
            // InternalML2.g:4955:2: ( rule__Reference__UpperBoundAssignment_3_3 )
            // InternalML2.g:4955:3: rule__Reference__UpperBoundAssignment_3_3
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
    // InternalML2.g:4963:1: rule__Reference__Group_3__4 : rule__Reference__Group_3__4__Impl ;
    public final void rule__Reference__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4967:1: ( rule__Reference__Group_3__4__Impl )
            // InternalML2.g:4968:2: rule__Reference__Group_3__4__Impl
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
    // InternalML2.g:4974:1: rule__Reference__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4978:1: ( ( ']' ) )
            // InternalML2.g:4979:1: ( ']' )
            {
            // InternalML2.g:4979:1: ( ']' )
            // InternalML2.g:4980:2: ']'
            {
             before(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalML2.g:4990:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:4994:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalML2.g:4995:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
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
    // InternalML2.g:5002:1: rule__Reference__Group_5__0__Impl : ( 'subsets' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5006:1: ( ( 'subsets' ) )
            // InternalML2.g:5007:1: ( 'subsets' )
            {
            // InternalML2.g:5007:1: ( 'subsets' )
            // InternalML2.g:5008:2: 'subsets'
            {
             before(grammarAccess.getReferenceAccess().getSubsetsKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalML2.g:5017:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5021:1: ( rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2 )
            // InternalML2.g:5022:2: rule__Reference__Group_5__1__Impl rule__Reference__Group_5__2
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
    // InternalML2.g:5029:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5033:1: ( ( ( rule__Reference__SubsetOfAssignment_5_1 ) ) )
            // InternalML2.g:5034:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            {
            // InternalML2.g:5034:1: ( ( rule__Reference__SubsetOfAssignment_5_1 ) )
            // InternalML2.g:5035:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_1()); 
            // InternalML2.g:5036:2: ( rule__Reference__SubsetOfAssignment_5_1 )
            // InternalML2.g:5036:3: rule__Reference__SubsetOfAssignment_5_1
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
    // InternalML2.g:5044:1: rule__Reference__Group_5__2 : rule__Reference__Group_5__2__Impl ;
    public final void rule__Reference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5048:1: ( rule__Reference__Group_5__2__Impl )
            // InternalML2.g:5049:2: rule__Reference__Group_5__2__Impl
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
    // InternalML2.g:5055:1: rule__Reference__Group_5__2__Impl : ( ( rule__Reference__Group_5_2__0 )* ) ;
    public final void rule__Reference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5059:1: ( ( ( rule__Reference__Group_5_2__0 )* ) )
            // InternalML2.g:5060:1: ( ( rule__Reference__Group_5_2__0 )* )
            {
            // InternalML2.g:5060:1: ( ( rule__Reference__Group_5_2__0 )* )
            // InternalML2.g:5061:2: ( rule__Reference__Group_5_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_5_2()); 
            // InternalML2.g:5062:2: ( rule__Reference__Group_5_2__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==37) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalML2.g:5062:3: rule__Reference__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Reference__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalML2.g:5071:1: rule__Reference__Group_5_2__0 : rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 ;
    public final void rule__Reference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5075:1: ( rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1 )
            // InternalML2.g:5076:2: rule__Reference__Group_5_2__0__Impl rule__Reference__Group_5_2__1
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
    // InternalML2.g:5083:1: rule__Reference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Reference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5087:1: ( ( ',' ) )
            // InternalML2.g:5088:1: ( ',' )
            {
            // InternalML2.g:5088:1: ( ',' )
            // InternalML2.g:5089:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_5_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:5098:1: rule__Reference__Group_5_2__1 : rule__Reference__Group_5_2__1__Impl ;
    public final void rule__Reference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5102:1: ( rule__Reference__Group_5_2__1__Impl )
            // InternalML2.g:5103:2: rule__Reference__Group_5_2__1__Impl
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
    // InternalML2.g:5109:1: rule__Reference__Group_5_2__1__Impl : ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) ;
    public final void rule__Reference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5113:1: ( ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) ) )
            // InternalML2.g:5114:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            {
            // InternalML2.g:5114:1: ( ( rule__Reference__SubsetOfAssignment_5_2_1 ) )
            // InternalML2.g:5115:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfAssignment_5_2_1()); 
            // InternalML2.g:5116:2: ( rule__Reference__SubsetOfAssignment_5_2_1 )
            // InternalML2.g:5116:3: rule__Reference__SubsetOfAssignment_5_2_1
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
    // InternalML2.g:5125:1: rule__Reference__Group_6__0 : rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 ;
    public final void rule__Reference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5129:1: ( rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1 )
            // InternalML2.g:5130:2: rule__Reference__Group_6__0__Impl rule__Reference__Group_6__1
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
    // InternalML2.g:5137:1: rule__Reference__Group_6__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__Reference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5141:1: ( ( 'isOppositeTo' ) )
            // InternalML2.g:5142:1: ( 'isOppositeTo' )
            {
            // InternalML2.g:5142:1: ( 'isOppositeTo' )
            // InternalML2.g:5143:2: 'isOppositeTo'
            {
             before(grammarAccess.getReferenceAccess().getIsOppositeToKeyword_6_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalML2.g:5152:1: rule__Reference__Group_6__1 : rule__Reference__Group_6__1__Impl ;
    public final void rule__Reference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5156:1: ( rule__Reference__Group_6__1__Impl )
            // InternalML2.g:5157:2: rule__Reference__Group_6__1__Impl
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
    // InternalML2.g:5163:1: rule__Reference__Group_6__1__Impl : ( ( rule__Reference__OppositeToAssignment_6_1 ) ) ;
    public final void rule__Reference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5167:1: ( ( ( rule__Reference__OppositeToAssignment_6_1 ) ) )
            // InternalML2.g:5168:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            {
            // InternalML2.g:5168:1: ( ( rule__Reference__OppositeToAssignment_6_1 ) )
            // InternalML2.g:5169:2: ( rule__Reference__OppositeToAssignment_6_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToAssignment_6_1()); 
            // InternalML2.g:5170:2: ( rule__Reference__OppositeToAssignment_6_1 )
            // InternalML2.g:5170:3: rule__Reference__OppositeToAssignment_6_1
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
    // InternalML2.g:5179:1: rule__RegularityAttribute__Group__0 : rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 ;
    public final void rule__RegularityAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5183:1: ( rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1 )
            // InternalML2.g:5184:2: rule__RegularityAttribute__Group__0__Impl rule__RegularityAttribute__Group__1
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
    // InternalML2.g:5191:1: rule__RegularityAttribute__Group__0__Impl : ( 'regularity' ) ;
    public final void rule__RegularityAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5195:1: ( ( 'regularity' ) )
            // InternalML2.g:5196:1: ( 'regularity' )
            {
            // InternalML2.g:5196:1: ( 'regularity' )
            // InternalML2.g:5197:2: 'regularity'
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalML2.g:5206:1: rule__RegularityAttribute__Group__1 : rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 ;
    public final void rule__RegularityAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5210:1: ( rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2 )
            // InternalML2.g:5211:2: rule__RegularityAttribute__Group__1__Impl rule__RegularityAttribute__Group__2
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
    // InternalML2.g:5218:1: rule__RegularityAttribute__Group__1__Impl : ( ( 'att' )? ) ;
    public final void rule__RegularityAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5222:1: ( ( ( 'att' )? ) )
            // InternalML2.g:5223:1: ( ( 'att' )? )
            {
            // InternalML2.g:5223:1: ( ( 'att' )? )
            // InternalML2.g:5224:2: ( 'att' )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getAttKeyword_1()); 
            // InternalML2.g:5225:2: ( 'att' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==49) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalML2.g:5225:3: 'att'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalML2.g:5233:1: rule__RegularityAttribute__Group__2 : rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 ;
    public final void rule__RegularityAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5237:1: ( rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3 )
            // InternalML2.g:5238:2: rule__RegularityAttribute__Group__2__Impl rule__RegularityAttribute__Group__3
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
    // InternalML2.g:5245:1: rule__RegularityAttribute__Group__2__Impl : ( ( rule__RegularityAttribute__NameAssignment_2 ) ) ;
    public final void rule__RegularityAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5249:1: ( ( ( rule__RegularityAttribute__NameAssignment_2 ) ) )
            // InternalML2.g:5250:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            {
            // InternalML2.g:5250:1: ( ( rule__RegularityAttribute__NameAssignment_2 ) )
            // InternalML2.g:5251:2: ( rule__RegularityAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getNameAssignment_2()); 
            // InternalML2.g:5252:2: ( rule__RegularityAttribute__NameAssignment_2 )
            // InternalML2.g:5252:3: rule__RegularityAttribute__NameAssignment_2
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
    // InternalML2.g:5260:1: rule__RegularityAttribute__Group__3 : rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 ;
    public final void rule__RegularityAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5264:1: ( rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4 )
            // InternalML2.g:5265:2: rule__RegularityAttribute__Group__3__Impl rule__RegularityAttribute__Group__4
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
    // InternalML2.g:5272:1: rule__RegularityAttribute__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5276:1: ( ( ':' ) )
            // InternalML2.g:5277:1: ( ':' )
            {
            // InternalML2.g:5277:1: ( ':' )
            // InternalML2.g:5278:2: ':'
            {
             before(grammarAccess.getRegularityAttributeAccess().getColonKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:5287:1: rule__RegularityAttribute__Group__4 : rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 ;
    public final void rule__RegularityAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5291:1: ( rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5 )
            // InternalML2.g:5292:2: rule__RegularityAttribute__Group__4__Impl rule__RegularityAttribute__Group__5
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
    // InternalML2.g:5299:1: rule__RegularityAttribute__Group__4__Impl : ( ( rule__RegularityAttribute__Group_4__0 )? ) ;
    public final void rule__RegularityAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5303:1: ( ( ( rule__RegularityAttribute__Group_4__0 )? ) )
            // InternalML2.g:5304:1: ( ( rule__RegularityAttribute__Group_4__0 )? )
            {
            // InternalML2.g:5304:1: ( ( rule__RegularityAttribute__Group_4__0 )? )
            // InternalML2.g:5305:2: ( rule__RegularityAttribute__Group_4__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_4()); 
            // InternalML2.g:5306:2: ( rule__RegularityAttribute__Group_4__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==50) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalML2.g:5306:3: rule__RegularityAttribute__Group_4__0
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
    // InternalML2.g:5314:1: rule__RegularityAttribute__Group__5 : rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 ;
    public final void rule__RegularityAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5318:1: ( rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6 )
            // InternalML2.g:5319:2: rule__RegularityAttribute__Group__5__Impl rule__RegularityAttribute__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalML2.g:5326:1: rule__RegularityAttribute__Group__5__Impl : ( ( rule__RegularityAttribute__Alternatives_5 ) ) ;
    public final void rule__RegularityAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5330:1: ( ( ( rule__RegularityAttribute__Alternatives_5 ) ) )
            // InternalML2.g:5331:1: ( ( rule__RegularityAttribute__Alternatives_5 ) )
            {
            // InternalML2.g:5331:1: ( ( rule__RegularityAttribute__Alternatives_5 ) )
            // InternalML2.g:5332:2: ( rule__RegularityAttribute__Alternatives_5 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getAlternatives_5()); 
            // InternalML2.g:5333:2: ( rule__RegularityAttribute__Alternatives_5 )
            // InternalML2.g:5333:3: rule__RegularityAttribute__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__RegularityAttribute__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getRegularityAttributeAccess().getAlternatives_5()); 

            }


            }

        }
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
    // InternalML2.g:5341:1: rule__RegularityAttribute__Group__6 : rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 ;
    public final void rule__RegularityAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5345:1: ( rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7 )
            // InternalML2.g:5346:2: rule__RegularityAttribute__Group__6__Impl rule__RegularityAttribute__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalML2.g:5353:1: rule__RegularityAttribute__Group__6__Impl : ( ( rule__RegularityAttribute__Group_6__0 )? ) ;
    public final void rule__RegularityAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5357:1: ( ( ( rule__RegularityAttribute__Group_6__0 )? ) )
            // InternalML2.g:5358:1: ( ( rule__RegularityAttribute__Group_6__0 )? )
            {
            // InternalML2.g:5358:1: ( ( rule__RegularityAttribute__Group_6__0 )? )
            // InternalML2.g:5359:2: ( rule__RegularityAttribute__Group_6__0 )?
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_6()); 
            // InternalML2.g:5360:2: ( rule__RegularityAttribute__Group_6__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalML2.g:5360:3: rule__RegularityAttribute__Group_6__0
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
    // InternalML2.g:5368:1: rule__RegularityAttribute__Group__7 : rule__RegularityAttribute__Group__7__Impl rule__RegularityAttribute__Group__8 ;
    public final void rule__RegularityAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5372:1: ( rule__RegularityAttribute__Group__7__Impl rule__RegularityAttribute__Group__8 )
            // InternalML2.g:5373:2: rule__RegularityAttribute__Group__7__Impl rule__RegularityAttribute__Group__8
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
    // InternalML2.g:5380:1: rule__RegularityAttribute__Group__7__Impl : ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) ) ;
    public final void rule__RegularityAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5384:1: ( ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) ) )
            // InternalML2.g:5385:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) )
            {
            // InternalML2.g:5385:1: ( ( rule__RegularityAttribute__RegularityTypeAssignment_7 ) )
            // InternalML2.g:5386:2: ( rule__RegularityAttribute__RegularityTypeAssignment_7 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegularityTypeAssignment_7()); 
            // InternalML2.g:5387:2: ( rule__RegularityAttribute__RegularityTypeAssignment_7 )
            // InternalML2.g:5387:3: rule__RegularityAttribute__RegularityTypeAssignment_7
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
    // InternalML2.g:5395:1: rule__RegularityAttribute__Group__8 : rule__RegularityAttribute__Group__8__Impl ;
    public final void rule__RegularityAttribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5399:1: ( rule__RegularityAttribute__Group__8__Impl )
            // InternalML2.g:5400:2: rule__RegularityAttribute__Group__8__Impl
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
    // InternalML2.g:5406:1: rule__RegularityAttribute__Group__8__Impl : ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) ) ;
    public final void rule__RegularityAttribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5410:1: ( ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) ) )
            // InternalML2.g:5411:1: ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) )
            {
            // InternalML2.g:5411:1: ( ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 ) )
            // InternalML2.g:5412:2: ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureAssignment_8()); 
            // InternalML2.g:5413:2: ( rule__RegularityAttribute__RegulatedFeatureAssignment_8 )
            // InternalML2.g:5413:3: rule__RegularityAttribute__RegulatedFeatureAssignment_8
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
    // InternalML2.g:5422:1: rule__RegularityAttribute__Group_4__0 : rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1 ;
    public final void rule__RegularityAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5426:1: ( rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1 )
            // InternalML2.g:5427:2: rule__RegularityAttribute__Group_4__0__Impl rule__RegularityAttribute__Group_4__1
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
    // InternalML2.g:5434:1: rule__RegularityAttribute__Group_4__0__Impl : ( '[' ) ;
    public final void rule__RegularityAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5438:1: ( ( '[' ) )
            // InternalML2.g:5439:1: ( '[' )
            {
            // InternalML2.g:5439:1: ( '[' )
            // InternalML2.g:5440:2: '['
            {
             before(grammarAccess.getRegularityAttributeAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalML2.g:5449:1: rule__RegularityAttribute__Group_4__1 : rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2 ;
    public final void rule__RegularityAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5453:1: ( rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2 )
            // InternalML2.g:5454:2: rule__RegularityAttribute__Group_4__1__Impl rule__RegularityAttribute__Group_4__2
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
    // InternalML2.g:5461:1: rule__RegularityAttribute__Group_4__1__Impl : ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__RegularityAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5465:1: ( ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) ) )
            // InternalML2.g:5466:1: ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) )
            {
            // InternalML2.g:5466:1: ( ( rule__RegularityAttribute__LowerBoundAssignment_4_1 ) )
            // InternalML2.g:5467:2: ( rule__RegularityAttribute__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getLowerBoundAssignment_4_1()); 
            // InternalML2.g:5468:2: ( rule__RegularityAttribute__LowerBoundAssignment_4_1 )
            // InternalML2.g:5468:3: rule__RegularityAttribute__LowerBoundAssignment_4_1
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
    // InternalML2.g:5476:1: rule__RegularityAttribute__Group_4__2 : rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3 ;
    public final void rule__RegularityAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5480:1: ( rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3 )
            // InternalML2.g:5481:2: rule__RegularityAttribute__Group_4__2__Impl rule__RegularityAttribute__Group_4__3
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
    // InternalML2.g:5488:1: rule__RegularityAttribute__Group_4__2__Impl : ( '..' ) ;
    public final void rule__RegularityAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5492:1: ( ( '..' ) )
            // InternalML2.g:5493:1: ( '..' )
            {
            // InternalML2.g:5493:1: ( '..' )
            // InternalML2.g:5494:2: '..'
            {
             before(grammarAccess.getRegularityAttributeAccess().getFullStopFullStopKeyword_4_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalML2.g:5503:1: rule__RegularityAttribute__Group_4__3 : rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4 ;
    public final void rule__RegularityAttribute__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5507:1: ( rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4 )
            // InternalML2.g:5508:2: rule__RegularityAttribute__Group_4__3__Impl rule__RegularityAttribute__Group_4__4
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
    // InternalML2.g:5515:1: rule__RegularityAttribute__Group_4__3__Impl : ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__RegularityAttribute__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5519:1: ( ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) ) )
            // InternalML2.g:5520:1: ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) )
            {
            // InternalML2.g:5520:1: ( ( rule__RegularityAttribute__UpperBoundAssignment_4_3 ) )
            // InternalML2.g:5521:2: ( rule__RegularityAttribute__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getUpperBoundAssignment_4_3()); 
            // InternalML2.g:5522:2: ( rule__RegularityAttribute__UpperBoundAssignment_4_3 )
            // InternalML2.g:5522:3: rule__RegularityAttribute__UpperBoundAssignment_4_3
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
    // InternalML2.g:5530:1: rule__RegularityAttribute__Group_4__4 : rule__RegularityAttribute__Group_4__4__Impl ;
    public final void rule__RegularityAttribute__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5534:1: ( rule__RegularityAttribute__Group_4__4__Impl )
            // InternalML2.g:5535:2: rule__RegularityAttribute__Group_4__4__Impl
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
    // InternalML2.g:5541:1: rule__RegularityAttribute__Group_4__4__Impl : ( ']' ) ;
    public final void rule__RegularityAttribute__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5545:1: ( ( ']' ) )
            // InternalML2.g:5546:1: ( ']' )
            {
            // InternalML2.g:5546:1: ( ']' )
            // InternalML2.g:5547:2: ']'
            {
             before(grammarAccess.getRegularityAttributeAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalML2.g:5557:1: rule__RegularityAttribute__Group_6__0 : rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1 ;
    public final void rule__RegularityAttribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5561:1: ( rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1 )
            // InternalML2.g:5562:2: rule__RegularityAttribute__Group_6__0__Impl rule__RegularityAttribute__Group_6__1
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
    // InternalML2.g:5569:1: rule__RegularityAttribute__Group_6__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityAttribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5573:1: ( ( 'subsets' ) )
            // InternalML2.g:5574:1: ( 'subsets' )
            {
            // InternalML2.g:5574:1: ( 'subsets' )
            // InternalML2.g:5575:2: 'subsets'
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetsKeyword_6_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalML2.g:5584:1: rule__RegularityAttribute__Group_6__1 : rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2 ;
    public final void rule__RegularityAttribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5588:1: ( rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2 )
            // InternalML2.g:5589:2: rule__RegularityAttribute__Group_6__1__Impl rule__RegularityAttribute__Group_6__2
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
    // InternalML2.g:5596:1: rule__RegularityAttribute__Group_6__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) ) ;
    public final void rule__RegularityAttribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5600:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) ) )
            // InternalML2.g:5601:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) )
            {
            // InternalML2.g:5601:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_1 ) )
            // InternalML2.g:5602:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_1()); 
            // InternalML2.g:5603:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_1 )
            // InternalML2.g:5603:3: rule__RegularityAttribute__SubsetOfAssignment_6_1
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
    // InternalML2.g:5611:1: rule__RegularityAttribute__Group_6__2 : rule__RegularityAttribute__Group_6__2__Impl ;
    public final void rule__RegularityAttribute__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5615:1: ( rule__RegularityAttribute__Group_6__2__Impl )
            // InternalML2.g:5616:2: rule__RegularityAttribute__Group_6__2__Impl
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
    // InternalML2.g:5622:1: rule__RegularityAttribute__Group_6__2__Impl : ( ( rule__RegularityAttribute__Group_6_2__0 )* ) ;
    public final void rule__RegularityAttribute__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5626:1: ( ( ( rule__RegularityAttribute__Group_6_2__0 )* ) )
            // InternalML2.g:5627:1: ( ( rule__RegularityAttribute__Group_6_2__0 )* )
            {
            // InternalML2.g:5627:1: ( ( rule__RegularityAttribute__Group_6_2__0 )* )
            // InternalML2.g:5628:2: ( rule__RegularityAttribute__Group_6_2__0 )*
            {
             before(grammarAccess.getRegularityAttributeAccess().getGroup_6_2()); 
            // InternalML2.g:5629:2: ( rule__RegularityAttribute__Group_6_2__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==37) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalML2.g:5629:3: rule__RegularityAttribute__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityAttribute__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // InternalML2.g:5638:1: rule__RegularityAttribute__Group_6_2__0 : rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1 ;
    public final void rule__RegularityAttribute__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5642:1: ( rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1 )
            // InternalML2.g:5643:2: rule__RegularityAttribute__Group_6_2__0__Impl rule__RegularityAttribute__Group_6_2__1
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
    // InternalML2.g:5650:1: rule__RegularityAttribute__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityAttribute__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5654:1: ( ( ',' ) )
            // InternalML2.g:5655:1: ( ',' )
            {
            // InternalML2.g:5655:1: ( ',' )
            // InternalML2.g:5656:2: ','
            {
             before(grammarAccess.getRegularityAttributeAccess().getCommaKeyword_6_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:5665:1: rule__RegularityAttribute__Group_6_2__1 : rule__RegularityAttribute__Group_6_2__1__Impl ;
    public final void rule__RegularityAttribute__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5669:1: ( rule__RegularityAttribute__Group_6_2__1__Impl )
            // InternalML2.g:5670:2: rule__RegularityAttribute__Group_6_2__1__Impl
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
    // InternalML2.g:5676:1: rule__RegularityAttribute__Group_6_2__1__Impl : ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) ) ;
    public final void rule__RegularityAttribute__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5680:1: ( ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) ) )
            // InternalML2.g:5681:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) )
            {
            // InternalML2.g:5681:1: ( ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 ) )
            // InternalML2.g:5682:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAssignment_6_2_1()); 
            // InternalML2.g:5683:2: ( rule__RegularityAttribute__SubsetOfAssignment_6_2_1 )
            // InternalML2.g:5683:3: rule__RegularityAttribute__SubsetOfAssignment_6_2_1
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
    // InternalML2.g:5692:1: rule__RegularityReference__Group__0 : rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 ;
    public final void rule__RegularityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5696:1: ( rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1 )
            // InternalML2.g:5697:2: rule__RegularityReference__Group__0__Impl rule__RegularityReference__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalML2.g:5704:1: rule__RegularityReference__Group__0__Impl : ( 'regularity' ) ;
    public final void rule__RegularityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5708:1: ( ( 'regularity' ) )
            // InternalML2.g:5709:1: ( 'regularity' )
            {
            // InternalML2.g:5709:1: ( 'regularity' )
            // InternalML2.g:5710:2: 'regularity'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalML2.g:5719:1: rule__RegularityReference__Group__1 : rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 ;
    public final void rule__RegularityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5723:1: ( rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2 )
            // InternalML2.g:5724:2: rule__RegularityReference__Group__1__Impl rule__RegularityReference__Group__2
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
    // InternalML2.g:5731:1: rule__RegularityReference__Group__1__Impl : ( 'ref' ) ;
    public final void rule__RegularityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5735:1: ( ( 'ref' ) )
            // InternalML2.g:5736:1: ( 'ref' )
            {
            // InternalML2.g:5736:1: ( 'ref' )
            // InternalML2.g:5737:2: 'ref'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRefKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalML2.g:5746:1: rule__RegularityReference__Group__2 : rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 ;
    public final void rule__RegularityReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5750:1: ( rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3 )
            // InternalML2.g:5751:2: rule__RegularityReference__Group__2__Impl rule__RegularityReference__Group__3
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
    // InternalML2.g:5758:1: rule__RegularityReference__Group__2__Impl : ( ( rule__RegularityReference__NameAssignment_2 ) ) ;
    public final void rule__RegularityReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5762:1: ( ( ( rule__RegularityReference__NameAssignment_2 ) ) )
            // InternalML2.g:5763:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            {
            // InternalML2.g:5763:1: ( ( rule__RegularityReference__NameAssignment_2 ) )
            // InternalML2.g:5764:2: ( rule__RegularityReference__NameAssignment_2 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getNameAssignment_2()); 
            // InternalML2.g:5765:2: ( rule__RegularityReference__NameAssignment_2 )
            // InternalML2.g:5765:3: rule__RegularityReference__NameAssignment_2
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
    // InternalML2.g:5773:1: rule__RegularityReference__Group__3 : rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 ;
    public final void rule__RegularityReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5777:1: ( rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4 )
            // InternalML2.g:5778:2: rule__RegularityReference__Group__3__Impl rule__RegularityReference__Group__4
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
    // InternalML2.g:5785:1: rule__RegularityReference__Group__3__Impl : ( ':' ) ;
    public final void rule__RegularityReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5789:1: ( ( ':' ) )
            // InternalML2.g:5790:1: ( ':' )
            {
            // InternalML2.g:5790:1: ( ':' )
            // InternalML2.g:5791:2: ':'
            {
             before(grammarAccess.getRegularityReferenceAccess().getColonKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalML2.g:5800:1: rule__RegularityReference__Group__4 : rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 ;
    public final void rule__RegularityReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5804:1: ( rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5 )
            // InternalML2.g:5805:2: rule__RegularityReference__Group__4__Impl rule__RegularityReference__Group__5
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
    // InternalML2.g:5812:1: rule__RegularityReference__Group__4__Impl : ( ( rule__RegularityReference__Group_4__0 )? ) ;
    public final void rule__RegularityReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5816:1: ( ( ( rule__RegularityReference__Group_4__0 )? ) )
            // InternalML2.g:5817:1: ( ( rule__RegularityReference__Group_4__0 )? )
            {
            // InternalML2.g:5817:1: ( ( rule__RegularityReference__Group_4__0 )? )
            // InternalML2.g:5818:2: ( rule__RegularityReference__Group_4__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_4()); 
            // InternalML2.g:5819:2: ( rule__RegularityReference__Group_4__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==50) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalML2.g:5819:3: rule__RegularityReference__Group_4__0
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
    // InternalML2.g:5827:1: rule__RegularityReference__Group__5 : rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 ;
    public final void rule__RegularityReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5831:1: ( rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6 )
            // InternalML2.g:5832:2: rule__RegularityReference__Group__5__Impl rule__RegularityReference__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalML2.g:5839:1: rule__RegularityReference__Group__5__Impl : ( ( rule__RegularityReference___typeAssignment_5 ) ) ;
    public final void rule__RegularityReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5843:1: ( ( ( rule__RegularityReference___typeAssignment_5 ) ) )
            // InternalML2.g:5844:1: ( ( rule__RegularityReference___typeAssignment_5 ) )
            {
            // InternalML2.g:5844:1: ( ( rule__RegularityReference___typeAssignment_5 ) )
            // InternalML2.g:5845:2: ( rule__RegularityReference___typeAssignment_5 )
            {
             before(grammarAccess.getRegularityReferenceAccess().get_typeAssignment_5()); 
            // InternalML2.g:5846:2: ( rule__RegularityReference___typeAssignment_5 )
            // InternalML2.g:5846:3: rule__RegularityReference___typeAssignment_5
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
    // InternalML2.g:5854:1: rule__RegularityReference__Group__6 : rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 ;
    public final void rule__RegularityReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5858:1: ( rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7 )
            // InternalML2.g:5859:2: rule__RegularityReference__Group__6__Impl rule__RegularityReference__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalML2.g:5866:1: rule__RegularityReference__Group__6__Impl : ( ( rule__RegularityReference__Group_6__0 )? ) ;
    public final void rule__RegularityReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5870:1: ( ( ( rule__RegularityReference__Group_6__0 )? ) )
            // InternalML2.g:5871:1: ( ( rule__RegularityReference__Group_6__0 )? )
            {
            // InternalML2.g:5871:1: ( ( rule__RegularityReference__Group_6__0 )? )
            // InternalML2.g:5872:2: ( rule__RegularityReference__Group_6__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_6()); 
            // InternalML2.g:5873:2: ( rule__RegularityReference__Group_6__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==53) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalML2.g:5873:3: rule__RegularityReference__Group_6__0
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
    // InternalML2.g:5881:1: rule__RegularityReference__Group__7 : rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8 ;
    public final void rule__RegularityReference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5885:1: ( rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8 )
            // InternalML2.g:5886:2: rule__RegularityReference__Group__7__Impl rule__RegularityReference__Group__8
            {
            pushFollow(FOLLOW_36);
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
    // InternalML2.g:5893:1: rule__RegularityReference__Group__7__Impl : ( ( rule__RegularityReference__Group_7__0 )? ) ;
    public final void rule__RegularityReference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5897:1: ( ( ( rule__RegularityReference__Group_7__0 )? ) )
            // InternalML2.g:5898:1: ( ( rule__RegularityReference__Group_7__0 )? )
            {
            // InternalML2.g:5898:1: ( ( rule__RegularityReference__Group_7__0 )? )
            // InternalML2.g:5899:2: ( rule__RegularityReference__Group_7__0 )?
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_7()); 
            // InternalML2.g:5900:2: ( rule__RegularityReference__Group_7__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==55) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalML2.g:5900:3: rule__RegularityReference__Group_7__0
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
    // InternalML2.g:5908:1: rule__RegularityReference__Group__8 : rule__RegularityReference__Group__8__Impl rule__RegularityReference__Group__9 ;
    public final void rule__RegularityReference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5912:1: ( rule__RegularityReference__Group__8__Impl rule__RegularityReference__Group__9 )
            // InternalML2.g:5913:2: rule__RegularityReference__Group__8__Impl rule__RegularityReference__Group__9
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
    // InternalML2.g:5920:1: rule__RegularityReference__Group__8__Impl : ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) ) ;
    public final void rule__RegularityReference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5924:1: ( ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) ) )
            // InternalML2.g:5925:1: ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) )
            {
            // InternalML2.g:5925:1: ( ( rule__RegularityReference__RegularityTypeAssignment_8 ) )
            // InternalML2.g:5926:2: ( rule__RegularityReference__RegularityTypeAssignment_8 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegularityTypeAssignment_8()); 
            // InternalML2.g:5927:2: ( rule__RegularityReference__RegularityTypeAssignment_8 )
            // InternalML2.g:5927:3: rule__RegularityReference__RegularityTypeAssignment_8
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
    // InternalML2.g:5935:1: rule__RegularityReference__Group__9 : rule__RegularityReference__Group__9__Impl ;
    public final void rule__RegularityReference__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5939:1: ( rule__RegularityReference__Group__9__Impl )
            // InternalML2.g:5940:2: rule__RegularityReference__Group__9__Impl
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
    // InternalML2.g:5946:1: rule__RegularityReference__Group__9__Impl : ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) ) ;
    public final void rule__RegularityReference__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5950:1: ( ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) ) )
            // InternalML2.g:5951:1: ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) )
            {
            // InternalML2.g:5951:1: ( ( rule__RegularityReference__RegulatedFeatureAssignment_9 ) )
            // InternalML2.g:5952:2: ( rule__RegularityReference__RegulatedFeatureAssignment_9 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureAssignment_9()); 
            // InternalML2.g:5953:2: ( rule__RegularityReference__RegulatedFeatureAssignment_9 )
            // InternalML2.g:5953:3: rule__RegularityReference__RegulatedFeatureAssignment_9
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
    // InternalML2.g:5962:1: rule__RegularityReference__Group_4__0 : rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 ;
    public final void rule__RegularityReference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5966:1: ( rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1 )
            // InternalML2.g:5967:2: rule__RegularityReference__Group_4__0__Impl rule__RegularityReference__Group_4__1
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
    // InternalML2.g:5974:1: rule__RegularityReference__Group_4__0__Impl : ( '[' ) ;
    public final void rule__RegularityReference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5978:1: ( ( '[' ) )
            // InternalML2.g:5979:1: ( '[' )
            {
            // InternalML2.g:5979:1: ( '[' )
            // InternalML2.g:5980:2: '['
            {
             before(grammarAccess.getRegularityReferenceAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalML2.g:5989:1: rule__RegularityReference__Group_4__1 : rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 ;
    public final void rule__RegularityReference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:5993:1: ( rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2 )
            // InternalML2.g:5994:2: rule__RegularityReference__Group_4__1__Impl rule__RegularityReference__Group_4__2
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
    // InternalML2.g:6001:1: rule__RegularityReference__Group_4__1__Impl : ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__RegularityReference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6005:1: ( ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) ) )
            // InternalML2.g:6006:1: ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) )
            {
            // InternalML2.g:6006:1: ( ( rule__RegularityReference__LowerBoundAssignment_4_1 ) )
            // InternalML2.g:6007:2: ( rule__RegularityReference__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getLowerBoundAssignment_4_1()); 
            // InternalML2.g:6008:2: ( rule__RegularityReference__LowerBoundAssignment_4_1 )
            // InternalML2.g:6008:3: rule__RegularityReference__LowerBoundAssignment_4_1
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
    // InternalML2.g:6016:1: rule__RegularityReference__Group_4__2 : rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3 ;
    public final void rule__RegularityReference__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6020:1: ( rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3 )
            // InternalML2.g:6021:2: rule__RegularityReference__Group_4__2__Impl rule__RegularityReference__Group_4__3
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
    // InternalML2.g:6028:1: rule__RegularityReference__Group_4__2__Impl : ( '..' ) ;
    public final void rule__RegularityReference__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6032:1: ( ( '..' ) )
            // InternalML2.g:6033:1: ( '..' )
            {
            // InternalML2.g:6033:1: ( '..' )
            // InternalML2.g:6034:2: '..'
            {
             before(grammarAccess.getRegularityReferenceAccess().getFullStopFullStopKeyword_4_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalML2.g:6043:1: rule__RegularityReference__Group_4__3 : rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4 ;
    public final void rule__RegularityReference__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6047:1: ( rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4 )
            // InternalML2.g:6048:2: rule__RegularityReference__Group_4__3__Impl rule__RegularityReference__Group_4__4
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
    // InternalML2.g:6055:1: rule__RegularityReference__Group_4__3__Impl : ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__RegularityReference__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6059:1: ( ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) ) )
            // InternalML2.g:6060:1: ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) )
            {
            // InternalML2.g:6060:1: ( ( rule__RegularityReference__UpperBoundAssignment_4_3 ) )
            // InternalML2.g:6061:2: ( rule__RegularityReference__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getUpperBoundAssignment_4_3()); 
            // InternalML2.g:6062:2: ( rule__RegularityReference__UpperBoundAssignment_4_3 )
            // InternalML2.g:6062:3: rule__RegularityReference__UpperBoundAssignment_4_3
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
    // InternalML2.g:6070:1: rule__RegularityReference__Group_4__4 : rule__RegularityReference__Group_4__4__Impl ;
    public final void rule__RegularityReference__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6074:1: ( rule__RegularityReference__Group_4__4__Impl )
            // InternalML2.g:6075:2: rule__RegularityReference__Group_4__4__Impl
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
    // InternalML2.g:6081:1: rule__RegularityReference__Group_4__4__Impl : ( ']' ) ;
    public final void rule__RegularityReference__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6085:1: ( ( ']' ) )
            // InternalML2.g:6086:1: ( ']' )
            {
            // InternalML2.g:6086:1: ( ']' )
            // InternalML2.g:6087:2: ']'
            {
             before(grammarAccess.getRegularityReferenceAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalML2.g:6097:1: rule__RegularityReference__Group_6__0 : rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1 ;
    public final void rule__RegularityReference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6101:1: ( rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1 )
            // InternalML2.g:6102:2: rule__RegularityReference__Group_6__0__Impl rule__RegularityReference__Group_6__1
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
    // InternalML2.g:6109:1: rule__RegularityReference__Group_6__0__Impl : ( 'subsets' ) ;
    public final void rule__RegularityReference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6113:1: ( ( 'subsets' ) )
            // InternalML2.g:6114:1: ( 'subsets' )
            {
            // InternalML2.g:6114:1: ( 'subsets' )
            // InternalML2.g:6115:2: 'subsets'
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetsKeyword_6_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalML2.g:6124:1: rule__RegularityReference__Group_6__1 : rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2 ;
    public final void rule__RegularityReference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6128:1: ( rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2 )
            // InternalML2.g:6129:2: rule__RegularityReference__Group_6__1__Impl rule__RegularityReference__Group_6__2
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
    // InternalML2.g:6136:1: rule__RegularityReference__Group_6__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) ) ;
    public final void rule__RegularityReference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6140:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) ) )
            // InternalML2.g:6141:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) )
            {
            // InternalML2.g:6141:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_1 ) )
            // InternalML2.g:6142:2: ( rule__RegularityReference__SubsetOfAssignment_6_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_1()); 
            // InternalML2.g:6143:2: ( rule__RegularityReference__SubsetOfAssignment_6_1 )
            // InternalML2.g:6143:3: rule__RegularityReference__SubsetOfAssignment_6_1
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
    // InternalML2.g:6151:1: rule__RegularityReference__Group_6__2 : rule__RegularityReference__Group_6__2__Impl ;
    public final void rule__RegularityReference__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6155:1: ( rule__RegularityReference__Group_6__2__Impl )
            // InternalML2.g:6156:2: rule__RegularityReference__Group_6__2__Impl
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
    // InternalML2.g:6162:1: rule__RegularityReference__Group_6__2__Impl : ( ( rule__RegularityReference__Group_6_2__0 )* ) ;
    public final void rule__RegularityReference__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6166:1: ( ( ( rule__RegularityReference__Group_6_2__0 )* ) )
            // InternalML2.g:6167:1: ( ( rule__RegularityReference__Group_6_2__0 )* )
            {
            // InternalML2.g:6167:1: ( ( rule__RegularityReference__Group_6_2__0 )* )
            // InternalML2.g:6168:2: ( rule__RegularityReference__Group_6_2__0 )*
            {
             before(grammarAccess.getRegularityReferenceAccess().getGroup_6_2()); 
            // InternalML2.g:6169:2: ( rule__RegularityReference__Group_6_2__0 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==37) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalML2.g:6169:3: rule__RegularityReference__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RegularityReference__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // InternalML2.g:6178:1: rule__RegularityReference__Group_6_2__0 : rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1 ;
    public final void rule__RegularityReference__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6182:1: ( rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1 )
            // InternalML2.g:6183:2: rule__RegularityReference__Group_6_2__0__Impl rule__RegularityReference__Group_6_2__1
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
    // InternalML2.g:6190:1: rule__RegularityReference__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RegularityReference__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6194:1: ( ( ',' ) )
            // InternalML2.g:6195:1: ( ',' )
            {
            // InternalML2.g:6195:1: ( ',' )
            // InternalML2.g:6196:2: ','
            {
             before(grammarAccess.getRegularityReferenceAccess().getCommaKeyword_6_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:6205:1: rule__RegularityReference__Group_6_2__1 : rule__RegularityReference__Group_6_2__1__Impl ;
    public final void rule__RegularityReference__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6209:1: ( rule__RegularityReference__Group_6_2__1__Impl )
            // InternalML2.g:6210:2: rule__RegularityReference__Group_6_2__1__Impl
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
    // InternalML2.g:6216:1: rule__RegularityReference__Group_6_2__1__Impl : ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) ) ;
    public final void rule__RegularityReference__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6220:1: ( ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) ) )
            // InternalML2.g:6221:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) )
            {
            // InternalML2.g:6221:1: ( ( rule__RegularityReference__SubsetOfAssignment_6_2_1 ) )
            // InternalML2.g:6222:2: ( rule__RegularityReference__SubsetOfAssignment_6_2_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfAssignment_6_2_1()); 
            // InternalML2.g:6223:2: ( rule__RegularityReference__SubsetOfAssignment_6_2_1 )
            // InternalML2.g:6223:3: rule__RegularityReference__SubsetOfAssignment_6_2_1
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
    // InternalML2.g:6232:1: rule__RegularityReference__Group_7__0 : rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1 ;
    public final void rule__RegularityReference__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6236:1: ( rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1 )
            // InternalML2.g:6237:2: rule__RegularityReference__Group_7__0__Impl rule__RegularityReference__Group_7__1
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
    // InternalML2.g:6244:1: rule__RegularityReference__Group_7__0__Impl : ( 'isOppositeTo' ) ;
    public final void rule__RegularityReference__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6248:1: ( ( 'isOppositeTo' ) )
            // InternalML2.g:6249:1: ( 'isOppositeTo' )
            {
            // InternalML2.g:6249:1: ( 'isOppositeTo' )
            // InternalML2.g:6250:2: 'isOppositeTo'
            {
             before(grammarAccess.getRegularityReferenceAccess().getIsOppositeToKeyword_7_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalML2.g:6259:1: rule__RegularityReference__Group_7__1 : rule__RegularityReference__Group_7__1__Impl ;
    public final void rule__RegularityReference__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6263:1: ( rule__RegularityReference__Group_7__1__Impl )
            // InternalML2.g:6264:2: rule__RegularityReference__Group_7__1__Impl
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
    // InternalML2.g:6270:1: rule__RegularityReference__Group_7__1__Impl : ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) ) ;
    public final void rule__RegularityReference__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6274:1: ( ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) ) )
            // InternalML2.g:6275:1: ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) )
            {
            // InternalML2.g:6275:1: ( ( rule__RegularityReference__OppositeToAssignment_7_1 ) )
            // InternalML2.g:6276:2: ( rule__RegularityReference__OppositeToAssignment_7_1 )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToAssignment_7_1()); 
            // InternalML2.g:6277:2: ( rule__RegularityReference__OppositeToAssignment_7_1 )
            // InternalML2.g:6277:3: rule__RegularityReference__OppositeToAssignment_7_1
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
    // InternalML2.g:6286:1: rule__SingleAttributeAssignment__Group__0 : rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1 ;
    public final void rule__SingleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6290:1: ( rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1 )
            // InternalML2.g:6291:2: rule__SingleAttributeAssignment__Group__0__Impl rule__SingleAttributeAssignment__Group__1
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
    // InternalML2.g:6298:1: rule__SingleAttributeAssignment__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__SingleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6302:1: ( ( ( 'att' )? ) )
            // InternalML2.g:6303:1: ( ( 'att' )? )
            {
            // InternalML2.g:6303:1: ( ( 'att' )? )
            // InternalML2.g:6304:2: ( 'att' )?
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttKeyword_0()); 
            // InternalML2.g:6305:2: ( 'att' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==49) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalML2.g:6305:3: 'att'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalML2.g:6313:1: rule__SingleAttributeAssignment__Group__1 : rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2 ;
    public final void rule__SingleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6317:1: ( rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2 )
            // InternalML2.g:6318:2: rule__SingleAttributeAssignment__Group__1__Impl rule__SingleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalML2.g:6325:1: rule__SingleAttributeAssignment__Group__1__Impl : ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__SingleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6329:1: ( ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalML2.g:6330:1: ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalML2.g:6330:1: ( ( rule__SingleAttributeAssignment__AttributeAssignment_1 ) )
            // InternalML2.g:6331:2: ( rule__SingleAttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalML2.g:6332:2: ( rule__SingleAttributeAssignment__AttributeAssignment_1 )
            // InternalML2.g:6332:3: rule__SingleAttributeAssignment__AttributeAssignment_1
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
    // InternalML2.g:6340:1: rule__SingleAttributeAssignment__Group__2 : rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3 ;
    public final void rule__SingleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6344:1: ( rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3 )
            // InternalML2.g:6345:2: rule__SingleAttributeAssignment__Group__2__Impl rule__SingleAttributeAssignment__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalML2.g:6352:1: rule__SingleAttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__SingleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6356:1: ( ( '=' ) )
            // InternalML2.g:6357:1: ( '=' )
            {
            // InternalML2.g:6357:1: ( '=' )
            // InternalML2.g:6358:2: '='
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalML2.g:6367:1: rule__SingleAttributeAssignment__Group__3 : rule__SingleAttributeAssignment__Group__3__Impl ;
    public final void rule__SingleAttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6371:1: ( rule__SingleAttributeAssignment__Group__3__Impl )
            // InternalML2.g:6372:2: rule__SingleAttributeAssignment__Group__3__Impl
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
    // InternalML2.g:6378:1: rule__SingleAttributeAssignment__Group__3__Impl : ( ( rule__SingleAttributeAssignment__Alternatives_3 ) ) ;
    public final void rule__SingleAttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6382:1: ( ( ( rule__SingleAttributeAssignment__Alternatives_3 ) ) )
            // InternalML2.g:6383:1: ( ( rule__SingleAttributeAssignment__Alternatives_3 ) )
            {
            // InternalML2.g:6383:1: ( ( rule__SingleAttributeAssignment__Alternatives_3 ) )
            // InternalML2.g:6384:2: ( rule__SingleAttributeAssignment__Alternatives_3 )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAlternatives_3()); 
            // InternalML2.g:6385:2: ( rule__SingleAttributeAssignment__Alternatives_3 )
            // InternalML2.g:6385:3: rule__SingleAttributeAssignment__Alternatives_3
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
    // InternalML2.g:6394:1: rule__MultipleAttributeAssignment__Group__0 : rule__MultipleAttributeAssignment__Group__0__Impl rule__MultipleAttributeAssignment__Group__1 ;
    public final void rule__MultipleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6398:1: ( rule__MultipleAttributeAssignment__Group__0__Impl rule__MultipleAttributeAssignment__Group__1 )
            // InternalML2.g:6399:2: rule__MultipleAttributeAssignment__Group__0__Impl rule__MultipleAttributeAssignment__Group__1
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
    // InternalML2.g:6406:1: rule__MultipleAttributeAssignment__Group__0__Impl : ( ( 'att' )? ) ;
    public final void rule__MultipleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6410:1: ( ( ( 'att' )? ) )
            // InternalML2.g:6411:1: ( ( 'att' )? )
            {
            // InternalML2.g:6411:1: ( ( 'att' )? )
            // InternalML2.g:6412:2: ( 'att' )?
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAttKeyword_0()); 
            // InternalML2.g:6413:2: ( 'att' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==49) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalML2.g:6413:3: 'att'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalML2.g:6421:1: rule__MultipleAttributeAssignment__Group__1 : rule__MultipleAttributeAssignment__Group__1__Impl rule__MultipleAttributeAssignment__Group__2 ;
    public final void rule__MultipleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6425:1: ( rule__MultipleAttributeAssignment__Group__1__Impl rule__MultipleAttributeAssignment__Group__2 )
            // InternalML2.g:6426:2: rule__MultipleAttributeAssignment__Group__1__Impl rule__MultipleAttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalML2.g:6433:1: rule__MultipleAttributeAssignment__Group__1__Impl : ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6437:1: ( ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) ) )
            // InternalML2.g:6438:1: ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) )
            {
            // InternalML2.g:6438:1: ( ( rule__MultipleAttributeAssignment__AttributeAssignment_1 ) )
            // InternalML2.g:6439:2: ( rule__MultipleAttributeAssignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAssignment_1()); 
            // InternalML2.g:6440:2: ( rule__MultipleAttributeAssignment__AttributeAssignment_1 )
            // InternalML2.g:6440:3: rule__MultipleAttributeAssignment__AttributeAssignment_1
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
    // InternalML2.g:6448:1: rule__MultipleAttributeAssignment__Group__2 : rule__MultipleAttributeAssignment__Group__2__Impl rule__MultipleAttributeAssignment__Group__3 ;
    public final void rule__MultipleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6452:1: ( rule__MultipleAttributeAssignment__Group__2__Impl rule__MultipleAttributeAssignment__Group__3 )
            // InternalML2.g:6453:2: rule__MultipleAttributeAssignment__Group__2__Impl rule__MultipleAttributeAssignment__Group__3
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
    // InternalML2.g:6460:1: rule__MultipleAttributeAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__MultipleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6464:1: ( ( '=' ) )
            // InternalML2.g:6465:1: ( '=' )
            {
            // InternalML2.g:6465:1: ( '=' )
            // InternalML2.g:6466:2: '='
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalML2.g:6475:1: rule__MultipleAttributeAssignment__Group__3 : rule__MultipleAttributeAssignment__Group__3__Impl rule__MultipleAttributeAssignment__Group__4 ;
    public final void rule__MultipleAttributeAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6479:1: ( rule__MultipleAttributeAssignment__Group__3__Impl rule__MultipleAttributeAssignment__Group__4 )
            // InternalML2.g:6480:2: rule__MultipleAttributeAssignment__Group__3__Impl rule__MultipleAttributeAssignment__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalML2.g:6487:1: rule__MultipleAttributeAssignment__Group__3__Impl : ( '{' ) ;
    public final void rule__MultipleAttributeAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6491:1: ( ( '{' ) )
            // InternalML2.g:6492:1: ( '{' )
            {
            // InternalML2.g:6492:1: ( '{' )
            // InternalML2.g:6493:2: '{'
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalML2.g:6502:1: rule__MultipleAttributeAssignment__Group__4 : rule__MultipleAttributeAssignment__Group__4__Impl rule__MultipleAttributeAssignment__Group__5 ;
    public final void rule__MultipleAttributeAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6506:1: ( rule__MultipleAttributeAssignment__Group__4__Impl rule__MultipleAttributeAssignment__Group__5 )
            // InternalML2.g:6507:2: rule__MultipleAttributeAssignment__Group__4__Impl rule__MultipleAttributeAssignment__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalML2.g:6514:1: rule__MultipleAttributeAssignment__Group__4__Impl : ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? ) ;
    public final void rule__MultipleAttributeAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6518:1: ( ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? ) )
            // InternalML2.g:6519:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? )
            {
            // InternalML2.g:6519:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4 )? )
            // InternalML2.g:6520:2: ( rule__MultipleAttributeAssignment__Alternatives_4 )?
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4()); 
            // InternalML2.g:6521:2: ( rule__MultipleAttributeAssignment__Alternatives_4 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_INT && LA70_0<=RULE_STRING)||(LA70_0>=12 && LA70_0<=13)||LA70_0==50||LA70_0==58) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalML2.g:6521:3: rule__MultipleAttributeAssignment__Alternatives_4
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
    // InternalML2.g:6529:1: rule__MultipleAttributeAssignment__Group__5 : rule__MultipleAttributeAssignment__Group__5__Impl ;
    public final void rule__MultipleAttributeAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6533:1: ( rule__MultipleAttributeAssignment__Group__5__Impl )
            // InternalML2.g:6534:2: rule__MultipleAttributeAssignment__Group__5__Impl
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
    // InternalML2.g:6540:1: rule__MultipleAttributeAssignment__Group__5__Impl : ( '}' ) ;
    public final void rule__MultipleAttributeAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6544:1: ( ( '}' ) )
            // InternalML2.g:6545:1: ( '}' )
            {
            // InternalML2.g:6545:1: ( '}' )
            // InternalML2.g:6546:2: '}'
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalML2.g:6556:1: rule__MultipleAttributeAssignment__Group_4_0__0 : rule__MultipleAttributeAssignment__Group_4_0__0__Impl rule__MultipleAttributeAssignment__Group_4_0__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6560:1: ( rule__MultipleAttributeAssignment__Group_4_0__0__Impl rule__MultipleAttributeAssignment__Group_4_0__1 )
            // InternalML2.g:6561:2: rule__MultipleAttributeAssignment__Group_4_0__0__Impl rule__MultipleAttributeAssignment__Group_4_0__1
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
    // InternalML2.g:6568:1: rule__MultipleAttributeAssignment__Group_4_0__0__Impl : ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6572:1: ( ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) ) )
            // InternalML2.g:6573:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) )
            {
            // InternalML2.g:6573:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 ) )
            // InternalML2.g:6574:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_4_0_0()); 
            // InternalML2.g:6575:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 )
            // InternalML2.g:6575:3: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0
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
    // InternalML2.g:6583:1: rule__MultipleAttributeAssignment__Group_4_0__1 : rule__MultipleAttributeAssignment__Group_4_0__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6587:1: ( rule__MultipleAttributeAssignment__Group_4_0__1__Impl )
            // InternalML2.g:6588:2: rule__MultipleAttributeAssignment__Group_4_0__1__Impl
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
    // InternalML2.g:6594:1: rule__MultipleAttributeAssignment__Group_4_0__1__Impl : ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6598:1: ( ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* ) )
            // InternalML2.g:6599:1: ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* )
            {
            // InternalML2.g:6599:1: ( ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )* )
            // InternalML2.g:6600:2: ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )*
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_0_1()); 
            // InternalML2.g:6601:2: ( rule__MultipleAttributeAssignment__Group_4_0_1__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==37) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalML2.g:6601:3: rule__MultipleAttributeAssignment__Group_4_0_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MultipleAttributeAssignment__Group_4_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalML2.g:6610:1: rule__MultipleAttributeAssignment__Group_4_0_1__0 : rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl rule__MultipleAttributeAssignment__Group_4_0_1__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6614:1: ( rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl rule__MultipleAttributeAssignment__Group_4_0_1__1 )
            // InternalML2.g:6615:2: rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl rule__MultipleAttributeAssignment__Group_4_0_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalML2.g:6622:1: rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl : ( ',' ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6626:1: ( ( ',' ) )
            // InternalML2.g:6627:1: ( ',' )
            {
            // InternalML2.g:6627:1: ( ',' )
            // InternalML2.g:6628:2: ','
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_0_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:6637:1: rule__MultipleAttributeAssignment__Group_4_0_1__1 : rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6641:1: ( rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl )
            // InternalML2.g:6642:2: rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl
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
    // InternalML2.g:6648:1: rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl : ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6652:1: ( ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) ) )
            // InternalML2.g:6653:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) )
            {
            // InternalML2.g:6653:1: ( ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 ) )
            // InternalML2.g:6654:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_4_0_1_1()); 
            // InternalML2.g:6655:2: ( rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 )
            // InternalML2.g:6655:3: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1
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
    // InternalML2.g:6664:1: rule__MultipleAttributeAssignment__Group_4_1__0 : rule__MultipleAttributeAssignment__Group_4_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6668:1: ( rule__MultipleAttributeAssignment__Group_4_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1__1 )
            // InternalML2.g:6669:2: rule__MultipleAttributeAssignment__Group_4_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1__1
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
    // InternalML2.g:6676:1: rule__MultipleAttributeAssignment__Group_4_1__0__Impl : ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6680:1: ( ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) ) )
            // InternalML2.g:6681:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) )
            {
            // InternalML2.g:6681:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 ) )
            // InternalML2.g:6682:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4_1_0()); 
            // InternalML2.g:6683:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_0 )
            // InternalML2.g:6683:3: rule__MultipleAttributeAssignment__Alternatives_4_1_0
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
    // InternalML2.g:6691:1: rule__MultipleAttributeAssignment__Group_4_1__1 : rule__MultipleAttributeAssignment__Group_4_1__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6695:1: ( rule__MultipleAttributeAssignment__Group_4_1__1__Impl )
            // InternalML2.g:6696:2: rule__MultipleAttributeAssignment__Group_4_1__1__Impl
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
    // InternalML2.g:6702:1: rule__MultipleAttributeAssignment__Group_4_1__1__Impl : ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6706:1: ( ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* ) )
            // InternalML2.g:6707:1: ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* )
            {
            // InternalML2.g:6707:1: ( ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )* )
            // InternalML2.g:6708:2: ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )*
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getGroup_4_1_1()); 
            // InternalML2.g:6709:2: ( rule__MultipleAttributeAssignment__Group_4_1_1__0 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==37) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalML2.g:6709:3: rule__MultipleAttributeAssignment__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MultipleAttributeAssignment__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // InternalML2.g:6718:1: rule__MultipleAttributeAssignment__Group_4_1_1__0 : rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1_1__1 ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6722:1: ( rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1_1__1 )
            // InternalML2.g:6723:2: rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl rule__MultipleAttributeAssignment__Group_4_1_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalML2.g:6730:1: rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6734:1: ( ( ',' ) )
            // InternalML2.g:6735:1: ( ',' )
            {
            // InternalML2.g:6735:1: ( ',' )
            // InternalML2.g:6736:2: ','
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getCommaKeyword_4_1_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:6745:1: rule__MultipleAttributeAssignment__Group_4_1_1__1 : rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6749:1: ( rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl )
            // InternalML2.g:6750:2: rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl
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
    // InternalML2.g:6756:1: rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl : ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) ) ;
    public final void rule__MultipleAttributeAssignment__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6760:1: ( ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) ) )
            // InternalML2.g:6761:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) )
            {
            // InternalML2.g:6761:1: ( ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 ) )
            // InternalML2.g:6762:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAlternatives_4_1_1_1()); 
            // InternalML2.g:6763:2: ( rule__MultipleAttributeAssignment__Alternatives_4_1_1_1 )
            // InternalML2.g:6763:3: rule__MultipleAttributeAssignment__Alternatives_4_1_1_1
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
    // InternalML2.g:6772:1: rule__ReferenceAssignment__Group__0 : rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 ;
    public final void rule__ReferenceAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6776:1: ( rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1 )
            // InternalML2.g:6777:2: rule__ReferenceAssignment__Group__0__Impl rule__ReferenceAssignment__Group__1
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
    // InternalML2.g:6784:1: rule__ReferenceAssignment__Group__0__Impl : ( 'ref' ) ;
    public final void rule__ReferenceAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6788:1: ( ( 'ref' ) )
            // InternalML2.g:6789:1: ( 'ref' )
            {
            // InternalML2.g:6789:1: ( 'ref' )
            // InternalML2.g:6790:2: 'ref'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRefKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalML2.g:6799:1: rule__ReferenceAssignment__Group__1 : rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 ;
    public final void rule__ReferenceAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6803:1: ( rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2 )
            // InternalML2.g:6804:2: rule__ReferenceAssignment__Group__1__Impl rule__ReferenceAssignment__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalML2.g:6811:1: rule__ReferenceAssignment__Group__1__Impl : ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferenceAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6815:1: ( ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) ) )
            // InternalML2.g:6816:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            {
            // InternalML2.g:6816:1: ( ( rule__ReferenceAssignment__ReferenceAssignment_1 ) )
            // InternalML2.g:6817:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceAssignment_1()); 
            // InternalML2.g:6818:2: ( rule__ReferenceAssignment__ReferenceAssignment_1 )
            // InternalML2.g:6818:3: rule__ReferenceAssignment__ReferenceAssignment_1
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
    // InternalML2.g:6826:1: rule__ReferenceAssignment__Group__2 : rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 ;
    public final void rule__ReferenceAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6830:1: ( rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3 )
            // InternalML2.g:6831:2: rule__ReferenceAssignment__Group__2__Impl rule__ReferenceAssignment__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalML2.g:6838:1: rule__ReferenceAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__ReferenceAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6842:1: ( ( '=' ) )
            // InternalML2.g:6843:1: ( '=' )
            {
            // InternalML2.g:6843:1: ( '=' )
            // InternalML2.g:6844:2: '='
            {
             before(grammarAccess.getReferenceAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalML2.g:6853:1: rule__ReferenceAssignment__Group__3 : rule__ReferenceAssignment__Group__3__Impl ;
    public final void rule__ReferenceAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6857:1: ( rule__ReferenceAssignment__Group__3__Impl )
            // InternalML2.g:6858:2: rule__ReferenceAssignment__Group__3__Impl
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
    // InternalML2.g:6864:1: rule__ReferenceAssignment__Group__3__Impl : ( ( rule__ReferenceAssignment__Alternatives_3 ) ) ;
    public final void rule__ReferenceAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6868:1: ( ( ( rule__ReferenceAssignment__Alternatives_3 ) ) )
            // InternalML2.g:6869:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            {
            // InternalML2.g:6869:1: ( ( rule__ReferenceAssignment__Alternatives_3 ) )
            // InternalML2.g:6870:2: ( rule__ReferenceAssignment__Alternatives_3 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAlternatives_3()); 
            // InternalML2.g:6871:2: ( rule__ReferenceAssignment__Alternatives_3 )
            // InternalML2.g:6871:3: rule__ReferenceAssignment__Alternatives_3
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
    // InternalML2.g:6880:1: rule__ReferenceAssignment__Group_3_1__0 : rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 ;
    public final void rule__ReferenceAssignment__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6884:1: ( rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1 )
            // InternalML2.g:6885:2: rule__ReferenceAssignment__Group_3_1__0__Impl rule__ReferenceAssignment__Group_3_1__1
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
    // InternalML2.g:6892:1: rule__ReferenceAssignment__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6896:1: ( ( '{' ) )
            // InternalML2.g:6897:1: ( '{' )
            {
            // InternalML2.g:6897:1: ( '{' )
            // InternalML2.g:6898:2: '{'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalML2.g:6907:1: rule__ReferenceAssignment__Group_3_1__1 : rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 ;
    public final void rule__ReferenceAssignment__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6911:1: ( rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2 )
            // InternalML2.g:6912:2: rule__ReferenceAssignment__Group_3_1__1__Impl rule__ReferenceAssignment__Group_3_1__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalML2.g:6919:1: rule__ReferenceAssignment__Group_3_1__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6923:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) ) )
            // InternalML2.g:6924:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            {
            // InternalML2.g:6924:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 ) )
            // InternalML2.g:6925:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_1()); 
            // InternalML2.g:6926:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 )
            // InternalML2.g:6926:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1
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
    // InternalML2.g:6934:1: rule__ReferenceAssignment__Group_3_1__2 : rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 ;
    public final void rule__ReferenceAssignment__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6938:1: ( rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3 )
            // InternalML2.g:6939:2: rule__ReferenceAssignment__Group_3_1__2__Impl rule__ReferenceAssignment__Group_3_1__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalML2.g:6946:1: rule__ReferenceAssignment__Group_3_1__2__Impl : ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) ;
    public final void rule__ReferenceAssignment__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6950:1: ( ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* ) )
            // InternalML2.g:6951:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            {
            // InternalML2.g:6951:1: ( ( rule__ReferenceAssignment__Group_3_1_2__0 )* )
            // InternalML2.g:6952:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            {
             before(grammarAccess.getReferenceAssignmentAccess().getGroup_3_1_2()); 
            // InternalML2.g:6953:2: ( rule__ReferenceAssignment__Group_3_1_2__0 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==37) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalML2.g:6953:3: rule__ReferenceAssignment__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ReferenceAssignment__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // InternalML2.g:6961:1: rule__ReferenceAssignment__Group_3_1__3 : rule__ReferenceAssignment__Group_3_1__3__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6965:1: ( rule__ReferenceAssignment__Group_3_1__3__Impl )
            // InternalML2.g:6966:2: rule__ReferenceAssignment__Group_3_1__3__Impl
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
    // InternalML2.g:6972:1: rule__ReferenceAssignment__Group_3_1__3__Impl : ( '}' ) ;
    public final void rule__ReferenceAssignment__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6976:1: ( ( '}' ) )
            // InternalML2.g:6977:1: ( '}' )
            {
            // InternalML2.g:6977:1: ( '}' )
            // InternalML2.g:6978:2: '}'
            {
             before(grammarAccess.getReferenceAssignmentAccess().getRightCurlyBracketKeyword_3_1_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalML2.g:6988:1: rule__ReferenceAssignment__Group_3_1_2__0 : rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:6992:1: ( rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1 )
            // InternalML2.g:6993:2: rule__ReferenceAssignment__Group_3_1_2__0__Impl rule__ReferenceAssignment__Group_3_1_2__1
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
    // InternalML2.g:7000:1: rule__ReferenceAssignment__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7004:1: ( ( ',' ) )
            // InternalML2.g:7005:1: ( ',' )
            {
            // InternalML2.g:7005:1: ( ',' )
            // InternalML2.g:7006:2: ','
            {
             before(grammarAccess.getReferenceAssignmentAccess().getCommaKeyword_3_1_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:7015:1: rule__ReferenceAssignment__Group_3_1_2__1 : rule__ReferenceAssignment__Group_3_1_2__1__Impl ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7019:1: ( rule__ReferenceAssignment__Group_3_1_2__1__Impl )
            // InternalML2.g:7020:2: rule__ReferenceAssignment__Group_3_1_2__1__Impl
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
    // InternalML2.g:7026:1: rule__ReferenceAssignment__Group_3_1_2__1__Impl : ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) ;
    public final void rule__ReferenceAssignment__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7030:1: ( ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) ) )
            // InternalML2.g:7031:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            {
            // InternalML2.g:7031:1: ( ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 ) )
            // InternalML2.g:7032:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsAssignment_3_1_2_1()); 
            // InternalML2.g:7033:2: ( rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 )
            // InternalML2.g:7033:3: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1
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
    // InternalML2.g:7042:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7046:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalML2.g:7047:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalML2.g:7054:1: rule__NUMBER__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7058:1: ( ( ( '-' )? ) )
            // InternalML2.g:7059:1: ( ( '-' )? )
            {
            // InternalML2.g:7059:1: ( ( '-' )? )
            // InternalML2.g:7060:2: ( '-' )?
            {
             before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
            // InternalML2.g:7061:2: ( '-' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==58) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalML2.g:7061:3: '-'
                    {
                    match(input,58,FOLLOW_2); 

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
    // InternalML2.g:7069:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7073:1: ( rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2 )
            // InternalML2.g:7074:2: rule__NUMBER__Group__1__Impl rule__NUMBER__Group__2
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
    // InternalML2.g:7081:1: rule__NUMBER__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7085:1: ( ( RULE_INT ) )
            // InternalML2.g:7086:1: ( RULE_INT )
            {
            // InternalML2.g:7086:1: ( RULE_INT )
            // InternalML2.g:7087:2: RULE_INT
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
    // InternalML2.g:7096:1: rule__NUMBER__Group__2 : rule__NUMBER__Group__2__Impl ;
    public final void rule__NUMBER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7100:1: ( rule__NUMBER__Group__2__Impl )
            // InternalML2.g:7101:2: rule__NUMBER__Group__2__Impl
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
    // InternalML2.g:7107:1: rule__NUMBER__Group__2__Impl : ( ( rule__NUMBER__Group_2__0 )? ) ;
    public final void rule__NUMBER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7111:1: ( ( ( rule__NUMBER__Group_2__0 )? ) )
            // InternalML2.g:7112:1: ( ( rule__NUMBER__Group_2__0 )? )
            {
            // InternalML2.g:7112:1: ( ( rule__NUMBER__Group_2__0 )? )
            // InternalML2.g:7113:2: ( rule__NUMBER__Group_2__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_2()); 
            // InternalML2.g:7114:2: ( rule__NUMBER__Group_2__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==32) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalML2.g:7114:3: rule__NUMBER__Group_2__0
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
    // InternalML2.g:7123:1: rule__NUMBER__Group_2__0 : rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 ;
    public final void rule__NUMBER__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7127:1: ( rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1 )
            // InternalML2.g:7128:2: rule__NUMBER__Group_2__0__Impl rule__NUMBER__Group_2__1
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
    // InternalML2.g:7135:1: rule__NUMBER__Group_2__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7139:1: ( ( '.' ) )
            // InternalML2.g:7140:1: ( '.' )
            {
            // InternalML2.g:7140:1: ( '.' )
            // InternalML2.g:7141:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalML2.g:7150:1: rule__NUMBER__Group_2__1 : rule__NUMBER__Group_2__1__Impl ;
    public final void rule__NUMBER__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7154:1: ( rule__NUMBER__Group_2__1__Impl )
            // InternalML2.g:7155:2: rule__NUMBER__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalML2.g:7161:1: rule__NUMBER__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7165:1: ( ( RULE_INT ) )
            // InternalML2.g:7166:1: ( RULE_INT )
            {
            // InternalML2.g:7166:1: ( RULE_INT )
            // InternalML2.g:7167:2: RULE_INT
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


    // $ANTLR start "rule__UnnamedIndividual__Group__0"
    // InternalML2.g:7177:1: rule__UnnamedIndividual__Group__0 : rule__UnnamedIndividual__Group__0__Impl rule__UnnamedIndividual__Group__1 ;
    public final void rule__UnnamedIndividual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7181:1: ( rule__UnnamedIndividual__Group__0__Impl rule__UnnamedIndividual__Group__1 )
            // InternalML2.g:7182:2: rule__UnnamedIndividual__Group__0__Impl rule__UnnamedIndividual__Group__1
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
    // InternalML2.g:7189:1: rule__UnnamedIndividual__Group__0__Impl : ( () ) ;
    public final void rule__UnnamedIndividual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7193:1: ( ( () ) )
            // InternalML2.g:7194:1: ( () )
            {
            // InternalML2.g:7194:1: ( () )
            // InternalML2.g:7195:2: ()
            {
             before(grammarAccess.getUnnamedIndividualAccess().getIndividualAction_0()); 
            // InternalML2.g:7196:2: ()
            // InternalML2.g:7196:3: 
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
    // InternalML2.g:7204:1: rule__UnnamedIndividual__Group__1 : rule__UnnamedIndividual__Group__1__Impl rule__UnnamedIndividual__Group__2 ;
    public final void rule__UnnamedIndividual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7208:1: ( rule__UnnamedIndividual__Group__1__Impl rule__UnnamedIndividual__Group__2 )
            // InternalML2.g:7209:2: rule__UnnamedIndividual__Group__1__Impl rule__UnnamedIndividual__Group__2
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
    // InternalML2.g:7216:1: rule__UnnamedIndividual__Group__1__Impl : ( '[' ) ;
    public final void rule__UnnamedIndividual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7220:1: ( ( '[' ) )
            // InternalML2.g:7221:1: ( '[' )
            {
            // InternalML2.g:7221:1: ( '[' )
            // InternalML2.g:7222:2: '['
            {
             before(grammarAccess.getUnnamedIndividualAccess().getLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalML2.g:7231:1: rule__UnnamedIndividual__Group__2 : rule__UnnamedIndividual__Group__2__Impl rule__UnnamedIndividual__Group__3 ;
    public final void rule__UnnamedIndividual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7235:1: ( rule__UnnamedIndividual__Group__2__Impl rule__UnnamedIndividual__Group__3 )
            // InternalML2.g:7236:2: rule__UnnamedIndividual__Group__2__Impl rule__UnnamedIndividual__Group__3
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
    // InternalML2.g:7243:1: rule__UnnamedIndividual__Group__2__Impl : ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* ) ;
    public final void rule__UnnamedIndividual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7247:1: ( ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* ) )
            // InternalML2.g:7248:1: ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* )
            {
            // InternalML2.g:7248:1: ( ( rule__UnnamedIndividual__AssignmentsAssignment_2 )* )
            // InternalML2.g:7249:2: ( rule__UnnamedIndividual__AssignmentsAssignment_2 )*
            {
             before(grammarAccess.getUnnamedIndividualAccess().getAssignmentsAssignment_2()); 
            // InternalML2.g:7250:2: ( rule__UnnamedIndividual__AssignmentsAssignment_2 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalML2.g:7250:3: rule__UnnamedIndividual__AssignmentsAssignment_2
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
    // InternalML2.g:7258:1: rule__UnnamedIndividual__Group__3 : rule__UnnamedIndividual__Group__3__Impl ;
    public final void rule__UnnamedIndividual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7262:1: ( rule__UnnamedIndividual__Group__3__Impl )
            // InternalML2.g:7263:2: rule__UnnamedIndividual__Group__3__Impl
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
    // InternalML2.g:7269:1: rule__UnnamedIndividual__Group__3__Impl : ( ']' ) ;
    public final void rule__UnnamedIndividual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7273:1: ( ( ']' ) )
            // InternalML2.g:7274:1: ( ']' )
            {
            // InternalML2.g:7274:1: ( ']' )
            // InternalML2.g:7275:2: ']'
            {
             before(grammarAccess.getUnnamedIndividualAccess().getRightSquareBracketKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalML2.g:7285:1: rule__SimpleAttributeAssignment__Group__0 : rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 ;
    public final void rule__SimpleAttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7289:1: ( rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1 )
            // InternalML2.g:7290:2: rule__SimpleAttributeAssignment__Group__0__Impl rule__SimpleAttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalML2.g:7297:1: rule__SimpleAttributeAssignment__Group__0__Impl : ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7301:1: ( ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) ) )
            // InternalML2.g:7302:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            {
            // InternalML2.g:7302:1: ( ( rule__SimpleAttributeAssignment__AttributeAssignment_0 ) )
            // InternalML2.g:7303:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAssignment_0()); 
            // InternalML2.g:7304:2: ( rule__SimpleAttributeAssignment__AttributeAssignment_0 )
            // InternalML2.g:7304:3: rule__SimpleAttributeAssignment__AttributeAssignment_0
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
    // InternalML2.g:7312:1: rule__SimpleAttributeAssignment__Group__1 : rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 ;
    public final void rule__SimpleAttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7316:1: ( rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2 )
            // InternalML2.g:7317:2: rule__SimpleAttributeAssignment__Group__1__Impl rule__SimpleAttributeAssignment__Group__2
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
    // InternalML2.g:7324:1: rule__SimpleAttributeAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleAttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7328:1: ( ( '=' ) )
            // InternalML2.g:7329:1: ( '=' )
            {
            // InternalML2.g:7329:1: ( '=' )
            // InternalML2.g:7330:2: '='
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalML2.g:7339:1: rule__SimpleAttributeAssignment__Group__2 : rule__SimpleAttributeAssignment__Group__2__Impl ;
    public final void rule__SimpleAttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7343:1: ( rule__SimpleAttributeAssignment__Group__2__Impl )
            // InternalML2.g:7344:2: rule__SimpleAttributeAssignment__Group__2__Impl
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
    // InternalML2.g:7350:1: rule__SimpleAttributeAssignment__Group__2__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7354:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) ) )
            // InternalML2.g:7355:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            {
            // InternalML2.g:7355:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2 ) )
            // InternalML2.g:7356:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2()); 
            // InternalML2.g:7357:2: ( rule__SimpleAttributeAssignment__Alternatives_2 )
            // InternalML2.g:7357:3: rule__SimpleAttributeAssignment__Alternatives_2
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
    // InternalML2.g:7366:1: rule__SimpleAttributeAssignment__Group_2_3__0 : rule__SimpleAttributeAssignment__Group_2_3__0__Impl rule__SimpleAttributeAssignment__Group_2_3__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7370:1: ( rule__SimpleAttributeAssignment__Group_2_3__0__Impl rule__SimpleAttributeAssignment__Group_2_3__1 )
            // InternalML2.g:7371:2: rule__SimpleAttributeAssignment__Group_2_3__0__Impl rule__SimpleAttributeAssignment__Group_2_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalML2.g:7378:1: rule__SimpleAttributeAssignment__Group_2_3__0__Impl : ( '{' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7382:1: ( ( '{' ) )
            // InternalML2.g:7383:1: ( '{' )
            {
            // InternalML2.g:7383:1: ( '{' )
            // InternalML2.g:7384:2: '{'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLeftCurlyBracketKeyword_2_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalML2.g:7393:1: rule__SimpleAttributeAssignment__Group_2_3__1 : rule__SimpleAttributeAssignment__Group_2_3__1__Impl rule__SimpleAttributeAssignment__Group_2_3__2 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7397:1: ( rule__SimpleAttributeAssignment__Group_2_3__1__Impl rule__SimpleAttributeAssignment__Group_2_3__2 )
            // InternalML2.g:7398:2: rule__SimpleAttributeAssignment__Group_2_3__1__Impl rule__SimpleAttributeAssignment__Group_2_3__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalML2.g:7405:1: rule__SimpleAttributeAssignment__Group_2_3__1__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7409:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? ) )
            // InternalML2.g:7410:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? )
            {
            // InternalML2.g:7410:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )? )
            // InternalML2.g:7411:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )?
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1()); 
            // InternalML2.g:7412:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_STRING)||(LA77_0>=12 && LA77_0<=13)||LA77_0==50||LA77_0==58) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalML2.g:7412:3: rule__SimpleAttributeAssignment__Alternatives_2_3_1
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
    // InternalML2.g:7420:1: rule__SimpleAttributeAssignment__Group_2_3__2 : rule__SimpleAttributeAssignment__Group_2_3__2__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7424:1: ( rule__SimpleAttributeAssignment__Group_2_3__2__Impl )
            // InternalML2.g:7425:2: rule__SimpleAttributeAssignment__Group_2_3__2__Impl
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
    // InternalML2.g:7431:1: rule__SimpleAttributeAssignment__Group_2_3__2__Impl : ( '}' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7435:1: ( ( '}' ) )
            // InternalML2.g:7436:1: ( '}' )
            {
            // InternalML2.g:7436:1: ( '}' )
            // InternalML2.g:7437:2: '}'
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getRightCurlyBracketKeyword_2_3_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalML2.g:7447:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__0 : rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7451:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0__1 )
            // InternalML2.g:7452:2: rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0__1
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
    // InternalML2.g:7459:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl : ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7463:1: ( ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) ) )
            // InternalML2.g:7464:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) )
            {
            // InternalML2.g:7464:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 ) )
            // InternalML2.g:7465:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_3_1_0_0()); 
            // InternalML2.g:7466:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 )
            // InternalML2.g:7466:3: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0
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
    // InternalML2.g:7474:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__1 : rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7478:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl )
            // InternalML2.g:7479:2: rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl
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
    // InternalML2.g:7485:1: rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl : ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7489:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* ) )
            // InternalML2.g:7490:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* )
            {
            // InternalML2.g:7490:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )* )
            // InternalML2.g:7491:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )*
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_0_1()); 
            // InternalML2.g:7492:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==37) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalML2.g:7492:3: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0
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
    // InternalML2.g:7501:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0 : rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7505:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1 )
            // InternalML2.g:7506:2: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalML2.g:7513:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7517:1: ( ( ',' ) )
            // InternalML2.g:7518:1: ( ',' )
            {
            // InternalML2.g:7518:1: ( ',' )
            // InternalML2.g:7519:2: ','
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_0_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:7528:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1 : rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7532:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl )
            // InternalML2.g:7533:2: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl
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
    // InternalML2.g:7539:1: rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl : ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7543:1: ( ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) ) )
            // InternalML2.g:7544:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) )
            {
            // InternalML2.g:7544:1: ( ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 ) )
            // InternalML2.g:7545:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getLiteralAssignmentsAssignment_2_3_1_0_1_1()); 
            // InternalML2.g:7546:2: ( rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 )
            // InternalML2.g:7546:3: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1
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
    // InternalML2.g:7555:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__0 : rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7559:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1__1 )
            // InternalML2.g:7560:2: rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1__1
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
    // InternalML2.g:7567:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7571:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) ) )
            // InternalML2.g:7572:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) )
            {
            // InternalML2.g:7572:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 ) )
            // InternalML2.g:7573:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1_1_0()); 
            // InternalML2.g:7574:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0 )
            // InternalML2.g:7574:3: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_0
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
    // InternalML2.g:7582:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__1 : rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7586:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl )
            // InternalML2.g:7587:2: rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl
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
    // InternalML2.g:7593:1: rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl : ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7597:1: ( ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* ) )
            // InternalML2.g:7598:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* )
            {
            // InternalML2.g:7598:1: ( ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )* )
            // InternalML2.g:7599:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )*
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getGroup_2_3_1_1_1()); 
            // InternalML2.g:7600:2: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==37) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalML2.g:7600:3: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0
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
    // InternalML2.g:7609:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0 : rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1 ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7613:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1 )
            // InternalML2.g:7614:2: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalML2.g:7621:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7625:1: ( ( ',' ) )
            // InternalML2.g:7626:1: ( ',' )
            {
            // InternalML2.g:7626:1: ( ',' )
            // InternalML2.g:7627:2: ','
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getCommaKeyword_2_3_1_1_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalML2.g:7636:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1 : rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7640:1: ( rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl )
            // InternalML2.g:7641:2: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl
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
    // InternalML2.g:7647:1: rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl : ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) ) ;
    public final void rule__SimpleAttributeAssignment__Group_2_3_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7651:1: ( ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) ) )
            // InternalML2.g:7652:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) )
            {
            // InternalML2.g:7652:1: ( ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 ) )
            // InternalML2.g:7653:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAlternatives_2_3_1_1_1_1()); 
            // InternalML2.g:7654:2: ( rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1 )
            // InternalML2.g:7654:3: rule__SimpleAttributeAssignment__Alternatives_2_3_1_1_1_1
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
    // InternalML2.g:7663:1: rule__GeneralizationSet__UnorderedGroup_0 : ( rule__GeneralizationSet__UnorderedGroup_0__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
        	
        try {
            // InternalML2.g:7668:1: ( ( rule__GeneralizationSet__UnorderedGroup_0__0 )? )
            // InternalML2.g:7669:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            {
            // InternalML2.g:7669:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( LA80_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt80=1;
            }
            else if ( LA80_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalML2.g:7669:2: rule__GeneralizationSet__UnorderedGroup_0__0
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
    // InternalML2.g:7677:1: rule__GeneralizationSet__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalML2.g:7682:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) )
            // InternalML2.g:7683:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            {
            // InternalML2.g:7683:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( LA81_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt81=1;
            }
            else if ( LA81_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalML2.g:7684:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    {
                    // InternalML2.g:7684:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    // InternalML2.g:7685:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalML2.g:7685:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    // InternalML2.g:7686:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalML2.g:7692:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalML2.g:7693:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalML2.g:7694:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalML2.g:7694:7: rule__GeneralizationSet__IsDisjointAssignment_0_0
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
                    // InternalML2.g:7699:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    {
                    // InternalML2.g:7699:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    // InternalML2.g:7700:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalML2.g:7700:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    // InternalML2.g:7701:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalML2.g:7707:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalML2.g:7708:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalML2.g:7709:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalML2.g:7709:7: rule__GeneralizationSet__IsCompleteAssignment_0_1
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
    // InternalML2.g:7722:1: rule__GeneralizationSet__UnorderedGroup_0__0 : rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7726:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? )
            // InternalML2.g:7727:2: rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_47);
            rule__GeneralizationSet__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalML2.g:7728:2: ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( LA82_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt82=1;
            }
            else if ( LA82_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalML2.g:7728:2: rule__GeneralizationSet__UnorderedGroup_0__1
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
    // InternalML2.g:7734:1: rule__GeneralizationSet__UnorderedGroup_0__1 : rule__GeneralizationSet__UnorderedGroup_0__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7738:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl )
            // InternalML2.g:7739:2: rule__GeneralizationSet__UnorderedGroup_0__Impl
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
    // InternalML2.g:7746:1: rule__ML2Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ML2Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7750:1: ( ( ruleQualifiedName ) )
            // InternalML2.g:7751:2: ( ruleQualifiedName )
            {
            // InternalML2.g:7751:2: ( ruleQualifiedName )
            // InternalML2.g:7752:3: ruleQualifiedName
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
    // InternalML2.g:7761:1: rule__ML2Model__IncludesAssignment_3_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ML2Model__IncludesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7765:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7766:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7766:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7767:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getML2ModelAccess().getIncludesML2ModelCrossReference_3_0_1_0()); 
            // InternalML2.g:7768:3: ( ruleQualifiedName )
            // InternalML2.g:7769:4: ruleQualifiedName
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
    // InternalML2.g:7780:1: rule__ML2Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__ML2Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7784:1: ( ( ruleModelElement ) )
            // InternalML2.g:7785:2: ( ruleModelElement )
            {
            // InternalML2.g:7785:2: ( ruleModelElement )
            // InternalML2.g:7786:3: ruleModelElement
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
    // InternalML2.g:7795:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7799:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalML2.g:7800:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalML2.g:7800:2: ( ruleQualifiedNameWithWildcard )
            // InternalML2.g:7801:3: ruleQualifiedNameWithWildcard
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
    // InternalML2.g:7810:1: rule__Individual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Individual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7814:1: ( ( RULE_ID ) )
            // InternalML2.g:7815:2: ( RULE_ID )
            {
            // InternalML2.g:7815:2: ( RULE_ID )
            // InternalML2.g:7816:3: RULE_ID
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
    // InternalML2.g:7825:1: rule__Individual__InstantiatedClassesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7829:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7830:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7830:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7831:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_3_0()); 
            // InternalML2.g:7832:3: ( ruleQualifiedName )
            // InternalML2.g:7833:4: ruleQualifiedName
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
    // InternalML2.g:7844:1: rule__Individual__InstantiatedClassesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Individual__InstantiatedClassesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7848:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7849:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7849:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7850:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getIndividualAccess().getInstantiatedClassesML2ClassCrossReference_4_1_0()); 
            // InternalML2.g:7851:3: ( ruleQualifiedName )
            // InternalML2.g:7852:4: ruleQualifiedName
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
    // InternalML2.g:7863:1: rule__Individual__AssignmentsAssignment_5_1 : ( ruleFeatureAssignment ) ;
    public final void rule__Individual__AssignmentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7867:1: ( ( ruleFeatureAssignment ) )
            // InternalML2.g:7868:2: ( ruleFeatureAssignment )
            {
            // InternalML2.g:7868:2: ( ruleFeatureAssignment )
            // InternalML2.g:7869:3: ruleFeatureAssignment
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
    // InternalML2.g:7878:1: rule__ML2Class__AssignmentsAssignment_1_1_0 : ( ruleFeatureAssignment ) ;
    public final void rule__ML2Class__AssignmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7882:1: ( ( ruleFeatureAssignment ) )
            // InternalML2.g:7883:2: ( ruleFeatureAssignment )
            {
            // InternalML2.g:7883:2: ( ruleFeatureAssignment )
            // InternalML2.g:7884:3: ruleFeatureAssignment
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
    // InternalML2.g:7893:1: rule__ML2Class__FeaturesAssignment_1_1_1 : ( ruleFeature ) ;
    public final void rule__ML2Class__FeaturesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7897:1: ( ( ruleFeature ) )
            // InternalML2.g:7898:2: ( ruleFeature )
            {
            // InternalML2.g:7898:2: ( ruleFeature )
            // InternalML2.g:7899:3: ruleFeature
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
    // InternalML2.g:7908:1: rule__SomeFOClass__InstantiatedClassesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__InstantiatedClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7912:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7913:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7913:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7914:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0()); 
            // InternalML2.g:7915:3: ( ruleQualifiedName )
            // InternalML2.g:7916:4: ruleQualifiedName
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
    // InternalML2.g:7927:1: rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__InstantiatedClassesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7931:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7932:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7932:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7933:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0()); 
            // InternalML2.g:7934:3: ( ruleQualifiedName )
            // InternalML2.g:7935:4: ruleQualifiedName
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
    // InternalML2.g:7946:1: rule__SomeFOClass__SuperClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__SuperClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7950:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7951:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7951:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7952:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0()); 
            // InternalML2.g:7953:3: ( ruleQualifiedName )
            // InternalML2.g:7954:4: ruleQualifiedName
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
    // InternalML2.g:7965:1: rule__SomeFOClass__SuperClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SomeFOClass__SuperClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7969:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7970:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7970:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7971:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSomeFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0()); 
            // InternalML2.g:7972:3: ( ruleQualifiedName )
            // InternalML2.g:7973:4: ruleQualifiedName
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
    // InternalML2.g:7984:1: rule__NonFOClass__InstantiatedClassesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__InstantiatedClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:7988:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:7989:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:7989:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:7990:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_1_0()); 
            // InternalML2.g:7991:3: ( ruleQualifiedName )
            // InternalML2.g:7992:4: ruleQualifiedName
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
    // InternalML2.g:8003:1: rule__NonFOClass__InstantiatedClassesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__InstantiatedClassesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8007:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8008:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8008:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8009:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getInstantiatedClassesML2ClassCrossReference_1_2_1_0()); 
            // InternalML2.g:8010:3: ( ruleQualifiedName )
            // InternalML2.g:8011:4: ruleQualifiedName
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
    // InternalML2.g:8022:1: rule__NonFOClass__SuperClassesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SuperClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8026:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8027:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8027:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8028:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_1_0()); 
            // InternalML2.g:8029:3: ( ruleQualifiedName )
            // InternalML2.g:8030:4: ruleQualifiedName
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
    // InternalML2.g:8041:1: rule__NonFOClass__SuperClassesAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SuperClassesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8045:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8046:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8046:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8047:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSuperClassesML2ClassCrossReference_2_2_1_0()); 
            // InternalML2.g:8048:3: ( ruleQualifiedName )
            // InternalML2.g:8049:4: ruleQualifiedName
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
    // InternalML2.g:8060:1: rule__NonFOClass__SubordinatorsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SubordinatorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8064:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8065:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8065:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8066:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_1_0()); 
            // InternalML2.g:8067:3: ( ruleQualifiedName )
            // InternalML2.g:8068:4: ruleQualifiedName
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
    // InternalML2.g:8079:1: rule__NonFOClass__SubordinatorsAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__SubordinatorsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8083:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8084:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8084:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8085:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getSubordinatorsML2ClassCrossReference_3_2_1_0()); 
            // InternalML2.g:8086:3: ( ruleQualifiedName )
            // InternalML2.g:8087:4: ruleQualifiedName
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
    // InternalML2.g:8098:1: rule__NonFOClass__CategorizationTypeAssignment_4_0_0 : ( ruleCategorizationType ) ;
    public final void rule__NonFOClass__CategorizationTypeAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8102:1: ( ( ruleCategorizationType ) )
            // InternalML2.g:8103:2: ( ruleCategorizationType )
            {
            // InternalML2.g:8103:2: ( ruleCategorizationType )
            // InternalML2.g:8104:3: ruleCategorizationType
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
    // InternalML2.g:8113:1: rule__NonFOClass__CategorizedClassAssignment_4_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__CategorizedClassAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8117:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8118:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8118:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8119:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getCategorizedClassML2ClassCrossReference_4_0_1_0()); 
            // InternalML2.g:8120:3: ( ruleQualifiedName )
            // InternalML2.g:8121:4: ruleQualifiedName
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
    // InternalML2.g:8132:1: rule__NonFOClass__PowertypeOfAssignment_4_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NonFOClass__PowertypeOfAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8136:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8137:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8137:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8138:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNonFOClassAccess().getPowertypeOfML2ClassCrossReference_4_1_1_0()); 
            // InternalML2.g:8139:3: ( ruleQualifiedName )
            // InternalML2.g:8140:4: ruleQualifiedName
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
    // InternalML2.g:8151:1: rule__FOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8155:1: ( ( RULE_ID ) )
            // InternalML2.g:8156:2: ( RULE_ID )
            {
            // InternalML2.g:8156:2: ( RULE_ID )
            // InternalML2.g:8157:3: RULE_ID
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
    // InternalML2.g:8166:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8170:1: ( ( RULE_ID ) )
            // InternalML2.g:8171:2: ( RULE_ID )
            {
            // InternalML2.g:8171:2: ( RULE_ID )
            // InternalML2.g:8172:3: RULE_ID
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
    // InternalML2.g:8181:1: rule__HOClass__OrderAssignment_1 : ( RULE_INT ) ;
    public final void rule__HOClass__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8185:1: ( ( RULE_INT ) )
            // InternalML2.g:8186:2: ( RULE_INT )
            {
            // InternalML2.g:8186:2: ( RULE_INT )
            // InternalML2.g:8187:3: RULE_INT
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
    // InternalML2.g:8196:1: rule__HOClass__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__HOClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8200:1: ( ( RULE_ID ) )
            // InternalML2.g:8201:2: ( RULE_ID )
            {
            // InternalML2.g:8201:2: ( RULE_ID )
            // InternalML2.g:8202:3: RULE_ID
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
    // InternalML2.g:8211:1: rule__OrderlessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OrderlessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8215:1: ( ( RULE_ID ) )
            // InternalML2.g:8216:2: ( RULE_ID )
            {
            // InternalML2.g:8216:2: ( RULE_ID )
            // InternalML2.g:8217:3: RULE_ID
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
    // InternalML2.g:8226:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8230:1: ( ( ( 'disjoint' ) ) )
            // InternalML2.g:8231:2: ( ( 'disjoint' ) )
            {
            // InternalML2.g:8231:2: ( ( 'disjoint' ) )
            // InternalML2.g:8232:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalML2.g:8233:3: ( 'disjoint' )
            // InternalML2.g:8234:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalML2.g:8245:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8249:1: ( ( ( 'complete' ) ) )
            // InternalML2.g:8250:2: ( ( 'complete' ) )
            {
            // InternalML2.g:8250:2: ( ( 'complete' ) )
            // InternalML2.g:8251:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalML2.g:8252:3: ( 'complete' )
            // InternalML2.g:8253:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalML2.g:8264:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8268:1: ( ( RULE_ID ) )
            // InternalML2.g:8269:2: ( RULE_ID )
            {
            // InternalML2.g:8269:2: ( RULE_ID )
            // InternalML2.g:8270:3: RULE_ID
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
    // InternalML2.g:8279:1: rule__GeneralizationSet__GeneralAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8283:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8284:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8284:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8285:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralML2ClassCrossReference_4_0()); 
            // InternalML2.g:8286:3: ( ruleQualifiedName )
            // InternalML2.g:8287:4: ruleQualifiedName
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
    // InternalML2.g:8298:1: rule__GeneralizationSet__CategorizerAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__CategorizerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8302:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8303:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8303:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8304:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getCategorizerML2ClassCrossReference_5_1_0()); 
            // InternalML2.g:8305:3: ( ruleQualifiedName )
            // InternalML2.g:8306:4: ruleQualifiedName
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
    // InternalML2.g:8317:1: rule__GeneralizationSet__SpecificsAssignment_7 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8321:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8322:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8322:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8323:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_7_0()); 
            // InternalML2.g:8324:3: ( ruleQualifiedName )
            // InternalML2.g:8325:4: ruleQualifiedName
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
    // InternalML2.g:8336:1: rule__GeneralizationSet__SpecificsAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__SpecificsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8340:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8341:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8341:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8342:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getSpecificsML2ClassCrossReference_8_1_0()); 
            // InternalML2.g:8343:3: ( ruleQualifiedName )
            // InternalML2.g:8344:4: ruleQualifiedName
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
    // InternalML2.g:8355:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8359:1: ( ( RULE_ID ) )
            // InternalML2.g:8360:2: ( RULE_ID )
            {
            // InternalML2.g:8360:2: ( RULE_ID )
            // InternalML2.g:8361:3: RULE_ID
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
    // InternalML2.g:8370:1: rule__Attribute__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8374:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8375:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8375:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8376:3: ruleELEMENTBOUND
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
    // InternalML2.g:8385:1: rule__Attribute__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Attribute__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8389:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8390:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8390:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8391:3: ruleELEMENTBOUND
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


    // $ANTLR start "rule__Attribute__PrimitiveTypeAssignment_4_0"
    // InternalML2.g:8400:1: rule__Attribute__PrimitiveTypeAssignment_4_0 : ( rulePrimitiveType ) ;
    public final void rule__Attribute__PrimitiveTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8404:1: ( ( rulePrimitiveType ) )
            // InternalML2.g:8405:2: ( rulePrimitiveType )
            {
            // InternalML2.g:8405:2: ( rulePrimitiveType )
            // InternalML2.g:8406:3: rulePrimitiveType
            {
             before(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__PrimitiveTypeAssignment_4_0"


    // $ANTLR start "rule__Attribute___typeAssignment_4_1"
    // InternalML2.g:8415:1: rule__Attribute___typeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute___typeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8419:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8420:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8420:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8421:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_4_1_0()); 
            // InternalML2.g:8422:3: ( ruleQualifiedName )
            // InternalML2.g:8423:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().get_typeDataTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute___typeAssignment_4_1"


    // $ANTLR start "rule__Attribute__SubsetOfAssignment_5_1"
    // InternalML2.g:8434:1: rule__Attribute__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8438:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8439:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8439:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8440:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_1_0()); 
            // InternalML2.g:8441:3: ( ruleQualifiedName )
            // InternalML2.g:8442:4: ruleQualifiedName
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
    // InternalML2.g:8453:1: rule__Attribute__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8457:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8458:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8458:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8459:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeAccess().getSubsetOfAttributeCrossReference_5_2_1_0()); 
            // InternalML2.g:8460:3: ( ruleQualifiedName )
            // InternalML2.g:8461:4: ruleQualifiedName
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
    // InternalML2.g:8472:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8476:1: ( ( RULE_ID ) )
            // InternalML2.g:8477:2: ( RULE_ID )
            {
            // InternalML2.g:8477:2: ( RULE_ID )
            // InternalML2.g:8478:3: RULE_ID
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
    // InternalML2.g:8487:1: rule__Reference__LowerBoundAssignment_3_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8491:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8492:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8492:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8493:3: ruleELEMENTBOUND
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
    // InternalML2.g:8502:1: rule__Reference__UpperBoundAssignment_3_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__Reference__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8506:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8507:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8507:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8508:3: ruleELEMENTBOUND
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
    // InternalML2.g:8517:1: rule__Reference___typeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference___typeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8521:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8522:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8522:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8523:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().get_typeML2ClassCrossReference_4_0()); 
            // InternalML2.g:8524:3: ( ruleQualifiedName )
            // InternalML2.g:8525:4: ruleQualifiedName
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
    // InternalML2.g:8536:1: rule__Reference__SubsetOfAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8540:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8541:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8541:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8542:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_1_0()); 
            // InternalML2.g:8543:3: ( ruleQualifiedName )
            // InternalML2.g:8544:4: ruleQualifiedName
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
    // InternalML2.g:8555:1: rule__Reference__SubsetOfAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__SubsetOfAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8559:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8560:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8560:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8561:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getSubsetOfReferenceCrossReference_5_2_1_0()); 
            // InternalML2.g:8562:3: ( ruleQualifiedName )
            // InternalML2.g:8563:4: ruleQualifiedName
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
    // InternalML2.g:8574:1: rule__Reference__OppositeToAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__OppositeToAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8578:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8579:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8579:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8580:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAccess().getOppositeToReferenceCrossReference_6_1_0()); 
            // InternalML2.g:8581:3: ( ruleQualifiedName )
            // InternalML2.g:8582:4: ruleQualifiedName
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
    // InternalML2.g:8593:1: rule__RegularityAttribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8597:1: ( ( RULE_ID ) )
            // InternalML2.g:8598:2: ( RULE_ID )
            {
            // InternalML2.g:8598:2: ( RULE_ID )
            // InternalML2.g:8599:3: RULE_ID
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
    // InternalML2.g:8608:1: rule__RegularityAttribute__LowerBoundAssignment_4_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityAttribute__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8612:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8613:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8613:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8614:3: ruleELEMENTBOUND
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
    // InternalML2.g:8623:1: rule__RegularityAttribute__UpperBoundAssignment_4_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityAttribute__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8627:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8628:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8628:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8629:3: ruleELEMENTBOUND
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


    // $ANTLR start "rule__RegularityAttribute__PrimitiveTypeAssignment_5_0"
    // InternalML2.g:8638:1: rule__RegularityAttribute__PrimitiveTypeAssignment_5_0 : ( rulePrimitiveType ) ;
    public final void rule__RegularityAttribute__PrimitiveTypeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8642:1: ( ( rulePrimitiveType ) )
            // InternalML2.g:8643:2: ( rulePrimitiveType )
            {
            // InternalML2.g:8643:2: ( rulePrimitiveType )
            // InternalML2.g:8644:3: rulePrimitiveType
            {
             before(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute__PrimitiveTypeAssignment_5_0"


    // $ANTLR start "rule__RegularityAttribute___typeAssignment_5_1"
    // InternalML2.g:8653:1: rule__RegularityAttribute___typeAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute___typeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8657:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8658:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8658:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8659:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_5_1_0()); 
            // InternalML2.g:8660:3: ( ruleQualifiedName )
            // InternalML2.g:8661:4: ruleQualifiedName
            {
             before(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRegularityAttributeAccess().get_typeDataTypeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularityAttribute___typeAssignment_5_1"


    // $ANTLR start "rule__RegularityAttribute__SubsetOfAssignment_6_1"
    // InternalML2.g:8672:1: rule__RegularityAttribute__SubsetOfAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8676:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8677:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8677:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8678:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_1_0()); 
            // InternalML2.g:8679:3: ( ruleQualifiedName )
            // InternalML2.g:8680:4: ruleQualifiedName
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
    // InternalML2.g:8691:1: rule__RegularityAttribute__SubsetOfAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__SubsetOfAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8695:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8696:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8696:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8697:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getSubsetOfAttributeCrossReference_6_2_1_0()); 
            // InternalML2.g:8698:3: ( ruleQualifiedName )
            // InternalML2.g:8699:4: ruleQualifiedName
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
    // InternalML2.g:8710:1: rule__RegularityAttribute__RegularityTypeAssignment_7 : ( ruleRegularityFeatureType ) ;
    public final void rule__RegularityAttribute__RegularityTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8714:1: ( ( ruleRegularityFeatureType ) )
            // InternalML2.g:8715:2: ( ruleRegularityFeatureType )
            {
            // InternalML2.g:8715:2: ( ruleRegularityFeatureType )
            // InternalML2.g:8716:3: ruleRegularityFeatureType
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
    // InternalML2.g:8725:1: rule__RegularityAttribute__RegulatedFeatureAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityAttribute__RegulatedFeatureAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8729:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8730:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8730:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8731:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityAttributeAccess().getRegulatedFeatureFeatureCrossReference_8_0()); 
            // InternalML2.g:8732:3: ( ruleQualifiedName )
            // InternalML2.g:8733:4: ruleQualifiedName
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
    // InternalML2.g:8744:1: rule__RegularityReference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegularityReference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8748:1: ( ( RULE_ID ) )
            // InternalML2.g:8749:2: ( RULE_ID )
            {
            // InternalML2.g:8749:2: ( RULE_ID )
            // InternalML2.g:8750:3: RULE_ID
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
    // InternalML2.g:8759:1: rule__RegularityReference__LowerBoundAssignment_4_1 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityReference__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8763:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8764:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8764:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8765:3: ruleELEMENTBOUND
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
    // InternalML2.g:8774:1: rule__RegularityReference__UpperBoundAssignment_4_3 : ( ruleELEMENTBOUND ) ;
    public final void rule__RegularityReference__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8778:1: ( ( ruleELEMENTBOUND ) )
            // InternalML2.g:8779:2: ( ruleELEMENTBOUND )
            {
            // InternalML2.g:8779:2: ( ruleELEMENTBOUND )
            // InternalML2.g:8780:3: ruleELEMENTBOUND
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
    // InternalML2.g:8789:1: rule__RegularityReference___typeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference___typeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8793:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8794:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8794:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8795:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().get_typeML2ClassCrossReference_5_0()); 
            // InternalML2.g:8796:3: ( ruleQualifiedName )
            // InternalML2.g:8797:4: ruleQualifiedName
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
    // InternalML2.g:8808:1: rule__RegularityReference__SubsetOfAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8812:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8813:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8813:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8814:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_1_0()); 
            // InternalML2.g:8815:3: ( ruleQualifiedName )
            // InternalML2.g:8816:4: ruleQualifiedName
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
    // InternalML2.g:8827:1: rule__RegularityReference__SubsetOfAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__SubsetOfAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8831:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8832:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8832:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8833:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getSubsetOfReferenceCrossReference_6_2_1_0()); 
            // InternalML2.g:8834:3: ( ruleQualifiedName )
            // InternalML2.g:8835:4: ruleQualifiedName
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
    // InternalML2.g:8846:1: rule__RegularityReference__OppositeToAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__OppositeToAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8850:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8851:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8851:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8852:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getOppositeToReferenceCrossReference_7_1_0()); 
            // InternalML2.g:8853:3: ( ruleQualifiedName )
            // InternalML2.g:8854:4: ruleQualifiedName
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
    // InternalML2.g:8865:1: rule__RegularityReference__RegularityTypeAssignment_8 : ( ruleRegularityFeatureType ) ;
    public final void rule__RegularityReference__RegularityTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8869:1: ( ( ruleRegularityFeatureType ) )
            // InternalML2.g:8870:2: ( ruleRegularityFeatureType )
            {
            // InternalML2.g:8870:2: ( ruleRegularityFeatureType )
            // InternalML2.g:8871:3: ruleRegularityFeatureType
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
    // InternalML2.g:8880:1: rule__RegularityReference__RegulatedFeatureAssignment_9 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegularityReference__RegulatedFeatureAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8884:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8885:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8885:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8886:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRegularityReferenceAccess().getRegulatedFeatureFeatureCrossReference_9_0()); 
            // InternalML2.g:8887:3: ( ruleQualifiedName )
            // InternalML2.g:8888:4: ruleQualifiedName
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
    // InternalML2.g:8899:1: rule__SingleAttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SingleAttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8903:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8904:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8904:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8905:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalML2.g:8906:3: ( ruleQualifiedName )
            // InternalML2.g:8907:4: ruleQualifiedName
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


    // $ANTLR start "rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0"
    // InternalML2.g:8918:1: rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8922:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8923:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8923:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8924:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_3_0_0()); 
            // InternalML2.g:8925:3: ( ruleQualifiedName )
            // InternalML2.g:8926:4: ruleQualifiedName
            {
             before(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getSingleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleAttributeAssignment__IndividualAssignmentsAssignment_3_0"


    // $ANTLR start "rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1"
    // InternalML2.g:8937:1: rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SingleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8941:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:8942:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:8942:2: ( ruleUnnamedIndividual )
            // InternalML2.g:8943:3: ruleUnnamedIndividual
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
    // InternalML2.g:8952:1: rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2 : ( ruleLiteral ) ;
    public final void rule__SingleAttributeAssignment__LiteralAssignmentsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8956:1: ( ( ruleLiteral ) )
            // InternalML2.g:8957:2: ( ruleLiteral )
            {
            // InternalML2.g:8957:2: ( ruleLiteral )
            // InternalML2.g:8958:3: ruleLiteral
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
    // InternalML2.g:8967:1: rule__MultipleAttributeAssignment__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MultipleAttributeAssignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8971:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:8972:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:8972:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:8973:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalML2.g:8974:3: ( ruleQualifiedName )
            // InternalML2.g:8975:4: ruleQualifiedName
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
    // InternalML2.g:8986:1: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0 : ( ruleLiteral ) ;
    public final void rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:8990:1: ( ( ruleLiteral ) )
            // InternalML2.g:8991:2: ( ruleLiteral )
            {
            // InternalML2.g:8991:2: ( ruleLiteral )
            // InternalML2.g:8992:3: ruleLiteral
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
    // InternalML2.g:9001:1: rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1 : ( ruleLiteral ) ;
    public final void rule__MultipleAttributeAssignment__LiteralAssignmentsAssignment_4_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9005:1: ( ( ruleLiteral ) )
            // InternalML2.g:9006:2: ( ruleLiteral )
            {
            // InternalML2.g:9006:2: ( ruleLiteral )
            // InternalML2.g:9007:3: ruleLiteral
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


    // $ANTLR start "rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0"
    // InternalML2.g:9016:1: rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9020:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9021:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9021:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9022:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_4_1_0_0_0()); 
            // InternalML2.g:9023:3: ( ruleQualifiedName )
            // InternalML2.g:9024:4: ruleQualifiedName
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_4_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_4_1_0_0_0_1()); 

            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_4_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_0_0"


    // $ANTLR start "rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1"
    // InternalML2.g:9035:1: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9039:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9040:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9040:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9041:3: ruleUnnamedIndividual
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


    // $ANTLR start "rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0"
    // InternalML2.g:9050:1: rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9054:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9055:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9055:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9056:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_4_1_1_1_0_0()); 
            // InternalML2.g:9057:3: ( ruleQualifiedName )
            // InternalML2.g:9058:4: ruleQualifiedName
            {
             before(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_4_1_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_4_1_1_1_0_0_1()); 

            }

             after(grammarAccess.getMultipleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_4_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleAttributeAssignment__IndividualAssignmentsAssignment_4_1_1_1_0"


    // $ANTLR start "rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1"
    // InternalML2.g:9069:1: rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__MultipleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_4_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9073:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9074:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9074:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9075:3: ruleUnnamedIndividual
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
    // InternalML2.g:9084:1: rule__ReferenceAssignment__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9088:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9089:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9089:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9090:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getReferenceReferenceCrossReference_1_0()); 
            // InternalML2.g:9091:3: ( ruleQualifiedName )
            // InternalML2.g:9092:4: ruleQualifiedName
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
    // InternalML2.g:9103:1: rule__ReferenceAssignment__AssignmentsAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9107:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9108:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9108:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9109:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_0_0()); 
            // InternalML2.g:9110:3: ( ruleQualifiedName )
            // InternalML2.g:9111:4: ruleQualifiedName
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
    // InternalML2.g:9122:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9126:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9127:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9127:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9128:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_1_0()); 
            // InternalML2.g:9129:3: ( ruleQualifiedName )
            // InternalML2.g:9130:4: ruleQualifiedName
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
    // InternalML2.g:9141:1: rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceAssignment__AssignmentsAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9145:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9146:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9146:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9147:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceAssignmentAccess().getAssignmentsEntityDeclarationCrossReference_3_1_2_1_0()); 
            // InternalML2.g:9148:3: ( ruleQualifiedName )
            // InternalML2.g:9149:4: ruleQualifiedName
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
    // InternalML2.g:9160:1: rule__ML2String__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__ML2String__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9164:1: ( ( RULE_STRING ) )
            // InternalML2.g:9165:2: ( RULE_STRING )
            {
            // InternalML2.g:9165:2: ( RULE_STRING )
            // InternalML2.g:9166:3: RULE_STRING
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
    // InternalML2.g:9175:1: rule__ML2Number__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__ML2Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9179:1: ( ( ruleNUMBER ) )
            // InternalML2.g:9180:2: ( ruleNUMBER )
            {
            // InternalML2.g:9180:2: ( ruleNUMBER )
            // InternalML2.g:9181:3: ruleNUMBER
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
    // InternalML2.g:9190:1: rule__ML2Boolean__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__ML2Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9194:1: ( ( ruleBOOLEAN ) )
            // InternalML2.g:9195:2: ( ruleBOOLEAN )
            {
            // InternalML2.g:9195:2: ( ruleBOOLEAN )
            // InternalML2.g:9196:3: ruleBOOLEAN
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
    // InternalML2.g:9205:1: rule__UnnamedIndividual__AssignmentsAssignment_2 : ( ruleSimpleAttributeAssignment ) ;
    public final void rule__UnnamedIndividual__AssignmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9209:1: ( ( ruleSimpleAttributeAssignment ) )
            // InternalML2.g:9210:2: ( ruleSimpleAttributeAssignment )
            {
            // InternalML2.g:9210:2: ( ruleSimpleAttributeAssignment )
            // InternalML2.g:9211:3: ruleSimpleAttributeAssignment
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
    // InternalML2.g:9220:1: rule__SimpleAttributeAssignment__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9224:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9225:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9225:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9226:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalML2.g:9227:3: ( ruleQualifiedName )
            // InternalML2.g:9228:4: ruleQualifiedName
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


    // $ANTLR start "rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0"
    // InternalML2.g:9239:1: rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9243:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9244:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9244:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9245:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_0_0()); 
            // InternalML2.g:9246:3: ( ruleQualifiedName )
            // InternalML2.g:9247:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1"
    // InternalML2.g:9258:1: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9262:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9263:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9263:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9264:3: ruleUnnamedIndividual
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
    // InternalML2.g:9273:1: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2 : ( ruleLiteral ) ;
    public final void rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9277:1: ( ( ruleLiteral ) )
            // InternalML2.g:9278:2: ( ruleLiteral )
            {
            // InternalML2.g:9278:2: ( ruleLiteral )
            // InternalML2.g:9279:3: ruleLiteral
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
    // InternalML2.g:9288:1: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0 : ( ruleLiteral ) ;
    public final void rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9292:1: ( ( ruleLiteral ) )
            // InternalML2.g:9293:2: ( ruleLiteral )
            {
            // InternalML2.g:9293:2: ( ruleLiteral )
            // InternalML2.g:9294:3: ruleLiteral
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
    // InternalML2.g:9303:1: rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1 : ( ruleLiteral ) ;
    public final void rule__SimpleAttributeAssignment__LiteralAssignmentsAssignment_2_3_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9307:1: ( ( ruleLiteral ) )
            // InternalML2.g:9308:2: ( ruleLiteral )
            {
            // InternalML2.g:9308:2: ( ruleLiteral )
            // InternalML2.g:9309:3: ruleLiteral
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


    // $ANTLR start "rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0"
    // InternalML2.g:9318:1: rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9322:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9323:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9323:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9324:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_3_1_1_0_0_0()); 
            // InternalML2.g:9325:3: ( ruleQualifiedName )
            // InternalML2.g:9326:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_0_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_3_1_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_0_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1"
    // InternalML2.g:9337:1: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9341:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9342:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9342:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9343:3: ruleUnnamedIndividual
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


    // $ANTLR start "rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0"
    // InternalML2.g:9352:1: rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9356:1: ( ( ( ruleQualifiedName ) ) )
            // InternalML2.g:9357:2: ( ( ruleQualifiedName ) )
            {
            // InternalML2.g:9357:2: ( ( ruleQualifiedName ) )
            // InternalML2.g:9358:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_3_1_1_1_1_0_0()); 
            // InternalML2.g:9359:3: ( ruleQualifiedName )
            // InternalML2.g:9360:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualQualifiedNameParserRuleCall_2_3_1_1_1_1_0_0_1()); 

            }

             after(grammarAccess.getSimpleAttributeAssignmentAccess().getIndividualAssignmentsIndividualCrossReference_2_3_1_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttributeAssignment__IndividualAssignmentsAssignment_2_3_1_1_1_1_0"


    // $ANTLR start "rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1"
    // InternalML2.g:9371:1: rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1 : ( ruleUnnamedIndividual ) ;
    public final void rule__SimpleAttributeAssignment__UnnamedIndividualAssignmentsAssignment_2_3_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalML2.g:9375:1: ( ( ruleUnnamedIndividual ) )
            // InternalML2.g:9376:2: ( ruleUnnamedIndividual )
            {
            // InternalML2.g:9376:2: ( ruleUnnamedIndividual )
            // InternalML2.g:9377:3: ruleUnnamedIndividual
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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\5\1\40\1\uffff\1\5\1\4\1\40\2\uffff";
    static final String dfa_3s = "\1\66\1\5\1\71\1\uffff\1\5\1\72\1\71\2\uffff";
    static final String dfa_4s = "\3\uffff\1\3\3\uffff\1\1\1\2";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\53\uffff\1\1\4\uffff\1\3",
            "\1\2",
            "\1\4\30\uffff\1\5",
            "",
            "\1\6",
            "\3\7\5\uffff\2\7\16\uffff\1\10\25\uffff\1\7\7\uffff\1\7",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1275:1: rule__FeatureAssignment__Alternatives : ( ( ruleSingleAttributeAssignment ) | ( ruleMultipleAttributeAssignment ) | ( ruleReferenceAssignment ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x18001E0C60000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x18001E0C40000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0042000020000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0042000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0142000020000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0142000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001D00003C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00040000001C0020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000007E00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00A0000007E00000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0404000000003070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0404000020003070L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0404000010003070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1800000000000002L});

}
