package fr.n7.parser.antlr.internal;

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
import fr.n7.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'needs'", "','", "'('", "')'", "'res'", "'quantity'", "'ws'", "'from'", "'to'", "'note'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
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

        public InternalPDL1Parser(TokenStream input, PDL1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL1.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL1.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL1.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL1.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:78:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // InternalPDL1.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // InternalPDL1.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // InternalPDL1.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPDL1.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL1.g:106:3: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==19||LA1_0==21||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    // InternalPDL1.g:108:5: lv_processElements_3_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_3_0,
            	    						"fr.n7.PDL1.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL1.g:133:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL1.g:133:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL1.g:134:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL1.g:140:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressources_3= ruleRessources | this_RessourceAllouee_4= ruleRessourceAllouee ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Ressources_3 = null;

        EObject this_RessourceAllouee_4 = null;



        	enterRule();

        try {
            // InternalPDL1.g:146:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressources_3= ruleRessources | this_RessourceAllouee_4= ruleRessourceAllouee ) )
            // InternalPDL1.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressources_3= ruleRessources | this_RessourceAllouee_4= ruleRessourceAllouee )
            {
            // InternalPDL1.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressources_3= ruleRessources | this_RessourceAllouee_4= ruleRessourceAllouee )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL1.g:148:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL1.g:157:3: this_WorkSequence_1= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDL1.g:166:3: this_Guidance_2= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPDL1.g:175:3: this_Ressources_3= ruleRessources
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourcesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressources_3=ruleRessources();

                    state._fsp--;


                    			current = this_Ressources_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPDL1.g:184:3: this_RessourceAllouee_4= ruleRessourceAllouee
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceAlloueeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RessourceAllouee_4=ruleRessourceAllouee();

                    state._fsp--;


                    			current = this_RessourceAllouee_4;
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL1.g:196:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL1.g:196:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL1.g:197:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL1.g:203:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'needs' ( (lv_ressources_3_0= ruleRessourceAllouee ) ) (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )* )? ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ressources_3_0 = null;

        EObject lv_ressources_5_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:209:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'needs' ( (lv_ressources_3_0= ruleRessourceAllouee ) ) (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )* )? ) )
            // InternalPDL1.g:210:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'needs' ( (lv_ressources_3_0= ruleRessourceAllouee ) ) (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )* )? )
            {
            // InternalPDL1.g:210:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'needs' ( (lv_ressources_3_0= ruleRessourceAllouee ) ) (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )* )? )
            // InternalPDL1.g:211:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'needs' ( (lv_ressources_3_0= ruleRessourceAllouee ) ) (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )* )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalPDL1.g:215:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:216:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:216:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:217:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPDL1.g:233:3: (otherlv_2= 'needs' ( (lv_ressources_3_0= ruleRessourceAllouee ) ) (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL1.g:234:4: otherlv_2= 'needs' ( (lv_ressources_3_0= ruleRessourceAllouee ) ) (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getNeedsKeyword_2_0());
                    			
                    // InternalPDL1.g:238:4: ( (lv_ressources_3_0= ruleRessourceAllouee ) )
                    // InternalPDL1.g:239:5: (lv_ressources_3_0= ruleRessourceAllouee )
                    {
                    // InternalPDL1.g:239:5: (lv_ressources_3_0= ruleRessourceAllouee )
                    // InternalPDL1.g:240:6: lv_ressources_3_0= ruleRessourceAllouee
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getRessourcesRessourceAlloueeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_ressources_3_0=ruleRessourceAllouee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"ressources",
                    							lv_ressources_3_0,
                    							"fr.n7.PDL1.RessourceAllouee");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPDL1.g:257:4: (otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPDL1.g:258:5: otherlv_4= ',' ( (lv_ressources_5_0= ruleRessourceAllouee ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalPDL1.g:262:5: ( (lv_ressources_5_0= ruleRessourceAllouee ) )
                    	    // InternalPDL1.g:263:6: (lv_ressources_5_0= ruleRessourceAllouee )
                    	    {
                    	    // InternalPDL1.g:263:6: (lv_ressources_5_0= ruleRessourceAllouee )
                    	    // InternalPDL1.g:264:7: lv_ressources_5_0= ruleRessourceAllouee
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getRessourcesRessourceAlloueeParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_ressources_5_0=ruleRessourceAllouee();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ressources",
                    	    								lv_ressources_5_0,
                    	    								"fr.n7.PDL1.RessourceAllouee");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleRessourceAllouee"
    // InternalPDL1.g:287:1: entryRuleRessourceAllouee returns [EObject current=null] : iv_ruleRessourceAllouee= ruleRessourceAllouee EOF ;
    public final EObject entryRuleRessourceAllouee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessourceAllouee = null;


        try {
            // InternalPDL1.g:287:57: (iv_ruleRessourceAllouee= ruleRessourceAllouee EOF )
            // InternalPDL1.g:288:2: iv_ruleRessourceAllouee= ruleRessourceAllouee EOF
            {
             newCompositeNode(grammarAccess.getRessourceAlloueeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessourceAllouee=ruleRessourceAllouee();

            state._fsp--;

             current =iv_ruleRessourceAllouee; 
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
    // $ANTLR end "entryRuleRessourceAllouee"


    // $ANTLR start "ruleRessourceAllouee"
    // InternalPDL1.g:294:1: ruleRessourceAllouee returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_number_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRessourceAllouee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_number_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPDL1.g:300:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_number_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalPDL1.g:301:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_number_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalPDL1.g:301:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_number_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalPDL1.g:302:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_number_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // InternalPDL1.g:302:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL1.g:303:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL1.g:303:4: (otherlv_0= RULE_ID )
            // InternalPDL1.g:304:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceAlloueeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getRessourceAlloueeAccess().getRessourcesRessourcesCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRessourceAlloueeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPDL1.g:319:3: ( (lv_number_2_0= RULE_INT ) )
            // InternalPDL1.g:320:4: (lv_number_2_0= RULE_INT )
            {
            // InternalPDL1.g:320:4: (lv_number_2_0= RULE_INT )
            // InternalPDL1.g:321:5: lv_number_2_0= RULE_INT
            {
            lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_number_2_0, grammarAccess.getRessourceAlloueeAccess().getNumberINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceAlloueeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRessourceAlloueeAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRessourceAllouee"


    // $ANTLR start "entryRuleRessources"
    // InternalPDL1.g:345:1: entryRuleRessources returns [EObject current=null] : iv_ruleRessources= ruleRessources EOF ;
    public final EObject entryRuleRessources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessources = null;


        try {
            // InternalPDL1.g:345:51: (iv_ruleRessources= ruleRessources EOF )
            // InternalPDL1.g:346:2: iv_ruleRessources= ruleRessources EOF
            {
             newCompositeNode(grammarAccess.getRessourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessources=ruleRessources();

            state._fsp--;

             current =iv_ruleRessources; 
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
    // $ANTLR end "entryRuleRessources"


    // $ANTLR start "ruleRessources"
    // InternalPDL1.g:352:1: ruleRessources returns [EObject current=null] : (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRessources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;


        	enterRule();

        try {
            // InternalPDL1.g:358:2: ( (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) ) )
            // InternalPDL1.g:359:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) )
            {
            // InternalPDL1.g:359:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) )
            // InternalPDL1.g:360:3: otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourcesAccess().getResKeyword_0());
            		
            // InternalPDL1.g:364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:365:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRessourcesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourcesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourcesAccess().getQuantityKeyword_2());
            		
            // InternalPDL1.g:386:3: ( (lv_quantity_3_0= RULE_INT ) )
            // InternalPDL1.g:387:4: (lv_quantity_3_0= RULE_INT )
            {
            // InternalPDL1.g:387:4: (lv_quantity_3_0= RULE_INT )
            // InternalPDL1.g:388:5: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_quantity_3_0, grammarAccess.getRessourcesAccess().getQuantityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourcesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRessources"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL1.g:408:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL1.g:408:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL1.g:409:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL1.g:415:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:421:2: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPDL1.g:422:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPDL1.g:422:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalPDL1.g:423:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            // InternalPDL1.g:427:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL1.g:428:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL1.g:428:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL1.g:429:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL1.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
            		
            // InternalPDL1.g:450:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL1.g:451:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL1.g:451:4: (otherlv_3= RULE_ID )
            // InternalPDL1.g:452:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalPDL1.g:467:3: ( (otherlv_5= RULE_ID ) )
            // InternalPDL1.g:468:4: (otherlv_5= RULE_ID )
            {
            // InternalPDL1.g:468:4: (otherlv_5= RULE_ID )
            // InternalPDL1.g:469:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
            				

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL1.g:484:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL1.g:484:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL1.g:485:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL1.g:491:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;


        	enterRule();

        try {
            // InternalPDL1.g:497:2: ( (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) )
            // InternalPDL1.g:498:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            {
            // InternalPDL1.g:498:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            // InternalPDL1.g:499:3: otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL1.g:503:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalPDL1.g:504:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalPDL1.g:504:4: (lv_texte_1_0= RULE_STRING )
            // InternalPDL1.g:505:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL1.g:525:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL1.g:531:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL1.g:532:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL1.g:532:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPDL1.g:533:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL1.g:533:3: (enumLiteral_0= 's2s' )
                    // InternalPDL1.g:534:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:541:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL1.g:541:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL1.g:542:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:549:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL1.g:549:3: (enumLiteral_2= 's2f' )
                    // InternalPDL1.g:550:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:557:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL1.g:557:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL1.g:558:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001286010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001284010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}