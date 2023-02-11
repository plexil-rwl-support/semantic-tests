// $ANTLR 3.5.2 /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g 2022-12-23 13:02:33

package plexil;

import plexil.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class PlexilTreeTransforms extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS_KYWD", "ACTION", "ALIAS", 
		"ALIASES", "AND_KYWD", "ANY_KYWD", "ARGUMENT_LIST", "ARRAY_LITERAL", "ARRAY_MAX_SIZE_KYWD", 
		"ARRAY_REF", "ARRAY_SIZE_KYWD", "ARRAY_TYPE", "ARRAY_VARIABLE_DECLARATION", 
		"ASSIGNMENT", "ASTERISK", "BAR", "BLOCK", "BOOLEAN_KYWD", "CEIL_KYWD", 
		"CHECKED_SEQUENCE_KYWD", "CHILD_KYWD", "COLON", "COMMA", "COMMAND", "COMMAND_ACCEPTED_KYWD", 
		"COMMAND_DENIED_KYWD", "COMMAND_FAILED_KYWD", "COMMAND_HANDLE_KYWD", "COMMAND_KYWD", 
		"COMMAND_RCVD_KYWD", "COMMAND_SENT_KYWD", "COMMAND_SUCCESS_KYWD", "COMMENT_KYWD", 
		"CONCAT", "CONCURRENCE_KYWD", "DATE_KYWD", "DATE_LITERAL", "DEQUALS", 
		"DOUBLE", "DO_KYWD", "DURATION_KYWD", "DURATION_LITERAL", "Digit", "ELLIPSIS", 
		"ELSEIF_KYWD", "ELSE_KYWD", "ENDIF_KYWD", "END_CONDITION_KYWD", "END_KYWD", 
		"EQUALS", "EXECUTING_STATE_KYWD", "EXITED_KYWD", "EXIT_CONDITION_KYWD", 
		"Escape", "Exponent", "FAILING_STATE_KYWD", "FAILURE_KYWD", "FAILURE_OUTCOME_KYWD", 
		"FALSE_KYWD", "FINISHED_STATE_KYWD", "FINISHING_STATE_KYWD", "FLOOR_KYWD", 
		"FOR_KYWD", "GEQ", "GLOBAL_DECLARATIONS", "GREATER", "HASHPAREN", "HexDigit", 
		"HexEscape", "IF_KYWD", "INACTIVE_STATE_KYWD", "INT", "INTEGER_KYWD", 
		"INTERRUPTED_OUTCOME_KYWD", "INT_OR_DOUBLE", "INVARIANT_CONDITION_FAILED_KYWD", 
		"INVARIANT_CONDITION_KYWD", "IN_KYWD", "IN_OUT_KYWD", "IS_KNOWN_KYWD", 
		"ITERATION_ENDED_STATE_KYWD", "LBRACE", "LBRACKET", "LEQ", "LESS", "LIBRARY_ACTION_KYWD", 
		"LIBRARY_CALL_KYWD", "LOOKUP_KYWD", "LOOKUP_NOW_KYWD", "LOOKUP_ON_CHANGE_KYWD", 
		"LOWER_BOUND_KYWD", "LPAREN", "Letter", "MAX_KYWD", "MESSAGE_RECEIVED_KYWD", 
		"MINUS", "MIN_KYWD", "ML_COMMENT", "MOD_KYWD", "NAME_KYWD", "NCNAME", 
		"NEG_DOUBLE", "NEG_INT", "NEQUALS", "NODE_EXECUTING_KYWD", "NODE_FAILED_KYWD", 
		"NODE_FINISHED_KYWD", "NODE_ID", "NODE_INACTIVE_KYWD", "NODE_INVARIANT_FAILED_KYWD", 
		"NODE_ITERATION_ENDED_KYWD", "NODE_ITERATION_FAILED_KYWD", "NODE_ITERATION_SUCCEEDED_KYWD", 
		"NODE_PARENT_FAILED_KYWD", "NODE_POSTCONDITION_FAILED_KYWD", "NODE_PRECONDITION_FAILED_KYWD", 
		"NODE_SKIPPED_KYWD", "NODE_SUCCEEDED_KYWD", "NODE_TIMEPOINT_VALUE", "NODE_WAITING_KYWD", 
		"NOT_KYWD", "NO_CHILD_FAILED_KYWD", "ON_COMMAND_KYWD", "ON_MESSAGE_KYWD", 
		"OR_KYWD", "OUTCOME_KYWD", "OctalDigit", "OctalEscape", "PARAMETERS", 
		"PARENT_EXITED_KYWD", "PARENT_FAILED_KYWD", "PARENT_KYWD", "PERCENT", 
		"PERIOD", "PLEXIL", "PLUS", "POST_CONDITION_FAILED_KYWD", "POST_CONDITION_KYWD", 
		"PRE_CONDITION_FAILED_KYWD", "PRE_CONDITION_KYWD", "PRIORITY_KYWD", "RBRACE", 
		"RBRACKET", "REAL_KYWD", "REAL_TO_INT_KYWD", "RELEASE_AT_TERM_KYWD", "REPEAT_CONDITION_KYWD", 
		"REQUEST_KYWD", "RESOURCE_KYWD", "RETURNS_KYWD", "ROUND_KYWD", "RPAREN", 
		"SELF_KYWD", "SEMICOLON", "SEQUENCE", "SEQUENCE_KYWD", "SIBLING_KYWD", 
		"SKIPPED_OUTCOME_KYWD", "SKIP_CONDITION_KYWD", "SLASH", "SL_COMMENT", 
		"SQRT_KYWD", "START_CONDITION_KYWD", "START_KYWD", "STATE_KYWD", "STATE_NAME", 
		"STRING", "STRING_COMPARISON", "STRING_KYWD", "STRLEN_KYWD", "SUCCESS_OUTCOME_KYWD", 
		"SYNCHRONOUS_COMMAND_KYWD", "TIMEOUT_KYWD", "TRUE_KYWD", "TRUNC_KYWD", 
		"TRY_KYWD", "UNCHECKED_SEQUENCE_KYWD", "UPDATE_KYWD", "UPPER_BOUND_KYWD", 
		"UnicodeEscape", "UnicodeLongEscape", "VARIABLE_DECLARATION", "VARIABLE_DECLARATIONS", 
		"WAITING_STATE_KYWD", "WAIT_KYWD", "WHILE_KYWD", "WS", "XOR_KYWD", "CHECKED_SEQUENCE_KWYD", 
		"TRY"
	};
	public static final int EOF=-1;
	public static final int ABS_KYWD=4;
	public static final int ACTION=5;
	public static final int ALIAS=6;
	public static final int ALIASES=7;
	public static final int AND_KYWD=8;
	public static final int ANY_KYWD=9;
	public static final int ARGUMENT_LIST=10;
	public static final int ARRAY_LITERAL=11;
	public static final int ARRAY_MAX_SIZE_KYWD=12;
	public static final int ARRAY_REF=13;
	public static final int ARRAY_SIZE_KYWD=14;
	public static final int ARRAY_TYPE=15;
	public static final int ARRAY_VARIABLE_DECLARATION=16;
	public static final int ASSIGNMENT=17;
	public static final int ASTERISK=18;
	public static final int BAR=19;
	public static final int BLOCK=20;
	public static final int BOOLEAN_KYWD=21;
	public static final int CEIL_KYWD=22;
	public static final int CHECKED_SEQUENCE_KYWD=23;
	public static final int CHILD_KYWD=24;
	public static final int COLON=25;
	public static final int COMMA=26;
	public static final int COMMAND=27;
	public static final int COMMAND_ACCEPTED_KYWD=28;
	public static final int COMMAND_DENIED_KYWD=29;
	public static final int COMMAND_FAILED_KYWD=30;
	public static final int COMMAND_HANDLE_KYWD=31;
	public static final int COMMAND_KYWD=32;
	public static final int COMMAND_RCVD_KYWD=33;
	public static final int COMMAND_SENT_KYWD=34;
	public static final int COMMAND_SUCCESS_KYWD=35;
	public static final int COMMENT_KYWD=36;
	public static final int CONCAT=37;
	public static final int CONCURRENCE_KYWD=38;
	public static final int DATE_KYWD=39;
	public static final int DATE_LITERAL=40;
	public static final int DEQUALS=41;
	public static final int DOUBLE=42;
	public static final int DO_KYWD=43;
	public static final int DURATION_KYWD=44;
	public static final int DURATION_LITERAL=45;
	public static final int Digit=46;
	public static final int ELLIPSIS=47;
	public static final int ELSEIF_KYWD=48;
	public static final int ELSE_KYWD=49;
	public static final int ENDIF_KYWD=50;
	public static final int END_CONDITION_KYWD=51;
	public static final int END_KYWD=52;
	public static final int EQUALS=53;
	public static final int EXECUTING_STATE_KYWD=54;
	public static final int EXITED_KYWD=55;
	public static final int EXIT_CONDITION_KYWD=56;
	public static final int Escape=57;
	public static final int Exponent=58;
	public static final int FAILING_STATE_KYWD=59;
	public static final int FAILURE_KYWD=60;
	public static final int FAILURE_OUTCOME_KYWD=61;
	public static final int FALSE_KYWD=62;
	public static final int FINISHED_STATE_KYWD=63;
	public static final int FINISHING_STATE_KYWD=64;
	public static final int FLOOR_KYWD=65;
	public static final int FOR_KYWD=66;
	public static final int GEQ=67;
	public static final int GLOBAL_DECLARATIONS=68;
	public static final int GREATER=69;
	public static final int HASHPAREN=70;
	public static final int HexDigit=71;
	public static final int HexEscape=72;
	public static final int IF_KYWD=73;
	public static final int INACTIVE_STATE_KYWD=74;
	public static final int INT=75;
	public static final int INTEGER_KYWD=76;
	public static final int INTERRUPTED_OUTCOME_KYWD=77;
	public static final int INT_OR_DOUBLE=78;
	public static final int INVARIANT_CONDITION_FAILED_KYWD=79;
	public static final int INVARIANT_CONDITION_KYWD=80;
	public static final int IN_KYWD=81;
	public static final int IN_OUT_KYWD=82;
	public static final int IS_KNOWN_KYWD=83;
	public static final int ITERATION_ENDED_STATE_KYWD=84;
	public static final int LBRACE=85;
	public static final int LBRACKET=86;
	public static final int LEQ=87;
	public static final int LESS=88;
	public static final int LIBRARY_ACTION_KYWD=89;
	public static final int LIBRARY_CALL_KYWD=90;
	public static final int LOOKUP_KYWD=91;
	public static final int LOOKUP_NOW_KYWD=92;
	public static final int LOOKUP_ON_CHANGE_KYWD=93;
	public static final int LOWER_BOUND_KYWD=94;
	public static final int LPAREN=95;
	public static final int Letter=96;
	public static final int MAX_KYWD=97;
	public static final int MESSAGE_RECEIVED_KYWD=98;
	public static final int MINUS=99;
	public static final int MIN_KYWD=100;
	public static final int ML_COMMENT=101;
	public static final int MOD_KYWD=102;
	public static final int NAME_KYWD=103;
	public static final int NCNAME=104;
	public static final int NEG_DOUBLE=105;
	public static final int NEG_INT=106;
	public static final int NEQUALS=107;
	public static final int NODE_EXECUTING_KYWD=108;
	public static final int NODE_FAILED_KYWD=109;
	public static final int NODE_FINISHED_KYWD=110;
	public static final int NODE_ID=111;
	public static final int NODE_INACTIVE_KYWD=112;
	public static final int NODE_INVARIANT_FAILED_KYWD=113;
	public static final int NODE_ITERATION_ENDED_KYWD=114;
	public static final int NODE_ITERATION_FAILED_KYWD=115;
	public static final int NODE_ITERATION_SUCCEEDED_KYWD=116;
	public static final int NODE_PARENT_FAILED_KYWD=117;
	public static final int NODE_POSTCONDITION_FAILED_KYWD=118;
	public static final int NODE_PRECONDITION_FAILED_KYWD=119;
	public static final int NODE_SKIPPED_KYWD=120;
	public static final int NODE_SUCCEEDED_KYWD=121;
	public static final int NODE_TIMEPOINT_VALUE=122;
	public static final int NODE_WAITING_KYWD=123;
	public static final int NOT_KYWD=124;
	public static final int NO_CHILD_FAILED_KYWD=125;
	public static final int ON_COMMAND_KYWD=126;
	public static final int ON_MESSAGE_KYWD=127;
	public static final int OR_KYWD=128;
	public static final int OUTCOME_KYWD=129;
	public static final int OctalDigit=130;
	public static final int OctalEscape=131;
	public static final int PARAMETERS=132;
	public static final int PARENT_EXITED_KYWD=133;
	public static final int PARENT_FAILED_KYWD=134;
	public static final int PARENT_KYWD=135;
	public static final int PERCENT=136;
	public static final int PERIOD=137;
	public static final int PLEXIL=138;
	public static final int PLUS=139;
	public static final int POST_CONDITION_FAILED_KYWD=140;
	public static final int POST_CONDITION_KYWD=141;
	public static final int PRE_CONDITION_FAILED_KYWD=142;
	public static final int PRE_CONDITION_KYWD=143;
	public static final int PRIORITY_KYWD=144;
	public static final int RBRACE=145;
	public static final int RBRACKET=146;
	public static final int REAL_KYWD=147;
	public static final int REAL_TO_INT_KYWD=148;
	public static final int RELEASE_AT_TERM_KYWD=149;
	public static final int REPEAT_CONDITION_KYWD=150;
	public static final int REQUEST_KYWD=151;
	public static final int RESOURCE_KYWD=152;
	public static final int RETURNS_KYWD=153;
	public static final int ROUND_KYWD=154;
	public static final int RPAREN=155;
	public static final int SELF_KYWD=156;
	public static final int SEMICOLON=157;
	public static final int SEQUENCE=158;
	public static final int SEQUENCE_KYWD=159;
	public static final int SIBLING_KYWD=160;
	public static final int SKIPPED_OUTCOME_KYWD=161;
	public static final int SKIP_CONDITION_KYWD=162;
	public static final int SLASH=163;
	public static final int SL_COMMENT=164;
	public static final int SQRT_KYWD=165;
	public static final int START_CONDITION_KYWD=166;
	public static final int START_KYWD=167;
	public static final int STATE_KYWD=168;
	public static final int STATE_NAME=169;
	public static final int STRING=170;
	public static final int STRING_COMPARISON=171;
	public static final int STRING_KYWD=172;
	public static final int STRLEN_KYWD=173;
	public static final int SUCCESS_OUTCOME_KYWD=174;
	public static final int SYNCHRONOUS_COMMAND_KYWD=175;
	public static final int TIMEOUT_KYWD=176;
	public static final int TRUE_KYWD=177;
	public static final int TRUNC_KYWD=178;
	public static final int TRY_KYWD=179;
	public static final int UNCHECKED_SEQUENCE_KYWD=180;
	public static final int UPDATE_KYWD=181;
	public static final int UPPER_BOUND_KYWD=182;
	public static final int UnicodeEscape=183;
	public static final int UnicodeLongEscape=184;
	public static final int VARIABLE_DECLARATION=185;
	public static final int VARIABLE_DECLARATIONS=186;
	public static final int WAITING_STATE_KYWD=187;
	public static final int WAIT_KYWD=188;
	public static final int WHILE_KYWD=189;
	public static final int WS=190;
	public static final int XOR_KYWD=191;
	public static final int CHECKED_SEQUENCE_KWYD=192;
	public static final int TRY=193;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public PlexilTreeTransforms(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PlexilTreeTransforms(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PlexilTreeTransforms.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g"; }


	    GlobalContext m_globalContext = GlobalContext.getGlobalContext();
	    NodeContext m_context = m_globalContext;
	    Stack<String> m_paraphrases = new Stack<String>();

		// Overrides to enhance error reporting
		public String getErrorMessage(RecognitionException e,
			   		  				  String[] tokenNames)
		{
		  String msg = super.getErrorMessage(e, tokenNames);
		  if (m_paraphrases.size() > 0) {
			 msg = msg + " " + m_paraphrases.peek();
		  }
	      return msg;
		}

		public void displayRecognitionError(String[] tokenNames,
											RecognitionException e)
		{
		  CompilerState.getCompilerState().addDiagnostic((PlexilTreeNode) e.node,
														 getErrorHeader(e) + " " + getErrorMessage(e, tokenNames),
														 Severity.ERROR);
		}

	    // Debugging aid.
	//    public void reportTransformation(Object oldTree, Object newTree)
	//    {
	//        System.out.println("Optimizer: transforming\n  "
	//                           + ((PlexilTreeNode) oldTree).toStringTree()
	//                           + "\n to\n  "
	//                           + ((PlexilTreeNode) newTree).toStringTree());
	//    }



	public static class topdown_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "topdown"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:90:1: topdown : enterContext ;
	@Override
	public final PlexilTreeTransforms.topdown_return topdown() throws RecognitionException {
		PlexilTreeTransforms.topdown_return retval = new PlexilTreeTransforms.topdown_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope enterContext1 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:90:8: ( enterContext )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:91:9: enterContext
			{
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_enterContext_in_topdown154);
			enterContext1=enterContext();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)enterContext1.getTree();

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "topdown"


	public static class bottomup_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "bottomup"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:94:1: bottomup : ( trivialReduction | booleanIdentityElision | integerIdentityElision | realIdentityElision | booleanEqualityNegation | rightAssociativeReduction | leftAssociativeReduction | flattenTrivialCheckedBlock | exitContext );
	@Override
	public final PlexilTreeTransforms.bottomup_return bottomup() throws RecognitionException {
		PlexilTreeTransforms.bottomup_return retval = new PlexilTreeTransforms.bottomup_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope trivialReduction2 =null;
		TreeRuleReturnScope booleanIdentityElision3 =null;
		TreeRuleReturnScope integerIdentityElision4 =null;
		TreeRuleReturnScope realIdentityElision5 =null;
		TreeRuleReturnScope booleanEqualityNegation6 =null;
		TreeRuleReturnScope rightAssociativeReduction7 =null;
		TreeRuleReturnScope leftAssociativeReduction8 =null;
		TreeRuleReturnScope flattenTrivialCheckedBlock9 =null;
		TreeRuleReturnScope exitContext10 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:94:9: ( trivialReduction | booleanIdentityElision | integerIdentityElision | realIdentityElision | booleanEqualityNegation | rightAssociativeReduction | leftAssociativeReduction | flattenTrivialCheckedBlock | exitContext )
			int alt1=9;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					int LA1_13 = input.LA(3);
					if ( (synpred1_PlexilTreeTransforms()) ) {
						alt1=1;
					}
					else if ( (synpred2_PlexilTreeTransforms()) ) {
						alt1=2;
					}
					else if ( (synpred6_PlexilTreeTransforms()) ) {
						alt1=6;
					}
					else if ( (synpred7_PlexilTreeTransforms()) ) {
						alt1=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OR_KYWD:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==DOWN) ) {
					int LA1_14 = input.LA(3);
					if ( (synpred1_PlexilTreeTransforms()) ) {
						alt1=1;
					}
					else if ( (synpred2_PlexilTreeTransforms()) ) {
						alt1=2;
					}
					else if ( (synpred6_PlexilTreeTransforms()) ) {
						alt1=6;
					}
					else if ( (synpred7_PlexilTreeTransforms()) ) {
						alt1=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PLUS:
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3==DOWN) ) {
					int LA1_15 = input.LA(3);
					if ( (synpred1_PlexilTreeTransforms()) ) {
						alt1=1;
					}
					else if ( (synpred3_PlexilTreeTransforms()) ) {
						alt1=3;
					}
					else if ( (synpred4_PlexilTreeTransforms()) ) {
						alt1=4;
					}
					else if ( (synpred6_PlexilTreeTransforms()) ) {
						alt1=6;
					}
					else if ( (synpred7_PlexilTreeTransforms()) ) {
						alt1=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASTERISK:
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4==DOWN) ) {
					int LA1_16 = input.LA(3);
					if ( (synpred1_PlexilTreeTransforms()) ) {
						alt1=1;
					}
					else if ( (synpred3_PlexilTreeTransforms()) ) {
						alt1=3;
					}
					else if ( (synpred4_PlexilTreeTransforms()) ) {
						alt1=4;
					}
					else if ( (synpred6_PlexilTreeTransforms()) ) {
						alt1=6;
					}
					else if ( (synpred7_PlexilTreeTransforms()) ) {
						alt1=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MAX_KYWD:
				{
				int LA1_5 = input.LA(2);
				if ( (LA1_5==DOWN) ) {
					int LA1_17 = input.LA(3);
					if ( (synpred1_PlexilTreeTransforms()) ) {
						alt1=1;
					}
					else if ( (synpred6_PlexilTreeTransforms()) ) {
						alt1=6;
					}
					else if ( (synpred7_PlexilTreeTransforms()) ) {
						alt1=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MIN_KYWD:
				{
				int LA1_6 = input.LA(2);
				if ( (LA1_6==DOWN) ) {
					int LA1_18 = input.LA(3);
					if ( (synpred1_PlexilTreeTransforms()) ) {
						alt1=1;
					}
					else if ( (synpred6_PlexilTreeTransforms()) ) {
						alt1=6;
					}
					else if ( (synpred7_PlexilTreeTransforms()) ) {
						alt1=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DEQUALS:
				{
				int LA1_7 = input.LA(2);
				if ( (LA1_7==DOWN) ) {
					int LA1_19 = input.LA(3);
					if ( (synpred2_PlexilTreeTransforms()) ) {
						alt1=2;
					}
					else if ( (synpred5_PlexilTreeTransforms()) ) {
						alt1=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEQUALS:
				{
				int LA1_8 = input.LA(2);
				if ( (LA1_8==DOWN) ) {
					int LA1_20 = input.LA(3);
					if ( (synpred2_PlexilTreeTransforms()) ) {
						alt1=2;
					}
					else if ( (synpred5_PlexilTreeTransforms()) ) {
						alt1=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS:
				{
				int LA1_9 = input.LA(2);
				if ( (LA1_9==DOWN) ) {
					int LA1_21 = input.LA(3);
					if ( (synpred3_PlexilTreeTransforms()) ) {
						alt1=3;
					}
					else if ( (synpred4_PlexilTreeTransforms()) ) {
						alt1=4;
					}
					else if ( (synpred7_PlexilTreeTransforms()) ) {
						alt1=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SLASH:
				{
				int LA1_10 = input.LA(2);
				if ( (LA1_10==DOWN) ) {
					int LA1_22 = input.LA(3);
					if ( (synpred3_PlexilTreeTransforms()) ) {
						alt1=3;
					}
					else if ( (synpred4_PlexilTreeTransforms()) ) {
						alt1=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 22, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ACTION:
				{
				alt1=8;
				}
				break;
			case BLOCK:
			case CONCURRENCE_KYWD:
			case FOR_KYWD:
			case LBRACE:
			case SEQUENCE_KYWD:
			case TRY_KYWD:
			case UNCHECKED_SEQUENCE_KYWD:
				{
				alt1=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:95:9: trivialReduction
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_trivialReduction_in_bottomup174);
					trivialReduction2=trivialReduction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)trivialReduction2.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:96:9: booleanIdentityElision
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_booleanIdentityElision_in_bottomup188);
					booleanIdentityElision3=booleanIdentityElision();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)booleanIdentityElision3.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:97:9: integerIdentityElision
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_integerIdentityElision_in_bottomup198);
					integerIdentityElision4=integerIdentityElision();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)integerIdentityElision4.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:98:9: realIdentityElision
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_realIdentityElision_in_bottomup208);
					realIdentityElision5=realIdentityElision();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)realIdentityElision5.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:99:9: booleanEqualityNegation
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_booleanEqualityNegation_in_bottomup218);
					booleanEqualityNegation6=booleanEqualityNegation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)booleanEqualityNegation6.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:100:9: rightAssociativeReduction
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_rightAssociativeReduction_in_bottomup228);
					rightAssociativeReduction7=rightAssociativeReduction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)rightAssociativeReduction7.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:101:9: leftAssociativeReduction
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_leftAssociativeReduction_in_bottomup238);
					leftAssociativeReduction8=leftAssociativeReduction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)leftAssociativeReduction8.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 8 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:102:9: flattenTrivialCheckedBlock
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_flattenTrivialCheckedBlock_in_bottomup248);
					flattenTrivialCheckedBlock9=flattenTrivialCheckedBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)flattenTrivialCheckedBlock9.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 9 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:103:9: exitContext
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_exitContext_in_bottomup258);
					exitContext10=exitContext();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)exitContext10.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bottomup"


	public static class enterContext_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "enterContext"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:110:1: enterContext : bindingContextNode ;
	public final PlexilTreeTransforms.enterContext_return enterContext() throws RecognitionException {
		PlexilTreeTransforms.enterContext_return retval = new PlexilTreeTransforms.enterContext_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope bindingContextNode11 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:110:13: ( bindingContextNode )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:111:9: bindingContextNode
			{
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_bindingContextNode_in_enterContext282);
			bindingContextNode11=bindingContextNode();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)bindingContextNode11.getTree();

			if ( state.backtracking==1 ) {
			            m_context = (bindingContextNode11!=null?((PlexilTreeNode)bindingContextNode11.start):null).getContext();
			//            System.out.println("Enter context " + m_context.getNodeName()); // DEBUG
			        }
			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enterContext"


	public static class exitContext_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "exitContext"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:121:1: exitContext : bindingContextNode ;
	public final PlexilTreeTransforms.exitContext_return exitContext() throws RecognitionException {
		PlexilTreeTransforms.exitContext_return retval = new PlexilTreeTransforms.exitContext_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope bindingContextNode12 =null;


		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:121:12: ( bindingContextNode )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:122:9: bindingContextNode
			{
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_bindingContextNode_in_exitContext312);
			bindingContextNode12=bindingContextNode();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)bindingContextNode12.getTree();

			if ( state.backtracking==1 ) {
			//            System.out.println("Exit context " + m_context.getNodeName()); // DEBUG
			            m_context = m_context.getParentContext();
			//            System.out.println("Restore context " + m_context.getNodeName()); // DEBUG
			        }
			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exitContext"


	public static class rightAssociativeReduction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "rightAssociativeReduction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:135:1: rightAssociativeReduction : ( ^( AND_KYWD args+= . ^( AND_KYWD (args+= . )+ ) ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD args+= . ^( OR_KYWD (args+= . )+ ) ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS args+= . ^( PLUS (args+= . )+ ) ) -> ^( PLUS ( $args)+ ) | ^( ASTERISK args+= . ^( ASTERISK (args+= . )+ ) ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD args+= . ^( MAX_KYWD (args+= . )+ ) ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD args+= . ^( MIN_KYWD (args+= . )+ ) ) -> ^( MIN_KYWD ( $args)+ ) );
	public final PlexilTreeTransforms.rightAssociativeReduction_return rightAssociativeReduction() throws RecognitionException {
		PlexilTreeTransforms.rightAssociativeReduction_return retval = new PlexilTreeTransforms.rightAssociativeReduction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode AND_KYWD13=null;
		PlexilTreeNode AND_KYWD14=null;
		PlexilTreeNode OR_KYWD15=null;
		PlexilTreeNode OR_KYWD16=null;
		PlexilTreeNode PLUS17=null;
		PlexilTreeNode PLUS18=null;
		PlexilTreeNode ASTERISK19=null;
		PlexilTreeNode ASTERISK20=null;
		PlexilTreeNode MAX_KYWD21=null;
		PlexilTreeNode MAX_KYWD22=null;
		PlexilTreeNode MIN_KYWD23=null;
		PlexilTreeNode MIN_KYWD24=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;

		PlexilTreeNode AND_KYWD13_tree=null;
		PlexilTreeNode AND_KYWD14_tree=null;
		PlexilTreeNode OR_KYWD15_tree=null;
		PlexilTreeNode OR_KYWD16_tree=null;
		PlexilTreeNode PLUS17_tree=null;
		PlexilTreeNode PLUS18_tree=null;
		PlexilTreeNode ASTERISK19_tree=null;
		PlexilTreeNode ASTERISK20_tree=null;
		PlexilTreeNode MAX_KYWD21_tree=null;
		PlexilTreeNode MAX_KYWD22_tree=null;
		PlexilTreeNode MIN_KYWD23_tree=null;
		PlexilTreeNode MIN_KYWD24_tree=null;
		PlexilTreeNode args_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_MIN_KYWD=new RewriteRuleNodeStream(adaptor,"token MIN_KYWD");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_MAX_KYWD=new RewriteRuleNodeStream(adaptor,"token MAX_KYWD");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:135:26: ( ^( AND_KYWD args+= . ^( AND_KYWD (args+= . )+ ) ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD args+= . ^( OR_KYWD (args+= . )+ ) ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS args+= . ^( PLUS (args+= . )+ ) ) -> ^( PLUS ( $args)+ ) | ^( ASTERISK args+= . ^( ASTERISK (args+= . )+ ) ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD args+= . ^( MAX_KYWD (args+= . )+ ) ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD args+= . ^( MIN_KYWD (args+= . )+ ) ) -> ^( MIN_KYWD ( $args)+ ) )
			int alt8=6;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				alt8=1;
				}
				break;
			case OR_KYWD:
				{
				alt8=2;
				}
				break;
			case PLUS:
				{
				alt8=3;
				}
				break;
			case ASTERISK:
				{
				alt8=4;
				}
				break;
			case MAX_KYWD:
				{
				alt8=5;
				}
				break;
			case MIN_KYWD:
				{
				alt8=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:136:9: ^( AND_KYWD args+= . ^( AND_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD13=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_rightAssociativeReduction345); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD13);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD13;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD14=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_rightAssociativeReduction352); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD14);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = AND_KYWD14;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:136:39: (args+= . )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= ABS_KYWD && LA2_0 <= TRY)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:136:40: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, AND_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 136:53: -> ^( AND_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:136:56: ^( AND_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_AND_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:137:9: ^( OR_KYWD args+= . ^( OR_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD15=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_rightAssociativeReduction383); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD15);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD15;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD16=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_rightAssociativeReduction390); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD16);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = OR_KYWD16;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:137:37: (args+= . )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= ABS_KYWD && LA3_0 <= TRY)) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:137:38: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, OR_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 137:52: -> ^( OR_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:137:55: ^( OR_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_OR_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:138:9: ^( PLUS args+= . ^( PLUS (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS17=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_rightAssociativeReduction422); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS17);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS17;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS18=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_rightAssociativeReduction429); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS18);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = PLUS18;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:138:31: (args+= . )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= ABS_KYWD && LA4_0 <= TRY)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:138:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, PLUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 138:52: -> ^( PLUS ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:138:55: ^( PLUS ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_PLUS.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:139:9: ^( ASTERISK args+= . ^( ASTERISK (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK19=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_rightAssociativeReduction467); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK19);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK19;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK20=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_rightAssociativeReduction474); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK20);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = ASTERISK20;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:139:39: (args+= . )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= ABS_KYWD && LA5_0 <= TRY)) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:139:40: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ASTERISK, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 139:52: -> ^( ASTERISK ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:139:55: ^( ASTERISK ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ASTERISK.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:140:9: ^( MAX_KYWD args+= . ^( MAX_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD21=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_rightAssociativeReduction504); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD21);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MAX_KYWD21;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD22=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_rightAssociativeReduction511); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD22);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MAX_KYWD22;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:140:39: (args+= . )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= ABS_KYWD && LA6_0 <= TRY)) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:140:40: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MAX_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 140:52: -> ^( MAX_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:140:55: ^( MAX_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MAX_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:141:9: ^( MIN_KYWD args+= . ^( MIN_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD23=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_rightAssociativeReduction541); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD23);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MIN_KYWD23;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD24=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_rightAssociativeReduction548); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD24);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MIN_KYWD24;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:141:39: (args+= . )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= ABS_KYWD && LA7_0 <= TRY)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:141:40: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MIN_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 141:52: -> ^( MIN_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:141:55: ^( MIN_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MIN_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rightAssociativeReduction"


	public static class leftAssociativeReduction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "leftAssociativeReduction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:144:1: leftAssociativeReduction : ( ^( AND_KYWD ^( AND_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD ^( OR_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS ^( PLUS (args+= . )+ ) (args+= . )+ ) -> ^( PLUS ( $args)+ ) | ^( MINUS ^( MINUS args+= . (args+= . )+ ) (args+= . )+ ) -> ^( MINUS ( $args)+ ) | ^( ASTERISK ^( ASTERISK (args+= . )+ ) (args+= . )+ ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD ^( MAX_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD ^( MIN_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( MIN_KYWD ( $args)+ ) );
	public final PlexilTreeTransforms.leftAssociativeReduction_return leftAssociativeReduction() throws RecognitionException {
		PlexilTreeTransforms.leftAssociativeReduction_return retval = new PlexilTreeTransforms.leftAssociativeReduction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode AND_KYWD25=null;
		PlexilTreeNode AND_KYWD26=null;
		PlexilTreeNode OR_KYWD27=null;
		PlexilTreeNode OR_KYWD28=null;
		PlexilTreeNode PLUS29=null;
		PlexilTreeNode PLUS30=null;
		PlexilTreeNode MINUS31=null;
		PlexilTreeNode MINUS32=null;
		PlexilTreeNode ASTERISK33=null;
		PlexilTreeNode ASTERISK34=null;
		PlexilTreeNode MAX_KYWD35=null;
		PlexilTreeNode MAX_KYWD36=null;
		PlexilTreeNode MIN_KYWD37=null;
		PlexilTreeNode MIN_KYWD38=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;

		PlexilTreeNode AND_KYWD25_tree=null;
		PlexilTreeNode AND_KYWD26_tree=null;
		PlexilTreeNode OR_KYWD27_tree=null;
		PlexilTreeNode OR_KYWD28_tree=null;
		PlexilTreeNode PLUS29_tree=null;
		PlexilTreeNode PLUS30_tree=null;
		PlexilTreeNode MINUS31_tree=null;
		PlexilTreeNode MINUS32_tree=null;
		PlexilTreeNode ASTERISK33_tree=null;
		PlexilTreeNode ASTERISK34_tree=null;
		PlexilTreeNode MAX_KYWD35_tree=null;
		PlexilTreeNode MAX_KYWD36_tree=null;
		PlexilTreeNode MIN_KYWD37_tree=null;
		PlexilTreeNode MIN_KYWD38_tree=null;
		PlexilTreeNode args_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_MIN_KYWD=new RewriteRuleNodeStream(adaptor,"token MIN_KYWD");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_MAX_KYWD=new RewriteRuleNodeStream(adaptor,"token MAX_KYWD");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:144:25: ( ^( AND_KYWD ^( AND_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD ^( OR_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS ^( PLUS (args+= . )+ ) (args+= . )+ ) -> ^( PLUS ( $args)+ ) | ^( MINUS ^( MINUS args+= . (args+= . )+ ) (args+= . )+ ) -> ^( MINUS ( $args)+ ) | ^( ASTERISK ^( ASTERISK (args+= . )+ ) (args+= . )+ ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD ^( MAX_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD ^( MIN_KYWD (args+= . )+ ) (args+= . )+ ) -> ^( MIN_KYWD ( $args)+ ) )
			int alt23=7;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				alt23=1;
				}
				break;
			case OR_KYWD:
				{
				alt23=2;
				}
				break;
			case PLUS:
				{
				alt23=3;
				}
				break;
			case MINUS:
				{
				alt23=4;
				}
				break;
			case ASTERISK:
				{
				alt23=5;
				}
				break;
			case MAX_KYWD:
				{
				alt23=6;
				}
				break;
			case MIN_KYWD:
				{
				alt23=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:145:9: ^( AND_KYWD ^( AND_KYWD (args+= . )+ ) (args+= . )+ )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD25=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_leftAssociativeReduction588); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD25);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD25;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD26=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_leftAssociativeReduction591); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD26);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = AND_KYWD26;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:145:31: (args+= . )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= ABS_KYWD && LA9_0 <= TRY)) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:145:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:145:43: (args+= . )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= ABS_KYWD && LA10_0 <= TRY)) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:145:44: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, AND_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 145:58: -> ^( AND_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:145:61: ^( AND_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_AND_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:146:9: ^( OR_KYWD ^( OR_KYWD (args+= . )+ ) (args+= . )+ )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD27=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_leftAssociativeReduction631); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD27);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD27;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD28=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_leftAssociativeReduction634); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD28);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = OR_KYWD28;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:146:29: (args+= . )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= ABS_KYWD && LA11_0 <= TRY)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:146:30: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:146:41: (args+= . )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= ABS_KYWD && LA12_0 <= TRY)) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:146:42: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, OR_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 146:58: -> ^( OR_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:146:61: ^( OR_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_OR_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:147:9: ^( PLUS ^( PLUS (args+= . )+ ) (args+= . )+ )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS29=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_leftAssociativeReduction676); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS29);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS29;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS30=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_leftAssociativeReduction679); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS30);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = PLUS30;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:147:23: (args+= . )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= ABS_KYWD && LA13_0 <= TRY)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:147:24: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:147:35: (args+= . )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= ABS_KYWD && LA14_0 <= TRY)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:147:36: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, PLUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 147:58: -> ^( PLUS ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:147:61: ^( PLUS ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_PLUS.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:148:9: ^( MINUS ^( MINUS args+= . (args+= . )+ ) (args+= . )+ )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS31=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_leftAssociativeReduction727); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS31);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MINUS31;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS32=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_leftAssociativeReduction730); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS32);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MINUS32;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:148:33: (args+= . )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= ABS_KYWD && LA15_0 <= TRY)) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:148:34: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:148:45: (args+= . )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= ABS_KYWD && LA16_0 <= TRY)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:148:46: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MINUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 148:58: -> ^( MINUS ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:148:61: ^( MINUS ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MINUS.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:149:9: ^( ASTERISK ^( ASTERISK (args+= . )+ ) (args+= . )+ )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK33=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_leftAssociativeReduction772); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK33);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK33;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK34=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_leftAssociativeReduction775); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK34);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = ASTERISK34;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:149:31: (args+= . )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= ABS_KYWD && LA17_0 <= TRY)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:149:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:149:43: (args+= . )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= ABS_KYWD && LA18_0 <= TRY)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:149:44: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, ASTERISK
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 149:58: -> ^( ASTERISK ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:149:61: ^( ASTERISK ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ASTERISK.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:150:9: ^( MAX_KYWD ^( MAX_KYWD (args+= . )+ ) (args+= . )+ )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD35=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_leftAssociativeReduction815); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD35);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MAX_KYWD35;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD36=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_leftAssociativeReduction818); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD36);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MAX_KYWD36;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:150:31: (args+= . )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= ABS_KYWD && LA19_0 <= TRY)) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:150:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:150:43: (args+= . )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= ABS_KYWD && LA20_0 <= TRY)) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:150:44: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: MAX_KYWD, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 150:58: -> ^( MAX_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:150:61: ^( MAX_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MAX_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:151:9: ^( MIN_KYWD ^( MIN_KYWD (args+= . )+ ) (args+= . )+ )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD37=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_leftAssociativeReduction858); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD37);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MIN_KYWD37;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD38=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_leftAssociativeReduction861); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD38);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MIN_KYWD38;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:151:31: (args+= . )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( ((LA21_0 >= ABS_KYWD && LA21_0 <= TRY)) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:151:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:151:43: (args+= . )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= ABS_KYWD && LA22_0 <= TRY)) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:151:44: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: MIN_KYWD, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 151:56: -> ^( MIN_KYWD ( $args)+ )
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:151:59: ^( MIN_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MIN_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "leftAssociativeReduction"


	public static class trivialReduction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "trivialReduction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:155:1: trivialReduction : ( ^( AND_KYWD arg= . ) -> $arg| ^( OR_KYWD arg= . ) -> $arg| ^( PLUS arg= . ) -> $arg| ^( ASTERISK arg= . ) -> $arg| ^( MAX_KYWD arg= . ) -> $arg| ^( MIN_KYWD arg= . ) -> $arg);
	public final PlexilTreeTransforms.trivialReduction_return trivialReduction() throws RecognitionException {
		PlexilTreeTransforms.trivialReduction_return retval = new PlexilTreeTransforms.trivialReduction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode AND_KYWD39=null;
		PlexilTreeNode OR_KYWD40=null;
		PlexilTreeNode PLUS41=null;
		PlexilTreeNode ASTERISK42=null;
		PlexilTreeNode MAX_KYWD43=null;
		PlexilTreeNode MIN_KYWD44=null;
		PlexilTreeNode arg=null;

		PlexilTreeNode AND_KYWD39_tree=null;
		PlexilTreeNode OR_KYWD40_tree=null;
		PlexilTreeNode PLUS41_tree=null;
		PlexilTreeNode ASTERISK42_tree=null;
		PlexilTreeNode MAX_KYWD43_tree=null;
		PlexilTreeNode MIN_KYWD44_tree=null;
		PlexilTreeNode arg_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_MIN_KYWD=new RewriteRuleNodeStream(adaptor,"token MIN_KYWD");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_MAX_KYWD=new RewriteRuleNodeStream(adaptor,"token MAX_KYWD");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:155:17: ( ^( AND_KYWD arg= . ) -> $arg| ^( OR_KYWD arg= . ) -> $arg| ^( PLUS arg= . ) -> $arg| ^( ASTERISK arg= . ) -> $arg| ^( MAX_KYWD arg= . ) -> $arg| ^( MIN_KYWD arg= . ) -> $arg)
			int alt24=6;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				alt24=1;
				}
				break;
			case OR_KYWD:
				{
				alt24=2;
				}
				break;
			case PLUS:
				{
				alt24=3;
				}
				break;
			case ASTERISK:
				{
				alt24=4;
				}
				break;
			case MAX_KYWD:
				{
				alt24=5;
				}
				break;
			case MIN_KYWD:
				{
				alt24=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:156:9: ^( AND_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD39=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_trivialReduction910); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD39);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD39;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 156:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:157:9: ^( OR_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD40=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_trivialReduction931); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD40);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD40;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 157:26: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:158:9: ^( PLUS arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS41=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_trivialReduction952); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS41);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS41;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 158:23: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:159:9: ^( ASTERISK arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK42=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_trivialReduction973); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK42);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK42;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 159:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:160:9: ^( MAX_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD43=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_trivialReduction994); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD43);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MAX_KYWD43;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 160:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:161:9: ^( MIN_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD44=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_trivialReduction1015); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD44);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MIN_KYWD44;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 161:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trivialReduction"


	public static class booleanIdentityElision_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "booleanIdentityElision"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:168:1: booleanIdentityElision : ( ^( AND_KYWD TRUE_KYWD arg= . ) -> $arg| ^( AND_KYWD arg= . TRUE_KYWD ) -> $arg| ^( OR_KYWD FALSE_KYWD arg= . ) -> $arg| ^( OR_KYWD arg= . FALSE_KYWD ) -> $arg| ^( DEQUALS TRUE_KYWD arg= . ) -> $arg| ^( DEQUALS arg= . TRUE_KYWD ) -> $arg| ^( NEQUALS FALSE_KYWD arg= . ) -> $arg| ^( NEQUALS arg= . FALSE_KYWD ) -> $arg);
	public final PlexilTreeTransforms.booleanIdentityElision_return booleanIdentityElision() throws RecognitionException {
		PlexilTreeTransforms.booleanIdentityElision_return retval = new PlexilTreeTransforms.booleanIdentityElision_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode AND_KYWD45=null;
		PlexilTreeNode TRUE_KYWD46=null;
		PlexilTreeNode AND_KYWD47=null;
		PlexilTreeNode TRUE_KYWD48=null;
		PlexilTreeNode OR_KYWD49=null;
		PlexilTreeNode FALSE_KYWD50=null;
		PlexilTreeNode OR_KYWD51=null;
		PlexilTreeNode FALSE_KYWD52=null;
		PlexilTreeNode DEQUALS53=null;
		PlexilTreeNode TRUE_KYWD54=null;
		PlexilTreeNode DEQUALS55=null;
		PlexilTreeNode TRUE_KYWD56=null;
		PlexilTreeNode NEQUALS57=null;
		PlexilTreeNode FALSE_KYWD58=null;
		PlexilTreeNode NEQUALS59=null;
		PlexilTreeNode FALSE_KYWD60=null;
		PlexilTreeNode arg=null;

		PlexilTreeNode AND_KYWD45_tree=null;
		PlexilTreeNode TRUE_KYWD46_tree=null;
		PlexilTreeNode AND_KYWD47_tree=null;
		PlexilTreeNode TRUE_KYWD48_tree=null;
		PlexilTreeNode OR_KYWD49_tree=null;
		PlexilTreeNode FALSE_KYWD50_tree=null;
		PlexilTreeNode OR_KYWD51_tree=null;
		PlexilTreeNode FALSE_KYWD52_tree=null;
		PlexilTreeNode DEQUALS53_tree=null;
		PlexilTreeNode TRUE_KYWD54_tree=null;
		PlexilTreeNode DEQUALS55_tree=null;
		PlexilTreeNode TRUE_KYWD56_tree=null;
		PlexilTreeNode NEQUALS57_tree=null;
		PlexilTreeNode FALSE_KYWD58_tree=null;
		PlexilTreeNode NEQUALS59_tree=null;
		PlexilTreeNode FALSE_KYWD60_tree=null;
		PlexilTreeNode arg_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_DEQUALS=new RewriteRuleNodeStream(adaptor,"token DEQUALS");
		RewriteRuleNodeStream stream_FALSE_KYWD=new RewriteRuleNodeStream(adaptor,"token FALSE_KYWD");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_NEQUALS=new RewriteRuleNodeStream(adaptor,"token NEQUALS");
		RewriteRuleNodeStream stream_TRUE_KYWD=new RewriteRuleNodeStream(adaptor,"token TRUE_KYWD");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:168:23: ( ^( AND_KYWD TRUE_KYWD arg= . ) -> $arg| ^( AND_KYWD arg= . TRUE_KYWD ) -> $arg| ^( OR_KYWD FALSE_KYWD arg= . ) -> $arg| ^( OR_KYWD arg= . FALSE_KYWD ) -> $arg| ^( DEQUALS TRUE_KYWD arg= . ) -> $arg| ^( DEQUALS arg= . TRUE_KYWD ) -> $arg| ^( NEQUALS FALSE_KYWD arg= . ) -> $arg| ^( NEQUALS arg= . FALSE_KYWD ) -> $arg)
			int alt25=8;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				int LA25_1 = input.LA(2);
				if ( (LA25_1==DOWN) ) {
					int LA25_5 = input.LA(3);
					if ( (synpred45_PlexilTreeTransforms()) ) {
						alt25=1;
					}
					else if ( (synpred46_PlexilTreeTransforms()) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OR_KYWD:
				{
				int LA25_2 = input.LA(2);
				if ( (LA25_2==DOWN) ) {
					int LA25_6 = input.LA(3);
					if ( (synpred47_PlexilTreeTransforms()) ) {
						alt25=3;
					}
					else if ( (synpred48_PlexilTreeTransforms()) ) {
						alt25=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DEQUALS:
				{
				int LA25_3 = input.LA(2);
				if ( (LA25_3==DOWN) ) {
					int LA25_7 = input.LA(3);
					if ( (synpred49_PlexilTreeTransforms()) ) {
						alt25=5;
					}
					else if ( (synpred50_PlexilTreeTransforms()) ) {
						alt25=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEQUALS:
				{
				int LA25_4 = input.LA(2);
				if ( (LA25_4==DOWN) ) {
					int LA25_8 = input.LA(3);
					if ( (synpred51_PlexilTreeTransforms()) ) {
						alt25=7;
					}
					else if ( (true) ) {
						alt25=8;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:169:9: ^( AND_KYWD TRUE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD45=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_booleanIdentityElision1050); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD45);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD45;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD46=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanIdentityElision1052); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD46);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 169:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:170:9: ^( AND_KYWD arg= . TRUE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD47=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_booleanIdentityElision1073); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD47);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD47;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD48=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanIdentityElision1079); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD48);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 170:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:171:9: ^( OR_KYWD FALSE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD49=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_booleanIdentityElision1096); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD49);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD49;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD50=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanIdentityElision1098); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD50);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 171:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:172:9: ^( OR_KYWD arg= . FALSE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD51=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_booleanIdentityElision1119); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD51);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD51;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD52=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanIdentityElision1125); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD52);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 172:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:173:9: ^( DEQUALS TRUE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS53=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanIdentityElision1142); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS53);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS53;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD54=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanIdentityElision1144); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD54);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 173:36: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:174:9: ^( DEQUALS arg= . TRUE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS55=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanIdentityElision1165); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS55);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS55;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD56=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanIdentityElision1171); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD56);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 174:36: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 7 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:175:9: ^( NEQUALS FALSE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS57=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanIdentityElision1188); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS57);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS57;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD58=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanIdentityElision1190); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD58);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 175:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 8 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:176:9: ^( NEQUALS arg= . FALSE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS59=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanIdentityElision1211); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS59);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS59;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD60=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanIdentityElision1217); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD60);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 176:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanIdentityElision"


	public static class integerIdentityElision_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "integerIdentityElision"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:179:1: integerIdentityElision : ( ^( PLUS i= INT arg= . {...}?) -> $arg| ^( PLUS arg= . i= INT {...}?) -> $arg| ^( MINUS arg= . i= INT {...}?) -> $arg| ^( ASTERISK i= INT arg= . {...}?) -> $arg| ^( ASTERISK arg= . i= INT {...}?) -> $arg| ^( SLASH arg= . i= INT {...}?) -> $arg);
	public final PlexilTreeTransforms.integerIdentityElision_return integerIdentityElision() throws RecognitionException {
		PlexilTreeTransforms.integerIdentityElision_return retval = new PlexilTreeTransforms.integerIdentityElision_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode i=null;
		PlexilTreeNode PLUS61=null;
		PlexilTreeNode PLUS62=null;
		PlexilTreeNode MINUS63=null;
		PlexilTreeNode ASTERISK64=null;
		PlexilTreeNode ASTERISK65=null;
		PlexilTreeNode SLASH66=null;
		PlexilTreeNode arg=null;

		PlexilTreeNode i_tree=null;
		PlexilTreeNode PLUS61_tree=null;
		PlexilTreeNode PLUS62_tree=null;
		PlexilTreeNode MINUS63_tree=null;
		PlexilTreeNode ASTERISK64_tree=null;
		PlexilTreeNode ASTERISK65_tree=null;
		PlexilTreeNode SLASH66_tree=null;
		PlexilTreeNode arg_tree=null;
		RewriteRuleNodeStream stream_SLASH=new RewriteRuleNodeStream(adaptor,"token SLASH");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:179:23: ( ^( PLUS i= INT arg= . {...}?) -> $arg| ^( PLUS arg= . i= INT {...}?) -> $arg| ^( MINUS arg= . i= INT {...}?) -> $arg| ^( ASTERISK i= INT arg= . {...}?) -> $arg| ^( ASTERISK arg= . i= INT {...}?) -> $arg| ^( SLASH arg= . i= INT {...}?) -> $arg)
			int alt26=6;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				int LA26_1 = input.LA(2);
				if ( (LA26_1==DOWN) ) {
					int LA26_5 = input.LA(3);
					if ( (synpred52_PlexilTreeTransforms()) ) {
						alt26=1;
					}
					else if ( (synpred53_PlexilTreeTransforms()) ) {
						alt26=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS:
				{
				alt26=3;
				}
				break;
			case ASTERISK:
				{
				int LA26_3 = input.LA(2);
				if ( (LA26_3==DOWN) ) {
					int LA26_6 = input.LA(3);
					if ( (synpred55_PlexilTreeTransforms()) ) {
						alt26=4;
					}
					else if ( (synpred56_PlexilTreeTransforms()) ) {
						alt26=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SLASH:
				{
				alt26=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:180:9: ^( PLUS i= INT arg= . {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS61=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_integerIdentityElision1248); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS61);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS61;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_integerIdentityElision1252); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "integerIdentityElision", "Integer.valueOf($i.text) == 0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 180:62: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:181:9: ^( PLUS arg= . i= INT {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS62=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_integerIdentityElision1275); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS62);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS62;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_integerIdentityElision1283); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "integerIdentityElision", "Integer.valueOf($i.text) == 0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 181:62: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:182:9: ^( MINUS arg= . i= INT {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS63=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_integerIdentityElision1302); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS63);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MINUS63;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_integerIdentityElision1310); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "integerIdentityElision", "Integer.valueOf($i.text) == 0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 182:63: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:183:9: ^( ASTERISK i= INT arg= . {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK64=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_integerIdentityElision1329); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK64);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK64;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_integerIdentityElision1333); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "integerIdentityElision", "Integer.valueOf($i.text) == 1");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 183:66: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:184:9: ^( ASTERISK arg= . i= INT {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK65=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_integerIdentityElision1356); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK65);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK65;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_integerIdentityElision1364); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "integerIdentityElision", "Integer.valueOf($i.text) == 1");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 184:66: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:185:9: ^( SLASH arg= . i= INT {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					SLASH66=(PlexilTreeNode)match(input,SLASH,FOLLOW_SLASH_in_integerIdentityElision1383); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SLASH.add(SLASH66);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SLASH66;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_integerIdentityElision1391); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "integerIdentityElision", "Integer.valueOf($i.text) == 1");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 185:63: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integerIdentityElision"


	public static class realIdentityElision_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "realIdentityElision"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:188:1: realIdentityElision : ( ^( PLUS i= DOUBLE arg= . {...}?) -> $arg| ^( PLUS arg= . i= DOUBLE {...}?) -> $arg| ^( MINUS arg= . i= DOUBLE {...}?) -> $arg| ^( ASTERISK i= DOUBLE arg= . {...}?) -> $arg| ^( ASTERISK arg= . i= DOUBLE {...}?) -> $arg| ^( SLASH arg= . i= DOUBLE {...}?) -> $arg);
	public final PlexilTreeTransforms.realIdentityElision_return realIdentityElision() throws RecognitionException {
		PlexilTreeTransforms.realIdentityElision_return retval = new PlexilTreeTransforms.realIdentityElision_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode i=null;
		PlexilTreeNode PLUS67=null;
		PlexilTreeNode PLUS68=null;
		PlexilTreeNode MINUS69=null;
		PlexilTreeNode ASTERISK70=null;
		PlexilTreeNode ASTERISK71=null;
		PlexilTreeNode SLASH72=null;
		PlexilTreeNode arg=null;

		PlexilTreeNode i_tree=null;
		PlexilTreeNode PLUS67_tree=null;
		PlexilTreeNode PLUS68_tree=null;
		PlexilTreeNode MINUS69_tree=null;
		PlexilTreeNode ASTERISK70_tree=null;
		PlexilTreeNode ASTERISK71_tree=null;
		PlexilTreeNode SLASH72_tree=null;
		PlexilTreeNode arg_tree=null;
		RewriteRuleNodeStream stream_SLASH=new RewriteRuleNodeStream(adaptor,"token SLASH");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_DOUBLE=new RewriteRuleNodeStream(adaptor,"token DOUBLE");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:188:20: ( ^( PLUS i= DOUBLE arg= . {...}?) -> $arg| ^( PLUS arg= . i= DOUBLE {...}?) -> $arg| ^( MINUS arg= . i= DOUBLE {...}?) -> $arg| ^( ASTERISK i= DOUBLE arg= . {...}?) -> $arg| ^( ASTERISK arg= . i= DOUBLE {...}?) -> $arg| ^( SLASH arg= . i= DOUBLE {...}?) -> $arg)
			int alt27=6;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				int LA27_1 = input.LA(2);
				if ( (LA27_1==DOWN) ) {
					int LA27_5 = input.LA(3);
					if ( (synpred57_PlexilTreeTransforms()) ) {
						alt27=1;
					}
					else if ( (synpred58_PlexilTreeTransforms()) ) {
						alt27=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS:
				{
				alt27=3;
				}
				break;
			case ASTERISK:
				{
				int LA27_3 = input.LA(2);
				if ( (LA27_3==DOWN) ) {
					int LA27_6 = input.LA(3);
					if ( (synpred60_PlexilTreeTransforms()) ) {
						alt27=4;
					}
					else if ( (synpred61_PlexilTreeTransforms()) ) {
						alt27=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SLASH:
				{
				alt27=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:189:9: ^( PLUS i= DOUBLE arg= . {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS67=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_realIdentityElision1420); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS67);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS67;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_realIdentityElision1424); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(i);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					if ( !((Double.valueOf((i!=null?i.getText():null)) == 0.0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "realIdentityElision", "Double.valueOf($i.text) == 0.0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 189:66: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:190:9: ^( PLUS arg= . i= DOUBLE {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS68=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_realIdentityElision1447); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS68);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS68;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_realIdentityElision1455); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(i);

					if ( !((Double.valueOf((i!=null?i.getText():null)) == 0.0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "realIdentityElision", "Double.valueOf($i.text) == 0.0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 190:66: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:191:9: ^( MINUS arg= . i= DOUBLE {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS69=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_realIdentityElision1474); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS69);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MINUS69;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_realIdentityElision1482); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(i);

					if ( !((Double.valueOf((i!=null?i.getText():null)) == 0.0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "realIdentityElision", "Double.valueOf($i.text) == 0.0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 191:67: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:192:9: ^( ASTERISK i= DOUBLE arg= . {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK70=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_realIdentityElision1501); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK70);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK70;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_realIdentityElision1505); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(i);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					if ( !((Double.valueOf((i!=null?i.getText():null)) == 1.0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "realIdentityElision", "Double.valueOf($i.text) == 1.0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 192:70: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:193:9: ^( ASTERISK arg= . i= DOUBLE {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK71=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_realIdentityElision1528); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK71);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK71;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_realIdentityElision1536); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(i);

					if ( !((Double.valueOf((i!=null?i.getText():null)) == 1.0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "realIdentityElision", "Double.valueOf($i.text) == 1.0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 193:70: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:194:9: ^( SLASH arg= . i= DOUBLE {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					SLASH72=(PlexilTreeNode)match(input,SLASH,FOLLOW_SLASH_in_realIdentityElision1555); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SLASH.add(SLASH72);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SLASH72;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_realIdentityElision1563); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(i);

					if ( !((Double.valueOf((i!=null?i.getText():null)) == 1.0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "realIdentityElision", "Double.valueOf($i.text) == 1.0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 194:67: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "realIdentityElision"


	public static class booleanEqualityNegation_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "booleanEqualityNegation"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:197:1: booleanEqualityNegation : ( ^( DEQUALS FALSE_KYWD arg= . ) -> ^( NOT_KYWD $arg) | ^( DEQUALS arg= . FALSE_KYWD ) -> ^( NOT_KYWD $arg) | ^( NEQUALS TRUE_KYWD arg= . ) -> ^( NOT_KYWD $arg) | ^( NEQUALS arg= . TRUE_KYWD ) -> ^( NOT_KYWD $arg) );
	public final PlexilTreeTransforms.booleanEqualityNegation_return booleanEqualityNegation() throws RecognitionException {
		PlexilTreeTransforms.booleanEqualityNegation_return retval = new PlexilTreeTransforms.booleanEqualityNegation_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode DEQUALS73=null;
		PlexilTreeNode FALSE_KYWD74=null;
		PlexilTreeNode DEQUALS75=null;
		PlexilTreeNode FALSE_KYWD76=null;
		PlexilTreeNode NEQUALS77=null;
		PlexilTreeNode TRUE_KYWD78=null;
		PlexilTreeNode NEQUALS79=null;
		PlexilTreeNode TRUE_KYWD80=null;
		PlexilTreeNode arg=null;

		PlexilTreeNode DEQUALS73_tree=null;
		PlexilTreeNode FALSE_KYWD74_tree=null;
		PlexilTreeNode DEQUALS75_tree=null;
		PlexilTreeNode FALSE_KYWD76_tree=null;
		PlexilTreeNode NEQUALS77_tree=null;
		PlexilTreeNode TRUE_KYWD78_tree=null;
		PlexilTreeNode NEQUALS79_tree=null;
		PlexilTreeNode TRUE_KYWD80_tree=null;
		PlexilTreeNode arg_tree=null;
		RewriteRuleNodeStream stream_DEQUALS=new RewriteRuleNodeStream(adaptor,"token DEQUALS");
		RewriteRuleNodeStream stream_FALSE_KYWD=new RewriteRuleNodeStream(adaptor,"token FALSE_KYWD");
		RewriteRuleNodeStream stream_NEQUALS=new RewriteRuleNodeStream(adaptor,"token NEQUALS");
		RewriteRuleNodeStream stream_TRUE_KYWD=new RewriteRuleNodeStream(adaptor,"token TRUE_KYWD");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:197:24: ( ^( DEQUALS FALSE_KYWD arg= . ) -> ^( NOT_KYWD $arg) | ^( DEQUALS arg= . FALSE_KYWD ) -> ^( NOT_KYWD $arg) | ^( NEQUALS TRUE_KYWD arg= . ) -> ^( NOT_KYWD $arg) | ^( NEQUALS arg= . TRUE_KYWD ) -> ^( NOT_KYWD $arg) )
			int alt28=4;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==DEQUALS) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==DOWN) ) {
					int LA28_3 = input.LA(3);
					if ( (synpred62_PlexilTreeTransforms()) ) {
						alt28=1;
					}
					else if ( (synpred63_PlexilTreeTransforms()) ) {
						alt28=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA28_0==NEQUALS) ) {
				int LA28_2 = input.LA(2);
				if ( (LA28_2==DOWN) ) {
					int LA28_4 = input.LA(3);
					if ( (synpred64_PlexilTreeTransforms()) ) {
						alt28=3;
					}
					else if ( (true) ) {
						alt28=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:198:9: ^( DEQUALS FALSE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS73=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanEqualityNegation1592); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS73);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS73;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD74=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanEqualityNegation1594); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD74);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 198:37: -> ^( NOT_KYWD $arg)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:198:40: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:199:9: ^( DEQUALS arg= . FALSE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS75=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanEqualityNegation1619); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS75);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS75;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD76=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanEqualityNegation1625); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD76);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 199:37: -> ^( NOT_KYWD $arg)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:199:40: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:200:9: ^( NEQUALS TRUE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS77=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanEqualityNegation1646); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS77);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS77;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD78=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanEqualityNegation1648); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD78);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 200:37: -> ^( NOT_KYWD $arg)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:200:40: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:201:9: ^( NEQUALS arg= . TRUE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS79=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanEqualityNegation1674); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS79);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS79;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD80=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanEqualityNegation1680); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD80);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 201:37: -> ^( NOT_KYWD $arg)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:201:40: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanEqualityNegation"


	public static class flattenTrivialCheckedBlock_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "flattenTrivialCheckedBlock"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:206:1: flattenTrivialCheckedBlock : ( ^( ACTION ^( checkedBlock innerUnnamed= unnamedAction ) ) -> $innerUnnamed| ^( ACTION ^( checkedBlock innerNamed= namedAction ) ) -> $innerNamed| ^( ACTION NCNAME ^( checkedBlock namedAction ) ) | ^( ACTION outerId= NCNAME ^( checkedBlock ^( ACTION body= . ) ) ) -> ^( ACTION $outerId $body) );
	public final PlexilTreeTransforms.flattenTrivialCheckedBlock_return flattenTrivialCheckedBlock() throws RecognitionException {
		PlexilTreeTransforms.flattenTrivialCheckedBlock_return retval = new PlexilTreeTransforms.flattenTrivialCheckedBlock_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode outerId=null;
		PlexilTreeNode ACTION81=null;
		PlexilTreeNode ACTION83=null;
		PlexilTreeNode ACTION85=null;
		PlexilTreeNode NCNAME86=null;
		PlexilTreeNode ACTION89=null;
		PlexilTreeNode ACTION91=null;
		PlexilTreeNode body=null;
		TreeRuleReturnScope innerUnnamed =null;
		TreeRuleReturnScope innerNamed =null;
		TreeRuleReturnScope checkedBlock82 =null;
		TreeRuleReturnScope checkedBlock84 =null;
		TreeRuleReturnScope checkedBlock87 =null;
		TreeRuleReturnScope namedAction88 =null;
		TreeRuleReturnScope checkedBlock90 =null;

		PlexilTreeNode outerId_tree=null;
		PlexilTreeNode ACTION81_tree=null;
		PlexilTreeNode ACTION83_tree=null;
		PlexilTreeNode ACTION85_tree=null;
		PlexilTreeNode NCNAME86_tree=null;
		PlexilTreeNode ACTION89_tree=null;
		PlexilTreeNode ACTION91_tree=null;
		PlexilTreeNode body_tree=null;
		RewriteRuleNodeStream stream_ACTION=new RewriteRuleNodeStream(adaptor,"token ACTION");
		RewriteRuleNodeStream stream_NCNAME=new RewriteRuleNodeStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_namedAction=new RewriteRuleSubtreeStream(adaptor,"rule namedAction");
		RewriteRuleSubtreeStream stream_unnamedAction=new RewriteRuleSubtreeStream(adaptor,"rule unnamedAction");
		RewriteRuleSubtreeStream stream_checkedBlock=new RewriteRuleSubtreeStream(adaptor,"rule checkedBlock");

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:206:27: ( ^( ACTION ^( checkedBlock innerUnnamed= unnamedAction ) ) -> $innerUnnamed| ^( ACTION ^( checkedBlock innerNamed= namedAction ) ) -> $innerNamed| ^( ACTION NCNAME ^( checkedBlock namedAction ) ) | ^( ACTION outerId= NCNAME ^( checkedBlock ^( ACTION body= . ) ) ) -> ^( ACTION $outerId $body) )
			int alt29=4;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ACTION) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==DOWN) ) {
					int LA29_2 = input.LA(3);
					if ( (synpred65_PlexilTreeTransforms()) ) {
						alt29=1;
					}
					else if ( (synpred66_PlexilTreeTransforms()) ) {
						alt29=2;
					}
					else if ( (synpred67_PlexilTreeTransforms()) ) {
						alt29=3;
					}
					else if ( (true) ) {
						alt29=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:207:9: ^( ACTION ^( checkedBlock innerUnnamed= unnamedAction ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION81=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialCheckedBlock1722); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION81);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION81;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1725);
					checkedBlock82=checkedBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_checkedBlock.add(checkedBlock82.getTree());
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = (PlexilTreeNode)checkedBlock82.getTree();
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_unnamedAction_in_flattenTrivialCheckedBlock1729);
					innerUnnamed=unnamedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_unnamedAction.add(innerUnnamed.getTree());
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: innerUnnamed
					// token labels: 
					// rule labels: innerUnnamed, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_innerUnnamed=new RewriteRuleSubtreeStream(adaptor,"rule innerUnnamed",innerUnnamed!=null?innerUnnamed.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 208:9: -> $innerUnnamed
					{
						adaptor.addChild(root_0, stream_innerUnnamed.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:209:9: ^( ACTION ^( checkedBlock innerNamed= namedAction ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION83=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialCheckedBlock1755); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION83);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION83;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1758);
					checkedBlock84=checkedBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_checkedBlock.add(checkedBlock84.getTree());
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = (PlexilTreeNode)checkedBlock84.getTree();
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_namedAction_in_flattenTrivialCheckedBlock1762);
					innerNamed=namedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_namedAction.add(innerNamed.getTree());
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: innerNamed
					// token labels: 
					// rule labels: innerNamed, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_innerNamed=new RewriteRuleSubtreeStream(adaptor,"rule innerNamed",innerNamed!=null?innerNamed.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 210:9: -> $innerNamed
					{
						adaptor.addChild(root_0, stream_innerNamed.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:211:9: ^( ACTION NCNAME ^( checkedBlock namedAction ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION85=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialCheckedBlock1788); if (state.failed) return retval;

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION85;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					NCNAME86=(PlexilTreeNode)match(input,NCNAME,FOLLOW_NCNAME_in_flattenTrivialCheckedBlock1790); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = NCNAME86;

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1793);
					checkedBlock87=checkedBlock();
					state._fsp--;
					if (state.failed) return retval;

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = (PlexilTreeNode)checkedBlock87.getTree();
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_namedAction_in_flattenTrivialCheckedBlock1795);
					namedAction88=namedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_2==null ) _first_2 = (PlexilTreeNode)namedAction88.getTree();

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 4 :
					// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:212:9: ^( ACTION outerId= NCNAME ^( checkedBlock ^( ACTION body= . ) ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION89=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialCheckedBlock1809); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION89);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION89;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					outerId=(PlexilTreeNode)match(input,NCNAME,FOLLOW_NCNAME_in_flattenTrivialCheckedBlock1813); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NCNAME.add(outerId);

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1816);
					checkedBlock90=checkedBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_checkedBlock.add(checkedBlock90.getTree());
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = (PlexilTreeNode)checkedBlock90.getTree();
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_3 = _last;
					PlexilTreeNode _first_3 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION91=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialCheckedBlock1819); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION91);

					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = ACTION91;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					body=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_3==null ) _first_3 = body;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_3;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: outerId, ACTION, body
					// token labels: outerId
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: body
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_outerId=new RewriteRuleNodeStream(adaptor,"token outerId",outerId);
					RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"wildcard body",body);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 213:9: -> ^( ACTION $outerId $body)
					{
						// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:213:12: ^( ACTION $outerId $body)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ACTION.nextNode()
						, root_1);
						adaptor.addChild(root_1, stream_outerId.nextNode());
						adaptor.addChild(root_1, stream_body.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "flattenTrivialCheckedBlock"


	public static class bindingContextNode_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "bindingContextNode"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:220:1: bindingContextNode : ( BLOCK | LBRACE | CONCURRENCE_KYWD | SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD | FOR_KYWD );
	public final PlexilTreeTransforms.bindingContextNode_return bindingContextNode() throws RecognitionException {
		PlexilTreeTransforms.bindingContextNode_return retval = new PlexilTreeTransforms.bindingContextNode_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set92=null;

		PlexilTreeNode set92_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:220:19: ( BLOCK | LBRACE | CONCURRENCE_KYWD | SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD | FOR_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set92=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==BLOCK||input.LA(1)==CONCURRENCE_KYWD||input.LA(1)==FOR_KYWD||input.LA(1)==LBRACE||input.LA(1)==SEQUENCE_KYWD||(input.LA(1) >= TRY_KYWD && input.LA(1) <= UNCHECKED_SEQUENCE_KYWD) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bindingContextNode"


	public static class checkedBlock_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "checkedBlock"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:232:1: checkedBlock : ( CHECKED_SEQUENCE_KWYD | SEQUENCE_KYWD | BLOCK | LBRACE | TRY );
	public final PlexilTreeTransforms.checkedBlock_return checkedBlock() throws RecognitionException {
		PlexilTreeTransforms.checkedBlock_return retval = new PlexilTreeTransforms.checkedBlock_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set93=null;

		PlexilTreeNode set93_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:232:13: ( CHECKED_SEQUENCE_KWYD | SEQUENCE_KYWD | BLOCK | LBRACE | TRY )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set93=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==BLOCK||input.LA(1)==LBRACE||input.LA(1)==SEQUENCE_KYWD||(input.LA(1) >= CHECKED_SEQUENCE_KWYD && input.LA(1) <= TRY) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "checkedBlock"


	public static class uncheckedBlock_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "uncheckedBlock"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:241:1: uncheckedBlock : ( UNCHECKED_SEQUENCE_KYWD | CONCURRENCE_KYWD );
	public final PlexilTreeTransforms.uncheckedBlock_return uncheckedBlock() throws RecognitionException {
		PlexilTreeTransforms.uncheckedBlock_return retval = new PlexilTreeTransforms.uncheckedBlock_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set94=null;

		PlexilTreeNode set94_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:241:15: ( UNCHECKED_SEQUENCE_KYWD | CONCURRENCE_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set94=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==CONCURRENCE_KYWD||input.LA(1)==UNCHECKED_SEQUENCE_KYWD ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uncheckedBlock"


	public static class associativeOp_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "associativeOp"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:247:1: associativeOp : ( OR_KYWD | AND_KYWD | PLUS | MINUS | ASTERISK | MAX_KYWD | MIN_KYWD );
	public final PlexilTreeTransforms.associativeOp_return associativeOp() throws RecognitionException {
		PlexilTreeTransforms.associativeOp_return retval = new PlexilTreeTransforms.associativeOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set95=null;

		PlexilTreeNode set95_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:247:14: ( OR_KYWD | AND_KYWD | PLUS | MINUS | ASTERISK | MAX_KYWD | MIN_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set95=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==AND_KYWD||input.LA(1)==ASTERISK||input.LA(1)==MAX_KYWD||(input.LA(1) >= MINUS && input.LA(1) <= MIN_KYWD)||input.LA(1)==OR_KYWD||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "associativeOp"


	public static class namedAction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "namedAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:257:1: namedAction : ^( ACTION NCNAME . ) ;
	public final PlexilTreeTransforms.namedAction_return namedAction() throws RecognitionException {
		PlexilTreeTransforms.namedAction_return retval = new PlexilTreeTransforms.namedAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode ACTION96=null;
		PlexilTreeNode NCNAME97=null;
		PlexilTreeNode wildcard98=null;

		PlexilTreeNode ACTION96_tree=null;
		PlexilTreeNode NCNAME97_tree=null;
		PlexilTreeNode wildcard98_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:257:12: ( ^( ACTION NCNAME . ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:258:9: ^( ACTION NCNAME . )
			{
			_last = (PlexilTreeNode)input.LT(1);
			{
			PlexilTreeNode _save_last_1 = _last;
			PlexilTreeNode _first_1 = null;
			_last = (PlexilTreeNode)input.LT(1);
			ACTION96=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_namedAction2113); if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = ACTION96;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (PlexilTreeNode)input.LT(1);
			NCNAME97=(PlexilTreeNode)match(input,NCNAME,FOLLOW_NCNAME_in_namedAction2115); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = NCNAME97;

			_last = (PlexilTreeNode)input.LT(1);
			wildcard98=(PlexilTreeNode)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = wildcard98;

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedAction"


	public static class unnamedAction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unnamedAction"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:261:1: unnamedAction : ^( ACTION . ) ;
	public final PlexilTreeTransforms.unnamedAction_return unnamedAction() throws RecognitionException {
		PlexilTreeTransforms.unnamedAction_return retval = new PlexilTreeTransforms.unnamedAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode ACTION99=null;
		PlexilTreeNode wildcard100=null;

		PlexilTreeNode ACTION99_tree=null;
		PlexilTreeNode wildcard100_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:261:14: ( ^( ACTION . ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:262:9: ^( ACTION . )
			{
			_last = (PlexilTreeNode)input.LT(1);
			{
			PlexilTreeNode _save_last_1 = _last;
			PlexilTreeNode _first_1 = null;
			_last = (PlexilTreeNode)input.LT(1);
			ACTION99=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_unnamedAction2136); if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = ACTION99;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (PlexilTreeNode)input.LT(1);
			wildcard100=(PlexilTreeNode)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = wildcard100;

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unnamedAction"


	public static class condition_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:265:1: condition : ^( conditionKywd . ) ;
	public final PlexilTreeTransforms.condition_return condition() throws RecognitionException {
		PlexilTreeTransforms.condition_return retval = new PlexilTreeTransforms.condition_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode wildcard102=null;
		TreeRuleReturnScope conditionKywd101 =null;

		PlexilTreeNode wildcard102_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:265:10: ( ^( conditionKywd . ) )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:266:9: ^( conditionKywd . )
			{
			_last = (PlexilTreeNode)input.LT(1);
			{
			PlexilTreeNode _save_last_1 = _last;
			PlexilTreeNode _first_1 = null;
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_conditionKywd_in_condition2157);
			conditionKywd101=conditionKywd();
			state._fsp--;
			if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)conditionKywd101.getTree();
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (PlexilTreeNode)input.LT(1);
			wildcard102=(PlexilTreeNode)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = wildcard102;

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class conditionKywd_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "conditionKywd"
	// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:270:1: conditionKywd : ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD );
	public final PlexilTreeTransforms.conditionKywd_return conditionKywd() throws RecognitionException {
		PlexilTreeTransforms.conditionKywd_return retval = new PlexilTreeTransforms.conditionKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set103=null;

		PlexilTreeNode set103_tree=null;

		try {
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:270:14: ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD )
			// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set103=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==END_CONDITION_KYWD||input.LA(1)==EXIT_CONDITION_KYWD||input.LA(1)==INVARIANT_CONDITION_KYWD||input.LA(1)==POST_CONDITION_KYWD||input.LA(1)==PRE_CONDITION_KYWD||input.LA(1)==REPEAT_CONDITION_KYWD||input.LA(1)==SKIP_CONDITION_KYWD||input.LA(1)==START_CONDITION_KYWD ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionKywd"

	// $ANTLR start synpred1_PlexilTreeTransforms
	public final void synpred1_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:95:9: ( trivialReduction )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:95:9: trivialReduction
		{
		pushFollow(FOLLOW_trivialReduction_in_synpred1_PlexilTreeTransforms174);
		trivialReduction();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_PlexilTreeTransforms

	// $ANTLR start synpred2_PlexilTreeTransforms
	public final void synpred2_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:96:9: ( booleanIdentityElision )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:96:9: booleanIdentityElision
		{
		pushFollow(FOLLOW_booleanIdentityElision_in_synpred2_PlexilTreeTransforms188);
		booleanIdentityElision();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_PlexilTreeTransforms

	// $ANTLR start synpred3_PlexilTreeTransforms
	public final void synpred3_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:97:9: ( integerIdentityElision )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:97:9: integerIdentityElision
		{
		pushFollow(FOLLOW_integerIdentityElision_in_synpred3_PlexilTreeTransforms198);
		integerIdentityElision();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_PlexilTreeTransforms

	// $ANTLR start synpred4_PlexilTreeTransforms
	public final void synpred4_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:98:9: ( realIdentityElision )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:98:9: realIdentityElision
		{
		pushFollow(FOLLOW_realIdentityElision_in_synpred4_PlexilTreeTransforms208);
		realIdentityElision();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_PlexilTreeTransforms

	// $ANTLR start synpred5_PlexilTreeTransforms
	public final void synpred5_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:99:9: ( booleanEqualityNegation )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:99:9: booleanEqualityNegation
		{
		pushFollow(FOLLOW_booleanEqualityNegation_in_synpred5_PlexilTreeTransforms218);
		booleanEqualityNegation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_PlexilTreeTransforms

	// $ANTLR start synpred6_PlexilTreeTransforms
	public final void synpred6_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:100:9: ( rightAssociativeReduction )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:100:9: rightAssociativeReduction
		{
		pushFollow(FOLLOW_rightAssociativeReduction_in_synpred6_PlexilTreeTransforms228);
		rightAssociativeReduction();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_PlexilTreeTransforms

	// $ANTLR start synpred7_PlexilTreeTransforms
	public final void synpred7_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:101:9: ( leftAssociativeReduction )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:101:9: leftAssociativeReduction
		{
		pushFollow(FOLLOW_leftAssociativeReduction_in_synpred7_PlexilTreeTransforms238);
		leftAssociativeReduction();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_PlexilTreeTransforms

	// $ANTLR start synpred45_PlexilTreeTransforms
	public final void synpred45_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:169:9: ( ^( AND_KYWD TRUE_KYWD arg= . ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:169:9: ^( AND_KYWD TRUE_KYWD arg= . )
		{
		match(input,AND_KYWD,FOLLOW_AND_KYWD_in_synpred45_PlexilTreeTransforms1050); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred45_PlexilTreeTransforms1052); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred45_PlexilTreeTransforms

	// $ANTLR start synpred46_PlexilTreeTransforms
	public final void synpred46_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:170:9: ( ^( AND_KYWD arg= . TRUE_KYWD ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:170:9: ^( AND_KYWD arg= . TRUE_KYWD )
		{
		match(input,AND_KYWD,FOLLOW_AND_KYWD_in_synpred46_PlexilTreeTransforms1073); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred46_PlexilTreeTransforms1079); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred46_PlexilTreeTransforms

	// $ANTLR start synpred47_PlexilTreeTransforms
	public final void synpred47_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:171:9: ( ^( OR_KYWD FALSE_KYWD arg= . ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:171:9: ^( OR_KYWD FALSE_KYWD arg= . )
		{
		match(input,OR_KYWD,FOLLOW_OR_KYWD_in_synpred47_PlexilTreeTransforms1096); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred47_PlexilTreeTransforms1098); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred47_PlexilTreeTransforms

	// $ANTLR start synpred48_PlexilTreeTransforms
	public final void synpred48_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:172:9: ( ^( OR_KYWD arg= . FALSE_KYWD ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:172:9: ^( OR_KYWD arg= . FALSE_KYWD )
		{
		match(input,OR_KYWD,FOLLOW_OR_KYWD_in_synpred48_PlexilTreeTransforms1119); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred48_PlexilTreeTransforms1125); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred48_PlexilTreeTransforms

	// $ANTLR start synpred49_PlexilTreeTransforms
	public final void synpred49_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:173:9: ( ^( DEQUALS TRUE_KYWD arg= . ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:173:9: ^( DEQUALS TRUE_KYWD arg= . )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred49_PlexilTreeTransforms1142); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred49_PlexilTreeTransforms1144); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred49_PlexilTreeTransforms

	// $ANTLR start synpred50_PlexilTreeTransforms
	public final void synpred50_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:174:9: ( ^( DEQUALS arg= . TRUE_KYWD ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:174:9: ^( DEQUALS arg= . TRUE_KYWD )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred50_PlexilTreeTransforms1165); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred50_PlexilTreeTransforms1171); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred50_PlexilTreeTransforms

	// $ANTLR start synpred51_PlexilTreeTransforms
	public final void synpred51_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:175:9: ( ^( NEQUALS FALSE_KYWD arg= . ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:175:9: ^( NEQUALS FALSE_KYWD arg= . )
		{
		match(input,NEQUALS,FOLLOW_NEQUALS_in_synpred51_PlexilTreeTransforms1188); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred51_PlexilTreeTransforms1190); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred51_PlexilTreeTransforms

	// $ANTLR start synpred52_PlexilTreeTransforms
	public final void synpred52_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:180:9: ( ^( PLUS i= INT arg= . {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:180:9: ^( PLUS i= INT arg= . {...}?)
		{
		match(input,PLUS,FOLLOW_PLUS_in_synpred52_PlexilTreeTransforms1248); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred52_PlexilTreeTransforms1252); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred52_PlexilTreeTransforms", "Integer.valueOf($i.text) == 0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred52_PlexilTreeTransforms

	// $ANTLR start synpred53_PlexilTreeTransforms
	public final void synpred53_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:181:9: ( ^( PLUS arg= . i= INT {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:181:9: ^( PLUS arg= . i= INT {...}?)
		{
		match(input,PLUS,FOLLOW_PLUS_in_synpred53_PlexilTreeTransforms1275); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred53_PlexilTreeTransforms1283); if (state.failed) return;

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred53_PlexilTreeTransforms", "Integer.valueOf($i.text) == 0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred53_PlexilTreeTransforms

	// $ANTLR start synpred55_PlexilTreeTransforms
	public final void synpred55_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:183:9: ( ^( ASTERISK i= INT arg= . {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:183:9: ^( ASTERISK i= INT arg= . {...}?)
		{
		match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred55_PlexilTreeTransforms1329); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred55_PlexilTreeTransforms1333); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred55_PlexilTreeTransforms", "Integer.valueOf($i.text) == 1");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred55_PlexilTreeTransforms

	// $ANTLR start synpred56_PlexilTreeTransforms
	public final void synpred56_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:184:9: ( ^( ASTERISK arg= . i= INT {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:184:9: ^( ASTERISK arg= . i= INT {...}?)
		{
		match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred56_PlexilTreeTransforms1356); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred56_PlexilTreeTransforms1364); if (state.failed) return;

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred56_PlexilTreeTransforms", "Integer.valueOf($i.text) == 1");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred56_PlexilTreeTransforms

	// $ANTLR start synpred57_PlexilTreeTransforms
	public final void synpred57_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:189:9: ( ^( PLUS i= DOUBLE arg= . {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:189:9: ^( PLUS i= DOUBLE arg= . {...}?)
		{
		match(input,PLUS,FOLLOW_PLUS_in_synpred57_PlexilTreeTransforms1420); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_synpred57_PlexilTreeTransforms1424); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if ( !((Double.valueOf((i!=null?i.getText():null)) == 0.0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred57_PlexilTreeTransforms", "Double.valueOf($i.text) == 0.0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred57_PlexilTreeTransforms

	// $ANTLR start synpred58_PlexilTreeTransforms
	public final void synpred58_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:190:9: ( ^( PLUS arg= . i= DOUBLE {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:190:9: ^( PLUS arg= . i= DOUBLE {...}?)
		{
		match(input,PLUS,FOLLOW_PLUS_in_synpred58_PlexilTreeTransforms1447); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_synpred58_PlexilTreeTransforms1455); if (state.failed) return;

		if ( !((Double.valueOf((i!=null?i.getText():null)) == 0.0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred58_PlexilTreeTransforms", "Double.valueOf($i.text) == 0.0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred58_PlexilTreeTransforms

	// $ANTLR start synpred60_PlexilTreeTransforms
	public final void synpred60_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:192:9: ( ^( ASTERISK i= DOUBLE arg= . {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:192:9: ^( ASTERISK i= DOUBLE arg= . {...}?)
		{
		match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred60_PlexilTreeTransforms1501); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_synpred60_PlexilTreeTransforms1505); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if ( !((Double.valueOf((i!=null?i.getText():null)) == 1.0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred60_PlexilTreeTransforms", "Double.valueOf($i.text) == 1.0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred60_PlexilTreeTransforms

	// $ANTLR start synpred61_PlexilTreeTransforms
	public final void synpred61_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:193:9: ( ^( ASTERISK arg= . i= DOUBLE {...}?) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:193:9: ^( ASTERISK arg= . i= DOUBLE {...}?)
		{
		match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred61_PlexilTreeTransforms1528); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		i=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_synpred61_PlexilTreeTransforms1536); if (state.failed) return;

		if ( !((Double.valueOf((i!=null?i.getText():null)) == 1.0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred61_PlexilTreeTransforms", "Double.valueOf($i.text) == 1.0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred61_PlexilTreeTransforms

	// $ANTLR start synpred62_PlexilTreeTransforms
	public final void synpred62_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:198:9: ( ^( DEQUALS FALSE_KYWD arg= . ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:198:9: ^( DEQUALS FALSE_KYWD arg= . )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred62_PlexilTreeTransforms1592); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred62_PlexilTreeTransforms1594); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred62_PlexilTreeTransforms

	// $ANTLR start synpred63_PlexilTreeTransforms
	public final void synpred63_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:199:9: ( ^( DEQUALS arg= . FALSE_KYWD ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:199:9: ^( DEQUALS arg= . FALSE_KYWD )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred63_PlexilTreeTransforms1619); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred63_PlexilTreeTransforms1625); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred63_PlexilTreeTransforms

	// $ANTLR start synpred64_PlexilTreeTransforms
	public final void synpred64_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:200:9: ( ^( NEQUALS TRUE_KYWD arg= . ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:200:9: ^( NEQUALS TRUE_KYWD arg= . )
		{
		match(input,NEQUALS,FOLLOW_NEQUALS_in_synpred64_PlexilTreeTransforms1646); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred64_PlexilTreeTransforms1648); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred64_PlexilTreeTransforms

	// $ANTLR start synpred65_PlexilTreeTransforms
	public final void synpred65_PlexilTreeTransforms_fragment() throws RecognitionException {
		TreeRuleReturnScope innerUnnamed =null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:207:9: ( ^( ACTION ^( checkedBlock innerUnnamed= unnamedAction ) ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:207:9: ^( ACTION ^( checkedBlock innerUnnamed= unnamedAction ) )
		{
		match(input,ACTION,FOLLOW_ACTION_in_synpred65_PlexilTreeTransforms1722); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_checkedBlock_in_synpred65_PlexilTreeTransforms1725);
		checkedBlock();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_unnamedAction_in_synpred65_PlexilTreeTransforms1729);
		innerUnnamed=unnamedAction();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred65_PlexilTreeTransforms

	// $ANTLR start synpred66_PlexilTreeTransforms
	public final void synpred66_PlexilTreeTransforms_fragment() throws RecognitionException {
		TreeRuleReturnScope innerNamed =null;


		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:209:9: ( ^( ACTION ^( checkedBlock innerNamed= namedAction ) ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:209:9: ^( ACTION ^( checkedBlock innerNamed= namedAction ) )
		{
		match(input,ACTION,FOLLOW_ACTION_in_synpred66_PlexilTreeTransforms1755); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_checkedBlock_in_synpred66_PlexilTreeTransforms1758);
		checkedBlock();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_namedAction_in_synpred66_PlexilTreeTransforms1762);
		innerNamed=namedAction();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred66_PlexilTreeTransforms

	// $ANTLR start synpred67_PlexilTreeTransforms
	public final void synpred67_PlexilTreeTransforms_fragment() throws RecognitionException {
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:211:9: ( ^( ACTION NCNAME ^( checkedBlock namedAction ) ) )
		// /home/jorgemoreno/Documents/plexil/compilers/plexil/antlr/PlexilTreeTransforms.g:211:9: ^( ACTION NCNAME ^( checkedBlock namedAction ) )
		{
		match(input,ACTION,FOLLOW_ACTION_in_synpred67_PlexilTreeTransforms1788); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred67_PlexilTreeTransforms1790); if (state.failed) return;

		pushFollow(FOLLOW_checkedBlock_in_synpred67_PlexilTreeTransforms1793);
		checkedBlock();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_namedAction_in_synpred67_PlexilTreeTransforms1795);
		namedAction();
		state._fsp--;
		if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred67_PlexilTreeTransforms

	// Delegated rules

	public final boolean synpred6_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred65_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred58_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred49_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred49_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred63_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred63_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred46_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred57_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred61_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred61_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred64_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred64_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred66_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred66_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_enterContext_in_topdown154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trivialReduction_in_bottomup174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanIdentityElision_in_bottomup188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerIdentityElision_in_bottomup198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_realIdentityElision_in_bottomup208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanEqualityNegation_in_bottomup218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightAssociativeReduction_in_bottomup228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftAssociativeReduction_in_bottomup238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flattenTrivialCheckedBlock_in_bottomup248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitContext_in_bottomup258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bindingContextNode_in_enterContext282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bindingContextNode_in_exitContext312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_KYWD_in_rightAssociativeReduction345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_rightAssociativeReduction352 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_rightAssociativeReduction383 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_rightAssociativeReduction390 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_rightAssociativeReduction422 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_rightAssociativeReduction429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_rightAssociativeReduction467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_rightAssociativeReduction474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_rightAssociativeReduction504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_rightAssociativeReduction511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_rightAssociativeReduction541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_rightAssociativeReduction548 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_leftAssociativeReduction588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_leftAssociativeReduction591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_leftAssociativeReduction631 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_leftAssociativeReduction634 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_leftAssociativeReduction676 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_leftAssociativeReduction679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_leftAssociativeReduction727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_leftAssociativeReduction730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_leftAssociativeReduction772 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_leftAssociativeReduction775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_leftAssociativeReduction815 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_leftAssociativeReduction818 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_leftAssociativeReduction858 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_leftAssociativeReduction861 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_trivialReduction910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_trivialReduction931 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_trivialReduction952 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_trivialReduction973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_trivialReduction994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_trivialReduction1015 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_booleanIdentityElision1050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanIdentityElision1052 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_AND_KYWD_in_booleanIdentityElision1073 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanIdentityElision1079 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_KYWD_in_booleanIdentityElision1096 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanIdentityElision1098 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_OR_KYWD_in_booleanIdentityElision1119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanIdentityElision1125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_booleanIdentityElision1142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanIdentityElision1144 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_DEQUALS_in_booleanIdentityElision1165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanIdentityElision1171 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_booleanIdentityElision1188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanIdentityElision1190 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_NEQUALS_in_booleanIdentityElision1211 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanIdentityElision1217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_integerIdentityElision1248 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_integerIdentityElision1252 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_PLUS_in_integerIdentityElision1275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_integerIdentityElision1283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_integerIdentityElision1302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_integerIdentityElision1310 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASTERISK_in_integerIdentityElision1329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_integerIdentityElision1333 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_ASTERISK_in_integerIdentityElision1356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_integerIdentityElision1364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SLASH_in_integerIdentityElision1383 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_integerIdentityElision1391 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_realIdentityElision1420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_realIdentityElision1424 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_PLUS_in_realIdentityElision1447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_realIdentityElision1455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_realIdentityElision1474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_realIdentityElision1482 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASTERISK_in_realIdentityElision1501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_realIdentityElision1505 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_ASTERISK_in_realIdentityElision1528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_realIdentityElision1536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SLASH_in_realIdentityElision1555 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_realIdentityElision1563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_booleanEqualityNegation1592 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanEqualityNegation1594 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_DEQUALS_in_booleanEqualityNegation1619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanEqualityNegation1625 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_booleanEqualityNegation1646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanEqualityNegation1648 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_NEQUALS_in_booleanEqualityNegation1674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanEqualityNegation1680 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialCheckedBlock1722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1725 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unnamedAction_in_flattenTrivialCheckedBlock1729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialCheckedBlock1755 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1758 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAction_in_flattenTrivialCheckedBlock1762 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialCheckedBlock1788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NCNAME_in_flattenTrivialCheckedBlock1790 = new BitSet(new long[]{0x0000000000100000L,0x0000000000200000L,0x0000000080000000L,0x0000000000000003L});
	public static final BitSet FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAction_in_flattenTrivialCheckedBlock1795 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialCheckedBlock1809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NCNAME_in_flattenTrivialCheckedBlock1813 = new BitSet(new long[]{0x0000000000100000L,0x0000000000200000L,0x0000000080000000L,0x0000000000000003L});
	public static final BitSet FOLLOW_checkedBlock_in_flattenTrivialCheckedBlock1816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialCheckedBlock1819 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_namedAction2113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NCNAME_in_namedAction2115 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_ACTION_in_unnamedAction2136 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conditionKywd_in_condition2157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_trivialReduction_in_synpred1_PlexilTreeTransforms174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanIdentityElision_in_synpred2_PlexilTreeTransforms188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerIdentityElision_in_synpred3_PlexilTreeTransforms198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_realIdentityElision_in_synpred4_PlexilTreeTransforms208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanEqualityNegation_in_synpred5_PlexilTreeTransforms218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightAssociativeReduction_in_synpred6_PlexilTreeTransforms228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftAssociativeReduction_in_synpred7_PlexilTreeTransforms238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_KYWD_in_synpred45_PlexilTreeTransforms1050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred45_PlexilTreeTransforms1052 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_AND_KYWD_in_synpred46_PlexilTreeTransforms1073 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred46_PlexilTreeTransforms1079 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_KYWD_in_synpred47_PlexilTreeTransforms1096 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred47_PlexilTreeTransforms1098 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_OR_KYWD_in_synpred48_PlexilTreeTransforms1119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred48_PlexilTreeTransforms1125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_synpred49_PlexilTreeTransforms1142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred49_PlexilTreeTransforms1144 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_DEQUALS_in_synpred50_PlexilTreeTransforms1165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred50_PlexilTreeTransforms1171 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_synpred51_PlexilTreeTransforms1188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred51_PlexilTreeTransforms1190 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_PLUS_in_synpred52_PlexilTreeTransforms1248 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred52_PlexilTreeTransforms1252 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_PLUS_in_synpred53_PlexilTreeTransforms1275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred53_PlexilTreeTransforms1283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASTERISK_in_synpred55_PlexilTreeTransforms1329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred55_PlexilTreeTransforms1333 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_ASTERISK_in_synpred56_PlexilTreeTransforms1356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred56_PlexilTreeTransforms1364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_synpred57_PlexilTreeTransforms1420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_synpred57_PlexilTreeTransforms1424 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_PLUS_in_synpred58_PlexilTreeTransforms1447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_synpred58_PlexilTreeTransforms1455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASTERISK_in_synpred60_PlexilTreeTransforms1501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_synpred60_PlexilTreeTransforms1505 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_ASTERISK_in_synpred61_PlexilTreeTransforms1528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_synpred61_PlexilTreeTransforms1536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_synpred62_PlexilTreeTransforms1592 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred62_PlexilTreeTransforms1594 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_DEQUALS_in_synpred63_PlexilTreeTransforms1619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred63_PlexilTreeTransforms1625 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_synpred64_PlexilTreeTransforms1646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred64_PlexilTreeTransforms1648 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000000000000003L});
	public static final BitSet FOLLOW_ACTION_in_synpred65_PlexilTreeTransforms1722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_checkedBlock_in_synpred65_PlexilTreeTransforms1725 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unnamedAction_in_synpred65_PlexilTreeTransforms1729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_synpred66_PlexilTreeTransforms1755 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_checkedBlock_in_synpred66_PlexilTreeTransforms1758 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAction_in_synpred66_PlexilTreeTransforms1762 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_synpred67_PlexilTreeTransforms1788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NCNAME_in_synpred67_PlexilTreeTransforms1790 = new BitSet(new long[]{0x0000000000100000L,0x0000000000200000L,0x0000000080000000L,0x0000000000000003L});
	public static final BitSet FOLLOW_checkedBlock_in_synpred67_PlexilTreeTransforms1793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAction_in_synpred67_PlexilTreeTransforms1795 = new BitSet(new long[]{0x0000000000000008L});
}
