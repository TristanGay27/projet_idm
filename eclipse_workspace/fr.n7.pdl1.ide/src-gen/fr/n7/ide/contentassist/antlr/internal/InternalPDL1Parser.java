package fr.n7.ide.contentassist.antlr.internal;

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
import fr.n7.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "'needs'", "','", "'('", "')'", "'res'", "'quantity'", "'ws'", "'from'", "'to'", "'note'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL1.g"; }


    	private PDL1GrammarAccess grammarAccess;

    	public void setGrammarAccess(PDL1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL1.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL1.g:54:1: ( ruleProcess EOF )
            // InternalPDL1.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL1.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL1.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL1.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL1.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL1.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL1.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL1.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL1.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL1.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL1.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL1.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL1.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL1.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL1.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL1.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL1.g:103:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL1.g:104:1: ( ruleWorkDefinition EOF )
            // InternalPDL1.g:105:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL1.g:112:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:116:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL1.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL1.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL1.g:118:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL1.g:119:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL1.g:119:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleRessourceAllouee"
    // InternalPDL1.g:128:1: entryRuleRessourceAllouee : ruleRessourceAllouee EOF ;
    public final void entryRuleRessourceAllouee() throws RecognitionException {
        try {
            // InternalPDL1.g:129:1: ( ruleRessourceAllouee EOF )
            // InternalPDL1.g:130:1: ruleRessourceAllouee EOF
            {
             before(grammarAccess.getRessourceAlloueeRule()); 
            pushFollow(FOLLOW_1);
            ruleRessourceAllouee();

            state._fsp--;

             after(grammarAccess.getRessourceAlloueeRule()); 
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
    // $ANTLR end "entryRuleRessourceAllouee"


    // $ANTLR start "ruleRessourceAllouee"
    // InternalPDL1.g:137:1: ruleRessourceAllouee : ( ( rule__RessourceAllouee__Group__0 ) ) ;
    public final void ruleRessourceAllouee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:141:2: ( ( ( rule__RessourceAllouee__Group__0 ) ) )
            // InternalPDL1.g:142:2: ( ( rule__RessourceAllouee__Group__0 ) )
            {
            // InternalPDL1.g:142:2: ( ( rule__RessourceAllouee__Group__0 ) )
            // InternalPDL1.g:143:3: ( rule__RessourceAllouee__Group__0 )
            {
             before(grammarAccess.getRessourceAlloueeAccess().getGroup()); 
            // InternalPDL1.g:144:3: ( rule__RessourceAllouee__Group__0 )
            // InternalPDL1.g:144:4: rule__RessourceAllouee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RessourceAllouee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAlloueeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessourceAllouee"


    // $ANTLR start "entryRuleRessources"
    // InternalPDL1.g:153:1: entryRuleRessources : ruleRessources EOF ;
    public final void entryRuleRessources() throws RecognitionException {
        try {
            // InternalPDL1.g:154:1: ( ruleRessources EOF )
            // InternalPDL1.g:155:1: ruleRessources EOF
            {
             before(grammarAccess.getRessourcesRule()); 
            pushFollow(FOLLOW_1);
            ruleRessources();

            state._fsp--;

             after(grammarAccess.getRessourcesRule()); 
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
    // $ANTLR end "entryRuleRessources"


    // $ANTLR start "ruleRessources"
    // InternalPDL1.g:162:1: ruleRessources : ( ( rule__Ressources__Group__0 ) ) ;
    public final void ruleRessources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:166:2: ( ( ( rule__Ressources__Group__0 ) ) )
            // InternalPDL1.g:167:2: ( ( rule__Ressources__Group__0 ) )
            {
            // InternalPDL1.g:167:2: ( ( rule__Ressources__Group__0 ) )
            // InternalPDL1.g:168:3: ( rule__Ressources__Group__0 )
            {
             before(grammarAccess.getRessourcesAccess().getGroup()); 
            // InternalPDL1.g:169:3: ( rule__Ressources__Group__0 )
            // InternalPDL1.g:169:4: rule__Ressources__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourcesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessources"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL1.g:178:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL1.g:179:1: ( ruleWorkSequence EOF )
            // InternalPDL1.g:180:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL1.g:187:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:191:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL1.g:192:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL1.g:192:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL1.g:193:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL1.g:194:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL1.g:194:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL1.g:203:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL1.g:204:1: ( ruleGuidance EOF )
            // InternalPDL1.g:205:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL1.g:212:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:216:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL1.g:217:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL1.g:217:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL1.g:218:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL1.g:219:3: ( rule__Guidance__Group__0 )
            // InternalPDL1.g:219:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL1.g:228:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:232:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL1.g:233:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL1.g:233:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL1.g:234:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL1.g:235:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL1.g:235:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL1.g:243:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessources ) | ( ruleRessourceAllouee ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:247:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessources ) | ( ruleRessourceAllouee ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case RULE_ID:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL1.g:248:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL1.g:248:2: ( ruleWorkDefinition )
                    // InternalPDL1.g:249:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:254:2: ( ruleWorkSequence )
                    {
                    // InternalPDL1.g:254:2: ( ruleWorkSequence )
                    // InternalPDL1.g:255:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:260:2: ( ruleGuidance )
                    {
                    // InternalPDL1.g:260:2: ( ruleGuidance )
                    // InternalPDL1.g:261:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:266:2: ( ruleRessources )
                    {
                    // InternalPDL1.g:266:2: ( ruleRessources )
                    // InternalPDL1.g:267:3: ruleRessources
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourcesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRessources();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourcesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPDL1.g:272:2: ( ruleRessourceAllouee )
                    {
                    // InternalPDL1.g:272:2: ( ruleRessourceAllouee )
                    // InternalPDL1.g:273:3: ruleRessourceAllouee
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceAlloueeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRessourceAllouee();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceAlloueeParserRuleCall_4()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL1.g:282:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:286:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL1.g:287:2: ( ( 's2s' ) )
                    {
                    // InternalPDL1.g:287:2: ( ( 's2s' ) )
                    // InternalPDL1.g:288:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // InternalPDL1.g:289:3: ( 's2s' )
                    // InternalPDL1.g:289:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:293:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL1.g:293:2: ( ( 'f2s' ) )
                    // InternalPDL1.g:294:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // InternalPDL1.g:295:3: ( 'f2s' )
                    // InternalPDL1.g:295:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:299:2: ( ( 's2f' ) )
                    {
                    // InternalPDL1.g:299:2: ( ( 's2f' ) )
                    // InternalPDL1.g:300:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // InternalPDL1.g:301:3: ( 's2f' )
                    // InternalPDL1.g:301:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:305:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL1.g:305:2: ( ( 'f2f' ) )
                    // InternalPDL1.g:306:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // InternalPDL1.g:307:3: ( 'f2f' )
                    // InternalPDL1.g:307:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL1.g:315:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:319:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL1.g:320:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL1.g:327:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:331:1: ( ( 'process' ) )
            // InternalPDL1.g:332:1: ( 'process' )
            {
            // InternalPDL1.g:332:1: ( 'process' )
            // InternalPDL1.g:333:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL1.g:342:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:346:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL1.g:347:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL1.g:354:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:358:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalPDL1.g:359:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalPDL1.g:359:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalPDL1.g:360:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalPDL1.g:361:2: ( rule__Process__NameAssignment_1 )
            // InternalPDL1.g:361:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL1.g:369:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:373:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL1.g:374:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL1.g:381:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:385:1: ( ( '{' ) )
            // InternalPDL1.g:386:1: ( '{' )
            {
            // InternalPDL1.g:386:1: ( '{' )
            // InternalPDL1.g:387:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL1.g:396:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:400:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL1.g:401:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL1.g:408:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:412:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // InternalPDL1.g:413:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // InternalPDL1.g:413:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // InternalPDL1.g:414:2: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // InternalPDL1.g:415:2: ( rule__Process__ProcessElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==18||LA3_0==23||LA3_0==25||LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL1.g:415:3: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL1.g:423:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:427:1: ( rule__Process__Group__4__Impl )
            // InternalPDL1.g:428:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL1.g:434:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:438:1: ( ( '}' ) )
            // InternalPDL1.g:439:1: ( '}' )
            {
            // InternalPDL1.g:439:1: ( '}' )
            // InternalPDL1.g:440:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL1.g:450:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:454:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL1.g:455:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL1.g:462:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:466:1: ( ( 'wd' ) )
            // InternalPDL1.g:467:1: ( 'wd' )
            {
            // InternalPDL1.g:467:1: ( 'wd' )
            // InternalPDL1.g:468:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL1.g:477:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:481:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL1.g:482:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL1.g:489:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:493:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalPDL1.g:494:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalPDL1.g:494:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalPDL1.g:495:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalPDL1.g:496:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalPDL1.g:496:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL1.g:504:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:508:1: ( rule__WorkDefinition__Group__2__Impl )
            // InternalPDL1.g:509:2: rule__WorkDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL1.g:515:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__Group_2__0 )? ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:519:1: ( ( ( rule__WorkDefinition__Group_2__0 )? ) )
            // InternalPDL1.g:520:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            {
            // InternalPDL1.g:520:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            // InternalPDL1.g:521:2: ( rule__WorkDefinition__Group_2__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 
            // InternalPDL1.g:522:2: ( rule__WorkDefinition__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL1.g:522:3: rule__WorkDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__0"
    // InternalPDL1.g:531:1: rule__WorkDefinition__Group_2__0 : rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 ;
    public final void rule__WorkDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:535:1: ( rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 )
            // InternalPDL1.g:536:2: rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__WorkDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_2__0__Impl"
    // InternalPDL1.g:543:1: rule__WorkDefinition__Group_2__0__Impl : ( 'needs' ) ;
    public final void rule__WorkDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:547:1: ( ( 'needs' ) )
            // InternalPDL1.g:548:1: ( 'needs' )
            {
            // InternalPDL1.g:548:1: ( 'needs' )
            // InternalPDL1.g:549:2: 'needs'
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedsKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNeedsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__1"
    // InternalPDL1.g:558:1: rule__WorkDefinition__Group_2__1 : rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 ;
    public final void rule__WorkDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:562:1: ( rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 )
            // InternalPDL1.g:563:2: rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__WorkDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_2__1__Impl"
    // InternalPDL1.g:570:1: rule__WorkDefinition__Group_2__1__Impl : ( ( rule__WorkDefinition__RessourcesAssignment_2_1 ) ) ;
    public final void rule__WorkDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:574:1: ( ( ( rule__WorkDefinition__RessourcesAssignment_2_1 ) ) )
            // InternalPDL1.g:575:1: ( ( rule__WorkDefinition__RessourcesAssignment_2_1 ) )
            {
            // InternalPDL1.g:575:1: ( ( rule__WorkDefinition__RessourcesAssignment_2_1 ) )
            // InternalPDL1.g:576:2: ( rule__WorkDefinition__RessourcesAssignment_2_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getRessourcesAssignment_2_1()); 
            // InternalPDL1.g:577:2: ( rule__WorkDefinition__RessourcesAssignment_2_1 )
            // InternalPDL1.g:577:3: rule__WorkDefinition__RessourcesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__RessourcesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getRessourcesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__2"
    // InternalPDL1.g:585:1: rule__WorkDefinition__Group_2__2 : rule__WorkDefinition__Group_2__2__Impl ;
    public final void rule__WorkDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:589:1: ( rule__WorkDefinition__Group_2__2__Impl )
            // InternalPDL1.g:590:2: rule__WorkDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__2"


    // $ANTLR start "rule__WorkDefinition__Group_2__2__Impl"
    // InternalPDL1.g:596:1: rule__WorkDefinition__Group_2__2__Impl : ( ( rule__WorkDefinition__Group_2_2__0 )* ) ;
    public final void rule__WorkDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:600:1: ( ( ( rule__WorkDefinition__Group_2_2__0 )* ) )
            // InternalPDL1.g:601:1: ( ( rule__WorkDefinition__Group_2_2__0 )* )
            {
            // InternalPDL1.g:601:1: ( ( rule__WorkDefinition__Group_2_2__0 )* )
            // InternalPDL1.g:602:2: ( rule__WorkDefinition__Group_2_2__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2_2()); 
            // InternalPDL1.g:603:2: ( rule__WorkDefinition__Group_2_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL1.g:603:3: rule__WorkDefinition__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__WorkDefinition__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__0"
    // InternalPDL1.g:612:1: rule__WorkDefinition__Group_2_2__0 : rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1 ;
    public final void rule__WorkDefinition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:616:1: ( rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1 )
            // InternalPDL1.g:617:2: rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__WorkDefinition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__0__Impl"
    // InternalPDL1.g:624:1: rule__WorkDefinition__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:628:1: ( ( ',' ) )
            // InternalPDL1.g:629:1: ( ',' )
            {
            // InternalPDL1.g:629:1: ( ',' )
            // InternalPDL1.g:630:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__1"
    // InternalPDL1.g:639:1: rule__WorkDefinition__Group_2_2__1 : rule__WorkDefinition__Group_2_2__1__Impl ;
    public final void rule__WorkDefinition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:643:1: ( rule__WorkDefinition__Group_2_2__1__Impl )
            // InternalPDL1.g:644:2: rule__WorkDefinition__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__1__Impl"
    // InternalPDL1.g:650:1: rule__WorkDefinition__Group_2_2__1__Impl : ( ( rule__WorkDefinition__RessourcesAssignment_2_2_1 ) ) ;
    public final void rule__WorkDefinition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:654:1: ( ( ( rule__WorkDefinition__RessourcesAssignment_2_2_1 ) ) )
            // InternalPDL1.g:655:1: ( ( rule__WorkDefinition__RessourcesAssignment_2_2_1 ) )
            {
            // InternalPDL1.g:655:1: ( ( rule__WorkDefinition__RessourcesAssignment_2_2_1 ) )
            // InternalPDL1.g:656:2: ( rule__WorkDefinition__RessourcesAssignment_2_2_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getRessourcesAssignment_2_2_1()); 
            // InternalPDL1.g:657:2: ( rule__WorkDefinition__RessourcesAssignment_2_2_1 )
            // InternalPDL1.g:657:3: rule__WorkDefinition__RessourcesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__RessourcesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getRessourcesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__1__Impl"


    // $ANTLR start "rule__RessourceAllouee__Group__0"
    // InternalPDL1.g:666:1: rule__RessourceAllouee__Group__0 : rule__RessourceAllouee__Group__0__Impl rule__RessourceAllouee__Group__1 ;
    public final void rule__RessourceAllouee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:670:1: ( rule__RessourceAllouee__Group__0__Impl rule__RessourceAllouee__Group__1 )
            // InternalPDL1.g:671:2: rule__RessourceAllouee__Group__0__Impl rule__RessourceAllouee__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RessourceAllouee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RessourceAllouee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__0"


    // $ANTLR start "rule__RessourceAllouee__Group__0__Impl"
    // InternalPDL1.g:678:1: rule__RessourceAllouee__Group__0__Impl : ( ( rule__RessourceAllouee__RessourcesAssignment_0 ) ) ;
    public final void rule__RessourceAllouee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:682:1: ( ( ( rule__RessourceAllouee__RessourcesAssignment_0 ) ) )
            // InternalPDL1.g:683:1: ( ( rule__RessourceAllouee__RessourcesAssignment_0 ) )
            {
            // InternalPDL1.g:683:1: ( ( rule__RessourceAllouee__RessourcesAssignment_0 ) )
            // InternalPDL1.g:684:2: ( rule__RessourceAllouee__RessourcesAssignment_0 )
            {
             before(grammarAccess.getRessourceAlloueeAccess().getRessourcesAssignment_0()); 
            // InternalPDL1.g:685:2: ( rule__RessourceAllouee__RessourcesAssignment_0 )
            // InternalPDL1.g:685:3: rule__RessourceAllouee__RessourcesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RessourceAllouee__RessourcesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAlloueeAccess().getRessourcesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__0__Impl"


    // $ANTLR start "rule__RessourceAllouee__Group__1"
    // InternalPDL1.g:693:1: rule__RessourceAllouee__Group__1 : rule__RessourceAllouee__Group__1__Impl rule__RessourceAllouee__Group__2 ;
    public final void rule__RessourceAllouee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:697:1: ( rule__RessourceAllouee__Group__1__Impl rule__RessourceAllouee__Group__2 )
            // InternalPDL1.g:698:2: rule__RessourceAllouee__Group__1__Impl rule__RessourceAllouee__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RessourceAllouee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RessourceAllouee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__1"


    // $ANTLR start "rule__RessourceAllouee__Group__1__Impl"
    // InternalPDL1.g:705:1: rule__RessourceAllouee__Group__1__Impl : ( '(' ) ;
    public final void rule__RessourceAllouee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:709:1: ( ( '(' ) )
            // InternalPDL1.g:710:1: ( '(' )
            {
            // InternalPDL1.g:710:1: ( '(' )
            // InternalPDL1.g:711:2: '('
            {
             before(grammarAccess.getRessourceAlloueeAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRessourceAlloueeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__1__Impl"


    // $ANTLR start "rule__RessourceAllouee__Group__2"
    // InternalPDL1.g:720:1: rule__RessourceAllouee__Group__2 : rule__RessourceAllouee__Group__2__Impl rule__RessourceAllouee__Group__3 ;
    public final void rule__RessourceAllouee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:724:1: ( rule__RessourceAllouee__Group__2__Impl rule__RessourceAllouee__Group__3 )
            // InternalPDL1.g:725:2: rule__RessourceAllouee__Group__2__Impl rule__RessourceAllouee__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RessourceAllouee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RessourceAllouee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__2"


    // $ANTLR start "rule__RessourceAllouee__Group__2__Impl"
    // InternalPDL1.g:732:1: rule__RessourceAllouee__Group__2__Impl : ( ( rule__RessourceAllouee__NumberAssignment_2 ) ) ;
    public final void rule__RessourceAllouee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:736:1: ( ( ( rule__RessourceAllouee__NumberAssignment_2 ) ) )
            // InternalPDL1.g:737:1: ( ( rule__RessourceAllouee__NumberAssignment_2 ) )
            {
            // InternalPDL1.g:737:1: ( ( rule__RessourceAllouee__NumberAssignment_2 ) )
            // InternalPDL1.g:738:2: ( rule__RessourceAllouee__NumberAssignment_2 )
            {
             before(grammarAccess.getRessourceAlloueeAccess().getNumberAssignment_2()); 
            // InternalPDL1.g:739:2: ( rule__RessourceAllouee__NumberAssignment_2 )
            // InternalPDL1.g:739:3: rule__RessourceAllouee__NumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RessourceAllouee__NumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAlloueeAccess().getNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__2__Impl"


    // $ANTLR start "rule__RessourceAllouee__Group__3"
    // InternalPDL1.g:747:1: rule__RessourceAllouee__Group__3 : rule__RessourceAllouee__Group__3__Impl ;
    public final void rule__RessourceAllouee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:751:1: ( rule__RessourceAllouee__Group__3__Impl )
            // InternalPDL1.g:752:2: rule__RessourceAllouee__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RessourceAllouee__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__3"


    // $ANTLR start "rule__RessourceAllouee__Group__3__Impl"
    // InternalPDL1.g:758:1: rule__RessourceAllouee__Group__3__Impl : ( ')' ) ;
    public final void rule__RessourceAllouee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:762:1: ( ( ')' ) )
            // InternalPDL1.g:763:1: ( ')' )
            {
            // InternalPDL1.g:763:1: ( ')' )
            // InternalPDL1.g:764:2: ')'
            {
             before(grammarAccess.getRessourceAlloueeAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRessourceAlloueeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__Group__3__Impl"


    // $ANTLR start "rule__Ressources__Group__0"
    // InternalPDL1.g:774:1: rule__Ressources__Group__0 : rule__Ressources__Group__0__Impl rule__Ressources__Group__1 ;
    public final void rule__Ressources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:778:1: ( rule__Ressources__Group__0__Impl rule__Ressources__Group__1 )
            // InternalPDL1.g:779:2: rule__Ressources__Group__0__Impl rule__Ressources__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ressources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressources__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__0"


    // $ANTLR start "rule__Ressources__Group__0__Impl"
    // InternalPDL1.g:786:1: rule__Ressources__Group__0__Impl : ( 'res' ) ;
    public final void rule__Ressources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:790:1: ( ( 'res' ) )
            // InternalPDL1.g:791:1: ( 'res' )
            {
            // InternalPDL1.g:791:1: ( 'res' )
            // InternalPDL1.g:792:2: 'res'
            {
             before(grammarAccess.getRessourcesAccess().getResKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRessourcesAccess().getResKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__0__Impl"


    // $ANTLR start "rule__Ressources__Group__1"
    // InternalPDL1.g:801:1: rule__Ressources__Group__1 : rule__Ressources__Group__1__Impl rule__Ressources__Group__2 ;
    public final void rule__Ressources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:805:1: ( rule__Ressources__Group__1__Impl rule__Ressources__Group__2 )
            // InternalPDL1.g:806:2: rule__Ressources__Group__1__Impl rule__Ressources__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Ressources__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressources__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__1"


    // $ANTLR start "rule__Ressources__Group__1__Impl"
    // InternalPDL1.g:813:1: rule__Ressources__Group__1__Impl : ( ( rule__Ressources__NameAssignment_1 ) ) ;
    public final void rule__Ressources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:817:1: ( ( ( rule__Ressources__NameAssignment_1 ) ) )
            // InternalPDL1.g:818:1: ( ( rule__Ressources__NameAssignment_1 ) )
            {
            // InternalPDL1.g:818:1: ( ( rule__Ressources__NameAssignment_1 ) )
            // InternalPDL1.g:819:2: ( rule__Ressources__NameAssignment_1 )
            {
             before(grammarAccess.getRessourcesAccess().getNameAssignment_1()); 
            // InternalPDL1.g:820:2: ( rule__Ressources__NameAssignment_1 )
            // InternalPDL1.g:820:3: rule__Ressources__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressources__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourcesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__1__Impl"


    // $ANTLR start "rule__Ressources__Group__2"
    // InternalPDL1.g:828:1: rule__Ressources__Group__2 : rule__Ressources__Group__2__Impl rule__Ressources__Group__3 ;
    public final void rule__Ressources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:832:1: ( rule__Ressources__Group__2__Impl rule__Ressources__Group__3 )
            // InternalPDL1.g:833:2: rule__Ressources__Group__2__Impl rule__Ressources__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Ressources__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressources__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__2"


    // $ANTLR start "rule__Ressources__Group__2__Impl"
    // InternalPDL1.g:840:1: rule__Ressources__Group__2__Impl : ( 'quantity' ) ;
    public final void rule__Ressources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:844:1: ( ( 'quantity' ) )
            // InternalPDL1.g:845:1: ( 'quantity' )
            {
            // InternalPDL1.g:845:1: ( 'quantity' )
            // InternalPDL1.g:846:2: 'quantity'
            {
             before(grammarAccess.getRessourcesAccess().getQuantityKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRessourcesAccess().getQuantityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__2__Impl"


    // $ANTLR start "rule__Ressources__Group__3"
    // InternalPDL1.g:855:1: rule__Ressources__Group__3 : rule__Ressources__Group__3__Impl ;
    public final void rule__Ressources__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:859:1: ( rule__Ressources__Group__3__Impl )
            // InternalPDL1.g:860:2: rule__Ressources__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressources__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__3"


    // $ANTLR start "rule__Ressources__Group__3__Impl"
    // InternalPDL1.g:866:1: rule__Ressources__Group__3__Impl : ( ( rule__Ressources__QuantityAssignment_3 ) ) ;
    public final void rule__Ressources__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:870:1: ( ( ( rule__Ressources__QuantityAssignment_3 ) ) )
            // InternalPDL1.g:871:1: ( ( rule__Ressources__QuantityAssignment_3 ) )
            {
            // InternalPDL1.g:871:1: ( ( rule__Ressources__QuantityAssignment_3 ) )
            // InternalPDL1.g:872:2: ( rule__Ressources__QuantityAssignment_3 )
            {
             before(grammarAccess.getRessourcesAccess().getQuantityAssignment_3()); 
            // InternalPDL1.g:873:2: ( rule__Ressources__QuantityAssignment_3 )
            // InternalPDL1.g:873:3: rule__Ressources__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ressources__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRessourcesAccess().getQuantityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL1.g:882:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:886:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL1.g:887:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL1.g:894:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:898:1: ( ( 'ws' ) )
            // InternalPDL1.g:899:1: ( 'ws' )
            {
            // InternalPDL1.g:899:1: ( 'ws' )
            // InternalPDL1.g:900:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL1.g:909:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:913:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL1.g:914:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL1.g:921:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:925:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL1.g:926:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL1.g:926:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL1.g:927:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL1.g:928:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL1.g:928:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL1.g:936:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:940:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL1.g:941:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL1.g:948:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:952:1: ( ( 'from' ) )
            // InternalPDL1.g:953:1: ( 'from' )
            {
            // InternalPDL1.g:953:1: ( 'from' )
            // InternalPDL1.g:954:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL1.g:963:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:967:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL1.g:968:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL1.g:975:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:979:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL1.g:980:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL1.g:980:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL1.g:981:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL1.g:982:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL1.g:982:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL1.g:990:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:994:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL1.g:995:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL1.g:1002:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1006:1: ( ( 'to' ) )
            // InternalPDL1.g:1007:1: ( 'to' )
            {
            // InternalPDL1.g:1007:1: ( 'to' )
            // InternalPDL1.g:1008:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL1.g:1017:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1021:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL1.g:1022:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL1.g:1028:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1032:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL1.g:1033:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL1.g:1033:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL1.g:1034:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL1.g:1035:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL1.g:1035:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL1.g:1044:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1048:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL1.g:1049:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL1.g:1056:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1060:1: ( ( 'note' ) )
            // InternalPDL1.g:1061:1: ( 'note' )
            {
            // InternalPDL1.g:1061:1: ( 'note' )
            // InternalPDL1.g:1062:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL1.g:1071:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1075:1: ( rule__Guidance__Group__1__Impl )
            // InternalPDL1.g:1076:2: rule__Guidance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL1.g:1082:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TexteAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1086:1: ( ( ( rule__Guidance__TexteAssignment_1 ) ) )
            // InternalPDL1.g:1087:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            {
            // InternalPDL1.g:1087:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            // InternalPDL1.g:1088:2: ( rule__Guidance__TexteAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 
            // InternalPDL1.g:1089:2: ( rule__Guidance__TexteAssignment_1 )
            // InternalPDL1.g:1089:3: rule__Guidance__TexteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TexteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalPDL1.g:1098:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1102:1: ( ( RULE_ID ) )
            // InternalPDL1.g:1103:2: ( RULE_ID )
            {
            // InternalPDL1.g:1103:2: ( RULE_ID )
            // InternalPDL1.g:1104:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // InternalPDL1.g:1113:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1117:1: ( ( ruleProcessElement ) )
            // InternalPDL1.g:1118:2: ( ruleProcessElement )
            {
            // InternalPDL1.g:1118:2: ( ruleProcessElement )
            // InternalPDL1.g:1119:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalPDL1.g:1128:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1132:1: ( ( RULE_ID ) )
            // InternalPDL1.g:1133:2: ( RULE_ID )
            {
            // InternalPDL1.g:1133:2: ( RULE_ID )
            // InternalPDL1.g:1134:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__RessourcesAssignment_2_1"
    // InternalPDL1.g:1143:1: rule__WorkDefinition__RessourcesAssignment_2_1 : ( ruleRessourceAllouee ) ;
    public final void rule__WorkDefinition__RessourcesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1147:1: ( ( ruleRessourceAllouee ) )
            // InternalPDL1.g:1148:2: ( ruleRessourceAllouee )
            {
            // InternalPDL1.g:1148:2: ( ruleRessourceAllouee )
            // InternalPDL1.g:1149:3: ruleRessourceAllouee
            {
             before(grammarAccess.getWorkDefinitionAccess().getRessourcesRessourceAlloueeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRessourceAllouee();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getRessourcesRessourceAlloueeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__RessourcesAssignment_2_1"


    // $ANTLR start "rule__WorkDefinition__RessourcesAssignment_2_2_1"
    // InternalPDL1.g:1158:1: rule__WorkDefinition__RessourcesAssignment_2_2_1 : ( ruleRessourceAllouee ) ;
    public final void rule__WorkDefinition__RessourcesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1162:1: ( ( ruleRessourceAllouee ) )
            // InternalPDL1.g:1163:2: ( ruleRessourceAllouee )
            {
            // InternalPDL1.g:1163:2: ( ruleRessourceAllouee )
            // InternalPDL1.g:1164:3: ruleRessourceAllouee
            {
             before(grammarAccess.getWorkDefinitionAccess().getRessourcesRessourceAlloueeParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRessourceAllouee();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getRessourcesRessourceAlloueeParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__RessourcesAssignment_2_2_1"


    // $ANTLR start "rule__RessourceAllouee__RessourcesAssignment_0"
    // InternalPDL1.g:1173:1: rule__RessourceAllouee__RessourcesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RessourceAllouee__RessourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1177:1: ( ( ( RULE_ID ) ) )
            // InternalPDL1.g:1178:2: ( ( RULE_ID ) )
            {
            // InternalPDL1.g:1178:2: ( ( RULE_ID ) )
            // InternalPDL1.g:1179:3: ( RULE_ID )
            {
             before(grammarAccess.getRessourceAlloueeAccess().getRessourcesRessourcesCrossReference_0_0()); 
            // InternalPDL1.g:1180:3: ( RULE_ID )
            // InternalPDL1.g:1181:4: RULE_ID
            {
             before(grammarAccess.getRessourceAlloueeAccess().getRessourcesRessourcesIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRessourceAlloueeAccess().getRessourcesRessourcesIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRessourceAlloueeAccess().getRessourcesRessourcesCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__RessourcesAssignment_0"


    // $ANTLR start "rule__RessourceAllouee__NumberAssignment_2"
    // InternalPDL1.g:1192:1: rule__RessourceAllouee__NumberAssignment_2 : ( RULE_INT ) ;
    public final void rule__RessourceAllouee__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1196:1: ( ( RULE_INT ) )
            // InternalPDL1.g:1197:2: ( RULE_INT )
            {
            // InternalPDL1.g:1197:2: ( RULE_INT )
            // InternalPDL1.g:1198:3: RULE_INT
            {
             before(grammarAccess.getRessourceAlloueeAccess().getNumberINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRessourceAlloueeAccess().getNumberINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceAllouee__NumberAssignment_2"


    // $ANTLR start "rule__Ressources__NameAssignment_1"
    // InternalPDL1.g:1207:1: rule__Ressources__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ressources__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1211:1: ( ( RULE_ID ) )
            // InternalPDL1.g:1212:2: ( RULE_ID )
            {
            // InternalPDL1.g:1212:2: ( RULE_ID )
            // InternalPDL1.g:1213:3: RULE_ID
            {
             before(grammarAccess.getRessourcesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRessourcesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__NameAssignment_1"


    // $ANTLR start "rule__Ressources__QuantityAssignment_3"
    // InternalPDL1.g:1222:1: rule__Ressources__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Ressources__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1226:1: ( ( RULE_INT ) )
            // InternalPDL1.g:1227:2: ( RULE_INT )
            {
            // InternalPDL1.g:1227:2: ( RULE_INT )
            // InternalPDL1.g:1228:3: RULE_INT
            {
             before(grammarAccess.getRessourcesAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRessourcesAccess().getQuantityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressources__QuantityAssignment_3"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL1.g:1237:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1241:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL1.g:1242:2: ( ruleWorkSequenceType )
            {
            // InternalPDL1.g:1242:2: ( ruleWorkSequenceType )
            // InternalPDL1.g:1243:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL1.g:1252:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1256:1: ( ( ( RULE_ID ) ) )
            // InternalPDL1.g:1257:2: ( ( RULE_ID ) )
            {
            // InternalPDL1.g:1257:2: ( ( RULE_ID ) )
            // InternalPDL1.g:1258:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL1.g:1259:3: ( RULE_ID )
            // InternalPDL1.g:1260:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL1.g:1271:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1275:1: ( ( ( RULE_ID ) ) )
            // InternalPDL1.g:1276:2: ( ( RULE_ID ) )
            {
            // InternalPDL1.g:1276:2: ( ( RULE_ID ) )
            // InternalPDL1.g:1277:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL1.g:1278:3: ( RULE_ID )
            // InternalPDL1.g:1279:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TexteAssignment_1"
    // InternalPDL1.g:1290:1: rule__Guidance__TexteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TexteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL1.g:1294:1: ( ( RULE_STRING ) )
            // InternalPDL1.g:1295:2: ( RULE_STRING )
            {
            // InternalPDL1.g:1295:2: ( RULE_STRING )
            // InternalPDL1.g:1296:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TexteAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000012860010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000012840012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000012840010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});

}