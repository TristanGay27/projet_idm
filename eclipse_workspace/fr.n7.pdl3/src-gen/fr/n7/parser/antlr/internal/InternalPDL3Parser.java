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
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "':'", "'workdefinitions'", "';'", "'worksequences'", "'note'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
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

        public InternalPDL3Parser(TokenStream input, PDL3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL3.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL3.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL3.g:66:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalPDL3.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? ( (lv_processElements_15_0= ruleProcessElement ) )* ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_workDefinitions_5_0 = null;

        EObject lv_workDefinitions_7_0 = null;

        EObject lv_workSequences_11_0 = null;

        EObject lv_workSequences_13_0 = null;

        EObject lv_processElements_15_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:78:2: ( (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? ( (lv_processElements_15_0= ruleProcessElement ) )* ) )
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? ( (lv_processElements_15_0= ruleProcessElement ) )* )
            {
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? ( (lv_processElements_15_0= ruleProcessElement ) )* )
            // InternalPDL3.g:80:3: otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= ruleWorkDefinition ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? ( (lv_processElements_15_0= ruleProcessElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
            		
            // InternalPDL3.g:88:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            // InternalPDL3.g:90:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getColonKeyword_4());
            		
            // InternalPDL3.g:114:3: ( (lv_workDefinitions_5_0= ruleWorkDefinition ) )
            // InternalPDL3.g:115:4: (lv_workDefinitions_5_0= ruleWorkDefinition )
            {
            // InternalPDL3.g:115:4: (lv_workDefinitions_5_0= ruleWorkDefinition )
            // InternalPDL3.g:116:5: lv_workDefinitions_5_0= ruleWorkDefinition
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_workDefinitions_5_0=ruleWorkDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					add(
            						current,
            						"workDefinitions",
            						lv_workDefinitions_5_0,
            						"fr.n7.PDL3.WorkDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL3.g:133:3: (otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_ID) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL3.g:134:4: otherlv_6= ';' ( (lv_workDefinitions_7_0= ruleWorkDefinition ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getSemicolonKeyword_6_0());
            	    			
            	    // InternalPDL3.g:138:4: ( (lv_workDefinitions_7_0= ruleWorkDefinition ) )
            	    // InternalPDL3.g:139:5: (lv_workDefinitions_7_0= ruleWorkDefinition )
            	    {
            	    // InternalPDL3.g:139:5: (lv_workDefinitions_7_0= ruleWorkDefinition )
            	    // InternalPDL3.g:140:6: lv_workDefinitions_7_0= ruleWorkDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getWorkDefinitionsWorkDefinitionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_workDefinitions_7_0=ruleWorkDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"workDefinitions",
            	    							lv_workDefinitions_7_0,
            	    							"fr.n7.PDL3.WorkDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getSemicolonKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getWorksequencesKeyword_8());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getColonKeyword_9());
            		
            // InternalPDL3.g:170:3: ( (lv_workSequences_11_0= ruleWorkSequence ) )
            // InternalPDL3.g:171:4: (lv_workSequences_11_0= ruleWorkSequence )
            {
            // InternalPDL3.g:171:4: (lv_workSequences_11_0= ruleWorkSequence )
            // InternalPDL3.g:172:5: lv_workSequences_11_0= ruleWorkSequence
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_workSequences_11_0=ruleWorkSequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					add(
            						current,
            						"workSequences",
            						lv_workSequences_11_0,
            						"fr.n7.PDL3.WorkSequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL3.g:189:3: (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:190:4: otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getSemicolonKeyword_11_0());
            	    			
            	    // InternalPDL3.g:194:4: ( (lv_workSequences_13_0= ruleWorkSequence ) )
            	    // InternalPDL3.g:195:5: (lv_workSequences_13_0= ruleWorkSequence )
            	    {
            	    // InternalPDL3.g:195:5: (lv_workSequences_13_0= ruleWorkSequence )
            	    // InternalPDL3.g:196:6: lv_workSequences_13_0= ruleWorkSequence
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_workSequences_13_0=ruleWorkSequence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"workSequences",
            	    							lv_workSequences_13_0,
            	    							"fr.n7.PDL3.WorkSequence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalPDL3.g:214:3: (otherlv_14= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPDL3.g:215:4: otherlv_14= ';'
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcessAccess().getSemicolonKeyword_12());
                    			

                    }
                    break;

            }

            // InternalPDL3.g:220:3: ( (lv_processElements_15_0= ruleProcessElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL3.g:221:4: (lv_processElements_15_0= ruleProcessElement )
            	    {
            	    // InternalPDL3.g:221:4: (lv_processElements_15_0= ruleProcessElement )
            	    // InternalPDL3.g:222:5: lv_processElements_15_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_processElements_15_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_15_0,
            	    						"fr.n7.PDL3.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL3.g:243:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL3.g:243:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL3.g:244:2: iv_ruleProcessElement= ruleProcessElement EOF
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
    // InternalPDL3.g:250:1: ruleProcessElement returns [EObject current=null] : this_Guidance_0= ruleGuidance ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_Guidance_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:256:2: (this_Guidance_0= ruleGuidance )
            // InternalPDL3.g:257:2: this_Guidance_0= ruleGuidance
            {

            		newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Guidance_0=ruleGuidance();

            state._fsp--;


            		current = this_Guidance_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalPDL3.g:268:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL3.g:268:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL3.g:269:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
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
    // InternalPDL3.g:275:1: ruleWorkDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPDL3.g:281:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPDL3.g:282:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPDL3.g:282:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPDL3.g:283:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPDL3.g:283:3: (lv_name_0_0= RULE_ID )
            // InternalPDL3.g:284:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWorkDefinitionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL3.g:303:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL3.g:303:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL3.g:304:2: iv_ruleWorkSequence= ruleWorkSequence EOF
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
    // InternalPDL3.g:310:1: ruleWorkSequence returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:316:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPDL3.g:317:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPDL3.g:317:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPDL3.g:318:3: ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPDL3.g:318:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL3.g:319:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL3.g:319:4: (otherlv_0= RULE_ID )
            // InternalPDL3.g:320:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalPDL3.g:331:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL3.g:332:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL3.g:332:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL3.g:333:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL3.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL3.g:350:3: ( (otherlv_2= RULE_ID ) )
            // InternalPDL3.g:351:4: (otherlv_2= RULE_ID )
            {
            // InternalPDL3.g:351:4: (otherlv_2= RULE_ID )
            // InternalPDL3.g:352:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0());
            				

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
    // InternalPDL3.g:367:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL3.g:367:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL3.g:368:2: iv_ruleGuidance= ruleGuidance EOF
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
    // InternalPDL3.g:374:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;


        	enterRule();

        try {
            // InternalPDL3.g:380:2: ( (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) )
            // InternalPDL3.g:381:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            {
            // InternalPDL3.g:381:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            // InternalPDL3.g:382:3: otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL3.g:386:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalPDL3.g:387:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalPDL3.g:387:4: (lv_texte_1_0= RULE_STRING )
            // InternalPDL3.g:388:5: lv_texte_1_0= RULE_STRING
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
    // InternalPDL3.g:408:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL3.g:414:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL3.g:415:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL3.g:415:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
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
                    // InternalPDL3.g:416:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL3.g:416:3: (enumLiteral_0= 's2s' )
                    // InternalPDL3.g:417:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:424:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL3.g:424:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL3.g:425:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:432:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL3.g:432:3: (enumLiteral_2= 's2f' )
                    // InternalPDL3.g:433:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:440:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL3.g:440:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL3.g:441:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});

}