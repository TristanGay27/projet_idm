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
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "':'", "'workdefinitions'", "';'", "'worksequences'", "'note'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalPDL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL3.g"; }


    	private PDL3GrammarAccess grammarAccess;

    	public void setGrammarAccess(PDL3GrammarAccess grammarAccess) {
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
    // InternalPDL3.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL3.g:54:1: ( ruleProcess EOF )
            // InternalPDL3.g:55:1: ruleProcess EOF
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
    // InternalPDL3.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL3.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL3.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL3.g:69:4: rule__Process__Group__0
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
    // InternalPDL3.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL3.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL3.g:80:1: ruleProcessElement EOF
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
    // InternalPDL3.g:87:1: ruleProcessElement : ( ruleGuidance ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:91:2: ( ( ruleGuidance ) )
            // InternalPDL3.g:92:2: ( ruleGuidance )
            {
            // InternalPDL3.g:92:2: ( ruleGuidance )
            // InternalPDL3.g:93:3: ruleGuidance
            {
             before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall()); 

            }


            }

        }
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
    // InternalPDL3.g:103:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL3.g:104:1: ( ruleWorkDefinition EOF )
            // InternalPDL3.g:105:1: ruleWorkDefinition EOF
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
    // InternalPDL3.g:112:1: ruleWorkDefinition : ( ( rule__WorkDefinition__NameAssignment ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:116:2: ( ( ( rule__WorkDefinition__NameAssignment ) ) )
            // InternalPDL3.g:117:2: ( ( rule__WorkDefinition__NameAssignment ) )
            {
            // InternalPDL3.g:117:2: ( ( rule__WorkDefinition__NameAssignment ) )
            // InternalPDL3.g:118:3: ( rule__WorkDefinition__NameAssignment )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); 
            // InternalPDL3.g:119:3: ( rule__WorkDefinition__NameAssignment )
            // InternalPDL3.g:119:4: rule__WorkDefinition__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL3.g:128:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL3.g:129:1: ( ruleWorkSequence EOF )
            // InternalPDL3.g:130:1: ruleWorkSequence EOF
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
    // InternalPDL3.g:137:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:141:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL3.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL3.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL3.g:143:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL3.g:144:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL3.g:144:4: rule__WorkSequence__Group__0
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
    // InternalPDL3.g:153:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL3.g:154:1: ( ruleGuidance EOF )
            // InternalPDL3.g:155:1: ruleGuidance EOF
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
    // InternalPDL3.g:162:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:166:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL3.g:167:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL3.g:167:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL3.g:168:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL3.g:169:3: ( rule__Guidance__Group__0 )
            // InternalPDL3.g:169:4: rule__Guidance__Group__0
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
    // InternalPDL3.g:178:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:182:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL3.g:183:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL3.g:183:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL3.g:184:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL3.g:185:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL3.g:185:4: rule__WorkSequenceType__Alternatives
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


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL3.g:193:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:197:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL3.g:198:2: ( ( 's2s' ) )
                    {
                    // InternalPDL3.g:198:2: ( ( 's2s' ) )
                    // InternalPDL3.g:199:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // InternalPDL3.g:200:3: ( 's2s' )
                    // InternalPDL3.g:200:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:204:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL3.g:204:2: ( ( 'f2s' ) )
                    // InternalPDL3.g:205:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // InternalPDL3.g:206:3: ( 'f2s' )
                    // InternalPDL3.g:206:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:210:2: ( ( 's2f' ) )
                    {
                    // InternalPDL3.g:210:2: ( ( 's2f' ) )
                    // InternalPDL3.g:211:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // InternalPDL3.g:212:3: ( 's2f' )
                    // InternalPDL3.g:212:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:216:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL3.g:216:2: ( ( 'f2f' ) )
                    // InternalPDL3.g:217:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // InternalPDL3.g:218:3: ( 'f2f' )
                    // InternalPDL3.g:218:4: 'f2f'
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
    // InternalPDL3.g:226:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:230:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL3.g:231:2: rule__Process__Group__0__Impl rule__Process__Group__1
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
    // InternalPDL3.g:238:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:242:1: ( ( 'process' ) )
            // InternalPDL3.g:243:1: ( 'process' )
            {
            // InternalPDL3.g:243:1: ( 'process' )
            // InternalPDL3.g:244:2: 'process'
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
    // InternalPDL3.g:253:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:257:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL3.g:258:2: rule__Process__Group__1__Impl rule__Process__Group__2
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
    // InternalPDL3.g:265:1: rule__Process__Group__1__Impl : ( ':' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:269:1: ( ( ':' ) )
            // InternalPDL3.g:270:1: ( ':' )
            {
            // InternalPDL3.g:270:1: ( ':' )
            // InternalPDL3.g:271:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalPDL3.g:280:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:284:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL3.g:285:2: rule__Process__Group__2__Impl rule__Process__Group__3
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
    // InternalPDL3.g:292:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:296:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL3.g:297:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL3.g:297:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL3.g:298:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL3.g:299:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL3.g:299:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalPDL3.g:307:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:311:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL3.g:312:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalPDL3.g:319:1: rule__Process__Group__3__Impl : ( 'workdefinitions' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:323:1: ( ( 'workdefinitions' ) )
            // InternalPDL3.g:324:1: ( 'workdefinitions' )
            {
            // InternalPDL3.g:324:1: ( 'workdefinitions' )
            // InternalPDL3.g:325:2: 'workdefinitions'
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); 

            }


            }

        }
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
    // InternalPDL3.g:334:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:338:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL3.g:339:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
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
    // InternalPDL3.g:346:1: rule__Process__Group__4__Impl : ( ':' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:350:1: ( ( ':' ) )
            // InternalPDL3.g:351:1: ( ':' )
            {
            // InternalPDL3.g:351:1: ( ':' )
            // InternalPDL3.g:352:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL3.g:361:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:365:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalPDL3.g:366:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL3.g:373:1: rule__Process__Group__5__Impl : ( ( rule__Process__WorkDefinitionsAssignment_5 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:377:1: ( ( ( rule__Process__WorkDefinitionsAssignment_5 ) ) )
            // InternalPDL3.g:378:1: ( ( rule__Process__WorkDefinitionsAssignment_5 ) )
            {
            // InternalPDL3.g:378:1: ( ( rule__Process__WorkDefinitionsAssignment_5 ) )
            // InternalPDL3.g:379:2: ( rule__Process__WorkDefinitionsAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_5()); 
            // InternalPDL3.g:380:2: ( rule__Process__WorkDefinitionsAssignment_5 )
            // InternalPDL3.g:380:3: rule__Process__WorkDefinitionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalPDL3.g:388:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:392:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalPDL3.g:393:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalPDL3.g:400:1: rule__Process__Group__6__Impl : ( ( rule__Process__Group_6__0 )* ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:404:1: ( ( ( rule__Process__Group_6__0 )* ) )
            // InternalPDL3.g:405:1: ( ( rule__Process__Group_6__0 )* )
            {
            // InternalPDL3.g:405:1: ( ( rule__Process__Group_6__0 )* )
            // InternalPDL3.g:406:2: ( rule__Process__Group_6__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_6()); 
            // InternalPDL3.g:407:2: ( rule__Process__Group_6__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:407:3: rule__Process__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalPDL3.g:415:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:419:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalPDL3.g:420:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalPDL3.g:427:1: rule__Process__Group__7__Impl : ( ';' ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:431:1: ( ( ';' ) )
            // InternalPDL3.g:432:1: ( ';' )
            {
            // InternalPDL3.g:432:1: ( ';' )
            // InternalPDL3.g:433:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalPDL3.g:442:1: rule__Process__Group__8 : rule__Process__Group__8__Impl rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:446:1: ( rule__Process__Group__8__Impl rule__Process__Group__9 )
            // InternalPDL3.g:447:2: rule__Process__Group__8__Impl rule__Process__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalPDL3.g:454:1: rule__Process__Group__8__Impl : ( 'worksequences' ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:458:1: ( ( 'worksequences' ) )
            // InternalPDL3.g:459:1: ( 'worksequences' )
            {
            // InternalPDL3.g:459:1: ( 'worksequences' )
            // InternalPDL3.g:460:2: 'worksequences'
            {
             before(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group__9"
    // InternalPDL3.g:469:1: rule__Process__Group__9 : rule__Process__Group__9__Impl rule__Process__Group__10 ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:473:1: ( rule__Process__Group__9__Impl rule__Process__Group__10 )
            // InternalPDL3.g:474:2: rule__Process__Group__9__Impl rule__Process__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__9"


    // $ANTLR start "rule__Process__Group__9__Impl"
    // InternalPDL3.g:481:1: rule__Process__Group__9__Impl : ( ':' ) ;
    public final void rule__Process__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:485:1: ( ( ':' ) )
            // InternalPDL3.g:486:1: ( ':' )
            {
            // InternalPDL3.g:486:1: ( ':' )
            // InternalPDL3.g:487:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__9__Impl"


    // $ANTLR start "rule__Process__Group__10"
    // InternalPDL3.g:496:1: rule__Process__Group__10 : rule__Process__Group__10__Impl rule__Process__Group__11 ;
    public final void rule__Process__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:500:1: ( rule__Process__Group__10__Impl rule__Process__Group__11 )
            // InternalPDL3.g:501:2: rule__Process__Group__10__Impl rule__Process__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__10"


    // $ANTLR start "rule__Process__Group__10__Impl"
    // InternalPDL3.g:508:1: rule__Process__Group__10__Impl : ( ( rule__Process__WorkSequencesAssignment_10 ) ) ;
    public final void rule__Process__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:512:1: ( ( ( rule__Process__WorkSequencesAssignment_10 ) ) )
            // InternalPDL3.g:513:1: ( ( rule__Process__WorkSequencesAssignment_10 ) )
            {
            // InternalPDL3.g:513:1: ( ( rule__Process__WorkSequencesAssignment_10 ) )
            // InternalPDL3.g:514:2: ( rule__Process__WorkSequencesAssignment_10 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_10()); 
            // InternalPDL3.g:515:2: ( rule__Process__WorkSequencesAssignment_10 )
            // InternalPDL3.g:515:3: rule__Process__WorkSequencesAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__10__Impl"


    // $ANTLR start "rule__Process__Group__11"
    // InternalPDL3.g:523:1: rule__Process__Group__11 : rule__Process__Group__11__Impl rule__Process__Group__12 ;
    public final void rule__Process__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:527:1: ( rule__Process__Group__11__Impl rule__Process__Group__12 )
            // InternalPDL3.g:528:2: rule__Process__Group__11__Impl rule__Process__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__11"


    // $ANTLR start "rule__Process__Group__11__Impl"
    // InternalPDL3.g:535:1: rule__Process__Group__11__Impl : ( ( rule__Process__Group_11__0 )* ) ;
    public final void rule__Process__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:539:1: ( ( ( rule__Process__Group_11__0 )* ) )
            // InternalPDL3.g:540:1: ( ( rule__Process__Group_11__0 )* )
            {
            // InternalPDL3.g:540:1: ( ( rule__Process__Group_11__0 )* )
            // InternalPDL3.g:541:2: ( rule__Process__Group_11__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_11()); 
            // InternalPDL3.g:542:2: ( rule__Process__Group_11__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_ID) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL3.g:542:3: rule__Process__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__11__Impl"


    // $ANTLR start "rule__Process__Group__12"
    // InternalPDL3.g:550:1: rule__Process__Group__12 : rule__Process__Group__12__Impl rule__Process__Group__13 ;
    public final void rule__Process__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:554:1: ( rule__Process__Group__12__Impl rule__Process__Group__13 )
            // InternalPDL3.g:555:2: rule__Process__Group__12__Impl rule__Process__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__Process__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__12"


    // $ANTLR start "rule__Process__Group__12__Impl"
    // InternalPDL3.g:562:1: rule__Process__Group__12__Impl : ( ( ';' )? ) ;
    public final void rule__Process__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:566:1: ( ( ( ';' )? ) )
            // InternalPDL3.g:567:1: ( ( ';' )? )
            {
            // InternalPDL3.g:567:1: ( ( ';' )? )
            // InternalPDL3.g:568:2: ( ';' )?
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); 
            // InternalPDL3.g:569:2: ( ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL3.g:569:3: ';'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__12__Impl"


    // $ANTLR start "rule__Process__Group__13"
    // InternalPDL3.g:577:1: rule__Process__Group__13 : rule__Process__Group__13__Impl ;
    public final void rule__Process__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:581:1: ( rule__Process__Group__13__Impl )
            // InternalPDL3.g:582:2: rule__Process__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__13"


    // $ANTLR start "rule__Process__Group__13__Impl"
    // InternalPDL3.g:588:1: rule__Process__Group__13__Impl : ( ( rule__Process__ProcessElementsAssignment_13 )* ) ;
    public final void rule__Process__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:592:1: ( ( ( rule__Process__ProcessElementsAssignment_13 )* ) )
            // InternalPDL3.g:593:1: ( ( rule__Process__ProcessElementsAssignment_13 )* )
            {
            // InternalPDL3.g:593:1: ( ( rule__Process__ProcessElementsAssignment_13 )* )
            // InternalPDL3.g:594:2: ( rule__Process__ProcessElementsAssignment_13 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_13()); 
            // InternalPDL3.g:595:2: ( rule__Process__ProcessElementsAssignment_13 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDL3.g:595:3: rule__Process__ProcessElementsAssignment_13
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Process__ProcessElementsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__13__Impl"


    // $ANTLR start "rule__Process__Group_6__0"
    // InternalPDL3.g:604:1: rule__Process__Group_6__0 : rule__Process__Group_6__0__Impl rule__Process__Group_6__1 ;
    public final void rule__Process__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:608:1: ( rule__Process__Group_6__0__Impl rule__Process__Group_6__1 )
            // InternalPDL3.g:609:2: rule__Process__Group_6__0__Impl rule__Process__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__0"


    // $ANTLR start "rule__Process__Group_6__0__Impl"
    // InternalPDL3.g:616:1: rule__Process__Group_6__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:620:1: ( ( ';' ) )
            // InternalPDL3.g:621:1: ( ';' )
            {
            // InternalPDL3.g:621:1: ( ';' )
            // InternalPDL3.g:622:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__0__Impl"


    // $ANTLR start "rule__Process__Group_6__1"
    // InternalPDL3.g:631:1: rule__Process__Group_6__1 : rule__Process__Group_6__1__Impl ;
    public final void rule__Process__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:635:1: ( rule__Process__Group_6__1__Impl )
            // InternalPDL3.g:636:2: rule__Process__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__1"


    // $ANTLR start "rule__Process__Group_6__1__Impl"
    // InternalPDL3.g:642:1: rule__Process__Group_6__1__Impl : ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) ) ;
    public final void rule__Process__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:646:1: ( ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) ) )
            // InternalPDL3.g:647:1: ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) )
            {
            // InternalPDL3.g:647:1: ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) )
            // InternalPDL3.g:648:2: ( rule__Process__WorkDefinitionsAssignment_6_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_6_1()); 
            // InternalPDL3.g:649:2: ( rule__Process__WorkDefinitionsAssignment_6_1 )
            // InternalPDL3.g:649:3: rule__Process__WorkDefinitionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__1__Impl"


    // $ANTLR start "rule__Process__Group_11__0"
    // InternalPDL3.g:658:1: rule__Process__Group_11__0 : rule__Process__Group_11__0__Impl rule__Process__Group_11__1 ;
    public final void rule__Process__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:662:1: ( rule__Process__Group_11__0__Impl rule__Process__Group_11__1 )
            // InternalPDL3.g:663:2: rule__Process__Group_11__0__Impl rule__Process__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_11__0"


    // $ANTLR start "rule__Process__Group_11__0__Impl"
    // InternalPDL3.g:670:1: rule__Process__Group_11__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:674:1: ( ( ';' ) )
            // InternalPDL3.g:675:1: ( ';' )
            {
            // InternalPDL3.g:675:1: ( ';' )
            // InternalPDL3.g:676:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_11__0__Impl"


    // $ANTLR start "rule__Process__Group_11__1"
    // InternalPDL3.g:685:1: rule__Process__Group_11__1 : rule__Process__Group_11__1__Impl ;
    public final void rule__Process__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:689:1: ( rule__Process__Group_11__1__Impl )
            // InternalPDL3.g:690:2: rule__Process__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_11__1"


    // $ANTLR start "rule__Process__Group_11__1__Impl"
    // InternalPDL3.g:696:1: rule__Process__Group_11__1__Impl : ( ( rule__Process__WorkSequencesAssignment_11_1 ) ) ;
    public final void rule__Process__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:700:1: ( ( ( rule__Process__WorkSequencesAssignment_11_1 ) ) )
            // InternalPDL3.g:701:1: ( ( rule__Process__WorkSequencesAssignment_11_1 ) )
            {
            // InternalPDL3.g:701:1: ( ( rule__Process__WorkSequencesAssignment_11_1 ) )
            // InternalPDL3.g:702:2: ( rule__Process__WorkSequencesAssignment_11_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_11_1()); 
            // InternalPDL3.g:703:2: ( rule__Process__WorkSequencesAssignment_11_1 )
            // InternalPDL3.g:703:3: rule__Process__WorkSequencesAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_11__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL3.g:712:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:716:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL3.g:717:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPDL3.g:724:1: rule__WorkSequence__Group__0__Impl : ( ( rule__WorkSequence__PredecessorAssignment_0 ) ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:728:1: ( ( ( rule__WorkSequence__PredecessorAssignment_0 ) ) )
            // InternalPDL3.g:729:1: ( ( rule__WorkSequence__PredecessorAssignment_0 ) )
            {
            // InternalPDL3.g:729:1: ( ( rule__WorkSequence__PredecessorAssignment_0 ) )
            // InternalPDL3.g:730:2: ( rule__WorkSequence__PredecessorAssignment_0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); 
            // InternalPDL3.g:731:2: ( rule__WorkSequence__PredecessorAssignment_0 )
            // InternalPDL3.g:731:3: rule__WorkSequence__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); 

            }


            }

        }
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
    // InternalPDL3.g:739:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:743:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL3.g:744:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalPDL3.g:751:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:755:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL3.g:756:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL3.g:756:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL3.g:757:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL3.g:758:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL3.g:758:3: rule__WorkSequence__LinkTypeAssignment_1
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
    // InternalPDL3.g:766:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:770:1: ( rule__WorkSequence__Group__2__Impl )
            // InternalPDL3.g:771:2: rule__WorkSequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalPDL3.g:777:1: rule__WorkSequence__Group__2__Impl : ( ( rule__WorkSequence__SuccessorAssignment_2 ) ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:781:1: ( ( ( rule__WorkSequence__SuccessorAssignment_2 ) ) )
            // InternalPDL3.g:782:1: ( ( rule__WorkSequence__SuccessorAssignment_2 ) )
            {
            // InternalPDL3.g:782:1: ( ( rule__WorkSequence__SuccessorAssignment_2 ) )
            // InternalPDL3.g:783:2: ( rule__WorkSequence__SuccessorAssignment_2 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); 
            // InternalPDL3.g:784:2: ( rule__WorkSequence__SuccessorAssignment_2 )
            // InternalPDL3.g:784:3: rule__WorkSequence__SuccessorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL3.g:793:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:797:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL3.g:798:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPDL3.g:805:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:809:1: ( ( 'note' ) )
            // InternalPDL3.g:810:1: ( 'note' )
            {
            // InternalPDL3.g:810:1: ( 'note' )
            // InternalPDL3.g:811:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalPDL3.g:820:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:824:1: ( rule__Guidance__Group__1__Impl )
            // InternalPDL3.g:825:2: rule__Guidance__Group__1__Impl
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
    // InternalPDL3.g:831:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TexteAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:835:1: ( ( ( rule__Guidance__TexteAssignment_1 ) ) )
            // InternalPDL3.g:836:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            {
            // InternalPDL3.g:836:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            // InternalPDL3.g:837:2: ( rule__Guidance__TexteAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 
            // InternalPDL3.g:838:2: ( rule__Guidance__TexteAssignment_1 )
            // InternalPDL3.g:838:3: rule__Guidance__TexteAssignment_1
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


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL3.g:847:1: rule__Process__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:851:1: ( ( RULE_ID ) )
            // InternalPDL3.g:852:2: ( RULE_ID )
            {
            // InternalPDL3.g:852:2: ( RULE_ID )
            // InternalPDL3.g:853:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_5"
    // InternalPDL3.g:862:1: rule__Process__WorkDefinitionsAssignment_5 : ( ruleWorkDefinition ) ;
    public final void rule__Process__WorkDefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:866:1: ( ( ruleWorkDefinition ) )
            // InternalPDL3.g:867:2: ( ruleWorkDefinition )
            {
            // InternalPDL3.g:867:2: ( ruleWorkDefinition )
            // InternalPDL3.g:868:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_5"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_6_1"
    // InternalPDL3.g:877:1: rule__Process__WorkDefinitionsAssignment_6_1 : ( ruleWorkDefinition ) ;
    public final void rule__Process__WorkDefinitionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:881:1: ( ( ruleWorkDefinition ) )
            // InternalPDL3.g:882:2: ( ruleWorkDefinition )
            {
            // InternalPDL3.g:882:2: ( ruleWorkDefinition )
            // InternalPDL3.g:883:3: ruleWorkDefinition
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_6_1"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_10"
    // InternalPDL3.g:892:1: rule__Process__WorkSequencesAssignment_10 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorkSequencesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:896:1: ( ( ruleWorkSequence ) )
            // InternalPDL3.g:897:2: ( ruleWorkSequence )
            {
            // InternalPDL3.g:897:2: ( ruleWorkSequence )
            // InternalPDL3.g:898:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkSequencesAssignment_10"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_11_1"
    // InternalPDL3.g:907:1: rule__Process__WorkSequencesAssignment_11_1 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorkSequencesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:911:1: ( ( ruleWorkSequence ) )
            // InternalPDL3.g:912:2: ( ruleWorkSequence )
            {
            // InternalPDL3.g:912:2: ( ruleWorkSequence )
            // InternalPDL3.g:913:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkSequencesAssignment_11_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_13"
    // InternalPDL3.g:922:1: rule__Process__ProcessElementsAssignment_13 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:926:1: ( ( ruleProcessElement ) )
            // InternalPDL3.g:927:2: ( ruleProcessElement )
            {
            // InternalPDL3.g:927:2: ( ruleProcessElement )
            // InternalPDL3.g:928:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_13"


    // $ANTLR start "rule__WorkDefinition__NameAssignment"
    // InternalPDL3.g:937:1: rule__WorkDefinition__NameAssignment : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:941:1: ( ( RULE_ID ) )
            // InternalPDL3.g:942:2: ( RULE_ID )
            {
            // InternalPDL3.g:942:2: ( RULE_ID )
            // InternalPDL3.g:943:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_0"
    // InternalPDL3.g:952:1: rule__WorkSequence__PredecessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:956:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:957:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:957:2: ( ( RULE_ID ) )
            // InternalPDL3.g:958:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 
            // InternalPDL3.g:959:3: ( RULE_ID )
            // InternalPDL3.g:960:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_0"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL3.g:971:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:975:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL3.g:976:2: ( ruleWorkSequenceType )
            {
            // InternalPDL3.g:976:2: ( ruleWorkSequenceType )
            // InternalPDL3.g:977:3: ruleWorkSequenceType
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


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_2"
    // InternalPDL3.g:986:1: rule__WorkSequence__SuccessorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:990:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:991:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:991:2: ( ( RULE_ID ) )
            // InternalPDL3.g:992:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); 
            // InternalPDL3.g:993:3: ( RULE_ID )
            // InternalPDL3.g:994:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_2"


    // $ANTLR start "rule__Guidance__TexteAssignment_1"
    // InternalPDL3.g:1005:1: rule__Guidance__TexteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TexteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:1009:1: ( ( RULE_STRING ) )
            // InternalPDL3.g:1010:2: ( RULE_STRING )
            {
            // InternalPDL3.g:1010:2: ( RULE_STRING )
            // InternalPDL3.g:1011:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});

}